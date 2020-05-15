package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.ExecutorService;

/* renamed from: hna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hna implements hkz {

    /* renamed from: a */
    public final hnw f20052a;

    /* renamed from: b */
    public final hns f20053b = ((hns) hns.f20086a.mo33309a());

    /* renamed from: c */
    private final bqgj f20054c = bqgs.m112811a((ExecutorService) sne.m35694a(1, 9));

    public hna(Context context) {
        this.f20052a = hnw.m14663a(context);
    }

    /* renamed from: a */
    public final bqgg mo12600a(acyr acyr, HintRequest hintRequest) {
        if (hintRequest.f10116d) {
            return this.f20054c.mo25819b(new hmw(this, acyr));
        }
        return bqga.m112775a((Object) bngx.m109376e());
    }
}
