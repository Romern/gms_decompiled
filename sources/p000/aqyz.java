package p000;

import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import java.util.ArrayList;

/* renamed from: aqyz */
final /* synthetic */ class aqyz implements aubw {

    /* renamed from: a */
    private final CleanSharedSecretChimeraService f87133a;

    public aqyz(CleanSharedSecretChimeraService cleanSharedSecretChimeraService) {
        this.f87133a = cleanSharedSecretChimeraService;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        CleanSharedSecretChimeraService cleanSharedSecretChimeraService = this.f87133a;
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList != null && !arrayList.isEmpty()) {
            CleanSharedSecretChimeraService.m92622c(cleanSharedSecretChimeraService);
        }
    }
}
