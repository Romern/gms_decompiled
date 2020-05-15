package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bijx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijx {

    /* renamed from: a */
    public final String f120751a;

    /* renamed from: b */
    public final String f120752b;

    /* renamed from: c */
    public final String f120753c;

    /* renamed from: d */
    public final String f120754d;

    /* renamed from: e */
    public final int f120755e;

    /* renamed from: f */
    public final int f120756f;

    /* renamed from: g */
    public final int f120757g;

    /* renamed from: h */
    public final int f120758h;

    /* renamed from: i */
    public final int f120759i;

    /* renamed from: j */
    public final int f120760j;

    /* renamed from: k */
    private final Context f120761k;

    public bijx(Context context, Intent intent, ComponentName componentName) {
        sdo.m34959a(context);
        this.f120761k = context;
        sdo.m34959a(componentName);
        String packageName = componentName.getPackageName();
        sdo.m34959a((Object) packageName);
        this.f120751a = packageName;
        componentName.getShortClassName();
        PackageInfo packageInfo = null;
        try {
            packageInfo = svr.m36484b(this.f120761k).mo26176b(this.f120751a, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("Places", 5)) {
                String valueOf = String.valueOf(this.f120751a);
                bioi.m102662c("Places", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            }
        }
        if (packageInfo != null) {
            int i = packageInfo.versionCode;
        }
        Bundle extras = intent.getExtras();
        extras = extras == null ? Bundle.EMPTY : extras;
        this.f120753c = extras.getString("account_name");
        this.f120752b = extras.getString("alias_title");
        this.f120754d = extras.getString("gcore_client_name");
        this.f120755e = extras.getInt("primary_color");
        this.f120756f = extras.getInt("primary_color_dark");
        if (intent.hasExtra("primary_color")) {
            this.f120757g = biha.m102383a(this.f120755e, context.getResources().getColor(C0126R.color.text_white_alpha_87), context.getResources().getColor(C0126R.color.text_black_alpha_87));
        } else {
            this.f120757g = 0;
        }
        this.f120758h = extras.getInt("reference_marker_overlay_resource_id", -1);
        this.f120759i = extras.getInt("reference_marker_overlay_width_meters");
        this.f120760j = extras.getInt("reference_marker_overlay_height_meters");
    }
}
