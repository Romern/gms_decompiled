package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

/* renamed from: qdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdd {

    /* renamed from: a */
    public static final Logger f40972a = qgn.m32143a("CheckinRequestProcessor");

    /* renamed from: b */
    private final qcy f40973b;

    /* renamed from: c */
    private final bmxv f40974c;

    /* renamed from: d */
    private final Context f40975d;

    /* renamed from: e */
    private boolean f40976e = false;

    /* renamed from: f */
    private int f40977f = 0;

    /* renamed from: g */
    private final ArrayList f40978g = new ArrayList();

    public qdd(Context context, qcy qcy) {
        this.f40975d = context;
        this.f40973b = qcy;
        this.f40974c = bmvz.f131120a;
    }

    /* renamed from: a */
    private static long m31902a(long j, qdu qdu, bxvd bxvd) {
        long j2;
        boolean z;
        ContentResolver contentResolver = qdu.f41043m.getContentResolver();
        ArrayList arrayList = new ArrayList();
        boolean z2 = qdu.f41038h;
        if (qdu.f41031a == null || !qdu.f41044n || !cdbz.f180442a.mo6606a().mo77217d()) {
            j2 = j;
        } else {
            String g = cdci.m132541g();
            Map a = qer.m32027a(aymn.m84266a(contentResolver, "checkin_dropbox_upload:"), "checkin_dropbox_upload:", z2, g);
            String f = cdci.m132540f();
            if (f == null || !aymn.f97982c.matcher(f).matches()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !z2 && !TextUtils.isEmpty(g)) {
                for (String str : bmyx.m108640a(',').mo66918a((CharSequence) g)) {
                    String valueOf = String.valueOf(str);
                    if (!a.containsKey(valueOf.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf))) {
                        String valueOf2 = String.valueOf(str);
                        a.put(valueOf2.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf2), "true");
                    }
                }
            }
            if (z2) {
                a.put("checkin_dropbox_upload", String.valueOf(z).toLowerCase(Locale.US));
            }
            j2 = qcx.m31871a(qdu.f41031a, a, j, bxvd);
        }
        if (!qdu.f41034d) {
            arrayList.add(0, 5);
            arrayList.add(1, Long.valueOf(j));
            arrayList.add(2, Long.valueOf(j2));
            qdg.m31918a(arrayList.toArray());
        }
        return j2;
    }

    /* renamed from: b */
    private static void m31909b(qdu qdu) {
        if (qdu.f41039i) {
            shr.m35312a();
        }
    }

    /* renamed from: b */
    public static void m31910b(qdu qdu, bmza bmza) {
        if (qdu.f41034d) {
            return;
        }
        if (!bmza.f131251a) {
            f40972a.mo25418e("Trying to stop stopwatch that is not running", new Object[0]);
        } else {
            bmza.mo66931e();
        }
    }

    public qdd(Context context, qcy qcy, qdb qdb) {
        this.f40975d = context;
        this.f40973b = qcy;
        this.f40974c = bmxv.m108566b(qdb);
    }

    /* renamed from: a */
    public static List m31903a(Context context) {
        adyd a = adyd.m51363a(context);
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a.mo33916a("com.google.work"));
        Collections.addAll(arrayList, a.mo33916a("com.google"));
        if (sre.m36080a(context)) {
            arrayList.addAll(soz.m35805e(context, context.getPackageName()));
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static qgv m31904a(qdu qdu, HttpURLConnection httpURLConnection, int i) {
        String responseMessage = httpURLConnection.getResponseMessage();
        if (i != 200) {
            m31906a(httpURLConnection);
            String valueOf = String.valueOf(responseMessage);
            throw new IOException(valueOf.length() == 0 ? new String("Rejected response from server: ") : "Rejected response from server: ".concat(valueOf));
        }
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            throw new IOException("No Content-Type header");
        } else if (!contentType.startsWith("application/x-protobuffer")) {
            throw new IOException(contentType.length() == 0 ? new String("Bad Content-Type: ") : "Bad Content-Type: ".concat(contentType));
        } else {
            InputStream inputStream = httpURLConnection.getInputStream();
            String contentEncoding = httpURLConnection.getContentEncoding();
            if (contentEncoding != null && contentEncoding.contains("gzip")) {
                inputStream = new GZIPInputStream(inputStream);
            }
            qgv qgv = qgv.f41250l;
            try {
                qgv qgv2 = (qgv) GeneratedMessageLite.m124011a(qgv.f41250l, inputStream, bxus.m123744c());
                inputStream.close();
                if ((qgv2.f41252a & 1) != 0 && qgv2.f41253b) {
                    return qgv2;
                }
                throw new IOException("Server refused checkin");
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m31905a(String str, bnha bnha, qdu qdu, bmza bmza) {
        bmza.mo66928a(TimeUnit.MILLISECONDS);
        if (!bmza.f131251a) {
            f40972a.mo25418e("Trying to restart stopwatch that is not running.", new Object[0]);
        }
        bmza.mo66929c();
        bmza.mo66930d();
        if (!qdu.f41034d) {
            bnha.mo67695b(str, Long.valueOf(bmza.mo66928a(TimeUnit.MILLISECONDS)));
        }
    }

    /* renamed from: a */
    static void m31906a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            try {
                Long.parseLong(headerField);
                f40972a.mo25416d("Got Retry-After: %s", headerField);
            } catch (NumberFormatException e) {
                f40972a.mo25418e("Can't parse Retry-After: %s", headerField);
            }
        }
    }

    /* renamed from: a */
    public static void m31907a(qdu qdu, bmza bmza) {
        if (!qdu.f41034d) {
            if (bmza.f131251a) {
                f40972a.mo25418e("Trying to onFragmentStart already running stopwatch", new Object[0]);
            }
            bmza.mo66930d();
        }
    }

    /* renamed from: a */
    private static void m31908a(qdu qdu, boolean z, int i, boolean z2, boolean z3) {
        if (!qdu.f41034d) {
            int i2 = !z ? 7 : 23;
            if (z2) {
                i2 |= 32;
            }
            int i3 = i2 | ((i & 15) << 6);
            if (z3) {
                i3 |= 1024;
            }
            qdg.m31917a(i3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0576, code lost:
        if (r6.f164950c != false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0579, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x057f, code lost:
        r6 = (p000.qge) r6.f164949b;
        r9 = (p000.qgd) r14.mo74062i();
        r9.getClass();
        r6.f41153b = r9;
        r6.f41152a |= 1;
        r6 = new p000.qdc(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        m31909b(r49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        r8.mo24028b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05a2, code lost:
        r3 = r0;
        r12 = r25;
        r6 = r32;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x074e, code lost:
        r37 = r3;
        r34 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        r8.mo24028b();
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0756, code lost:
        p000.qdg.m31918a("CheckinTask:ReceivedResponse", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x076c, code lost:
        if (r6 == null) goto L_0x0c00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x076e, code lost:
        r3 = r6.f40970a;
        r4 = r6.f40971b;
        m31905a("send_request", r7, r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0777, code lost:
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0779, code lost:
        if (r12 == null) goto L_0x08e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        r5 = r12.f41255d.size();
        r6 = r3.f41255d.size();
        r9 = 0;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0789, code lost:
        if (r9 < r5) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x078b, code lost:
        r5 = (p000.bxvd) r3.mo74142c(5);
        r5.mo73625a((p000.GeneratedMessageLite) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0795, code lost:
        if (r10 == null) goto L_0x07d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0799, code lost:
        if (r5.f164950c != false) goto L_0x079c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x079c, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07a3, code lost:
        r9 = p000.qgv.f41250l;
        ((p000.qgv) r5.f164949b).f41255d = p000.GeneratedMessageLite.m124030de();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07b1, code lost:
        if (r5.f164950c != false) goto L_0x07b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07b4, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07ba, code lost:
        r6 = (p000.qgv) r5.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07c4, code lost:
        if (r6.f41255d.mo73666a() != false) goto L_0x07ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07c6, code lost:
        r6.f41255d = p000.GeneratedMessageLite.m124021a(r6.f41255d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07ce, code lost:
        p000.bxsy.m123078a(r10, r6.f41255d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07d7, code lost:
        if ((r12.f41252a & 128) == 0) goto L_0x0801;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07e1, code lost:
        if ((((p000.qgv) r5.f164949b).f41252a & 128) != 0) goto L_0x0801;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07e3, code lost:
        r6 = r12.f41260i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07e7, code lost:
        if (r5.f164950c != false) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07ea, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07f0, code lost:
        r9 = (p000.qgv) r5.f164949b;
        r10 = p000.qgv.f41250l;
        r6.getClass();
        r9.f41252a |= 128;
        r9.f41260i = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0805, code lost:
        if ((r12.f41252a & com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x080f, code lost:
        if ((((p000.qgv) r5.f164949b).f41252a & com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0812, code lost:
        r6 = r12.f41261j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0816, code lost:
        if (r5.f164950c != false) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0819, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x081f, code lost:
        r9 = (p000.qgv) r5.f164949b;
        r10 = p000.qgv.f41250l;
        r6.getClass();
        r9.f41252a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r9.f41261j = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0836, code lost:
        if (r12.f41262k.size() <= 0) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0842, code lost:
        if (((p000.qgv) r5.f164949b).f41262k.size() == 0) goto L_0x0845;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0847, code lost:
        if (r5.f164950c != false) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x084a, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0850, code lost:
        r9 = p000.qgv.f41250l;
        ((p000.qgv) r5.f164949b).f41262k = p000.GeneratedMessageLite.m124030de();
        r6 = r12.f41262k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0860, code lost:
        if (r5.f164950c != false) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0863, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0869, code lost:
        r9 = (p000.qgv) r5.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0873, code lost:
        if (r9.f41262k.mo73666a() != false) goto L_0x087d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0875, code lost:
        r9.f41262k = p000.GeneratedMessageLite.m124021a(r9.f41262k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x087d, code lost:
        p000.bxsy.m123078a(r6, r9.f41262k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0882, code lost:
        r21 = r4;
        r25 = (p000.qgv) r5.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x088d, code lost:
        r15 = (p000.qhm) r12.f41255d.get(r9);
        r14 = r15.f41378b;
        r21 = r4;
        r4 = 0;
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x089d, code lost:
        if (r4 < r6) goto L_0x08b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x089f, code lost:
        if (r25 == false) goto L_0x08a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x08a1, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08a4, code lost:
        if (r10 != null) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x08a6, code lost:
        r10 = new java.util.ArrayList(r3.f41255d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x08ad, code lost:
        r10.add(r15);
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08b3, code lost:
        if (r25 != false) goto L_0x08ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x08b5, code lost:
        r25 = r5;
        r5 = r14.equals(((p000.qhm) r3.f41255d.get(r4)).f41378b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x08c5, code lost:
        r4 = r4 + 1;
        r25 = r5;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08ce, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x08d0, code lost:
        r9 = r9 + 1;
        r4 = r21;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x08d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x08d9, code lost:
        r3 = r0;
        r6 = r32;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x08de, code lost:
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x08e2, code lost:
        r21 = r4;
        r25 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x08e8, code lost:
        if (r2.f41044n == false) goto L_0x0903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:?, code lost:
        r4 = r2.f41032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08ec, code lost:
        if (r4 == null) goto L_0x0903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x08ee, code lost:
        r4 = r4.edit();
        r5 = r29;
        r9 = r34;
        r4.putLong(r5, r9);
        r4.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x08fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x08fe, code lost:
        r3 = r0;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0903, code lost:
        r5 = r29;
        r9 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        m31905a("combine_responses", r7, r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x090c, code lost:
        if (r3 != null) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x090e, code lost:
        r29 = r5;
        r34 = r9;
        r4 = r33;
        r33 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0920, code lost:
        if ((r3.f41252a & 64) == 0) goto L_0x09da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        r14 = r3.f41259h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0928, code lost:
        if (r14 != 0) goto L_0x0932;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x092a, code lost:
        r29 = r5;
        r34 = r9;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0932, code lost:
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        p000.qdn.m31944a(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x093b, code lost:
        if (p000.cdci.m132542h() == false) goto L_0x09d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0941, code lost:
        if ((r3.f41252a & 8) == 0) goto L_0x099e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0943, code lost:
        r12 = r3.f41258g.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x094d, code lost:
        if (r12.hasNext() == false) goto L_0x099e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x094f, code lost:
        r14 = (p000.qgx) r12.next();
        r15 = r14.f41271a.mo73781l();
        r14 = r14.f41272b.mo73781l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0965, code lost:
        if ("android_id".equals(r15) == false) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        r14 = java.lang.Long.parseLong(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x096b, code lost:
        r29 = r5;
        r34 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:?, code lost:
        r29 = r5;
        r34 = r9;
        p000.qdd.f40972a.mo25416d("NumberFormatException while parsing AID from response", new java.lang.Object[0]);
        r9 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0989, code lost:
        if (r9.length() == 0) goto L_0x098b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x098b, code lost:
        r9 = new java.lang.String("NumberFormatException parsing AID from response:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0991, code lost:
        r9 = "NumberFormatException parsing AID from response:".concat(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0995, code lost:
        p000.qdg.m31921b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x099e, code lost:
        r29 = r5;
        r34 = r9;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x09a8, code lost:
        if (r14 != 0) goto L_0x09ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x09aa, code lost:
        p000.qdd.f40972a.mo25414c("updateCheckinIdTokenFileFromResponse, Reading existing AID", new java.lang.Object[0]);
        r14 = p000.qdn.m31947b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x09be, code lost:
        if ((r3.f41252a & 64) == 0) goto L_0x09ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x09c0, code lost:
        r9 = r3.f41259h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x09c6, code lost:
        if (r9 != 0) goto L_0x09c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x09ca, code lost:
        r9 = p000.qdg.m31920b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x09ce, code lost:
        p000.qdn.m31945a(r4, r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x09d2, code lost:
        r29 = r5;
        r34 = r9;
        p000.qdn.m31943a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x09da, code lost:
        r29 = r5;
        r34 = r9;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x09e0, code lost:
        r5 = r4.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09e6, code lost:
        if (r5 != null) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        r10 = new android.content.ContentValues();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09f1, code lost:
        if ((r3.f41252a & 8) != 0) goto L_0x09f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09f3, code lost:
        r12 = r3.f41258g.iterator();
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x09fe, code lost:
        if (r12.hasNext() != false) goto L_0x0a00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:?, code lost:
        r15 = (p000.qgx) r12.next();
        r26 = r12;
        r12 = r15.f41271a.mo73781l();
        r15 = r15.f41272b.mo73781l();
        r10.put(r12, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a1b, code lost:
        if ("android_id".equals(r12) != false) goto L_0x0a1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a1d, code lost:
        p000.qdn.m31946a(r4, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a20, code lost:
        r12 = r26;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a24, code lost:
        r12 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a27, code lost:
        if (r14 == false) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:?, code lost:
        r14 = p000.qdn.m31947b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a32, code lost:
        if (r14 != 0) goto L_0x0a34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        p000.qdn.m31946a(r4, java.lang.Long.toString(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a41, code lost:
        if (r3.f41256e == false) goto L_0x0a43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:?, code lost:
        r6 = r10.size();
        r12 = new java.lang.StringBuilder(41);
        r12.append("From server: ");
        r12.append(r6);
        r12.append(" gservices [full]");
        android.util.Log.i("CheckinResponseProcess", r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:?, code lost:
        r5.update(p000.svu.f45249a, r10, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a66, code lost:
        r33 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a6a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:?, code lost:
        r1 = r0.getMessage();
        r6 = r4.getPackageName();
        r33 = r11;
        r11 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 60) + java.lang.String.valueOf(r6).length());
        r11.append("Caught exception updating gservices MAIN: ");
        r11.append(r1);
        r11.append(" Context package: ");
        r11.append(r6);
        android.util.Log.w("CheckinResponseProcess", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0aa5, code lost:
        r33 = r11;
        r1 = r3.f41257f.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0ab1, code lost:
        if (r1.hasNext() != false) goto L_0x0ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0ab3, code lost:
        r11 = (java.lang.String) r1.next();
        r26 = r1;
        r10.put(r11, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0ac6, code lost:
        if ("android_id".equals(r11) != false) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0ac8, code lost:
        android.util.Log.w("CheckinResponseProcess", "Removing Android ID from Gservices");
        p000.qdg.m31921b("ERROR: Removing Android ID from Gservices");
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0ad5, code lost:
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0ad8, code lost:
        r1 = r3.f41258g.size();
        r6 = r3.f41257f.size();
        r11 = new java.lang.StringBuilder(66);
        r11.append("From server: ");
        r11.append(r1);
        r11.append(" gservices updates and ");
        r11.append(r6);
        r11.append(" deletes");
        android.util.Log.i("CheckinResponseProcess", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:?, code lost:
        r5.update(p000.svu.f45250b, r10, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b0c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0b0e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:?, code lost:
        r1 = r0.getMessage();
        r11 = r4.getPackageName();
        r6 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 65) + java.lang.String.valueOf(r11).length());
        r6.append("Caught exception updating gservices MAIN DIFF: ");
        r6.append(r1);
        r6.append(" Context package: ");
        r6.append(r11);
        android.util.Log.w("CheckinResponseProcess", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b46, code lost:
        p000.qde.m31912a(r4, r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b4a, code lost:
        r33 = r11;
        p000.qde.m31912a(r4, r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b50, code lost:
        r33 = r11;
        android.util.Log.w("CheckinResponseProcess", "Content Resolver is null, not updating gservices");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b5b, code lost:
        if ((r3.f41252a & 64) == 0) goto L_0x0b8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b63, code lost:
        if (r3.f41259h != 0) goto L_0x0b65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b65, code lost:
        p000.qdn.m31953e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b6e, code lost:
        if (p000.qdn.m31947b(r4) == 0) goto L_0x0b70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b70, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b72, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b73, code lost:
        r3 = r8.f41163c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b77, code lost:
        if (r3.f164950c == false) goto L_0x0b79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b7a, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b80, code lost:
        r3 = (p000.qge) r3.f164949b;
        r5 = p000.qge.f41150j;
        r3.f41152a |= 32;
        r3.f41158g = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b91, code lost:
        m31905a("update_id_token", r7, r2, r13);
        m31910b(r2, r13);
        r1 = new java.util.ArrayList(r7.mo67618b().values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0bae, code lost:
        r1.add(0, 6L);
        p000.qdg.m31918a(r1.toArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0bc3, code lost:
        r22 = r22 | r33.f40957b;
        r1 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:?, code lost:
        r1.f40978g.add(r8.mo24027a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0beb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0bf0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0bf1, code lost:
        r1 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0bf4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0bf6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0bf7, code lost:
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0bf9, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0bfa, code lost:
        r12 = r25;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0c00, code lost:
        r12 = r25;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0c06, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0c07, code lost:
        r12 = r25;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0c1c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c1d, code lost:
        r30 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c22, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c23, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c2c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c2d, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
        r32 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c36, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c37, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
        r32 = r12;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c41, code lost:
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0cb2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0cb3, code lost:
        r30 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0cb8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0cb9, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
        r27 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04cd A[SYNTHETIC, Splitter:B:182:0x04cd] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0509 A[SYNTHETIC, Splitter:B:196:0x0509] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0518 A[Catch:{ IOException -> 0x05af }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0519 A[Catch:{ IOException -> 0x05af }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x053b A[Catch:{ IOException -> 0x05ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x053c A[Catch:{ IOException -> 0x05ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x055a A[Catch:{ IOException -> 0x05ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x055b A[Catch:{ IOException -> 0x05ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05c1 A[Catch:{ all -> 0x05b1, all -> 0x0746 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x06db A[Catch:{ all -> 0x05b1, all -> 0x0746 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06dc A[ADDED_TO_REGION, Catch:{ all -> 0x05b1, all -> 0x0746 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0701 A[Catch:{ all -> 0x05b1, all -> 0x0746 }] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0b5d A[Catch:{ IOException -> 0x0bf0, all -> 0x0beb }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0b8f A[Catch:{ IOException -> 0x0bf0, all -> 0x0beb }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0cb2 A[ExcHandler: all (th java.lang.Throwable), PHI: r5 10  PHI: (r5v4 int) = (r5v1 int), (r5v1 int), (r5v5 int), (r5v5 int), (r5v5 int), (r5v5 int), (r5v5 int), (r5v1 int) binds: [B:88:0x032f, B:89:?, B:101:0x0360, B:102:?, B:104:0x036f, B:111:0x0382, B:122:0x03b2, B:93:0x0341] A[DONT_GENERATE, DONT_INLINE], Splitter:B:88:0x032f] */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0d04 A[Catch:{ all -> 0x0d7f }] */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0d0b A[Catch:{ all -> 0x0d7f }] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0d12 A[Catch:{ all -> 0x0d7f }] */
    /* JADX WARNING: Removed duplicated region for block: B:620:0x0d1e A[Catch:{ all -> 0x0d7f }] */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0d20 A[Catch:{ all -> 0x0d7f }] */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0d27 A[Catch:{ all -> 0x0d7f }] */
    /* JADX WARNING: Removed duplicated region for block: B:628:0x0d49  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x0d6b  */
    /* renamed from: a */
    public final qda mo23927a(qdu qdu) {
        List list;
        bxvd bxvd;
        int i;
        Throwable th;
        bxvd bxvd2;
        bmxv bmxv;
        List list2;
        int i2;
        int i3;
        qgv qgv;
        qgr qgr;
        boolean z;
        qgv qgv2;
        int i4;
        IOException iOException;
        int i5;
        boolean z2;
        List list3;
        qgv qgv3;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        qgv qgv4;
        int i9;
        qgv qgv5;
        String str;
        long j;
        bdbg bdbg;
        Throwable th2;
        String str2;
        long j2;
        long j3;
        String str3;
        int i10;
        qgu qgu;
        URL url;
        IOException iOException2;
        boolean z5;
        boolean z6;
        IOException iOException3;
        long j4;
        HttpURLConnection httpURLConnection;
        String str4;
        int responseCode;
        qgv a;
        bxvd bxvd3;
        boolean z7;
        bxvd da;
        boolean z8;
        qdd qdd = this;
        qdu qdu2 = qdu;
        String str5 = "gzip";
        qdh.f40979a = qdu2.f41039i;
        Context applicationContext = qdu2.f41043m.getApplicationContext();
        int threadPriority = Process.getThreadPriority(Process.myTid());
        Process.setThreadPriority(9);
        qdd.f40976e = false;
        qdd.f40977f = 0;
        bmxv bmxv2 = bmvz.f131120a;
        if (qdd.f40974c.mo66813a()) {
            List a2 = m31903a(((qdb) qdd.f40974c.mo66814b()).f40966a);
            qdb qdb = (qdb) qdd.f40974c.mo66814b();
            bmza b = bmza.m108659b(bmvy.f131119a);
            qgu a3 = qcx.m31875a(qdu2.f41046p);
            bxvd bxvd4 = (bxvd) a3.mo74142c(5);
            bxvd4.mo73625a((GeneratedMessageLite) a3);
            qdb.f40969d = bxvd4;
            int i11 = Build.VERSION.SDK_INT;
            UserManager userManager = (UserManager) qdb.f40966a.getSystemService("user");
            if (!cdci.f180455a.mo6606a().mo77237N()) {
                z8 = false;
            } else {
                if (userManager != null && userManager.isManagedProfile() && !a2.isEmpty()) {
                    int size = a2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            z8 = true;
                            break;
                        }
                        Account account = (Account) a2.get(i12);
                        if (!"com.google.work".equals(account.type)) {
                            break;
                        }
                        i12++;
                        if (!account.name.endsWith("@android-for-work.gserviceaccount.com")) {
                            break;
                        }
                    }
                }
                z8 = false;
            }
            qdb.f40968c = z8;
            bmza a4 = bmza.m108657a(bmvy.f131119a);
            m31907a(qdu2, a4);
            bxvd da2 = qgr.f41209d.mo74144da();
            if (qdu.mo23968a()) {
                qcx.m31879a(qdb.f40966a, qdb.f40969d, qdu2.f41032b);
            }
            qdb.m31901a("build", a4);
            if (qdu.mo23969b()) {
                qcx.m31878a(qdb.f40966a, qdb.f40969d);
            }
            qdb.m31901a("package_properties", a4);
            if (qdu.mo23970c()) {
                qcx.m31877a(qdb.f40966a, (TelephonyManager) qdb.f40966a.getSystemService("phone"), (WifiManager) qdb.f40966a.getSystemService("wifi"), (ConnectivityManager) qdb.f40966a.getSystemService("connectivity"), qdb.f40968c, qdb.f40969d);
            }
            qdb.m31901a("network_properties", a4);
            if (qdu.mo23971d()) {
                qcx.m31885a(Locale.getDefault(), qdb.f40969d);
            }
            qdb.m31901a("local_property", a4);
            if (qdu.mo23972e()) {
                qcx.m31883a(qdb.f40966a, qdb.f40968c, qdb.f40969d);
            }
            qdb.m31901a("id_property", a4);
            if (qdu.mo23973f()) {
                qcx.m31882a(qdb.f40966a, a2, qdb.f40969d);
            }
            qdb.m31901a("acct_info", a4);
            if (qdu.mo23974g()) {
                qcx.m31886a(TimeZone.getDefault(), qdb.f40969d);
            }
            qdb.m31901a("time_zone", a4);
            if (qdu.mo23975h()) {
                qcx.m31892e(qdb.f40966a, qdb.f40969d);
            }
            qdb.m31901a("device_config", a4);
            if (qdu.mo23976i()) {
                qcx.m31884a(qdb.f40969d);
            }
            qdb.m31901a("requested_groups", a4);
            if (qdu2.f41048r) {
                qcx.m31893f(qdb.f40966a, qdb.f40969d);
            } else {
                f40972a.mo25414c("Skipping droidguard", new Object[0]);
            }
            long a5 = qdb.m31901a("droid_guard", a4);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgr qgr2 = (qgr) da2.f164949b;
            qgr2.f41211a |= 2;
            qgr2.f41213c = a5;
            if (qdu.mo23977j()) {
                qcx.m31895h(qdb.f40966a, qdb.f40969d);
            }
            qdb.m31901a("managing_app_info", a4);
            if (qdu.mo23978k()) {
                qcx.m31894g(qdb.f40966a, qdb.f40969d);
            }
            qdb.m31901a("device_data_version_info", a4);
            if (qdu.mo23979l()) {
                qcx.m31889b(qdb.f40966a, qdb.f40969d);
            }
            qdb.m31901a("device_subtype_properties", a4);
            if (qdu.mo23980m()) {
                qcx.m31891d(qdb.f40966a, qdb.f40969d);
            }
            qdb.m31901a("restricted_device_flags", a4);
            if (qdu.mo23981n()) {
                qcx.m31890c(qdu2.f41043m, qdb.f40969d);
            }
            qdb.m31901a("clock_work_data", a4);
            m31910b(qdu2, a4);
            b.mo66931e();
            long a6 = b.mo66928a(TimeUnit.MILLISECONDS);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgr qgr3 = (qgr) da2.f164949b;
            qgr3.f41211a |= 1;
            qgr3.f41212b = a6;
            qdb.f40967b = bmxv.m108566b((qgr) da2.mo74062i());
            bxvd bxvd5 = qdb.f40969d;
            boolean z9 = qdu2.f41033c;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            qgu qgu2 = (qgu) bxvd5.f164949b;
            qgu qgu3 = qgu.f41220A;
            qgu2.f41224a |= 8388608;
            qgu2.f41248y = z9;
            bxvd bxvd6 = qdb.f40969d;
            boolean z10 = qdu2.f41041k;
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            qgu qgu4 = (qgu) bxvd6.f164949b;
            qgu4.f41224a |= 16777216;
            qgu4.f41249z = z10;
            qgu qgu5 = (qgu) qdb.f40969d.mo74062i();
            bxvd bxvd7 = (bxvd) qgu5.mo74142c(5);
            bxvd7.mo73625a((GeneratedMessageLite) qgu5);
            bxvd = bxvd7;
            list = a2;
        } else {
            List a7 = m31903a(applicationContext);
            qit qit = new qit();
            cazf.m127594a(qdu);
            qit.f41482a = qdu2;
            bngx a8 = bngx.m109368a((Collection) a7);
            cazf.m127594a(a8);
            qit.f41483b = a8;
            cazf.m127595a(qit.f41482a, qdu.class);
            cazf.m127595a(qit.f41483b, bngx.class);
            bmxv2 = bmxv.m108566b(new qjz(qit.f41482a, qit.f41483b));
            qgu qgu6 = ((qjz) ((bmyg) bmxv2).f131198a).mo24055a().f41520a;
            bxvd bxvd8 = (bxvd) qgu6.mo74142c(5);
            bxvd8.mo73625a((GeneratedMessageLite) qgu6);
            bxvd = bxvd8;
            list = a7;
        }
        if (qdu2.f41045o == null) {
            try {
                String a9 = qdd.f40973b.mo23923a(qdd.f40975d);
                if (a9 != null) {
                    qdu2.f41045o = String.format("NID=%s", a9);
                }
            } catch (RuntimeException e) {
                f40972a.mo25415d("%s : Error getting cookie.", e, qdu2.f41036f);
            }
        }
        qgf qgf = new qgf(bmvy.f131119a);
        try {
            String str6 = "CheckinTask_bookmark";
            list3 = list;
            long j5 = 0;
            if (!qdu2.f41044n) {
                i7 = 0;
                z4 = false;
                i6 = 0;
                z3 = false;
                qgv3 = null;
            } else {
                SharedPreferences sharedPreferences = qdu2.f41032b;
                if (sharedPreferences == null) {
                    i7 = 0;
                    z4 = false;
                    i6 = 0;
                    z3 = false;
                    qgv3 = null;
                } else {
                    j5 = sharedPreferences.getLong(str6, 0);
                    i7 = 0;
                    z4 = false;
                    i6 = 0;
                    z3 = false;
                    qgv3 = null;
                }
            }
            loop1:
            while (true) {
                if (i7 >= 10) {
                    i = threadPriority;
                    bxvd2 = bxvd;
                    bmxv = bmxv2;
                    i8 = i7;
                    z = z4;
                    list2 = list3;
                    qgv4 = qgv3;
                    break;
                }
                qgf.f41161a.mo66930d();
                qdd.f40976e = false;
                qcz qcz = new qcz();
                z = z4;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                qgu qgu7 = (qgu) bxvd.f164949b;
                qgu qgu8 = qgu.f41220A;
                list2 = list3;
                qgu7.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                qgu7.f41241r = i7;
                qhg qhg = qgu7.f41235l;
                if (qhg == null) {
                    qhg = qhg.f41336o;
                }
                bxvd bxvd9 = (bxvd) qhg.mo74142c(5);
                bxvd9.mo73625a((GeneratedMessageLite) qhg);
                if (bxvd9.f164950c) {
                    bxvd9.mo74035c();
                    bxvd9.f164950c = false;
                }
                bmxv = bmxv2;
                ((qhg) bxvd9.f164949b).f41342e = GeneratedMessageLite.m124030de();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                qgu qgu9 = (qgu) bxvd.f164949b;
                qhg qhg2 = (qhg) bxvd9.mo74062i();
                qhg2.getClass();
                qgu9.f41235l = qhg2;
                qgu9.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bnha h = bnhe.m109414h();
                bmza a10 = bmza.m108657a(bmvy.f131119a);
                m31907a(qdu2, a10);
                if (qdu2.f41044n) {
                    try {
                        str = str6;
                        j = m31902a(j5, qdu2, bxvd);
                    } catch (IOException e2) {
                        iOException = e2;
                        i = threadPriority;
                        bxvd2 = bxvd;
                        i4 = i7;
                        qgv2 = qgv3;
                        try {
                            f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                            int i13 = qdd.f40977f;
                            qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                            if (!qdd.f40976e) {
                            }
                            if (!qdu2.f41040j) {
                            }
                            if (!z) {
                            }
                            if (qgf.f41161a.f131251a) {
                            }
                            Process.setThreadPriority(i);
                            i2 = i13;
                            qgv = qgv2;
                            i3 = i5;
                            qgu qgu10 = (qgu) bxvd2.mo74062i();
                            ArrayList arrayList = qdd.f40978g;
                            if (!qdd.f40974c.mo66813a()) {
                            }
                            return new qda(qgv, list2, qgu10, i3, i2, arrayList, qgr);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            Process.setThreadPriority(i);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i = threadPriority;
                        Process.setThreadPriority(i);
                        throw th;
                    }
                } else {
                    str = str6;
                    j = j5;
                }
                i = threadPriority;
                try {
                    m31905a("add_event_log", h, qdu2, a10);
                    if (i7 > 0) {
                        if (j5 == j) {
                            bxvd2 = bxvd;
                            i8 = i7;
                            qgv4 = qgv3;
                            break;
                        }
                    }
                    qcx.m31876a(applicationContext, qdg.m31920b(applicationContext), bxvd);
                    qdg.m31918a("CheckinTask:SentRequest", Long.valueOf(SystemClock.elapsedRealtime()));
                    qcy qcy = qdd.f40973b;
                    qgu qgu11 = (qgu) bxvd.mo74062i();
                    if (qdu2.f41035e.f41029b) {
                        try {
                            bdbg = qcy.mo23922a();
                        } catch (IOException e3) {
                            iOException = e3;
                            bxvd2 = bxvd;
                            i4 = i7;
                            qgv2 = qgv3;
                            f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                            int i132 = qdd.f40977f;
                            qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                            if (!qdd.f40976e) {
                            }
                            if (!qdu2.f41040j) {
                            }
                            if (!z) {
                            }
                            if (qgf.f41161a.f131251a) {
                            }
                            Process.setThreadPriority(i);
                            i2 = i132;
                            qgv = qgv2;
                            i3 = i5;
                            qgu qgu102 = (qgu) bxvd2.mo74062i();
                            ArrayList arrayList2 = qdd.f40978g;
                            if (!qdd.f40974c.mo66813a()) {
                            }
                            return new qda(qgv, list2, qgu102, i3, i2, arrayList2, qgr);
                        }
                    } else {
                        bdbg = null;
                    }
                    bxvd2 = bxvd;
                    try {
                        i8 = i7;
                        try {
                            URL url2 = new URL(qdu2.f41047q);
                            try {
                                qgf.f41162b.mo66930d();
                                int i14 = 0;
                                while (true) {
                                    Context context = applicationContext;
                                    if (i14 >= 3) {
                                        break;
                                    }
                                    int i15 = i14 + 1;
                                    j2 = j;
                                    long j6 = (long) i15;
                                    try {
                                        bxvd bxvd10 = qgf.f41163c;
                                        i10 = i15;
                                        if (bxvd10.f164950c) {
                                            bxvd10.mo74035c();
                                            bxvd10.f164950c = false;
                                        }
                                        qge qge = (qge) bxvd10.f164949b;
                                        qge qge2 = qge.f41150j;
                                        qge.f41152a |= 128;
                                        qge.f41160i = j6;
                                        if (!qdu2.f41039i) {
                                            TrafficStats.setThreadStatsTag(1032);
                                        } else {
                                            shr.m35316b(1032);
                                        }
                                        if (bdbg != null) {
                                            try {
                                                if (qcz.f40957b) {
                                                    httpURLConnection = qcy.mo23925a(qdu2.f41047q, bdbg);
                                                    str4 = qdu2.f41045o;
                                                    httpURLConnection.setRequestProperty("Content-type", "application/x-protobuffer");
                                                    httpURLConnection.setRequestProperty("Content-encoding", str5);
                                                    httpURLConnection.setRequestProperty("Accept-encoding", str5);
                                                    httpURLConnection.setDoOutput(true);
                                                    httpURLConnection.setConnectTimeout(120000);
                                                    httpURLConnection.setReadTimeout(120000);
                                                    if (str4 != null) {
                                                        try {
                                                            str2 = str5;
                                                            try {
                                                                f40972a.mo25412b("cookie is null", new Object[0]);
                                                            } catch (IOException e4) {
                                                                e = e4;
                                                            }
                                                        } catch (IOException e5) {
                                                            e = e5;
                                                            str2 = str5;
                                                            iOException2 = e;
                                                            url = url2;
                                                            qgu = qgu11;
                                                            z5 = iOException2 instanceof SSLException;
                                                            if (z5 || qcz.f40956a) {
                                                                if (bdbg != null && !qcz.f40957b) {
                                                                    if (!(iOException2 instanceof SocketTimeoutException) && !(iOException2 instanceof SocketException) && !(iOException2 instanceof UnknownHostException) && !(iOException2 instanceof ConnectException)) {
                                                                        if (z5) {
                                                                        }
                                                                    }
                                                                    f40972a.mo25415d("Connection error, retry with DNS fixing: %s.", iOException2, iOException2.getMessage());
                                                                    qcz.f40957b = true;
                                                                    bxvd bxvd11 = qgf.f41163c;
                                                                    if (bxvd11.f164950c) {
                                                                        bxvd11.mo74035c();
                                                                        bxvd11.f164950c = false;
                                                                    }
                                                                    qge qge3 = (qge) bxvd11.f164949b;
                                                                    qge3.f41152a |= 8;
                                                                    qge3.f41156e = true;
                                                                }
                                                                throw iOException2;
                                                            }
                                                            f40972a.mo25415d("SSL error, attempting time correction: %s.", iOException2, iOException2.getMessage());
                                                            try {
                                                                HttpURLConnection a11 = qcy.mo23924a(qdu2.f41047q);
                                                                if (a11 instanceof HttpsURLConnection) {
                                                                    long j7 = qdu2.f41037g;
                                                                    qce qce = new qce();
                                                                    qce.f40920a = 120000;
                                                                    qce.f40921b = 120000;
                                                                    long a12 = qce.mo23910a(a11, qdu2, j7);
                                                                    long currentTimeMillis = System.currentTimeMillis();
                                                                    long abs = Math.abs(a12 - currentTimeMillis);
                                                                    if (abs < 604800000) {
                                                                        f40972a.mo25414c("Server time agrees: delta %d msec", Long.valueOf(abs));
                                                                        j4 = 0;
                                                                    } else if (aymn.m84269a(qdu2.f41043m.getContentResolver(), "checkin_disable_time_adjustment", false)) {
                                                                        f40972a.mo25414c("Disabled time adjustment", new Object[0]);
                                                                        j4 = 0;
                                                                    } else {
                                                                        f40972a.mo25416d("Changing time from %d to %d", Long.valueOf(currentTimeMillis), Long.valueOf(a12));
                                                                        qdg.m31918a("Fixing system time skew", Long.valueOf(Math.abs(currentTimeMillis - a12)));
                                                                        new skc(qdu2.f41043m).f44603e.setTime(a12);
                                                                        j4 = abs;
                                                                    }
                                                                    if (j4 > 0) {
                                                                        z6 = true;
                                                                    } else {
                                                                        z6 = false;
                                                                    }
                                                                    try {
                                                                        bxvd bxvd12 = qgf.f41163c;
                                                                        if (bxvd12.f164950c) {
                                                                            bxvd12.mo74035c();
                                                                            bxvd12.f164950c = false;
                                                                        }
                                                                        qge qge4 = (qge) bxvd12.f164949b;
                                                                        qge4.f41152a |= 4;
                                                                        qge4.f41155d = j4;
                                                                    } catch (IOException e6) {
                                                                        iOException3 = e6;
                                                                        f40972a.mo25417e("Time set error: %s.", iOException3, iOException3.getMessage());
                                                                        if (bdbg == null || qcz.f40957b) {
                                                                            throw iOException3;
                                                                        }
                                                                        if (z6) {
                                                                        }
                                                                        qcz.f40956a = true;
                                                                        m31909b(qdu);
                                                                        applicationContext = context;
                                                                        j = j2;
                                                                        i14 = i10;
                                                                        str5 = str2;
                                                                        url2 = url;
                                                                        qgu11 = qgu;
                                                                    }
                                                                    if (z6) {
                                                                        if (bdbg == null || qcz.f40957b) {
                                                                            throw iOException2;
                                                                        }
                                                                    }
                                                                    qcz.f40956a = true;
                                                                } else {
                                                                    String valueOf = String.valueOf(a11.getURL());
                                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                                                                    sb.append("Unsupported URL for obtaining network time: ");
                                                                    sb.append(valueOf);
                                                                    throw new IOException(sb.toString());
                                                                }
                                                            } catch (IOException e7) {
                                                                iOException3 = e7;
                                                                z6 = false;
                                                                f40972a.mo25417e("Time set error: %s.", iOException3, iOException3.getMessage());
                                                                throw iOException3;
                                                            }
                                                            m31909b(qdu);
                                                            applicationContext = context;
                                                            j = j2;
                                                            i14 = i10;
                                                            str5 = str2;
                                                            url2 = url;
                                                            qgu11 = qgu;
                                                        }
                                                    } else {
                                                        str2 = str5;
                                                        try {
                                                            httpURLConnection.setRequestProperty("Cookie", str4);
                                                        } catch (IOException e8) {
                                                            e = e8;
                                                            url = url2;
                                                            qgu = qgu11;
                                                            iOException2 = e;
                                                            z5 = iOException2 instanceof SSLException;
                                                            if (z5) {
                                                            }
                                                            if (z5) {
                                                            }
                                                            throw iOException2;
                                                        }
                                                    }
                                                    bobd bobd = new bobd(httpURLConnection.getOutputStream());
                                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(bobd);
                                                    qgu11.mo73638a(gZIPOutputStream);
                                                    gZIPOutputStream.close();
                                                    bobd.close();
                                                    httpURLConnection.connect();
                                                    if (bdbg != null) {
                                                        bdbg.mo57847b(url2.getHost());
                                                    }
                                                    responseCode = httpURLConnection.getResponseCode();
                                                    if (responseCode == 200) {
                                                        qdd.f40976e = responseCode == 401;
                                                        qdd.f40977f = responseCode;
                                                    }
                                                    a = m31904a(qdu2, httpURLConnection, responseCode);
                                                    String str7 = a.f41261j;
                                                    bxvd3 = qgf.f41163c;
                                                    if ((a.f41252a & 64) == 0) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    url = url2;
                                                    if (!bxvd3.f164950c) {
                                                        bxvd3.mo74035c();
                                                        bxvd3.f164950c = false;
                                                    }
                                                    qge qge5 = (qge) bxvd3.f164949b;
                                                    qge5.f41152a |= 16;
                                                    qge5.f41157f = z7;
                                                    bxvd bxvd13 = qgf.f41163c;
                                                    da = qgd.f41146c.mo74144da();
                                                    if (!da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    qgd qgd = (qgd) da.f164949b;
                                                    str7.getClass();
                                                    qgu = qgu11;
                                                    qgd.f41148a |= 1;
                                                    qgd.f41149b = str7;
                                                    break;
                                                }
                                            } catch (IOException e9) {
                                                e = e9;
                                                str2 = str5;
                                                url = url2;
                                                qgu = qgu11;
                                                iOException2 = e;
                                                z5 = iOException2 instanceof SSLException;
                                                if (z5) {
                                                }
                                                if (z5) {
                                                }
                                                throw iOException2;
                                            }
                                        }
                                        httpURLConnection = qcy.mo23926b(qdu2.f41047q);
                                        str4 = qdu2.f41045o;
                                        httpURLConnection.setRequestProperty("Content-type", "application/x-protobuffer");
                                        httpURLConnection.setRequestProperty("Content-encoding", str5);
                                        httpURLConnection.setRequestProperty("Accept-encoding", str5);
                                        httpURLConnection.setDoOutput(true);
                                        httpURLConnection.setConnectTimeout(120000);
                                        httpURLConnection.setReadTimeout(120000);
                                        if (str4 != null) {
                                        }
                                        bobd bobd2 = new bobd(httpURLConnection.getOutputStream());
                                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(bobd2);
                                        qgu11.mo73638a(gZIPOutputStream2);
                                        gZIPOutputStream2.close();
                                        bobd2.close();
                                        httpURLConnection.connect();
                                        if (bdbg != null) {
                                        }
                                        responseCode = httpURLConnection.getResponseCode();
                                        if (responseCode == 200) {
                                        }
                                        a = m31904a(qdu2, httpURLConnection, responseCode);
                                        String str72 = a.f41261j;
                                        bxvd3 = qgf.f41163c;
                                        if ((a.f41252a & 64) == 0) {
                                        }
                                        url = url2;
                                        try {
                                            if (!bxvd3.f164950c) {
                                            }
                                            qge qge52 = (qge) bxvd3.f164949b;
                                            qge52.f41152a |= 16;
                                            qge52.f41157f = z7;
                                            bxvd bxvd132 = qgf.f41163c;
                                            da = qgd.f41146c.mo74144da();
                                            if (!da.f164950c) {
                                            }
                                            qgd qgd2 = (qgd) da.f164949b;
                                            str72.getClass();
                                            qgu = qgu11;
                                        } catch (IOException e10) {
                                            e = e10;
                                            qgu = qgu11;
                                            iOException2 = e;
                                            z5 = iOException2 instanceof SSLException;
                                            if (z5) {
                                            }
                                            if (z5) {
                                            }
                                            throw iOException2;
                                        }
                                        try {
                                            qgd2.f41148a |= 1;
                                            qgd2.f41149b = str72;
                                            break;
                                        } catch (IOException e11) {
                                            e = e11;
                                            iOException2 = e;
                                            z5 = iOException2 instanceof SSLException;
                                            if (z5) {
                                            }
                                            if (z5) {
                                            }
                                            throw iOException2;
                                        }
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        qgv5 = qgv3;
                                        applicationContext = context;
                                        try {
                                            qgf.mo24028b();
                                            throw th2;
                                        } catch (IOException e12) {
                                            e = e12;
                                            iOException = e;
                                            i4 = i8;
                                            f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                                            int i1322 = qdd.f40977f;
                                            qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                                            if (!qdd.f40976e) {
                                            }
                                            if (!qdu2.f41040j) {
                                            }
                                            if (!z) {
                                            }
                                            if (qgf.f41161a.f131251a) {
                                            }
                                            Process.setThreadPriority(i);
                                            i2 = i1322;
                                            qgv = qgv2;
                                            i3 = i5;
                                            qgu qgu1022 = (qgu) bxvd2.mo74062i();
                                            ArrayList arrayList22 = qdd.f40978g;
                                            if (!qdd.f40974c.mo66813a()) {
                                            }
                                            return new qda(qgv, list2, qgu1022, i3, i2, arrayList22, qgr);
                                        }
                                    }
                                    applicationContext = context;
                                    j = j2;
                                    i14 = i10;
                                    str5 = str2;
                                    url2 = url;
                                    qgu11 = qgu;
                                }
                            } catch (Throwable th6) {
                                qgv5 = qgv3;
                                th2 = th6;
                                qgf.mo24028b();
                                throw th2;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            qgv5 = qgv3;
                            iOException = e;
                            i4 = i8;
                            f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                            int i13222 = qdd.f40977f;
                            qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                            if (!qdd.f40976e) {
                            }
                            if (!qdu2.f41040j) {
                            }
                            if (!z) {
                            }
                            if (qgf.f41161a.f131251a) {
                            }
                            Process.setThreadPriority(i);
                            i2 = i13222;
                            qgv = qgv2;
                            i3 = i5;
                            qgu qgu10222 = (qgu) bxvd2.mo74062i();
                            ArrayList arrayList222 = qdd.f40978g;
                            if (!qdd.f40974c.mo66813a()) {
                            }
                            return new qda(qgv, list2, qgu10222, i3, i2, arrayList222, qgr);
                        }
                    } catch (IOException e14) {
                        e = e14;
                        i8 = i7;
                        qgv5 = qgv3;
                        iOException = e;
                        i4 = i8;
                        f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                        int i132222 = qdd.f40977f;
                        qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                        if (!qdd.f40976e) {
                        }
                        if (!qdu2.f41040j) {
                        }
                        if (!z) {
                        }
                        if (qgf.f41161a.f131251a) {
                        }
                        Process.setThreadPriority(i);
                        i2 = i132222;
                        qgv = qgv2;
                        i3 = i5;
                        qgu qgu102222 = (qgu) bxvd2.mo74062i();
                        ArrayList arrayList2222 = qdd.f40978g;
                        if (!qdd.f40974c.mo66813a()) {
                        }
                        return new qda(qgv, list2, qgu102222, i3, i2, arrayList2222, qgr);
                    }
                } catch (IOException e15) {
                    e = e15;
                    bxvd2 = bxvd;
                    i8 = i7;
                    qgv5 = qgv3;
                    iOException = e;
                    i4 = i8;
                    f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                    int i1322222 = qdd.f40977f;
                    qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                    if (!qdd.f40976e) {
                    }
                    if (!qdu2.f41040j) {
                    }
                    if (!z) {
                    }
                    if (qgf.f41161a.f131251a) {
                    }
                    Process.setThreadPriority(i);
                    i2 = i1322222;
                    qgv = qgv2;
                    i3 = i5;
                    qgu qgu1022222 = (qgu) bxvd2.mo74062i();
                    ArrayList arrayList22222 = qdd.f40978g;
                    if (!qdd.f40974c.mo66813a()) {
                    }
                    return new qda(qgv, list2, qgu1022222, i3, i2, arrayList22222, qgr);
                }
                i7 = i8 + 1;
                qgf = new qgf(bmvy.f131119a);
                list3 = list2;
                bmxv2 = bmxv;
                str6 = str3;
                threadPriority = i;
                bxvd = bxvd2;
                j5 = j3;
                str5 = str2;
                z4 = true;
            }
            try {
                if (!qdu2.f41040j) {
                    qdn.m31955g(applicationContext);
                }
                f40972a.mo25414c("%s : Checkin Succeeded: %s (fragment #%d).", qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i8));
                try {
                    if (!qdu2.f41040j) {
                        i9 = i8;
                        try {
                            m31908a(qdu2, true, i9, qgv2 != null, z3);
                        } catch (IOException e16) {
                            e = e16;
                            iOException = e;
                            z = false;
                            f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                            int i13222222 = qdd.f40977f;
                            qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                            if (!qdd.f40976e) {
                            }
                            if (!qdu2.f41040j) {
                            }
                            if (!z) {
                            }
                            if (qgf.f41161a.f131251a) {
                            }
                            Process.setThreadPriority(i);
                            i2 = i13222222;
                            qgv = qgv2;
                            i3 = i5;
                            qgu qgu10222222 = (qgu) bxvd2.mo74062i();
                            ArrayList arrayList222222 = qdd.f40978g;
                            if (!qdd.f40974c.mo66813a()) {
                            }
                            return new qda(qgv, list2, qgu10222222, i3, i2, arrayList222222, qgr);
                        }
                    }
                    Process.setThreadPriority(i);
                    qgv = qgv2;
                    i2 = i6;
                    i3 = 0;
                } catch (IOException e17) {
                    e = e17;
                    i9 = i8;
                    iOException = e;
                    z = false;
                    f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                    int i132222222 = qdd.f40977f;
                    qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                    if (!qdd.f40976e) {
                        int i16 = Build.VERSION.SDK_INT;
                        int i17 = Build.VERSION.SDK_INT;
                        int i18 = Build.VERSION.SDK_INT;
                    } else {
                        qdn.m31954f(applicationContext);
                    }
                    if (!qdu2.f41040j) {
                        if (qgv2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m31908a(qdu2, false, i4, z2, false);
                    }
                    if (!z) {
                        i5 = 2;
                    } else {
                        i5 = 1;
                    }
                    if (qgf.f41161a.f131251a) {
                        qdd.f40978g.add(qgf.mo24027a());
                    }
                    Process.setThreadPriority(i);
                    i2 = i132222222;
                    qgv = qgv2;
                    i3 = i5;
                    qgu qgu102222222 = (qgu) bxvd2.mo74062i();
                    ArrayList arrayList2222222 = qdd.f40978g;
                    if (!qdd.f40974c.mo66813a()) {
                    }
                    return new qda(qgv, list2, qgu102222222, i3, i2, arrayList2222222, qgr);
                }
            } catch (IOException e18) {
                i4 = i8;
                iOException = e18;
                f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
                int i1322222222 = qdd.f40977f;
                qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
                if (!qdd.f40976e) {
                }
                if (!qdu2.f41040j) {
                }
                if (!z) {
                }
                if (qgf.f41161a.f131251a) {
                }
                Process.setThreadPriority(i);
                i2 = i1322222222;
                qgv = qgv2;
                i3 = i5;
                qgu qgu1022222222 = (qgu) bxvd2.mo74062i();
                ArrayList arrayList22222222 = qdd.f40978g;
                if (!qdd.f40974c.mo66813a()) {
                }
                return new qda(qgv, list2, qgu1022222222, i3, i2, arrayList22222222, qgr);
            }
        } catch (IOException e19) {
            e = e19;
            int i19 = threadPriority;
            bxvd bxvd14 = bxvd;
            bmxv bmxv3 = bmxv2;
            list2 = list3;
            iOException = e;
            i4 = 0;
            qgv2 = null;
            z = false;
            f40972a.mo25415d("%s : Checkin failed: %s (fragment #%d) %s", iOException, qdu2.f41036f, qdu2.f41047q, Integer.valueOf(i4), iOException.getMessage());
            int i13222222222 = qdd.f40977f;
            qdg.m31918a("CheckinTask:ReceivedFailedResponse", Long.valueOf(SystemClock.elapsedRealtime()));
            if (!qdd.f40976e) {
            }
            if (!qdu2.f41040j) {
            }
            if (!z) {
            }
            if (qgf.f41161a.f131251a) {
            }
            Process.setThreadPriority(i);
            i2 = i13222222222;
            qgv = qgv2;
            i3 = i5;
            qgu qgu10222222222 = (qgu) bxvd2.mo74062i();
            ArrayList arrayList222222222 = qdd.f40978g;
            if (!qdd.f40974c.mo66813a()) {
            }
            return new qda(qgv, list2, qgu10222222222, i3, i2, arrayList222222222, qgr);
        } catch (Throwable th7) {
        }
        qgu qgu102222222222 = (qgu) bxvd2.mo74062i();
        ArrayList arrayList2222222222 = qdd.f40978g;
        if (!qdd.f40974c.mo66813a()) {
            qdb qdb2 = (qdb) qdd.f40974c.mo66814b();
            if (qdb2.f40967b.mo66813a()) {
                qgr = (qgr) qdb2.f40967b.mo66814b();
            } else {
                throw new IllegalStateException("Request is not generated yet.");
            }
        } else {
            qgr = ((qjz) bmxv.mo66814b()).mo24055a().f41521b;
        }
        return new qda(qgv, list2, qgu102222222222, i3, i2, arrayList2222222222, qgr);
    }
}
