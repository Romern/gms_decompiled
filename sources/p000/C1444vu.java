package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: vu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1444vu implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C1457wg {

    /* renamed from: a */
    public final C1443vt f27447a;

    /* renamed from: b */
    public C1350sh f27448b;

    /* renamed from: c */
    C1439vp f27449c;

    public C1444vu(C1443vt vtVar) {
        this.f27447a = vtVar;
    }

    /* renamed from: a */
    public final void mo15958a(C1443vt vtVar, boolean z) {
        C1350sh shVar;
        if ((z || vtVar == this.f27447a) && (shVar = this.f27448b) != null) {
            shVar.dismiss();
        }
    }

    /* renamed from: a */
    public final boolean mo15959a(C1443vt vtVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f27447a.mo16227a(((C1438vo) this.f27449c.mo16208c()).getItem(i), 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vp.a(vt, boolean):void
     arg types: [vt, int]
     candidates:
      vp.a(android.content.Context, vt):void
      wh.a(android.content.Context, vt):void
      vp.a(vt, boolean):void */
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f27449c.mo468a(this.f27447a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f27448b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f27448b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f27447a.mo16226a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f27447a.performShortcut(i, keyEvent, 0);
    }
}
