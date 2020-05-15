package p000;

/* renamed from: oaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oaz {

    /* renamed from: a */
    public obn f37114a;

    /* renamed from: b */
    private Boolean f37115b;

    /* renamed from: c */
    private Integer f37116c;

    /* renamed from: a */
    public final oba mo21933a() {
        String str = this.f37115b == null ? " isEnabled" : "";
        if (this.f37116c == null) {
            str = str.concat(" bufferSize");
        }
        if (this.f37114a == null) {
            str = String.valueOf(str).concat(" galMessageFilter");
        }
        if (str.isEmpty()) {
            return new oau(this.f37115b.booleanValue(), this.f37116c.intValue(), this.f37114a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo21934a(int i) {
        this.f37116c = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo21935a(boolean z) {
        this.f37115b = Boolean.valueOf(z);
    }
}
