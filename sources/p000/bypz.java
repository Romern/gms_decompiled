package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bypz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypz {

    /* renamed from: a */
    public final byte f167367a;

    /* renamed from: b */
    public final byte f167368b;

    public bypz(int i) {
        this.f167367a = (byte) (i & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        this.f167368b = (byte) (i & 31);
    }

    /* renamed from: a */
    public final int mo74450a() {
        return (this.f167367a >> 5) & 7;
    }
}
