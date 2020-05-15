package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: hqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hqb implements hep {

    /* renamed from: a */
    public final Context f20215a;

    /* renamed from: b */
    public final String f20216b;

    /* renamed from: c */
    public final CredentialRequest f20217c;

    public hqb(Context context, String str, CredentialRequest credentialRequest) {
        sdo.m34959a(context);
        this.f20215a = context;
        sdo.m34959a((Object) str);
        this.f20216b = str;
        sdo.m34959a(credentialRequest);
        this.f20217c = credentialRequest;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_LIST_CREDENTIALS_FOR_ENABLED_ACCOUNTS;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        return bqdx.m112674a(new hou(this.f20215a).mo12291a(hez), new hqa(this, hez), bqfb.INSTANCE);
    }
}
