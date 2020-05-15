package p000;

/* renamed from: bchr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bchr {

    /* renamed from: a */
    public bcht f104181a;

    /* renamed from: b */
    private String f104182b;

    /* renamed from: a */
    public final bchu mo56897a() {
        String str = this.f104182b == null ? " pushId" : "";
        if (this.f104181a == null) {
            str = str.concat(" oneOfType");
        }
        if (str.isEmpty()) {
            return new bcgx(this.f104182b, this.f104181a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56898a(String str) {
        if (str != null) {
            this.f104182b = str;
            return;
        }
        throw new NullPointerException("Null pushId");
    }
}
