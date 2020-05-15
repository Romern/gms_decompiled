package p000;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: auox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auox {

    /* renamed from: f */
    private static WeakReference f92235f = new WeakReference(null);

    /* renamed from: a */
    public final Object f92236a = new Object();

    /* renamed from: b */
    public final aumr f92237b;

    /* renamed from: c */
    public aumt f92238c;

    /* renamed from: d */
    public final Map f92239d;

    /* renamed from: e */
    public final bqgj f92240e = snp.m35704b(10);

    private auox(Context context) {
        aumr a = aumr.m77322a(context);
        this.f92237b = a;
        HashMap hashMap = new HashMap();
        hashMap.put("sql_query_key", String.format("SELECT * FROM %s WHERE _id = (SELECT MAX(_id) FROM %s)", "SmartLock_status_model", "SmartLock_status_model"));
        List a2 = a.mo50675a(aumt.class, hashMap);
        aumt aumt = new aumt("-1");
        if (!a2.isEmpty()) {
            if (a2.size() == 1) {
                aumt = (aumt) a2.get(0);
            } else {
                Log.e("Coffee-TrustStatusMonitor", "Error, get more than one latest smart lock status models.");
            }
        }
        this.f92238c = aumt;
        HashMap hashMap2 = new HashMap();
        this.f92239d = hashMap2;
        hashMap2.put("Bluetooth", mo50784a("Bluetooth"));
        this.f92239d.put("OnBody", mo50784a("OnBody"));
        this.f92239d.put("VoiceUnlock", mo50784a("VoiceUnlock"));
        this.f92239d.put("FaceUnlock", mo50784a("FaceUnlock"));
        this.f92239d.put("Place", mo50784a("Place"));
        this.f92239d.put("ConnectionlessBle", mo50784a("ConnectionlessBle"));
        this.f92239d.put("NFC", mo50784a("NFC"));
    }

    /* renamed from: a */
    public static synchronized auox m77526a() {
        auox auox;
        synchronized (auox.class) {
            auox = (auox) f92235f.get();
            if (auox == null) {
                auox = new auox(rpr.m34216b());
                f92235f = new WeakReference(auox);
            }
        }
        return auox;
    }

    /* renamed from: b */
    public static Map m77527b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sql_query_key", String.format("SELECT * FROM %s ORDER BY %s DESC", str, "__id__"));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aumv mo50784a(String str) {
        aumr aumr = this.f92237b;
        HashMap hashMap = new HashMap();
        hashMap.put("sql_query_key", String.format("SELECT * FROM %s WHERE _id = (SELECT MAX(_id) FROM %s WHERE %s = '%s')", "Trustlet", "Trustlet", aumv.f92108c.f92120a, str));
        List a = aumr.mo50675a(aumv.class, hashMap);
        aumv aumv = new aumv("-1", str);
        if (a.isEmpty()) {
            return aumv;
        }
        if (a.size() == 1) {
            return (aumv) a.get(0);
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Error, get more than one latest ");
        sb.append(str);
        sb.append(" status models.");
        Log.e("Coffee-TrustStatusMonitor", sb.toString());
        return aumv;
    }

    /* renamed from: a */
    public final String mo50785a(String str, String str2) {
        aumr aumr = this.f92237b;
        HashMap hashMap = new HashMap();
        hashMap.put("sql_query_key", String.format("SELECT * FROM %s WHERE _id = (SELECT MAX(_id) FROM %s WHERE %s LIKE '%%%s%%' AND %s = '%s')", "Trustlet", "Trustlet", aumv.f92111h.f92120a, str2, aumv.f92108c.f92120a, str));
        List a = aumr.mo50675a(aumv.class, hashMap);
        if (a.size() == 1) {
            return (String) aumv.m77338a((String) ((aumv) a.get(0)).mo50671a(aumv.f92111h)).get("trustlet_source");
        }
        return null;
    }
}
