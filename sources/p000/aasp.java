package p000;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aasp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasp {
    /* renamed from: a */
    public static View m46937a(HelpChimeraActivity helpChimeraActivity, aasm aasm, View.OnClickListener onClickListener, int i, boolean z) {
        View inflate = ((LayoutInflater) helpChimeraActivity.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
        if (!m46939a(inflate, aasm, helpChimeraActivity)) {
            return null;
        }
        m46938a(inflate, helpChimeraActivity, aasm, onClickListener, z);
        return inflate;
    }

    /* renamed from: a */
    public static void m46938a(View view, HelpChimeraActivity helpChimeraActivity, aasm aasm, View.OnClickListener onClickListener, boolean z) {
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.gh_help_content_line_item_title);
        Spanned fromHtml = Html.fromHtml(aasm.f56496f);
        textView.setText(fromHtml);
        if (aasm.mo31729l()) {
            ImageSpan imageSpan = new ImageSpan(view.getContext(), (int) C0126R.C0127drawable.quantum_ic_open_in_new_black_12, 1);
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) fromHtml).append((CharSequence) "  ");
            append.setSpan(imageSpan, fromHtml.length() + 1, fromHtml.length() + 2, 0);
            textView.setText(append);
        }
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.gh_help_content_line_item_snippet);
        textView2.setVisibility(8);
        if (z && !TextUtils.isEmpty(aasm.mo31735r())) {
            textView2.setText(Html.fromHtml(aasm.mo31735r()));
            textView2.setVisibility(0);
        }
        view.setOnClickListener(onClickListener);
        if (aasm.mo31723g()) {
            if (!aayi.m47270b()) {
                view.setBackgroundColor(helpChimeraActivity.getResources().getColor(17170443));
            }
            view.setEnabled(false);
        }
    }

    /* renamed from: a */
    public static boolean m46939a(View view, aasm aasm, HelpChimeraActivity helpChimeraActivity) {
        if (!new aasq(helpChimeraActivity).mo31746a(aasm)) {
            return false;
        }
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.gh_help_content_line_item_icon);
        boolean a = aaso.m46936a(imageView, aasm, helpChimeraActivity);
        if (aayi.m47270b()) {
            aayh.m47249a(imageView, helpChimeraActivity, aayi.m47270b() ? aayi.m47263a(helpChimeraActivity, C0126R.attr.gh_primaryBlueColor) : C1133kh.m17843b(helpChimeraActivity, C0126R.color.google_blue600));
        } else if (imageView.getDrawable() != null) {
            imageView.setImageDrawable(aaso.m46932a(helpChimeraActivity, imageView.getDrawable(), (int) C0126R.color.google_blue600));
        }
        return a;
    }
}
