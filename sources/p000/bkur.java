package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bkur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkur extends bktg {

    /* renamed from: b */
    private final bkui f125302b;

    /* renamed from: c */
    private final bkuh f125303c = new bkuq();

    public bkur(bkup bkup) {
        super(46, true);
        this.f125302b = new bkui(bkup);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, java.util.ArrayList]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        if (!this.f125264a) {
            bkxi.mo66430c();
        }
        ArrayList arrayList = new ArrayList();
        this.f125303c.mo66358a(bkxi, (Object) arrayList);
        if (!this.f125264a) {
            bkxi.mo66431d();
        }
        return arrayList;
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
        mo66347a(bkxh);
        this.f125302b.mo66346a(bkxh, (Collection) ((List) obj));
        bkxh.mo66421b();
    }
}
