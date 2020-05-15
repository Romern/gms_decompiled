package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.Configurations;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwn extends rvd {
    public rwn() {
        super("PhenotypeFallbackFix", 0);
    }

    /* renamed from: a */
    private static final Configurations m34571a(aucb aucb) {
        try {
            aucu.m76783a(aucb, 5000, TimeUnit.MILLISECONDS);
            return (Configurations) aucb.mo50386d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFallbackFix", "Retrieving configurations failed", e);
            return null;
        }
    }

    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        bngx bngx;
        String str;
        String str2;
        int i;
        String str3;
        Boolean bool;
        Log.i("PhenotypeFallbackFix", "Applying Phenotype flags fallback.");
        boolean u = cdkp.f181122a.mo6606a().mo77834u();
        Context context = rvl.f43760b;
        String str4 = !u ? "" : "(dry run) ";
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        try {
            bngs j = bngx.m109377j();
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto")) {
                for (zzu zzu : ((zzv) GeneratedMessageLite.m124014a(zzv.f56346b, moduleInfo.getMetadata(context).getByteArray("com.google.android.gms.phenotype.registration.proto"))).f56348a) {
                    if (!zzu.f56343g) {
                        j.mo67668c(zzu.f56338b);
                    } else {
                        String valueOf = String.valueOf(zzu.f56338b);
                        if (valueOf.length() == 0) {
                            new String("Disregarding optOutRegister package: ");
                        } else {
                            "Disregarding optOutRegister package: ".concat(valueOf);
                        }
                    }
                }
            }
            String valueOf2 = String.valueOf(j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 16);
            sb.append("Packages found: ");
            sb.append(valueOf2);
            sb.toString();
            bngx = j.mo67664a();
        } catch (bxwf | InvalidConfigException e) {
            Log.e("PhenotypeFallbackFix", "Error retrieving info from packages registered with phenotype", e);
            bngx = bngx.m109376e();
        }
        bnre i2 = bngx.listIterator();
        while (i2.hasNext()) {
            String str5 = (String) i2.next();
            if (cdkp.m133840g().length() > 0) {
                Iterator it = bmyx.m108640a(',').mo66918a((CharSequence) cdkp.m133840g()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str5.endsWith((String) it.next())) {
                            bool = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            bool = false;
            if (bool.booleanValue()) {
                StringBuilder sb2 = new StringBuilder(str4.length() + 30 + String.valueOf(str5).length());
                sb2.append(str4);
                sb2.append("Ignoring blacklisted package: ");
                sb2.append(str5);
                Log.i("PhenotypeFallbackFix", sb2.toString());
            } else if (!str5.startsWith("alt.")) {
                hashSet2.add(str5);
            } else {
                hashSet.add(str5.substring(4));
            }
        }
        hashSet2.removeAll(hashSet);
        bxvd da = bpup.f139273c.mo74144da();
        bxvd da2 = bpuo.f139269c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpuo bpuo = (bpuo) da2.f164949b;
        if (!bpuo.f139271a.mo73666a()) {
            bpuo.f139271a = GeneratedMessageLite.m124021a(bpuo.f139271a);
        }
        bxsy.m123078a(hashSet2, bpuo.f139271a);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpuo bpuo2 = (bpuo) da2.f164949b;
        if (!bpuo2.f139272b.mo73666a()) {
            bpuo2.f139272b = GeneratedMessageLite.m124021a(bpuo2.f139272b);
        }
        bxsy.m123078a(hashSet, bpuo2.f139272b);
        bpuo bpuo3 = (bpuo) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpup bpup = (bpup) da.f164949b;
        bpuo3.getClass();
        bpup.f139276b = bpuo3;
        bpup.f139275a = 1;
        aney a = anef.m64089a(context);
        Iterator it2 = hashSet.iterator();
        while (true) {
            str = "' failed";
            str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            String str6 = (String) it2.next();
            Configurations a2 = m34571a(a.mo25236a(str6, "", (String) null));
            if (a2 != null) {
                String str7 = a2.f82074a;
                String valueOf3 = String.valueOf(str6);
                Configurations a3 = m34571a(a.mo41760a(str6, valueOf3.length() == 0 ? new String("alt.") : "alt.".concat(valueOf3), "", str7));
                if (a3 != null) {
                    if (u || m34572a(context, a, str6, a3)) {
                        str = "' succeeded";
                    }
                    StringBuilder sb3 = new StringBuilder(str4.length() + 28 + String.valueOf(str6).length() + str.length());
                    sb3.append(str4);
                    sb3.append("Applying alternate config: '");
                    sb3.append(str6);
                    sb3.append(str);
                    Log.i("PhenotypeFallbackFix", sb3.toString());
                }
            }
        }
        for (String str8 : hashSet2) {
            Configurations a4 = m34571a(a.mo41760a(str8, "com.google.EMPTY", "", str2));
            if (a4 != null) {
                if (!u && !m34572a(context, a, str8, a4)) {
                    str3 = str;
                } else {
                    str3 = "' succeeded";
                }
                StringBuilder sb4 = new StringBuilder(str4.length() + 24 + String.valueOf(str8).length() + str3.length());
                sb4.append(str4);
                sb4.append("Applying empty config: '");
                sb4.append(str8);
                sb4.append(str3);
                Log.i("PhenotypeFallbackFix", sb4.toString());
                str2 = null;
            } else {
                str2 = null;
            }
        }
        Log.i("PhenotypeFallbackFix", str4.concat("Done applying Phenotype fallback fix."));
        if (!u) {
            i = 3;
        } else {
            i = 2;
        }
        rvk d = rvl.mo25205d();
        d.mo25200a(this, i, (bpup) da.mo74062i());
        return d.mo25198a();
    }

    /* renamed from: a */
    static final boolean m34572a(Context context, aney aney, String str, Configurations configurations) {
        return new rwm(context, aney, str, configurations).mo25219a("");
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdkp.f181122a.mo6606a().mo77835v();
    }
}
