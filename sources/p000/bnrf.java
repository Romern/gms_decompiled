package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: bnrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnrf extends bnri {

    /* renamed from: a */
    final /* synthetic */ bnrk f132031a;

    /* renamed from: b */
    private final char[][] f132032b;

    /* renamed from: c */
    private final int f132033c;

    /* renamed from: d */
    private final char f132034d;

    public bnrf(bnrk bnrk, Map map) {
        char[][] cArr;
        this.f132031a = bnrk;
        bmxy.m108581a(map);
        if (!map.isEmpty()) {
            cArr = new char[(((Character) Collections.max(map.keySet())).charValue() + 1)][];
            for (Character ch : map.keySet()) {
                char charValue = ch.charValue();
                cArr[charValue] = ((String) map.get(Character.valueOf(charValue))).toCharArray();
            }
        } else {
            cArr = bnrg.f132035b;
        }
        bnrg bnrg = new bnrg(cArr);
        bmxy.m108581a(bnrg);
        char[][] cArr2 = bnrg.f132036a;
        this.f132032b = cArr2;
        this.f132033c = cArr2.length;
        this.f132034d = 65535;
        String str = this.f132031a.f132039b;
    }

    /* renamed from: a */
    public final String mo68384a(String str) {
        char[] cArr;
        bmxy.m108581a(str);
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if ((charAt >= this.f132033c || this.f132032b[charAt] == null) && charAt <= this.f132034d) {
                i++;
            } else {
                int length = str.length();
                char[] cArr2 = (char[]) bnrn.f132040a.get();
                int length2 = cArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    char[] cArr3 = null;
                    if (charAt2 < this.f132033c && (cArr = this.f132032b[charAt2]) != null) {
                        cArr3 = cArr;
                    } else if (charAt2 <= this.f132034d) {
                    }
                    if (cArr3 != null) {
                        int length3 = cArr3.length;
                        int i4 = i - i2;
                        int i5 = i3 + i4;
                        int i6 = i5 + length3;
                        if (length2 < i6) {
                            int i7 = length - i;
                            length2 = i7 + i7 + i6;
                            cArr2 = bnri.m110166a(cArr2, i3, length2);
                        }
                        if (i4 > 0) {
                            str.getChars(i2, i, cArr2, i3);
                            i3 = i5;
                        }
                        if (length3 > 0) {
                            System.arraycopy(cArr3, 0, cArr2, i3, length3);
                            i3 += length3;
                        }
                        i2 = i + 1;
                    }
                    i++;
                }
                int i8 = length - i2;
                if (i8 > 0) {
                    int i9 = i8 + i3;
                    if (length2 < i9) {
                        cArr2 = bnri.m110166a(cArr2, i3, i9);
                    }
                    str.getChars(i2, length, cArr2, i3);
                    i3 = i9;
                }
                return new String(cArr2, 0, i3);
            }
        }
        return str;
    }
}
