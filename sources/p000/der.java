package p000;

import android.content.Context;
import android.location.SettingInjectorService;

/* renamed from: der */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class der extends SettingInjectorService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.SettingInjectorService f12983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public der(com.google.android.chimera.SettingInjectorService settingInjectorService, String str) {
        super(str);
        this.f12983a = settingInjectorService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    public final boolean onGetEnabled() {
        return this.f12983a.onGetEnabled();
    }

    /* access modifiers changed from: protected */
    public final String onGetSummary() {
        return this.f12983a.onGetSummary();
    }
}
