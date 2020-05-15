package androidx.slice;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SliceSpecParcelizer {
    public static SliceSpec read(avb avb) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.f1670a = avb.mo2690b(sliceSpec.f1670a, 1);
        sliceSpec.f1671b = avb.mo2686b(sliceSpec.f1671b, 2);
        return sliceSpec;
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
    public static void write(SliceSpec sliceSpec, avb avb) {
        avb.mo2682a(true, false);
        avb.mo2679a(sliceSpec.f1670a, 1);
        int i = sliceSpec.f1671b;
        if (i != 1) {
            avb.mo2669a(i, 2);
        }
    }
}
