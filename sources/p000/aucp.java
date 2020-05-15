package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: aucp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aucp implements aubg {

    /* renamed from: a */
    final /* synthetic */ Collection f91404a;

    public aucp(Collection collection) {
        this.f91404a = collection;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        ArrayList arrayList = new ArrayList();
        for (aucb aucb2 : this.f91404a) {
            arrayList.add(aucb2.mo50386d());
        }
        return arrayList;
    }
}
