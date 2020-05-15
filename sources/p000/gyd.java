package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.List;

/* renamed from: gyd */
final /* synthetic */ class gyd implements C0038ax {

    /* renamed from: a */
    private final gyl f19221a;

    public gyd(gyl gyl) {
        this.f19221a = gyl;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        String str;
        gyl gyl = this.f19221a;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) ((List) obj).get(0);
        boolean z = !TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10253f);
        if (z) {
            gyl.f19232d.setText(internalSignInCredentialWrapper.f10233g.f10248a);
            gyl.f19233e.setText(gyl.getString(C0126R.string.credentials_assisted_hidden_password));
            gyl.f19233e.setTypeface(Typeface.MONOSPACE);
        } else {
            gyl.f19232d.setText(internalSignInCredentialWrapper.f10233g.f10249b);
            gyl.f19233e.setText(internalSignInCredentialWrapper.f10232f.name);
            gyl.f19233e.setTypeface(Typeface.SANS_SERIF);
        }
        Context context = gyl.getContext();
        gyl.f19234f.mo60577a(hek.m14269a(context, internalSignInCredentialWrapper, gyl.f19230b.f19325n));
        String str2 = !TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10250c) ? internalSignInCredentialWrapper.f10233g.f10250c : internalSignInCredentialWrapper.f10233g.f10249b;
        if (TextUtils.isEmpty(str2)) {
            str = gyl.getString(C0126R.string.common_continue);
        } else {
            str = gyl.getString(C0126R.string.credentials_assisted_continue_as_user_button_label, str2);
        }
        if (!internalSignInCredentialWrapper.mo7477a()) {
            gyl.f19236h.setText(gyl.getString(C0126R.string.credentials_assisted_signin_or_create_account_title, gyl.f19240l));
            gyl.mo12330a(internalSignInCredentialWrapper);
            hba hba = gyl.f19230b.f19329r;
            bmxv bmxv = hba.f19394b;
            bmxv bmxv2 = hba.f19393a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            gyl.f19238j.setMovementMethod(new LinkMovementMethod());
            String string = gyl.getString(C0126R.string.common_privacy_policy_composed_string);
            String string2 = gyl.getString(C0126R.string.common_terms_of_service_composed_string);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            Context context2 = gyl.getContext();
            if (bmxv.mo66813a()) {
                adcm.m50165a(context2, spannableStringBuilder2, string, (String) bmxv.mo66814b(), context2.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gyh(gyl));
            } else {
                spannableStringBuilder2.append((CharSequence) string);
            }
            if (bmxv2.mo66813a()) {
                adcm.m50165a(context2, spannableStringBuilder3, string2, (String) bmxv2.mo66814b(), context2.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gyi(gyl));
            } else {
                spannableStringBuilder3.append((CharSequence) string2);
            }
            spannableStringBuilder.append(TextUtils.expandTemplate(gyl.getString(C0126R.string.credentials_assisted_signin_consent), gyl.f19240l, spannableStringBuilder2, spannableStringBuilder3));
            gyl.f19238j.setText(spannableStringBuilder);
            gyl.f19237i.setVisibility(0);
            gyl.f19238j.setVisibility(0);
            gyl.f19235g.setText(str);
        } else if (z) {
            gyl.f19236h.setText(gyl.getString(C0126R.string.credentials_assisted_sign_in_password_title, gyl.f19240l));
            gyl.f19237i.setMovementMethod(new LinkMovementMethod());
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
            adcm.m50165a(context, spannableStringBuilder5, gyl.getString(C0126R.string.common_asm_google_account_title), gyl.mo12328a(internalSignInCredentialWrapper, gyl.getResources().getInteger(C0126R.integer.screen_id_saved_passwords)), context.getTheme(), C0126R.style.AppBottomSheetDialogTheme, C0126R.attr.credential_assisted_link_color, new gye(gyl));
            spannableStringBuilder4.append(TextUtils.expandTemplate(gyl.getString(C0126R.string.credentials_assisted_sign_in_password_description), gyl.f19240l, spannableStringBuilder5));
            gyl.f19237i.setText(spannableStringBuilder4);
            gyl.f19237i.setVisibility(0);
            gyl.f19238j.setVisibility(8);
            gyl.f19235g.setText((int) C0126R.string.common_continue);
        } else {
            gyl.f19236h.setText(gyl.getString(C0126R.string.credentials_assisted_sign_back_title, gyl.f19240l));
            gyl.mo12330a(internalSignInCredentialWrapper);
            gyl.f19238j.setVisibility(8);
            gyl.f19235g.setText(str);
        }
        gyl.f19235g.setOnClickListener(new gyf(gyl));
        gyl.f19239k.getViewTreeObserver().addOnGlobalLayoutListener(new gyk(gyl));
    }
}
