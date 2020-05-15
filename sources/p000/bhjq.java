package p000;

import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: bhjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhjq extends aco {

    /* renamed from: d */
    final /* synthetic */ bhjs f118853d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhjq(bhjs bhjs, RecyclerView recyclerView) {
        super(recyclerView);
        this.f118853d = bhjs;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        int i;
        super.mo345a(view, qmVar);
        bhjl bhjl = this.f118853d.f118858e;
        if (bhjl.f118848f.f118855b.getChildCount() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        for (int i2 = 0; i2 < bhjl.f118848f.f118858e.mo161a(); i2++) {
            if (bhjl.f118848f.f118858e.mo162a(i2) == 0) {
                i++;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        qmVar.mo15756a(new C1299qk(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false)));
    }
}
