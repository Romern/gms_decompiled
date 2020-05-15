package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.managed.p029ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: jgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgf extends aaab {

    /* renamed from: a */
    private final jfz f22410a;

    /* renamed from: b */
    private final String f22411b;

    /* renamed from: c */
    private final Bundle f22412c;

    public jgf(jfz jfz, String str, Bundle bundle) {
        super(136, "GetPhoneskyDpcInstallIntent");
        this.f22410a = jfz;
        this.f22411b = str;
        this.f22412c = bundle;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f22410a.mo13705a(Status.f30107a, PendingIntent.getActivity(context, 0, PhoneskyDpcInstallChimeraActivity.m6727a(context, this.f22411b, true, this.f22412c), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22410a.mo13705a(status, (PendingIntent) null);
    }
}
