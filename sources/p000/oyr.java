package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: oyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyr extends ozg {
    /* renamed from: a */
    public final bpeb mo22789a() {
        return bpeb.FRX_PRESETUP_ERROR;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ozg.a(com.google.android.chimera.Activity, android.view.LayoutInflater, android.view.ViewGroup, int, boolean):android.view.View
     arg types: [com.google.android.chimera.Activity, android.view.LayoutInflater, android.view.ViewGroup, ?, int]
     candidates:
      ozg.a(com.google.android.chimera.Activity, android.view.View, int, int, int):void
      ozg.a(com.google.android.chimera.Activity, android.view.LayoutInflater, android.view.ViewGroup, int, boolean):android.view.View */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        bmxy.m108582a(arguments, "Found no error data arguments");
        int i = arguments.getInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_TITLE");
        int i2 = arguments.getInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_MESSAGE");
        Activity activity = getActivity();
        sdo.m34959a(activity);
        View a = mo22801a(activity, layoutInflater, viewGroup, (int) C0126R.C0128layout.bottom_sheet_error, false);
        m30034a(activity, a, (int) C0126R.C0127drawable.error_white_illustration, i, i2);
        Button button = (Button) a.findViewById(C0126R.C0129id.bs_accept_button);
        button.setVisibility(0);
        button.setText(getString(C0126R.string.common_exit));
        button.setOnClickListener(new oyq(this));
        return a;
    }
}
