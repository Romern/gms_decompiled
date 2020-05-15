package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: vfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vfn implements Runnable {

    /* renamed from: a */
    public uga f49177a = null;

    /* renamed from: b */
    final /* synthetic */ vfp f49178b;

    /* renamed from: c */
    private final uey f49179c;

    /* renamed from: d */
    private final ukk f49180d;

    /* renamed from: e */
    private final vfb f49181e;

    /* renamed from: f */
    private final CountDownLatch f49182f = new CountDownLatch(1);

    /* renamed from: g */
    private vfo f49183g = null;

    public vfn(vfp vfp, uih uih, ukk ukk, vfb vfb) {
        this.f49178b = vfp;
        this.f49179c = uey.m38255a(uih);
        this.f49180d = ukk;
        this.f49181e = vfb;
    }

    /* renamed from: a */
    private final synchronized void m40304a(vcy vcy, int i) {
        vcy.mo28278a(3, i, this.f49183g.mo28396a(), this.f49178b.f49200m.mo28390a());
        vcy.mo28307h();
        vcy.mo28274a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r1.f49178b.mo28399a(r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r1.f49181e.mo28378f();
        r1.f49178b.f49194g.remove(r1.f49180d);
        r1.f49178b.f49194g.notify();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0242, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r1.f49178b.mo28399a(r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x025e, code lost:
        monitor-enter(r1.f49178b.f49194g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r1.f49181e.mo28378f();
        r1.f49178b.f49194g.remove(r1.f49180d);
        r1.f49178b.f49194g.notify();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0275, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r1.f49178b.mo28399a(r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1.f49181e.mo28378f();
        r1.f49178b.f49194g.remove(r1.f49180d);
        r1.f49178b.f49194g.notify();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.f49178b.mo28399a(r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7 = r1.f49177a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r7.f47490b != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r7.f47490b = new java.util.concurrent.CountDownLatch(1);
        r7.mo27306a(new p000.ufz(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7.f47490b.await();
        r7 = r7.f47491c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        m40304a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (r7 != 3) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        if (r7 != 2) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        r14 = r1.f49183g.mo28396a().longValue();
        r6 = r1.f49178b;
        r6.f49197j.mo27858a(new com.google.android.gms.drive.events.internal.TransferProgressData(1, r0.mo27610g(), p000.vfp.m40310a(r7), r14, r14), r0);
        r1.f49178b.f49195h.remove(r1.f49180d);
        p000.vfp.f49188a.mo25368a("PinnedContentDownloader", "Finished downloading file: %s", r1.f49180d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.f49178b.mo28399a(r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r2 = new java.lang.StringBuilder(37);
        r2.append("Download failed in state: ");
        r2.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0159, code lost:
        throw new java.lang.IllegalStateException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.f49178b.mo28399a(r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0195, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0196, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0199, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019a, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r2 = r1.f49178b.f49189b.mo27402a(r1.f49179c, r1.f49180d);
        r6 = mo28393a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ab, code lost:
        if (r6 != 0) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ad, code lost:
        r1.f49178b.mo28402b(r2, 4);
        p000.vfp.f49188a.mo25368a("PinnedContentDownloader", "File unpinned: %s", r1.f49180d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c4, code lost:
        if (r6 == 3) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c6, code lost:
        p000.vfp.f49188a.mo25368a("PinnedContentDownloader", "Download paused: %s", r1.f49180d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        r1.f49178b.mo28402b(r2, r7);
        r2 = (java.lang.Integer) r1.f49178b.f49195h.get(r1.f49180d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e7, code lost:
        if (r2 != null) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e9, code lost:
        r2 = r2.intValue() + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ef, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f0, code lost:
        r2 = java.lang.Integer.valueOf(r2);
        p000.vfp.f49188a.mo25367a("PinnedContentDownloader", java.lang.String.format("Failed to download file (attempt %d): %s", r2, r1.f49180d), r0);
        r1.f49178b.f49195h.put(r1.f49180d, r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x022c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0279 A[ExcHandler: uaa (e uaa), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0292 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0195 A[ExcHandler: all (r0v31 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ad A[Catch:{ uaa -> 0x0246, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c4 A[Catch:{ uaa -> 0x0246, all -> 0x0195 }] */
    public final void run() {
        try {
            ujx a = this.f49178b.f49189b.mo27402a(this.f49179c, this.f49180d);
            synchronized (this) {
                if (mo28393a(a) == 1) {
                    uey uey = this.f49179c;
                    if (a.mo27573ai()) {
                        uey = this.f49178b.mo28401b(a);
                        if (uey == null) {
                        }
                    }
                    this.f49178b.f49196i.mo28207a(uey, a.mo27616i(), vks.f49399a);
                    ujx a2 = this.f49178b.f49189b.mo27402a(this.f49179c, this.f49180d);
                    vcy c = this.f49178b.f49198k.mo28312c();
                    c.mo28300c(1, 61);
                    c.mo28299c(0);
                    c.mo28308i();
                    this.f49177a = this.f49178b.f49190c.mo27303a(this.f49179c, a2, this.f49181e);
                    vfo vfo = new vfo(this.f49178b, this.f49179c, this.f49180d);
                    this.f49183g = vfo;
                    this.f49177a.mo27306a(vfo);
                    this.f49182f.countDown();
                }
            }
            synchronized (this.f49178b.f49194g) {
                this.f49181e.mo28378f();
                this.f49178b.f49194g.remove(this.f49180d);
                this.f49178b.f49194g.notify();
            }
            return;
            synchronized (this.f49178b.f49194g) {
                this.f49181e.mo28378f();
                this.f49178b.f49194g.remove(this.f49180d);
                this.f49178b.f49194g.notify();
            }
            return;
            synchronized (this.f49178b.f49194g) {
            }
            synchronized (this.f49178b.f49194g) {
            }
            synchronized (this.f49178b.f49194g) {
                this.f49181e.mo28378f();
                this.f49178b.f49194g.remove(this.f49180d);
                this.f49178b.f49194g.notify();
            }
        } catch (uaa e) {
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    public final int mo28393a(ujx ujx) {
        return this.f49178b.mo28397a(ujx, this.f49181e);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    public final synchronized void mo28394a() {
        if (mo28393a(this.f49178b.f49189b.mo27402a(this.f49179c, this.f49180d)) != 1 && this.f49182f.await(500, TimeUnit.MILLISECONDS)) {
            this.f49177a.mo27305a();
        }
    }
}
