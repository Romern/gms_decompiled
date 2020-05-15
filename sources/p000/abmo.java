package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.NetworkQualityReport;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: abmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmo extends aaab {

    /* renamed from: a */
    static final AtomicInteger f57700a = new AtomicInteger(0);

    /* renamed from: b */
    final String f57701b;

    /* renamed from: c */
    private final NetworkQualityReport f57702c;

    /* renamed from: d */
    private final long f57703d;

    /* renamed from: e */
    private final long f57704e;

    public abmo(String str, NetworkQualityReport networkQualityReport) {
        super(50, "LightweightReportNetworkQuality");
        Bundle bundle;
        if (!(networkQualityReport == null || (bundle = networkQualityReport.f79054f) == null)) {
            str = bundle.getString("overriding_package", str);
        }
        this.f57701b = str;
        this.f57702c = networkQualityReport;
        this.f57703d = SystemClock.elapsedRealtime();
        this.f57704e = SystemClock.uptimeMillis();
        synchronized (f57700a) {
            ((beoj) abnd.m47941a().f97906h.mo6606a()).mo60852a((double) f57700a.incrementAndGet(), new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0527, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0557, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x055f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0560, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        p000.abnd.m47943a("GMSCORE_ASYNC_OP_PERMISSION_DENIED");
        r6.f57784b = "PERMISSION_DENIED";
        p000.eoa.m10825a("Herrevad", r2, "Required permissions disabled; dropping report.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0575, code lost:
        monitor-enter(p000.abmo.f57700a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0581, code lost:
        if (((long) p000.abmo.f57700a.decrementAndGet()) < 0) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0583, code lost:
        p000.abmo.f57700a.set(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0601, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0602, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d2, code lost:
        if (r10.f134509e == false) goto L_0x01d4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x0086, B:24:0x00aa, B:43:0x010c, B:213:0x04d4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:246:0x0556=Splitter:B:246:0x0556, B:268:0x0589=Splitter:B:268:0x0589} */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        String str;
        boolean z2;
        int i;
        bxvd bxvd;
        borz[] borzArr;
        Context context2 = context;
        abne a = abne.m47947a("LIGHTWEIGHT_REPORT_NETWORK_QUALITY_EXECUTE");
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f57703d;
            long uptimeMillis = SystemClock.uptimeMillis() - this.f57704e;
            aylp a2 = abnd.m47941a();
            ((beoj) a2.f97904f.mo6606a()).mo60852a((double) elapsedRealtime, this.f57701b);
            ((beoj) a2.f97905g.mo6606a()).mo60852a((double) (elapsedRealtime - uptimeMillis), this.f57701b);
            boolean a3 = cekq.f182858a.mo6606a().mo79237a();
            if (Math.random() < cekq.f182858a.mo6606a().mo79240d()) {
                z = true;
            } else {
                z = false;
            }
            abog abog = new abog(a3 & z);
            String str2 = this.f57701b;
            abog.f57785c = str2;
            if (!abnd.m47946c(str2)) {
                abog.f57785c = "invalid_source_package";
            }
            NetworkQualityReport networkQualityReport = this.f57702c;
            if (networkQualityReport != null) {
                abog.f57786d = networkQualityReport.f79053e;
            }
            if (networkQualityReport == null) {
                eoa.m10828c("Herrevad", "NetworkQualityReport is invalid; dropping report.", new Object[0]);
                str = "INVALID_REPORT";
            } else {
                if (networkQualityReport.f79054f == null) {
                    networkQualityReport.f79054f = new Bundle();
                    int i2 = eoa.f15378a;
                }
                abod a4 = abod.m47984a();
                String str3 = this.f57701b;
                int i3 = this.f57702c.f79053e;
                synchronized (a4.f57778e) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= abmm.m47919c("observationLimiterUserDayEndMillis")) {
                        a4.f57775b.clear();
                        a4.f57776c.clear();
                        abmm.m47909a(0);
                        abmm.m47912a("observationLimiterUserDayEndMillis", currentTimeMillis + 86400000);
                    }
                    if (a4.mo32231a(str3, i3) || a4.mo32234c() || a4.mo32230a(str3) || a4.mo32229a(i3)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    Object[] objArr = {this.f57701b, Integer.valueOf(this.f57702c.f79053e)};
                    int i4 = eoa.f15378a;
                    abod a5 = abod.m47984a();
                    String str4 = this.f57701b;
                    int i5 = this.f57702c.f79053e;
                    synchronized (a5.f57778e) {
                        boolean a6 = a5.mo32231a(str4, i5);
                        boolean c = a5.mo32234c();
                        boolean a7 = a5.mo32230a(str4);
                        boolean a8 = a5.mo32229a(i5);
                        if (!abnd.m47946c(str4)) {
                            str4 = "invalid_source_package";
                        }
                        ((beon) abnd.m47941a().f97901c.mo6606a()).mo60861b(str4, Integer.valueOf(i5), Boolean.valueOf(c), Boolean.valueOf(a8), Boolean.valueOf(a7), Boolean.valueOf(a6));
                    }
                    str = "DROPPED_BY_OBSERVATION_LIMITER";
                } else {
                    aboa c2 = abob.m47979c(context);
                    String a9 = abme.m47896a(context2, this.f57701b);
                    if (a9 != null) {
                        new Object[1][0] = a9;
                        int i6 = eoa.f15378a;
                        str = a9;
                    } else {
                        try {
                            NetworkQualityReport networkQualityReport2 = this.f57702c;
                            if (!networkQualityReport2.f79055g) {
                                i = networkQualityReport2.f79056h;
                            } else {
                                i = -1;
                            }
                            bosu a10 = abnt.m47963a(context2, this.f57701b, i, c2);
                            if (a10 != null) {
                                bxvd = (bxvd) a10.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) a10);
                            } else {
                                bxvd = null;
                            }
                            if (bxvd != null) {
                                boolean z3 = this.f57702c.f79055g;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bosu bosu = (bosu) bxvd.f164949b;
                                bosu bosu2 = bosu.f134668af;
                                bosu.f134702b |= 4194304;
                                bosu.f134688S = z3;
                            }
                            if (bxvd != null) {
                                NetworkQualityReport networkQualityReport3 = this.f57702c;
                                bosu bosu3 = (bosu) bxvd.f164949b;
                                if ((bosu3.f134696a & 64) != 0) {
                                    bort bort = bosu3.f134709i;
                                    if (bort == null) {
                                        bort = bort.f134503m;
                                    }
                                }
                                bosu bosu4 = (bosu) bxvd.f164949b;
                                if ((bosu4.f134696a & 64) != 0) {
                                    if (c2 != null) {
                                        bort bort2 = bosu4.f134709i;
                                        if (bort2 == null) {
                                            bort2 = bort.f134503m;
                                        }
                                        bxvd bxvd2 = (bxvd) bort2.mo74142c(5);
                                        bxvd2.mo73625a((GeneratedMessageLite) bort2);
                                        boolean z4 = networkQualityReport3.f79057i;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bort bort3 = (bort) bxvd2.f164949b;
                                        int i7 = bort3.f134505a | 32;
                                        bort3.f134505a = i7;
                                        bort3.f134511g = z4;
                                        boolean z5 = c2.f57767i;
                                        bort3.f134505a = i7 | 1024;
                                        bort3.f134515k = z5;
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bosu bosu5 = (bosu) bxvd.f164949b;
                                        bort bort4 = (bort) bxvd2.mo74062i();
                                        bosu bosu6 = bosu.f134668af;
                                        bort4.getClass();
                                        bosu5.f134709i = bort4;
                                        bosu5.f134696a |= 64;
                                    }
                                }
                                int i8 = networkQualityReport3.f79049a;
                                if (i8 != -1) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu7 = (bosu) bxvd.f164949b;
                                    bosu bosu8 = bosu.f134668af;
                                    bosu7.f134696a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                                    bosu7.f134673D = i8;
                                }
                                long j = networkQualityReport3.f79050b;
                                if (j != -1) {
                                    long j2 = j / 1000;
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu9 = (bosu) bxvd.f164949b;
                                    bosu bosu10 = bosu.f134668af;
                                    bosu9.f134702b |= 16;
                                    bosu9.f134678I = j2;
                                }
                                long j3 = networkQualityReport3.f79051c;
                                if (j3 != -1) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu11 = (bosu) bxvd.f164949b;
                                    bosu bosu12 = bosu.f134668af;
                                    bosu11.f134702b |= 4096;
                                    bosu11.f134680K = j3;
                                }
                                long j4 = networkQualityReport3.f79052d;
                                if (j4 != -1) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu13 = (bosu) bxvd.f164949b;
                                    bosu bosu14 = bosu.f134668af;
                                    bosu13.f134702b |= 1024;
                                    bosu13.f134679J = j4;
                                }
                                int i9 = networkQualityReport3.f79053e;
                                if (i9 != -1) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu15 = (bosu) bxvd.f164949b;
                                    bosu bosu16 = bosu.f134668af;
                                    bosu15.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    bosu15.f134681L = i9;
                                }
                                long a11 = abnd.m47940a(System.currentTimeMillis());
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bosu bosu17 = (bosu) bxvd.f164949b;
                                bosu bosu18 = bosu.f134668af;
                                bosu17.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                bosu17.f134682M = a11;
                                if (cekq.m137092c() > 1) {
                                    int c3 = (int) cekq.m137092c();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu19 = (bosu) bxvd.f164949b;
                                    bosu19.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    bosu19.f134683N = c3;
                                }
                                Bundle bundle = networkQualityReport3.f79054f;
                                if (bundle != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (String str5 : bundle.keySet()) {
                                        if (str5 == null) {
                                            eoa.m10828c("Herrevad", "null key, skipping", new Object[0]);
                                        } else {
                                            Object obj = bundle.get(str5);
                                            if (obj == null) {
                                                StringBuilder sb = new StringBuilder(str5.length() + 26);
                                                sb.append("null value for ");
                                                sb.append(str5);
                                                sb.append(", skipping.");
                                                eoa.m10828c("Herrevad", sb.toString(), new Object[0]);
                                            } else {
                                                bxvd da = borz.f134534d.mo74144da();
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                borz borz = (borz) da.f164949b;
                                                str5.getClass();
                                                borz.f134536a |= 1;
                                                borz.f134537b = str5;
                                                String obj2 = obj.toString();
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                borz borz2 = (borz) da.f164949b;
                                                obj2.getClass();
                                                borz2.f134536a |= 2;
                                                borz2.f134538c = obj2;
                                                arrayList.add((borz) da.mo74062i());
                                            }
                                        }
                                    }
                                    borzArr = (borz[]) arrayList.toArray(new borz[arrayList.size()]);
                                } else {
                                    eoa.m10828c("Herrevad", "null extraStats, returning null.", new Object[0]);
                                    borzArr = null;
                                }
                                if (borzArr != null) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    ((bosu) bxvd.f164949b).f134690U = GeneratedMessageLite.m124030de();
                                    List asList = Arrays.asList(borzArr);
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu20 = (bosu) bxvd.f164949b;
                                    if (!bosu20.f134690U.mo73666a()) {
                                        bosu20.f134690U = GeneratedMessageLite.m124021a(bosu20.f134690U);
                                    }
                                    bxsy.m123078a(asList, bosu20.f134690U);
                                } else {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    ((bosu) bxvd.f164949b).f134690U = GeneratedMessageLite.m124030de();
                                }
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bosu bosu21 = (bosu) bxvd.f164949b;
                                bosu bosu22 = bosu.f134668af;
                                bosu21.f134691V = 2;
                                bosu21.f134702b |= 16777216;
                                if (this.f57702c.f79054f.containsKey("lightweight_shim")) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bosu bosu23 = (bosu) bxvd.f164949b;
                                    bosu23.f134691V = 3;
                                    bosu23.f134702b |= 16777216;
                                    if (this.f57702c.f79054f.containsKey("latency_bps")) {
                                        long j5 = this.f57702c.f79054f.getLong("latency_bps");
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bosu bosu24 = (bosu) bxvd.f164949b;
                                        bosu24.f134696a |= Integer.MIN_VALUE;
                                        bosu24.f134674E = j5;
                                    }
                                }
                                bosu bosu25 = (bosu) bxvd.mo74062i();
                                int i10 = eoa.f15378a;
                                qwo a12 = abnd.m47942a(context).mo24333a(bosu25);
                                a12.mo24325a(bosu25.f134704d);
                                if (cekq.m137092c() > 1) {
                                    a12.mo24324a(abnd.m47940a(((cagi) a12.f42325i.f164949b).f173099b), abnd.m47940a(((cagi) a12.f42325i.f164949b).f173100c));
                                }
                                a12.mo24327b();
                                abnd.m47943a("LIGHTWEIGHT_OBSERVATION_DIRECT_TO_CLEARCUT");
                                abod a13 = abod.m47984a();
                                String str6 = this.f57701b;
                                int i11 = this.f57702c.f79053e;
                                synchronized (a13.f57778e) {
                                    a13.f57777d.put(Integer.valueOf(a13.mo32232b(str6, i11)), Long.valueOf(SystemClock.elapsedRealtime()));
                                    abmm.m47909a(abmm.m47908a() + 1);
                                    String str7 = (String) a13.f57774a.get(str6);
                                    if (str7 != null) {
                                        Integer num = (Integer) a13.f57775b.get(str7);
                                        if (num == null) {
                                            num = 0;
                                        }
                                        a13.f57775b.put(str7, Integer.valueOf(num.intValue() + 1));
                                    }
                                    SparseIntArray sparseIntArray = a13.f57776c;
                                    sparseIntArray.put(i11, sparseIntArray.get(i11, 0) + 1);
                                }
                                str = "SUCCESS";
                            } else {
                                int i12 = eoa.f15378a;
                                str = "NETWORK_ANNOTATOR_ERROR";
                            }
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            str = "THREAD_INTERRUPTED";
                        }
                    }
                }
            }
            abog.f57784b = str;
            synchronized (f57700a) {
                try {
                    if (((long) f57700a.decrementAndGet()) < 0) {
                        f57700a.set(0);
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
            if (abog.f57787e) {
                long currentTimeMillis2 = System.currentTimeMillis() - abog.f57783a;
                new Object[1][0] = abog.getClass().getSimpleName() + "[\n  latency: " + currentTimeMillis2 + "\n  source_package: " + abog.f57785c + "\n  measurement_type: " + abog.f57786d + "\n  status_code: " + abog.f57784b + "\n]";
                int i13 = eoa.f15378a;
                aylp a14 = abnd.m47941a();
                String str8 = abog.f57785c;
                int i14 = abog.f57786d;
                ((beoj) a14.f97907i.mo6606a()).mo60852a((double) currentTimeMillis2, str8, Integer.valueOf(i14), abog.f57784b);
            }
            a.close();
        } catch (Throwable th3) {
            while (true) {
            }
            throw th3;
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        eoa.m10828c("Herrevad", "Failure to execute LightweightReportingNetworkQualityOperation: %s", status);
    }
}
