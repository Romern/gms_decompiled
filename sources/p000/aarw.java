package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.util.Map;

/* renamed from: aarw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aarw extends aary {

    /* renamed from: j */
    private byte[] f56403j;

    public aarw(Context context, HelpConfig helpConfig, Account account, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, account, 1, str, listener, errorListener);
    }

    /* renamed from: f */
    private final void m46814f() {
        if (this.f56403j == null) {
            aash a = aash.m46863a();
            a.f56436a = this.f56407e;
            a.f56437b = this.f56408f;
            mo31678a(a);
            byte[] k = a.mo31708b().serializeToBytes();
            this.f56403j = k;
            try {
                this.f56403j = aatb.m46964a(k);
                ((aary) this).f56410h.put("Content-Encoding", "gzip");
            } catch (IOException e) {
                Log.e("gH_BasePostRequest", "Gzip HelpMobileRequest bytes failed.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31678a(aash aash) {
        throw null;
    }

    public final byte[] getBody() {
        m46814f();
        return this.f56403j;
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Map getHeaders() {
        m46814f();
        return ((aary) this).f56410h;
    }

    public aarw(Context context, HelpConfig helpConfig, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, 1, str, listener, errorListener);
    }
}
