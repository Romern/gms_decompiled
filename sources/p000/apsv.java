package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: apsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apsv extends dcj implements apsx {
    public apsv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
    }

    /* renamed from: a */
    public final void mo47586a(AnnotateCall$Response annotateCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, annotateCall$Response);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo47587a(GetDocumentsCall$Response getDocumentsCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getDocumentsCall$Response);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo47588a(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getPhraseAffinityCall$Response);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo47589a(GlobalQueryCall$Response globalQueryCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, globalQueryCall$Response);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo47590a(QueryCall$Response queryCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, queryCall$Response);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo47591a(QuerySuggestCall$Response querySuggestCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, querySuggestCall$Response);
        mo8530c(6, bj);
    }
}
