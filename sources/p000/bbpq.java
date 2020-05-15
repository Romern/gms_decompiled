package p000;

/* renamed from: bbpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbpq {

    /* renamed from: a */
    public int f103039a;

    /* renamed from: a */
    public final bbpr mo56337a() {
        String str = this.f103039a == 0 ? " status" : "";
        if (str.isEmpty()) {
            return new bbpc(this.f103039a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }
}
