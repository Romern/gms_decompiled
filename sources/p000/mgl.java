package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;

/* renamed from: mgl */
final /* synthetic */ class mgl implements Runnable {

    /* renamed from: a */
    private final mgq f33645a;

    public mgl(mgq mgq) {
        this.f33645a = mgq;
    }

    public final void run() {
        mgq mgq = this.f33645a;
        if (mgq.f33655d != 4) {
            mgp mgp = mgq.f33653b;
            mgo mgo = mgq.f33654c;
            int a = qkj.m32287a(mgo.f33648a, C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_48);
            C1102je jeVar = new C1102je(mgo.f33648a);
            jeVar.mo13630b(a);
            jeVar.f22271w = C1133kh.m17843b(mgo.f33648a, C0126R.color.quantum_googblue);
            jeVar.mo13640e(mgo.f33648a.getResources().getString(C0126R.string.source_notification_title));
            jeVar.mo13632b(mgo.f33648a.getResources().getString(C0126R.string.source_notification_text));
            jeVar.mo13633b(true);
            jeVar.f22270v = mgo.mo19996b();
            Intent intent = new Intent();
            intent.setClassName(mgo.f33648a, "com.google.android.gms.backup.component.D2dSourceActivity");
            intent.addFlags(268435456);
            if (mgo.f33649b) {
                intent.setAction("com.google.android.gms.backup.ACTION_WIFI_D2D");
            }
            jeVar.f22254f = PendingIntent.getActivity(mgo.f33648a, 0, intent, 134217728);
            mgp.mo19998a(sex.m35104a(mgo.f33648a).mo25436a(jeVar.mo13629b()));
            mgq.f33655d = 4;
        }
    }
}
