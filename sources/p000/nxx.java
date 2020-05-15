package p000;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* renamed from: nxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxx {

    /* renamed from: a */
    private final TelephonyManager f36906a;

    public nxx(Context context) {
        this.f36906a = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    public final int mo21816a() {
        return this.f36906a.getCallState();
    }

    /* renamed from: a */
    public final void mo21817a(PhoneStateListener phoneStateListener, int i) {
        this.f36906a.listen(phoneStateListener, i);
    }
}
