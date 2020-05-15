package p000;

/* renamed from: egq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class egq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ egr f14871a;

    public egq(egr egr) {
        this.f14871a = egr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.f14871a.f14872a.mo10115a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r6.f14871a.mo10103a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r0 = p000.dwq.m9673q();
        r2 = new p000.tjo(null, 5);
        r2.mo26589a(p000.tka.m37117a(r1.f46357c));
        r2.mo26590a(r1.mo73642k());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r0.mo10051a(r2.mo26587a()) == -1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        p000.dwq.m9649F().f13752f.add(r1);
        r0 = r6.f14871a.f14872a;
     */
    public final void run() {
        synchronized (this.f14871a.f14872a) {
            if (!this.f14871a.f14872a.mo10117b()) {
                tnt c = this.f14871a.f14872a.mo10118c();
            } else {
                this.f14871a.f14872a.mo10115a();
            }
        }
    }
}
