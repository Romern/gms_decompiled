package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: onr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class onr {

    /* renamed from: a */
    public static final bnsn f38027a = odk.m28481a("CAR.SERVICE");

    /* renamed from: a */
    static Intent m29253a(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
    }

    /* renamed from: a */
    static void m29254a(UsbManager usbManager) {
        bnsi d = f38027a.mo68390d();
        d.mo68432a("onr", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Resetting connection via setCurrentFunction on UsbManager");
        try {
            try {
                UsbManager.class.getDeclaredMethod("setCurrentFunction", String.class, Boolean.TYPE).invoke(usbManager, ccvx.f180056a.mo6606a().mo76914s(), false);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new onn(e);
            }
        } catch (NoSuchMethodException e2) {
            String name = UsbManager.class.getName();
            String valueOf = String.valueOf(e2);
            int length = "setCurrentFunction".length();
            StringBuilder sb = new StringBuilder(length + 16 + String.valueOf(name).length() + String.valueOf(valueOf).length());
            sb.append("No method ");
            sb.append("setCurrentFunction");
            sb.append(" for ");
            sb.append(name);
            sb.append(" ");
            sb.append(valueOf);
            throw new onn(sb.toString());
        }
    }
}
