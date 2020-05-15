package p000;

/* renamed from: adqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqc implements cayy {

    /* renamed from: a */
    private final adpo f62479a;

    /* renamed from: b */
    private final cijl f62480b;

    public adqc(adpo adpo, cijl cijl) {
        this.f62479a = adpo;
        this.f62480b = cijl;
    }

    /* renamed from: a */
    public static adqc m50982a(adpo adpo, cijl cijl) {
        return new adqc(adpo, cijl);
    }

    /* renamed from: b */
    public final adrq mo6445a() {
        adrq adrq = new adrq(((adpp) this.f62480b).mo6445a().getContentResolver(), this.f62479a.f62462d);
        cazf.m127593a(adrq, "Cannot return null from a non-@Nullable @Provides method");
        return adrq;
    }
}
