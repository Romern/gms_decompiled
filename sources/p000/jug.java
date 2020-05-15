package p000;

import android.content.DialogInterface;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: jug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jug implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23228a;

    public jug(SourceChimeraActivity sourceChimeraActivity) {
        this.f23228a = sourceChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f23228a.mo7856d();
    }
}
