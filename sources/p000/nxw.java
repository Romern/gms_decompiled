package p000;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;

/* renamed from: nxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxw implements nxu {

    /* renamed from: a */
    public static final bnsn f36900a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    public final nxx f36901b;

    /* renamed from: c */
    public volatile boolean f36902c;

    /* renamed from: d */
    public final PhoneStateListener f36903d = new nxv(this);

    /* renamed from: e */
    public final njd f36904e;

    /* renamed from: f */
    private final AudioManager f36905f;

    public nxw(AudioManager audioManager, nxx nxx, njd njd) {
        this.f36905f = audioManager;
        this.f36901b = nxx;
        this.f36904e = njd;
        this.f36902c = nxx.mo21816a() != 0;
    }

    /* renamed from: a */
    public final boolean mo21813a() {
        int mode = this.f36905f.getMode();
        return mode == 2 || mode == 1;
    }

    /* renamed from: b */
    public final boolean mo21814b() {
        return this.f36901b.mo21816a() != 0 || this.f36902c || mo21813a();
    }
}
