package p000;

import android.content.Context;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: appe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appe extends appj implements sjr {

    /* renamed from: a */
    private final abrv f84776a;

    /* renamed from: b */
    private final abyy f84777b;

    public appe(abrv abrv, abyy abyy) {
        sdo.m34959a(abrv);
        this.f84776a = abrv;
        this.f84777b = abyy;
    }

    /* renamed from: a */
    public final void mo47489a(ClearCorpusCall$Request clearCorpusCall$Request, apph apph) {
        abrv abrv = this.f84776a;
        abrv.f58067c.mo32995d(new apoz(abrv, clearCorpusCall$Request, this.f84777b, apph));
    }

    /* renamed from: a */
    public final void mo47490a(DeleteUsageReportCall$Request deleteUsageReportCall$Request, apph apph) {
        abrv abrv = this.f84776a;
        abrv.f58067c.mo32995d(new appc(abrv, deleteUsageReportCall$Request, this.f84777b, apph));
    }

    /* renamed from: a */
    public final void mo47491a(GetCorpusInfoCall$Request getCorpusInfoCall$Request, apph apph) {
        abrv abrv = this.f84776a;
        abrv.f58067c.mo32995d(new appb(abrv, getCorpusInfoCall$Request, this.f84777b, apph));
    }

    /* renamed from: a */
    public final void mo47492a(GetCorpusStatusCall$Request getCorpusStatusCall$Request, apph apph) {
        abrv abrv = this.f84776a;
        abrv.f58067c.mo32995d(new appa(abrv, getCorpusStatusCall$Request, this.f84777b, apph));
    }

    /* renamed from: a */
    public final void mo47493a(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, apph apph) {
        abrv abrv = this.f84776a;
        abrv.f58067c.mo32995d(new appd(abrv.f58066b, abrv, registerCorpusInfoCall$Request, this.f84777b, apph));
    }

    /* renamed from: a */
    public final void mo47494a(RequestIndexingCall$Request requestIndexingCall$Request, apph apph) {
        abrv abrv = this.f84776a;
        acpl acpl = abrv.f58067c;
        Context context = abrv.f58066b;
        abzo a = abrv.mo32298a();
        abrv abrv2 = this.f84776a;
        acpl.mo32995d(new apoy(context, acpl, a, abrv2.f58079o, abrv2.f58081q, requestIndexingCall$Request, this.f84777b, apph));
    }
}
