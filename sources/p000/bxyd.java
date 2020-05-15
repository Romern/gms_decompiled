package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: bxyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyd extends AbstractMap {

    /* renamed from: a */
    public List f165081a = Collections.emptyList();

    /* renamed from: b */
    public Map f165082b = Collections.emptyMap();

    /* renamed from: c */
    public boolean f165083c;

    /* renamed from: d */
    public Map f165084d = Collections.emptyMap();

    /* renamed from: e */
    private final int f165085e;

    /* renamed from: f */
    private volatile bxyc f165086f;

    public bxyd(int i) {
        this.f165085e = i;
    }

    /* renamed from: a */
    private final int m124395a(Comparable comparable) {
        int size = this.f165081a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((bxya) this.f165081a.get(size)).f165073a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((bxya) this.f165081a.get(i2)).f165073a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: d */
    private final SortedMap m124397d() {
        mo74270c();
        if (this.f165082b.isEmpty() && !(this.f165082b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f165082b = treeMap;
            this.f165084d = treeMap.descendingMap();
        }
        return (SortedMap) this.f165082b;
    }

    /* renamed from: b */
    public final Iterable mo74267b() {
        return !this.f165082b.isEmpty() ? this.f165082b.entrySet() : bxxz.f165072b;
    }

    /* renamed from: c */
    public final Object mo74269c(int i) {
        mo74270c();
        Object obj = ((bxya) this.f165081a.remove(i)).f165074b;
        if (!this.f165082b.isEmpty()) {
            Iterator it = m124397d().entrySet().iterator();
            List list = this.f165081a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new bxya(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final void clear() {
        mo74270c();
        if (!this.f165081a.isEmpty()) {
            this.f165081a.clear();
        }
        if (!this.f165082b.isEmpty()) {
            this.f165082b.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m124395a(comparable) >= 0 || this.f165082b.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.f165086f == null) {
            this.f165086f = new bxyc(this);
        }
        return this.f165086f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxyd)) {
            return super.equals(obj);
        }
        bxyd bxyd = (bxyd) obj;
        int size = size();
        if (size != bxyd.size()) {
            return false;
        }
        int a = mo74265a();
        if (a != bxyd.mo74265a()) {
            return entrySet().equals(bxyd.entrySet());
        }
        for (int i = 0; i < a; i++) {
            if (!mo74268b(i).equals(bxyd.mo74268b(i))) {
                return false;
            }
        }
        if (a != size) {
            return this.f165082b.equals(bxyd.f165082b);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m124395a(comparable);
        if (a >= 0) {
            return ((bxya) this.f165081a.get(a)).f165074b;
        }
        return this.f165082b.get(comparable);
    }

    public final int hashCode() {
        int a = mo74265a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            i += ((bxya) this.f165081a.get(i2)).hashCode();
        }
        return this.f165082b.size() > 0 ? i + this.f165082b.hashCode() : i;
    }

    public final Object remove(Object obj) {
        mo74270c();
        Comparable comparable = (Comparable) obj;
        int a = m124395a(comparable);
        if (a >= 0) {
            return mo74269c(a);
        }
        if (!this.f165082b.isEmpty()) {
            return this.f165082b.remove(comparable);
        }
        return null;
    }

    public final int size() {
        return this.f165081a.size() + this.f165082b.size();
    }

    /* renamed from: b */
    public final Map.Entry mo74268b(int i) {
        return (Map.Entry) this.f165081a.get(i);
    }

    /* renamed from: a */
    static bxyd m124396a(int i) {
        return new bxyd(i);
    }

    /* renamed from: c */
    public final void mo74270c() {
        if (this.f165083c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final int mo74265a() {
        return this.f165081a.size();
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        mo74270c();
        int a = m124395a(comparable);
        if (a >= 0) {
            return ((bxya) this.f165081a.get(a)).setValue(obj);
        }
        mo74270c();
        if (this.f165081a.isEmpty() && !(this.f165081a instanceof ArrayList)) {
            this.f165081a = new ArrayList(this.f165085e);
        }
        int i = -(a + 1);
        if (i >= this.f165085e) {
            return m124397d().put(comparable, obj);
        }
        int size = this.f165081a.size();
        int i2 = this.f165085e;
        if (size == i2) {
            bxya bxya = (bxya) this.f165081a.remove(i2 - 1);
            m124397d().put(bxya.f165073a, bxya.f165074b);
        }
        this.f165081a.add(i, new bxya(this, comparable, obj));
        return null;
    }
}
