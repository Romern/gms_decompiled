package p000;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: vc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1426vc implements Window.Callback {

    /* renamed from: b */
    public final Window.Callback f27342b;

    public C1426vc(Window.Callback callback) {
        if (callback != null) {
            this.f27342b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f27342b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f27342b.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f27342b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f27342b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f27342b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f27342b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f27342b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f27342b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f27342b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f27342b.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f27342b.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f27342b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f27342b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f27342b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f27342b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f27342b.onPanelClosed(i, menu);
    }

    public final void onPointerCaptureChanged(boolean z) {
        this.f27342b.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f27342b.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        this.f27342b.onProvideKeyboardShortcuts(list, menu, i);
    }

    public final boolean onSearchRequested() {
        return this.f27342b.onSearchRequested();
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f27342b.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f27342b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f27342b.onWindowStartingActionMode(callback);
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f27342b.onSearchRequested(searchEvent);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f27342b.onWindowStartingActionMode(callback, i);
    }
}
