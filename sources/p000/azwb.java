package p000;

/* renamed from: azwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azwb {

    /* renamed from: a */
    private Integer f100111a;

    /* renamed from: b */
    private Boolean f100112b;

    /* renamed from: a */
    public final azwc mo55315a() {
        String str = this.f100111a == null ? " launchLoadSource" : "";
        if (this.f100112b == null) {
            str = str.concat(" shouldShowKeyboard");
        }
        if (str.isEmpty()) {
            return new azqq(this.f100111a.intValue(), this.f100112b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo55316a(int i) {
        this.f100111a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo55317a(boolean z) {
        this.f100112b = Boolean.valueOf(z);
    }
}
