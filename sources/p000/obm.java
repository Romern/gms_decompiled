package p000;

/* renamed from: obm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obm {

    /* renamed from: a */
    private Boolean f37133a;

    /* renamed from: b */
    private Boolean f37134b;

    /* renamed from: c */
    private Boolean f37135c;

    /* renamed from: a */
    public final obn mo21944a() {
        String str = this.f37133a == null ? " videoAckLoggable" : "";
        if (this.f37134b == null) {
            str = str.concat(" audioMediaAckLoggable");
        }
        if (this.f37135c == null) {
            str = String.valueOf(str).concat(" audioGuidanceAckLoggable");
        }
        if (str.isEmpty()) {
            return new obk(this.f37133a.booleanValue(), this.f37134b.booleanValue(), this.f37135c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo21946b(boolean z) {
        this.f37134b = Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final void mo21947c(boolean z) {
        this.f37133a = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo21945a(boolean z) {
        this.f37135c = Boolean.valueOf(z);
    }
}
