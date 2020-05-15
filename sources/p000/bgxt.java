package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.Deletion;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiPlaceInference;
import com.google.android.ulr.ApiPlaceInferenceResult;
import com.google.android.ulr.ApiPlaceReport;
import com.google.android.ulr.ApiUserData;
import com.google.android.ulr.RttRangingProto;
import com.google.android.ulr.WifiStrengthProto;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxt extends bgxs implements aesf {

    /* renamed from: b */
    final /* synthetic */ bgxx f117939b;

    /* renamed from: f */
    private final bgyb f117940f;

    /* renamed from: g */
    private final bgxg f117941g;

    /* renamed from: h */
    private bgtu f117942h;

    /* renamed from: i */
    private bgtm f117943i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgxt(bgxx bgxx, bgyf bgyf, bgye bgye, bgyg bgyg, bgxg bgxg, bguh bguh) {
        super(bgxx, bgxx.m100276a(), "UlrDispSvcFast");
        this.f117939b = bgxx;
        this.f117940f = new bgyb(bgxx.f117952b, bgyf, bgye, bgyg, bgxg, bgxx.f117963m, bguh);
        this.f117941g = bgxg;
    }

    /* renamed from: a */
    private final synchronized bgtu m100260a() {
        if (this.f117942h == null) {
            bgxx bgxx = this.f117939b;
            int i = bgxx.f117951w;
            Context context = bgxx.f117952b;
            bgyf bgyf = bgxx.f117955e;
            bgxg bgxg = this.f117941g;
            bguh bguh = bgxx.f117966p;
            bgzo.m100459a(context);
            this.f117942h = new bgtu(bgyf, bguh, new bgzf(context), bgxg, (WifiManager) context.getSystemService("wifi"));
        }
        return this.f117942h;
    }

    /* renamed from: b */
    private final synchronized bgtm m100262b() {
        if (this.f117943i == null) {
            bgxx bgxx = this.f117939b;
            int i = bgxx.f117951w;
            Context context = bgxx.f117952b;
            bgyf bgyf = bgxx.f117955e;
            bgxg bgxg = this.f117941g;
            bguh bguh = bgxx.f117966p;
            bgzo.m100459a(context);
            this.f117943i = new bgtm(bgyf, bguh, bgxg);
        }
        return this.f117943i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgtu.a(com.google.android.gms.location.NetworkLocationStatus, com.google.android.location.reporting.state.update.ReportingConfig, boolean):boolean
     arg types: [com.google.android.gms.location.NetworkLocationStatus, com.google.android.location.reporting.state.update.ReportingConfig, int]
     candidates:
      bgtu.a(long, long, long):boolean
      bgtu.a(com.google.android.location.reporting.state.update.ReportingConfig, bxvd, android.location.Location):void
      bgtu.a(com.google.android.gms.location.NetworkLocationStatus, com.google.android.location.reporting.state.update.ReportingConfig, boolean):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0c97, code lost:
        if (r16 == false) goto L_0x0ca6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x06be A[SYNTHETIC] */
    /* renamed from: a */
    private final void m100261a(Intent intent, ReportingConfig reportingConfig, boolean z) {
        boolean z2;
        bgtt bgtt;
        ReportingConfig reportingConfig2;
        Location location;
        boolean z3;
        ReportingConfig reportingConfig3;
        boolean z4;
        bgua bgua;
        bgtu bgtu;
        boolean z5;
        Location location2;
        ArrayList arrayList;
        Location location3;
        boolean z6;
        Location location4;
        int i;
        ArrayList arrayList2;
        boolean z7;
        int i2;
        int i3;
        bgtu bgtu2;
        bvwq bvwq;
        int i4;
        ArrayList arrayList3;
        bgtu bgtu3;
        boolean z8;
        RttRangingProto rttRangingProto;
        int i5;
        int i6;
        Location location5;
        bvyr bvyr;
        boolean z9;
        boolean z10;
        List list;
        bgvq bgvq;
        boolean z11;
        boolean z12 = z;
        if (!chcs.m148238j()) {
            try {
                LocationResult b = LocationResult.m66866a(intent) ? LocationResult.m66867b(intent) : null;
                boolean a = LocationAvailability.m66851a(intent);
                if (b != null) {
                    bgtu a2 = m100260a();
                    bgxx bgxx = this.f117939b;
                    int i7 = bgxx.f117951w;
                    bgye bgye = bgxx.f117953c;
                    sqv sqv = bgxx.f117957g;
                    long currentTimeMillis = System.currentTimeMillis();
                    ReportingConfig a3 = bgye.mo63354a();
                    bgyf bgyf = a2.f117525a;
                    boolean z13 = bgyf.f118014f;
                    String valueOf = String.valueOf(bgyf);
                    String valueOf2 = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90 + String.valueOf(valueOf2).length());
                    sb.append("LocationReceiver received: deepStillMode: ");
                    sb.append(z13);
                    sb.append("; mState: ");
                    sb.append(valueOf);
                    sb.append("; isImmediate: ");
                    sb.append(z12);
                    sb.append("; Locations: ");
                    sb.append(valueOf2);
                    sb.toString();
                    if (!a3.mo70930d()) {
                        bgtu.m99930a(a3, a2.f117528d);
                        z2 = a;
                        bgtt = null;
                    } else {
                        if (b == null) {
                            z2 = a;
                        } else if (!b.f79358b.isEmpty()) {
                            List list2 = b.f79358b;
                            ArrayList arrayList4 = new ArrayList();
                            Location d = a2.f117525a.mo63386d();
                            int i8 = 0;
                            while (i8 < list2.size()) {
                                Location location6 = (Location) list2.get(i8);
                                if (!z12) {
                                    int i9 = Build.VERSION.SDK_INT;
                                    if (d != null) {
                                        long a4 = bgtu.m99929a(a2.f117525a);
                                        if (a2.mo63164a(a4)) {
                                            list = list2;
                                        } else if (!bgtu.m99931a(a4, d.getElapsedRealtimeNanos(), location6.getElapsedRealtimeNanos())) {
                                            list = list2;
                                        } else {
                                            String valueOf3 = String.valueOf(d);
                                            String valueOf4 = String.valueOf(location6);
                                            list = list2;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
                                            sb2.append("Received locations too frequently: ");
                                            sb2.append(valueOf3);
                                            sb2.append(", ");
                                            sb2.append(valueOf4);
                                            bgur.m100020b("GCoreUlr", sb2.toString());
                                            z10 = a;
                                            i8++;
                                            z12 = z;
                                            list2 = list;
                                            a = z10;
                                        }
                                    } else {
                                        list = list2;
                                    }
                                } else {
                                    list = list2;
                                }
                                if (!aeim.m51907k(location6) || !chcs.f188354a.mo6606a().mo85034W()) {
                                    bxvd da = bgvu.f117746d.mo74144da();
                                    int a5 = bgzj.m100451a(location6.getLongitude());
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bgvu bgvu = (bgvu) da.f164949b;
                                    bgvu.f117748a |= 2;
                                    bgvu.f117750c = a5;
                                    int a6 = bgzj.m100451a(location6.getLatitude());
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bgvu bgvu2 = (bgvu) da.f164949b;
                                    bgvu2.f117748a |= 1;
                                    bgvu2.f117749b = a6;
                                    bgvu bgvu3 = (bgvu) da.mo74062i();
                                    int j = aeim.m51906j(location6);
                                    bxvd da2 = bgvr.f117713u.mo74144da();
                                    if (j == 1) {
                                        bgvq = bgvq.GPS;
                                    } else if (j == 2) {
                                        bgvq = bgvq.CELL;
                                    } else if (j != 3) {
                                        bgvq = bgvq.UNKNOWN;
                                    } else {
                                        bgvq = bgvq.WIFI;
                                    }
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bgvr bgvr = (bgvr) da2.f164949b;
                                    bgvr.f117717c = bgvq.f117712f;
                                    bgvr.f117715a |= 2;
                                    long time = location6.getTime();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bgvr bgvr2 = (bgvr) da2.f164949b;
                                    z10 = a;
                                    int i10 = bgvr2.f117715a | 4;
                                    bgvr2.f117715a = i10;
                                    bgvr2.f117718d = time;
                                    bgvu3.getClass();
                                    bgvr2.f117716b = bgvu3;
                                    bgvr2.f117715a = i10 | 1;
                                    if (location6.hasSpeed()) {
                                        float speed = location6.getSpeed();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bgvr bgvr3 = (bgvr) da2.f164949b;
                                        bgvr3.f117715a |= 8;
                                        bgvr3.f117719e = speed;
                                    }
                                    if (location6.hasBearing()) {
                                        float bearing = location6.getBearing();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bgvr bgvr4 = (bgvr) da2.f164949b;
                                        bgvr4.f117715a |= 16;
                                        bgvr4.f117720f = bearing;
                                    }
                                    if (location6.hasAltitude()) {
                                        double altitude = location6.getAltitude();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bgvr bgvr5 = (bgvr) da2.f164949b;
                                        bgvr5.f117715a |= 32;
                                        bgvr5.f117721g = altitude;
                                    }
                                    if (location6.hasAccuracy()) {
                                        float accuracy = location6.getAccuracy();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bgvr bgvr6 = (bgvr) da2.f164949b;
                                        bgvr6.f117715a |= 64;
                                        bgvr6.f117722h = accuracy;
                                    }
                                    if (aeim.m51904h(location6)) {
                                        float i11 = aeim.m51905i(location6);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bgvr bgvr7 = (bgvr) da2.f164949b;
                                        bgvr7.f117715a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                        bgvr7.f117734t = i11;
                                    }
                                    bgvr bgvr8 = (bgvr) da2.mo74062i();
                                    bxvd bxvd = (bxvd) bgvr8.mo74142c(5);
                                    bxvd.mo73625a((GeneratedMessageLite) bgvr8);
                                    a2.mo63163a(a3, bxvd, location6);
                                    if (!chcj.f188326a.mo6606a().mo84992f()) {
                                        if (aeim.m51897c(location6)) {
                                            String b2 = aeim.m51893b(location6);
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            bgvr bgvr9 = (bgvr) bxvd.f164949b;
                                            b2.getClass();
                                            bgvr9.f117715a |= 2048;
                                            bgvr9.f117726l = b2;
                                        }
                                        if (aeim.m51898d(location6)) {
                                            int intValue = aeim.m51900e(location6).intValue();
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            bgvr bgvr10 = (bgvr) bxvd.f164949b;
                                            bgvr10.f117715a |= 4096;
                                            bgvr10.f117727m = intValue;
                                        }
                                    }
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bgvr bgvr11 = (bgvr) bxvd.f164949b;
                                    bgvr11.f117715a |= 128;
                                    bgvr11.f117723i = 2023;
                                    if (!chcj.f188326a.mo6606a().mo84987a()) {
                                        float a7 = bgzl.m100452a(location6, d);
                                        if (a7 > 0.0f) {
                                            float distanceTo = d.distanceTo(location6);
                                            if (distanceTo > a7) {
                                                z11 = ((double) distanceTo) <= chcs.m148251w();
                                                if (bxvd.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd.f164950c = false;
                                                }
                                                bgvr bgvr12 = (bgvr) bxvd.f164949b;
                                                bgvr12.f117715a |= 1024;
                                                bgvr12.f117725k = z11;
                                            }
                                        }
                                        z11 = true;
                                        if (bxvd.f164950c) {
                                        }
                                        bgvr bgvr122 = (bgvr) bxvd.f164949b;
                                        bgvr122.f117715a |= 1024;
                                        bgvr122.f117725k = z11;
                                    }
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bgvr bgvr13 = (bgvr) bxvd.f164949b;
                                    bgvr13.f117715a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                    bgvr13.f117732r = currentTimeMillis;
                                    arrayList4.add((bgvr) bxvd.mo74062i());
                                    a2.f117525a.mo63385c();
                                    d = location6;
                                    i8++;
                                    z12 = z;
                                    list2 = list;
                                    a = z10;
                                } else {
                                    String valueOf5 = String.valueOf(location6);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 20);
                                    sb3.append("Filtering location: ");
                                    sb3.append(valueOf5);
                                    bgur.m100011a("GCoreUlr", sb3.toString());
                                    z10 = a;
                                    i8++;
                                    z12 = z;
                                    list2 = list;
                                    a = z10;
                                }
                            }
                            z2 = a;
                            if (arrayList4.isEmpty()) {
                                bgur.m100011a("GCoreUlr", "No valid location reports to store");
                                bgtt = null;
                            } else {
                                bgvr bgvr14 = (bgvr) arrayList4.remove(arrayList4.size() - 1);
                                bxvd bxvd2 = (bxvd) bgvr14.mo74142c(5);
                                bxvd2.mo73625a((GeneratedMessageLite) bgvr14);
                                bgvj a8 = bgzf.m100440a(a2.f117527c.f118156b);
                                if (chcj.f188326a.mo6606a().mo84994h()) {
                                    if (!(a8 == null || (a8.f117662a & 1) == 0)) {
                                        int a9 = bgvi.m100126a(a8.f117663b);
                                        if (a9 == 0) {
                                            z9 = false;
                                        } else if (a9 != 1) {
                                            z9 = true;
                                        }
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bgvr bgvr15 = (bgvr) bxvd2.f164949b;
                                        bgvr bgvr16 = bgvr.f117713u;
                                        bgvr15.f117715a |= 512;
                                        bgvr15.f117724j = z9;
                                    }
                                    z9 = false;
                                    if (bxvd2.f164950c) {
                                    }
                                    bgvr bgvr152 = (bgvr) bxvd2.f164949b;
                                    bgvr bgvr162 = bgvr.f117713u;
                                    bgvr152.f117715a |= 512;
                                    bgvr152.f117724j = z9;
                                }
                                if (!chcj.f188326a.mo6606a().mo84988b()) {
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    bgvr bgvr17 = (bgvr) bxvd2.f164949b;
                                    bgvr bgvr18 = bgvr.f117713u;
                                    a8.getClass();
                                    bgvr17.f117729o = a8;
                                    bgvr17.f117715a |= 8192;
                                }
                                arrayList4.add((bgvr) bxvd2.mo74062i());
                                a2.f117525a.f118015g = a8;
                                Location a10 = b.mo43561a();
                                bguh bguh = a2.f117526b;
                                if (!chcp.m148195d()) {
                                    reportingConfig3 = a3;
                                } else {
                                    bgue bgue = bguh.f117562b;
                                    if (bgue != null) {
                                        List c = bgye.mo63354a().mo70929c();
                                        synchronized (bgue.f117553c) {
                                            if (bgue.f117554d != null) {
                                                bgud bgud = new bgud();
                                                try {
                                                    Iterator it = arrayList4.iterator();
                                                    while (it.hasNext()) {
                                                        bgvr bgvr19 = (bgvr) it.next();
                                                        long j2 = bgvr19.f117718d;
                                                        Iterator it2 = c.iterator();
                                                        while (it2.hasNext()) {
                                                            Account account = ((AccountConfig) it2.next()).f150890a;
                                                            int g = bgye.mo63370g(account);
                                                            List list3 = c;
                                                            int f = bgye.mo63369f(account);
                                                            Iterator it3 = it;
                                                            String str = account.name;
                                                            Iterator it4 = it2;
                                                            ReportingConfig reportingConfig4 = a3;
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 90);
                                                            sb4.append("Save location on account ");
                                                            sb4.append(str);
                                                            sb4.append(" with reboot number: ");
                                                            sb4.append(f);
                                                            sb4.append(" and sequence number: ");
                                                            sb4.append(g);
                                                            sb4.toString();
                                                            bxvd da3 = bgvl.f117677g.mo74144da();
                                                            bxvd bxvd3 = (bxvd) bgvr19.mo74142c(5);
                                                            bxvd3.mo73625a((GeneratedMessageLite) bgvr19);
                                                            if (bxvd3.f164950c) {
                                                                bxvd3.mo74035c();
                                                                bxvd3.f164950c = false;
                                                            }
                                                            bgvr bgvr20 = (bgvr) bxvd3.f164949b;
                                                            bgvr bgvr21 = bgvr.f117713u;
                                                            bgvr bgvr22 = bgvr19;
                                                            int i12 = bgvr20.f117715a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                            bgvr20.f117715a = i12;
                                                            bgvr20.f117730p = f;
                                                            bgvr20.f117715a = i12 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                                            bgvr20.f117731q = g;
                                                            bgvr bgvr23 = (bgvr) bxvd3.mo74062i();
                                                            if (da3.f164950c) {
                                                                da3.mo74035c();
                                                                da3.f164950c = false;
                                                            }
                                                            bgvl bgvl = (bgvl) da3.f164949b;
                                                            bgvr23.getClass();
                                                            bgvl.f117680b = bgvr23;
                                                            bgvl.f117679a |= 1;
                                                            bgvl bgvl2 = (bgvl) da3.mo74062i();
                                                            byte[] a11 = bgue.mo63184a(bgvl2, "Locations");
                                                            if (a11 != null) {
                                                                bgud.mo63176a(bgul.m99989a(account, j2, bgvl2), a11);
                                                                c = list3;
                                                                it = it3;
                                                                a3 = reportingConfig4;
                                                                it2 = it4;
                                                                bgvr19 = bgvr22;
                                                            } else {
                                                                c = list3;
                                                                it = it3;
                                                                a3 = reportingConfig4;
                                                                it2 = it4;
                                                                bgvr19 = bgvr22;
                                                            }
                                                        }
                                                    }
                                                    reportingConfig3 = a3;
                                                    boolean a12 = bgue.mo63182a(bgud, "Locations");
                                                    z4 = a12;
                                                } finally {
                                                    bgud.mo63175a();
                                                }
                                            } else {
                                                reportingConfig3 = a3;
                                                z4 = false;
                                            }
                                        }
                                        if (!z4) {
                                            int size = arrayList4.size();
                                            StringBuilder sb5 = new StringBuilder(43);
                                            sb5.append("Successfully inserted ");
                                            sb5.append(size);
                                            sb5.append(" locations");
                                            bgur.m100011a("GCoreUlr", sb5.toString());
                                            a2.f117525a.mo63375a(a10, SystemClock.elapsedRealtime());
                                        } else {
                                            bgur.m100020b("GCoreUlr", "Location insertion failed for all accounts");
                                        }
                                        bgua = a2.f117528d.f117895g;
                                        synchronized (bgua.f117541c) {
                                            if (!bgua.f117539a.isEmpty()) {
                                                ArrayList arrayList5 = new ArrayList(bgua.f117539a);
                                                bgua.f117539a.clear();
                                                long b3 = bgzo.m100470b();
                                                int size2 = arrayList4.size();
                                                int i13 = 0;
                                                while (i13 < size2) {
                                                    Location location7 = a10;
                                                    ArrayList arrayList6 = arrayList5;
                                                    boolean z14 = z4;
                                                    bgtu bgtu4 = a2;
                                                    bgvr bgvr24 = (bgvr) arrayList4.get(i13);
                                                    if (bgvr24.f117728n.size() != 0) {
                                                        Iterator it5 = arrayList6.iterator();
                                                        while (it5.hasNext()) {
                                                            WifiScan wifiScan = (WifiScan) it5.next();
                                                            if (wifiScan.f79400c + b3 == bgvr24.f117718d && wifiScan.mo43592a() <= bgvr24.f117728n.size()) {
                                                                it5.remove();
                                                            }
                                                        }
                                                    }
                                                    i13++;
                                                    a10 = location7;
                                                    z4 = z14;
                                                    a2 = bgtu4;
                                                    arrayList5 = arrayList6;
                                                }
                                                int bg = (int) chcs.f188354a.mo6606a().mo85098bg();
                                                arrayList = new ArrayList();
                                                int size3 = arrayList5.size();
                                                int i14 = 0;
                                                while (i14 < size3) {
                                                    WifiScan wifiScan2 = (WifiScan) arrayList5.get(i14);
                                                    ArrayList arrayList7 = new ArrayList();
                                                    ArrayList arrayList8 = new ArrayList();
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i15 < wifiScan2.mo43592a()) {
                                                            if (i15 >= bg) {
                                                                location4 = a10;
                                                                i = bg;
                                                                arrayList2 = arrayList5;
                                                                z7 = z4;
                                                                i2 = size3;
                                                                i3 = i14;
                                                                bgtu2 = a2;
                                                                break;
                                                            }
                                                            if (wifiScan2.mo43596d(i15) != 0) {
                                                                RttRangingProto rttRangingProto2 = new RttRangingProto(Integer.valueOf(wifiScan2.mo43596d(i15)), Integer.valueOf(wifiScan2.mo43601h(i15)), Integer.valueOf(wifiScan2.mo43600g(i15)), Integer.valueOf(wifiScan2.mo43599f(i15)), Integer.valueOf(wifiScan2.mo43597e(i15)));
                                                                bxvd da4 = bvyr.f158210g.mo74144da();
                                                                location5 = a10;
                                                                int d2 = wifiScan2.mo43596d(i15);
                                                                i6 = bg;
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                bvyr bvyr2 = (bvyr) da4.f164949b;
                                                                i5 = size3;
                                                                bvyr2.f158212a |= 1;
                                                                bvyr2.f158213b = d2;
                                                                int h = wifiScan2.mo43601h(i15);
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                bvyr bvyr3 = (bvyr) da4.f164949b;
                                                                bvyr3.f158212a |= 16;
                                                                bvyr3.f158217f = h;
                                                                int g2 = wifiScan2.mo43600g(i15);
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                bvyr bvyr4 = (bvyr) da4.f164949b;
                                                                bvyr4.f158212a |= 8;
                                                                bvyr4.f158216e = g2;
                                                                int f2 = wifiScan2.mo43599f(i15);
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                bvyr bvyr5 = (bvyr) da4.f164949b;
                                                                bvyr5.f158212a |= 4;
                                                                bvyr5.f158215d = f2;
                                                                int e = wifiScan2.mo43597e(i15);
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                bvyr bvyr6 = (bvyr) da4.f164949b;
                                                                bvyr6.f158212a |= 2;
                                                                bvyr6.f158214c = e;
                                                                bvyr bvyr7 = (bvyr) da4.mo74062i();
                                                                long a13 = wifiScan2.mo43593a(i15);
                                                                int d3 = wifiScan2.mo43596d(i15);
                                                                int e2 = wifiScan2.mo43597e(i15);
                                                                int f3 = wifiScan2.mo43599f(i15);
                                                                z8 = z4;
                                                                int g3 = wifiScan2.mo43600g(i15);
                                                                bgtu3 = a2;
                                                                int h2 = wifiScan2.mo43601h(i15);
                                                                arrayList3 = arrayList5;
                                                                i4 = i14;
                                                                StringBuilder sb6 = new StringBuilder((int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE);
                                                                sb6.append("Get passive RTT Ranging result from AP:");
                                                                sb6.append(a13);
                                                                sb6.append(" RttAttemptCount=");
                                                                sb6.append(d3);
                                                                sb6.append(" RttSuccessCount=");
                                                                sb6.append(e2);
                                                                sb6.append(" RttEstimatedDistanceMm=");
                                                                sb6.append(f3);
                                                                sb6.append(" RttDistanceStddevMm=");
                                                                sb6.append(g3);
                                                                sb6.append(" RttChannelBandwidth=");
                                                                sb6.append(h2);
                                                                sb6.toString();
                                                                bvyr = bvyr7;
                                                                rttRangingProto = rttRangingProto2;
                                                            } else {
                                                                location5 = a10;
                                                                i6 = bg;
                                                                arrayList3 = arrayList5;
                                                                z8 = z4;
                                                                i5 = size3;
                                                                i4 = i14;
                                                                bgtu3 = a2;
                                                                bvyr = null;
                                                                rttRangingProto = null;
                                                            }
                                                            arrayList8.add(new WifiStrengthProto(Integer.valueOf(wifiScan2.mo43595c(i15)), null, Long.valueOf(wifiScan2.mo43593a(i15)), rttRangingProto, null, Integer.valueOf(wifiScan2.mo43594b(i15)), null));
                                                            bxvd da5 = bvyq.f158199j.mo74144da();
                                                            int c2 = wifiScan2.mo43595c(i15);
                                                            if (da5.f164950c) {
                                                                da5.mo74035c();
                                                                da5.f164950c = false;
                                                            }
                                                            bvyq bvyq = (bvyq) da5.f164949b;
                                                            bvyq.f158201a |= 16;
                                                            bvyq.f158206f = c2;
                                                            long a14 = wifiScan2.mo43593a(i15);
                                                            if (da5.f164950c) {
                                                                da5.mo74035c();
                                                                da5.f164950c = false;
                                                            }
                                                            bvyq bvyq2 = (bvyq) da5.f164949b;
                                                            bvyq2.f158201a |= 1;
                                                            bvyq2.f158202b = a14;
                                                            byte b4 = wifiScan2.mo43594b(i15);
                                                            if (da5.f164950c) {
                                                                da5.mo74035c();
                                                                da5.f164950c = false;
                                                            }
                                                            bvyq bvyq3 = (bvyq) da5.f164949b;
                                                            int i16 = bvyq3.f158201a | 2;
                                                            bvyq3.f158201a = i16;
                                                            bvyq3.f158203c = b4;
                                                            if (bvyr != null) {
                                                                bvyr.getClass();
                                                                bvyq3.f158207g = bvyr;
                                                                bvyq3.f158201a = i16 | 32;
                                                            }
                                                            arrayList7.add((bvyq) da5.mo74062i());
                                                            i15++;
                                                            a10 = location5;
                                                            bg = i6;
                                                            size3 = i5;
                                                            z4 = z8;
                                                            a2 = bgtu3;
                                                            arrayList5 = arrayList3;
                                                            i14 = i4;
                                                        } else {
                                                            location4 = a10;
                                                            i = bg;
                                                            arrayList2 = arrayList5;
                                                            z7 = z4;
                                                            i2 = size3;
                                                            i3 = i14;
                                                            bgtu2 = a2;
                                                            break;
                                                        }
                                                    }
                                                    long j3 = wifiScan2.f79400c + b3;
                                                    ApiMetadata apiMetadata = new ApiMetadata(null, null, null, null, null, null, null, null, Long.valueOf(j3), null, arrayList8);
                                                    if (!chcp.m148193b() || !chcp.m148195d()) {
                                                        bvwq = null;
                                                    } else {
                                                        bxvd da6 = bvwq.f157983r.mo74144da();
                                                        if (da6.f164950c) {
                                                            da6.mo74035c();
                                                            da6.f164950c = false;
                                                        }
                                                        bvwq bvwq2 = (bvwq) da6.f164949b;
                                                        bvwq2.mo73394a();
                                                        bxsy.m123078a(arrayList7, bvwq2.f157993i);
                                                        if (da6.f164950c) {
                                                            da6.mo74035c();
                                                            da6.f164950c = false;
                                                        }
                                                        bvwq bvwq3 = (bvwq) da6.f164949b;
                                                        bvwq3.f157985a |= 1;
                                                        bvwq3.f157986b = j3;
                                                        bvwq = (bvwq) da6.mo74062i();
                                                    }
                                                    arrayList.add(new Pair(apiMetadata, bvwq));
                                                    i14 = i3 + 1;
                                                    a10 = location4;
                                                    bg = i;
                                                    size3 = i2;
                                                    z4 = z7;
                                                    a2 = bgtu2;
                                                    arrayList5 = arrayList2;
                                                }
                                                location2 = a10;
                                                z5 = z4;
                                                bgtu = a2;
                                            } else {
                                                location2 = a10;
                                                z5 = z4;
                                                bgtu = a2;
                                                arrayList = new ArrayList();
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            bguh bguh2 = bgtu.f117526b;
                                            List b5 = reportingConfig3.mo70928b();
                                            if (!chcp.m148195d() || bguh2.f117562b == null) {
                                                ArrayList<ApiMetadata> arrayList9 = new ArrayList();
                                                int size4 = arrayList.size();
                                                for (int i17 = 0; i17 < size4; i17++) {
                                                    arrayList9.add((ApiMetadata) ((Pair) arrayList.get(i17)).first);
                                                }
                                                bgug bgug = bguh2.f117561a;
                                                if (!arrayList9.isEmpty()) {
                                                    synchronized (bgug.f117559c) {
                                                        if (bgug.f117560d != null) {
                                                            bguf bguf = new bguf();
                                                            try {
                                                                for (ApiMetadata apiMetadata2 : arrayList9) {
                                                                    bxvd da7 = bgvm.f117686g.mo74144da();
                                                                    String sio = apiMetadata2.toString();
                                                                    if (da7.f164950c) {
                                                                        da7.mo74035c();
                                                                        da7.f164950c = false;
                                                                    }
                                                                    bgvm bgvm = (bgvm) da7.f164949b;
                                                                    sio.getClass();
                                                                    bgvm.f117688a |= 4;
                                                                    bgvm.f117691d = sio;
                                                                    bgug.mo63192a(bguf, b5, apiMetadata2.mo71544b().longValue(), (bgvm) da7.mo74062i(), "wifi scans");
                                                                }
                                                                z6 = bgug.mo63195a(bguf, "wifi scans");
                                                            } finally {
                                                                bguf.mo63188a();
                                                            }
                                                        }
                                                    }
                                                    int size5 = arrayList.size();
                                                    StringBuilder sb7 = new StringBuilder(57);
                                                    sb7.append("Failed to insert ");
                                                    sb7.append(size5);
                                                    sb7.append(" wifi scans for all accounts.");
                                                    sb7.toString();
                                                }
                                                int size6 = arrayList.size();
                                                StringBuilder sb8 = new StringBuilder(45);
                                                sb8.append("Successfully inserted ");
                                                sb8.append(size6);
                                                sb8.append(" wifi scans.");
                                                sb8.toString();
                                            } else {
                                                ArrayList<bvwq> arrayList10 = new ArrayList();
                                                int size7 = arrayList.size();
                                                for (int i18 = 0; i18 < size7; i18++) {
                                                    Pair pair = (Pair) arrayList.get(i18);
                                                    if (pair.second != null) {
                                                        arrayList10.add((bvwq) pair.second);
                                                    }
                                                }
                                                if (!chcp.m148193b() || arrayList10.isEmpty()) {
                                                    arrayList10.clear();
                                                    int size8 = arrayList.size();
                                                    for (int i19 = 0; i19 < size8; i19++) {
                                                        bvwq a15 = bgzi.m100447a((ApiMetadata) ((Pair) arrayList.get(i19)).first);
                                                        if (a15 != null) {
                                                            arrayList10.add(a15);
                                                        }
                                                    }
                                                } else {
                                                    bguv.m100042a("UlrApiMetadatasGrpcTriggered");
                                                }
                                                if (!arrayList10.isEmpty()) {
                                                    bgue bgue2 = bguh2.f117562b;
                                                    if (!arrayList10.isEmpty()) {
                                                        synchronized (bgue2.f117553c) {
                                                            if (bgue2.f117554d != null) {
                                                                bgud bgud2 = new bgud();
                                                                try {
                                                                    for (bvwq bvwq4 : arrayList10) {
                                                                        bxvd da8 = bgvl.f117677g.mo74144da();
                                                                        if (da8.f164950c) {
                                                                            da8.mo74035c();
                                                                            da8.f164950c = false;
                                                                        }
                                                                        bgvl bgvl3 = (bgvl) da8.f164949b;
                                                                        bvwq4.getClass();
                                                                        bgvl3.f117682d = bvwq4;
                                                                        bgvl3.f117679a |= 4;
                                                                        bgue2.mo63179a(bgud2, b5, bvwq4.f157986b, (bgvl) da8.mo74062i(), "wifi scans");
                                                                    }
                                                                    z6 = bgue2.mo63182a(bgud2, "wifi scans");
                                                                } finally {
                                                                    bgud2.mo63175a();
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    StringBuilder sb9 = new StringBuilder(47);
                                                    sb9.append("DatastoreSelector Grpc ApiMetadata put 2: ");
                                                    sb9.append(z6);
                                                    sb9.toString();
                                                }
                                                z6 = false;
                                                StringBuilder sb92 = new StringBuilder(47);
                                                sb92.append("DatastoreSelector Grpc ApiMetadata put 2: ");
                                                sb92.append(z6);
                                                sb92.toString();
                                            }
                                            if (!z6) {
                                                int size52 = arrayList.size();
                                                StringBuilder sb72 = new StringBuilder(57);
                                                sb72.append("Failed to insert ");
                                                sb72.append(size52);
                                                sb72.append(" wifi scans for all accounts.");
                                                sb72.toString();
                                            }
                                            int size62 = arrayList.size();
                                            StringBuilder sb82 = new StringBuilder(45);
                                            sb82.append("Successfully inserted ");
                                            sb82.append(size62);
                                            sb82.append(" wifi scans.");
                                            sb82.toString();
                                        }
                                        if (!z5) {
                                            location3 = null;
                                        } else {
                                            location3 = location2;
                                        }
                                        bgtt = new bgtt(location3);
                                    } else {
                                        reportingConfig3 = a3;
                                    }
                                }
                                bgug bgug2 = bguh.f117561a;
                                List c3 = bgye.mo63354a().mo70929c();
                                synchronized (bgug2.f117559c) {
                                    if (bgug2.f117560d != null) {
                                        bguf bguf2 = new bguf();
                                        try {
                                            Iterator it6 = arrayList4.iterator();
                                            while (it6.hasNext()) {
                                                bgvr bgvr25 = (bgvr) it6.next();
                                                long j4 = bgvr25.f117718d;
                                                Iterator it7 = c3.iterator();
                                                while (it7.hasNext()) {
                                                    Account account2 = ((AccountConfig) it7.next()).f150890a;
                                                    int g4 = bgye.mo63370g(account2);
                                                    int f4 = bgye.mo63369f(account2);
                                                    List list4 = c3;
                                                    String str2 = account2.name;
                                                    Iterator it8 = it6;
                                                    Iterator it9 = it7;
                                                    StringBuilder sb10 = new StringBuilder(String.valueOf(str2).length() + 90);
                                                    sb10.append("Save location on account ");
                                                    sb10.append(str2);
                                                    sb10.append(" with reboot number: ");
                                                    sb10.append(f4);
                                                    sb10.append(" and sequence number: ");
                                                    sb10.append(g4);
                                                    sb10.toString();
                                                    bxvd da9 = bgvm.f117686g.mo74144da();
                                                    bxvd bxvd4 = (bxvd) bgvr25.mo74142c(5);
                                                    bxvd4.mo73625a((GeneratedMessageLite) bgvr25);
                                                    if (bxvd4.f164950c) {
                                                        bxvd4.mo74035c();
                                                        bxvd4.f164950c = false;
                                                    }
                                                    bgvr bgvr26 = (bgvr) bxvd4.f164949b;
                                                    bgvr bgvr27 = bgvr.f117713u;
                                                    bgvr bgvr28 = bgvr25;
                                                    int i20 = bgvr26.f117715a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                    bgvr26.f117715a = i20;
                                                    bgvr26.f117730p = f4;
                                                    bgvr26.f117715a = i20 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                                    bgvr26.f117731q = g4;
                                                    bgvr bgvr29 = (bgvr) bxvd4.mo74062i();
                                                    if (da9.f164950c) {
                                                        da9.mo74035c();
                                                        da9.f164950c = false;
                                                    }
                                                    bgvm bgvm2 = (bgvm) da9.f164949b;
                                                    bgvr29.getClass();
                                                    bgvm2.f117689b = bgvr29;
                                                    bgvm2.f117688a |= 1;
                                                    bgvm bgvm3 = (bgvm) da9.mo74062i();
                                                    byte[] a16 = bgug2.mo63197a(bgvm3, "Locations");
                                                    if (a16 != null) {
                                                        bguf2.mo63189a(bgul.m99990a(account2, j4, bgvm3), a16);
                                                        c3 = list4;
                                                        it7 = it9;
                                                        it6 = it8;
                                                        bgvr25 = bgvr28;
                                                    } else {
                                                        c3 = list4;
                                                        it7 = it9;
                                                        it6 = it8;
                                                        bgvr25 = bgvr28;
                                                    }
                                                }
                                            }
                                            boolean a17 = bgug2.mo63195a(bguf2, "Locations");
                                            z4 = a17;
                                        } finally {
                                            bguf2.mo63188a();
                                        }
                                    } else {
                                        z4 = false;
                                    }
                                }
                                if (!z4) {
                                }
                                bgua = a2.f117528d.f117895g;
                                synchronized (bgua.f117541c) {
                                }
                            }
                        } else {
                            z2 = a;
                        }
                        bgur.m100025c("GCoreUlr", "Received null or empty location result, so returning early.");
                        bgtt = null;
                    }
                    Boolean valueOf6 = Boolean.valueOf(!z);
                    String valueOf7 = String.valueOf(valueOf6);
                    StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf7).length() + 38);
                    sb11.append("UlrClearcutEvents.logLocationUpdated(");
                    sb11.append(valueOf7);
                    sb11.append(")");
                    sb11.toString();
                    if (bgux.m100096a()) {
                        bgux.f117614a.mo63245a(valueOf6);
                    }
                } else {
                    z2 = a;
                    if (!z2) {
                        bgur.m100025c("GCoreUlr", "Received null location result");
                    }
                    bgtt = null;
                }
                if (z2) {
                    LocationAvailability b6 = LocationAvailability.m66852b(intent);
                    if (b6 != null) {
                        bgtu a18 = m100260a();
                        NetworkLocationStatus[] networkLocationStatusArr = b6.f79348e;
                        if (networkLocationStatusArr == null) {
                            reportingConfig2 = reportingConfig;
                        } else {
                            int length = networkLocationStatusArr.length;
                            if (length > 0) {
                                z3 = false;
                                for (NetworkLocationStatus networkLocationStatus : networkLocationStatusArr) {
                                    if (a18.mo63165a(networkLocationStatus, reportingConfig, true)) {
                                        z3 = true;
                                    }
                                }
                                reportingConfig2 = reportingConfig;
                                String valueOf8 = String.valueOf(b6);
                                StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf8).length() + 25);
                                sb12.append("Received locationStatus: ");
                                sb12.append(valueOf8);
                                sb12.toString();
                            } else {
                                reportingConfig2 = reportingConfig;
                            }
                        }
                        NetworkLocationStatus a19 = NetworkLocationStatus.m66872a(b6.f79345b, b6.f79344a, System.currentTimeMillis(), b6.f79346c);
                        String valueOf9 = String.valueOf(a19);
                        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf9).length() + 15);
                        sb13.append("legacy status: ");
                        sb13.append(valueOf9);
                        sb13.toString();
                        z3 = a18.mo63165a(a19, reportingConfig2, false);
                        String valueOf82 = String.valueOf(b6);
                        StringBuilder sb122 = new StringBuilder(String.valueOf(valueOf82).length() + 25);
                        sb122.append("Received locationStatus: ");
                        sb122.append(valueOf82);
                        sb122.toString();
                    } else {
                        reportingConfig2 = reportingConfig;
                        bgur.m100025c("GCoreUlr", "locationStatus not set.");
                    }
                } else {
                    reportingConfig2 = reportingConfig;
                }
                if (bgtt == null) {
                    return;
                }
                if (bgtt != null) {
                    location = bgtt.f117524a;
                } else {
                    location = null;
                }
                if (!chcs.m148234f() || z) {
                    bgxx bgxx2 = this.f117939b;
                    int i21 = bgxx.f117951w;
                    bgxx2.f117958h.mo63292a(reportingConfig2, location);
                }
            } catch (RuntimeException e3) {
                bgur.m100021b("GCoreUlr", "getting location result", e3);
            }
        } else {
            bgxx bgxx3 = this.f117939b;
            int i22 = bgxx.f117951w;
            bgxx3.mo63336c();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07f3 A[Catch:{ IllegalArgumentException -> 0x08a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0848 A[Catch:{ IllegalArgumentException -> 0x08a6 }, RETURN] */
    /* renamed from: a */
    public final void mo63328a(Intent intent) {
        char c;
        bgue bgue;
        bvwq bvwq;
        int i;
        char c2;
        bvxr bvxr;
        boolean z;
        ApiPlaceInferenceResult apiPlaceInferenceResult;
        bvwq bvwq2;
        bvwt bvwt;
        boolean z2;
        String str;
        ArrayList arrayList;
        long j;
        bgue bgue2;
        char c3;
        Intent intent2 = intent;
        int i2 = bgxx.f117951w;
        int i3 = Build.VERSION.SDK_INT;
        String action = intent.getAction();
        if (action != null) {
            String valueOf = String.valueOf(intent);
            String a = bgxx.m100274a(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(a).length());
            sb.append("DispatchingService dispatching ");
            sb.append(valueOf);
            sb.append(", source: ");
            sb.append(a);
            sb.toString();
            ReportingConfig a2 = this.f117939b.f117953c.mo63354a();
            int i4 = 0;
            if (!a2.mo70930d()) {
                int hashCode = action.hashCode();
                if (hashCode != -1603119181) {
                    if (hashCode != -569803536) {
                        if (hashCode == 1115780759 && action.equals("com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE")) {
                            c3 = 1;
                            if (!(c3 == 0 || c3 == 1 || c3 == 2)) {
                                String valueOf2 = String.valueOf(intent);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                                sb2.append("DispatchingService ignoring ");
                                sb2.append(valueOf2);
                                sb2.append(" because ULR inactive");
                                bgur.m100011a("GCoreUlr", sb2.toString());
                                return;
                            }
                        }
                    } else if (action.equals("com.google.android.location.reporting.GCM_ID_CHANGED")) {
                        c3 = 2;
                        String valueOf22 = String.valueOf(intent);
                        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 49);
                        sb22.append("DispatchingService ignoring ");
                        sb22.append(valueOf22);
                        sb22.append(" because ULR inactive");
                        bgur.m100011a("GCoreUlr", sb22.toString());
                        return;
                    }
                } else if (action.equals("com.google.android.location.reporting.ACTION_UPDATE_WORLD")) {
                    c3 = 0;
                    String valueOf222 = String.valueOf(intent);
                    StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 49);
                    sb222.append("DispatchingService ignoring ");
                    sb222.append(valueOf222);
                    sb222.append(" because ULR inactive");
                    bgur.m100011a("GCoreUlr", sb222.toString());
                    return;
                }
                c3 = 65535;
                String valueOf2222 = String.valueOf(intent);
                StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf2222).length() + 49);
                sb2222.append("DispatchingService ignoring ");
                sb2222.append(valueOf2222);
                sb2222.append(" because ULR inactive");
                bgur.m100011a("GCoreUlr", sb2222.toString());
                return;
            }
            int i5 = 17;
            switch (action.hashCode()) {
                case -1995383548:
                    if (action.equals("com.google.android.gms.location.reporting.DELETE_OPERATION")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1918487026:
                    if (action.equals("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1875733435:
                    if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1850781142:
                    if (action.equals("com.google.android.location.reporting.ACTION_SEND_DATA")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1704588479:
                    if (action.equals("com.google.android.location.reporting.WIFI_TRIGGERED_UPLOAD")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case -1603119181:
                    if (action.equals("com.google.android.location.reporting.ACTION_UPDATE_WORLD")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1492165444:
                    if (action.equals("com.google.android.location.reporting.CHANGE_ON_BLE_ALWAYS_SCAN_MODE")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1184851779:
                    if (action.equals("android.location.PROVIDERS_CHANGED")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1076576821:
                    if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1050121137:
                    if (action.equals("com.google.android.location.reporting.CHANGE_ON_LOCATION_DISABLE_FOR_GOOGLE_APP")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -931405204:
                    if (action.equals("com.google.android.location.reporting.ACTION_LOCATION")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -569803536:
                    if (action.equals("com.google.android.location.reporting.GCM_ID_CHANGED")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case -511271086:
                    if (action.equals("android.location.MODE_CHANGED")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -321582332:
                    if (action.equals("com.google.android.location.reporting.WIFI_TRIGGERED_FLUSH_AND_UPLOAD")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case -193448506:
                    if (action.equals("com.google.android.location.reporting.ACTION_ACTIVITY")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -66063021:
                    if (action.equals("com.google.android.location.reporting.ACTION_REPORT_PLACE")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 259854786:
                    if (action.equals("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 345482250:
                    if (action.equals("com.google.android.location.reporting.ACTION_PLACE_INFERENCE")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 436897434:
                    if (action.equals("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 733325328:
                    if (action.equals("com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE")) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case 870701415:
                    if (action.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 1066386426:
                    if (action.equals("com.google.android.location.reporting.ACTION_APPLY_UPLOAD_REQUESTS")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115780759:
                    if (action.equals("com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1473645052:
                    if (action.equals("com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    m100261a(intent2, a2, false);
                    return;
                case 1:
                    m100261a(intent2, a2, true);
                    return;
                case 2:
                    if (!chcs.m148238j()) {
                        bgtm b = m100262b();
                        if (!a2.mo70930d()) {
                            bgtu.m99930a(a2, b.f117498c);
                            return;
                        }
                        ActivityRecognitionResult b2 = ActivityRecognitionResult.m66821b(intent);
                        if (b2 == null) {
                            String valueOf3 = String.valueOf(intent);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                            sb3.append(valueOf3);
                            sb3.append(" has no activity");
                            bgur.m100022b("GCoreUlr", new IllegalStateException(sb3.toString()));
                            return;
                        }
                        b.f117496a.f118010b = b2;
                        if (bgux.m100096a()) {
                            bgux.f117614a.mo63236a();
                        }
                        long j2 = b2.f79302c;
                        if (j2 > 0) {
                            ActivityRecognitionResult e = b.f117496a.mo63387e();
                            if (e == null || e.mo43491a().mo43513a() != b2.mo43491a().mo43513a() || j2 - e.f79302c > chcs.f188354a.mo6606a().mo85100c()) {
                                b.f117496a.mo63377a(b2);
                                bguv.m100047a("UlrActivityReceived", a2);
                                bguh bguh = b.f117497b;
                                List b3 = a2.mo70928b();
                                if (chcp.m148195d() && (bgue = bguh.f117562b) != null) {
                                    synchronized (bgue.f117553c) {
                                        if (bgue.f117554d != null) {
                                            bgoq a3 = bgfb.m98741a(b2);
                                            bgud bgud = new bgud();
                                            try {
                                                bxvd da = bgvl.f117677g.mo74144da();
                                                if (a3 != null) {
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    bgvl bgvl = (bgvl) da.f164949b;
                                                    a3.getClass();
                                                    bgvl.f117681c = a3;
                                                    bgvl.f117679a |= 2;
                                                }
                                                bgue.mo63179a(bgud, b3, b2.f79301b, (bgvl) da.mo74062i(), "Activity");
                                                bgue.mo63182a(bgud, "Activity");
                                                return;
                                            } finally {
                                                bgud.mo63175a();
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    bgug bgug = bguh.f117561a;
                                    synchronized (bgug.f117559c) {
                                        if (bgug.f117560d != null) {
                                            bgoq a4 = bgfb.m98741a(b2);
                                            bguf bguf = new bguf();
                                            try {
                                                bxvd da2 = bgvm.f117686g.mo74144da();
                                                if (a4 != null) {
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    bgvm bgvm = (bgvm) da2.f164949b;
                                                    a4.getClass();
                                                    bgvm.f117690c = a4;
                                                    bgvm.f117688a |= 2;
                                                }
                                                bgug.mo63192a(bguf, b3, b2.f79301b, (bgvm) da2.mo74062i(), "Activity");
                                                bgug.mo63195a(bguf, "Activity");
                                                return;
                                            } finally {
                                                bguf.mo63188a();
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            String valueOf4 = String.valueOf(b2);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 32);
                            sb4.append("No realtime in activity result: ");
                            sb4.append(valueOf4);
                            Log.wtf("GCoreUlr", new IllegalArgumentException(sb4.toString()));
                            return;
                        }
                    } else {
                        this.f117939b.mo63336c();
                        return;
                    }
                case 3:
                    this.f117940f.mo63343a(intent2);
                    return;
                case 4:
                    this.f117941g.mo63313a(a2, bgxx.m100275a(bgxx.m100274a(intent)));
                    return;
                case 5:
                    PlaceReport placeReport = (PlaceReport) intent2.getParcelableExtra("placeReport");
                    Account account = (Account) intent2.getParcelableExtra("account");
                    String stringExtra = intent2.getStringExtra("placeReportCaller");
                    if (placeReport == null || account == null || stringExtra == null) {
                        String valueOf5 = String.valueOf(intent);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 46);
                        sb5.append("Received PlaceReport intent missing an extra: ");
                        sb5.append(valueOf5);
                        bgur.m100024c("GCoreUlr", 33, sb5.toString());
                        return;
                    }
                    sqv sqv = this.f117939b.f117957g;
                    ApiMetadata apiMetadata = new ApiMetadata(null, null, null, null, null, null, new ApiPlaceReport(placeReport.f79488c, stringExtra, placeReport.f79487b, placeReport.f79489d), null, Long.valueOf(System.currentTimeMillis()), null, null);
                    if (!chcp.m148193b() || !chcp.m148195d()) {
                        bvwq = null;
                    } else {
                        sqv sqv2 = this.f117939b.f117957g;
                        long currentTimeMillis = System.currentTimeMillis();
                        bxvd da3 = bvww.f158020h.mo74144da();
                        String str2 = placeReport.f79488c;
                        if (str2 != null) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvww bvww = (bvww) da3.f164949b;
                            str2.getClass();
                            bvww.f158022a |= 4;
                            bvww.f158025d = str2;
                        }
                        String str3 = placeReport.f79487b;
                        if (str3 != null) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvww bvww2 = (bvww) da3.f164949b;
                            str3.getClass();
                            bvww2.f158022a |= 1;
                            bvww2.f158023b = str3;
                        }
                        String str4 = placeReport.f79489d;
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case -1436706272:
                                    if (str4.equals("inferredGeofencing")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1194968642:
                                    if (str4.equals("userReported")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -284840886:
                                    if (str4.equals("unknown")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -262743844:
                                    if (str4.equals("inferredReverseGeocoding")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1164924125:
                                    if (str4.equals("inferredSnappedToRoad")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1287171955:
                                    if (str4.equals("inferredRadioSignals")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            i = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? 0 : 37 : 36 : 35 : 34 : 2 : 1;
                        } else {
                            i = 0;
                        }
                        if (i != 0) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvww bvww3 = (bvww) da3.f164949b;
                            bvww3.f158028g = i - 1;
                            bvww3.f158022a |= 32;
                        }
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvww bvww4 = (bvww) da3.f164949b;
                        stringExtra.getClass();
                        bvww4.f158022a |= 2;
                        bvww4.f158024c = stringExtra;
                        bxvd da4 = bvwq.f157983r.mo74144da();
                        bvww bvww5 = (bvww) da3.mo74062i();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bvwq bvwq3 = (bvwq) da4.f164949b;
                        bvww5.getClass();
                        bvwq3.f157988d = bvww5;
                        int i6 = bvwq3.f157985a | 4;
                        bvwq3.f157985a = i6;
                        bvwq3.f157985a = i6 | 1;
                        bvwq3.f157986b = currentTimeMillis;
                        bvwq = (bvwq) da4.mo74062i();
                    }
                    this.f117939b.f117966p.mo63201a(account, new Pair(apiMetadata, bvwq), "PlaceReportHelper");
                    if (!TextUtils.isEmpty(placeReport.f79487b) && chcs.f188354a.mo6606a().mo85013B()) {
                        bgxx bgxx = this.f117939b;
                        bgxx.f117955e.f118013e = true;
                        ReportingConfig a5 = bgxx.f117953c.mo63354a();
                        String a6 = bgxx.m100274a(intent);
                        bgxg bgxg = this.f117941g;
                        String valueOf6 = String.valueOf(a6);
                        bgxg.mo63314a(a5, valueOf6.length() == 0 ? new String("DispatchingService.requestImmediateLocation+") : "DispatchingService.requestImmediateLocation+".concat(valueOf6), true);
                        return;
                    }
                    return;
                case 6:
                    SendDataRequest sendDataRequest = (SendDataRequest) sef.m35067a(intent2, "request", SendDataRequest.CREATOR);
                    Account account2 = (Account) intent2.getParcelableExtra("account");
                    String stringExtra2 = intent2.getStringExtra("caller");
                    if (sendDataRequest == null || account2 == null || stringExtra2 == null) {
                        String valueOf7 = String.valueOf(intent);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 43);
                        sb6.append("Received SendData intent missing an extra: ");
                        sb6.append(valueOf7);
                        bgur.m100024c("GCoreUlr", 53, sb6.toString());
                        return;
                    }
                    try {
                        sdo.checkIfNull(sendDataRequest.f79609b, "no data");
                        sdo.m34969a(sendDataRequest.f79608a, (Object) "no data type");
                        sdo.m34975b(sendDataRequest.f79608a.length() < 128, "data type too long");
                        ApiUserData apiUserData = new ApiUserData(sqd.m35972d(sendDataRequest.f79609b), sendDataRequest.f79608a, Long.valueOf(System.currentTimeMillis()));
                        if (!chcp.m148194c() || !chcp.m148195d()) {
                            bvxr = null;
                        } else {
                            sdo.checkIfNull(sendDataRequest.f79609b, "no data");
                            sdo.m34969a(sendDataRequest.f79608a, (Object) "no data type");
                            if (sendDataRequest.f79608a.length() < 128) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sdo.m34975b(z, "data type too long");
                            ByteString a7 = ByteString.m123261a(sendDataRequest.f79609b);
                            String str5 = sendDataRequest.f79608a;
                            long currentTimeMillis2 = System.currentTimeMillis();
                            bxvd da5 = bvxr.f158087f.mo74144da();
                            if (str5 != null) {
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvxr bvxr2 = (bvxr) da5.f164949b;
                                str5.getClass();
                                bvxr2.f158089a |= 2;
                                bvxr2.f158091c = str5;
                            }
                            if (a7 != null) {
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvxr bvxr3 = (bvxr) da5.f164949b;
                                a7.getClass();
                                bvxr3.f158089a = 8 | bvxr3.f158089a;
                                bvxr3.f158093e = a7;
                            }
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bvxr bvxr4 = (bvxr) da5.f164949b;
                            bvxr4.f158089a |= 1;
                            bvxr4.f158090b = currentTimeMillis2;
                            bvxr = (bvxr) da5.mo74062i();
                        }
                        bguh bguh2 = this.f117939b.f117966p;
                        Pair pair = new Pair(apiUserData, bvxr);
                        ApiUserData apiUserData2 = (ApiUserData) pair.first;
                        bvxr bvxr5 = (bvxr) pair.second;
                        if (chcp.m148195d()) {
                            if (bguh2.f117562b != null) {
                                if (chcp.m148194c()) {
                                    if (bvxr5 != null) {
                                        bguv.m100042a("UlrApiUserDatasGrpcTriggered");
                                        if (bvxr5 == null) {
                                            bgue bgue3 = bguh2.f117562b;
                                            List singletonList = Collections.singletonList(account2);
                                            synchronized (bgue3.f117553c) {
                                                if (bgue3.f117554d != null) {
                                                    bgud bgud2 = new bgud();
                                                    try {
                                                        bxvd da6 = bgvl.f117677g.mo74144da();
                                                        if (da6.f164950c) {
                                                            da6.mo74035c();
                                                            da6.f164950c = false;
                                                        }
                                                        bgvl bgvl2 = (bgvl) da6.f164949b;
                                                        bvxr5.getClass();
                                                        bgvl2.f117684f = bvxr5;
                                                        bgvl2.f117679a |= 16;
                                                        bgue3.mo63179a(bgud2, singletonList, bvxr5.f158090b, (bgvl) da6.mo74062i(), "SendDataHelper");
                                                        bgue3.mo63182a(bgud2, "SendDataHelper");
                                                        return;
                                                    } finally {
                                                        bgud2.mo63175a();
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                bvxr5 = bgzi.m100449a(apiUserData2);
                                if (bvxr5 == null) {
                                }
                            }
                        }
                        bgug bgug2 = bguh2.f117561a;
                        List singletonList2 = Collections.singletonList(account2);
                        synchronized (bgug2.f117559c) {
                            if (bgug2.f117560d != null) {
                                bguf bguf2 = new bguf();
                                try {
                                    bxvd da7 = bgvm.f117686g.mo74144da();
                                    String sio = apiUserData2.toString();
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bgvm bgvm2 = (bgvm) da7.f164949b;
                                    sio.getClass();
                                    bgvm2.f117688a |= 16;
                                    bgvm2.f117693f = sio;
                                    bgug2.mo63192a(bguf2, singletonList2, apiUserData2.mo71600e().longValue(), (bgvm) da7.mo74062i(), "SendDataHelper");
                                    bgug2.mo63195a(bguf2, "SendDataHelper");
                                    return;
                                } finally {
                                    bguf2.mo63188a();
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        String valueOf8 = String.valueOf(sendDataRequest.f79608a);
                        bgur.m100021b("GCoreUlr", valueOf8.length() == 0 ? new String("bad user data: ") : "bad user data: ".concat(valueOf8), e2);
                        return;
                    }
                case 7:
                    this.f117941g.mo63313a(a2, "DispatchingService.applyUploadRequests");
                    bgxx bgxx2 = this.f117939b;
                    bgxx2.f117958h.mo63292a(a2, bgxx2.f117955e.mo63386d());
                    return;
                case 8:
                    if (!chcs.m148234f()) {
                        bgxg bgxg2 = this.f117941g;
                        aesh aesh = bgxg2.f117893e;
                        if (aesh == null) {
                            rjx rjx = bgxg2.f117898j;
                            roz b4 = rpa.m34196b();
                            b4.f43472a = aegp.f63360a;
                            rjx.mo24732b(b4.mo24977a());
                            return;
                        }
                        aesh.mo34503a(this);
                        return;
                    }
                    return;
                case 9:
                    if (!chcs.m148234f()) {
                        bgxx bgxx3 = this.f117939b;
                        bgwp bgwp = bgxx3.f117958h;
                        Location d = bgxx3.f117955e.mo63386d();
                        bgwp.mo63293a(a2, bgwp.mo63290a(d), d, true);
                        return;
                    }
                    return;
                case 10:
                    aelr a8 = aelr.m52131a(intent);
                    if (a8 != null) {
                        try {
                            ArrayList arrayList2 = new ArrayList(a8.mo24660a());
                            Iterator it = a8.iterator();
                            while (it.hasNext()) {
                                aelp aelp = (aelp) it.next();
                                double bA = (double) aelp.mo8028bA();
                                Double.isNaN(bA);
                                ApiPlaceInference apiPlaceInference = new ApiPlaceInference(Integer.valueOf((int) (bA * 10000.0d)), aelp.mo8029bB().mo8007a());
                                String valueOf9 = String.valueOf(apiPlaceInference);
                                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf9).length() + i5);
                                sb7.append("Place inference: ");
                                sb7.append(valueOf9);
                                sb7.toString();
                                arrayList2.add(apiPlaceInference);
                                i5 = 17;
                            }
                            Uri data = intent.getData();
                            Boolean valueOf10 = Boolean.valueOf(data != null && data.getScheme().equals("mailto:"));
                            int d2 = (int) chbu.m148135d();
                            if (d2 != 100) {
                                str = d2 != 102 ? d2 != 104 ? d2 != 105 ? "unknownMode" : "noPower" : "lowPower" : "balancedPower";
                            } else {
                                str = "highPower";
                            }
                            apiPlaceInferenceResult = new ApiPlaceInferenceResult(arrayList2, valueOf10, str);
                            a8.mo12460c();
                            String valueOf11 = String.valueOf(apiPlaceInferenceResult);
                            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf11).length() + 24);
                            sb8.append("Place inference result: ");
                            sb8.append(valueOf11);
                            sb8.toString();
                        } catch (Throwable th) {
                            a8.mo12460c();
                            throw th;
                        }
                    } else {
                        apiPlaceInferenceResult = null;
                    }
                    Uri data2 = intent.getData();
                    Account account3 = (data2 == null || !data2.getScheme().equals("mailto:")) ? null : new Account(data2.getSchemeSpecificPart(), data2.getFragment());
                    String valueOf12 = String.valueOf(apiPlaceInferenceResult);
                    String valueOf13 = String.valueOf(account3);
                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf12).length() + 47 + String.valueOf(valueOf13).length());
                    sb9.append("Received place inference result '");
                    sb9.append(valueOf12);
                    sb9.append("' for account ");
                    sb9.append(valueOf13);
                    sb9.toString();
                    if (apiPlaceInferenceResult == null) {
                        bgur.m100025c("GCoreUlr", "Received null place inference result");
                        return;
                    }
                    sqv sqv3 = this.f117939b.f117957g;
                    ApiMetadata apiMetadata2 = new ApiMetadata(null, null, null, null, null, apiPlaceInferenceResult, null, null, Long.valueOf(System.currentTimeMillis()), null, null);
                    if (!chcp.m148193b() || !chcp.m148195d()) {
                        bvwq2 = null;
                    } else {
                        aelr a9 = aelr.m52131a(intent);
                        if (a9 != null) {
                            try {
                                ArrayList arrayList3 = new ArrayList(a9.mo24660a());
                                Iterator it2 = a9.iterator();
                                while (it2.hasNext()) {
                                    aelp aelp2 = (aelp) it2.next();
                                    double bA2 = (double) aelp2.mo8028bA();
                                    Double.isNaN(bA2);
                                    int i7 = (int) (bA2 * 10000.0d);
                                    String a10 = aelp2.mo8029bB().mo8007a();
                                    bxvd da8 = bvws.f158007d.mo74144da();
                                    if (a10 != null) {
                                        if (da8.f164950c) {
                                            da8.mo74035c();
                                            da8.f164950c = false;
                                        }
                                        bvws bvws = (bvws) da8.f164949b;
                                        a10.getClass();
                                        bvws.f158009a |= 1;
                                        bvws.f158010b = a10;
                                    }
                                    if (da8.f164950c) {
                                        da8.mo74035c();
                                        da8.f164950c = false;
                                    }
                                    bvws bvws2 = (bvws) da8.f164949b;
                                    bvws2.f158009a |= 2;
                                    bvws2.f158011c = i7;
                                    bvws bvws3 = (bvws) da8.mo74062i();
                                    String valueOf14 = String.valueOf(bvws3);
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf14).length() + 17);
                                    sb10.append("Place inference: ");
                                    sb10.append(valueOf14);
                                    sb10.toString();
                                    arrayList3.add(bvws3);
                                }
                                Uri data3 = intent.getData();
                                if (data3 == null || !data3.getScheme().equals("mailto:")) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                bxvd da9 = bvwt.f158012e.mo74144da();
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                bvwt bvwt2 = (bvwt) da9.f164949b;
                                bvwt2.mo73395a();
                                bxsy.m123078a(arrayList3, bvwt2.f158015b);
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                bvwt bvwt3 = (bvwt) da9.f164949b;
                                bvwt3.f158014a |= 2;
                                bvwt3.f158017d = z2;
                                int d3 = (int) chbu.m148135d();
                                int i8 = d3 != 100 ? d3 != 102 ? d3 != 104 ? d3 != 105 ? 1 : 2 : 3 : 4 : 5;
                                if (da9.f164950c) {
                                    da9.mo74035c();
                                    da9.f164950c = false;
                                }
                                bvwt bvwt4 = (bvwt) da9.f164949b;
                                bvwt4.f158016c = i8 - 1;
                                bvwt4.f158014a |= 1;
                                bvwt bvwt5 = (bvwt) da9.mo74062i();
                                a9.mo12460c();
                                String valueOf15 = String.valueOf(bvwt5);
                                StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf15).length() + 24);
                                sb11.append("Place inference result: ");
                                sb11.append(valueOf15);
                                sb11.toString();
                                bvwt = bvwt5;
                            } catch (Throwable th2) {
                                a9.mo12460c();
                                throw th2;
                            }
                        } else {
                            bvwt = null;
                        }
                        sqv sqv4 = this.f117939b.f117957g;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        bxvd da10 = bvwq.f157983r.mo74144da();
                        if (bvwt != null) {
                            if (da10.f164950c) {
                                da10.mo74035c();
                                da10.f164950c = false;
                            }
                            bvwq bvwq4 = (bvwq) da10.f164949b;
                            bvwt.getClass();
                            bvwq4.f157995k = bvwt;
                            bvwq4.f157985a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        }
                        if (da10.f164950c) {
                            da10.mo74035c();
                            da10.f164950c = false;
                        }
                        bvwq bvwq5 = (bvwq) da10.f164949b;
                        bvwq5.f157985a |= 1;
                        bvwq5.f157986b = currentTimeMillis3;
                        bvwq2 = (bvwq) da10.mo74062i();
                    }
                    if (account3 == null) {
                        Pair pair2 = new Pair(apiMetadata2, bvwq2);
                        String sio2 = apiPlaceInferenceResult.toString();
                        ReportingConfig a11 = this.f117939b.f117953c.mo63354a();
                        String a12 = aeqm.m52399a(a11.mo70928b());
                        StringBuilder sb12 = new StringBuilder(String.valueOf(sio2).length() + 25 + String.valueOf(a12).length());
                        sb12.append("Received '");
                        sb12.append(sio2);
                        sb12.append("' for accounts ");
                        sb12.append(a12);
                        sb12.toString();
                        this.f117939b.f117966p.mo63202a(a11.mo70928b(), pair2, "place inference");
                        return;
                    }
                    this.f117939b.f117966p.mo63201a(account3, new Pair(apiMetadata2, bvwq2), "personalized place inference");
                    return;
                case 11:
                    sdo.m34974b("com.google.android.gms.location.reporting.DELETE_OPERATION".equals(intent.getAction()));
                    if (intent2.hasExtra("deletions")) {
                        arrayList = intent2.getParcelableArrayListExtra("deletions");
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        bgur.m100024c("GCoreUlr", 31, "Received delete intent with no extra");
                        return;
                    }
                    int size = arrayList.size();
                    while (i4 < size) {
                        Deletion deletion = (Deletion) arrayList.get(i4);
                        Account account4 = deletion.f79593a;
                        long j3 = deletion.f79594b;
                        long j4 = deletion.f79595c;
                        bguc bguc = this.f117939b.f117963m;
                        if (chcp.m148197f()) {
                            j = j4;
                            bguc.f117547a.mo63191a(account4, j3, j4);
                        } else {
                            j = j4;
                        }
                        if (chcp.m148195d() && (bgue2 = bguc.f117548b) != null) {
                            bgue2.mo63178a(account4, j3, j);
                        }
                        i4++;
                    }
                    return;
                case 12:
                    if (!intent2.hasExtra("account") || !intent2.hasExtra("isPrimaryDevice")) {
                        String valueOf16 = String.valueOf(intent);
                        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf16).length() + 53);
                        sb13.append("Received change primary device intent missing extras:");
                        sb13.append(valueOf16);
                        bgur.m100025c("GCoreUlr", sb13.toString());
                        return;
                    }
                    Account account5 = (Account) intent2.getParcelableExtra("account");
                    boolean booleanExtra = intent2.getBooleanExtra("isPrimaryDevice", true);
                    AccountConfig a13 = this.f117939b.f117953c.mo63353a(account5);
                    bgyr a14 = bgys.m100417a(account5, "com.google.android.gms+gcm-primary-device");
                    a14.mo63434a(a13.f150892c);
                    a14.f118106n = Boolean.valueOf(booleanExtra);
                    this.f117939b.f117953c.mo63357a("DispatchingService.handlePrimaryDeviceChange", a14.mo63432a(), "DispatchingService.handlePrimaryDeviceChange");
                    return;
                case 13:
                    bgye bgye = this.f117939b.f117953c;
                    synchronized (bgye.f117997f) {
                        Account[] accountArr = ((bfkd) bgye.f118001c).f114281b;
                        int length = accountArr.length;
                        while (i4 < length) {
                            bgye.mo63364c(accountArr[i4]);
                            i4++;
                        }
                    }
                    return;
                case 14:
                    if (srs.m36149a(this.f117939b.f117952b)) {
                        bgxx.m100280d();
                        this.f117939b.mo63335b();
                    }
                    bgyb bgyb = this.f117940f;
                    this.f117939b.f117953c.mo63354a();
                    bgyb.mo63344a(action);
                    return;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    bgyb bgyb2 = this.f117940f;
                    this.f117939b.f117953c.mo63354a();
                    bgyb2.mo63344a(action);
                    return;
                default:
                    String valueOf17 = String.valueOf(intent);
                    StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf17).length() + 22);
                    sb14.append("Unsupported action in ");
                    sb14.append(valueOf17);
                    bgur.m100024c("GCoreUlr", 32, sb14.toString());
                    return;
            }
        } else {
            String valueOf18 = String.valueOf(intent);
            StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf18).length() + 50);
            sb15.append("Legacy intent ");
            sb15.append(valueOf18);
            sb15.append(", updating active state to cancel it");
            bgur.m100020b("GCoreUlr", sb15.toString());
            bgxx bgxx4 = this.f117939b;
            Intent intent3 = new Intent();
            intent3.setComponent(bgxx.m100270a(bgxx4.f117952b));
            PendingIntent a15 = bgxg.m100217a(this.f117939b.f117952b, intent3);
            bgxx bgxx5 = this.f117939b;
            aesh aesh2 = bgxx5.f117956f;
            if (aesh2 == null) {
                bgxx5.f117972v.mo24739c(a15);
            } else {
                aesh2.mo34504a(a15);
            }
            a15.cancel();
        }
    }

    /* renamed from: a */
    public final void mo31177a(Status status) {
        bgxx bgxx = this.f117939b;
        int i = bgxx.f117951w;
        bgxx.m100279c(bgxx.f117952b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bguw.a(int, java.lang.Boolean):void
     arg types: [int, boolean]
     candidates:
      bguw.a(bvzk, bxvd):void
      bguw.a(bvyy, bxvd):void
      bguw.a(int, java.lang.Boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63330a(WifiScan wifiScan) {
        String valueOf = String.valueOf(wifiScan);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("Wifi scan: ");
        sb.append(valueOf);
        sb.toString();
        int a = wifiScan.mo43592a();
        String valueOf2 = String.valueOf((Object) false);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
        sb2.append("UlrClearcutEvents.logWifiScanEvent(");
        sb2.append(a);
        sb2.append(", ");
        sb2.append(valueOf2);
        sb2.append(")");
        sb2.toString();
        if (bgux.m100096a()) {
            bgux.f117614a.mo63238a(a, (Boolean) false);
        }
    }
}
