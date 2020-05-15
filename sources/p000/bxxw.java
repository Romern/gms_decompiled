package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: bxxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxw {

    /* renamed from: a */
    public static final bxyn f165067a = m124346a(false);

    /* renamed from: b */
    public static final bxyn f165068b = m124346a(true);

    /* renamed from: c */
    public static final bxyn f165069c = new bxyn();

    /* renamed from: d */
    private static final Class f165070d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        f165070d = cls;
    }

    /* renamed from: a */
    static int m124342a(int i, Object obj, bxxv bxxv) {
        if (obj instanceof bxwk) {
            return bxuk.m123631a(i, (bxwk) obj);
        }
        return bxuk.m123657i(i) + bxuk.m123633a((bxxc) obj, bxxv);
    }

    /* renamed from: b */
    static int m124355b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = size * bxuk.m123657i(i);
        for (int i3 = 0; i3 < list.size(); i3++) {
            i2 += bxuk.m123640b((bxtx) list.get(i3));
        }
        return i2;
    }

    /* renamed from: c */
    static int m124362c(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * bxuk.m123665o(i);
        }
        return 0;
    }

    /* renamed from: d */
    static int m124366d(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m124367d(list) + (size * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: e */
    static int m124369e(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * bxuk.m123667q(i);
        }
        return 0;
    }

    /* renamed from: f */
    static int m124372f(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * bxuk.m123668r(i);
        }
        return 0;
    }

    /* renamed from: g */
    static int m124375g(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m124370e(list) + (size * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: h */
    static int m124378h(int i, List list) {
        if (list.size() != 0) {
            return m124345a(list) + (list.size() * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: i */
    static int m124381i(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m124376g(list) + (size * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: j */
    static int m124384j(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m124363c(list) + (size * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: k */
    static int m124387k(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m124373f(list) + (size * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: l */
    static int m124389l(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m124357b(list) + (size * bxuk.m123657i(i));
        }
        return 0;
    }

    /* renamed from: m */
    public static void m124391m(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123659j(((Integer) list.get(i4)).intValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73852c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73853c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m124392n(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Boolean) list.get(i3)).booleanValue();
                    i4++;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73843b(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73836a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    static int m124356b(int i, List list, bxxv bxxv) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += bxuk.m123638b(i, (bxxc) list.get(i3), bxxv);
        }
        return i2;
    }

    /* renamed from: c */
    static int m124363c(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123654g(bxwq.mo74160a(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123654g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m124370e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123659j(bxvm.mo74151b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123659j(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m124373f(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123661k(bxvm.mo74151b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123661k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m124343a(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int i5 = bxuk.m123657i(i) * size;
        if (list instanceof bxwm) {
            bxwm bxwm = (bxwm) list;
            while (i4 < size) {
                Object b = bxwm.mo74190b(i4);
                if (b instanceof bxtx) {
                    i3 = bxuk.m123640b((bxtx) b);
                } else {
                    i3 = bxuk.m123641b((String) b);
                }
                i5 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof bxtx) {
                    i2 = bxuk.m123640b((bxtx) obj);
                } else {
                    i2 = bxuk.m123641b((String) obj);
                }
                i5 += i2;
                i4++;
            }
        }
        return i5;
    }

    /* renamed from: d */
    static int m124367d(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123659j(bxvm.mo74151b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123659j(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m124376g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123662l(bxvm.mo74151b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123662l(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    static int m124379h(List list) {
        return list.size() * 4;
    }

    /* renamed from: i */
    static int m124382i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m124385j(List list) {
        return list.size();
    }

    /* renamed from: k */
    public static void m124388k(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Integer) list.get(i3)).intValue();
                    i4 += 4;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73858e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73859e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m124390l(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Integer) list.get(i3)).intValue();
                    i4 += 4;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73858e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73859e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    static int m124357b(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123651f(bxwq.mo74160a(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123651f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static void m124380h(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123659j(((Integer) list.get(i4)).intValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73852c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73853c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m124383i(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123661k(((Integer) list.get(i4)).intValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73855d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73856d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m124386j(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123662l(((Integer) list.get(i4)).intValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73873h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73871f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m124364c(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123651f(((Long) list.get(i4)).longValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73854c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73831a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m124371e(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123654g(((Long) list.get(i4)).longValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73870e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73866c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m124374f(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Long) list.get(i3)).longValue();
                    i4 += 8;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73857d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73846b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m124377g(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Long) list.get(i3)).longValue();
                    i4 += 8;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73857d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73846b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m124358b(int i, List list, bxul bxul) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                bxul.f164857a.mo73832a(i, (bxtx) list.get(i2));
            }
        }
    }

    /* renamed from: a */
    static int m124344a(int i, List list, bxxv bxxv) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = bxuk.m123657i(i) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof bxwk) {
                i2 = bxuk.m123632a((bxwk) obj);
            } else {
                i2 = bxuk.m123633a((bxxc) obj, bxxv);
            }
            i3 += i2;
        }
        return i3;
    }

    /* renamed from: d */
    public static void m124368d(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += bxuk.m123651f(((Long) list.get(i4)).longValue());
                }
                bxul.f164857a.mo73855d(i3);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73854c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73831a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m124359b(int i, List list, bxul bxul, bxxv bxxv) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                bxul.mo73885b(i, list.get(i2), bxxv);
            }
        }
    }

    /* renamed from: b */
    public static void m124360b(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Float) list.get(i3)).floatValue();
                    i4 += 4;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73861a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73863a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    static int m124345a(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            i = 0;
            while (i2 < size) {
                i += bxuk.m123651f(bxwq.mo74160a(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bxuk.m123651f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static void m124365c(Object obj, Object obj2) {
        bxyo a = bxyn.m124416a(obj);
        bxyo a2 = bxyn.m124416a(obj2);
        if (!a2.equals(bxyo.f165102a)) {
            a = bxyo.m124425a(a, a2);
        }
        bxyn.m124419a(obj, a);
    }

    /* renamed from: b */
    static void m124361b(Object obj, Object obj2) {
        bxux a = bxut.m123748a(obj2);
        if (!a.mo73910a()) {
            bxux b = bxut.m123751b(obj);
            for (int i = 0; i < a.f164882a.mo74265a(); i++) {
                b.mo73909a(a.f164882a.mo74268b(i));
            }
            for (Map.Entry entry : a.f164882a.mo74267b()) {
                b.mo73909a(entry);
            }
        }
    }

    /* renamed from: a */
    private static bxyn m124346a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (bxyn) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable th2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static Object m124347a(int i, int i2, Object obj) {
        if (obj == null) {
            obj = bxyo.m124424a();
        }
        ((bxyo) obj).mo74283a(bxzh.m124562a(i, 0), Long.valueOf((long) i2));
        return obj;
    }

    /* renamed from: a */
    static Object m124348a(int i, List list, bxvr bxvr, Object obj) {
        if (bxvr == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (!bxvr.mo3213a(intValue)) {
                    obj = m124347a(i, intValue, obj);
                } else {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!bxvr.mo3213a(intValue2)) {
                    obj = m124347a(i, intValue2, obj);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    public static void m124349a(int i, List list, bxul bxul) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof bxwm) {
                bxwm bxwm = (bxwm) list;
                while (i2 < list.size()) {
                    Object b = bxwm.mo74190b(i2);
                    if (b instanceof String) {
                        bxul.f164857a.mo73835a(i, (String) b);
                    } else {
                        bxul.f164857a.mo73832a(i, (bxtx) b);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73835a(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m124350a(int i, List list, bxul bxul, bxxv bxxv) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                bxul.mo73880a(i, list.get(i2), bxxv);
            }
        }
    }

    /* renamed from: a */
    public static void m124351a(int i, List list, bxul bxul, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                bxul.f164857a.mo73845b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Double) list.get(i3)).doubleValue();
                    i4 += 8;
                    i3++;
                    boolean z2 = bxuk.f164855e;
                }
                bxul.f164857a.mo73855d(i4);
                while (i2 < list.size()) {
                    bxul.f164857a.mo73860a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                bxul.f164857a.mo73862a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m124352a(Class cls) {
        Class cls2;
        if (!bxvk.class.isAssignableFrom(cls) && (cls2 = f165070d) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    static void m124353a(Object obj, Object obj2, long j) {
        bxyx.m124506a(obj, j, bxwx.m124143a(bxyx.m124518f(obj, j), bxyx.m124518f(obj2, j)));
    }

    /* renamed from: a */
    static boolean m124354a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
