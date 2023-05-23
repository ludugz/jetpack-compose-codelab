# Description
I strongly believe Jetpack Compose will replace XML layout in the future for Android's UI development.
So I created this repository as an effort to practice Jetpack Compose from https://github.com/googlecodelabs/android-compose-codelabs

# Content
## Navigation Codelab
### Rate: ★★★★★
<img width="200" alt="Screen Shot 2023-05-07 at 22 56 44" src="https://user-images.githubusercontent.com/31622343/236681869-9c2fd37d-6d24-4a60-8f52-c38496ac37f4.png">

### What I learn:

- **Navigation:** 
  - Use `NavController`, `NavHost` to easily manage the navigation of the app between different Composable components.
  - Link tab row composable UI (similar to a bottom navigation) with `NavController`
  - Customize behavior of navigation
    - `launchSingleTop = true`: Enable this allow the app to make sure there is only one type of given destination on the top of back stack
    - `popUpTo(selectedDestination) { saveState = true }`: Pop up to a selected destination and save its state before navigating to any Composables.
    - `restoreState = true`: determines whether previous screen should save its state (i.e. scrolling position, etc.).
  - Routing
    - Jetpack Compose provides two ways to navigate: without arguments and with arguments. Noticing that the route must follow this pattern: `route/{argument}` (for example in this codelab, `routeWithArgs = "${route}/{${accountTypeArg}}`)
  - Navigation testing

- **State hoisting**: 
  - Instead of passing `NavController` to different Composables, good practice is to keep it in the top level to preserve the single source of truth. Otherwise, there might be multiple places which can potentially modify its state, making the app difficult to debug and not easy to test Composables.


