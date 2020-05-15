package p000;

import java.util.Comparator;

/* renamed from: knp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class knp implements Comparator {

    /* renamed from: a */
    final /* synthetic */ bnhe f24538a;

    public knp(bnhe bnhe) {
        this.f24538a = bnhe;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) this.f24538a.get(((kjl) obj).mo14516a())).intValue() - ((Integer) this.f24538a.get(((kjl) obj2).mo14516a())).intValue();
    }
}
