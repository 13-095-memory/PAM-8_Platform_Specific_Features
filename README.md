# Week 8: Platform-Specific Features

## Memory Simanjuntak
## 123140095

## Architecture Diagram
commonMain (expect) → androidMain (actual) / iosMain (actual)

[AppModule] → injects → [NotesViewModel, SettingsViewModel]
[NotesViewModel] → [NoteRepository]
[SettingsViewModel] → [SettingsRepository, DeviceInfo, NetworkMonitor, BatteryInfo]

## Screenshots
![Device Info](screenshots/DeviceInfo.jpeg)
![Network On](screenshots/Connected.jpeg)
![Network Off](screenshots/NoInternet.jpeg)

## Features
- Koin DI: semua dependencies diinjekt via AppModule
- expect/actual: DeviceInfo, NetworkMonitor, BatteryInfo
- Network status indicator realtime
- Device info di Settings screen
- Dark mode toggle
- Checklist note dengan progress bar
