package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: wth */
final /* synthetic */ class wth implements Runnable {

    /* renamed from: a */
    private final wts f51295a;

    public wth(wts wts) {
        this.f51295a = wts;
    }

    public final void run() {
        aiaa aiaa;
        ahza ahza;
        wts wts = this.f51295a;
        wsm wsm = wts.f51323j;
        byte[] bArr = wts.f51315b;
        buru buru = wsm.f51252a;
        List a = buru.m120318a(buru.f154791b);
        int size = a.size();
        int i = 0;
        while (true) {
            aiaa = null;
            if (i >= size) {
                ahza = null;
                break;
            }
            Account account = (Account) a.get(i);
            try {
                ahza = buru.m120317a((List) buru.mo73055a(account).get(), bArr);
                if (ahza != null) {
                    break;
                }
                i++;
            } catch (InterruptedException | ExecutionException e) {
                bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("buru", "d", 638, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("FastPair: fail to read footprints from %s.", account);
            }
        }
        if (ahza != null) {
            try {
                bxtx bxtx = ahza.f68445c;
                bxus c = bxus.m123744c();
                aiaa aiaa2 = aiaa.f68501K;
                try {
                    bxuc h = bxtx.mo73764h();
                    bxvk bxvk = (bxvk) aiaa2.mo74142c(4);
                    bxxv a2 = bxxm.f165037a.mo74228a(bxvk);
                    a2.mo74220a(bxvk, bxud.m123454a(h), c);
                    a2.mo74225d(bxvk);
                    h.mo73787a(0);
                    bxvk.m124027b(bxvk);
                    aiaa = (aiaa) bxvk;
                } catch (IOException e2) {
                    if (!(e2.getCause() instanceof bxwf)) {
                        throw new bxwf(e2.getMessage());
                    }
                    throw ((bxwf) e2.getCause());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof bxwf) {
                        throw ((bxwf) e3.getCause());
                    }
                    throw e3;
                } catch (bxwf e4) {
                    throw e4;
                } catch (bxwf e5) {
                    throw e5;
                }
            } catch (bxwf e6) {
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68388c();
                bnsl2.mo68437a(e6);
                bnsl2.mo68432a("wsm", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FindDevice: Failed to read device from Footprints based on cached item.");
            }
        }
        if (wts.getActivity() != null && aiaa != null) {
            wts.getActivity().runOnUiThread(new wtf(wts, aiaa));
        }
    }
}
