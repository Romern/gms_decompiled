package p000;

/* renamed from: thx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thx {

    /* renamed from: a */
    private String f46054a;

    /* renamed from: b */
    private bmxv f46055b;

    public thx() {
    }

    /* renamed from: a */
    public final thy mo26554a() {
        String str = this.f46054a == null ? " text" : "";
        if (str.isEmpty()) {
            return new tho(this.f46054a, this.f46055b);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: b */
    public final void mo26556b(String str) {
        if (str != null) {
            this.f46054a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public thx(byte[] bArr) {
        this.f46055b = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo26555a(String str) {
        this.f46055b = bmxv.m108566b(str);
    }
}
