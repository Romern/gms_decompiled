package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: cauc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauc {

    /* renamed from: a */
    private final String[] f175980a;

    public cauc(caub caub) {
        List list = caub.f175979a;
        this.f175980a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    public final int mo74871a() {
        return this.f175980a.length >> 1;
    }

    /* renamed from: b */
    public final caub mo74874b() {
        caub caub = new caub();
        Collections.addAll(caub.f175979a, this.f175980a);
        return caub;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = mo74871a();
        for (int i = 0; i < a; i++) {
            sb.append(mo74872a(i));
            sb.append(": ");
            sb.append(mo74875b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo74872a(int i) {
        int i2 = i + i;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f175980a;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    /* renamed from: b */
    public final String mo74875b(int i) {
        int i2 = i + i + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f175980a;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    /* renamed from: a */
    public final String mo74873a(String str) {
        String[] strArr = this.f175980a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
