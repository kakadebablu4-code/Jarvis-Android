# Jarvis-Android
My personal AI voice assistant
## Features
- **Voice Input (STT):** Tap to speak and convert voice to text.
- **AI Responses:** Sends spoken queries to a Gemini model and returns concise answers.
- **Voice Output (TTS):** Speaks the assistant's reply aloud using Android Text-to-Speech.

## Permissions Required
- `android.permission.RECORD_AUDIO`
- `android.permission.INTERNET`

## Setup
1. Open the project in **Android Studio**.
2. Add your Gemini API key securely (do **not** hardcode keys in public commits).
3. Sync Gradle and run the app on an Android device with Google speech services enabled.

## Roadmap
- [ ] Basic STT -> AI -> TTS loop
- [ ] Conversation memory & settings screen
- [ ] Device commands (alarms, timers, opening apps)
