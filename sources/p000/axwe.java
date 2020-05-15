package p000;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;

/* renamed from: axwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwe {

    /* renamed from: a */
    public final ConcurrentLinkedQueue f96547a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    final /* synthetic */ axwi f96548b;

    /* renamed from: c */
    private final axui f96549c;

    public axwe(axwi axwi, axui axui) {
        this.f96548b = axwi;
        this.f96549c = axui;
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x02e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02e1 A[SYNTHETIC, Splitter:B:99:0x02e1] */
    /* renamed from: a */
    public final void mo53662a(String str) {
        axwx axwx;
        String str2;
        String str3;
        long elapsedRealtime;
        long j;
        long j2;
        String str4;
        HttpEntity httpEntity;
        String str5 = "media";
        axwx axwx2 = (axwx) this.f96547a.peek();
        String str6 = "CloudNode";
        if (axwx2 != null && Log.isLoggable(str6, 2)) {
            Log.v(str6, "processAssetUploads: there are assets to send, processing...");
        }
        axwx axwx3 = axwx2;
        while (axwx3 != null && this.f96548b.mo53681b()) {
            if (this.f96549c.mo53578a(axwx3.f96633a) != null) {
                if (axwx3.f96634b) {
                    this.f96548b.mo53683d();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    try {
                        axwn axwn = this.f96548b.f96584i;
                        String str7 = axwx3.f96633a;
                        String uri = Uri.parse(chnj.m149028d()).buildUpon().appendPath("upload").appendPath(chnj.m149029e()).appendPath(str5).appendPath(str7).appendQueryParameter("uploadType", str5).build().toString();
                        axwn.f96615f.mo53758a("upload");
                        File a = axwn.f96612c.mo53578a(str7);
                        try {
                            FileInputStream fileInputStream = new FileInputStream(a);
                            j2 = elapsedRealtime2;
                            try {
                                long length = a.length();
                                String valueOf = String.valueOf(uri);
                                axwn.m83408a(valueOf.length() == 0 ? new String("\nPOSTing to URL: ") : "\nPOSTing to URL: ".concat(valueOf));
                                HttpPost httpPost = new HttpPost(uri);
                                try {
                                    str2 = str5;
                                    try {
                                        shr.m35313a(1796, axwn.f96611b);
                                        httpPost.setEntity(new InputStreamEntity(fileInputStream, length));
                                        String str8 = "bytesSent";
                                        axwn.f96614e.mo53756a(axwn.f96609a, str8, (int) length);
                                        HttpResponse execute = axwn.f96616g.execute(httpPost);
                                        httpEntity = execute.getEntity();
                                        if (httpEntity != null) {
                                            try {
                                                str8 = str6;
                                                axwx = axwx3;
                                                try {
                                                    axwn.f96614e.mo53756a(axwn.f96609a, "bytesRecv", (int) httpEntity.getContentLength());
                                                } catch (IOException e) {
                                                    e = e;
                                                    str4 = str8;
                                                    try {
                                                        StringWriter stringWriter = new StringWriter();
                                                        bqye.m113760a(e, new PrintWriter(stringWriter));
                                                        String valueOf2 = String.valueOf(stringWriter);
                                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 46);
                                                        sb.append("Caught IOException when executing HTTP query: ");
                                                        sb.append(valueOf2);
                                                        axwn.m83409b(sb.toString());
                                                        throw e;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (httpEntity == null) {
                                                        }
                                                        shr.m35312a();
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str4 = str8;
                                                    if (httpEntity == null) {
                                                    }
                                                    shr.m35312a();
                                                    throw th;
                                                }
                                            } catch (IOException e2) {
                                                e = e2;
                                                axwx = axwx3;
                                                str4 = str6;
                                                StringWriter stringWriter2 = new StringWriter();
                                                bqye.m113760a(e, new PrintWriter(stringWriter2));
                                                String valueOf22 = String.valueOf(stringWriter2);
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf22).length() + 46);
                                                sb2.append("Caught IOException when executing HTTP query: ");
                                                sb2.append(valueOf22);
                                                axwn.m83409b(sb2.toString());
                                                throw e;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                axwx = axwx3;
                                                str4 = str6;
                                                if (httpEntity == null) {
                                                }
                                                shr.m35312a();
                                                throw th;
                                            }
                                        } else {
                                            str8 = str6;
                                            axwx = axwx3;
                                        }
                                        int statusCode = execute.getStatusLine().getStatusCode();
                                        if (statusCode == 200) {
                                            axwn.f96614e.mo53756a(axwn.f96609a, "success", 1);
                                            axwn.f96613d.mo54035a();
                                            String valueOf3 = String.valueOf(axwn.mo53698a(httpEntity));
                                            axwn.m83408a(valueOf3.length() == 0 ? new String("Got successful HttpPost response: ") : "Got successful HttpPost response: ".concat(valueOf3));
                                            if (httpEntity != null) {
                                                try {
                                                    httpEntity.consumeContent();
                                                } catch (FileNotFoundException e3) {
                                                    e = e3;
                                                    str4 = str8;
                                                    try {
                                                        StringWriter stringWriter3 = new StringWriter();
                                                        PrintWriter printWriter = new PrintWriter(stringWriter3);
                                                        bqye.m113760a(e, printWriter);
                                                        printWriter.close();
                                                        String valueOf4 = String.valueOf(stringWriter3);
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 73);
                                                        sb3.append("CloudNodeAssetClient Exception: ");
                                                        sb3.append("Could not upload. Asset file not found.");
                                                        sb3.append("; ");
                                                        sb3.append(valueOf4);
                                                        str3 = str4;
                                                        Log.w(str3, sb3.toString());
                                                        axwn.f96615f.mo53759a("upload", String.valueOf(str7).concat(", file not found"));
                                                        j = j2;
                                                        this.f96548b.mo53675a(11, j, 1);
                                                        this.f96548b.mo53683d();
                                                        axwx axwx4 = axwx;
                                                        Set b = this.f96548b.f96582g.mo53744b(axwx4.f96633a);
                                                        elapsedRealtime = SystemClock.elapsedRealtime();
                                                        this.f96548b.f96583h.mo53694a(str, axwx4.f96633a, b);
                                                        this.f96548b.mo53675a(12, elapsedRealtime, 1);
                                                        this.f96547a.poll();
                                                        axwx3 = (axwx) this.f96547a.peek();
                                                        str6 = str3;
                                                        str5 = str2;
                                                    } catch (axwq | IOException e4) {
                                                        e = e4;
                                                        j = j2;
                                                        this.f96548b.mo53676a(11, j, e);
                                                        throw e;
                                                    }
                                                }
                                            }
                                            shr.m35312a();
                                            str4 = str8;
                                        } else if (statusCode >= 400 && statusCode < 500) {
                                            str4 = str8;
                                            try {
                                                axwn.f96614e.mo53756a(axwn.f96609a, "400s", 1);
                                                String a2 = axwn.mo53698a(httpEntity);
                                                int statusCode2 = execute.getStatusLine().getStatusCode();
                                                String reasonPhrase = execute.getStatusLine().getReasonPhrase();
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(uri).length() + 48 + String.valueOf(reasonPhrase).length() + String.valueOf(a2).length());
                                                sb4.append("error posting asset ");
                                                sb4.append(uri);
                                                sb4.append(", ");
                                                sb4.append(statusCode2);
                                                sb4.append(" reason was: ");
                                                sb4.append(reasonPhrase);
                                                sb4.append(", ");
                                                sb4.append(a2);
                                                axwn.m83409b(sb4.toString());
                                                if (statusCode != 401) {
                                                    if (httpEntity != null) {
                                                        try {
                                                            httpEntity.consumeContent();
                                                        } catch (FileNotFoundException e5) {
                                                            e = e5;
                                                            StringWriter stringWriter32 = new StringWriter();
                                                            PrintWriter printWriter2 = new PrintWriter(stringWriter32);
                                                            bqye.m113760a(e, printWriter2);
                                                            printWriter2.close();
                                                            String valueOf42 = String.valueOf(stringWriter32);
                                                            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf42).length() + 73);
                                                            sb32.append("CloudNodeAssetClient Exception: ");
                                                            sb32.append("Could not upload. Asset file not found.");
                                                            sb32.append("; ");
                                                            sb32.append(valueOf42);
                                                            str3 = str4;
                                                            Log.w(str3, sb32.toString());
                                                            axwn.f96615f.mo53759a("upload", String.valueOf(str7).concat(", file not found"));
                                                            j = j2;
                                                            this.f96548b.mo53675a(11, j, 1);
                                                            this.f96548b.mo53683d();
                                                            axwx axwx42 = axwx;
                                                            Set b2 = this.f96548b.f96582g.mo53744b(axwx42.f96633a);
                                                            elapsedRealtime = SystemClock.elapsedRealtime();
                                                            this.f96548b.f96583h.mo53694a(str, axwx42.f96633a, b2);
                                                            this.f96548b.mo53675a(12, elapsedRealtime, 1);
                                                            this.f96547a.poll();
                                                            axwx3 = (axwx) this.f96547a.peek();
                                                            str6 = str3;
                                                            str5 = str2;
                                                        }
                                                    }
                                                    shr.m35312a();
                                                } else {
                                                    throw new axwq(4, a2);
                                                }
                                            } catch (IOException e6) {
                                                e = e6;
                                                StringWriter stringWriter22 = new StringWriter();
                                                bqye.m113760a(e, new PrintWriter(stringWriter22));
                                                String valueOf222 = String.valueOf(stringWriter22);
                                                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf222).length() + 46);
                                                sb22.append("Caught IOException when executing HTTP query: ");
                                                sb22.append(valueOf222);
                                                axwn.m83409b(sb22.toString());
                                                throw e;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (httpEntity == null) {
                                                }
                                                shr.m35312a();
                                                throw th;
                                            }
                                        } else if (statusCode >= 500) {
                                            axwn.f96614e.mo53756a(axwn.f96609a, "500s", 1);
                                            String reasonPhrase2 = execute.getStatusLine().getReasonPhrase();
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(reasonPhrase2).length() + 53);
                                            sb5.append("Failed! Server response code ");
                                            sb5.append(statusCode);
                                            sb5.append(" reason was: ");
                                            sb5.append(reasonPhrase2);
                                            axwn.m83409b(sb5.toString());
                                            String reasonPhrase3 = execute.getStatusLine().getReasonPhrase();
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(reasonPhrase3).length() + 13);
                                            sb6.append(statusCode);
                                            sb6.append(": ");
                                            sb6.append(reasonPhrase3);
                                            throw new IOException(sb6.toString());
                                        } else {
                                            axwn.f96614e.mo53756a(axwn.f96609a, "IOException", 1);
                                            StringBuilder sb7 = new StringBuilder(44);
                                            sb7.append("Received unexpected status code: ");
                                            sb7.append(statusCode);
                                            axwn.m83409b(sb7.toString());
                                            StringBuilder sb8 = new StringBuilder(44);
                                            sb8.append("Received unexpected status code: ");
                                            sb8.append(statusCode);
                                            throw new IOException(sb8.toString());
                                        }
                                        axyd axyd = axwn.f96615f;
                                        String valueOf5 = String.valueOf(a);
                                        StringBuilder sb9 = new StringBuilder(String.valueOf(str7).length() + 7 + String.valueOf(valueOf5).length());
                                        sb9.append(str7);
                                        sb9.append(", size=");
                                        sb9.append(valueOf5);
                                        axyd.mo53759a("upload", sb9.toString());
                                        str3 = str4;
                                    } catch (IOException e7) {
                                        e = e7;
                                        str4 = str6;
                                        axwx = axwx3;
                                        httpEntity = null;
                                        StringWriter stringWriter222 = new StringWriter();
                                        bqye.m113760a(e, new PrintWriter(stringWriter222));
                                        String valueOf2222 = String.valueOf(stringWriter222);
                                        StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf2222).length() + 46);
                                        sb222.append("Caught IOException when executing HTTP query: ");
                                        sb222.append(valueOf2222);
                                        axwn.m83409b(sb222.toString());
                                        throw e;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str4 = str6;
                                        axwx = axwx3;
                                        httpEntity = null;
                                        if (httpEntity == null) {
                                        }
                                        shr.m35312a();
                                        throw th;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    str2 = str5;
                                    str4 = str6;
                                    axwx = axwx3;
                                    httpEntity = null;
                                    StringWriter stringWriter2222 = new StringWriter();
                                    bqye.m113760a(e, new PrintWriter(stringWriter2222));
                                    String valueOf22222 = String.valueOf(stringWriter2222);
                                    StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf22222).length() + 46);
                                    sb2222.append("Caught IOException when executing HTTP query: ");
                                    sb2222.append(valueOf22222);
                                    axwn.m83409b(sb2222.toString());
                                    throw e;
                                } catch (Throwable th6) {
                                    th = th6;
                                    str2 = str5;
                                    str4 = str6;
                                    axwx = axwx3;
                                    httpEntity = null;
                                    if (httpEntity == null) {
                                        httpEntity.consumeContent();
                                    }
                                    shr.m35312a();
                                    throw th;
                                }
                            } catch (FileNotFoundException e9) {
                                e = e9;
                                str2 = str5;
                                str4 = str6;
                                axwx = axwx3;
                                StringWriter stringWriter322 = new StringWriter();
                                PrintWriter printWriter22 = new PrintWriter(stringWriter322);
                                bqye.m113760a(e, printWriter22);
                                printWriter22.close();
                                String valueOf422 = String.valueOf(stringWriter322);
                                StringBuilder sb322 = new StringBuilder(String.valueOf(valueOf422).length() + 73);
                                sb322.append("CloudNodeAssetClient Exception: ");
                                sb322.append("Could not upload. Asset file not found.");
                                sb322.append("; ");
                                sb322.append(valueOf422);
                                str3 = str4;
                                Log.w(str3, sb322.toString());
                                axwn.f96615f.mo53759a("upload", String.valueOf(str7).concat(", file not found"));
                                j = j2;
                                this.f96548b.mo53675a(11, j, 1);
                                this.f96548b.mo53683d();
                                axwx axwx422 = axwx;
                                Set b22 = this.f96548b.f96582g.mo53744b(axwx422.f96633a);
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                this.f96548b.f96583h.mo53694a(str, axwx422.f96633a, b22);
                                this.f96548b.mo53675a(12, elapsedRealtime, 1);
                                this.f96547a.poll();
                                axwx3 = (axwx) this.f96547a.peek();
                                str6 = str3;
                                str5 = str2;
                            }
                        } catch (FileNotFoundException e10) {
                            e = e10;
                            str2 = str5;
                            str4 = str6;
                            axwx = axwx3;
                            j2 = elapsedRealtime2;
                            StringWriter stringWriter3222 = new StringWriter();
                            PrintWriter printWriter222 = new PrintWriter(stringWriter3222);
                            bqye.m113760a(e, printWriter222);
                            printWriter222.close();
                            String valueOf4222 = String.valueOf(stringWriter3222);
                            StringBuilder sb3222 = new StringBuilder(String.valueOf(valueOf4222).length() + 73);
                            sb3222.append("CloudNodeAssetClient Exception: ");
                            sb3222.append("Could not upload. Asset file not found.");
                            sb3222.append("; ");
                            sb3222.append(valueOf4222);
                            str3 = str4;
                            Log.w(str3, sb3222.toString());
                            axwn.f96615f.mo53759a("upload", String.valueOf(str7).concat(", file not found"));
                            j = j2;
                            this.f96548b.mo53675a(11, j, 1);
                            this.f96548b.mo53683d();
                            axwx axwx4222 = axwx;
                            Set b222 = this.f96548b.f96582g.mo53744b(axwx4222.f96633a);
                            elapsedRealtime = SystemClock.elapsedRealtime();
                            this.f96548b.f96583h.mo53694a(str, axwx4222.f96633a, b222);
                            this.f96548b.mo53675a(12, elapsedRealtime, 1);
                            this.f96547a.poll();
                            axwx3 = (axwx) this.f96547a.peek();
                            str6 = str3;
                            str5 = str2;
                        }
                        j = j2;
                        try {
                            this.f96548b.mo53675a(11, j, 1);
                        } catch (axwq | IOException e11) {
                            e = e11;
                        }
                    } catch (axwq | IOException e12) {
                        e = e12;
                        j = elapsedRealtime2;
                        this.f96548b.mo53676a(11, j, e);
                        throw e;
                    }
                } else {
                    str2 = str5;
                    str3 = str6;
                    axwx = axwx3;
                }
                this.f96548b.mo53683d();
                axwx axwx42222 = axwx;
                Set b2222 = this.f96548b.f96582g.mo53744b(axwx42222.f96633a);
                elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    this.f96548b.f96583h.mo53694a(str, axwx42222.f96633a, b2222);
                    this.f96548b.mo53675a(12, elapsedRealtime, 1);
                } catch (axwq | IOException e13) {
                    this.f96548b.mo53676a(12, elapsedRealtime, e13);
                    throw e13;
                }
            } else {
                str2 = str5;
                str3 = str6;
            }
            this.f96547a.poll();
            axwx3 = (axwx) this.f96547a.peek();
            str6 = str3;
            str5 = str2;
        }
    }
}
