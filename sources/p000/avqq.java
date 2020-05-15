package p000;

import android.os.CountDownTimer;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.phone.PopupDialogChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: avqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqq extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ avlf f93799a;

    /* renamed from: b */
    final /* synthetic */ PopupDialogChimeraActivity f93800b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avqq(PopupDialogChimeraActivity popupDialogChimeraActivity, long j, long j2, avlf avlf) {
        super(j, j2);
        this.f93800b = popupDialogChimeraActivity;
        this.f93799a = avlf;
    }

    public final void onFinish() {
        this.f93799a.mo51344a(new InstallationOptions(true, true, true, false));
        this.f93800b.finish();
    }

    public final void onTick(long j) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        PopupDialogChimeraActivity popupDialogChimeraActivity = this.f93800b;
        int i = PopupDialogChimeraActivity.f109500b;
        popupDialogChimeraActivity.f109503a.setText(popupDialogChimeraActivity.getResources().getQuantityString(C0126R.plurals.system_update_reboot_prompt_description, seconds, Integer.valueOf(seconds)));
    }
}
