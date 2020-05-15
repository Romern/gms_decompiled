package p000;

import com.google.android.gms.beacon.BleSighting;

/* renamed from: bigd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BleSighting f120500a;

    /* renamed from: b */
    final /* synthetic */ bige f120501b;

    public bigd(bige bige, BleSighting bleSighting) {
        this.f120501b = bige;
        this.f120500a = bleSighting;
    }

    public final void run() {
        bhtv a = this.f120501b.f120502a.mo64591a(this.f120500a);
        if (a != null) {
            bify bify = this.f120501b.f120502a.f120514g;
            bhtv bhtv = (bhtv) bify.f120486a.get(a.f119574a);
            if (bhtv == null || bhtv.f119577d <= a.f119577d) {
                bify.f120486a.put(a.f119574a, a);
            }
            bigi bigi = this.f120501b.f120502a;
            if (!bigi.f120519l) {
                bigi.f120515h.postDelayed(bigi.f120517j, bigi.f120508b);
                this.f120501b.f120502a.f120519l = true;
            }
        }
    }
}
