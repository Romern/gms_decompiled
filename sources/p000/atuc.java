package p000;

import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuc extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atuc(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: b */
    private final void m76349b(atsy atsy) {
        if (!TextUtils.isEmpty(atsy.f90847j) || atsy.f90846i != null) {
            Intent putExtra = new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.tokenization.AcceptTosActivity").putExtra("TOS_TITLE", atsy.f90845h).putExtra("extra_account_info", atsy.f90857t).putExtra("EXTRA_USE_SUW_UI", atsy.f90824P);
            if (!TextUtils.isEmpty(atsy.f90847j)) {
                putExtra.putExtra("TOS_URL", atsy.f90847j);
            } else {
                putExtra.putExtra("TOS_CONTENT", atsy.f90846i.f149523b).putExtra("TOS_CONTENT_TYPE", atsy.f90846i.f149522a);
            }
            mo50181a(putExtra, 6);
            atam c = mo50188c(atsy);
            c.mo49742a(c.mo49735a(11, (CardInfo) null), atsy.f90849l);
            return;
        }
        mo50180a(13, atsy);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, int]
     candidates:
      atam.a(btjx, java.lang.Boolean, java.lang.Boolean):bpaq
      atam.a(java.lang.String, int, int):void
      atam.a(java.lang.String, boolean, java.lang.String):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 != -1) {
            mo50188c(atsy).mo49745a(atsy.f90811C, atsy.f90849l, false);
            atsy.f90831W = 5;
            mo50180a(27, atsy);
            return;
        }
        mo50188c(atsy).mo49745a(atsy.f90811C, atsy.f90849l, true);
        mo50180a(13, atsy);
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 21001) {
            try {
                btko btko = (btko) atxo.m76510a(message, "data_response", btko.f149283c);
                atsy.f90845h = btko.f149285a;
                btmo btmo = btko.f149286b;
                if (btmo == null) {
                    btmo = btmo.f149520c;
                }
                atsy.f90846i = btmo;
                m76349b(atsy);
            } catch (bxwf e) {
                mo50183a((btnf) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        int a;
        if (atsy.f90811C != null) {
            mo50180a(13, atsy);
        } else if (!atsy.mo50167e() || (a = bmuv.m108404a(atsy.f90835aa.f130983g)) == 0 || a != 3) {
            m76349b(atsy);
        } else {
            try {
                mo50182a(atuq.m76404a(atsy.f90857t, atsy.f90861x, mo50185b(), atsy.f90841d, atsy.f90849l, atsy.f90835aa.f130977a));
            } catch (RemoteException e) {
            }
        }
    }
}
