package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: rni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rni implements rjz, rka, rlu {

    /* renamed from: a */
    public final Queue f43368a = new LinkedList();

    /* renamed from: b */
    public final rjm f43369b;

    /* renamed from: c */
    public final Set f43370c = new HashSet();

    /* renamed from: d */
    public final Map f43371d = new HashMap();

    /* renamed from: e */
    public final int f43372e;

    /* renamed from: f */
    public boolean f43373f;

    /* renamed from: g */
    public final List f43374g = new ArrayList();

    /* renamed from: h */
    final /* synthetic */ rnm f43375h;

    /* renamed from: i */
    private final rjd f43376i;

    /* renamed from: j */
    private final rkz f43377j;

    /* renamed from: k */
    private final rmc f43378k;

    /* renamed from: l */
    private final ror f43379l;

    /* renamed from: m */
    private ConnectionResult f43380m = null;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm
     arg types: [android.content.Context, android.os.Looper, sat, rjk, rni, rni]
     candidates:
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rlz, rof):rjm
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm */
    public rni(rnm rnm, rjx rjx) {
        this.f43375h = rnm;
        rjm a = rjx.f43170y.mo24654b().mo11610a(rjx.f43168w, rnm.f43405o.getLooper(), rjx.mo24747g().mo25317a(), (Object) rjx.f43171z, (rjz) this, (rka) this);
        this.f43369b = a;
        if (a instanceof sdx) {
            rjn rjn = ((sdx) a).f44080a;
            this.f43376i = null;
        } else {
            this.f43376i = a;
        }
        this.f43377j = rjx.f43162A;
        this.f43378k = new rmc();
        this.f43372e = rjx.f43164C;
        if (this.f43369b.mo12787g()) {
            this.f43379l = new ror(rnm.f43398h, rnm.f43405o, rjx.mo24747g().mo25317a());
        } else {
            this.f43379l = null;
        }
    }

    /* renamed from: a */
    private final Feature m34102a(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] t = this.f43369b.mo24652t();
            if (t == null) {
                t = new Feature[0];
            }
            int length = t.length;
            C1223np npVar = new C1223np(length);
            for (Feature feature : t) {
                npVar.put(feature.f30068a, Long.valueOf(feature.mo17676a()));
            }
            for (Feature feature2 : featureArr) {
                if (!npVar.containsKey(feature2.f30068a) || ((Long) npVar.get(feature2.f30068a)).longValue() < feature2.mo17676a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m34104b(ConnectionResult connectionResult) {
        String str;
        for (rlc rlc : this.f43370c) {
            if (sdg.m34949a(connectionResult, ConnectionResult.f30063a)) {
                str = this.f43369b.mo24651s();
            } else {
                str = null;
            }
            rlc.mo24845a(this.f43377j, connectionResult, str);
        }
        this.f43370c.clear();
    }

    /* renamed from: c */
    private final Status m34106c(ConnectionResult connectionResult) {
        String a = this.f43377j.mo24840a();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(a);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString());
    }

    /* renamed from: j */
    private final void m34108j() {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        rnm.f43405o.removeMessages(12, this.f43377j);
        Handler handler = this.f43375h.f43405o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f43377j), this.f43375h.f43397e);
    }

    /* renamed from: d */
    public final void mo24932d() {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        mo24927a(rnm.f43391a);
        this.f43378k.mo24890a(false, rnm.f43391a);
        for (rob rob : (rob[]) this.f43371d.keySet().toArray(new rob[this.f43371d.size()])) {
            mo24928a(new rkw(rob, new aucf()));
        }
        m34104b(new ConnectionResult(4));
        if (this.f43369b.mo24648p()) {
            this.f43369b.mo16783a(new rnh(this));
        }
    }

    /* renamed from: e */
    public final void mo24933e() {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        this.f43380m = null;
    }

    /* renamed from: f */
    public final ConnectionResult mo24934f() {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        return this.f43380m;
    }

    /* renamed from: g */
    public final void mo24935g() {
        if (this.f43373f) {
            rnm rnm = this.f43375h;
            Status status = rnm.f43391a;
            rnm.f43405o.removeMessages(11, this.f43377j);
            this.f43375h.f43405o.removeMessages(9, this.f43377j);
            this.f43373f = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm
     arg types: [android.content.Context, android.os.Looper, sat, aqkt, ror, ror]
     candidates:
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rlz, rof):rjm
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm */
    /* renamed from: h */
    public final void mo24936h() {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        if (!this.f43369b.mo24648p() && !this.f43369b.mo24649q()) {
            try {
                rnm rnm2 = this.f43375h;
                int a = rnm2.f43400j.mo25381a(rnm2.f43398h, this.f43369b);
                if (a != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(a, null);
                    String name = this.f43376i.getClass().getName();
                    String valueOf = String.valueOf(connectionResult);
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(valueOf);
                    Log.w("GoogleApiManager", sb.toString());
                    mo7249a(connectionResult);
                    return;
                }
                rnl rnl = new rnl(this.f43375h, this.f43369b, this.f43377j);
                if (this.f43369b.mo12787g()) {
                    ror ror = this.f43379l;
                    aqkr aqkr = ror.f43459e;
                    if (aqkr != null) {
                        aqkr.mo14032j();
                    }
                    ror.f43458d.f43970h = Integer.valueOf(System.identityHashCode(ror));
                    rjl rjl = ror.f43461g;
                    Context context = ror.f43455a;
                    Looper looper = ror.f43456b.getLooper();
                    sat sat = ror.f43458d;
                    ror.f43459e = (aqkr) rjl.mo11610a(context, looper, sat, (Object) sat.f43969g, (rjz) ror, (rka) ror);
                    ror.f43460f = rnl;
                    Set set = ror.f43457c;
                    if (set != null && !set.isEmpty()) {
                        ror.f43459e.mo47940e();
                    } else {
                        ror.f43456b.post(new rop(ror));
                    }
                }
                try {
                    this.f43369b.mo24646a(rnl);
                } catch (SecurityException e) {
                    mo24926a(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo24926a(new ConnectionResult(10), e2);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo24937i() {
        return this.f43369b.mo12787g();
    }

    /* renamed from: c */
    private final void m34107c(rkx rkx) {
        if (!(rkx instanceof rkr)) {
            m34105b(rkx);
            return;
        }
        rkr rkr = (rkr) rkx;
        Feature a = m34102a(rkr.mo24833a(this));
        if (a == null) {
            m34105b(rkx);
            return;
        }
        String name = this.f43376i.getClass().getName();
        String str = a.f30068a;
        long a2 = a.mo17676a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a2);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        rkr.mo24835a(new rkq(a));
    }

    /* renamed from: a */
    private final void m34103a(Status status, Exception exc, boolean z) {
        boolean z2;
        rnm rnm = this.f43375h;
        Status status2 = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.f43368a.iterator();
            while (it.hasNext()) {
                rkx rkx = (rkx) it.next();
                if (!z || rkx.f43199c == 2) {
                    if (status == null) {
                        rkx.mo24835a(exc);
                    } else {
                        rkx.mo24834a(status);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: b */
    private final void m34105b(rkx rkx) {
        rkx.mo24836a(this.f43378k, mo24937i());
        try {
            rkx.mo24837b(this);
        } catch (DeadObjectException e) {
            mo7244a(1);
            this.f43369b.mo14032j();
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f43376i.getClass().getName()), th);
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        if (myLooper == rnm.f43405o.getLooper()) {
            mo24925a();
        } else {
            this.f43375h.f43405o.post(new rne(this));
        }
    }

    /* renamed from: c */
    public final void mo24931c() {
        ArrayList arrayList = new ArrayList(this.f43368a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            rkx rkx = (rkx) arrayList.get(i);
            if (this.f43369b.mo24648p()) {
                m34107c(rkx);
                this.f43368a.remove(rkx);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo24925a() {
        mo24933e();
        m34104b(ConnectionResult.f30063a);
        mo24935g();
        Iterator it = this.f43371d.values().iterator();
        while (it.hasNext()) {
            roi roi = (roi) it.next();
            if (m34102a(roi.f43437a.f43436b) != null) {
                it.remove();
            } else {
                try {
                    roi.f43437a.mo24970a(this.f43376i, new aucf());
                } catch (DeadObjectException e) {
                    mo7244a(1);
                    this.f43369b.mo14032j();
                } catch (RemoteException e2) {
                    it.remove();
                }
            }
        }
        mo24931c();
        m34108j();
    }

    /* renamed from: b */
    public final void mo24930b() {
        mo24933e();
        this.f43373f = true;
        this.f43378k.mo24890a(true, rpe.f43478a);
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        Handler handler = rnm.f43405o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.f43377j), this.f43375h.f43395c);
        Handler handler2 = this.f43375h.f43405o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.f43377j), this.f43375h.f43396d);
        this.f43375h.f43400j.mo25382a();
        for (roi roi : this.f43371d.values()) {
            roi.f43439c.run();
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        Looper myLooper = Looper.myLooper();
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        if (myLooper == rnm.f43405o.getLooper()) {
            mo24930b();
        } else {
            this.f43375h.f43405o.post(new rnf(this));
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        mo24926a(connectionResult, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r3.f43375h.mo24948a(r4, r3.f43372e) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r4.f30065c == 18) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r3.f43373f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r3.f43373f == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r4 = r3.f43375h.f43405o;
        r4.sendMessageDelayed(android.os.Message.obtain(r4, 9, r3.f43377j), r3.f43375h.f43395c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        mo24927a(m34106c(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo24926a(ConnectionResult connectionResult, Exception exc) {
        aqkr aqkr;
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        ror ror = this.f43379l;
        if (!(ror == null || (aqkr = ror.f43459e) == null)) {
            aqkr.mo14032j();
        }
        mo24933e();
        this.f43375h.f43400j.mo25382a();
        m34104b(connectionResult);
        if (connectionResult.f30065c == 4) {
            mo24927a(rnm.f43392b);
        } else if (this.f43368a.isEmpty()) {
            this.f43380m = connectionResult;
        } else if (exc != null) {
            sdo.m34964a(this.f43375h.f43405o);
            m34103a(null, exc, false);
        } else if (!this.f43375h.f43406p) {
            mo24927a(m34106c(connectionResult));
        } else {
            m34103a(m34106c(connectionResult), null, true);
            if (!this.f43368a.isEmpty()) {
                synchronized (rnm.f43393f) {
                    rnm rnm2 = this.f43375h;
                    if (rnm2.f43403m != null && rnm2.f43404n.contains(this.f43377j)) {
                        this.f43375h.f43403m.mo24859b(connectionResult, this.f43372e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24927a(Status status) {
        rnm rnm = this.f43375h;
        Status status2 = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        m34103a(status, null, false);
    }

    /* renamed from: a */
    public final void mo24928a(rkx rkx) {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        if (this.f43369b.mo24648p()) {
            m34107c(rkx);
            m34108j();
            return;
        }
        this.f43368a.add(rkx);
        ConnectionResult connectionResult = this.f43380m;
        if (connectionResult == null || !connectionResult.mo17670a()) {
            mo24936h();
        } else {
            mo7249a(this.f43380m);
        }
    }

    /* renamed from: a */
    public final boolean mo24929a(boolean z) {
        rnm rnm = this.f43375h;
        Status status = rnm.f43391a;
        sdo.m34964a(rnm.f43405o);
        if (!this.f43369b.mo24648p() || this.f43371d.size() != 0) {
            return false;
        }
        rmc rmc = this.f43378k;
        if (!rmc.f43271a.isEmpty() || !rmc.f43272b.isEmpty()) {
            if (z) {
                m34108j();
            }
            return false;
        }
        this.f43369b.mo14032j();
        return true;
    }
}
