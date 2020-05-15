package p000;

import android.content.DialogInterface;
import com.google.android.gms.fitness.settings.activity.ManageDataSourcesChimeraActivity;

/* renamed from: zpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpo implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ zqj f55663a;

    /* renamed from: b */
    final /* synthetic */ ManageDataSourcesChimeraActivity f55664b;

    public zpo(ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity, zqj zqj) {
        this.f55664b = manageDataSourcesChimeraActivity;
        this.f55663a = zqj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity = this.f55664b;
        String str = manageDataSourcesChimeraActivity.f32446d.f55683a;
        bngx a = zqk.m45969a(this.f55663a);
        manageDataSourcesChimeraActivity.mo19192i();
        zpu zpu = manageDataSourcesChimeraActivity.f32445c;
        zpq zpq = new zpq(manageDataSourcesChimeraActivity, str);
        zpz zpz = (zpz) zpu;
        rjx a2 = ydj.m43846a(zpz.f55682e.getApplicationContext(), zpz.m45956a(str));
        zpz.f55681d = new aubf();
        rkb rkb = a2.f43165D;
        zcq zcq = new zcq(rkb, a);
        rkb.mo24787a((rle) zcq);
        zpz.f55680c = zpz.m45955a(sdl.m34954a(zcq), zpz.f55681d.f91349a);
        zpz.f55680c.mo50371a(new zpv(zpz, zpq));
    }
}
