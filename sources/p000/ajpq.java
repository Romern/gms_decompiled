package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpq */
public final /* synthetic */ class ajpq implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71113a;

    /* renamed from: b */
    private final C1350sh f71114b;

    /* renamed from: c */
    private final RadioButton f71115c;

    /* renamed from: d */
    private final RadioButton f71116d;

    /* renamed from: e */
    private final RadioButton f71117e;

    /* renamed from: f */
    private final RadioGroup f71118f;

    public ajpq(SettingsChimeraActivity settingsChimeraActivity, C1350sh shVar, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup) {
        this.f71113a = settingsChimeraActivity;
        this.f71114b = shVar;
        this.f71115c = radioButton;
        this.f71116d = radioButton2;
        this.f71117e = radioButton3;
        this.f71118f = radioGroup;
    }

    public final void onShow(DialogInterface dialogInterface) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71113a;
        C1350sh shVar = this.f71114b;
        RadioButton radioButton = this.f71115c;
        RadioButton radioButton2 = this.f71116d;
        RadioButton radioButton3 = this.f71117e;
        RadioGroup radioGroup = this.f71118f;
        int i = -1;
        Button a = shVar.mo15913a(-1);
        a.setTextColor(settingsChimeraActivity.getResources().getColorStateList(C0126R.color.sharing_button_borderless_text_color));
        boolean isChecked = radioButton.isChecked();
        boolean z = true;
        if (isChecked) {
            i = 2;
        } else if (radioButton2.isChecked()) {
            i = 3;
        } else if (radioButton3.isChecked()) {
            i = 1;
        }
        if (i == ((Integer) radioGroup.getTag(C0126R.C0129id.data_usage)).intValue()) {
            z = false;
        }
        a.setEnabled(z);
    }
}
