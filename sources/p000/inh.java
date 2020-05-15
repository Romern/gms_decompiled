package p000;

import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;

/* renamed from: inh */
final /* synthetic */ class inh implements aubg {

    /* renamed from: a */
    private final ini f21383a;

    public inh(ini ini) {
        this.f21383a = ini;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        ini ini = this.f21383a;
        if (!aucb.mo50384b()) {
            if (((auck) aucb).f91396d) {
                return aucu.m76776a();
            }
            if (aucb.mo50387e() != null) {
                return aucu.m76777a(aucb.mo50387e());
            }
            return aucu.m76777a((Exception) new ExecutionException(new IllegalStateException("Task was not successful, but exception is null")));
        } else if (aucb.mo50386d() == null || ((Configurations) aucb.mo50386d()).f82074a == null) {
            return aucu.m76777a((Exception) new ExecutionException(new IllegalStateException("registerSync result was null")));
        } else {
            return ini.f21386b.mo25233a(((Configurations) aucb.mo50386d()).f82074a);
        }
    }
}
