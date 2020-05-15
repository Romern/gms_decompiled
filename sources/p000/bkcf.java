package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import java.util.List;
import java.util.Locale;

/* renamed from: bkcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkcf implements bjwm, bjwh, bkcg {

    /* renamed from: a */
    private final FragmentManager f123984a;

    /* renamed from: b */
    protected final bmde f123985b;

    /* renamed from: c */
    public bkch f123986c;

    /* renamed from: d */
    public final bjwf f123987d;

    /* renamed from: e */
    public final bjwf f123988e;

    /* renamed from: f */
    public bjwk f123989f;

    public bkcf(bmde bmde, FragmentManager fragmentManager) {
        this.f123985b = bmde;
        this.f123984a = fragmentManager;
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(m105308d());
        if (findFragmentByTag instanceof bkch) {
            bkch bkch = (bkch) findFragmentByTag;
            this.f123986c = bkch;
            bkch.f123992d = this;
        }
        this.f123987d = new bjwf();
        this.f123988e = new bjwf();
    }

    /* renamed from: c */
    private final void m105307c() {
        if (this.f123986c != null) {
            this.f123984a.beginTransaction().remove(this.f123986c).commit();
            this.f123986c = null;
        }
    }

    /* renamed from: d */
    private final String m105308d() {
        return String.format(Locale.US, "confirmationDialog%d", Long.valueOf(this.f123985b.f128783b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bkch mo52903a();

    /* renamed from: a */
    public final void mo65834a(bjwk bjwk) {
        this.f123989f = bjwk;
        bjwl.m104784a(this, this.f123985b.f128783b, this.f123989f);
        bjwl.m104784a(this.f123987d, this.f123985b.f128784c, this.f123989f);
        bjwl.m104784a(this.f123988e, this.f123985b.f128785d, this.f123989f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52904b() {
        throw null;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        bjwl.m104790b(this, this.f123985b.f128783b, this.f123989f);
        bjwl.m104790b(this.f123987d, this.f123985b.f128784c, this.f123989f);
        bjwl.m104790b(this.f123988e, this.f123985b.f128785d, this.f123989f);
    }

    /* renamed from: c */
    public final void mo52062c(int i) {
        this.f123986c = null;
        if (i == 1) {
            this.f123987d.mo65585a();
        } else {
            this.f123988e.mo65585a();
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            m105307c();
            int a2 = bmdd.m107914a(this.f123985b.f128791j);
            if (a2 != 0 && a2 == 2) {
                mo52904b();
                return;
            }
            bkch a3 = mo52903a();
            this.f123986c = a3;
            a3.f123992d = this;
            a3.show(this.f123984a, m105308d());
        } else if (i2 != 11) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a4 = bmmb.m108166a(bmmv.f130058d);
            if (a4 != 0) {
                i = a4;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported ResultingActionReference action type %s", objArr));
        } else {
            m105307c();
        }
    }
}
