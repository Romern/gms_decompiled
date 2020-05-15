package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: atkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class atkj extends atkk {

    /* renamed from: a */
    private static final srn f90411a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atkj(String str, String str2, aswm aswm) {
        super(str, str2, aswm);
    }

    /* renamed from: a */
    public abstract boolean mo50004a();

    /* renamed from: b */
    public void mo50005b(Context context) {
        boolean a = mo50004a();
        boolean b = a ? asze.m75247b(context, this.f90413c) : asze.m75246a(context, this.f90413c);
        bnsl bnsl = (bnsl) f90411a.mo68390d();
        bnsl.mo68432a("atkj", "b", 38, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68426a("Package verification for [%s]. callingPackage: %s - isIssuerOperation: %s - verified: %s", this.f27820m, this.f90413c, Boolean.valueOf(a), Boolean.valueOf(b));
        if (!b) {
            mo6503a(new Status(15009));
        }
    }
}
