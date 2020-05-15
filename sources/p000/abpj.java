package p000;

import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: abpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpj {
    /* renamed from: a */
    static void m48039a(NativeIndex nativeIndex, abto abto, acxd acxd, abpi abpi) {
        if (!NativeIndex.nativeAddUsageReport(nativeIndex.f79071b, abto.serializeToBytes())) {
            abpi.f57852b++;
            acxd.mo33187a("failed usage report");
            return;
        }
        abpi.f57851a++;
        acxd.mo33187a("usage report");
    }
}
