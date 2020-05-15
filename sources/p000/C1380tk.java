package p000;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: tk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1380tk extends C1426vc {

    /* renamed from: a */
    final /* synthetic */ C1381tl f27134a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1380tk(C1381tl tlVar, Window.Callback callback) {
        super(callback);
        this.f27134a = tlVar;
    }

    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.f27134a.f27135a.mo495b());
        }
        return super.onCreatePanelView(i);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            C1381tl tlVar = this.f27134a;
            if (!tlVar.f27136b) {
                tlVar.f27135a.mo513m();
                this.f27134a.f27136b = true;
                return true;
            }
        }
        return onPreparePanel;
    }
}
