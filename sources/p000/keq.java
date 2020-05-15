package p000;

import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: keq */
final /* synthetic */ class keq implements Callable {

    /* renamed from: a */
    private final C1130key f23946a;

    /* renamed from: b */
    private final Future f23947b;

    public keq(C1130key key, Future future) {
        this.f23946a = key;
        this.f23947b = future;
    }

    public final Object call() {
        C1130key key = this.f23946a;
        try {
            byte[] bArr = (byte[]) this.f23947b.get();
            if (bArr != null) {
                return bmxv.m108566b(new kek(key.f23958c.mo14435a(bArr)));
            }
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) C1130key.f23956a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Interrupted while retrieving cached data for datasource.");
        } catch (ExecutionException e2) {
            if (!(e2.getCause() instanceof FileNotFoundException)) {
                bnsl bnsl2 = (bnsl) C1130key.f23956a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Failed to retrieve cached data for datasource.");
            }
        } catch (kev e3) {
            bnsl bnsl3 = (bnsl) C1130key.f23956a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68405a("Failed to decode cached data for datasource.");
        }
        return bmvz.f131120a;
    }
}
