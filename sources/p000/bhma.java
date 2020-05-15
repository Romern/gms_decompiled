package p000;

/* renamed from: bhma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhma extends bhme {

    /* renamed from: a */
    private final bhmc f119057a;

    /* renamed from: b */
    private final float f119058b;

    /* renamed from: c */
    private final float f119059c;

    public bhma(bhmc bhmc, float f, float f2) {
        this.f119057a = bhmc;
        this.f119058b = f;
        this.f119059c = f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo63983a() {
        bhmc bhmc = this.f119057a;
        return (float) Math.toDegrees(Math.atan((double) ((bhmc.f119068b - this.f119059c) / (bhmc.f119067a - this.f119058b))));
    }
}
