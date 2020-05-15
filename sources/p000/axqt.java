package p000;

/* renamed from: axqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqt implements axop {

    /* renamed from: a */
    private final int f96278a;

    /* renamed from: b */
    private final axoq f96279b;

    public axqt(axop axop) {
        this.f96278a = axop.mo53316b();
        this.f96279b = (axoq) axop.mo53315a().mo7556bF();
    }

    /* renamed from: a */
    public final axoq mo53315a() {
        return this.f96279b;
    }

    /* renamed from: b */
    public final int mo53316b() {
        return this.f96278a;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final String toString() {
        int i = this.f96278a;
        String str = i == 1 ? "changed" : i != 2 ? "unknown" : "deleted";
        String valueOf = String.valueOf(this.f96279b);
        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(valueOf).length());
        sb.append("DataEventEntity{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
