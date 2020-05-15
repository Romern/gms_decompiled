package p000;

import java.util.Arrays;

/* renamed from: bqny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqny {

    /* renamed from: a */
    public final Object f141321a;

    /* renamed from: b */
    public final int f141322b;

    /* renamed from: c */
    public final int f141323c;

    /* renamed from: d */
    private final byte[] f141324d;

    public bqny(Object obj, byte[] bArr, int i, int i2) {
        this.f141321a = obj;
        this.f141324d = Arrays.copyOf(bArr, bArr.length);
        this.f141322b = i;
        this.f141323c = i2;
    }

    /* renamed from: a */
    public final byte[] mo69312a() {
        byte[] bArr = this.f141324d;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }
}
