package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: wpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpu extends DialogFragment {

    /* renamed from: a */
    public String f51114a;

    /* renamed from: b */
    public wpt f51115b;

    /* renamed from: c */
    public View f51116c;

    /* renamed from: a */
    public static wpu m42156a(String str, String str2, String str3) {
        wpu wpu = new wpu();
        Bundle bundle = new Bundle(3);
        bundle.putString("accountName", str);
        bundle.putString("passwordTitle", str2);
        bundle.putString("pinTitle", str3);
        wpu.setArguments(bundle);
        return wpu;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51115b = (wpt) wgq.m41934a(wpt.class, getActivity());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f51114a = getArguments().getString("accountName");
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_reauth_dialog, viewGroup, false);
        this.f51116c = inflate;
        ((TextView) inflate.findViewById(C0126R.C0129id.fm_reauth_title)).setText(getArguments().getString("passwordTitle"));
        ((TextView) this.f51116c.findViewById(C0126R.C0129id.fm_reauth_label)).setText(this.f51114a);
        ((Button) this.f51116c.findViewById(C0126R.C0129id.fm_reauth_cancel)).setOnClickListener(new wpp(this));
        getActivity().getSupportLoaderManager().initLoader(this.f51115b.mo18495br(), null, new wps(this));
        return this.f51116c;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51115b = null;
    }

    /* renamed from: a */
    public final void mo29275a(boolean z) {
        TextView textView = (TextView) this.f51116c.findViewById(C0126R.C0129id.fm_reauth_title);
        EditText editText = (EditText) this.f51116c.findViewById(C0126R.C0129id.fm_reauth_password);
        if (z) {
            textView.setText(getArguments().getString("passwordTitle"));
            editText.setInputType(129);
        } else {
            textView.setText(getArguments().getString("pinTitle"));
            editText.setInputType(18);
        }
        editText.requestFocus();
        ((Button) this.f51116c.findViewById(C0126R.C0129id.fm_reauth_submit)).setOnClickListener(new wpq(this, z));
    }
}
