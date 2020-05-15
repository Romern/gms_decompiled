package p000;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aban */
public final /* synthetic */ class aban implements TextView.OnEditorActionListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56947a;

    /* renamed from: b */
    private final EditText f56948b;

    public aban(HelpChimeraActivity helpChimeraActivity, EditText editText) {
        this.f56947a = helpChimeraActivity;
        this.f56948b = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        HelpChimeraActivity helpChimeraActivity = this.f56947a;
        EditText editText = this.f56948b;
        String trim = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            editText.clearFocus();
            aatj.m46979a(editText);
            helpChimeraActivity.f78964k.mo32074a();
            helpChimeraActivity.findViewById(C0126R.C0129id.gh_open_search_view_progress_bar).setVisibility(0);
            helpChimeraActivity.mo43349e(trim);
            helpChimeraActivity.mo43342b(trim);
        }
        return false;
    }
}
