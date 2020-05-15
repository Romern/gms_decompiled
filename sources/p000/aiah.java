package p000;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aiah */
public final /* synthetic */ class aiah implements Runnable {

    /* renamed from: a */
    private final DiscoveryChimeraService f68565a;

    public aiah(DiscoveryChimeraService discoveryChimeraService) {
        this.f68565a = discoveryChimeraService;
    }

    public final void run() {
        DiscoveryChimeraService discoveryChimeraService = this.f68565a;
        srn srn = ahsd.f67925a;
        aics aics = discoveryChimeraService.f80539j;
        if (ahfo.m55646a(aics.f68708e) && cfoj.m141550ae()) {
            ahzi ahzi = aics.f68715l;
            if (ahzi.mo37314f()) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairScanner2: Scanner was already started; skipping for now");
            } else if (ahzi.mo37309a()) {
                ahzi.mo37310b();
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        try {
            aics.f68704a.mo72982a(new aici(aics, "FastPairControllerOnCreate", atomicReference));
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: OnCreate: Fail to register listeners");
        }
        List<CountDownLatch> list = (List) atomicReference.get();
        if (list != null) {
            System.currentTimeMillis();
            for (CountDownLatch countDownLatch : list) {
                try {
                    countDownLatch.await(cfog.m141274b(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68405a("FastPair: OnCreate: Interrupted when countdown");
                }
            }
            System.currentTimeMillis();
        }
    }
}
