package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: aujg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujg {

    /* renamed from: a */
    asfb f91937a;

    /* renamed from: b */
    public int f91938b;

    /* renamed from: c */
    long f91939c;

    /* renamed from: d */
    public ExperimentTokens f91940d;

    /* renamed from: e */
    final aujh f91941e;

    /* renamed from: f */
    public boolean f91942f;

    /* renamed from: g */
    public final int f91943g;

    /* renamed from: h */
    public int f91944h;

    public aujg(Context context, int i) {
        this.f91944h = 0;
        this.f91939c = System.currentTimeMillis();
        this.f91943g = i;
        this.f91942f = true;
        if (cgzf.f188102a.mo6606a().mo84803l()) {
            int i2 = Build.VERSION.SDK_INT;
            this.f91941e = new aukg();
        } else {
            this.f91941e = new aujm();
        }
        asfb asfb = new asfb(context, 1, "wake:CollectionChimeraSvc", null, "com.google.android.gms");
        this.f91937a = asfb;
        asfb.mo49115a(false);
        this.f91937a.mo49111a(5000);
    }

    /* renamed from: a */
    public final void mo50581a() {
        this.f91942f = false;
    }

    public aujg(Context context, aujh aujh) {
        this(context, 2);
        this.f91941e = aujh;
    }
}
