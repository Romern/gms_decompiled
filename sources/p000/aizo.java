package p000;

/* renamed from: aizo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aizo extends buqn {

    /* renamed from: a */
    final /* synthetic */ aizp f70165a;

    /* renamed from: b */
    private final int f70166b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public aizo(aizp aizp, int i) {
        super(r3.length() == 0 ? new String("CarrierSenseEvent_") : "CarrierSenseEvent_".concat(r3));
        this.f70165a = aizp;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "WAIT_FOR_STOP_BROADCAST_ELAPSED" : "BROADCAST_TIME_ELAPSED" : "NO_BROADCAST_DETECTED" : "BROADCAST_DETECTED" : "START";
        this.f70166b = i;
    }

    public final void run() {
        if (this.f70165a.f70173g) {
            int i = this.f70166b;
            if (i == 1 || i == 2) {
                this.f70165a.mo38338a(false);
            } else if (i == 3) {
                this.f70165a.mo38335a();
                aizp aizp = this.f70165a;
                aizp.f70171e.mo38326a(aizp.f70168b, aizp.f70169c);
                aizp aizp2 = this.f70165a;
                byyc byyc = aizp2.f70172f.f70278f.f168922e;
                if (byyc == null) {
                    byyc = byyc.f168888g;
                }
                long length = byyc.f168895f * ((long) aizp2.f70169c.f9891a.length);
                byyc byyc2 = aizp2.f70172f.f70278f.f168922e;
                if (byyc2 == null) {
                    byyc2 = byyc.f168888g;
                }
                aizp2.mo38337a(4, aizp2.mo38334a(length, byyc2.f168890a));
            } else if (i != 4) {
                this.f70165a.mo38338a(true);
            } else {
                this.f70165a.mo38339b();
                aizp aizp3 = this.f70165a;
                byyc byyc3 = aizp3.f70172f.f70278f.f168922e;
                if (byyc3 == null) {
                    byyc3 = byyc.f168888g;
                }
                aizp3.mo38337a(5, byyc3.f168894e);
            }
        }
    }
}
