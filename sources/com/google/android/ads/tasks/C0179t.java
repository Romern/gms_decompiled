package com.google.android.ads.tasks;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.ads.tasks.t */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0179t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0180u f7585a;

    public C0179t(C0180u uVar) {
        this.f7585a = uVar;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        C0180u uVar = this.f7585a;
        try {
            dca dca = uVar.f7586a;
            Class loadClass = dca.f12767c.loadClass(uVar.mo5039a(dca.f12769e, uVar.f7587b));
            if (loadClass != null) {
                uVar.f7589d = loadClass.getMethod(uVar.mo5039a(uVar.f7586a.f12769e, uVar.f7588c), uVar.f7590e);
                if (uVar.f7589d != null) {
                    countDownLatch = uVar.f7591f;
                    countDownLatch.countDown();
                }
            }
        } catch (dbg | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException e) {
        } catch (NullPointerException e2) {
            countDownLatch = uVar.f7591f;
        } catch (Throwable th) {
            uVar.f7591f.countDown();
            throw th;
        }
        countDownLatch = uVar.f7591f;
        countDownLatch.countDown();
    }
}
