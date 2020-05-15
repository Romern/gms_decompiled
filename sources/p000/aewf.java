package p000;

import android.view.View;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SharingConditionRadioGroup f63940a;

    public aewf(SharingConditionRadioGroup sharingConditionRadioGroup) {
        this.f63940a = sharingConditionRadioGroup;
    }

    public void onClick(View view) {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f63940a;
        sharingConditionRadioGroup.check(sharingConditionRadioGroup.f79726c.getId());
    }
}
