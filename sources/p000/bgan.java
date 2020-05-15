package p000;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bgan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgan {

    /* renamed from: F */
    public final String f115900F;

    /* renamed from: G */
    public final asfb f115901G;

    /* renamed from: H */
    public int f115902H;

    /* renamed from: I */
    public final Object f115903I = new Object();

    /* renamed from: J */
    public int f115904J;

    /* renamed from: K */
    public bgal f115905K;

    /* renamed from: L */
    public HandlerThread f115906L;

    /* renamed from: a */
    private final LinkedList f115907a = new LinkedList();

    public bgan(String str, asfb asfb) {
        new AtomicInteger();
        this.f115904J = 0;
        HandlerThread handlerThread = new HandlerThread(str);
        this.f115906L = handlerThread;
        handlerThread.start();
        Looper looper = this.f115906L.getLooper();
        this.f115900F = str;
        this.f115901G = asfb;
        this.f115905K = new bgal(looper, this);
    }

    /* renamed from: d */
    private final Message m98399d(Message message) {
        if (!mo62548b()) {
            return message;
        }
        synchronized (this.f115903I) {
            this.f115902H++;
            if (mo62548b()) {
                this.f115901G.mo49111a(10000);
            }
        }
        return mo62541a(-4, message);
    }

    /* renamed from: a */
    public final Message mo62541a(int i, Object obj) {
        return Message.obtain(this.f115905K, i, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62507a() {
    }

    /* renamed from: b */
    public final void mo62544b(int i) {
        synchronized (this.f115907a) {
            ListIterator listIterator = this.f115907a.listIterator();
            while (listIterator.hasNext()) {
                bgam bgam = (bgam) listIterator.next();
                int i2 = bgam.f115899b;
                if (i >= 0) {
                    CountDownLatch countDownLatch = bgam.f115898a;
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62547b(bgaf bgaf) {
        this.f115905K.f115891l = bgaf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo62548b() {
        return this.f115901G != null;
    }

    /* renamed from: c */
    public final Message mo62549c(int i) {
        return Message.obtain(this.f115905K, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo62506a(int i) {
        if (i == -4) {
            return "SM_WRAPPED_MESSAGE";
        }
        if (i == -3) {
            return "SM_WAIT_IDLE_CMD";
        }
        if (i == -2) {
            return "SM_INIT_CMD";
        }
        if (i == -1) {
            return "SM_QUIT_CMD";
        }
        return i + "(0x" + Integer.toHexString(i) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bgaf mo62550c() {
        bgal bgal = this.f115905K;
        if (bgal != null) {
            return bgal.f115884d[bgal.f115885e].f115878a;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo62545b(int i, Object obj) {
        mo62546b(mo62541a(i, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62542a(Message message) {
        bgal bgal = this.f115905K;
        boolean z = bgal.f115882a;
        Message obtainMessage = bgal.obtainMessage();
        obtainMessage.copyFrom(message);
        bgal.f115892m.add(obtainMessage);
    }

    /* renamed from: b */
    public final void mo62546b(Message message) {
        bgal bgal = this.f115905K;
        if (bgal != null) {
            bgal.sendMessage(m98399d(message));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62551c(Message message) {
        bgal bgal = this.f115905K;
        if (bgal != null) {
            bgal.mo33957d(m98399d(message));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62552d() {
        mo62551c(mo62549c(8));
    }

    /* renamed from: d */
    public final void mo62553d(int i) {
        mo62546b(mo62549c(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62543a(bgaf bgaf) {
        this.f115905K.mo62539a(bgaf);
    }
}
