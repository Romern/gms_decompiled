package p000;

import android.content.DialogInterface;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;

/* renamed from: arpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TargetChimeraActivity f88053a;

    public arpb(TargetChimeraActivity targetChimeraActivity) {
        this.f88053a = targetChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            TargetChimeraActivity.f108028b.mo25412b("User quit setup", new Object[0]);
            this.f88053a.mo59130e();
        }
    }
}
