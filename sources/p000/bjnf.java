package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjnf extends bjhs {

    /* renamed from: d */
    public final C1230nw f123000d = new C1230nw();

    /* renamed from: e */
    final ArrayList f123001e = new ArrayList();

    /* renamed from: f */
    int f123002f;

    public bjnf() {
        super(bwrx.f160815e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        boolean z;
        bwrx bwrx = (bwrx) bxxc;
        this.f123000d.mo15542c();
        this.f123001e.clear();
        this.f123001e.addAll(bwrx.f160818b);
        this.f123002f = bwrx.f160819c;
        bmxy.m108601b(!this.f123001e.isEmpty(), "NavigationDataValue must always have at least one item in the history.");
        if (this.f123002f < this.f123001e.size()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, String.format(Locale.US, "NavigationDataValue currentHistoryIndex (%d) must be less than the historyList (%d).", Integer.valueOf(this.f123002f), Integer.valueOf(this.f123001e.size())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo65381e() {
        return this.f123002f < this.f123001e.size() + -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo65382f() {
        return this.f123002f > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwrx.f160814d.mo74144da();
        int i = this.f123002f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwrx bwrx = (bwrx) da.f164949b;
        bwrx.f160817a |= 1;
        bwrx.f160819c = i;
        ArrayList arrayList = this.f123001e;
        if (!bwrx.f160818b.mo73666a()) {
            bwrx.f160818b = GeneratedMessageLite.m124021a(bwrx.f160818b);
        }
        bxsy.m123078a(arrayList, bwrx.f160818b);
        return (bwrx) da.mo74062i();
    }
}
