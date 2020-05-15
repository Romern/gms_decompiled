package com.google.android.chimera;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.app.Fragment$SavedState;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Fragment {

    /* renamed from: CF */
    private C1018gh f7624CF = null;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks {
        Activity getModuleActivity();

        Fragment getModuleFragment();

        void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean superGetAllowEnterTransitionOverlap();

        boolean superGetAllowReturnTransitionOverlap();

        Bundle superGetArguments();

        Object superGetEnterTransition();

        Object superGetExitTransition();

        LayoutInflater superGetLayoutInflater(Bundle bundle);

        Object superGetReenterTransition();

        Object superGetReturnTransition();

        Object superGetSharedElementEnterTransition();

        Object superGetSharedElementReturnTransition();

        boolean superGetUserVisibleHint();

        View superGetView();

        void superOnActivityCreated(Bundle bundle);

        void superOnActivityResult(int i, int i2, Intent intent);

        void superOnAttach(Activity activity);

        void superOnConfigurationChanged(Configuration configuration);

        boolean superOnContextItemSelected(MenuItem menuItem);

        void superOnCreate(Bundle bundle);

        Animation superOnCreateAnimation(int i, boolean z, int i2);

        void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

        void superOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

        View superOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

        void superOnDestroy();

        void superOnDestroyOptionsMenu();

        void superOnDestroyView();

        void superOnDetach();

        void superOnHiddenChanged(boolean z);

        void superOnInflate(Activity activity, AttributeSet attributeSet, Bundle bundle);

        void superOnLowMemory();

        boolean superOnOptionsItemSelected(MenuItem menuItem);

        void superOnOptionsMenuClosed(Menu menu);

        void superOnPause();

        void superOnPrepareOptionsMenu(Menu menu);

        void superOnResume();

        void superOnSaveInstanceState(Bundle bundle);

        void superOnStart();

        void superOnStop();

        void superOnViewCreated(View view, Bundle bundle);

        void superOnViewStateRestored(Bundle bundle);

        void superRegisterForContextMenu(View view);

        void superSetAllowEnterTransitionOverlap(boolean z);

        void superSetAllowReturnTransitionOverlap(boolean z);

        void superSetArguments(Bundle bundle);

        void superSetEnterTransition(Object obj);

        void superSetExitTransition(Object obj);

        void superSetHasOptionsMenu(boolean z);

        void superSetInitialSavedState(Fragment$SavedState fragment$SavedState);

        void superSetMenuVisibility(boolean z);

        void superSetReenterTransition(Object obj);

        void superSetRetainInstance(boolean z);

        void superSetReturnTransition(Object obj);

        void superSetSharedElementEnterTransition(Object obj);

        void superSetSharedElementReturnTransition(Object obj);

        void superSetUserVisibleHint(boolean z);

        void superStartActivity(Intent intent);

        void superStartActivityForResult(Intent intent, int i);

        void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

        String superToString();

        void superUnregisterForContextMenu(View view);
    }

    /* renamed from: bw */
    private final ProxyCallbacks m4855bw() {
        return (ProxyCallbacks) getProxy();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m4855bw().superDump(str, fileDescriptor, printWriter, strArr);
    }

    public Activity getActivity() {
        return m4855bw().getModuleActivity();
    }

    public boolean getAllowEnterTransitionOverlap() {
        return m4855bw().superGetAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return m4855bw().superGetAllowReturnTransitionOverlap();
    }

    public final Bundle getArguments() {
        return m4855bw().superGetArguments();
    }

    public final FragmentManager getChildFragmentManager() {
        return FragmentManager.get(getProxy().getChildFragmentManager());
    }

    public Object getContainerFragment() {
        return getProxy();
    }

    public Context getContext() {
        return getActivity();
    }

    public Object getEnterTransition() {
        return m4855bw().superGetEnterTransition();
    }

    public Object getExitTransition() {
        return m4855bw().superGetExitTransition();
    }

    public final FragmentManager getFragmentManager() {
        return FragmentManager.get(getProxy().getFragmentManager());
    }

    public final int getId() {
        return getProxy().getId();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        return m4855bw().superGetLayoutInflater(bundle);
    }

    public LoaderManager getLoaderManager() {
        return LoaderManager.get(getProxy().getLoaderManager());
    }

    public final Fragment getParentFragment() {
        ProxyCallbacks proxyCallbacks = (ProxyCallbacks) getProxy().getParentFragment();
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public C1018gh getProxy() {
        if (this.f7624CF == null) {
            setImpl(new FragmentProxy(this));
        }
        return this.f7624CF;
    }

    public Object getReenterTransition() {
        return m4855bw().superGetReenterTransition();
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        return activity.getResources();
    }

    public final boolean getRetainInstance() {
        return getProxy().getRetainInstance();
    }

    public Object getReturnTransition() {
        return m4855bw().superGetReturnTransition();
    }

    public Object getSharedElementEnterTransition() {
        return m4855bw().superGetSharedElementEnterTransition();
    }

    public Object getSharedElementReturnTransition() {
        return m4855bw().superGetSharedElementReturnTransition();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public C1018gh getSupportContainerFragment() {
        return getProxy();
    }

    public final String getTag() {
        return getProxy().getTag();
    }

    public Fragment getTargetFragment() {
        ProxyCallbacks proxyCallbacks = (ProxyCallbacks) getProxy().getTargetFragment();
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return getProxy().getTargetRequestCode();
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return m4855bw().superGetUserVisibleHint();
    }

    public View getView() {
        return m4855bw().superGetView();
    }

    public final boolean hasOptionsMenu() {
        return getProxy().hasOptionsMenu();
    }

    public final boolean isAdded() {
        return getProxy().isAdded();
    }

    public final boolean isDetached() {
        return getProxy().isDetached();
    }

    public final boolean isHidden() {
        return getProxy().isHidden();
    }

    public final boolean isInLayout() {
        return getProxy().isInLayout();
    }

    public final boolean isMenuVisible() {
        return getProxy().isMenuVisible();
    }

    public final boolean isRemoving() {
        return getProxy().isRemoving();
    }

    public final boolean isResumed() {
        return getProxy().isResumed();
    }

    public final boolean isVisible() {
        return getProxy().isVisible();
    }

    public void onActivityCreated(Bundle bundle) {
        m4855bw().superOnActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        m4855bw().superOnActivityResult(i, i2, intent);
    }

    public void onAttach(Activity activity) {
        m4855bw().superOnAttach(activity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        m4855bw().superOnConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return m4855bw().superOnContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        m4855bw().superOnCreate(bundle);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return m4855bw().superOnCreateAnimation(i, z, i2);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m4855bw().superOnCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        m4855bw().superOnCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return m4855bw().superOnCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        m4855bw().superOnDestroy();
    }

    public void onDestroyOptionsMenu() {
        m4855bw().superOnDestroyOptionsMenu();
    }

    public void onDestroyView() {
        m4855bw().superOnDestroyView();
    }

    public void onDetach() {
        m4855bw().superOnDetach();
    }

    public void onHiddenChanged(boolean z) {
        m4855bw().superOnHiddenChanged(z);
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        m4855bw().superOnInflate(activity, attributeSet, bundle);
    }

    public void onLowMemory() {
        m4855bw().superOnLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return m4855bw().superOnOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        m4855bw().superOnOptionsMenuClosed(menu);
    }

    public void onPause() {
        m4855bw().superOnPause();
    }

    public void onPrepareOptionsMenu(Menu menu) {
        m4855bw().superOnPrepareOptionsMenu(menu);
    }

    public void onResume() {
        m4855bw().superOnResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        m4855bw().superOnSaveInstanceState(bundle);
    }

    public void onStart() {
        m4855bw().superOnStart();
    }

    public void onStop() {
        m4855bw().superOnStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        m4855bw().superOnViewCreated(view, bundle);
    }

    public void onViewStateRestored(Bundle bundle) {
        m4855bw().superOnViewStateRestored(bundle);
    }

    public void registerForContextMenu(View view) {
        m4855bw().superRegisterForContextMenu(view);
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m4855bw().superSetAllowEnterTransitionOverlap(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m4855bw().superSetAllowReturnTransitionOverlap(z);
    }

    public void setArguments(Bundle bundle) {
        m4855bw().superSetArguments(bundle);
    }

    public void setEnterTransition(Object obj) {
        m4855bw().superSetEnterTransition(obj);
    }

    public void setExitTransition(Object obj) {
        m4855bw().superSetExitTransition(obj);
    }

    public void setHasOptionsMenu(boolean z) {
        m4855bw().superSetHasOptionsMenu(z);
    }

    /* access modifiers changed from: protected */
    public final void setImpl(C1018gh ghVar) {
        bmxy.m108600b(this.f7624CF == null);
        this.f7624CF = ghVar;
    }

    public void setInitialSavedState(SavedState savedState) {
        m4855bw().superSetInitialSavedState(savedState != null ? savedState.f7625a : null);
    }

    public void setMenuVisibility(boolean z) {
        m4855bw().superSetMenuVisibility(z);
    }

    public void setReenterTransition(Object obj) {
        m4855bw().superSetReenterTransition(obj);
    }

    public void setRetainInstance(boolean z) {
        m4855bw().superSetRetainInstance(z);
    }

    public void setReturnTransition(Object obj) {
        m4855bw().superSetReturnTransition(obj);
    }

    public void setSharedElementEnterTransition(Object obj) {
        m4855bw().superSetSharedElementEnterTransition(obj);
    }

    public void setSharedElementReturnTransition(Object obj) {
        m4855bw().superSetSharedElementReturnTransition(obj);
    }

    public void setTargetFragment(Fragment fragment, int i) {
        getProxy().setTargetFragment(fragment.getSupportContainerFragment(), i);
    }

    public void setUserVisibleHint(boolean z) {
        m4855bw().superSetUserVisibleHint(z);
    }

    public void startActivity(Intent intent) {
        m4855bw().superStartActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        m4855bw().superStartActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        m4855bw().superStartIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public String toString() {
        return m4855bw().superToString();
    }

    public void unregisterForContextMenu(View view) {
        m4855bw().superUnregisterForContextMenu(view);
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new deh();

        /* renamed from: a */
        public final Fragment$SavedState f7625a;

        public SavedState(Parcel parcel) {
            this.f7625a = (Fragment$SavedState) parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7625a, i);
        }

        public SavedState(Fragment$SavedState fragment$SavedState) {
            this.f7625a = fragment$SavedState;
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }
}
