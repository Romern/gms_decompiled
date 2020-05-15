package p000;

import android.content.IntentFilter;

/* renamed from: auvs */
final /* synthetic */ class auvs implements aubw {

    /* renamed from: a */
    private final auwc f92622a;

    public auvs(auwc auwc) {
        this.f92622a = auwc;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        auwc auwc = this.f92622a;
        Void voidR = (Void) obj;
        aunx aunx = auwc.f92631a;
        boolean z = auwc.f92646p;
        StringBuilder sb = new StringBuilder(17);
        sb.append("is register:");
        sb.append(z);
        aunx.mo50711a(sb.toString(), new Object[0]);
        if (auwc.f92646p) {
            auwc.f92631a.mo50711a("Successfully request activity updates.", new Object[0]);
            auwc.f92637g = true;
            auwc.f92634d.registerReceiver(auwc.f92636f, new IntentFilter("com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED"));
            auwc.f92635e.mo50983a(auwc.f92637g);
        }
    }
}
