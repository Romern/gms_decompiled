package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fil extends fki implements fjg {

    /* renamed from: a */
    private static DecimalFormat f16660a;

    /* renamed from: b */
    private final fkm f16661b;

    /* renamed from: c */
    private final String f16662c;

    /* renamed from: e */
    private final Uri f16663e;

    /* renamed from: a */
    public static Uri m11754a(String str) {
        sdo.m34977c(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fil.a(java.util.Map, java.lang.String, boolean):void
     arg types: [java.util.HashMap, java.lang.String, boolean]
     candidates:
      fil.a(java.util.Map, java.lang.String, double):void
      fil.a(java.util.Map, java.lang.String, java.lang.String):void
      fki.a(java.lang.String, java.lang.Object, java.lang.Object):void
      fil.a(java.util.Map, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fil.a(java.util.Map, java.lang.String, boolean):void
     arg types: [java.util.HashMap, java.lang.String, int]
     candidates:
      fil.a(java.util.Map, java.lang.String, double):void
      fil.a(java.util.Map, java.lang.String, java.lang.String):void
      fki.a(java.lang.String, java.lang.Object, java.lang.Object):void
      fil.a(java.util.Map, java.lang.String, boolean):void */
    /* renamed from: b */
    public static Map m11760b(fiv fiv) {
        String str;
        HashMap hashMap = new HashMap();
        fjp fjp = (fjp) fiv.mo10873a(fjp.class);
        if (fjp != null) {
            for (Map.Entry entry : Collections.unmodifiableMap(fjp.f16743a).entrySet()) {
                Object value = entry.getValue();
                if (value == null) {
                    str = null;
                } else if (value instanceof String) {
                    str = (String) value;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    }
                } else if (value instanceof Double) {
                    Double d = (Double) value;
                    str = d.doubleValue() != 0.0d ? m11755a(d.doubleValue()) : null;
                } else {
                    str = value instanceof Boolean ? value != Boolean.FALSE ? "1" : null : String.valueOf(value);
                }
                if (str != null) {
                    hashMap.put((String) entry.getKey(), str);
                }
            }
        }
        fju fju = (fju) fiv.mo10873a(fju.class);
        if (fju != null) {
            m11758a(hashMap, "t", fju.f16750a);
            m11758a(hashMap, "cid", fju.f16751b);
            m11758a(hashMap, "uid", fju.f16752c);
            m11758a(hashMap, "sc", (String) null);
            m11756a(hashMap, "sf", 0.0d);
            m11759a((Map) hashMap, "ni", fju.f16755f);
            m11758a(hashMap, "adid", fju.f16753d);
            m11759a((Map) hashMap, "ate", fju.f16754e);
        }
        fjv fjv = (fjv) fiv.mo10873a(fjv.class);
        if (fjv != null) {
            m11758a(hashMap, "cd", (String) null);
            m11756a(hashMap, "a", (double) fjv.f16756a);
            m11758a(hashMap, "dr", (String) null);
        }
        if (((fjs) fiv.mo10873a(fjs.class)) != null) {
            m11758a(hashMap, "ec", (String) null);
            m11758a(hashMap, "ea", (String) null);
            m11758a(hashMap, "el", (String) null);
            m11756a(hashMap, "ev", 0.0d);
        }
        fjm fjm = (fjm) fiv.mo10873a(fjm.class);
        if (fjm != null) {
            m11758a(hashMap, "cn", fjm.f16731a);
            m11758a(hashMap, "cs", fjm.f16732b);
            m11758a(hashMap, "cm", fjm.f16733c);
            m11758a(hashMap, "ck", fjm.f16734d);
            m11758a(hashMap, "cc", fjm.f16735e);
            m11758a(hashMap, "ci", fjm.f16736f);
            m11758a(hashMap, "anid", fjm.f16737g);
            m11758a(hashMap, "gclid", fjm.f16738h);
            m11758a(hashMap, "dclid", fjm.f16739i);
            m11758a(hashMap, "aclid", fjm.f16740j);
        }
        if (((fjt) fiv.mo10873a(fjt.class)) != null) {
            m11758a(hashMap, "exd", (String) null);
            m11759a((Map) hashMap, "exf", false);
        }
        if (((fjw) fiv.mo10873a(fjw.class)) != null) {
            m11758a(hashMap, "sn", (String) null);
            m11758a(hashMap, "sa", (String) null);
            m11758a(hashMap, "st", (String) null);
        }
        if (((fjx) fiv.mo10873a(fjx.class)) != null) {
            m11758a(hashMap, "utv", (String) null);
            m11756a(hashMap, "utt", 0.0d);
            m11758a(hashMap, "utc", (String) null);
            m11758a(hashMap, "utl", (String) null);
        }
        fjn fjn = (fjn) fiv.mo10873a(fjn.class);
        if (fjn != null) {
            for (Map.Entry entry2 : Collections.unmodifiableMap(fjn.f16741a).entrySet()) {
                String a = fio.m11764a("cd", ((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, (String) entry2.getValue());
                }
            }
        }
        fjo fjo = (fjo) fiv.mo10873a(fjo.class);
        if (fjo != null) {
            for (Map.Entry entry3 : Collections.unmodifiableMap(fjo.f16742a).entrySet()) {
                String a2 = fio.m11764a("cm", ((Integer) entry3.getKey()).intValue());
                if (!TextUtils.isEmpty(a2)) {
                    hashMap.put(a2, m11755a(((Double) entry3.getValue()).doubleValue()));
                }
            }
        }
        fjr fjr = (fjr) fiv.mo10873a(fjr.class);
        if (fjr != null) {
            int i = 1;
            for (fjz fjz : Collections.unmodifiableList(fjr.f16748b)) {
                fio.m11764a("promo", i);
                hashMap.putAll(fjz.m11836a());
                i++;
            }
            int i2 = 1;
            for (fjy fjy : Collections.unmodifiableList(fjr.f16747a)) {
                fio.m11764a("pr", i2);
                hashMap.putAll(fjy.m11835a());
                i2++;
            }
            int i3 = 1;
            for (Map.Entry entry4 : fjr.f16749c.entrySet()) {
                String a3 = fio.m11764a("il", i3);
                int i4 = 1;
                for (fjy fjy2 : (List) entry4.getValue()) {
                    String valueOf = String.valueOf(a3);
                    String valueOf2 = String.valueOf(fio.m11763a(i4));
                    if (valueOf2.length() == 0) {
                        new String(valueOf);
                    } else {
                        valueOf.concat(valueOf2);
                    }
                    hashMap.putAll(fjy.m11835a());
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry4.getKey())) {
                    hashMap.put(String.valueOf(a3).concat("nm"), (String) entry4.getKey());
                }
                i3++;
            }
        }
        fjq fjq = (fjq) fiv.mo10873a(fjq.class);
        if (fjq != null) {
            m11758a(hashMap, "ul", fjq.f16744a);
            m11756a(hashMap, "sd", 0.0d);
            m11757a(hashMap, "sr", fjq.f16745b, fjq.f16746c);
            m11757a(hashMap, "vp", 0, 0);
        }
        fjl fjl = (fjl) fiv.mo10873a(fjl.class);
        if (fjl != null) {
            m11758a(hashMap, "an", fjl.f16727a);
            m11758a(hashMap, "aid", fjl.f16729c);
            m11758a(hashMap, "aiid", fjl.f16730d);
            m11758a(hashMap, "av", fjl.f16728b);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final Uri mo10851a() {
        return this.f16663e;
    }

    public fil(fkm fkm, String str) {
        super(fkm);
        sdo.m34977c(str);
        this.f16661b = fkm;
        this.f16662c = str;
        this.f16663e = m11754a(str);
    }

    /* renamed from: a */
    static String m11755a(double d) {
        if (f16660a == null) {
            f16660a = new DecimalFormat("0.######");
        }
        return f16660a.format(d);
    }

    /* renamed from: a */
    private static void m11756a(Map map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, m11755a(d));
        }
    }

    /* renamed from: a */
    private static void m11757a(Map map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            map.put(str, sb.toString());
        }
    }

    /* renamed from: a */
    private static void m11758a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m11759a(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: a */
    public final void mo10852a(fiv fiv) {
        sdo.m34959a(fiv);
        sdo.m34975b(fiv.f16684c, "Can't deliver not submitted measurement");
        sdo.m34973b("deliver should be called on worker thread");
        fiv a = fiv.mo10872a();
        fju fju = (fju) a.mo10875b(fju.class);
        if (TextUtils.isEmpty(fju.f16750a)) {
            mo10941g().mo11028a(m11760b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(fju.f16751b)) {
            mo10941g().mo11028a(m11760b(a), "Ignoring measurement without client id");
        } else {
            this.f16661b.mo10960d().mo10857c();
            if (fog.m12077a(0.0d, fju.f16751b)) {
                mo10929b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map b = m11760b(a);
            b.put("v", "1");
            b.put("_v", fkk.f16782b);
            b.put("tid", this.f16662c);
            if (!this.f16661b.mo10960d().f16674e) {
                HashMap hashMap = new HashMap();
                fog.m12075a(hashMap, "uid", fju.f16752c);
                fjl fjl = (fjl) fiv.mo10873a(fjl.class);
                if (fjl != null) {
                    fog.m12075a(hashMap, "an", fjl.f16727a);
                    fog.m12075a(hashMap, "aid", fjl.f16729c);
                    fog.m12075a(hashMap, "av", fjl.f16728b);
                    fog.m12075a(hashMap, "aiid", fjl.f16730d);
                }
                b.put("_s", String.valueOf(mo10946k().mo10919a(new fko(fju.f16751b, this.f16662c, !TextUtils.isEmpty(fju.f16753d), hashMap))));
                mo10946k().mo10921a(new fnl(mo10941g(), b, fiv.f16685d, true));
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : b.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
            mo10931c("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
        }
    }
}
