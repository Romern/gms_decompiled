package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: beav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beav extends LinkedHashMap {

    /* renamed from: a */
    final /* synthetic */ beaw f106853a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public beav(beaw beaw) {
        super(134, 0.75f, true);
        this.f106853a = beaw;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f106853a.f106854a;
    }
}
