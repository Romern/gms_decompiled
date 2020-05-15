package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: aavi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f56649a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f56650b;

    /* renamed from: c */
    final /* synthetic */ List f56651c;

    /* renamed from: d */
    final /* synthetic */ Response.Listener f56652d;

    /* renamed from: e */
    final /* synthetic */ Response.ErrorListener f56653e;

    /* renamed from: f */
    final /* synthetic */ abcr f56654f;

    public aavi(Context context, HelpConfig helpConfig, List list, Response.Listener listener, Response.ErrorListener errorListener, abcr abcr) {
        this.f56649a = context;
        this.f56650b = helpConfig;
        this.f56651c = list;
        this.f56652d = listener;
        this.f56653e = errorListener;
        this.f56654f = abcr;
    }

    public final void run() {
        int i = aavj.f56655j;
        aavj aavj = new aavj(this.f56649a, this.f56650b, Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78968aI()).appendQueryParameter("hl", aasw.m46952a()).build().toString(), this.f56651c, this.f56652d, this.f56653e);
        aavj.mo31679a(20, this.f56654f);
        aavj.mo31684e();
    }
}
