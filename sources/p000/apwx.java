package p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.Menu;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Map;

/* renamed from: apwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apwx extends qkh {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo47672a(int i) {
        Drawable a = C1497xt.m20824b().mo16510a(this, i);
        int i2 = Build.VERSION.SDK_INT;
        return a;
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.security_settings, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo47673a(int i, int i2) {
        try {
            Drawable a = mo47672a(i);
            if (a == null) {
                return a;
            }
            Drawable mutate = a.mutate();
            C1173lt.m19599a(mutate, C1133kh.m17843b(this, i2));
            return mutate;
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47674a(Map map, ThemeSettings themeSettings) {
        GoogleHelp a = GoogleHelp.m66336a("android_security");
        a.mo43195a(this);
        a.f78776s = themeSettings;
        a.f78774q = Uri.parse((String) ((bmzm) rsv.f43618g).f131273a);
        a.mo43197a(map);
        new aarh(this).mo31646a(a.mo43194a());
    }
}
