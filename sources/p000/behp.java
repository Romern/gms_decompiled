package p000;

import java.io.InputStream;

/* renamed from: behp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behp implements beez {
    private behp() {
    }

    /* renamed from: a */
    public static behp m95056a() {
        return new behp();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r7;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        Long l;
        byte[] bArr;
        InputStream b = behs.m95064b(beey);
        try {
            if (b instanceof begw) {
                l = ((begw) b).mo36254a();
            } else {
                l = null;
            }
            if (l == null && !beey.mo60640a()) {
                try {
                    long e = beey.f111467a.mo60649e(beey.f111471e);
                    if (e > 0) {
                        l = Long.valueOf(e);
                    }
                } catch (begy e2) {
                }
            }
            if (l != null) {
                bArr = new byte[bqcn.m112578a(l.longValue())];
                boav.m111017a(b, bArr);
            } else {
                bArr = boav.m111020a(b);
            }
            b.close();
            return bArr;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
