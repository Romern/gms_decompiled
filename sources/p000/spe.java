package p000;

import android.os.Handler;

/* renamed from: spe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class spe {

    /* renamed from: a */
    protected final aabl f44914a;

    /* renamed from: b */
    protected final String f44915b;

    /* renamed from: c */
    protected final int f44916c;

    /* renamed from: d */
    public volatile bqgj f44917d = null;

    /* renamed from: e */
    final /* synthetic */ spf f44918e;

    /* renamed from: f */
    private spb f44919f;

    public spe(spf spf, spb spb, String str, int i) {
        this.f44918e = spf;
        this.f44914a = spb.f44911a;
        this.f44919f = spb;
        this.f44915b = str;
        this.f44916c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25925a() {
        this.f44919f = null;
        this.f44917d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25926a(Handler handler) {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r4 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r0 = "AlarmTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r0 = "WakefulTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r0 = p000.blkh.m107281a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.mo25922a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r1.getClass();
        r1 = r2.mo25812a(p000.bljx.m107269a(new p000.spc(r1)));
        r0.mo66586a(r1);
        p000.snl.m35700a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r6.f44918e.f44923d.mo49114a(r6.f44915b, 30000);
        r1.mo741a(new p000.spd(r6), p000.bqfb.INSTANCE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r0 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = r6.f44916c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 != 2) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r4 = true;
     */
    /* renamed from: b */
    public final void mo25927b() {
        synchronized (this.f44918e.f44920a) {
            spb spb = this.f44919f;
            if (spb != null) {
                bqgj bqgj = this.f44917d;
                boolean z = false;
                this.f44918e.mo25933a(spb, false);
            } else {
                return;
            }
        }
        throw th;
    }
}
