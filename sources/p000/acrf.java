package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acrf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ acrg f60597a;

    public acrf(acrg acrg) {
        this.f60597a = acrg;
    }

    public final void run() {
        try {
            aucu.m76783a(rfi.f42868a.mo24582a(this.f60597a.f60598b, new rkc[0]).mo50364a(rff.f42864a), 5000, TimeUnit.MILLISECONDS);
            this.f60597a.f60599c.mo32453b(16003);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f60597a.f60599c.mo32453b(16005);
        }
    }
}
