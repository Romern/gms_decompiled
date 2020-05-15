package p000;

import android.content.DialogInterface;
import com.google.android.gms.auth.proximity.multidevice.DisableBetterTogetherIntentOperation;

/* renamed from: jtc */
final /* synthetic */ class jtc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final jtd f23167a;

    /* renamed from: b */
    private final jta f23168b;

    public jtc(jtd jtd, jta jta) {
        this.f23167a = jtd;
        this.f23168b = jta;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jtd jtd = this.f23167a;
        jta jta = this.f23168b;
        if (ccia.m129785c()) {
            jta.f23166a.mo24383c("better_together_settings_confirm_disable_dialog_count").mo24359a();
            jta.f23166a.mo24388e();
        }
        jtd.f23169a.mo25414c("Removing Better Together for account %s", jtd.f23170b);
        jtd.getContext().startService(DisableBetterTogetherIntentOperation.m6880a(jtd.getContext(), jtd.f23170b));
    }
}
