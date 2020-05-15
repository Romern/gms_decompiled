package p000;

/* renamed from: bcup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcup {

    /* renamed from: a */
    private bcuo f104954a;

    /* renamed from: a */
    public final bcuq mo57569a() {
        String str = this.f104954a == null ? " content" : "";
        if (str.isEmpty()) {
            return new bcsa(this.f104954a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57570a(bcuo bcuo) {
        if (bcuo != null) {
            this.f104954a = bcuo;
            return;
        }
        throw new NullPointerException("Null content");
    }
}
