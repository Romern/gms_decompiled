package com.google.android.chimera;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.Application;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
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
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ActivityBase extends ContextThemeWrapper implements dix {

    /* renamed from: CJ */
    private ProxyCallbacks f7605CJ;

    /* renamed from: CS */
    private Activity f7606CS;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks {
        void superAddContentView(View view, ViewGroup.LayoutParams layoutParams);

        void superCloseContextMenu();

        void superCloseOptionsMenu();

        void superConvertFromTranslucent();

        boolean superConvertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions);

        PendingIntent superCreatePendingResult(int i, Intent intent, int i2);

        boolean superDispatchGenericMotionEvent(MotionEvent motionEvent);

        boolean superDispatchKeyEventChimera(KeyEvent keyEvent);

        boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent);

        boolean superDispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent);

        boolean superDispatchTouchEvent(MotionEvent motionEvent);

        boolean superDispatchTrackballEvent(MotionEvent motionEvent);

        void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        View superFindViewById(int i);

        void superFinish();

        void superFinishActivity(int i);

        void superFinishActivityFromChild(Activity activity, int i);

        void superFinishAffinity();

        void superFinishAfterTransition();

        void superFinishAndRemoveTask();

        void superFinishFromChild(Activity activity);

        ComponentName superGetCallingActivity();

        String superGetCallingPackage();

        int superGetChangingConfigurations();

        ComponentName superGetComponentName();

        Scene superGetContentScene();

        TransitionManager superGetContentTransitionManager();

        View superGetCurrentFocus();

        Intent superGetIntent();

        Object superGetLastNonConfigurationInstance();

        LayoutInflater superGetLayoutInflater();

        String superGetLocalClassName();

        MenuInflater superGetMenuInflater();

        Intent superGetParentActivityIntent();

        SharedPreferences superGetPreferences(int i);

        Uri superGetReferrer();

        int superGetRequestedOrientation();

        int superGetTaskId();

        VoiceInteractor superGetVoiceInteractor();

        Window superGetWindow();

        WindowManager superGetWindowManager();

        boolean superHasWindowFocus();

        void superInvalidateOptionsMenu();

        boolean superIsBackgroundVisibleBehind();

        boolean superIsChangingConfigurations();

        boolean superIsDestroyed();

        boolean superIsFinishing();

        boolean superIsImmersive();

        boolean superIsTaskRoot();

        boolean superIsVoiceInteraction();

        boolean superIsVoiceInteractionRoot();

        boolean superMoveTaskToBack(boolean z);

        boolean superNavigateUpTo(Intent intent);

        boolean superNavigateUpToFromChild(Activity activity, Intent intent);

        void superOnActionModeFinished(ActionMode actionMode);

        void superOnActionModeStarted(ActionMode actionMode);

        void superOnActivityReenter(int i, Intent intent);

        void superOnActivityResult(int i, int i2, Intent intent);

        void superOnAttachedToWindow();

        void superOnBackPressed();

        void superOnBackgroundVisibleBehindChanged(boolean z);

        void superOnChildTitleChanged(Activity activity, CharSequence charSequence);

        void superOnConfigurationChanged(Configuration configuration);

        void superOnContentChanged();

        boolean superOnContextItemSelected(MenuItem menuItem);

        void superOnContextMenuClosed(Menu menu);

        void superOnCreate(Bundle bundle);

        void superOnCreate(Bundle bundle, PersistableBundle persistableBundle);

        void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

        CharSequence superOnCreateDescription();

        Dialog superOnCreateDialog(int i);

        Dialog superOnCreateDialog(int i, Bundle bundle);

        void superOnCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder);

        boolean superOnCreateOptionsMenu(Menu menu);

        boolean superOnCreatePanelMenu(int i, Menu menu);

        View superOnCreatePanelView(int i);

        boolean superOnCreateThumbnail(Bitmap bitmap, Canvas canvas);

        View superOnCreateView(View view, String str, Context context, AttributeSet attributeSet);

        View superOnCreateView(String str, Context context, AttributeSet attributeSet);

        void superOnDestroy();

        void superOnDetachedFromWindow();

        void superOnEnterAnimationComplete();

        boolean superOnGenericMotionEvent(MotionEvent motionEvent);

        boolean superOnKeyDown(int i, KeyEvent keyEvent);

        boolean superOnKeyLongPress(int i, KeyEvent keyEvent);

        boolean superOnKeyMultiple(int i, int i2, KeyEvent keyEvent);

        boolean superOnKeyShortcut(int i, KeyEvent keyEvent);

        boolean superOnKeyUp(int i, KeyEvent keyEvent);

        void superOnLowMemory();

        boolean superOnMenuItemSelected(int i, MenuItem menuItem);

        boolean superOnMenuOpened(int i, Menu menu);

        boolean superOnNavigateUp();

        boolean superOnNavigateUpFromChild(Activity activity);

        void superOnNewIntent(Intent intent);

        boolean superOnOptionsItemSelected(MenuItem menuItem);

        void superOnOptionsMenuClosed(Menu menu);

        void superOnPanelClosed(int i, Menu menu);

        void superOnPause();

        void superOnPostCreate(Bundle bundle);

        void superOnPostCreate(Bundle bundle, PersistableBundle persistableBundle);

        void superOnPostResume();

        void superOnPrepareDialog(int i, Dialog dialog);

        void superOnPrepareDialog(int i, Dialog dialog, Bundle bundle);

        void superOnPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder);

        boolean superOnPrepareOptionsMenu(Menu menu);

        boolean superOnPreparePanel(int i, View view, Menu menu);

        void superOnProvideAssistContent(AssistContent assistContent);

        void superOnProvideAssistData(Bundle bundle);

        Uri superOnProvideReferrer();

        void superOnRequestPermissionsResult(int i, String[] strArr, int[] iArr);

        void superOnRestart();

        void superOnRestoreInstanceState(Bundle bundle);

        void superOnRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle);

        void superOnResume();

        void superOnSaveInstanceState(Bundle bundle);

        void superOnSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle);

        boolean superOnSearchRequested();

        boolean superOnSearchRequested(SearchEvent searchEvent);

        void superOnStart();

        void superOnStateNotSaved();

        void superOnStop();

        void superOnTitleChanged(CharSequence charSequence, int i);

        boolean superOnTouchEvent(MotionEvent motionEvent);

        boolean superOnTrackballEvent(MotionEvent motionEvent);

        void superOnTrimMemory(int i);

        void superOnUserInteraction();

        void superOnUserLeaveHint();

        void superOnVisibleBehindCanceled();

        void superOnWindowAttributesChanged(WindowManager.LayoutParams layoutParams);

        void superOnWindowFocusChanged(boolean z);

        void superOpenContextMenu(View view);

        void superOpenOptionsMenu();

        void superOverridePendingTransition(int i, int i2);

        void superPostponeEnterTransition();

        void superRecreate();

        void superRegisterForContextMenu(View view);

        boolean superReleaseInstance();

        void superReportFullyDrawn();

        boolean superRequestVisibleBehind(boolean z);

        void superSetContentTransitionManager(TransitionManager transitionManager);

        void superSetContentView(int i);

        void superSetContentView(View view);

        void superSetContentView(View view, ViewGroup.LayoutParams layoutParams);

        void superSetFinishOnTouchOutside(boolean z);

        void superSetImmersive(boolean z);

        void superSetIntent(Intent intent);

        void superSetRequestedOrientation(int i);

        void superSetTaskDescription(ActivityManager.TaskDescription taskDescription);

        void superSetTitle(int i);

        void superSetTitle(CharSequence charSequence);

        void superSetTitleColor(int i);

        void superSetVisible(boolean z);

        boolean superShouldShowRequestPermissionRationale(String str);

        boolean superShouldUpRecreateTask(Intent intent);

        boolean superShowAssist(Bundle bundle);

        void superShowLockTaskEscapeMessage();

        void superStartActivities(Intent[] intentArr);

        void superStartActivities(Intent[] intentArr, Bundle bundle);

        void superStartActivity(Intent intent);

        void superStartActivity(Intent intent, Bundle bundle);

        void superStartActivityForResult(Intent intent, int i);

        void superStartActivityForResult(Intent intent, int i, Bundle bundle);

        void superStartActivityFromChild(Activity activity, Intent intent, int i);

        void superStartActivityFromChild(Activity activity, Intent intent, int i, Bundle bundle);

        boolean superStartActivityIfNeeded(Intent intent, int i);

        boolean superStartActivityIfNeeded(Intent intent, int i, Bundle bundle);

        void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3);

        void superStartIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle);

        void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4);

        void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

        void superStartIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4);

        void superStartIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

        void superStartLockTask();

        void superStartManagingCursor(Cursor cursor);

        boolean superStartNextMatchingActivity(Intent intent);

        boolean superStartNextMatchingActivity(Intent intent, Bundle bundle);

        void superStartPostponedEnterTransition();

        void superStartSearch(String str, boolean z, Bundle bundle, boolean z2);

        void superStopLockTask();

        void superStopManagingCursor(Cursor cursor);

        void superTakeKeyEvents(boolean z);

        void superTriggerSearch(String str, Bundle bundle);

        void superUnregisterForContextMenu(View view);
    }

    public ActivityBase() {
        super((Context) null, (Resources.Theme) null);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f7605CJ.superAddContentView(view, layoutParams);
    }

    public void closeContextMenu() {
        this.f7605CJ.superCloseContextMenu();
    }

    public void closeOptionsMenu() {
        this.f7605CJ.superCloseOptionsMenu();
    }

    public void convertFromTranslucent() {
        this.f7605CJ.superConvertFromTranslucent();
    }

    public boolean convertToTranslucent(Activity.TranslucentConversionListener translucentConversionListener, ActivityOptions activityOptions) {
        return this.f7605CJ.superConvertToTranslucent(translucentConversionListener, activityOptions);
    }

    public PendingIntent createPendingResult(int i, Intent intent, int i2) {
        return this.f7605CJ.superCreatePendingResult(i, intent, i2);
    }

    public final void dismissDialog(int i) {
        this.f7606CS.dismissDialog(i);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7605CJ.superDispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f7605CJ.superDispatchKeyEventChimera(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f7605CJ.superDispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f7605CJ.superDispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7605CJ.superDispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7605CJ.superDispatchTrackballEvent(motionEvent);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7605CJ.superDump(str, fileDescriptor, printWriter, strArr);
    }

    public View findViewById(int i) {
        return this.f7605CJ.superFindViewById(i);
    }

    public void finish() {
        this.f7605CJ.superFinish();
    }

    public void finishActivity(int i) {
        this.f7605CJ.superFinishActivity(i);
    }

    public void finishActivityFromChild(Activity activity, int i) {
        this.f7605CJ.superFinishActivityFromChild(activity, i);
    }

    public void finishAffinity() {
        this.f7605CJ.superFinishAffinity();
    }

    public void finishAfterTransition() {
        this.f7605CJ.superFinishAfterTransition();
    }

    public void finishAndRemoveTask() {
        this.f7605CJ.superFinishAndRemoveTask();
    }

    public void finishFromChild(Activity activity) {
        this.f7605CJ.superFinishFromChild(activity);
    }

    public final Application getApplication() {
        return this.f7606CS.getApplication();
    }

    public Context getApplicationContext() {
        int i = Build.VERSION.SDK_INT;
        return super.getApplicationContext();
    }

    public ComponentName getCallingActivity() {
        return this.f7605CJ.superGetCallingActivity();
    }

    public String getCallingPackage() {
        return this.f7605CJ.superGetCallingPackage();
    }

    public int getChangingConfigurations() {
        return this.f7605CJ.superGetChangingConfigurations();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public ComponentName getComponentName() {
        return this.f7605CJ.superGetComponentName();
    }

    public Activity getContainerActivity() {
        return this.f7606CS;
    }

    public Scene getContentScene() {
        return this.f7605CJ.superGetContentScene();
    }

    public TransitionManager getContentTransitionManager() {
        return this.f7605CJ.superGetContentTransitionManager();
    }

    public View getCurrentFocus() {
        return this.f7605CJ.superGetCurrentFocus();
    }

    public Intent getIntent() {
        return this.f7605CJ.superGetIntent();
    }

    public Object getLastNonConfigurationInstance() {
        return this.f7605CJ.superGetLastNonConfigurationInstance();
    }

    public LayoutInflater getLayoutInflater() {
        return this.f7605CJ.superGetLayoutInflater();
    }

    public String getLocalClassName() {
        return this.f7605CJ.superGetLocalClassName();
    }

    public final MediaController getMediaController() {
        return this.f7606CS.getMediaController();
    }

    public MenuInflater getMenuInflater() {
        return this.f7605CJ.superGetMenuInflater();
    }

    public final Activity getParent() {
        return this.f7606CS.getParent();
    }

    public Intent getParentActivityIntent() {
        return this.f7605CJ.superGetParentActivityIntent();
    }

    public SharedPreferences getPreferences(int i) {
        return this.f7605CJ.superGetPreferences(i);
    }

    public Uri getReferrer() {
        return this.f7605CJ.superGetReferrer();
    }

    public int getRequestedOrientation() {
        return this.f7605CJ.superGetRequestedOrientation();
    }

    public final SearchEvent getSearchEvent() {
        return this.f7606CS.getSearchEvent();
    }

    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return this.f7606CS.getSystemService(str);
        }
        return super.getSystemService(str);
    }

    public int getTaskId() {
        return this.f7605CJ.superGetTaskId();
    }

    public final CharSequence getTitle() {
        return this.f7606CS.getTitle();
    }

    public final int getTitleColor() {
        return this.f7606CS.getTitleColor();
    }

    public VoiceInteractor getVoiceInteractor() {
        return this.f7605CJ.superGetVoiceInteractor();
    }

    public final int getVolumeControlStream() {
        return this.f7606CS.getVolumeControlStream();
    }

    public Window getWindow() {
        return this.f7605CJ.superGetWindow();
    }

    public WindowManager getWindowManager() {
        return this.f7605CJ.superGetWindowManager();
    }

    public boolean hasWindowFocus() {
        return this.f7605CJ.superHasWindowFocus();
    }

    public void invalidateOptionsMenu() {
        this.f7605CJ.superInvalidateOptionsMenu();
    }

    public boolean isBackgroundVisibleBehind() {
        return this.f7605CJ.superIsBackgroundVisibleBehind();
    }

    public boolean isChangingConfigurations() {
        return this.f7605CJ.superIsChangingConfigurations();
    }

    public final boolean isChild() {
        return this.f7606CS.isChild();
    }

    public boolean isDestroyed() {
        return this.f7605CJ.superIsDestroyed();
    }

    public boolean isFinishing() {
        return this.f7605CJ.superIsFinishing();
    }

    public boolean isImmersive() {
        return this.f7605CJ.superIsImmersive();
    }

    public boolean isTaskRoot() {
        return this.f7605CJ.superIsTaskRoot();
    }

    public boolean isVoiceInteraction() {
        return this.f7605CJ.superIsVoiceInteraction();
    }

    public boolean isVoiceInteractionRoot() {
        return this.f7605CJ.superIsVoiceInteractionRoot();
    }

    public final Cursor managedQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f7606CS.managedQuery(uri, strArr, str, strArr2, str2);
    }

    public boolean moveTaskToBack(boolean z) {
        return this.f7605CJ.superMoveTaskToBack(z);
    }

    public boolean navigateUpTo(Intent intent) {
        return this.f7605CJ.superNavigateUpTo(intent);
    }

    public boolean navigateUpToFromChild(Activity activity, Intent intent) {
        return this.f7605CJ.superNavigateUpToFromChild(activity, intent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f7605CJ.superOnActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f7605CJ.superOnActionModeStarted(actionMode);
    }

    public void onActivityReenter(int i, Intent intent) {
        this.f7605CJ.superOnActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f7605CJ.superOnActivityResult(i, i2, intent);
    }

    public void onAttachedToWindow() {
        this.f7605CJ.superOnAttachedToWindow();
    }

    public void onBackPressed() {
        this.f7605CJ.superOnBackPressed();
    }

    public void onBackgroundVisibleBehindChanged(boolean z) {
        this.f7605CJ.superOnBackgroundVisibleBehindChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onChildTitleChanged(Activity activity, CharSequence charSequence) {
        this.f7605CJ.superOnChildTitleChanged(activity, charSequence);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f7605CJ.superOnConfigurationChanged(configuration);
    }

    public void onContentChanged() {
        this.f7605CJ.superOnContentChanged();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.f7605CJ.superOnContextItemSelected(menuItem);
    }

    public void onContextMenuClosed(Menu menu) {
        this.f7605CJ.superOnContextMenuClosed(menu);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f7605CJ.superOnCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f7605CJ.superOnCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public CharSequence onCreateDescription() {
        return this.f7605CJ.superOnCreateDescription();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return this.f7605CJ.superOnCreateDialog(i);
    }

    public void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        this.f7605CJ.superOnCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f7605CJ.superOnCreateOptionsMenu(menu);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f7605CJ.superOnCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f7605CJ.superOnCreatePanelView(i);
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return this.f7605CJ.superOnCreateThumbnail(bitmap, canvas);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f7605CJ.superOnCreateView(view, str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f7605CJ.superOnDestroy();
    }

    public void onDetachedFromWindow() {
        this.f7605CJ.superOnDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        this.f7605CJ.superOnEnterAnimationComplete();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7605CJ.superOnGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f7605CJ.superOnKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f7605CJ.superOnKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.f7605CJ.superOnKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return this.f7605CJ.superOnKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f7605CJ.superOnKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        this.f7605CJ.superOnLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f7605CJ.superOnMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f7605CJ.superOnMenuOpened(i, menu);
    }

    public boolean onNavigateUp() {
        return this.f7605CJ.superOnNavigateUp();
    }

    public boolean onNavigateUpFromChild(Activity activity) {
        return this.f7605CJ.superOnNavigateUpFromChild(activity);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.f7605CJ.superOnNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f7605CJ.superOnOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        this.f7605CJ.superOnOptionsMenuClosed(menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f7605CJ.superOnPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f7605CJ.superOnPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        this.f7605CJ.superOnPostCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        this.f7605CJ.superOnPostResume();
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        this.f7605CJ.superOnPrepareDialog(i, dialog);
    }

    public void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        this.f7605CJ.superOnPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f7605CJ.superOnPrepareOptionsMenu(menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f7605CJ.superOnPreparePanel(i, view, menu);
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        this.f7605CJ.superOnProvideAssistContent(assistContent);
    }

    public void onProvideAssistData(Bundle bundle) {
        this.f7605CJ.superOnProvideAssistData(bundle);
    }

    public Uri onProvideReferrer() {
        return this.f7605CJ.superOnProvideReferrer();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f7605CJ.superOnRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        this.f7605CJ.superOnRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        this.f7605CJ.superOnRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f7605CJ.superOnResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f7605CJ.superOnSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        return this.f7605CJ.superOnSearchRequested();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f7605CJ.superOnStart();
    }

    public void onStateNotSaved() {
        this.f7605CJ.superOnStateNotSaved();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f7605CJ.superOnStop();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        this.f7605CJ.superOnTitleChanged(charSequence, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7605CJ.superOnTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return this.f7605CJ.superOnTrackballEvent(motionEvent);
    }

    public void onTrimMemory(int i) {
        this.f7605CJ.superOnTrimMemory(i);
    }

    public void onUserInteraction() {
        this.f7605CJ.superOnUserInteraction();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        this.f7605CJ.superOnUserLeaveHint();
    }

    public void onVisibleBehindCanceled() {
        this.f7605CJ.superOnVisibleBehindCanceled();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7605CJ.superOnWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f7605CJ.superOnWindowFocusChanged(z);
    }

    public void openContextMenu(View view) {
        this.f7605CJ.superOpenContextMenu(view);
    }

    public void openOptionsMenu() {
        this.f7605CJ.superOpenOptionsMenu();
    }

    public void overridePendingTransition(int i, int i2) {
        this.f7605CJ.superOverridePendingTransition(i, i2);
    }

    public void postponeEnterTransition() {
        this.f7605CJ.superPostponeEnterTransition();
    }

    public void publicOnActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public void publicOnChildTitleChanged(Activity activity, CharSequence charSequence) {
        onChildTitleChanged(activity, charSequence);
    }

    public void publicOnCreate(Bundle bundle) {
        onCreate(bundle);
    }

    public Dialog publicOnCreateDialog(int i) {
        return onCreateDialog(i);
    }

    public void publicOnDestroy() {
        onDestroy();
    }

    public void publicOnNewIntent(Intent intent) {
        onNewIntent(intent);
    }

    public void publicOnPause() {
        onPause();
    }

    public void publicOnPostCreate(Bundle bundle) {
        onPostCreate(bundle);
    }

    public void publicOnPostResume() {
        onPostResume();
    }

    public void publicOnPrepareDialog(int i, Dialog dialog) {
        onPrepareDialog(i, dialog);
    }

    public void publicOnRestart() {
        onRestart();
    }

    public void publicOnRestoreInstanceState(Bundle bundle) {
        onRestoreInstanceState(bundle);
    }

    public void publicOnResume() {
        onResume();
    }

    public void publicOnSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void publicOnStart() {
        onStart();
    }

    public void publicOnStop() {
        onStop();
    }

    public void publicOnTitleChanged(CharSequence charSequence, int i) {
        onTitleChanged(charSequence, i);
    }

    public void publicOnUserLeaveHint() {
        onUserLeaveHint();
    }

    public void recreate() {
        this.f7605CJ.superRecreate();
    }

    public void registerForContextMenu(View view) {
        this.f7605CJ.superRegisterForContextMenu(view);
    }

    public boolean releaseInstance() {
        return this.f7605CJ.superReleaseInstance();
    }

    public final void removeDialog(int i) {
        this.f7606CS.removeDialog(i);
    }

    public void reportFullyDrawn() {
        this.f7605CJ.superReportFullyDrawn();
    }

    public final void requestPermissions(String[] strArr, int i) {
        this.f7606CS.requestPermissions(strArr, i);
    }

    public boolean requestVisibleBehind(boolean z) {
        return this.f7605CJ.superRequestVisibleBehind(z);
    }

    public final boolean requestWindowFeature(int i) {
        return this.f7606CS.requestWindowFeature(i);
    }

    public final void runOnUiThread(Runnable runnable) {
        this.f7606CS.runOnUiThread(runnable);
    }

    public void setContentTransitionManager(TransitionManager transitionManager) {
        this.f7605CJ.superSetContentTransitionManager(transitionManager);
    }

    public void setContentView(int i) {
        this.f7605CJ.superSetContentView(i);
    }

    public final void setDefaultKeyMode(int i) {
        this.f7606CS.setDefaultKeyMode(i);
    }

    public final void setFeatureDrawable(int i, Drawable drawable) {
        this.f7606CS.setFeatureDrawable(i, drawable);
    }

    public final void setFeatureDrawableAlpha(int i, int i2) {
        this.f7606CS.setFeatureDrawableAlpha(i, i2);
    }

    public final void setFeatureDrawableResource(int i, int i2) {
        this.f7606CS.setFeatureDrawableResource(i, i2);
    }

    public final void setFeatureDrawableUri(int i, Uri uri) {
        this.f7606CS.setFeatureDrawableUri(i, uri);
    }

    public void setFinishOnTouchOutside(boolean z) {
        this.f7605CJ.superSetFinishOnTouchOutside(z);
    }

    public void setImmersive(boolean z) {
        this.f7605CJ.superSetImmersive(z);
    }

    public void setIntent(Intent intent) {
        this.f7605CJ.superSetIntent(intent);
    }

    public final void setMediaController(MediaController mediaController) {
        this.f7606CS.setMediaController(mediaController);
    }

    public final void setProgress(int i) {
        this.f7606CS.setProgress(i);
    }

    public final void setProgressBarIndeterminate(boolean z) {
        this.f7606CS.setProgressBarIndeterminate(z);
    }

    public final void setProgressBarIndeterminateVisibility(boolean z) {
        this.f7606CS.setProgressBarIndeterminateVisibility(z);
    }

    public final void setProgressBarVisibility(boolean z) {
        this.f7606CS.setProgressBarVisibility(z);
    }

    public void setProxy(Activity activity, Context context) {
        this.f7606CS = activity;
        this.f7605CJ = (ProxyCallbacks) activity;
        attachBaseContext(context);
    }

    public void setRequestedOrientation(int i) {
        this.f7605CJ.superSetRequestedOrientation(i);
    }

    public final void setResult(int i) {
        this.f7606CS.setResult(i);
    }

    public final void setSecondaryProgress(int i) {
        this.f7606CS.setSecondaryProgress(i);
    }

    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        this.f7605CJ.superSetTaskDescription(taskDescription);
    }

    public void setTitle(int i) {
        this.f7605CJ.superSetTitle(i);
    }

    public void setTitleColor(int i) {
        this.f7605CJ.superSetTitleColor(i);
    }

    public void setVisible(boolean z) {
        this.f7605CJ.superSetVisible(z);
    }

    public final void setVolumeControlStream(int i) {
        this.f7606CS.setVolumeControlStream(i);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return this.f7605CJ.superShouldShowRequestPermissionRationale(str);
    }

    public boolean shouldUpRecreateTask(Intent intent) {
        return this.f7605CJ.superShouldUpRecreateTask(intent);
    }

    public boolean showAssist(Bundle bundle) {
        return this.f7605CJ.superShowAssist(bundle);
    }

    public final void showDialog(int i) {
        this.f7606CS.showDialog(i);
    }

    public void showLockTaskEscapeMessage() {
        this.f7605CJ.superShowLockTaskEscapeMessage();
    }

    public void startActivities(Intent[] intentArr) {
        this.f7605CJ.superStartActivities(intentArr);
    }

    public void startActivity(Intent intent) {
        this.f7605CJ.superStartActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.f7605CJ.superStartActivityForResult(intent, i);
    }

    public void startActivityFromChild(Activity activity, Intent intent, int i) {
        this.f7605CJ.superStartActivityFromChild(activity, intent, i);
    }

    public boolean startActivityIfNeeded(Intent intent, int i) {
        return this.f7605CJ.superStartActivityIfNeeded(intent, i);
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        this.f7605CJ.superStartIntentSender(intentSender, intent, i, i2, i3);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.f7605CJ.superStartIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.f7605CJ.superStartIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public void startLockTask() {
        this.f7605CJ.superStartLockTask();
    }

    public void startManagingCursor(Cursor cursor) {
        this.f7605CJ.superStartManagingCursor(cursor);
    }

    public boolean startNextMatchingActivity(Intent intent) {
        return this.f7605CJ.superStartNextMatchingActivity(intent);
    }

    public void startPostponedEnterTransition() {
        this.f7605CJ.superStartPostponedEnterTransition();
    }

    public void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        this.f7605CJ.superStartSearch(str, z, bundle, z2);
    }

    public void stopLockTask() {
        this.f7605CJ.superStopLockTask();
    }

    public void stopManagingCursor(Cursor cursor) {
        this.f7605CJ.superStopManagingCursor(cursor);
    }

    public void takeKeyEvents(boolean z) {
        this.f7605CJ.superTakeKeyEvents(z);
    }

    public void triggerSearch(String str, Bundle bundle) {
        this.f7605CJ.superTriggerSearch(str, bundle);
    }

    public void unregisterForContextMenu(View view) {
        this.f7605CJ.superUnregisterForContextMenu(view);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        this.f7605CJ.superOnCreate(bundle, persistableBundle);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        return this.f7605CJ.superOnCreateDialog(i, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.f7605CJ.superOnCreateView(str, context, attributeSet);
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        this.f7605CJ.superOnPostCreate(bundle, persistableBundle);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        this.f7605CJ.superOnPrepareDialog(i, dialog, bundle);
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        this.f7605CJ.superOnRestoreInstanceState(bundle, persistableBundle);
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        this.f7605CJ.superOnSaveInstanceState(bundle, persistableBundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f7605CJ.superOnSearchRequested(searchEvent);
    }

    public Dialog publicOnCreateDialog(int i, Bundle bundle) {
        return onCreateDialog(i, bundle);
    }

    public void publicOnPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        onPrepareDialog(i, dialog, bundle);
    }

    public void setContentView(View view) {
        this.f7605CJ.superSetContentView(view);
    }

    public final void setResult(int i, Intent intent) {
        this.f7606CS.setResult(i, intent);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7605CJ.superSetTitle(charSequence);
    }

    public final boolean showDialog(int i, Bundle bundle) {
        return this.f7606CS.showDialog(i, bundle);
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        this.f7605CJ.superStartActivities(intentArr, bundle);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.f7605CJ.superStartActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.f7605CJ.superStartActivityForResult(intent, i, bundle);
    }

    public void startActivityFromChild(Activity activity, Intent intent, int i, Bundle bundle) {
        this.f7605CJ.superStartActivityFromChild(activity, intent, i, bundle);
    }

    public boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return this.f7605CJ.superStartActivityIfNeeded(intent, i, bundle);
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        this.f7605CJ.superStartIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f7605CJ.superStartIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f7605CJ.superStartIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        return this.f7605CJ.superStartNextMatchingActivity(intent, bundle);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f7605CJ.superSetContentView(view, layoutParams);
    }
}
