package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: apsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apsw extends dck implements apsx {

    /* renamed from: a */
    private final apte f84839a;

    /* renamed from: b */
    private final aucf f84840b;

    public apsw() {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
    }

    /* renamed from: a */
    private final void m70932a(Bundle bundle) {
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
            try {
                ((apta) this.f84839a.mo25289B()).mo47579a(bundle);
            } catch (IllegalStateException e) {
                RemoteException remoteException = new RemoteException();
                remoteException.initCause(e);
                throw remoteException;
            } catch (RemoteException e2) {
            }
        }
    }

    public apsw(apte apte, aucf aucf) {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
        this.f84839a = apte;
        this.f84840b = aucf;
    }

    /* renamed from: a */
    public final void mo47586a(AnnotateCall$Response annotateCall$Response) {
        m70932a(annotateCall$Response.f107452c);
        rpc.m34202a(annotateCall$Response.f107450a, annotateCall$Response.f107451b, this.f84840b);
    }

    /* renamed from: a */
    public final void mo47587a(GetDocumentsCall$Response getDocumentsCall$Response) {
        m70932a(getDocumentsCall$Response.f107462c);
        rpc.m34202a(getDocumentsCall$Response.f107460a, getDocumentsCall$Response.f107461b, this.f84840b);
    }

    /* renamed from: a */
    public final void mo47588a(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        m70932a(getPhraseAffinityCall$Response.f107468c);
        rpc.m34202a(getPhraseAffinityCall$Response.f107466a, getPhraseAffinityCall$Response.f107467b, this.f84840b);
    }

    /* renamed from: a */
    public final void mo47589a(GlobalQueryCall$Response globalQueryCall$Response) {
        m70932a(globalQueryCall$Response.f107476c);
        rpc.m34202a(globalQueryCall$Response.f107474a, globalQueryCall$Response.f107475b, this.f84840b);
    }

    /* renamed from: a */
    public final void mo47590a(QueryCall$Response queryCall$Response) {
        m70932a(queryCall$Response.f107486c);
        rpc.m34202a(queryCall$Response.f107484a, queryCall$Response.f107485b, this.f84840b);
    }

    /* renamed from: a */
    public final void mo47591a(QuerySuggestCall$Response querySuggestCall$Response) {
        m70932a(querySuggestCall$Response.f107495c);
        rpc.m34202a(querySuggestCall$Response.f107493a, querySuggestCall$Response.f107494b, this.f84840b);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo47590a((QueryCall$Response) dcl.m8163a(parcel, QueryCall$Response.CREATOR));
                return true;
            case 3:
                mo47589a((GlobalQueryCall$Response) dcl.m8163a(parcel, GlobalQueryCall$Response.CREATOR));
                return true;
            case 4:
                mo47587a((GetDocumentsCall$Response) dcl.m8163a(parcel, GetDocumentsCall$Response.CREATOR));
                return true;
            case 5:
                mo47588a((GetPhraseAffinityCall$Response) dcl.m8163a(parcel, GetPhraseAffinityCall$Response.CREATOR));
                return true;
            case 6:
                mo47591a((QuerySuggestCall$Response) dcl.m8163a(parcel, QuerySuggestCall$Response.CREATOR));
                return true;
            case 7:
                mo47586a((AnnotateCall$Response) dcl.m8163a(parcel, AnnotateCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
