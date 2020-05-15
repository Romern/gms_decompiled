package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.chimera.util.ChimeraResource;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: dfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dfb extends C1021gj implements Activity.ProxyCallbacks, dju {

    /* renamed from: p */
    public static final dfa f12994p = new dfa();

    /* renamed from: k */
    public ClassLoader f12995k;

    /* renamed from: l */
    public ClassLoader f12996l;

    /* renamed from: m */
    public ClassLoader f12997m;

    /* renamed from: n */
    public String f12998n = null;

    /* renamed from: o */
    public boolean f12999o = false;

    /* renamed from: q */
    private boolean f13000q = false;

    /* renamed from: r */
    private Activity f13001r = null;

    /* renamed from: s */
    private LayoutInflater f13002s = null;

    /* renamed from: a */
    public final Bundle mo8644a(Bundle bundle) {
        Activity e = mo8665e();
        ClassLoader classLoader = this.f12995k;
        ClassLoader classLoader2 = this.f12996l;
        if (bundle == null) {
            return null;
        }
        try {
            ModuleManager.ModuleApkInfo currentModuleApk = ModuleManager.get(e).getCurrentModuleApk();
            int i = bundle.getInt("_chimera_module_apk_type");
            long j = bundle.getLong("_chimera_module_apk_timestamp");
            int i2 = currentModuleApk.apkType;
            long j2 = currentModuleApk.apkTimestamp;
            if (i == i2 && j == j2) {
                Bundle bundle2 = bundle.getBundle("_chimera_module_state");
                if (bundle2 == null) {
                    return bundle;
                }
                if (!classLoader2.equals(classLoader)) {
                    bundle2.setClassLoader(classLoader2);
                    if (!bundle2.getBoolean("_chimera_saved_state_processed_flag", false)) {
                        C1119jv.m17386a(bundle2, classLoader2, classLoader);
                        bundle2.putBoolean("_chimera_saved_state_processed_flag", true);
                        return bundle2;
                    }
                }
                return bundle2;
            }
            Log.w("SavedInstanceUtils", "Module has changed since the Activity's state was saved. Dropping previously saved state.");
            return null;
        } catch (IllegalStateException e2) {
            return bundle;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        throw null;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo8665e().addContentView(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f13000q = true;
        try {
            super.attachBaseContext(context);
            if (!mo8657d()) {
                mo8647a(mo8666f(), djp.m8662a().mo9139a(this, dfq.m8314a()));
            }
        } catch (PackageManager.NameNotFoundException | InvalidConfigException | djq e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to load fallback Activity:");
            sb.append(valueOf);
            Log.e("ChimeraActivityProxy", sb.toString());
        } catch (Throwable th) {
            this.f13000q = false;
            throw th;
        }
        this.f13000q = false;
    }

    /* renamed from: b */
    public final void mo8650b() {
        mo8665e().supportInvalidateOptionsMenu();
    }

    public final void closeContextMenu() {
        mo8665e().closeContextMenu();
    }

    public final void closeOptionsMenu() {
        mo8665e().closeOptionsMenu();
    }

    public final void convertFromTranslucent() {
        mo8665e().convertFromTranslucent();
    }

    public final boolean convertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions) {
        return mo8665e().convertToTranslucent(translucentConversionListener, activityOptions);
    }

    public final PendingIntent createPendingResult(int i, Intent intent, int i2) {
        return mo8665e().createPendingResult(i, intent, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo8657d() {
        throw null;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return mo8665e().dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo8665e().dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return mo8665e().dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return mo8665e().dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return mo8665e().dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return mo8665e().dispatchTrackballEvent(motionEvent);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo8665e().dump(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public final com.google.android.chimera.Activity mo8665e() {
        bmzs.m108697a(this.f13001r, "Activity impl has not been set!", new Object[0]);
        return this.f13001r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public com.google.android.chimera.Activity mo8666f() {
        return new djb();
    }

    public final View findViewById(int i) {
        return mo8665e().findViewById(i);
    }

    public final void finish() {
        mo8665e().finish();
    }

    public final void finishActivity(int i) {
        mo8665e().finishActivity(i);
    }

    public final void finishActivityFromChild(android.app.Activity activity, int i) {
        mo8665e().finishActivityFromChild(activity, i);
    }

    public final void finishAffinity() {
        mo8665e().finishAffinity();
    }

    public final void finishAfterTransition() {
        mo8665e().finishAfterTransition();
    }

    public final void finishAndRemoveTask() {
        mo8665e().finishAndRemoveTask();
    }

    public final void finishFromChild(android.app.Activity activity) {
        mo8665e().finishFromChild(activity);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final ComponentName getCallingActivity() {
        return mo8665e().getCallingActivity();
    }

    public final String getCallingPackage() {
        return mo8665e().getCallingPackage();
    }

    public final int getChangingConfigurations() {
        return mo8665e().getChangingConfigurations();
    }

    public final ClassLoader getClassLoader() {
        return !this.f13000q ? this.f12997m : super.getClassLoader();
    }

    public final ComponentName getComponentName() {
        return mo8665e().getComponentName();
    }

    public final Scene getContentScene() {
        return mo8665e().getContentScene();
    }

    public final TransitionManager getContentTransitionManager() {
        return mo8665e().getContentTransitionManager();
    }

    public final View getCurrentFocus() {
        return mo8665e().getCurrentFocus();
    }

    public final Intent getIntent() {
        return mo8665e().getIntent();
    }

    public final Object getLastNonConfigurationInstance() {
        return mo8665e().getLastNonConfigurationInstance();
    }

    public final LayoutInflater getLayoutInflater() {
        return mo8665e().getLayoutInflater();
    }

    public final String getLocalClassName() {
        return mo8665e().getLocalClassName();
    }

    public final MenuInflater getMenuInflater() {
        return mo8665e().getMenuInflater();
    }

    public final com.google.android.chimera.Activity getModuleActivity() {
        return mo8665e();
    }

    public final Intent getParentActivityIntent() {
        return mo8665e().getParentActivityIntent();
    }

    public final SharedPreferences getPreferences(int i) {
        return mo8665e().getPreferences(i);
    }

    public final Uri getReferrer() {
        return mo8665e().getReferrer();
    }

    public final int getRequestedOrientation() {
        return mo8665e().getRequestedOrientation();
    }

    public final Resources getResources() {
        if (!this.f13000q) {
            return mo8665e().getResources();
        }
        return super.getResources();
    }

    public final Object getSystemService(String str) {
        if (this.f13000q || !"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f13002s == null) {
            this.f13002s = ((LayoutInflater) super.getSystemService(str)).cloneInContext(mo8665e());
        }
        return this.f13002s;
    }

    public final int getTaskId() {
        return mo8665e().getTaskId();
    }

    public final Resources.Theme getTheme() {
        if (!this.f13000q) {
            return mo8665e().getTheme();
        }
        return super.getTheme();
    }

    public final VoiceInteractor getVoiceInteractor() {
        return mo8665e().getVoiceInteractor();
    }

    public final Window getWindow() {
        return mo8665e().getWindow();
    }

    public final WindowManager getWindowManager() {
        return mo8665e().getWindowManager();
    }

    public final boolean hasWindowFocus() {
        return mo8665e().hasWindowFocus();
    }

    public final void invalidateOptionsMenu() {
        mo8665e().invalidateOptionsMenu();
    }

    public final boolean isBackgroundVisibleBehind() {
        return mo8665e().isBackgroundVisibleBehind();
    }

    public final boolean isChangingConfigurations() {
        return mo8665e().isChangingConfigurations();
    }

    public final boolean isDestroyed() {
        return mo8665e().isDestroyed();
    }

    public final boolean isFinishing() {
        return mo8665e().isFinishing();
    }

    public final boolean isImmersive() {
        return mo8665e().isImmersive();
    }

    public final boolean isTaskRoot() {
        return mo8665e().isTaskRoot();
    }

    public final boolean isVoiceInteraction() {
        return mo8665e().isVoiceInteraction();
    }

    public final boolean isVoiceInteractionRoot() {
        return mo8665e().isVoiceInteractionRoot();
    }

    public final boolean moveTaskToBack(boolean z) {
        return mo8665e().moveTaskToBack(z);
    }

    public final boolean navigateUpTo(Intent intent) {
        return mo8665e().navigateUpTo(intent);
    }

    public final boolean navigateUpToFromChild(android.app.Activity activity, Intent intent) {
        return mo8665e().navigateUpToFromChild(activity, intent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        mo8665e().onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        mo8665e().onActionModeStarted(actionMode);
    }

    public final void onActivityReenter(int i, Intent intent) {
        com.google.android.chimera.Activity e = mo8665e();
        mo8645a(intent);
        e.onActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        com.google.android.chimera.Activity e = mo8665e();
        if (intent != null) {
            mo8645a(intent);
            if (intent.hasExtra("_chimera_fallback_only") && !(e instanceof djb)) {
                return;
            }
        }
        e.publicOnActivityResult(i, i2, intent);
    }

    public final void onAttachFragment(Fragment fragment) {
        String tag = fragment.getTag();
        if (tag != null && tag.contains("report_fragment_tag")) {
            this.f12998n = fragment.getClass().getName();
        }
        super.onAttachFragment(fragment);
    }

    public void onAttachedToWindow() {
        mo8665e().onAttachedToWindow();
    }

    public void onBackPressed() {
        mo8665e().onBackPressed();
    }

    public final void onBackgroundVisibleBehindChanged(boolean z) {
        mo8665e().onBackgroundVisibleBehindChanged(z);
    }

    /* access modifiers changed from: protected */
    public final void onChildTitleChanged(android.app.Activity activity, CharSequence charSequence) {
        mo8665e().publicOnChildTitleChanged(activity, charSequence);
    }

    public void onConfigurationChanged(Configuration configuration) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(mo8665e().getApplicationContext());
        if (moduleContext != null) {
            moduleContext.updateModuleConfiguration(configuration);
        }
        mo8665e().onConfigurationChanged(configuration);
    }

    public void onContentChanged() {
        mo8665e().onContentChanged();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return mo8665e().onContextItemSelected(menuItem);
    }

    public void onContextMenuClosed(Menu menu) {
        mo8665e().onContextMenuClosed(menu);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f12999o = bundle.getBoolean("_chimera_attempt_ftr_req", false);
            if (this.f12996l != this.f12995k) {
                String string = bundle.getString("_chimera_rpt_frg_cls");
                this.f12998n = string;
                if (string != null) {
                    this.f12997m = new djg(this.f12995k, this.f12996l, true, new String[]{string});
                }
            }
        }
        mo8665e().publicOnCreate(mo8644a(bundle));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo8665e().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public CharSequence onCreateDescription() {
        return mo8665e().onCreateDescription();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return mo8665e().publicOnCreateDialog(i);
    }

    public void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        mo8665e().onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return mo8665e().onCreateOptionsMenu(menu);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return mo8665e().onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return mo8665e().onCreatePanelView(i);
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return mo8665e().onCreateThumbnail(bitmap, canvas);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo8665e().onCreateView(view, str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        mo8665e().publicOnDestroy();
    }

    public void onDetachedFromWindow() {
        mo8665e().onDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        mo8665e().onEnterAnimationComplete();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return mo8665e().onGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return mo8665e().onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return mo8665e().onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return mo8665e().onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return mo8665e().onKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return mo8665e().onKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        mo8665e().onLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return mo8665e().onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return mo8665e().onMenuOpened(i, menu);
    }

    public boolean onNavigateUp() {
        return mo8665e().onNavigateUp();
    }

    public boolean onNavigateUpFromChild(android.app.Activity activity) {
        return mo8665e().onNavigateUpFromChild(activity);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        com.google.android.chimera.Activity e = mo8665e();
        mo8645a(intent);
        e.publicOnNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return mo8665e().onOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        mo8665e().onOptionsMenuClosed(menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        mo8665e().onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        mo8665e().publicOnPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        mo8665e().publicOnPostCreate(mo8644a(bundle));
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        mo8665e().publicOnPostResume();
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        mo8665e().publicOnPrepareDialog(i, dialog);
    }

    public void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        mo8665e().onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return mo8665e().onPrepareOptionsMenu(menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return mo8665e().onPreparePanel(i, view, menu);
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        mo8665e().onProvideAssistContent(assistContent);
    }

    public void onProvideAssistData(Bundle bundle) {
        mo8665e().onProvideAssistData(bundle);
    }

    public final Uri onProvideReferrer() {
        return mo8665e().onProvideReferrer();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        mo8665e().onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        mo8665e().publicOnRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        Bundle a = mo8644a(bundle);
        if (a == null) {
            super.onRestoreInstanceState(new Bundle());
        } else {
            mo8665e().publicOnRestoreInstanceState(a);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        mo8665e().publicOnResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        mo8665e().publicOnSaveInstanceState(bundle2);
        if (bundle != null) {
            mo8646a(bundle, bundle2);
            bundle.putString("_chimera_rpt_frg_cls", this.f12998n);
            bundle.putBoolean("_chimera_attempt_ftr_req", this.f12999o);
        }
    }

    public boolean onSearchRequested() {
        return mo8665e().onSearchRequested();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        mo8665e().publicOnStart();
    }

    public void onStateNotSaved() {
        mo8665e().onStateNotSaved();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        mo8665e().publicOnStop();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        mo8665e().publicOnTitleChanged(charSequence, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return mo8665e().onTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return mo8665e().onTrackballEvent(motionEvent);
    }

    public void onTrimMemory(int i) {
        mo8665e().onTrimMemory(i);
    }

    public void onUserInteraction() {
        mo8665e().onUserInteraction();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        mo8665e().publicOnUserLeaveHint();
    }

    public final void onVisibleBehindCanceled() {
        mo8665e().onVisibleBehindCanceled();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        mo8665e().onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        mo8665e().onWindowFocusChanged(z);
    }

    public final void openContextMenu(View view) {
        mo8665e().openContextMenu(view);
    }

    public final void openOptionsMenu() {
        mo8665e().openOptionsMenu();
    }

    public final void overridePendingTransition(int i, int i2) {
        mo8665e().overridePendingTransition(i, i2);
    }

    public final void postponeEnterTransition() {
        mo8665e().postponeEnterTransition();
    }

    public final void recreate() {
        mo8665e().recreate();
    }

    public final void registerForContextMenu(View view) {
        mo8665e().registerForContextMenu(view);
    }

    public final boolean releaseInstance() {
        return mo8665e().releaseInstance();
    }

    public final void reportFullyDrawn() {
        mo8665e().reportFullyDrawn();
    }

    public final boolean requestVisibleBehind(boolean z) {
        return mo8665e().requestVisibleBehind(z);
    }

    public final void setContentTransitionManager(TransitionManager transitionManager) {
        mo8665e().setContentTransitionManager(transitionManager);
    }

    public final void setContentView(int i) {
        mo8665e().setContentView(i);
    }

    public final void setFinishOnTouchOutside(boolean z) {
        mo8665e().setFinishOnTouchOutside(z);
    }

    public final void setImmersive(boolean z) {
        mo8665e().setImmersive(z);
    }

    public final void setIntent(Intent intent) {
        mo8665e().setIntent(intent);
    }

    public final void setRequestedOrientation(int i) {
        mo8665e().setRequestedOrientation(i);
    }

    public final void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        mo8665e().setTaskDescription(taskDescription);
    }

    public final void setTheme(int i) {
        com.google.android.chimera.Activity e = mo8665e();
        int resourceId = ChimeraResource.getResourceId(this.f12996l, e.getResources(), super.getResources(), i);
        super.setTheme(resourceId);
        e.setTheme(resourceId);
    }

    public final void setTitle(int i) {
        mo8665e().setTitle(i);
    }

    public final void setTitleColor(int i) {
        mo8665e().setTitleColor(i);
    }

    public final void setVisible(boolean z) {
        mo8665e().setVisible(z);
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        return mo8665e().shouldShowRequestPermissionRationale(str);
    }

    public final boolean shouldUpRecreateTask(Intent intent) {
        return mo8665e().shouldUpRecreateTask(intent);
    }

    public final boolean showAssist(Bundle bundle) {
        return mo8665e().showAssist(bundle);
    }

    public final void showLockTaskEscapeMessage() {
        mo8665e().showLockTaskEscapeMessage();
    }

    public final void startActivities(Intent[] intentArr) {
        mo8665e().startActivities(intentArr);
    }

    public final void startActivity(Intent intent) {
        mo8665e().startActivity(intent);
    }

    public final void startActivityForResult(Intent intent, int i) {
        mo8665e().startActivityForResult(intent, i);
    }

    public final void startActivityFromChild(android.app.Activity activity, Intent intent, int i) {
        mo8665e().startActivityFromChild(activity, intent, i);
    }

    public final boolean startActivityIfNeeded(Intent intent, int i) {
        return mo8665e().startActivityIfNeeded(intent, i);
    }

    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        mo8665e().startIntentSender(intentSender, intent, i, i2, i3);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        mo8665e().startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void startIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        mo8665e().startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public final void startLockTask() {
        mo8665e().startLockTask();
    }

    public final void startManagingCursor(Cursor cursor) {
        mo8665e().startManagingCursor(cursor);
    }

    public final boolean startNextMatchingActivity(Intent intent) {
        return mo8665e().startNextMatchingActivity(intent);
    }

    public final void startPostponedEnterTransition() {
        mo8665e().startPostponedEnterTransition();
    }

    public final void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        mo8665e().startSearch(str, z, bundle, z2);
    }

    public final void stopLockTask() {
        mo8665e().stopLockTask();
    }

    public final void stopManagingCursor(Cursor cursor) {
        mo8665e().stopManagingCursor(cursor);
    }

    public final void superAddContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
    }

    public final void superCloseContextMenu() {
        super.closeContextMenu();
    }

    public final void superCloseOptionsMenu() {
        super.closeOptionsMenu();
    }

    public final void superConvertFromTranslucent() {
        super.convertFromTranslucent();
    }

    public final boolean superConvertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions) {
        return super.convertToTranslucent(translucentConversionListener, activityOptions);
    }

    public final PendingIntent superCreatePendingResult(int i, Intent intent, int i2) {
        return super.createPendingResult(i, intent, i2);
    }

    public final boolean superDispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean superDispatchKeyEventChimera(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean superDispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean superDispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean superDispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public final View superFindViewById(int i) {
        return super.findViewById(i);
    }

    public final void superFinish() {
        super.finish();
    }

    public final void superFinishActivity(int i) {
        super.finishActivity(i);
    }

    public final void superFinishActivityFromChild(android.app.Activity activity, int i) {
        super.finishActivityFromChild(activity, i);
    }

    public final void superFinishAffinity() {
        super.finishAffinity();
    }

    public final void superFinishAfterTransition() {
        super.finishAfterTransition();
    }

    public final void superFinishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    public final void superFinishFromChild(android.app.Activity activity) {
        super.finishFromChild(activity);
    }

    public final ComponentName superGetCallingActivity() {
        return super.getCallingActivity();
    }

    public final String superGetCallingPackage() {
        return super.getCallingPackage();
    }

    public final int superGetChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public final ComponentName superGetComponentName() {
        return super.getComponentName();
    }

    public final Scene superGetContentScene() {
        return super.getContentScene();
    }

    public final TransitionManager superGetContentTransitionManager() {
        return super.getContentTransitionManager();
    }

    public final View superGetCurrentFocus() {
        return super.getCurrentFocus();
    }

    public final Intent superGetIntent() {
        Intent intent = super.getIntent();
        mo8645a(intent);
        return intent;
    }

    public final Object superGetLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    public final LayoutInflater superGetLayoutInflater() {
        return super.getLayoutInflater();
    }

    public final String superGetLocalClassName() {
        return super.getLocalClassName();
    }

    public final MenuInflater superGetMenuInflater() {
        return super.getMenuInflater();
    }

    public final Intent superGetParentActivityIntent() {
        Intent parentActivityIntent = super.getParentActivityIntent();
        mo8645a(parentActivityIntent);
        return parentActivityIntent;
    }

    public final SharedPreferences superGetPreferences(int i) {
        return super.getPreferences(i);
    }

    public final Uri superGetReferrer() {
        return super.getReferrer();
    }

    public final int superGetRequestedOrientation() {
        return super.getRequestedOrientation();
    }

    public final C1050hj superGetSupportFragmentManager() {
        return super.mo11924aK();
    }

    public final int superGetTaskId() {
        return super.getTaskId();
    }

    public final VoiceInteractor superGetVoiceInteractor() {
        return super.getVoiceInteractor();
    }

    public final Window superGetWindow() {
        return super.getWindow();
    }

    public final WindowManager superGetWindowManager() {
        return super.getWindowManager();
    }

    public final boolean superHasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final void superInvalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    public final boolean superIsBackgroundVisibleBehind() {
        return super.isBackgroundVisibleBehind();
    }

    public final boolean superIsChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    public final boolean superIsDestroyed() {
        return super.isDestroyed();
    }

    public final boolean superIsFinishing() {
        return super.isFinishing();
    }

    public final boolean superIsImmersive() {
        return super.isImmersive();
    }

    public final boolean superIsTaskRoot() {
        return super.isTaskRoot();
    }

    public final boolean superIsVoiceInteraction() {
        return super.isVoiceInteraction();
    }

    public final boolean superIsVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot();
    }

    public final boolean superMoveTaskToBack(boolean z) {
        return super.moveTaskToBack(z);
    }

    public final boolean superNavigateUpTo(Intent intent) {
        return super.navigateUpTo(intent);
    }

    public final boolean superNavigateUpToFromChild(android.app.Activity activity, Intent intent) {
        return super.navigateUpToFromChild(activity, intent);
    }

    public final void superOnActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    public final void superOnActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    public final void superOnActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
    }

    public final void superOnActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public final void superOnAttachFragment(C1018gh ghVar) {
    }

    public final void superOnAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void superOnBackPressed() {
        super.onBackPressed();
    }

    public final void superOnBackgroundVisibleBehindChanged(boolean z) {
        super.onBackgroundVisibleBehindChanged(z);
    }

    public final void superOnChildTitleChanged(android.app.Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
    }

    public final void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void superOnContentChanged() {
        super.onContentChanged();
    }

    public final boolean superOnContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public final void superOnContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    public final void superOnCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final CharSequence superOnCreateDescription() {
        return super.onCreateDescription();
    }

    public final Dialog superOnCreateDialog(int i) {
        return super.onCreateDialog(i);
    }

    public final void superOnCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        super.onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public final boolean superOnCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean superOnCreatePanelMenu(int i, Menu menu) {
        return super.onCreatePanelMenu(i, menu);
    }

    public final View superOnCreatePanelView(int i) {
        return super.onCreatePanelView(i);
    }

    public final boolean superOnCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return super.onCreateThumbnail(bitmap, canvas);
    }

    public final View superOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            Log.e("ChimeraActivityProxy", "Chimera does not support inflating fragments at this time.");
            return null;
        }
        View a = djx.m8679a(this.f12996l, context, str, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public final void superOnDestroy() {
        super.onDestroy();
    }

    public final void superOnDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void superOnEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    public final boolean superOnGenericMotionEvent(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean superOnKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean superOnKeyLongPress(int i, KeyEvent keyEvent) {
        return super.onKeyLongPress(i, keyEvent);
    }

    public final boolean superOnKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public final boolean superOnKeyShortcut(int i, KeyEvent keyEvent) {
        return super.onKeyShortcut(i, keyEvent);
    }

    public final boolean superOnKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public final void superOnLowMemory() {
        super.onLowMemory();
    }

    public final boolean superOnMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem);
    }

    public final boolean superOnMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public final boolean superOnNavigateUp() {
        return super.onNavigateUp();
    }

    public final boolean superOnNavigateUpFromChild(android.app.Activity activity) {
        return super.onNavigateUpFromChild(activity);
    }

    public final void superOnNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public final boolean superOnOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public final void superOnOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    public final void superOnPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public final void superOnPause() {
        super.onPause();
    }

    public final void superOnPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public final void superOnPostResume() {
        super.onPostResume();
    }

    public final void superOnPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    public final void superOnPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        super.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public final boolean superOnPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public final boolean superOnPrepareOptionsPanel(View view, Menu menu) {
        return super.mo11922a(view, menu);
    }

    public final boolean superOnPreparePanel(int i, View view, Menu menu) {
        return super.onPreparePanel(i, view, menu);
    }

    public final void superOnProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
    }

    public final void superOnProvideAssistData(Bundle bundle) {
        super.onProvideAssistData(bundle);
    }

    public final Uri superOnProvideReferrer() {
        return super.onProvideReferrer();
    }

    public final void superOnRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public final void superOnRestart() {
        super.onRestart();
    }

    public final void superOnRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public final void superOnResume() {
        super.onResume();
    }

    public final void superOnResumeFragments() {
        super.mo11923aH();
    }

    public final Object superOnRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final void superOnSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public final boolean superOnSearchRequested() {
        return super.onSearchRequested();
    }

    public final void superOnStart() {
        super.onStart();
    }

    public final void superOnStateNotSaved() {
        super.onStateNotSaved();
    }

    public final void superOnStop() {
        super.onStop();
    }

    public final void superOnTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
    }

    public final boolean superOnTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean superOnTrackballEvent(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    public final void superOnTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    public final void superOnUserInteraction() {
        super.onUserInteraction();
    }

    public final void superOnUserLeaveHint() {
        super.onUserLeaveHint();
    }

    public final void superOnVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    public final void superOnWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    public final void superOnWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void superOpenContextMenu(View view) {
        super.openContextMenu(view);
    }

    public final void superOpenOptionsMenu() {
        super.openOptionsMenu();
    }

    public final void superOverridePendingTransition(int i, int i2) {
        Resources resources = super.getResources();
        Resources resources2 = mo8665e().getResources();
        super.overridePendingTransition(ChimeraResource.getResourceId(this.f12995k, resources, resources2, i), ChimeraResource.getResourceId(this.f12995k, resources, resources2, i2));
    }

    public final void superPostponeEnterTransition() {
        super.postponeEnterTransition();
    }

    public final void superRecreate() {
        super.recreate();
    }

    public final void superRegisterForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    public final boolean superReleaseInstance() {
        return super.releaseInstance();
    }

    public final void superReportFullyDrawn() {
        super.reportFullyDrawn();
    }

    public final boolean superRequestVisibleBehind(boolean z) {
        return super.requestVisibleBehind(z);
    }

    public final void superSetContentTransitionManager(TransitionManager transitionManager) {
        super.setContentTransitionManager(transitionManager);
    }

    public final void superSetContentView(int i) {
        super.setContentView(i);
    }

    public final void superSetFinishOnTouchOutside(boolean z) {
        super.setFinishOnTouchOutside(z);
    }

    public final void superSetImmersive(boolean z) {
        super.setImmersive(z);
    }

    public final void superSetIntent(Intent intent) {
        super.setIntent(intent);
    }

    public final void superSetRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
    }

    public final void superSetTaskDescription(ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    public final void superSetTitle(int i) {
        super.setTitle(i);
    }

    public final void superSetTitleColor(int i) {
        super.setTitleColor(i);
    }

    public final void superSetVisible(boolean z) {
        super.setVisible(z);
    }

    public final boolean superShouldShowRequestPermissionRationale(String str) {
        return super.shouldShowRequestPermissionRationale(str);
    }

    public final boolean superShouldUpRecreateTask(Intent intent) {
        return super.shouldUpRecreateTask(intent);
    }

    public final boolean superShowAssist(Bundle bundle) {
        return super.showAssist(bundle);
    }

    public final void superShowLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    public final void superStartActivities(Intent[] intentArr) {
        super.startActivities(intentArr);
    }

    public final void superStartActivity(Intent intent) {
        super.startActivity(intent);
    }

    public final void superStartActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public final void superStartActivityFromChild(android.app.Activity activity, Intent intent, int i) {
        super.startActivityFromChild(activity, intent, i);
    }

    public final boolean superStartActivityIfNeeded(Intent intent, int i) {
        return super.startActivityIfNeeded(intent, i);
    }

    public final void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        super.startIntentSender(intentSender, intent, i, i2, i3);
    }

    public final void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void superStartIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public final void superStartLockTask() {
        super.startLockTask();
    }

    public final void superStartManagingCursor(Cursor cursor) {
        super.startManagingCursor(cursor);
    }

    public final boolean superStartNextMatchingActivity(Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    public final void superStartPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    public final void superStartSearch(String str, boolean z, Bundle bundle, boolean z2) {
        super.startSearch(str, z, bundle, z2);
    }

    public final void superStopLockTask() {
        super.stopLockTask();
    }

    public final void superStopManagingCursor(Cursor cursor) {
        super.stopManagingCursor(cursor);
    }

    public final void superTakeKeyEvents(boolean z) {
        super.takeKeyEvents(z);
    }

    public final void superTriggerSearch(String str, Bundle bundle) {
        super.triggerSearch(str, bundle);
    }

    public final void superUnregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }

    public final void takeKeyEvents(boolean z) {
        mo8665e().takeKeyEvents(z);
    }

    public final void triggerSearch(String str, Bundle bundle) {
        mo8665e().triggerSearch(str, bundle);
    }

    public final void unregisterForContextMenu(View view) {
        mo8665e().unregisterForContextMenu(view);
    }

    /* renamed from: b */
    public final void mo8651b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f12996l);
        }
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        com.google.android.chimera.Activity e = mo8665e();
        mo8651b(bundle);
        return e.publicOnCreateDialog(i, bundle);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return mo8665e().onCreateView(str, context, attributeSet);
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        mo8665e().onPostCreate(mo8644a(bundle), persistableBundle);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        com.google.android.chimera.Activity e = mo8665e();
        mo8651b(bundle);
        e.publicOnPrepareDialog(i, dialog, bundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return mo8665e().onSearchRequested(searchEvent);
    }

    public final void setContentView(View view) {
        mo8665e().setContentView(view);
    }

    public final void setTitle(CharSequence charSequence) {
        mo8665e().setTitle(charSequence);
    }

    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        mo8665e().startActivities(intentArr, bundle);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        mo8665e().startActivity(intent, bundle);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        mo8665e().startActivityForResult(intent, i, bundle);
    }

    public final void startActivityFromChild(android.app.Activity activity, Intent intent, int i, Bundle bundle) {
        mo8665e().startActivityFromChild(activity, intent, i, bundle);
    }

    public final boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return mo8665e().startActivityIfNeeded(intent, i, bundle);
    }

    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        mo8665e().startIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        mo8665e().startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void startIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        mo8665e().startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        return mo8665e().startNextMatchingActivity(intent, bundle);
    }

    public final Object superGetLastCustomNonConfigurationInstance() {
        agn agn = (agn) getLastNonConfigurationInstance();
        if (agn != null) {
            return agn.f507a;
        }
        return null;
    }

    public final C1087iq superGetSupportLoaderManager() {
        return C1087iq.m15879a(this);
    }

    public final void superOnCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public final Dialog superOnCreateDialog(int i, Bundle bundle) {
        return super.onCreateDialog(i, bundle);
    }

    public final void superOnPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onPostCreate(bundle, persistableBundle);
    }

    public final void superOnPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
    }

    public final void superOnRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    public final void superOnSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    public final boolean superOnSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    public final void superSetContentView(View view) {
        super.setContentView(view);
    }

    public final void superSetTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public final void superStartActivities(Intent[] intentArr, Bundle bundle) {
        super.startActivities(intentArr, bundle);
    }

    public final void superStartActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    public final void superStartActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public final void superStartActivityFromChild(android.app.Activity activity, Intent intent, int i, Bundle bundle) {
        super.startActivityFromChild(activity, intent, i, bundle);
    }

    public final void superStartActivityFromFragment(C1018gh ghVar, Intent intent, int i) {
        mo11921a(ghVar, intent, i);
    }

    public final boolean superStartActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return super.startActivityIfNeeded(intent, i, bundle);
    }

    public final void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        super.startIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public final void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void superStartIntentSenderFromChild(android.app.Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final boolean superStartNextMatchingActivity(Intent intent, Bundle bundle) {
        return super.startNextMatchingActivity(intent, bundle);
    }

    public final void superSupportFinishAfterTransition() {
        int i = Build.VERSION.SDK_INT;
        finishAfterTransition();
    }

    public final void superSupportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public final void superSupportPostponeEnterTransition() {
        int i = Build.VERSION.SDK_INT;
        postponeEnterTransition();
    }

    public final void superSupportStartPostponedEnterTransition() {
        int i = Build.VERSION.SDK_INT;
        startPostponedEnterTransition();
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Bundle bundle2 = new Bundle();
        mo8665e().onSaveInstanceState(bundle2, persistableBundle);
        mo8646a(bundle, bundle2);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo8665e().setContentView(view, layoutParams);
    }

    public final void superSetContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Bundle a = mo8644a(bundle);
        if (a == null) {
            super.onRestoreInstanceState(new Bundle(), persistableBundle);
        } else {
            mo8665e().onRestoreInstanceState(a, persistableBundle);
        }
    }

    public final View superOnCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = djx.m8679a(this.f12996l, context, str, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        mo8665e().onCreate(mo8644a(bundle), persistableBundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8645a(Intent intent) {
        if (intent != null) {
            intent.setExtrasClassLoader(this.f12996l);
        }
    }

    /* renamed from: a */
    public final void mo8646a(Bundle bundle, Bundle bundle2) {
        ClassLoader classLoader;
        com.google.android.chimera.Activity e = mo8665e();
        ClassLoader classLoader2 = this.f12995k;
        ClassLoader classLoader3 = this.f12996l;
        C1050hj aK = super.mo11924aK();
        if (bundle != null) {
            if (classLoader3 != null && !classLoader3.equals(classLoader2)) {
                Bundle bundle3 = null;
                for (String str : bundle2.keySet()) {
                    Object obj = bundle2.get(str);
                    if ((obj instanceof Parcelable) && (classLoader = obj.getClass().getClassLoader()) != null && !classLoader.equals(classLoader2)) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putParcelable(str, (Parcelable) obj);
                        bundle2.putParcelable(str, null);
                    }
                }
                if (bundle3 == null) {
                    bundle2.remove("_chimera_top_level_wrapper_state");
                } else {
                    bundle2.putBundle("_chimera_top_level_wrapper_state", bundle3);
                }
                C1119jv.m17385a(bundle2, aK);
            }
            try {
                ModuleManager.ModuleApkInfo currentModuleApk = ModuleManager.get(e).getCurrentModuleApk();
                bundle.putBundle("_chimera_module_state", bundle2);
                bundle.putInt("_chimera_module_apk_type", currentModuleApk.apkType);
                bundle.putLong("_chimera_module_apk_timestamp", currentModuleApk.apkTimestamp);
            } catch (IllegalStateException e2) {
                Log.w("SavedInstanceUtils", "Could not obtain module apk info. Skipping check for moduleInfo in saved instance state.");
                bundle.putAll(bundle2);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.chimera.Activity.setProxy(gj, android.content.Context):void
     arg types: [dfb, android.content.Context]
     candidates:
      com.google.android.chimera.ActivityBase.setProxy(android.app.Activity, android.content.Context):void
      com.google.android.chimera.Activity.setProxy(gj, android.content.Context):void */
    /* renamed from: a */
    public void mo8647a(com.google.android.chimera.Activity activity, Context context) {
        boolean z;
        if (this.f13001r == null) {
            z = true;
        } else {
            z = false;
        }
        bmzs.m108698a(z);
        this.f13001r = activity;
        this.f12996l = context.getClassLoader();
        this.f12995k = super.getClassLoader();
        this.f12997m = this.f12996l;
        activity.setProxy((C1021gj) this, context);
    }
}
