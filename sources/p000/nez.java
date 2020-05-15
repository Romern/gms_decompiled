package p000;

/* renamed from: nez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nez {

    /* renamed from: a */
    private final nex f35437a = new nex();

    /* renamed from: b */
    private final nfe f35438b = new nfe();

    /* renamed from: c */
    private final nfd f35439c = new nfd();

    /* renamed from: d */
    private final nfh f35440d = new nfh();

    /* renamed from: e */
    private final C1580nfc f35441e = new C1580nfc();

    /* renamed from: a */
    public final ney mo20560a(nek nek) {
        int length;
        byte b;
        byte[] bArr = nex.f35435a;
        byte[] a = nek.mo20525a(76);
        if (a != null && a.length >= 23 && a[0] == 2 && a[1] == 21) {
            return this.f35437a;
        }
        byte[] a2 = nek.mo20526a(nfb.f35449a);
        if (nfb.m26080e(nek) && a2 != null && a2.length >= 18 && (a2[0] & -16) == 0) {
            return this.f35438b;
        }
        byte[] a3 = nek.mo20526a(nfb.f35449a);
        if (nfb.m26080e(nek) && a3 != null && a3.length >= 4 && (a3[0] & -16) == 16) {
            return this.f35440d;
        }
        byte[] a4 = nek.mo20526a(nfb.f35449a);
        if (nfb.m26080e(nek) && a4 != null && (length = a4.length) >= 2 && (a4[0] & 240) == 32 && (((b = a4[1]) == 1 && length >= 18) || (b == 0 && length >= 14))) {
            return this.f35439c;
        }
        byte[] a5 = nek.mo20526a(nfb.f35449a);
        if (nfb.m26080e(nek) && a5 != null && a5.length >= 10 && (a5[0] & -16) == 48) {
            return this.f35441e;
        }
        return null;
    }
}
