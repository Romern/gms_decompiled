package p000;

import android.view.View;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewh implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SharingConditionRadioGroup f63942a;

    public aewh(SharingConditionRadioGroup sharingConditionRadioGroup) {
        this.f63942a = sharingConditionRadioGroup;
    }

    public void onClick(View view) {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f63942a;
        sharingConditionRadioGroup.check(sharingConditionRadioGroup.f79728e.getId());
    }
}
