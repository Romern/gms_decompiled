package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Feature;

/* renamed from: apjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjm extends rjx implements aphs {

    /* renamed from: a */
    public static final /* synthetic */ int f84539a = 0;

    /* renamed from: b */
    private static final rjo f84540b = new rjo("Scheduler.API", f84542d, f84541c);

    /* renamed from: c */
    private static final rje f84541c = new rje();

    /* renamed from: d */
    private static final rjl f84542d = new apjl();

    public apjm(Context context) {
        super(context, f84540b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final void mo47223a(Intent intent) {
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aphb.f84373a};
        b.f43472a = new apji(intent);
        b.mo24979b();
        mo24701a(b.mo24977a());
    }
}
