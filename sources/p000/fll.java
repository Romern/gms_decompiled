package p000;

import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: fll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fll extends fkj {
    public fll(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
    }

    /* renamed from: b */
    public final fjq mo11012b() {
        mo10954t();
        DisplayMetrics displayMetrics = mo10944i().f16707b.getResources().getDisplayMetrics();
        fjq fjq = new fjq();
        fjq.f16744a = fog.m12073a(Locale.getDefault());
        fjq.f16745b = displayMetrics.widthPixels;
        fjq.f16746c = displayMetrics.heightPixels;
        return fjq;
    }

    /* renamed from: c */
    public final String mo11013c() {
        mo10954t();
        fjq b = mo11012b();
        int i = b.f16745b;
        int i2 = b.f16746c;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
