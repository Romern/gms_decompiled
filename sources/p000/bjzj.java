package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.wallet.analytics.AppValidationResult;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import java.util.Locale;

/* renamed from: bjzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzj extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ bjzk f123689a;

    /* renamed from: b */
    private final Context f123690b;

    /* renamed from: c */
    private final LogContext f123691c;

    public bjzj(bjzk bjzk, Context context, LogContext logContext) {
        this.f123689a = bjzk;
        this.f123690b = context.getApplicationContext();
        this.f123691c = logContext;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        TimedEvent timedEvent;
        int i;
        bmkd[] bmkdArr = (bmkd[]) objArr;
        int length = bmkdArr.length;
        Bundle bundle = new Bundle(length);
        svq b = svr.m36484b(this.f123690b);
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            bmkd bmkd = bmkdArr[i2];
            LogContext logContext = this.f123691c;
            String str = bmkd.f129784b;
            if (!bjst.m104536d(logContext)) {
                Log.e("ClientLog", "Tried to log startAppValidation() in an invalid session.");
                timedEvent = null;
            } else {
                bxvd e = bjst.m104537e(logContext);
                bwfe bwfe = bwfe.EVENT_NAME_APP_VALIDATION_START;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = z;
                }
                bwfr bwfr = (bwfr) e.f164949b;
                bwfr bwfr2 = bwfr.f159113m;
                bwfr.f159121g = bwfe.f159083I;
                bwfr.f159115a |= 4;
                bxvd da = bwfp.f159099c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = z;
                }
                bwfp bwfp = (bwfp) da.f164949b;
                str.getClass();
                bwfp.f159101a |= 1;
                bwfp.f159102b = str;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = z;
                }
                bwfr bwfr3 = (bwfr) e.f164949b;
                bwfp bwfp2 = (bwfp) da.mo74062i();
                bwfp2.getClass();
                bwfr3.f159117c = bwfp2;
                bwfr3.f159116b = 14;
                bwfr bwfr4 = (bwfr) e.mo74062i();
                bjst.m104528a(logContext.mo71783b(), bwfr4);
                timedEvent = new TimedEvent(bwfr4);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.f123690b;
            try {
                PackageInfo b2 = b.mo26176b(bmkd.f129784b, 64);
                if (!bjys.m104925a(bmkd.f129784b, bmkd.f129785c, bmkd.f129786d, b2.versionCode)) {
                    Locale locale = Locale.US;
                    Object[] objArr2 = new Object[3];
                    try {
                        objArr2[0] = Integer.valueOf(b2.versionCode);
                        objArr2[1] = Integer.valueOf(bmkd.f129785c);
                        objArr2[2] = bmkd.f129786d;
                        Log.e("AppValidationSidecar", String.format(locale, "Version code (%d) is less than the required minimum=%d (regex=%s)", objArr2));
                        i = 51;
                    } catch (PackageManager.NameNotFoundException e2) {
                        i = 50;
                        bundle.putParcelable(bmkd.f129784b, new AppValidationResult(bmkd, i, SystemClock.elapsedRealtime() - elapsedRealtime));
                        bjst.m104523a(this.f123691c, timedEvent, i);
                        i2++;
                        z = false;
                    }
                } else if (bjyt.m104927a(b2, bmkd.f129787e)) {
                    int a = bmkc.m108109a(bmkd.f129783a);
                    if (a != 0) {
                        if (a != 1) {
                            int a2 = bmkc.m108109a(bmkd.f129783a);
                            if (a2 == 0) {
                                i = 0;
                            } else if (a2 != 3 || bjys.m104924a(context, bmkd.f129784b, bjva.m104680a(bmkd))) {
                                i = 0;
                            } else {
                                Log.e("AppValidationSidecar", "Native app redirect flows must start with an activity that has android:windowIsTranslucent=\"true\" specified in their manifest theme.");
                                i = 53;
                            }
                        }
                    }
                    Log.e("AppValidationSidecar", "Native app redirect type must be set.");
                    i = 54;
                } else {
                    i = 52;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                i = 50;
                bundle.putParcelable(bmkd.f129784b, new AppValidationResult(bmkd, i, SystemClock.elapsedRealtime() - elapsedRealtime));
                bjst.m104523a(this.f123691c, timedEvent, i);
                i2++;
                z = false;
            }
            bundle.putParcelable(bmkd.f129784b, new AppValidationResult(bmkd, i, SystemClock.elapsedRealtime() - elapsedRealtime));
            bjst.m104523a(this.f123691c, timedEvent, i);
            i2++;
            z = false;
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bjzk bjzk = this.f123689a;
        bjzk.f123692a = (Bundle) obj;
        bjzk.mo65664a(2);
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f123689a.mo65664a(1);
    }
}
