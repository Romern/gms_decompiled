package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfk extends bnfm implements ConcurrentMap {
    protected bnfk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ConcurrentMap mo67519a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Map mo67520b() {
        throw null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        return mo67519a().putIfAbsent(obj, obj2);
    }

    public final boolean remove(Object obj, Object obj2) {
        return mo67519a().remove(obj, obj2);
    }

    public final Object replace(Object obj, Object obj2) {
        return mo67519a().replace(obj, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return mo67519a().replace(obj, obj2, obj3);
    }
}
