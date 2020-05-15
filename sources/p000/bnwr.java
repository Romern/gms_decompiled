package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* renamed from: bnwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwr implements Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f132318c = 0;

    /* renamed from: a */
    public final List f132319a;

    /* renamed from: b */
    public transient bnym f132320b;

    /* renamed from: d */
    private bnwe f132321d;

    /* renamed from: e */
    private AtomicInteger f132322e;

    /* renamed from: f */
    private int f132323f;

    static {
        Logger.getLogger(bnwr.class.getCanonicalName());
        bmyd bmyd = bmyd.ALWAYS_TRUE;
    }

    public bnwr() {
        this.f132319a = bnkn.m109661a();
        this.f132322e = new AtomicInteger();
        this.f132323f = 0;
        this.f132321d = bnwe.m110626c();
        bnwe.m110626c();
        m110679b();
    }

    /* renamed from: a */
    public static bnwr m110676a(InputStream inputStream) {
        bnvg bnvg = new bnvg(inputStream);
        byte a = bnvg.mo68512a();
        int i = 0;
        boolean z = true;
        if (a == 1) {
            bnvg.mo68512a();
            bnvg.mo68512a();
            int b = bnvg.mo68513b();
            if (b < 0) {
                z = false;
            }
            bmxy.m108601b(z, "Can only deccode polygons with up to 2^31 - 1 loops");
            bnwr bnwr = new bnwr();
            while (i < b) {
                bnwr.f132319a.add(bnwi.m110643a(bnvg));
                i++;
            }
            bnwr.f132321d = bnwe.m110625a(bnvg);
            bnwr.m110680c();
            return bnwr;
        } else if (a == 4) {
            byte a2 = bnvg.mo68512a();
            if (a2 <= 30) {
                int d = bnvg.mo68515d();
                ArrayList arrayList = new ArrayList(d);
                while (i < d) {
                    arrayList.add(bnwi.m110642a(a2, bnvg));
                    i++;
                }
                bnwr bnwr2 = new bnwr();
                bnwr2.f132319a.addAll(arrayList);
                bnwr2.m110680c();
                return bnwr2;
            }
            throw new IOException("Invalid level");
        } else {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Unsupported S2Polygon encoding version ");
            sb.append((int) a);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: b */
    private final void m110679b() {
        int i = this.f132323f;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.f132322e.set(i2);
        this.f132320b = new bnym();
        for (int i3 = 0; i3 < mo68674a(); i3++) {
            this.f132320b.mo68709a(mo68675a(i3));
        }
    }

    /* renamed from: c */
    private final void m110680c() {
        this.f132323f = 0;
        bnwd d = bnwd.m110619d();
        List list = this.f132319a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bnwi bnwi = (bnwi) list.get(i);
            if ((bnwi.f132286d & 1) == 0) {
                d.mo68624a(bnwi.f132285c);
            }
            this.f132323f += bnwi.f132284b;
        }
        bnwe c = d.mo68626c();
        this.f132321d = c;
        bnvw.m110596a(c);
        m110679b();
    }

    private Object readResolve() {
        m110679b();
        return this;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bnwr bnwr = (bnwr) obj;
        if (mo68674a() != bnwr.mo68674a()) {
            return mo68674a() - bnwr.mo68674a();
        }
        for (int i = 0; i < mo68674a(); i++) {
            int a = ((bnwi) this.f132319a.get(i)).compareTo((bnwi) bnwr.f132319a.get(i));
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnwr) {
            bnwr bnwr = (bnwr) obj;
            return this.f132323f == bnwr.f132323f && this.f132321d.equals(bnwr.f132321d) && this.f132319a.equals(bnwr.f132319a);
        }
    }

    public final int hashCode() {
        return this.f132321d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polygon: (");
        sb.append(mo68674a());
        sb.append(") loops:\n");
        for (int i = 0; i < mo68674a(); i++) {
            bnwi a = mo68675a(i);
            sb.append("loop <\n");
            for (int i2 = 0; i2 < a.f132284b; i2++) {
                sb.append(a.mo68642a(i2).mo68661c());
                sb.append("\n");
            }
            sb.append(">\n");
        }
        return sb.toString();
    }

    public bnwr(List list) {
        this.f132319a = bnkn.m109661a();
        this.f132322e = new AtomicInteger();
        this.f132323f = 0;
        this.f132319a.clear();
        m110679b();
        if (list.size() == 1) {
            this.f132319a.clear();
            this.f132319a.add((bnwi) list.remove(0));
            bnwi bnwi = (bnwi) this.f132319a.get(0);
            bnwi.f132286d = 0;
            this.f132323f = bnwi.f132284b;
            this.f132321d = bnwi.f132285c;
            m110679b();
            return;
        }
        IdentityHashMap e = bnmt.m109812e();
        e.put(null, bnkn.m109661a());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m110678a((bnwi) list.get(i), (bnwi) null, e);
        }
        list.clear();
        for (bnwi bnwi2 : e.keySet()) {
            Collections.sort((List) e.get(bnwi2));
        }
        m110677a((bnwi) null, -1, e);
        m110680c();
    }

    /* renamed from: a */
    private final void m110677a(bnwi bnwi, int i, Map map) {
        if (bnwi != null) {
            bnwi.f132286d = i;
            this.f132319a.add(bnwi);
        }
        List<bnwi> list = (List) map.get(bnwi);
        if (list != null) {
            for (bnwi bnwi2 : list) {
                m110677a(bnwi2, i + 1, map);
            }
        }
    }

    /* renamed from: a */
    private static void m110678a(bnwi bnwi, bnwi bnwi2, Map map) {
        List<bnwi> list = (List) map.get(bnwi2);
        if (list == null) {
            list = bnkn.m109661a();
            map.put(bnwi2, list);
        }
        for (bnwi bnwi3 : list) {
            if (bnwi3.mo68647b(bnwi)) {
                m110678a(bnwi, bnwi3, map);
                return;
            }
        }
        List list2 = (List) map.get(bnwi);
        int i = 0;
        while (i < list.size()) {
            bnwi bnwi4 = (bnwi) list.get(i);
            if (!bnwi.mo68647b(bnwi4)) {
                i++;
            } else {
                if (list2 == null) {
                    list2 = bnkn.m109661a();
                    map.put(bnwi, list2);
                }
                list2.add(bnwi4);
                list.remove(i);
            }
        }
        list.add(bnwi);
    }

    /* renamed from: a */
    public final int mo68674a() {
        return this.f132319a.size();
    }

    /* renamed from: a */
    public final bnwi mo68675a(int i) {
        return (bnwi) this.f132319a.get(i);
    }

    /* renamed from: a */
    public final boolean mo68676a(bnwk bnwk) {
        boolean z;
        int i;
        if (!this.f132320b.f132378c && !this.f132321d.mo68632a(bnwk)) {
            return false;
        }
        if (this.f132323f <= 32) {
            i = 0;
            z = false;
        } else if (this.f132320b.f132378c || this.f132322e.decrementAndGet() <= 0) {
            bnwb a = this.f132320b.mo68707a();
            if (a.mo68608a(bnwk)) {
                bnxn bnxn = (bnxn) a.mo68609b();
                bnvv bnvv = new bnvv(a.mo68610c(), bnwk);
                boolean z2 = false;
                for (int i2 = 0; i2 < bnxn.mo68691b(); i2++) {
                    bnyj a2 = bnxn.mo68690a(i2);
                    z2 ^= a2.mo68696c();
                    int d = a2.mo68698d();
                    if (d > 0) {
                        bnwi bnwi = (bnwi) a2.f132371b;
                        int i3 = -2;
                        int i4 = 0;
                        while (i4 < d) {
                            int b = a2.mo68697b(i4);
                            if (b != i3 + 1) {
                                bnvv.mo68602a(bnwi.mo68642a(b));
                            }
                            z2 ^= bnvv.mo68604c(bnwi.mo68642a(b + 1));
                            i4++;
                            i3 = b;
                        }
                    }
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        } else {
            i = 0;
            z = false;
        }
        while (i < mo68674a()) {
            z ^= mo68675a(i).mo68648b(bnwk);
            i++;
        }
        return z;
    }
}
