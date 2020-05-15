package p000;

import android.content.Context;
import com.google.android.gms.thunderbird.state.EmergencyInfo;

/* renamed from: aufv */
final /* synthetic */ class aufv implements bmxj {

    /* renamed from: a */
    private final Context f91742a;

    /* renamed from: b */
    private final EmergencyInfo f91743b;

    public aufv(Context context, EmergencyInfo emergencyInfo) {
        this.f91742a = context;
        this.f91743b = emergencyInfo;
    }

    public final Object apply(Object obj) {
        aufq aufq = (aufq) obj;
        return new aufy(aufq, aufq.mo50494a(this.f91742a, this.f91743b, null));
    }
}
