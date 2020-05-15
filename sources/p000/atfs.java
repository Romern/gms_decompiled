package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atfs extends atge {

    /* renamed from: a */
    final /* synthetic */ String f90259a;

    public atfs(String str) {
        this.f90259a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo49929a(bngx bngx) {
        atgp atgp;
        bnre i = bngx.listIterator();
        while (true) {
            if (!i.hasNext()) {
                atgp = null;
                break;
            }
            atgp = (atgp) i.next();
            if (atgp.mo49964a().getCid().equals(this.f90259a)) {
                break;
            }
        }
        if (atgp != null) {
            srn srn = atgf.f90279a;
            atgp.mo49964a().getCid();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            atgp.mo49965a(new atfr(atomicReference, countDownLatch, atomicReference2));
            countDownLatch.await();
            MfiClientException mfiClientException = (MfiClientException) atomicReference2.get();
            if (mfiClientException == null) {
                return (atgp) atomicReference.get();
            }
            throw mfiClientException;
        }
        ((bnsl) atgf.f90279a.mo68387b()).mo68405a("Could not find card to disable on MFI");
        return null;
    }
}
