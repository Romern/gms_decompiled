package p000;

import com.google.android.gms.autofill.operation.FeedbackOperation;
import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kyt extends wvd {

    /* renamed from: a */
    final /* synthetic */ FeedbackOperation f25433a;

    public kyt(FeedbackOperation feedbackOperation) {
        this.f25433a = feedbackOperation;
    }

    /* renamed from: a */
    public final List mo14944a() {
        ArrayList arrayList = new ArrayList();
        ArrayList a = kwe.m18646a(this.f25433a.getApplicationContext()).mo14882a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            kwh kwh = (kwh) a.get(i);
            byte[] k = kwh.serializeToBytes();
            long j = kwh.f25264b;
            StringBuilder sb = new StringBuilder(39);
            sb.append(j);
            sb.append("_instrumentation.pb");
            arrayList.add(new FileTeleporter(k, "text/plain", sb.toString()));
        }
        return arrayList;
    }
}
