package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bxww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxww extends LinkedHashMap {

    /* renamed from: b */
    public static final bxww f165013b;

    /* renamed from: a */
    public boolean f165014a = true;

    static {
        bxww bxww = new bxww();
        f165013b = bxww;
        bxww.mo74204b();
    }

    private bxww() {
    }

    /* renamed from: a */
    private static int m124136a(Object obj) {
        if (obj instanceof byte[]) {
            return bxwd.m124087c((byte[]) obj);
        }
        if (!(obj instanceof bxvp)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo74204b() {
        this.f165014a = false;
    }

    /* renamed from: c */
    public final void mo74205c() {
        if (!this.f165014a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo74205c();
        super.clear();
    }

    public final Set entrySet() {
        return !isEmpty() ? super.entrySet() : Collections.emptySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final Object put(Object obj, Object obj2) {
        mo74205c();
        bxwd.m124083a(obj);
        bxwd.m124083a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo74205c();
        for (Object obj : map.keySet()) {
            bxwd.m124083a(obj);
            bxwd.m124083a(map.get(obj));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo74205c();
        return super.remove(obj);
    }

    private bxww(Map map) {
        super(map);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m124136a(entry.getValue()) ^ m124136a(entry.getKey());
        }
        return i;
    }

    /* renamed from: a */
    public final bxww mo74203a() {
        return !isEmpty() ? new bxww(this) : new bxww();
    }
}
