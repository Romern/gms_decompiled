package p000;

import android.content.Context;
import android.location.GnssStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.location.bluesky.OnFootActivityRecognition;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: beyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beyv {

    /* renamed from: A */
    private static final srn f113029A = srn.m36125a("BlueskyManager");

    /* renamed from: B */
    private static final long f113030B = TimeUnit.HOURS.toMillis(2);

    /* renamed from: C */
    private static final long f113031C = TimeUnit.MILLISECONDS.toNanos(1100);

    /* renamed from: z */
    public static final /* synthetic */ int f113032z = 0;

    /* renamed from: D */
    private final bfak f113033D;

    /* renamed from: E */
    private final bfbo f113034E = m96093c();

    /* renamed from: F */
    private final bezr f113035F;

    /* renamed from: G */
    private final bfbw f113036G;

    /* renamed from: H */
    private final bfbj f113037H;

    /* renamed from: a */
    public final Executor f113038a;

    /* renamed from: b */
    public final OnFootActivityRecognition f113039b;

    /* renamed from: c */
    public final bhbr f113040c;

    /* renamed from: d */
    public final LocationManager f113041d;

    /* renamed from: e */
    public final ste f113042e;

    /* renamed from: f */
    public final List f113043f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final boolean f113044g;

    /* renamed from: h */
    public final bezz f113045h;

    /* renamed from: i */
    public final Object f113046i = new Object();

    /* renamed from: j */
    public volatile boolean f113047j;

    /* renamed from: k */
    public boolean f113048k;

    /* renamed from: l */
    public boolean f113049l;

    /* renamed from: m */
    public Queue f113050m;

    /* renamed from: n */
    public boolean f113051n;

    /* renamed from: o */
    public Location f113052o;

    /* renamed from: p */
    public Location f113053p;

    /* renamed from: q */
    public Location f113054q;

    /* renamed from: r */
    public final aehy f113055r = new beym(this);

    /* renamed from: s */
    public final LocationListener f113056s = new beyo(this);

    /* renamed from: t */
    public boolean f113057t;

    /* renamed from: u */
    public long f113058u = 0;

    /* renamed from: v */
    public final std f113059v = new beyr(this);

    /* renamed from: w */
    public final bhbp f113060w = new beys(this);

    /* renamed from: x */
    public final GnssStatus.Callback f113061x = new beyu(this);

    /* renamed from: y */
    public final rjx f113062y;

    public beyv(Executor executor, rjx rjx, OnFootActivityRecognition onFootActivityRecognition, ste ste, LocationManager locationManager, bfbj bfbj, bfak bfak, bezr bezr, bfbw bfbw, bezz bezz) {
        this.f113038a = executor;
        this.f113062y = rjx;
        this.f113039b = onFootActivityRecognition;
        this.f113042e = ste;
        this.f113041d = locationManager;
        this.f113040c = null;
        this.f113037H = bfbj;
        this.f113033D = bfak;
        this.f113035F = bezr;
        this.f113036G = bfbw;
        this.f113044g = true;
        this.f113045h = bezz;
    }

    /* renamed from: a */
    static beyv m96091a(Context context, Executor executor) {
        bezz bezz;
        cijl cijl;
        BufferedReader bufferedReader;
        Throwable th;
        Throwable th2;
        DirectoryStream<Path> newDirectoryStream;
        Throwable th3;
        Context context2 = context;
        if (cesw.f183411a.mo6606a().blueskyEnableClearcutStats()) {
            boolean b = cesw.m138212b();
            qws qws = new qws(context2, "LOCATION_BLUESKY_STATS", null);
            qws.mo24337a(cagz.UNMETERED_OR_DAILY);
            bezz = new bfab(qws, avtz.m79338b(context), b);
        } else {
            bezz = new bfac();
        }
        qws qws2 = new qws(context2, "LOCATION_VOILATILE_CACHE_STATS", null);
        qws2.mo24337a(cagz.UNMETERED_OR_DAILY);
        int blueskyRaytracingCalculationRadiusMeters = (int) cesw.f183411a.mo6606a().blueskyRaytracingCalculationRadiusMeters();
        try {
            String l = Long.toString(spn.getAndroidId(context));
            bfbv bfbv = new bfbv(new bfag(new beyf(context2)), String.valueOf(context.getCacheDir().getPath()).concat("/bluesky"), (int) cesw.f183411a.mo6606a().blueskyTileDiskCacheSize(), l, new bfby(l), new beyg(qws2), bezz);
            ArrayList<Pair> arrayList = new ArrayList();
            Path path = Paths.get(bfbv.f113344c, new String[0]);
            if (Files.exists(path, new LinkOption[0])) {
                DirectoryStream<Path> newDirectoryStream2 = Files.newDirectoryStream(path);
                try {
                    for (Path path2 : newDirectoryStream2) {
                        Long a = bqcr.m112596a(path2.getFileName().toString());
                        if (a != null) {
                            newDirectoryStream = Files.newDirectoryStream(path2);
                            for (Path path3 : newDirectoryStream) {
                                arrayList.add(Pair.create(path3, Integer.valueOf(a.intValue())));
                            }
                            if (newDirectoryStream != null) {
                                newDirectoryStream.close();
                            }
                        }
                    }
                    if (newDirectoryStream2 != null) {
                        newDirectoryStream2.close();
                    }
                    Collections.sort(arrayList, bfbs.f113340a);
                    for (Pair pair : arrayList) {
                        bfbv.f113346e.put(bnzb.m110870a(((Path) pair.first).getFileName().toString()), (Integer) pair.second);
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (newDirectoryStream2 != null) {
                        newDirectoryStream2.close();
                    }
                    throw th2;
                }
            }
            Path path4 = Paths.get(bfbv.f113344c, bfbv.f113342a);
            if (Files.exists(path4, new LinkOption[0])) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bfbv.f113348g.mo61372b(Files.readAllBytes(path4))), StandardCharsets.UTF_8));
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        if (!readLine.isEmpty()) {
                            bfbv.f113345d.add(bnzb.m110870a(readLine));
                        }
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    try {
                        Files.delete(path4);
                    } catch (IOException e2) {
                    }
                } catch (Throwable th5) {
                    bqye.m113761a(th, th5);
                }
            }
            bfbw bfbw = new bfbw(new bfcb(bfbv, blueskyRaytracingCalculationRadiusMeters + ((int) cesw.f183411a.mo6606a().blueskyExtraBoundingRadiusToLoadGeodataMeters()), (int) cesw.f183411a.mo6606a().blueskyTileSize(), (int) cesw.f183411a.mo6606a().blueskyTileZoomLevel(), (long) ((int) cesw.f183411a.mo6606a().blueskyTileVersion())), blueskyRaytracingCalculationRadiusMeters, cesw.f183411a.mo6606a().blueskyUseImmutableLocalRaster());
            if (cesw.f183411a.mo6606a().blueskyEnableMddGeofence()) {
                cijl = new bezq(context2, new bezo(cesw.m138216f().f165794a));
            } else {
                cijl = new bezo(cesw.m138216f().f165794a);
            }
            long j = f113030B;
            int i = aytg.f98445a;
            bezr bezr = new bezr(cijl, j);
            bhbr a2 = bhbr.m100591a(context);
            LocationManager locationManager = (LocationManager) context2.getSystemService("location");
            rjx c = aeie.m51878c(context);
            OnFootActivityRecognition onFootActivityRecognition = new OnFootActivityRecognition(aefo.m51797a(context), context2, new bfci(cesw.f183411a.mo6606a().blueskyTreatUnknownActivityAsOnfoot(), (int) cesw.f183411a.mo6606a().blueskyOnFootStickinessSec(), (int) cesw.f183411a.mo6606a().blueskyInVehicleStickinessSec()));
            ste ste = new ste(context2, new adzt(Looper.getMainLooper()));
            bfbw bfbw2 = bfbw;
            OnFootActivityRecognition onFootActivityRecognition2 = onFootActivityRecognition;
            bfbj bfbj = new bfbj(new beyh(blueskyRaytracingCalculationRadiusMeters), cesw.f183411a.mo6606a().minigridMinAllowedHorizontalPositionSigmaMeters(), cesw.f183411a.mo6606a().minigridRadiusOfInnerCircleMeters(), (int) cesw.f183411a.mo6606a().minigridNumberOfPointsInInnerCircle(), cesw.m138213c(), cesw.f183411a.mo6606a().blueskySatelliteMotionFixB148574152(), cesw.f183411a.mo6606a().blueskySatelliteMotionThresholdDeg(), bezz);
            bfaj bfaj = new bfaj();
            bfaj.f113238a = (int) cesw.f183411a.mo6606a().blueskyOpenskyMinNumLosGpsSignals();
            bfaj.f113239b = (int) cesw.f183411a.mo6606a().blueskyOpenskyMinNumLosGnssSignals();
            bfaj.f113240c = (float) cesw.f183411a.mo6606a().blueskyOpenskyMinCn0DbhzForLos();
            bfaj.f113241d = (float) cesw.f183411a.mo6606a().blueskyOpenskyMinElevationDegForLos();
            bfak bfak = new bfak(bfaj);
            if (!cesw.f183411a.mo6606a().blueskyUseLocationCompat()) {
                return new beyv(executor, c, onFootActivityRecognition2, ste, locationManager, bfbj, bfak, bezr, bfbw2, bezz);
            }
            return new beyv(executor, c, onFootActivityRecognition2, ste, a2, bfbj, bfak, bezr, bfbw2, bezz);
            throw th;
            throw th3;
        } catch (IOException e3) {
            bnsl bnsl = (bnsl) f113029A.mo68388c();
            bnsl.mo68437a(e3);
            bnsl.mo68405a("Failed to create RasterManager.");
            return null;
        } catch (Throwable th6) {
            bqye.m113761a(th2, th6);
        }
    }

    /* renamed from: c */
    public static bfbo m96093c() {
        if (cesw.f183411a.mo6606a().blueskyIscbUseGclValue()) {
            bxvt bxvt = cesw.f183411a.mo6606a().blueskyIscbScaledDbhz().f165791a;
            if (bxvt.size() < 9) {
                return new bfbo("Default");
            }
            bfaq a = bfar.m96289a();
            a.mo61343a(bfav.GPS_L1, ((float) ((Integer) bxvt.get(0)).intValue()) * 0.01f);
            a.mo61343a(bfav.GPS_L5, ((float) ((Integer) bxvt.get(1)).intValue()) * 0.01f);
            a.mo61343a(bfav.GAL_E1, ((float) ((Integer) bxvt.get(2)).intValue()) * 0.01f);
            a.mo61343a(bfav.GAL_E5, ((float) ((Integer) bxvt.get(3)).intValue()) * 0.01f);
            a.mo61343a(bfav.GLO_G1, ((float) ((Integer) bxvt.get(4)).intValue()) * 0.01f);
            a.mo61343a(bfav.BDS_B1, ((float) ((Integer) bxvt.get(5)).intValue()) * 0.01f);
            a.mo61343a(bfav.BDS_B2, ((float) ((Integer) bxvt.get(6)).intValue()) * 0.01f);
            a.mo61343a(bfav.QZS_J1, ((float) ((Integer) bxvt.get(7)).intValue()) * 0.01f);
            a.mo61343a(bfav.QZS_J5, ((float) ((Integer) bxvt.get(8)).intValue()) * 0.01f);
            return new bfbo(a.mo61342a());
        }
        String lowerCase = Build.BRAND.toLowerCase(Locale.US);
        String lowerCase2 = Build.PRODUCT.toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("/");
        sb.append(lowerCase2);
        return new bfbo(sb.toString());
    }

    /* renamed from: b */
    public final void mo61263b() {
        long nanos = TimeUnit.MINUTES.toNanos(cesw.f183411a.mo6606a().blueskyBugreportLogExpirationTimeMinutes());
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        synchronized (this.f113046i) {
            if (this.f113050m != null) {
                while (!this.f113050m.isEmpty() && elapsedRealtimeNanos - ((Long) ((Pair) this.f113050m.peek()).first).longValue() > nanos) {
                    this.f113050m.remove();
                }
            }
        }
    }

    public beyv(Executor executor, rjx rjx, OnFootActivityRecognition onFootActivityRecognition, ste ste, bhbr bhbr, bfbj bfbj, bfak bfak, bezr bezr, bfbw bfbw, bezz bezz) {
        this.f113038a = executor;
        this.f113062y = rjx;
        this.f113039b = onFootActivityRecognition;
        this.f113042e = ste;
        this.f113040c = bhbr;
        this.f113041d = null;
        this.f113037H = bfbj;
        this.f113033D = bfak;
        this.f113035F = bezr;
        this.f113036G = bfbw;
        this.f113044g = true;
        this.f113045h = bezz;
    }

    /* renamed from: a */
    static boolean m96092a(bfkr bfkr, Location location, Location location2) {
        if (location == null) {
            return false;
        }
        if ((location2 != null && location.getElapsedRealtimeNanos() == location2.getElapsedRealtimeNanos()) || SystemClock.elapsedRealtimeNanos() - bfkr.mo61842b() >= f113031C || SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos() >= f113031C) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo61260a() {
        boolean z;
        sdo.m34970a(this.f113047j);
        bhbr bhbr = this.f113040c;
        if (bhbr != null) {
            if (this.f113048k || this.f113049l) {
                bhbr.mo63529a(this.f113056s);
            }
            this.f113040c.mo63531a(this.f113060w);
        } else {
            if (this.f113048k || this.f113049l) {
                this.f113041d.removeUpdates(this.f113056s);
            }
            this.f113041d.unregisterGnssStatusCallback(this.f113061x);
        }
        this.f113062y.mo24716a(this.f113055r);
        OnFootActivityRecognition onFootActivityRecognition = this.f113039b;
        if (onFootActivityRecognition.f150687c != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Call register before unregister");
        onFootActivityRecognition.f150688d.mo24729b(onFootActivityRecognition.f150687c);
        onFootActivityRecognition.f150685a.unregisterReceiver(onFootActivityRecognition);
        onFootActivityRecognition.f150687c = null;
        this.f113042e.mo26067a();
        this.f113045h.mo61337y();
        this.f113047j = false;
    }

    /* renamed from: a */
    public final void mo61261a(bfch bfch) {
        if (this.f113044g) {
            this.f113038a.execute(new beyi(this, bfch));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x048b, code lost:
        if (p000.bezp.m96178a(r3[r5]).mo68580a(r6) != false) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04a0, code lost:
        if (p000.bezp.m96178a(r3[r5 - 1]).mo68580a(r6) == false) goto L_0x0a2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04a2, code lost:
        r1.f113045h.mo61314c();
        r3 = r1.f113033D;
        r4 = 0;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04b0, code lost:
        if (r4 >= r38.mo61839a()) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04ba, code lost:
        if (r0.mo61844d(r4) < r3.f113245d) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04c4, code lost:
        if (r0.mo61843c(r4) >= r3.f113244c) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04cc, code lost:
        if (r0.mo61840a(r4) == 1) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04cf, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04d1, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04d5, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04da, code lost:
        if (r5 < r3.f113242a) goto L_0x0a08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04de, code lost:
        if (r6 >= r3.f113243b) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04e2, code lost:
        r1.f113045h.mo61317e();
        r3 = p000.bnwc.m110613b(r8.getLatitude(), r8.getLongitude());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04f5, code lost:
        if (r1.f113049l == false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04f7, code lost:
        r4 = r8.getAccuracy();
        r5 = p000.bnwc.m110613b(r17.getLatitude(), r17.getLongitude());
        r6 = (double) r4;
        r9 = (double) r17.getAccuracy();
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r6);
        r4 = p000.ayuo.m84846b(r3.mo68615b(), r3.mo68617d(), r5.mo68615b(), r5.mo68617d());
        java.lang.Double.isNaN(r9);
        java.lang.Double.isNaN(r9);
        r4 = java.lang.Math.max((r6 + r6) + 15.0d, r4 + (r9 + r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x053e, code lost:
        if (r4 <= ((double) p000.cesw.m138215e())) goto L_0x0571;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0540, code lost:
        p000.cesw.m138215e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0543, code lost:
        if (r2 == null) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0547, code lost:
        if (r2.f164950c != false) goto L_0x054a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x054a, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0550, code lost:
        r0 = (p000.bezb) r2.f164949b;
        r3 = p000.bezb.f113104h;
        r0.f113112g = 12;
        r0.f113106a |= 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0560, code lost:
        r1.f113045h.mo61336x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0568, code lost:
        r4 = p000.bfcg.m96336a((double) r8.getAccuracy());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0571, code lost:
        if (r2 != null) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0574, code lost:
        r6 = p000.bfcf.m96335a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057a, code lost:
        if (r2.f164950c != false) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x057d, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0583, code lost:
        r7 = (p000.bezb) r2.f164949b;
        r9 = p000.bezb.f113104h;
        r6.getClass();
        r7.f113109d = r6;
        r6 = r7.f113106a | 32;
        r7.f113106a = r6;
        r7.f113106a = r6 | 64;
        r7.f113110e = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x059b, code lost:
        r6 = r4 + r4;
        r6 = p000.bnwc.m110612a(p000.ayuo.m84855e(r6), p000.ayuo.m84845b(r6, r3.f132274a));
        r3 = new p000.bnwe(r3, r3).mo68628a(new p000.bnwc(r6.f132274a * 0.5d, r6.f132275b * 0.5d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r3 = r1.f113036G.mo61376a(p000.bngx.m109359a(r3.mo68631a(0), r3.mo68631a(1), r3.mo68631a(2), r3.mo68631a(3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05e5, code lost:
        if (r3.mo66813a() != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05e7, code lost:
        ((p000.bnsl) p000.beyv.f113029A.mo68388c()).mo68408a("Raster absent for center location: (%f, %f)", r8.getLatitude(), r8.getLongitude());
        r1.f113045h.mo61319g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0602, code lost:
        if (r2 == null) goto L_0x0ae2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0606, code lost:
        if (r2.f164950c != false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0609, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x060f, code lost:
        r0 = (p000.bezb) r2.f164949b;
        r3 = p000.bezb.f113104h;
        r0.f113112g = 14;
        r0.f113106a |= 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0621, code lost:
        r6 = r1.f113034E;
        r7 = new java.util.HashSet(r6.f113326a.keySet());
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0633, code lost:
        if (r9 >= r38.mo61839a()) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0635, code lost:
        r10 = p000.bfav.m96291a(r0.mo61840a(r9), (double) r0.mo61847g(r9));
        r12 = new p000.bfat(r0.mo61840a(r9), r0.mo61841b(r9), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0655, code lost:
        if (r6.f113326a.containsKey(r12) != false) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0657, code lost:
        r13 = r6.f113327b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x065f, code lost:
        if (r13.f113256a.containsKey(r10) == false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0661, code lost:
        r10 = ((java.lang.Float) r13.f113256a.get(r10)).floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x066e, code lost:
        r10 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0674, code lost:
        if (java.lang.Float.isNaN(r10) != false) goto L_0x0677;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0677, code lost:
        r10 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0678, code lost:
        r22 = r4;
        r6.f113326a.put(r12, new p000.bfbp(r0.mo61840a(r9), r0.mo61841b(r9), r0.mo61847g(r9), r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0691, code lost:
        r22 = r4;
        r7.remove(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0696, code lost:
        r4 = (p000.bfbp) r6.f113326a.get(r12);
        r5 = r0.mo61847g(r9);
        r10 = r0.mo61844d(r9);
        r11 = r0.mo61845e(r9);
        r12 = r0.mo61843c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06bd, code lost:
        if (p000.bfav.m96291a(r4.f113328a.f113259a.f113257a, (double) r5) != r4.f113328a.f113260b) goto L_0x06c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06bf, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06c1, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06c2, code lost:
        p000.bmxy.m108588a(r13);
        r4.f113333f = 0;
        r4.f113329b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06cd, code lost:
        if (r12 <= 0.0f) goto L_0x06d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06cf, code lost:
        r5 = java.lang.Math.max(r12 - r4.f113334g, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06d7, code lost:
        r5 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06d8, code lost:
        r4.f113330c = r5;
        r4.f113332e = r11;
        r4.f113331d = r10;
        r9 = r9 + 1;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x06e4, code lost:
        r22 = r4;
        r4 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06ee, code lost:
        if (r4.hasNext() == false) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x06f0, code lost:
        r5 = (p000.bfat) r4.next();
        r7 = (p000.bfbp) r6.f113326a.get(r5);
        r7.f113330c = 0.0f;
        r10 = r7.f113333f + 1;
        r7.f113333f = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0708, code lost:
        if (r10 < 5) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x070a, code lost:
        r6.f113326a.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x071b, code lost:
        if (r1.f113034E.mo61364a().isEmpty() == false) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x071d, code lost:
        r1.f113045h.mo61320h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0722, code lost:
        if (r2 == null) goto L_0x0ae2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0726, code lost:
        if (r2.f164950c != false) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0729, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x072f, code lost:
        r0 = (p000.bezb) r2.f164949b;
        r3 = p000.bezb.f113104h;
        r0.f113112g = 15;
        r0.f113106a |= 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0741, code lost:
        r3 = (p000.bezi) r3.mo66814b();
        r4 = r1.f113037H;
        r5 = r1.f113034E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x074d, code lost:
        if (r4.f113313h == false) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x074f, code lost:
        r6 = p000.bngx.m109355a(p000.bnjd.m109586b((java.lang.Iterable) r5.f113326a.values(), p000.bfbm.f113324a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0760, code lost:
        r6 = r5.mo61364a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0764, code lost:
        r4.f113306a.incrementAndGet();
        r7 = r6.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x076e, code lost:
        if (r9 >= r7) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0770, code lost:
        r10 = (p000.bfbp) r6.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x078e, code lost:
        if (r4.f113309d.f113305a.containsKey(java.lang.Integer.valueOf(p000.bfbi.m96300a(r10.mo61365a(), r10.mo61366b()))) == false) goto L_0x0879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0790, code lost:
        r12 = (java.lang.Integer) r4.f113309d.f113305a.get(java.lang.Integer.valueOf(p000.bfbi.m96300a(r10.mo61365a(), r10.mo61366b())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07aa, code lost:
        if (r12 == null) goto L_0x07ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07ac, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07ae, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07af, code lost:
        p000.bmxy.m108600b(r13);
        r12 = r12.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07b8, code lost:
        if (r4.f113314i != false) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07ba, code lost:
        r11 = ((p000.bfbe) r4.f113308c.get(r12)).f113291a;
        r14 = (double) r10.f113332e;
        java.lang.Double.isNaN(r14);
        r11 = (r11 - r14) % 360.0d;
        r13 = ((p000.bfbe) r4.f113308c.get(r12)).f113292b;
        r15 = r7;
        r32 = r8;
        r7 = (double) r10.f113331d;
        java.lang.Double.isNaN(r7);
        r13 = r13 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07f2, code lost:
        if (((r11 * r11) + (r13 * r13)) > 4.0d) goto L_0x0870;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07f6, code lost:
        r15 = r7;
        r32 = r8;
        r7 = ((p000.bfbe) r4.f113308c.get(r12)).f113291a;
        r11 = ((p000.bfbe) r4.f113308c.get(r12)).f113292b;
        r13 = (double) r10.f113332e;
        r0 = (double) r10.f113331d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0816, code lost:
        if (r7 == r13) goto L_0x0862;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0818, code lost:
        java.lang.Double.isNaN(r13);
        r7 = java.lang.Math.toRadians((r7 - r13) % 360.0d);
        java.lang.Double.isNaN(r0);
        r13 = java.lang.Math.toRadians(r11 - r0);
        r7 = java.lang.Math.sin(r7 / 2.0d);
        r13 = java.lang.Math.sin(r13 / 2.0d);
        r0 = java.lang.Math.asin(java.lang.Math.sqrt((r13 * r13) + (((r7 * r7) * java.lang.Math.cos(java.lang.Math.toRadians(r11))) * java.lang.Math.cos(java.lang.Math.toRadians(r0)))));
        r0 = java.lang.Math.toDegrees(r0 + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0862, code lost:
        java.lang.Double.isNaN(r0);
        r0 = java.lang.Math.abs(r11 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x086e, code lost:
        if (r0 <= r4.f113315j) goto L_0x087c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0870, code lost:
        r4.mo61363a();
        r4.f113307b.mo61321i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0879, code lost:
        r15 = r7;
        r32 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x087c, code lost:
        r9 = r9 + 1;
        r7 = r15;
        r8 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0888, code lost:
        r32 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0892, code lost:
        if (r3.mo61275b() != r4.f113318m) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x089c, code lost:
        if (r3.mo61277c() != r4.f113319n) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x08a4, code lost:
        if (r3.mo61278d() != r4.f113320o) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x08ac, code lost:
        if (r3.mo61279e() == r4.f113321p) goto L_0x08af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x08af, code lost:
        r4.f113307b.mo61324l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x08b5, code lost:
        r4.f113318m = r3.mo61275b();
        r4.f113319n = r3.mo61277c();
        r4.f113320o = r3.mo61278d();
        r4.f113321p = r3.mo61279e();
        r4.mo61363a();
        r4.f113307b.mo61322j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x08d5, code lost:
        r26 = r4.f113306a.get();
        r1 = new int[r6.size()];
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x08e8, code lost:
        if (r7 >= r6.size()) goto L_0x0963;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x08ea, code lost:
        r8 = (p000.bfbp) r6.get(r7);
        r9 = r4.f113309d;
        r10 = p000.bfbi.m96300a(r8.mo61365a(), r8.mo61366b());
        r11 = r9.f113305a;
        r10 = java.lang.Integer.valueOf(r10);
        r11 = (java.lang.Integer) r11.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x090a, code lost:
        if (r11 != null) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x090c, code lost:
        r11 = java.lang.Integer.valueOf(r9.mo61362a());
        r9.f113305a.put(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0919, code lost:
        r9 = r11.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0923, code lost:
        if (r9 < r4.f113308c.size()) goto L_0x095a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x092b, code lost:
        if (r9 != r4.f113308c.size()) goto L_0x092f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x092d, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x092f, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0930, code lost:
        p000.bmxy.m108600b(r10);
        r11 = r5;
        r15 = r6;
        r4.f113308c.add(new p000.bfbe((double) r8.f113332e, (double) r8.f113331d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0951, code lost:
        if (r4.f113309d.mo61362a() != r4.f113308c.size()) goto L_0x0955;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0953, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0955, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0956, code lost:
        p000.bmxy.m108600b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x095a, code lost:
        r11 = r5;
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x095c, code lost:
        r1[r7] = r9;
        r7 = r7 + 1;
        r5 = r11;
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0963, code lost:
        r0 = new p000.bfbh(r4, r26, r1, new p000.bfbg(r3, new p000.bfbf(r4.f113322q.f113010a)), r3, r5, java.util.Collections.unmodifiableList(r6));
        r1 = r37;
        r3 = r1.f113043f.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0992, code lost:
        if (r3.hasNext() == false) goto L_0x09bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0994, code lost:
        r11 = (p000.bfch) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x099d, code lost:
        if (r1.f113049l == false) goto L_0x09ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x099f, code lost:
        r11.mo61265a(r38.mo61842b(), r0, r1.f113054q, r32, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x09ae, code lost:
        r11.mo61264a(r38.mo61842b(), r0, r1.f113054q, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x09bb, code lost:
        r1.f113045h.mo61308a();
        r0.f113296a = Integer.MIN_VALUE;
        r1.f113052o = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x09ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x09cb, code lost:
        r1.f113045h.mo61312b();
        r9 = (p000.bnsl) p000.beyv.f113029A.mo68388c();
        r9.mo68437a(r0);
        r9.mo68408a("Unable to load raster for center location: (%f, %f)", r8.getLatitude(), r8.getLongitude());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x09e9, code lost:
        if (r2 != null) goto L_0x09eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x09ed, code lost:
        if (r2.f164950c != false) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x09f0, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x09f6, code lost:
        r0 = (p000.bezb) r2.f164949b;
        r3 = p000.bezb.f113104h;
        r0.f113112g = 13;
        r0.f113106a |= 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0a08, code lost:
        r1.f113045h.mo61318f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0a0d, code lost:
        if (r2 == null) goto L_0x0ae2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0a11, code lost:
        if (r2.f164950c != false) goto L_0x0a14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0a14, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0a1a, code lost:
        r0 = (p000.bezb) r2.f164949b;
        r3 = p000.bezb.f113104h;
        r0.f113112g = 11;
        r0.f113106a |= 512;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0ae5  */
    /* renamed from: a */
    public final void mo61262a(bfkr bfkr) {
        bxvd bxvd;
        Location location;
        Location location2;
        Location location3;
        long j;
        int i;
        ArrayList arrayList;
        bnvt bnvt;
        bnvt bnvt2;
        Location location4;
        beyv beyv = this;
        bfkr bfkr2 = bfkr;
        if (beyv.f113051n) {
            bxvd = bezb.f113104h.mo74144da();
        } else {
            bxvd = null;
        }
        if (bxvd != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < bfkr.mo61839a(); i2++) {
                bxvd da = beyz.f113079i.mo74144da();
                float e = bfkr2.mo61845e(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz = (beyz) da.f164949b;
                beyz.f113081a |= 8;
                beyz.f113085e = e;
                float d = bfkr2.mo61844d(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz2 = (beyz) da.f164949b;
                beyz2.f113081a |= 4;
                beyz2.f113084d = d;
                float g = bfkr2.mo61847g(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz3 = (beyz) da.f164949b;
                beyz3.f113081a |= 16;
                beyz3.f113086f = g;
                int a = bfkr2.mo61840a(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz4 = (beyz) da.f164949b;
                beyz4.f113081a |= 1;
                beyz4.f113082b = a;
                int b = bfkr2.mo61841b(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz5 = (beyz) da.f164949b;
                beyz5.f113081a |= 2;
                beyz5.f113083c = b;
                float c = bfkr2.mo61843c(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz6 = (beyz) da.f164949b;
                beyz6.f113081a |= 32;
                beyz6.f113087g = c;
                boolean f = bfkr2.mo61846f(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                beyz beyz7 = (beyz) da.f164949b;
                beyz7.f113081a |= 64;
                beyz7.f113088h = f;
                arrayList2.add((beyz) da.mo74062i());
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bezb bezb = (bezb) bxvd.f164949b;
            bezb bezb2 = bezb.f113104h;
            if (!bezb.f113111f.mo73666a()) {
                bezb.f113111f = GeneratedMessageLite.m124021a(bezb.f113111f);
            }
            bxsy.m123078a(arrayList2, bezb.f113111f);
            Location location5 = beyv.f113054q;
            if (location5 != null) {
                beza a2 = bfcf.m96335a(location5);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bezb bezb3 = (bezb) bxvd.f164949b;
                a2.getClass();
                bezb3.f113107b = a2;
                bezb3.f113106a |= 1;
            }
            Location location6 = beyv.f113053p;
            if (location6 != null) {
                beza a3 = bfcf.m96335a(location6);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bezb bezb4 = (bezb) bxvd.f164949b;
                a3.getClass();
                bezb4.f113108c = a3;
                bezb4.f113106a |= 16;
            }
        }
        if (cesw.m138212b()) {
            beyv.f113045h.mo61310a(bfkr.mo61839a());
            for (int i3 = 0; i3 < bfkr.mo61839a(); i3++) {
                beyv.f113045h.mo61309a(bfkr2.mo61843c(i3));
            }
        }
        if (beyv.f113048k) {
            location2 = beyv.f113054q;
            if (location2 != null) {
                location = beyv.f113053p;
            } else {
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bezb bezb5 = (bezb) bxvd.f164949b;
                    bezb bezb6 = bezb.f113104h;
                    bezb5.f113112g = 1;
                    bezb5.f113106a |= 512;
                }
                beyv.f113045h.mo61328p();
                synchronized (beyv.f113046i) {
                    if (bxvd != null) {
                        if (beyv.f113050m != null) {
                            mo61263b();
                            beyv.f113050m.add(Pair.create(Long.valueOf(SystemClock.elapsedRealtimeNanos()), (bezb) bxvd.mo74062i()));
                        }
                    }
                }
                return;
            }
        } else {
            Location location7 = beyv.f113053p;
            if (location7 == null) {
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bezb bezb7 = (bezb) bxvd.f164949b;
                    bezb bezb8 = bezb.f113104h;
                    bezb7.f113112g = 2;
                    bezb7.f113106a |= 512;
                }
                beyv.f113045h.mo61329q();
            } else if (aeim.m51906j(location7) == 1 || aeim.m51906j(beyv.f113053p) == 3) {
                location2 = beyv.f113053p;
                location = beyv.f113054q;
            } else {
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bezb bezb9 = (bezb) bxvd.f164949b;
                    bezb bezb10 = bezb.f113104h;
                    bezb9.f113112g = 3;
                    bezb9.f113106a |= 512;
                }
                beyv.f113045h.mo61329q();
            }
            synchronized (beyv.f113046i) {
            }
        }
        if (!beyv.f113049l || !(beyv.f113054q == null || beyv.f113053p == null)) {
            if (location2 != null) {
                location2.getLatitude();
                location2.getLongitude();
                location2.getAltitude();
                location2.getAccuracy();
                if (((double) location2.getAccuracy()) <= 50.0d) {
                    OnFootActivityRecognition onFootActivityRecognition = beyv.f113039b;
                    bmxy.m108601b(onFootActivityRecognition.f150687c != null, "Call register first");
                    if (onFootActivityRecognition.f150686b.mo61384a()) {
                        if (cesw.f183411a.mo6606a().blueskyDisableWhenScreenOff()) {
                            long b2 = bfkr.mo61842b();
                            if (!beyv.f113057t) {
                                location3 = location;
                                if (b2 - beyv.f113058u >= TimeUnit.SECONDS.toNanos(cesw.f183411a.mo6606a().blueskyScreenOffDisableTimeoutSec())) {
                                    if (bxvd != null) {
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bezb bezb11 = (bezb) bxvd.f164949b;
                                        bezb bezb12 = bezb.f113104h;
                                        bezb11.f113112g = 8;
                                        bezb11.f113106a |= 512;
                                    }
                                    beyv.f113045h.mo61334v();
                                }
                            } else {
                                location3 = location;
                            }
                        } else {
                            location3 = location;
                        }
                        if (!cesw.f183411a.mo6606a().blueskyUpdateOnTinyMovement() && (location4 = beyv.f113052o) != null && ayuo.m84846b(location4.getLatitude(), beyv.f113052o.getLongitude(), location2.getLatitude(), location2.getLongitude()) <= cesw.f183411a.mo6606a().blueskyMinTravelDistanceToComputeCorrectionsMeters()) {
                            if (bxvd != null) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bezb bezb13 = (bezb) bxvd.f164949b;
                                bezb bezb14 = bezb.f113104h;
                                bezb13.f113112g = 9;
                                bezb13.f113106a |= 512;
                            }
                            beyv.f113045h.mo61335w();
                        } else {
                            bezr bezr = beyv.f113035F;
                            bnwc b3 = bnwc.m110613b(location2.getLatitude(), location2.getLongitude());
                            bnvt bnvt3 = new bnvt(ayvd.m84911b(b3.f132274a, b3.f132275b));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j2 = bezr.f113183c;
                            if (j2 >= 0) {
                                j = elapsedRealtime;
                                if (elapsedRealtime - j2 <= bezr.f113182b) {
                                    bnvt = bnvt3;
                                } else {
                                    i = 14;
                                    while (i > 0 && bezr.m96181a(i) < 200.0d) {
                                        i--;
                                    }
                                    double a4 = ((bezr.m96181a(i) * 1000.0d) / Math.sqrt(2.0d)) + 200000.0d;
                                    double[] dArr = new double[2];
                                    ayvd.m84903a(bnvt3.f132250b, dArr);
                                    HashSet hashSet = new HashSet();
                                    arrayList = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    Long valueOf = Long.valueOf(ayvd.m84899a(bnvt3.f132250b, i));
                                    hashSet.add(valueOf);
                                    arrayList.add(valueOf);
                                    long[] jArr = new long[4];
                                    double[] dArr2 = new double[2];
                                    while (!arrayList.isEmpty()) {
                                        bnvt bnvt4 = bnvt3;
                                        long longValue = ((Long) arrayList.get(arrayList.size() - 1)).longValue();
                                        arrayList.remove(arrayList.size() - 1);
                                        ayvd.m84903a(longValue, dArr2);
                                        if (ayuo.m84846b(dArr[0], dArr[1], dArr2[0], dArr2[1]) <= a4) {
                                            arrayList3.add(new bnvt(longValue));
                                            ayvd.m84905a(longValue, jArr);
                                            for (int i4 = 0; i4 < 4; i4++) {
                                                Long valueOf2 = Long.valueOf(jArr[i4]);
                                                if (!hashSet.contains(valueOf2)) {
                                                    arrayList.add(valueOf2);
                                                    hashSet.add(valueOf2);
                                                }
                                            }
                                            bnvt3 = bnvt4;
                                        } else {
                                            bnvt3 = bnvt4;
                                        }
                                    }
                                    bnvt = bnvt3;
                                    bnvu bnvu = new bnvu();
                                    bnvu.f132251a = arrayList3;
                                    bnvu.mo68597a();
                                    bnvu.mo68597a();
                                    Collection<bnvt> collection = (Collection) bezr.f113181a.mo6445a();
                                    ArrayList arrayList4 = new ArrayList(collection.size());
                                    for (bnvt bnvt5 : collection) {
                                        if (bnvt5.mo68581b() <= 14) {
                                            int binarySearch = Collections.binarySearch(bnvu.f132251a, bnvt5);
                                            if (binarySearch < 0) {
                                                binarySearch = (-binarySearch) - 1;
                                            }
                                            if ((binarySearch < bnvu.f132251a.size() && ((bnvt) bnvu.f132251a.get(binarySearch)).mo68588e().mo68582b(bnvt5.mo68590f())) || (binarySearch != 0 && ((bnvt) bnvu.f132251a.get(binarySearch - 1)).mo68590f().mo68584c(bnvt5.mo68588e()))) {
                                                arrayList4.add(Integer.valueOf(bezp.m96177a(bnvt5)));
                                            }
                                        }
                                    }
                                    Collections.sort(arrayList4);
                                    bezr.f113184d = bqcn.m112584a(arrayList4);
                                    bezr.f113183c = j;
                                }
                            } else {
                                j = elapsedRealtime;
                                i = 14;
                                while (i > 0) {
                                    i--;
                                }
                                double a42 = ((bezr.m96181a(i) * 1000.0d) / Math.sqrt(2.0d)) + 200000.0d;
                                double[] dArr3 = new double[2];
                                ayvd.m84903a(bnvt3.f132250b, dArr3);
                                HashSet hashSet2 = new HashSet();
                                arrayList = new ArrayList();
                                ArrayList arrayList32 = new ArrayList();
                                Long valueOf3 = Long.valueOf(ayvd.m84899a(bnvt3.f132250b, i));
                                hashSet2.add(valueOf3);
                                arrayList.add(valueOf3);
                                long[] jArr2 = new long[4];
                                double[] dArr22 = new double[2];
                                while (!arrayList.isEmpty()) {
                                }
                                bnvt = bnvt3;
                                bnvu bnvu2 = new bnvu();
                                bnvu2.f132251a = arrayList32;
                                bnvu2.mo68597a();
                                bnvu2.mo68597a();
                                Collection<bnvt> collection2 = (Collection) bezr.f113181a.mo6445a();
                                ArrayList arrayList42 = new ArrayList(collection2.size());
                                while (r5.hasNext()) {
                                }
                                Collections.sort(arrayList42);
                                bezr.f113184d = bqcn.m112584a(arrayList42);
                                bezr.f113183c = j;
                            }
                            int[] iArr = bezr.f113184d;
                            int length = iArr.length;
                            if (length > 0) {
                                int binarySearch2 = Arrays.binarySearch(iArr, bezp.m96177a(bnvt));
                                if (binarySearch2 < 0) {
                                    binarySearch2 = (-binarySearch2) - 1;
                                }
                                if (binarySearch2 < length) {
                                    bnvt2 = bnvt;
                                } else {
                                    bnvt2 = bnvt;
                                }
                                if (binarySearch2 != 0) {
                                }
                            }
                            beyv.f113045h.mo61316d();
                            location2.getLatitude();
                            location2.getLongitude();
                            if (bxvd != null) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bezb bezb15 = (bezb) bxvd.f164949b;
                                bezb bezb16 = bezb.f113104h;
                                bezb15.f113112g = 10;
                                bezb15.f113106a |= 512;
                            }
                        }
                    } else {
                        if (bxvd != null) {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bezb bezb17 = (bezb) bxvd.f164949b;
                            bezb bezb18 = bezb.f113104h;
                            bezb17.f113112g = 7;
                            bezb17.f113106a |= 512;
                        }
                        beyv.f113045h.mo61333u();
                    }
                } else {
                    if (bxvd != null) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bezb bezb19 = (bezb) bxvd.f164949b;
                        bezb bezb20 = bezb.f113104h;
                        bezb19.f113112g = 6;
                        bezb19.f113106a |= 512;
                    }
                    beyv.f113045h.mo61332t();
                }
            } else {
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bezb bezb21 = (bezb) bxvd.f164949b;
                    bezb bezb22 = bezb.f113104h;
                    bezb21.f113112g = 5;
                    bezb21.f113106a |= 512;
                }
                beyv.f113045h.mo61331s();
            }
            synchronized (beyv.f113046i) {
            }
        } else {
            if (bxvd != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bezb bezb23 = (bezb) bxvd.f164949b;
                bezb bezb24 = bezb.f113104h;
                bezb23.f113112g = 4;
                bezb23.f113106a |= 512;
            }
            beyv.f113045h.mo61330r();
            synchronized (beyv.f113046i) {
            }
        }
    }
}
