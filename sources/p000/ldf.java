package p000;

import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: ldf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ldf {
    /* renamed from: a */
    private final List m18947a(int i) {
        List b = mo15002b();
        return i >= 0 ? b.subList(Math.max(0, b.size() - i), b.size()) : b;
    }

    /* renamed from: a */
    public abstract List mo7979a();

    /* renamed from: b */
    public final bngx mo15001b(int i, kpb... kpbArr) {
        HashMap hashMap = new HashMap();
        for (kpb kpb : kpbArr) {
            hashMap.put(kpb, new ArrayList());
        }
        for (FillForm fillForm : bnkn.m109666a(m18947a(i))) {
            for (kpb kpb2 : kpbArr) {
                if (fillForm.mo7949a(kpb2) && hashMap.get(kpb2) != null) {
                    ((List) hashMap.get(kpb2)).addAll(fillForm.mo7950b(kpb2));
                }
            }
        }
        bngs j = bngx.m109377j();
        for (kpb kpb3 : kpbArr) {
            if (hashMap.get(kpb3) != null) {
                j.mo67666b((Iterable) hashMap.get(kpb3));
            }
        }
        return j.mo67664a();
    }

    /* renamed from: c */
    public final FillForm mo15004c() {
        List b = mo15002b();
        if (b.size() > 0) {
            return (FillForm) b.get(b.size() - 1);
        }
        return null;
    }

    /* renamed from: a */
    public final FillField mo14999a(int i, kpb... kpbArr) {
        if (kpbArr.length != 0) {
            HashMap hashMap = new HashMap();
            Iterator it = bnkn.m109666a(m18947a(i)).iterator();
            do {
                if (it.hasNext()) {
                    FillForm fillForm = (FillForm) it.next();
                    for (kpb kpb : kpbArr) {
                        if (fillForm.mo7949a(kpb) && !hashMap.containsKey(kpb)) {
                            hashMap.put(kpb, (FillField) fillForm.mo7950b(kpb).listIterator().next());
                        }
                    }
                } else {
                    for (kpb kpb2 : kpbArr) {
                        if (hashMap.containsKey(kpb2)) {
                            return (FillField) hashMap.get(kpb2);
                        }
                    }
                }
            } while (!hashMap.containsKey(kpbArr[0]));
            return (FillField) hashMap.get(kpbArr[0]);
        }
        return null;
    }

    /* renamed from: b */
    public final List mo15002b() {
        return (List) mo7979a().stream().map(ldc.f25834a).filter(ldd.f25835a).collect(Collectors.toList());
    }

    /* renamed from: b */
    public final List mo15003b(kpb kpb) {
        bngx b = mo15001b(-1, kpb);
        bngs bngs = new bngs();
        bngs.mo67666b((Iterable) b);
        for (AbstractDetectionHistory$DetectionResult abstractDetectionHistory$DetectionResult : bnkn.m109666a(mo7979a())) {
            bnre i = abstractDetectionHistory$DetectionResult.mo7970b().listIterator();
            while (i.hasNext()) {
                FillField fillField = (FillField) i.next();
                if (fillField.mo7943a(kpb)) {
                    bngs.mo67668c(fillField);
                }
            }
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public final FillField mo15000a(kpb kpb) {
        FillField a = mo14999a(-1, kpb);
        if (a == null) {
            for (AbstractDetectionHistory$DetectionResult abstractDetectionHistory$DetectionResult : bnkn.m109666a(mo7979a())) {
                bnre i = abstractDetectionHistory$DetectionResult.mo7970b().listIterator();
                while (true) {
                    if (i.hasNext()) {
                        FillField fillField = (FillField) i.next();
                        if (fillField.mo7943a(kpb)) {
                            return fillField;
                        }
                    }
                }
            }
        }
        return a;
    }
}
