package p000;

import java.util.Comparator;

/* renamed from: rua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rua implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f43682a;

    /* renamed from: b */
    final /* synthetic */ rub f43683b;

    public rua(rub rub, Comparator comparator) {
        this.f43683b = rub;
        this.f43682a = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f43682a.compare(((amev) this.f43683b.f43684a).mo24661a(((Integer) obj).intValue()), ((amev) this.f43683b.f43684a).mo24661a(((Integer) obj2).intValue()));
    }
}
