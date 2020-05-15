package p000;

import android.os.Bundle;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpk */
public final /* synthetic */ class ajpk implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71097a;

    /* renamed from: b */
    private final EditText f71098b;

    /* renamed from: c */
    private final C1350sh f71099c;

    /* renamed from: d */
    private final Bundle f71100d;

    public ajpk(SettingsChimeraActivity settingsChimeraActivity, EditText editText, C1350sh shVar, Bundle bundle) {
        this.f71097a = settingsChimeraActivity;
        this.f71098b = editText;
        this.f71099c = shVar;
        this.f71100d = bundle;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71097a;
        EditText editText = this.f71098b;
        C1350sh shVar = this.f71099c;
        Bundle bundle = this.f71100d;
        String str = (String) obj;
        editText.setTag(C0126R.C0129id.device_name, str);
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        shVar.setOnDismissListener(new ajpt(settingsChimeraActivity));
        if (bundle != null) {
            shVar.onRestoreInstanceState(bundle);
        }
        if (settingsChimeraActivity.isFinishing()) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("SettingsActivity#editDeviceName: Alert dialog cannot show because Settings Activity is not running.");
            return;
        }
        shVar.show();
        settingsChimeraActivity.f80970i = shVar;
    }
}
