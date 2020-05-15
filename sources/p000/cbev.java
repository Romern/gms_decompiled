package p000;

import java.util.Map;

/* renamed from: cbev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbev extends bxvd implements bxxd {
    public cbev() {
        super(cbex.f176860f);
    }

    /* renamed from: a */
    public final void mo75229a(String str, bxte bxte) {
        str.getClass();
        bxte.getClass();
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        cbex cbex = cbex.f176860f;
        ((cbex) this.f164949b).mo75232c().put(str, bxte);
    }

    /* renamed from: a */
    public final void mo75230a(Map map) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        cbex cbex = cbex.f176860f;
        ((cbex) this.f164949b).mo75232c().putAll(map);
    }
}
