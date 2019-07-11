# Demonstation of Lottie rendering bug

See attached screenshots in screenshots folder. Issue is Lottie renders something like shadow, where it shouldn't be.

Bug is reproducible on devices with small screens and low dpi (hdpi).
To reproduce this - create emulator with Nexus S (4" hdpi) configuration and run project.

N.B. Everything works fine on Lottie 3.0.0-beta2, but beta3 and up introduces the issue.