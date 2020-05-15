package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import java.util.concurrent.Executor;

/* renamed from: jje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jje extends jns {

    /* renamed from: a */
    final /* synthetic */ BleCentralChimeraService f22607a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jje(BleCentralChimeraService bleCentralChimeraService, Executor executor) {
        super(executor);
        this.f22607a = bleCentralChimeraService;
    }

    /* renamed from: a */
    public final void mo13779a(jnt jnt, int i, int i2) {
        String d = jnt.mo13824d();
        if (i2 == 0 && !TextUtils.isEmpty(d)) {
            BleCentralChimeraService bleCentralChimeraService = this.f22607a;
            bleCentralChimeraService.f11098e.post(new jjc(bleCentralChimeraService, d));
        }
    }

    /* renamed from: a */
    public final void mo13780a(jnt jnt, String str, byte[] bArr) {
    }
}
