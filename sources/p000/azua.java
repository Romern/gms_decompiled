package p000;

/* renamed from: azua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azua {

    /* renamed from: a */
    private String f100036a;

    /* renamed from: b */
    private Boolean f100037b;

    /* renamed from: c */
    private bmxv f100038c;

    /* renamed from: d */
    private bmxv f100039d;

    public azua() {
    }

    /* renamed from: a */
    public final azub mo55293a() {
        String str = this.f100036a == null ? " callToken" : "";
        if (this.f100037b == null) {
            str = str.concat(" isProcessingAsync");
        }
        if (str.isEmpty()) {
            return new azqp(this.f100036a, this.f100037b.booleanValue(), this.f100038c, this.f100039d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo55297b(String str) {
        this.f100039d = bmxv.m108567c(str);
    }

    public azua(byte[] bArr) {
        this.f100038c = bmvz.f131120a;
        this.f100039d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo55294a(Object obj) {
        this.f100038c = bmxv.m108567c(obj);
    }

    /* renamed from: a */
    public final void mo55295a(String str) {
        if (str != null) {
            this.f100036a = str;
            return;
        }
        throw new NullPointerException("Null callToken");
    }

    /* renamed from: a */
    public final void mo55296a(boolean z) {
        this.f100037b = Boolean.valueOf(z);
    }
}
