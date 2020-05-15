package p000;

import java.util.Comparator;

/* renamed from: knq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class knq implements Comparator {

    /* renamed from: a */
    final /* synthetic */ bnhe f24539a;

    public knq(bnhe bnhe) {
        this.f24539a = bnhe;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) this.f24539a.get(((kjl) obj).mo14516a())).intValue() - ((Integer) this.f24539a.get(((kjl) obj2).mo14516a())).intValue();
    }
}
