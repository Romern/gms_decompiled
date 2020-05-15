package p000;

import android.view.View;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewe implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SharingConditionRadioGroup f63939a;

    public aewe(SharingConditionRadioGroup sharingConditionRadioGroup) {
        this.f63939a = sharingConditionRadioGroup;
    }

    public void onClick(View view) {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f63939a;
        sharingConditionRadioGroup.check(sharingConditionRadioGroup.f79725b.getId());
    }
}
