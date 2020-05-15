package p000;

import android.location.Location;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiRate;

/* renamed from: bgyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyf {

    /* renamed from: a */
    public long f118009a;

    /* renamed from: b */
    public ActivityRecognitionResult f118010b;

    /* renamed from: c */
    public bgya f118011c;

    /* renamed from: d */
    public long f118012d;

    /* renamed from: e */
    public boolean f118013e;

    /* renamed from: f */
    public boolean f118014f;

    /* renamed from: g */
    public bgvj f118015g;

    /* renamed from: h */
    public boolean f118016h;

    /* renamed from: i */
    public boolean f118017i;

    /* renamed from: j */
    public boolean f118018j;

    /* renamed from: k */
    private long f118019k = 0;

    /* renamed from: l */
    private Location f118020l;

    /* renamed from: m */
    private ActivityRecognitionResult f118021m;

    /* renamed from: n */
    private long f118022n;

    /* renamed from: o */
    private Location f118023o;

    /* renamed from: p */
    private long f118024p;

    /* renamed from: q */
    private NetworkLocationStatus f118025q;

    /* renamed from: r */
    private ApiRate f118026r;

    /* renamed from: s */
    private ReportingConfig f118027s;

    public bgyf() {
        mo63372a();
    }

    /* renamed from: a */
    public final synchronized void mo63372a() {
        this.f118020l = null;
        this.f118009a = -1;
        this.f118021m = null;
        this.f118010b = null;
        this.f118022n = -1;
        this.f118023o = null;
        this.f118024p = -1;
        this.f118025q = null;
        this.f118026r = null;
        this.f118011c = null;
        this.f118012d = -1;
        this.f118013e = false;
        this.f118027s = null;
        this.f118015g = null;
        this.f118017i = false;
        this.f118018j = false;
    }

    /* renamed from: a */
    public final synchronized void mo63373a(long j) {
        this.f118022n = j;
        this.f118013e = false;
    }

    /* renamed from: a */
    public final synchronized void mo63374a(Location location) {
        this.f118023o = location;
    }

    /* renamed from: a */
    public final synchronized void mo63375a(Location location, long j) {
        this.f118020l = location;
        this.f118009a = j;
    }

    /* renamed from: a */
    public final synchronized void mo63376a(bgya bgya) {
        this.f118011c = bgya;
    }

    /* renamed from: a */
    public final synchronized void mo63377a(ActivityRecognitionResult activityRecognitionResult) {
        this.f118021m = activityRecognitionResult;
    }

    /* renamed from: a */
    public final synchronized void mo63378a(NetworkLocationStatus networkLocationStatus) {
        this.f118025q = networkLocationStatus;
    }

    /* renamed from: a */
    public final synchronized void mo63379a(ReportingConfig reportingConfig) {
        this.f118027s = reportingConfig;
    }

    /* renamed from: a */
    public final synchronized void mo63380a(ApiRate apiRate) {
        this.f118026r = apiRate;
    }

    /* renamed from: a */
    public final synchronized void mo63381a(ApiRate apiRate, bgya bgya, long j) {
        this.f118026r = apiRate;
        this.f118011c = bgya;
        this.f118012d = j;
    }

    /* renamed from: a */
    public final synchronized void mo63382a(boolean z) {
        this.f118014f = z;
    }

    /* renamed from: b */
    public final synchronized long mo63383b() {
        return this.f118019k;
    }

    /* renamed from: b */
    public final synchronized void mo63384b(long j) {
        this.f118024p = j;
    }

    /* renamed from: c */
    public final synchronized void mo63385c() {
        this.f118019k++;
    }

    /* renamed from: d */
    public final synchronized Location mo63386d() {
        return this.f118020l;
    }

    /* renamed from: e */
    public final synchronized ActivityRecognitionResult mo63387e() {
        return this.f118021m;
    }

    /* renamed from: f */
    public final synchronized ActivityRecognitionResult mo63388f() {
        return this.f118010b;
    }

    /* renamed from: g */
    public final synchronized long mo63389g() {
        return this.f118022n;
    }

    /* renamed from: h */
    public final synchronized Location mo63390h() {
        return this.f118023o;
    }

    /* renamed from: i */
    public final synchronized long mo63391i() {
        return this.f118024p;
    }

    /* renamed from: j */
    public final synchronized NetworkLocationStatus mo63392j() {
        return this.f118025q;
    }

    /* renamed from: k */
    public final synchronized ApiRate mo63393k() {
        return this.f118026r;
    }

    /* renamed from: l */
    public final synchronized bvxc mo63394l() {
        return bgzi.m100448a(this.f118026r);
    }

    /* renamed from: m */
    public final synchronized ReportingConfig mo63395m() {
        return this.f118027s;
    }

    public final synchronized String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        long j2;
        String str6;
        String sb;
        synchronized (this) {
            ReportingConfig reportingConfig = this.f118027s;
            if (reportingConfig != null) {
                StringBuilder sb2 = new StringBuilder();
                for (AccountConfig accountConfig : reportingConfig.f150914a) {
                    bxbk a = bxbl.m122537a(accountConfig);
                    a.mo73559a("account", aeqm.m52397a(accountConfig.f150890a));
                    a.mo73559a("restriction", Integer.valueOf(accountConfig.f150899j));
                    a.mo73559a("reporting", Integer.valueOf(accountConfig.mo70904a()));
                    a.mo73559a("history", Integer.valueOf(accountConfig.mo70906b()));
                    a.mo73559a("updateNumber", Long.valueOf(accountConfig.f150892c));
                    a.mo73559a("serverMillis", Long.valueOf(accountConfig.f150898i));
                    a.mo73559a("lastUploadTimeMs", accountConfig.f150906q);
                    a.mo73559a("reasons", accountConfig.mo70909e());
                    sb2.append(a.toString());
                    sb2.append(";");
                }
                str = sb2.toString();
            } else {
                str = null;
            }
            Location location = this.f118020l;
            if (location != null) {
                str2 = String.valueOf(location.getTime());
            } else {
                str2 = "null";
            }
            ActivityRecognitionResult activityRecognitionResult = this.f118021m;
            if (activityRecognitionResult != null) {
                str3 = String.valueOf(activityRecognitionResult.f79302c);
            } else {
                str3 = "null";
            }
            ActivityRecognitionResult activityRecognitionResult2 = this.f118010b;
            if (activityRecognitionResult2 != null) {
                str4 = String.valueOf(activityRecognitionResult2.f79302c);
            } else {
                str4 = "null";
            }
            Location location2 = this.f118023o;
            if (location2 != null) {
                str5 = String.valueOf(location2.getTime());
            } else {
                str5 = "null";
            }
            long j3 = this.f118019k;
            long j4 = this.f118009a;
            long j5 = this.f118022n;
            long j6 = this.f118024p;
            String valueOf = String.valueOf(this.f118025q);
            bgvj bgvj = this.f118015g;
            if (bgvj != null) {
                j2 = j6;
                int i = bgvj.f117666e;
                int i2 = bgvj.f117664c;
                j = j5;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("voltage: ");
                sb3.append(i);
                sb3.append(", level: ");
                sb3.append(i2);
                str6 = sb3.toString();
            } else {
                j = j5;
                j2 = j6;
                str6 = null;
            }
            String valueOf2 = String.valueOf(this.f118026r);
            String valueOf3 = String.valueOf(this.f118011c);
            boolean z = this.f118013e;
            boolean z2 = this.f118016h;
            boolean z3 = this.f118017i;
            boolean z4 = this.f118018j;
            int length = String.valueOf(str2).length();
            int length2 = String.valueOf(str3).length();
            int length3 = String.valueOf(str4).length();
            int length4 = String.valueOf(str5).length();
            int length5 = String.valueOf(valueOf).length();
            int length6 = String.valueOf(str6).length();
            int length7 = String.valueOf(valueOf2).length();
            StringBuilder sb4 = new StringBuilder(length + 513 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
            sb4.append("InternalState{numLocationsSinceStart=");
            sb4.append(j3);
            sb4.append(", lastLocationRecorded.time=");
            sb4.append(str2);
            sb4.append(", lastLocationRecordedRealtime=");
            sb4.append(j4);
            sb4.append(", lastActivityProcessedRealtime=");
            sb4.append(str3);
            sb4.append(", currentActivityProcessedRealtime=");
            sb4.append(str4);
            sb4.append(", lastWifiAttachedRealtime=");
            sb4.append(j);
            sb4.append(", lastUploadAttemptRealtime=");
            sb4.append(j2);
            sb4.append(", lastUploadAttemptLocation.time=");
            sb4.append(str5);
            sb4.append(", lastLocationStatusRealtime=");
            sb4.append(valueOf);
            sb4.append(", currentBatteryCondition=");
            sb4.append(str6);
            sb4.append(", apiRateJson=");
            sb4.append(valueOf2);
            sb4.append(", sampleSpec=");
            sb4.append(valueOf3);
            sb4.append(", awaitingWifi=");
            sb4.append(z);
            sb4.append(", hasActiveBurstRequest=");
            sb4.append(z2);
            sb4.append(", reportingConfig=");
            sb4.append(str);
            sb4.append(", isAtHome=");
            sb4.append(z3);
            sb4.append(", isAtWork=");
            sb4.append(z4);
            sb4.append('}');
            sb = sb4.toString();
        }
        return sb;
    }
}
