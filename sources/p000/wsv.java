package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/* renamed from: wsv */
final /* synthetic */ class wsv implements Runnable {

    /* renamed from: a */
    private final wtd f51267a;

    /* renamed from: b */
    private final Account f51268b;

    public wsv(wtd wtd, Account account) {
        this.f51267a = wtd;
        this.f51268b = account;
    }

    public final void run() {
        wtd wtd = this.f51267a;
        boolean c = wtd.f51278a.mo73066c(this.f51268b);
        if (wtd.getActivity() != null) {
            wtd.getActivity().runOnUiThread(new wsx(wtd, c));
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll((Collection) wtd.f51278a.mo73055a((Account) wtd.f51279b.get(wtd.f51280c.getSelectedItemPosition())).get());
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wtd", "d", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error getting devices from Footprints.");
        }
        if (wtd.getActivity() != null) {
            wtd.getActivity().runOnUiThread(new wsw(wtd, arrayList));
        }
    }
}
