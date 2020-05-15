package p000;

import com.google.android.gms.thunderbird.state.EmergencyInfo;

/* renamed from: aufy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufy {

    /* renamed from: a */
    public final aufq f91746a;

    /* renamed from: b */
    public final EmergencyInfo f91747b;

    public aufy(aufq aufq, EmergencyInfo emergencyInfo) {
        this.f91746a = aufq;
        this.f91747b = emergencyInfo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
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
    public final String toString() {
        String str = this.f91746a.f91719a;
        String valueOf = String.valueOf(bnjd.m109575a((Iterable) this.f91747b.f109087b, aufx.f91745a));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }
}
