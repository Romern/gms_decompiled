package p000;

/* renamed from: auvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auvd implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bogq f92584a;

    /* renamed from: b */
    final /* synthetic */ String f92585b;

    /* renamed from: c */
    final /* synthetic */ int f92586c;

    /* renamed from: d */
    final /* synthetic */ int f92587d;

    /* renamed from: e */
    final /* synthetic */ auve f92588e;

    public auvd(auve auve, bogq bogq, String str, int i, int i2) {
        this.f92588e = auve;
        this.f92584a = bogq;
        this.f92585b = str;
        this.f92586c = i;
        this.f92587d = i2;
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
            this.f92588e.mo50968b(this.f92584a, this.f92585b, this.f92586c, this.f92587d);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        auve.f92589a.mo50710a("Failed to read preconditions for Onbody Promotion", th, new Object[0]).mo50709d();
    }
}
