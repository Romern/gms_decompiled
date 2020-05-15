package p000;

/* renamed from: nfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfe extends nfb {
    /* renamed from: a */
    public final int mo20552a() {
        return 2;
    }

    /* renamed from: a */
    public final Integer mo20553a(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final byte[] mo20554a(nek nek) {
        byte[] a = nek.mo20526a(nfb.f35449a);
        byte[] bArr = new byte[16];
        System.arraycopy(a, 2, bArr, 0, 10);
        System.arraycopy(a, 12, bArr, 10, 6);
        return bArr;
    }
}
