package p000;

/* renamed from: asag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asag implements asbm {

    /* renamed from: a */
    final /* synthetic */ String f88578a;

    /* renamed from: b */
    final /* synthetic */ int f88579b;

    /* renamed from: c */
    final /* synthetic */ asai f88580c;

    public asag(asai asai, String str, int i) {
        this.f88580c = asai;
        this.f88578a = str;
        this.f88579b = i;
    }

    /* renamed from: a */
    public final void mo48990a(Exception exc) {
        asai.f88581a.mo25417e("Error while fetching PSK from backup.", exc, new Object[0]);
        this.f88580c.mo48995a(this.f88578a);
    }

    /* renamed from: a */
    public final void mo48991a(String str) {
        if (this.f88580c.getActivity() == null) {
            return;
        }
        if (str != null) {
            asai asai = this.f88580c;
            asai.f88585c.mo48992a(this.f88578a, str, 4, this.f88579b, asai.f88584b.getCount());
            return;
        }
        this.f88580c.mo48995a(this.f88578a);
    }
}
