package p000;

import android.accounts.Account;
import android.content.Intent;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: atto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atto implements atfd {

    /* renamed from: a */
    final /* synthetic */ atsy f90880a;

    /* renamed from: b */
    final /* synthetic */ attp f90881b;

    public atto(attp attp, atsy atsy) {
        this.f90881b = attp;
        this.f90880a = atsy;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) attp.f90882a.mo68387b();
        bnsl.mo68432a("atto", "onErrorResponse", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Error getting push tokenization address response");
        if (volleyError != null) {
            this.f90881b.mo50183a(atff.m75758a(volleyError));
            return;
        }
        this.f90881b.mo50183a((btnf) null);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        bxtx bxtx;
        bxtx bxtx2;
        bxtx bxtx3;
        btlu btlu = (btlu) obj;
        if (btlu.f149433a == 2) {
            bxtx = (bxtx) btlu.f149434b;
        } else {
            bxtx = bxtx.f164797b;
        }
        if (bxtx.mo73744a() > 0) {
            atsy atsy = this.f90880a;
            if (btlu.f149433a == 2) {
                bxtx3 = (bxtx) btlu.f149434b;
            } else {
                bxtx3 = bxtx.f164797b;
            }
            atsy.f90816H = bxtx3.mo73780k();
            this.f90881b.mo50180a(10, this.f90880a);
            return;
        }
        if (btlu.f149433a == 1) {
            bxtx2 = (bxtx) btlu.f149434b;
        } else {
            bxtx2 = bxtx.f164797b;
        }
        byte[] k = bxtx2.mo73780k();
        if (k == null || k.length == 0) {
            srn srn = attp.f90882a;
            attp attp = this.f90881b;
            attp.mo50184a(attp.mo50186b(C0126R.string.common_something_went_wrong), this.f90881b.mo50186b(C0126R.string.tp_generic_error_content));
            return;
        }
        awlc awlc = new awlc(this.f90881b.f90898f);
        awlc.mo52187a(askc.m74269a());
        awlc.mo52188a(new Account(this.f90880a.f90857t.f108326b, "com.google"));
        awlc.mo52233a(k);
        boolean z = this.f90880a.f90852o;
        awlc.mo52190a(atvh.m76455a(this.f90881b.f90898f));
        awlc.mo52192b(3);
        Intent a = awlc.mo52186a();
        a.addFlags(603979776);
        this.f90881b.mo50181a(a, 2);
        atam c = this.f90881b.mo50188c(this.f90880a);
        atsy atsy2 = this.f90880a;
        String str = atsy2.f90849l;
        String str2 = atsy2.f90861x;
        bxvd g = c.mo49765g(34);
        if (str2 != null) {
            bxvd da = boxo.f135271c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boxo boxo = (boxo) da.f164949b;
            str2.getClass();
            boxo.f135273a = 1 | boxo.f135273a;
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
        c.mo49742a((bpbx) g.mo74062i(), str);
    }
}
