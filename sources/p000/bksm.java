package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bksm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksm implements bkqv {

    /* renamed from: a */
    public final Map f125217a = new HashMap();

    /* renamed from: b */
    public final bksr f125218b;

    /* renamed from: c */
    public bksl f125219c;

    /* renamed from: d */
    public Map f125220d = new HashMap();

    /* renamed from: e */
    public Map f125221e;

    /* renamed from: f */
    public int f125222f;

    /* renamed from: g */
    private final bksl f125223g;

    /* renamed from: h */
    private bkqn f125224h;

    public bksm(bksm bksm, bksp bksp) {
        this.f125223g = bksp;
        this.f125218b = new bksr(bksp);
        this.f125222f = bksm.f125222f;
        this.f125221e = bksm.f125221e;
        for (Map.Entry entry : bksm.f125220d.entrySet()) {
            this.f125220d.put((String) entry.getKey(), ((bksb) entry.getValue()).mo66294a(bksp));
        }
        for (Map map : bksm.f125217a.values()) {
            for (String str : map.keySet()) {
                mo66333a((bksk) mo66330a(str));
            }
        }
    }

    /* renamed from: a */
    private final bksb m106498a(String str, bksb bksb, bksb bksb2) {
        synchronized (this.f125221e) {
            if (bksb != null) {
                try {
                    bksl bksl = bksb.f125189b;
                    bksl bksl2 = this.f125223g;
                    if (bksl != bksl2) {
                        if (bksb2 == null) {
                            bksb = bksb.mo66294a(bksl2);
                            this.f125220d.put(str, bksb);
                        }
                    } else if (bksb2 == null) {
                        this.f125220d.put(str, bksb);
                        this.f125221e.put(str, bksb.mo66294a(this.f125219c));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bksb = bksb2;
        }
        return bksb;
    }

    /* renamed from: b */
    public final String mo66334b() {
        String a = bkwu.m106778a();
        while (mo66330a(a) != null) {
            a = bkwu.m106778a();
        }
        return a;
    }

    /* renamed from: c */
    public final bkqn mo66268c() {
        bkqn bkqn = this.f125224h;
        if (bkqn != null) {
            return bkqn;
        }
        bkqn bkqn2 = (bkqn) mo66330a("root");
        this.f125224h = bkqn2;
        return bkqn2;
    }

    /* renamed from: d */
    public final void mo66336d() {
        synchronized (this.f125221e) {
            for (Map.Entry entry : this.f125221e.entrySet()) {
                String str = (String) entry.getKey();
                m106498a(str, (bksb) entry.getValue(), (bksb) this.f125220d.get(str));
            }
            this.f125221e = Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public final Map mo66335b(String str) {
        Map map = (Map) this.f125217a.get(str);
        return map == null ? Collections.emptyMap() : map;
    }

    /* renamed from: a */
    public final bksb mo66330a(String str) {
        return mo66331a(str, false);
    }

    /* renamed from: a */
    public final bksb mo66331a(String str, boolean z) {
        bksb bksb = (bksb) this.f125220d.get(str);
        if (z) {
            return m106498a(str, (bksb) this.f125221e.get(str), bksb);
        }
        if (bksb != null) {
            return bksb;
        }
        bksb bksb2 = (bksb) this.f125221e.get(str);
        return (bksb2 != null && bksb2.f125189b == this.f125223g) ? bksb2 : m106498a(str, (bksb) this.f125221e.get(str), null);
    }

    public bksm(bksr bksr, bksl bksl) {
        this.f125223g = bksl;
        this.f125218b = bksr;
        this.f125221e = Collections.emptyMap();
    }

    /* renamed from: a */
    public final Set mo66332a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f125220d.keySet());
        hashSet.addAll(this.f125221e.keySet());
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66333a(bksk bksk) {
        Map map = (Map) this.f125217a.get(bksk.f125214c);
        if (map == null) {
            map = new HashMap();
            this.f125217a.put(bksk.f125214c, map);
        }
        map.put(bksk.mo66247d(), bksk);
    }
}
