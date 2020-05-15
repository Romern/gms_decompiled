package com.google.android.gms.ads.internal.util.client;

import com.felicanetworks.mfc.Felica;
import com.google.android.gms.ads.internal.client.C0341h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.ads.internal.util.client.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0637l {

    /* renamed from: a */
    private final String f8968a;

    public C0637l() {
        this(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r4 >= 300) goto L_0x005e;
     */
    /* renamed from: a */
    public final void mo6817a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            String valueOf = String.valueOf(str);
            C0633h.m5664a(valueOf.length() == 0 ? new String("Pinging URL: ") : "Pinging URL: ".concat(valueOf));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            C0341h.m5274a();
            String str2 = this.f8968a;
            httpURLConnection.setConnectTimeout(Felica.MAX_TIMEOUT);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setReadTimeout(Felica.MAX_TIMEOUT);
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setUseCaches(false);
            C0632g gVar = new C0632g();
            gVar.mo6813a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            gVar.mo6812a(httpURLConnection, responseCode);
            if (responseCode < 200) {
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("Received non-success response code ");
            sb.append(responseCode);
            sb.append(" from pinging URL: ");
            sb.append(str);
            C0633h.m5672d(sb.toString());
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            C0633h.m5672d(sb2.toString());
        } catch (IOException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            C0633h.m5672d(sb3.toString());
        } catch (RuntimeException e3) {
            String message3 = e3.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message3);
            C0633h.m5672d(sb4.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public C0637l(String str) {
        this.f8968a = str;
    }
}
