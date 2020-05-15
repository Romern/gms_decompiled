package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: rmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rmx extends rkb implements rnu {

    /* renamed from: m */
    public static final /* synthetic */ int f43321m = 0;

    /* renamed from: b */
    public final Lock f43322b;

    /* renamed from: c */
    public final Context f43323c;

    /* renamed from: d */
    public final Looper f43324d;

    /* renamed from: e */
    final Queue f43325e = new LinkedList();

    /* renamed from: f */
    rnp f43326f;

    /* renamed from: g */
    final Map f43327g;

    /* renamed from: h */
    Set f43328h;

    /* renamed from: i */
    final sat f43329i;

    /* renamed from: j */
    final Map f43330j;

    /* renamed from: k */
    final rpe f43331k;

    /* renamed from: l */
    final rjl f43332l;

    /* renamed from: n */
    private final sbo f43333n;

    /* renamed from: o */
    private rnv f43334o = null;

    /* renamed from: p */
    private final int f43335p;

    /* renamed from: q */
    private volatile boolean f43336q;

    /* renamed from: r */
    private long f43337r;

    /* renamed from: s */
    private long f43338s;

    /* renamed from: t */
    private final rmv f43339t;

    /* renamed from: u */
    private final rfi f43340u;

    /* renamed from: v */
    private final roe f43341v;

    /* renamed from: w */
    private final ArrayList f43342w;

    /* renamed from: x */
    private Integer f43343x;

    /* renamed from: y */
    private final sbn f43344y;

    public rmx(Context context, Lock lock, Looper looper, sat sat, rfi rfi, rjl rjl, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        long j;
        Looper looper2 = looper;
        int i3 = i;
        if (!sqr.m35998a()) {
            j = 120000;
        } else {
            j = 10000;
        }
        this.f43337r = j;
        this.f43338s = 5000;
        this.f43328h = new HashSet();
        this.f43341v = new roe();
        this.f43343x = null;
        this.f43344y = new rmu(this);
        this.f43323c = context;
        this.f43322b = lock;
        this.f43333n = new sbo(looper, this.f43344y);
        this.f43324d = looper2;
        this.f43339t = new rmv(this, looper);
        this.f43340u = rfi;
        this.f43335p = i3;
        if (i3 >= 0) {
            this.f43343x = Integer.valueOf(i2);
        }
        this.f43330j = map;
        this.f43327g = map2;
        this.f43342w = arrayList;
        this.f43331k = new rpe();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f43333n.mo25343a((rjz) list.get(i4));
        }
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            this.f43333n.mo25344a((rka) list2.get(i5));
        }
        this.f43329i = sat;
        this.f43332l = rjl;
    }

    /* renamed from: a */
    public static int m34045a(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            rjm rjm = (rjm) it.next();
            if (rjm.mo12787g()) {
                z2 = true;
            }
            if (rjm.mo12923h()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    static String m34046b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: c */
    private final void m34047c(int i) {
        rmx rmx;
        Integer num = this.f43343x;
        if (num == null) {
            this.f43343x = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String b = m34046b(i);
            String b2 = m34046b(this.f43343x.intValue());
            StringBuilder sb = new StringBuilder(b.length() + 51 + b2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(b);
            sb.append(". Mode was already set to ");
            sb.append(b2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f43334o == null) {
            boolean z = false;
            boolean z2 = false;
            for (rjm rjm : this.f43327g.values()) {
                if (rjm.mo12787g()) {
                    z = true;
                }
                if (rjm.mo12923h()) {
                    z2 = true;
                }
            }
            int intValue = this.f43343x.intValue();
            if (intValue == 1) {
                rmx = this;
                if (!z) {
                    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                } else if (z2) {
                    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else if (intValue != 2) {
                rmx = this;
            } else if (z) {
                Context context = this.f43323c;
                Lock lock = this.f43322b;
                Looper looper = this.f43324d;
                rfi rfi = this.f43340u;
                Map map = this.f43327g;
                sat sat = this.f43329i;
                Map map2 = this.f43330j;
                rjl rjl = this.f43332l;
                ArrayList arrayList = this.f43342w;
                C1223np npVar = new C1223np();
                C1223np npVar2 = new C1223np();
                rjm rjm2 = null;
                for (Map.Entry entry : map.entrySet()) {
                    rjm rjm3 = (rjm) entry.getValue();
                    if (rjm3.mo12923h()) {
                        rjm2 = rjm3;
                    }
                    if (rjm3.mo12787g()) {
                        npVar.put((rje) entry.getKey(), rjm3);
                    } else {
                        npVar2.put((rje) entry.getKey(), rjm3);
                    }
                }
                sdo.m34971a(!npVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                C1223np npVar3 = new C1223np();
                C1223np npVar4 = new C1223np();
                Iterator it = map2.keySet().iterator();
                while (it.hasNext()) {
                    rjo rjo = (rjo) it.next();
                    Iterator it2 = it;
                    rje a = rjo.mo24653a();
                    if (npVar.containsKey(a)) {
                        npVar3.put(rjo, (Boolean) map2.get(rjo));
                        it = it2;
                    } else if (npVar2.containsKey(a)) {
                        npVar4.put(rjo, (Boolean) map2.get(rjo));
                        it = it2;
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = size;
                    rlt rlt = (rlt) arrayList.get(i2);
                    ArrayList arrayList4 = arrayList;
                    if (npVar3.containsKey(rlt.f43247a)) {
                        arrayList2.add(rlt);
                    } else if (npVar4.containsKey(rlt.f43247a)) {
                        arrayList3.add(rlt);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                    i2++;
                    size = i3;
                    arrayList = arrayList4;
                }
                this.f43334o = new rly(context, this, lock, looper, rfi, npVar, npVar2, sat, rjl, rjm2, arrayList2, arrayList3, npVar3, npVar4);
                return;
            } else {
                rmx = this;
            }
            rmx.f43334o = new rnb(rmx.f43323c, this, rmx.f43322b, rmx.f43324d, rmx.f43340u, rmx.f43327g, rmx.f43329i, rmx.f43330j, rmx.f43332l, rmx.f43342w, this);
        }
    }

    /* renamed from: b */
    public final Context mo24794b() {
        return this.f43323c;
    }

    /* renamed from: c */
    public final Looper mo24799c() {
        return this.f43324d;
    }

    /* renamed from: d */
    public final void mo24800d() {
        rnv rnv = this.f43334o;
        if (rnv != null) {
            rnv.mo24887f();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rmx.a(java.lang.Iterable, boolean):int
     arg types: [java.util.Collection, int]
     candidates:
      rmx.a(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult
      rkb.a(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult
      rmx.a(java.lang.Iterable, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: e */
    public final void mo24801e() {
        this.f43322b.lock();
        try {
            boolean z = false;
            if (this.f43335p < 0) {
                Integer num = this.f43343x;
                if (num == null) {
                    this.f43343x = Integer.valueOf(m34045a((Iterable) this.f43327g.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                sdo.m34971a(this.f43343x != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            }
            int intValue = this.f43343x.intValue();
            this.f43322b.lock();
            if (intValue == 3) {
                z = true;
            } else if (intValue == 1 || intValue == 2) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(intValue);
            sdo.m34975b(z, sb.toString());
            m34047c(intValue);
            mo24914k();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f43322b.unlock();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rmx.a(java.lang.Iterable, boolean):int
     arg types: [java.util.Collection, int]
     candidates:
      rmx.a(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult
      rkb.a(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult
      rmx.a(java.lang.Iterable, boolean):int */
    /* renamed from: f */
    public final ConnectionResult mo24802f() {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "blockingConnect must not be called on the UI thread");
        this.f43322b.lock();
        try {
            if (this.f43335p < 0) {
                Integer num = this.f43343x;
                if (num == null) {
                    this.f43343x = Integer.valueOf(m34045a((Iterable) this.f43327g.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                if (this.f43343x == null) {
                    z2 = false;
                }
                sdo.m34971a(z2, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            }
            m34047c(this.f43343x.intValue());
            this.f43333n.mo25345b();
            return this.f43334o.mo24882b();
        } finally {
            this.f43322b.unlock();
        }
    }

    /* renamed from: g */
    public final void mo24803g() {
        Lock lock;
        boolean c;
        this.f43322b.lock();
        try {
            rpe rpe = this.f43331k;
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) rpe.f43480c.toArray(rpe.f43479b);
            for (BasePendingResult basePendingResult : basePendingResultArr) {
                basePendingResult.mo17717a((rpd) null);
                synchronized (basePendingResult.f30125g) {
                    if (((rkb) basePendingResult.f30127i.get()) == null || !basePendingResult.f30129k) {
                        basePendingResult.mo9460b();
                    }
                    c = basePendingResult.mo9461c();
                }
                if (c) {
                    rpe.f43480c.remove(basePendingResult);
                }
            }
            rnv rnv = this.f43334o;
            if (rnv != null) {
                rnv.mo24884c();
            }
            roe roe = this.f43341v;
            for (rod rod : roe.f43431a) {
                rod.mo24967a();
            }
            roe.f43431a.clear();
            for (rle rle : this.f43325e) {
                rle.mo17717a((rpd) null);
                rle.mo9460b();
            }
            this.f43325e.clear();
            if (this.f43334o != null) {
                mo24916m();
                this.f43333n.mo25339a();
                lock = this.f43322b;
            } else {
                lock = this.f43322b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f43322b.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo24804h() {
        mo24803g();
        mo24801e();
    }

    /* renamed from: i */
    public final boolean mo24805i() {
        rnv rnv = this.f43334o;
        return rnv != null && rnv.mo24885d();
    }

    /* renamed from: j */
    public final boolean mo24806j() {
        rnv rnv = this.f43334o;
        return rnv != null && rnv.mo24886e();
    }

    /* renamed from: k */
    public final void mo24914k() {
        this.f43333n.mo25345b();
        this.f43334o.mo24878a();
    }

    /* renamed from: l */
    public final void mo24915l() {
        this.f43322b.lock();
        try {
            if (this.f43336q) {
                mo24914k();
            }
        } finally {
            this.f43322b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo24916m() {
        boolean z = false;
        if (this.f43336q) {
            this.f43336q = false;
            this.f43339t.removeMessages(2);
            z = true;
            this.f43339t.removeMessages(1);
            rnp rnp = this.f43326f;
            if (rnp != null) {
                rnp.mo24952a();
                this.f43326f = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo24917n() {
        StringWriter stringWriter = new StringWriter();
        mo24789a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rmx.a(java.lang.Iterable, boolean):int
     arg types: [java.util.Collection, int]
     candidates:
      rmx.a(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult
      rkb.a(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult
      rmx.a(java.lang.Iterable, boolean):int */
    /* renamed from: a */
    public final ConnectionResult mo24785a(long j, TimeUnit timeUnit) {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "blockingConnect must not be called on the UI thread");
        sdo.checkIfNull(timeUnit, "TimeUnit must not be null");
        this.f43322b.lock();
        try {
            Integer num = this.f43343x;
            if (num == null) {
                this.f43343x = Integer.valueOf(m34045a((Iterable) this.f43327g.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m34047c(this.f43343x.intValue());
            this.f43333n.mo25345b();
            return this.f43334o.mo24876a(j, timeUnit);
        } finally {
            this.f43322b.unlock();
        }
    }

    /* renamed from: b */
    public final rle mo24795b(rle rle) {
        boolean z;
        String str;
        Lock lock;
        if (rle.f43219d != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f43327g.containsKey(rle.f43219d);
        rjo rjo = rle.f43220e;
        if (rjo != null) {
            str = rjo.f43149a;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        sdo.m34975b(containsKey, sb.toString());
        this.f43322b.lock();
        try {
            if (this.f43334o != null) {
                if (!this.f43336q) {
                    rle = this.f43334o.mo24883b(rle);
                    lock = this.f43322b;
                } else {
                    this.f43325e.add(rle);
                    while (!this.f43325e.isEmpty()) {
                        rle rle2 = (rle) this.f43325e.remove();
                        this.f43331k.mo24980a(rle2);
                        rle2.mo9481a(Status.f30109c);
                    }
                    lock = this.f43322b;
                }
                lock.unlock();
                return rle;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f43322b.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final rjm mo24786a(rje rje) {
        rjm rjm = (rjm) this.f43327g.get(rje);
        sdo.checkIfNull(rjm, "Appropriate Api was not requested.");
        return rjm;
    }

    /* renamed from: a */
    public final rle mo24787a(rle rle) {
        boolean z;
        String str;
        Lock lock;
        if (rle.f43219d != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f43327g.containsKey(rle.f43219d);
        rjo rjo = rle.f43220e;
        if (rjo != null) {
            str = rjo.f43149a;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        sdo.m34975b(containsKey, sb.toString());
        this.f43322b.lock();
        try {
            rnv rnv = this.f43334o;
            if (rnv == null) {
                this.f43325e.add(rle);
                lock = this.f43322b;
            } else {
                rle = rnv.mo24877a(rle);
                lock = this.f43322b;
            }
            lock.unlock();
            return rle;
        } catch (Throwable th) {
            this.f43322b.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo24796b(rjz rjz) {
        this.f43333n.mo25346b(rjz);
    }

    /* renamed from: b */
    public final void mo24797b(rka rka) {
        sbo sbo = this.f43333n;
        sdo.m34959a(rka);
        synchronized (sbo.f44009d) {
            if (!sbo.f44008c.remove(rka)) {
                String valueOf = String.valueOf(rka);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo24798b(rjo rjo) {
        rjm rjm;
        if (!mo24805i() || (rjm = (rjm) this.f43327g.get(rjo.mo24653a())) == null || !rjm.mo24648p()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final rod mo24788a(Object obj) {
        this.f43322b.lock();
        try {
            roe roe = this.f43341v;
            rod a = roe.m34172a(obj, this.f43324d, "NO_TYPE");
            roe.f43431a.add(a);
            return a;
        } finally {
            this.f43322b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24873a(int i) {
        if (i == 1 && !this.f43336q) {
            this.f43336q = true;
            if (this.f43326f == null && !sqr.m35998a()) {
                try {
                    this.f43326f = this.f43340u.mo24583a(this.f43323c.getApplicationContext(), new rmw(this));
                } catch (SecurityException e) {
                }
            }
            rmv rmv = this.f43339t;
            rmv.sendMessageDelayed(rmv.obtainMessage(1), this.f43337r);
            rmv rmv2 = this.f43339t;
            rmv2.sendMessageDelayed(rmv2.obtainMessage(2), this.f43338s);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f43331k.f43480c.toArray(rpe.f43479b)) {
            basePendingResult.mo17719d(rpe.f43478a);
        }
        this.f43333n.mo25340a(i);
        this.f43333n.mo25339a();
        if (i == 2) {
            mo24914k();
        }
    }

    /* renamed from: a */
    public final void mo24874a(Bundle bundle) {
        while (!this.f43325e.isEmpty()) {
            mo24795b((rle) this.f43325e.remove());
        }
        this.f43333n.mo25341a(bundle);
    }

    /* renamed from: a */
    public final void mo24875a(ConnectionResult connectionResult) {
        if (!rfy.m33548b(this.f43323c, connectionResult.f30065c)) {
            mo24916m();
        }
        if (!this.f43336q) {
            this.f43333n.mo25342a(connectionResult);
            this.f43333n.mo25339a();
        }
    }

    /* renamed from: a */
    public final void mo24789a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append((CharSequence) "mContext=").println(this.f43323c);
        printWriter.append((CharSequence) str).append((CharSequence) "mResuming=").print(this.f43336q);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(this.f43325e.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(this.f43331k.f43480c.size());
        rnv rnv = this.f43334o;
        if (rnv != null) {
            rnv.mo24880a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final void mo24790a(rjz rjz) {
        this.f43333n.mo25343a(rjz);
    }

    /* renamed from: a */
    public final void mo24791a(rka rka) {
        this.f43333n.mo25344a(rka);
    }

    /* renamed from: a */
    public final boolean mo24792a(ico ico) {
        rnv rnv = this.f43334o;
        return rnv != null && rnv.mo24881a(ico);
    }

    /* renamed from: a */
    public final boolean mo24793a(rjo rjo) {
        return this.f43327g.containsKey(rjo.mo24653a());
    }
}
