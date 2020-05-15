package p000;

import com.google.android.gms.auth.frp.FreUnlockChimeraActivity;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwb */
public final /* synthetic */ class jwb implements Runnable {

    /* renamed from: a */
    private final PreAddAccountChimeraActivity f23390a;

    /* renamed from: b */
    private final FrpSnapshot f23391b;

    public jwb(PreAddAccountChimeraActivity preAddAccountChimeraActivity, FrpSnapshot frpSnapshot) {
        this.f23390a = preAddAccountChimeraActivity;
        this.f23391b = frpSnapshot;
    }

    public final void run() {
        PreAddAccountChimeraActivity preAddAccountChimeraActivity = this.f23390a;
        FrpSnapshot frpSnapshot = this.f23391b;
        if (!preAddAccountChimeraActivity.isFinishing() && !preAddAccountChimeraActivity.isChangingConfigurations()) {
            preAddAccountChimeraActivity.f11424e.f23412g = true;
            if (frpSnapshot.f10951e == null || !((Boolean) preAddAccountChimeraActivity.mo14202g().mo13147a(PreAddAccountChimeraActivity.f11422c, false)).booleanValue()) {
                preAddAccountChimeraActivity.mo7860c();
                return;
            }
            FrpSnapshot frpSnapshot2 = preAddAccountChimeraActivity.f11424e.f23408c;
            if (frpSnapshot2 != null) {
                preAddAccountChimeraActivity.startActivityForResult(FreUnlockChimeraActivity.m6632a(preAddAccountChimeraActivity, preAddAccountChimeraActivity.mo14203f(), ((Boolean) preAddAccountChimeraActivity.mo14202g().mo13147a(jwz.f23429j, false)).booleanValue(), frpSnapshot2.f10951e, frpSnapshot2.f10952f), 3);
            } else {
                PreAddAccountChimeraActivity.f11420a.mo25418e("Trying to launch forced re-enrollment before the FRP state has been loaded!", new Object[0]);
            }
        }
    }
}
