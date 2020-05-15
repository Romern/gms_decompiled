package p000;

import android.net.TrafficStats;

/* renamed from: nof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nof extends ojd {

    /* renamed from: a */
    final /* synthetic */ noj f36147a;

    /* renamed from: b */
    private final Object f36148b = new Object();

    /* renamed from: c */
    private boolean f36149c;

    /* renamed from: d */
    private final nzk f36150d;

    public nof(noj noj, nzk nzk) {
        this.f36147a = noj;
        boolean z = true;
        this.f36149c = true;
        this.f36150d = nzk;
        sdo.m34970a(noj.f36231r != 2 ? false : z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r0.f121699b != r1.f36147a.f36174S) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r2 = android.os.SystemClock.elapsedRealtime();
        r5 = r0.f121699b;
        r0 = r1.f36150d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r0.f37008a.f131251a == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r7 = r0.f37011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8 = java.lang.Math.max((double) r0.f37008a.mo66928a(java.util.concurrent.TimeUnit.MILLISECONDS), 1.0d);
        r10 = (double) (android.net.TrafficStats.getTotalTxBytes() - android.net.TrafficStats.getMobileTxBytes());
        r12 = (double) (android.net.TrafficStats.getTotalRxBytes() - android.net.TrafficStats.getMobileRxBytes());
        r14 = r0.f37009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        java.lang.Double.isNaN(r10);
        r14 = ((r10 - r14) / r8) * 1000.0d;
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4 = r0.f37010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        java.lang.Double.isNaN(r12);
        r4 = ((r12 - r4) / r8) * 1000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.f37008a.mo66929c();
        r0.f37008a.mo66930d();
        r0.f37009b = r10;
        r0.f37010c = r12;
        r0 = new p000.nzj((int) (r4 / 1024.0d), (int) (r14 / 1024.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        r4 = r1.f36147a.f36168M;
        r3 = (int) (r2 - r18);
        r2 = r0.f37007b;
        r0 = r0.f37006a;
        r5 = p000.bpeh.f137274e.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        if (r5.f164950c != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        r6 = (p000.bpeh) r5.f164949b;
        r7 = r6.f137276a | 1;
        r6.f137276a = r7;
        r6.f137277b = r3;
        r3 = r7 | 4;
        r6.f137276a = r3;
        r6.f137279d = r2;
        r6.f137276a = r3 | 2;
        r6.f137278c = r0;
        r0 = (p000.bpeh) r5.mo74062i();
        r4 = (p000.nja) r4;
        r2 = r4.mo20870c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        if (r2.f164950c != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f4, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fa, code lost:
        r3 = (p000.bpcl) r2.f164949b;
        r5 = p000.bpcl.f135759L;
        r0.getClass();
        r3.f135788p = r0;
        r3.f135773a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        r4.mo20868a(r2, 43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        throw new java.lang.IllegalStateException("WirelessLinkSpeedCalculator must be initialized before trying to calculate averages");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo21235a(bitq bitq) {
        bitq bitq2 = bitq;
        long j = bitq2.f121699b;
        synchronized (this.f36148b) {
            if (this.f36149c) {
                nzk nzk = this.f36150d;
                bmza bmza = nzk.f37008a;
                if (bmza.f131251a) {
                    bmza.mo66929c();
                }
                nzk.f37008a.mo66930d();
                nzk.f37009b = (double) (TrafficStats.getTotalTxBytes() - TrafficStats.getMobileTxBytes());
                nzk.f37010c = (double) (TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes());
                this.f36149c = false;
            }
        }
    }
}
