package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: bexd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexd {

    /* renamed from: a */
    private static bexa f112883a;

    /* renamed from: a */
    public static synchronized bexa m96011a() {
        bexa bexa;
        synchronized (bexd.class) {
            bexa = f112883a;
        }
        return bexa;
    }

    /* renamed from: a */
    public static synchronized void m96012a(Context context, bgmm bgmm, bgml bgml, bfor bfor) {
        synchronized (bexd.class) {
            bfmf a = bfmf.m97226a(bgml.mo63006b(), (bhdb) null);
            ExecutorService executorService = ((bgji) bgmm).f116607b;
            bexb bexb = new bexb(context);
            Account[] a2 = adyd.m51363a(context).mo33916a("com.google");
            String[] strArr = new String[a2.length];
            for (int i = 0; i < a2.length; i++) {
                strArr[i] = a2[i].name;
            }
            f112883a = new bexa(context, a, executorService, bexb, strArr, bfor);
        }
    }
}
