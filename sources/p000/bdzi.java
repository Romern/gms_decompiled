package p000;

import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bdzi */
final /* synthetic */ class bdzi implements aubq {

    /* renamed from: a */
    private final bdzj f106684a;

    /* renamed from: b */
    private final Map f106685b;

    public bdzi(bdzj bdzj, Map map) {
        this.f106684a = bdzj;
        this.f106685b = map;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        String str;
        bdzj bdzj = this.f106684a;
        Map map = this.f106685b;
        if (!aucb.mo50384b()) {
            Log.e("ContentProviderFlagSource", "Could not read flags from Phenotype API, not performing optimistic update");
            return;
        }
        Configurations configurations = (Configurations) aucb.mo50386d();
        if (configurations != null && (str = configurations.f82074a) != null && !str.isEmpty()) {
            HashMap a = !configurations.f82079f ? bnmt.getNewHashMap() : bnmt.m109803b(map);
            Configuration[] configurationArr = configurations.f82077d;
            for (Configuration configuration : configurationArr) {
                Flag[] flagArr = configuration.f82071b;
                for (Flag flag : flagArr) {
                    a.put(flag.f82099a, flag.mo46505f());
                }
                for (String str2 : configuration.f82072c) {
                    a.remove(str2);
                }
            }
            a.put("__phenotype_server_token", configurations.f82076c);
            a.put("__phenotype_snapshot_token", configurations.f82074a);
            a.put("__phenotype_configuration_version", Long.toString(configurations.f82080g));
            bnhe a2 = bnhe.m109413a(a);
            if (!bdzj.f106693h.mo58474a(a2)) {
                bdzz.m91651a(bdzj.f106690e.mo58441a());
            } else {
                bdzj.mo58465a(a2);
            }
        }
    }
}
