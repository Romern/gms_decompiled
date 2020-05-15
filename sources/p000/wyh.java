package p000;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyh extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        Drawable drawable;
        C1349sg sgVar = new C1349sg(getActivity());
        Activity activity = getActivity();
        View inflate = activity.getLayoutInflater().inflate((int) C0126R.C0128layout.gf_material2_thank_you_dialog, (ViewGroup) null);
        inflate.findViewById(C0126R.C0129id.gf_suggestion_cardview_container).setVisibility(0);
        View findViewById = inflate.findViewById(C0126R.C0129id.gf_suggestion_button_container);
        findViewById.setVisibility(0);
        if (aaya.m47229b(cdua.f181760a.mo6606a().mo78337b()) && (activity instanceof FeedbackChimeraActivity)) {
            findViewById.findViewById(C0126R.C0129id.gf_dismiss_thank_you).setOnClickListener(new wyf(activity));
            findViewById.findViewById(C0126R.C0129id.gf_read_more_thank_you).setOnClickListener(new wyg(activity));
        }
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.gf_article_title);
        textView.setText(getArguments().getString("help_response_title"));
        if (aaya.m47229b(cdua.f181760a.mo6606a().mo78338c())) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (compoundDrawables[0] != null) {
                if (aayi.m47270b()) {
                    drawable = aayh.m47257b(compoundDrawables[0], getContext(), aayi.m47263a(getContext(), C0126R.attr.gf_primaryBlueColor));
                } else {
                    drawable = aayh.m47231a(compoundDrawables[0], getResources());
                    aayh.m47245a(drawable, getContext(), (int) C0126R.color.google_blue600);
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        ((TextView) inflate.findViewById(C0126R.C0129id.gf_article_snippet)).setText(Html.fromHtml(getArguments().getString("help_response_snippet")));
        sgVar.mo15907b(inflate);
        return sgVar.mo15904b();
    }
}
