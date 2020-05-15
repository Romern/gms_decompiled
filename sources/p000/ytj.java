package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ytj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ytj {

    /* renamed from: a */
    public static final srn f54582a = zvt.m46581a();

    /* renamed from: b */
    public static final bmyv f54583b = bmyx.m108640a('|').mo66924c("=");

    /* renamed from: c */
    public static final bmyx f54584c = bmyx.m108640a(',').mo66920b();

    /* renamed from: d */
    public final yuw f54585d = yuq.m44881a(ytf.f54578a, ytg.f54579a);

    /* renamed from: e */
    public final yuw f54586e = yuq.m44881a(yth.f54580a, yti.f54581a);

    public ytj() {
        this.f54585d.mo30787a();
        this.f54586e.mo30787a();
    }

    /* renamed from: b */
    public static bnhe m44770b(String str) {
        Iterator it;
        bngx a;
        caah caah;
        caal caal;
        if (!str.isEmpty()) {
            bnha h = bnhe.m109414h();
            try {
                Iterator it2 = f54583b.mo66915a(str).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    bngs j = bngx.m109377j();
                    Iterator it3 = f54584c.mo66917a().mo66918a((CharSequence) str3).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            String str4 = (String) it3.next();
                            String[] split = str4.split("-");
                            it = it2;
                            if (split.length != 2) {
                                bnsl bnsl = (bnsl) f54582a.mo68387b();
                                bnsl.mo68432a("ytj", "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("Un-recognized field format: %s", str4);
                                caal = null;
                            } else {
                                int a2 = caak.m126415a(Integer.parseInt(split[1]));
                                if (a2 == 0) {
                                    bnsl bnsl2 = (bnsl) f54582a.mo68387b();
                                    bnsl2.mo68432a("ytj", "d", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68420a("Unknown field format: %s", split[1]);
                                    caal = null;
                                } else {
                                    caal = bzzj.m126351a(split[0], a2);
                                }
                            }
                            if (caal == null) {
                                bnsl bnsl3 = (bnsl) f54582a.mo68387b();
                                bnsl3.mo68432a("ytj", "c", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68420a("Cannot construct field: %s", str4);
                                a = bngx.m109376e();
                                break;
                            }
                            j.mo67668c(caal);
                            it2 = it;
                        } else {
                            it = it2;
                            a = j.mo67664a();
                            if (a.isEmpty()) {
                                bnsl bnsl4 = (bnsl) f54582a.mo68387b();
                                bnsl4.mo68432a("ytj", "c", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl4.mo68405a("No fields found");
                            }
                        }
                    }
                    if (a.isEmpty()) {
                        bnsl bnsl5 = (bnsl) f54582a.mo68387b();
                        bnsl5.mo68432a("ytj", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68420a("DataType creation failed due to bad fields: %s", str3);
                        caah = null;
                    } else {
                        caah = bzzn.m126361a(str2, a);
                    }
                    if (caah != null) {
                        h.mo67695b(caah.f172336b, caah);
                        it2 = it;
                    } else {
                        bnsl bnsl6 = (bnsl) f54582a.mo68387b();
                        bnsl6.mo68432a("ytj", "b", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68420a("Error creating datatype: %s.", entry.getKey());
                        throw new IllegalArgumentException();
                    }
                }
                return h.mo67618b();
            } catch (IllegalArgumentException e) {
            }
        }
        return bnoj.f131912b;
    }

    /* renamed from: c */
    private static bngx m44771c(String str) {
        bngs j = bngx.m109377j();
        for (String str2 : f54584c.mo66917a().mo66918a((CharSequence) str)) {
            String[] split = str2.split("-");
            caal caal = null;
            if (split.length != 2) {
                bnsl bnsl = (bnsl) f54582a.mo68387b();
                bnsl.mo68432a("ytj", "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Un-recognized field format: %s", str2);
            } else {
                int a = caak.m126415a(Integer.parseInt(split[1]));
                if (a == 0) {
                    bnsl bnsl2 = (bnsl) f54582a.mo68387b();
                    bnsl2.mo68432a("ytj", "d", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Unknown field format: %s", split[1]);
                } else {
                    caal = bzzj.m126351a(split[0], a);
                }
            }
            if (caal == null) {
                bnsl bnsl3 = (bnsl) f54582a.mo68387b();
                bnsl3.mo68432a("ytj", "c", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Cannot construct field: %s", str2);
                return bngx.m109376e();
            }
            j.mo67668c(caal);
        }
        bngx a2 = j.mo67664a();
        if (a2.isEmpty()) {
            bnsl bnsl4 = (bnsl) f54582a.mo68387b();
            bnsl4.mo68432a("ytj", "c", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("No fields found");
        }
        return a2;
    }

    /* renamed from: d */
    private static caal m44772d(String str) {
        String[] split = str.split("-");
        if (split.length != 2) {
            bnsl bnsl = (bnsl) f54582a.mo68387b();
            bnsl.mo68432a("ytj", "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Un-recognized field format: %s", str);
            return null;
        }
        int a = caak.m126415a(Integer.parseInt(split[1]));
        if (a != 0) {
            return bzzj.m126351a(split[0], a);
        }
        bnsl bnsl2 = (bnsl) f54582a.mo68387b();
        bnsl2.mo68432a("ytj", "d", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Unknown field format: %s", split[1]);
        return null;
    }

    /* renamed from: a */
    private static caah m44769a(String str, String str2) {
        bngx a;
        caal caal;
        bngs j = bngx.m109377j();
        Iterator it = f54584c.mo66917a().mo66918a((CharSequence) str2).iterator();
        while (true) {
            if (it.hasNext()) {
                String str3 = (String) it.next();
                String[] split = str3.split("-");
                if (split.length != 2) {
                    bnsl bnsl = (bnsl) f54582a.mo68387b();
                    bnsl.mo68432a("ytj", "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Un-recognized field format: %s", str3);
                    caal = null;
                } else {
                    int a2 = caak.m126415a(Integer.parseInt(split[1]));
                    if (a2 == 0) {
                        bnsl bnsl2 = (bnsl) f54582a.mo68387b();
                        bnsl2.mo68432a("ytj", "d", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Unknown field format: %s", split[1]);
                        caal = null;
                    } else {
                        caal = bzzj.m126351a(split[0], a2);
                    }
                }
                if (caal == null) {
                    bnsl bnsl3 = (bnsl) f54582a.mo68387b();
                    bnsl3.mo68432a("ytj", "c", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Cannot construct field: %s", str3);
                    a = bngx.m109376e();
                    break;
                }
                j.mo67668c(caal);
            } else {
                a = j.mo67664a();
                if (a.isEmpty()) {
                    bnsl bnsl4 = (bnsl) f54582a.mo68387b();
                    bnsl4.mo68432a("ytj", "c", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("No fields found");
                }
            }
        }
        if (!a.isEmpty()) {
            return bzzn.m126361a(str, a);
        }
        bnsl bnsl5 = (bnsl) f54582a.mo68387b();
        bnsl5.mo68432a("ytj", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68420a("DataType creation failed due to bad fields: %s", str2);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo30747a(String str) {
        return ((bnig) this.f54585d.mo30787a()).mo67271d(str);
    }
}
