package p000;

/* renamed from: ayrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayrk {

    /* renamed from: a */
    public bmxv f98351a;

    /* renamed from: b */
    private Boolean f98352b;

    /* renamed from: c */
    private Long f98353c;

    /* renamed from: d */
    private bmxv f98354d;

    public ayrk() {
    }

    /* renamed from: a */
    public final ayrl mo54320a() {
        String str = this.f98352b == null ? " autoConnect" : "";
        if (this.f98353c == null) {
            str = str.concat(" connectionTimeoutMillis");
        }
        if (str.isEmpty()) {
            return new ayqy(this.f98352b.booleanValue(), this.f98353c.longValue(), this.f98354d, this.f98351a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo54322b() {
        this.f98352b = false;
    }

    public ayrk(byte[] bArr) {
        this.f98354d = bmvz.f131120a;
        this.f98351a = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo54321a(long j) {
        this.f98353c = Long.valueOf(j);
    }
}
