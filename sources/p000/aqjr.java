package p000;

import android.content.Context;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: aqjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjr extends aqjp {

    /* renamed from: a */
    public final aqkf f86232a;

    /* renamed from: b */
    public final boolean f86233b;

    public aqjr(Context context, aqkf aqkf, boolean z) {
        super(context, true);
        this.f86232a = aqkf;
        this.f86233b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 1;
        }
        avtz.m79338b(this.f86226g).mo24690a(new UsageReportingOptInOptions(i));
    }
}
