package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: aagj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagj extends rzu {

    /* renamed from: a */
    private final aagr f28065a;

    /* renamed from: b */
    private final aagi f28066b;

    public aagj(Context context, aagr aagr, aagi aagi) {
        super(context, 116, new int[0]);
        this.f28065a = aagr;
        this.f28066b = aagi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        sbj.mo16678a(0, new aahx(this.f28065a, this.f28066b), (Bundle) null);
    }
}
