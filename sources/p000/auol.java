package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: auol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auol implements aupn {

    /* renamed from: a */
    public static final aunx f92192a = new aunx("TrustAgent", "PreferenceServiceClient");

    /* renamed from: f */
    private static final Object f92193f = new Object();

    /* renamed from: g */
    private static WeakReference f92194g = new WeakReference(null);

    /* renamed from: b */
    public final Object f92195b = new Object();

    /* renamed from: c */
    public final Set f92196c = new HashSet();

    /* renamed from: d */
    public Bundle f92197d;

    /* renamed from: e */
    public auob f92198e;

    /* renamed from: h */
    private final Context f92199h;

    /* renamed from: i */
    private final ServiceConnection f92200i = new auof(this, "trustagent");

    /* renamed from: j */
    private final bqgj f92201j;

    protected auol(Context context, bqgj bqgj) {
        this.f92199h = context;
        this.f92201j = bqgj;
    }

    /* renamed from: a */
    public static auol m77454a() {
        auol auol;
        rpr b = rpr.m34216b();
        synchronized (f92193f) {
            auol = (auol) f92194g.get();
            if (auol == null) {
                auol = new auol(b, bqgs.m112811a((ExecutorService) snp.m35704b(9)));
                f92194g = new WeakReference(auol);
            }
        }
        return auol;
    }

    /* renamed from: b */
    public final void mo50730b(auoi auoi) {
        synchronized (this.f92195b) {
            this.f92196c.remove(auoi);
        }
        synchronized (this.f92195b) {
            if (this.f92196c.isEmpty()) {
                this.f92198e = null;
                this.f92197d = null;
                skh.m35531a().mo25689a(this.f92199h, this.f92200i);
            }
            aunx aunx = f92192a;
            int size = this.f92196c.size();
            StringBuilder sb = new StringBuilder(39);
            sb.append("stop(). mListeners.size() = ");
            sb.append(size);
            aunx.mo50711a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: c */
    public final Set mo50735c() {
        Set<String> keySet;
        synchronized (this.f92195b) {
            keySet = this.f92197d.keySet();
        }
        return keySet;
    }

    /* renamed from: d */
    public final void mo50737d() {
    }

    /* renamed from: e */
    public final void mo50738e() {
        f92192a.mo50711a("fetchPreferences.", new Object[0]);
        synchronized (this.f92195b) {
            bqga.m112781a(this.f92201j.mo25819b(new auod(this)), new auog(this), new auoj());
        }
    }

    /* renamed from: c */
    public final boolean mo50736c(String str) {
        boolean z;
        synchronized (this.f92195b) {
            z = this.f92197d.getBoolean(str, false);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo50731b(String str) {
        synchronized (this.f92195b) {
            if (this.f92197d.containsKey(str)) {
                this.f92197d.remove(str);
                mo50727a(str, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final long mo50724a(String str, long j) {
        long j2;
        synchronized (this.f92195b) {
            j2 = this.f92197d.getLong(str, j);
        }
        return j2;
    }

    /* renamed from: a */
    public final String mo50725a(String str, String str2) {
        String string;
        synchronized (this.f92195b) {
            string = this.f92197d.getString(str, str2);
        }
        return string;
    }

    /* renamed from: a */
    public final void mo50726a(auoi auoi) {
        synchronized (this.f92195b) {
            this.f92196c.add(auoi);
        }
        synchronized (this.f92195b) {
            if (this.f92196c.size() == 1) {
                if (this.f92198e == null) {
                    Intent className = new Intent().setClassName(this.f92199h, "com.google.android.gms.trustagent.PreferenceService");
                    synchronized (this.f92195b) {
                        if (!skh.m35531a().mo25691a(this.f92199h, "PreferenceServiceClient", className, this.f92200i, 1)) {
                            f92192a.mo50711a("Failed to start PreferenceService. Preferences won't work", new Object[0]).mo50706a();
                        }
                    }
                } else {
                    return;
                }
            }
            aunx aunx = f92192a;
            int size = this.f92196c.size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("start(). mListeners.size() = ");
            sb.append(size);
            aunx.mo50711a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo50732b(String str, long j) {
        synchronized (this.f92195b) {
            this.f92197d.putLong(str, j);
        }
        mo50727a(str, Long.valueOf(j));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      aupn.a(java.lang.String, boolean):void
      auol.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public final void mo50733b(String str, String str2) {
        synchronized (this.f92195b) {
            this.f92197d.putString(str, str2);
        }
        mo50727a(str, (Object) str2);
    }

    /* renamed from: b */
    public final boolean mo50734b() {
        boolean z;
        synchronized (this.f92195b) {
            z = this.f92197d != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo50727a(String str, Object obj) {
        synchronized (this.f92195b) {
            bqga.m112781a(this.f92201j.mo25819b(new auoe(this, obj, str)), new auoh(), new auoj());
        }
    }

    /* renamed from: a */
    public final void mo50728a(String str, boolean z) {
        synchronized (this.f92195b) {
            this.f92197d.putBoolean(str, z);
        }
        mo50727a(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo50729a(String str) {
        boolean containsKey;
        synchronized (this.f92195b) {
            containsKey = this.f92197d.containsKey(str);
        }
        return containsKey;
    }
}
