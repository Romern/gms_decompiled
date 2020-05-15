package p000;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bdox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdox implements cayy {

    /* renamed from: a */
    private final cijl f106173a;

    public bdox(cijl cijl) {
        this.f106173a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        if (((bdic) this.f106173a.mo6445a()).mo57989g()) {
            obj = bmxv.m108566b(new ConcurrentHashMap());
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
