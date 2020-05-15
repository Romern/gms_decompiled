package p000;

/* renamed from: bwch */
final /* synthetic */ class bwch implements Runnable {

    /* renamed from: a */
    private final bwcm f158817a;

    public bwch(bwcm bwcm) {
        this.f158817a = bwcm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2 = r0.f158833f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = java.lang.System.currentTimeMillis();
        r1 = r0.f158832e.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r1.hasNext() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r5 = (p000.bwdg) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r5.f158889b > r3) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r0.f158832e.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r5.mo73505a(r3) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0.f158831d.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r0.f158831d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r1.hasNext() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r5 = (p000.bwdg) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r5.mo73505a(r3) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r5.mo73507b(r3);
        r0.f158832e.put(r5, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r1 = r0.f158831d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r1.hasNext() != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r0.mo73466b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (r0.f158831d.size() == 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r1 = r0.f158831d.size();
        r3 = new p000.bwdg[r1];
        r0.f158831d.toArray(r3);
        r0.f158831d.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2 = new java.util.ArrayList();
        r4 = r0.f158830c.mo73458a();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        if (r5 < r1) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r0.mo73466b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r2.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r0.mo73464a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        r6 = r3[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r6 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r2.isEmpty() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        if ((r6.mo73458a() + r4) <= 32768) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r0.mo73464a(r2);
        r4 = r0.f158830c.mo73458a();
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        r3[r5] = null;
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        r4 = r4 + r6.mo73458a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r0.mo73465a(r3, new java.io.IOException(r1.getMessage()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        ((p000.bwdg) r1.next()).mo73509h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    public final void run() {
        bwcm bwcm = this.f158817a;
        synchronized (bwcm.f158833f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = bwcm.f158837j;
            if (currentTimeMillis < j) {
                bwcm.f158838k.mo70160b(j);
                bwcm.f158838k.mo70161f();
                return;
            }
            bwcm.f158837j = 0;
            bwcm.f158836i = 0;
        }
    }
}
