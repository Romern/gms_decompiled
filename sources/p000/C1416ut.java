package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* renamed from: ut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1416ut extends ContextWrapper {

    /* renamed from: a */
    public int f27274a;

    /* renamed from: b */
    private Resources.Theme f27275b;

    /* renamed from: c */
    private LayoutInflater f27276c;

    /* renamed from: d */
    private Configuration f27277d;

    /* renamed from: e */
    private Resources f27278e;

    public C1416ut() {
        super(null);
    }

    /* renamed from: b */
    private final void m20510b() {
        if (this.f27275b == null) {
            this.f27275b = mo16091a().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f27275b.setTo(theme);
            }
        }
        this.f27275b.applyStyle(this.f27274a, true);
    }

    /* renamed from: a */
    public final Resources mo16091a() {
        if (this.f27278e == null) {
            if (this.f27277d != null) {
                int i = Build.VERSION.SDK_INT;
                this.f27278e = createConfigurationContext(this.f27277d).getResources();
            } else {
                this.f27278e = super.getResources();
            }
        }
        return this.f27278e;
    }

    public final Resources getResources() {
        return mo16091a();
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f27276c == null) {
            this.f27276c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f27276c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f27275b;
        if (theme != null) {
            return theme;
        }
        if (this.f27274a == 0) {
            this.f27274a = 2132018565;
        }
        m20510b();
        return this.f27275b;
    }

    public final void setTheme(int i) {
        if (this.f27274a != i) {
            this.f27274a = i;
            m20510b();
        }
    }

    public C1416ut(Context context, int i) {
        super(context);
        this.f27274a = i;
    }

    public final AssetManager getAssets() {
        return mo16091a().getAssets();
    }

    public C1416ut(Context context, Resources.Theme theme) {
        super(context);
        this.f27275b = theme;
    }

    /* renamed from: a */
    public final void mo16092a(Configuration configuration) {
        if (this.f27278e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f27277d == null) {
            this.f27277d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }
}
