package p000;

import android.content.Context;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;

/* renamed from: asbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asbh implements sdp {

    /* renamed from: a */
    final /* synthetic */ Context f88652a;

    /* renamed from: b */
    final /* synthetic */ String f88653b;

    /* renamed from: c */
    final /* synthetic */ String f88654c;

    /* renamed from: d */
    final /* synthetic */ String f88655d;

    /* renamed from: e */
    final /* synthetic */ String f88656e;

    public asbh(Context context, String str, String str2, String str3, String str4) {
        this.f88652a = context;
        this.f88653b = str;
        this.f88654c = str2;
        this.f88655d = str3;
        this.f88656e = str4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo17022a(Object obj) {
        Integer num = (Integer) obj;
        Context context = this.f88652a;
        if (arpt.m73279a(context, this.f88653b, this.f88654c, this.f88655d, this.f88656e, arpt.m73276a(context, "com.google"))) {
            AccountChallengeWebView.f108239a.mo25409a("Successfully updated account with credential", new Object[0]);
            return false;
        }
        AccountChallengeWebView.f108239a.mo25409a("Upserting with credentials failed", new Object[0]);
        return true;
    }
}
