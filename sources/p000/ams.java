package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: ams */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ams extends aky implements amn {

    /* renamed from: a */
    final /* synthetic */ amt f929a;

    /* renamed from: b */
    private final String f930b;

    /* renamed from: c */
    private final String f931c;

    /* renamed from: d */
    private boolean f932d;

    /* renamed from: e */
    private int f933e = -1;

    /* renamed from: f */
    private int f934f;

    /* renamed from: g */
    private amm f935g;

    /* renamed from: h */
    private int f936h;

    public ams(amt amt, String str, String str2) {
        this.f929a = amt;
        this.f930b = str;
        this.f931c = str2;
    }

    /* renamed from: a */
    public final void mo938a(int i) {
        this.f932d = false;
        amm amm = this.f935g;
        if (amm != null) {
            amm.mo1036a(this.f936h, i);
        }
    }

    /* renamed from: b */
    public final void mo940b(int i) {
        amm amm = this.f935g;
        if (amm == null) {
            this.f933e = i;
            this.f934f = 0;
            return;
        }
        amm.mo1041b(this.f936h, i);
    }

    /* renamed from: c */
    public final void mo941c() {
        this.f929a.mo1050a(this);
    }

    /* renamed from: d */
    public final void mo943d() {
        this.f932d = true;
        amm amm = this.f935g;
        if (amm != null) {
            amm.mo1040b(this.f936h);
        }
    }

    /* renamed from: e */
    public final void mo944e() {
        mo938a(0);
    }

    /* renamed from: f */
    public final int mo1045f() {
        return this.f936h;
    }

    /* renamed from: g */
    public final void mo1046g() {
        amm amm = this.f935g;
        if (amm != null) {
            amm.mo1035a(this.f936h);
            this.f935g = null;
            this.f936h = 0;
        }
    }

    /* renamed from: a */
    public final void mo1044a(amm amm) {
        this.f935g = amm;
        String str = this.f930b;
        String str2 = this.f931c;
        int i = amm.f912d;
        amm.f912d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = amm.f911c;
        amm.f911c = i2 + 1;
        amm.mo1038a(3, i2, i, null, bundle);
        this.f936h = i;
        if (this.f932d) {
            amm.mo1040b(i);
            int i3 = this.f933e;
            if (i3 >= 0) {
                amm.mo1041b(this.f936h, i3);
                this.f933e = -1;
            }
            int i4 = this.f934f;
            if (i4 != 0) {
                amm.mo1043c(this.f936h, i4);
                this.f934f = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo942c(int i) {
        amm amm = this.f935g;
        if (amm == null) {
            this.f934f += i;
        } else {
            amm.mo1043c(this.f936h, i);
        }
    }

    /* renamed from: a */
    public final boolean mo939a(Intent intent, alo alo) {
        amm amm = this.f935g;
        if (amm != null) {
            return amm.mo1039a(this.f936h, intent, alo);
        }
        return false;
    }
}
