package p000;

import android.content.Context;

/* renamed from: auxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxe {

    /* renamed from: a */
    public static final aunx f92681a = new aunx("TrustAgent", "HomeFetcher");

    /* renamed from: b */
    public static final aemi f92682b;

    /* renamed from: c */
    public final String f92683c;

    /* renamed from: d */
    public final Context f92684d;

    /* renamed from: e */
    public final rkb f92685e;

    /* renamed from: f */
    public String f92686f;

    /* renamed from: g */
    public String f92687g;

    /* renamed from: h */
    public final aupn f92688h;

    /* renamed from: i */
    public final bmzi f92689i = bmzn.m108681a(auwx.f92676a);

    /* renamed from: j */
    private final auxc f92690j;

    /* renamed from: k */
    private final rjz f92691k;

    /* renamed from: l */
    private final rka f92692l;

    static {
        aemh aemh = new aemh();
        aemh.f63516b = "auth";
        f92682b = aemh.mo34328a();
    }

    public auxe(Context context, String str, auxc auxc, aupn aupn) {
        rjy rjy = new rjy(context);
        rjy.mo24780a(aema.f63501a, f92682b);
        rjy.mo24778a(str);
        rkb b = rjy.mo24784b();
        sdo.m34959a(b);
        this.f92685e = b;
        sdo.m34959a(auxc);
        this.f92690j = auxc;
        sdo.m34977c(str);
        this.f92683c = str;
        this.f92688h = aupn;
        this.f92684d = context;
        auwy auwy = new auwy(this);
        this.f92691k = auwy;
        this.f92685e.mo24790a((rjz) auwy);
        auwz auwz = new auwz();
        this.f92692l = auwz;
        this.f92685e.mo24791a((rka) auwz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51004a() {
        this.f92685e.mo24796b(this.f92691k);
        this.f92685e.mo24797b(this.f92692l);
    }

    /* renamed from: b */
    public final void mo51006b() {
        mo51005a(false);
    }

    /* renamed from: c */
    public final void mo51007c() {
        f92681a.mo50711a("fetch home cancelled.", new Object[0]).mo50708c();
        mo51004a();
        this.f92685e.mo24803g();
    }

    /* renamed from: d */
    public final void mo51008d() {
        auxc auxc = this.f92690j;
        if (auxc != null) {
            auxc.mo51003a(new String[]{this.f92686f, this.f92687g, this.f92683c});
        }
    }

    /* renamed from: a */
    public final void mo51005a(boolean z) {
        String f = auxi.m78032f(this.f92683c);
        long currentTimeMillis = System.currentTimeMillis();
        long a = this.f92688h.mo50724a(f, 0);
        long a2 = chal.f188193a.mo6606a().mo84871a();
        long j = currentTimeMillis - a;
        if (!z && j < a2) {
            f92681a.mo50711a("return existing home address!", new Object[0]).mo50708c();
            this.f92686f = auxi.m78023a(this.f92683c, "Home", this.f92688h);
            mo51008d();
            return;
        }
        try {
            f92681a.mo50711a("fetch home address!", new Object[0]).mo50708c();
            this.f92685e.mo24801e();
        } catch (Exception e) {
            aunx aunx = f92681a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Exception when fetching home: ");
            sb.append(valueOf);
            aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        }
    }
}
