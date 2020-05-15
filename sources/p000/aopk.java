package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aopk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopk {

    /* renamed from: a */
    final aopg f78649a = aopg.m66269a("WhitePageServiceGrpcClient");

    /* renamed from: b */
    private final aoph f78650b;

    public aopk(Context context) {
        String f = cghu.f186966a.mo6606a().mo83818f();
        sdo.m34959a((Object) f);
        Long valueOf = Long.valueOf(cghu.f186966a.mo6606a().mo83819g());
        sdo.m34959a(valueOf);
        shl shl = new shl(context, f, (int) valueOf.longValue(), context.getApplicationInfo().uid, 14337);
        shl.mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        shl.mo25556a("X-Android-Package", context.getPackageName());
        shl.mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
        this.f78650b = new aoph(shl);
    }

    /* renamed from: a */
    public final btbs mo43149a(ClientContext clientContext, btbr btbr) {
        try {
            aoph aoph = this.f78650b;
            if (aoph.f78643b == null) {
                aoph.f78643b = chtv.m149566a(chtu.UNARY, "google.internal.myphonenumbers.v1.MyPhoneNumbers/HandleDeviceReachabilityData", ciie.m150370a(btbr.f148203c), ciie.m150370a(btbs.f148207d));
            }
            return (btbs) aoph.f78644a.mo25553a(aoph.f78643b, clientContext, btbr, 10000, TimeUnit.MILLISECONDS);
        } catch (chuw | gid e) {
            aopg aopg = this.f78649a;
            Object[] objArr = {e};
            if (Log.isLoggable(aopg.f78642a, 6)) {
                Log.e(aopg.f78642a, aopg.m66270a("Error making Grpc request.", objArr));
            }
            throw e;
        }
    }
}
