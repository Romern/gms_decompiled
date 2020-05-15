package p000;

/* renamed from: bacw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bacw {

    /* renamed from: a */
    private Boolean f100506a;

    /* renamed from: b */
    private Integer f100507b;

    /* renamed from: a */
    public final bacx mo55600a() {
        String str = this.f100506a == null ? " enabled" : "";
        if (this.f100507b == null) {
            str = str.concat(" throttleDelaySeconds");
        }
        if (str.isEmpty()) {
            return new bacs(this.f100506a.booleanValue(), this.f100507b.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo55601a(int i) {
        this.f100507b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo55602a(boolean z) {
        this.f100506a = Boolean.valueOf(z);
    }
}
