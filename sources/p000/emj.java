package p000;

import android.util.SparseArray;
import java.util.EnumMap;

/* renamed from: emj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emj {

    /* renamed from: a */
    private static SparseArray f15270a = new SparseArray();

    /* renamed from: b */
    private static EnumMap f15271b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [eie, int]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(eie.class);
        f15271b = enumMap;
        enumMap.put((Enum) eie.DEFAULT, (Object) 0);
        f15271b.put((Enum) eie.VERY_LOW, (Object) 1);
        f15271b.put((Enum) eie.HIGHEST, (Object) 2);
        for (eie eie : f15271b.keySet()) {
            f15270a.append(((Integer) f15271b.get(eie)).intValue(), eie);
        }
    }

    /* renamed from: a */
    public static int m10666a(eie eie) {
        Integer num = (Integer) f15271b.get(eie);
        if (num != null) {
            return num.intValue();
        }
        String valueOf = String.valueOf(eie);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static eie m10667a(int i) {
        eie eie = (eie) f15270a.get(i);
        if (eie != null) {
            return eie;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
