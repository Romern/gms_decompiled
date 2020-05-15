package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: dok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dok {

    /* renamed from: a */
    public final boolean[] f13706a = new boolean[5];

    /* renamed from: b */
    public HashMap f13707b;

    /* renamed from: c */
    private final dov f13708c;

    public dok(bxco bxco) {
        dov dov;
        mo9345a();
        dwq.m9656af();
        int i = bxco.f162973bD;
        if (doi.m8936a(i)) {
            dov = new dox();
        } else if (doi.m8938b(i)) {
            dov = new dor();
        } else if (doi.m8939c(i)) {
            dov = new dow();
        } else if (sqc.m35957a(doi.f13696f, i)) {
            dov = new dou();
        } else if (sqc.m35957a(doi.f13697g, i)) {
            dov = new dos();
        } else {
            dov = doi.m8941e(i) ? new dot() : null;
        }
        this.f13708c = dov;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final int mo9344a(int i, ContextManagerClientInfo contextManagerClientInfo) {
        dov dov = this.f13708c;
        if (dov == null) {
            return 1;
        }
        if (i == 0) {
            return dov.mo9358c(contextManagerClientInfo);
        }
        if (i == 1) {
            return dov.mo9359d(contextManagerClientInfo);
        }
        if (i == 2) {
            return dov.mo9357b(contextManagerClientInfo);
        }
        if (i == 3) {
            return dov.mo9356a(contextManagerClientInfo);
        }
        if (i == 4) {
            return dov.mo9360e(contextManagerClientInfo);
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("dov", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68413a("[ContextSpecificAclFactory] Unknown permission: %s, clientInfo=%s", i, (Object) contextManagerClientInfo);
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(boolean[], int, int, boolean):void}
     arg types: [boolean[], int, int, int]
     candidates:
      ClspMth{java.util.Arrays.fill(java.lang.Object[], int, int, java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int, int, int):void}
      ClspMth{java.util.Arrays.fill(char[], int, int, char):void}
      ClspMth{java.util.Arrays.fill(byte[], int, int, byte):void}
      ClspMth{java.util.Arrays.fill(long[], int, int, long):void}
      ClspMth{java.util.Arrays.fill(double[], int, int, double):void}
      ClspMth{java.util.Arrays.fill(float[], int, int, float):void}
      ClspMth{java.util.Arrays.fill(short[], int, int, short):void}
      ClspMth{java.util.Arrays.fill(boolean[], int, int, boolean):void} */
    /* renamed from: a */
    public final void mo9345a() {
        this.f13707b = new HashMap();
        Arrays.fill(this.f13706a, 0, 5, false);
    }
}
