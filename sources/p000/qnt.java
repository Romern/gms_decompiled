package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: qnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnt {

    /* renamed from: a */
    public static final bdyx f41798a;

    /* renamed from: b */
    private static final bdyw f41799b;

    static {
        bdyw b = new bdyw(anef.m64088a("com.google.android.gms.chimera")).mo58443a().mo58451b("OptionalModules__");
        f41799b = b;
        f41798a = bdyx.m91611a(b, "module_set_list", qlk.f41645a);
    }

    /* renamed from: a */
    public static Long m32526a(Context context) {
        try {
            return (Long) aucu.m76783a(anef.m64089a(context).mo41757a(), cdji.f180981a.mo6606a().mo77685n(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = r4.moduleVersion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r2 = r6;
     */
    /* renamed from: b */
    public static byte[] m32529b(Context context) {
        zzu zzu;
        bxwf e;
        try {
            zzu zzu2 = null;
            int i = -1;
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto")) {
                byte[] byteArray = moduleInfo.getMetadata(context).getByteArray("com.google.android.gms.phenotype.registration.proto");
                bmzs.m108696a(byteArray);
                try {
                    Iterator it = ((zzv) GeneratedMessageLite.m124016a(zzv.f56346b, byteArray, bxus.m123743b())).f56348a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zzu = (zzu) it.next();
                        if ("com.google.android.gms".equals(zzu.f56338b)) {
                            try {
                                break;
                            } catch (bxwf e2) {
                                e = e2;
                                String str = moduleInfo.moduleId;
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
                                sb.append("Skipping module ");
                                sb.append(str);
                                sb.append(": ");
                                sb.append(valueOf);
                                Log.w("ChimeraPhHelper", sb.toString());
                                zzu2 = zzu;
                            }
                        }
                    }
                } catch (bxwf e3) {
                    zzu = zzu2;
                    e = e3;
                    String str2 = moduleInfo.moduleId;
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 18 + String.valueOf(valueOf2).length());
                    sb2.append("Skipping module ");
                    sb2.append(str2);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    Log.w("ChimeraPhHelper", sb2.toString());
                    zzu2 = zzu;
                }
            }
            if (zzu2 != null) {
                m32528a(context, anef.m64089a(context), zzu2, i);
                int i2 = 0;
                while (((long) i2) <= cdji.m133562c()) {
                    byte[] bArr = (byte[]) qlk.f41648d.mo58455c();
                    if (bArr != qlk.f41645a) {
                        return bArr;
                    }
                    try {
                        Thread.sleep(5000);
                        i2++;
                    } catch (InterruptedException e4) {
                        Thread.interrupted();
                    }
                }
                throw new qns();
            }
            throw new qns("unable to find registration info");
        } catch (InvalidConfigException e5) {
            throw new qns(1, e5);
        }
    }

    /* renamed from: a */
    public static void m32527a(Context context, int i) {
        aney a = anef.m64089a(context);
        bxvd da = zzu.f56335j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zzu zzu = (zzu) da.f164949b;
        "com.google.android.gms.chimera".getClass();
        zzu.f56337a |= 1;
        zzu.f56338b = "com.google.android.gms.chimera";
        "chimera".getClass();
        if (!zzu.f56339c.mo73666a()) {
            zzu.f56339c = GeneratedMessageLite.m124021a(zzu.f56339c);
        }
        zzu.f56339c.add("chimera");
        bxvd da2 = qhd.f41286y.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qhd qhd = (qhd) da2.f164949b;
        qhd.f41288b = 0;
        int i2 = qhd.f41287a | 1;
        qhd.f41287a = i2;
        qhd.f41289c = 0;
        int i3 = i2 | 2;
        qhd.f41287a = i3;
        qhd.f41290d = 0;
        int i4 = i3 | 4;
        qhd.f41287a = i4;
        qhd.f41291e = 0;
        int i5 = i4 | 8;
        qhd.f41287a = i5;
        int i6 = i5 | 32;
        qhd.f41287a = i6;
        qhd.f41293g = false;
        int i7 = i6 | 64;
        qhd.f41287a = i7;
        qhd.f41294h = false;
        int i8 = i7 | 128;
        qhd.f41287a = i8;
        qhd.f41295i = 0;
        qhd.f41287a = i8 | 1024;
        qhd.f41298l = 0;
        srd.m36074a(context, da2);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((qhd) da2.f164949b).f41299m = GeneratedMessageLite.m124030de();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((qhd) da2.f164949b).f41301o = GeneratedMessageLite.m124030de();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((qhd) da2.f164949b).f41304r = GeneratedMessageLite.m124030de();
        bxvd da3 = bqzv.f142093e.mo74144da();
        long j = (long) i;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bqzv bqzv = (bqzv) da3.f164949b;
        bqzv.f142095a |= 4;
        bqzv.f142098d = j;
        String i9 = stu.m36323i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bqzv bqzv2 = (bqzv) da3.f164949b;
        i9.getClass();
        bqzv2.f142095a |= 2;
        bqzv2.f142097c = i9;
        qhd qhd2 = (qhd) da2.mo74062i();
        qhd2.getClass();
        bqzv2.f142096b = qhd2;
        bqzv2.f142095a |= 1;
        ByteString aL = ((bqzv) da3.mo74062i()).mo73639aL();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zzu zzu2 = (zzu) da.f164949b;
        aL.getClass();
        zzu2.f56337a |= 2;
        zzu2.f56341e = aL;
        m32528a(context, a, (zzu) da.mo74062i(), 0);
        try {
            aucu.m76783a(a.mo41759a("com.google.android.gms.chimera", ""), cdot.f181447a.mo6606a().mo78084c(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            throw new qns(4, e);
        } catch (TimeoutException e2) {
            throw new qns(5, e2);
        }
    }

    /* renamed from: a */
    private static void m32528a(Context context, aney aney, zzu zzu, int i) {
        try {
            bxvd da = zzv.f56346b.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            zzv zzv = (zzv) da.f164949b;
            zzu.getClass();
            if (!zzv.f56348a.mo73666a()) {
                zzv.f56348a = GeneratedMessageLite.m124021a(zzv.f56348a);
            }
            zzv.f56348a.add(zzu);
            List a = rtf.m34393a(context, (zzv) da.mo74062i(), i);
            if (a.size() == 1) {
                RegistrationInfo registrationInfo = (RegistrationInfo) a.get(0);
                try {
                    aucu.m76783a(aney.mo41758a(registrationInfo.f82115a, registrationInfo.f82116b, registrationInfo.f82117c, registrationInfo.f82118d, ""), cdjh.f180979a.mo6606a().mo77731K(), TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException e) {
                    throw new qns(2, e);
                } catch (TimeoutException e2) {
                    throw new qns(3, e2);
                }
            } else {
                int size = a.size();
                StringBuilder sb = new StringBuilder(43);
                sb.append("Wrong number of registrations (");
                sb.append(size);
                sb.append(")");
                throw new qns(sb.toString());
            }
        } catch (InvalidConfigException e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb2.append("Failed to process registration proto: ");
            sb2.append(valueOf);
            throw new qns(sb2.toString());
        }
    }
}
