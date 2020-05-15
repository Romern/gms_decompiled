package p000;

/* renamed from: zrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zrt implements zrv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo31415a(byte[] bArr, long j, boolean z, int i, long j2) {
        cabc cabc = (cabc) GeneratedMessageLite.m124016a(cabc.f172411k, bArr, bxus.m123744c());
        bxvd bxvd = (bxvd) cabc.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cabc);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cabc cabc2 = (cabc) bxvd.f164949b;
        int i2 = cabc2.f172413a | 2;
        cabc2.f172413a = i2;
        cabc2.f172415c = z;
        int i3 = i2 | 16;
        cabc2.f172413a = i3;
        cabc2.f172418f = j;
        if (i > 0) {
            i3 |= 32;
            cabc2.f172413a = i3;
            cabc2.f172419g = i;
        }
        cabc2.f172413a = i3 | 64;
        cabc2.f172420h = j2;
        return (cabc) bxvd.mo74062i();
    }
}
