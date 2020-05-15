package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.DialogFragment;

/* renamed from: aold */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aold extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public aolc f78384a;

    /* renamed from: b */
    private String f78385b;

    /* renamed from: c */
    private String f78386c;

    /* renamed from: a */
    public static aold m65981a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("title", null);
        bundle.putString("message", str);
        aold aold = new aold();
        aold.setArguments(bundle);
        return aold;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aolc aolc = this.f78384a;
        if (aolc != null && i == -1) {
            aolc.mo42949c();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f78385b = arguments.getString("title");
        this.f78386c = arguments.getString("message");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019651));
        String str = this.f78385b;
        if (str != null) {
            builder.setTitle(str);
        }
        return builder.setMessage(this.f78386c).setPositiveButton(17039370, this).setNegativeButton(17039360, this).setCancelable(true).create();
    }
}
