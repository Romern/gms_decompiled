package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: gqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqw extends aaab {

    /* renamed from: a */
    private final String f18854a;

    /* renamed from: b */
    private final gqm f18855b;

    /* renamed from: c */
    private final gpd f18856c;

    public gqw(gpd gpd, gqm gqm, String str) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "GetTokenHandle");
        this.f18856c = gpd;
        this.f18855b = gqm;
        this.f18854a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String b = this.f18855b.mo12129a(context).mo12034b(this.f18854a);
        if (b != null) {
            this.f18856c.mo12124a(Status.f30107a, b);
            return;
        }
        gql gql = new gql(10);
        gql.f18826b = "Unable to get a valid token handle.";
        throw gql.mo12128a();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18856c.mo12124a(status, (String) null);
    }
}
