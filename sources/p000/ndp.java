package p000;

/* renamed from: ndp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndp {

    /* renamed from: a */
    private static final Logger f35351a = new lvn("RestoreRequestGenerator");

    /* renamed from: b */
    private final long f35352b;

    /* renamed from: c */
    private final long f35353c;

    /* renamed from: d */
    private final String f35354d;

    /* renamed from: e */
    private final String f35355e;

    public ndp(long j, long j2, String str, String str2) {
        this.f35352b = j;
        this.f35353c = j2;
        this.f35354d = str;
        this.f35355e = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r9.f35353c == r1.f32917b) goto L_0x00cd;
     */
    /* renamed from: a */
    public final bxvd mo20494a() {
        bxvd da = lth.f32914q.mo74144da();
        long j = this.f35352b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lth lth = (lth) da.f164949b;
        int i = lth.f32916a | 1;
        lth.f32916a = i;
        lth.f32917b = j;
        int i2 = i | 32;
        lth.f32916a = i2;
        lth.f32921f = 512000;
        String str = this.f35354d;
        str.getClass();
        lth.f32916a = i2 | 4;
        lth.f32919d = str;
        if (cckq.m130234b()) {
            long j2 = this.f35353c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth2 = (lth) da.f164949b;
            lth2.f32916a |= 2;
            lth2.f32918c = j2;
        }
        if (!lwb.m24519c()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth3 = (lth) da.f164949b;
            lth3.f32925j = 2;
            lth3.f32916a |= 2048;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth4 = (lth) da.f164949b;
            lth4.f32925j = 1;
            lth4.f32916a |= 2048;
            if (this.f35355e != null) {
                if (ccno.f179554a.mo6606a().mo76477i()) {
                    lth lth5 = (lth) da.f164949b;
                    if ((lth5.f32916a & 1) != 0) {
                    }
                }
                f35351a.logVerbose("Requesting ancestral secondary key:%s", this.f35355e);
                String str2 = this.f35355e;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lth lth6 = (lth) da.f164949b;
                str2.getClass();
                lth6.f32916a |= 512;
                lth6.f32923h = str2;
            }
        }
        return da;
    }
}
