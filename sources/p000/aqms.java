package p000;

import android.content.DialogInterface;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqms */
public final /* synthetic */ class aqms implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public static final DialogInterface.OnClickListener f86373a = new aqms();

    private aqms() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        sek sek = SignInChimeraActivity.f107676b;
        dialogInterface.cancel();
    }
}
