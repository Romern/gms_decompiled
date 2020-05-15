package p000;

import android.content.DialogInterface;
import android.widget.RadioButton;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpm */
public final /* synthetic */ class ajpm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SettingsChimeraActivity f71102a;

    /* renamed from: b */
    private final RadioButton f71103b;

    /* renamed from: c */
    private final RadioButton f71104c;

    /* renamed from: d */
    private final RadioButton f71105d;

    public ajpm(SettingsChimeraActivity settingsChimeraActivity, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f71102a = settingsChimeraActivity;
        this.f71103b = radioButton;
        this.f71104c = radioButton2;
        this.f71105d = radioButton3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71102a;
        RadioButton radioButton = this.f71103b;
        RadioButton radioButton2 = this.f71104c;
        RadioButton radioButton3 = this.f71105d;
        if (radioButton.isChecked()) {
            settingsChimeraActivity.mo44469a(2);
        } else if (radioButton2.isChecked()) {
            settingsChimeraActivity.mo44469a(3);
        } else if (radioButton3.isChecked()) {
            settingsChimeraActivity.mo44469a(1);
        }
    }
}
