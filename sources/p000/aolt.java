package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;

/* renamed from: aolt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aolt implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ aolv f78421a;

    /* renamed from: b */
    private final aolp f78422b = new aolp();

    /* renamed from: c */
    private final int f78423c;

    public aolt(aolv aolv, Resources resources) {
        this.f78421a = aolv;
        this.f78423c = (int) resources.getDimension(C0126R.dimen.plus_sharebox_mention_suggestion_min_space);
    }

    public final void afterTextChanged(Editable editable) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.f78421a.getActivity() != null) {
            aolv aolv = this.f78421a;
            if (aolv.f78427d != null && (mentionMultiAutoCompleteTextView = aolv.f78429f) != null) {
                if (!TextUtils.isEmpty(mentionMultiAutoCompleteTextView.getText())) {
                    aolv aolv2 = this.f78421a;
                    aolv2.f78425b = true;
                    if (!aolv2.f78424a) {
                        aolv2.f78426c.mo42972b().mo42989a(riv.f43117k);
                        this.f78421a.f78424a = true;
                    }
                }
                this.f78421a.f78426c.mo42979f();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.f78421a.getActivity() != null) {
            aolv aolv = this.f78421a;
            if (aolv.f78427d != null && (mentionMultiAutoCompleteTextView = aolv.f78429f) != null) {
                int selectionEnd = mentionMultiAutoCompleteTextView.getSelectionEnd();
                if (this.f78422b.findTokenStart(charSequence, selectionEnd) + this.f78421a.f78429f.getThreshold() <= selectionEnd) {
                    int[] iArr = new int[2];
                    this.f78421a.f78429f.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    this.f78421a.f78427d.getWindowVisibleDisplayFrame(rect);
                    if (rect.height() - (iArr[1] + this.f78421a.f78429f.mo46786b()) < this.f78423c) {
                        aolv aolv2 = this.f78421a;
                        aolv2.f78428e.smoothScrollTo(0, aolv2.f78429f.mo46787c());
                    }
                }
            }
        }
    }
}
