package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.List;
import java.util.Set;

/* renamed from: rtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rtf {

    /* renamed from: a */
    static final String[] f43648a = {"GMS_CORE", "GMSCORE_ANDROID_PRIMES", "GMSCORE_SCHEDULER_EVENT"};

    /* renamed from: b */
    private static final String[] f43649b = new String[0];

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqw.a(int, boolean, java.lang.Object[]):java.util.Set
     arg types: [int, int, java.lang.String[]]
     candidates:
      sqw.a(java.lang.Object, java.lang.Object, java.lang.Object):java.util.Set
      sqw.a(int, boolean, java.lang.Object[]):java.util.Set */
    /* renamed from: a */
    public static List m34393a(Context context, zzv zzv, int i) {
        String[] strArr;
        Set set;
        zzv zzv2 = zzv;
        if (zzv2 == null || zzv2.f56348a.size() == 0) {
            return bngx.m109376e();
        }
        List a = sqw.m36032a(zzv2.f56348a.size());
        bxwc bxwc = zzv2.f56348a;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzu zzu = (zzu) bxwc.get(i2);
            String str = zzu.f56338b;
            bxwc bxwc2 = zzu.f56339c;
            int i3 = 1;
            if (str.startsWith("alt.")) {
                strArr = f43649b;
            } else if (!bxwc2.isEmpty()) {
                int length = f43648a.length + bxwc2.size();
                String[] strArr2 = f43648a;
                int length2 = strArr2.length;
                int max = Math.max(length, length2);
                if (max == 0) {
                    set = sqw.m36045b();
                } else if (length2 == 0) {
                    set = sqw.m36046b(length);
                } else {
                    set = sqw.m36037a(max, true, (Object[]) strArr2);
                }
                set.addAll(bxwc2);
                strArr = (String[]) set.toArray(new String[set.size()]);
            } else {
                strArr = f43648a;
            }
            RegistrationInfo registrationInfo = new RegistrationInfo(str, i, strArr, zzu.f56341e.mo73780k(), zzu.f56342f, bqcn.m112584a(zzu.f56340d), "com.google.android.gms");
            if ("com.google.android.gms".equals(zzu.f56338b)) {
                bxvd da = bqzu.f142084g.mo74144da();
                String i4 = stu.m36323i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqzu bqzu = (bqzu) da.f164949b;
                i4.getClass();
                bqzu.f142086a |= 2;
                bqzu.f142089d = i4;
                bxvd da2 = qhd.f41286y.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qhd qhd = (qhd) da2.f164949b;
                qhd.f41288b = 0;
                int i5 = qhd.f41287a | 1;
                qhd.f41287a = i5;
                qhd.f41289c = 0;
                int i6 = i5 | 2;
                qhd.f41287a = i6;
                qhd.f41290d = 0;
                int i7 = i6 | 4;
                qhd.f41287a = i7;
                qhd.f41291e = 0;
                int i8 = i7 | 8;
                qhd.f41287a = i8;
                int i9 = i8 | 32;
                qhd.f41287a = i9;
                qhd.f41293g = false;
                int i10 = i9 | 64;
                qhd.f41287a = i10;
                qhd.f41294h = false;
                int i11 = i10 | 128;
                qhd.f41287a = i11;
                qhd.f41295i = 0;
                qhd.f41287a = i11 | 1024;
                qhd.f41298l = 0;
                srd.m36074a(context, da2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((qhd) da2.f164949b).f41299m = bxvk.m124030de();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((qhd) da2.f164949b).f41301o = bxvk.m124030de();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((qhd) da2.f164949b).f41304r = bxvk.m124030de();
                qhd qhd2 = (qhd) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqzu bqzu2 = (bqzu) da.f164949b;
                qhd2.getClass();
                bqzu2.f142087b = qhd2;
                bqzu2.f142086a |= 1;
                for (ModuleManager.ModuleSetInfo moduleSetInfo : ModuleManager.get(context).getCurrentConfig().moduleSets) {
                    String str2 = moduleSetInfo.moduleSetId;
                    long j = (long) moduleSetInfo.moduleSetVariant;
                    str2.getClass();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqzu bqzu3 = (bqzu) da.f164949b;
                    bxww bxww = bqzu3.f142088c;
                    if (!bxww.f165014a) {
                        bqzu3.f142088c = bxww.mo74203a();
                    }
                    bqzu3.f142088c.put(str2, Long.valueOf(j));
                }
                if (cdmk.f181238a.mo6606a().mo77898c()) {
                    int i12 = Build.VERSION.SDK_INT;
                    int i13 = Settings.Global.getInt(context.getContentResolver(), "device_provisioned", -1);
                    int i14 = 3;
                    if (i13 > 0) {
                        i3 = 3;
                    } else if (i13 == 0) {
                        i3 = 2;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqzu bqzu4 = (bqzu) da.f164949b;
                    bqzu4.f142090e = i3 - 1;
                    bqzu4.f142086a |= 4;
                    if ((context.getApplicationInfo().flags & 128) == 0) {
                        i14 = 2;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqzu bqzu5 = (bqzu) da.f164949b;
                    bqzu5.f142091f = i14 - 1;
                    bqzu5.f142086a |= 8;
                }
                a.add(new RegistrationInfo(registrationInfo.f82115a, registrationInfo.f82116b, registrationInfo.f82117c, ((bqzu) da.mo74062i()).mo73642k(), registrationInfo.f82119e, registrationInfo.f82120f, registrationInfo.f82121g));
            } else if (!zzu.f56343g) {
                a.add(registrationInfo);
            }
        }
        return a;
    }
}
