package p000;

/* renamed from: bcsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsy {

    /* renamed from: a */
    private byte[] f104830a;

    /* renamed from: b */
    private Integer f104831b;

    /* renamed from: c */
    private Integer f104832c;

    /* renamed from: d */
    private bmxv f104833d;

    /* renamed from: e */
    private String f104834e;

    public bcsy() {
    }

    /* renamed from: a */
    public final bcsz mo57487a() {
        String str = this.f104830a == null ? " icon" : "";
        if (this.f104831b == null) {
            str = str.concat(" width");
        }
        if (this.f104832c == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (this.f104834e == null) {
            str = String.valueOf(str).concat(" talkBackDescription");
        }
        if (str.isEmpty()) {
            return new bcrq(this.f104830a, this.f104831b.intValue(), this.f104832c.intValue(), this.f104833d, this.f104834e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57491b(int i) {
        this.f104832c = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo57492c(int i) {
        this.f104831b = Integer.valueOf(i);
    }

    public bcsy(byte[] bArr) {
        this.f104833d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57488a(int i) {
        this.f104833d = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo57489a(String str) {
        if (str != null) {
            this.f104834e = str;
            return;
        }
        throw new NullPointerException("Null talkBackDescription");
    }

    /* renamed from: a */
    public final void mo57490a(byte[] bArr) {
        if (bArr != null) {
            this.f104830a = bArr;
            return;
        }
        throw new NullPointerException("Null icon");
    }
}
