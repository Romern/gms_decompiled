package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: akrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrx extends DialogFragment {

    /* renamed from: a */
    String f72540a = "";

    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.card_capture_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.card_capture_popup_message)).setText(Html.fromHtml(this.f72540a));
        C1349sg sgVar = new C1349sg(getActivity());
        sgVar.mo15907b(inflate);
        sgVar.mo15892a((int) C0126R.string.common_got_it, (DialogInterface.OnClickListener) null);
        return sgVar.mo15904b();
    }
}
