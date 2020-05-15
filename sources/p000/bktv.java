package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bktv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bktv extends bktj {

    /* renamed from: a */
    private final bkui f125277a = new bkui(new bkum());

    /* renamed from: b */
    private final bkuh f125278b = new bktu();

    public bktv() {
        super(48);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, java.util.ArrayList]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        bkxi.mo66430c();
        ArrayList arrayList = new ArrayList();
        this.f125278b.mo66358a(bkxi, (Object) arrayList);
        bkpt a = bkpt.m106276a(bkxi.mo66434g());
        bkxi.mo66431d();
        return new bkpu(arrayList, a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkui.a(bkxh, java.util.Collection):void
     arg types: [bkxh, java.util.List]
     candidates:
      bkui.a(bkxh, java.lang.Object):void
      bktf.a(bkxh, java.lang.Object):void
      bkui.a(bkxh, java.util.Collection):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66346a(bkxh bkxh, Object obj) {
        bkpu bkpu = (bkpu) obj;
        bkxh.mo66417a();
        this.f125277a.mo66346a(bkxh, (Collection) bkpu.f125094a);
        bkxh.mo66422b(bkpu.f125095b.name());
        bkxh.mo66421b();
    }
}
