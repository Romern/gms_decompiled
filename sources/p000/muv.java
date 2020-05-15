package p000;

import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

/* renamed from: muv */
final /* synthetic */ class muv implements aubq {

    /* renamed from: a */
    static final aubq f34786a = new muv();

    private muv() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        lvn lvn = SetBackupAccountFlowChimeraActivity.f29080a;
        if (!aucb.mo50384b()) {
            SetBackupAccountFlowChimeraActivity.f29080a.mo25417e("Exception writing audit record", aucb.mo50387e(), new Object[0]);
        }
    }
}
