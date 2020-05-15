package p000;

/* renamed from: ahtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahtg {

    /* renamed from: a */
    public Throwable f67983a;

    /* renamed from: b */
    private bvjc f67984b;

    /* renamed from: c */
    private Long f67985c;

    /* renamed from: d */
    private Integer f67986d;

    /* renamed from: e */
    private Integer f67987e;

    /* renamed from: a */
    public final ahth mo37111a() {
        String str = this.f67984b == null ? " eventCode" : "";
        if (this.f67985c == null) {
            str = str.concat(" timestamp");
        }
        if (this.f67986d == null) {
            str = String.valueOf(str).concat(" numberAccountKeysOnProvider");
        }
        if (this.f67987e == null) {
            str = String.valueOf(str).concat(" numberDevicesOnFootprints");
        }
        if (str.isEmpty()) {
            return new ahtj(this.f67984b, this.f67985c.longValue(), this.f67983a, this.f67986d.intValue(), this.f67987e.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo37115b(int i) {
        this.f67987e = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo37112a(int i) {
        this.f67986d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo37113a(long j) {
        this.f67985c = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo37114a(bvjc bvjc) {
        if (bvjc != null) {
            this.f67984b = bvjc;
            return;
        }
        throw new NullPointerException("Null eventCode");
    }
}
