package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;

/* renamed from: atyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyb implements atya {

    /* renamed from: a */
    public static final Intent f91104a = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT").putExtra("category", "payment").putExtra("component", new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.hce.service.TpHceService"));

    /* renamed from: c */
    private static final srn f91105c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final NfcAdapter f91106b;

    private atyb(NfcAdapter nfcAdapter) {
        this.f91106b = nfcAdapter;
    }

    /* renamed from: a */
    public static atya m76543a(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            return new atyb(defaultAdapter);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo50313b() {
        this.f91106b.enable();
    }

    /* renamed from: c */
    public final boolean mo50314c() {
        int i = Build.VERSION.SDK_INT;
        try {
            CardEmulation instance = CardEmulation.getInstance(this.f91106b);
            if (instance == null) {
                return false;
            }
            ((bnsl) f91105c.mo68390d()).mo68409a("NFC Payments selection mode: %d", instance.getSelectionModeForCategory("payment"));
            try {
                return instance.isDefaultServiceForCategory(new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment");
            } catch (NullPointerException e) {
                bnsl bnsl = (bnsl) f91105c.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to check default service category");
                return false;
            }
        } catch (UnsupportedOperationException e2) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo50312a() {
        return this.f91106b.isEnabled();
    }
}
