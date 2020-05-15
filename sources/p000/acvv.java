package p000;

import android.widget.CompoundButton;
import com.google.android.chimera.Activity;

/* renamed from: acvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvv implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ acwa f60925a;

    public acvv(acwa acwa) {
        this.f60925a = acwa;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Activity activity = this.f60925a.getActivity();
        if (activity != null) {
            new acuf().execute(activity, Boolean.valueOf(z));
            this.f60925a.mo33162a(z);
        }
    }
}
