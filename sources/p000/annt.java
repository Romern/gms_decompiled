package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: annt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annt {

    /* renamed from: a */
    private static annt f77230a;

    /* renamed from: b */
    private final C1231nx f77231b = new C1231nx(50);

    /* renamed from: c */
    private final Resources f77232c;

    /* renamed from: d */
    private Drawable f77233d;

    private annt(Resources resources) {
        this.f77232c = resources;
    }

    /* renamed from: a */
    public static annt m64831a(Context context) {
        if (f77230a == null) {
            f77230a = new annt(context.getResources());
        }
        return f77230a;
    }

    /* renamed from: a */
    public final Drawable mo42012a(String str) {
        if (str != null) {
            return (Drawable) this.f77231b.mo15546a(str);
        }
        if (this.f77233d == null) {
            this.f77233d = this.f77232c.getDrawable(C0126R.C0127drawable.plus_ic_apps_lightgrey_24);
        }
        return this.f77233d;
    }

    /* renamed from: a */
    public final void mo42013a(String str, Drawable drawable) {
        this.f77231b.mo15547a(str, drawable);
    }
}
