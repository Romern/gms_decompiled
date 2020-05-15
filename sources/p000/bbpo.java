package p000;

/* renamed from: bbpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbpo {

    /* renamed from: a */
    public int f103038a;

    /* renamed from: a */
    public final bbpp mo56336a() {
        String str = this.f103038a == 0 ? " status" : "";
        if (str.isEmpty()) {
            return new bbpb(this.f103038a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }
}
