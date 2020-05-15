package p000;

/* renamed from: asrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrc {

    /* renamed from: a */
    public final int f89478a;

    /* renamed from: b */
    public final byte f89479b;

    /* renamed from: c */
    public final int f89480c;

    public asrc(int i, byte b, int i2) {
        boolean z;
        if (b >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "PDOL tags must have a positive length");
        this.f89478a = i;
        this.f89479b = b;
        this.f89480c = i2;
    }
}
