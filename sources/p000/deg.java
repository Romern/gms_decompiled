package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: deg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface deg extends Fragment.ProxyCallbacks {
    void superDismiss();

    void superDismissAllowingStateLoss();

    Dialog superGetDialog();

    boolean superGetShowsDialog();

    int superGetTheme();

    boolean superIsCancelable();

    void superOnCancel(DialogInterface dialogInterface);

    Dialog superOnCreateDialog(Bundle bundle);

    void superOnDismiss(DialogInterface dialogInterface);

    void superSetCancelable(boolean z);

    void superSetShowsDialog(boolean z);

    void superSetStyle(int i, int i2);

    void superSetupDialog(Dialog dialog, int i);

    int superShow(FragmentTransaction fragmentTransaction, String str);

    void superShow(FragmentManager fragmentManager, String str);

    void superShowNow(FragmentManager fragmentManager, String str);
}
