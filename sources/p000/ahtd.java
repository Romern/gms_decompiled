package p000;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.devices.OptionalModuleActivityProxy$InstallCompleteReceiver;

/* renamed from: ahtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahtd {

    /* renamed from: a */
    public final deu f67977a;

    /* renamed from: b */
    OptionalModuleActivityProxy$InstallCompleteReceiver f67978b;

    /* renamed from: c */
    private final ComponentName f67979c;

    /* renamed from: d */
    private final ahuu f67980d;

    public ahtd(deu deu, String str, ahuu ahuu) {
        this.f67977a = deu;
        this.f67979c = new ComponentName(deu, str);
        this.f67980d = ahuu;
    }

    /* renamed from: a */
    public final void mo37109a(Intent intent) {
        intent.setComponent(this.f67979c);
        if (this.f67980d.mo37180b()) {
            this.f67977a.startActivity(intent);
            this.f67977a.finish();
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("OptionalModule activity:%s for action: %s is not found, start downloading fastpair module", intent.getComponent().getClassName(), intent.getAction());
        this.f67978b = new OptionalModuleActivityProxy$InstallCompleteReceiver(this.f67977a, intent);
        this.f67980d.mo37179a();
        deu deu = this.f67977a;
        ProgressDialog.show(deu, null, deu.getResources().getString(C0126R.string.common_loading), false, true, new ahtc(this)).setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public final void mo37110a(deu deu) {
        OptionalModuleActivityProxy$InstallCompleteReceiver optionalModuleActivityProxy$InstallCompleteReceiver = this.f67978b;
        if (optionalModuleActivityProxy$InstallCompleteReceiver != null) {
            optionalModuleActivityProxy$InstallCompleteReceiver.mo44193a(deu);
        }
    }
}
