package p000;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.issuer.CreatePushTokenizeSessionRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attp extends atue {

    /* renamed from: a */
    public static final srn f90882a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public attp(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    private static btls m76323a(UserAddress userAddress) {
        bxvd da = btls.f149414i.mo74144da();
        if (userAddress != null) {
            String a = stm.m36299a(userAddress.f108599i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((btls) da.f164949b).f149421f = a;
            String a2 = stm.m36299a(userAddress.f108602l);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((btls) da.f164949b).f149423h = a2;
            String a3 = stm.m36299a(userAddress.f108591a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a3.getClass();
            ((btls) da.f164949b).f149416a = a3;
            String a4 = stm.m36299a(userAddress.f108600j);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a4.getClass();
            ((btls) da.f164949b).f149422g = a4;
            String a5 = stm.m36299a(userAddress.f108597g);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a5.getClass();
            ((btls) da.f164949b).f149420e = a5;
            String a6 = stm.m36299a(userAddress.f108598h);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a6.getClass();
            ((btls) da.f164949b).f149419d = a6;
            String a7 = stm.m36299a(userAddress.f108592b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a7.getClass();
            ((btls) da.f164949b).f149417b = a7;
            String a8 = stm.m36299a(userAddress.f108593c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a8.getClass();
            ((btls) da.f164949b).f149418c = a8;
        }
        return (btls) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(java.lang.String, boolean, java.lang.String):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      atam.a(btjx, java.lang.Boolean, java.lang.Boolean):bpaq
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean):void
      atam.a(java.lang.String, int, int):void
      atam.a(java.lang.String, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            mo50188c(atsy).mo49752a(atsy.f90849l, true, atsy.f90861x);
            if (intent.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")) {
                atsy.f90816H = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                mo50180a(9, atsy);
                return;
            }
            this.f90898f.f108909f = true;
            return;
        }
        mo50188c(atsy).mo49752a(atsy.f90849l, false, atsy.f90861x);
        mo50187b(i2, 6);
        mo50178a();
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        askf askf = new askf(atsy.f90857t, askc.m74272b(), this.f90898f);
        atto atto = new atto(this, atsy);
        bxvd da = btlt.f149424f.mo74144da();
        String str = atsy.f90849l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((btlt) da.f164949b).f149428c = str;
        bxtx a = bxtx.m123261a(atsy.f90809A);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btlt) da.f164949b).f149430e = a;
        byte[] bArr = atsy.f90859v;
        if (bArr != null) {
            PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) sef.m35069a(bArr, PushTokenizeRequest.CREATOR);
            if (pushTokenizeRequest == null) {
                mo50184a(mo50186b(C0126R.string.common_something_went_wrong), mo50186b(C0126R.string.tp_generic_error_content));
                return;
            }
            bxvd da2 = btlv.f149435f.mo74144da();
            btof a2 = atyj.m76562a(pushTokenizeRequest.f108571b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((btlv) da2.f164949b).f149437a = a2.mo3214a();
            btlv btlv = (btlv) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btlv.getClass();
            ((btlt) da.f164949b).f149429d = btlv;
            UserAddress userAddress = pushTokenizeRequest.f108575f;
            if (userAddress == null) {
                bxtx a3 = bxtx.m123261a(pushTokenizeRequest.f108572c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btlt btlt = (btlt) da.f164949b;
                a3.getClass();
                btlt.f149426a = 2;
                btlt.f149427b = a3;
            } else {
                btls a4 = m76323a(userAddress);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btlt btlt2 = (btlt) da.f164949b;
                a4.getClass();
                btlt2.f149427b = a4;
                btlt2.f149426a = 3;
            }
        } else {
            byte[] bArr2 = atsy.f90860w;
            if (bArr2 != null) {
                CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest = (CreatePushTokenizeSessionRequest) sef.m35069a(bArr2, CreatePushTokenizeSessionRequest.CREATOR);
                if (createPushTokenizeSessionRequest == null) {
                    mo50184a(mo50186b(C0126R.string.common_something_went_wrong), mo50186b(C0126R.string.tp_generic_error_content));
                    return;
                }
                btls a5 = m76323a(createPushTokenizeSessionRequest.f108567a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btlt btlt3 = (btlt) da.f164949b;
                a5.getClass();
                btlt3.f149427b = a5;
                btlt3.f149426a = 3;
            } else {
                mo50184a(mo50186b(C0126R.string.common_something_went_wrong), mo50186b(C0126R.string.tp_generic_error_content));
                return;
            }
        }
        atff.m75765a(askf, "t/cardtokenization/processpushtokenizationaddress", da.mo74062i(), btlu.f149431c, atto, this);
    }
}
