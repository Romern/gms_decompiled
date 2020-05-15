package p000;

import android.app.AlertDialog;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;
import java.util.Locale;

/* renamed from: azlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azlk extends azjx {

    /* renamed from: b */
    public azlj f99587b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54978a(AlertDialog.Builder builder) {
        builder.setPositiveButton(getArguments().getString("positive_button_string").toUpperCase(Locale.getDefault()), new azlh(this));
        if (cfeo.m138865V()) {
            builder.setNegativeButton(getArguments().getString("negative_button_string").toUpperCase(Locale.getDefault()), new azli(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54982b(TextView textView) {
        String string = getArguments().getString("app_name");
        String string2 = getArguments().getString("sender_name");
        String string3 = getArguments().getString("onboarding_message");
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string3)) {
            textView.setText(URLSpanNoUnderline.m22736a((Spannable) Html.fromHtml(azov.m85980a(string3, bnhe.m109409a("senderName", string2, "productName", string)))));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof azlj) {
            this.f99587b = (azlj) activity;
            return;
        }
        azoj.m85933c("OnboardingDialogFragment", "%s must implement Listener", activity);
    }

    public final void onDetach() {
        super.onDetach();
        this.f99587b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54979a(ImageView imageView) {
        this.f99587b.mo55018a(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54980a(TextView textView) {
        textView.setText(getString(C0126R.string.new_message_from_sender, getArguments().getString("sender_name")));
    }
}
