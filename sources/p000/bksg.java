package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bksg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bksg extends bksb implements bkqn {

    /* renamed from: c */
    private Map f125208c;

    /* renamed from: d */
    private int f125209d;

    public bksg(bksg bksg, bksl bksl) {
        super(bksg.f125188a, bksl, true);
        this.f125209d = 0;
        this.f125208c = bksg.f125208c;
        this.f125209d = bksg.f125209d;
    }

    /* renamed from: c */
    private static final blhp m106412c(blhp blhp) {
        return blhp == null ? bkta.f125260a : blhp;
    }

    /* renamed from: a */
    public final int mo66235a() {
        return this.f125208c.size();
    }

    /* renamed from: b */
    public final bkqi mo66240b() {
        if (mo66235a() > 0) {
            return this.f125189b.mo66103a(mo66252i(), bkqw.f125126d);
        }
        return bkqi.f125113a;
    }

    /* renamed from: i */
    public final blhg mo66252i() {
        blgn b = blgo.m107143b();
        String d = mo66247d();
        for (String str : this.f125208c.keySet()) {
            b.mo66498a(bksz.m106577a(d, str, bkta.f125260a));
        }
        return bksz.m106564a(b);
    }

    /* renamed from: k */
    public final List mo66254k() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f125208c.entrySet()) {
            arrayList.add(bksz.m106577a(mo66247d(), (String) entry.getKey(), (blhp) entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final int mo66255l() {
        return this.f125209d + 24;
    }

    /* renamed from: o */
    public final Iterable mo66303o() {
        return this.f125208c.values();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo66306r() {
        this.f125208c = new HashMap(this.f125208c);
    }

    public bksg(bksl bksl, blhp blhp) {
        super(blhp, bksl, false);
        this.f125209d = 0;
        this.f125208c = new HashMap();
    }

    /* renamed from: a */
    public final int mo66243a(bkqr bkqr) {
        int i = 17;
        for (Map.Entry entry : mo66242c()) {
            i = (((i * 37) + ((String) entry.getKey()).hashCode()) * 37) + ((Integer) bkqr.mo66261a((blhp) entry.getValue())).intValue();
        }
        return i;
    }

    /* renamed from: c */
    public final Set mo66242c() {
        return Collections.unmodifiableMap(this.f125208c).entrySet();
    }

    /* renamed from: a */
    public final bkqi mo66236a(String str) {
        if (mo66239a((Object) str)) {
            return this.f125189b.mo66103a(bksz.m106577a(mo66247d(), str, bkta.f125260a), bkqw.f125126d);
        }
        return bkqi.f125113a;
    }

    /* renamed from: b */
    public final blhp mo66241b(Object obj) {
        return m106412c((blhp) this.f125208c.get(obj));
    }

    /* renamed from: b */
    public final String mo66246b(bkqr bkqr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean z = true;
        for (Map.Entry entry : mo66242c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) bkqr.mo66261a((blhp) entry.getValue()));
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final bkqi mo66237a(String str, blhp blhp) {
        return this.f125189b.mo66103a(bksz.m106577a(mo66247d(), str, m106412c(blhp)), bkqw.f125126d);
    }

    /* renamed from: a */
    public final bkqi mo66238a(Map map) {
        blgn b = blgo.m107143b();
        String d = mo66247d();
        for (Map.Entry entry : map.entrySet()) {
            b.mo66498a(bksz.m106577a(d, (String) entry.getKey(), m106412c((blhp) entry.getValue())));
        }
        return this.f125189b.mo66103a(bksz.m106564a(b), bkqw.f125126d);
    }

    /* renamed from: a */
    public final blhg mo66244a(blhg blhg) {
        mo66296a(blhg, blhf.UPDATE);
        String str = blhg.mo66534e().f126589b;
        return bksz.m106577a(mo66247d(), str, mo66241b(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo66295a(blhg blhg, bkqw bkqw, bksc bksc) {
        mo66296a(blhg, blhf.UPDATE);
        mo66305q();
        blhx e = blhg.mo66534e();
        String str = e.f126589b;
        blhp blhp = e.f126590c;
        blhp blhp2 = (blhp) this.f125208c.get(str);
        blhp blhp3 = blhp2 == null ? bkta.f125260a : blhp2;
        boolean b = bkta.m106591b(blhp);
        boolean z = !bkta.m106588a(blhp3, bkta.f125260a);
        if (!b) {
            this.f125208c.put(str, blhp);
            mo66297a(blhp);
            int a = this.f125209d + bkta.m106585a(blhp);
            this.f125209d = a;
            if (z) {
                this.f125209d = a - bkta.m106585a(blhp3);
            } else {
                this.f125209d = a + str.length() + 8;
                if (!bksc.f125195a && !bkta.m106588a(blhp3, blhp)) {
                    bksc.mo66309a(new bkrs(this, bkqw, bksc.mo66313d(), str, blhp, blhp3));
                    return;
                }
                return;
            }
        } else {
            this.f125208c.remove(str);
            if (z) {
                int length = this.f125209d - (str.length() + 8);
                this.f125209d = length;
                this.f125209d = length - bkta.m106585a(blhp3);
            }
            if (!bksc.f125195a) {
                return;
            }
            return;
        }
        mo66300b(blhp3);
        if (!bksc.f125195a) {
        }
    }

    /* renamed from: a */
    public final void mo66298a(String str, bkqw bkqw, bksc bksc) {
        Iterator it = this.f125208c.values().iterator();
        while (it.hasNext()) {
            if (bkta.m106589a(str, (blhp) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: a */
    public final boolean mo66245a(bkrx bkrx, bkqo bkqo) {
        if (bkqo instanceof bkqn) {
            bkqn bkqn = (bkqn) bkqo;
            if (mo66235a() == bkqn.mo66235a()) {
                for (Map.Entry entry : mo66242c()) {
                    String str = (String) entry.getKey();
                    if (!bkqn.mo66239a((Object) str) || !bkrx.mo66290a(bkqn.mo66241b(str), (blhp) entry.getValue(), this.f125189b, bkqn.mo66253j())) {
                        return false;
                    }
                    while (r0.hasNext()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo66239a(Object obj) {
        return this.f125208c.containsKey(obj);
    }
}
