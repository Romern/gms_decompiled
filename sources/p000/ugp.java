package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ugp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugp extends ugi {

    /* renamed from: f */
    private static final sbw f47558f = new sbw("ResumableUploader", "");

    /* renamed from: g */
    private final Set f47559g = new LinkedHashSet();

    /* renamed from: h */
    private long f47560h = 0;

    /* renamed from: i */
    private BufferedInputStream f47561i = null;

    private ugp(Context context, ugt ugt, ufb ufb, ugv ugv) {
        super(context, ugt, ufb, ugv);
    }

    /* renamed from: a */
    private static final ugk m38358a(String str) {
        try {
            return ugk.m38337a(str);
        } catch (ParseException e) {
            throw new ugr(str.length() == 0 ? new String("Unable to upload file: invalid byte range returned by server. ") : "Unable to upload file: invalid byte range returned by server. ".concat(str));
        }
    }

    /* renamed from: b */
    private final long m38364b(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        m38361a(httpURLConnection);
        if (responseCode == 308) {
            String headerField = httpURLConnection.getHeaderField("Range");
            if (headerField == null) {
                return 0;
            }
            ugk a = m38358a(headerField);
            if (a.f47544c == 0) {
                return a.f47545d + 1;
            }
            throw new ugr("Unable to upload item: Bytes lost in transmission.");
        } else if (responseCode == this.f47527b.f47569h.intValue()) {
            throw new ugq("Conflict uploading");
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unexpected response code ");
            sb.append(responseCode);
            throw new ugr(sb.toString(), m38365c(httpURLConnection));
        }
    }

    /* renamed from: c */
    private static final uaf m38365c(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        vpf a = vpg.m41004a(httpURLConnection.getErrorStream());
        return new uaf(tyv.m37778a(responseCode, a), responseCode, a);
    }

    /* renamed from: d */
    private static final void m38366d(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200 && responseCode != 201 && responseCode != 308) {
            vpg.m41005a(responseCode, vpg.m41004a(httpURLConnection.getErrorStream()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo27326c() {
        return "resumable";
    }

    /* renamed from: e */
    public final bngx mo27329e() {
        return bngx.m109368a((Collection) this.f47559g);
    }

    /* renamed from: a */
    public static ugp m38359a(Context context, ugt ugt, ufb ufb, ugv ugv) {
        return new ugp(context, ugt, ufb, ugv);
    }

    /* renamed from: a */
    private final vkr m38360a(HttpURLConnection httpURLConnection, ClientContext clientContext) {
        int responseCode = httpURLConnection.getResponseCode();
        m38361a(httpURLConnection);
        if (responseCode == 201 || responseCode == 200) {
            return new vkt(ugv.m38380a(httpURLConnection.getInputStream()), clientContext, httpURLConnection.getHeaderField("X-Server-Object-Version"));
        }
        return null;
    }

    /* renamed from: a */
    private final void m38361a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-GUploader-UploadID");
        if (headerField != null) {
            this.f47559g.add(headerField);
        }
    }

    /* renamed from: a */
    private final void m38362a(HttpURLConnection httpURLConnection, sie sie) {
        if (httpURLConnection.getResponseCode() == 401) {
            f47558f.mo25371b("Response from server is UNAUTHORIZED. Invalidating OAuth token.");
            sie.mo25587c(this.f47526a);
        }
    }

    /* renamed from: a */
    private static final void m38363a(HttpURLConnection httpURLConnection, ugt ugt) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 400 || responseCode == 404 || responseCode == 401 || responseCode == 500) {
            ugt.mo27349a(null);
            throw new ugr("Url expired.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x036e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x036f, code lost:
        r3 = r0;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0373, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0374, code lost:
        r28 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0379, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0410, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0413, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0414, code lost:
        r2 = r0;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0421, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0422, code lost:
        r2 = r0;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0443, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0448, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015b, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015e, code lost:
        r2 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0161, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        r2 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0174, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0176, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0177, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0204 A[SYNTHETIC, Splitter:B:119:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0413 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:182:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0421 A[ExcHandler: vex (r0v17 'e' vex A[CUSTOM_DECLARE]), Splitter:B:182:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0443 A[ExcHandler: all (th java.lang.Throwable), PHI: r24 10  PHI: (r24v7 vfj) = (r24v8 vfj), (r24v11 vfj), (r24v16 vfj), (r24v16 vfj), (r24v16 vfj), (r24v16 vfj) binds: [B:226:0x043f, B:179:0x03af, B:150:0x0301, B:153:0x031f, B:154:?, B:159:0x0348] A[DONT_GENERATE, DONT_INLINE], Splitter:B:150:0x0301] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x046f A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0470 A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0545 A[SYNTHETIC, Splitter:B:294:0x0545] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015a A[ExcHandler: all (r0v42 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:7:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0170 A[SYNTHETIC, Splitter:B:87:0x0170] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0185 A[SYNTHETIC, Splitter:B:99:0x0185] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0150=Splitter:B:68:0x0150, B:81:0x0164=Splitter:B:81:0x0164} */
    /* renamed from: a */
    public final vkr mo27328a(ugs ugs, vfk vfk, ClientContext clientContext) {
        vkr vkr;
        String str;
        BufferedInputStream bufferedInputStream;
        vfj vfj;
        Throwable th;
        String str2;
        String str3;
        String str4;
        boolean z;
        uaf uaf;
        vkr vkr2;
        vfj vfj2;
        voy voy;
        int i;
        int i2;
        int i3;
        vfj vfj3;
        Exception exc;
        vfj vfj4;
        voy voy2;
        ugt ugt;
        HttpURLConnection httpURLConnection;
        Locale locale;
        Object[] objArr;
        vew vew;
        HttpURLConnection httpURLConnection2;
        long j;
        vfj a;
        vfj vfj5;
        Throwable th2;
        vfj vfj6;
        BufferedWriter bufferedWriter;
        Throwable th3;
        IOException iOException;
        ugs ugs2 = ugs;
        vfk vfk2 = vfk;
        ClientContext clientContext2 = clientContext;
        this.f47530e = 2;
        try {
            this.f47561i = new BufferedInputStream(this.f47527b.mo27348a(), AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
            String str5 = "Content-Type";
            String str6 = "PUT";
            if (this.f47527b.f47568g == null) {
                f47558f.mo25371b("Starting from the beginning");
                String str7 = "Content-Range";
                ugs2.mo27021a(this.f47527b.f47566e);
                ugt ugt2 = this.f47527b;
                try {
                    vfj6 = vfk2.mo28349a(mo27325b());
                    try {
                        HttpURLConnection a2 = vfj6.mo28346a();
                        a2.setRequestMethod(mo27327d());
                        String str8 = this.f47527b.f47567f;
                        if (str8 != null) {
                            a2.setRequestProperty("If-Match", str8);
                        }
                        a2.setRequestProperty(str5, "application/json; charset=UTF-8");
                        a2.setRequestProperty("Host", ((String) twy.f46800K.mo58455c()).replace("https://", "").replace("http://", ""));
                        a2.setRequestProperty("X-Upload-Content-Type", ugt2.mo27350b());
                        a2.setRequestProperty("X-Upload-Content-Length", Long.toString(ugt2.f47566e));
                        sie a3 = ufb.m38262a(a2, clientContext2, this.f47526a);
                        a2.setDoOutput(true);
                        a2.setChunkedStreamingMode(0);
                        try {
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(a2.getOutputStream(), "UTF-8"));
                            try {
                                bufferedWriter.write(ugt2.f47563b);
                                srz.m36171a(bufferedWriter);
                                a2.getResponseCode();
                                m38366d(a2);
                                m38362a(a2, a3);
                                try {
                                    HttpURLConnection a4 = vfj6.mo28346a();
                                    m38363a(a4, ugt2);
                                    String responseMessage = a4.getResponseMessage();
                                    int responseCode = a4.getResponseCode();
                                    m38361a(a4);
                                    if (responseCode == 200) {
                                        String headerField = a4.getHeaderField("Location");
                                        if (headerField != null) {
                                            ugt2.mo27349a(headerField);
                                            if (vfj6 != null) {
                                                vfj6.close();
                                                str = str7;
                                                vkr = null;
                                            } else {
                                                str = str7;
                                                vkr = null;
                                            }
                                            while (vkr == null) {
                                                if (!Thread.interrupted()) {
                                                    ugt ugt3 = this.f47527b;
                                                    long j2 = ugt3.f47566e;
                                                    int min = (int) Math.min(j2 - this.f47560h, 262144L);
                                                    String str9 = str;
                                                    f47558f.mo25369a("Sending next chunk: %s bytes. Confirmed: %s/%s", Integer.valueOf(min), Long.valueOf(this.f47560h), Long.valueOf(j2));
                                                    long millis = TimeUnit.SECONDS.toMillis(1);
                                                    double doubleValue = ((Double) twy.f46842aZ.mo58455c()).doubleValue();
                                                    double doubleValue2 = ((Double) twy.f46841aY.mo58455c()).doubleValue();
                                                    double d = (double) millis;
                                                    Double.isNaN(d);
                                                    voy voy3 = new voy((long) (d * doubleValue), doubleValue2, Long.MAX_VALUE);
                                                    try {
                                                        int intValue = ((Integer) twy.f46870ba.mo58455c()).intValue();
                                                        int i4 = 0;
                                                        vfj vfj7 = null;
                                                        while (true) {
                                                            if (i4 >= intValue) {
                                                                str2 = str5;
                                                                str3 = str6;
                                                                str4 = str9;
                                                                z = false;
                                                                break;
                                                            }
                                                            try {
                                                                f47558f.mo25369a("Send chunk attempt: %d", Integer.valueOf(i4));
                                                                this.f47561i.mark(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
                                                                try {
                                                                    f47558f.mo25369a("Uploading to url %s", ugt3.f47568g);
                                                                    vfj a5 = vfk2.mo28349a(new URL(ugt3.f47568g));
                                                                    try {
                                                                        HttpURLConnection a6 = a5.mo28346a();
                                                                        vew b = a5.mo28347b();
                                                                        b.mo28356a("Connection interrupted");
                                                                        a6.setRequestProperty(str5, ugt3.mo27350b());
                                                                        sie a7 = ufb.m38262a(a6, clientContext2, this.f47526a);
                                                                        a6.setRequestMethod(str6);
                                                                        if (min > 0) {
                                                                            vew vew2 = b;
                                                                            try {
                                                                                locale = Locale.US;
                                                                                str2 = str5;
                                                                                str3 = str6;
                                                                            } catch (Exception e) {
                                                                                e = e;
                                                                                str2 = str5;
                                                                                i = intValue;
                                                                                i2 = i4;
                                                                                str3 = str6;
                                                                                vfj2 = vfj7;
                                                                                vfj3 = a5;
                                                                                voy = voy3;
                                                                                str4 = str9;
                                                                                exc = e;
                                                                                vfj3.close();
                                                                                throw exc;
                                                                            }
                                                                            try {
                                                                                objArr = new Object[3];
                                                                                i = intValue;
                                                                                try {
                                                                                    objArr[0] = Long.valueOf(this.f47560h);
                                                                                    vew = vew2;
                                                                                    i2 = i4;
                                                                                    try {
                                                                                        httpURLConnection2 = a6;
                                                                                        vfj2 = vfj7;
                                                                                        j = (long) min;
                                                                                    } catch (Exception e2) {
                                                                                        e = e2;
                                                                                        vfj2 = vfj7;
                                                                                        vfj3 = a5;
                                                                                        voy = voy3;
                                                                                        str4 = str9;
                                                                                        exc = e;
                                                                                        vfj3.close();
                                                                                        throw exc;
                                                                                    }
                                                                                } catch (Exception e3) {
                                                                                    e = e3;
                                                                                    i2 = i4;
                                                                                    vfj2 = vfj7;
                                                                                    vfj3 = a5;
                                                                                    voy = voy3;
                                                                                    str4 = str9;
                                                                                    exc = e;
                                                                                    vfj3.close();
                                                                                    throw exc;
                                                                                }
                                                                            } catch (Exception e4) {
                                                                                e = e4;
                                                                                i = intValue;
                                                                                i2 = i4;
                                                                                vfj2 = vfj7;
                                                                                vfj3 = a5;
                                                                                voy = voy3;
                                                                                str4 = str9;
                                                                                exc = e;
                                                                                vfj3.close();
                                                                                throw exc;
                                                                            }
                                                                            try {
                                                                                objArr[1] = Long.valueOf((this.f47560h + j) - 1);
                                                                                httpURLConnection = httpURLConnection2;
                                                                                objArr[2] = Long.valueOf(ugt3.f47566e);
                                                                                str4 = str9;
                                                                                httpURLConnection.setRequestProperty(str4, String.format(locale, "bytes %d-%d/%d", objArr));
                                                                                httpURLConnection.setDoOutput(true);
                                                                                httpURLConnection.setFixedLengthStreamingMode(min);
                                                                                vej vej = new vej(httpURLConnection.getOutputStream(), vew);
                                                                                BufferedInputStream bufferedInputStream2 = this.f47561i;
                                                                                byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
                                                                                long j3 = 0;
                                                                                while (j3 < j) {
                                                                                    ugt ugt4 = ugt3;
                                                                                    vfj3 = a5;
                                                                                    voy = voy3;
                                                                                    int read = bufferedInputStream2.read(bArr, 0, (int) Math.min(16384L, j - j3));
                                                                                    vej.write(bArr, 0, read);
                                                                                    j3 += (long) read;
                                                                                    vej = vej;
                                                                                    ugt3 = ugt4;
                                                                                    voy3 = voy;
                                                                                    a5 = vfj3;
                                                                                }
                                                                                ugt = ugt3;
                                                                                vfj4 = a5;
                                                                                voy2 = voy3;
                                                                                vej.close();
                                                                            } catch (Exception e5) {
                                                                                e = e5;
                                                                                ugt3 = ugt;
                                                                                exc = e;
                                                                                vfj3.close();
                                                                                throw exc;
                                                                            } catch (Throwable th4) {
                                                                            }
                                                                        } else {
                                                                            str2 = str5;
                                                                            i = intValue;
                                                                            i2 = i4;
                                                                            str3 = str6;
                                                                            httpURLConnection = a6;
                                                                            vfj2 = vfj7;
                                                                            vfj4 = a5;
                                                                            voy2 = voy3;
                                                                            str4 = str9;
                                                                            ugt = ugt3;
                                                                            httpURLConnection.setDoOutput(true);
                                                                            httpURLConnection.setFixedLengthStreamingMode(0);
                                                                            httpURLConnection.getOutputStream().close();
                                                                        }
                                                                        m38366d(httpURLConnection);
                                                                        m38362a(httpURLConnection, a7);
                                                                    } catch (Exception e6) {
                                                                        e = e6;
                                                                        str2 = str5;
                                                                        i = intValue;
                                                                        i2 = i4;
                                                                        str3 = str6;
                                                                        vfj2 = vfj7;
                                                                        vfj4 = a5;
                                                                        voy2 = voy3;
                                                                        str4 = str9;
                                                                        exc = e;
                                                                        vfj3.close();
                                                                        throw exc;
                                                                    }
                                                                    try {
                                                                        HttpURLConnection a8 = vfj4.mo28346a();
                                                                        int responseCode2 = a8.getResponseCode();
                                                                        sbw sbw = f47558f;
                                                                        Object[] objArr2 = new Object[1];
                                                                        Integer valueOf = Integer.valueOf(responseCode2);
                                                                        objArr2[0] = valueOf;
                                                                        sbw.mo25369a("HTTP upload status %d", objArr2);
                                                                        ugt3 = ugt;
                                                                        m38363a(a8, ugt3);
                                                                        if (responseCode2 >= 500) {
                                                                            if (responseCode2 > 599) {
                                                                                vfj7 = vfj4;
                                                                                z = true;
                                                                                break;
                                                                            }
                                                                            sbw sbw2 = f47558f;
                                                                            Object[] objArr3 = new Object[1];
                                                                            objArr3[0] = valueOf;
                                                                            sbw2.mo25369a("Upload attempt failed with response %d, retrying.", objArr3);
                                                                            vfj7 = vfj4;
                                                                            try {
                                                                                this.f47561i.reset();
                                                                                i3 = i2;
                                                                                if (i3 >= i - 1) {
                                                                                    if (vfj7 != null) {
                                                                                        vfj7.close();
                                                                                    }
                                                                                    f47558f.mo25371b("Waiting for rate limiter token");
                                                                                    voy.mo28705f();
                                                                                    f47558f.mo25371b("Got token");
                                                                                }
                                                                                clientContext2 = clientContext;
                                                                                str9 = str4;
                                                                                str6 = str3;
                                                                                str5 = str2;
                                                                                intValue = i;
                                                                                voy3 = voy;
                                                                                i4 = i3 + 1;
                                                                                vfk2 = vfk;
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                vfj = vfj7;
                                                                                if (vfj != null) {
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            vfj7 = vfj4;
                                                                            z = true;
                                                                            break;
                                                                        }
                                                                    } catch (vex e7) {
                                                                    } catch (IOException e8) {
                                                                        ugt3 = ugt;
                                                                        vfj7 = vfj4;
                                                                        try {
                                                                            f47558f.mo25371b("Upload attempt failed on IO, retrying.");
                                                                            this.f47561i.reset();
                                                                            i3 = i2;
                                                                            if (i3 >= i - 1) {
                                                                            }
                                                                            clientContext2 = clientContext;
                                                                            str9 = str4;
                                                                            str6 = str3;
                                                                            str5 = str2;
                                                                            intValue = i;
                                                                            voy3 = voy;
                                                                            i4 = i3 + 1;
                                                                            vfk2 = vfk;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            vfj = vfj7;
                                                                            if (vfj != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                    }
                                                                } catch (vex e9) {
                                                                    e = e9;
                                                                    vfj2 = vfj7;
                                                                    vex vex = e;
                                                                    vfj = vfj2;
                                                                    try {
                                                                        f47558f.mo25371b("Upload attempt failed on PermitTokenException, aborting.");
                                                                        throw vex;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        if (vfj != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (IOException e10) {
                                                                    str2 = str5;
                                                                    i = intValue;
                                                                    i2 = i4;
                                                                    str3 = str6;
                                                                    vfj2 = vfj7;
                                                                    voy = voy3;
                                                                    str4 = str9;
                                                                    vfj7 = vfj2;
                                                                    f47558f.mo25371b("Upload attempt failed on IO, retrying.");
                                                                    this.f47561i.reset();
                                                                    i3 = i2;
                                                                    if (i3 >= i - 1) {
                                                                    }
                                                                    clientContext2 = clientContext;
                                                                    str9 = str4;
                                                                    str6 = str3;
                                                                    str5 = str2;
                                                                    intValue = i;
                                                                    voy3 = voy;
                                                                    i4 = i3 + 1;
                                                                    vfk2 = vfk;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                vfj2 = vfj7;
                                                                th = th;
                                                                vfj = vfj2;
                                                                if (vfj != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (vfj7 == null || !z) {
                                                            if (vfj7 != null) {
                                                                uaf = m38365c(vfj7.mo28346a());
                                                            } else {
                                                                uaf = null;
                                                            }
                                                            throw new ugr("Failed to upload. Ran out of tries", uaf);
                                                        }
                                                        clientContext2 = clientContext;
                                                        vkr a9 = m38360a(vfj7.mo28346a(), clientContext2);
                                                        if (a9 == null) {
                                                            long b2 = m38364b(vfj7.mo28346a());
                                                            long j4 = this.f47560h + ((long) min);
                                                            if (j4 == b2) {
                                                                this.f47560h = b2;
                                                                if (vfj7 != null) {
                                                                    vfj7.close();
                                                                    vkr2 = null;
                                                                } else {
                                                                    vkr2 = null;
                                                                }
                                                            } else {
                                                                StringBuilder sb = new StringBuilder(93);
                                                                sb.append("Server did not receive the correct number of bytes.");
                                                                sb.append(j4);
                                                                sb.append(", ");
                                                                sb.append(b2);
                                                                throw new ugr(sb.toString());
                                                            }
                                                        } else {
                                                            if (vfj7 != null) {
                                                                vfj7.close();
                                                            }
                                                            vkr2 = a9;
                                                        }
                                                        ugs2.mo27022a(this.f47560h, this.f47527b.f47566e);
                                                        vfk2 = vfk;
                                                        str6 = str3;
                                                        str5 = str2;
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        vfj = null;
                                                        if (vfj != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    throw new InterruptedException();
                                                }
                                            }
                                            ugs.mo27020a();
                                            bufferedInputStream = this.f47561i;
                                        } else {
                                            throw new ugr("Unable to upload item: Server upload URI invalid.");
                                        }
                                    } else if (responseCode != this.f47527b.f47569h.intValue()) {
                                        throw new ugr(String.format("Unable to upload item: %d to upload %s %s", Integer.valueOf(responseCode), ugt2.f47565d, responseMessage), m38365c(a4));
                                    } else {
                                        throw new ugq("Conflict uploading");
                                    }
                                } catch (IOException e11) {
                                    IOException iOException2 = e11;
                                    vfj5 = vfj6;
                                    try {
                                        throw new ugr("Failed to start request", iOException2);
                                    } catch (Throwable th11) {
                                        th2 = th11;
                                        if (vfj5 != null) {
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th12) {
                                    th2 = th12;
                                    vfj5 = vfj6;
                                    if (vfj5 != null) {
                                        vfj5.close();
                                    }
                                    throw th2;
                                }
                            } catch (IOException e12) {
                                iOException = e12;
                                try {
                                    throw new ugr("Failed to write to the connection output stream", iOException);
                                } catch (Throwable th13) {
                                    th3 = th13;
                                    srz.m36171a(bufferedWriter);
                                    throw th3;
                                }
                            } catch (Throwable th14) {
                                th3 = th14;
                                srz.m36171a(bufferedWriter);
                                throw th3;
                            }
                        } catch (IOException e13) {
                            iOException = e13;
                            bufferedWriter = null;
                            throw new ugr("Failed to write to the connection output stream", iOException);
                        } catch (Throwable th15) {
                            th3 = th15;
                            bufferedWriter = null;
                            srz.m36171a(bufferedWriter);
                            throw th3;
                        }
                    } catch (IOException e14) {
                        IOException iOException3 = e14;
                        throw new ugr("Failed to init session", iOException3);
                    }
                } catch (IOException e15) {
                    throw new ugr("Failed to upload metadata", e15);
                } catch (Exception e16) {
                    Exception exc2 = e16;
                    if (vfj6 != null) {
                    }
                    throw exc2;
                } catch (Throwable th16) {
                }
            } else {
                String str10 = "Content-Range";
                f47558f.mo25371b("Starting from status request");
                ugt ugt5 = this.f47527b;
                a = vfk2.mo28349a(new URL(ugt5.f47568g));
                HttpURLConnection a10 = a.mo28346a();
                a10.setRequestMethod(str6);
                String valueOf2 = String.valueOf(Long.toString(ugt5.f47566e));
                str = str10;
                a10.setRequestProperty(str, valueOf2.length() == 0 ? new String("bytes */") : "bytes */".concat(valueOf2));
                a10.setDoOutput(true);
                sie a11 = ufb.m38262a(a10, clientContext2, this.f47526a);
                a10.getOutputStream().close();
                vkr = m38360a(a10, clientContext2);
                if (vkr == null) {
                    m38366d(a10);
                    m38362a(a10, a11);
                    m38363a(a10, ugt5);
                    long b3 = m38364b(a10);
                    this.f47560h = b3;
                    this.f47561i.skip(b3);
                    a.close();
                    vkr = null;
                } else {
                    a.close();
                }
                if (vkr != null) {
                    bufferedInputStream = this.f47561i;
                }
                while (vkr == null) {
                }
                ugs.mo27020a();
                bufferedInputStream = this.f47561i;
            }
            srz.m36171a((Closeable) bufferedInputStream);
            return vkr;
        } catch (vex e17) {
            throw e17;
        } catch (IOException e18) {
            try {
                throw new ugr("Upload exception", e18);
            } catch (Throwable th17) {
                Throwable th18 = th17;
                srz.m36171a((Closeable) this.f47561i);
                throw th18;
            }
        } catch (Throwable th19) {
            Throwable th20 = th19;
            a.close();
            throw th20;
        }
    }
}
