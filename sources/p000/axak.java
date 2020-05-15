package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.Response;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: axak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axak extends bkhu implements NetworkCallbacks {
    public axak(bkht bkht, Account account, String str, Context context, Response.Listener listener, Response.ErrorListener errorListener) {
        super(bkht, account, str, context, listener, errorListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52942b() {
        ((bkhu) this).f124248d.put("Content-Type", DataParser.CONTENT_TYPE_VALUE);
        ((bkhu) this).f124248d.put("X-Modality", "ANDROID_NATIVE");
        ((bkhu) this).f124248d.put("X-Version", Integer.toString(201515033));
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(6912);
    }
}
