package p000;

import java.util.Random;

/* renamed from: asrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asrj implements caou {
    /* renamed from: a */
    private static byte[] m74550a(int i) {
        byte[] bArr = new byte[i];
        new Random().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: b */
    public final byte[] mo49409b() {
        return m74550a(8);
    }

    /* renamed from: c */
    public final byte[] mo49410c() {
        return new byte[]{0, 1};
    }

    /* renamed from: d */
    public final byte[] mo49411d() {
        return m74550a(16);
    }

    /* renamed from: e */
    public final void mo49412e() {
    }

    /* renamed from: a */
    public final byte[] mo49408a() {
        return m74550a(16);
    }
}
