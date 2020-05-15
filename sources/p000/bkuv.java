package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bkuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkuv implements bktf, bkte {

    /* renamed from: a */
    private final bkui f125306a = new bkui(new bkum());

    /* renamed from: b */
    private final bkuh f125307b = new bkuu();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, java.util.ArrayList]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        bkxi.mo66430c();
        int b = bkxi.mo66429b();
        long parseLong = Long.parseLong(bkxi.mo66434g(), 16);
        ArrayList arrayList = new ArrayList();
        this.f125307b.mo66358a(bkxi, (Object) arrayList);
        bkxi.mo66431d();
        return new bkpy(b, parseLong, arrayList);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkui.a(bkxh, java.util.Collection):void
     arg types: [bkxh, java.util.List]
     candidates:
      bkui.a(bkxh, java.lang.Object):void
      bktf.a(bkxh, java.lang.Object):void
      bkui.a(bkxh, java.util.Collection):void */
    /* renamed from: a */
    public final void mo66346a(bkxh bkxh, bkpy bkpy) {
        bkxh.mo66417a();
        bkxh.mo66418a(bkpy.f125108a);
        bkxh.mo66422b(Long.toHexString(bkpy.f125109b));
        this.f125306a.mo66346a(bkxh, (Collection) bkpy.f125110c);
        bkxh.mo66421b();
    }
}
