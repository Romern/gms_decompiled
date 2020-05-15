package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.lang.ref.WeakReference;

/* renamed from: anfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfd {

    /* renamed from: a */
    private static final srn f76761a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private static WeakReference f76762b;

    /* renamed from: a */
    public static final bxvd m64145a(Context context) {
        bxvd da = caig.f174681k.mo74144da();
        try {
            int i = ModuleManager.get(context).getCurrentModule().moduleVersion;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caig caig = (caig) da.f164949b;
            caig.f174683a |= 1;
            caig.f174684b = i;
        } catch (RuntimeException e) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caig caig2 = (caig) da.f164949b;
            caig2.f174683a |= 1;
            caig2.f174684b = -1000;
            bnsl bnsl = (bnsl) f76761a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("anfd", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Problem to get module version");
        }
        return da;
    }

    /* renamed from: a */
    public static qws m64146a() {
        qws qws;
        WeakReference weakReference = f76762b;
        if (weakReference != null) {
            qws = (qws) weakReference.get();
        } else {
            qws = null;
        }
        if (qws != null) {
            return qws;
        }
        qws qws2 = new qws(rpr.m34216b(), "PHENOTYPE", null);
        qws2.mo24337a(cagz.UNMETERED_OR_DAILY);
        f76762b = new WeakReference(qws2);
        return qws2;
    }
}
