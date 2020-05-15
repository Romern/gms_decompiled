package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.settings.activity.ManageDataSourcesChimeraActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: zps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zps implements zpt {

    /* renamed from: a */
    final /* synthetic */ String f55669a;

    /* renamed from: b */
    final /* synthetic */ ManageDataSourcesChimeraActivity f55670b;

    public zps(ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity, String str) {
        this.f55670b = manageDataSourcesChimeraActivity;
        this.f55669a = str;
    }

    /* renamed from: a */
    public final void mo31318a(boolean z, List list) {
        if (z) {
            ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity = this.f55670b;
            String str = this.f55669a;
            zqb zqb = manageDataSourcesChimeraActivity.f32446d;
            zqb.f55683a = str;
            bnia j = bnic.m109500j();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((DataSource) it.next()).f32005a.f32064a;
                Object obj = (zqj) zqk.f55697a.get(str2);
                if (obj == null) {
                    obj = !zqk.f55698b.contains(str2) ? new zqi(str2) : null;
                }
                if (obj != null) {
                    j.mo67629b(obj);
                }
            }
            zqb.f55684b = j.mo67751a();
            manageDataSourcesChimeraActivity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fitness_manage_data_sources_fragment, manageDataSourcesChimeraActivity.f32447e, "types").commit();
            return;
        }
        ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity2 = this.f55670b;
        zqb zqb2 = manageDataSourcesChimeraActivity2.f32446d;
        zqb2.f55683a = null;
        zqb2.f55684b = null;
        Toast.makeText(manageDataSourcesChimeraActivity2, (int) C0126R.string.fitness_manage_data_sources_load_failure, 1).show();
        manageDataSourcesChimeraActivity2.finish();
    }
}
