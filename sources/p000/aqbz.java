package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* renamed from: aqbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbz {

    /* renamed from: a */
    public final Context f85623a;

    /* renamed from: b */
    private final aqbr f85624b;

    static {
        aqbz.class.getSimpleName();
    }

    public aqbz(Context context, ExecutorService executorService) {
        this.f85623a = context;
        this.f85624b = new aqbr(context, executorService);
    }

    /* renamed from: a */
    public final aqcd mo47751a() {
        bxvd da = aqcd.f85638d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqcd aqcd = (aqcd) da.f164949b;
        "GmsCore".getClass();
        aqcd.f85640a |= 1;
        aqcd.f85641b = "GmsCore";
        String num = Integer.toString(201515033);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqcd aqcd2 = (aqcd) da.f164949b;
        num.getClass();
        aqcd2.f85640a |= 2;
        aqcd2.f85642c = num;
        return (aqcd) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        if (r7 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        p000.stp.m36307a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        p000.shr.m35312a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0121, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        if (r7 != null) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012d A[SYNTHETIC, Splitter:B:60:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A[SYNTHETIC, Splitter:B:70:0x0140] */
    /* renamed from: a */
    public final byte[] mo47752a(int i, byte[] bArr, String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Throwable th;
        String str2;
        if (i != 1) {
            shr.m35316b(6149);
        } else {
            shr.m35316b(6148);
        }
        InputStream inputStream2 = null;
        try {
            String encodeToString = Base64.encodeToString(bArr, 11);
            if (i != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 94 + String.valueOf(str).length());
                sb.append("https://safebrowsing.googleapis.com/v4/fullHashes:find?$ct=application%2Fx-protobuf&$req=");
                sb.append(encodeToString);
                sb.append("&key=");
                sb.append(str);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(encodeToString).length() + 102 + String.valueOf(str).length());
                sb2.append("https://safebrowsing.googleapis.com/v4/threatListUpdates:fetch?$ct=application%2Fx-protobuf&$req=");
                sb2.append(encodeToString);
                sb2.append("&key=");
                sb2.append(str);
                str2 = sb2.toString();
            }
            URL url = new URL(str2);
            if (!cgkt.m145934f()) {
                httpURLConnection = (HttpURLConnection) stp.m36306a(url, 6148);
            } else {
                shr.m35316b(6148);
                httpURLConnection = (HttpURLConnection) new PlayServicesCronetProvider(this.f85623a).createBuilder().build().openConnection(url);
            }
            try {
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
                if (i == 2) {
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(3000);
                }
                String a = this.f85624b.mo47742a();
                if (!TextUtils.isEmpty(a)) {
                    httpURLConnection.setRequestProperty("Cookie", a);
                }
                httpURLConnection.setRequestProperty("X-HTTP-Method-Override", DataParser.CONNECT_TYPE_POST);
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read < 0) {
                                break;
                            } else if (read > 0) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        this.f85624b.mo47743a(httpURLConnection.getHeaderFields().get("Set-Cookie"));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                            }
                        }
                        if (httpURLConnection != null) {
                            stp.m36307a(httpURLConnection);
                        }
                        shr.m35312a();
                        return byteArray;
                    } catch (IOException e2) {
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        shr.m35312a();
                        throw th;
                    }
                }
            } catch (IOException e3) {
                inputStream = null;
                if (inputStream != null) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                }
                if (httpURLConnection != null) {
                }
                shr.m35312a();
                throw th;
            }
        } catch (IOException e4) {
            inputStream = null;
            httpURLConnection = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e6) {
                }
            }
            if (httpURLConnection != null) {
                stp.m36307a(httpURLConnection);
            }
            shr.m35312a();
            throw th;
        }
    }
}
