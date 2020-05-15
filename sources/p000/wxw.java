package p000;

import android.text.TextUtils;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* renamed from: wxw */
final /* synthetic */ class wxw implements auca {

    /* renamed from: a */
    static final auca f51555a = new wxw();

    private wxw() {
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = experimentTokens.f82089c;
        if (bArr != null) {
            String a = wxx.m42455a(bArr);
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(a);
            }
        }
        byte[][] bArr2 = experimentTokens.f82095i;
        if (bArr2 != null) {
            for (byte[] bArr3 : bArr2) {
                String a2 = wxx.m42455a(bArr3);
                if (!TextUtils.isEmpty(a2)) {
                    arrayList.add(a2);
                }
            }
        }
        return aucu.m76778a((Object) arrayList);
    }
}
