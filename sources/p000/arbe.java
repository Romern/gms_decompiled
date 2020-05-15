package p000;

/* renamed from: arbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f87268a;

    /* renamed from: b */
    final /* synthetic */ arbg f87269b;

    public arbe(arbg arbg, byte[] bArr) {
        this.f87269b = arbg;
        this.f87268a = bArr;
    }

    public final void run() {
        armu armu = this.f87269b.f87272a.f87279e;
        if (armu == null) {
            arbj.f87275a.mo25418e("Received %d bytes but controller is null", Integer.valueOf(this.f87268a.length));
            return;
        }
        armu.mo48352a(this.f87268a);
    }
}
