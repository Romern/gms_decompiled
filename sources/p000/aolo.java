package p000;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.URLSpan;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;
import com.google.android.gms.plus.sharebox.MentionSpan;
import java.util.ArrayList;

/* renamed from: aolo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aolo implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ MentionMultiAutoCompleteTextView f78415a;

    /* renamed from: b */
    private final aolp f78416b = new aolp();

    public aolo(MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView) {
        this.f78415a = mentionMultiAutoCompleteTextView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            ArrayList a = this.f78415a.mo46782a();
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(i, (i2 + i) - 1, URLSpan.class);
            boolean z = false;
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (MentionSpan.m69359a(uRLSpan)) {
                    spannable.removeSpan(uRLSpan);
                    z = true;
                }
            }
            if (z) {
                this.f78415a.mo46784a(a, this.f78415a.mo46782a());
            }
        }
        float dimension = this.f78415a.getContext().getResources().getDimension(C0126R.dimen.plus_sharebox_mention_suggestion_popup_offset);
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.f78415a;
        mentionMultiAutoCompleteTextView.setDropDownVerticalOffset((((int) dimension) + mentionMultiAutoCompleteTextView.mo46786b()) - this.f78415a.getHeight());
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int selectionEnd = this.f78415a.getSelectionEnd();
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.f78415a;
        boolean z = true;
        if (this.f78416b.findTokenStart(charSequence, selectionEnd) + 1 > selectionEnd) {
            z = false;
        }
        mentionMultiAutoCompleteTextView.mo46785a(z);
    }
}
