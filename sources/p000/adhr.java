package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: adhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhr extends adfj {

    /* renamed from: b */
    final /* synthetic */ adhu f61719b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adhr(adhu adhu) {
        super("isInstantApp");
        this.f61719b = adhu;
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        String string = bundle.getString("packageName");
        int i = Build.VERSION.SDK_INT;
        boolean isInstantApp = this.f61719b.f61723c.getPackageManager().isInstantApp(string);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("result", isInstantApp);
        return bundle2;
    }
}
