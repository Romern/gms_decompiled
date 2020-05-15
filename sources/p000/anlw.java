package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anlw {

    /* renamed from: a */
    private static anlw f77095a;

    /* renamed from: b */
    private final C1231nx f77096b = new C1231nx(50);

    /* renamed from: c */
    private final PackageManager f77097c;

    /* renamed from: d */
    private final Resources f77098d;

    /* renamed from: e */
    private Drawable f77099e;

    private anlw(Context context) {
        this.f77097c = context.getPackageManager();
        this.f77098d = context.getResources();
    }

    /* renamed from: a */
    private final Drawable m64726a() {
        if (this.f77099e == null) {
            this.f77099e = this.f77098d.getDrawable(C0126R.C0127drawable.plus_ic_apps_color_24);
        }
        return this.f77099e;
    }

    /* renamed from: a */
    public static anlw m64727a(Context context) {
        if (f77095a == null) {
            f77095a = new anlw(context);
        }
        return f77095a;
    }

    /* renamed from: a */
    public final anlv mo41925a(anxl anxl) {
        Drawable drawable;
        boolean z;
        String c = anxl.mo42353c();
        anlv anlv = (anlv) this.f77096b.mo15546a(c);
        if (anlv != null) {
            return anlv;
        }
        ApplicationInfo d = anxl.mo42354d();
        if (d != null) {
            drawable = this.f77097c.getApplicationIcon(d);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = m64726a();
        }
        String a = anxl.mo42351a();
        if (drawable == m64726a()) {
            z = true;
        } else {
            z = false;
        }
        anlv anlv2 = new anlv(a, drawable, z);
        this.f77096b.mo15547a(c, anlv2);
        return anlv2;
    }

    /* renamed from: a */
    public final void mo41926a(anxl anxl, Drawable drawable) {
        anlv a = mo41925a(anxl);
        if (drawable != null) {
            a.f77093b = drawable;
        }
        a.f77094c = false;
    }
}
