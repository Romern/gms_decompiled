package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: appi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appi extends dcj implements appk {
    public appi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaService");
    }

    /* renamed from: a */
    public final void mo47489a(ClearCorpusCall$Request clearCorpusCall$Request, apph apph) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, clearCorpusCall$Request);
        dcl.m8164a(bj, apph);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo47490a(DeleteUsageReportCall$Request deleteUsageReportCall$Request, apph apph) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47493a(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, apph apph) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47491a(GetCorpusInfoCall$Request getCorpusInfoCall$Request, apph apph) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCorpusInfoCall$Request);
        dcl.m8164a(bj, apph);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo47492a(GetCorpusStatusCall$Request getCorpusStatusCall$Request, apph apph) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCorpusStatusCall$Request);
        dcl.m8164a(bj, apph);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo47494a(RequestIndexingCall$Request requestIndexingCall$Request, apph apph) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, requestIndexingCall$Request);
        dcl.m8164a(bj, apph);
        mo8528b(2, bj);
    }
}
