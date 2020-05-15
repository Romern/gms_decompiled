package p000;

/* renamed from: bnhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhw extends bnit {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final /* synthetic */ bnhy f131649a;

    public bnhw(bnhy bnhy) {
        this.f131649a = bnhy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo67716a(int i) {
        return this.f131649a.mo67745a(i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof bnno) {
            bnno bnno = (bnno) obj;
            if (bnno.mo68118a() <= 0 || this.f131649a.mo67285a(bnno.f131866a) != bnno.mo68118a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return this.f131649a.mo67640h();
    }

    public final int hashCode() {
        return this.f131649a.hashCode();
    }

    public final int size() {
        return this.f131649a.mo67748i().size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnhx(this.f131649a);
    }
}
