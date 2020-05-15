package p000;

/* renamed from: bfgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfhb f113856a;

    public bfgz(bfhb bfhb) {
        this.f113856a = bfhb;
    }

    public final void run() {
        bfha bfha;
        synchronized (this.f113856a.f113865d) {
            bfhb bfhb = this.f113856a;
            if (!bfhb.f113866e && (bfha = bfhb.f113867f) != null) {
                bmxy.m108581a(bfha);
                bfhb bfhb2 = this.f113856a;
                bfhb2.f113867f.f113857a = true;
                bfhb2.mo61685a(false, 0);
                this.f113856a.f113867f = null;
            }
        }
    }
}
