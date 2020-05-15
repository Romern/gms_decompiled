package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bewy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewy {

    /* renamed from: a */
    private static final beur[] f112864a = {beur.STILL, beur.WALKING, beur.RUNNING, beur.ON_BICYCLE, beur.IN_VEHICLE, beur.UNKNOWN};

    /* renamed from: b */
    private final bewx[] f112865b;

    /* renamed from: c */
    private final float f112866c;

    public bewy(bewx[] bewxArr, float f) {
        this.f112865b = bewxArr;
        this.f112866c = f;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:70:0x00bb */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: bewx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: bewx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: bewx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: bewx} */
    /* JADX WARN: Type inference failed for: r11v2, assign insn: PHI: (r11v2 ?) = (r11v1 bewx), (r11v1 bewx), (r11v3 bewx) binds: [B:70:0x00bb, B:71:0x00bb, B:69:0x00bb] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static List m96006a(List list, beuq beuq, List list2) {
        beus beus;
        ArrayList arrayList;
        List list3 = null;
        if (list2.isEmpty()) {
            return null;
        }
        beur[] beurArr = f112864a;
        int length = beurArr.length;
        char c = 0;
        beur beur = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                beus = new beus(beur, i2);
                break;
            }
            beur beur2 = beurArr[i];
            int a = beus.m95921a(list, beur2);
            if (a > 50) {
                beus = new beus(beur2, a);
                break;
            }
            if (a > i2) {
                beur = beur2;
            }
            if (a > i2) {
                i2 = a;
            }
            i++;
        }
        beur beur3 = beus.f112544a;
        if (beur3 != beur.ON_BICYCLE && (!cezo.f183530a.mo6606a().applyActivityPersonalizationForWalking() || beur3 != beur.WALKING)) {
            return null;
        }
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            bewy bewy = (bewy) list2.get(i3);
            bewx[] bewxArr = bewy.f112865b;
            if (bewxArr.length > 0 && bewxArr[c].f112861a.length != beuq.mo61161a().length) {
                return list3;
            }
            float[] a2 = beuq.mo61161a();
            double d = (double) bewy.f112866c;
            beul.m95908e(a2);
            bewx[] bewxArr2 = bewy.f112865b;
            int length2 = bewxArr2.length;
            bewx bewx = list3;
            int i4 = 0;
            while (i4 < length2) {
                bewx bewx2 = bewxArr2[i4];
                double d2 = 0.0d;
                int i5 = 0;
                while (i5 < a2.length) {
                    float f = a2[i5] - bewx2.f112861a[i5];
                    double d3 = (double) (f * f);
                    Double.isNaN(d3);
                    d2 += d3;
                    i5++;
                    size = size;
                }
                int i6 = size;
                double sqrt = Math.sqrt(d2);
                if (sqrt < d && ((long) bewx2.f112863c) >= cezo.f183530a.mo6606a().personalizationClusterMinSize()) {
                    d = sqrt;
                    bewx = bewx2;
                }
                i4++;
                size = i6;
                bewx = bewx;
            }
            int i7 = size;
            if (bewx == 0 || !bewx.f112862b) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                arrayList.add(new beus(beur.UNKNOWN, 100));
                arrayList.add(new beus(beur.ON_BICYCLE, 0));
            }
            if (arrayList != null && arrayList.size() == 2 && beus.m95921a(arrayList, beur.UNKNOWN) == 100 && beus.m95921a(arrayList, beur.ON_BICYCLE) == 0) {
                return arrayList;
            }
            i3++;
            size = i7;
            list3 = null;
            c = 0;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bewy) {
            bewy bewy = (bewy) obj;
            return Arrays.equals(this.f112865b, bewy.f112865b) && this.f112866c == bewy.f112866c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f112865b)), Float.valueOf(this.f112866c)});
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f112865b);
        float f = this.f112866c;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 91);
        sb.append("ActivityPersonalizationFeatureBasedModel clusters: ");
        sb.append(arrays);
        sb.append("; maxDistanceToCentroid: ");
        sb.append(f);
        return sb.toString();
    }
}
