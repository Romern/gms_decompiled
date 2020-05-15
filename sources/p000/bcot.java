package p000;

/* renamed from: bcot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcot {

    /* renamed from: a */
    private String f104646a;

    /* renamed from: b */
    private String f104647b;

    /* renamed from: a */
    public final bcou mo57109a() {
        String str = this.f104646a == null ? " text" : "";
        if (this.f104647b == null) {
            str = str.concat(" messageCallbackPayload");
        }
        if (str.isEmpty()) {
            return new bcrh(this.f104646a, this.f104647b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57111b(String str) {
        if (str != null) {
            this.f104646a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final void mo57110a(String str) {
        if (str != null) {
            this.f104647b = str;
            return;
        }
        throw new NullPointerException("Null messageCallbackPayload");
    }
}
