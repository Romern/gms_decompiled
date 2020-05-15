package p000;

/* renamed from: caxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class caxh implements ciqr {

    /* renamed from: a */
    protected final ciqb f176307a = new ciqb(this.f176309c.f176326b.mo74997df());

    /* renamed from: b */
    protected boolean f176308b;

    /* renamed from: c */
    final /* synthetic */ caxn f176309c;

    public caxh(caxn caxn) {
        this.f176309c = caxn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo75040b() {
        int i = this.f176309c.f176328d;
        if (i == 5) {
            caxn.m127472a(this.f176307a);
            caxn caxn = this.f176309c;
            caxn.f176328d = 6;
            cayf cayf = caxn.f176325a;
            if (cayf != null) {
                cayf.mo75072a(caxn);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo75041c() {
        caxn caxn = this.f176309c;
        if (caxn.f176328d != 6) {
            caxn.f176328d = 6;
            cayf cayf = caxn.f176325a;
            if (cayf != null) {
                cayf.mo75077d();
                caxn caxn2 = this.f176309c;
                caxn2.f176325a.mo75072a(caxn2);
            }
        }
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f176307a;
    }
}
