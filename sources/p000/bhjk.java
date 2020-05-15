package p000;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;

/* renamed from: bhjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhjk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhjs f118844a;

    public bhjk(bhjs bhjs) {
        this.f118844a = bhjs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    public void onClick(View view) {
        boolean z = true;
        this.f118844a.mo63883b(true);
        C1446vw vwVar = ((NavigationMenuItemView) view).f151210k;
        bhjs bhjs = this.f118844a;
        boolean a = bhjs.f118856c.mo16228a(vwVar, bhjs, 0);
        if (vwVar != null) {
            if (!vwVar.isCheckable()) {
                z = false;
            } else if (a) {
                this.f118844a.f118858e.mo63880a(vwVar);
            }
            this.f118844a.mo63883b(false);
            if (!z) {
                this.f118844a.mo470a(false);
                return;
            }
            return;
        }
        z = false;
        this.f118844a.mo63883b(false);
        if (!z) {
        }
    }
}
