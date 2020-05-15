package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bjnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjnh extends bjhs {

    /* renamed from: d */
    final ArrayList f123006d = new ArrayList();

    /* renamed from: e */
    final ArrayList f123007e = new ArrayList();

    public bjnh() {
        super(bwse.f160847d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwse bwse = (bwse) bxxc;
        mo65383a(bwse.f160850b, bwse.f160849a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwse.f160846c.mo74144da();
        ArrayList arrayList = this.f123006d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwse bwse = (bwse) da.f164949b;
        if (!bwse.f160849a.mo73666a()) {
            bwse.f160849a = GeneratedMessageLite.m124021a(bwse.f160849a);
        }
        bxsy.m123078a(arrayList, bwse.f160849a);
        ArrayList arrayList2 = this.f123007e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwse bwse2 = (bwse) da.f164949b;
        if (!bwse2.f160850b.mo73666a()) {
            bwse2.f160850b = GeneratedMessageLite.m124021a(bwse2.f160850b);
        }
        bxsy.m123078a(arrayList2, bwse2.f160850b);
        return (bwse) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65383a(List list, List list2) {
        this.f123007e.clear();
        this.f123006d.clear();
        this.f123007e.addAll(list);
        this.f123006d.addAll(list2);
        mo65244a((bjgf) null);
    }
}
