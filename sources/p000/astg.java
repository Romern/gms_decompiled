package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: astg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astg {

    /* renamed from: a */
    public static final astg f89658a = new astg(36864, "no error");

    /* renamed from: b */
    public static final astg f89659b = new astg(25088, "Warning: State unchanged");

    /* renamed from: c */
    public static final astg f89660c = new astg(25219, "Warning: Card Manager is locked");

    /* renamed from: d */
    public static final astg f89661d = new astg(25344, "Warning: State changed (no information given)");

    /* renamed from: e */
    public static final astg f89662e = new astg(25360, "more data");

    /* renamed from: f */
    public static final astg f89663f = new astg(25536, "PIN authentication failed.");

    /* renamed from: g */
    public static final astg f89664g = new astg(26368, "Wrong length");

    /* renamed from: h */
    public static final astg f89665h = new astg(27010, "Security status not satisfied");

    /* renamed from: i */
    public static final astg f89666i = new astg(27011, "File invalid");

    /* renamed from: j */
    public static final astg f89667j = new astg(27012, "Reference data not usable");

    /* renamed from: k */
    public static final astg f89668k = new astg(27013, "Conditions of use not satisfied");

    /* renamed from: l */
    public static final astg f89669l = new astg(27014, "Command not allowed");

    /* renamed from: m */
    public static final astg f89670m = new astg(27033, "Applet selection failed");

    /* renamed from: n */
    public static final astg f89671n = new astg(27264, "Wrong data");

    /* renamed from: o */
    public static final astg f89672o = new astg(27265, "Function not supported");

    /* renamed from: p */
    public static final astg f89673p = new astg(27266, "File not found");

    /* renamed from: q */
    public static final astg f89674q = new astg(27267, "Record not found");

    /* renamed from: r */
    public static final astg f89675r = new astg(27270, "Incorrect P1 or P2");

    /* renamed from: s */
    public static final astg f89676s = new astg(27272, "Referenced data not found");

    /* renamed from: t */
    public static final astg f89677t = new astg(27273, "File already exists");

    /* renamed from: u */
    public static final astg f89678u = new astg(27392, "Wrong P1 or P2");

    /* renamed from: v */
    public static final astg f89679v = new astg(27904, "Instruction not supported or invalid");

    /* renamed from: w */
    public static final astg f89680w = new astg(28160, "Class not supported");

    /* renamed from: x */
    public static final astg f89681x;

    /* renamed from: y */
    public static final Set f89682y;

    /* renamed from: A */
    private final int f89683A;

    /* renamed from: z */
    private final String f89684z;

    static {
        astg astg = new astg(28416, "Unknown error (no precise diagnosis)");
        f89681x = astg;
        f89682y = bnic.m109494a(f89658a, f89659b, f89660c, f89661d, f89662e, f89663f, f89664g, f89665h, f89666i, f89667j, f89668k, f89669l, f89670m, f89671n, f89672o, f89673p, f89674q, f89675r, f89676s, f89677t, f89678u, f89679v, f89680w, astg);
        LinkedHashMap linkedHashMap = new LinkedHashMap(f89682y.size());
        for (astg astg2 : f89682y) {
            linkedHashMap.put(Integer.valueOf(astg2.f89683A), astg2);
        }
        Collections.unmodifiableMap(linkedHashMap);
    }

    private astg(int i, String str) {
        this.f89683A = i;
        this.f89684z = str;
    }

    /* renamed from: a */
    public static boolean m74759a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!f89682y.contains((astg) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            astg astg = (astg) obj;
            if (astg.f89683A != this.f89683A || !astg.f89684z.equals(this.f89684z)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f89683A), this.f89684z});
    }

    public final String toString() {
        return String.format("'%04X': %s", Integer.valueOf(this.f89683A), this.f89684z);
    }
}
