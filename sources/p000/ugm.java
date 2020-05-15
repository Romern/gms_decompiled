package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

/* renamed from: ugm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugm implements Closeable {

    /* renamed from: b */
    private static final sbw f47546b = new sbw("HttpMultipartRequest", "");

    /* renamed from: a */
    public int f47547a;

    /* renamed from: c */
    private final Context f47548c;

    /* renamed from: d */
    private final String f47549d;

    /* renamed from: e */
    private vfj f47550e;

    /* renamed from: f */
    private boolean f47551f = false;

    /* renamed from: g */
    private vej f47552g;

    /* renamed from: h */
    private final vew f47553h;

    /* renamed from: i */
    private final sie f47554i;

    public ugm(Context context, URL url, String str, ClientContext clientContext, vfk vfk) {
        this.f47548c = context;
        vfj a = vfk.mo28349a(url);
        this.f47550e = a;
        try {
            this.f47553h = a.mo28347b();
            char[] cArr = new char[20];
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                cArr[i] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(64));
            }
            this.f47549d = new String(cArr);
            HttpURLConnection a2 = this.f47550e.mo28346a();
            a2.setChunkedStreamingMode(0);
            a2.setRequestMethod(str);
            String str2 = this.f47549d;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 30);
            sb.append("multipart/related; boundary=\"");
            sb.append(str2);
            sb.append("\"");
            a2.setRequestProperty("Content-Type", sb.toString());
            a2.setRequestProperty("Host", url.getHost());
            a2.setRequestProperty("Connection", "close");
            this.f47554i = ufb.m38262a(a2, clientContext, this.f47548c);
            a2.setDoOutput(true);
        } catch (Exception e) {
            this.f47550e.close();
            throw e;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: g */
    private final void m38340g() {
        sdo.m34971a(this.f47551f, (Object) "Request not executed");
    }

    /* renamed from: a */
    public final int mo27334a() {
        boolean z;
        mo27345f();
        vej e = mo27344e();
        String str = this.f47549d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("\r\n--");
        sb.append(str);
        sb.append("--\r\n");
        e.mo28350a(sb.toString());
        mo27344e().close();
        if (this.f47547a > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        this.f47551f = true;
        int responseCode = this.f47550e.mo28346a().getResponseCode();
        if (responseCode != 401) {
            return responseCode;
        }
        this.f47554i.mo25587c(this.f47548c);
        return ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
    }

    /* renamed from: b */
    public final InputStream mo27338b() {
        mo27345f();
        m38340g();
        return this.f47550e.mo28346a().getInputStream();
    }

    /* renamed from: c */
    public final InputStream mo27340c() {
        mo27345f();
        m38340g();
        return this.f47550e.mo28346a().getErrorStream();
    }

    public final void close() {
        if (this.f47550e != null) {
            try {
                mo27344e().close();
            } catch (IOException e) {
                f47546b.mo25373b("HttpMultipartRequest", "Unable to close output stream", e);
            }
            this.f47550e.close();
            this.f47550e = null;
        }
    }

    /* renamed from: d */
    public final long mo27343d() {
        return mo27344e().f49120a;
    }

    /* renamed from: e */
    public final vej mo27344e() {
        if (this.f47552g == null) {
            this.f47552g = new vej(this.f47550e.mo28346a().getOutputStream(), this.f47553h);
        }
        return this.f47552g;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: f */
    public final void mo27345f() {
        sdo.m34971a(this.f47550e != null, (Object) "Connection already closed");
    }

    /* renamed from: b */
    public final void mo27339b(String str) {
        sdo.m34959a((Object) str);
        StringBuilder sb = new StringBuilder();
        if (this.f47547a != 0) {
            sb.append("\r\n");
        }
        sb.append("--");
        sb.append(this.f47549d);
        sb.append("\r\nContent-Type: ");
        sb.append(str);
        sb.append("\r\n\r\n");
        mo27344e().mo28350a(sb.toString());
    }

    /* renamed from: c */
    public final void mo27341c(String str) {
        mo27345f();
        try {
            mo27337a("application/json; charset=UTF-8", str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IOException("Unable to encode metadata", e);
        }
    }

    /* renamed from: a */
    public final String mo27335a(String str) {
        mo27345f();
        m38340g();
        return this.f47550e.mo28346a().getHeaderField(str);
    }

    /* renamed from: a */
    public final void mo27336a(String str, String str2) {
        mo27345f();
        this.f47550e.mo28346a().setRequestProperty(str, str2);
    }

    /* renamed from: a */
    public final void mo27337a(String str, byte[] bArr) {
        mo27345f();
        mo27339b(str);
        mo27344e().write(bArr);
        this.f47547a++;
        int length = bArr.length;
    }
}
