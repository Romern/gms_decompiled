package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.wallet.p097ui.document.DownloadedDocument;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: bkhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkhu extends Request {

    /* renamed from: d */
    protected final C1223np f124248d = new C1223np();

    /* renamed from: e */
    private final bkht f124249e;

    /* renamed from: f */
    private final Account f124250f;

    /* renamed from: g */
    private final String f124251g;

    /* renamed from: h */
    private final Context f124252h;

    /* renamed from: i */
    private final Response.Listener f124253i;

    public bkhu(bkht bkht, Account account, String str, Context context, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, bkht.f124244b, errorListener);
        this.f124249e = bkht;
        this.f124250f = account;
        this.f124251g = str;
        this.f124252h = context;
        this.f124253i = listener;
        mo52942b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52942b() {
        this.f124248d.put("Content-Type", DataParser.CONTENT_TYPE_VALUE);
        this.f124248d.put("X-Modality", "ANDROID_NATIVE");
        this.f124248d.put("X-Version", Integer.toString(201515000));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f124253i.onResponse((DownloadedDocument) obj);
    }

    public final byte[] getBody() {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("request", this.f124249e.f124245c);
        builder.appendQueryParameter("requestContentType", "application/byte-data");
        return builder.build().getEncodedQuery().getBytes();
    }

    public final String getBodyContentType() {
        return DataParser.CONTENT_TYPE_VALUE;
    }

    public final Map getHeaders() {
        try {
            this.f124248d.put("Authorization", new bjev(this.f124251g, gie.m13187a(this.f124252h, this.f124250f, this.f124251g)).mo65066a());
            return this.f124248d;
        } catch (gid | IOException e) {
            throw new AuthFailureError("Auth error", e);
        }
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str;
        try {
            String str2 = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"));
            if (networkResponse.headers.containsKey("Content-Type")) {
                str = (String) networkResponse.headers.get("Content-Type");
            } else {
                str = "text/html; charset=utf-8";
            }
            return Response.success(new DownloadedDocument(str2, str), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }
    }
}
