package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bktl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bktl extends bktj {

    /* renamed from: a */
    private final bkui f125268a = new bkui(new bktm());

    /* renamed from: b */
    private final bkuh f125269b = new bktk();

    public bktl() {
        super(37);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, java.util.ArrayList]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        ArrayList arrayList = new ArrayList();
        this.f125269b.mo66358a(bkxi, (Object) arrayList);
        return new bkpo(arrayList);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkui.a(bkxh, java.util.Collection):void
     arg types: [bkxh, java.util.ArrayList]
     candidates:
      bkui.a(bkxh, java.lang.Object):void
      bktf.a(bkxh, java.lang.Object):void
      bkui.a(bkxh, java.util.Collection):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66346a(bkxh bkxh, Object obj) {
        ArrayList arrayList = new ArrayList(((bkpo) obj).f125077a);
        mo66348a(bkxh);
        this.f125268a.mo66346a(bkxh, (Collection) arrayList);
        bkxh.mo66421b();
    }
}
