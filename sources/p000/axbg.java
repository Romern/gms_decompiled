package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: axbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbg extends bkbk {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.wallet_view_cvc_info_dialog, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(C0126R.C0129id.cvc_title)).setText(getArguments().getString("hintTitle"));
        ((TextView) inflate.findViewById(C0126R.C0129id.cvc_hint_body)).setText(getArguments().getString("hintText"));
        ((ImageWithCaptionView) inflate.findViewById(C0126R.C0129id.cvc_hint_image)).mo71992a((bmno) bjvp.m104730a(getArguments(), "hintImage", (bxxk) bmno.f130138m.mo74142c(7)), awia.m79973a(), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
        return new AlertDialog.Builder(getActivity()).setView(inflate).setPositiveButton((int) C0126R.string.close_button_label, (DialogInterface.OnClickListener) null).create();
    }
}
