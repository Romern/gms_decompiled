package p000;

import android.os.SystemClock;
import android.util.JsonReader;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* renamed from: vkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkz extends sha {

    /* renamed from: f */
    private static final sbw f49425f = new sbw("DriveApiaryRequest", "");

    /* renamed from: g */
    private final Request.Priority f49426g;

    /* renamed from: h */
    private final vbo f49427h;

    public vkz(int i, String str, Class cls, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, Request.Priority priority, vbo vbo, int i2, int i3) {
        super(i, str, (String) null, cls, (Object) null, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        sdo.m34959a(priority);
        this.f49426g = priority;
        sdo.m34959a(vbo);
        this.f49427h = vbo;
    }

    public final Request.Priority getPriority() {
        return this.f49426g;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        InputStream a;
        String str;
        SystemClock.elapsedRealtime();
        if (this.f49427h != null) {
            try {
                a = sio.m35367a(networkResponse.data);
                JsonReader jsonReader = new JsonReader(new InputStreamReader(a));
                jsonReader.beginObject();
                while (true) {
                    if (!jsonReader.hasNext()) {
                        str = null;
                        break;
                    } else if (jsonReader.nextName().equals("nextPageToken")) {
                        str = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                srz.m36171a((Closeable) a);
                this.f49427h.f48934a.mo69138b(str);
            } catch (Exception e) {
                f49425f.mo25378c("DriveApiaryRequest", "Could not find next page token in final result", e);
                return Response.error(new ParseError(networkResponse));
            } catch (Throwable th) {
                srz.m36171a((Closeable) a);
                throw th;
            }
        }
        return super.parseNetworkResponse(networkResponse);
    }

    public vkz(int i, String str, Object obj, Class cls, Object obj2, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, Request.Priority priority, int i2, int i3) {
        super(i, str, obj, cls, obj2, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        sdo.m34959a(priority);
        this.f49426g = priority;
        this.f49427h = null;
    }
}
