package p000;

/* renamed from: bczl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczl {

    /* renamed from: a */
    private bngx f105186a;

    /* renamed from: b */
    private Integer f105187b;

    /* renamed from: a */
    public final bczo mo57788a() {
        String str = this.f105186a == null ? " buttons" : "";
        if (this.f105187b == null) {
            str = str.concat(" orientation");
        }
        if (str.isEmpty()) {
            return new bcyr(this.f105186a, this.f105187b.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57789a(int i) {
        this.f105187b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57790a(bngx bngx) {
        if (bngx != null) {
            this.f105186a = bngx;
            return;
        }
        throw new NullPointerException("Null buttons");
    }
}
