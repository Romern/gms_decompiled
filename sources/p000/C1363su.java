package p000;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: su */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1363su extends C1426vc {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27039a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1363su(C1372tc tcVar, Window.Callback callback) {
        super(callback);
        this.f27039a = tcVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f27039a.mo15990a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            C1372tc tcVar = this.f27039a;
            int keyCode = keyEvent.getKeyCode();
            C1341rz a = tcVar.mo15933a();
            if (a == null || !a.mo15847a(keyCode, keyEvent)) {
                C1370ta taVar = tcVar.f27119x;
                if (taVar == null || !tcVar.mo15991a(taVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (tcVar.f27119x == null) {
                        C1370ta f = tcVar.mo15995f(0);
                        tcVar.mo15992a(f, keyEvent);
                        boolean a2 = tcVar.mo15991a(f, keyEvent.getKeyCode(), keyEvent);
                        f.f27061m = false;
                        if (!a2) {
                            return false;
                        }
                    }
                    return false;
                }
                C1370ta taVar2 = tcVar.f27119x;
                if (taVar2 != null) {
                    taVar2.f27062n = true;
                }
            }
        }
        return true;
    }

    public final void onContentChanged() {
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C1443vt)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        C1341rz a;
        super.onMenuOpened(i, menu);
        C1372tc tcVar = this.f27039a;
        if (i == 108 && (a = tcVar.mo15933a()) != null) {
            a.mo15866f(true);
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        C1372tc tcVar = this.f27039a;
        if (i == 108) {
            C1341rz a = tcVar.mo15933a();
            if (a != null) {
                a.mo15866f(false);
            }
        } else if (i == 0) {
            C1370ta f = tcVar.mo15995f(0);
            if (f.f27063o) {
                tcVar.mo15989a(f, false);
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C1443vt vtVar;
        if (menu instanceof C1443vt) {
            vtVar = (C1443vt) menu;
        } else {
            vtVar = null;
        }
        if (i == 0 && vtVar == null) {
            return false;
        }
        if (vtVar != null) {
            vtVar.f27431i = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (vtVar != null) {
            vtVar.f27431i = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C1443vt vtVar;
        C1370ta f = this.f27039a.mo15995f(0);
        if (f == null || (vtVar = f.f27058j) == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, vtVar, i);
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        C1372tc tcVar = this.f27039a;
        if (!tcVar.f27111p || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        C1418uv uvVar = new C1418uv(tcVar.f27100e, callback);
        C1372tc tcVar2 = this.f27039a;
        C1414ur urVar = tcVar2.f27106k;
        if (urVar != null) {
            urVar.mo16030c();
        }
        C1362st stVar = new C1362st(tcVar2, uvVar);
        C1341rz a = tcVar2.mo15933a();
        if (a != null) {
            tcVar2.f27106k = a.mo15838a(stVar);
        }
        if (tcVar2.f27106k == null) {
            tcVar2.f27106k = tcVar2.mo15987a(stVar);
        }
        C1414ur urVar2 = tcVar2.f27106k;
        if (urVar2 != null) {
            return uvVar.mo16099b(urVar2);
        }
        return null;
    }
}
