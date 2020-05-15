package p000;

import android.view.View;
import android.widget.RadioGroup;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewi implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SharingConditionRadioGroup f63943a;

    public aewi(SharingConditionRadioGroup sharingConditionRadioGroup) {
        this.f63943a = sharingConditionRadioGroup;
    }

    public void onClick(View view) {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f63943a;
        sharingConditionRadioGroup.mo43815b(Math.min(sharingConditionRadioGroup.f79729f + 1, SharingConditionRadioGroup.f79724a.length - 1));
        if (this.f63943a.getCheckedRadioButtonId() != this.f63943a.f79725b.getId()) {
            this.f63943a.clearCheck();
            SharingConditionRadioGroup sharingConditionRadioGroup2 = this.f63943a;
            sharingConditionRadioGroup2.check(sharingConditionRadioGroup2.f79725b.getId());
        } else {
            SharingConditionRadioGroup sharingConditionRadioGroup3 = this.f63943a;
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = sharingConditionRadioGroup3.f79730g;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(sharingConditionRadioGroup3, sharingConditionRadioGroup3.getCheckedRadioButtonId());
            }
        }
        this.f63943a.mo43812a();
    }
}
