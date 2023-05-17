package com.example.compose.rally.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compose.rally.Accounts
import com.example.compose.rally.Bills
import com.example.compose.rally.Overview
import com.example.compose.rally.SingleAccount
import com.example.compose.rally.navigateSavedState
import com.example.compose.rally.ui.accounts.AccountsScreen
import com.example.compose.rally.ui.accounts.SingleAccountScreen
import com.example.compose.rally.ui.bills.BillsScreen
import com.example.compose.rally.ui.overview.OverviewScreen


/**
 * Created by Tan N. Truong, on 17 May, 2023
 * Email: ludugz@gmail.com
 */
@Composable
fun RallyNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Overview.route,
    ) {
        composable(route = Overview.route) {
            Box {
                OverviewScreen(
                    onClickSeeAllAccounts = {
                        navController.navigateSavedState(route = Accounts.route)
                    },
                    onClickSeeAllBills = {
                        navController.navigateSavedState(route = Bills.route)
                    },
                    onAccountClick = { accountType ->
                        navController.navigateSavedState(route = "${SingleAccount.route}/${accountType}")
                    }
                )
            }
        }

        composable(route = Accounts.route) {
            Box() {
                AccountsScreen { accountType ->
                    navController.navigateSavedState(route = "${SingleAccount.route}/${accountType}")
                }
            }
        }

        composable(route = Bills.route) {
            Box() {
                BillsScreen()
            }
        }

        composable(
            route = SingleAccount.routeWithArgs,
            arguments = SingleAccount.arguments,
            deepLinks = SingleAccount.deepLink
        ) {
            // Retrieve the passed argument
            val accountType =
                it.arguments?.getString(SingleAccount.accountTypeArg)
            SingleAccountScreen(accountType = accountType)
        }
    }
}