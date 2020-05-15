package p000;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajpp */
public final /* synthetic */ class ajpp implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    private final C1350sh f71108a;

    /* renamed from: b */
    private final RadioButton f71109b;

    /* renamed from: c */
    private final RadioButton f71110c;

    /* renamed from: d */
    private final RadioButton f71111d;

    /* renamed from: e */
    private final RadioGroup f71112e;

    public ajpp(C1350sh shVar, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup) {
        this.f71108a = shVar;
        this.f71109b = radioButton;
        this.f71110c = radioButton2;
        this.f71111d = radioButton3;
        this.f71112e = radioGroup;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C1350sh shVar = this.f71108a;
        RadioButton radioButton = this.f71109b;
        RadioButton radioButton2 = this.f71110c;
        RadioButton radioButton3 = this.f71111d;
        RadioGroup radioGroup2 = this.f71112e;
        int i2 = -1;
        Button a = shVar.mo15913a(-1);
        if (a != null) {
            boolean z = true;
            if (radioButton.isChecked()) {
                i2 = 2;
            } else if (radioButton2.isChecked()) {
                i2 = 3;
            } else if (radioButton3.isChecked()) {
                i2 = 1;
            }
            if (i2 == ((Integer) radioGroup2.getTag(C0126R.C0129id.data_usage)).intValue()) {
                z = false;
            }
            a.setEnabled(z);
        }
    }
}
