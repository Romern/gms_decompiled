package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bgbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbe extends bgck implements bflz {

    /* renamed from: g */
    public static final /* synthetic */ int f115973g = 0;

    /* renamed from: a */
    public long f115974a;

    /* renamed from: b */
    public final int[] f115975b;

    /* renamed from: c */
    public final boolean f115976c;

    /* renamed from: d */
    public final boolean f115977d;

    /* renamed from: e */
    public final long f115978e;

    /* renamed from: f */
    final /* synthetic */ bgbg f115979f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgbe(bgbg bgbg, PendingIntent pendingIntent, long j, long j2, bgns bgns, bhcv bhcv, boolean z, String str, int[] iArr, boolean z2) {
        super(pendingIntent, j, j2, bgns, bhcv, z, false, str);
        boolean z3;
        bgbg bgbg2 = bgbg;
        long j3 = j;
        int[] iArr2 = iArr;
        this.f115979f = bgbg2;
        this.f115974a = SystemClock.elapsedRealtime() - j3;
        if (!mo62596a(9) || m98498a(pendingIntent.getTargetPackage())) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f115976c = z3;
        this.f115977d = z2;
        if (iArr2 != null) {
            this.f115975b = iArr2;
        } else if (m98498a(pendingIntent.getTargetPackage())) {
            this.f115975b = new int[]{9};
        } else {
            this.f115975b = new int[0];
        }
        this.f115978e = j3;
        bgbg2.f115984h.mo26056a(new bgbf(bhcv, str, j2), j3);
    }

    /* renamed from: a */
    private final boolean m98498a(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bgbg bgbg = this.f115979f;
        long j = elapsedRealtime - bgbg.f115982b;
        if (bgbg.f115981a == null || j > 600000) {
            bgbg.f115982b = elapsedRealtime;
            String offBodyEligibleApps = cerv.f183393a.mo6606a().offBodyEligibleApps();
            if (!TextUtils.isEmpty(offBodyEligibleApps)) {
                String[] split = offBodyEligibleApps.split(",");
                int length = split.length;
                ArrayList arrayList = new ArrayList(length);
                for (String str2 : split) {
                    String trim = str2.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        arrayList.add(trim);
                    }
                }
                this.f115979f.f115981a = new String[arrayList.size()];
                bgbg bgbg2 = this.f115979f;
                bgbg2.f115981a = (String[]) arrayList.toArray(bgbg2.f115981a);
            } else {
                this.f115979f.f115981a = new String[0];
            }
            String valueOf = String.valueOf(Arrays.toString(this.f115979f.f115981a));
            if (valueOf.length() == 0) {
                new String("New off body eligible apps generated: ");
            } else {
                "New off body eligible apps generated: ".concat(valueOf);
            }
        }
        for (String str3 : this.f115979f.f115981a) {
            if (str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo61907a(ActivityRecognitionResult activityRecognitionResult) {
        String str;
        if (!this.f116025p && activityRecognitionResult.mo43491a().mo43513a() == 6) {
            return null;
        }
        int a = this.f115979f.f115989m.mo63552a(this.f116017h.getTargetPackage());
        ArrayList arrayList = new ArrayList();
        for (DetectedActivity detectedActivity : activityRecognitionResult.f79300a) {
            int a2 = detectedActivity.mo43513a();
            if (a >= 4400000) {
                if (a >= 5100000) {
                    if (a < 11200000) {
                        if (a2 != 16) {
                            if (a2 == 17) {
                            }
                        }
                    }
                } else if (a2 > 8) {
                }
            } else if (a2 > 6) {
            }
            if ((this.f116025p || ((1 << a2) & 4161088) == 0) && ((a2 != 5 || !bgjp.m99109q()) && ((((1 << a2) & 32256) == 0 || mo62596a(a2)) && (cery.m138143c() || !(a2 == 16 || a2 == 17))))) {
                if (!this.f116025p || (str = this.f116022m) == null || !str.contains("fitness") || a2 <= 8) {
                    arrayList.add(detectedActivity);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return new ActivityRecognitionResult(arrayList, activityRecognitionResult.f79301b, activityRecognitionResult.f79302c, activityRecognitionResult.f79303d, activityRecognitionResult.mo43493c());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo62594a() {
        this.f115979f.f115984h.mo26057b(new bgbf(this.f116023n, this.f116022m, this.f116018i), this.f116051q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62595a(long j) {
        this.f115979f.f115984h.mo26057b(new bgbf(this.f116023n, this.f116022m, this.f116018i), this.f116051q);
        this.f116051q = j;
        this.f115979f.f115984h.mo26056a(new bgbf(this.f116023n, this.f116022m, this.f116018i), this.f116051q);
    }

    /* renamed from: a */
    public final boolean mo62596a(int i) {
        if (this.f115975b != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f115975b;
                if (i2 >= iArr.length) {
                    break;
                } else if (i == iArr[i2]) {
                    return true;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo62597a(Context context, Intent intent) {
        int a = this.f115979f.f115989m.mo63552a(this.f116017h.getTargetPackage());
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) intent.getParcelableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (activityRecognitionResult == null) {
                return false;
            }
            if (a >= 7500000) {
                StringBuilder sb = new StringBuilder(94);
                sb.append("ActivityIntentReceiver.deliverIntent: Send byte array to new client. clientVersion=");
                sb.append(a);
                sb.toString();
                intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", sef.m35074a(activityRecognitionResult));
            } else {
                intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult);
            }
            return super.mo62597a(context, intent);
        } else if (ActivityRecognitionResult.m66822c(intent)) {
            return super.mo62597a(context, intent);
        } else {
            return true;
        }
    }
}
