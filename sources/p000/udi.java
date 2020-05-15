package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udi extends ucg {
    public udi(ubk ubk, uto uto) {
        super("GetFileUploadPreferencesOperation", ubk, uto, 11);
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        ubk ubk = this.f47237a;
        txg a = ubk.f47142c.f49744C.mo27232a(ubk.f47143d);
        this.f47238b.mo27948a(new OnDeviceUsagePreferenceResponse(new FileUploadPreferencesImpl(a.mo18217a(), a.mo18219c(), a.mo18218b())));
    }
}
