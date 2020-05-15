package p000;

import android.content.Context;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: lkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lkp implements kqn {

    /* renamed from: a */
    public static final srn f26261a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final Context f26262b;

    /* renamed from: c */
    private final kqn f26263c;

    public lkp(Context context, kqn kqn) {
        this.f26262b = context;
        this.f26263c = kqn;
    }

    /* renamed from: a */
    public final kqm mo14815a(kql kql) {
        ((bnsl) f26261a.mo68387b()).mo68405a("Non async fill called.");
        return kqm.m18348a(bnoj.f131912b, bnoj.f131912b);
    }

    /* renamed from: b */
    public final bqgg mo14816b(kql kql) {
        bngx bngx = kql.mo14782a().f11641a;
        if (bngx.size() <= 1) {
            kpb[] kpbArr = {kpb.USERNAME, kpb.PASSWORD};
            int size = bngx.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!(!Collections.disjoint(((FillField) bngx.get(i)).f11634d, Arrays.asList(kpbArr)))) {
                    i = i2;
                }
            }
            if (kql.mo14784c().isEmpty()) {
                ((bnsl) f26261a.mo68387b()).mo68405a("No data entries received.");
                return bqga.m112775a(kqm.m18348a(bnoj.f131912b, bnoj.f131912b));
            }
            kct kct = (kct) kql.mo14784c().mo67639g().get(0);
            if (kct.mo14368a() instanceof Credential) {
                return bqdx.m112673a(aih.m807a(new lkk(this.f26262b)), new lkj(this, bngx, kct), bqfb.INSTANCE);
            }
            ((bnsl) f26261a.mo68387b()).mo68405a("Data is not a credential.");
            return bqga.m112775a(kqm.m18348a(bnoj.f131912b, bnoj.f131912b));
        }
        return this.f26263c.mo14816b(kql);
    }
}
