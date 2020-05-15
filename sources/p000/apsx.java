package p000;

import android.os.IInterface;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: apsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface apsx extends IInterface {
    /* renamed from: a */
    void mo47586a(AnnotateCall$Response annotateCall$Response);

    /* renamed from: a */
    void mo47587a(GetDocumentsCall$Response getDocumentsCall$Response);

    /* renamed from: a */
    void mo47588a(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response);

    /* renamed from: a */
    void mo47589a(GlobalQueryCall$Response globalQueryCall$Response);

    /* renamed from: a */
    void mo47590a(QueryCall$Response queryCall$Response);

    /* renamed from: a */
    void mo47591a(QuerySuggestCall$Response querySuggestCall$Response);
}
