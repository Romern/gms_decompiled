package androidx.slice;

import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SliceItemParcelizer {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r6.equals("image") != false) goto L_0x008d;
     */
    public static SliceItem read(avb avb) {
        Object obj;
        SliceItem sliceItem = new SliceItem();
        char c = 1;
        sliceItem.f1656a = (String[]) avb.mo2694b(sliceItem.f1656a, 1);
        sliceItem.f1657b = avb.mo2690b(sliceItem.f1657b, 2);
        sliceItem.f1658c = avb.mo2690b(sliceItem.f1658c, 3);
        sliceItem.f1661f = (SliceItemHolder) avb.mo2688b(sliceItem.f1661f, 4);
        SliceItemHolder sliceItemHolder = sliceItem.f1661f;
        if (sliceItemHolder != null) {
            String str = sliceItem.f1657b;
            if (SliceItemHolder.f1663b != null) {
                SliceItemHolder.f1663b.mo2270a(sliceItemHolder, str);
            }
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (str.equals("int")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3327612:
                    if (str.equals("long")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    Parcelable parcelable = sliceItemHolder.f1665d;
                    if (parcelable != null || sliceItemHolder.f1664c != null) {
                        if (parcelable == null) {
                            parcelable = null;
                        }
                        obj = new C1240of(parcelable, (Slice) sliceItemHolder.f1664c);
                        break;
                    } else {
                        obj = null;
                        break;
                    }
                    break;
                case 1:
                case 2:
                    obj = sliceItemHolder.f1664c;
                    break;
                case 3:
                    obj = sliceItemHolder.f1665d;
                    break;
                case 4:
                    String str2 = sliceItemHolder.f1666e;
                    if (str2 != null && str2.length() != 0) {
                        obj = C1212ne.m19667a(sliceItemHolder.f1666e, 0);
                        break;
                    } else {
                        obj = "";
                        break;
                    }
                    break;
                case 5:
                    obj = Integer.valueOf(sliceItemHolder.f1667f);
                    break;
                case 6:
                    obj = Long.valueOf(sliceItemHolder.f1668g);
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized format " + str);
            }
            sliceItem.f1659d = obj;
            SliceItemHolder sliceItemHolder2 = sliceItem.f1661f;
            apk apk = sliceItemHolder2.f1669h;
            if (apk != null) {
                sliceItemHolder2.f1665d = null;
                sliceItemHolder2.f1664c = null;
                sliceItemHolder2.f1667f = 0;
                sliceItemHolder2.f1668g = 0;
                sliceItemHolder2.f1666e = null;
                apk.f1929a.add(sliceItemHolder2);
            }
        } else {
            sliceItem.f1659d = null;
        }
        sliceItem.f1661f = null;
        return sliceItem;
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
    public static void write(SliceItem sliceItem, avb avb) {
        avb.mo2682a(true, true);
        sliceItem.f1661f = new SliceItemHolder(sliceItem.f1657b, sliceItem.f1659d, avb.mo2685a());
        if (!Arrays.equals(Slice.f1650a, sliceItem.f1656a)) {
            avb.mo2684a(sliceItem.f1656a, 1);
        }
        if (!"text".equals(sliceItem.f1657b)) {
            avb.mo2679a(sliceItem.f1657b, 2);
        }
        String str = sliceItem.f1658c;
        if (str != null) {
            avb.mo2679a(str, 3);
        }
        avb.mo2675a(sliceItem.f1661f, 4);
    }
}
