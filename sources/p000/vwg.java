package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: vwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwg {

    /* renamed from: a */
    private static final String f50132a;

    static {
        StringBuilder sb = new StringBuilder(22);
        sb.append("DroidGuard/201515033");
        f50132a = sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: a */
    public static ByteString m41486a(String str, ByteString bxtx) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) stp.m36306a(new URL(str), 6147);
            try {
                ByteString a = m41488a(httpURLConnection, bxtx);
                if (httpURLConnection != null) {
                    stp.m36307a(httpURLConnection);
                }
                return a;
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    stp.m36307a(httpURLConnection);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static String m41490b(Context context) {
        if (sre.m36080a(context)) {
            String a = stn.m36304a("gms.droidguard.sw_domain", "");
            if (a.length() > 0) {
                String valueOf = String.valueOf(a);
                return valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
            }
        }
        return cdrb.f181587a.mo6606a().mo78201a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: a */
    public static ByteString m41487a(String str, ByteString bxtx, abpc abpc) {
        HttpURLConnection httpURLConnection;
        if (abpc == null) {
            try {
                httpURLConnection = (HttpURLConnection) stp.m36306a(new URL(str), 6147);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            httpURLConnection = (HttpURLConnection) abpc.f57830a.openConnection(new URL(str));
        }
        try {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
            ByteString a = m41488a(httpURLConnection, bxtx);
            if (httpURLConnection != null) {
                stp.m36307a(httpURLConnection);
            }
            return a;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection != null) {
                stp.m36307a(httpURLConnection);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static ByteString m41488a(HttpURLConnection httpURLConnection, ByteString bxtx) {
        InputStream inputStream;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(bxtx.mo73744a());
        httpURLConnection.setRequestProperty("User-Agent", f50132a);
        httpURLConnection.setConnectTimeout((int) cdrh.f181595a.mo6606a().mo78208b());
        httpURLConnection.setReadTimeout((int) cdrh.f181595a.mo6606a().mo78209c());
        shr.m35316b(6147);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            bxtx.mo73757a(outputStream);
            outputStream.flush();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                inputStream = httpURLConnection.getInputStream();
                ByteString a = bxtx.m123256a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
                shr.m35312a();
                return a;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Received status code [");
            sb.append(responseCode);
            sb.append("] instead of [");
            sb.append((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
            sb.append("].");
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            shr.m35312a();
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public static void m41489a(Context context) {
        context.getSystemService("connectivity");
    }
}
