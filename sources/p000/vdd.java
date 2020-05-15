package p000;

import android.content.Context;
import com.google.android.gms.drive.auth.CallingAppInfo;

/* renamed from: vdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vdd extends vdt {

    /* renamed from: c */
    private final String f49058c;

    /* renamed from: d */
    private final CallingAppInfo f49059d;

    /* renamed from: e */
    private final int f49060e;

    public vdd(CallingAppInfo callingAppInfo, String str, int i, vdu vdu, Context context) {
        super(new bebs().mo58540a(vdu.mo28315a(str), vdm.m40184a(4)), context);
        sdo.m34959a(callingAppInfo);
        this.f49059d = callingAppInfo;
        sdo.m34959a((Object) str);
        this.f49058c = str;
        this.f49060e = i;
    }

    /* renamed from: d */
    public final vdk mo28316d() {
        vdk d = super.mo28316d();
        d.mo28284a(this.f49058c);
        d.mo28281a(this.f49059d);
        d.mo28275a(this.f49060e);
        return d;
    }
}
