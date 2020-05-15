package p000;

/* renamed from: bcsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsw {

    /* renamed from: a */
    private bctn f104828a;

    /* renamed from: b */
    private String f104829b;

    /* renamed from: a */
    public final bcsx mo57484a() {
        String str = this.f104828a == null ? " webViewHeader" : "";
        if (this.f104829b == null) {
            str = str.concat(" url");
        }
        if (str.isEmpty()) {
            return new bcrp(this.f104828a, this.f104829b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57485a(bctn bctn) {
        if (bctn != null) {
            this.f104828a = bctn;
            return;
        }
        throw new NullPointerException("Null webViewHeader");
    }

    /* renamed from: a */
    public final void mo57486a(String str) {
        if (str != null) {
            this.f104829b = str;
            return;
        }
        throw new NullPointerException("Null url");
    }
}
