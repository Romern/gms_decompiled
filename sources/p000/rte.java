package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.Set;

/* renamed from: rte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rte {

    /* renamed from: a */
    private final Context f43646a;

    /* renamed from: b */
    private final aney f43647b;

    public rte(Context context, aney aney) {
        this.f43646a = context;
        this.f43647b = aney;
    }

    /* renamed from: b */
    private final Set m34388b() {
        Set b = sqw.m36045b();
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(this.f43646a).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto")) {
                for (zzu zzu : ((zzv) bxvk.m124014a(zzv.f56346b, moduleInfo.getMetadata(this.f43646a).getByteArray("com.google.android.gms.phenotype.registration.proto"))).f56348a) {
                    if (!zzu.f56344h) {
                        b.add(zzu);
                    }
                }
            }
        } catch (bxwf | InvalidConfigException | RuntimeException e) {
            Log.e("PhenotypeCommitHelper", "Error register phenotype info", e);
        }
        return b;
    }

    /* renamed from: c */
    private final boolean m34389c(String str) {
        anfa anfa;
        if ("com.google.android.gms".equals(str) || "com.google.android.gms".equals(str)) {
            anfa = new anfb(this.f43647b, str, ssv.m36268b(str), this.f43646a);
        } else {
            anfa = new rtd(this.f43647b, str);
        }
        return anfa.mo25219a("");
    }

    /* renamed from: a */
    public final Set mo25083a() {
        Set b = sqw.m36045b();
        for (zzu zzu : m34388b()) {
            if (m34389c(zzu.f56338b)) {
                b.add(zzu);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final boolean mo25084a(String str) {
        zzu b = mo25085b(str);
        if (b != null) {
            return m34389c(b.f56338b);
        }
        return false;
    }

    /* renamed from: b */
    public final zzu mo25085b(String str) {
        for (zzu zzu : m34388b()) {
            if (zzu.f56338b.equals(str)) {
                return zzu;
            }
        }
        return null;
    }
}
