package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: rly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rly implements rnv {

    /* renamed from: a */
    public final rnb f43253a;

    /* renamed from: b */
    public final rnb f43254b;

    /* renamed from: c */
    public Bundle f43255c;

    /* renamed from: d */
    public ConnectionResult f43256d = null;

    /* renamed from: e */
    public ConnectionResult f43257e = null;

    /* renamed from: f */
    public boolean f43258f = false;

    /* renamed from: g */
    public final Lock f43259g;

    /* renamed from: h */
    private final Context f43260h;

    /* renamed from: i */
    private final rmx f43261i;

    /* renamed from: j */
    private final Looper f43262j;

    /* renamed from: k */
    private final Map f43263k;

    /* renamed from: l */
    private final Set f43264l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: m */
    private final rjm f43265m;

    /* renamed from: n */
    private int f43266n = 0;

    public rly(Context context, rmx rmx, Lock lock, Looper looper, rfj rfj, Map map, Map map2, sat sat, rjl rjl, rjm rjm, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f43260h = context;
        this.f43261i = rmx;
        this.f43259g = lock;
        this.f43262j = looper;
        this.f43265m = rjm;
        this.f43253a = new rnb(context, this.f43261i, lock, looper, rfj, map2, null, map4, null, arrayList2, new rlw(this));
        this.f43254b = new rnb(context, this.f43261i, lock, looper, rfj, map, sat, map3, rjl, arrayList, new rlx(this));
        C1223np npVar = new C1223np();
        for (rje rje : map2.keySet()) {
            npVar.put(rje, this.f43253a);
        }
        for (rje rje2 : map.keySet()) {
            npVar.put(rje2, this.f43254b);
        }
        this.f43263k = Collections.unmodifiableMap(npVar);
    }

    /* renamed from: a */
    private final void m33950a(ConnectionResult connectionResult) {
        int i = this.f43266n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f43266n = 0;
            }
            this.f43261i.mo24875a(connectionResult);
        }
        m33953i();
        this.f43266n = 0;
    }

    /* renamed from: b */
    private static boolean m33951b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo17671b();
    }

    /* renamed from: c */
    private final boolean m33952c(rle rle) {
        rje rje = rle.f43219d;
        sdo.m34975b(this.f43263k.containsKey(rje), "GoogleApiClient is not configured to use the API required for this call.");
        return ((rnb) this.f43263k.get(rje)).equals(this.f43254b);
    }

    /* renamed from: i */
    private final void m33953i() {
        for (ico ico : this.f43264l) {
            ico.f20745c.release();
        }
        this.f43264l.clear();
    }

    /* renamed from: j */
    private final boolean m33954j() {
        ConnectionResult connectionResult = this.f43257e;
        return connectionResult != null && connectionResult.f30065c == 4;
    }

    /* renamed from: k */
    private final PendingIntent m33955k() {
        if (this.f43265m != null) {
            return PendingIntent.getActivity(this.f43260h, System.identityHashCode(this.f43261i), this.f43265m.mo12924i(), 134217728);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo24885d() {
        this.f43259g.lock();
        try {
            boolean z = false;
            if (this.f43253a.mo24885d()) {
                if (mo24888g() || m33954j()) {
                    z = true;
                } else if (this.f43266n == 1) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f43259g.unlock();
        }
    }

    /* renamed from: e */
    public final boolean mo24886e() {
        boolean z;
        this.f43259g.lock();
        try {
            if (this.f43266n == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f43259g.unlock();
        }
    }

    /* renamed from: f */
    public final void mo24887f() {
        this.f43259g.lock();
        try {
            boolean e = mo24886e();
            this.f43254b.mo24884c();
            this.f43257e = new ConnectionResult(4);
            if (e) {
                new adzt(this.f43262j).post(new rlv(this));
            } else {
                m33953i();
            }
        } finally {
            this.f43259g.unlock();
        }
    }

    /* renamed from: g */
    public final boolean mo24888g() {
        return this.f43254b.mo24885d();
    }

    /* renamed from: h */
    public final void mo24889h() {
        ConnectionResult connectionResult;
        if (m33951b(this.f43256d)) {
            if (!m33951b(this.f43257e) && !m33954j()) {
                ConnectionResult connectionResult2 = this.f43257e;
                if (connectionResult2 == null) {
                    return;
                }
                if (this.f43266n != 1) {
                    m33950a(connectionResult2);
                    this.f43253a.mo24884c();
                    return;
                }
                m33953i();
                return;
            }
            int i = this.f43266n;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    this.f43266n = 0;
                }
                this.f43261i.mo24874a(this.f43255c);
            }
            m33953i();
            this.f43266n = 0;
        } else if (this.f43256d == null || !m33951b(this.f43257e)) {
            ConnectionResult connectionResult3 = this.f43256d;
            if (connectionResult3 != null && (connectionResult = this.f43257e) != null) {
                if (this.f43254b.f43357k < this.f43253a.f43357k) {
                    connectionResult3 = connectionResult;
                }
                m33950a(connectionResult3);
            }
        } else {
            this.f43254b.mo24884c();
            m33950a(this.f43256d);
        }
    }

    /* renamed from: b */
    public final ConnectionResult mo24882b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final rle mo24883b(rle rle) {
        if (!m33952c(rle)) {
            return this.f43253a.mo24883b(rle);
        }
        if (!m33954j()) {
            return this.f43254b.mo24883b(rle);
        }
        rle.mo9481a(new Status(4, null, m33955k()));
        return rle;
    }

    /* renamed from: a */
    public final ConnectionResult mo24876a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo24884c() {
        this.f43257e = null;
        this.f43256d = null;
        this.f43266n = 0;
        this.f43253a.mo24884c();
        this.f43254b.mo24884c();
        m33953i();
    }

    /* renamed from: a */
    public final rle mo24877a(rle rle) {
        if (!m33952c(rle)) {
            this.f43253a.mo24877a(rle);
            return rle;
        } else if (m33954j()) {
            rle.mo9481a(new Status(4, null, m33955k()));
            return rle;
        } else {
            this.f43254b.mo24877a(rle);
            return rle;
        }
    }

    /* renamed from: a */
    public final void mo24878a() {
        this.f43266n = 2;
        this.f43258f = false;
        this.f43257e = null;
        this.f43256d = null;
        this.f43253a.mo24878a();
        this.f43254b.mo24878a();
    }

    /* renamed from: a */
    public final void mo24879a(int i) {
        this.f43261i.mo24873a(i);
        this.f43257e = null;
        this.f43256d = null;
    }

    /* renamed from: a */
    public final void mo24880a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append((CharSequence) "authClient").println(":");
        this.f43254b.mo24880a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append((CharSequence) "anonClient").println(":");
        this.f43253a.mo24880a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public final boolean mo24881a(ico ico) {
        this.f43259g.lock();
        try {
            if ((mo24886e() || mo24885d()) && !mo24888g()) {
                this.f43264l.add(ico);
                if (this.f43266n == 0) {
                    this.f43266n = 1;
                }
                this.f43257e = null;
                this.f43254b.mo24878a();
                return true;
            }
            this.f43259g.unlock();
            return false;
        } finally {
            this.f43259g.unlock();
        }
    }
}
