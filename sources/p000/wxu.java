package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxu extends wwt implements TextWatcher {

    /* renamed from: a */
    private View f51553a;

    /* renamed from: b */
    private Intent f51554b;

    /* renamed from: a */
    public final ClickableSpan mo29552a(String str) {
        return new wxr(this, str);
    }

    public final void afterTextChanged(Editable editable) {
        if (getActivity() instanceof wws) {
            ((wws) getActivity()).mo18598a(editable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29555b(String str) {
        Activity activity = getActivity();
        if (!ssk.m36235a(activity)) {
            Toast.makeText(activity, activity.getString(C0126R.string.gh_network_request_failed), 0).show();
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        if (!spn.m35860a(activity, data)) {
            data.setClassName(activity, "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity");
            activity.startActivityForResult(data, 0);
            return;
        }
        activity.startActivity(data);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (getActivity() instanceof wws) {
            ((wws) getActivity()).mo18602b(i3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f51554b = (Intent) getArguments().getParcelable("extra_intent");
        if (!aayi.m47270b()) {
            i = C0126R.C0128layout.feedback_activity;
        } else {
            i = C0126R.C0128layout.gf_feedback_activity;
        }
        this.f51553a = layoutInflater.inflate(i, viewGroup, false);
        ((EditText) mo29553a((int) C0126R.C0129id.gf_issue_description)).addTextChangedListener(this);
        if (aaya.m47229b(cdup.f181780a.mo6606a().mo78353c())) {
            ((EditText) mo29553a((int) C0126R.C0129id.gf_issue_description)).setHint((int) C0126R.string.gf_enter_feedback_hint_not_support);
        }
        if (aaya.m47229b(cdup.f181780a.mo6606a().mo78351a())) {
            mo29553a((int) C0126R.C0129id.gf_screenshot_icon).setImportantForAccessibility(2);
            mo29553a((int) C0126R.C0129id.gf_system_info_icon).setImportantForAccessibility(2);
        }
        return this.f51553a;
    }

    public final void onResume() {
        super.onResume();
        EditText editText = (EditText) mo29553a((int) C0126R.C0129id.gf_issue_description);
        editText.post(new wxk(editText));
        if (getActivity() instanceof wws) {
            ((wws) getActivity()).mo18605c(this.f51554b);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: a */
    public final View mo29553a(int i) {
        return this.f51553a.findViewById(i);
    }

    /* renamed from: a */
    public final void mo29489a(Bitmap bitmap, boolean z) {
        TextView textView = (TextView) mo29553a((int) C0126R.C0129id.gf_edit_screenshot);
        ImageView imageView = (ImageView) mo29553a((int) C0126R.C0129id.gf_screenshot_icon);
        ((MaterialCardView) mo29553a((int) C0126R.C0129id.gf_include_screenshot_card)).setVisibility(0);
        ((ProgressBar) mo29553a((int) C0126R.C0129id.gf_progress_spinner)).setVisibility(8);
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        if (z) {
            textView.setVisibility(0);
            String string = getString(C0126R.string.gf_pii_sub_text);
            textView.setLinksClickable(true);
            Spannable a = URLSpanNoUnderline.m22736a(Html.fromHtml(string));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(a);
            CharSequence text = textView.getText();
            int indexOf = text.toString().indexOf(string);
            int length = string.length() + indexOf;
            if (indexOf != -1 && !string.isEmpty()) {
                wxp wxp = new wxp(this);
                if (text instanceof Spannable) {
                    ((Spannable) text).setSpan(wxp, indexOf, length, 33);
                } else {
                    SpannableString valueOf = SpannableString.valueOf(text);
                    valueOf.setSpan(wxp, indexOf, length, 33);
                    textView.setText(valueOf);
                }
                MovementMethod movementMethod = textView.getMovementMethod();
                if (movementMethod == null || !(movementMethod instanceof LinkMovementMethod)) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            }
            return;
        }
        textView.setVisibility(8);
    }
}
