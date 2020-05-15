package p000;

import android.graphics.Path;
import java.util.List;

/* renamed from: azu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azu implements azq, azx {

    /* renamed from: a */
    private final Path f2723a = new Path();

    /* renamed from: b */
    private final boolean f2724b;

    /* renamed from: c */
    private final ayo f2725c;

    /* renamed from: d */
    private final azy f2726d;

    /* renamed from: e */
    private boolean f2727e;

    /* renamed from: f */
    private final azf f2728f = new azf();

    public azu(ayo ayo, bcg bcg, bca bca) {
        this.f2724b = bca.f2914b;
        this.f2725c = ayo;
        azy a = bca.f2913a.mo2972a();
        this.f2726d = a;
        bcg.mo2989a(a);
        this.f2726d.mo2939a(this);
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2727e = false;
        this.f2725c.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        throw null;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        if (!this.f2727e) {
            this.f2723a.reset();
            if (!this.f2724b) {
                this.f2723a.set((Path) this.f2726d.mo2944f());
                this.f2723a.setFillType(Path.FillType.EVEN_ODD);
                this.f2728f.mo2928a(this.f2723a);
            }
            this.f2727e = true;
        }
        return this.f2723a;
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            azg azg = (azg) list.get(i);
            if (azg instanceof azw) {
                azw azw = (azw) azg;
                if (azw.f2738e == 1) {
                    this.f2728f.mo2929a(azw);
                    azw.mo2935a(this);
                }
            }
        }
    }
}
