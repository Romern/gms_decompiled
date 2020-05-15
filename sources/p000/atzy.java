package p000;

import android.os.Bundle;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;

/* renamed from: atzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atzy extends bmxe {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12636a(Object obj) {
        Bundle bundle = (Bundle) obj;
        return new atzx(bundle.getBoolean("isSuccess"), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        asmj asmj = (asmj) obj;
        Bundle bundle = new Bundle();
        boolean c = asmj.mo7183bo().mo17710c();
        bundle.putBoolean("isSuccess", c);
        if (c) {
            GetAllCardsResponse b = asmj.mo49241b();
            bundle.putParcelableArrayList("cardInfos", bnkn.m109665a(b.f108369a));
            bundle.putParcelable("accountInfo", b.f108370b);
            bundle.putString("defaultClientTokenId", b.f108371c);
            bundle.putString("overrideClientTokenId", b.f108372d);
        }
        return bundle;
    }
}
