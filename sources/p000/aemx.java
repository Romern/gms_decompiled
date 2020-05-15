package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: aemx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aemx extends aemc {

    /* renamed from: a */
    final /* synthetic */ String[] f63527a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aemx(rjo rjo, rkb rkb, String[] strArr) {
        super(rjo, rkb);
        this.f63527a = strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aene aene = (aene) rjd;
        List asList = Arrays.asList(this.f63527a);
        aemf aemf = new aemf(this);
        sdo.m34966a(aemf, "callback == null");
        ((aenl) aene.mo25289B()).mo34374a(asList, aene.f63536a, aemf);
    }
}
