package p000;

import java.util.List;
import java.util.Locale;

/* renamed from: bcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcj {

    /* renamed from: a */
    public final List f2963a;

    /* renamed from: b */
    public final axw f2964b;

    /* renamed from: c */
    public final String f2965c;

    /* renamed from: d */
    public final long f2966d;

    /* renamed from: e */
    public final long f2967e;

    /* renamed from: f */
    public final String f2968f;

    /* renamed from: g */
    public final List f2969g;

    /* renamed from: h */
    public final bbk f2970h;

    /* renamed from: i */
    public final int f2971i;

    /* renamed from: j */
    public final int f2972j;

    /* renamed from: k */
    public final int f2973k;

    /* renamed from: l */
    public final float f2974l;

    /* renamed from: m */
    public final float f2975m;

    /* renamed from: n */
    public final int f2976n;

    /* renamed from: o */
    public final int f2977o;

    /* renamed from: p */
    public final bbi f2978p;

    /* renamed from: q */
    public final bbj f2979q;

    /* renamed from: r */
    public final bba f2980r;

    /* renamed from: s */
    public final List f2981s;

    /* renamed from: t */
    public final boolean f2982t;

    /* renamed from: u */
    public final int f2983u;

    /* renamed from: v */
    public final int f2984v;

    public bcj(List list, axw axw, String str, long j, int i, long j2, String str2, List list2, bbk bbk, int i2, int i3, int i4, float f, float f2, int i5, int i6, bbi bbi, bbj bbj, List list3, int i7, bba bba, boolean z) {
        this.f2963a = list;
        this.f2964b = axw;
        this.f2965c = str;
        this.f2966d = j;
        this.f2983u = i;
        this.f2967e = j2;
        this.f2968f = str2;
        this.f2969g = list2;
        this.f2970h = bbk;
        this.f2971i = i2;
        this.f2972j = i3;
        this.f2973k = i4;
        this.f2974l = f;
        this.f2975m = f2;
        this.f2976n = i5;
        this.f2977o = i6;
        this.f2978p = bbi;
        this.f2979q = bbj;
        this.f2981s = list3;
        this.f2984v = i7;
        this.f2980r = bba;
        this.f2982t = z;
    }

    /* renamed from: a */
    public final String mo2995a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f2965c);
        sb.append("\n");
        bcj a = this.f2964b.mo2857a(this.f2967e);
        if (a != null) {
            sb.append("\t\tParents: ");
            sb.append(a.f2965c);
            bcj a2 = this.f2964b.mo2857a(a.f2967e);
            while (a2 != null) {
                sb.append("->");
                sb.append(a2.f2965c);
                a2 = this.f2964b.mo2857a(a2.f2967e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f2969g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f2969g.size());
            sb.append("\n");
        }
        if (!(this.f2971i == 0 || this.f2972j == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f2971i), Integer.valueOf(this.f2972j), Integer.valueOf(this.f2973k)));
        }
        if (!this.f2963a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f2963a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return mo2995a("");
    }
}
