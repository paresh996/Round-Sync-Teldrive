# Contributing to Round Sync

We welcome any contribution to Round Sync, and there are multiple ways to contribute:

 - [Localize Round Sync into your language](#localize-round-sync)
 - [Developing](#developing)
 - [Submitting a pull request](#submitting-a-pr)

## Localize Round Sync
 - Download [strings.xml](https://github.com/paresh996/Round-Sync-Teldrive/blob/master/app/src/main/res/values/strings.xml) file.
 - Open the `string.xml` file with your favorite text editor.
 - Delete all the `strings` with the attribute **translatable="false"**.
 - Translate `string` values from **en-US (English)** to that language you want to localize Round Sync.
   Here is an example of translating into **bn-BD**

   Default string values **en-US**
   ```sh
   <string name="app_name">Round Sync Teldrive</string>
   <string name="app_description">Rclone for Android with Teldrive remote support</string>
   <string name="app_short_name">Round Sync Teldrive</string>
   ```
   Translated string values into **bn-BD**
   ```sh
   <string name="app_name">রাউন্ড সিঙ্ক</string>
   <string name="app_description">অ্যান্ড্রয়েডের জন্য আরক্লোন</string>
   <string name="app_short_name">রাউন্ড সিঙ্ক</string>
   ```


## Developing
You should first make sure you have:

- Go 1.20+ installed and in your PATH
- Java installed and in your PATH
- Android SDK command-line tools installed OR the NDK version specified in `gradle.properties`
  installed

You can then build the app normally from Android Studio or from CLI by running:

```sh
# Debug build
./gradlew assembleOssDebug

# or release build
./gradlew assembleOssRelease
```


## Submitting a PR
Here are a few tips on getting your PR merged:

1. Keep your PR small. Small PRs are easier to review, easier to test and as a result can be merged quickly. If this is your first PR to Round Sync, keep it very small.
2. Keep your PR focussed. Your PR should have a single, specific purpose. If you discover something else you'd like to improve while working on your PR, only include it if there's a direct link to the purpose of the PR.
3. Use the style of the existing code base. Use idiomatic code whenever possible. If you have performance concerns, use the profiler to test your assumptions.
4. Rebase your branch before creating your PR.