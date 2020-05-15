package com.google.android.chimera;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class DialogFragment extends Fragment {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;

    /* renamed from: CE */
    private C1010ga f7622CE = null;

    /* renamed from: a */
    private final deg mo9306a() {
        return (deg) getProxy();
    }

    public void dismiss() {
        mo9306a().superDismiss();
    }

    public void dismissAllowingStateLoss() {
        mo9306a().superDismissAllowingStateLoss();
    }

    public Object getContainerFragment() {
        return getProxy();
    }

    public Dialog getDialog() {
        return mo9306a().superGetDialog();
    }

    /* access modifiers changed from: protected */
    public C1010ga getProxy() {
        if (this.f7622CE == null) {
            setImpl((C1010ga) new DialogFragmentProxy(this));
        }
        return this.f7622CE;
    }

    public boolean getShowsDialog() {
        return mo9306a().superGetShowsDialog();
    }

    public C1010ga getSupportContainerFragment() {
        return getProxy();
    }

    public int getTheme() {
        return mo9306a().superGetTheme();
    }

    public boolean isCancelable() {
        return mo9306a().superIsCancelable();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo9306a().superOnCancel(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return mo9306a().superOnCreateDialog(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        mo9306a().superOnDismiss(dialogInterface);
    }

    public void setCancelable(boolean z) {
        mo9306a().superSetCancelable(z);
    }

    /* access modifiers changed from: protected */
    public final void setImpl(C1010ga gaVar) {
        super.setImpl((C1018gh) gaVar);
        this.f7622CE = gaVar;
    }

    public void setShowsDialog(boolean z) {
        mo9306a().superSetShowsDialog(z);
    }

    public void setStyle(int i, int i2) {
        mo9306a().superSetStyle(i, i2);
    }

    public void setTargetFragment(DialogFragment dialogFragment, int i) {
        getProxy().setTargetFragment((DialogFragmentProxy) dialogFragment.getContainerFragment(), i);
    }

    public void setupDialog(Dialog dialog, int i) {
        mo9306a().superSetupDialog(dialog, i);
    }

    public int show(FragmentTransaction fragmentTransaction, String str) {
        return mo9306a().superShow(fragmentTransaction, str);
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        mo9306a().superShowNow(fragmentManager, str);
    }

    public void show(FragmentManager fragmentManager, String str) {
        mo9306a().superShow(fragmentManager, str);
    }
}
