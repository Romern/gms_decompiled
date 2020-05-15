package p000;

import java.security.SecureRandom;

/* renamed from: aypt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aypt {

    /* renamed from: a */
    final byte f98212a;

    /* renamed from: b */
    final byte f98213b;

    /* renamed from: c */
    private final byte[] f98214c;

    public aypt(ayps ayps) {
        this.f98212a = ayps.f98209d;
        this.f98214c = ayps.f98211f;
        this.f98213b = ayps.f98210e;
    }

    /* renamed from: a */
    public abstract byte[] mo54206a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo54208b() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        bArr[0] = this.f98212a;
        bArr[1] = this.f98213b;
        System.arraycopy(this.f98214c, 0, bArr, 2, 6);
        return bArr;
    }
}
