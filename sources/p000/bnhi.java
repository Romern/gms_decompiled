package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhi extends bnit {

    /* renamed from: a */
    private final bnhe f131624a;

    public bnhi(bnhe bnhe) {
        this.f131624a = bnhe;
    }

    /* renamed from: a */
    public final bnrd mo67631a() {
        return this.f131624a.mo67650cS();
    }

    public final boolean contains(Object obj) {
        return this.f131624a.containsKey(obj);
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.f131624a.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnhh(this.f131624a);
    }

    /* renamed from: a */
    public final Object mo67716a(int i) {
        return ((Map.Entry) this.f131624a.entrySet().mo67639g().get(i)).getKey();
    }
}
