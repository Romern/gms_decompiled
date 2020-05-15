package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;

/* renamed from: aomf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aomf implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ aomh f78453a;

    /* renamed from: b */
    private final aolp f78454b = new aolp();

    /* renamed from: c */
    private final int f78455c;

    public aomf(aomh aomh, Resources resources) {
        this.f78453a = aomh;
        this.f78455c = (int) resources.getDimension(C0126R.dimen.plus_sharebox_mention_suggestion_min_space);
    }

    public final void afterTextChanged(Editable editable) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.f78453a.getActivity() != null) {
            aomh aomh = this.f78453a;
            if (aomh.f78461f != null && (mentionMultiAutoCompleteTextView = aomh.f78464i) != null) {
                String obj = mentionMultiAutoCompleteTextView.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    if (this.f78453a.f78459d.mo43003j().mo43056h()) {
                        this.f78453a.f78457b = true;
                    }
                } else if (!this.f78453a.f78459d.mo43003j().mo43056h() || !this.f78453a.f78459d.mo43003j().f78547s.equals(obj)) {
                    this.f78453a.f78457b = true;
                }
                aomh aomh2 = this.f78453a;
                if (aomh2.f78457b && !aomh2.f78456a) {
                    aomh2.f78459d.mo42999g().mo43042a(riv.f43117k);
                    this.f78453a.f78456a = true;
                }
                this.f78453a.f78459d.mo43013p();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.f78453a.getActivity() != null) {
            aomh aomh = this.f78453a;
            if (aomh.f78461f != null && (mentionMultiAutoCompleteTextView = aomh.f78464i) != null) {
                int selectionEnd = mentionMultiAutoCompleteTextView.getSelectionEnd();
                if (this.f78454b.findTokenStart(charSequence, selectionEnd) + this.f78453a.f78464i.getThreshold() <= selectionEnd) {
                    int[] iArr = new int[2];
                    this.f78453a.f78464i.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    this.f78453a.f78461f.getWindowVisibleDisplayFrame(rect);
                    if (rect.height() - (iArr[1] + this.f78453a.f78464i.mo46786b()) < this.f78455c) {
                        aomh aomh2 = this.f78453a;
                        aomh2.f78462g.smoothScrollTo(0, aomh2.f78464i.mo46787c());
                    }
                }
            }
        }
    }
}
