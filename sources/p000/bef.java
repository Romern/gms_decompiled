package p000;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: bef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bef implements Closeable {

    /* renamed from: a */
    public static final String[] f3065a = new String[128];

    /* renamed from: b */
    int f3066b;

    /* renamed from: c */
    int[] f3067c = new int[32];

    /* renamed from: d */
    String[] f3068d = new String[32];

    /* renamed from: e */
    int[] f3069e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            f3065a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f3065a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: a */
    public static bef m2756a(cipw cipw) {
        return new beg(cipw);
    }

    /* renamed from: a */
    public abstract int mo3019a(bed bed);

    /* renamed from: a */
    public abstract void mo3021a();

    /* renamed from: b */
    public abstract void mo3023b();

    /* renamed from: c */
    public abstract void mo3024c();

    /* renamed from: d */
    public abstract void mo3025d();

    /* renamed from: e */
    public abstract boolean mo3026e();

    /* renamed from: f */
    public abstract String mo3027f();

    /* renamed from: g */
    public abstract void mo3028g();

    /* renamed from: h */
    public abstract String mo3029h();

    /* renamed from: i */
    public abstract boolean mo3030i();

    /* renamed from: j */
    public abstract double mo3031j();

    /* renamed from: k */
    public abstract int mo3032k();

    /* renamed from: l */
    public abstract void mo3033l();

    /* renamed from: m */
    public final String mo3034m() {
        int i = this.f3066b;
        int[] iArr = this.f3067c;
        String[] strArr = this.f3068d;
        int[] iArr2 = this.f3069e;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    public abstract int mo3035n();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bec mo3020a(String str) {
        throw new bec(str + " at path " + mo3034m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3022a(int i) {
        int i2 = this.f3066b;
        int[] iArr = this.f3067c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.f3067c = Arrays.copyOf(iArr, length + length);
                String[] strArr = this.f3068d;
                int length2 = strArr.length;
                this.f3068d = (String[]) Arrays.copyOf(strArr, length2 + length2);
                int[] iArr2 = this.f3069e;
                int length3 = iArr2.length;
                this.f3069e = Arrays.copyOf(iArr2, length3 + length3);
            } else {
                throw new beb("Nesting too deep at " + mo3034m());
            }
        }
        int[] iArr3 = this.f3067c;
        int i3 = this.f3066b;
        this.f3066b = i3 + 1;
        iArr3[i3] = i;
    }
}
