package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardListEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.CountDownLatch;

/* renamed from: atgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atgd implements CardListEventCallback {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f90274a;

    /* renamed from: b */
    final /* synthetic */ atge f90275b;

    public atgd(atge atge, CountDownLatch countDownLatch) {
        this.f90275b = atge;
        this.f90274a = countDownLatch;
    }

    public final void onError(int i, String str) {
        this.f90275b.f90278c = new bres(brez.m113953a(i, str));
        bnsl bnsl = (bnsl) atgf.f90279a.mo68387b();
        bnsl.mo68437a(this.f90275b.f90278c);
        bnsl.mo68405a("Error getting list of card");
        this.f90274a.countDown();
    }

    public final void onSuccess(Card[] cardArr) {
        CountDownLatch countDownLatch;
        ((bnsl) atgf.f90279a.mo68390d()).mo68405a("Retrieved list of cards successfully");
        bngs j = bngx.m109377j();
        for (Card card : cardArr) {
            j.mo67668c(atgq.m75858a(card));
        }
        try {
            atge atge = this.f90275b;
            atge.f90277b = atge.mo49929a(j.mo67664a());
            countDownLatch = this.f90274a;
        } catch (MfiClientException e) {
            this.f90275b.f90278c = new bres(brez.m113953a(e.getType(), e.getMessage()));
            countDownLatch = this.f90274a;
        } catch (InterruptedException e2) {
            this.f90275b.f90278c = new bres(atgf.f90280b);
            countDownLatch = this.f90274a;
        } catch (Throwable th) {
            this.f90274a.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
