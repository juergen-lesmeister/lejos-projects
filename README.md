# lejos-projects
My lejos projects

## Setup (Windows 7)

### Create bootable SD card as described on the lojos page, insert into brick and start the EV3.

### Installing the RNDIS driver
* Connect the EV3 brick with the USB cable to the PC
* Windows detects the brick as a RNDIS device (Remote Network Driver Interface Specification)
but the driver is not installed automatically.
* To install the appropriate driver, make sure you have administrator privileges
* In the Windows device manager the brick is listed as "RNDIS Ethernet Gadget" (Other devices), it's marked with a yellow warning sign
* Right-click on it and select to update the driver
* Choose to browse the computer for the driver
* Select the type "Network adapter"
* Select the vendor "Microsoft Corporation" and choose the "NDIS-compatible remote gadget"
* Install the driver
* Open the Windows device manager again
* The EV3 brick is now shown under "Network adapters" as a "RNDIS/Ethernet Gadget"

The EV3 brick is now correctly installed, but still I couldn't connect to it, for example via ssh
So I needed to do the following:

### Connecting to the EV3 brick

