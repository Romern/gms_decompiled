package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: cihy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihy {

    /* renamed from: a */
    public final cihy[] f190386a;

    /* renamed from: b */
    public final int f190387b;

    /* renamed from: c */
    public final int f190388c;

    public cihy() {
        this.f190386a = new cihy[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f190387b = 0;
        this.f190388c = 0;
    }

    public cihy(int i, int i2) {
        this.f190386a = null;
        this.f190387b = i;
        int i3 = i2 & 7;
        this.f190388c = i3 == 0 ? 8 : i3;
    }
}
