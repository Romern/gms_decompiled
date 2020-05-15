package p000;

/* renamed from: asqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqn extends Exception {

    /* renamed from: a */
    public final asqm f89396a;

    public asqn(asqm asqm) {
        bmxy.m108581a(asqm);
        this.f89396a = asqm;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public asqn(asqm asqm, Throwable th) {
        super(r2.toString(), th);
        String valueOf = String.valueOf(asqm);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("TapAndPayAidException: ");
        sb.append(valueOf);
        this.f89396a = asqm;
    }
}
