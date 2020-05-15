package p000;

/* renamed from: kjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjw {

    /* renamed from: a */
    private String f24283a;

    /* renamed from: b */
    private String f24284b;

    /* renamed from: a */
    public final kjx mo14550a() {
        String str = this.f24283a == null ? " packageName" : "";
        if (this.f24284b == null) {
            str = str.concat(" className");
        }
        if (str.isEmpty()) {
            return new kjv(this.f24283a, this.f24284b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo14552b(String str) {
        if (str != null) {
            this.f24283a = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final void mo14551a(String str) {
        if (str != null) {
            this.f24284b = str;
            return;
        }
        throw new NullPointerException("Null className");
    }
}
