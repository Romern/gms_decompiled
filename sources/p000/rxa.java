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

/* renamed from: rxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rxa implements aniz {

    /* renamed from: a */
    private final HttpClient f43799a;

    /* renamed from: b */
    private final aniw f43800b;

    public rxa(HttpClient httpClient, aniw aniw) {
        this.f43799a = httpClient;
        this.f43800b = aniw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* renamed from: a */
    public final aniy mo25221a(bqzd bqzd, String str, String str2) {
        String str3;
        int i = 0;
        if (this.f43800b.f76981a.isEmpty()) {
            return aniy.m64551a(0);
        }
        HttpPost httpPost = new HttpPost(this.f43800b.f76981a);
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
        if (!cgec.m144828c() && !"https".equals(httpPost.getURI().getScheme())) {
            return aniy.m64551a(0);
        }
        HttpResponse execute = this.f43799a.execute(httpPost);
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
                    bqze bqze = (bqze) bxvk.m124016a(bqze.f142028f, boav.m111020a(gZIPInputStream), bxus.m123744c());
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    Header lastHeader = execute.getLastHeader("Retry-After");
                    if (!(lastHeader == null || lastHeader.getValue() == null)) {
                        try {
                            i = Integer.parseInt(lastHeader.getValue());
                        } catch (NumberFormatException e) {
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
                        }
                        throw th;
                    }
                }
            } catch (IllegalStateException e3) {
                e = e3;
                throw new IOException(e);
            } catch (Throwable th2) {
                th = th2;
                if (gZIPInputStream != null) {
                    gZIPInputStream.close();
                }
                throw th;
            }
        } else if (statusCode != 401) {
            return aniy.m64551a(statusCode);
        } else {
            return aniy.m64550a();
        }
    }
}
