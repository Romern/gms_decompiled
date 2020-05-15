package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RefreshSeCardsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.RefreshSeCardsRequest;
import java.io.IOException;

/* renamed from: atjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjj extends atki {
    public atjj(RefreshSeCardsRequest refreshSeCardsRequest, String str, aswm aswm) {
        super("RefreshSeCards", refreshSeCardsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49613a(status, new RefreshSeCardsResponse());
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        askf a = askg.m74278a(context, this.f90413c);
        if (atgf.m75807a(context).mo49940a()) {
            try {
                atds.m75666a(a).mo49859d();
            } catch (IOException e) {
                m76116a(e);
            } catch (atfh e2) {
                throw new RuntimeException(e2);
            }
            this.f90414d.mo49613a(Status.f30107a, new RefreshSeCardsResponse());
            return;
        }
        this.f90414d.mo49613a(Status.f30107a, new RefreshSeCardsResponse());
    }
}
