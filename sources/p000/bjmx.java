package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bjmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmx extends bjhs {

    /* renamed from: d */
    final List f122990d = new ArrayList();

    public bjmx() {
        super(bwqs.f160718c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo65241a(int i) {
        return this.f122990d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        this.f122990d.clear();
        this.f122990d.addAll(((bwqs) bxxc).f160720a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwqs.f160717b.mo74144da();
        List list = this.f122990d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwqs bwqs = (bwqs) da.f164949b;
        if (!bwqs.f160720a.mo73666a()) {
            bwqs.f160720a = GeneratedMessageLite.m124021a(bwqs.f160720a);
        }
        bxsy.m123078a(list, bwqs.f160720a);
        return (bwqs) da.mo74062i();
    }
}
