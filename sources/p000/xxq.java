package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.StateUpdate;

/* renamed from: xxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxq {

    /* renamed from: c */
    public static final sek f53341c = new sek(new String[]{"U2fApiHelper"}, (short[]) null);

    /* renamed from: a */
    public final xxs f53342a;

    /* renamed from: b */
    public boolean f53343b = false;

    public xxq(xws xws) {
        xxs xxs = new xxs(xws);
        this.f53342a = xxs;
    }

    /* renamed from: a */
    public final xyy mo30231a(Context context) {
        return new xyy(BluetoothAdapter.getDefaultAdapter(), xhy.m42973a(context), context.getPackageManager().hasSystemFeature("android.hardware.usb.host"), bnic.m109491a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB));
    }

    /* renamed from: a */
    public final void mo30232a(StateUpdate stateUpdate) {
        sek sek = f53341c;
        String valueOf = String.valueOf(stateUpdate.f31875e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("updateTransaction is called for ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (this.f53343b) {
            this.f53342a.mo29750a(stateUpdate);
            if (stateUpdate.equals(StateUpdate.f31871a)) {
                this.f53343b = false;
                return;
            }
            return;
        }
        f53341c.mo25418e("updateTransaction must be called during either registration or signature transaction!", new Object[0]);
    }
}
