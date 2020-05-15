package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.google.android.gms.wallet.callback.CallbackOutput;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: awfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfe implements Handler.Callback {

    /* renamed from: a */
    public final AtomicInteger f94259a = new AtomicInteger(1);

    /* renamed from: b */
    public final Context f94260b;

    /* renamed from: c */
    public final Messenger f94261c;

    /* renamed from: d */
    public final aeaa f94262d;

    /* renamed from: e */
    public final String f94263e;

    /* renamed from: f */
    public final String f94264f;

    /* renamed from: g */
    public boolean f94265g = false;

    /* renamed from: h */
    public final Map f94266h = new C1223np();

    /* renamed from: i */
    public CountDownLatch f94267i = new CountDownLatch(1);

    /* renamed from: j */
    public Messenger f94268j;

    public awfe(Context context, String str, String str2) {
        this.f94264f = str2;
        this.f94263e = str;
        this.f94260b = context;
        this.f94261c = new Messenger(new adzt(Looper.getMainLooper(), this));
        this.f94262d = new awfc(this, "wallet");
    }

    /* renamed from: a */
    public static CallbackOutput m79841a(int i, int i2) {
        CallbackOutput callbackOutput = new awfa(new CallbackOutput()).f94255a;
        callbackOutput.f110031a = i2;
        callbackOutput.f110032b = i;
        return callbackOutput;
    }

    public final boolean handleMessage(Message message) {
        awfd awfd;
        if (message.what != 1) {
            return false;
        }
        int i = message.arg1;
        synchronized (this) {
            Map map = this.f94266h;
            Integer valueOf = Integer.valueOf(i);
            awfd = (awfd) map.get(valueOf);
            this.f94266h.remove(valueOf);
        }
        if (awfd != null) {
            awfd.f94258b = message.getData();
            awfd.f94257a.countDown();
        }
        return true;
    }

    /* renamed from: a */
    public static final CallbackOutput m79842a(CountDownLatch countDownLatch, long j, int i) {
        if (SystemClock.elapsedRealtime() < j) {
            try {
                if (countDownLatch.await(j - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS)) {
                    return null;
                }
            } catch (InterruptedException e) {
                return m79841a(3, i);
            }
        }
        return m79841a(2, i);
    }

    /* renamed from: a */
    public final void mo52095a() {
        synchronized (this) {
            if (this.f94265g) {
                skh.m35531a().mo25689a(this.f94260b, this.f94262d);
                this.f94265g = false;
            }
        }
    }
}
