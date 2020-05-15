package p000;

import com.google.android.gms.fitness.data.BleDevice;
import java.util.Collection;

/* renamed from: yvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yvv {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bxwc, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public static BleDevice m44921a(cacv cacv) {
        return new BleDevice(cacv.f172631b, cacv.f172632c, bnic.m109495a((Collection) cacv.f172633d), bnic.m109488a(bnjd.m109575a((Iterable) cacv.f172634e, ywa.f54701a)));
    }
}
