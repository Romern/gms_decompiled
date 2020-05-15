package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: rwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwj extends rvd {
    public rwj() {
        super("DisableModulesFix", TimeUnit.MINUTES.toSeconds(5));
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdkp.f181122a.mo6606a().mo77818e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qmc.a(boolean, boolean, java.util.Set, java.util.Set, java.util.Set):void
     arg types: [int, int, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], java.util.Set]
     candidates:
      qmc.a(android.content.Context, java.util.Set, java.util.Collection, djz, qmb):qnb
      qmc.a(android.content.Context, qnb, java.util.List, java.util.Collection, java.util.Collection):void
      qmc.a(boolean, boolean, java.util.Set, java.util.Set, java.util.Set):void */
    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Log.i("DisableModulesFix", "Updating Blacklisted Modules List");
        rue a = rue.m34467a();
        try {
            if (a.mo25174c().isEmpty()) {
                Log.i("DisableModulesFix", "No listeners are registered.");
                rvk d = rvl.mo25205d();
                d.mo25199a(this, 3);
                return d.mo25198a();
            }
            long hashCode = (long) rue.m34468b().hashCode();
            Context context = rvl.f43760b;
            if (anfb.f76758d) {
                SharedPreferences.Editor edit = anfb.m64140b(context, "direct_boot:gms_chimera_phenotype_flags").edit();
                edit.putLong("__dd_sp_version_key", hashCode);
                edit.commit();
                SharedPreferences c = anfb.m64141c(context, "direct_boot:gms_chimera_phenotype_flags");
                if (c != null) {
                    SharedPreferences.Editor edit2 = c.edit();
                    edit2.putLong("__dd_sp_version_key", hashCode);
                    edit2.commit();
                }
            } else {
                SharedPreferences.Editor edit3 = anfb.m64138a(context, "direct_boot:gms_chimera_phenotype_flags").edit();
                edit3.putLong("__dd_sp_version_key", hashCode);
                edit3.commit();
            }
            Context context2 = rvl.f43760b;
            Intent intent = new Intent("com.google.android.gms.common.config.devicedoctor.UPDATED");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("dd_shared_prefs_id_extra", hashCode);
            context2.sendBroadcast(intent);
            for (qma qma : a.mo25174c()) {
                qmc.m32416a().mo24106a(true, false, (Set) null, (Set) null, rue.m34468b());
            }
            a.close();
            rvk d2 = rvl.mo25205d();
            d2.mo25199a(this, 3);
            return d2.mo25198a();
        } finally {
            a.close();
        }
    }
}
