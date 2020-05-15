package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: bknd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bknd implements bknj {

    /* renamed from: a */
    public final bkpj f124920a;

    /* renamed from: b */
    private final String f124921b;

    /* renamed from: c */
    private final String f124922c;

    /* renamed from: d */
    private final String f124923d;

    /* renamed from: e */
    private final bkub f124924e = new bkub();

    /* renamed from: f */
    private final bkna f124925f;

    /* renamed from: g */
    private final bkox f124926g;

    /* renamed from: h */
    private final bkoi f124927h;

    public bknd(String str, String str2, String str3, bknk bknk, bkna bkna, bkox bkox, bkpi bkpi) {
        this.f124921b = str;
        this.f124922c = str2;
        this.f124923d = str3;
        this.f124925f = bkna;
        this.f124926g = bkox;
        this.f124920a = bkpi.mo28477a(new bkpn());
        this.f124927h = new bknb(bknk);
    }

    /* renamed from: a */
    public final bkoh mo66133a(String str, String str2) {
        bkoh bkoh = new bkoh();
        String str3 = this.f124921b;
        if (!str3.endsWith("/")) {
            bkoh.f125001a = String.valueOf(str3).concat("/");
        } else {
            bkoh.f125001a = str3;
        }
        bkoh.mo66165a("rctype", this.f124922c);
        bkoh.mo66165a("rcver", this.f124923d);
        bkoh.mo66165a("id", str);
        if (str2 != null) {
            bkoh.mo66165a("sid", str2);
        }
        bkoh.mo66164a(this.f124927h);
        return bkoh;
    }

    /* renamed from: b */
    public final bknp mo66138b(String str, String str2) {
        return new bkni(this, str, str2);
    }

    /* renamed from: a */
    public final bkov mo66134a(bkpc bkpc) {
        return ((bkpg) this.f124926g).mo66191b(bkpc);
    }

    /* renamed from: a */
    public final void mo66135a(int i) {
        if (i == 0) {
            return;
        }
        if (i == 401) {
            this.f124925f.mo28453e("The OAuth token must be refreshed.");
        } else if (i == 423) {
            this.f124925f.mo28449a("A different session already created the file.");
        } else if (i == 403) {
            this.f124925f.mo28451c("Access denied to file.");
        } else if (i != 404) {
            bkna bkna = this.f124925f;
            StringBuilder sb = new StringBuilder(51);
            sb.append("Server returned unexpected HTTP status: ");
            sb.append(i);
            bkna.mo28452d(sb.toString());
        } else {
            this.f124925f.mo28450b("File not found.");
        }
    }

    /* renamed from: a */
    public final void mo66136a(String str, bknm bknm) {
        mo66137a("gs", mo66133a(str, (String) null).mo66163a(), Collections.emptyMap(), null, bknm, this.f124924e);
    }

    /* renamed from: a */
    public final void mo66137a(String str, bkoj bkoj, Map map, String str2, bknm bknm, bkte bkte) {
        bkpb bkpb;
        if (str2 == null) {
            bkpb = bkpb.GET;
        } else {
            bkpb = bkpb.f125049b;
        }
        bkoz bkoz = new bkoz(((bkpg) this.f124926g).mo66191b(bkpc.m106264a(bkoj, str, map, bkpb, str2)));
        bkoz.f125041c = new bknc(this, bkte, bknm);
        bkoz.mo66184a();
    }
}
