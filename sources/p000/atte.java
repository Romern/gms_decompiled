package p000;

import android.os.Message;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atte extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atte(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: b */
    private final void m76299b(atsy atsy) {
        if (atsy.f90851n) {
            mo50180a(27, atsy);
        } else {
            mo50180a(25, atsy);
        }
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        int i;
        btmo btmo;
        if (message.what != 1001) {
            return;
        }
        if (!((Boolean) askd.f89120l.mo58455c()).booleanValue()) {
            bxvd da = btnf.f149600f.mo74144da();
            bxvd da2 = btmz.f149585b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((btmz) da2.f164949b).f149587a = 1;
            bxvd da3 = bxte.f164763c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            "type.googleapis.com/google.internal.tapandpay.v1.AttestationErrorDetails".getClass();
            ((bxte) da3.f164949b).f164765a = "type.googleapis.com/google.internal.tapandpay.v1.AttestationErrorDetails";
            bxtx aL = ((btmz) da2.mo74062i()).mo73639aL();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            aL.getClass();
            ((bxte) da3.f164949b).f164766b = aL;
            bxte bxte = (bxte) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btnf btnf = (btnf) da.f164949b;
            bxte.getClass();
            if (!btnf.f149605d.mo73666a()) {
                btnf.f149605d = bxvk.m124021a(btnf.f149605d);
            }
            btnf.f149605d.add(bxte);
            this.f90898f.mo59482b((btnf) da.mo74062i());
            return;
        }
        try {
            btkd btkd = (btkd) atxo.m76510a(message, "data_response", btkd.f149233h);
            atam c = mo50188c(atsy);
            String str = atsy.f90849l;
            bxvd b = c.mo49753b(10, null);
            bxvd da4 = boxs.f135283c.mo74144da();
            btof a = btof.m116979a(btkd.f149238d);
            if (a == null) {
                a = btof.UNRECOGNIZED;
            }
            if (a == btof.NONE) {
                i = 4;
            } else {
                i = 2;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            boxs boxs = (boxs) da4.f164949b;
            boxs.f135286b = i - 1;
            boxs.f135285a = 1 | boxs.f135285a;
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpbx bpbx = (bpbx) b.f164949b;
            boxs boxs2 = (boxs) da4.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            boxs2.getClass();
            bpbx.f135661g = boxs2;
            bpbx.f135655a |= 16;
            c.mo49742a((bpbx) b.mo74062i(), str);
            btof a2 = btof.m116979a(btkd.f149238d);
            if (a2 == null) {
                a2 = btof.UNRECOGNIZED;
            }
            if (a2 == btof.NONE) {
                atsy.f90831W = 3;
                mo50180a(27, atsy);
                return;
            }
            btof a3 = btof.m116979a(btkd.f149238d);
            if (a3 == null) {
                a3 = btof.UNRECOGNIZED;
            }
            atsy.f90843f = a3.mo3214a();
            btoa a4 = btoa.m116971a(btkd.f149239e);
            if (a4 == null) {
                a4 = btoa.UNRECOGNIZED;
            }
            atsy.f90858u = atcw.m75565a(a4);
            atsy.f90844g = btkd.f149237c.mo73780k();
            atsy.f90845h = btkd.f149240f;
            int i2 = btkd.f149235a;
            if (i2 == 3) {
                btmo = (btmo) btkd.f149236b;
            } else {
                btmo = null;
            }
            atsy.f90846i = btmo;
            String str2 = "";
            if (i2 == 4) {
                str2 = (String) btkd.f149236b;
            }
            atsy.f90847j = str2;
            btiy btiy = btkd.f149241g;
            if (btiy != null) {
                atsy.f90841d = btiy.mo73642k();
            }
            m76299b(atsy);
        } catch (bxwf e) {
            mo50183a((btnf) null);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        int i;
        atsy atsy2 = atsy;
        if (cgwn.m147263m()) {
            atam c = mo50188c(atsy);
            bpbr d = m76355d(atsy);
            bxvd da = bpbj.f135600d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbj bpbj = (bpbj) da.f164949b;
            bpbj.f135603b = 1;
            bpbj.f135602a |= 1;
            c.mo49739a(d, (bpbj) da.mo74062i());
        }
        if (atsy2.f90851n || atsy.mo50167e() || (atsy2.f90811C != null && !atsy.mo50164b())) {
            m76299b(atsy);
        } else if (!atsy.mo50165c()) {
            TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
            tokenizePanChimeraActivity.mo59476a(tokenizePanChimeraActivity.getResources().getDrawable(C0126R.C0127drawable.quantum_ic_account_balance_googblue_48));
            byte[] bArr = atsy2.f90859v;
            byte[] bArr2 = atsy2.f90816H;
            String str = !atsy.mo50164b() ? atsy2.f90815G : null;
            byte[] bArr3 = atsy2.f90830V;
            byte[] bArr4 = atsy2.f90829U;
            String str2 = atsy2.f90836ab;
            boolean z = atsy2.f90862y;
            boolean z2 = atsy2.f90848k;
            String str3 = atsy2.f90849l;
            int i2 = atsy2.f90837ac;
            if (i2 != 0) {
                i = btna.m116942a(i2);
            } else {
                i = 0;
            }
            Message a = atun.m76394a(bArr, bArr2, str, bArr3, bArr4, str2, z, z2, str3, i, atsy2.f90857t, atsy2.f90861x, mo50185b());
            try {
                if (cgwn.m147263m()) {
                    atam c2 = mo50188c(atsy);
                    bpbr d2 = m76355d(atsy);
                    bxvd da2 = bpbj.f135600d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpbj bpbj2 = (bpbj) da2.f164949b;
                    bpbj2.f135603b = 3;
                    bpbj2.f135602a = 1 | bpbj2.f135602a;
                    c2.mo49739a(d2, (bpbj) da2.mo74062i());
                }
                mo50182a(a);
            } catch (RemoteException e) {
            }
        } else {
            mo50180a(32, atsy2);
        }
    }
}
