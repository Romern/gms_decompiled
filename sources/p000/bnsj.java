package p000;

/* renamed from: bnsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnsj {

    /* renamed from: a */
    public final String f132072a;

    /* renamed from: b */
    private final Class f132073b;

    protected bnsj(String str, Class cls) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        } else if (!bnuy.m110475a(str.charAt(0))) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("identifier must start with an ASCII letter: ") : "identifier must start with an ASCII letter: ".concat(str));
        } else {
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!bnuy.m110475a(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    throw new IllegalArgumentException(str.length() == 0 ? new String("identifier must contain only ASCII letters, digits or underscore: ") : "identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                }
            }
            this.f132072a = str;
            bnuy.m110474a(cls, "class");
            this.f132073b = cls;
        }
    }

    /* renamed from: a */
    public static bnsj m110325a(String str, Class cls) {
        return new bnsj(str, cls);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.f132072a;
        String name2 = this.f132073b.getName();
        int length = String.valueOf(name).length();
        StringBuilder sb = new StringBuilder(length + 3 + str.length() + String.valueOf(name2).length());
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final Object mo68460a(Object obj) {
        return this.f132073b.cast(obj);
    }
}
