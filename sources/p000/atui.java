package p000;

import android.os.Message;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atui extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atui(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        int i;
        if (message.what == 1002) {
            if (message.getData().containsKey("data_card_info")) {
                atsy.f90811C = (CardInfo) message.getData().getParcelable("data_card_info");
            }
            try {
                btmw btmw = (btmw) atxo.m76510a(message, "data_tokenize_card_response", btmw.f149565h);
                atam c = mo50188c(atsy);
                CardInfo cardInfo = atsy.f90811C;
                String str = atsy.f90849l;
                bxvd b = c.mo49753b(13, cardInfo);
                bxvd da = bpbw.f135631c.mo74144da();
                int a = btnx.m116967a(btmw.f149567a);
                if (a == 0) {
                    a = 1;
                }
                btml btml = btml.UNKNOWN_SETUP_STEP_TYPE;
                btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
                int i2 = a - 2;
                if (i2 != 0) {
                    i = i2 != 1 ? i2 != 2 ? 1 : 3 : 2;
                } else {
                    i = 1;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpbw bpbw = (bpbw) da.f164949b;
                bpbw.f135634b = i - 1;
                bpbw.f135633a |= 1;
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bpbx bpbx = (bpbx) b.f164949b;
                bpbw bpbw2 = (bpbw) da.mo74062i();
                bpbx bpbx2 = bpbx.f135635S;
                bpbw2.getClass();
                bpbx.f135663i = bpbw2;
                bpbx.f135655a |= 64;
                c.mo49742a((bpbx) b.mo74062i(), str);
                atsy.f90817I = btmw.f149571e.getKey();
                int a2 = btnx.m116967a(btmw.f149567a);
                if (a2 != 0) {
                    if (a2 == 2) {
                        atsy.f90831W = 2;
                    }
                }
                mo50180a(27, atsy);
            } catch (bxwf e) {
                mo50183a((btnf) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        atxx.m76527a(this.f90898f, true);
        TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
        tokenizePanChimeraActivity.mo59476a(tokenizePanChimeraActivity.getResources().getDrawable(C0126R.C0127drawable.quantum_ic_account_balance_googblue_48));
        if (atsy.f90811C == null) {
            if (atsy.f90841d == null) {
                if (atsy.f90815G != null) {
                    bxvd da = btiy.f149054c.mo74144da();
                    String str = atsy.f90815G;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str.getClass();
                    ((btiy) da.f164949b).f149056a = str;
                    atsy.f90841d = ((btiy) da.mo74062i()).serializeToBytes();
                } else {
                    return;
                }
            }
            try {
                mo50182a(atvc.m76443a(atsy.f90859v, atsy.f90841d, atsy.f90842e, atsy.f90844g, atsy.f90849l, atsy.f90858u, atsy.f90850m, atsy.f90862y, atsy.f90829U, atsy.f90835aa.f130977a, atsy.f90857t, atsy.f90861x, mo50185b()));
            } catch (RemoteException e) {
            }
            if (atsy.f90843f == 11 || atsy.f90862y) {
                mo50190c((int) C0126R.string.tp_tokenize_adding_account);
                boolean z = atsy.f90852o;
                return;
            }
            mo50190c((int) C0126R.string.tp_tokenize_contacting_bank);
            TokenizePanChimeraActivity tokenizePanChimeraActivity2 = this.f90898f;
            tokenizePanChimeraActivity2.f108914k.postDelayed(new atrh(tokenizePanChimeraActivity2), 3000);
            boolean z2 = atsy.f90852o;
            return;
        }
        mo50180a(27, atsy);
    }
}
