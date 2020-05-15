package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: angg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angg {

    /* renamed from: a */
    public static final /* synthetic */ int f76803a = 0;

    /* renamed from: b */
    private static final srn f76804b = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: c */
    private final aney f76805c;

    /* renamed from: d */
    private final Context f76806d;

    public angg(aney aney, Context context) {
        this.f76805c = aney;
        this.f76806d = context;
    }

    /* renamed from: c */
    private final int m64200c() {
        try {
            return ModuleManager.get(this.f76806d).getCurrentModule().moduleVersion;
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f76804b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("angg", "c", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Problem to get module version");
            return 1;
        }
    }

    /* renamed from: a */
    public final void mo41780a() {
        aytw.m84814b();
        new anfb(this.f76805c, "com.google.android.gms.phenotype", this.f76806d.createDeviceProtectedStorageContext().getSharedPreferences("com.google.android.gms.phenotype", 0)).mo25219a("");
    }

    /* renamed from: b */
    public final void mo41782b() {
        int i;
        aney aney = this.f76805c;
        try {
            i = ModuleManager.get(this.f76806d).getCurrentModule().moduleVersion;
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f76804b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("angg", "c", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Problem to get module version");
            i = 1;
        }
        try {
            aucu.m76783a(aney.mo25235a("com.google.android.gms.phenotype", i, new String[]{"PHENOTYPE", "PHENOTYPE_COUNTERS"}, new int[0]), cgec.m144831f(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            bnsl bnsl2 = (bnsl) f76804b.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("angg", "b", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Phenotype registration failed");
        }
    }

    /* renamed from: a */
    public final void mo41781a(String str) {
        if (str == null || str.equals("com.google.android.gms.phenotype")) {
            mo41780a();
        }
    }
}
