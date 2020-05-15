package p000;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqk */
final /* synthetic */ class ajqk implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71149a;

    /* renamed from: b */
    private final EditText f71150b;

    /* renamed from: c */
    private final C1350sh f71151c;

    public ajqk(SetupChimeraActivity setupChimeraActivity, EditText editText, C1350sh shVar) {
        this.f71149a = setupChimeraActivity;
        this.f71150b = editText;
        this.f71151c = shVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        InputMethodManager inputMethodManager;
        SetupChimeraActivity setupChimeraActivity = this.f71149a;
        EditText editText = this.f71150b;
        C1350sh shVar = this.f71151c;
        boolean z = true;
        if (editText.requestFocus() && (inputMethodManager = (InputMethodManager) setupChimeraActivity.getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
        Button a = shVar.mo15913a(-1);
        a.setTextColor(setupChimeraActivity.getResources().getColorStateList(C0126R.color.sharing_button_borderless_text_color));
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty() || trim.equals(editText.getTag(C0126R.C0129id.device_name))) {
            z = false;
        }
        a.setEnabled(z);
    }
}
