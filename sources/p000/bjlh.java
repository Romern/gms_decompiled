package p000;

import java.util.List;

/* renamed from: bjlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlh extends bjhs {

    /* renamed from: d */
    public bwmu f122925d;

    /* renamed from: e */
    public List f122926e;

    /* renamed from: f */
    public boolean f122927f = true;

    public bjlh() {
        super(bwmr.f160301f);
    }

    /* renamed from: a */
    private static void m103825a(bwmu bwmu, List list) {
        if (bwmu == null || list == null || bwmu == bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN || !list.contains(bwmu)) {
            throw new IllegalStateException("BottomSheetPositionState is not in the current allowed set");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65365a(bwmu bwmu, bjgf bjgf) {
        m103825a(bwmu, this.f122926e);
        if (this.f122925d != bwmu) {
            this.f122925d = bwmu;
            mo65244a(bjgf);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bwmq bwmq = (bwmq) bwmr.f160300e.mo74144da();
        bwmu bwmu = this.f122925d;
        if (bwmu != null) {
            if (bwmq.f164950c) {
                bwmq.mo74035c();
                bwmq.f164950c = false;
            }
            bwmr bwmr = (bwmr) bwmq.f164949b;
            bwmr.f160304b = bwmu.f160321f;
            bwmr.f160303a |= 1;
        }
        List list = this.f122926e;
        if (list != null && !list.isEmpty()) {
            List<bwmu> list2 = this.f122926e;
            if (bwmq.f164950c) {
                bwmq.mo74035c();
                bwmq.f164950c = false;
            }
            bwmr bwmr2 = (bwmr) bwmq.f164949b;
            bwmr2.mo73529a();
            for (bwmu bwmu2 : list2) {
                bwmr2.f160305c.mo74153d(bwmu2.f160321f);
            }
        }
        return (bwmr) bwmq.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwmr bwmr = (bwmr) bxxc;
        bwmu a = bwmu.m122115a(bwmr.f160304b);
        if (a == null) {
            a = bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
        }
        this.f122925d = a;
        mo65366a((List) new bxvv(bwmr.f160305c, bwmr.f160299d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65366a(List list) {
        m103825a(this.f122925d, list);
        this.f122926e = list;
        boolean contains = list.contains(bwmu.BOTTOM_SHEET_POSITION_STATE_HIDDEN);
        if (contains != this.f122927f) {
            this.f122927f = contains;
            mo65244a((bjgf) null);
        }
    }
}
