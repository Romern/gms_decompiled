package p000;

/* renamed from: adoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adoi implements bmxj {

    /* renamed from: a */
    final /* synthetic */ Boolean f62267a;

    /* renamed from: b */
    final /* synthetic */ Boolean f62268b;

    public adoi(Boolean bool, Boolean bool2) {
        this.f62267a = bool;
        this.f62268b = bool2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(this.f62267a.booleanValue() && this.f62268b.booleanValue() && bool.booleanValue());
        adnt.m50869a("Batch indexing status=%s", valueOf);
        return valueOf;
    }
}
