package com.google.android.chimera;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextThemeWrapper extends ContextWrapper {

    /* renamed from: CC */
    private int f7616CC;

    /* renamed from: CD */
    private Resources.Theme f7617CD;

    /* renamed from: CK */
    private LayoutInflater f7618CK;

    protected ContextThemeWrapper(Context context) {
        super(context);
    }

    /* renamed from: be */
    private final void m4853be() {
        boolean z;
        if (this.f7617CD == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f7617CD = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7617CD.setTo(theme);
            }
        }
        onApplyThemeResource(this.f7617CD, this.f7616CC, z);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f7618CK == null) {
            this.f7618CK = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7618CK;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7617CD;
        if (theme != null) {
            return theme;
        }
        int i = this.f7616CC;
        int i2 = getApplicationInfo().targetSdkVersion;
        if (i == 0) {
            i = i2 >= 11 ? i2 >= 14 ? i2 < 24 ? 16974120 : 16974143 : 16973931 : 16973829;
        }
        this.f7616CC = i;
        m4853be();
        return this.f7617CD;
    }

    public int getThemeResId() {
        return this.f7616CC;
    }

    /* access modifiers changed from: protected */
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public void setTheme(int i) {
        if (this.f7616CC != i) {
            this.f7616CC = i;
            m4853be();
        }
    }

    public ContextThemeWrapper(Context context, int i) {
        super(context);
        this.f7616CC = i;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f7617CD = theme;
    }
}
