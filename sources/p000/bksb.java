package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: bksb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bksb implements bkqo {

    /* renamed from: a */
    public final blhp f125188a;

    /* renamed from: b */
    protected final bksl f125189b;

    /* renamed from: c */
    private bksb f125190c;

    /* renamed from: d */
    private Map f125191d;

    /* renamed from: e */
    private boolean f125192e;

    /* renamed from: f */
    private boolean f125193f;

    /* renamed from: g */
    private volatile boolean f125194g = false;

    protected bksb(blhp blhp, bksl bksl, boolean z) {
        this.f125188a = blhp;
        this.f125189b = bksl;
        this.f125194g = z;
    }

    /* renamed from: cQ */
    private final void m106368cQ() {
        if (!this.f125193f) {
            this.f125193f = true;
            for (blhp blhp : mo66303o()) {
                mo66297a(blhp);
            }
            HashSet hashSet = new HashSet();
            for (blhp blhp2 : mo66303o()) {
                if (blhp2.f126558b == blho.REFERENCED_ID) {
                    hashSet.add(blhp2.mo66554b());
                }
            }
            for (String str : Collections.unmodifiableSet(hashSet)) {
                this.f125189b.mo66329b(str).m106368cQ();
            }
        }
    }

    /* renamed from: a */
    public abstract bksb mo66294a(bksl bksl);

    /* renamed from: a */
    public abstract void mo66295a(blhg blhg, bkqw bkqw, bksc bksc);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66296a(blhg blhg, blhf blhf) {
        if (blhg.f126522b != blhf) {
            mo66299b(blhg);
        }
    }

    /* renamed from: a */
    public abstract void mo66298a(String str, bkqw bkqw, bksc bksc);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66299b(blhg blhg) {
        throw new bkre(mo66250g().mo66530a().f126464b, blhg);
    }

    /* renamed from: d */
    public final String mo66247d() {
        return this.f125188a.mo66554b();
    }

    /* renamed from: e */
    public final blhp mo66248e() {
        return this.f125188a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkqo)) {
            return false;
        }
        bkqo bkqo = (bkqo) obj;
        return new bkrx().mo66290a(this.f125188a, bkqo.mo66248e(), this.f125189b, bkqo.mo66253j());
    }

    /* renamed from: f */
    public final String mo66249f() {
        return bksz.m106579a(mo66250g().mo66530a());
    }

    /* renamed from: h */
    public final List mo66251h() {
        Collection<bksb> collection;
        if (!this.f125192e && !this.f125193f) {
            return Collections.emptyList();
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        stack.push(this);
        newSetFromMap.add(this);
        while (!stack.isEmpty()) {
            bksb bksb = (bksb) stack.pop();
            if (bksb.f125192e) {
                arrayList.add(bksb);
            }
            bksb bksb2 = bksb.f125190c;
            if (bksb2 == null && bksb.f125191d == null) {
                collection = Collections.emptySet();
            } else {
                Map map = bksb.f125191d;
                if (map == null) {
                    collection = Collections.singletonList(bksb2);
                } else {
                    collection = Collections.unmodifiableCollection(map.keySet());
                }
            }
            for (bksb bksb3 : collection) {
                if (!newSetFromMap.contains(bksb3)) {
                    newSetFromMap.add(bksb3);
                    stack.push(bksb3);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return ((Integer) new bkry(this).mo66261a(this.f125188a)).intValue();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ bkqk mo66253j() {
        return this.f125189b;
    }

    /* renamed from: m */
    public final void mo66256m() {
        this.f125192e = true;
        m106368cQ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract Iterable mo66303o();

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo66304p() {
        this.f125194g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo66305q() {
        if (this.f125194g) {
            mo66306r();
            this.f125194g = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo66306r();

    public final String toString() {
        return (String) new bkrz(this).mo66261a(this.f125188a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66297a(blhp blhp) {
        if (this.f125193f && blhp.f126558b == blho.REFERENCED_ID) {
            bksb b = this.f125189b.mo66329b(blhp.mo66554b());
            if (this.f125193f) {
                b.m106368cQ();
            }
            if (b.f125191d == null && b.f125190c == null) {
                b.f125190c = this;
                return;
            }
            if (b.f125190c != null) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                b.f125191d = identityHashMap;
                identityHashMap.put(b.f125190c, 1);
                b.f125190c = null;
            }
            Integer num = (Integer) b.f125191d.get(this);
            if (num == null) {
                num = 0;
            }
            b.f125191d.put(this, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66300b(blhp blhp) {
        if (blhp != null && blhp.f126558b == blho.REFERENCED_ID && this.f125193f) {
            bksb b = this.f125189b.mo66329b(blhp.mo66554b());
            bksb bksb = b.f125190c;
            if (bksb != null && bksb.equals(this)) {
                b.f125190c = null;
                return;
            }
            Map map = b.f125191d;
            if (map != null) {
                Integer num = (Integer) map.get(this);
                if (num != null) {
                    if (num.intValue() == 1) {
                        b.f125191d.remove(this);
                    } else {
                        b.f125191d.put(this, Integer.valueOf(num.intValue() - 1));
                    }
                    if (b.f125191d.size() == 1 && ((Integer) b.f125191d.values().iterator().next()).intValue() == 1) {
                        b.f125190c = (bksb) b.f125191d.keySet().iterator().next();
                        b.f125191d = null;
                        return;
                    }
                    return;
                }
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Removed non-existent parent ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            String valueOf2 = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Removed non-existent parent ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
