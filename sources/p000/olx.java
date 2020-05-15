package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* renamed from: olx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class olx extends rzu {

    /* renamed from: a */
    private final IBinder f37936a;

    /* renamed from: b */
    private final Set f37937b;

    /* renamed from: h */
    private final oly f37938h;

    public olx(Context context, IBinder iBinder, Set set, oly oly) {
        super(context, 13, new int[0]);
        this.f37936a = iBinder;
        this.f37937b = set;
        this.f37938h = oly;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return this.f37937b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        int i;
        IBinder iBinder;
        oly oly = this.f37938h;
        String str = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        Context context = this.f43904d;
        int i2 = Build.VERSION.SDK_INT;
        if (oly.mo21016a(bundle)) {
            boolean a = oen.m28584a(context).mo22059a(oly.mo21015a(), oly.mo21017b(), str, nhg.SERVICE);
            oen.m28585a();
            if (!a) {
                bnsi c = oly.f37939b.mo68388c();
                c.mo68432a("oly", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Package NOT validated: %s", bryx.m114908a(str));
                i = 16;
            } else {
                i = 0;
            }
        } else {
            i = 2;
        }
        if (i == 0) {
            iBinder = this.f37936a;
        } else {
            iBinder = null;
        }
        sbj.mo16678a(i, iBinder, (Bundle) null);
    }
}
