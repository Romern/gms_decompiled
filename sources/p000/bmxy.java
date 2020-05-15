package p000;

/* renamed from: bmxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxy {
    /* renamed from: a */
    public static Object m108581a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m108599b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m108583a(i, i2, "index"));
        }
    }

    /* renamed from: a */
    public static Object m108582a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: a */
    private static String m108583a(int i, int i2, String str) {
        if (i < 0) {
            return bmzh.m108675a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return bmzh.m108675a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m108600b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m108601b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m108602b(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(bmzh.m108675a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m108584a(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = bmzh.m108675a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str = bmzh.m108675a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: b */
    public static void m108603b(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(bmzh.m108675a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: b */
    public static void m108604b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(bmzh.m108675a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: b */
    public static void m108605b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(bmzh.m108675a(str, obj));
        }
    }

    /* renamed from: b */
    public static void m108606b(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(bmzh.m108675a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m108585a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m108583a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m108583a(i2, i3, "end index");
            } else {
                str = bmzh.m108675a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: a */
    public static void m108586a(Object obj, String str, int i) {
        if (obj == null) {
            throw new NullPointerException(bmzh.m108675a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m108587a(Object obj, String str, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(bmzh.m108675a(str, obj2));
        }
    }

    /* renamed from: a */
    public static void m108588a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m108589a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m108590a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: a */
    public static void m108591a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m108592a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: a */
    public static void m108593a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public static void m108594a(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* renamed from: a */
    public static void m108595a(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: a */
    public static void m108596a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m108597a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m108598a(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalStateException(bmzh.m108675a(str, obj, obj2, obj3, obj4));
        }
    }
}
