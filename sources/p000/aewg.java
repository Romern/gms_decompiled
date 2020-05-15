package p000;

import android.view.View;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SharingConditionRadioGroup f63941a;

    public aewg(SharingConditionRadioGroup sharingConditionRadioGroup) {
        this.f63941a = sharingConditionRadioGroup;
    }

    public void onClick(View view) {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f63941a;
        sharingConditionRadioGroup.check(sharingConditionRadioGroup.f79727d.getId());
    }
}
