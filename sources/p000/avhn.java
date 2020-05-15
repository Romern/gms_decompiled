package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: avhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avhn extends avhq implements DialogInterface.OnClickListener, View.OnClickListener {

    /* renamed from: c */
    private CharSequence f93183c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo51236a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.udc_alert_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        avhq.m78520a(inflate, C0126R.C0129id.header, arguments.getCharSequence("UdcDialogTitle"));
        avhq.m78520a(inflate, C0126R.C0129id.text, arguments.getCharSequence("UdcDialogMessage"));
        this.f93183c = TextUtils.concat(arguments.getCharSequence("UdcDialogTitle"), " ", arguments.getCharSequence("UdcDialogMessage"));
        if (arguments.getBoolean("UdcDialogShowRetry", false)) {
            Button button = (Button) inflate.findViewById(C0126R.C0129id.udc_retry_button);
            button.setVisibility(0);
            button.setOnClickListener(this);
        }
        return inflate;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        if (activity instanceof avhl) {
            ((avhl) activity).mo51234a();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.udc_alert_dialog_message, (ViewGroup) null);
        avhq.m78520a(inflate, C0126R.C0129id.udc_alert_message, arguments.getCharSequence("UdcDialogMessage"));
        AlertDialog.Builder view = new AlertDialog.Builder(getActivity()).setTitle(arguments.getCharSequence("UdcDialogTitle")).setView(inflate);
        if (arguments.containsKey("UdcDialogPositive")) {
            view.setPositiveButton(arguments.getCharSequence("UdcDialogPositive"), this);
        }
        if (arguments.containsKey("UdcDialogNegative")) {
            view.setNegativeButton(arguments.getCharSequence("UdcDialogNegative"), this);
        }
        return view.create();
    }

    public final void onResume() {
        super.onResume();
        avih.m78575a(getView(), this.f93183c);
    }

    public void onClick(View view) {
        Activity activity = getActivity();
        if (activity instanceof avhm) {
            ((avhm) activity).mo51235a();
        }
    }
}
