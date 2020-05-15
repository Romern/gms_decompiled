package p000;

import android.content.DialogInterface;
import com.google.android.chimera.Activity;

/* renamed from: aexu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aexu implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Activity f63992a;

    public aexu(Activity activity) {
        this.f63992a = activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f63992a.finish();
    }
}
