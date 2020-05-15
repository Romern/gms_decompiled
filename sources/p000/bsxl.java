package p000;

import java.util.Map;

/* renamed from: bsxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxl extends bxvd implements bxxd {
    public bsxl() {
        super(bsxn.f147586d);
    }

    /* renamed from: a */
    public final void mo70719a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bsxn bsxn = bsxn.f147586d;
        ((bsxn) this.f164949b).mo70721a().put(str, str2);
    }

    /* renamed from: a */
    public final void mo70720a(Map map) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bsxn bsxn = bsxn.f147586d;
        ((bsxn) this.f164949b).mo70721a().putAll(map);
    }
}
