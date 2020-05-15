package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: aiyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyh {

    /* renamed from: a */
    public final Context f70059a;

    /* renamed from: b */
    public final Map f70060b = new HashMap();

    /* renamed from: c */
    public final Set f70061c = new TreeSet(new aiyf());

    /* renamed from: d */
    public final buqh f70062d;

    /* renamed from: e */
    public final Set f70063e = new HashSet();

    /* renamed from: f */
    public aiye f70064f;

    public aiyh(Context context) {
        this.f70059a = context;
        this.f70062d = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    public final Set mo38261a() {
        this.f70062d.mo72984b();
        mo38267c();
        HashSet hashSet = new HashSet();
        for (aiye aiye : this.f70061c) {
            hashSet.add(aiye.f70057e);
        }
        for (ajdm ajdm : this.f70060b.values()) {
            hashSet.add(ajdm.f70392c.f70398b);
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo38265b(Collection collection, int i, int i2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ajdm ajdm = (ajdm) this.f70060b.get(str);
            if (ajdm != null) {
                ajdm.mo38506a(i, i2);
                if (!ajdm.m58555a(i)) {
                    this.f70060b.remove(str);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo38266b() {
        return this.f70064f != null;
    }

    /* renamed from: c */
    public final void mo38267c() {
        this.f70062d.mo72984b();
        mo38263a((String) null);
    }

    /* renamed from: d */
    public final void mo38268d() {
        for (aiyg aiyg : this.f70063e) {
            aiyg.mo38260a();
        }
    }

    /* renamed from: a */
    public final Set mo38262a(ClientAppIdentifier clientAppIdentifier) {
        this.f70062d.mo72984b();
        HashSet hashSet = new HashSet();
        for (aiye aiye : this.f70061c) {
            if (clientAppIdentifier == null || clientAppIdentifier.equals(aiye.f70057e)) {
                hashSet.add(aiye.f70053a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo38263a(String str) {
        this.f70062d.mo72984b();
        if (str != null) {
            srn srn = ahfq.f67120a;
        }
        int size = this.f70061c.size();
        Iterator it = this.f70061c.iterator();
        while (it.hasNext()) {
            aiye aiye = (aiye) it.next();
            if (aiye.mo38257a() < SystemClock.elapsedRealtime() || aiye.f70053a.equals(str)) {
                it.remove();
                srn srn2 = ahfq.f67120a;
                this.f70061c.size();
                if (aiye == this.f70064f) {
                    this.f70064f = null;
                }
            }
        }
        if (this.f70061c.size() != size) {
            mo38268d();
        }
    }

    /* renamed from: a */
    public final void mo38264a(Collection collection, int i, int i2) {
        aiye aiye;
        ajdm ajdm;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f70062d.mo72984b();
            Iterator it2 = this.f70061c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    aiye = null;
                    break;
                }
                aiye = (aiye) it2.next();
                if (aiye.f70053a.equals(str)) {
                    break;
                }
            }
            if (!(aiye == null || (ajdm = aiye.f70058f) == null)) {
                ajdm.mo38506a(i, i2);
                if (ajdm.f70395f == 3) {
                    mo38263a(str);
                }
            }
        }
    }
}
