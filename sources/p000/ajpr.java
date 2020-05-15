package p000;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpr */
public final /* synthetic */ class ajpr implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71119a;

    /* renamed from: b */
    private final RadioGroup f71120b;

    /* renamed from: c */
    private final RadioButton f71121c;

    /* renamed from: d */
    private final RadioButton f71122d;

    /* renamed from: e */
    private final RadioButton f71123e;

    /* renamed from: f */
    private final C1350sh f71124f;

    /* renamed from: g */
    private final Bundle f71125g;

    public ajpr(SettingsChimeraActivity settingsChimeraActivity, RadioGroup radioGroup, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C1350sh shVar, Bundle bundle) {
        this.f71119a = settingsChimeraActivity;
        this.f71120b = radioGroup;
        this.f71121c = radioButton;
        this.f71122d = radioButton2;
        this.f71123e = radioButton3;
        this.f71124f = shVar;
        this.f71125g = bundle;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71119a;
        RadioGroup radioGroup = this.f71120b;
        RadioButton radioButton = this.f71121c;
        RadioButton radioButton2 = this.f71122d;
        RadioButton radioButton3 = this.f71123e;
        C1350sh shVar = this.f71124f;
        Bundle bundle = this.f71125g;
        Integer num = (Integer) obj;
        radioGroup.setTag(C0126R.C0129id.data_usage, num);
        int intValue = num.intValue();
        if (intValue == 1) {
            radioGroup.check(radioButton3.getId());
        } else if (intValue == 2) {
            radioGroup.check(radioButton.getId());
        } else if (intValue == 3) {
            radioGroup.check(radioButton2.getId());
        }
        shVar.setOnDismissListener(new ajps(settingsChimeraActivity));
        if (bundle != null) {
            shVar.onRestoreInstanceState(bundle);
        }
        if (settingsChimeraActivity.isFinishing()) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("SettingsActivity#editDataUsage: Alert dialog cannot show because Settings Activity is not running.");
            return;
        }
        shVar.show();
        settingsChimeraActivity.f80974m = shVar;
    }
}
