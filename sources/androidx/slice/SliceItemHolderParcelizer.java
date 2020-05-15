package androidx.slice;

import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SliceItemHolderParcelizer {
    private static apk sBuilder = new apk();

    public static SliceItemHolder read(avb avb) {
        SliceItemHolder sliceItemHolder;
        apk apk = sBuilder;
        if (apk.f1929a.size() > 0) {
            ArrayList arrayList = apk.f1929a;
            sliceItemHolder = (SliceItemHolder) arrayList.remove(arrayList.size() - 1);
        } else {
            sliceItemHolder = new SliceItemHolder(apk);
        }
        sliceItemHolder.f1664c = avb.mo2688b(sliceItemHolder.f1664c, 1);
        sliceItemHolder.f1665d = avb.mo2687b(sliceItemHolder.f1665d, 2);
        sliceItemHolder.f1666e = avb.mo2690b(sliceItemHolder.f1666e, 3);
        sliceItemHolder.f1667f = avb.mo2686b(sliceItemHolder.f1667f, 4);
        long j = sliceItemHolder.f1668g;
        if (avb.mo2692b(5)) {
            j = avb.mo2698e();
        }
        sliceItemHolder.f1668g = j;
        return sliceItemHolder;
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
    public static void write(SliceItemHolder sliceItemHolder, avb avb) {
        avb.mo2682a(true, true);
        avg avg = sliceItemHolder.f1664c;
        if (avg != null) {
            avb.mo2675a(avg, 1);
        }
        Parcelable parcelable = sliceItemHolder.f1665d;
        if (parcelable != null) {
            avb.mo2673a(parcelable, 2);
        }
        String str = sliceItemHolder.f1666e;
        if (str != null) {
            avb.mo2679a(str, 3);
        }
        int i = sliceItemHolder.f1667f;
        if (i != 0) {
            avb.mo2669a(i, 4);
        }
        long j = sliceItemHolder.f1668g;
        if (j != 0) {
            avb.mo2696c(5);
            avb.mo2670a(j);
        }
    }
}
