package p000;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpi */
public final /* synthetic */ class ajpi implements TextView.OnEditorActionListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71091a;

    /* renamed from: b */
    private final C1350sh f71092b;

    /* renamed from: c */
    private final EditText f71093c;

    public ajpi(SettingsChimeraActivity settingsChimeraActivity, C1350sh shVar, EditText editText) {
        this.f71091a = settingsChimeraActivity;
        this.f71092b = shVar;
        this.f71093c = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71091a;
        C1350sh shVar = this.f71092b;
        EditText editText = this.f71093c;
        Button a = shVar.mo15913a(-1);
        if (a == null || i != 6 || !a.isEnabled()) {
            return false;
        }
        settingsChimeraActivity.mo44471a(editText.getText());
        shVar.dismiss();
        return true;
    }
}
