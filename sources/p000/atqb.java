package p000;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity;

/* renamed from: atqb */
public final /* synthetic */ class atqb implements View.OnClickListener {

    /* renamed from: a */
    private final EnterVerificationCodeChimeraActivity f90651a;

    public atqb(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity) {
        this.f90651a = enterVerificationCodeChimeraActivity;
    }

    public void onClick(View view) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity = this.f90651a;
        enterVerificationCodeChimeraActivity.f108801g.setText("");
        enterVerificationCodeChimeraActivity.f108802h.setEnabled(false);
        try {
            enterVerificationCodeChimeraActivity.f108814t.mo50311a(atuy.m76426a(enterVerificationCodeChimeraActivity.f108806l.f108340a, enterVerificationCodeChimeraActivity.f108803i, enterVerificationCodeChimeraActivity.f108804j, enterVerificationCodeChimeraActivity.f108805k, enterVerificationCodeChimeraActivity.f108808n.mo73642k(), enterVerificationCodeChimeraActivity.f108807m, enterVerificationCodeChimeraActivity.f108800f));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) EnterVerificationCodeChimeraActivity.f108789b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeChimeraActivity", "h", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error calling SelectActivationMethod");
        }
    }
}
