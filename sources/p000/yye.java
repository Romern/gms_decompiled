package p000;

/* renamed from: yye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yye {

    /* renamed from: a */
    public caad f54814a;

    /* renamed from: b */
    public caah f54815b;

    /* renamed from: c */
    public String f54816c;

    /* renamed from: d */
    public String f54817d;

    /* renamed from: e */
    public String f54818e;

    /* renamed from: f */
    public String f54819f;

    /* renamed from: g */
    public String f54820g;

    /* renamed from: a */
    public final yyf mo30861a() {
        String str = this.f54814a == null ? " type" : "";
        if (this.f54815b == null) {
            str = str.concat(" dataType");
        }
        if (str.isEmpty()) {
            return new yxz(this.f54814a, this.f54815b, this.f54816c, this.f54817d, this.f54818e, this.f54819f, this.f54820g);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final String toString() {
        return mo30861a().toString();
    }
}
