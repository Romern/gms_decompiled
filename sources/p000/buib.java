package p000;

import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: buib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buib extends buhf implements bugu {

    /* renamed from: b */
    public final int f153919b;

    /* renamed from: c */
    public final CountDownLatch f153920c = new CountDownLatch(1);

    /* renamed from: d */
    public volatile int f153921d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ buhe mo72662a(Object obj, Object obj2) {
        return new buia((bugt) obj, (Integer) obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo72664b(Object obj) {
        Integer num = (Integer) obj;
        return num != null && num.intValue() == 1;
    }

    public final void run() {
        int unloadNanoApp;
        buhj buhj = this.f153836a;
        synchronized (buhj.f153859k) {
            unloadNanoApp = buhj.f153856h.unloadNanoApp(this.f153919b);
            if (unloadNanoApp == 0) {
                synchronized (buhj.f153859k) {
                    if (buhj.f153861m != null) {
                        Object[] objArr = {buhj.f153861m, this};
                    }
                    buhj.f153861m = this;
                }
            }
        }
        if (unloadNanoApp == 0) {
            try {
                if (!this.f153920c.await(90, TimeUnit.SECONDS)) {
                    Locale locale = Locale.US;
                    new Object[1][0] = 90L;
                    unloadNanoApp = -2147483647;
                } else {
                    unloadNanoApp = this.f153921d;
                }
            } catch (InterruptedException e) {
                new Object[1][0] = e;
                unloadNanoApp = -1;
            }
        }
        mo72665c(Integer.valueOf(unloadNanoApp));
    }

    public buib(buhj buhj, String str, int i) {
        super(buhj, str);
        this.f153919b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72663a() {
        return 1;
    }
}
