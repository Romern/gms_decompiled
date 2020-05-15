package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.Display;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.lang.ref.WeakReference;

/* renamed from: rpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpg extends ContextThemeWrapper {

    /* renamed from: a */
    private final BaseApplicationContext f43483a;

    /* renamed from: b */
    private final Resources f43484b;

    /* renamed from: c */
    private Resources f43485c;

    /* renamed from: d */
    private WeakReference f43486d;

    public rpg(Context context) {
        this(context, context.getResources());
    }

    /* renamed from: a */
    public final synchronized void mo24981a(Configuration configuration) {
        if (this.f43485c != null) {
            getResources().updateConfiguration(configuration, this.f43485c.getDisplayMetrics());
        }
    }

    public final Context createAttributionContext(String str) {
        return new rpg(super.createAttributionContext(str), this.f43484b);
    }

    public final Context createCredentialProtectedStorageContext() {
        return new rpg(super.createCredentialProtectedStorageContext(), this.f43484b);
    }

    public final Context createDeviceProtectedStorageContext() {
        return new rpg(super.createDeviceProtectedStorageContext(), this.f43484b);
    }

    public final Context createDisplayContext(Display display) {
        return new rpg(super.createDisplayContext(display), this.f43484b);
    }

    public final synchronized Resources getResources() {
        int i = Build.VERSION.SDK_INT;
        if (this.f43485c == null) {
            this.f43485c = this.f43483a.getResourcesWithLanguageAssets(this.f43484b);
            this.f43486d = new WeakReference(this.f43485c.getAssets());
        } else {
            AssetManager assetManager = (AssetManager) this.f43486d.get();
            AssetManager assets = this.f43485c.getAssets();
            if (assets != assetManager) {
                Resources unused = this.f43483a.getResourcesWithLanguageAssets(this.f43484b);
                this.f43486d = new WeakReference(assets);
            }
        }
        return this.f43485c;
    }

    public rpg(Context context, Resources resources) {
        super(context, (Resources.Theme) null);
        this.f43483a = rpr.m34216b();
        this.f43484b = resources;
    }
}
