package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bnci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnci extends bndd implements bnkd {
    private static final long serialVersionUID = 6588350623831699109L;

    protected bnci(Map map) {
        super(map);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo67121a() {
        throw null;
    }

    /* renamed from: a */
    public final Collection mo67122a(Object obj, Collection collection) {
        return mo67266a(obj, (List) collection, null);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo67125b() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public final Collection mo67123a(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* renamed from: b */
    public final List mo67126b(Object obj) {
        return (List) super.mo67272e(obj);
    }

    /* renamed from: a */
    public final List mo67127c(Object obj) {
        return (List) super.mo67127c(obj);
    }
}
