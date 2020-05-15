package p000;

import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;

/* renamed from: jtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtk implements bqfp {

    /* renamed from: a */
    final /* synthetic */ SettingsChimeraActivity f23181a;

    public jtk(SettingsChimeraActivity settingsChimeraActivity) {
        this.f23181a = settingsChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f23181a.mo7850a((Account) obj);
        this.f23181a.f11254d = null;
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        SettingsChimeraActivity.f11252b.mo25417e("Could not determine initial account to display for Better Together settings.", th, new Object[0]);
        jsw.m17254a().mo14033a(th);
        this.f23181a.f11254d = null;
    }
}
