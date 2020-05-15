package p000;

import android.content.DialogInterface;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;

/* renamed from: arpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TargetChimeraActivity f88054a;

    public arpc(TargetChimeraActivity targetChimeraActivity) {
        this.f88054a = targetChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TargetChimeraActivity targetChimeraActivity = this.f88054a;
        targetChimeraActivity.f108036j = false;
        if (i == -1) {
            TargetChimeraActivity.f108028b.mo25412b("Try again requested", new Object[0]);
            this.f88054a.mo59130e();
            return;
        }
        targetChimeraActivity.mo59131g();
    }
}
