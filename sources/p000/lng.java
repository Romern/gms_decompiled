package p000;

import android.app.assist.AssistStructure;
import android.content.Context;
import com.google.android.gms.autofill.service.common.ClientState;
import java.util.concurrent.ExecutorService;

/* renamed from: lng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lng implements lis {

    /* renamed from: a */
    private final Context f26442a;

    /* renamed from: b */
    private final AssistStructure f26443b;

    /* renamed from: c */
    private final ClientState f26444c;

    /* renamed from: d */
    private final int f26445d;

    public lng(Context context, AssistStructure assistStructure, ClientState clientState, int i) {
        this.f26442a = context.getApplicationContext();
        this.f26443b = assistStructure;
        this.f26444c = clientState;
        this.f26445d = i;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "future_key";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        return krc.m18382a(this.f26442a).mo14825a(this.f26442a).mo14865c().mo15069a(bqgs.m112811a((ExecutorService) snp.m35702a(9)), lgv.m19042a(this.f26443b, this.f26444c, this.f26445d));
    }
}
