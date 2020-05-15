package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: appf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appf extends dcj implements apph {
    public appf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
    }

    /* renamed from: a */
    public final void mo47495a(ClearCorpusCall$Response clearCorpusCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, clearCorpusCall$Response);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo47496a(DeleteUsageReportCall$Response deleteUsageReportCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deleteUsageReportCall$Response);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo47497a(GetCorpusInfoCall$Response getCorpusInfoCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCorpusInfoCall$Response);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo47498a(GetCorpusStatusCall$Response getCorpusStatusCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCorpusStatusCall$Response);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo47499a(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, registerCorpusInfoCall$Response);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo47500a(RequestIndexingCall$Response requestIndexingCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, requestIndexingCall$Response);
        mo8530c(2, bj);
    }
}
