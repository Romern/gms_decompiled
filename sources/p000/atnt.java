package p000;

import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnt */
public final /* synthetic */ class atnt implements Runnable {

    /* renamed from: a */
    private final TapUiChimeraActivity f90569a;

    /* renamed from: b */
    private final int f90570b;

    /* renamed from: c */
    private final int f90571c;

    public atnt(TapUiChimeraActivity tapUiChimeraActivity, int i, int i2) {
        this.f90569a = tapUiChimeraActivity;
        this.f90571c = i;
        this.f90570b = i2;
    }

    public final void run() {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90569a;
        int i = this.f90571c;
        int i2 = this.f90570b;
        atj.m2053a(tapUiChimeraActivity.f108724q, tapUiChimeraActivity.mo59419e());
        tapUiChimeraActivity.mo59414a(i, i2);
    }
}
