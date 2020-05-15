package p000;

import android.content.DialogInterface;
import com.google.android.gms.fitness.settings.activity.ManageDataSourcesChimeraActivity;

/* renamed from: zpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpp implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ManageDataSourcesChimeraActivity f55665a;

    public zpp(ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity) {
        this.f55665a = manageDataSourcesChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity = this.f55665a;
        String str = manageDataSourcesChimeraActivity.f32446d.f55683a;
        manageDataSourcesChimeraActivity.mo19192i();
        zpu zpu = manageDataSourcesChimeraActivity.f32445c;
        zpr zpr = new zpr(manageDataSourcesChimeraActivity);
        zpz zpz = (zpz) zpu;
        rjx a = ydj.m43846a(zpz.f55682e.getApplicationContext(), zpz.m45956a(str));
        zpz.f55681d = new aubf();
        rkb rkb = a.f43165D;
        zcp zcp = new zcp(rkb);
        rkb.mo24787a((rle) zcp);
        zpz.f55680c = zpz.m45955a(sdl.m34954a(zcp), zpz.f55681d.f91349a);
        zpz.f55680c.mo50371a(new zpw(zpz, zpr));
    }
}
