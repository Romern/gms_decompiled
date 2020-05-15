package p000;

/* renamed from: bddn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddn {

    /* renamed from: a */
    public String f105375a;

    /* renamed from: b */
    private String f105376b;

    /* renamed from: c */
    private Boolean f105377c;

    /* renamed from: a */
    public final bddo mo57906a() {
        String str = this.f105376b == null ? " accountName" : "";
        if (this.f105377c == null) {
            str = str.concat(" isG1User");
        }
        if (str.isEmpty()) {
            return new bddl(this.f105375a, this.f105376b, this.f105377c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57908b() {
        this.f105377c = false;
    }

    /* renamed from: a */
    public final void mo57907a(String str) {
        if (str != null) {
            this.f105376b = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }
}
