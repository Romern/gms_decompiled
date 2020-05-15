package p000;

import java.util.List;

/* renamed from: fqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fqm extends acpn {

    /* renamed from: a */
    final /* synthetic */ String f17133a;

    /* renamed from: b */
    final /* synthetic */ abyv f17134b;

    /* renamed from: c */
    final /* synthetic */ List f17135c;

    /* renamed from: d */
    final /* synthetic */ List f17136d;

    /* renamed from: e */
    final /* synthetic */ fqq f17137e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fqm(fqq fqq, bqbd bqbd, String str, String str2, abyv abyv, List list, List list2) {
        super(bqbd, 2, str);
        this.f17137e = fqq;
        this.f17133a = str2;
        this.f17134b = abyv;
        this.f17135c = list;
        this.f17136d = list2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abzm b = this.f17137e.f17145a.mo32314b();
        String str = this.f17133a;
        if (str != null) {
            acak acak = new acak(this.f17134b.f58761b, str);
            abzr e = b.mo32545e(acak);
            if (e == null) {
                return null;
            }
            if (!e.mo32557a(1)) {
                String b2 = abzr.m48714b(1);
                String d = e.mo32561d();
                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 36 + String.valueOf(d).length());
                sb.append("unregister: cannot ");
                sb.append(b2);
                sb.append(" when previously ");
                sb.append(d);
                absg.m48191b(sb.toString());
                this.f17135c.add(false);
                return null;
            }
            this.f17136d.add(((absr) e.mo32560c()).f58141f);
            this.f17135c.add(Boolean.valueOf(this.f17137e.f17145a.mo32313a(acak, this.f17134b)));
            return null;
        }
        bnre i = b.mo32524a(this.f17134b).listIterator();
        while (i.hasNext()) {
            acak acak2 = (acak) i.next();
            abzr e2 = b.mo32545e(acak2);
            if (e2 != null && e2.mo32557a(1)) {
                if (abzm.m48653a((absr) e2.mo32560c())) {
                    this.f17136d.add(((absr) e2.mo32560c()).f58141f);
                }
                this.f17135c.add(Boolean.valueOf(this.f17137e.f17145a.mo32313a(acak2, this.f17134b)));
            }
        }
        return null;
    }
}
