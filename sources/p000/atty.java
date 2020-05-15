package p000;

import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atty extends atue {

    /* renamed from: a */
    private static final srn f90893a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atty(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    private final void m76340a(atsy atsy, boolean z) {
        Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_ENABLE_SECURE_KEYGUARD");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity");
        intent.putExtra("data_keyguard_setup_required", z);
        intent.putExtra("extra_card_info", atsy.f90811C);
        atsy.f90856s = false;
        mo50181a(intent, 13);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            aszy.m75270b(this.f90898f);
            aszy.m75267a();
            try {
                mo50182a(atut.m76412a(atsy.f90857t, atsy.f90861x));
            } catch (RemoteException e) {
            }
            mo50180a(3, atsy);
            return;
        }
        bnsl bnsl = (bnsl) f90893a.mo68388c();
        bnsl.mo68432a("atty", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Failed to set up keyguard: %d", i2);
        mo50187b(i2, 10);
        mo50178a();
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 18) {
            m76340a(atsy, message.getData().getBoolean("data_keyguard_setup_required"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atty.a(atsy, boolean):void
     arg types: [atsy, int]
     candidates:
      atty.a(android.os.Message, atsy):void
      atue.a(int, int):void
      atue.a(int, android.content.Intent):void
      atue.a(int, atsy):void
      atue.a(android.content.Intent, int):void
      atue.a(android.os.Message, atsy):void
      atue.a(java.lang.String, java.lang.String):void
      auat.a(int, int):void
      atty.a(atsy, boolean):void */
    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        try {
            mo50182a(atuo.m76398a(atsy.f90857t, atsy.f90861x, mo50185b()));
        } catch (RemoteException e) {
            m76340a(atsy, true);
        }
    }
}
