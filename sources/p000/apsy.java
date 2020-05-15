package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* renamed from: apsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apsy extends dcj implements apta {
    public apsy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesService");
    }

    /* renamed from: a */
    public final void mo47579a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo47580a(apsx apsx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47581a(GetDocumentsCall$Request getDocumentsCall$Request, apsx apsx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47582a(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, apsx apsx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47583a(GlobalQueryCall$Request globalQueryCall$Request, apsx apsx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47585a(QuerySuggestCall$Request querySuggestCall$Request, apsx apsx) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47584a(QueryCall$Request queryCall$Request, apsx apsx) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, queryCall$Request);
        dcl.m8164a(bj, apsx);
        mo8528b(2, bj);
    }
}
