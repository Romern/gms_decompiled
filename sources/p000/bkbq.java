package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: bkbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkbq extends DialogFragment implements DialogInterface.OnShowListener {

    /* renamed from: c */
    public bkdb f123958c;

    /* renamed from: a */
    public static Bundle m105268a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("themeResourceId", i);
        return bundle;
    }

    /* renamed from: a */
    public abstract Dialog mo9306a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ContextThemeWrapper mo65815b() {
        return mo65814a((DialogInterface) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final LayoutInflater mo65816c() {
        return getActivity().getLayoutInflater().cloneInContext(mo65815b());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog a = mo9306a();
        a.setOnShowListener(this);
        return a;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f123958c != null && isAdded()) {
            this.f123958c.mo51905a(16, Bundle.EMPTY);
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        Button button;
        if (this.f123958c != null && isAdded()) {
            this.f123958c.mo51905a(15, Bundle.EMPTY);
        }
        TypedValue typedValue = new TypedValue();
        if (mo65814a(dialogInterface).getTheme().resolveAttribute(C0126R.attr.internalUicFormDialogButtonTextColor, typedValue, true)) {
            int i = typedValue.data;
            Button button2 = null;
            if (dialogInterface instanceof AlertDialog) {
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                button2 = alertDialog.getButton(-1);
                button = alertDialog.getButton(-2);
            } else if (dialogInterface instanceof C1350sh) {
                C1350sh shVar = (C1350sh) dialogInterface;
                button2 = shVar.mo15913a(-1);
                button = shVar.mo15913a(-2);
            } else {
                button = null;
            }
            if (button2 != null) {
                button2.setTextColor(i);
            }
            if (button != null) {
                button.setTextColor(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ContextThemeWrapper mo65814a(DialogInterface dialogInterface) {
        int i = getArguments().getInt("themeResourceId");
        if (i > 0) {
            Context activity = getActivity();
            if (activity == null && dialogInterface != null) {
                activity = ((Dialog) dialogInterface).getOwnerActivity();
            }
            return new ContextThemeWrapper(activity, i);
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Invalid theme resource id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
