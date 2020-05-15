package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: rjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rjy {

    /* renamed from: a */
    public Account f43172a;

    /* renamed from: b */
    public String f43173b;

    /* renamed from: c */
    public String f43174c;

    /* renamed from: d */
    private final Set f43175d;

    /* renamed from: e */
    private final Set f43176e;

    /* renamed from: f */
    private final Map f43177f;

    /* renamed from: g */
    private final Context f43178g;

    /* renamed from: h */
    private final Map f43179h;

    /* renamed from: i */
    private rnw f43180i;

    /* renamed from: j */
    private int f43181j;

    /* renamed from: k */
    private rka f43182k;

    /* renamed from: l */
    private Looper f43183l;

    /* renamed from: m */
    private rfi f43184m;

    /* renamed from: n */
    private final ArrayList f43185n;

    /* renamed from: o */
    private final ArrayList f43186o;

    /* renamed from: p */
    private rjl f43187p;

    public rjy(Context context) {
        this.f43175d = new HashSet();
        this.f43176e = new HashSet();
        this.f43177f = new C1223np();
        this.f43179h = new C1223np();
        this.f43181j = -1;
        this.f43184m = rfi.f42868a;
        this.f43187p = aqkq.f86295g;
        this.f43185n = new ArrayList();
        this.f43186o = new ArrayList();
        this.f43178g = context;
        this.f43183l = context.getMainLooper();
        this.f43173b = context.getPackageName();
        this.f43174c = context.getClass().getName();
    }

    /* renamed from: a */
    public final sat mo24773a() {
        return new sat(this.f43172a, this.f43175d, this.f43177f, this.f43173b, this.f43174c, this.f43179h.containsKey(aqkq.f86291c) ? (aqkt) this.f43179h.get(aqkq.f86291c) : aqkt.f86306a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm
     arg types: [android.content.Context, android.os.Looper, sat, java.lang.Object, rlt, rlt]
     candidates:
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rlz, rof):rjm
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm */
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
    /* renamed from: b */
    public final rkb mo24784b() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        sdo.m34975b(!this.f43179h.isEmpty(), "must call addApi() to add at least one API");
        sat a = mo24773a();
        Map map = a.f43966d;
        C1223np npVar = new C1223np();
        C1223np npVar2 = new C1223np();
        ArrayList arrayList = new ArrayList();
        rjo rjo = null;
        boolean z4 = false;
        for (rjo rjo2 : this.f43179h.keySet()) {
            Object obj = this.f43179h.get(rjo2);
            if (map.get(rjo2) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            npVar.put(rjo2, Boolean.valueOf(z2));
            rlt rlt = new rlt(rjo2, z2);
            arrayList.add(rlt);
            rjl b = rjo2.mo24654b();
            rjo rjo3 = rjo2;
            rjm a2 = b.mo11610a(this.f43178g, this.f43183l, a, obj, (rjz) rlt, (rka) rlt);
            npVar2.put(rjo3.mo24653a(), a2);
            if (b.mo16731a() == 1) {
                z4 = obj != null;
            }
            if (a2.mo12923h()) {
                if (rjo == null) {
                    rjo = rjo3;
                } else {
                    String str = rjo3.f43149a;
                    String str2 = rjo.f43149a;
                    StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
                    sb.append(str);
                    sb.append(" cannot be used with ");
                    sb.append(str2);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        if (rjo != null) {
            if (!z4) {
                if (this.f43172a == null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34972a(z, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", rjo.f43149a);
                sdo.m34972a(this.f43175d.equals(this.f43176e), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", rjo.f43149a);
            } else {
                String str3 = rjo.f43149a;
                StringBuilder sb2 = new StringBuilder(str3.length() + 82);
                sb2.append("With using ");
                sb2.append(str3);
                sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                throw new IllegalStateException(sb2.toString());
            }
        }
        rmx rmx = new rmx(this.f43178g, new ReentrantLock(), this.f43183l, a, this.f43184m, this.f43187p, npVar, this.f43185n, this.f43186o, npVar2, this.f43181j, rmx.m34045a((Iterable) npVar2.values(), true), arrayList);
        synchronized (rkb.f43188a) {
            rkb.f43188a.add(rmx);
        }
        if (this.f43181j >= 0) {
            rnx a3 = LifecycleCallback.m22511a(this.f43180i);
            rlb rlb = (rlb) a3.mo24870a("AutoManageHelper", rlb.class);
            if (rlb == null) {
                rlb = new rlb(a3);
            }
            int i = this.f43181j;
            rka rka = this.f43182k;
            sdo.m34966a(rmx, "GoogleApiClient instance cannot be null");
            if (rlb.f43208a.indexOfKey(i) >= 0) {
                z3 = false;
            }
            StringBuilder sb3 = new StringBuilder(54);
            sb3.append("Already managing a GoogleApiClient with id ");
            sb3.append(i);
            sdo.m34971a(z3, (Object) sb3.toString());
            rlg rlg = (rlg) rlb.f43229c.get();
            boolean z5 = rlb.f43228b;
            String valueOf = String.valueOf(rlg);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb4.append("starting AutoManage for client ");
            sb4.append(i);
            sb4.append(" ");
            sb4.append(z5);
            sb4.append(" ");
            sb4.append(valueOf);
            sb4.toString();
            rlb.f43208a.put(i, new rla(rlb, i, rmx, rka));
            if (rlb.f43228b && rlg == null) {
                String valueOf2 = String.valueOf(rmx);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
                sb5.append("connecting ");
                sb5.append(valueOf2);
                sb5.toString();
                rmx.mo24801e();
            }
        }
        return rmx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [android.os.Handler, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo24774a(Handler handler) {
        sdo.m34966a((Object) handler, (Object) "Handler must not be null");
        this.f43183l = handler.getLooper();
    }

    /* renamed from: a */
    public final void mo24775a(Activity activity, int i, rka rka) {
        rnw rnw = new rnw(activity);
        sdo.m34975b(true, "clientId must be non-negative");
        this.f43181j = i;
        this.f43182k = rka;
        this.f43180i = rnw;
    }

    /* renamed from: a */
    public final void mo24776a(Activity activity, rka rka) {
        mo24775a(activity, 0, rka);
    }

    /* renamed from: a */
    public final void mo24777a(Scope scope) {
        sdo.m34966a(scope, "Scope must not be null");
        this.f43175d.add(scope);
    }

    /* renamed from: a */
    public final void mo24778a(String str) {
        this.f43172a = str != null ? new Account(str, "com.google") : null;
    }

    public rjy(Context context, rjz rjz, rka rka) {
        this(context);
        sdo.m34966a(rjz, "Must provide a connected listener");
        this.f43185n.add(rjz);
        sdo.m34966a(rka, "Must provide a connection failed listener");
        this.f43186o.add(rka);
    }

    /* renamed from: a */
    public final void mo24779a(rjo rjo) {
        sdo.m34966a(rjo, "Api must not be null");
        this.f43179h.put(rjo, null);
        List a = rjo.f43150b.mo12172a(null);
        this.f43176e.addAll(a);
        this.f43175d.addAll(a);
    }

    /* renamed from: a */
    public final void mo24780a(rjo rjo, rjh rjh) {
        sdo.m34966a(rjo, "Api must not be null");
        sdo.m34966a(rjh, "Null options are not permitted for this Api");
        this.f43179h.put(rjo, rjh);
        List a = rjo.f43150b.mo12172a(rjh);
        this.f43176e.addAll(a);
        this.f43175d.addAll(a);
    }

    /* renamed from: a */
    public final void mo24781a(rjz rjz) {
        sdo.m34966a(rjz, "Listener must not be null");
        this.f43185n.add(rjz);
    }

    /* renamed from: a */
    public final void mo24782a(rka rka) {
        sdo.m34966a(rka, "Listener must not be null");
        this.f43186o.add(rka);
    }

    /* renamed from: a */
    public final void mo24783a(String[] strArr) {
        for (String str : strArr) {
            this.f43175d.add(new Scope(str));
        }
    }
}
