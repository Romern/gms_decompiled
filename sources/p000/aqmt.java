package p000;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: aqmt */
public final /* synthetic */ class aqmt implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final SignInChimeraActivity f86374a;

    /* renamed from: b */
    private final bqgy f86375b;

    public aqmt(SignInChimeraActivity signInChimeraActivity, bqgy bqgy) {
        this.f86374a = signInChimeraActivity;
        this.f86375b = bqgy;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        SignInChimeraActivity signInChimeraActivity = this.f86374a;
        bqgy bqgy = this.f86375b;
        Intent intent = new Intent();
        intent.putExtra("<<ResolutionFailureErrorDetail>>", 17);
        signInChimeraActivity.mo58979a(0, intent);
        bqgy.mo69138b(bmvz.f131120a);
    }
}
