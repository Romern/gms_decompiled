package androidx.slice;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SliceParcelizer {
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object], assign insn: 0x0061: CHECK_CAST  (r3v6 ? I:java.lang.Object[]) = (java.lang.Object[]) (r3v5 java.lang.Object) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static Slice read(avb avb) {
        Slice slice = new Slice();
        slice.f1652c = (SliceSpec) avb.mo2688b(slice.f1652c, 1);
        slice.f1653d = (SliceItem[]) avb.mo2694b(slice.f1653d, 2);
        slice.f1654e = (String[]) avb.mo2694b(slice.f1654e, 3);
        slice.f1655f = avb.mo2690b(slice.f1655f, 4);
        for (int length = slice.f1653d.length - 1; length >= 0; length--) {
            SliceItem[] sliceItemArr = slice.f1653d;
            SliceItem sliceItem = sliceItemArr[length];
            if (sliceItem.f1659d == null) {
                if (sliceItemArr != null && apf.m1792a(sliceItemArr, sliceItem)) {
                    int length2 = sliceItemArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        } else if (!C1239oe.m19757a(sliceItemArr[i], sliceItem)) {
                            i++;
                        } else if (length2 != 1) {
                            ? r3 = (Object[]) Array.newInstance(SliceItem.class, length2 - 1);
                            System.arraycopy(sliceItemArr, 0, r3, 0, i);
                            System.arraycopy(sliceItemArr, i + 1, r3, i, (length2 - i) - 1);
                            sliceItemArr = r3;
                        } else {
                            sliceItemArr = null;
                        }
                    }
                }
                slice.f1653d = sliceItemArr;
                if (slice.f1653d == null) {
                    slice.f1653d = new SliceItem[0];
                }
            }
        }
        return slice;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      avb.a(int, int):void
      avb.a(android.os.Parcelable, int):void
      avb.a(avg, int):void
      avb.a(java.lang.CharSequence, int):void
      avb.a(java.lang.String, int):void
      avb.a(boolean, int):void
      avb.a(java.lang.Object[], int):void
      avb.a(boolean, boolean):void */
    public static void write(Slice slice, avb avb) {
        avb.mo2682a(true, false);
        avb.mo2685a();
        SliceSpec sliceSpec = slice.f1652c;
        if (sliceSpec != null) {
            avb.mo2675a(sliceSpec, 1);
        }
        if (!Arrays.equals(Slice.f1651b, slice.f1653d)) {
            avb.mo2684a(slice.f1653d, 2);
        }
        if (!Arrays.equals(Slice.f1650a, slice.f1654e)) {
            avb.mo2684a(slice.f1654e, 3);
        }
        String str = slice.f1655f;
        if (str != null) {
            avb.mo2679a(str, 4);
        }
    }
}
