package p000;

/* renamed from: bnga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnga extends bngc {

    /* renamed from: a */
    final /* synthetic */ bngd f131571a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnga(bngd bngd) {
        super(bngd);
        this.f131571a = bngd;
    }

    /* renamed from: a */
    public final Object mo67571a(int i) {
        return this.f131571a.f131579b[i];
    }

    public final boolean contains(Object obj) {
        return this.f131571a.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int a = bngg.m109305a(obj);
        int b = this.f131571a.mo67602b(obj, a);
        if (b == -1) {
            return false;
        }
        this.f131571a.mo67604b(b, a);
        return true;
    }
}
