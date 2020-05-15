package p000;

import android.content.Context;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.Executor;

/* renamed from: ahuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahuu {

    /* renamed from: a */
    public final Context f68116a;

    /* renamed from: b */
    public long f68117b = -2147483648L;

    /* renamed from: c */
    private final Executor f68118c = snp.m35704b(10);

    public ahuu(Context context) {
        this.f68116a = ModuleContext.getModuleContext(context);
    }

    /* renamed from: a */
    public static void m56679a(Context context, bvin bvin) {
        if (context != null) {
            context.startService(butb.m120414a(context, bvin));
        }
    }

    /* renamed from: b */
    public final boolean mo37180b() {
        ModuleManager moduleManager = ModuleManager.get(this.f68116a);
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion("fast_pair");
        int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("loadFastPairModule: checkFeaturesAreAvailable:%d", checkFeaturesAreAvailable);
        return checkFeaturesAreAvailable == 0;
    }

    /* renamed from: a */
    public final void mo37179a() {
        this.f68118c.execute(new ahus(this, new ahut()));
    }
}
