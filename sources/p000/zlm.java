package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: zlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zlm implements zgf {

    /* renamed from: b */
    public static final /* synthetic */ int f55385b = 0;

    /* renamed from: c */
    private static final srn f55386c = zvt.m46581a();

    /* renamed from: a */
    public final zki f55387a = new zki();

    /* renamed from: d */
    private final Context f55388d;

    /* renamed from: e */
    private final Map f55389e = new HashMap();

    /* renamed from: f */
    private final bmzi f55390f = bmzn.m108682a(zlk.f55383a, 1, TimeUnit.MINUTES);

    public zlm(Context context) {
        this.f55388d = context;
    }

    /* renamed from: a */
    private static bngx m45690a(ResolveInfo resolveInfo) {
        IntentFilter intentFilter = resolveInfo.filter;
        bngs b = bngx.m109371b(intentFilter.countDataTypes());
        Iterator<String> typesIterator = intentFilter.typesIterator();
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            if (next.startsWith("vnd.google.fitness.data_type/")) {
                try {
                    b.mo67668c(bzzn.m126359a(next.substring(29)));
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) f55386c.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("zlm", "a", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Couldn't resolve mime type %s", next);
                }
            }
        }
        return b.mo67664a();
    }

    /* renamed from: c */
    private final zie m45691c(caah caah) {
        Map map = (Map) this.f55390f.mo6606a();
        zie zie = (zie) map.get(caah);
        if (zie != null) {
            return zie;
        }
        Intent intent = new Intent("com.google.android.gms.fitness.service.FitnessSensorService");
        intent.setType(bzzn.m126365b(caah));
        List<ResolveInfo> queryIntentServices = this.f55388d.getPackageManager().queryIntentServices(intent, 64);
        if (!queryIntentServices.isEmpty()) {
            queryIntentServices.size();
            bnrv.m110182a(new zll(caah));
        }
        ArrayList arrayList = new ArrayList(queryIntentServices.size());
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.packageName;
            synchronized (this.f55389e) {
                zlu zlu = (zlu) this.f55389e.get(str);
                if (zlu == null) {
                    IntentFilter intentFilter = resolveInfo.filter;
                    bngs b = bngx.m109371b(intentFilter.countDataTypes());
                    Iterator<String> typesIterator = intentFilter.typesIterator();
                    while (typesIterator.hasNext()) {
                        String next = typesIterator.next();
                        if (next.startsWith("vnd.google.fitness.data_type/")) {
                            try {
                                b.mo67668c(bzzn.m126359a(next.substring(29)));
                            } catch (IllegalArgumentException e) {
                                bnsl bnsl = (bnsl) f55386c.mo68388c();
                                bnsl.mo68437a(e);
                                bnsl.mo68432a("zlm", "a", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("Couldn't resolve mime type %s", next);
                            }
                        }
                    }
                    bngx a = b.mo67664a();
                    if (!a.isEmpty()) {
                        Intent intent2 = new Intent(intent.getAction());
                        intent2.setPackage(str);
                        intent2.setType(bzzn.m126365b(caah));
                        zlu zlu2 = new zlu(this.f55388d, intent2, a);
                        this.f55389e.put(str, zlu2);
                        zlu = zlu2;
                    }
                }
                arrayList.add(zlu);
            }
        }
        zie zie2 = new zie(arrayList);
        map.put(caah, zie2);
        return zie2;
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return zge.m45363a();
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        return m45691c(caah).mo19161b(caah);
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        caae caae = zgh.f55011a;
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        bqgg a = m45691c(caah).mo19155a(zgh);
        bqga.m112781a(a, new yug(this, zgh, caae), bqfb.INSTANCE);
        return a;
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return m45691c(caah).mo19158a(caae);
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        return m45691c(caah).mo19159a(caah);
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        zkh zkh = (zkh) this.f55387a.f55305a.get(zgg);
        if (zkh == null) {
            bnsl bnsl = (bnsl) f55386c.mo68390d();
            bnsl.mo68432a("zlm", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Couldn't find registration for %s, ignoring.", zgg);
            return false;
        }
        List list = zkh.f55300c;
        if (list.size() > 1) {
            bnsl bnsl2 = (bnsl) f55386c.mo68387b();
            bnsl2.mo68432a("zlm", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("More than one data source for listener %s, %s", zgg, list);
        }
        caah caah = ((caae) list.get(0)).f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return m45691c(caah).mo19160a(zgg);
    }
}
