package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.chimera.ModuleContext;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: dfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfz extends dhc {

    /* renamed from: b */
    private static long f13044b = 0;

    /* renamed from: c */
    private static int f13045c = -1;

    /* renamed from: d */
    private static volatile din f13046d;

    /* renamed from: j */
    private static volatile djy f13047j;

    /* renamed from: a */
    public final ApplicationInfo mo8907a() {
        return this.f13185e.getApplicationInfo();
    }

    /* renamed from: b */
    public final String mo8910b() {
        return this.f13185e.getApplicationInfo().sourceDir;
    }

    /* renamed from: c */
    public final Resources mo8911c() {
        return this.f13185e.getResources();
    }

    /* renamed from: d */
    public final long mo8912d() {
        long j = f13044b;
        if (j == 0) {
            synchronized (dfz.class) {
                j = f13044b;
                if (j == 0) {
                    j = new File(this.f13185e.getApplicationInfo().sourceDir).lastModified();
                    f13044b = j;
                    if (j == 0) {
                        throw new PackageManager.NameNotFoundException("container sourceDir");
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: e */
    public final din mo8913e() {
        din din = f13046d;
        return din == null ? super.mo8913e() : din;
    }

    /* renamed from: f */
    public final din mo8914f() {
        din din = f13046d;
        if (din == null) {
            synchronized (dfz.class) {
                din = f13046d;
                if (din == null) {
                    din f = super.mo8914f();
                    bxvd bxvd = (bxvd) f.mo74142c(5);
                    bxvd.mo73625a((bxvk) f);
                    long d = mo8912d();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    din din2 = (din) bxvd.f164949b;
                    din din3 = din.f13229r;
                    din2.f13231a |= 4;
                    din2.f13234d = d;
                    din = (din) bxvd.mo74062i();
                    f13046d = din;
                    f13045c = din.f13238h;
                }
            }
        }
        return din;
    }

    /* renamed from: g */
    public final djy mo8915g() {
        djy djy = f13047j;
        if (djy == null) {
            synchronized (dfz.class) {
                djy = f13047j;
                if (djy == null) {
                    din f = mo8914f();
                    int i = f.f164961ai;
                    if (i == -1) {
                        i = bxxm.f165037a.mo74228a(f).mo74223b(f);
                        f.f164961ai = i;
                    }
                    brtj brtj = new brtj(i + i);
                    brtj.mo69889f(djh.m8640a(brtj, f));
                    ByteBuffer f2 = brtj.mo69888f();
                    f2.remaining();
                    djy djy2 = new djy();
                    f2.order(ByteOrder.LITTLE_ENDIAN);
                    djy2.__reset(f2.getInt(f2.position()) + f2.position(), f2);
                    f13047j = djy2;
                    djy = djy2;
                }
            }
        }
        return djy;
    }

    public final String toString() {
        String packageName = this.f13185e.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 14);
        sb.append("ContainerApk(");
        sb.append(packageName);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public dfz(Context context) {
        super(r0, 2, 0, context.getPackageName());
        Context context2;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null) {
            context2 = moduleContext.getBaseContext();
        } else {
            context2 = context;
        }
    }

    /* renamed from: a */
    public final ClassLoader mo8908a(ClassLoader classLoader) {
        return this.f13185e.getClassLoader();
    }

    /* renamed from: a */
    public final boolean mo8909a(djy djy) {
        if (mo8912d() == djy.mo9153d()) {
            int i = f13045c;
            if (i == -1) {
                synchronized (dfz.class) {
                    i = f13045c;
                    if (i == -1) {
                        i = this.f13185e.getPackageManager().getPackageInfo(((dhc) this).f13095a, 0).versionCode;
                        f13045c = i;
                    }
                }
            }
            if (i == djy.mo9157h()) {
                return true;
            }
        }
        return false;
    }
}
