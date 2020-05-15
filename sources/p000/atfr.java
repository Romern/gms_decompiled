package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardDisableEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atfr implements CardDisableEventCallback {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f90256a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f90257b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f90258c;

    public atfr(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f90256a = atomicReference;
        this.f90257b = countDownLatch;
        this.f90258c = atomicReference2;
    }

    public final void onError(int i, String str) {
        this.f90258c.set(new MfiClientException(102, i, str));
        this.f90257b.countDown();
    }

    public final void onSuccess(Card card) {
        this.f90256a.set(atgq.m75858a(card));
        this.f90257b.countDown();
    }
}
