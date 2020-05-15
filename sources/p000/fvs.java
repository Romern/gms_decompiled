package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvs extends sji {

    /* renamed from: a */
    private final ClientContext f17372a;

    /* renamed from: d */
    private final fva f17373d;

    /* renamed from: e */
    private final fve f17374e;

    public fvs(ClientContext clientContext, fva fva, fve fve) {
        super(106, "AppInviteGetSuggestedInvitees");
        this.f17372a = clientContext;
        this.f17373d = fva;
        this.f17374e = fve;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        ArrayList a = this.f17373d.mo11386a(this.f17372a);
        Status status = a == null ? Status.f30109c : Status.f30107a;
        fve fve = this.f17374e;
        if (fve != null) {
            fve.mo11392b(status, a);
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        fve fve = this.f17374e;
        if (fve != null) {
            fve.mo11392b(status, (List) null);
        }
    }
}
