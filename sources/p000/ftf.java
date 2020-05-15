package p000;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;

/* renamed from: ftf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ftf extends IInterface {
    /* renamed from: a */
    Bundle mo11133a(Bundle bundle);

    /* renamed from: a */
    Bundle mo11134a(String str, String str2);

    /* renamed from: a */
    DocumentResults mo11135a(String[] strArr, String str, String str2, QuerySpecification querySpecification);

    /* renamed from: a */
    PhraseAffinityResponse mo11136a(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification);

    /* renamed from: a */
    SearchResults mo11137a(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification);

    /* renamed from: a */
    SearchResults mo11138a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification);

    /* renamed from: a */
    SuggestionResults mo11139a(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification);

    /* renamed from: a */
    void mo11140a(GlobalSearchApplicationInfo globalSearchApplicationInfo);

    /* renamed from: a */
    void mo11141a(String str, RegisterCorpusInfo registerCorpusInfo);

    /* renamed from: a */
    void mo11142a(String str, boolean z);

    /* renamed from: a */
    void mo11143a(String[] strArr);

    /* renamed from: a */
    boolean mo11144a(String str, String str2, long j);

    /* renamed from: a */
    GlobalSearchApplicationInfo[] mo11145a();

    /* renamed from: a */
    String[] mo11146a(String str);

    /* renamed from: b */
    CorpusStatus mo11147b(String str, String str2);

    /* renamed from: b */
    void mo11148b(String[] strArr);

    /* renamed from: b */
    boolean mo11149b(String str, RegisterCorpusInfo registerCorpusInfo);

    /* renamed from: b */
    GlobalSearchApplication[] mo11150b();

    /* renamed from: b */
    String[] mo11151b(String str);

    /* renamed from: c */
    RegisterCorpusInfo mo11152c(String str, String str2);

    /* renamed from: c */
    StorageStats mo11153c();

    /* renamed from: c */
    void mo11154c(String str);

    /* renamed from: d */
    boolean mo11155d();

    /* renamed from: e */
    NativeApiInfo mo11156e();

    /* renamed from: f */
    void mo11157f();

    /* renamed from: g */
    int[] mo11158g();

    /* renamed from: h */
    int[] mo11159h();

    /* renamed from: i */
    String[] mo11160i();

    /* renamed from: j */
    PIMEUpdateResponse mo11161j();

    /* renamed from: k */
    boolean mo11162k();

    /* renamed from: l */
    boolean mo11163l();

    /* renamed from: m */
    boolean mo11164m();
}
