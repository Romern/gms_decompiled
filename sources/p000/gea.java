package p000;

import android.telephony.PhoneStateListener;
import java.lang.ref.WeakReference;

/* renamed from: gea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gea extends PhoneStateListener {

    /* renamed from: a */
    private final WeakReference f18006a;

    public gea(gec gec) {
        this.f18006a = new WeakReference(gec);
    }

    public final void onCallStateChanged(int i, String str) {
        gec gec = (gec) this.f18006a.get();
        if (gec != null) {
            gec.f18008b.post(new gdz(gec, i));
        }
    }
}
