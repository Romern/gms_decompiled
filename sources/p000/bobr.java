package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bobr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bobr extends bnch {

    /* renamed from: a */
    final /* synthetic */ bobv f132513a;

    /* renamed from: b */
    private int f132514b = 0;

    /* renamed from: c */
    private final bmza f132515c = bmza.m108659b(bmzq.f131275a);

    public bobr(bobv bobv) {
        this.f132513a = bobv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        bobv bobv = this.f132513a;
        int i = this.f132514b;
        this.f132515c.mo66928a(TimeUnit.MILLISECONDS);
        int d = bobv.mo68897d(i);
        if (d < 0) {
            return (Integer) mo67118d();
        }
        this.f132514b++;
        return Integer.valueOf(d);
    }
}
