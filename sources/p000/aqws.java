package p000;

import android.content.Context;
import com.google.android.chimera.Loader;

/* renamed from: aqws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqws extends Loader implements rkl {

    /* renamed from: a */
    private final String f86999a;

    /* renamed from: b */
    private final String f87000b;

    /* renamed from: c */
    private final rjx f87001c;

    public aqws(Context context, String str, String str2, int i) {
        super(context);
        allp a = allq.m61232a();
        a.f73626a = i;
        this.f87001c = allr.m61237d(context, a.mo40491a());
        this.f86999a = str;
        this.f87000b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        amey b;
        alky alky = (alky) rkk;
        if (alky.mo7183bo().mo17710c() && (b = alky.mo12459b()) != null) {
            try {
                int a = b.mo24660a();
                for (int i = 0; i < a; i++) {
                    alzr b2 = b.mo24661a(i);
                    if (this.f86999a.equals(b2.mo41063c())) {
                        String str = this.f87000b;
                        if (str != null) {
                            if (str.equals(b2.mo41070k())) {
                            }
                        }
                        deliverResult(new aqwr(b2.mo41068i()));
                        return;
                    }
                }
                b.mo12460c();
            } finally {
                b.mo12460c();
            }
        }
        deliverResult(null);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        if (this.f86999a == null) {
            deliverResult(null);
            return;
        }
        takeContentChanged();
        alkx alkx = new alkx();
        alkx.f73613b = true;
        this.f87001c.mo24710a(alkx).mo9458a(this);
    }
}
