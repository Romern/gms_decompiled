package p000;

import android.widget.RadioGroup;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;

/* renamed from: aewk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewk implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ RadioGroup.OnCheckedChangeListener f63945a;

    /* renamed from: b */
    final /* synthetic */ SharingConditionRadioGroup f63946b;

    public aewk(SharingConditionRadioGroup sharingConditionRadioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f63946b = sharingConditionRadioGroup;
        this.f63945a = onCheckedChangeListener;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.f63946b.mo43814b() != null) {
            this.f63945a.onCheckedChanged(radioGroup, i);
        }
    }
}
