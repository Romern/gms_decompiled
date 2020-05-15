package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: acn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acn extends C1251oq {

    /* renamed from: b */
    final aco f220b;

    /* renamed from: c */
    public final Map f221c = new WeakHashMap();

    public acn(aco aco) {
        this.f220b = aco;
    }

    /* renamed from: a */
    public final C1304qp mo342a(View view) {
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            return oqVar.mo342a(view);
        }
        return super.mo342a(view);
    }

    /* renamed from: b */
    public final boolean mo348b(View view, AccessibilityEvent accessibilityEvent) {
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            return oqVar.mo348b(view, accessibilityEvent);
        }
        return super.mo348b(view, accessibilityEvent);
    }

    /* renamed from: c */
    public final void mo349c(View view, AccessibilityEvent accessibilityEvent) {
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            oqVar.mo349c(view, accessibilityEvent);
        } else {
            super.mo349c(view, accessibilityEvent);
        }
    }

    /* renamed from: d */
    public final void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            oqVar.mo350d(view, accessibilityEvent);
        } else {
            super.mo350d(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final void mo343a(View view, int i) {
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            oqVar.mo343a(view, i);
        } else {
            super.mo343a(view, i);
        }
    }

    /* renamed from: a */
    public final void mo344a(View view, AccessibilityEvent accessibilityEvent) {
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            oqVar.mo344a(view, accessibilityEvent);
        } else {
            super.mo344a(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        if (this.f220b.mo351a() || this.f220b.f222b.getLayoutManager() == null) {
            super.mo345a(view, qmVar);
            return;
        }
        this.f220b.f222b.getLayoutManager().mo231a(view, qmVar);
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            oqVar.mo345a(view, qmVar);
        } else {
            super.mo345a(view, qmVar);
        }
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        if (this.f220b.mo351a() || this.f220b.f222b.getLayoutManager() == null) {
            return super.mo346a(view, i, bundle);
        }
        C1251oq oqVar = (C1251oq) this.f221c.get(view);
        if (oqVar != null) {
            if (oqVar.mo346a(view, i, bundle)) {
                return true;
            }
        } else if (super.mo346a(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f220b.f222b.getLayoutManager().f120r;
        acc acc = recyclerView.mRecycler;
        acj acj = recyclerView.mState;
        return false;
    }

    /* renamed from: a */
    public final boolean mo347a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1251oq oqVar = (C1251oq) this.f221c.get(viewGroup);
        if (oqVar != null) {
            return oqVar.mo347a(viewGroup, view, accessibilityEvent);
        }
        return super.mo347a(viewGroup, view, accessibilityEvent);
    }
}
