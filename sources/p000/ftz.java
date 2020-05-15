package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ftz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftz {

    /* renamed from: a */
    public final String f17242a;

    /* renamed from: b */
    protected final String f17243b;

    /* renamed from: c */
    protected final String f17244c;

    /* renamed from: d */
    public final String f17245d;

    /* renamed from: e */
    public final String f17246e;

    /* renamed from: f */
    public final String f17247f;

    /* renamed from: g */
    protected final String f17248g;

    /* renamed from: h */
    public final String f17249h;

    /* renamed from: i */
    public final String f17250i;

    /* renamed from: j */
    public final Map f17251j;

    /* renamed from: k */
    public final boolean f17252k;

    public ftz(String str, String str2, String str3, String str4, String str5, Map map, boolean z, String str6, String str7) {
        if (str3 == null) {
            String valueOf = String.valueOf(str2);
            throw new NullPointerException(valueOf.length() == 0 ? new String("A URI column must be specified for table ") : "A URI column must be specified for table ".concat(valueOf));
        }
        this.f17247f = str3;
        this.f17244c = str6;
        if (str6 == null) {
            this.f17248g = null;
        } else if (str7 == null) {
            throw new NullPointerException(str6.length() == 0 ? new String("A Tag column must be specified for table ") : "A Tag column must be specified for table ".concat(str6));
        } else {
            this.f17248g = str7;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str3.length());
            sb.append(str2);
            sb.append("_");
            sb.append(str3);
            str = sb.toString();
        }
        this.f17242a = str;
        this.f17243b = str2;
        if (!str2.equals(this.f17244c)) {
            this.f17249h = str4 == null ? "0" : str4;
            this.f17250i = str5 == null ? "0" : str5;
            this.f17251j = Collections.unmodifiableMap(new HashMap(map));
            this.f17245d = this.f17243b;
            this.f17246e = this.f17244c;
            this.f17252k = z;
            return;
        }
        throw new IllegalArgumentException("Tags table and docs table cannot be the same.");
    }

    /* renamed from: a */
    public static fty m12397a() {
        return new fty();
    }

    /* renamed from: b */
    private final Object[] m12398b() {
        return new Object[]{this.f17242a, this.f17243b, this.f17245d, this.f17247f, this.f17249h, this.f17250i, this.f17251j, null, Boolean.valueOf(this.f17252k), this.f17244c, this.f17246e};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ftz)) {
            return false;
        }
        return Arrays.deepEquals(m12398b(), ((ftz) obj).m12398b());
    }

    public final int hashCode() {
        return Arrays.deepHashCode(m12398b());
    }
}
