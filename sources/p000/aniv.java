package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: aniv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aniv implements aniz {

    /* renamed from: a */
    private static final srn f76977a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private final HttpClient f76978b;

    /* renamed from: c */
    private final aniw f76979c;

    public aniv(HttpClient httpClient, aniw aniw) {
        this.f76978b = httpClient;
        this.f76979c = aniw;
    }

    /* renamed from: a */
    private final int m64547a(HttpResponse httpResponse) {
        Header lastHeader = httpResponse.getLastHeader("Retry-After");
        if (lastHeader == null || lastHeader.getValue() == null) {
            return 0;
        }
        try {
            return Integer.parseInt(lastHeader.getValue());
        } catch (NumberFormatException e) {
            bnsl bnsl = (bnsl) f76977a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aniv", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Retry-After with invalid value: %s", lastHeader.getValue());
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b3  */
    /* renamed from: a */
    public final aniy mo25221a(bqzd bqzd, String str, String str2) {
        String str3;
        int i = 0;
        if (this.f76979c.f76981a.isEmpty()) {
            bnsl bnsl = (bnsl) f76977a.mo68387b();
            bnsl.mo68432a("aniv", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Abort attempt to contact server without URL");
            return aniy.m64551a(0);
        }
        String valueOf = String.valueOf(this.f76979c.f76981a);
        int a = bqyo.m113771a(bqzd.f142024e);
        if (a == 0) {
            a = 1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append("?r=");
        sb.append(a - 1);
        String sb2 = sb.toString();
        if (cgem.m144893h()) {
            String valueOf2 = String.valueOf(sb2);
            int i2 = bqzd.f142026g;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
            sb3.append(valueOf2);
            sb3.append("&c=");
            sb3.append(i2);
            sb2 = sb3.toString();
        }
        HttpPost httpPost = new HttpPost(sb2);
        if (str2 != null && !str2.isEmpty()) {
            httpPost.addHeader("X-SERVER-TOKEN", str2);
        }
        if (str != null && !str.isEmpty()) {
            httpPost.addHeader("Authorization", str.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        bqzd.mo73638a(gZIPOutputStream);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        byteArrayEntity.setContentType("application/x-protobuf");
        httpPost.setEntity(byteArrayEntity);
        if (cgec.m144828c() || "https".equals(httpPost.getURI().getScheme())) {
            httpPost.getURI();
            HttpResponse execute = this.f76978b.execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode >= 200 && statusCode < 300) {
                GZIPInputStream gZIPInputStream = null;
                try {
                    HttpEntity entity = execute.getEntity();
                    if (entity.getContentEncoding() != null) {
                        str3 = entity.getContentEncoding().getValue();
                    } else {
                        str3 = "";
                    }
                    if ("gzip".equals(str3)) {
                        gZIPInputStream = new GZIPInputStream(entity.getContent());
                    } else {
                        gZIPInputStream = entity.getContent();
                    }
                    try {
                        bqze bqze = (bqze) GeneratedMessageLite.m124016a(bqze.f142028f, boav.m111020a(gZIPInputStream), bxus.m123744c());
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        Header lastHeader = execute.getLastHeader("Retry-After");
                        if (!(lastHeader == null || lastHeader.getValue() == null)) {
                            try {
                                i = Integer.parseInt(lastHeader.getValue());
                            } catch (NumberFormatException e) {
                                bnsl bnsl2 = (bnsl) f76977a.mo68388c();
                                bnsl2.mo68437a(e);
                                bnsl2.mo68432a("aniv", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("Retry-After with invalid value: %s", lastHeader.getValue());
                            }
                        }
                        return aniy.m64552a(bqze, i, statusCode);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        try {
                            throw new IOException(e);
                        } catch (Throwable th) {
                            th = th;
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPInputStream != null) {
                        }
                        throw th;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    throw new IOException(e);
                } catch (Throwable th3) {
                    th = th3;
                    if (gZIPInputStream != null) {
                    }
                    throw th;
                }
            } else if (statusCode != 401) {
                bnsl bnsl3 = (bnsl) f76977a.mo68388c();
                bnsl3.mo68432a("aniv", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("Server returned %d", statusCode);
                return aniy.m64551a(statusCode);
            } else {
                bnsl bnsl4 = (bnsl) f76977a.mo68388c();
                bnsl4.mo68432a("aniv", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Server returned 401, invalidating auth token");
                return aniy.m64550a();
            }
        } else {
            bnsl bnsl5 = (bnsl) f76977a.mo68387b();
            bnsl5.mo68432a("aniv", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Abort attempt to contact server without HTTPS: %s", httpPost.getURI());
            return aniy.m64551a(0);
        }
    }
}
