package p000;

/* renamed from: bsew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsew {

    /* renamed from: a */
    private Double f144416a;

    /* renamed from: b */
    private Double f144417b;

    /* renamed from: c */
    private Double f144418c;

    /* renamed from: d */
    private Double f144419d;

    /* renamed from: e */
    private Double f144420e;

    /* renamed from: a */
    public final bsex mo70475a() {
        String str = this.f144416a == null ? " minStdDevM" : "";
        if (this.f144417b == null) {
            str = str.concat(" maxStdDevM");
        }
        if (this.f144418c == null) {
            str = String.valueOf(str).concat(" stdDevScaleM");
        }
        if (this.f144419d == null) {
            str = String.valueOf(str).concat(" rejectionDistanceM");
        }
        if (this.f144420e == null) {
            str = String.valueOf(str).concat(" rejectionPeriodS");
        }
        if (str.isEmpty()) {
            return new bsei(this.f144416a.doubleValue(), this.f144417b.doubleValue(), this.f144418c.doubleValue(), this.f144419d.doubleValue(), this.f144420e.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo70477b(double d) {
        this.f144416a = Double.valueOf(d);
    }

    /* renamed from: c */
    public final void mo70478c(double d) {
        this.f144419d = Double.valueOf(d);
    }

    /* renamed from: d */
    public final void mo70479d(double d) {
        this.f144420e = Double.valueOf(d);
    }

    /* renamed from: e */
    public final void mo70480e(double d) {
        this.f144418c = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70476a(double d) {
        this.f144417b = Double.valueOf(d);
    }
}
