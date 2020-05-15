package p000;

import android.util.Pair;
import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardEnableEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: atfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atfp implements CardEnableEventCallback {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f90252a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f90253b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f90254c;

    public atfp(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f90252a = atomicReference;
        this.f90253b = countDownLatch;
        this.f90254c = atomicReference2;
    }

    public final void onError(int i, String str) {
        this.f90254c.set(new MfiClientException(102, i, str));
        this.f90253b.countDown();
    }

    public final void onSuccess(Card card, Card card2) {
        this.f90252a.set(new Pair(atgq.m75858a(card), atgq.m75858a(card2)));
        this.f90253b.countDown();
    }
}
