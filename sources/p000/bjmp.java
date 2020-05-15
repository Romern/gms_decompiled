package p000;

import java.util.ArrayList;

/* renamed from: bjmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmp extends bjhs {

    /* renamed from: d */
    final ArrayList f122979d = new ArrayList(0);

    public bjmp() {
        super(bwqf.f160656c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        this.f122979d.clear();
        this.f122979d.addAll(((bwqf) bxxc).f160658a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwqf.f160655b.mo74144da();
        ArrayList arrayList = this.f122979d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwqf bwqf = (bwqf) da.f164949b;
        if (!bwqf.f160658a.mo73666a()) {
            bwqf.f160658a = bxvk.m124021a(bwqf.f160658a);
        }
        bxsy.m123078a(arrayList, bwqf.f160658a);
        return (bwqf) da.mo74062i();
    }
}
