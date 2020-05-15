package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;

/* renamed from: asbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbb extends DialogFragment {

    /* renamed from: e */
    private static final Boolean f88639e = false;

    /* renamed from: a */
    public asba f88640a;

    /* renamed from: b */
    public String f88641b;

    /* renamed from: c */
    public String f88642c;

    /* renamed from: d */
    public boolean f88643d;

    /* renamed from: a */
    public static asbb m73747a(String str, boolean z) {
        bmxy.m108581a(str);
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.ssid", str);
        bundle.putBoolean("failure", z);
        asbb asbb = new asbb();
        asbb.setArguments(bundle);
        return asbb;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            try {
                this.f88640a = (asba) parentFragment;
            } catch (ClassCastException e) {
                throw new RuntimeException("Containing fragment must implement WifiPasswordFragment.Listener", e);
            }
        } else {
            Activity activity2 = getActivity();
            if (activity2 != null) {
                try {
                    this.f88640a = (asba) activity2;
                } catch (ClassCastException e2) {
                    throw new RuntimeException("Containing activity must implement WifiPasswordFragment.Listener", e2);
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        String string = arguments.getString("smartdevice.ssid");
        bmxy.m108581a(string);
        this.f88641b = string;
        arguments.getBoolean("failure", false);
        this.f88642c = "";
        if (bundle != null) {
            this.f88643d = bundle.getBoolean("smartdevice.WifiPasswordFragment.showPassword", f88639e.booleanValue());
            this.f88642c = bundle.getString("smartdevice.wifiPassword", this.f88642c);
        }
        Activity activity = getActivity();
        if (activity != null) {
            View inflate = activity.getLayoutInflater().inflate((int) C0126R.C0128layout.smartdevice_wifi_password_fragment, (ViewGroup) null);
            AlertDialog create = new AlertDialog.Builder(activity).setTitle(this.f88641b).setView(inflate).setPositiveButton((int) C0126R.string.common_continue, new asaw(this)).setNegativeButton((int) C0126R.string.common_cancel, new asau()).create();
            create.setOnShowListener(new asax(this, create));
            EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.password_edittext);
            editText.requestFocus();
            editText.setText(this.f88642c);
            editText.addTextChangedListener(new asay(this, create));
            CheckBox checkBox = (CheckBox) inflate.findViewById(C0126R.C0129id.checkbox_meat);
            checkBox.setChecked(this.f88643d);
            checkBox.setOnCheckedChangeListener(new asaz(this));
            return create;
        }
        throw new IllegalStateException("null activity");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("smartdevice.wifiPassword", this.f88642c);
        bundle.putBoolean("smartdevice.WifiPasswordFragment.showPassword", this.f88643d);
    }

    /* renamed from: a */
    public final void mo9306a() {
        Dialog dialog = getDialog();
        bmxy.m108581a(dialog);
        ((EditText) dialog.findViewById(C0126R.C0129id.password_edittext)).setTransformationMethod(!this.f88643d ? new PasswordTransformationMethod() : new SingleLineTransformationMethod());
    }

    /* renamed from: a */
    public final void mo49019a(AlertDialog alertDialog) {
        alertDialog.getButton(-1).setEnabled(this.f88642c.length() >= 8);
    }
}
