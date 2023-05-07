## Description
I strongly believe Jetpack Compose will replace XML in the future for Android development.
This repository is my practice for Jetpack Compose from https://github.com/googlecodelabs/android-compose-codelabs

## Content
### Navigation Codelab
#### Rate: ★★★★★
<img width="200" alt="Screen Shot 2023-05-07 at 22 56 44" src="https://user-images.githubusercontent.com/31622343/236681869-9c2fd37d-6d24-4a60-8f52-c38496ac37f4.png">

#### What I learn:

- Usage of `NavController`, `NavHost` to easily manage the navigation of the app between different Composable components.
- Link `RallyTabRow` composable UI (similar to a `BottomNavigation`) with the `NavController`
- Able to customize behavior of navigation
  - `launchSingleTop = true`: Enable this allow the app to make sure there is only one type of given destination on the top of back stack
  - `popUpTo(selectedDestination) { saveState = true }`: Pop up to a selected destination and save its state before navigating to any Composables.



