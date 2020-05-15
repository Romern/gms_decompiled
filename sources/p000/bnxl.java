package p000;

/* renamed from: bnxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnxl extends bnxn {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final bnyj f132335a;

    /* renamed from: b */
    private final bnyj f132336b;

    public bnxl(bnyj bnyj, bnyj bnyj2) {
        this.f132335a = bnyj;
        this.f132336b = bnyj2;
    }

    /* renamed from: a */
    public final bnyj mo68690a(int i) {
        if (i == 0) {
            return this.f132335a;
        }
        if (i == 1) {
            return this.f132336b;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final int mo68691b() {
        return 2;
    }
}
