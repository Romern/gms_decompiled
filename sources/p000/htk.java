package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: htk */
final /* synthetic */ class htk implements bmzi {

    /* renamed from: a */
    private final CredentialsSettingsChimeraActivity f20400a;

    /* renamed from: b */
    private final Account f20401b;

    /* renamed from: c */
    private final bmxv f20402c;

    public htk(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, Account account, bmxv bmxv) {
        this.f20400a = credentialsSettingsChimeraActivity;
        this.f20401b = account;
        this.f20402c = bmxv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gwh.a(android.accounts.Account, java.lang.String, boolean):aucb
     arg types: [android.accounts.Account, java.lang.String, int]
     candidates:
      rjx.a(int, java.lang.String, java.lang.String):aucb
      rjx.a(com.google.android.gms.location.internal.LocationRequestInternal, aehz, android.os.Looper):aucb
      rjx.a(java.lang.String, java.lang.String, byte[]):aucb
      rjx.a(com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean, boolean):aucb
      rjx.a(java.lang.String, int, int):rke
      rjx.a(android.app.Activity, int, asxx):void
      rjx.a(android.app.Activity, int, java.lang.String):void
      rjx.a(com.google.android.gms.location.internal.LocationRequestInternal, aehy, android.os.Looper):void
      rjx.a(java.lang.String, long, int):void
      artq.a(com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean, boolean):aucb
      gwh.a(android.accounts.Account, java.lang.String, boolean):aucb */
    /* renamed from: a */
    public final Object mo6606a() {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20400a;
        return adbb.m50100a(credentialsSettingsChimeraActivity.f10184e.mo12277a(this.f20401b, (String) this.f20402c.mo66814b(), false));
    }
}
