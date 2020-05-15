package p000;

import com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity;

/* renamed from: atlf */
public final /* synthetic */ class atlf implements aubt {

    /* renamed from: a */
    private final TapAndPayHomeChimeraActivity f90440a;

    public atlf(TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity) {
        this.f90440a = tapAndPayHomeChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity = this.f90440a;
        bnsl bnsl = (bnsl) TapAndPayHomeChimeraActivity.f108675b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "a", 429, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Could not retrieve accounts to set up fragment.");
        tapAndPayHomeChimeraActivity.finish();
    }
}
