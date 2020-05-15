package p000;

import android.app.assist.AssistStructure;
import com.google.android.gms.autofill.service.common.ClientState;

/* renamed from: leh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class leh {

    /* renamed from: a */
    public final int f25871a;

    /* renamed from: b */
    public final AssistStructure f25872b;

    /* renamed from: c */
    public final ClientState f25873c;

    /* renamed from: d */
    public final int f25874d;

    /* renamed from: e */
    public final bmxv f25875e;

    public leh(int i, AssistStructure assistStructure, ClientState clientState, int i2) {
        this(i, assistStructure, clientState, i2, bmvz.f131120a);
    }

    /* renamed from: a */
    public final boolean mo15035a() {
        return (this.f25871a & 1) != 0;
    }

    public leh(int i, AssistStructure assistStructure, ClientState clientState, int i2, bmxv bmxv) {
        this.f25871a = i;
        this.f25872b = assistStructure;
        this.f25873c = clientState;
        this.f25874d = i2;
        this.f25875e = bmxv;
    }
}
