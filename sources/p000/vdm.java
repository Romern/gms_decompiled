package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.drive.auth.CallingAppInfo;

/* renamed from: vdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vdm {

    /* renamed from: a */
    public final vdu f49083a;

    /* renamed from: b */
    public final Context f49084b;

    public vdm(vdu vdu, Context context) {
        sdo.m34959a(vdu);
        this.f49083a = vdu;
        sdo.m34959a(context);
        this.f49084b = context;
    }

    /* renamed from: a */
    static bebv m40184a(int i) {
        bebv bebv = new bebv();
        bebv.f106887a = i;
        return bebv;
    }

    /* renamed from: a */
    public final vda mo28331a(Bundle bundle) {
        return new vdv(bundle, this.f49083a, this.f49084b);
    }

    /* renamed from: a */
    public final vda mo28332a(CallingAppInfo callingAppInfo, String str) {
        sdo.m34959a((Object) str);
        return new vdv(callingAppInfo, str, this.f49083a, this.f49084b);
    }
}
