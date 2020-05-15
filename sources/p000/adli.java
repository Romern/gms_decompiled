package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: adli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adli {

    /* renamed from: a */
    public static final adfs f62105a = new adfs("InstantAppsStorage");

    /* renamed from: b */
    public static final Charset f62106b = Charset.forName("UTF-8");

    /* renamed from: c */
    public final PackageManager f62107c;

    /* renamed from: d */
    public final adha f62108d;

    /* renamed from: e */
    public final String f62109e;

    /* renamed from: f */
    private final File f62110f = new File(this.f62109e);

    public adli(Context context, adha adha, String str) {
        this.f62108d = adha;
        this.f62107c = context.getPackageManager();
        this.f62109e = String.valueOf(str).concat("/appStorage");
    }

    /* renamed from: a */
    public final void mo33632a() {
        if (!this.f62108d.mo33513a()) {
            throw new IOException("LevelDb creation failed.");
        } else if (!this.f62110f.exists() && !this.f62110f.mkdirs()) {
            throw new IOException("Can't create storage folder.");
        }
    }

    /* renamed from: b */
    public final File mo33634b(String str) {
        return new File(this.f62109e, String.valueOf(str).concat(".gzip"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33633a(String str) {
        sdo.m34977c(str);
        mo33632a();
        this.f62108d.mo33516b(str.getBytes(f62106b));
        File b = mo33634b(str);
        if (b.exists()) {
            b.delete();
        }
    }
}
