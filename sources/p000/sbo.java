package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbo implements Handler.Callback {

    /* renamed from: a */
    public final ArrayList f44006a = new ArrayList();

    /* renamed from: b */
    final ArrayList f44007b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f44008c = new ArrayList();

    /* renamed from: d */
    public final Object f44009d = new Object();

    /* renamed from: e */
    private final sbn f44010e;

    /* renamed from: f */
    private volatile boolean f44011f = false;

    /* renamed from: g */
    private final AtomicInteger f44012g = new AtomicInteger(0);

    /* renamed from: h */
    private boolean f44013h = false;

    /* renamed from: i */
    private final Handler f44014i;

    public sbo(Looper looper, sbn sbn) {
        this.f44010e = sbn;
        this.f44014i = new adzt(looper, this);
    }

    /* renamed from: a */
    public final void mo25339a() {
        this.f44011f = false;
        this.f44012g.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo25345b() {
        this.f44011f = true;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            rjz rjz = (rjz) message.obj;
            synchronized (this.f44009d) {
                if (this.f44011f && this.f44010e.mo24912p() && this.f44006a.contains(rjz)) {
                    rjz.mo7257g(this.f44010e.mo16784m());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    /* renamed from: a */
    public final void mo25340a(int i) {
        sdo.m34965a(this.f44014i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f44014i.removeMessages(1);
        synchronized (this.f44009d) {
            this.f44013h = true;
            ArrayList arrayList = new ArrayList(this.f44006a);
            int i2 = this.f44012g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rjz rjz = (rjz) it.next();
                if (this.f44011f) {
                    if (this.f44012g.get() != i2) {
                        break;
                    } else if (this.f44006a.contains(rjz)) {
                        rjz.mo7244a(i);
                    }
                } else {
                    break;
                }
            }
            this.f44007b.clear();
            this.f44013h = false;
        }
    }

    /* renamed from: b */
    public final void mo25346b(rjz rjz) {
        sdo.m34959a(rjz);
        synchronized (this.f44009d) {
            if (!this.f44006a.remove(rjz)) {
                String valueOf = String.valueOf(rjz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            } else if (this.f44013h) {
                this.f44007b.add(rjz);
            }
        }
    }

    /* renamed from: a */
    public final void mo25341a(Bundle bundle) {
        sdo.m34965a(this.f44014i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f44009d) {
            boolean z = true;
            sdo.m34970a(!this.f44013h);
            this.f44014i.removeMessages(1);
            this.f44013h = true;
            if (this.f44007b.size() != 0) {
                z = false;
            }
            sdo.m34970a(z);
            ArrayList arrayList = new ArrayList(this.f44006a);
            int i = this.f44012g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rjz rjz = (rjz) it.next();
                if (this.f44011f) {
                    if (!this.f44010e.mo24912p() || this.f44012g.get() != i) {
                        break;
                    } else if (!this.f44007b.contains(rjz)) {
                        rjz.mo7257g(bundle);
                    }
                } else {
                    break;
                }
            }
            this.f44007b.clear();
            this.f44013h = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo25342a(ConnectionResult connectionResult) {
        sdo.m34965a(this.f44014i, "onConnectionFailure must only be called on the Handler thread");
        this.f44014i.removeMessages(1);
        synchronized (this.f44009d) {
            ArrayList arrayList = new ArrayList(this.f44008c);
            int i = this.f44012g.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rka rka = (rka) it.next();
                if (this.f44011f && this.f44012g.get() == i) {
                    if (this.f44008c.contains(rka)) {
                        rka.mo7249a(connectionResult);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25343a(rjz rjz) {
        sdo.m34959a(rjz);
        synchronized (this.f44009d) {
            if (this.f44006a.contains(rjz)) {
                String valueOf = String.valueOf(rjz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f44006a.add(rjz);
            }
        }
        if (this.f44010e.mo24912p()) {
            Handler handler = this.f44014i;
            handler.sendMessage(handler.obtainMessage(1, rjz));
        }
    }

    /* renamed from: a */
    public final void mo25344a(rka rka) {
        sdo.m34959a(rka);
        synchronized (this.f44009d) {
            if (this.f44008c.contains(rka)) {
                String valueOf = String.valueOf(rka);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f44008c.add(rka);
            }
        }
    }
}
