package p000;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bdzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdzo {

    /* renamed from: a */
    static final ConcurrentHashMap f106698a = new ConcurrentHashMap();

    /* renamed from: b */
    public final bdym f106699b;

    /* renamed from: c */
    public final boolean f106700c = false;

    /* renamed from: d */
    public final beaa f106701d = new beaa(new bdzk(this));

    /* renamed from: e */
    private final String f106702e;

    public bdzo(bdym bdym, String str) {
        this.f106699b = bdym;
        this.f106702e = str;
    }

    /* renamed from: a */
    public static Map m91642a(beaf beaf) {
        boolean z;
        double d;
        String str;
        bxtx bxtx;
        HashMap a = bnmt.m109795a(beaf.f106731f.size() + 3);
        bxwc bxwc = beaf.f106731f;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            beag beag = (beag) bxwc.get(i);
            int i2 = beag.f106735b;
            int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == 0) {
                    a.put(beag.f106737d, Long.valueOf(i2 == 2 ? ((Long) beag.f106736c).longValue() : 0));
                } else if (i4 == 1) {
                    String str2 = beag.f106737d;
                    if (i2 == 3) {
                        z = ((Boolean) beag.f106736c).booleanValue();
                    } else {
                        z = false;
                    }
                    a.put(str2, Boolean.valueOf(z));
                } else if (i4 == 2) {
                    String str3 = beag.f106737d;
                    if (i2 == 4) {
                        d = ((Double) beag.f106736c).doubleValue();
                    } else {
                        d = 0.0d;
                    }
                    a.put(str3, Double.valueOf(d));
                } else if (i4 == 3) {
                    String str4 = beag.f106737d;
                    if (i2 == 5) {
                        str = (String) beag.f106736c;
                    } else {
                        str = "";
                    }
                    a.put(str4, str);
                } else if (i4 == 4) {
                    String str5 = beag.f106737d;
                    if (i2 == 6) {
                        bxtx = (bxtx) beag.f106736c;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    a.put(str5, bxtx.mo73780k());
                }
                i++;
            } else {
                throw null;
            }
        }
        a.put("__phenotype_server_token", beaf.f106729d);
        a.put("__phenotype_snapshot_token", beaf.f106727b);
        a.put("__phenotype_configuration_version", Long.valueOf(beaf.f106730e));
        return bnhe.m109413a(a);
    }

    /* renamed from: b */
    public final File mo58467b() {
        return new File(this.f106699b.f106636d.getDir("phenotype_file", 0), String.valueOf(this.f106702e).concat(".pb"));
    }

    /* renamed from: a */
    public final void mo58466a() {
        anef.m64089a(this.f106699b.f106636d).mo25236a(this.f106702e, "", "").mo50378a(this.f106699b.mo58441a(), bdzu.m91646a(new bdzn(this)));
    }
}
