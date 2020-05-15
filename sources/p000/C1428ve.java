package p000;

import android.support.p002v7.view.menu.ActionMenuItemView;

/* renamed from: ve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1428ve extends C1551zt {

    /* renamed from: a */
    final /* synthetic */ ActionMenuItemView f27359a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1428ve(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f27359a = actionMenuItemView;
    }

    /* renamed from: a */
    public final C1462wl mo16180a() {
        C1478xa xaVar;
        C1429vf vfVar = this.f27359a.f1087d;
        if (vfVar == null || (xaVar = vfVar.f27360a.f27569m) == null) {
            return null;
        }
        return xaVar.mo16395b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16181b() {
        C1462wl a;
        ActionMenuItemView actionMenuItemView = this.f27359a;
        C1442vs vsVar = actionMenuItemView.f1086c;
        return vsVar != null && vsVar.mo1221a(actionMenuItemView.f1085b) && (a = mo16180a()) != null && a.mo107e();
    }
}
