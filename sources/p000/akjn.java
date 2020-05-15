package p000;

import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.netrec.NetworkRecommendationService;
import java.util.List;

/* renamed from: akjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjn extends adzx {

    /* renamed from: a */
    final /* synthetic */ NetworkRecommendationService f72105a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akjn(NetworkRecommendationService networkRecommendationService, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.f72105a = networkRecommendationService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        int i = Settings.Global.getInt(this.f72105a.getContentResolver(), "network_recommendations_enabled", -1);
        String string = Settings.Global.getString(this.f72105a.getContentResolver(), "network_recommendations_package");
        if (i != 1 || !TextUtils.equals(this.f72105a.getPackageName(), string)) {
            this.f72105a.mo44675a();
            return;
        }
        NetworkRecommendationService networkRecommendationService = this.f72105a;
        if (!networkRecommendationService.f81171b.f72106a.compareAndSet(false, true)) {
            eoa.m10826b("NetRec", "Service already started.", new Object[0]);
            return;
        }
        eoa.m10826b("NetRec", "Starting service.", new Object[0]);
        if (networkRecommendationService.f81170a != null) {
            akmi.m60008a();
        }
        List list = networkRecommendationService.f81172c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            akko akko = (akko) list.get(i2);
            if (akko.mo39517b() && akko.f72168a.compareAndSet(false, true)) {
                akko.mo39518c();
            }
        }
    }
}
