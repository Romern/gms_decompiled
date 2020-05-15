package p000;

import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import java.util.ArrayList;

/* renamed from: frk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frk {

    /* renamed from: a */
    private final int[] f17155a = new int[fro.m12228a()];

    /* renamed from: b */
    private final ArrayList f17156b = new ArrayList();

    /* renamed from: a */
    public final GlobalSearchCorpusConfig mo11200a() {
        int[] iArr = this.f17155a;
        ArrayList arrayList = this.f17156b;
        return new GlobalSearchCorpusConfig(iArr, (Feature[]) arrayList.toArray(new Feature[arrayList.size()]));
    }

    /* renamed from: a */
    public final void mo11201a(String str, int i) {
        this.f17155a[fro.m12229a(str)] = i;
    }

    /* renamed from: a */
    public final void mo11202a(Feature... featureArr) {
        for (Feature feature : featureArr) {
            Feature.m6141a(this.f17156b, feature);
        }
    }
}
