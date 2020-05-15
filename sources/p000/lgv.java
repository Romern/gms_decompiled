package p000;

import android.app.assist.AssistStructure;
import com.google.android.gms.autofill.service.common.ClientState;

/* renamed from: lgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgv {

    /* renamed from: a */
    public final bngx f26062a;

    /* renamed from: b */
    public final ClientState f26063b;

    /* renamed from: c */
    private final bnhe f26064c;

    public lgv(bngx bngx, ClientState clientState, bnhe bnhe) {
        this.f26062a = bngx;
        this.f26063b = clientState;
        this.f26064c = bnhe;
    }

    /* renamed from: a */
    public static lgv m19042a(AssistStructure assistStructure, ClientState clientState, int i) {
        return new lgv(bngx.m109356a(assistStructure), clientState, bnhe.m109408a(assistStructure, Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final int mo15068a(AssistStructure assistStructure) {
        return ((Integer) this.f26064c.getOrDefault(assistStructure, -1)).intValue();
    }
}
