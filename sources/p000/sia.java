package p000;

import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: sia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sia extends Request implements NetworkCallbacks {

    /* renamed from: d */
    final int f44518d;

    /* renamed from: e */
    private final byte[] f44519e;

    /* renamed from: f */
    private final Response.Listener f44520f;

    /* renamed from: g */
    private final Object f44521g;

    /* renamed from: h */
    private final HashMap f44522h;

    /* renamed from: i */
    private final int f44523i;

    public sia(int i, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, int i2, int i3) {
        super(i, str, errorListener);
        this.f44520f = listener;
        this.f44519e = bArr;
        this.f44521g = obj;
        this.f44522h = hashMap;
        shb.m35264a(hashMap, str2, str3);
        this.f44522h.put("Accept-Encoding", "gzip");
        setShouldCache(z);
        this.f44518d = i2;
        this.f44523i = i3;
    }

    public void deliverResponse(Object obj) {
        this.f44520f.onResponse(obj);
    }

    public final byte[] getBody() {
        return this.f44519e;
    }

    public String getBodyContentType() {
        return "application/x-protobuf";
    }

    public final Map getHeaders() {
        return this.f44522h;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35313a(this.f44518d, this.f44523i);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, bxxc], assign insn: 0x0044: IGET  (r1v2 ? I:java.lang.Object) = (r7v0 'this' sia A[THIS]) sia.g java.lang.Object */
    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Cache.Entry entry;
        try {
            if (shouldCache()) {
                entry = HttpHeaderParser.parseCacheHeaders(networkResponse);
            } else {
                entry = null;
            }
            byte[] bArr = networkResponse.data;
            if (srz.m36173a(bArr)) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                byte[] bArr2 = new byte[4096];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = gZIPInputStream.read(bArr2, 0, 4096);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                bArr = byteArray;
            }
            ? r1 = this.f44521g;
            if (r1 instanceof bxxc) {
                return Response.success(r1.mo73645aM().mo73624a(bArr, bxus.m123744c()).mo74062i(), entry);
            }
            throw new IllegalStateException("Invalid ProtoType provided.");
        } catch (IOException e) {
            Log.e("ProtiaryRequest", "Unable to parse the network response", e);
            return Response.error(new ParseError(e));
        }
    }
}
