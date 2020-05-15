package p000;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: bntj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bntj {

    /* renamed from: a */
    public static final bntj f132128a = new bntj(Collections.unmodifiableSortedMap(new TreeMap()));

    /* renamed from: b */
    public final SortedMap f132129b;

    /* renamed from: c */
    private Integer f132130c = null;

    /* renamed from: d */
    private String f132131d = null;

    static {
        Collections.unmodifiableSortedSet(new TreeSet());
    }

    private bntj(SortedMap sortedMap) {
        this.f132129b = sortedMap;
    }

    /* renamed from: a */
    public final void mo68483a(bnsv bnsv) {
        for (Map.Entry entry : this.f132129b.entrySet()) {
            String str = (String) entry.getKey();
            Set<Object> set = (Set) entry.getValue();
            if (!set.isEmpty()) {
                for (Object obj : set) {
                    ((bnsu) bnsv).mo68470a(str, obj);
                }
            } else {
                ((bnsu) bnsv).mo68470a(str, (Object) null);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bntj) && ((bntj) obj).f132129b.equals(this.f132129b);
    }

    public final int hashCode() {
        if (this.f132130c == null) {
            this.f132130c = Integer.valueOf(this.f132129b.hashCode());
        }
        return this.f132130c.intValue();
    }

    public final String toString() {
        if (this.f132131d == null) {
            StringBuilder sb = new StringBuilder();
            bnsu bnsu = new bnsu("[ ", " ]", sb);
            mo68483a(bnsu);
            bnsu.mo68469a();
            this.f132131d = sb.toString();
        }
        return this.f132131d;
    }
}
