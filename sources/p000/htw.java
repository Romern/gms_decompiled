package p000;

import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;

/* renamed from: htw */
final /* synthetic */ class htw implements bmxz {

    /* renamed from: a */
    private final htx f20421a;

    public htw(htx htx) {
        this.f20421a = htx;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        String str = (String) obj;
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20421a.f20422a;
        if (!qqt.m32668b(str)) {
            return false;
        }
        String a = qqt.m32667a(str);
        bmxv a2 = qqt.m32666a(credentialsSettingsChimeraActivity, qqt.m32669c(a));
        return a2.mo66813a() && ((String) a2.mo66814b()).equals(a);
    }
}
