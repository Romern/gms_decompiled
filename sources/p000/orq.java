package p000;

import android.hardware.usb.UsbAccessory;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: orq */
public final /* synthetic */ class orq implements Runnable {

    /* renamed from: a */
    private final CarSetupServiceImpl f38292a;

    /* renamed from: b */
    private final UsbAccessory f38293b;

    public orq(CarSetupServiceImpl carSetupServiceImpl, UsbAccessory usbAccessory) {
        this.f38292a = carSetupServiceImpl;
        this.f38293b = usbAccessory;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.hardware.usb.UsbAccessory, boolean):void
     arg types: [android.hardware.usb.UsbAccessory, int]
     candidates:
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.content.Intent, java.lang.String):android.os.ParcelFileDescriptor
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(ozl, android.content.Intent):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(com.google.android.gms.carsetup.CarInfoInternal, boolean):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.hardware.usb.UsbAccessory, boolean):void */
    public final void run() {
        this.f38292a.mo17410a(this.f38293b, false);
    }
}
