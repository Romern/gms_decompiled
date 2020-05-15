package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: avig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avig extends avhq {

    /* renamed from: c */
    public static final /* synthetic */ int f93226c = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo51236a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.udc_loading_fragment, viewGroup, false);
        avhq.m78520a(inflate, C0126R.C0129id.text, getArguments().getString("UdcDialogMessage"));
        return inflate;
    }

    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage(arguments.getString("UdcDialogMessage"));
        return progressDialog;
    }
}
