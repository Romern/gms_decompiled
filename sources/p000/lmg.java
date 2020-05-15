package p000;

import android.app.assist.AssistStructure;
import android.content.Context;
import com.google.android.gms.autofill.service.common.ClientState;
import java.util.concurrent.ExecutorService;

/* renamed from: lmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lmg implements lis {

    /* renamed from: a */
    private final Context f26372a;

    /* renamed from: b */
    private final AssistStructure f26373b;

    /* renamed from: c */
    private final ClientState f26374c;

    /* renamed from: d */
    private final int f26375d;

    public lmg(Context context, AssistStructure assistStructure, ClientState clientState, int i) {
        this.f26372a = context.getApplicationContext();
        this.f26373b = assistStructure;
        this.f26374c = clientState;
        this.f26375d = i;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "future_key";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        return krc.m18382a(this.f26372a).mo14825a(this.f26372a).mo14865c().mo15069a(bqgs.m112811a((ExecutorService) snp.m35702a(9)), lgv.m19042a(this.f26373b, this.f26374c, this.f26375d));
    }
}
