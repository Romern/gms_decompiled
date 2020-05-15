package p000;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.NanoAppMessage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: buhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhz implements Runnable, bugu {

    /* renamed from: a */
    private final ContextHubInfo f153909a;

    /* renamed from: b */
    private final bugr f153910b;

    /* renamed from: c */
    private final int f153911c;

    /* renamed from: d */
    private final int f153912d;

    /* renamed from: e */
    private final int f153913e;

    /* renamed from: f */
    private final byte[] f153914f;

    /* renamed from: g */
    private final CountDownLatch f153915g = new CountDownLatch(1);

    /* renamed from: h */
    private int f153916h;

    /* renamed from: i */
    private bugt f153917i;

    /* renamed from: j */
    private final ContextHubClient f153918j;

    /* renamed from: a */
    private final synchronized void m119556a() {
        bugt bugt = this.f153917i;
        if (bugt != null) {
            bugt.mo61879a(this.f153916h);
        }
    }

    /* renamed from: b */
    private final synchronized void m119558b() {
        this.f153915g.countDown();
        m119556a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.f153915g.await();
        return Integer.valueOf(this.f153916h);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f153915g.getCount() == 0;
    }

    public final void run() {
        buhu buhu = new buhu(this.f153914f, this.f153911c, this.f153912d, this.f153913e, this.f153909a.getMaxPacketLengthBytes());
        this.f153916h = 0;
        while (buhu.mo72693a() && this.f153916h == 0) {
            byte[] b = buhu.mo72694b();
            this.f153916h = this.f153918j.sendMessageToNanoApp(NanoAppMessage.createMessageToNanoApp(((buhc) this.f153910b).f153823a, this.f153912d, b)) != 0 ? -1 : 0;
        }
        m119558b();
    }

    public buhz(ContextHubClient contextHubClient, ContextHubInfo contextHubInfo, bugr bugr, int i, int i2, int i3, byte[] bArr) {
        this.f153909a = contextHubInfo;
        this.f153910b = bugr;
        this.f153911c = i;
        this.f153912d = i2;
        this.f153913e = i3;
        this.f153914f = bArr;
        this.f153918j = contextHubClient;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void mo72638a(bugt bugt) {
        this.f153917i = bugt;
        if (isDone()) {
            m119556a();
        }
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (this.f153915g.await(j, timeUnit)) {
            return Integer.valueOf(this.f153916h);
        }
        throw new TimeoutException("Timed out while waiting for message");
    }
}
