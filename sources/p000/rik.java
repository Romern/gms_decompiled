package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;

/* renamed from: rik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rik {

    /* renamed from: a */
    private static volatile rik f43057a;

    private rik() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [java.lang.String, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: a */
    public static final bpvc m33636a(Context context) {
        int i;
        int i2;
        File[] listFiles;
        String packageName = context.getPackageName();
        int a = bpuv.m112309a(stu.m36322h());
        int i3 = 1;
        if (a == 0) {
            a = 1;
        }
        int a2 = bpvb.m112315a(stu.m36324j());
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = bpuy.m112312a(stu.m36325k());
        if (a3 == 0) {
            a3 = 1;
        }
        bxvd da = bpvc.f139295q.mo74144da();
        String f = spn.m35885f(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc = (bpvc) da.f164949b;
        f.getClass();
        bpvc.f139297a |= 1;
        bpvc.f139298b = f;
        long g = stu.m36321g();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc2 = (bpvc) da.f164949b;
        int i4 = bpvc2.f139297a | 2;
        bpvc2.f139297a = i4;
        bpvc2.f139299c = g;
        bpvc2.f139300d = a - 1;
        int i5 = i4 | 4;
        bpvc2.f139297a = i5;
        bpvc2.f139301e = a2 - 1;
        int i6 = i5 | 8;
        bpvc2.f139297a = i6;
        bpvc2.f139302f = a3 - 1;
        bpvc2.f139297a = i6 | 16;
        bxvd da2 = bpvq.f139403h.mo74144da();
        String property = System.getProperty("java.vm.version");
        if (property != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvq bpvq = (bpvq) da2.f164949b;
            property.getClass();
            bpvq.f139405a |= 1;
            bpvq.f139406b = property;
        }
        String property2 = System.getProperty("java.vm.vendor");
        if (property2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvq bpvq2 = (bpvq) da2.f164949b;
            property2.getClass();
            bpvq2.f139405a |= 2;
            bpvq2.f139407c = property2;
        }
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvq bpvq3 = (bpvq) da2.f164949b;
            property3.getClass();
            bpvq3.f139405a |= 4;
            bpvq3.f139408d = property3;
        }
        String property4 = System.getProperty("java.vm.specification.version");
        if (property4 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvq bpvq4 = (bpvq) da2.f164949b;
            property4.getClass();
            bpvq4.f139405a |= 8;
            bpvq4.f139409e = property4;
        }
        String property5 = System.getProperty("java.vm.specification.vendor");
        if (property5 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvq bpvq5 = (bpvq) da2.f164949b;
            property5.getClass();
            bpvq5.f139405a |= 16;
            bpvq5.f139410f = property5;
        }
        String property6 = System.getProperty("java.vm.specification.name");
        if (property6 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvq bpvq6 = (bpvq) da2.f164949b;
            property6.getClass();
            bpvq6.f139405a |= 32;
            bpvq6.f139411g = property6;
        }
        bpvq bpvq7 = (bpvq) da2.mo74062i();
        int size = soz.m35801d(context, packageName).size();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc3 = (bpvc) da.f164949b;
        bpvc3.f139297a |= 64;
        bpvc3.f139304h = size;
        try {
            PackageInfo b = svr.m36484b(context).mo26176b(packageName, 0);
            rfz.m33557a(context);
            if (rfz.m33558b(b, false)) {
                i = 2;
            } else if (rfz.m33558b(b, true)) {
                i = 3;
            } else {
                i = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            i = 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc4 = (bpvc) da.f164949b;
        bpvc4.f139305i = i - 1;
        bpvc4.f139297a |= 128;
        try {
            i2 = svr.m36484b(context).mo26172a(packageName, 0).flags;
        } catch (PackageManager.NameNotFoundException e2) {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc5 = (bpvc) da.f164949b;
        bpvc5.f139297a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bpvc5.f139306j = i2;
        String a4 = ssj.m36229a(context, "gmscore");
        if (a4 == null) {
            File a5 = ssj.m36227a(context);
            if (!(a5 == null || !a5.exists() || (listFiles = a5.listFiles()) == null)) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        String[] list = listFiles[i7].list();
                        if (list != null && list.length > 0) {
                            i3 = 5;
                            break;
                        }
                        i7++;
                    }
                }
            }
            try {
                ApplicationInfo a6 = svr.m36484b(context).mo26172a(packageName, 0);
                i3 = !new File(a6.nativeLibraryDir, "libgmscore.so").exists() ? 2 : (a6.flags & 128) != 0 ? 4 : 3;
            } catch (PackageManager.NameNotFoundException e3) {
            }
        } else if (!a4.startsWith("/system")) {
            File a7 = ssj.m36227a(context);
            i3 = a7 != null ? !a4.startsWith(a7.getAbsolutePath()) ? 4 : 5 : 4;
        } else {
            i3 = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc6 = (bpvc) da.f164949b;
        bpvc6.f139307k = i3 - 1;
        bpvc6.f139297a |= 512;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc7 = (bpvc) da.f164949b;
        bpvc7.f139297a |= 8192;
        bpvc7.f139308l = j;
        boolean d = sre.m36084d(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc8 = (bpvc) da.f164949b;
        bpvc8.f139297a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bpvc8.f139309m = d;
        if (((Boolean) rsv.f43637z.mo25081c()).booleanValue()) {
            Resources resources = context.getResources();
            String language = resources.getConfiguration().locale.getLanguage();
            if (bqxw.m113734a(resources, language, packageName)) {
                TypedValue typedValue = new TypedValue();
                try {
                    resources.getValue(String.valueOf(context.getPackageName()).concat(":current_locale_sanity_check"), typedValue, false);
                } catch (Resources.NotFoundException e4) {
                    typedValue.string = null;
                }
                String charSequence = typedValue.string != null ? typedValue.string.toString() : "??";
                if (!language.equals(charSequence)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpvc bpvc9 = (bpvc) da.f164949b;
                    language.getClass();
                    int i8 = bpvc9.f139297a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    bpvc9.f139297a = i8;
                    bpvc9.f139310n = language;
                    charSequence.getClass();
                    bpvc9.f139297a = 262144 | i8;
                    bpvc9.f139311o = charSequence;
                }
            }
        }
        String installerPackageName = context.getPackageManager().getInstallerPackageName("com.google.android.gms");
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvc bpvc10 = (bpvc) da.f164949b;
        installerPackageName.getClass();
        int i9 = bpvc10.f139297a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpvc10.f139297a = i9;
        bpvc10.f139312p = installerPackageName;
        bpvq7.getClass();
        bpvc10.f139303g = bpvq7;
        bpvc10.f139297a = i9 | 32;
        return (bpvc) da.mo74062i();
    }

    /* renamed from: a */
    public static rik m33637a() {
        rik rik = f43057a;
        if (rik != null) {
            return rik;
        }
        rik rik2 = new rik();
        f43057a = rik2;
        return rik2;
    }

    /* renamed from: a */
    public static final void m33638a(Context context, int i, int i2, bpwi bpwi) {
        bxvd da = bpvf.f139321t.mo74144da();
        bpvc a = m33636a(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvf bpvf = (bpvf) da.f164949b;
        a.getClass();
        bpvf.f139324b = a;
        int i3 = bpvf.f139323a | 1;
        bpvf.f139323a = i3;
        bpwi.getClass();
        bpvf.f139325c = bpwi;
        bpvf.f139323a = i3 | 2;
        if (sft.f44147a.mo25488a()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvf bpvf2 = (bpvf) da.f164949b;
            bpvf2.f139323a |= 8;
            bpvf2.f139330h = true;
        }
        if (i == 1) {
            m33640a(context, "system_health", ((bpvf) da.mo74062i()).mo73642k());
            return;
        }
        if (i2 >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvf bpvf3 = (bpvf) da.f164949b;
            bpvf3.f139323a |= 32;
            bpvf3.f139332j = i2;
        }
        qwo a2 = sfa.m35133a().mo25463b(context).mo24335a(((bpvf) da.mo74062i()).mo73642k());
        cagz cagz = cagz.DEFAULT;
        if (soz.m35800c(context) && (i == 8 || i == 10)) {
            cagz = cagz.FAST_IF_RADIO_AWAKE;
        }
        if (i == 8) {
            a2.mo24329b("system_health");
        }
        a2.mo24328b(i - 1);
        a2.f42322f = cagz;
        a2.mo24327b();
    }

    /* renamed from: a */
    public static final void m33639a(Context context, int i, bpwi bpwi) {
        m33638a(context, i, -1, bpwi);
    }

    /* renamed from: a */
    public static final void m33640a(Context context, String str, byte[] bArr) {
        qwo a = sfa.m35133a().mo25463b(context).mo24335a(bArr);
        a.mo24329b(str);
        a.mo24327b();
    }
}
