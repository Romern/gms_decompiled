package p000;

import android.content.Context;
import com.google.android.gms.phenotype.Configurations;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: akjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akjt implements akjr {

    /* renamed from: a */
    private final List f72114a;

    /* renamed from: b */
    private final aney f72115b;

    public akjt(List list, Context context) {
        this.f72114a = list;
        this.f72115b = anef.m64089a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo39511a(String str) {
        try {
            return ((Configurations) aucu.m76783a(this.f72115b.mo41766p(str), 500, TimeUnit.MILLISECONDS)).f82076c;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            eoa.m10825a("NetRec", e, "Could not retrieve server token for package %s", str);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo39506a() {
    }

    /* renamed from: a */
    public final void mo39507a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f72114a) {
            String a = mo39511a(str);
            if (bmxx.m108577a(a)) {
                new Object[1][0] = str;
                int i = eoa.f15378a;
            } else {
                arrayList.add(a);
            }
        }
        if (!arrayList.isEmpty()) {
            String a2 = akju.f72116a.mo66874a((Iterable) arrayList);
            new Object[1][0] = Integer.valueOf(arrayList.size());
            int i2 = eoa.f15378a;
            map.put("X-Client-Data", a2);
            return;
        }
        eoa.m10828c("NetRec", "No server tokens extracted.", new Object[0]);
    }
}
