package p000;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: sha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sha extends she {

    /* renamed from: f */
    private final Class f44460f;

    /* renamed from: g */
    private final Object f44461g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public sha(int i, String str, Object obj, Class cls, Object obj2, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, int i2, int i3) {
        this(i, str, r4, cls, obj2, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        String str4;
        if (obj != null) {
            str4 = obj.toString();
        } else {
            str4 = null;
        }
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        Cache.Entry entry;
        sio sio;
        try {
            if (shouldCache()) {
                entry = HttpHeaderParser.parseCacheHeaders(networkResponse);
            } else {
                entry = null;
            }
            Object obj = this.f44461g;
            if (obj == null) {
                sio = (sio) this.f44460f.newInstance();
            } else {
                sio = (sio) this.f44460f.getConstructor(obj.getClass()).newInstance(this.f44461g);
            }
            int i = networkResponse.statusCode;
            sio.mo25615b(networkResponse.data);
            return Response.success(sio, entry);
        } catch (siy e) {
            return Response.error(new ParseError(e));
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (IllegalArgumentException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public sha(int i, String str, String str2, Class cls, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str3, String str4, boolean z, HashMap hashMap, int i2, int i3) {
        super(i, str, str2, listener, errorListener, str3, str4, z, hashMap, i2, i3);
        this.f44460f = cls;
        this.f44461g = obj;
    }
}
