package p000;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbPort;
import android.hardware.usb.UsbPortStatus;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ono */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ono extends ony {
    static {
        odk.m28481a("CAR.SERVICE");
    }

    public ono(Context context, UsbManager usbManager) {
        super(context, usbManager);
    }

    /* renamed from: a */
    public final Map mo22357a() {
        HashMap hashMap = new HashMap();
        for (UsbPort usbPort : this.f38057b.getPorts()) {
            UsbPortStatus status = usbPort.getStatus();
            if (status != null) {
                String usbPort2 = usbPort.toString();
                onu onu = new onu();
                onu.f38042a = Boolean.valueOf(status.isConnected());
                onu.f38043b = Integer.valueOf(status.getCurrentDataRole());
                onu.f38044c = Integer.valueOf(status.getCurrentPowerRole());
                onu.f38045d = Integer.valueOf(status.getSupportedRoleCombinations());
                onu.f38046e = Integer.valueOf(status.getCurrentMode());
                String str = onu.f38042a == null ? " connected" : "";
                if (onu.f38043b == null) {
                    str = str.concat(" currentDataRole");
                }
                if (onu.f38044c == null) {
                    str = String.valueOf(str).concat(" currentPowerRole");
                }
                if (onu.f38045d == null) {
                    str = String.valueOf(str).concat(" supportedRoleCombinations");
                }
                if (onu.f38046e == null) {
                    str = String.valueOf(str).concat(" currentMode");
                }
                if (str.isEmpty()) {
                    hashMap.put(usbPort2, new omv(onu.f38042a.booleanValue(), onu.f38043b.intValue(), onu.f38044c.intValue(), onu.f38045d.intValue(), onu.f38046e.intValue()));
                } else {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final boolean mo22358b() {
        return true;
    }

    /* renamed from: c */
    public final void mo22359c() {
        if (!ccvx.f180056a.mo6606a().mo76917v()) {
            UsbManager usbManager = this.f38057b;
            bnsi d = onr.f38027a.mo68390d();
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
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(valueOf).length());
                sb.append("No method setCurrentFunction for ");
                sb.append(name);
                sb.append(" ");
                sb.append(valueOf);
                throw new onn(sb.toString());
            }
        } else {
            for (UsbPort usbPort : this.f38057b.getPorts()) {
                UsbPortStatus status = usbPort.getStatus();
                if (status != null && status.isConnected()) {
                    usbPort.setRoles(1, 1);
                }
            }
        }
    }
}
