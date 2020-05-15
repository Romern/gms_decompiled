package p000;

/* renamed from: bseo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bseo {

    /* renamed from: a */
    private Double f144376a;

    /* renamed from: b */
    private Double f144377b;

    /* renamed from: a */
    public final bsep mo70435a() {
        String str = this.f144376a == null ? " probabilityDensityForInvalidGrid" : "";
        if (this.f144377b == null) {
            str = str.concat(" blueskyProbDeweightingFactor");
        }
        if (str.isEmpty()) {
            return new bsee(this.f144376a.doubleValue(), this.f144377b.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo70437b(double d) {
        this.f144376a = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70436a(double d) {
        this.f144377b = Double.valueOf(d);
    }
}
