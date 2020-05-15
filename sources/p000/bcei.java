package p000;

/* renamed from: bcei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcei {

    /* renamed from: a */
    public String f104034a;

    /* renamed from: b */
    private bcen f104035b;

    /* renamed from: a */
    public final bcej mo56734a() {
        String str = this.f104034a == null ? " tag" : "";
        if (this.f104035b == null) {
            str = str.concat(" lighterRetryPolicy");
        }
        if (str.isEmpty()) {
            return new bcef(this.f104034a, this.f104035b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56735a(bcen bcen) {
        if (bcen != null) {
            this.f104035b = bcen;
            return;
        }
        throw new NullPointerException("Null lighterRetryPolicy");
    }
}
