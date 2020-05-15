package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bau {

    /* renamed from: a */
    public bav f2814a;

    /* renamed from: b */
    private final List f2815b;

    private bau(bau bau) {
        this.f2815b = new ArrayList(bau.f2815b);
        this.f2814a = bau.f2814a;
    }

    /* renamed from: a */
    private final boolean m2605a() {
        List list = this.f2815b;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    /* renamed from: b */
    private static final boolean m2606b(String str) {
        return "__container".equals(str);
    }

    /* renamed from: c */
    public final boolean mo2965c(String str, int i) {
        if (i >= this.f2815b.size()) {
            return false;
        }
        int size = this.f2815b.size() - 1;
        String str2 = (String) this.f2815b.get(i);
        if (!str2.equals("**")) {
            boolean z = str2.equals(str) || str2.equals("*");
            if ((i == size || (i == this.f2815b.size() - 2 && m2605a())) && z) {
                return true;
            }
            return false;
        } else if (i == size) {
            return true;
        } else {
            int i2 = i + 1;
            if (((String) this.f2815b.get(i2)).equals(str)) {
                if (i == this.f2815b.size() - 2 || (i == this.f2815b.size() - 3 && m2605a())) {
                    return true;
                }
                return false;
            } else if (i2 >= this.f2815b.size() - 1) {
                return ((String) this.f2815b.get(i2)).equals(str);
            } else {
                return false;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo2966d(String str, int i) {
        if ("__container".equals(str) || i < this.f2815b.size() - 1 || ((String) this.f2815b.get(i)).equals("**")) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f2815b);
        sb.append(",resolved=");
        sb.append(this.f2814a != null);
        sb.append('}');
        return sb.toString();
    }

    public bau(String... strArr) {
        this.f2815b = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final bau mo2961a(bav bav) {
        bau bau = new bau(this);
        bau.f2814a = bav;
        return bau;
    }

    /* renamed from: b */
    public final int mo2964b(String str, int i) {
        if (m2606b(str)) {
            return 0;
        }
        if (!((String) this.f2815b.get(i)).equals("**")) {
            return 1;
        }
        if (i == this.f2815b.size() - 1 || !((String) this.f2815b.get(i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public final bau mo2962a(String str) {
        bau bau = new bau(this);
        bau.f2815b.add(str);
        return bau;
    }

    /* renamed from: a */
    public final boolean mo2963a(String str, int i) {
        if (m2606b(str)) {
            return true;
        }
        if (i >= this.f2815b.size()) {
            return false;
        }
        if (((String) this.f2815b.get(i)).equals(str) || ((String) this.f2815b.get(i)).equals("**") || ((String) this.f2815b.get(i)).equals("*")) {
            return true;
        }
        return false;
    }
}
