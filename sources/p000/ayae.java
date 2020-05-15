package p000;

import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ayae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayae implements ayjm {

    /* renamed from: a */
    public final Map f96893a = new HashMap();

    /* renamed from: b */
    public final Object f96894b;

    /* renamed from: c */
    private boolean f96895c = false;

    /* renamed from: d */
    private final boolean f96896d;

    /* renamed from: e */
    private final axzt f96897e;

    public ayae(axzt axzt, boolean z) {
        Object obj = new Object();
        this.f96894b = obj;
        synchronized (obj) {
            this.f96897e = axzt;
            this.f96896d = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r5.f96892b != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* renamed from: a */
    private final void m83675a(ayac ayac, axzf axzf, int i, boolean z) {
        ayac.f96885b = i;
        ayac.f96886c = axzf;
        ayac.f96887d = z;
        int i2 = i + 1;
        for (ayad ayad : ayac.f96888e.values()) {
            axzf axzf2 = ayad.f96891a;
            ayac ayac2 = (ayac) this.f96893a.get(axzf2.f96814a);
            boolean z2 = false;
            if (ayac2 == null) {
                ayac2 = new ayac(axzf2, false);
                ayac2.f96885b = Integer.MAX_VALUE;
                ayac2.f96890g = true;
                this.f96893a.put(axzf2.f96814a, ayac2);
            }
            if (!ayac.f96887d) {
                ayad ayad2 = (ayad) ayac.f96888e.get(ayac2.f96884a.f96814a);
                ayad ayad3 = (ayad) ayac2.f96888e.get(ayac.f96884a.f96814a);
                if (ayad2 == null || !ayad2.f96892b) {
                    if (ayad3 != null) {
                    }
                    int i3 = ayac2.f96885b;
                    if (i2 < i3 || (i2 == i3 && ayac2.f96887d && !z2)) {
                        if (ayac.f96885b == 0) {
                            axzf = axzf2;
                        }
                        m83675a(ayac2, axzf, i2, z2);
                    }
                } else {
                    z2 = true;
                    int i32 = ayac2.f96885b;
                    if (ayac.f96885b == 0) {
                    }
                    m83675a(ayac2, axzf, i2, z2);
                }
            }
            z2 = true;
            int i322 = ayac2.f96885b;
            if (ayac.f96885b == 0) {
            }
            m83675a(ayac2, axzf, i2, z2);
        }
    }

    /* renamed from: d */
    private final axzf m83676d() {
        return this.f96897e.mo53808b();
    }

    /* renamed from: b */
    public final axzf mo53828b(String str) {
        synchronized (this.f96894b) {
            mo53826a();
            ayac ayac = (ayac) this.f96893a.get(str);
            if (ayac == null) {
                return null;
            }
            axzf axzf = ayac.f96886c;
            return axzf;
        }
    }

    /* renamed from: c */
    public final Set mo53830c() {
        HashSet hashSet;
        synchronized (this.f96894b) {
            mo53826a();
            hashSet = new HashSet();
            for (ayac ayac : this.f96893a.values()) {
                int i = ayac.f96885b;
                if (i > 0 && i < Integer.MAX_VALUE) {
                    hashSet.add(ayac.mo53818a());
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo53829b() {
        Iterator it = this.f96893a.entrySet().iterator();
        while (it.hasNext()) {
            ayac ayac = (ayac) ((Map.Entry) it.next()).getValue();
            if (!ayac.f96890g) {
                ayac.f96885b = Integer.MAX_VALUE;
                ayac.f96886c = null;
            } else {
                it.remove();
            }
        }
        ayac ayac2 = (ayac) this.f96893a.get(m83676d().f96814a);
        m83675a(ayac2, ayac2.f96884a, 0, false);
    }

    /* renamed from: a */
    public final ayac mo53825a(String str) {
        ayac ayac;
        synchronized (this.f96894b) {
            mo53826a();
            ayac = (ayac) this.f96893a.get(str);
            if (ayac != null) {
                ayac = ayac.mo53818a();
            }
        }
        return ayac;
    }

    /* renamed from: a */
    public final void mo53826a() {
        if (!this.f96895c) {
            axzf d = m83676d();
            this.f96893a.put(d.f96814a, new ayac(d, this.f96896d));
            this.f96895c = true;
        }
    }

    /* renamed from: a */
    public final void mo53827a(axzf axzf, boolean z, Collection collection) {
        synchronized (this.f96894b) {
            if (Log.isLoggable("RouteMap", 3)) {
                String valueOf = String.valueOf(this.f96893a.values());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("updating the node peers, before: ");
                sb.append(valueOf);
                Log.d("RouteMap", sb.toString());
            }
            mo53826a();
            ayac ayac = new ayac(axzf, z);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ayad ayad = (ayad) it.next();
                ayac.f96888e.put(ayad.f96891a.f96814a, ayad);
            }
            this.f96893a.put(axzf.f96814a, ayac);
            mo53829b();
            if (Log.isLoggable("RouteMap", 3)) {
                String valueOf2 = String.valueOf(this.f96893a.values());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("updating the node peers, after: ");
                sb2.append(valueOf2);
                Log.d("RouteMap", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        synchronized (this.f96894b) {
            mo53826a();
            ssb.println("RouteMap:");
            ssb.mo26034a();
            String valueOf = String.valueOf(m83676d());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("localNode: ");
            sb.append(valueOf);
            ssb.println(sb.toString());
            ssb.println("NodeInfos:");
            ssb.mo26034a();
            for (ayac ayac : this.f96893a.values()) {
                ssb.println(ayac.mo53819a(z2));
            }
            ssb.mo26035b();
            ssb.mo26035b();
        }
    }
}
