package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* renamed from: apst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apst extends apsz implements sjr {

    /* renamed from: a */
    private final abrv f84831a;

    /* renamed from: b */
    private final abyy f84832b;

    public apst(abrv abrv, abyy abyy) {
        sdo.m34959a(abrv);
        this.f84831a = abrv;
        this.f84832b = abyy;
    }

    /* renamed from: a */
    public final void mo47579a(Bundle bundle) {
        abrv abrv = this.f84831a;
        abrv.f58067c.mo32995d(new apsd(abrv, bundle, this.f84832b));
    }

    /* renamed from: a */
    public final void mo47580a(apsx apsx) {
        try {
            apsx.mo47586a(new AnnotateCall$Response(new Status(13, "Annotation API is not enabled."), null, null));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo47581a(GetDocumentsCall$Request getDocumentsCall$Request, apsx apsx) {
        abrv abrv = this.f84831a;
        abrv.f58067c.mo32995d(new apsr(abrv, getDocumentsCall$Request, this.f84832b, apsx));
    }

    /* renamed from: a */
    public final void mo47582a(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, apsx apsx) {
        abrv abrv = this.f84831a;
        abrv.f58067c.mo32995d(new apss(abrv, getPhraseAffinityCall$Request, this.f84832b, apsx));
    }

    /* renamed from: a */
    public final void mo47583a(GlobalQueryCall$Request globalQueryCall$Request, apsx apsx) {
        abrv abrv = this.f84831a;
        abrv.f58067c.mo32995d(new apsq(abrv, globalQueryCall$Request, this.f84832b, apsx));
    }

    /* renamed from: a */
    public final void mo47584a(QueryCall$Request queryCall$Request, apsx apsx) {
        abrv abrv = this.f84831a;
        abrv.f58067c.mo32995d(new apso(abrv, queryCall$Request, this.f84832b, apsx));
    }

    /* renamed from: a */
    public final void mo47585a(QuerySuggestCall$Request querySuggestCall$Request, apsx apsx) {
        abrv abrv = this.f84831a;
        abrv.f58067c.mo32995d(new apsp(abrv, querySuggestCall$Request, this.f84832b, apsx));
    }
}
