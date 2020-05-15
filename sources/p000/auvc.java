package p000;

/* renamed from: auvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auvc implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bogq f92579a;

    /* renamed from: b */
    final /* synthetic */ String f92580b;

    /* renamed from: c */
    final /* synthetic */ int f92581c;

    /* renamed from: d */
    final /* synthetic */ int f92582d;

    /* renamed from: e */
    final /* synthetic */ auve f92583e;

    public auvc(auve auve, bogq bogq, String str, int i, int i2) {
        this.f92583e = auve;
        this.f92579a = bogq;
        this.f92580b = str;
        this.f92581c = i;
        this.f92582d = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (!bool.booleanValue()) {
            auve.f92589a.mo50711a("Precondition not met, abort showing notification.", new Object[0]);
        } else {
            this.f92583e.mo50968b(this.f92579a, this.f92580b, this.f92581c, this.f92582d);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        auve.f92589a.mo50710a("Failed to read preconditions for Onbody Promotion", th, new Object[0]).mo50709d();
    }
}
