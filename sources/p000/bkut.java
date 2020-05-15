package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bkut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkut extends bktj {

    /* renamed from: a */
    private final bkui f125304a;

    /* renamed from: b */
    private final bkuh f125305b = new bkus();

    public bkut(bkup bkup) {
        super(40);
        this.f125304a = new bkui(bkup);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, blgw]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        blgw a = blgx.m107152a();
        this.f125305b.mo66358a(bkxi, (Object) a);
        blgx blgx = new blgx(a);
        a.f126478a = new ArrayList();
        a.f126479b = blhp.f126557a;
        return blgx;
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
        mo66348a(bkxh);
        this.f125304a.mo66346a(bkxh, (Collection) Collections.unmodifiableList(((blgx) obj).f126480a));
        bkxh.mo66421b();
    }
}
