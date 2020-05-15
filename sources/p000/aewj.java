package p000;

import android.view.View;
import android.widget.RadioGroup;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SharingConditionRadioGroup f63944a;

    public aewj(SharingConditionRadioGroup sharingConditionRadioGroup) {
        this.f63944a = sharingConditionRadioGroup;
    }

    public void onClick(View view) {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f63944a;
        sharingConditionRadioGroup.mo43815b(Math.max(sharingConditionRadioGroup.f79729f - 1, 0));
        if (this.f63944a.getCheckedRadioButtonId() != this.f63944a.f79725b.getId()) {
            this.f63944a.clearCheck();
            SharingConditionRadioGroup sharingConditionRadioGroup2 = this.f63944a;
            sharingConditionRadioGroup2.check(sharingConditionRadioGroup2.f79725b.getId());
        } else {
            SharingConditionRadioGroup sharingConditionRadioGroup3 = this.f63944a;
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = sharingConditionRadioGroup3.f79730g;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(sharingConditionRadioGroup3, sharingConditionRadioGroup3.getCheckedRadioButtonId());
            }
        }
        this.f63944a.mo43812a();
    }
}
