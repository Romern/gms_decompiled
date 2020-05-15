package p000;

/* renamed from: cur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cur extends cuf {

    /* renamed from: b */
    public static final byte[][] f12073b = {new byte[]{49, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, 49}, new byte[]{50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, 49}};

    protected cur(cug cug) {
        super(cug);
    }

    /* renamed from: f */
    public final void mo8303f() {
        boolean z;
        super.mo8303f();
        cuu cuu = cuu.WRONG_LENGTH;
        boolean z2 = false;
        if (mo8300c().byteValue() < 5 || mo8300c().byteValue() > 16) {
            z = true;
        } else {
            z = false;
        }
        cuu.mo8315a(z);
        cuu.INCORRECT_PARAMETERS_P1_P2.mo8315a(!(mo8298a() == 4 ? mo8299b() == 0 || mo8299b() == 2 : false));
        cuu cuu2 = cuu.WRONG_LENGTH;
        if (mo8301d().byteValue() == 0) {
            z2 = true;
        }
        cuu2.mo8315a(!z2);
    }
}
