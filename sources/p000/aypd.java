package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: aypd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aypd {

    /* renamed from: a */
    public final byte[] f98156a;

    /* renamed from: b */
    public final short[] f98157b;

    public aypd(byte[] bArr, short[] sArr) {
        List list;
        this.f98156a = bArr;
        int length = sArr.length;
        if (length == 0) {
            list = Collections.emptyList();
        } else {
            list = new bqcs(sArr, 0, length);
        }
        HashSet hashSet = new HashSet(list);
        if (hashSet.contains((short) 4363)) {
            hashSet.remove((short) 4360);
            hashSet.remove((short) 4382);
        }
        this.f98157b = bqct.m112603a(hashSet);
    }

    public final String toString() {
        String str;
        String a = aynj.m84357a(this.f98156a);
        short[] sArr = this.f98157b;
        int length = sArr.length;
        if (length > 0) {
            bmxy.m108581a(",");
            StringBuilder sb = new StringBuilder(length * 6);
            sb.append((int) sArr[0]);
            for (int i = 1; i < sArr.length; i++) {
                sb.append(",");
                sb.append((int) sArr[i]);
            }
            str = sb.toString();
        } else {
            str = "(none)";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 37 + String.valueOf(str).length());
        sb2.append("BrEdrHandoverInformation{");
        sb2.append(a);
        sb2.append(", profiles=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
