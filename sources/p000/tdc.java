package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdc extends svk implements View.OnClickListener {

    /* renamed from: p */
    private static final Logger f45678p = tea.m36798a("connected_app_item");

    /* renamed from: a */
    public final String f45679a;

    /* renamed from: b */
    public final CharSequence f45680b;

    /* renamed from: c */
    public final Drawable f45681c;

    /* renamed from: l */
    public final CharSequence f45682l;

    /* renamed from: m */
    public final int f45683m;

    /* renamed from: n */
    public final Context f45684n;

    /* renamed from: o */
    public boolean f45685o = true;

    private tdc(Context context, String str, CharSequence charSequence, Drawable drawable, CharSequence charSequence2) {
        super(context);
        this.f45679a = str;
        this.f45680b = charSequence;
        this.f45681c = drawable;
        this.f45682l = charSequence2;
        this.f45684n = context;
        float f = context.getResources().getDisplayMetrics().density;
        this.f45683m = Math.round(15.0f * f);
        int round = Math.round(f * 45.0f);
        Drawable drawable2 = this.f45681c;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, round, round);
        }
    }

    /* renamed from: a */
    public static final tdc m36735a(Context context, String str, int i) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                Drawable applicationIcon = packageManager.getApplicationIcon(str);
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                return new tdc(context, str, applicationLabel, applicationIcon, C1212ne.m19667a(context.getString(i, applicationLabel), 0));
            }
            f45678p.mo25418e("Application: %s not found", str);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            f45678p.mo25418e("Application: %s not found", str, e);
            return null;
        }
    }

    /* renamed from: a */
    public final int mo23821a() {
        return C0126R.C0128layout.c11n_connected_apps_setting_item;
    }

    /* renamed from: a */
    public final void mo26104a(boolean z) {
        this.f45685o = z;
    }

    /* renamed from: b */
    public final svb mo23822b() {
        return tda.m36732a();
    }

    /* renamed from: h */
    public final boolean mo26162h() {
        return this.f45685o;
    }

    public void onClick(View view) {
        this.f45684n.startActivity(this.f45684n.getPackageManager().getLaunchIntentForPackage(this.f45679a));
    }
}
