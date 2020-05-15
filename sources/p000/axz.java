package p000;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: axz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axz implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f2522a;

    /* renamed from: b */
    final /* synthetic */ String f2523b;

    public axz(Context context, String str) {
        this.f2522a = context;
        this.f2523b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x024f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x01f8=Splitter:B:60:0x01f8, B:71:0x023a=Splitter:B:71:0x023a} */
    public final /* bridge */ /* synthetic */ Object call() {
        C1240of ofVar;
        HttpURLConnection httpURLConnection;
        ayu ayu;
        bcq bcq;
        BufferedReader bufferedReader;
        ayu ayu2;
        bcq bcq2;
        bcs bcs = new bcs(this.f2522a, this.f2523b);
        bcr bcr = bcs.f3013b;
        boolean z = false;
        Object obj = null;
        try {
            String str = bcr.f3011b;
            File file = new File(bcr.f3010a.getCacheDir(), bcr.m2702a(str, bcq.JSON, false));
            if (!file.exists()) {
                file = new File(bcr.f3010a.getCacheDir(), bcr.m2702a(str, bcq.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (!file.getAbsolutePath().endsWith(".zip")) {
                    bcq2 = bcq.JSON;
                } else {
                    bcq2 = bcq.ZIP;
                }
                "Cache hit for " + bcr.f3011b + " at " + file.getAbsolutePath();
                int i = bek.f3084a;
                ofVar = new C1240of(bcq2, fileInputStream);
                if (ofVar != null) {
                    bcq bcq3 = (bcq) ofVar.f26798a;
                    InputStream inputStream = (InputStream) ofVar.f26799b;
                    if (bcq3 == bcq.ZIP) {
                        ayu2 = aye.m2426a(new ZipInputStream(inputStream), bcs.f3012a);
                    } else {
                        ayu2 = aye.m2424a(inputStream, bcs.f3012a);
                    }
                    Object obj2 = ayu2.f2600a;
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                if (obj == null) {
                    return new ayu(obj);
                }
                "Animation for " + bcs.f3012a + " not found in cache. Fetching from network.";
                int i2 = bek.f3084a;
                try {
                    "Fetching " + bcs.f3012a;
                    httpURLConnection = (HttpURLConnection) new URL(bcs.f3012a).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    try {
                        httpURLConnection.connect();
                        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                            String contentType = httpURLConnection.getContentType();
                            if (contentType == null) {
                                contentType = "application/json";
                            }
                            if (!contentType.contains("application/zip")) {
                                bcq = bcq.JSON;
                                ayu = aye.m2424a(new FileInputStream(new File(bcs.f3013b.mo2998a(httpURLConnection.getInputStream(), bcq).getAbsolutePath())), bcs.f3012a);
                            } else {
                                bcq = bcq.ZIP;
                                ayu = aye.m2426a(new ZipInputStream(new FileInputStream(bcs.f3013b.mo2998a(httpURLConnection.getInputStream(), bcq))), bcs.f3012a);
                            }
                            if (ayu.f2600a != null) {
                                bcr bcr2 = bcs.f3013b;
                                File file2 = new File(bcr2.f3010a.getCacheDir(), bcr.m2702a(bcr2.f3011b, bcq, true));
                                File file3 = new File(file2.getAbsolutePath().replace(".temp", ""));
                                "Copying temp file to real file (" + file3 + ")";
                                if (!file2.renameTo(file3)) {
                                    bek.m2805a("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + ".");
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("Completed fetch from network. Success: ");
                            if (ayu.f2600a != null) {
                                z = true;
                            }
                            sb.append(z);
                            sb.toString();
                            httpURLConnection.disconnect();
                            return ayu;
                        }
                        httpURLConnection.getResponseCode();
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb2.append(readLine);
                                sb2.append(10);
                            } else {
                                try {
                                    break;
                                } catch (Exception e) {
                                }
                            }
                        }
                        bufferedReader.close();
                        ayu = new ayu((Throwable) new IllegalArgumentException("Unable to fetch " + bcs.f3012a + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + sb2.toString()));
                        httpURLConnection.disconnect();
                        return ayu;
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e3) {
                        ayu = new ayu((Throwable) e3);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e4) {
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    return new ayu((Throwable) e5);
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    throw th2;
                }
            }
        } catch (FileNotFoundException e6) {
        }
        ofVar = null;
        if (ofVar != null) {
        }
        if (obj == null) {
        }
    }
}
