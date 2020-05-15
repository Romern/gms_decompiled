package p000;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: bdxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdxj implements bdwj {

    /* renamed from: a */
    public final bdqz f106585a;

    /* renamed from: b */
    public final bdxl f106586b;

    /* renamed from: c */
    public final Executor f106587c;

    /* renamed from: d */
    public final bdqu f106588d;

    /* renamed from: e */
    public final long f106589e;

    /* renamed from: f */
    public final int f106590f;

    /* renamed from: g */
    public final bmzi f106591g;

    /* renamed from: h */
    public final bdrp f106592h;

    /* renamed from: i */
    private final bqfj f106593i;

    public bdxj(bdqz bdqz, bdxl bdxl, Executor executor, bdqu bdqu, long j, int i, bmzi bmzi, bdrp bdrp) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        this.f106585a = bdqz;
        this.f106586b = bdxl;
        this.f106587c = executor;
        this.f106593i = bqfj.m112745a();
        this.f106588d = bdqu;
        this.f106589e = j;
        this.f106590f = i;
        this.f106591g = bmzi;
        this.f106592h = bdrp;
    }

    /* renamed from: a */
    public static bxpv m91545a(bdwf bdwf, bbnm bbnm) {
        if (bbnm != null) {
            bdwf.mo58402a(bbnm.mo56233e(), bdwv.f106558a);
        }
        return bdwf.mo58401a();
    }

    public final void close() {
        try {
            this.f106586b.close();
        } finally {
            this.f106585a.close();
        }
    }

    /* renamed from: a */
    public final bqgg mo58410a() {
        return this.f106593i.mo69205a(new bdxi(this), this.f106587c);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final bqgg mo58411a(Iterable r7) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int size = r7.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((bxbp) r7.get(i)).mo73639aL());
        }
        return bqdx.m112674a(bdrg.m91328a(((bbnn) this.f106591g.mo6606a()).mo56236a(bdwi.ENQUEUE_ALL), "FootprintsUploadBufferImpl"), new bdwu(this, currentTimeMillis, arrayList), this.f106587c);
    }
}
