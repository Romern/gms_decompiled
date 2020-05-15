package p000;

import android.content.DialogInterface;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: juf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juf implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23227a;

    public juf(SourceChimeraActivity sourceChimeraActivity) {
        this.f23227a = sourceChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f23227a.f11277l.mo69138b((Object) true);
        SourceChimeraActivity sourceChimeraActivity = this.f23227a;
        if (!sourceChimeraActivity.f11271f && !sourceChimeraActivity.f11268c.isEnabled()) {
            this.f23227a.mo7854b();
        }
    }
}
