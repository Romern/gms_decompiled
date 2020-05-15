package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: awph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awph extends rzu {

    /* renamed from: a */
    private final awnf f94803a;

    public awph(awnf awnf, Context context) {
        super(context, 4, new int[0]);
        this.f94803a = awnf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awnf, android.os.IBinder], assign insn: 0x0000: IGET  (r4v1 ? I:awnf) = (r2v0 'this' awph A[THIS]) awph.a awnf */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        ? r4 = this.f94803a;
        r4.asBinder();
        sbj.mo16678a(0, (IBinder) r4, (Bundle) null);
    }
}
