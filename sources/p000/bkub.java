package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bkub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkub implements bktf, bkte {

    /* renamed from: a */
    private final bkui f125280a = new bkui(new bkum());

    /* renamed from: b */
    private final bkui f125281b = new bkui(new bkve(true));

    /* renamed from: c */
    private final bkuh f125282c = new bktz();

    /* renamed from: d */
    private final bkuh f125283d = new bkua();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkuh.a(bkxi, java.lang.Object):void
     arg types: [bkxi, java.util.ArrayList]
     candidates:
      bkuh.a(java.lang.Object, java.lang.Object):void
      bkuh.a(bkxi, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66345a(bkxi bkxi) {
        bkxi.mo66430c();
        String g = bkxi.mo66434g();
        String g2 = bkxi.mo66434g();
        bkwz bkwz = !bkxi.mo66432e() ? bkwz.READ_WRITE : bkwz.READ_ONLY;
        int b = bkxi.mo66429b();
        ArrayList arrayList = new ArrayList();
        this.f125282c.mo66358a(bkxi, (Object) arrayList);
        ArrayList arrayList2 = new ArrayList();
        if (!bkxi.mo66433f()) {
            this.f125283d.mo66358a(bkxi, (Object) arrayList2);
        }
        bkpw bkpw = new bkpw(new bkpx(g, b, g2, Collections.emptyList()), bkwz, arrayList, arrayList2, bkxi.mo66434g());
        bkxi.mo66431d();
        return bkpw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkui.a(bkxh, java.util.Collection):void
     arg types: [bkxh, java.util.List]
     candidates:
      bkui.a(bkxh, java.lang.Object):void
      bktf.a(bkxh, java.lang.Object):void
      bkui.a(bkxh, java.util.Collection):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkui.a(bkxh, java.util.Collection):void
     arg types: [bkxh, java.util.ArrayList]
     candidates:
      bkui.a(bkxh, java.lang.Object):void
      bktf.a(bkxh, java.lang.Object):void
      bkui.a(bkxh, java.util.Collection):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66346a(bkxh bkxh, Object obj) {
        boolean z;
        bkpw bkpw = (bkpw) obj;
        if (bkpw.f125100b == bkwz.READ_ONLY) {
            z = true;
        } else {
            z = false;
        }
        bkxh.mo66417a();
        bkxh.mo66422b(bkpw.f125099a.f125104a);
        bkxh.mo66422b(bkpw.f125099a.f125106c);
        bkxh.mo66420a(z);
        bkxh.mo66418a(bkpw.f125099a.f125105b);
        this.f125280a.mo66346a(bkxh, (Collection) bkpw.f125101c);
        this.f125281b.mo66346a(bkxh, (Collection) new ArrayList(bkpw.f125102d));
        bkxh.mo66422b(bkpw.f125103e);
        bkxh.mo66421b();
    }
}
