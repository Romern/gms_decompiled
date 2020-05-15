package p000;

import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;

/* renamed from: auvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auvz implements rkl {

    /* renamed from: a */
    final /* synthetic */ auwc f92629a;

    public auvz(auwc auwc) {
        this.f92629a = auwc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        auwc auwc = this.f92629a;
        aunx aunx = auwc.f92631a;
        boolean z = auwc.f92646p;
        StringBuilder sb = new StringBuilder(17);
        sb.append("is register:");
        sb.append(z);
        aunx.mo50711a(sb.toString(), new Object[0]);
        if (auwc.f92646p) {
            if (status.mo17710c()) {
                auwc.f92631a.mo50711a("Successfully request activity updates.", new Object[0]);
                auwc.f92637g = true;
                auwc.f92634d.registerReceiver(auwc.f92636f, new IntentFilter("com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED"));
            } else {
                auwc.f92631a.mo50711a("Unable to request activity updates.", new Object[0]).mo50706a();
                auwc.f92637g = false;
            }
            auwc.f92635e.mo50983a(auwc.f92637g);
        }
    }
}
