package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: bqca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqca {

    /* renamed from: a */
    public static final bmwx f140448a = bmwk.f131140a.mo66833a(bmwr.f131148a.mo66832a()).mo66833a(bmwx.m108502c(' ')).mo66833a(bmwx.m108505g("()<>@,;:\\\"/[]?="));

    /* renamed from: b */
    public static final bqca f140449b = m112551a("text", "html");

    /* renamed from: e */
    private static final bngz f140450e;

    /* renamed from: f */
    private static final bmwx f140451f = bmwk.f131140a.mo66833a(bmwx.m108505g("\"\\\r"));

    /* renamed from: g */
    private static final bmwx f140452g = bmwx.m108504f(" \t\r\n");

    /* renamed from: h */
    private static final Map f140453h = bnmt.getNewHashMap();

    /* renamed from: m */
    private static final bmxq f140454m = bmxr.m108544a("; ").mo66879b("=");

    /* renamed from: c */
    public final bngz f140455c;

    /* renamed from: d */
    public bmxv f140456d;

    /* renamed from: i */
    private final String f140457i;

    /* renamed from: j */
    private final String f140458j;

    /* renamed from: k */
    private String f140459k;

    /* renamed from: l */
    private int f140460l;

    static {
        String a = bmwb.m108442a(bmwy.f131158c.name());
        bngy a2 = bngz.m109387a();
        a2.mo67690a("charset", a);
        f140450e = a2.mo67689a();
        m112555b("*", "*");
        m112555b("text", "*");
        m112555b("image", "*");
        m112555b("audio", "*");
        m112555b("video", "*");
        m112555b("application", "*");
        m112551a("text", "cache-manifest");
        m112551a("text", "css");
        m112551a("text", "csv");
        m112551a("text", "calendar");
        m112551a("text", "plain");
        m112551a("text", "javascript");
        m112551a("text", "tab-separated-values");
        m112551a("text", "vcard");
        m112551a("text", "vnd.wap.wml");
        m112551a("text", "xml");
        m112551a("text", "vtt");
        m112555b("image", "bmp");
        m112555b("image", "x-canon-crw");
        m112555b("image", "gif");
        m112555b("image", "vnd.microsoft.icon");
        m112555b("image", "jpeg");
        m112555b("image", "png");
        m112555b("image", "vnd.adobe.photoshop");
        m112551a("image", "svg+xml");
        m112555b("image", "tiff");
        m112555b("image", "webp");
        m112555b("image", "heif");
        m112555b("image", "jp2");
        m112555b("audio", "mp4");
        m112555b("audio", "mpeg");
        m112555b("audio", "ogg");
        m112555b("audio", "webm");
        m112555b("audio", "l16");
        m112555b("audio", "l24");
        m112555b("audio", "basic");
        m112555b("audio", "aac");
        m112555b("audio", "vorbis");
        m112555b("audio", "x-ms-wma");
        m112555b("audio", "x-ms-wax");
        m112555b("audio", "vnd.rn-realaudio");
        m112555b("audio", "vnd.wave");
        m112555b("video", "mp4");
        m112555b("video", "mpeg");
        m112555b("video", "ogg");
        m112555b("video", "quicktime");
        m112555b("video", "webm");
        m112555b("video", "x-ms-wmv");
        m112555b("video", "x-flv");
        m112555b("video", "3gpp");
        m112555b("video", "3gpp2");
        m112551a("application", "xml");
        m112551a("application", "atom+xml");
        m112555b("application", "x-bzip2");
        m112551a("application", "dart");
        m112555b("application", "vnd.apple.pkpass");
        m112555b("application", "vnd.ms-fontobject");
        m112555b("application", "epub+zip");
        m112555b("application", "x-www-form-urlencoded");
        m112555b("application", "pkcs12");
        m112555b("application", "binary");
        m112555b("application", "geo+json");
        m112555b("application", "x-gzip");
        m112555b("application", "hal+json");
        m112551a("application", "javascript");
        m112555b("application", "jose");
        m112555b("application", "jose+json");
        m112551a("application", "json");
        m112551a("application", "manifest+json");
        m112555b("application", "vnd.google-earth.kml+xml");
        m112555b("application", "vnd.google-earth.kmz");
        m112555b("application", "mbox");
        m112555b("application", "x-apple-aspen-config");
        m112555b("application", "vnd.ms-excel");
        m112555b("application", "vnd.ms-outlook");
        m112555b("application", "vnd.ms-powerpoint");
        m112555b("application", "msword");
        m112555b("application", "dash+xml");
        m112555b("application", "wasm");
        m112555b("application", "x-nacl");
        m112555b("application", "x-pnacl");
        m112555b("application", "octet-stream");
        m112555b("application", "ogg");
        m112555b("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        m112555b("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        m112555b("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        m112555b("application", "vnd.oasis.opendocument.graphics");
        m112555b("application", "vnd.oasis.opendocument.presentation");
        m112555b("application", "vnd.oasis.opendocument.spreadsheet");
        m112555b("application", "vnd.oasis.opendocument.text");
        m112551a("application", "opensearchdescription+xml");
        m112555b("application", "pdf");
        m112555b("application", "postscript");
        m112555b("application", "protobuf");
        m112551a("application", "rdf+xml");
        m112551a("application", "rtf");
        m112555b("application", "font-sfnt");
        m112555b("application", "x-shockwave-flash");
        m112555b("application", "vnd.sketchup.skp");
        m112551a("application", "soap+xml");
        m112555b("application", "x-tar");
        m112555b("application", "font-woff");
        m112555b("application", "font-woff2");
        m112551a("application", "xhtml+xml");
        m112551a("application", "xrd+xml");
        m112555b("application", "zip");
    }

    private bqca(String str, String str2, bngz bngz) {
        this.f140457i = str;
        this.f140458j = str2;
        this.f140455c = bngz;
    }

    /* renamed from: a */
    public static bqca m112550a(String str) {
        boolean z;
        String str2;
        bmxy.m108581a(str);
        bqbz bqbz = new bqbz(str);
        try {
            String b = bqbz.mo69019b(f140448a);
            bqbz.mo69018a('/');
            String b2 = bqbz.mo69019b(f140448a);
            bngy a = bngz.m109387a();
            while (true) {
                z = true;
                if (!bqbz.mo69020b()) {
                    break;
                }
                bqbz.mo69017a(f140452g);
                bqbz.mo69018a(';');
                bqbz.mo69017a(f140452g);
                String b3 = bqbz.mo69019b(f140448a);
                bqbz.mo69018a('=');
                if (bqbz.mo69016a() == '\"') {
                    bqbz.mo69018a('\"');
                    StringBuilder sb = new StringBuilder();
                    while (bqbz.mo69016a() != '\"') {
                        if (bqbz.mo69016a() != '\\') {
                            sb.append(bqbz.mo69019b(f140451f));
                        } else {
                            bqbz.mo69018a('\\');
                            bmwk bmwk = bmwk.f131140a;
                            bmxy.m108600b(bqbz.mo69020b());
                            char a2 = bqbz.mo69016a();
                            bmxy.m108600b(bmwk.mo66828a(a2));
                            bqbz.f140447b++;
                            sb.append(a2);
                        }
                    }
                    str2 = sb.toString();
                    bqbz.mo69018a('\"');
                } else {
                    str2 = bqbz.mo69019b(f140448a);
                }
                a.mo67690a(b3, str2);
            }
            bngz a3 = a.mo67689a();
            bmxy.m108581a(b);
            bmxy.m108581a(b2);
            bmxy.m108581a(a3);
            String b4 = m112554b(b);
            String b5 = m112554b(b2);
            if ("*".equals(b4)) {
                if (!"*".equals(b5)) {
                    z = false;
                }
            }
            bmxy.m108589a(z, "A wildcard type cannot be used with a non-wildcard subtype");
            bngy a4 = bngz.m109387a();
            for (Map.Entry entry : a3.mo67315n()) {
                String b6 = m112554b((String) entry.getKey());
                String str3 = (String) entry.getValue();
                bmxy.m108581a(str3);
                bmxy.m108596a(bmwk.f131140a.mo66835b(str3), "parameter values must be ASCII: %s", str3);
                if ("charset".equals(b6)) {
                    str3 = bmwb.m108442a(str3);
                }
                a4.mo67690a(b6, str3);
            }
            bqca bqca = new bqca(b4, b5, a4.mo67689a());
            return (bqca) bmxu.m108565a((bqca) f140453h.get(bqca), bqca);
        } catch (IllegalStateException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 18);
            sb2.append("Could not parse '");
            sb2.append(str);
            sb2.append("'");
            throw new IllegalArgumentException(sb2.toString(), e);
        }
    }

    /* renamed from: b */
    private static String m112554b(String str) {
        bmxy.m108588a(f140448a.mo66835b(str));
        bmxy.m108588a(!str.isEmpty());
        return bmwb.m108442a(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqca) {
            bqca bqca = (bqca) obj;
            return this.f140457i.equals(bqca.f140457i) && this.f140458j.equals(bqca.f140458j) && m112552a().equals(bqca.m112552a());
        }
    }

    public final int hashCode() {
        int i = this.f140460l;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(new Object[]{this.f140457i, this.f140458j, m112552a()});
        this.f140460l = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.f140459k;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f140457i);
        sb.append('/');
        sb.append(this.f140458j);
        if (!this.f140455c.mo67314m()) {
            sb.append("; ");
            bngz bngz = this.f140455c;
            bqby bqby = new bqby();
            bmxy.m108581a(bqby);
            f140454m.mo66872a(sb, new bnnj(bngz, bnmt.m109792a(bqby)).mo67315n());
        }
        String sb2 = sb.toString();
        this.f140459k = sb2;
        return sb2;
    }

    /* renamed from: b */
    private static void m112555b(String str, String str2) {
        bqca bqca = new bqca(str, str2, bnfb.f131552a);
        m112553a(bqca);
        bqca.f140456d = bmvz.f131120a;
    }

    /* renamed from: a */
    private static bqca m112551a(String str, String str2) {
        bqca bqca = new bqca(str, str2, f140450e);
        m112553a(bqca);
        bqca.f140456d = bmxv.m108566b(bmwy.f131158c);
        return bqca;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmt.a(java.util.Map, bmxj):java.util.Map
     arg types: [bnhe, bqbx]
     candidates:
      bnmt.a(bnmk, java.lang.Object):bmxj
      bnmt.a(java.lang.Iterable, bmxj):bnhe
      bnmt.a(java.util.Map, java.lang.Object):java.lang.Object
      bnmt.a(java.util.Set, bmxj):java.util.Iterator
      bnmt.a(java.lang.Object, java.lang.Object):java.util.Map$Entry
      bnmt.a(java.util.Map, bnmk):java.util.Map
      bnmt.a(java.util.Map, bmxj):java.util.Map */
    /* renamed from: a */
    private final Map m112552a() {
        return bnmt.m109799a((Map) ((bnht) this.f140455c).f131642b, (bmxj) new bqbx());
    }

    /* renamed from: a */
    private static void m112553a(bqca bqca) {
        f140453h.put(bqca, bqca);
    }
}
