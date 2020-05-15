package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.DataSourceStatsResult;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: znj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znj {

    /* renamed from: a */
    public static final srn f55551a = zvt.m46581a();

    /* renamed from: b */
    public static final Status f55552b = new Status(0);

    /* renamed from: c */
    public final ysl f55553c;

    /* renamed from: d */
    public final zre f55554d;

    /* renamed from: e */
    public final zqx f55555e;

    /* renamed from: f */
    public final znm f55556f;

    /* renamed from: g */
    public final Set f55557g;

    public znj(ysl ysl, zre zre, zqx zqx, yec yec, Set set) {
        this.f55556f = new znm(zqx, yec);
        this.f55553c = ysl;
        this.f55554d = zua.m46422a(zre);
        this.f55555e = zqx;
        this.f55557g = set;
    }

    /* renamed from: a */
    public static DataSourceStatsResult m45803a(caae caae, ygw ygw) {
        return new DataSourceStatsResult(yvx.m44927a(caae, null), ygw.f53781a, ygw.f53782b, ygw.mo30468a(), ygw.mo30469b(), ygw.f53785e);
    }

    /* renamed from: a */
    public static void m45804a(cadp cadp) {
        bxwc bxwc = cadp.f172714c;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            cadn cadn = (cadn) bxwc.get(i);
            String a = yyq.m45053a(cadn);
            i++;
            if (a != null) {
                ((bnsl) f55551a.mo68388c()).mo68424a("Bad data point specified. DataPoint: %s. Result: %s", yyk.m45023b(cadn), a);
                throw new ytw(5021, null);
            }
        }
    }

    /* renamed from: a */
    public final List mo31271a(List list, List list2, String str) {
        return this.f55556f.mo31275a(list, list2, str);
    }

    /* renamed from: a */
    public final void mo31272a(String str, cadp cadp) {
        caae caae = cadp.f172713b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        Status a = this.f55553c.mo30717a(str, bnic.m109489a(caae), 2);
        if (!a.mo17710c()) {
            throw new ytw(a.f30115i, a.f30116j);
        }
    }

    /* renamed from: a */
    public final void mo31273a(String str, List list) {
        Status a = this.f55553c.mo30717a(str, bnic.m109495a((Collection) list), 1);
        if (!a.mo17710c()) {
            throw new ytw(a.f30115i, a.f30116j);
        }
    }
}
