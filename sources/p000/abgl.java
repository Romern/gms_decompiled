package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abgl extends sji {

    /* renamed from: a */
    protected final GoogleHelpChimeraService f57412a;

    /* renamed from: d */
    protected final String f57413d;

    /* renamed from: e */
    protected final abcf f57414e;

    public abgl(String str, GoogleHelpChimeraService googleHelpChimeraService, String str2, abcf abcf) {
        super(63, str);
        this.f57412a = googleHelpChimeraService;
        this.f57413d = str2;
        this.f57414e = abcf;
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        String str = this.f44571b;
        Log.e("gH_BaseHelpOp", str.length() == 0 ? new String("Failed to execute AsyncOperation: ") : "Failed to execute AsyncOperation: ".concat(str));
    }
}
