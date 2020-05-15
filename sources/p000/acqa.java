package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: acqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqa implements acqb {

    /* renamed from: a */
    public final Context f60460a;

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0146, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0147, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0146 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x00c6] */
    /* renamed from: a */
    public final String mo33011a(String str, String str2, Pair... pairArr) {
        String str3;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        BufferedReader bufferedReader;
        String str4;
        String str5 = (String) abzt.f59005y.mo58455c();
        String str6 = null;
        str6 = null;
        str6 = null;
        str6 = null;
        str6 = null;
        HttpURLConnection httpURLConnection2 = null;
        if (TextUtils.isEmpty(str)) {
            absg.m48201d("Account name is empty or null");
            str3 = null;
        } else {
            if (rfy.m33543a()) {
                str4 = "<redacted>";
            } else {
                str4 = str;
            }
            absg.m48203d("Attempting to get auth token for scope/account:%s/%s", str5, str4);
            try {
                str3 = gie.m13189a(this.f60460a, str, str5);
            } catch (gid e) {
                absg.m48207e("Failed to get auth token for account:%s, error:%s", str4, e.getMessage());
                str3 = null;
            } catch (IOException e2) {
                absg.m48207e("Failed to get auth token for account:%s, error:%s", str4, e2.getMessage());
                str3 = null;
            }
        }
        Uri.Builder buildUpon = Uri.parse((String) abzt.f59006z.mo58455c()).buildUpon();
        buildUpon.appendEncodedPath(str2);
        Pair pair = pairArr[0];
        buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        String uri = buildUpon.build().toString();
        if (TextUtils.isEmpty(uri) || !uri.startsWith("https")) {
            uri = null;
        }
        if (str3 == null || uri == null) {
            return null;
        }
        try {
            httpURLConnection = (HttpURLConnection) stp.m36306a(new URL(uri), 12800);
            if (!TextUtils.isEmpty(str3)) {
                httpURLConnection.addRequestProperty("Authorization", str3.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str3));
            }
            httpURLConnection.setRequestProperty("User-Agent", stm.m36299a(System.getProperty("http.agent")));
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            try {
                httpURLConnection.setRequestProperty("X-Developer-Key", (String) abzt.f58833A.mo58455c());
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        absg.m48206e("Failed to get response, status code %d", Integer.valueOf(responseCode));
                        if (httpURLConnection != null) {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                errorStream.close();
                            }
                        }
                        stp.m36307a(httpURLConnection);
                        return str6;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    str6 = sb.toString();
                    if (httpURLConnection != null) {
                        InputStream errorStream2 = httpURLConnection.getErrorStream();
                        if (errorStream2 != null) {
                            errorStream2.close();
                        }
                    }
                    stp.m36307a(httpURLConnection);
                    return str6;
                } catch (Throwable th) {
                    if (httpURLConnection != null) {
                        InputStream errorStream3 = httpURLConnection.getErrorStream();
                        if (errorStream3 != null) {
                            errorStream3.close();
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = null;
            try {
                absg.m48192b("Failed to send request: %s", e.getMessage());
                stp.m36307a(httpURLConnection);
                return str6;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
            }
        } catch (Throwable th4) {
            th = th4;
            stp.m36307a(httpURLConnection2);
            throw th;
        }
    }

    public acqa(Context context) {
        this.f60460a = context;
    }
}
