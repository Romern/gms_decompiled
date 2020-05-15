package p000;

import android.content.Intent;

/* renamed from: bgbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbz implements rsg {

    /* renamed from: a */
    final /* synthetic */ String f116014a;

    public bgbz(String str) {
        this.f116014a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo9591a(Object obj, Object obj2) {
        Intent intent = (Intent) obj;
        Intent intent2 = (Intent) obj2;
        if (intent == null && intent2 == null) {
            return true;
        }
        if (intent == null || intent2 == null) {
            return false;
        }
        return bmxi.m108538a(intent.getParcelableExtra(this.f116014a), intent2.getParcelableExtra(this.f116014a));
    }
}
