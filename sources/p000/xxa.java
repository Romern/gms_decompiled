package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.StateUpdate;

/* renamed from: xxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxa {

    /* renamed from: c */
    public static final Logger f53319c = new Logger(new String[]{"BrowserU2fApiHelper"}, (short[]) null);

    /* renamed from: a */
    public final xxs f53320a;

    /* renamed from: b */
    public boolean f53321b = false;

    public xxa(xws xws) {
        xxs xxs = new xxs(xws);
        this.f53320a = xxs;
    }

    /* renamed from: a */
    public final xyy mo30208a(Context context) {
        return new xyy(BluetoothAdapter.getDefaultAdapter(), xhy.m42973a(context), context.getPackageManager().hasSystemFeature("android.hardware.usb.host"), bnic.m109491a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB));
    }

    /* renamed from: a */
    public final void mo30209a(StateUpdate stateUpdate) {
        Logger Logger = f53319c;
        String valueOf = String.valueOf(stateUpdate.f31875e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("updateTransaction is called for ");
        sb.append(valueOf);
        Logger.mo25414c(sb.toString(), new Object[0]);
        if (this.f53321b) {
            this.f53320a.mo29750a(stateUpdate);
            if (stateUpdate.equals(StateUpdate.f31871a)) {
                this.f53321b = false;
                return;
            }
            return;
        }
        f53319c.mo25418e("updateTransaction must be called during either registration or signature transaction!", new Object[0]);
    }
}
