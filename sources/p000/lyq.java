package p000;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* renamed from: lyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lyq {

    /* renamed from: a */
    private static final lvn f33208a = new lvn("GetRequest");

    protected lyq() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* renamed from: a */
    public final Object mo19750a(Context context, String str, String str2) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream errorStream;
        try {
            httpURLConnection = lzy.m24743a(context, new URL(mo19746a()));
            try {
                httpURLConnection.setRequestMethod("GET");
                String valueOf = String.valueOf(str);
                httpURLConnection.setRequestProperty("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
                httpURLConnection.setRequestProperty("Content-Type", str2);
                httpURLConnection.setDoInput(true);
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    f33208a.logVerbose("HTTP GET response code: %d", Integer.valueOf(httpURLConnection.getResponseCode()));
                    if (httpURLConnection.getResponseCode() != 200) {
                        errorStream = httpURLConnection.getErrorStream();
                        String str3 = new String(boav.m111020a(errorStream), StandardCharsets.UTF_8);
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        throw new mbf(str3.length() == 0 ? new String("Server rejected http request: ") : "Server rejected http request: ".concat(str3), httpURLConnection.getResponseCode());
                    } else if (inputStream != null) {
                        Object a = mo19745a(inputStream);
                        inputStream.close();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return a;
                    } else {
                        throw new IOException("HTTP GET is missing response body");
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
                throw th;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo19745a(InputStream inputStream);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo19746a();
}
