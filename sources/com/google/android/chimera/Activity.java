package com.google.android.chimera;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.google.android.chimera.ActivityBase;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Activity extends ActivityBase {
    public static final int DEFAULT_KEYS_DIALER = 1;
    public static final int DEFAULT_KEYS_DISABLE = 0;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
    public static final int DEFAULT_KEYS_SHORTCUT = 2;
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_FIRST_USER = 1;
    public static final int RESULT_OK = -1;

    /* renamed from: CI */
    private ProxyCallbacks f7601CI;

    /* renamed from: CP */
    private C1021gj f7602CP;

    /* renamed from: CQ */
    private FragmentManager f7603CQ;

    /* renamed from: CR */
    private LoaderManager f7604CR;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks extends ActivityBase.ProxyCallbacks {
        Activity getModuleActivity();

        Object superGetLastCustomNonConfigurationInstance();

        C1050hj superGetSupportFragmentManager();

        C1087iq superGetSupportLoaderManager();

        void superOnAttachFragment(C1018gh ghVar);

        boolean superOnPrepareOptionsPanel(View view, Menu menu);

        void superOnResumeFragments();

        Object superOnRetainCustomNonConfigurationInstance();

        void superStartActivityFromFragment(C1018gh ghVar, Intent intent, int i);

        void superSupportFinishAfterTransition();

        void superSupportInvalidateOptionsMenu();

        void superSupportPostponeEnterTransition();

        void superSupportStartPostponedEnterTransition();
    }

    @ChimeraApiVersion(added = 0, removed = 108)
    @Deprecated
    public FragmentManager getFragmentManager() {
        if (!dfq.m8314a().mo8871j()) {
            return getSupportFragmentManager();
        }
        throw new UnsupportedOperationException("getFragmentManager is removed");
    }

    public Object getLastCustomNonConfigurationInstance() {
        return this.f7601CI.superGetLastCustomNonConfigurationInstance();
    }

    @ChimeraApiVersion(added = 0, removed = 108)
    @Deprecated
    public LoaderManager getLoaderManager() {
        if (!dfq.m8314a().mo8871j()) {
            return getSupportLoaderManager();
        }
        throw new UnsupportedOperationException("getLoaderManager is removed");
    }

    public FragmentManager getSupportFragmentManager() {
        return this.f7603CQ;
    }

    public LoaderManager getSupportLoaderManager() {
        if (this.f7604CR == null) {
            this.f7604CR = LoaderManager.get(this.f7601CI.superGetSupportLoaderManager());
        }
        return this.f7604CR;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onAttachFragment(Fragment fragment) {
        this.f7601CI.superOnAttachFragment(fragment.getSupportContainerFragment());
    }

    /* access modifiers changed from: protected */
    public void onChildTitleChanged(android.app.Activity activity, CharSequence charSequence) {
        super.onChildTitleChanged(activity, charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return super.onCreateDialog(i);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return this.f7601CI.superOnPrepareOptionsPanel(view, menu);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.f7601CI.superOnResumeFragments();
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return this.f7601CI.superOnRetainCustomNonConfigurationInstance();
    }

    public final Object onRetainNonConfigurationInstance() {
        return this.f7602CP.onRetainNonConfigurationInstance();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    public boolean publicOnPrepareOptionsPanel(View view, Menu menu) {
        return onPrepareOptionsPanel(view, menu);
    }

    public void publicOnResumeFragments() {
        onResumeFragments();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.chimera.ActivityBase.setProxy(android.app.Activity, android.content.Context):void
     arg types: [gj, android.content.Context]
     candidates:
      com.google.android.chimera.Activity.setProxy(gj, android.content.Context):void
      com.google.android.chimera.ActivityBase.setProxy(android.app.Activity, android.content.Context):void */
    public void setProxy(C1021gj gjVar, Context context) {
        this.f7602CP = gjVar;
        this.f7601CI = (ProxyCallbacks) gjVar;
        super.setProxy((android.app.Activity) gjVar, context);
        this.f7603CQ = FragmentManager.get(this.f7601CI.superGetSupportFragmentManager());
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        this.f7601CI.superStartActivityFromFragment(fragment.getSupportContainerFragment(), intent, i);
    }

    public void supportFinishAfterTransition() {
        this.f7601CI.superSupportFinishAfterTransition();
    }

    public void supportInvalidateOptionsMenu() {
        this.f7601CI.superSupportInvalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        this.f7601CI.superSupportPostponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        this.f7601CI.superSupportStartPostponedEnterTransition();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        return super.onCreateDialog(i, bundle);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        super.onPrepareDialog(i, dialog, bundle);
    }
}
