package com.google.android.chimera;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p001v4.app.Fragment$SavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.chimera.Activity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DialogFragmentProxy extends C1010ga implements deg {

    /* renamed from: Y */
    private DialogFragment f7623Y;

    public DialogFragmentProxy() {
        this.f7623Y = null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getAllowEnterTransitionOverlap();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public boolean getAllowReturnTransitionOverlap() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getAllowReturnTransitionOverlap();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public Dialog getDialog() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getDialog();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getEnterTransition() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getEnterTransition();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getExitTransition() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getExitTransition();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getLayoutInflater(bundle);
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return super.getLayoutInflater(bundle);
    }

    public Activity getModuleActivity() {
        C1021gj activity = getActivity();
        if (activity != null) {
            return ((Activity.ProxyCallbacks) activity).getModuleActivity();
        }
        return null;
    }

    public DialogFragment getModuleFragment() {
        return this.f7623Y;
    }

    public Object getReenterTransition() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getReenterTransition();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getReturnTransition() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getReturnTransition();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getSharedElementEnterTransition() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getSharedElementEnterTransition();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getSharedElementReturnTransition() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getSharedElementReturnTransition();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public int getTheme() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getTheme();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return 0;
    }

    public View getView() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getView();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onActivityCreated(bundle);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onActivityResult(i, i2, intent);
        }
    }

    public void onAttach(android.app.Activity activity) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment == null) {
            Bundle arguments = super.getArguments();
            if (arguments == null) {
                Log.e("ChimeraDialogFragmentProxy", "Cannot instantiate implementation: fragment arguments is null");
            } else {
                String string = arguments.getString("_chimera_module_fragment_class_key");
                if (string == null) {
                    Log.e("ChimeraDialogFragmentProxy", "Cannot instantiate implementation: class name is missing");
                } else {
                    try {
                        Activity moduleActivity = getModuleActivity();
                        bmxy.m108581a(moduleActivity);
                        this.f7623Y = (DialogFragment) moduleActivity.getClassLoader().loadClass(string).newInstance();
                    } catch (ClassNotFoundException e) {
                        Log.e("ChimeraDialogFragmentProxy", string.length() == 0 ? new String("Can't find chimera fragment class: ") : "Can't find chimera fragment class: ".concat(string));
                    } catch (IllegalAccessException | InstantiationException e2) {
                        Log.e("ChimeraDialogFragmentProxy", "Failed to instantiate chimera fragment class", e2);
                    } catch (ClassCastException e3) {
                        StringBuilder sb = new StringBuilder(string.length() + 39);
                        sb.append("Class: ");
                        sb.append(string);
                        sb.append(" is not a chimera fragment class");
                        Log.e("ChimeraDialogFragmentProxy", sb.toString());
                    }
                    DialogFragment dialogFragment = this.f7623Y;
                    if (dialogFragment != null) {
                        dialogFragment.setImpl((C1010ga) this);
                        moduleFragment = this.f7623Y;
                    } else {
                        Log.e("ChimeraDialogFragmentProxy", string.length() == 0 ? new String("Cannot instantiate implementation: ") : "Cannot instantiate implementation: ".concat(string));
                    }
                }
            }
        }
        if (moduleFragment != null) {
            Activity moduleActivity2 = getModuleActivity();
            bmxy.m108581a(moduleActivity2);
            moduleFragment.onAttach(moduleActivity2);
            return;
        }
        super.onAttach(activity);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCancel(dialogInterface);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onConfigurationChanged(configuration);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onContextItemSelected(menuItem);
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public void onCreate(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCreate(bundle);
        } else {
            Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        int i3;
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            Animation onCreateAnimation = moduleFragment.onCreateAnimation(i, z, i2);
            if (!dfq.m8314a().mo8867f() || onCreateAnimation != null) {
                return onCreateAnimation;
            }
            if (i2 != 0) {
                return null;
            }
            if (i == 4097) {
                i3 = !z ? R$anim.chimera_fragment_open_exit : R$anim.chimera_fragment_open_enter;
            } else if (i == 4099) {
                i3 = !z ? R$anim.chimera_fragment_fade_exit : R$anim.chimera_fragment_fade_enter;
            } else if (i != 8194) {
                return null;
            } else {
                i3 = !z ? R$anim.chimera_fragment_close_exit : R$anim.chimera_fragment_close_enter;
            }
            return AnimationUtils.loadAnimation(getActivity().getApplicationContext(), i3);
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onCreateDialog(bundle);
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return super.onCreateDialog(bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onCreateView(layoutInflater, viewGroup, bundle);
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public void onDestroy() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDestroy();
        }
    }

    public void onDestroyOptionsMenu() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDestroyOptionsMenu();
        }
    }

    public void onDestroyView() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDestroyView();
        }
    }

    public void onDetach() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDetach();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDismiss(dialogInterface);
        }
    }

    public void onHiddenChanged(boolean z) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onHiddenChanged(z);
        }
    }

    public void onInflate(android.app.Activity activity, AttributeSet attributeSet, Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onInflate(((Activity.ProxyCallbacks) activity).getModuleActivity(), attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onLowMemory();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onOptionsItemSelected(menuItem);
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onOptionsMenuClosed(menu);
        }
    }

    public void onPause() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onPause();
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onPrepareOptionsMenu(menu);
        }
    }

    public void onResume() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onStart();
        }
    }

    public void onStop() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onStop();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onViewCreated(view, bundle);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onViewStateRestored(bundle);
        }
    }

    public void setArguments(Bundle bundle) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.setArguments(bundle);
        } else {
            super.setArguments(bundle);
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.setupDialog(dialog, i);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.startActivityForResult(intent, i);
        }
    }

    public void superDismiss() {
        super.dismiss();
    }

    public void superDismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
    }

    public void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public boolean superGetAllowEnterTransitionOverlap() {
        return super.getAllowEnterTransitionOverlap();
    }

    public boolean superGetAllowReturnTransitionOverlap() {
        return super.getAllowReturnTransitionOverlap();
    }

    public Bundle superGetArguments() {
        Bundle arguments = super.getArguments();
        if (arguments == null) {
            return null;
        }
        Bundle bundle = arguments.getBundle("_chimera_module_fragment_arguments_key");
        if (bundle != null) {
            DialogFragment moduleFragment = getModuleFragment();
            bmxy.m108581a(moduleFragment);
            ClassLoader classLoader = moduleFragment.getClass().getClassLoader();
            bmxy.m108581a(classLoader);
            bundle.setClassLoader(classLoader);
        }
        return bundle;
    }

    public Dialog superGetDialog() {
        return super.getDialog();
    }

    public Object superGetEnterTransition() {
        return super.getEnterTransition();
    }

    public Object superGetExitTransition() {
        return super.getExitTransition();
    }

    public LayoutInflater superGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater = super.getLayoutInflater(bundle);
        Activity moduleActivity = getModuleActivity();
        bmxy.m108581a(moduleActivity);
        return layoutInflater.cloneInContext(moduleActivity);
    }

    public Object superGetReenterTransition() {
        return super.getReenterTransition();
    }

    public Object superGetReturnTransition() {
        return super.getReturnTransition();
    }

    public Object superGetSharedElementEnterTransition() {
        return super.getSharedElementEnterTransition();
    }

    public Object superGetSharedElementReturnTransition() {
        return super.getSharedElementReturnTransition();
    }

    public boolean superGetShowsDialog() {
        return super.getShowsDialog();
    }

    public int superGetTheme() {
        return super.getTheme();
    }

    public boolean superGetUserVisibleHint() {
        return super.getUserVisibleHint();
    }

    public View superGetView() {
        return super.getView();
    }

    public boolean superIsCancelable() {
        return super.isCancelable();
    }

    public void superOnActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void superOnActivityResult(int i, int i2, Intent intent) {
    }

    public void superOnAttach(Activity activity) {
        super.onAttach(activity.getContainerActivity());
    }

    public void superOnCancel(DialogInterface dialogInterface) {
    }

    public void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean superOnContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public void superOnCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public Animation superOnCreateAnimation(int i, boolean z, int i2) {
        return super.onCreateAnimation(i, z, i2);
    }

    public void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public Dialog superOnCreateDialog(Bundle bundle) {
        return super.onCreateDialog(bundle);
    }

    public void superOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View superOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void superOnDestroy() {
        super.onDestroy();
    }

    public void superOnDestroyOptionsMenu() {
    }

    public void superOnDestroyView() {
        super.onDestroyView();
    }

    public void superOnDetach() {
        super.onDetach();
    }

    public void superOnDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public void superOnHiddenChanged(boolean z) {
    }

    public void superOnInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity.getContainerActivity(), attributeSet, bundle);
    }

    public void superOnLowMemory() {
        super.onLowMemory();
    }

    public boolean superOnOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public void superOnOptionsMenuClosed(Menu menu) {
    }

    public void superOnPause() {
        super.onPause();
    }

    public void superOnPrepareOptionsMenu(Menu menu) {
    }

    public void superOnResume() {
        super.onResume();
    }

    public void superOnSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void superOnStart() {
        super.onStart();
    }

    public void superOnStop() {
        super.onStop();
    }

    public void superOnViewCreated(View view, Bundle bundle) {
    }

    public void superOnViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    public void superRegisterForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    public void superSetAllowEnterTransitionOverlap(boolean z) {
        super.setAllowEnterTransitionOverlap(z);
    }

    public void superSetAllowReturnTransitionOverlap(boolean z) {
        super.setAllowReturnTransitionOverlap(z);
    }

    public void superSetArguments(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        DialogFragment moduleFragment = getModuleFragment();
        bmxy.m108581a(moduleFragment);
        bundle2.putString("_chimera_module_fragment_class_key", moduleFragment.getClass().getName());
        if (bundle != null) {
            bundle2.putBundle("_chimera_module_fragment_arguments_key", bundle);
        }
        super.setArguments(bundle2);
    }

    public void superSetCancelable(boolean z) {
        super.setCancelable(z);
    }

    public void superSetEnterTransition(Object obj) {
        super.setEnterTransition(obj);
    }

    public void superSetExitTransition(Object obj) {
        super.setExitTransition(obj);
    }

    public void superSetHasOptionsMenu(boolean z) {
        super.setHasOptionsMenu(z);
    }

    public void superSetInitialSavedState(Fragment$SavedState fragment$SavedState) {
        super.setInitialSavedState(fragment$SavedState);
    }

    public void superSetMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
    }

    public void superSetReenterTransition(Object obj) {
        super.setReenterTransition(obj);
    }

    public void superSetRetainInstance(boolean z) {
        super.setRetainInstance(z);
    }

    public void superSetReturnTransition(Object obj) {
        super.setReturnTransition(obj);
    }

    public void superSetSharedElementEnterTransition(Object obj) {
        super.setSharedElementEnterTransition(obj);
    }

    public void superSetSharedElementReturnTransition(Object obj) {
        super.setSharedElementReturnTransition(obj);
    }

    public void superSetShowsDialog(boolean z) {
        super.setShowsDialog(z);
    }

    public void superSetStyle(int i, int i2) {
        super.setStyle(i, i2);
    }

    public void superSetUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public void superSetupDialog(Dialog dialog, int i) {
        super.setupDialog(dialog, i);
    }

    public int superShow(FragmentTransaction fragmentTransaction, String str) {
        return super.show(fragmentTransaction.getNativeFragmentTransaction(), str);
    }

    public void superShowNow(FragmentManager fragmentManager, String str) {
        super.showNow(fragmentManager.getNativeFragmentManager(), str);
    }

    public void superStartActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void superStartActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public String superToString() {
        return super.toString();
    }

    public void superUnregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }

    public String toString() {
        DialogFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.toString();
        }
        Log.e("ChimeraDialogFragmentProxy", "Provider proxy missing implementation");
        return "(null)";
    }

    public DialogFragmentProxy(DialogFragment dialogFragment) {
        this.f7623Y = dialogFragment;
        superSetArguments(null);
    }

    public void superShow(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager.getNativeFragmentManager(), str);
    }
}
