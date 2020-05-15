package p000;

import android.os.Parcel;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: appg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appg extends dck implements apph {

    /* renamed from: a */
    private final aucf f84778a;

    public appg() {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
    }

    /* renamed from: a */
    public final void mo47495a(ClearCorpusCall$Response clearCorpusCall$Response) {
        rpc.m34202a(clearCorpusCall$Response.f107387a, null, this.f84778a);
    }

    /* renamed from: a */
    public final void mo47496a(DeleteUsageReportCall$Response deleteUsageReportCall$Response) {
        rpc.m34202a(deleteUsageReportCall$Response.f107391a, null, this.f84778a);
    }

    public appg(aucf aucf) {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
        this.f84778a = aucf;
    }

    /* renamed from: a */
    public final void mo47497a(GetCorpusInfoCall$Response getCorpusInfoCall$Response) {
        rpc.m34202a(getCorpusInfoCall$Response.f107394a, getCorpusInfoCall$Response.f107395b, this.f84778a);
    }

    /* renamed from: a */
    public final void mo47498a(GetCorpusStatusCall$Response getCorpusStatusCall$Response) {
        rpc.m34202a(getCorpusStatusCall$Response.f107398a, getCorpusStatusCall$Response.f107399b, this.f84778a);
    }

    /* renamed from: a */
    public final void mo47499a(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response) {
        rpc.m34202a(registerCorpusInfoCall$Response.f107403a, null, this.f84778a);
    }

    /* renamed from: a */
    public final void mo47500a(RequestIndexingCall$Response requestIndexingCall$Response) {
        rpc.m34202a(requestIndexingCall$Response.f107408a, Boolean.valueOf(requestIndexingCall$Response.f107409b), this.f84778a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo47500a((RequestIndexingCall$Response) dcl.m8163a(parcel, RequestIndexingCall$Response.CREATOR));
                return true;
            case 3:
                mo47495a((ClearCorpusCall$Response) dcl.m8163a(parcel, ClearCorpusCall$Response.CREATOR));
                return true;
            case 4:
                mo47498a((GetCorpusStatusCall$Response) dcl.m8163a(parcel, GetCorpusStatusCall$Response.CREATOR));
                return true;
            case 5:
                mo47497a((GetCorpusInfoCall$Response) dcl.m8163a(parcel, GetCorpusInfoCall$Response.CREATOR));
                return true;
            case 6:
                mo47496a((DeleteUsageReportCall$Response) dcl.m8163a(parcel, DeleteUsageReportCall$Response.CREATOR));
                return true;
            case 7:
                mo47499a((RegisterCorpusInfoCall$Response) dcl.m8163a(parcel, RegisterCorpusInfoCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
