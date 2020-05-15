package p000;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: jdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdg {

    /* renamed from: a */
    private static final Logger f22219a = jdh.m16547a("RecoverableKeyStoreGmsEventLogger");

    /* renamed from: a */
    public static void m16541a(int i) {
        bxvd da = boep.f132813j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boep boep = (boep) da.f164949b;
        boep.f132816b = 4;
        int i2 = boep.f132815a | 1;
        boep.f132815a = i2;
        boep.f132822h = 16;
        int i3 = i2 | 128;
        boep.f132815a = i3;
        boep.f132823i = i - 1;
        boep.f132815a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        m16544a(rpr.m34216b(), da);
    }

    /* renamed from: b */
    public static void m16545b(Context context, int i, int i2) {
        bxvd da = boep.f132813j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boep boep = (boep) da.f164949b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            boep.f132822h = i3;
            int i4 = boep.f132815a | 128;
            boep.f132815a = i4;
            boep.f132816b = 5;
            boep.f132815a = i4 | 1;
            int a = jcq.m16516a(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boep boep2 = (boep) da.f164949b;
            boep2.f132817c = a - 1;
            boep2.f132815a |= 2;
            m16544a(context, da);
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public static void m16546c(Context context, int i, int i2) {
        bxvd da = boep.f132813j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boep boep = (boep) da.f164949b;
        boep.f132816b = 3;
        int i3 = boep.f132815a | 1;
        boep.f132815a = i3;
        boep.f132822h = i2 - 1;
        int i4 = i3 | 128;
        boep.f132815a = i4;
        boep.f132819e = i - 1;
        int i5 = i4 | 16;
        boep.f132815a = i5;
        boep.f132815a = i5 | 32;
        boep.f132820f = false;
        m16544a(context, da);
    }

    /* renamed from: a */
    public static void m16542a(Context context, int i) {
        bxvd da = boep.f132813j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boep boep = (boep) da.f164949b;
        int i2 = 2;
        boep.f132816b = 2;
        int i3 = boep.f132815a | 1;
        boep.f132815a = i3;
        boep.f132822h = 5;
        int i4 = i3 | 128;
        boep.f132815a = i4;
        int i5 = i - 1;
        if (i != 0) {
            switch (i5) {
                case 1:
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
                case 8:
                    i2 = 9;
                    break;
                case 9:
                case 11:
                default:
                    i2 = 1;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 12:
                    i2 = 11;
                    break;
                case 13:
                    i2 = 12;
                    break;
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case 16:
                    i2 = 15;
                    break;
                case 17:
                    i2 = 16;
                    break;
            }
            boep.f132818d = i2 - 1;
            boep.f132815a = 4 | i4;
            m16544a(context, da);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m16543a(Context context, int i, int i2) {
        bxvd da = boep.f132813j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boep boep = (boep) da.f164949b;
        boep.f132822h = i2 - 1;
        int i3 = boep.f132815a | 128;
        boep.f132815a = i3;
        boep.f132816b = 1;
        boep.f132815a = i3 | 1;
        int a = jcq.m16516a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boep boep2 = (boep) da.f164949b;
        boep2.f132817c = a - 1;
        boep2.f132815a |= 2;
        m16544a(context, da);
    }

    /* renamed from: a */
    private static void m16544a(Context context, bxvd bxvd) {
        int i = -1;
        try {
            Collection allModules = ModuleManager.get(context).getAllModules();
            if (allModules != null && !allModules.isEmpty()) {
                Iterator it = allModules.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                        if (moduleInfo != null && moduleInfo.moduleId.equals("com.google.android.gms.auth_folsom")) {
                            i = moduleInfo.moduleVersion;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } catch (InvalidConfigException e) {
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boep boep = (boep) bxvd.f164949b;
        boep boep2 = boep.f132813j;
        boep.f132815a |= 64;
        boep.f132821g = i;
        bxvd da = boct.f132600I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct = (boct) da.f164949b;
        boct.f132612c = 38;
        boct.f132610a |= 1;
        boep boep3 = (boep) bxvd.mo74062i();
        boep3.getClass();
        boct.f132635z = boep3;
        boct.f132611b |= 16;
        new qws(context, "ANDROID_AUTH", null).mo24335a(((boct) da.mo74062i()).serializeToBytes()).mo24327b();
        f22219a.mo25412b("Event logged", new Object[0]);
    }
}
