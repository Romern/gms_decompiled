package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abba implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EditText f56971a;

    /* renamed from: b */
    final /* synthetic */ HelpChimeraActivity f56972b;

    public abba(HelpChimeraActivity helpChimeraActivity, EditText editText) {
        this.f56972b = helpChimeraActivity;
        this.f56971a = editText;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f56972b.findViewById(C0126R.C0129id.gh_open_search_view_progress_bar).getVisibility() != 0) {
            abfv abfv = this.f56972b.f78974u;
            if (abfv != null) {
                abfv.mo31664c();
            }
            String trim = this.f56971a.getText().toString().trim();
            if (TextUtils.isEmpty(trim)) {
                this.f56972b.f78964k.mo32074a();
            } else if (this.f56972b.getCurrentFocus() == this.f56971a) {
                try {
                    HelpChimeraActivity helpChimeraActivity = this.f56972b;
                    helpChimeraActivity.f78974u = new abfv(helpChimeraActivity, trim);
                    HelpChimeraActivity helpChimeraActivity2 = this.f56972b;
                    helpChimeraActivity2.f78974u.executeOnExecutor(helpChimeraActivity2.f78958e, new Void[0]);
                } catch (RuntimeException e) {
                    Log.w("gH_HelpActivity", "Fetching autocomplete suggestions failed:", e);
                }
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
