package p000;

/* renamed from: cry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cry extends crn {
    protected cry(cro cro) {
        super(cro);
    }

    /* renamed from: f */
    public final void mo8196f() {
        boolean z;
        super.mo8196f();
        css css = css.WRONG_LENGTH;
        boolean z2 = false;
        if (mo8193c().byteValue() < 5 || mo8193c().byteValue() > 16) {
            z = true;
        } else {
            z = false;
        }
        css.mo8229a(z);
        css.INCORRECT_PARAMETERS_P1_P2.mo8229a(!(mo8191a() == 4 ? mo8192b() == 0 || mo8192b() == 2 : false));
        css css2 = css.WRONG_LENGTH;
        if (mo8194d().byteValue() == 0) {
            z2 = true;
        }
        css2.mo8229a(!z2);
    }
}
