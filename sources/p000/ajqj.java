package p000;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqj */
final /* synthetic */ class ajqj implements TextView.OnEditorActionListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71146a;

    /* renamed from: b */
    private final C1350sh f71147b;

    /* renamed from: c */
    private final EditText f71148c;

    public ajqj(SetupChimeraActivity setupChimeraActivity, C1350sh shVar, EditText editText) {
        this.f71146a = setupChimeraActivity;
        this.f71147b = shVar;
        this.f71148c = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        SetupChimeraActivity setupChimeraActivity = this.f71146a;
        C1350sh shVar = this.f71147b;
        EditText editText = this.f71148c;
        Button a = shVar.mo15913a(-1);
        if (a == null || i != 6 || !a.isEnabled()) {
            return false;
        }
        setupChimeraActivity.mo44474a(editText.getText());
        shVar.dismiss();
        return true;
    }
}
