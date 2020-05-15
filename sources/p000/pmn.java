package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmn {

    /* renamed from: a */
    public static final qav f39708a = new qav("GuestModeDeviceProber");

    /* renamed from: c */
    public static final String f39709c = String.valueOf(pzd.f40716a).concat("/search");

    /* renamed from: e */
    static final Map f39710e = new HashMap();

    /* renamed from: f */
    static final boolean f39711f = true;

    /* renamed from: b */
    public final boolean f39712b = ccxy.f180226a.mo6606a().mo77041c();

    /* renamed from: d */
    public final boolean f39713d = ccxy.f180226a.mo6606a().mo77042d();

    /* renamed from: g */
    public final Context f39714g;

    /* renamed from: h */
    public final Set f39715h = new TreeSet();

    /* renamed from: i */
    public final Set f39716i = new TreeSet();

    /* renamed from: j */
    public final Object f39717j = new Object();

    /* renamed from: k */
    public final ScheduledExecutorService f39718k;

    /* renamed from: l */
    public final Handler f39719l = new adzt(Looper.getMainLooper());

    /* renamed from: m */
    public int f39720m;

    /* renamed from: n */
    public volatile boolean f39721n = false;

    /* renamed from: o */
    private final String f39722o = ccxs.m132043d();

    /* renamed from: p */
    private final String f39723p = ccxs.m132041b();

    /* renamed from: q */
    private final poj f39724q;

    /* renamed from: r */
    private final Set f39725r = new HashSet();

    /* renamed from: s */
    private final Set f39726s = new HashSet();

    /* renamed from: t */
    private boolean f39727t = false;

    public pmn(Context context, ScheduledExecutorService scheduledExecutorService, poj poj) {
        this.f39714g = context;
        this.f39724q = poj;
        this.f39718k = scheduledExecutorService;
    }

    /* renamed from: a */
    public final pnp mo23421a(String str) {
        pnp pnp;
        synchronized (this.f39724q.f39918b) {
            pnr e = this.f39724q.f39918b.mo23495e();
            long currentTimeMillis = System.currentTimeMillis();
            pnp = (pnp) e.f39874c.get(str);
            if (pnp == null) {
                pnp = null;
            } else if (currentTimeMillis - pnp.f39864c > pnr.f39872a) {
                e.f39874c.remove(str);
                pnp = null;
            }
        }
        return pnp;
    }

    /* renamed from: b */
    public final void mo23425b(Set set) {
        f39708a.mo23675c("setFilterCriteria", new Object[0]);
        this.f39725r.clear();
        if (set != null) {
            this.f39725r.addAll(set);
        }
        this.f39727t = false;
        this.f39726s.clear();
    }

    /* renamed from: b */
    public final void mo23426b(ply ply) {
        this.f39726s.add(ply);
        if (!this.f39712b || !this.f39727t) {
            ArrayList arrayList = new ArrayList();
            this.f39721n = false;
            for (String str : this.f39725r) {
                if (!str.startsWith("%") && !TextUtils.isEmpty(str) && !this.f39722o.equalsIgnoreCase(str) && !this.f39723p.equalsIgnoreCase(str)) {
                    pnp a = mo23421a(str);
                    if (a == null) {
                        f39708a.mo23856a("probing: %s", str);
                        arrayList.add(new pmm(this, str));
                    } else if (a.f39863b) {
                        this.f39715h.add(str);
                    }
                }
            }
            synchronized (this.f39717j) {
                int size = arrayList.size();
                this.f39720m = size;
                if (size <= 0) {
                    mo23423a(this.f39715h, this.f39716i);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f39718k.execute((pmm) it.next());
                    }
                }
            }
            this.f39727t = true;
        }
    }

    /* renamed from: a */
    public final void mo23422a(Set set) {
        if (!this.f39712b) {
            mo23425b(set);
        }
    }

    /* renamed from: a */
    public final void mo23423a(Set set, Set set2) {
        poj poj = this.f39724q;
        new pok(poj.f39918b, poj.f39919c, set, set2, System.currentTimeMillis()).mo23522a();
    }

    /* renamed from: a */
    public final void mo23424a(ply ply) {
        f39708a.mo23861b("cancelProbing");
        this.f39726s.remove(ply);
        boolean z = true;
        if (this.f39712b && !this.f39726s.isEmpty()) {
            z = false;
        }
        this.f39721n = z;
        if (this.f39721n) {
            this.f39715h.clear();
            this.f39716i.clear();
        }
    }
}
