package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.io.IOException;
import java.net.HttpCookie;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: reg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class reg implements rec {

    /* renamed from: e */
    private static final Pattern f42796e = Pattern.compile("[^,;\\s\"]+");

    /* renamed from: a */
    public final rbp f42797a;

    /* renamed from: b */
    private final Context f42798b;

    /* renamed from: c */
    private final String f42799c;

    /* renamed from: d */
    private volatile CronetEngine f42800d;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x022e  */
    /* renamed from: a */
    public final reb mo24537a(caik caik, rea rea, String str, String str2) {
        String str3;
        String str4;
        GZIPOutputStream gZIPOutputStream;
        if (this.f42800d == null) {
            synchronized (this) {
                if (this.f42800d == null) {
                    this.f42800d = rpr.m34216b().getCronetEngine();
                }
            }
        }
        URL url = new URL(this.f42799c);
        if (cdej.m132799e() || "https".equals(url.getProtocol())) {
            this.f42797a.mo24443a(caik);
            rea.mo24539a(SystemClock.elapsedRealtime(), System.currentTimeMillis());
            ConditionVariable conditionVariable = new ConditionVariable();
            AtomicReference atomicReference = new AtomicReference();
            bxtv m = ByteString.m123270m();
            Object obj = new Object();
            UrlRequest.Builder newUrlRequestBuilder = this.f42800d.newUrlRequestBuilder(this.f42799c, new red(m, atomicReference, conditionVariable), bqfb.INSTANCE);
            ((ExperimentalUrlRequest.Builder) newUrlRequestBuilder).addRequestAnnotation(obj);
            newUrlRequestBuilder.setHttpMethod(DataParser.CONNECT_TYPE_POST);
            newUrlRequestBuilder.addHeader("Content-Encoding", "gzip");
            newUrlRequestBuilder.addHeader("Content-Type", "application/x-gzip");
            if (str != null && !str.isEmpty()) {
                newUrlRequestBuilder.addHeader("Authorization", str);
            }
            if (str2 != null && !str2.isEmpty()) {
                newUrlRequestBuilder.addHeader("X-SERVER-TOKEN", str2);
            }
            if (!caik.f174722j) {
                str4 = aooo.m66219b(this.f42798b).f83468a;
                if (cdej.m132806l()) {
                    str3 = str4;
                    str4 = bmxx.m108578b(str4);
                } else if (str4 == null) {
                    str3 = str4;
                    str4 = "\"\"";
                } else if (!f42796e.matcher(str4).matches()) {
                    StringBuilder sb = new StringBuilder(str4.length() + 2);
                    sb.append("\"");
                    sb.append(str4);
                    sb.append("\"");
                    str3 = str4;
                    str4 = sb.toString();
                }
                String valueOf = String.valueOf(str4);
                newUrlRequestBuilder.addHeader("Cookie", valueOf.length() != 0 ? new String("NID=") : "NID=".concat(valueOf));
                newUrlRequestBuilder.allowDirectExecutor();
                bxtv m2 = ByteString.m123270m();
                gZIPOutputStream = new GZIPOutputStream(m2);
                gZIPOutputStream.write(rea.mo24544e());
                gZIPOutputStream.close();
                ByteString a = m2.mo73765a();
                this.f42797a.mo24445a(caik, (long) a.mo73744a());
                newUrlRequestBuilder.setUploadDataProvider(new ree(a), bqfb.INSTANCE);
                UrlRequest build = newUrlRequestBuilder.build();
                ((ExperimentalCronetEngine) this.f42800d).addRequestFinishedListener(new C1590ref(this, bqfb.INSTANCE, obj, caik, a));
                build.start();
                if (!conditionVariable.block((long) Math.max((int) cdej.m132804j(), 30000))) {
                    Object obj2 = atomicReference.get();
                    if (!(obj2 instanceof CronetException)) {
                        UrlResponseInfo urlResponseInfo = (UrlResponseInfo) atomicReference.get();
                        this.f42797a.mo24440a(urlResponseInfo.getHttpStatusCode());
                        List<String> list = (List) urlResponseInfo.getAllHeaders().get("Set-Cookie");
                        if (list != null) {
                            for (String str5 : list) {
                                Iterator it = bnkn.m109666a((List) HttpCookie.parse(str5)).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    HttpCookie httpCookie = (HttpCookie) it.next();
                                    if (httpCookie.getName().equals("NID") && httpCookie.getValue() != null) {
                                        if (cdej.m132800f()) {
                                            aood c = aooe.m66192c();
                                            c.f78604b = str3;
                                            c.f78603a = httpCookie.getValue();
                                            if (!aoop.m66223a(c.mo43121a(), this.f42798b)) {
                                                Log.e("CronetTransport", "Error in PseudonymousId compareAndSet() operation");
                                                this.f42797a.mo24439a();
                                            }
                                        } else {
                                            aoop.m66225a(new PseudonymousIdToken(httpCookie.getValue()), this.f42798b);
                                        }
                                    }
                                }
                            }
                        }
                        return new reb(m.mo73765a().getKey(), urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getHttpStatusText());
                    }
                    throw new IOException((CronetException) obj2);
                }
                build.cancel();
                throw new SocketTimeoutException();
            }
            str4 = "ANONYMOUS";
            str3 = str4;
            String valueOf2 = String.valueOf(str4);
            newUrlRequestBuilder.addHeader("Cookie", valueOf2.length() != 0 ? new String("NID=") : "NID=".concat(valueOf2));
            newUrlRequestBuilder.allowDirectExecutor();
            bxtv m22 = ByteString.m123270m();
            gZIPOutputStream = new GZIPOutputStream(m22);
            try {
                gZIPOutputStream.write(rea.mo24544e());
                gZIPOutputStream.close();
                ByteString a2 = m22.mo73765a();
                this.f42797a.mo24445a(caik, (long) a2.mo73744a());
                newUrlRequestBuilder.setUploadDataProvider(new ree(a2), bqfb.INSTANCE);
                UrlRequest build2 = newUrlRequestBuilder.build();
                ((ExperimentalCronetEngine) this.f42800d).addRequestFinishedListener(new C1590ref(this, bqfb.INSTANCE, obj, caik, a2));
                build2.start();
                if (!conditionVariable.block((long) Math.max((int) cdej.m132804j(), 30000))) {
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            String valueOf3 = String.valueOf(this.f42799c);
            throw new IllegalStateException(valueOf3.length() == 0 ? new String("Abort attempt to upload logs in plaintext: requestUrl=") : "Abort attempt to upload logs in plaintext: requestUrl=".concat(valueOf3));
        }
        throw th;
    }

    public reg(Context context, String str, rbp rbp) {
        this.f42798b = context;
        this.f42799c = str;
        this.f42797a = rbp;
    }
}
