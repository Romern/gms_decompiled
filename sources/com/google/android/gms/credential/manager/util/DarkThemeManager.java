package com.google.android.gms.credential.manager.util;

import android.arch.lifecycle.OnLifecycleEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.PowerManager;
import android.util.TypedValue;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DarkThemeManager implements C0012aj {

    /* renamed from: a */
    public Boolean f30708a;

    /* renamed from: b */
    public final deu f30709b;

    /* renamed from: c */
    public final boolean f30710c;

    /* renamed from: d */
    private BroadcastReceiver f30711d = new aacn("credential_manager") {
        /* class com.google.android.gms.credential.manager.util.DarkThemeManager.C15661 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            boolean z;
            DarkThemeManager darkThemeManager = DarkThemeManager.this;
            boolean a = DarkThemeManager.m22912a();
            Boolean bool = darkThemeManager.f30708a;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (a != z && DarkThemeManager.m22913a(a, DarkThemeManager.m22914b()) != darkThemeManager.f30710c) {
                darkThemeManager.f30708a = null;
                darkThemeManager.f30709b.recreate();
            }
        }
    };

    public DarkThemeManager(deu deu) {
        boolean a;
        int i;
        this.f30709b = deu;
        int i2 = Build.VERSION.SDK_INT;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        deu.registerReceiver(this.f30711d, intentFilter);
        deu.getLifecycle().mo557a(this);
        this.f30708a = Boolean.valueOf(m22912a());
        synchronized (DarkThemeManager.class) {
            if (this.f30708a == null) {
                this.f30708a = Boolean.valueOf(m22912a());
            }
            a = m22913a(this.f30708a.booleanValue(), m22914b());
        }
        this.f30710c = a;
        if (!a) {
            i = C0126R.style.PwmAppTheme;
        } else {
            i = C0126R.style.PwmAppThemeDark;
        }
        deu.setTheme(i);
    }

    /* renamed from: a */
    public static void m22911a(SwipeRefreshLayout swipeRefreshLayout) {
        int i;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = swipeRefreshLayout.getContext().getTheme();
        if (theme == null || !theme.resolveAttribute(C0126R.attr.colorPrimary, typedValue, true)) {
            i = C0126R.color.google_white;
        } else {
            i = typedValue.resourceId;
        }
        int b = C1133kh.m17843b(swipeRefreshLayout.getContext(), i);
        if (m22913a(m22912a(), m22914b())) {
            swipeRefreshLayout.mo2092a(C0126R.color.google_white);
            b = C1165lm.m19351a(Color.argb(204, 255, 255, 255), b);
        } else {
            swipeRefreshLayout.mo2095b(swipeRefreshLayout.getResources().getIntArray(C0126R.array.material_google_colors));
        }
        swipeRefreshLayout.mo2088a(b);
    }

    /* renamed from: b */
    public static boolean m22914b() {
        return (rpr.m34216b().getResources().getConfiguration().uiMode & 48) == 32;
    }

    @OnLifecycleEvent(mo1075a = C0005ad.ON_DESTROY)
    public void unregister() {
        int i = Build.VERSION.SDK_INT;
        this.f30709b.unregisterReceiver(this.f30711d);
        this.f30708a = null;
    }

    /* renamed from: a */
    public static boolean m22912a() {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) rpr.m34216b().getSystemService("power")).isPowerSaveMode();
    }

    /* renamed from: a */
    public static boolean m22913a(boolean z, boolean z2) {
        int i = Build.VERSION.SDK_INT;
        return z2 || z;
    }
}
