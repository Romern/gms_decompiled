package p000;

import com.google.android.gms.backup.settings.p033ui.BackupNowPreference;

/* renamed from: mwu */
final /* synthetic */ class mwu implements Runnable {

    /* renamed from: a */
    private final mwv f34861a;

    /* renamed from: b */
    private final Boolean f34862b;

    public mwu(mwv mwv, Boolean bool) {
        this.f34861a = mwv;
        this.f34862b = bool;
    }

    public final void run() {
        mwv mwv = this.f34861a;
        Boolean bool = this.f34862b;
        mwv.f34863a.f29165e = bool.booleanValue();
        BackupNowPreference backupNowPreference = mwv.f34863a.f29173p;
        if (backupNowPreference != null) {
            backupNowPreference.mo17253j(bool.booleanValue());
        }
    }
}
