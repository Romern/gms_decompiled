package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class atkh extends atki {

    /* renamed from: a */
    private static final srn f90409a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atkh(String str, SafeParcelable safeParcelable, String str2, aswm aswm) {
        super(str, safeParcelable, str2, aswm);
    }

    /* renamed from: a */
    public abstract boolean mo50006a();

    /* renamed from: b */
    public void mo50005b(Context context) {
        String str;
        boolean a = mo50006a();
        boolean b = a ? asze.m75247b(context, this.f90413c) : asze.m75246a(context, this.f90413c);
        bnsl bnsl = (bnsl) f90409a.mo68390d();
        bnsl.mo68432a("atkh", "b", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68426a("Package verification for [%s]. callingPackage: %s - isIssuerOperation: %s - verified: %s", this.f27820m, this.f90413c, Boolean.valueOf(a), Boolean.valueOf(b));
        if (!b) {
            AccountInfo b2 = asix.m74201b(context, askc.m74272b());
            if (b2 != null) {
                str = b2.f108326b;
            } else {
                str = null;
            }
            atam a2 = atam.m75295a(context, str);
            String str2 = this.f90413c;
            bxvd g = a2.mo49765g(80);
            if (str2 != null) {
                bxvd da = boxo.f135271c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boxo boxo = (boxo) da.f164949b;
                str2.getClass();
                boxo.f135273a |= 1;
                boxo.f135274b = str2;
                if (g.f164950c) {
                    g.mo74035c();
                    g.f164950c = false;
                }
                bpbx bpbx = (bpbx) g.f164949b;
                boxo boxo2 = (boxo) da.mo74062i();
                bpbx bpbx2 = bpbx.f135635S;
                boxo2.getClass();
                bpbx.f135676v = boxo2;
                bpbx.f135655a |= 4194304;
            }
            a2.mo49741a((bpbx) g.mo74062i());
            mo6503a(new Status(15009));
        }
    }
}
