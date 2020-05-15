package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: aco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aco extends C1251oq {

    /* renamed from: b */
    final RecyclerView f222b;

    /* renamed from: c */
    public final acn f223c;

    public aco(RecyclerView recyclerView) {
        this.f222b = recyclerView;
        C1251oq b = mo352b();
        if (b == null || !(b instanceof acn)) {
            this.f223c = new acn(this);
        } else {
            this.f223c = (acn) b;
        }
    }

    /* renamed from: a */
    public void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        if (!mo351a() && this.f222b.getLayoutManager() != null) {
            abu layoutManager = this.f222b.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f120r;
            acc acc = recyclerView.mRecycler;
            acj acj = recyclerView.mState;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f120r.canScrollHorizontally(-1)) {
                qmVar.mo15752a(8192);
                qmVar.mo15782h(true);
            }
            if (layoutManager.f120r.canScrollVertically(1) || layoutManager.f120r.canScrollHorizontally(1)) {
                qmVar.mo15752a(4096);
                qmVar.mo15782h(true);
            }
            qmVar.mo15756a(C1299qk.m20013a(layoutManager.mo16a(acc, acj), layoutManager.mo31b(acc, acj), 0));
        }
    }

    /* renamed from: b */
    public C1251oq mo352b() {
        return this.f223c;
    }

    /* renamed from: d */
    public final void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo350d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo351a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo58a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo351a() {
        return this.f222b.hasPendingAdapterUpdates();
    }

    /* renamed from: a */
    public boolean mo346a(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (super.mo346a(view, i, bundle)) {
            return true;
        }
        if (mo351a() || this.f222b.getLayoutManager() == null) {
            return false;
        }
        abu layoutManager = this.f222b.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f120r;
        acc acc = recyclerView.mRecycler;
        acj acj = recyclerView.mState;
        if (recyclerView != null) {
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    i4 = (layoutManager.f116E - layoutManager.mo252w()) - layoutManager.mo254y();
                } else {
                    i4 = 0;
                }
                if (layoutManager.f120r.canScrollHorizontally(1)) {
                    i3 = (layoutManager.f115D - layoutManager.mo251v()) - layoutManager.mo253x();
                    i2 = i4;
                } else {
                    i2 = i4;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                if (recyclerView.canScrollVertically(-1)) {
                    i5 = -((layoutManager.f116E - layoutManager.mo252w()) - layoutManager.mo254y());
                } else {
                    i5 = 0;
                }
                if (layoutManager.f120r.canScrollHorizontally(-1)) {
                    i3 = -((layoutManager.f115D - layoutManager.mo251v()) - layoutManager.mo253x());
                    i2 = i5;
                } else {
                    i2 = i5;
                    i3 = 0;
                }
            }
            if (!(i2 == 0 && i3 == 0)) {
                layoutManager.f120r.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
                return true;
            }
        }
        return false;
    }
}
