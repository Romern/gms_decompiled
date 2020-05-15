package p000;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: xr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1495xr {

    /* renamed from: a */
    private final CompoundButton f27608a;

    /* renamed from: b */
    private boolean f27609b;

    public C1495xr(CompoundButton compoundButton) {
        this.f27608a = compoundButton;
    }

    /* renamed from: a */
    public final void mo16508a() {
        if (!this.f27609b) {
            this.f27609b = true;
            CompoundButton compoundButton = this.f27608a;
            int i = Build.VERSION.SDK_INT;
            compoundButton.getButtonDrawable();
            return;
        }
        this.f27609b = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x007f }] */
    /* renamed from: a */
    public final void mo16509a(AttributeSet attributeSet, int i) {
        int f;
        int f2;
        adr a = adr.m523a(this.f27608a.getContext(), attributeSet, C1390tu.f27203l, i, 0);
        CompoundButton compoundButton = this.f27608a;
        C1280ps.m19886a(compoundButton, compoundButton.getContext(), C1390tu.f27203l, attributeSet, a.f290b, i, 0);
        try {
            if (a.mo461f(1) && (f2 = a.mo460f(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f27608a;
                    compoundButton2.setButtonDrawable(C1391tv.m20459b(compoundButton2.getContext(), f2));
                } catch (Resources.NotFoundException e) {
                }
                if (a.mo461f(2)) {
                    C1321rf.m20065a(this.f27608a, a.mo459e(2));
                }
                if (a.mo461f(3)) {
                    CompoundButton compoundButton3 = this.f27608a;
                    PorterDuff.Mode a2 = C1540zi.m20968a(a.mo448a(3, -1), null);
                    int i2 = Build.VERSION.SDK_INT;
                    compoundButton3.setButtonTintMode(a2);
                }
            }
            if (a.mo461f(0) && (f = a.mo460f(0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f27608a;
                compoundButton4.setButtonDrawable(C1391tv.m20459b(compoundButton4.getContext(), f));
            }
            if (a.mo461f(2)) {
            }
            if (a.mo461f(3)) {
            }
        } finally {
            a.mo450a();
        }
    }
}
