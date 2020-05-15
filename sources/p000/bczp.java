package p000;

/* renamed from: bczp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczp {

    /* renamed from: a */
    private bngx f105196a;

    /* renamed from: a */
    public final bczq mo57799a() {
        String str = this.f105196a == null ? " components" : "";
        if (str.isEmpty()) {
            return new bcyt(this.f105196a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57800a(bngx bngx) {
        if (bngx != null) {
            this.f105196a = bngx;
            return;
        }
        throw new NullPointerException("Null components");
    }
}
