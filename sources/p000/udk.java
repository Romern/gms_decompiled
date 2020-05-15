package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.GetMetadataRequest;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udk extends ucg {

    /* renamed from: f */
    private static final sbw f47296f = new sbw("GetMetadataOperation", "");

    /* renamed from: g */
    private final GetMetadataRequest f47297g;

    public udk(ubk ubk, GetMetadataRequest getMetadataRequest, uto uto) {
        super("GetMetadataOperation", ubk, uto, 10);
        this.f47297g = getMetadataRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47297g, "Invalid get metadata request: no request");
        aaal.m21020a(this.f47297g.f30857a, "Invalid get metadata request: no id");
        ubk ubk = this.f47237a;
        GetMetadataRequest getMetadataRequest = this.f47297g;
        MetadataBundle a = ubk.mo27071a(getMetadataRequest.f30857a, getMetadataRequest.f30858b);
        this.f47239c.mo28285a(new urr(a));
        try {
            this.f47238b.mo27946a(new OnMetadataResponse(a));
        } catch (RemoteException e) {
            spn.m35858a(e);
            f47296f.mo25372b("GetMetadataOperation", "Cannot pass complete response over binder!");
            mo6503a(Status.f30109c);
        }
    }
}
