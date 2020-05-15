package p000;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: bzsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsh implements Callable {

    /* renamed from: a */
    final /* synthetic */ bzsj f171248a;

    public bzsh(bzsj bzsj) {
        this.f171248a = bzsj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1 A[Catch:{ bzss -> 0x011e, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c7 A[Catch:{ bzss -> 0x011e, all -> 0x010f }] */
    public final /* bridge */ /* synthetic */ Object call() {
        bzst bzst;
        bqgg a;
        try {
            bzsj bzsj = this.f171248a;
            synchronized (bzsj) {
                bzsu bzsu = bzsj.f171258h;
                if (bzsu != null) {
                    bzsu.mo19706a();
                }
            }
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 70; i++) {
                sb.append(bzsj.f171251a[random.nextInt(bzsj.f171251a.length)]);
            }
            String sb2 = sb.toString();
            bzsa bzsa = new bzsa();
            bzsa bzsa2 = new bzsa();
            for (String str : bzsj.f171254d.mo74558a()) {
                if (!str.toLowerCase().startsWith("content-")) {
                    bzsa2.mo74559a(str, bzsj.f171254d.mo74563c(str));
                } else {
                    bzsa.mo74559a(str, bzsj.f171254d.mo74563c(str));
                }
            }
            bzsg bzsg = new bzsg(sb2, bzsj.f171255e, bzsa, bzsj.f171256f, bzsj.f171257g);
            bzsa2.mo74559a("X-Goog-Upload-Protocol", "multipart");
            String valueOf = String.valueOf(sb2);
            bzsa2.mo74559a("Content-Type", valueOf.length() == 0 ? new String("multipart/related; boundary=") : "multipart/related; boundary=".concat(valueOf));
            bzsq a2 = bzse.m126112a(bzsj.f171252b, bzsj.f171253c, bzsa2, bzsg);
            if (bzsj.f171258h != null) {
                synchronized (bzsj) {
                    a2.mo74568a(new bzsi(bzsj, bzsj.f171258h), bzsj.f171259i);
                }
            }
            synchronized (bzsj) {
                a = a2.mo74567a();
            }
            try {
                bzst bzst2 = (bzst) a.get();
                if (bzst2.mo74577a()) {
                    if (bzst2.f171295a.f171294a != bzsr.CANCELED) {
                        throw bzst2.f171295a;
                    }
                }
                bzst = new bzst(bzst2.f171296b);
            } catch (InterruptedException e) {
                e = e;
                String valueOf2 = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf2.length() != 0 ? new String("Unexpected error occurred: ") : "Unexpected error occurred: ".concat(valueOf2));
            } catch (ExecutionException e2) {
                e = e2;
                String valueOf22 = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf22.length() != 0 ? new String("Unexpected error occurred: ") : "Unexpected error occurred: ".concat(valueOf22));
            }
        } catch (bzss e3) {
            bzst = new bzst(e3);
        } catch (Throwable th) {
            bzst = new bzst(new bzss(bzsr.UNKNOWN, th));
        }
        synchronized (this.f171248a) {
            if (this.f171248a.f171258h != null) {
                if (!bzst.mo74578b()) {
                    bzsj bzsj2 = this.f171248a;
                    bzsj2.f171258h.mo19709a(bzsj2, bzst.f171295a);
                } else {
                    bzsj bzsj3 = this.f171248a;
                    bzsj3.f171258h.mo19708a(bzsj3, bzst.f171296b);
                }
            }
        }
        return bzst;
    }
}
