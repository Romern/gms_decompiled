package com.google.android.gms.maps.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import com.google.android.chimera.Service;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApiTokenChimeraService extends Service {

    /* renamed from: a */
    public static final String f79859a = ApiTokenChimeraService.class.getSimpleName();

    /* renamed from: b */
    public static final long f79860b = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: c */
    public bwbf f79861c;

    /* renamed from: d */
    private final afdb f79862d;

    public ApiTokenChimeraService() {
        this(afcz.f64191a, afda.f64192a, afcy.f64190a, bwbs.f158757a);
    }

    /* renamed from: a */
    public static Bundle m67163a(short s) {
        Bundle bundle = new Bundle(1);
        bundle.putShort("ERROR_CODE", s);
        return bundle;
    }

    public final IBinder onBind(Intent intent) {
        Context applicationContext = getApplicationContext();
        Locale locale = Locale.getDefault();
        bwbm bwbm = new bwbm();
        Matcher matcher = bwbn.f158751a.matcher(locale.toString());
        if (matcher.matches()) {
            bwbm.f158748a = matcher.group(1);
            bwbm.f158749b = matcher.group(3);
            if (matcher.group(2) != null && !matcher.group(2).isEmpty()) {
                bwbm.f158750c = matcher.group(2);
            }
        } else {
            bwbm.f158748a = locale.getLanguage();
            if (!locale.getCountry().isEmpty()) {
                bwbm.f158750c = locale.getCountry();
            }
        }
        if (bwbm.f158748a.equals("en") && (bwbm.f158750c.equals("AU") || bwbm.f158750c.equals("NZ"))) {
            bwbm.f158750c = "GB";
        }
        bwbg.f158725f = bwbm.toString();
        bwbg.f158720a = applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
        bwbg.f158721b = displayMetrics.densityDpi;
        bwbg.f158722c = displayMetrics.density;
        float f = (float) bwbg.f158721b;
        if (((double) (Math.abs(displayMetrics.xdpi - f) / f)) > 0.25d || ((double) (Math.abs(displayMetrics.ydpi - f) / f)) > 0.25d) {
            bwbg.f158723d = f;
            bwbg.f158724e = f;
        } else {
            bwbg.f158723d = displayMetrics.xdpi;
            bwbg.f158724e = displayMetrics.ydpi;
        }
        Math.hypot((double) (((float) displayMetrics.widthPixels) / bwbg.f158723d), (double) (((float) displayMetrics.heightPixels) / bwbg.f158724e));
        bwbg.f158726g = applicationContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        return this.f79862d;
    }

    public final boolean onUnbind(Intent intent) {
        bwbf bwbf = this.f79861c;
        if (bwbf != null) {
            bwbf.mo73437h();
            this.f79861c = null;
        }
        return super.onUnbind(intent);
    }

    public ApiTokenChimeraService(afcz afcz, afda afda, afcy afcy, bwbs bwbs) {
        this.f79862d = new afdb(this);
        this.f79861c = null;
    }
}
