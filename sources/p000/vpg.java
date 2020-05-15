package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: vpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpg {

    /* renamed from: a */
    public static final sbw f49710a = new sbw("NetworkResponseErrorDec", "");

    /* renamed from: a */
    public static vpf m41003a(NetworkResponse networkResponse) {
        String str;
        ByteArrayInputStream byteArrayInputStream = null;
        if (!m41007a(networkResponse.statusCode)) {
            return null;
        }
        byte[] bArr = networkResponse.data;
        if (bArr != null) {
            Map map = networkResponse.headers;
            if (map != null) {
                str = (String) map.get("Content-Encoding");
            } else {
                str = null;
            }
            if (str == null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                } catch (IOException e) {
                    f49710a.mo25378c("NetworkResponseErrorDec", "Error while reading error response.", e);
                }
            } else if (str.equalsIgnoreCase("gzip")) {
                byteArrayInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            } else if (!str.equalsIgnoreCase("deflate")) {
                f49710a.mo25375b("Unsupported encoding: %s", str);
            } else {
                byteArrayInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            }
        }
        return m41004a(byteArrayInputStream);
    }

    /* renamed from: a */
    public static boolean m41007a(int i) {
        return i >= 400;
    }

    /* renamed from: a */
    public static vpf m41004a(InputStream inputStream) {
        String str = "";
        if (inputStream != null) {
            Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
            try {
                if (useDelimiter.hasNext()) {
                    str = useDelimiter.next();
                }
            } finally {
                useDelimiter.close();
            }
        }
        return new vpf(str);
    }

    /* renamed from: a */
    public static void m41005a(int i, vpf vpf) {
        if (vpf != null && vpf.f49705b != null) {
            f49710a.mo25375b("StatusCode:%d Reason:[%s] Location:[%s]", Integer.valueOf(i), vpf.f49705b, vpf.f49707d);
        }
    }

    /* renamed from: a */
    public static void m41006a(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            m41005a(volleyError.networkResponse.statusCode, m41003a(networkResponse));
        }
    }
}
