package p000;

import android.os.SystemClock;

/* renamed from: bvdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvdz extends buqn {

    /* renamed from: a */
    final /* synthetic */ bved f155688a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bvdz(bved bved, String str) {
        super(str);
        this.f155688a = bved;
    }

    public final void run() {
        if (!this.f155688a.mo73358b()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bved bved = this.f155688a;
            if (elapsedRealtime - bved.f155701g <= 5000) {
                bved.f155697c.mo72983a(this, 100);
                return;
            }
            bved.mo73356a();
            srn srn = bvcm.f155598a;
            return;
        }
        this.f155688a.mo73356a();
        srn srn2 = bvcm.f155598a;
    }
}
