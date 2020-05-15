package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: acqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqw extends acra {

    /* renamed from: b */
    private final GetRecentContextCall$Request f60553b;

    /* renamed from: c */
    private final ftl f60554c;

    /* renamed from: d */
    private final acwv f60555d;

    public acqw(GetRecentContextCall$Request getRecentContextCall$Request, ftl ftl, acwv acwv) {
        super(ftl, "GetRecentContext");
        this.f60553b = getRecentContextCall$Request;
        this.f60554c = ftl;
        this.f60555d = acwv;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        GetRecentContextCall$Response getRecentContextCall$Response = new GetRecentContextCall$Response();
        getRecentContextCall$Response.f9554a = Status.f30107a;
        getRecentContextCall$Response.f9555b = this.f60555d.mo33179a(this.f60553b, new acrm(context, "AppDataSearch-main"));
        try {
            this.f60554c.mo11185a(getRecentContextCall$Response);
        } catch (RemoteException e) {
            absg.m48200c(e, "Client died during getRecentContext.", new Object[0]);
        }
    }
}
