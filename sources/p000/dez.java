package p000;

import android.content.Context;
import com.google.android.chimera.ModuleContext;
import java.io.File;

/* renamed from: dez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dez {

    /* renamed from: a */
    public final Context f12990a;

    /* renamed from: b */
    public final File f12991b;

    /* renamed from: c */
    protected final File f12992c;

    /* renamed from: d */
    public volatile boolean f12993d;

    protected dez(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        bmzs.m108696a(applicationContext);
        ModuleContext moduleContext = ModuleContext.getModuleContext(applicationContext);
        applicationContext = moduleContext != null ? moduleContext.getBaseContext() : applicationContext;
        aytw.m84814b();
        Context c = aytw.m84816c(applicationContext);
        c = c.getApplicationContext() == null ? new dey(c) : c;
        File a = dft.m8317a(c);
        boolean z = true;
        if (!m8264a(a, str).exists() && (c.getApplicationInfo().flags & 129) != 1) {
            z = false;
        }
        this.f12990a = c;
        this.f12991b = a;
        this.f12992c = m8264a(a, str);
        this.f12993d = z;
    }

    /* renamed from: a */
    protected static File m8264a(File file, String str) {
        return new File(file, str);
    }

    /* renamed from: b */
    public final boolean mo8638b() {
        return !mo8637a() && !aytw.m84815b(this.f12990a);
    }

    /* renamed from: c */
    public final boolean mo8639c() {
        return !mo8637a() && aytw.m84815b(this.f12990a);
    }

    /* renamed from: a */
    public final boolean mo8637a() {
        boolean z = this.f12993d;
        if (z || !this.f12992c.exists()) {
            return z;
        }
        this.f12993d = true;
        return true;
    }
}
