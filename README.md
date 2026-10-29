HelloConstraint (Android)

A simple Android app written in Java that shows a counter and three buttons arranged with ConstraintLayout. Created as an assignment for the course Razvoj mobilnih aplikacij (Mobile Application Development), Task 3.

Features
Toast button: shows a short Toast message with the current count
Count button: increases the counter and changes its own background colour depending on whether the new value is even or odd
Zero button: resets the counter to 0 and returns its own colour to grey
Zero button is grey at the start and turns pink as soon as the counter is active
Layout is built with ConstraintLayout constraints (buttons on the left, show_count TextView on the right)
Separate layouts for portrait, landscape (layout-land) and large tablets (layout-xlarge)
Project structure
app/src/main/
├── java/com/example/helloconstraint/MainActivity.java   # click handlers
└── res/
    ├── layout/activity_main.xml                         # portrait layout
    ├── layout-land/activity_main.xml                    # landscape layout
    └── layout-xlarge/activity_main.xml                  # tablet layout
How it works
showToast(View view) shows Toast.makeText(...) with the current value.
countUp(View view) increments the counter, updates the show_count TextView, turns the Zero button pink and sets the background of the clicked button (view) to green for even and blue for odd values. findViewById() is not used for the Count button, the view parameter is used instead.
resetCount(View view) sets the counter to 0, updates the TextView and sets the Zero button (view) back to grey.

All three methods are public void and take a View parameter, so they can be connected to the buttons with android:onClick in the XML.

Requirements
Android Studio (recent version)
Android SDK, minimum API level as set in the project
Android emulator or a physical Android phone
Running the app
Clone the repository:
   git clone https://github.com/aljo08/HelloConstraint.git
Open the project in Android Studio (File → Open).
Wait for the Gradle sync to finish.
Select a device and click Run.
Running on a physical phone
Enable Developer options (tap Build number 7 times in Settings → About phone).
Turn on USB debugging (or Wireless debugging on Android 11+).
Connect the phone, confirm the debugging prompt and select it in the device drop-down in Android Studio.
Screenshots

Add screenshots to a screenshots/ folder and link them here:

![Portrait](screenshots/Screenshot_normalno.png)
![Landscape](screenshots/Screenshot_obrnjeno.png)
Author

GitHub: aljo08

Student project – Mobile Application Development, Task 3.
