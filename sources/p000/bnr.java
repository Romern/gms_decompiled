package p000;

import com.android.volley.Request;
import com.android.volley.RequestQueue;

/* renamed from: bnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnr implements RequestQueue.RequestFilter {

    /* renamed from: a */
    final /* synthetic */ Object f5203a;

    public bnr(Object obj) {
        this.f5203a = obj;
    }

    public final boolean apply(Request request) {
        return request.getTag() == this.f5203a;
    }
}
