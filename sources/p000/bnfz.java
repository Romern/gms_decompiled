package p000;

/* renamed from: bnfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfz extends bngc {

    /* renamed from: a */
    final /* synthetic */ bngd f131570a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnfz(bngd bngd) {
        super(bngd);
        this.f131570a = bngd;
    }

    /* renamed from: a */
    public final Object mo67571a(int i) {
        return this.f131570a.f131578a[i];
    }

    public final boolean contains(Object obj) {
        return this.f131570a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int a = bngg.m109305a(obj);
        int a2 = this.f131570a.mo67596a(obj, a);
        if (a2 == -1) {
            return false;
        }
        this.f131570a.mo67599a(a2, a);
        return true;
    }
}
