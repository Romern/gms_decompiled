package p000;

import android.content.ComponentName;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: asqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqo {

    /* renamed from: a */
    public static final srn f89397a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final ReentrantLock f89398b = new ReentrantLock();

    /* renamed from: a */
    public static bngx m74468a(Context context) {
        CardEmulation b = m74470b(context);
        if (b == null) {
            ((bnsl) f89397a.mo68387b()).mo68405a("CardEmulation is null while checking aid registration.");
            return bngx.m109376e();
        } else if (spn.m35876d(context, "com.google.android.gms.tapandpay.hce.service.TpHceService") == 2) {
            ((bnsl) f89397a.mo68390d()).mo68405a("Component is disabled while checking aid registration");
            return bngx.m109376e();
        } else {
            List<String> aidsForService = b.getAidsForService(new ComponentName(context, "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment");
            if (aidsForService != null) {
                return bngx.m109368a((Collection) aidsForService);
            }
            return bngx.m109376e();
        }
    }

    /* renamed from: b */
    public static CardEmulation m74470b(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            try {
                return CardEmulation.getInstance(defaultAdapter);
            } catch (UnsupportedOperationException e) {
                bnsl bnsl = (bnsl) f89397a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("getting CardEmulation instance failed.");
                return null;
            }
        } else {
            ((bnsl) f89397a.mo68387b()).mo68405a("NfcAdapter is null while obtaining CardEmulation instance.");
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m74471b(Context context, List list) {
        if (spn.m35859a()) {
            ((bnsl) f89397a.mo68390d()).mo68405a("Running in an emulator. Exiting without registering AIDs");
            return true;
        }
        bngx a = m74468a(context);
        if (!a.containsAll(list) || !list.containsAll(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m74469a(Context context, List list) {
        if (spn.m35859a()) {
            ((bnsl) f89397a.mo68390d()).mo68405a("Running in an emulator. Exiting without registering AIDs");
            return true;
        } else if (list != null && !list.isEmpty()) {
            CardEmulation b = m74470b(context);
            if (b == null) {
                ((bnsl) f89397a.mo68387b()).mo68405a("CardEmulation is null while trying to register AIDs.");
                return false;
            } else if (!f89398b.tryLock()) {
                ((bnsl) f89397a.mo68388c()).mo68405a("Failed to obtain lock while registering AIDs");
                return false;
            } else {
                boolean registerAidsForService = b.registerAidsForService(new ComponentName(context, "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment", list);
                if (!registerAidsForService) {
                    ((bnsl) f89397a.mo68387b()).mo68405a("Registering AIDs failed");
                }
                f89398b.unlock();
                return registerAidsForService;
            }
        } else {
            ((bnsl) f89397a.mo68387b()).mo68405a("AID list is empty.");
            return false;
        }
    }
}
