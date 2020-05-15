package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* renamed from: bzsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsc implements Callable {

    /* renamed from: a */
    final /* synthetic */ bzsd f171223a;

    public bzsc(bzsd bzsd) {
        this.f171223a = bzsd;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bzsd bzsd;
        bzsb bzsb;
        try {
            bzsd = this.f171223a;
            synchronized (bzsd) {
                bzsu bzsu = bzsd.f171228e;
                if (bzsu != null) {
                    bzsu.mo19706a();
                }
            }
            OutputStream outputStream = bzsd.f171224a.getOutputStream();
            bzsd.f171224a.connect();
            if (bzsd.f171225b == null) {
                bzsb = bzsd.mo74569b();
            } else {
                System.currentTimeMillis();
                int i = 0;
                while (bzsd.mo74570c()) {
                    int i2 = 0;
                    while (i2 < 65536 && bzsd.mo74570c()) {
                        int a = bzsd.f171225b.mo20316a(bzsd.f171226c, i2, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE - i2);
                        bzsd.f171227d += (long) a;
                        i2 += a;
                        try {
                            outputStream.write(bzsd.f171226c, i2 - a, a);
                        } catch (IOException e) {
                            bzsb = bzsd.mo74569b();
                        }
                    }
                    i += i2;
                    if (i >= bzsd.f171229f) {
                        synchronized (bzsd) {
                            bzsu bzsu2 = bzsd.f171228e;
                            if (bzsu2 != null) {
                                bzsu2.mo19707a(bzsd);
                            }
                        }
                        i = 0;
                    }
                }
                bzsb = bzsd.mo74569b();
            }
        } catch (FileNotFoundException e2) {
            throw new bzss(bzsr.BAD_URL, e2);
        } catch (IOException e3) {
            bzsb = bzsd.mo74569b();
        } catch (bzss e4) {
            throw new bzss(bzsr.CONNECTION_ERROR, e3);
        } catch (IOException e5) {
            throw new bzss(bzsr.REQUEST_BODY_READ_ERROR, e5);
        } catch (bzss e6) {
            synchronized (this.f171223a) {
                bzsd bzsd2 = this.f171223a;
                bzsu bzsu3 = bzsd2.f171228e;
                if (bzsu3 != null) {
                    bzsu3.mo19709a(bzsd2, e6);
                }
                return new bzst(e6);
            }
        }
        synchronized (this.f171223a) {
            bzsd bzsd3 = this.f171223a;
            bzsu bzsu4 = bzsd3.f171228e;
            if (bzsu4 != null) {
                bzsu4.mo19708a(bzsd3, bzsb);
            }
        }
        return new bzst(bzsb);
    }
}
