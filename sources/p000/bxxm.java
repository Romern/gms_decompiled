package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bxxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxxm {

    /* renamed from: a */
    public static final bxxm f165037a = new bxxm();

    /* renamed from: b */
    private final ConcurrentMap f165038b = new ConcurrentHashMap();

    /* renamed from: c */
    private final bxwt f165039c = new bxwt();

    private bxxm() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxwd.a(java.lang.Object, java.lang.String):void
     arg types: [java.lang.Class, java.lang.String]
     candidates:
      bxwd.a(java.lang.Object, java.lang.Object):java.lang.Object
      bxwd.a(java.lang.Object, java.lang.String):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxwd.a(java.lang.Object, java.lang.String):void
     arg types: [bxxv, java.lang.String]
     candidates:
      bxwd.a(java.lang.Object, java.lang.Object):java.lang.Object
      bxwd.a(java.lang.Object, java.lang.String):void */
    /* renamed from: a */
    public final bxxv mo74227a(Class cls) {
        bxwd.m124084a((Object) cls, "messageType");
        bxxv bxxv = (bxxv) this.f165038b.get(cls);
        if (bxxv == null) {
            bxwt bxwt = this.f165039c;
            bxxw.m124352a(cls);
            bxwz b = bxwt.f165007a.mo73931b(cls);
            if (b.mo74213a()) {
                if (bxvk.class.isAssignableFrom(cls)) {
                    bxxv = bxxg.m124227a(bxxw.f165069c, bxuu.f164876a, b.mo74214b());
                } else {
                    bxxv = bxxg.m124227a(bxxw.f165067a, bxuu.m123753a(), b.mo74214b());
                }
            } else if (bxvk.class.isAssignableFrom(cls)) {
                if (bxwt.m124132a(b)) {
                    bxxv = bxxf.m124176a(b, bxxj.f165036b, bxwp.f165001b, bxxw.f165069c, bxuu.f164876a, bxwy.f165016b);
                } else {
                    bxxv = bxxf.m124176a(b, bxxj.f165036b, bxwp.f165001b, bxxw.f165069c, (bxut) null, bxwy.f165016b);
                }
            } else if (bxwt.m124132a(b)) {
                bxxv = bxxf.m124176a(b, bxxj.f165035a, bxwp.f165000a, bxxw.f165067a, bxuu.m123753a(), bxwy.f165015a);
            } else {
                bxxv = bxxf.m124176a(b, bxxj.f165035a, bxwp.f165000a, bxxw.f165068b, (bxut) null, bxwy.f165015a);
            }
            bxwd.m124084a((Object) cls, "messageType");
            bxwd.m124084a((Object) bxxv, "schema");
            bxxv bxxv2 = (bxxv) this.f165038b.putIfAbsent(cls, bxxv);
            return bxxv2 == null ? bxxv : bxxv2;
        }
    }

    /* renamed from: a */
    public final bxxv mo74228a(Object obj) {
        return mo74227a((Class) obj.getClass());
    }
}
