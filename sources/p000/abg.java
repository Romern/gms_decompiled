package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: abg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abg {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f101a;

    public abg(RecyclerView recyclerView) {
        this.f101a = recyclerView;
    }

    /* renamed from: a */
    public final acm mo151a(int i) {
        acm findViewHolderForPosition = this.f101a.findViewHolderForPosition(i, true);
        if (findViewHolderForPosition == null || this.f101a.mChildHelper.mo16590c(findViewHolderForPosition.f201a)) {
            return null;
        }
        return findViewHolderForPosition;
    }

    /* renamed from: b */
    public final void mo155b(int i, int i2) {
        this.f101a.offsetPositionRecordsForInsert(i, i2);
        this.f101a.mItemsAddedOrRemoved = true;
    }

    /* renamed from: c */
    public final void mo156c(int i, int i2) {
        this.f101a.offsetPositionRecordsForMove(i, i2);
        this.f101a.mItemsAddedOrRemoved = true;
    }

    /* renamed from: a */
    public final void mo152a(int i, int i2) {
        this.f101a.offsetPositionRecordsForRemove(i, i2, true);
        RecyclerView recyclerView = this.f101a;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f179c += i2;
    }

    /* renamed from: a */
    public final void mo153a(int i, int i2, Object obj) {
        this.f101a.viewRangeUpdate(i, i2, obj);
        this.f101a.mItemsChanged = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo154a(C1490xm xmVar) {
        int i = xmVar.f27587a;
        if (i == 1) {
            abu abu = this.f101a.mLayout;
            int i2 = xmVar.f27588b;
            int i3 = xmVar.f27590d;
            abu.mo33c();
        } else if (i == 2) {
            abu abu2 = this.f101a.mLayout;
            int i4 = xmVar.f27588b;
            int i5 = xmVar.f27590d;
            abu2.mo37f();
        } else if (i == 4) {
            abu abu3 = this.f101a.mLayout;
            int i6 = xmVar.f27588b;
            int i7 = xmVar.f27590d;
            Object obj = xmVar.f27589c;
            abu3.mo38g();
        } else if (i == 8) {
            abu abu4 = this.f101a.mLayout;
            int i8 = xmVar.f27588b;
            int i9 = xmVar.f27590d;
            abu4.mo36e();
        }
    }
}
