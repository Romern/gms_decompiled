package p000;

/* renamed from: bdpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdpm {

    /* renamed from: a */
    private Boolean f106222a;

    /* renamed from: b */
    private Integer f106223b;

    /* renamed from: c */
    private bdpn f106224c;

    /* renamed from: d */
    private Boolean f106225d;

    /* renamed from: a */
    public final bdpp mo58272a() {
        String str = this.f106222a == null ? " enabled" : "";
        if (this.f106223b == null) {
            str = str.concat(" sampleRatePerSecond");
        }
        if (this.f106224c == null) {
            str = String.valueOf(str).concat(" dynamicSampler");
        }
        if (this.f106225d == null) {
            str = String.valueOf(str).concat(" recordTimerDuration");
        }
        if (str.isEmpty()) {
            return new bdpj(this.f106222a.booleanValue(), this.f106223b.intValue(), this.f106224c, this.f106225d.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo58276b(boolean z) {
        this.f106225d = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo58273a(int i) {
        this.f106223b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo58274a(bdpn bdpn) {
        if (bdpn != null) {
            this.f106224c = bdpn;
            return;
        }
        throw new NullPointerException("Null dynamicSampler");
    }

    /* renamed from: a */
    public final void mo58275a(boolean z) {
        this.f106222a = Boolean.valueOf(z);
    }
}
