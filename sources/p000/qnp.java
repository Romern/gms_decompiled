package p000;

import java.util.Set;

/* renamed from: qnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qnp extends qnq {

    /* renamed from: a */
    final /* synthetic */ Set f41789a;

    /* renamed from: b */
    final /* synthetic */ dky f41790b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qnp(qmo qmo, boolean z, Set set, dky dky) {
        super(qmo, z);
        this.f41789a = set;
        this.f41790b = dky;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24137a() {
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnm.a(bojy, boolean):boolean
     arg types: [bojy, int]
     candidates:
      qnm.a(long, long):boolean
      qnm.a(bojy, int):boolean
      qnm.a(qmk, int):boolean
      qnm.a(qmk, qmk):boolean
      qnm.a(qmk, qox):boolean
      qnm.a(bojy, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24138a(djc djc, qmk qmk) {
        if (this.f41792d.contains(djc.f13310b) || !this.f41793e.contains(djc.f13310b)) {
            return false;
        }
        if (qnq.m32520a(djc, qmk.f41708b, this.f41789a)) {
            return true;
        }
        if ((qnm.m32504a((bojy) qmk.f41707a.get(0), false) && qnm.m32507a(qmk, 64)) || !this.f41790b.contains(djc.f13310b)) {
            return false;
        }
        return true;
    }
}
