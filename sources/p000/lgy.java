package p000;

import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;

/* renamed from: lgy */
final /* synthetic */ class lgy implements bqeh {

    /* renamed from: a */
    private final lhe f26068a;

    /* renamed from: b */
    private final AssistStructure f26069b;

    /* renamed from: c */
    private final lgv f26070c;

    /* renamed from: d */
    private final int f26071d;

    /* renamed from: e */
    private final bmza f26072e;

    public lgy(lhe lhe, AssistStructure assistStructure, lgv lgv, int i, bmza bmza) {
        this.f26068a = lhe;
        this.f26069b = assistStructure;
        this.f26070c = lgv;
        this.f26071d = i;
        this.f26072e = bmza;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Intent intent;
        lhe lhe = this.f26068a;
        AssistStructure assistStructure = this.f26069b;
        lgv lgv = this.f26070c;
        int i = this.f26071d;
        bmza bmza = this.f26072e;
        kep kep = (kep) obj;
        if (kep.f23945a != 2) {
            return bqga.m112777a((Throwable) kep);
        }
        lhe.f26092d.mo15101a(kdi.f23885a);
        Context context = lhe.f26090b;
        if (ccjf.m130037g()) {
            intent = lio.m19199b(assistStructure, lgv.f26063b.mo7976b(), i).addFlags(268435456);
        } else {
            intent = lio.m19196a(assistStructure, lgv.f26063b.mo7976b(), i).addFlags(268435456);
        }
        context.startActivity(intent);
        lhe.mo15071a(bmza, lgv.f26063b.f11673e);
        return bqga.m112775a((Object) true);
    }
}
