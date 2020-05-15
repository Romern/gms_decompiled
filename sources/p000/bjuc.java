package p000;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import java.util.Map;

/* renamed from: bjuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuc extends bjtz {

    /* renamed from: d */
    public final Object f123332d;

    /* renamed from: e */
    protected final bjty f123333e;

    /* renamed from: f */
    private final bxxk f123334f;

    public bjuc(String str, bjty bjty, Object obj, bxxk bxxk, Response.Listener listener, Response.ErrorListener errorListener) {
        super(Uri.withAppendedPath(bjty.f123325a, str).toString(), listener, errorListener);
        this.f123333e = bjty;
        this.f123332d = obj;
        this.f123334f = bxxk;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bxxc], assign insn: 0x0000: IGET  (r0v0 ? I:java.lang.Object) = (r1v0 'this' bjuc A[THIS]) bjuc.d java.lang.Object */
    public final byte[] getBody() {
        return this.f123332d.mo73642k();
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Map getHeaders() {
        return this.f123333e.mo65532a();
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        bxxc bxxc;
        try {
            bxxk bxxk = this.f123334f;
            if (bxxk != null) {
                bxxc = bjvp.m104733a(networkResponse.data, bxxk);
                bjvp.m104739a(getUrl());
            } else {
                bxxc = null;
            }
            if (bxxc != null) {
                return Response.success(Pair.create(this, bxxc), HttpHeaderParser.parseCacheHeaders(networkResponse));
            }
            throw new RuntimeException("Failed to create proto object, no class or parser available");
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class) {
                String valueOf = String.valueOf(getUrl());
                Log.e("ProtoRequest", valueOf.length() == 0 ? new String("Couldn't parse proto response for url=") : "Couldn't parse proto response for url=".concat(valueOf));
                return Response.error(new ParseError(networkResponse));
            }
            throw e;
        }
    }
}
