package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aatj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatj {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aatj.a(android.widget.EditText, java.lang.String, boolean):void
     arg types: [android.widget.EditText, java.lang.String, int]
     candidates:
      aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView
      aatj.a(android.view.View, int, android.view.View$OnClickListener):void
      aatj.a(android.widget.TextView, abbi, bzps):void
      aatj.a(android.widget.EditText, java.lang.String, boolean):void */
    /* renamed from: a */
    public static EditText m46977a(Context context, CompoundButton compoundButton) {
        EditText editText = new EditText(context);
        editText.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(compoundButton.getCompoundPaddingLeft(), 0, 0, 0);
        editText.setLayoutParams(layoutParams);
        m46982a(editText, compoundButton.getText().toString(), false);
        return editText;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      aatj.a(android.view.View, int, android.view.View$OnClickListener):void
      aatj.a(android.widget.EditText, java.lang.String, boolean):void
      aatj.a(android.widget.TextView, abbi, bzps):void
      aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView */
    /* renamed from: b */
    public static TextView m46987b(Context context, String str, boolean z) {
        String str2 = !z ? "" : " *";
        TextView a = m46978a(context, str2.length() == 0 ? new String(str) : str.concat(str2), true);
        m46984a(a, z);
        return a;
    }

    /* renamed from: a */
    public static TextView m46978a(Context context, String str, boolean z) {
        TextView textView = new TextView(context);
        textView.setText(Html.fromHtml(str));
        if (z) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return textView;
    }

    /* renamed from: a */
    public static void m46979a(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: a */
    public static void m46980a(View view, int i) {
        view.announceForAccessibility(view.getResources().getString(i));
    }

    /* renamed from: a */
    public static void m46981a(View view, int i, View.OnClickListener onClickListener) {
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.gh_error_icon);
        if (imageView != null) {
            aayh.m47249a(imageView, view.getContext(), aayi.m47263a(view.getContext(), C0126R.attr.gh_primaryRedColor));
        }
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.gh_error_status_subtext);
        if (textView != null) {
            textView.setText(i);
        }
        Button button = (Button) view.findViewById(C0126R.C0129id.gh_error_request_again_button);
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    public static void m46982a(EditText editText, String str, boolean z) {
        Context context = editText.getContext();
        String obj = Html.fromHtml(stm.m36299a(str)).toString();
        if (z) {
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(context.getString(C0126R.string.gh_required_announce_suffix));
            obj = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        editText.setContentDescription(obj);
    }

    /* renamed from: a */
    public static void m46983a(TextView textView, abbi abbi, bzps bzps) {
        Resources resources = abbi.getResources();
        String string = resources.getString(C0126R.string.common_system_info_composed_string);
        String string2 = resources.getString(C0126R.string.common_privacy_policy_composed_string);
        String string3 = resources.getString(C0126R.string.common_terms_of_service_composed_string);
        Spannable a = URLSpanNoUnderline.m22736a(Html.fromHtml(resources.getString(C0126R.string.gh_application_info_privacy_policy_message, string, string2, string3)));
        HelpConfig helpConfig = abbi.f56986y;
        if (helpConfig != null) {
            aayh.m47247a(a, string, new aatg(abbi, helpConfig, bzps));
            aayh.m47247a(a, string2, new aath(helpConfig, new bebk(), abbi));
            aayh.m47247a(a, string3, new aati(abbi, helpConfig));
        }
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(a);
    }

    /* renamed from: a */
    public static void m46984a(TextView textView, boolean z) {
        if (z) {
            String valueOf = String.valueOf(textView.getText());
            String string = textView.getContext().getString(C0126R.string.gh_required_announce_suffix);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(string);
            textView.setContentDescription(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m46985a(Activity activity) {
        if ((activity.getApplicationContext().getResources().getConfiguration().screenLayout & 15) < 3) {
            activity.setRequestedOrientation(1);
        }
    }

    /* renamed from: a */
    public static boolean m46986a(Resources resources) {
        return resources.getBoolean(C0126R.bool.gh_is_right_to_left);
    }
}
