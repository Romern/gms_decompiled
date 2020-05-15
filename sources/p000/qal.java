package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: qal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qal extends soa {

    /* renamed from: a */
    private static final String f40795a = String.format(Locale.US, "Android,%d,%s,%s,%s", Integer.valueOf(rfi.f42869b), Build.MODEL, Build.PRODUCT, Build.VERSION.RELEASE);

    /* renamed from: b */
    private final int f40796b = ((int) ccxy.f180226a.mo6606a().mo77048j());

    /* renamed from: c */
    protected final String f40797c;

    /* renamed from: d */
    protected final qav f40798d;

    /* renamed from: h */
    private final long f40799h = ccxy.f180226a.mo6606a().mo77050l();

    /* renamed from: i */
    private final long f40800i = ccxy.f180226a.mo6606a().mo77049k();

    /* renamed from: j */
    private final String f40801j;

    /* renamed from: k */
    private final Context f40802k;

    /* renamed from: l */
    private final ScheduledExecutorService f40803l;

    /* renamed from: m */
    private final Handler f40804m;

    /* renamed from: n */
    private final boolean f40805n = ccxy.f180226a.mo6606a().mo77052n();

    public qal(Context context, String str, String str2, Handler handler, ScheduledExecutorService scheduledExecutorService) {
        super(10);
        this.f40802k = context;
        this.f40801j = str2;
        this.f40804m = handler;
        this.f40803l = scheduledExecutorService;
        qav qav = new qav("CastNearbyRequest");
        this.f40798d = qav;
        this.f40797c = str;
        qav.mo23669a(str);
    }

    /* renamed from: a */
    private static String m31750a(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        scanner.useDelimiter("\\A");
        String next = !scanner.hasNext() ? "" : scanner.next();
        scanner.close();
        return next;
    }

    /* renamed from: b */
    private final void m31751b(int i) {
        if (!this.f40805n) {
            this.f40804m.post(new qai(this, i));
        } else {
            this.f40803l.execute(new qah(this, i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxxc mo23073a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23074a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23075a(byte[] bArr);

    /* JADX INFO: finally extract failed */
    public final void run() {
        int i;
        byte[] bArr;
        bxxc a = mo23073a();
        if (a == null) {
            this.f40798d.mo23677d("No message to send", new Object[0]);
            m31751b(2504);
            return;
        }
        abop abop = new abop(this.f40802k, qay.f40845a, false);
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(a.serializeToBytes());
        int i2 = this.f40796b;
        long j = this.f40799h;
        while (true) {
            i = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            HttpPost httpPost = new HttpPost(this.f40801j);
            httpPost.addHeader("Content-Type", "application/x-protobuf");
            httpPost.addHeader("x-cast-agent", f40795a);
            httpPost.setEntity(byteArrayEntity);
            try {
                shr.m35316b(2304);
                this.f40798d.mo23673b("Http request sent to url: %s", this.f40801j);
                HttpResponse execute = abop.execute(httpPost);
                execute.getFirstHeader("Content-Type").getValue();
                int statusCode = execute.getStatusLine().getStatusCode();
                HttpEntity entity = execute.getEntity();
                if (statusCode != 200) {
                    if (statusCode == 403 || statusCode == 404) {
                        this.f40798d.mo23675c("No matching device", new Object[0]);
                        if (entity != null) {
                            this.f40798d.mo23675c(m31750a(entity.getContent()), new Object[0]);
                        }
                        m31751b(2508);
                    } else {
                        this.f40798d.mo23675c("Non 200 response code = %d", Integer.valueOf(statusCode));
                        if (entity != null) {
                            this.f40798d.mo23670a(m31750a(entity.getContent()), new Object[0]);
                        }
                        m31751b(2507);
                    }
                } else if (execute.getEntity() != null) {
                    int contentLength = (int) execute.getEntity().getContentLength();
                    if (contentLength <= 24576) {
                        if (contentLength > 0) {
                            InputStream content = execute.getEntity().getContent();
                            bArr = new byte[contentLength];
                            int i3 = 0;
                            while (i3 < contentLength) {
                                int read = content.read(bArr, i3, contentLength - i3);
                                if (read <= 0) {
                                    break;
                                }
                                i3 += read;
                            }
                            if (content.available() != 0) {
                                throw new IllegalStateException(String.format(Locale.ENGLISH, "Stream still has %d bytes left after reading Http content length of %d bytes", Integer.valueOf(content.available()), Integer.valueOf(contentLength)));
                            } else if (i3 != contentLength) {
                                throw new IllegalStateException(String.format(Locale.ENGLISH, "Http Content Length of %d doesn't match input stream length of %d", Integer.valueOf(contentLength), Integer.valueOf(i3)));
                            }
                        } else {
                            InputStream content2 = execute.getEntity().getContent();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[24576];
                            while (true) {
                                int read2 = content2.read(bArr2, 0, 24576);
                                if (read2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read2);
                            }
                            byteArrayOutputStream.flush();
                            bArr = byteArrayOutputStream.toByteArray();
                        }
                        if (!this.f40805n) {
                            this.f40804m.post(new qak(this, bArr));
                        } else {
                            this.f40803l.execute(new qaj(this, bArr));
                        }
                    } else {
                        throw new IOException("Http Response content longer than expected 24KB limit");
                    }
                } else {
                    m31751b(2507);
                }
                shr.m35312a();
                return;
            } catch (IOException e) {
                this.f40798d.mo23674b(e, "Exception sending HTTP request to %s", this.f40801j);
                try {
                    Thread.sleep(j);
                    j += this.f40800i;
                } catch (InterruptedException e2) {
                }
                shr.m35312a();
                i2 = i;
            } catch (IllegalStateException e3) {
                this.f40798d.mo23676c(e3, "Exception sending HTTP request to %s", this.f40801j);
                m31751b(2506);
                shr.m35312a();
            } catch (Throwable th) {
                shr.m35312a();
                throw th;
            }
        }
        if (i == 0) {
            m31751b(2505);
        }
    }
}
