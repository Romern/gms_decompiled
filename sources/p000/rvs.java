package p000;

import android.util.Log;

/* renamed from: rvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvs extends ruq {

    /* renamed from: b */
    private final bdyx f43778b;

    public rvs(String str, bdyx bdyx) {
        super(str);
        sdo.m34959a(bdyx);
        this.f43778b = bdyx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25185a(rvl rvl) {
        Long valueOf = Long.valueOf(mo25211b());
        return valueOf.longValue() > 0 && Long.valueOf(mo25212b(rvl)).longValue() < valueOf.longValue();
    }

    /* renamed from: b */
    public final long mo25211b() {
        return ((Long) this.f43778b.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo25212b(rvl rvl) {
        rvj rvj = rvl.f43766h;
        if (rvj != null) {
            bnre i = rvl.mo25204b().listIterator();
            long j = 0;
            while (i.hasNext()) {
                ruk ruk = (ruk) i.next();
                if (rvj.f43742a.equals(ruk.f43702a)) {
                    byte[] bArr = ruk.f43707f;
                    if (bArr.length != 8) {
                        return 0;
                    }
                    try {
                        Long valueOf = Long.valueOf(bqcr.m112594a(bArr));
                        if (j < valueOf.longValue()) {
                            j = valueOf.longValue();
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        Log.e(mo25186a(), "Failed to parse opaque data", e);
                        return 0;
                    }
                }
            }
            return j;
        }
        Log.e(mo25186a(), "Fixer was null on context!!");
        return 0;
    }
}
