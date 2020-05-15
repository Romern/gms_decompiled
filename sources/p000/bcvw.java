package p000;

/* renamed from: bcvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcvw {

    /* renamed from: a */
    private String f105038a;

    /* renamed from: a */
    public final bcvx mo57613a() {
        String str = this.f105038a == null ? " filename" : "";
        if (str.isEmpty()) {
            return new bcvu(this.f105038a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57614a(String str) {
        if (str != null) {
            this.f105038a = str;
            return;
        }
        throw new NullPointerException("Null filename");
    }
}
