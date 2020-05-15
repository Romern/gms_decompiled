package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import java.util.Iterator;

/* renamed from: apoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apoj extends aplq {

    /* renamed from: a */
    private final abrv f84760a;

    public apoj(abrv abrv, DeleteUsageReportCall$Request deleteUsageReportCall$Request, abyy abyy) {
        super(bqbd.DELETE_USAGE_REPORT, 2, 1, abrv.f58066b, deleteUsageReportCall$Request, abyy);
        this.f84760a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        absr absr;
        DeleteUsageReportCall$Request deleteUsageReportCall$Request = (DeleteUsageReportCall$Request) this.f84708n;
        absg.m48194b("DeleteUsageReportTask: Corpus: %s, Package: %s, Uri: %s", deleteUsageReportCall$Request.f107389b, deleteUsageReportCall$Request.f107388a, deleteUsageReportCall$Request.f107390c);
        abzo a = this.f84760a.mo32298a();
        synchronized (a.mo32525a()) {
            abyy abyy = this.f84709o;
            DeleteUsageReportCall$Request deleteUsageReportCall$Request2 = (DeleteUsageReportCall$Request) this.f84708n;
            Iterator it = a.mo32528a(abyy, new String[]{deleteUsageReportCall$Request2.f107389b}, false, deleteUsageReportCall$Request2.f107388a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    absr = null;
                    break;
                }
                absr = a.mo32543d((acak) it.next());
                if (absr != null && absr.f58138c.equals(((DeleteUsageReportCall$Request) this.f84708n).f107389b)) {
                    break;
                }
            }
        }
        DeleteUsageReportCall$Response deleteUsageReportCall$Response = new DeleteUsageReportCall$Response();
        deleteUsageReportCall$Response.f107391a = Status.f30109c;
        if (absr == null) {
            absg.m48192b("DeleteUsageReportUsageTask: couldn't find requested corpus: %s", ((DeleteUsageReportCall$Request) this.f84708n).f107389b);
            return deleteUsageReportCall$Response;
        } else if (!this.f84760a.mo32311a(absr, ((DeleteUsageReportCall$Request) this.f84708n).f107390c)) {
            absg.m48205e("DeleteUsageReportTask: failed to delete usage report and implicit document");
            return deleteUsageReportCall$Response;
        } else {
            absg.m48184a("DeleteUsageReportTask succeeded.");
            DeleteUsageReportCall$Response deleteUsageReportCall$Response2 = new DeleteUsageReportCall$Response();
            deleteUsageReportCall$Response2.f107391a = Status.f30107a;
            return deleteUsageReportCall$Response2;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        DeleteUsageReportCall$Response deleteUsageReportCall$Response = new DeleteUsageReportCall$Response();
        deleteUsageReportCall$Response.f107391a = status;
        return deleteUsageReportCall$Response;
    }
}
