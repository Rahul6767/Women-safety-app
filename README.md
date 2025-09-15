# Women Safety App

An Android application designed to enhance personal safety by sharing a user's location to a Firebase Realtime Database. The app also includes a news feed, a list of 
trusted contacts, and quick sharing options.

## Features

- **Location Service** – The “Start” button launches a background service that captures GPS coordinates and writes them to Firebase in 20‑second intervals.  
- **News Feed** – An in‑app WebView displays the latest headlines from *Times of India*.  
- **Trusted Contacts** – A settings screen lets users maintain a list of phone numbers for friends or family.  
- **Share Shortcut** – Quickly share a preset message with other apps via Android’s share intent.

## Getting Started

1. **Clone** this repository and open it with Android Studio (Gradle wrapper included).
2. Ensure you have Android SDK 27 installed.
3. **Firebase Setup**  
   - Create a Firebase project.  
   - Download its `google-services.json` and place it in the `app/` module.  
   - Sync Gradle to pull Firebase Auth and Database dependencies.
4. **Run the App** on a device or emulator with location services enabled and grant the requested permissions.

## Project Structure

**app/build.gradle** – Module-level build script setting SDK levels, application ID, Firebase dependencies, and applying the Google services plugin

**app/google-services.json** – Firebase configuration with project identifiers, package names, OAuth clients, and API keys for the app

**app/src/main/AndroidManifest.xml** – Defines package metadata, requests Internet and location permissions, and registers MainActivity, Settings, NewsFeed, Map, and the background MyService

**MainActivity.java** – Entry activity that launches MyService via a button, requests runtime location permissions, and provides navigation drawer actions for news, settings, and sharing content

**MyService.java** – Background service obtaining GPS coordinates, pushing them to Firebase, and scheduling updates every 20 seconds while managing location listeners

**NewsFeed.java** – Activity hosting a WebView that loads Times of India headlines and handles in‑app back navigation

**Map.java** – Simple placeholder activity inflating the activity_map layout without additional logic

**res/layout/activity_main.xml** – Defines the main screen using a DrawerLayout with an included app bar and navigation drawer menu

**res/layout/activity_settings.xml** – Layout for entering a friend’s phone number, adding it via a button, and displaying stored numbers in a list view

**res/menu/activity_main_drawer.xml** – Navigation drawer menu listing Home, NewsFeed, Settings, and Share options

**res/values/strings.xml** – Centralized string resources for the app name, navigation drawer text, and other UI labels


## Dependencies

- Android Support Libraries (AppCompat, Design, ConstraintLayout)
- Firebase Authentication
- Firebase Realtime Database

## Contribution

**Kalyan Sai**	
Designed and built the UI: navigation drawer, layouts, settings screen, and news feed WebView. Implemented the map screen and wired up UI to backend services.

**Rahul Payeli**	
Developed backend services: location tracking and Firebase Realtime Database integration, background service for periodic updates, and configuration of Google/Firebase services and permissions.

