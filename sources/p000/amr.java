package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amr extends akv implements amn {

    /* renamed from: e */
    String f920e;

    /* renamed from: f */
    String f921f;

    /* renamed from: g */
    final /* synthetic */ amt f922g;

    /* renamed from: h */
    private final String f923h;

    /* renamed from: i */
    private boolean f924i;

    /* renamed from: j */
    private int f925j = -1;

    /* renamed from: k */
    private int f926k;

    /* renamed from: l */
    private amm f927l;

    /* renamed from: m */
    private int f928m = -1;

    public amr(amt amt, String str) {
        this.f922g = amt;
        this.f923h = str;
    }

    /* renamed from: a */
    public final String mo929a() {
        return this.f920e;
    }

    /* renamed from: b */
    public final String mo933b() {
        return this.f921f;
    }

    /* renamed from: c */
    public final void mo941c() {
        this.f922g.mo1050a(this);
    }

    /* renamed from: d */
    public final void mo943d() {
        this.f924i = true;
        amm amm = this.f927l;
        if (amm != null) {
            amm.mo1040b(this.f928m);
        }
    }

    /* renamed from: e */
    public final void mo944e() {
        mo938a(0);
    }

    /* renamed from: f */
    public final int mo1045f() {
        return this.f928m;
    }

    /* renamed from: g */
    public final void mo1046g() {
        amm amm = this.f927l;
        if (amm != null) {
            amm.mo1035a(this.f928m);
            this.f927l = null;
            this.f928m = 0;
        }
    }

    /* renamed from: a */
    public final void mo938a(int i) {
        this.f924i = false;
        amm amm = this.f927l;
        if (amm != null) {
            amm.mo1036a(this.f928m, i);
        }
    }

    /* renamed from: b */
    public final void mo940b(int i) {
        amm amm = this.f927l;
        if (amm == null) {
            this.f925j = i;
            this.f926k = 0;
            return;
        }
        amm.mo1041b(this.f928m, i);
    }

    /* renamed from: c */
    public final void mo942c(int i) {
        amm amm = this.f927l;
        if (amm == null) {
            this.f926k += i;
        } else {
            amm.mo1043c(this.f928m, i);
        }
    }

    /* renamed from: a */
    public final void mo1044a(amm amm) {
        amq amq = new amq(this);
        this.f927l = amm;
        String str = this.f923h;
        int i = amm.f912d;
        amm.f912d = i + 1;
        int i2 = amm.f911c;
        amm.f911c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        amm.mo1038a(11, i2, i, null, bundle);
        amm.f915g.put(i2, amq);
        this.f928m = i;
        if (this.f924i) {
            amm.mo1040b(i);
            int i3 = this.f925j;
            if (i3 >= 0) {
                amm.mo1041b(this.f928m, i3);
                this.f925j = -1;
            }
            int i4 = this.f926k;
            if (i4 != 0) {
                amm.mo1043c(this.f928m, i4);
                this.f926k = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo934b(String str) {
        amm amm = this.f927l;
        if (amm != null) {
            int i = this.f928m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = amm.f911c;
            amm.f911c = i2 + 1;
            amm.mo1038a(13, i2, i, null, bundle);
        }
    }

    /* renamed from: a */
    public final void mo930a(String str) {
        amm amm = this.f927l;
        if (amm != null) {
            int i = this.f928m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = amm.f911c;
            amm.f911c = i2 + 1;
            amm.mo1038a(12, i2, i, null, bundle);
        }
    }

    /* renamed from: a */
    public final void mo931a(List list) {
        amm amm = this.f927l;
        if (amm != null) {
            int i = this.f928m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList(list));
            int i2 = amm.f911c;
            amm.f911c = i2 + 1;
            amm.mo1038a(14, i2, i, null, bundle);
        }
    }

    /* renamed from: a */
    public final boolean mo939a(Intent intent, alo alo) {
        amm amm = this.f927l;
        if (amm != null) {
            return amm.mo1039a(this.f928m, intent, alo);
        }
        return false;
    }
}
