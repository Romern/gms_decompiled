package p000;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: aonn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aonn extends aonl {

    /* renamed from: a */
    private final rtp f78578a;

    /* renamed from: b */
    private final Integer f78579b;

    /* renamed from: c */
    private final Integer f78580c;

    public aonn(rtp rtp) {
        this(rtp, null, null);
    }

    /* renamed from: a */
    public final View mo42053a(int i, View view, ViewGroup viewGroup, boolean z) {
        return mo42056a(mo11416b(i), view, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo42056a(Object obj, View view, ViewGroup viewGroup, boolean z);

    /* renamed from: b */
    public final Object mo11416b(int i) {
        return this.f78578a.mo24661a(this.f78579b.intValue() + i);
    }

    /* renamed from: d */
    public final int mo42055d() {
        return this.f78580c.intValue();
    }

    public aonn(rtp rtp, Integer num, Integer num2) {
        boolean z;
        boolean z2 = false;
        num = num == null ? 0 : num;
        num2 = num2 == null ? Integer.valueOf(rtp.mo24660a()) : num2;
        if (num.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "rangeStart");
        sdo.m34975b(num2.intValue() <= rtp.mo24660a() ? true : z2, "rangeEnd");
        this.f78578a = rtp;
        this.f78579b = num;
        this.f78580c = Integer.valueOf(num2.intValue() - num.intValue());
    }
}
