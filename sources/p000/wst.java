package p000;

import android.accounts.Account;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: wst */
final /* synthetic */ class wst implements Runnable {

    /* renamed from: a */
    private final wtd f51263a;

    /* renamed from: b */
    private final boolean f51264b;

    /* renamed from: c */
    private final Account f51265c;

    public wst(wtd wtd, boolean z, Account account) {
        this.f51263a = wtd;
        this.f51264b = z;
        this.f51265c = account;
    }

    public final void run() {
        wtd wtd = this.f51263a;
        boolean z = this.f51264b;
        Account account = this.f51265c;
        if (!z) {
            buru buru = wtd.f51278a;
            try {
                for (ahza ahza : (List) buru.mo73055a(account).get()) {
                    try {
                        buru.mo73069d(account).mo55928a(buru.m120322b(ahza.f68444b.mo73780k()), ahzb.f68447c).get();
                    } catch (InterruptedException | ExecutionException e) {
                        bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("buru", "a", 397, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Footprints Manager: Error removing footprint.");
                    }
                }
                busr busr = busr.f154819a;
            } catch (InterruptedException | ExecutionException e2) {
                bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("buru", "b", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Footprints Manager: Error removing footprints.");
            }
        }
        wtd.f51278a.mo73059a(account, z);
        if (wtd.getActivity() != null) {
            wtv.m42254a(wtd.getActivity(), z ? bvin.FAST_PAIR_ACCOUNT_SETTINGS_SAVE_ENABLED : bvin.FAST_PAIR_ACCOUNT_SETTINGS_SAVE_DISABLED);
            wtd.getActivity().runOnUiThread(new wsy(wtd));
        }
    }
}
