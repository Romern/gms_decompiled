package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationTranscriptLayoutAdapter$1$1;

/* renamed from: aavw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavw implements InputFilter {

    /* renamed from: a */
    final /* synthetic */ Context f56673a;

    /* renamed from: b */
    final /* synthetic */ int f56674b;

    /* renamed from: c */
    final /* synthetic */ ColorStateList f56675c;

    /* renamed from: d */
    public final /* synthetic */ aawe f56676d;

    public aavw(aawe aawe, Context context, int i, ColorStateList colorStateList) {
        this.f56676d = aawe;
        this.f56673a = context;
        this.f56674b = i;
        this.f56675c = colorStateList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm
     arg types: [java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, int, int]
     candidates:
      aasm.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):aasm
      aasm.a(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, aars):java.lang.String
      aasm.a(java.lang.String, java.lang.String, java.util.List, com.google.android.gms.googlehelp.common.HelpConfig, boolean):java.util.Map
      aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.SpannableStringBuilder.insert(int, java.lang.CharSequence):android.text.SpannableStringBuilder}
     arg types: [int, java.lang.String]
     candidates:
      ClspMth{android.text.SpannableStringBuilder.insert(int, java.lang.CharSequence):android.text.Editable}
      ClspMth{android.text.SpannableStringBuilder.insert(int, java.lang.CharSequence):android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.SpannableStringBuilder.replace(int, int, java.lang.CharSequence):android.text.SpannableStringBuilder}
     arg types: [int, int, android.text.SpannableString]
     candidates:
      ClspMth{android.text.SpannableStringBuilder.replace(int, int, java.lang.CharSequence):android.text.Editable}
      ClspMth{android.text.SpannableStringBuilder.replace(int, int, java.lang.CharSequence):android.text.SpannableStringBuilder} */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableString spannableString = new SpannableString(this.f56673a.getString(C0126R.string.gh_chat_offer_survey).toUpperCase());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            aasm a = aasm.m46883a(uRLSpan.getURL(), aasw.m46952a(), this.f56676d.f56701n.f78879q, true, 2);
            if (a != null && a.mo31733p()) {
                abcx.m47503b(this.f56676d.f56701n, 34, bzps.CHAT);
                int i5 = this.f56674b;
                ColorStateList colorStateList = this.f56675c;
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 1, i5, colorStateList, colorStateList);
                ChatConversationTranscriptLayoutAdapter$1$1 chatConversationTranscriptLayoutAdapter$1$1 = new ChatConversationTranscriptLayoutAdapter$1$1(this, uRLSpan.getURL());
                spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(uRLSpan), (CharSequence) "\n");
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), (CharSequence) spannableString);
                spannableStringBuilder.setSpan(textAppearanceSpan, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 0);
                spannableStringBuilder.setSpan(chatConversationTranscriptLayoutAdapter$1$1, 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.removeSpan(uRLSpan);
            }
        }
        return spannableStringBuilder;
    }
}
