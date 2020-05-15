package p000;

import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;

/* renamed from: agvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agvw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bitmap f66680a;

    /* renamed from: b */
    final /* synthetic */ String f66681b;

    /* renamed from: c */
    final /* synthetic */ agvx f66682c;

    public agvw(agvx agvx, Bitmap bitmap, String str) {
        this.f66682c = agvx;
        this.f66680a = bitmap;
        this.f66681b = str;
    }

    public final void run() {
        boolean z;
        this.f66682c.f66685t.setImageBitmap(this.f66680a);
        this.f66682c.f66685t.setVisibility(0);
        try {
            agpk a = agpk.m54726a();
            Long valueOf = Long.valueOf(this.f66682c.f66688w.f80155e);
            String str = this.f66681b;
            Bitmap bitmap = this.f66680a;
            if (a.mo35823a(valueOf, str) != null) {
                agpr agpr = new agpr();
                agpr.mo35887a(valueOf);
                agpr.mo35884a(bitmap);
                z = a.f66242a.mo35855a(agpr.mo35883a());
            } else {
                z = false;
            }
        } catch (SQLiteException e) {
            new agzb(this.f66682c.f66686u).mo36211a("Unexpected exception in putting logo to cache ", e);
            z = false;
        }
        if (cfmq.m140237h()) {
            agrl a2 = agrl.m54942a();
            bxvd da = booc.f133888c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booc) da.f164949b).f133890a = boob.m111380a(3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booc) da.f164949b).f133891b = z;
            a2.mo35992a((booc) da.mo74062i(), "MDP_UiAction", agvh.m55172b());
        }
        agrl.m54942a().mo35987a(22, "Logo is fetched from URL successfully", (String) null, bygd.CARRIER_LOGO_LOADED, System.currentTimeMillis(), agvh.m55172b());
        this.f66682c.mo36151w();
    }
}
