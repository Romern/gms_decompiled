package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: cawq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawq {

    /* renamed from: a */
    public final cawq[] f176278a;

    /* renamed from: b */
    public final int f176279b;

    /* renamed from: c */
    public final int f176280c;

    public cawq() {
        this.f176278a = new cawq[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f176279b = 0;
        this.f176280c = 0;
    }

    public cawq(int i, int i2) {
        this.f176278a = null;
        this.f176279b = i;
        int i3 = i2 & 7;
        this.f176280c = i3 == 0 ? 8 : i3;
    }
}
