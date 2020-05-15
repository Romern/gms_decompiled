package p000;

import android.content.DialogInterface;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: jud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jud implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23226a;

    public jud(SourceChimeraActivity sourceChimeraActivity) {
        this.f23226a = sourceChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f23226a.f11277l.mo69138b((Object) false);
        this.f23226a.mo7856d();
    }
}
