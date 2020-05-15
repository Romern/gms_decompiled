package p000;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PublishDiscoverySession;
import android.net.wifi.aware.SubscribeDiscoverySession;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aitq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aitq {

    /* renamed from: a */
    private final Set f69715a = new C1225nr();

    /* renamed from: b */
    private final ScheduledExecutorService f69716b;

    /* renamed from: c */
    private final Map f69717c = new C1223np();

    /* renamed from: d */
    private final Map f69718d = new C1223np();

    /* renamed from: e */
    private final Set f69719e = new C1225nr();

    /* renamed from: f */
    private final Set f69720f = new C1225nr();

    /* renamed from: g */
    private final Set f69721g = new C1225nr();

    /* renamed from: h */
    private final Map f69722h = new C1223np();

    /* renamed from: i */
    private final Set f69723i = new C1225nr();

    /* renamed from: j */
    private final Map f69724j = new C1223np();

    public aitq() {
        ScheduledExecutorService a = ahhr.m55804a();
        this.f69716b = a;
    }

    /* renamed from: d */
    private final void m57923d() {
        if (!m57924e()) {
            srn srn = ailf.f69111a;
            cfnv.m140763Y();
            SystemClock.sleep(cfnv.m140763Y());
        }
    }

    /* renamed from: e */
    private final boolean m57924e() {
        return !this.f69719e.isEmpty() || !this.f69720f.isEmpty() || !this.f69721g.isEmpty() || !this.f69722h.isEmpty() || !this.f69723i.isEmpty() || !this.f69724j.isEmpty();
    }

    /* renamed from: f */
    private final void m57925f() {
        for (Runnable runnable : this.f69715a) {
            runnable.run();
        }
    }

    /* renamed from: h */
    private final void m57926h(DiscoverySession discoverySession) {
        if (this.f69720f.contains(discoverySession)) {
            srn srn = ailf.f69111a;
        } else if (this.f69722h.containsKey(discoverySession) && !((Set) this.f69722h.get(discoverySession)).isEmpty()) {
            srn srn2 = ailf.f69111a;
        } else if (this.f69723i.contains(discoverySession)) {
            srn srn3 = ailf.f69111a;
        } else if (!this.f69724j.containsKey(discoverySession) || ((Integer) this.f69724j.get(discoverySession)).intValue() <= 0) {
            this.f69722h.remove(discoverySession);
            this.f69724j.remove(discoverySession);
            Iterator it = this.f69717c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == discoverySession) {
                    this.f69717c.remove(entry.getKey());
                    break;
                }
            }
            Iterator it2 = this.f69718d.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (entry2.getValue() == discoverySession) {
                        this.f69718d.remove(entry2.getKey());
                        break;
                    }
                }
            }
            try {
                discoverySession.close();
            } catch (SecurityException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aitq", "h", 364, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to close DiscoverySession because the session has already been closed.");
            }
            srn srn4 = ailf.f69111a;
            if (!m57924e()) {
                m57925f();
            }
        } else {
            srn srn5 = ailf.f69111a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38011a() {
        ahhr.m55805a(this.f69716b, "DiscoverySessionTracker.alarmExecutor");
        for (DiscoverySession discoverySession : this.f69717c.values()) {
            discoverySession.close();
        }
        for (DiscoverySession discoverySession2 : this.f69718d.values()) {
            discoverySession2.close();
        }
        this.f69717c.clear();
        this.f69718d.clear();
        this.f69719e.clear();
        this.f69720f.clear();
        this.f69721g.clear();
        this.f69722h.clear();
        this.f69723i.clear();
        this.f69724j.clear();
        this.f69715a.clear();
    }

    /* renamed from: b */
    public final synchronized void mo38020b() {
        Iterator it = new C1225nr(this.f69717c.keySet()).iterator();
        while (it.hasNext()) {
            mo38017a((String) it.next());
        }
    }

    /* renamed from: c */
    public final synchronized void mo38024c() {
        Iterator it = new C1225nr(this.f69718d.keySet()).iterator();
        while (it.hasNext()) {
            mo38023b((String) it.next());
        }
    }

    /* renamed from: g */
    public final synchronized void mo38029g(DiscoverySession discoverySession) {
        this.f69722h.remove(discoverySession);
        m57926h(discoverySession);
        srn srn = ailf.f69111a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo38021b(DiscoverySession discoverySession) {
        this.f69723i.remove(discoverySession);
        m57926h(discoverySession);
        srn srn = ailf.f69111a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo38025c(DiscoverySession discoverySession) {
        if (!this.f69724j.containsKey(discoverySession)) {
            this.f69724j.put(discoverySession, 0);
        }
        Map map = this.f69724j;
        map.put(discoverySession, Integer.valueOf(((Integer) map.get(discoverySession)).intValue() + 1));
        srn srn = ailf.f69111a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo38027e(DiscoverySession discoverySession) {
        this.f69719e.remove(discoverySession);
        this.f69720f.remove(discoverySession);
        this.f69721g.remove(discoverySession);
        this.f69722h.remove(discoverySession);
        this.f69723i.remove(discoverySession);
        this.f69724j.remove(discoverySession);
        if (!m57924e()) {
            m57925f();
        }
    }

    /* renamed from: f */
    public final synchronized void mo38028f(DiscoverySession discoverySession) {
        this.f69721g.remove(discoverySession);
        m57926h(discoverySession);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo38022b(DiscoverySession discoverySession, aivw aivw) {
        if (this.f69722h.containsKey(discoverySession)) {
            ((Set) this.f69722h.get(discoverySession)).remove(aivw);
        }
        m57926h(discoverySession);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo38026d(DiscoverySession discoverySession) {
        Map map = this.f69724j;
        map.put(discoverySession, Integer.valueOf(((Integer) map.get(discoverySession)).intValue() - 1));
        m57926h(discoverySession);
        srn srn = ailf.f69111a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38012a(DiscoverySession discoverySession) {
        this.f69723i.add(discoverySession);
        srn srn = ailf.f69111a;
    }

    /* renamed from: b */
    public final synchronized void mo38023b(String str) {
        DiscoverySession discoverySession = (DiscoverySession) this.f69718d.get(str);
        if (discoverySession != null) {
            mo38029g(discoverySession);
        }
        m57923d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38013a(DiscoverySession discoverySession, aivw aivw) {
        if (!this.f69722h.containsKey(discoverySession)) {
            this.f69722h.put(discoverySession, new C1225nr());
        }
        ((Set) this.f69722h.get(discoverySession)).add(aivw);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38014a(PublishDiscoverySession publishDiscoverySession) {
        this.f69720f.remove(publishDiscoverySession);
        this.f69721g.add(publishDiscoverySession);
        srn srn = ailf.f69111a;
        cfnv.m140762X();
        ahfi.m55635b(new aito(this, publishDiscoverySession), cfnv.m140762X() * 1000, this.f69716b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38015a(SubscribeDiscoverySession subscribeDiscoverySession) {
        this.f69720f.remove(subscribeDiscoverySession);
        m57926h(subscribeDiscoverySession);
        if (this.f69722h.containsKey(subscribeDiscoverySession)) {
            srn srn = ailf.f69111a;
            cfnv.m140761W();
            ahfi.m55635b(new aitp(this, subscribeDiscoverySession), cfnv.m140761W() * 1000, this.f69716b);
        }
        srn srn2 = ailf.f69111a;
    }

    /* renamed from: a */
    public final synchronized void mo38016a(Runnable runnable) {
        this.f69715a.add(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo38017a(String str) {
        DiscoverySession discoverySession = (DiscoverySession) this.f69717c.get(str);
        if (discoverySession != null) {
            mo38028f(discoverySession);
        }
        m57923d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38018a(String str, PublishDiscoverySession publishDiscoverySession) {
        this.f69719e.add(publishDiscoverySession);
        DiscoverySession discoverySession = (DiscoverySession) this.f69717c.get(str);
        if (discoverySession != null) {
            mo38028f(discoverySession);
        }
        this.f69717c.put(str, publishDiscoverySession);
        this.f69719e.remove(publishDiscoverySession);
        this.f69720f.add(publishDiscoverySession);
        srn srn = ailf.f69111a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38019a(String str, SubscribeDiscoverySession subscribeDiscoverySession) {
        this.f69719e.add(subscribeDiscoverySession);
        DiscoverySession discoverySession = (DiscoverySession) this.f69718d.get(str);
        if (discoverySession != null) {
            mo38029g(discoverySession);
        }
        this.f69718d.put(str, subscribeDiscoverySession);
        this.f69719e.remove(subscribeDiscoverySession);
        this.f69720f.add(subscribeDiscoverySession);
        srn srn = ailf.f69111a;
    }
}
