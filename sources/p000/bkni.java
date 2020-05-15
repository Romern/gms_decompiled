package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: bkni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkni implements bknp {

    /* renamed from: c */
    private static final Map f124937c = Collections.emptyMap();

    /* renamed from: d */
    private static final bknm f124938d = new bknf();

    /* renamed from: a */
    public final bknj f124939a;

    /* renamed from: b */
    public bkpk f124940b = bkpk.SUCCESS;

    /* renamed from: e */
    private final bkto f124941e;

    /* renamed from: f */
    private final bkuv f124942f = new bkuv();

    /* renamed from: g */
    private final Queue f124943g = new LinkedList();

    /* renamed from: h */
    private final bkoj f124944h;

    /* renamed from: i */
    private final bkoj f124945i;

    /* renamed from: j */
    private boolean f124946j = true;

    public bkni(bknj bknj, String str, String str2) {
        bkum bkum = new bkum();
        this.f124941e = new bkto(false);
        new bkuz(bkum, false);
        this.f124939a = bknj;
        this.f124944h = bknj.mo66133a(str, str2).mo66163a();
        this.f124945i = bknj.mo66133a(str, (String) null).mo66163a();
    }

    /* renamed from: a */
    private final synchronized void m106194a() {
        if (!this.f124946j) {
            while (!this.f124943g.isEmpty()) {
                ((bknd) this.f124939a).f124920a.mo28476a(this.f124940b, (Runnable) this.f124943g.poll());
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo66131b() {
        this.f124946j = true;
        this.f124939a.mo66137a("leave", this.f124944h, f124937c, null, f124938d, null);
    }

    /* renamed from: c */
    public final synchronized void mo66132c() {
        this.f124946j = false;
        m106194a();
    }

    /* renamed from: a */
    private final synchronized void m106195a(String str, bkoj bkoj, Map map, String str2, bknm bknm, bkte bkte) {
        this.f124943g.add(new bknh(this, str, bkoj, map, str2, bknm, bkte));
        m106194a();
    }

    /* renamed from: a */
    public final void mo66140a(int i, int i2, bknm bknm) {
        HashMap hashMap = new HashMap();
        hashMap.put("startRev", Integer.toString(i));
        hashMap.put("includeType", "false");
        if (i2 >= 0) {
            hashMap.put("endRev", Integer.toString(i2));
        }
        m106195a("catchup", this.f124945i, hashMap, null, bknm, this.f124941e);
    }

    /* renamed from: a */
    public final void mo66141a(bkpy bkpy, bknm bknm) {
        StringBuilder sb = new StringBuilder();
        this.f124942f.mo66346a(new bkxh(sb), bkpy);
        m106195a("save", this.f124944h, f124937c, sb.toString(), bknm, null);
    }
}
