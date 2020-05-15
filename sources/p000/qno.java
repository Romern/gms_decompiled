package p000;

import java.util.Set;

/* renamed from: qno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qno extends qnq {

    /* renamed from: a */
    final /* synthetic */ Set f41786a;

    /* renamed from: b */
    final /* synthetic */ bnic f41787b;

    /* renamed from: c */
    final /* synthetic */ boolean f41788c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qno(qmo qmo, boolean z, Set set, bnic bnic, boolean z2) {
        super(qmo, z);
        this.f41786a = set;
        this.f41787b = bnic;
        this.f41788c = z2;
    }

    /* renamed from: a */
    public final boolean mo24137a() {
        return !this.f41787b.isEmpty();
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
        if (this.f41792d.contains(djc.f13310b)) {
            return false;
        }
        Set set = this.f41786a;
        bojy bojy = (bojy) qmk.f41707a.get(0);
        if ((this.f41788c && qnm.m32504a(bojy, false) && !qnm.m32503a(bojy, 128) && !qnq.m32520a(djc, qmk.f41708b, set)) || !this.f41793e.contains(djc.f13310b)) {
            return false;
        }
        if (this.f41787b.isEmpty() || this.f41787b.contains(djc.f13310b)) {
            return true;
        }
        return false;
    }
}
