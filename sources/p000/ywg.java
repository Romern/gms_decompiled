package p000;

import com.google.android.gms.fitness.data.Subscription;

/* renamed from: ywg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywg {
    /* renamed from: a */
    public static cadr m44943a(Subscription subscription) {
        bxvd da = cadr.f172717f.mo74144da();
        int i = subscription.f32179d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadr cadr = (cadr) da.f164949b;
        int i2 = cadr.f172719a | 8;
        cadr.f172719a = i2;
        cadr.f172723e = i;
        long j = subscription.f32178c;
        cadr.f172719a = i2 | 4;
        cadr.f172722d = j;
        caae a = yvx.m44925a(subscription.f32176a);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cadr cadr2 = (cadr) da.f164949b;
            a.getClass();
            cadr2.f172720b = a;
            cadr2.f172719a |= 1;
        }
        caah a2 = ywb.m44930a(subscription.f32177b);
        if (a2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cadr cadr3 = (cadr) da.f164949b;
            a2.getClass();
            cadr3.f172721c = a2;
            cadr3.f172719a |= 2;
        }
        return (cadr) da.mo74062i();
    }
}
