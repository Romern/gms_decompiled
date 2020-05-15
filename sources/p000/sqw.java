package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: sqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqw {
    /* renamed from: a */
    public static List m36031a() {
        return new ArrayList();
    }

    /* renamed from: b */
    public static Map m36043b(int i, boolean z) {
        return i > (!z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) ? new HashMap(i, !z ? 1.0f : 0.75f) : new C1223np(i);
    }

    /* renamed from: c */
    private static List m36048c(int i) {
        return new ArrayList(i);
    }

    /* renamed from: a */
    public static List m36032a(int i) {
        return i != 0 ? m36048c(i) : m36031a();
    }

    /* renamed from: b */
    public static Map m36044b(Object obj, Object obj2, Object obj3, Object obj4) {
        Map b = m36043b(2, false);
        b.put(obj, obj2);
        b.put(obj3, obj4);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: c */
    private static Set m36049c(int i, boolean z) {
        return i > (!z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) ? new HashSet(i, !z ? 1.0f : 0.75f) : new C1225nr(i);
    }

    /* renamed from: a */
    public static List m36033a(Object obj) {
        List c = m36048c(Math.max(1, 1));
        c.add(obj);
        return c;
    }

    /* renamed from: b */
    public static Set m36045b() {
        return new C1225nr();
    }

    @Deprecated
    /* renamed from: a */
    public static List m36034a(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList(objArr));
    }

    /* renamed from: b */
    public static Set m36046b(int i) {
        return i != 0 ? m36049c(i, true) : m36045b();
    }

    /* renamed from: a */
    public static Map m36035a(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length == length2) {
            if (length == 1) {
                return Collections.singletonMap(objArr[0], objArr2[0]);
            }
            Map b = m36043b(length, false);
            for (int i = 0; i < objArr.length; i++) {
                b.put(objArr[i], objArr2[i]);
            }
            return Collections.unmodifiableMap(b);
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("Key and values array lengths not equal: ");
        sb.append(length);
        sb.append(" != ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqw.a(int, boolean, java.lang.Object[]):java.util.Set
     arg types: [int, int, java.lang.Object[]]
     candidates:
      sqw.a(java.lang.Object, java.lang.Object, java.lang.Object):java.util.Set
      sqw.a(int, boolean, java.lang.Object[]):java.util.Set */
    @Deprecated
    /* renamed from: b */
    public static Set m36047b(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            return m36038a(objArr[0], objArr[1]);
        }
        if (length != 3) {
            return length != 4 ? Collections.unmodifiableSet(m36037a(length, false, objArr)) : m36040a(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
        return m36039a(objArr[0], objArr[1], objArr[2]);
    }

    /* renamed from: a */
    public static Set m36036a(int i, boolean z) {
        return new LinkedHashSet(i, !z ? 1.0f : 0.75f);
    }

    /* renamed from: a */
    public static Set m36037a(int i, boolean z, Object[] objArr) {
        Set c = m36049c(i, z);
        Collections.addAll(c, objArr);
        return c;
    }

    @Deprecated
    /* renamed from: a */
    public static Set m36038a(Object obj, Object obj2) {
        Set c = m36049c(2, false);
        c.add(obj);
        c.add(obj2);
        return Collections.unmodifiableSet(c);
    }

    @Deprecated
    /* renamed from: a */
    public static Set m36039a(Object obj, Object obj2, Object obj3) {
        Set c = m36049c(3, false);
        c.add(obj);
        c.add(obj2);
        c.add(obj3);
        return Collections.unmodifiableSet(c);
    }

    @Deprecated
    /* renamed from: a */
    public static Set m36040a(Object obj, Object obj2, Object obj3, Object obj4) {
        Set c = m36049c(4, false);
        c.add(obj);
        c.add(obj2);
        c.add(obj3);
        c.add(obj4);
        return Collections.unmodifiableSet(c);
    }

    /* renamed from: a */
    public static boolean m36041a(Collection collection) {
        if (collection != null) {
            return collection.isEmpty();
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m36042a(Map map) {
        if (map != null) {
            return map.isEmpty();
        }
        return true;
    }
}
