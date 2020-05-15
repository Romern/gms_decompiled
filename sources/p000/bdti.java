package p000;

import java.util.concurrent.Executor;

/* renamed from: bdti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdti implements bdry {

    /* renamed from: a */
    public final bdqu f106407a;

    /* renamed from: b */
    public final int f106408b;

    /* renamed from: c */
    public final int f106409c;

    /* renamed from: d */
    public final int f106410d;

    /* renamed from: e */
    public final bmzi f106411e;

    /* renamed from: f */
    public final bdrp f106412f;

    /* renamed from: g */
    public final bdqz f106413g;

    /* renamed from: h */
    public final bdtj f106414h;

    /* renamed from: i */
    public final Executor f106415i;

    /* renamed from: j */
    private final bqfj f106416j = bqfj.m112745a();

    public bdti(bdqu bdqu, int i, int i2, int i3, bmzi bmzi, bdrp bdrp, bdtj bdtj, bdqz bdqz, Executor executor) {
        this.f106407a = bdqu;
        this.f106408b = i;
        this.f106409c = i2;
        this.f106410d = i3;
        this.f106411e = bmzi;
        this.f106412f = bdrp;
        this.f106414h = bdtj;
        this.f106413g = bdqz;
        this.f106415i = executor;
    }

    /* renamed from: a */
    public static bxqc m91409a(bdrw bdrw) {
        bdrw bdrw2 = bdrw.UNKNOWN;
        int ordinal = bdrw.ordinal();
        if (ordinal == 0) {
            return bxqc.UNKNOWN_REQUEST_REASON;
        }
        if (ordinal == 1) {
            return bxqc.INITIALIZATION_SYNC;
        }
        if (ordinal == 2) {
            return bxqc.PERIODIC_SYNC;
        }
        if (ordinal != 3) {
            return bxqc.UNKNOWN_REQUEST_REASON;
        }
        return bxqc.PUSH_MESSAGE;
    }

    public final void close() {
        try {
            this.f106414h.close();
        } finally {
            this.f106413g.close();
        }
    }

    /* renamed from: a */
    public final bqgg mo58334a() {
        return bqga.m112778a(new bdsh(this), this.f106415i);
    }

    /* renamed from: a */
    public final bqgg mo58335a(long j) {
        return bqdx.m112674a(mo58334a(), new bdsi(this, j), this.f106415i);
    }

    /* renamed from: a */
    public final bqgg mo58336a(bdrx bdrx, bdru bdru, Executor executor) {
        return this.f106416j.mo69205a(new bdsk(this, bdrx, bdru, executor), this.f106415i);
    }

    /* renamed from: a */
    public final bqgg mo58337a(bxtx bxtx) {
        return bqdx.m112674a(bdrg.m91328a(((bbnn) this.f106411e.mo6606a()).mo56236a(bdrw.CHANGE_NOTIFICATION), "DeletionsDownloader"), new bdsj(this, bxtx), this.f106415i);
    }
}
