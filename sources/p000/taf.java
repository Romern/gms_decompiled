package p000;

import android.os.Handler;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: taf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class taf extends tdl {

    /* renamed from: a */
    final /* synthetic */ ApiConsentChimeraActivity f45547a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public taf(ApiConsentChimeraActivity apiConsentChimeraActivity, Handler handler) {
        super(handler);
        this.f45547a = apiConsentChimeraActivity;
    }

    /* renamed from: a */
    public final void mo26315a(String str, ArrayList arrayList) {
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45547a;
        Logger Logger = ApiConsentChimeraActivity.f30509a;
        tdx tdx = apiConsentChimeraActivity.f30511c;
        tdx.f45713f = arrayList;
        tdx.f45712e = str;
        apiConsentChimeraActivity.f30514f.countDown();
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45547a;
        Logger Logger = ApiConsentChimeraActivity.f30509a;
        apiConsentChimeraActivity.f30513e.post(new tae(this));
    }
}
