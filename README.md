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

Women-safety-app/
├── app/
│ ├── build.gradle
│ ├── google-services.json
│ └── src/main/
│ ├── AndroidManifest.xml
│ ├── java/com/example/kalya/rahul/
│ │ ├── MainActivity.java
│ │ ├── MyService.java
│ │ ├── NewsFeed.java
│ │ ├── Settings.java
│ │ └── Map.java
│ └── res/ (layouts, menus, values)
├── build.gradle
└── settings.gradle


## Dependencies

- Android Support Libraries (AppCompat, Design, ConstraintLayout)
- Firebase Authentication
- Firebase Realtime Database

