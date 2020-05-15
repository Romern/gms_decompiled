package p000;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpj */
public final /* synthetic */ class ajpj implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71094a;

    /* renamed from: b */
    private final EditText f71095b;

    /* renamed from: c */
    private final C1350sh f71096c;

    public ajpj(SettingsChimeraActivity settingsChimeraActivity, EditText editText, C1350sh shVar) {
        this.f71094a = settingsChimeraActivity;
        this.f71095b = editText;
        this.f71096c = shVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        InputMethodManager inputMethodManager;
        SettingsChimeraActivity settingsChimeraActivity = this.f71094a;
        EditText editText = this.f71095b;
        C1350sh shVar = this.f71096c;
        boolean z = true;
        if (editText.requestFocus() && (inputMethodManager = (InputMethodManager) settingsChimeraActivity.getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
        Button a = shVar.mo15913a(-1);
        a.setTextColor(settingsChimeraActivity.getResources().getColorStateList(C0126R.color.sharing_button_borderless_text_color));
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty() || trim.equals(editText.getTag(C0126R.C0129id.device_name))) {
            z = false;
        }
        a.setEnabled(z);
    }
}
