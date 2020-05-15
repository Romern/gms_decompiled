package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;

/* renamed from: hfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hfj implements hep {

    /* renamed from: a */
    private final Context f19657a;

    /* renamed from: b */
    private final String f19658b;

    public hfj(Context context, String str, String str2, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        sdo.m34959a(context);
        this.f19657a = context;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f19658b = str2;
        sdo.m34959a(saveAccountLinkingTokenRequest);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_SAVE_ACCOUNT_LINKING_TOKEN;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        String str = this.f19658b;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.SAVE_ACCOUNT_LINKING_TOKEN").setPackage("com.google.android.gms");
        intent.putExtra("session_id", str);
        Context context = this.f19657a;
        int i = Build.VERSION.SDK_INT;
        return bqga.m112775a(new SaveAccountLinkingTokenResult(spn.m35844a(context, intent, 1275068416)));
    }
}
