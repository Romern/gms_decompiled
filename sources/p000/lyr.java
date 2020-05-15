package p000;

import android.content.Context;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* renamed from: lyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lyr {

    /* renamed from: a */
    private static final lvn f33209a = new lvn("PostRequest");

    protected lyr() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c2  */
    /* renamed from: a */
    public final Object mo19751a(Context context, byte[] bArr, String str, String str2) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        DataOutputStream dataOutputStream = null;
        try {
            httpURLConnection = lzy.m24743a(context, new URL(mo19744a()));
            try {
                httpURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                String valueOf = String.valueOf(str);
                httpURLConnection.setRequestProperty("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
                httpURLConnection.setRequestProperty("Content-Type", str2);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream2.write(bArr);
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                    inputStream = httpURLConnection.getInputStream();
                    int responseCode = httpURLConnection.getResponseCode();
                    f33209a.mo25409a("Http Response Code: %d", Integer.valueOf(responseCode));
                    if (responseCode != 200) {
                        String str3 = new String(boav.m111020a(httpURLConnection.getErrorStream()), StandardCharsets.UTF_8);
                        throw new mbf(str3.length() == 0 ? new String("Server rejected http request: ") : "Server rejected http request: ".concat(str3), responseCode);
                    } else if (inputStream != null) {
                        Object a = mo19743a(inputStream);
                        inputStream.close();
                        srz.m36171a((Closeable) null);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return a;
                    } else {
                        throw new IOException("Missing response body");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    srz.m36171a(dataOutputStream);
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                srz.m36171a(dataOutputStream);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            srz.m36171a(dataOutputStream);
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo19743a(InputStream inputStream);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo19744a();
}
