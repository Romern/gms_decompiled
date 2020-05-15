package p000;

import java.io.IOException;

/* renamed from: cch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cch {

    /* renamed from: a */
    public final cci f6475a;

    /* renamed from: b */
    public final boolean[] f6476b;

    /* renamed from: c */
    public boolean f6477c;

    /* renamed from: d */
    public final /* synthetic */ cck f6478d;

    public cch(cck cck, cci cci) {
        this.f6478d = cck;
        this.f6475a = cci;
        this.f6476b = !cci.f6483e ? new boolean[cck.f6490d] : null;
    }

    /* renamed from: a */
    public final void mo3699a() {
        this.f6478d.mo3706a(this, false);
    }

    /* renamed from: b */
    public final void mo3700b() {
        if (!this.f6477c) {
            try {
                mo3699a();
            } catch (IOException e) {
            }
        }
    }
}
