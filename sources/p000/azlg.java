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

/* renamed from: azlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azlg extends azjx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54978a(AlertDialog.Builder builder) {
        builder.setNegativeButton(getString(C0126R.string.common_no_thanks).toUpperCase(Locale.getDefault()), new azlf(this)).setPositiveButton(getString(C0126R.string.common_install).toUpperCase(Locale.getDefault()), new azle(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54982b(TextView textView) {
        String string = getArguments().getString("app_name");
        String string2 = getArguments().getString("sender_name");
        String string3 = getArguments().getString("sender_number");
        String string4 = getArguments().getString("offboarding_message");
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string4)) {
            textView.setText(URLSpanNoUnderline.m22736a((Spannable) Html.fromHtml(azov.m85980a(string4, bnhe.m109410a("senderName", string2, "senderNumber", string3, "productName", string)))));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54979a(ImageView imageView) {
        mo9306a().mo55018a(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54980a(TextView textView) {
        textView.setText((int) C0126R.string.message_sent_text);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54981a(Activity activity) {
        if (!getArguments().getBoolean("from_sticky_ui_instance")) {
            activity.finish();
        }
    }
}
