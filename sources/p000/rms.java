package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: rms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rms implements rmy {

    /* renamed from: a */
    public final rnb f43296a;

    /* renamed from: b */
    public final Lock f43297b;

    /* renamed from: c */
    public final Context f43298c;

    /* renamed from: d */
    public final rfj f43299d;

    /* renamed from: e */
    public aqkr f43300e;

    /* renamed from: f */
    public boolean f43301f;

    /* renamed from: g */
    public boolean f43302g;

    /* renamed from: h */
    public scb f43303h;

    /* renamed from: i */
    public boolean f43304i;

    /* renamed from: j */
    public boolean f43305j;

    /* renamed from: k */
    public final sat f43306k;

    /* renamed from: l */
    private ConnectionResult f43307l;

    /* renamed from: m */
    private int f43308m;

    /* renamed from: n */
    private int f43309n = 0;

    /* renamed from: o */
    private int f43310o;

    /* renamed from: p */
    private final Bundle f43311p = new Bundle();

    /* renamed from: q */
    private final Set f43312q = new HashSet();

    /* renamed from: r */
    private boolean f43313r;

    /* renamed from: s */
    private final Map f43314s;

    /* renamed from: t */
    private final ArrayList f43315t = new ArrayList();

    /* renamed from: u */
    private final rjl f43316u;

    public rms(rnb rnb, sat sat, Map map, rfj rfj, rjl rjl, Lock lock, Context context) {
        this.f43296a = rnb;
        this.f43306k = sat;
        this.f43314s = map;
        this.f43299d = rfj;
        this.f43316u = rjl;
        this.f43297b = lock;
        this.f43298c = context;
    }

    /* renamed from: a */
    private final void m34015a(boolean z) {
        aqkr aqkr = this.f43300e;
        if (aqkr != null) {
            if (aqkr.mo24648p() && z) {
                this.f43300e.mo47939c();
            }
            this.f43300e.mo14032j();
            this.f43303h = null;
        }
    }

    /* renamed from: c */
    private static final String m34016c(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private final void m34017g() {
        rnb rnb = this.f43296a;
        rnb.f43347a.lock();
        try {
            rnb.f43358l.mo24916m();
            rnb.f43356j = new rmh(rnb);
            rnb.f43356j.mo24893a();
            rnb.f43348b.signalAll();
            rnb.f43347a.unlock();
            rnc.f43362a.execute(new rmi(this));
            aqkr aqkr = this.f43300e;
            if (aqkr != null) {
                if (this.f43304i) {
                    aqkr.mo47938a(this.f43303h, this.f43305j);
                }
                m34015a(false);
            }
            for (rje rje : this.f43296a.f43353g.keySet()) {
                ((rjm) this.f43296a.f43352f.get(rje)).mo14032j();
            }
            this.f43296a.f43359m.mo24874a(!this.f43311p.isEmpty() ? this.f43311p : null);
        } catch (Throwable th) {
            rnb.f43347a.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    private final void m34018h() {
        ArrayList arrayList = this.f43315t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f43315t.clear();
    }

    /* renamed from: b */
    public final void mo24906b(ConnectionResult connectionResult) {
        m34018h();
        m34015a(!connectionResult.mo17670a());
        this.f43296a.mo24919a(connectionResult);
        this.f43296a.f43359m.mo24875a(connectionResult);
    }

    /* renamed from: c */
    public final void mo24899c() {
    }

    /* renamed from: d */
    public final boolean mo24909d() {
        int i = this.f43310o - 1;
        this.f43310o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f43296a.f43358l.mo24917n());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo24906b(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f43307l;
        if (connectionResult == null) {
            return true;
        }
        this.f43296a.f43357k = this.f43308m;
        mo24906b(connectionResult);
        return false;
    }

    /* renamed from: e */
    public final void mo24910e() {
        if (this.f43310o != 0) {
            return;
        }
        if (!this.f43301f || this.f43302g) {
            ArrayList arrayList = new ArrayList();
            this.f43309n = 1;
            Map map = this.f43296a.f43352f;
            this.f43310o = ((C1245ok) map).f26809h;
            for (rje rje : map.keySet()) {
                if (!this.f43296a.f43353g.containsKey(rje)) {
                    arrayList.add((rjm) this.f43296a.f43352f.get(rje));
                } else if (mo24909d()) {
                    m34017g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.f43315t.add(rnc.f43362a.submit(new rmn(this, arrayList)));
            }
        }
    }

    /* renamed from: f */
    public final void mo24911f() {
        this.f43301f = false;
        this.f43296a.f43358l.f43328h = Collections.emptySet();
        for (rje rje : this.f43312q) {
            if (!this.f43296a.f43353g.containsKey(rje)) {
                this.f43296a.f43353g.put(rje, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: a */
    public final rle mo24892a(rle rle) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm
     arg types: [android.content.Context, android.os.Looper, sat, aqkt, rmq, rmq]
     candidates:
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rlz, rof):rjm
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm */
    /* renamed from: a */
    public final void mo24893a() {
        boolean z;
        this.f43296a.f43353g.clear();
        this.f43301f = false;
        this.f43307l = null;
        this.f43309n = 0;
        this.f43313r = true;
        this.f43302g = false;
        this.f43304i = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (rjo rjo : this.f43314s.keySet()) {
            rjm rjm = (rjm) this.f43296a.f43352f.get(rjo.mo24653a());
            if (rjo.f43150b.mo16731a() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.f43314s.get(rjo)).booleanValue();
            if (rjm.mo12787g()) {
                this.f43301f = true;
                if (booleanValue) {
                    this.f43312q.add(rjo.mo24653a());
                } else {
                    this.f43313r = false;
                }
            }
            hashMap.put(rjm, new rmj(this, rjo, booleanValue));
        }
        if (z2) {
            this.f43301f = false;
        }
        if (this.f43301f) {
            this.f43306k.f43970h = Integer.valueOf(System.identityHashCode(this.f43296a.f43358l));
            rmq rmq = new rmq(this);
            rjl rjl = this.f43316u;
            Context context = this.f43298c;
            Looper looper = this.f43296a.f43358l.f43324d;
            sat sat = this.f43306k;
            this.f43300e = (aqkr) rjl.mo11610a(context, looper, sat, (Object) sat.f43969g, (rjz) rmq, (rka) rmq);
        }
        this.f43310o = ((C1245ok) this.f43296a.f43352f).f26809h;
        this.f43315t.add(rnc.f43362a.submit(new rmm(this, hashMap)));
    }

    /* renamed from: b */
    public final void mo24907b(ConnectionResult connectionResult, rjo rjo, boolean z) {
        int a = rjo.f43150b.mo16731a();
        if ((!z || connectionResult.mo17670a() || this.f43299d.mo24591b(null, connectionResult.f30065c, null) != null) && (this.f43307l == null || a < this.f43308m)) {
            this.f43307l = connectionResult;
            this.f43308m = a;
        }
        this.f43296a.f43353g.put(rjo.mo24653a(), connectionResult);
    }

    /* renamed from: b */
    public final void mo24897b(rle rle) {
        this.f43296a.f43358l.f43325e.add(rle);
    }

    /* renamed from: b */
    public final boolean mo24898b() {
        m34018h();
        m34015a(true);
        this.f43296a.mo24919a((ConnectionResult) null);
        return true;
    }

    /* renamed from: b */
    public final boolean mo24908b(int i) {
        if (this.f43309n == i) {
            return true;
        }
        Log.w("GACConnecting", this.f43296a.f43358l.mo24917n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i2 = this.f43310o;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GACConnecting", sb2.toString());
        String c = m34016c(this.f43309n);
        String c2 = m34016c(i);
        StringBuilder sb3 = new StringBuilder(c.length() + 70 + c2.length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        mo24906b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: a */
    public final void mo24894a(int i) {
        mo24906b(new ConnectionResult(8, null));
    }

    /* renamed from: a */
    public final void mo24895a(Bundle bundle) {
        if (mo24908b(1)) {
            if (bundle != null) {
                this.f43311p.putAll(bundle);
            }
            if (mo24909d()) {
                m34017g();
            }
        }
    }

    /* renamed from: a */
    public final void mo24896a(ConnectionResult connectionResult, rjo rjo, boolean z) {
        if (mo24908b(1)) {
            mo24907b(connectionResult, rjo, z);
            if (mo24909d()) {
                m34017g();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24905a(ConnectionResult connectionResult) {
        return this.f43313r && !connectionResult.mo17670a();
    }
}
