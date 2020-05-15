package p000;

import android.content.Context;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: mjw */
public final /* synthetic */ class mjw implements mkl {

    /* renamed from: a */
    private final Context f33855a;

    /* renamed from: b */
    private final UsbAccessory f33856b;

    public mjw(Context context, UsbAccessory usbAccessory) {
        this.f33855a = context;
        this.f33856b = usbAccessory;
    }

    /* renamed from: a */
    public final mkn mo19869a() {
        Context context = this.f33855a;
        UsbAccessory usbAccessory = this.f33856b;
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        if (usbManager != null) {
            try {
                ParcelFileDescriptor openAccessory = usbManager.openAccessory(usbAccessory);
                bmxy.m108581a(openAccessory);
                FileDescriptor fileDescriptor = openAccessory.getFileDescriptor();
                return new mjx(openAccessory, new FileInputStream(fileDescriptor), new FileOutputStream(fileDescriptor));
            } catch (IllegalArgumentException | NullPointerException e) {
                throw new mjs("Failed to open accessory, most likely disconnected.", e);
            }
        } else {
            throw new mjs("Failed to get UsbManager.");
        }
    }
}
