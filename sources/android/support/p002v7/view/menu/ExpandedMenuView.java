package android.support.p002v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, C1442vs, C1460wj {

    /* renamed from: a */
    private static final int[] f1095a = {16842964, 16843049};

    /* renamed from: b */
    private C1443vt f1096b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public final void mo1220a(C1443vt vtVar) {
        this.f1096b = vtVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1221a((C1446vw) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        adr a = adr.m523a(context, attributeSet, f1095a, i, 0);
        if (a.mo461f(0)) {
            setBackgroundDrawable(a.mo449a(0));
        }
        if (a.mo461f(1)) {
            setDivider(a.mo449a(1));
        }
        a.mo450a();
    }

    /* renamed from: a */
    public final boolean mo1221a(C1446vw vwVar) {
        return this.f1096b.mo16227a(vwVar, 0);
    }
}
