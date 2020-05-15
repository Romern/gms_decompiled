package p000;

import java.util.Arrays;

/* renamed from: xuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xuf implements xto {

    /* renamed from: b */
    private static final Logger f53147b = new Logger(new String[]{"KnownDataCableEidResolver"}, (short[]) null);

    /* renamed from: a */
    private final xjm f53148a;

    public xuf(xjm xjm) {
        this.f53148a = xjm;
    }

    /* renamed from: a */
    public final bqgg mo30127a(byte[] bArr) {
        if (Arrays.equals(this.f53148a.f52427b, bArr)) {
            return bqga.m112775a(this.f53148a);
        }
        f53147b.mo25414c("EID mismatch: 0x%s (expected) vs 0x%s (received)", srv.m36164d(this.f53148a.f52427b), srv.m36164d(bArr));
        return bqga.m112775a((Object) null);
    }
}
