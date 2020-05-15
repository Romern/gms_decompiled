package com.google.android.gms.ads.identifier;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.ads.identifier.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0273e {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r3 >= 300) goto L_0x001c;
     */
    /* renamed from: a */
    public static final void m5157a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200) {
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("Received non-success response code ");
            sb.append(responseCode);
            sb.append(" from pinging URL: ");
            sb.append(str);
            Log.w("HttpUrlPinger", sb.toString());
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (IOException | RuntimeException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
