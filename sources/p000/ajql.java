package p000;

import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajql */
final /* synthetic */ class ajql implements aubw {

    /* renamed from: a */
    private final SetupChimeraActivity f71152a;

    /* renamed from: b */
    private final EditText f71153b;

    /* renamed from: c */
    private final C1350sh f71154c;

    public ajql(SetupChimeraActivity setupChimeraActivity, EditText editText, C1350sh shVar) {
        this.f71152a = setupChimeraActivity;
        this.f71153b = editText;
        this.f71154c = shVar;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.f71152a;
        EditText editText = this.f71153b;
        C1350sh shVar = this.f71154c;
        String str = (String) obj;
        editText.setTag(C0126R.C0129id.device_name, str);
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        if (setupChimeraActivity.isFinishing()) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("SetupActivity#editDeviceName: Alert dialog cannot show because Setup Activity is not running.");
        } else {
            shVar.show();
        }
    }
}
