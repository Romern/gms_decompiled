package p000;

import android.os.Handler;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: tay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tay extends tdl {

    /* renamed from: a */
    final boolean f45589a;

    /* renamed from: b */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45590b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tay(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity, Handler handler, boolean z) {
        super(handler);
        this.f45590b = constellationSettingsChimeraActivity;
        this.f45589a = z;
    }

    /* renamed from: a */
    public final void mo26315a(String str, ArrayList arrayList) {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45590b;
        Logger Logger = ConstellationSettingsChimeraActivity.f30536b;
        constellationSettingsChimeraActivity.f30556p = arrayList;
        constellationSettingsChimeraActivity.f30555o = str;
        tdx tdx = constellationSettingsChimeraActivity.f30537A;
        tdx.f45713f = arrayList;
        tdx.f45712e = str;
        if (!constellationSettingsChimeraActivity.f30552l && (constellationSettingsChimeraActivity.f30563w == null || this.f45589a)) {
            synchronized (constellationSettingsChimeraActivity.f30539C) {
                constellationSettingsChimeraActivity.f30540D = true;
            }
            constellationSettingsChimeraActivity.f30566z.mo26401a(constellationSettingsChimeraActivity.f30562v, 10);
            sxt.m36563a();
            sxt.m36568b(constellationSettingsChimeraActivity, constellationSettingsChimeraActivity.f30562v, 5, constellationSettingsChimeraActivity.f30538B);
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45590b;
            if (constellationSettingsChimeraActivity2.f30563w != null) {
                synchronized (constellationSettingsChimeraActivity2.f30539C) {
                    this.f45590b.f30544H = false;
                }
            } else {
                constellationSettingsChimeraActivity2.mo17981h();
            }
            this.f45590b.f30547d.postDelayed(new tax(this), cdfz.f180729a.mo6606a().mo77475l());
            return;
        }
        try {
            constellationSettingsChimeraActivity.f30548e.execute(new taz(constellationSettingsChimeraActivity));
        } catch (RejectedExecutionException e) {
            ConstellationSettingsChimeraActivity.f30536b.mo25417e("Couldn't start ReadDataTask", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45590b;
        Logger Logger = ConstellationSettingsChimeraActivity.f30536b;
        constellationSettingsChimeraActivity.f30566z.mo26404a(constellationSettingsChimeraActivity.f30562v, 10, tdw);
        ConstellationSettingsChimeraActivity.f30536b.mo25417e("Sync failed", tdw, new Object[0]);
        synchronized (this.f45590b.f30539C) {
            this.f45590b.f30540D = false;
            if (!(tdw instanceof tdt) && !(tdw instanceof tdv)) {
                this.f45590b.f30543G = true;
            }
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45590b;
            if (constellationSettingsChimeraActivity2.f30541E) {
                constellationSettingsChimeraActivity2.f30542F = true;
                this.f45590b.recreate();
            } else {
                constellationSettingsChimeraActivity2.f30547d.post(new tav(constellationSettingsChimeraActivity2));
            }
        }
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45590b;
        Logger Logger = ConstellationSettingsChimeraActivity.f30536b;
        synchronized (constellationSettingsChimeraActivity.f30539C) {
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45590b;
            constellationSettingsChimeraActivity2.f30566z.mo26405a(constellationSettingsChimeraActivity2.f30562v, 10, z);
            this.f45590b.f30540D = false;
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity3 = this.f45590b;
            if (constellationSettingsChimeraActivity3.f30541E) {
                constellationSettingsChimeraActivity3.f30542F = true;
                this.f45590b.recreate();
            } else {
                constellationSettingsChimeraActivity3.f30547d.post(new tav(constellationSettingsChimeraActivity3));
            }
        }
    }
}
