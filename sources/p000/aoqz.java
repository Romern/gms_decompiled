package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: aoqz */
final /* synthetic */ class aoqz implements Callable {

    /* renamed from: a */
    private final aorb f78717a;

    /* renamed from: b */
    private final String f78718b;

    /* renamed from: c */
    private final long f78719c;

    /* renamed from: d */
    private final String f78720d;

    /* renamed from: e */
    private final Map f78721e;

    public aoqz(aorb aorb, String str, long j, String str2, Map map) {
        this.f78717a = aorb;
        this.f78718b = str;
        this.f78719c = j;
        this.f78720d = str2;
        this.f78721e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3 A[Catch:{ all -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00eb A[Catch:{ all -> 0x00f5 }] */
    public final Object call() {
        aorb aorb = this.f78717a;
        String str = this.f78718b;
        long j = this.f78719c;
        String str2 = this.f78720d;
        Map map = this.f78721e;
        String str3 = aorb.f78727e;
        String str4 = aorb.f78728f;
        bxvd da = bymy.f167088g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bymy bymy = (bymy) da.f164949b;
        str.getClass();
        bymy.f167090a = str;
        str3.getClass();
        bymy.f167091b = str3;
        bymy.f167092c = j;
        str2.getClass();
        bymy.f167093d = str2;
        str4.getClass();
        bymy.f167095f = str4;
        bxww bxww = bymy.f167094e;
        if (!bxww.f165014a) {
            bymy.f167094e = bxww.mo74203a();
        }
        bymy.f167094e.putAll(map);
        byte[] k = ((bymy) da.mo74062i()).serializeToBytes();
        HttpURLConnection httpURLConnection = null;
        try {
            String d = cghx.m145516d();
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
            sb.append(d);
            sb.append("/recaptcha/api3/ae");
            httpURLConnection = aoqr.m66289a(sb.toString(), 21506);
            try {
                httpURLConnection.setConnectTimeout((int) cghx.m145514b());
                httpURLConnection.setReadTimeout((int) cghx.m145515c());
                httpURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                httpURLConnection.setRequestProperty("Content-type", "application/x-protobuf");
                httpURLConnection.setRequestProperty("Content-Length", Integer.toString(k.length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(k);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String str5 = ((bymz) GeneratedMessageLite.m124011a(bymz.f167096b, httpURLConnection.getInputStream(), bxus.m123744c())).f167098a;
                    stp.m36307a(httpURLConnection);
                    return str5;
                }
                throw new aopo("Failed to fetch verification data", responseCode);
            } catch (IOException e) {
                e = e;
                try {
                    if (e instanceof MalformedURLException) {
                    }
                } catch (Throwable th) {
                    th = th;
                    stp.m36307a(httpURLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                stp.m36307a(httpURLConnection);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            if (e instanceof MalformedURLException) {
                throw new aoqt("Failed to connect to server to verify the action", e);
            }
            throw new aoqt(e.getMessage(), e);
        } catch (Throwable th3) {
            th = th3;
            stp.m36307a(httpURLConnection);
            throw th;
        }
    }
}
