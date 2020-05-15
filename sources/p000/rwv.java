package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;

/* renamed from: rwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwv extends rvd {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public rwv() {
        super("ClearcutSosFix", Math.max(cdng.f181305a.mo6606a().mo77958f(), 60L), TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES));
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        rwy rwy = new rwy(rvl.f43760b);
        if (!cdng.f181305a.mo6606a().mo77957e() || rvl.mo25202a() == null || !rwy.f43797a.getBoolean("OptInUsageReporting", false) || rwy.f43797a.getInt("OptInGMSCoreVersion", 0) < 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v49, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v50, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v51, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c5, code lost:
        r1 = r0;
        r6 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c4 A[ExcHandler: all (r0v110 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:96:0x029d] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e8 A[SYNTHETIC, Splitter:B:121:0x02e8] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0320 A[SYNTHETIC, Splitter:B:135:0x0320] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03a1 A[Catch:{ RuntimeException -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03a2 A[Catch:{ RuntimeException -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c8 A[Catch:{ RuntimeException -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c9 A[Catch:{ RuntimeException -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03ee A[Catch:{ RuntimeException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03ef A[Catch:{ RuntimeException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03f5 A[Catch:{ RuntimeException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03f6 A[Catch:{ RuntimeException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x043c A[Catch:{ SecurityException -> 0x047e, RuntimeException -> 0x0474, rww -> 0x0472 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x045d A[Catch:{ SecurityException -> 0x047e, RuntimeException -> 0x0474, rww -> 0x0472 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x045e A[Catch:{ SecurityException -> 0x047e, RuntimeException -> 0x0474, rww -> 0x0472 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04ec A[Catch:{ IOException -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0573 A[Catch:{ IOException -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0579 A[Catch:{ IOException -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05b5 A[Catch:{ all -> 0x064e }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05b6 A[Catch:{ all -> 0x064e }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0458 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3 A[Catch:{ rww -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4 A[Catch:{ rww -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d A[SYNTHETIC, Splitter:B:64:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0297 A[SYNTHETIC, Splitter:B:94:0x0297] */
    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Context context;
        String str;
        bxvf bxvf;
        bxvd da;
        bxvd da2;
        bxvd da3;
        Integer num;
        Integer num2;
        cagn cagn;
        bxvd da4;
        boolean z;
        rwv rwv;
        HttpURLConnection httpURLConnection;
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        String headerField;
        int responseCode;
        Iterator it;
        boolean z2;
        int i;
        anfg anfg;
        Throwable th2;
        int[] iArr;
        ExperimentTokens experimentTokens;
        bqyq a;
        anfg anfg2;
        sqp sqp;
        boci boci;
        int i2;
        Context context2 = rvl.f43760b;
        rwx rwx = new rwx(context2);
        rwx.f43796b = false;
        rud a2 = rvl.mo25202a();
        sdo.m34959a(a2);
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvf bxvf2 = (bxvf) cagn.f174467q.mo74144da();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        cagn cagn2 = (cagn) bxvf2.f164949b;
        int i3 = cagn2.f174469a | 1;
        cagn2.f174469a = i3;
        cagn2.f174470b = currentTimeMillis;
        int i4 = 2;
        cagn2.f174469a = i3 | 2;
        cagn2.f174471c = elapsedRealtime;
        bxvd da5 = cagb.f173068e.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        cagb cagb = (cagb) da5.f164949b;
        cagb.f173071b = 4;
        cagb.f173070a |= 1;
        try {
            sqp = sqq.m35991a(ModuleManager.get(rwx.f43795a));
        } catch (RuntimeException e) {
            try {
                Log.e("SosLogRequestBuilder", "Couldn't get chimeraConfigInfo; omitting.", e);
                rwx.mo25220a(e);
                sqp = null;
            } catch (rww e2) {
                e = e2;
                context = context2;
                Log.e("SosLogRequestBuilder", "Couldn't get androidClientInfo; omitting.", e);
                cagb cagb2 = (cagb) da5.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn3 = (cagn) bxvf2.f164949b;
                cagb2.getClass();
                cagn3.f174472d = cagb2;
                cagn3.f174469a |= 4;
                cagl cagl = cagl.GMS_CORE;
                if (bxvf2.f164950c) {
                }
                cagn cagn4 = (cagn) bxvf2.f164949b;
                cagn4.f174473e = cagl.f174465yP;
                cagn4.f174469a |= 8;
                if (!rwx.f43796b) {
                }
                if (bxvf2.f164950c) {
                }
                cagn cagn5 = (cagn) bxvf2.f164949b;
                str.getClass();
                cagn5.f174469a |= 32;
                cagn5.f174475g = str;
                cagi[] cagiArr = new cagi[1];
                bxvf = (bxvf) cagi.f173096t.mo74144da();
                if (bxvf.f164950c) {
                }
                cagi cagi = (cagi) bxvf.f164949b;
                int i5 = cagi.f173098a | 1;
                cagi.f173098a = i5;
                cagi.f173099b = currentTimeMillis;
                int i6 = i5 | 2;
                cagi.f173098a = i6;
                cagi.f173100c = elapsedRealtime;
                cagi.f173098a = i6 | 16;
                cagi.f173102e = 17;
                da = bpvf.f139321t.mo74144da();
                da2 = bpvk.f139371c.mo74144da();
                da3 = bpvj.f139363g.mo74144da();
                String str2 = a2.f43688a;
                if (da3.f164950c) {
                }
                bpvj bpvj = (bpvj) da3.f164949b;
                str2.getClass();
                int i7 = bpvj.f139365a | 1;
                bpvj.f139365a = i7;
                bpvj.f139366b = str2;
                String str3 = a2.f43689b;
                str3.getClass();
                int i8 = i7 | 128;
                bpvj.f139365a = i8;
                bpvj.f139370f = str3;
                String str4 = "Couldn't get Google accounts";
                cagi[] cagiArr2 = cagiArr;
                long j = a2.f43690c;
                int i9 = i8 | 4;
                bpvj.f139365a = i9;
                bpvj.f139367c = j;
                long j2 = a2.f43691d;
                int i10 = i9 | 8;
                bpvj.f139365a = i10;
                bpvj.f139368d = j2;
                long j3 = a2.f43692e;
                bpvj.f139365a = i10 | 16;
                bpvj.f139369e = j3;
                bpvj bpvj2 = (bpvj) da3.mo74062i();
                if (da2.f164950c) {
                }
                bpvk bpvk = (bpvk) da2.f164949b;
                bpvj2.getClass();
                bpvk.f139374b = bpvj2;
                bpvk.f139373a |= 1;
                bpvk bpvk2 = (bpvk) da2.mo74062i();
                if (da.f164950c) {
                }
                bpvf bpvf = (bpvf) da.f164949b;
                bpvk2.getClass();
                bpvf.f139336n = bpvk2;
                bpvf.f139323a |= 512;
                ByteString aL = ((bpvf) da.mo74062i()).mo73639aL();
                if (bxvf.f164950c) {
                }
                cagi cagi2 = (cagi) bxvf.f164949b;
                aL.getClass();
                cagi2.f173098a |= 1024;
                cagi2.f173106i = aL;
                long offset = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
                if (bxvf.f164950c) {
                }
                cagi cagi3 = (cagi) bxvf.f164949b;
                cagi3.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cagi3.f173107j = offset;
                if (!rwx.f43796b) {
                }
                num2 = qxs.m33071a(rwx.f43795a);
                if (num2 != null) {
                }
                cagiArr2[0] = (cagi) bxvf.mo74062i();
                List asList = Arrays.asList(cagiArr2);
                if (bxvf2.f164950c) {
                }
                cagn = (cagn) bxvf2.f164949b;
                if (!cagn.f174476h.mo73666a()) {
                }
                bxsy.m123078a(asList, cagn.f174476h);
                da4 = cage.f173082f.mo74144da();
                boolean a3 = rep.m33475a(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage = (cage) da4.f164949b;
                cage.f173084a |= 1;
                cage.f173085b = a3;
                try {
                    boolean b = rep.m33476b(rwx.f43795a);
                    if (!da4.f164950c) {
                    }
                    cage cage2 = (cage) da4.f164949b;
                    cage2.f173084a |= 2;
                    cage2.f173086c = b;
                } catch (RuntimeException e3) {
                    rwx.mo25220a(e3);
                    Log.e("SosLogRequestBuilder", "Couldn't get isCharging; leaving as default of false.", e3);
                }
                if (!rep.m33477c(rwx.f43795a)) {
                }
                if (!da4.f164950c) {
                }
                cage cage3 = (cage) da4.f164949b;
                cage3.f173087d = i4 - 1;
                cage3.f173084a |= 4;
                it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (!da4.f164950c) {
                }
                cage cage4 = (cage) da4.f164949b;
                cage4.f173084a |= 8;
                cage4.f173088e = z2;
                z = false;
                cage cage5 = (cage) da4.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn6 = (cagn) bxvf2.f164949b;
                cage5.getClass();
                cagn6.f174480l = cage5;
                cagn6.f174469a |= 512;
                cagn cagn7 = (cagn) bxvf2.mo74062i();
                rwz rwz = new rwz(context);
                sdo.m34959a(cagn7);
                URL url = new URL(cdkp.f181122a.mo6606a().mo77807J());
                if (!cdkp.f181122a.mo6606a().mo77805H()) {
                }
                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                String valueOf = String.valueOf(cagn7.f174475g);
                httpURLConnection.setRequestProperty("Cookie", valueOf.length() != 0 ? new String("NID=") : "NID=".concat(valueOf));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                String valueOf2 = String.valueOf(cagn7);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                sb.append("Sending logRequest: ");
                sb.append(valueOf2);
                sb.toString();
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    cagn7.mo73638a(gZIPOutputStream);
                    gZIPOutputStream.close();
                    headerField = httpURLConnection.getHeaderField("Set-Cookie");
                    if (headerField == null) {
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Got response: ");
                    sb2.append(responseCode);
                    sb2.toString();
                    if (responseCode >= 200) {
                    }
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Received HTTP status code ");
                    sb3.append(responseCode);
                    throw new IOException(sb3.toString());
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        httpURLConnection.disconnect();
                        throw th;
                    } catch (IOException e4) {
                        e = e4;
                        Log.e("ClearcutSosFix", "Failed to send SOS", e);
                        rvk d = rvl.mo25205d();
                        d.mo25199a(rwv, 5);
                        return d.mo25198a();
                    }
                }
            }
        }
        try {
            boci = soy.m35781a(rwx.f43795a);
        } catch (RuntimeException e5) {
            rwx.mo25220a(e5);
            Log.e("SosLogRequestBuilder", "Couldn't get accessibilityState; omitting.", e5);
            boci = null;
        }
        try {
            Context context3 = rwx.f43795a;
            try {
                context = context2;
                try {
                    i2 = context3.getPackageManager().getPackageInfo(rwx.f43795a.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e6) {
                    e = e6;
                    Log.e("SosLogRequestBuilder", "Couldn't get versionCode", e);
                    i2 = 0;
                    cafx a4 = spn.m35846a(context3, false, null, i2, 201515033, sqp, boci);
                    if (da5.f164950c) {
                    }
                    cagb cagb3 = (cagb) da5.f164949b;
                    a4.getClass();
                    cagb3.f173072c = a4;
                    cagb3.f173070a |= 8;
                    cagb cagb22 = (cagb) da5.mo74062i();
                    if (bxvf2.f164950c) {
                    }
                    cagn cagn32 = (cagn) bxvf2.f164949b;
                    cagb22.getClass();
                    cagn32.f174472d = cagb22;
                    cagn32.f174469a |= 4;
                    cagl cagl2 = cagl.GMS_CORE;
                    if (bxvf2.f164950c) {
                    }
                    cagn cagn42 = (cagn) bxvf2.f164949b;
                    cagn42.f174473e = cagl2.f174465yP;
                    cagn42.f174469a |= 8;
                    if (!rwx.f43796b) {
                    }
                    if (bxvf2.f164950c) {
                    }
                    cagn cagn52 = (cagn) bxvf2.f164949b;
                    str.getClass();
                    cagn52.f174469a |= 32;
                    cagn52.f174475g = str;
                    cagi[] cagiArr3 = new cagi[1];
                    bxvf = (bxvf) cagi.f173096t.mo74144da();
                    if (bxvf.f164950c) {
                    }
                    cagi cagi4 = (cagi) bxvf.f164949b;
                    int i52 = cagi4.f173098a | 1;
                    cagi4.f173098a = i52;
                    cagi4.f173099b = currentTimeMillis;
                    int i62 = i52 | 2;
                    cagi4.f173098a = i62;
                    cagi4.f173100c = elapsedRealtime;
                    cagi4.f173098a = i62 | 16;
                    cagi4.f173102e = 17;
                    da = bpvf.f139321t.mo74144da();
                    da2 = bpvk.f139371c.mo74144da();
                    da3 = bpvj.f139363g.mo74144da();
                    String str22 = a2.f43688a;
                    if (da3.f164950c) {
                    }
                    bpvj bpvj3 = (bpvj) da3.f164949b;
                    str22.getClass();
                    int i72 = bpvj3.f139365a | 1;
                    bpvj3.f139365a = i72;
                    bpvj3.f139366b = str22;
                    String str32 = a2.f43689b;
                    str32.getClass();
                    int i82 = i72 | 128;
                    bpvj3.f139365a = i82;
                    bpvj3.f139370f = str32;
                    String str42 = "Couldn't get Google accounts";
                    cagi[] cagiArr22 = cagiArr3;
                    long j4 = a2.f43690c;
                    int i92 = i82 | 4;
                    bpvj3.f139365a = i92;
                    bpvj3.f139367c = j4;
                    long j22 = a2.f43691d;
                    int i102 = i92 | 8;
                    bpvj3.f139365a = i102;
                    bpvj3.f139368d = j22;
                    long j32 = a2.f43692e;
                    bpvj3.f139365a = i102 | 16;
                    bpvj3.f139369e = j32;
                    bpvj bpvj22 = (bpvj) da3.mo74062i();
                    if (da2.f164950c) {
                    }
                    bpvk bpvk3 = (bpvk) da2.f164949b;
                    bpvj22.getClass();
                    bpvk3.f139374b = bpvj22;
                    bpvk3.f139373a |= 1;
                    bpvk bpvk22 = (bpvk) da2.mo74062i();
                    if (da.f164950c) {
                    }
                    bpvf bpvf2 = (bpvf) da.f164949b;
                    bpvk22.getClass();
                    bpvf2.f139336n = bpvk22;
                    bpvf2.f139323a |= 512;
                    ByteString aL2 = ((bpvf) da.mo74062i()).mo73639aL();
                    if (bxvf.f164950c) {
                    }
                    cagi cagi22 = (cagi) bxvf.f164949b;
                    aL2.getClass();
                    cagi22.f173098a |= 1024;
                    cagi22.f173106i = aL2;
                    long offset2 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
                    if (bxvf.f164950c) {
                    }
                    cagi cagi32 = (cagi) bxvf.f164949b;
                    cagi32.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    cagi32.f173107j = offset2;
                    if (!rwx.f43796b) {
                    }
                    num2 = qxs.m33071a(rwx.f43795a);
                    if (num2 != null) {
                    }
                    cagiArr22[0] = (cagi) bxvf.mo74062i();
                    List asList2 = Arrays.asList(cagiArr22);
                    if (bxvf2.f164950c) {
                    }
                    cagn = (cagn) bxvf2.f164949b;
                    if (!cagn.f174476h.mo73666a()) {
                    }
                    bxsy.m123078a(asList2, cagn.f174476h);
                    da4 = cage.f173082f.mo74144da();
                    boolean a32 = rep.m33475a(rwx.f43795a);
                    if (!da4.f164950c) {
                    }
                    cage cage6 = (cage) da4.f164949b;
                    cage6.f173084a |= 1;
                    cage6.f173085b = a32;
                    boolean b2 = rep.m33476b(rwx.f43795a);
                    if (!da4.f164950c) {
                    }
                    cage cage22 = (cage) da4.f164949b;
                    cage22.f173084a |= 2;
                    cage22.f173086c = b2;
                    if (!rep.m33477c(rwx.f43795a)) {
                    }
                    if (!da4.f164950c) {
                    }
                    cage cage32 = (cage) da4.f164949b;
                    cage32.f173087d = i4 - 1;
                    cage32.f173084a |= 4;
                    it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (!da4.f164950c) {
                    }
                    cage cage42 = (cage) da4.f164949b;
                    cage42.f173084a |= 8;
                    cage42.f173088e = z2;
                    z = false;
                    cage cage52 = (cage) da4.mo74062i();
                    if (bxvf2.f164950c) {
                    }
                    cagn cagn62 = (cagn) bxvf2.f164949b;
                    cage52.getClass();
                    cagn62.f174480l = cage52;
                    cagn62.f174469a |= 512;
                    cagn cagn72 = (cagn) bxvf2.mo74062i();
                    rwz rwz2 = new rwz(context);
                    sdo.m34959a(cagn72);
                    URL url2 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                    if (!cdkp.f181122a.mo6606a().mo77805H()) {
                    }
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setChunkedStreamingMode(0);
                    httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                    httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                    String valueOf3 = String.valueOf(cagn72.f174475g);
                    httpURLConnection.setRequestProperty("Cookie", valueOf3.length() != 0 ? new String("NID=") : "NID=".concat(valueOf3));
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    String valueOf22 = String.valueOf(cagn72);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf22).length() + 20);
                    sb4.append("Sending logRequest: ");
                    sb4.append(valueOf22);
                    sb4.toString();
                    gZIPOutputStream = new GZIPOutputStream(outputStream2);
                    cagn72.mo73638a(gZIPOutputStream);
                    gZIPOutputStream.close();
                    headerField = httpURLConnection.getHeaderField("Set-Cookie");
                    if (headerField == null) {
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb22 = new StringBuilder(25);
                    sb22.append("Got response: ");
                    sb22.append(responseCode);
                    sb22.toString();
                    if (responseCode >= 200) {
                    }
                    StringBuilder sb32 = new StringBuilder(37);
                    sb32.append("Received HTTP status code ");
                    sb32.append(responseCode);
                    throw new IOException(sb32.toString());
                } catch (RuntimeException e7) {
                    e = e7;
                    try {
                        rwx.mo25220a(e);
                        Log.e("SosLogRequestBuilder", "Couldn't get versionCode", e);
                        i2 = 0;
                        cafx a42 = spn.m35846a(context3, false, null, i2, 201515033, sqp, boci);
                        if (da5.f164950c) {
                        }
                        cagb cagb32 = (cagb) da5.f164949b;
                        a42.getClass();
                        cagb32.f173072c = a42;
                        cagb32.f173070a |= 8;
                        cagb cagb222 = (cagb) da5.mo74062i();
                        if (bxvf2.f164950c) {
                        }
                        cagn cagn322 = (cagn) bxvf2.f164949b;
                        cagb222.getClass();
                        cagn322.f174472d = cagb222;
                        cagn322.f174469a |= 4;
                        cagl cagl22 = cagl.GMS_CORE;
                        if (bxvf2.f164950c) {
                        }
                        cagn cagn422 = (cagn) bxvf2.f164949b;
                        cagn422.f174473e = cagl22.f174465yP;
                        cagn422.f174469a |= 8;
                        if (!rwx.f43796b) {
                        }
                        if (bxvf2.f164950c) {
                        }
                        cagn cagn522 = (cagn) bxvf2.f164949b;
                        str.getClass();
                        cagn522.f174469a |= 32;
                        cagn522.f174475g = str;
                        cagi[] cagiArr32 = new cagi[1];
                        bxvf = (bxvf) cagi.f173096t.mo74144da();
                        if (bxvf.f164950c) {
                        }
                        cagi cagi42 = (cagi) bxvf.f164949b;
                        int i522 = cagi42.f173098a | 1;
                        cagi42.f173098a = i522;
                        cagi42.f173099b = currentTimeMillis;
                        int i622 = i522 | 2;
                        cagi42.f173098a = i622;
                        cagi42.f173100c = elapsedRealtime;
                        cagi42.f173098a = i622 | 16;
                        cagi42.f173102e = 17;
                        da = bpvf.f139321t.mo74144da();
                        da2 = bpvk.f139371c.mo74144da();
                        da3 = bpvj.f139363g.mo74144da();
                        String str222 = a2.f43688a;
                        if (da3.f164950c) {
                        }
                        bpvj bpvj32 = (bpvj) da3.f164949b;
                        str222.getClass();
                        int i722 = bpvj32.f139365a | 1;
                        bpvj32.f139365a = i722;
                        bpvj32.f139366b = str222;
                        String str322 = a2.f43689b;
                        str322.getClass();
                        int i822 = i722 | 128;
                        bpvj32.f139365a = i822;
                        bpvj32.f139370f = str322;
                        String str422 = "Couldn't get Google accounts";
                        cagi[] cagiArr222 = cagiArr32;
                        long j42 = a2.f43690c;
                        int i922 = i822 | 4;
                        bpvj32.f139365a = i922;
                        bpvj32.f139367c = j42;
                        long j222 = a2.f43691d;
                        int i1022 = i922 | 8;
                        bpvj32.f139365a = i1022;
                        bpvj32.f139368d = j222;
                        long j322 = a2.f43692e;
                        bpvj32.f139365a = i1022 | 16;
                        bpvj32.f139369e = j322;
                        bpvj bpvj222 = (bpvj) da3.mo74062i();
                        if (da2.f164950c) {
                        }
                        bpvk bpvk32 = (bpvk) da2.f164949b;
                        bpvj222.getClass();
                        bpvk32.f139374b = bpvj222;
                        bpvk32.f139373a |= 1;
                        bpvk bpvk222 = (bpvk) da2.mo74062i();
                        if (da.f164950c) {
                        }
                        bpvf bpvf22 = (bpvf) da.f164949b;
                        bpvk222.getClass();
                        bpvf22.f139336n = bpvk222;
                        bpvf22.f139323a |= 512;
                        ByteString aL22 = ((bpvf) da.mo74062i()).mo73639aL();
                        if (bxvf.f164950c) {
                        }
                        cagi cagi222 = (cagi) bxvf.f164949b;
                        aL22.getClass();
                        cagi222.f173098a |= 1024;
                        cagi222.f173106i = aL22;
                        long offset22 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
                        if (bxvf.f164950c) {
                        }
                        cagi cagi322 = (cagi) bxvf.f164949b;
                        cagi322.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        cagi322.f173107j = offset22;
                        if (!rwx.f43796b) {
                        }
                        num2 = qxs.m33071a(rwx.f43795a);
                        if (num2 != null) {
                        }
                        cagiArr222[0] = (cagi) bxvf.mo74062i();
                        List asList22 = Arrays.asList(cagiArr222);
                        if (bxvf2.f164950c) {
                        }
                        cagn = (cagn) bxvf2.f164949b;
                        if (!cagn.f174476h.mo73666a()) {
                        }
                        bxsy.m123078a(asList22, cagn.f174476h);
                        da4 = cage.f173082f.mo74144da();
                        boolean a322 = rep.m33475a(rwx.f43795a);
                        if (!da4.f164950c) {
                        }
                        cage cage62 = (cage) da4.f164949b;
                        cage62.f173084a |= 1;
                        cage62.f173085b = a322;
                        boolean b22 = rep.m33476b(rwx.f43795a);
                        if (!da4.f164950c) {
                        }
                        cage cage222 = (cage) da4.f164949b;
                        cage222.f173084a |= 2;
                        cage222.f173086c = b22;
                        if (!rep.m33477c(rwx.f43795a)) {
                        }
                        if (!da4.f164950c) {
                        }
                        cage cage322 = (cage) da4.f164949b;
                        cage322.f173087d = i4 - 1;
                        cage322.f173084a |= 4;
                        it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (!da4.f164950c) {
                        }
                        cage cage422 = (cage) da4.f164949b;
                        cage422.f173084a |= 8;
                        cage422.f173088e = z2;
                        z = false;
                        cage cage522 = (cage) da4.mo74062i();
                        if (bxvf2.f164950c) {
                        }
                        cagn cagn622 = (cagn) bxvf2.f164949b;
                        cage522.getClass();
                        cagn622.f174480l = cage522;
                        cagn622.f174469a |= 512;
                        cagn cagn722 = (cagn) bxvf2.mo74062i();
                        rwz rwz22 = new rwz(context);
                        sdo.m34959a(cagn722);
                        URL url22 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                        if (!cdkp.f181122a.mo6606a().mo77805H()) {
                        }
                        httpURLConnection = (HttpURLConnection) url22.openConnection();
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setChunkedStreamingMode(0);
                        httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                        httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                        String valueOf32 = String.valueOf(cagn722.f174475g);
                        httpURLConnection.setRequestProperty("Cookie", valueOf32.length() != 0 ? new String("NID=") : "NID=".concat(valueOf32));
                        OutputStream outputStream22 = httpURLConnection.getOutputStream();
                        String valueOf222 = String.valueOf(cagn722);
                        StringBuilder sb42 = new StringBuilder(String.valueOf(valueOf222).length() + 20);
                        sb42.append("Sending logRequest: ");
                        sb42.append(valueOf222);
                        sb42.toString();
                        gZIPOutputStream = new GZIPOutputStream(outputStream22);
                        cagn722.mo73638a(gZIPOutputStream);
                        gZIPOutputStream.close();
                        headerField = httpURLConnection.getHeaderField("Set-Cookie");
                        if (headerField == null) {
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        StringBuilder sb222 = new StringBuilder(25);
                        sb222.append("Got response: ");
                        sb222.append(responseCode);
                        sb222.toString();
                        if (responseCode >= 200) {
                        }
                        StringBuilder sb322 = new StringBuilder(37);
                        sb322.append("Received HTTP status code ");
                        sb322.append(responseCode);
                        throw new IOException(sb322.toString());
                    } catch (RuntimeException e8) {
                        e = e8;
                        rwx.mo25220a(e);
                        throw new rww("Couldn't create androidClientInfo", e);
                    }
                }
            } catch (PackageManager.NameNotFoundException e9) {
                e = e9;
                context = context2;
                Log.e("SosLogRequestBuilder", "Couldn't get versionCode", e);
                i2 = 0;
                cafx a422 = spn.m35846a(context3, false, null, i2, 201515033, sqp, boci);
                if (da5.f164950c) {
                }
                cagb cagb322 = (cagb) da5.f164949b;
                a422.getClass();
                cagb322.f173072c = a422;
                cagb322.f173070a |= 8;
                cagb cagb2222 = (cagb) da5.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn3222 = (cagn) bxvf2.f164949b;
                cagb2222.getClass();
                cagn3222.f174472d = cagb2222;
                cagn3222.f174469a |= 4;
                cagl cagl222 = cagl.GMS_CORE;
                if (bxvf2.f164950c) {
                }
                cagn cagn4222 = (cagn) bxvf2.f164949b;
                cagn4222.f174473e = cagl222.f174465yP;
                cagn4222.f174469a |= 8;
                if (!rwx.f43796b) {
                }
                if (bxvf2.f164950c) {
                }
                cagn cagn5222 = (cagn) bxvf2.f164949b;
                str.getClass();
                cagn5222.f174469a |= 32;
                cagn5222.f174475g = str;
                cagi[] cagiArr322 = new cagi[1];
                bxvf = (bxvf) cagi.f173096t.mo74144da();
                if (bxvf.f164950c) {
                }
                cagi cagi422 = (cagi) bxvf.f164949b;
                int i5222 = cagi422.f173098a | 1;
                cagi422.f173098a = i5222;
                cagi422.f173099b = currentTimeMillis;
                int i6222 = i5222 | 2;
                cagi422.f173098a = i6222;
                cagi422.f173100c = elapsedRealtime;
                cagi422.f173098a = i6222 | 16;
                cagi422.f173102e = 17;
                da = bpvf.f139321t.mo74144da();
                da2 = bpvk.f139371c.mo74144da();
                da3 = bpvj.f139363g.mo74144da();
                String str2222 = a2.f43688a;
                if (da3.f164950c) {
                }
                bpvj bpvj322 = (bpvj) da3.f164949b;
                str2222.getClass();
                int i7222 = bpvj322.f139365a | 1;
                bpvj322.f139365a = i7222;
                bpvj322.f139366b = str2222;
                String str3222 = a2.f43689b;
                str3222.getClass();
                int i8222 = i7222 | 128;
                bpvj322.f139365a = i8222;
                bpvj322.f139370f = str3222;
                String str4222 = "Couldn't get Google accounts";
                cagi[] cagiArr2222 = cagiArr322;
                long j422 = a2.f43690c;
                int i9222 = i8222 | 4;
                bpvj322.f139365a = i9222;
                bpvj322.f139367c = j422;
                long j2222 = a2.f43691d;
                int i10222 = i9222 | 8;
                bpvj322.f139365a = i10222;
                bpvj322.f139368d = j2222;
                long j3222 = a2.f43692e;
                bpvj322.f139365a = i10222 | 16;
                bpvj322.f139369e = j3222;
                bpvj bpvj2222 = (bpvj) da3.mo74062i();
                if (da2.f164950c) {
                }
                bpvk bpvk322 = (bpvk) da2.f164949b;
                bpvj2222.getClass();
                bpvk322.f139374b = bpvj2222;
                bpvk322.f139373a |= 1;
                bpvk bpvk2222 = (bpvk) da2.mo74062i();
                if (da.f164950c) {
                }
                bpvf bpvf222 = (bpvf) da.f164949b;
                bpvk2222.getClass();
                bpvf222.f139336n = bpvk2222;
                bpvf222.f139323a |= 512;
                ByteString aL222 = ((bpvf) da.mo74062i()).mo73639aL();
                if (bxvf.f164950c) {
                }
                cagi cagi2222 = (cagi) bxvf.f164949b;
                aL222.getClass();
                cagi2222.f173098a |= 1024;
                cagi2222.f173106i = aL222;
                long offset222 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
                if (bxvf.f164950c) {
                }
                cagi cagi3222 = (cagi) bxvf.f164949b;
                cagi3222.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cagi3222.f173107j = offset222;
                if (!rwx.f43796b) {
                }
                num2 = qxs.m33071a(rwx.f43795a);
                if (num2 != null) {
                }
                cagiArr2222[0] = (cagi) bxvf.mo74062i();
                List asList222 = Arrays.asList(cagiArr2222);
                if (bxvf2.f164950c) {
                }
                cagn = (cagn) bxvf2.f164949b;
                if (!cagn.f174476h.mo73666a()) {
                }
                bxsy.m123078a(asList222, cagn.f174476h);
                da4 = cage.f173082f.mo74144da();
                boolean a3222 = rep.m33475a(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage622 = (cage) da4.f164949b;
                cage622.f173084a |= 1;
                cage622.f173085b = a3222;
                boolean b222 = rep.m33476b(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage2222 = (cage) da4.f164949b;
                cage2222.f173084a |= 2;
                cage2222.f173086c = b222;
                if (!rep.m33477c(rwx.f43795a)) {
                }
                if (!da4.f164950c) {
                }
                cage cage3222 = (cage) da4.f164949b;
                cage3222.f173087d = i4 - 1;
                cage3222.f173084a |= 4;
                it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (!da4.f164950c) {
                }
                cage cage4222 = (cage) da4.f164949b;
                cage4222.f173084a |= 8;
                cage4222.f173088e = z2;
                z = false;
                cage cage5222 = (cage) da4.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn6222 = (cagn) bxvf2.f164949b;
                cage5222.getClass();
                cagn6222.f174480l = cage5222;
                cagn6222.f174469a |= 512;
                cagn cagn7222 = (cagn) bxvf2.mo74062i();
                rwz rwz222 = new rwz(context);
                sdo.m34959a(cagn7222);
                URL url222 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                if (!cdkp.f181122a.mo6606a().mo77805H()) {
                }
                httpURLConnection = (HttpURLConnection) url222.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                String valueOf322 = String.valueOf(cagn7222.f174475g);
                httpURLConnection.setRequestProperty("Cookie", valueOf322.length() != 0 ? new String("NID=") : "NID=".concat(valueOf322));
                OutputStream outputStream222 = httpURLConnection.getOutputStream();
                String valueOf2222 = String.valueOf(cagn7222);
                StringBuilder sb422 = new StringBuilder(String.valueOf(valueOf2222).length() + 20);
                sb422.append("Sending logRequest: ");
                sb422.append(valueOf2222);
                sb422.toString();
                gZIPOutputStream = new GZIPOutputStream(outputStream222);
                cagn7222.mo73638a(gZIPOutputStream);
                gZIPOutputStream.close();
                headerField = httpURLConnection.getHeaderField("Set-Cookie");
                if (headerField == null) {
                }
                responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb2222 = new StringBuilder(25);
                sb2222.append("Got response: ");
                sb2222.append(responseCode);
                sb2222.toString();
                if (responseCode >= 200) {
                }
                StringBuilder sb3222 = new StringBuilder(37);
                sb3222.append("Received HTTP status code ");
                sb3222.append(responseCode);
                throw new IOException(sb3222.toString());
            } catch (RuntimeException e10) {
                e = e10;
                context = context2;
                rwx.mo25220a(e);
                Log.e("SosLogRequestBuilder", "Couldn't get versionCode", e);
                i2 = 0;
                cafx a4222 = spn.m35846a(context3, false, null, i2, 201515033, sqp, boci);
                if (da5.f164950c) {
                }
                cagb cagb3222 = (cagb) da5.f164949b;
                a4222.getClass();
                cagb3222.f173072c = a4222;
                cagb3222.f173070a |= 8;
                cagb cagb22222 = (cagb) da5.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn32222 = (cagn) bxvf2.f164949b;
                cagb22222.getClass();
                cagn32222.f174472d = cagb22222;
                cagn32222.f174469a |= 4;
                cagl cagl2222 = cagl.GMS_CORE;
                if (bxvf2.f164950c) {
                }
                cagn cagn42222 = (cagn) bxvf2.f164949b;
                cagn42222.f174473e = cagl2222.f174465yP;
                cagn42222.f174469a |= 8;
                if (!rwx.f43796b) {
                }
                if (bxvf2.f164950c) {
                }
                cagn cagn52222 = (cagn) bxvf2.f164949b;
                str.getClass();
                cagn52222.f174469a |= 32;
                cagn52222.f174475g = str;
                cagi[] cagiArr3222 = new cagi[1];
                bxvf = (bxvf) cagi.f173096t.mo74144da();
                if (bxvf.f164950c) {
                }
                cagi cagi4222 = (cagi) bxvf.f164949b;
                int i52222 = cagi4222.f173098a | 1;
                cagi4222.f173098a = i52222;
                cagi4222.f173099b = currentTimeMillis;
                int i62222 = i52222 | 2;
                cagi4222.f173098a = i62222;
                cagi4222.f173100c = elapsedRealtime;
                cagi4222.f173098a = i62222 | 16;
                cagi4222.f173102e = 17;
                da = bpvf.f139321t.mo74144da();
                da2 = bpvk.f139371c.mo74144da();
                da3 = bpvj.f139363g.mo74144da();
                String str22222 = a2.f43688a;
                if (da3.f164950c) {
                }
                bpvj bpvj3222 = (bpvj) da3.f164949b;
                str22222.getClass();
                int i72222 = bpvj3222.f139365a | 1;
                bpvj3222.f139365a = i72222;
                bpvj3222.f139366b = str22222;
                String str32222 = a2.f43689b;
                str32222.getClass();
                int i82222 = i72222 | 128;
                bpvj3222.f139365a = i82222;
                bpvj3222.f139370f = str32222;
                String str42222 = "Couldn't get Google accounts";
                cagi[] cagiArr22222 = cagiArr3222;
                long j4222 = a2.f43690c;
                int i92222 = i82222 | 4;
                bpvj3222.f139365a = i92222;
                bpvj3222.f139367c = j4222;
                long j22222 = a2.f43691d;
                int i102222 = i92222 | 8;
                bpvj3222.f139365a = i102222;
                bpvj3222.f139368d = j22222;
                long j32222 = a2.f43692e;
                bpvj3222.f139365a = i102222 | 16;
                bpvj3222.f139369e = j32222;
                bpvj bpvj22222 = (bpvj) da3.mo74062i();
                if (da2.f164950c) {
                }
                bpvk bpvk3222 = (bpvk) da2.f164949b;
                bpvj22222.getClass();
                bpvk3222.f139374b = bpvj22222;
                bpvk3222.f139373a |= 1;
                bpvk bpvk22222 = (bpvk) da2.mo74062i();
                if (da.f164950c) {
                }
                bpvf bpvf2222 = (bpvf) da.f164949b;
                bpvk22222.getClass();
                bpvf2222.f139336n = bpvk22222;
                bpvf2222.f139323a |= 512;
                ByteString aL2222 = ((bpvf) da.mo74062i()).mo73639aL();
                if (bxvf.f164950c) {
                }
                cagi cagi22222 = (cagi) bxvf.f164949b;
                aL2222.getClass();
                cagi22222.f173098a |= 1024;
                cagi22222.f173106i = aL2222;
                long offset2222 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
                if (bxvf.f164950c) {
                }
                cagi cagi32222 = (cagi) bxvf.f164949b;
                cagi32222.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cagi32222.f173107j = offset2222;
                if (!rwx.f43796b) {
                }
                num2 = qxs.m33071a(rwx.f43795a);
                if (num2 != null) {
                }
                cagiArr22222[0] = (cagi) bxvf.mo74062i();
                List asList2222 = Arrays.asList(cagiArr22222);
                if (bxvf2.f164950c) {
                }
                cagn = (cagn) bxvf2.f164949b;
                if (!cagn.f174476h.mo73666a()) {
                }
                bxsy.m123078a(asList2222, cagn.f174476h);
                da4 = cage.f173082f.mo74144da();
                boolean a32222 = rep.m33475a(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage6222 = (cage) da4.f164949b;
                cage6222.f173084a |= 1;
                cage6222.f173085b = a32222;
                boolean b2222 = rep.m33476b(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage22222 = (cage) da4.f164949b;
                cage22222.f173084a |= 2;
                cage22222.f173086c = b2222;
                if (!rep.m33477c(rwx.f43795a)) {
                }
                if (!da4.f164950c) {
                }
                cage cage32222 = (cage) da4.f164949b;
                cage32222.f173087d = i4 - 1;
                cage32222.f173084a |= 4;
                it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (!da4.f164950c) {
                }
                cage cage42222 = (cage) da4.f164949b;
                cage42222.f173084a |= 8;
                cage42222.f173088e = z2;
                z = false;
                cage cage52222 = (cage) da4.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn62222 = (cagn) bxvf2.f164949b;
                cage52222.getClass();
                cagn62222.f174480l = cage52222;
                cagn62222.f174469a |= 512;
                cagn cagn72222 = (cagn) bxvf2.mo74062i();
                rwz rwz2222 = new rwz(context);
                sdo.m34959a(cagn72222);
                URL url2222 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                if (!cdkp.f181122a.mo6606a().mo77805H()) {
                }
                httpURLConnection = (HttpURLConnection) url2222.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                String valueOf3222 = String.valueOf(cagn72222.f174475g);
                httpURLConnection.setRequestProperty("Cookie", valueOf3222.length() != 0 ? new String("NID=") : "NID=".concat(valueOf3222));
                OutputStream outputStream2222 = httpURLConnection.getOutputStream();
                String valueOf22222 = String.valueOf(cagn72222);
                StringBuilder sb4222 = new StringBuilder(String.valueOf(valueOf22222).length() + 20);
                sb4222.append("Sending logRequest: ");
                sb4222.append(valueOf22222);
                sb4222.toString();
                gZIPOutputStream = new GZIPOutputStream(outputStream2222);
                cagn72222.mo73638a(gZIPOutputStream);
                gZIPOutputStream.close();
                headerField = httpURLConnection.getHeaderField("Set-Cookie");
                if (headerField == null) {
                }
                responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb22222 = new StringBuilder(25);
                sb22222.append("Got response: ");
                sb22222.append(responseCode);
                sb22222.toString();
                if (responseCode >= 200) {
                }
                StringBuilder sb32222 = new StringBuilder(37);
                sb32222.append("Received HTTP status code ");
                sb32222.append(responseCode);
                throw new IOException(sb32222.toString());
            }
            cafx a42222 = spn.m35846a(context3, false, null, i2, 201515033, sqp, boci);
            try {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                cagb cagb32222 = (cagb) da5.f164949b;
                a42222.getClass();
                cagb32222.f173072c = a42222;
                cagb32222.f173070a |= 8;
            } catch (rww e11) {
                e = e11;
                Log.e("SosLogRequestBuilder", "Couldn't get androidClientInfo; omitting.", e);
                cagb cagb222222 = (cagb) da5.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn322222 = (cagn) bxvf2.f164949b;
                cagb222222.getClass();
                cagn322222.f174472d = cagb222222;
                cagn322222.f174469a |= 4;
                cagl cagl22222 = cagl.GMS_CORE;
                if (bxvf2.f164950c) {
                }
                cagn cagn422222 = (cagn) bxvf2.f164949b;
                cagn422222.f174473e = cagl22222.f174465yP;
                cagn422222.f174469a |= 8;
                if (!rwx.f43796b) {
                }
                if (bxvf2.f164950c) {
                }
                cagn cagn522222 = (cagn) bxvf2.f164949b;
                str.getClass();
                cagn522222.f174469a |= 32;
                cagn522222.f174475g = str;
                cagi[] cagiArr32222 = new cagi[1];
                bxvf = (bxvf) cagi.f173096t.mo74144da();
                if (bxvf.f164950c) {
                }
                cagi cagi42222 = (cagi) bxvf.f164949b;
                int i522222 = cagi42222.f173098a | 1;
                cagi42222.f173098a = i522222;
                cagi42222.f173099b = currentTimeMillis;
                int i622222 = i522222 | 2;
                cagi42222.f173098a = i622222;
                cagi42222.f173100c = elapsedRealtime;
                cagi42222.f173098a = i622222 | 16;
                cagi42222.f173102e = 17;
                da = bpvf.f139321t.mo74144da();
                da2 = bpvk.f139371c.mo74144da();
                da3 = bpvj.f139363g.mo74144da();
                String str222222 = a2.f43688a;
                if (da3.f164950c) {
                }
                bpvj bpvj32222 = (bpvj) da3.f164949b;
                str222222.getClass();
                int i722222 = bpvj32222.f139365a | 1;
                bpvj32222.f139365a = i722222;
                bpvj32222.f139366b = str222222;
                String str322222 = a2.f43689b;
                str322222.getClass();
                int i822222 = i722222 | 128;
                bpvj32222.f139365a = i822222;
                bpvj32222.f139370f = str322222;
                String str422222 = "Couldn't get Google accounts";
                cagi[] cagiArr222222 = cagiArr32222;
                long j42222 = a2.f43690c;
                int i922222 = i822222 | 4;
                bpvj32222.f139365a = i922222;
                bpvj32222.f139367c = j42222;
                long j222222 = a2.f43691d;
                int i1022222 = i922222 | 8;
                bpvj32222.f139365a = i1022222;
                bpvj32222.f139368d = j222222;
                long j322222 = a2.f43692e;
                bpvj32222.f139365a = i1022222 | 16;
                bpvj32222.f139369e = j322222;
                bpvj bpvj222222 = (bpvj) da3.mo74062i();
                if (da2.f164950c) {
                }
                bpvk bpvk32222 = (bpvk) da2.f164949b;
                bpvj222222.getClass();
                bpvk32222.f139374b = bpvj222222;
                bpvk32222.f139373a |= 1;
                bpvk bpvk222222 = (bpvk) da2.mo74062i();
                if (da.f164950c) {
                }
                bpvf bpvf22222 = (bpvf) da.f164949b;
                bpvk222222.getClass();
                bpvf22222.f139336n = bpvk222222;
                bpvf22222.f139323a |= 512;
                ByteString aL22222 = ((bpvf) da.mo74062i()).mo73639aL();
                if (bxvf.f164950c) {
                }
                cagi cagi222222 = (cagi) bxvf.f164949b;
                aL22222.getClass();
                cagi222222.f173098a |= 1024;
                cagi222222.f173106i = aL22222;
                long offset22222 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
                if (bxvf.f164950c) {
                }
                cagi cagi322222 = (cagi) bxvf.f164949b;
                cagi322222.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cagi322222.f173107j = offset22222;
                if (!rwx.f43796b) {
                }
                num2 = qxs.m33071a(rwx.f43795a);
                if (num2 != null) {
                }
                cagiArr222222[0] = (cagi) bxvf.mo74062i();
                List asList22222 = Arrays.asList(cagiArr222222);
                if (bxvf2.f164950c) {
                }
                cagn = (cagn) bxvf2.f164949b;
                if (!cagn.f174476h.mo73666a()) {
                }
                bxsy.m123078a(asList22222, cagn.f174476h);
                da4 = cage.f173082f.mo74144da();
                boolean a322222 = rep.m33475a(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage62222 = (cage) da4.f164949b;
                cage62222.f173084a |= 1;
                cage62222.f173085b = a322222;
                boolean b22222 = rep.m33476b(rwx.f43795a);
                if (!da4.f164950c) {
                }
                cage cage222222 = (cage) da4.f164949b;
                cage222222.f173084a |= 2;
                cage222222.f173086c = b22222;
                if (!rep.m33477c(rwx.f43795a)) {
                }
                if (!da4.f164950c) {
                }
                cage cage322222 = (cage) da4.f164949b;
                cage322222.f173087d = i4 - 1;
                cage322222.f173084a |= 4;
                it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (!da4.f164950c) {
                }
                cage cage422222 = (cage) da4.f164949b;
                cage422222.f173084a |= 8;
                cage422222.f173088e = z2;
                z = false;
                cage cage522222 = (cage) da4.mo74062i();
                if (bxvf2.f164950c) {
                }
                cagn cagn622222 = (cagn) bxvf2.f164949b;
                cage522222.getClass();
                cagn622222.f174480l = cage522222;
                cagn622222.f174469a |= 512;
                cagn cagn722222 = (cagn) bxvf2.mo74062i();
                rwz rwz22222 = new rwz(context);
                sdo.m34959a(cagn722222);
                URL url22222 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                if (!cdkp.f181122a.mo6606a().mo77805H()) {
                }
                httpURLConnection = (HttpURLConnection) url22222.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                String valueOf32222 = String.valueOf(cagn722222.f174475g);
                httpURLConnection.setRequestProperty("Cookie", valueOf32222.length() != 0 ? new String("NID=") : "NID=".concat(valueOf32222));
                OutputStream outputStream22222 = httpURLConnection.getOutputStream();
                String valueOf222222 = String.valueOf(cagn722222);
                StringBuilder sb42222 = new StringBuilder(String.valueOf(valueOf222222).length() + 20);
                sb42222.append("Sending logRequest: ");
                sb42222.append(valueOf222222);
                sb42222.toString();
                gZIPOutputStream = new GZIPOutputStream(outputStream22222);
                cagn722222.mo73638a(gZIPOutputStream);
                gZIPOutputStream.close();
                headerField = httpURLConnection.getHeaderField("Set-Cookie");
                if (headerField == null) {
                }
                responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb222222 = new StringBuilder(25);
                sb222222.append("Got response: ");
                sb222222.append(responseCode);
                sb222222.toString();
                if (responseCode >= 200) {
                }
                StringBuilder sb322222 = new StringBuilder(37);
                sb322222.append("Received HTTP status code ");
                sb322222.append(responseCode);
                throw new IOException(sb322222.toString());
            }
            cagb cagb2222222 = (cagb) da5.mo74062i();
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            cagn cagn3222222 = (cagn) bxvf2.f164949b;
            cagb2222222.getClass();
            cagn3222222.f174472d = cagb2222222;
            cagn3222222.f174469a |= 4;
            cagl cagl222222 = cagl.GMS_CORE;
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            cagn cagn4222222 = (cagn) bxvf2.f164949b;
            cagn4222222.f174473e = cagl222222.f174465yP;
            cagn4222222.f174469a |= 8;
            if (!rwx.f43796b) {
                try {
                    str = aooo.m66219b(rwx.f43795a).f83468a;
                } catch (RuntimeException e12) {
                    rwx.mo25220a(e12);
                    Log.e("SosLogRequestBuilder", "Couldn't get Zwieback cookie.", e12);
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            } else {
                str = "ANONYMOUS";
            }
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            cagn cagn5222222 = (cagn) bxvf2.f164949b;
            str.getClass();
            cagn5222222.f174469a |= 32;
            cagn5222222.f174475g = str;
            cagi[] cagiArr322222 = new cagi[1];
            bxvf = (bxvf) cagi.f173096t.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi422222 = (cagi) bxvf.f164949b;
            int i5222222 = cagi422222.f173098a | 1;
            cagi422222.f173098a = i5222222;
            cagi422222.f173099b = currentTimeMillis;
            int i6222222 = i5222222 | 2;
            cagi422222.f173098a = i6222222;
            cagi422222.f173100c = elapsedRealtime;
            cagi422222.f173098a = i6222222 | 16;
            cagi422222.f173102e = 17;
            da = bpvf.f139321t.mo74144da();
            da2 = bpvk.f139371c.mo74144da();
            da3 = bpvj.f139363g.mo74144da();
            String str2222222 = a2.f43688a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpvj bpvj322222 = (bpvj) da3.f164949b;
            str2222222.getClass();
            int i7222222 = bpvj322222.f139365a | 1;
            bpvj322222.f139365a = i7222222;
            bpvj322222.f139366b = str2222222;
            String str3222222 = a2.f43689b;
            str3222222.getClass();
            int i8222222 = i7222222 | 128;
            bpvj322222.f139365a = i8222222;
            bpvj322222.f139370f = str3222222;
            String str4222222 = "Couldn't get Google accounts";
            cagi[] cagiArr2222222 = cagiArr322222;
            long j422222 = a2.f43690c;
            int i9222222 = i8222222 | 4;
            bpvj322222.f139365a = i9222222;
            bpvj322222.f139367c = j422222;
            long j2222222 = a2.f43691d;
            int i10222222 = i9222222 | 8;
            bpvj322222.f139365a = i10222222;
            bpvj322222.f139368d = j2222222;
            long j3222222 = a2.f43692e;
            bpvj322222.f139365a = i10222222 | 16;
            bpvj322222.f139369e = j3222222;
            bpvj bpvj2222222 = (bpvj) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvk bpvk322222 = (bpvk) da2.f164949b;
            bpvj2222222.getClass();
            bpvk322222.f139374b = bpvj2222222;
            bpvk322222.f139373a |= 1;
            bpvk bpvk2222222 = (bpvk) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvf bpvf222222 = (bpvf) da.f164949b;
            bpvk2222222.getClass();
            bpvf222222.f139336n = bpvk2222222;
            bpvf222222.f139323a |= 512;
            ByteString aL222222 = ((bpvf) da.mo74062i()).mo73639aL();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi2222222 = (cagi) bxvf.f164949b;
            aL222222.getClass();
            cagi2222222.f173098a |= 1024;
            cagi2222222.f173106i = aL222222;
            long offset222222 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi3222222 = (cagi) bxvf.f164949b;
            cagi3222222.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            cagi3222222.f173107j = offset222222;
            if (!rwx.f43796b) {
                try {
                    anfg2 = anfg.m64152a(rwx.f43795a);
                    try {
                        num = null;
                        num = null;
                        num = null;
                        num = null;
                        ExperimentTokens b3 = new anhj(".metrics", null, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").mo41836b(anfg.m64152a(rwx.f43795a));
                        if (anfg2 == null) {
                            iArr = null;
                            experimentTokens = b3;
                        } else {
                            try {
                                anfg2.close();
                                iArr = null;
                                experimentTokens = b3;
                            } catch (RuntimeException e13) {
                                rwx.mo25220a(e13);
                                Log.e("SosLogRequestBuilder", "Couldn't close phenotype database", e13);
                                iArr = null;
                                experimentTokens = b3;
                            }
                        }
                    } catch (RuntimeException e14) {
                        e = e14;
                        num = null;
                        try {
                            rwx.mo25220a(e);
                            Log.e("SosLogRequestBuilder", "Couldn't get experiment Ids. Using sentinel experiment ID 26670039", e);
                            iArr = new int[]{26670039};
                            if (anfg2 == null) {
                            }
                            a = req.m33478a(experimentTokens, iArr, true);
                            if (a != null) {
                            }
                            num2 = qxs.m33071a(rwx.f43795a);
                            if (num2 != null) {
                            }
                            cagiArr2222222[0] = (cagi) bxvf.mo74062i();
                            List asList222222 = Arrays.asList(cagiArr2222222);
                            if (bxvf2.f164950c) {
                            }
                            cagn = (cagn) bxvf2.f164949b;
                            if (!cagn.f174476h.mo73666a()) {
                            }
                            bxsy.m123078a(asList222222, cagn.f174476h);
                            da4 = cage.f173082f.mo74144da();
                            boolean a3222222 = rep.m33475a(rwx.f43795a);
                            if (!da4.f164950c) {
                            }
                            cage cage622222 = (cage) da4.f164949b;
                            cage622222.f173084a |= 1;
                            cage622222.f173085b = a3222222;
                            boolean b222222 = rep.m33476b(rwx.f43795a);
                            if (!da4.f164950c) {
                            }
                            cage cage2222222 = (cage) da4.f164949b;
                            cage2222222.f173084a |= 2;
                            cage2222222.f173086c = b222222;
                            if (!rep.m33477c(rwx.f43795a)) {
                            }
                            if (!da4.f164950c) {
                            }
                            cage cage3222222 = (cage) da4.f164949b;
                            cage3222222.f173087d = i4 - 1;
                            cage3222222.f173084a |= 4;
                            it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            if (!da4.f164950c) {
                            }
                            cage cage4222222 = (cage) da4.f164949b;
                            cage4222222.f173084a |= 8;
                            cage4222222.f173088e = z2;
                            z = false;
                            cage cage5222222 = (cage) da4.mo74062i();
                            if (bxvf2.f164950c) {
                            }
                            cagn cagn6222222 = (cagn) bxvf2.f164949b;
                            cage5222222.getClass();
                            cagn6222222.f174480l = cage5222222;
                            cagn6222222.f174469a |= 512;
                            cagn cagn7222222 = (cagn) bxvf2.mo74062i();
                            rwz rwz222222 = new rwz(context);
                            sdo.m34959a(cagn7222222);
                            URL url222222 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                            if (!cdkp.f181122a.mo6606a().mo77805H()) {
                            }
                            httpURLConnection = (HttpURLConnection) url222222.openConnection();
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setInstanceFollowRedirects(false);
                            httpURLConnection.setChunkedStreamingMode(0);
                            httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                            httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                            String valueOf322222 = String.valueOf(cagn7222222.f174475g);
                            httpURLConnection.setRequestProperty("Cookie", valueOf322222.length() != 0 ? new String("NID=") : "NID=".concat(valueOf322222));
                            OutputStream outputStream222222 = httpURLConnection.getOutputStream();
                            String valueOf2222222 = String.valueOf(cagn7222222);
                            StringBuilder sb422222 = new StringBuilder(String.valueOf(valueOf2222222).length() + 20);
                            sb422222.append("Sending logRequest: ");
                            sb422222.append(valueOf2222222);
                            sb422222.toString();
                            gZIPOutputStream = new GZIPOutputStream(outputStream222222);
                            cagn7222222.mo73638a(gZIPOutputStream);
                            gZIPOutputStream.close();
                            headerField = httpURLConnection.getHeaderField("Set-Cookie");
                            if (headerField == null) {
                            }
                            responseCode = httpURLConnection.getResponseCode();
                            StringBuilder sb2222222 = new StringBuilder(25);
                            sb2222222.append("Got response: ");
                            sb2222222.append(responseCode);
                            sb2222222.toString();
                            if (responseCode >= 200) {
                            }
                            StringBuilder sb3222222 = new StringBuilder(37);
                            sb3222222.append("Received HTTP status code ");
                            sb3222222.append(responseCode);
                            throw new IOException(sb3222222.toString());
                        } catch (Throwable th4) {
                            th2 = th4;
                            anfg = anfg2;
                            if (anfg != null) {
                            }
                            throw th2;
                        }
                    } catch (Throwable th5) {
                    }
                } catch (RuntimeException e15) {
                    e = e15;
                    num = null;
                    anfg2 = null;
                    rwx.mo25220a(e);
                    Log.e("SosLogRequestBuilder", "Couldn't get experiment Ids. Using sentinel experiment ID 26670039", e);
                    iArr = new int[]{26670039};
                    if (anfg2 == null) {
                        experimentTokens = num;
                    } else {
                        try {
                            anfg2.close();
                            experimentTokens = num;
                        } catch (RuntimeException e16) {
                            rwx.mo25220a(e16);
                            Log.e("SosLogRequestBuilder", "Couldn't close phenotype database", e16);
                            experimentTokens = num;
                        }
                    }
                    a = req.m33478a(experimentTokens, iArr, true);
                    if (a != null) {
                    }
                    num2 = qxs.m33071a(rwx.f43795a);
                    if (num2 != null) {
                    }
                    cagiArr2222222[0] = (cagi) bxvf.mo74062i();
                    List asList2222222 = Arrays.asList(cagiArr2222222);
                    if (bxvf2.f164950c) {
                    }
                    cagn = (cagn) bxvf2.f164949b;
                    if (!cagn.f174476h.mo73666a()) {
                    }
                    bxsy.m123078a(asList2222222, cagn.f174476h);
                    da4 = cage.f173082f.mo74144da();
                    boolean a32222222 = rep.m33475a(rwx.f43795a);
                    if (!da4.f164950c) {
                    }
                    cage cage6222222 = (cage) da4.f164949b;
                    cage6222222.f173084a |= 1;
                    cage6222222.f173085b = a32222222;
                    boolean b2222222 = rep.m33476b(rwx.f43795a);
                    if (!da4.f164950c) {
                    }
                    cage cage22222222 = (cage) da4.f164949b;
                    cage22222222.f173084a |= 2;
                    cage22222222.f173086c = b2222222;
                    if (!rep.m33477c(rwx.f43795a)) {
                    }
                    if (!da4.f164950c) {
                    }
                    cage cage32222222 = (cage) da4.f164949b;
                    cage32222222.f173087d = i4 - 1;
                    cage32222222.f173084a |= 4;
                    it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (!da4.f164950c) {
                    }
                    cage cage42222222 = (cage) da4.f164949b;
                    cage42222222.f173084a |= 8;
                    cage42222222.f173088e = z2;
                    z = false;
                    cage cage52222222 = (cage) da4.mo74062i();
                    if (bxvf2.f164950c) {
                    }
                    cagn cagn62222222 = (cagn) bxvf2.f164949b;
                    cage52222222.getClass();
                    cagn62222222.f174480l = cage52222222;
                    cagn62222222.f174469a |= 512;
                    cagn cagn72222222 = (cagn) bxvf2.mo74062i();
                    rwz rwz2222222 = new rwz(context);
                    sdo.m34959a(cagn72222222);
                    URL url2222222 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                    if (!cdkp.f181122a.mo6606a().mo77805H()) {
                    }
                    httpURLConnection = (HttpURLConnection) url2222222.openConnection();
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setChunkedStreamingMode(0);
                    httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                    httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                    String valueOf3222222 = String.valueOf(cagn72222222.f174475g);
                    httpURLConnection.setRequestProperty("Cookie", valueOf3222222.length() != 0 ? new String("NID=") : "NID=".concat(valueOf3222222));
                    OutputStream outputStream2222222 = httpURLConnection.getOutputStream();
                    String valueOf22222222 = String.valueOf(cagn72222222);
                    StringBuilder sb4222222 = new StringBuilder(String.valueOf(valueOf22222222).length() + 20);
                    sb4222222.append("Sending logRequest: ");
                    sb4222222.append(valueOf22222222);
                    sb4222222.toString();
                    gZIPOutputStream = new GZIPOutputStream(outputStream2222222);
                    cagn72222222.mo73638a(gZIPOutputStream);
                    gZIPOutputStream.close();
                    headerField = httpURLConnection.getHeaderField("Set-Cookie");
                    if (headerField == null) {
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb22222222 = new StringBuilder(25);
                    sb22222222.append("Got response: ");
                    sb22222222.append(responseCode);
                    sb22222222.toString();
                    if (responseCode >= 200) {
                    }
                    StringBuilder sb32222222 = new StringBuilder(37);
                    sb32222222.append("Received HTTP status code ");
                    sb32222222.append(responseCode);
                    throw new IOException(sb32222222.toString());
                } catch (Throwable th6) {
                    th2 = th6;
                    anfg = null;
                    if (anfg != null) {
                        try {
                            anfg.close();
                        } catch (RuntimeException e17) {
                            rwx.mo25220a(e17);
                            Log.e("SosLogRequestBuilder", "Couldn't close phenotype database", e17);
                        }
                    }
                    throw th2;
                }
                a = req.m33478a(experimentTokens, iArr, true);
                if (a != null) {
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    cagi cagi5 = (cagi) bxvf.f164949b;
                    a.getClass();
                    cagi5.f173108k = a;
                    cagi5.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                }
            } else {
                num = null;
            }
            try {
                num2 = qxs.m33071a(rwx.f43795a);
            } catch (RuntimeException e18) {
                rwx.mo25220a(e18);
                Log.w("Couldn't get bootCount.", e18);
                num2 = num;
            }
            if (num2 != null) {
                long intValue = (long) num2.intValue();
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                cagi cagi6 = (cagi) bxvf.f164949b;
                cagi6.f173098a |= 2097152;
                cagi6.f173113q = intValue;
            }
            cagiArr2222222[0] = (cagi) bxvf.mo74062i();
            List asList22222222 = Arrays.asList(cagiArr2222222);
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            cagn = (cagn) bxvf2.f164949b;
            if (!cagn.f174476h.mo73666a()) {
                cagn.f174476h = GeneratedMessageLite.m124021a(cagn.f174476h);
            }
            bxsy.m123078a(asList22222222, cagn.f174476h);
            da4 = cage.f173082f.mo74144da();
            try {
                boolean a322222222 = rep.m33475a(rwx.f43795a);
                if (!da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                cage cage62222222 = (cage) da4.f164949b;
                cage62222222.f173084a |= 1;
                cage62222222.f173085b = a322222222;
            } catch (RuntimeException e19) {
                rwx.mo25220a(e19);
                Log.e("SosLogRequestBuilder", "Couldn't get isUnmetered; leaving as default of false.", e19);
            }
            boolean b22222222 = rep.m33476b(rwx.f43795a);
            if (!da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            cage cage222222222 = (cage) da4.f164949b;
            cage222222222.f173084a |= 2;
            cage222222222.f173086c = b22222222;
            try {
                if (!rep.m33477c(rwx.f43795a)) {
                    i4 = 3;
                }
                if (!da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                cage cage322222222 = (cage) da4.f164949b;
                cage322222222.f173087d = i4 - 1;
                cage322222222.f173084a |= 4;
            } catch (RuntimeException e20) {
                rwx.mo25220a(e20);
                Log.e("SosLogRequestBuilder", "Couldn't get autoTimeStatus; omitting.", e20);
                if (!da4.f164950c) {
                    i = 0;
                } else {
                    da4.mo74035c();
                    i = 0;
                    da4.f164950c = false;
                }
                cage cage7 = (cage) da4.f164949b;
                cage7.f173087d = i;
                cage7.f173084a |= 4;
            }
            try {
                it = soz.m35801d(rwx.f43795a, "com.google.android.gms.common.devicedoctor.fixes.clearcutsos").iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    Account account = (Account) it.next();
                    if (account.name != null && account.name.toLowerCase(Locale.US).endsWith("@google.com")) {
                        z2 = true;
                        break;
                    }
                }
                if (!da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                cage cage422222222 = (cage) da4.f164949b;
                cage422222222.f173084a |= 8;
                cage422222222.f173088e = z2;
                z = false;
            } catch (SecurityException e21) {
                throw new rww(str4222222, e21);
            } catch (RuntimeException e22) {
                rwx.mo25220a(e22);
                throw new rww(str4222222, e22);
            } catch (rww e23) {
                Log.e("SosLogRequestBuilder", "Couldn't get isGooglerDevice; leaving as default of false.", e23);
                if (!da4.f164950c) {
                    z = false;
                } else {
                    da4.mo74035c();
                    z = false;
                    da4.f164950c = false;
                }
                cage cage8 = (cage) da4.f164949b;
                cage8.f173084a |= 8;
                cage8.f173088e = z;
            }
            cage cage522222222 = (cage) da4.mo74062i();
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = z;
            }
            cagn cagn622222222 = (cagn) bxvf2.f164949b;
            cage522222222.getClass();
            cagn622222222.f174480l = cage522222222;
            cagn622222222.f174469a |= 512;
            cagn cagn722222222 = (cagn) bxvf2.mo74062i();
            rwz rwz22222222 = new rwz(context);
            try {
                sdo.m34959a(cagn722222222);
                URL url22222222 = new URL(cdkp.f181122a.mo6606a().mo77807J());
                if (!cdkp.f181122a.mo6606a().mo77805H()) {
                    if (!"https".equals(url22222222.getProtocol())) {
                        String valueOf4 = String.valueOf(url22222222);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 54);
                        sb5.append("Abort attempt to upload logs in plaintext: requestUrl=");
                        sb5.append(valueOf4);
                        throw new IllegalStateException(sb5.toString());
                    }
                }
                httpURLConnection = (HttpURLConnection) url22222222.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setConnectTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77804G()));
                httpURLConnection.setReadTimeout(Math.max(1, (int) cdkp.f181122a.mo6606a().mo77806I()));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-gzip");
                String valueOf32222222 = String.valueOf(cagn722222222.f174475g);
                httpURLConnection.setRequestProperty("Cookie", valueOf32222222.length() != 0 ? new String("NID=") : "NID=".concat(valueOf32222222));
                try {
                    OutputStream outputStream22222222 = httpURLConnection.getOutputStream();
                    String valueOf222222222 = String.valueOf(cagn722222222);
                    StringBuilder sb42222222 = new StringBuilder(String.valueOf(valueOf222222222).length() + 20);
                    sb42222222.append("Sending logRequest: ");
                    sb42222222.append(valueOf222222222);
                    sb42222222.toString();
                    gZIPOutputStream = new GZIPOutputStream(outputStream22222222);
                    cagn722222222.mo73638a(gZIPOutputStream);
                    gZIPOutputStream.close();
                    headerField = httpURLConnection.getHeaderField("Set-Cookie");
                    if (headerField == null) {
                        if (!headerField.isEmpty()) {
                            for (HttpCookie httpCookie : HttpCookie.parse(headerField)) {
                                if (httpCookie.getName().equals("NID") && httpCookie.getValue() != null) {
                                    aoop.m66225a(new PseudonymousIdToken(httpCookie.getValue()), rwz22222222.f43798a);
                                }
                            }
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb222222222 = new StringBuilder(25);
                    sb222222222.append("Got response: ");
                    sb222222222.append(responseCode);
                    sb222222222.toString();
                    if (responseCode >= 200) {
                        rwv = this;
                    } else if (responseCode < 300) {
                        httpURLConnection.disconnect();
                        rvk d2 = rvl.mo25205d();
                        d2.mo25199a(this, 3);
                        return d2.mo25198a();
                    } else {
                        rwv = this;
                    }
                    StringBuilder sb322222222 = new StringBuilder(37);
                    sb322222222.append("Received HTTP status code ");
                    sb322222222.append(responseCode);
                    throw new IOException(sb322222222.toString());
                    throw th;
                } catch (Throwable th7) {
                    th = th7;
                    rwv = this;
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e24) {
                e = e24;
                rwv = this;
                Log.e("ClearcutSosFix", "Failed to send SOS", e);
                rvk d3 = rvl.mo25205d();
                d3.mo25199a(rwv, 5);
                return d3.mo25198a();
            }
        } catch (RuntimeException e25) {
            e = e25;
            rwx.mo25220a(e);
            throw new rww("Couldn't create androidClientInfo", e);
        }
    }
}
