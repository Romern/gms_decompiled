package p000;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: vya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vya {

    /* renamed from: a */
    private final Context f50216a;

    /* renamed from: b */
    private final vyn f50217b;

    /* renamed from: c */
    private final String f50218c;

    public vya(Context context, vyn vyn) {
        this.f50216a = context;
        this.f50217b = vyn;
        String b = vwg.m41490b(context);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 83);
        sb.append(b);
        sb.append("/androidantiabuse/v1/x/create?alt=PROTO&key=AIzaSyBofcZsgLSS7BOnBjZPEkk4rYwzOIz-lTI");
        this.f50218c = sb.toString();
        vwg.m41489a(context);
    }

    /* renamed from: a */
    public final vxz mo28947a(String str) {
        int i;
        vxz vxz = new vxz(str);
        bxvd bxvd = vxz.f50215a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        vvt vvt = (vvt) bxvd.f164949b;
        vvt vvt2 = vvt.f50051p;
        "20.15.15 (120300-{{cl}})".getClass();
        vvt.f50053a |= 4;
        vvt.f50057e = "20.15.15 (120300-{{cl}})";
        try {
            Collection allModules = ModuleManager.get(this.f50216a).getAllModules();
            if (allModules != null && !allModules.isEmpty()) {
                Iterator it = allModules.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                    if (moduleInfo.moduleId.equals("com.google.android.gms.droidguard")) {
                        i = moduleInfo.moduleVersion;
                        break;
                    }
                }
            }
        } catch (InvalidConfigException e) {
        }
        i = 0;
        if (i != 0) {
            bxvd bxvd2 = vxz.f50215a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            vvt vvt3 = (vvt) bxvd2.f164949b;
            vvt3.f50053a |= 8;
            vvt3.f50058f = i;
        }
        boolean a = sre.m36080a(this.f50216a);
        bxvd bxvd3 = vxz.f50215a;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        vvt vvt4 = (vvt) bxvd3.f164949b;
        vvt4.f50053a |= 32;
        vvt4.f50060h = a;
        boolean c = soz.m35800c(this.f50216a);
        bxvd bxvd4 = vxz.f50215a;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        vvt vvt5 = (vvt) bxvd4.f164949b;
        vvt5.f50053a |= 16;
        vvt5.f50059g = c;
        return vxz;
    }

    /* renamed from: a */
    public final vyi mo28948a(vvt vvt) {
        return mo28949a(vvt, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final vyi mo28949a(vvt vvt, abpc abpc) {
        vvu vvu = (vvu) GeneratedMessageLite.m124007a(vvu.f50069c, vwg.m41487a(this.f50218c, vvt.mo73639aL(), abpc));
        vyn vyn = this.f50217b;
        vvz vvz = vvt.f50054b;
        if (vvz == null) {
            vvz = vvz.f50100d;
        }
        String str = vvz.f50103b;
        return new vyi(vyn, vvu);
    }
}
