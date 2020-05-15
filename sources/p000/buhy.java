package p000;

import android.hardware.location.NanoApp;
import android.os.Build;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: buhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhy extends buhf implements bugu {

    /* renamed from: b */
    public final long f153904b;

    /* renamed from: c */
    public final CountDownLatch f153905c = new CountDownLatch(1);

    /* renamed from: d */
    public volatile int f153906d;

    /* renamed from: e */
    private final bugn f153907e;

    /* renamed from: f */
    private final byte[] f153908f;

    public buhy(buhj buhj, String str, bugn bugn, long j, byte[] bArr) {
        super(buhj, str);
        if (bArr.length != 0) {
            this.f153907e = bugn;
            this.f153904b = j;
            this.f153908f = bArr;
            return;
        }
        throw new IllegalArgumentException("'nanoAppBinary' cannot be null or empty.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ buhe mo72662a(Object obj, Object obj2) {
        return new buhx((bugt) obj, (Integer) obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo72664b(Object obj) {
        Integer num = (Integer) obj;
        return num != null && num.intValue() == 1;
    }

    public final void run() {
        int loadNanoApp;
        buhj buhj = this.f153836a;
        int id = ((buhb) this.f153907e).f153808f.getId();
        byte[] bArr = this.f153908f;
        synchronized (buhj.f153859k) {
            int i = Build.VERSION.SDK_INT;
            loadNanoApp = buhj.f153856h.loadNanoApp(id, new NanoApp(0, bArr));
            if (loadNanoApp == 0) {
                synchronized (buhj.f153859k) {
                    if (buhj.f153860l != null) {
                        Object[] objArr = {buhj.f153860l, this};
                    }
                    buhj.f153860l = this;
                }
            }
        }
        if (loadNanoApp == 0) {
            try {
                if (!this.f153905c.await(90, TimeUnit.SECONDS)) {
                    Locale locale = Locale.US;
                    new Object[1][0] = 90L;
                    loadNanoApp = -2147483647;
                } else {
                    if (m119523a(this.f153906d)) {
                        Locale locale2 = Locale.US;
                        new Object[1][0] = Integer.valueOf(this.f153906d);
                    }
                    loadNanoApp = this.f153906d;
                }
            } catch (InterruptedException e) {
                new Object[1][0] = e;
                loadNanoApp = -1;
            }
        }
        mo72665c(Integer.valueOf(loadNanoApp));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72663a() {
        return 1;
    }
}
