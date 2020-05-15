package p000;

import android.app.assist.AssistStructure;
import android.content.Context;
import com.google.android.gms.autofill.service.common.ClientState;
import java.util.concurrent.ExecutorService;

/* renamed from: lme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lme implements lis {

    /* renamed from: a */
    private final Context f26362a;

    /* renamed from: b */
    private final AssistStructure f26363b;

    /* renamed from: c */
    private final ClientState f26364c;

    /* renamed from: d */
    private final int f26365d;

    public lme(Context context, AssistStructure assistStructure, ClientState clientState, int i) {
        this.f26362a = context.getApplicationContext();
        this.f26363b = assistStructure;
        this.f26364c = clientState;
        this.f26365d = i;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "save_future_key";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        return krc.m18382a(this.f26362a).mo14825a(this.f26362a).mo14865c().mo15069a(bqgs.m112811a((ExecutorService) snp.m35702a(9)), lgv.m19042a(this.f26363b, this.f26364c, this.f26365d));
    }
}
