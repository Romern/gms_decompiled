package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: dad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dad implements Runnable {
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            dae.f12497b = MessageDigest.getInstance("MD5");
            countDownLatch = dae.f12498c;
        } catch (NoSuchAlgorithmException e) {
            countDownLatch = dae.f12498c;
        } catch (Throwable th) {
            dae.f12498c.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
