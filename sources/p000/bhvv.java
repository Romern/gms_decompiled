package p000;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: bhvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bhvv implements rkl, rjz {

    /* renamed from: a */
    private final String f119708a;

    /* renamed from: b */
    private final rkb f119709b;

    public bhvv(rkb rkb, String str) {
        this.f119708a = str;
        this.f119709b = rkb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract rke mo64348a();

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        mo64348a().mo9459a(this, 10, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public void mo9454a(rkk rkk) {
        this.f119709b.mo24796b(this);
        if (rkk.mo7183bo().mo17710c()) {
            bhuj.m101555a();
            this.f119708a.concat(" succeeded");
            return;
        }
        bhuj.m101555a();
        String str = this.f119708a;
        String status = rkk.mo7183bo().toString();
        StringBuilder sb = new StringBuilder(str.length() + 20 + String.valueOf(status).length());
        sb.append(str);
        sb.append(" failed with status ");
        sb.append(status);
        sb.toString();
    }
}
