package p000;

import android.app.Dialog;
import android.app.TaskStackBuilder;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.ModuleContext;

/* renamed from: qkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qkl extends dfb {

    /* renamed from: q */
    private rpg f41605q;

    /* renamed from: r */
    private aabl f41606r = null;

    protected qkl() {
        qlp.m32393a();
    }

    /* renamed from: a */
    public final void mo8647a(Activity activity, Context context) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            rpg rpg = new rpg(context);
            this.f41605q = rpg;
            context = rpg;
        }
        this.f41606r = new aabl(context, activity.getClass(), 6);
        super.mo8647a(activity, aabj.m21054a(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public final void mo11923aH() {
        blji a = aabl.m21058a(this.f41606r, "onResumeFragments");
        try {
            mo8665e().publicOnResumeFragments();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo9145c() {
        qmc.m32424a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo8657d() {
        if (!rpr.m34216b().getInSafeBoot()) {
            return dfb.f12994p.mo9147a(this, this);
        }
        return false;
    }

    /* renamed from: g */
    public final Object mo671g() {
        blji a = aabl.m21058a(this.f41606r, "onRetainCustomNonConfigurationInstance");
        try {
            Object onRetainCustomNonConfigurationInstance = mo8665e().onRetainCustomNonConfigurationInstance();
            if (a != null) {
                a.close();
            }
            return onRetainCustomNonConfigurationInstance;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        blji a = aabl.m21058a(this.f41606r, "onActionModeFinished");
        try {
            mo8665e().onActionModeFinished(actionMode);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        blji a = aabl.m21058a(this.f41606r, "onActionModeStarted");
        try {
            mo8665e().onActionModeStarted(actionMode);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r1 instanceof p000.djb) == false) goto L_0x0020;
     */
    public final void onActivityResult(int i, int i2, Intent intent) {
        blji a = aabl.m21058a(this.f41606r, "onActivityResult");
        try {
            Activity e = mo8665e();
            if (intent != null) {
                mo8645a(intent);
                if (intent.hasExtra("_chimera_fallback_only")) {
                }
            }
            e.publicOnActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onAttachedToWindow() {
        blji a = aabl.m21058a(this.f41606r, "onAttachedToWindow");
        try {
            mo8665e().onAttachedToWindow();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        blji a = aabl.m21058a(this.f41606r, "onBackPressed");
        try {
            mo8665e().onBackPressed();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        blji a = aabl.m21058a(this.f41606r, "onConfigurationChanged");
        try {
            rpg rpg = this.f41605q;
            if (rpg != null) {
                rpg.mo24981a(configuration);
            }
            ModuleContext moduleContext = ModuleContext.getModuleContext(mo8665e().getApplicationContext());
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            mo8665e().onConfigurationChanged(configuration);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onContentChanged() {
        blji a = aabl.m21058a(this.f41606r, "onContentChanged");
        try {
            mo8665e().onContentChanged();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        blji a = aabl.m21058a(this.f41606r, "onContextItemSelected");
        try {
            boolean onContextItemSelected = mo8665e().onContextItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onContextItemSelected;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onContextMenuClosed(Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onContextMenuClosed");
        try {
            mo8665e().onContextMenuClosed(menu);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onCreate");
        if (bundle == null) {
            try {
                this.f12999o = true;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (bundle != null) {
            this.f12999o = bundle.getBoolean("_chimera_attempt_ftr_req", false);
            if (this.f12996l != this.f12995k) {
                this.f12998n = bundle.getString("_chimera_rpt_frg_cls");
                String str = this.f12998n;
                if (str != null) {
                    this.f12997m = new djg(this.f12995k, this.f12996l, true, new String[]{str});
                }
            }
        }
        mo8665e().publicOnCreate(super.mo8644a(bundle));
        if (a != null) {
            a.close();
            return;
        }
        return;
        throw th;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        blji a = aabl.m21058a(this.f41606r, "onCreateContextMenu");
        try {
            mo8665e().onCreateContextMenu(contextMenu, view, contextMenuInfo);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final CharSequence onCreateDescription() {
        blji a = aabl.m21058a(this.f41606r, "onCreateDescription");
        try {
            CharSequence onCreateDescription = mo8665e().onCreateDescription();
            if (a != null) {
                a.close();
            }
            return onCreateDescription;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final Dialog onCreateDialog(int i) {
        blji a = aabl.m21058a(this.f41606r, "onCreateDialog");
        try {
            Dialog publicOnCreateDialog = mo8665e().publicOnCreateDialog(i);
            if (a != null) {
                a.close();
            }
            return publicOnCreateDialog;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        blji a = aabl.m21058a(this.f41606r, "onCreateNavigateUpTaskStack");
        try {
            mo8665e().onCreateNavigateUpTaskStack(taskStackBuilder);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onCreateOptionsMenu");
        try {
            boolean onCreateOptionsMenu = mo8665e().onCreateOptionsMenu(menu);
            if (a != null) {
                a.close();
            }
            return onCreateOptionsMenu;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onCreatePanelMenu");
        try {
            boolean onCreatePanelMenu = mo8665e().onCreatePanelMenu(i, menu);
            if (a != null) {
                a.close();
            }
            return onCreatePanelMenu;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final View onCreatePanelView(int i) {
        blji a = aabl.m21058a(this.f41606r, "onCreatePanelView");
        try {
            View onCreatePanelView = mo8665e().onCreatePanelView(i);
            if (a != null) {
                a.close();
            }
            return onCreatePanelView;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        blji a = aabl.m21058a(this.f41606r, "onCreateThumbnail");
        try {
            boolean onCreateThumbnail = mo8665e().onCreateThumbnail(bitmap, canvas);
            if (a != null) {
                a.close();
            }
            return onCreateThumbnail;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        blji a = aabl.m21058a(this.f41606r, "onDestroy");
        try {
            mo8665e().publicOnDestroy();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onDetachedFromWindow() {
        blji a = aabl.m21058a(this.f41606r, "onDetachedFromWindow");
        try {
            mo8665e().onDetachedFromWindow();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onEnterAnimationComplete() {
        blji a = aabl.m21058a(this.f41606r, "onEnterAnimationComplete");
        try {
            mo8665e().onEnterAnimationComplete();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        blji a = aabl.m21058a(this.f41606r, "onGenericMotionEvent");
        try {
            boolean onGenericMotionEvent = mo8665e().onGenericMotionEvent(motionEvent);
            if (a != null) {
                a.close();
            }
            return onGenericMotionEvent;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        blji a = aabl.m21058a(this.f41606r, "onKeyDown");
        try {
            boolean onKeyDown = mo8665e().onKeyDown(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyDown;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        blji a = aabl.m21058a(this.f41606r, "onKeyLongPress");
        try {
            boolean onKeyLongPress = mo8665e().onKeyLongPress(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyLongPress;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        blji a = aabl.m21058a(this.f41606r, "onKeyMultiple");
        try {
            boolean onKeyMultiple = mo8665e().onKeyMultiple(i, i2, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyMultiple;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        blji a = aabl.m21058a(this.f41606r, "onKeyShortcut");
        try {
            boolean onKeyShortcut = mo8665e().onKeyShortcut(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyShortcut;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        blji a = aabl.m21058a(this.f41606r, "onKeyUp");
        try {
            boolean onKeyUp = mo8665e().onKeyUp(i, keyEvent);
            if (a != null) {
                a.close();
            }
            return onKeyUp;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onLowMemory() {
        blji a = aabl.m21058a(this.f41606r, "onLowMemory");
        try {
            mo8665e().onLowMemory();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        blji a = aabl.m21058a(this.f41606r, "onMenuItemSelected");
        try {
            boolean onMenuItemSelected = mo8665e().onMenuItemSelected(i, menuItem);
            if (a != null) {
                a.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onMenuOpened");
        try {
            boolean onMenuOpened = mo8665e().onMenuOpened(i, menu);
            if (a != null) {
                a.close();
            }
            return onMenuOpened;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onNavigateUp() {
        blji a = aabl.m21058a(this.f41606r, "onNavigateUp");
        try {
            boolean onNavigateUp = mo8665e().onNavigateUp();
            if (a != null) {
                a.close();
            }
            return onNavigateUp;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onNavigateUpFromChild(android.app.Activity activity) {
        blji a = aabl.m21058a(this.f41606r, "onNavigateUpFromChild");
        try {
            boolean onNavigateUpFromChild = mo8665e().onNavigateUpFromChild(activity);
            if (a != null) {
                a.close();
            }
            return onNavigateUpFromChild;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        blji a = aabl.m21058a(this.f41606r, "onNewIntent");
        try {
            Activity e = mo8665e();
            mo8645a(intent);
            e.publicOnNewIntent(intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        blji a = aabl.m21058a(this.f41606r, "onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = mo8665e().onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onOptionsMenuClosed(Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onOptionsMenuClosed");
        try {
            mo8665e().onOptionsMenuClosed(menu);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onPanelClosed(int i, Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onPanelClosed");
        try {
            mo8665e().onPanelClosed(i, menu);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        blji a = aabl.m21058a(this.f41606r, "onPause");
        try {
            mo8665e().publicOnPause();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onPostCreate");
        try {
            mo8665e().publicOnPostCreate(super.mo8644a(bundle));
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        blji a = aabl.m21058a(this.f41606r, "onPostResume");
        try {
            mo8665e().publicOnPostResume();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPrepareDialog(int i, Dialog dialog) {
        blji a = aabl.m21058a(this.f41606r, "onPrepareDialog");
        try {
            mo8665e().publicOnPrepareDialog(i, dialog);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        blji a = aabl.m21058a(this.f41606r, "onPrepareNavigateUpTaskStack");
        try {
            mo8665e().onPrepareNavigateUpTaskStack(taskStackBuilder);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onPrepareOptionsMenu");
        try {
            boolean onPrepareOptionsMenu = mo8665e().onPrepareOptionsMenu(menu);
            if (a != null) {
                a.close();
            }
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onPreparePanel");
        try {
            boolean onPreparePanel = mo8665e().onPreparePanel(i, view, menu);
            if (a != null) {
                a.close();
            }
            return onPreparePanel;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onProvideAssistContent(AssistContent assistContent) {
        blji a = aabl.m21058a(this.f41606r, "onProvideAssistContent");
        try {
            mo8665e().onProvideAssistContent(assistContent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onProvideAssistData(Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onProvideAssistData");
        try {
            mo8665e().onProvideAssistData(bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        blji a = aabl.m21058a(this.f41606r, "onRequestPermissionsResult");
        try {
            mo8665e().onRequestPermissionsResult(i, strArr, iArr);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        blji a = aabl.m21058a(this.f41606r, "onRestart");
        try {
            mo8665e().publicOnRestart();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onRestoreInstanceState");
        try {
            super.onRestoreInstanceState(bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        blji a = aabl.m21058a(this.f41606r, "onResume");
        try {
            mo8665e().publicOnResume();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onSaveInstanceState");
        try {
            Bundle bundle2 = new Bundle();
            mo8665e().publicOnSaveInstanceState(bundle2);
            if (bundle != null) {
                super.mo8646a(bundle, bundle2);
                bundle.putString("_chimera_rpt_frg_cls", this.f12998n);
                bundle.putBoolean("_chimera_attempt_ftr_req", this.f12999o);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onSearchRequested() {
        blji a = aabl.m21058a(this.f41606r, "onSearchRequested");
        try {
            boolean onSearchRequested = mo8665e().onSearchRequested();
            if (a != null) {
                a.close();
            }
            return onSearchRequested;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        blji a = aabl.m21058a(this.f41606r, "onStart");
        try {
            mo8665e().publicOnStart();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onStateNotSaved() {
        blji a = aabl.m21058a(this.f41606r, "onStateNotSaved");
        try {
            mo8665e().onStateNotSaved();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        blji a = aabl.m21058a(this.f41606r, "onStop");
        try {
            mo8665e().publicOnStop();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        blji a = aabl.m21058a(this.f41606r, "onTitleChanged");
        try {
            mo8665e().publicOnTitleChanged(charSequence, i);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        blji a = aabl.m21058a(this.f41606r, "onTouchEvent");
        try {
            boolean onTouchEvent = mo8665e().onTouchEvent(motionEvent);
            if (a != null) {
                a.close();
            }
            return onTouchEvent;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        blji a = aabl.m21058a(this.f41606r, "onTrackballEvent");
        try {
            boolean onTrackballEvent = mo8665e().onTrackballEvent(motionEvent);
            if (a != null) {
                a.close();
            }
            return onTrackballEvent;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onTrimMemory(int i) {
        blji a = aabl.m21058a(this.f41606r, "onTrimMemory");
        try {
            mo8665e().onTrimMemory(i);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        blji a = aabl.m21058a(this.f41606r, "onUserInteraction");
        try {
            mo8665e().onUserInteraction();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        blji a = aabl.m21058a(this.f41606r, "onUserLeaveHint");
        try {
            mo8665e().publicOnUserLeaveHint();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        blji a = aabl.m21058a(this.f41606r, "onWindowAttributesChanged");
        try {
            mo8665e().onWindowAttributesChanged(layoutParams);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z) {
        blji a = aabl.m21058a(this.f41606r, "onWindowFocusChanged");
        try {
            mo8665e().onWindowFocusChanged(z);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final boolean mo9146c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context, name), 128);
            if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("chimera.requiresExtractedAsset")) == null) {
                return true;
            }
            qlp a = qlp.m32393a();
            StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
            sb.append(string);
            sb.append(" ");
            sb.append(name);
            a.mo8861a(context, 82, sb.toString());
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        blji a = aabl.m21058a(this.f41606r, "onRestoreInstanceStateWithPersistentState");
        try {
            super.onRestoreInstanceState(bundle, persistableBundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final Dialog onCreateDialog(int i, Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onCreateDialogWithArgs");
        try {
            Activity e = mo8665e();
            super.mo8651b(bundle);
            Dialog publicOnCreateDialog = e.publicOnCreateDialog(i, bundle);
            if (a != null) {
                a.close();
            }
            return publicOnCreateDialog;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        blji a = aabl.m21058a(this.f41606r, "onPostCreateWithPersistentState");
        try {
            mo8665e().onPostCreate(super.mo8644a(bundle), persistableBundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        blji a = aabl.m21058a(this.f41606r, "onPrepareDialogWithArgs");
        try {
            Activity e = mo8665e();
            super.mo8651b(bundle);
            e.publicOnPrepareDialog(i, dialog, bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        blji a = aabl.m21058a(this.f41606r, "onSearchRequestedWithEvent");
        try {
            boolean onSearchRequested = mo8665e().onSearchRequested(searchEvent);
            if (a != null) {
                a.close();
            }
            return onSearchRequested;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo11920a(C1018gh ghVar) {
        blji a = aabl.m21058a(this.f41606r, "onAttachFragment");
        try {
            if (ghVar instanceof Fragment.ProxyCallbacks) {
                Fragment moduleFragment = ((Fragment.ProxyCallbacks) ghVar).getModuleFragment();
                if (moduleFragment != null) {
                    mo8665e().onAttachFragment(moduleFragment);
                    if (a == null) {
                        a.close();
                        return;
                    }
                    return;
                }
            }
            Log.w("ChimeraActivityProxy", "Attaching a non chimera fragment to a chimera activity");
            if (a == null) {
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        blji a = aabl.m21058a(this.f41606r, "onSaveInstanceStateWithPersistentState");
        try {
            Bundle bundle2 = new Bundle();
            mo8665e().onSaveInstanceState(bundle2, persistableBundle);
            super.mo8646a(bundle, bundle2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        blji a = aabl.m21058a(this.f41606r, "onCreateWithPersistentState");
        try {
            mo8665e().onCreate(super.mo8644a(bundle), persistableBundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        mo8647a((Activity) obj, context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11922a(View view, Menu menu) {
        blji a = aabl.m21058a(this.f41606r, "onPrepareOptionsPanel");
        try {
            boolean publicOnPrepareOptionsPanel = mo8665e().publicOnPrepareOptionsPanel(view, menu);
            if (a != null) {
                a.close();
            }
            return publicOnPrepareOptionsPanel;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
