package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;

/* renamed from: bjjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjjn extends bjjm implements bjgz {

    /* renamed from: m */
    public Fragment f122831m;

    /* renamed from: o */
    ViewGroup f122832o;

    /* renamed from: p */
    private int f122833p;

    protected bjjn(bjgv bjgv, Class cls) {
        super(bjgv, cls);
    }

    /* renamed from: I */
    private final String mo65368I() {
        return String.valueOf(this.f122833p);
    }

    /* renamed from: E */
    public final void mo65299E() {
        this.f122676a.f122692a.f122731h.mo65221a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Fragment mo65307F() {
        return this.f122676a.f122692a.mo65228b().findFragmentByTag(mo65368I());
    }

    /* renamed from: a */
    public final void mo65210a(View view) {
        this.f122832o.removeView(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Fragment mo65308b(bwxl bwxl);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        if (this.f122831m != null) {
            this.f122686k.mo65337a();
            mo65166b(this.f122832o);
            this.f122686k.mo65339b();
            if (!this.f122831m.isAdded()) {
                this.f122676a.f122692a.mo65228b().beginTransaction().add(this.f122831m, mo65368I()).show(this.f122831m).commit();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65187s() {
        if (this.f122831m.isAdded()) {
            this.f122676a.f122692a.mo65228b().beginTransaction().hide(this.f122831m).remove(this.f122831m).commit();
        }
        super.mo65187s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final bjha mo65190u() {
        return bjha.m103465a(this);
    }

    /* renamed from: x */
    public final void mo65193x() {
        ViewGroup viewGroup = this.f122832o;
        if (viewGroup != null) {
            mo65166b(viewGroup);
        }
        this.f122686k.mo65340c();
    }

    /* renamed from: a */
    public final void mo65211a(View view, int i) {
        this.f122832o.addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65162a(bwxl bwxl, bwxl bwxl2) {
        int i;
        super.mo65162a(bwxl, bwxl2);
        bjgu bjgu = this.f122676a.f122696e;
        long j = bwxl2.f161386b;
        long j2 = bwxl != null ? bwxl.f161386b : -1;
        bjgw bjgw = (bjgw) bjgu;
        if (bjgw.f122701d == null) {
            bjgw.f122701d = new C1230nw();
        }
        if (bjgw.f122700c == null) {
            bjgw.f122700c = bjxv.m104861c();
        }
        if (bjgw.f122701d.mo15544d(j2)) {
            i = ((Integer) bjgw.f122701d.mo15535a(j2, null)).intValue();
            bjgw.f122701d.mo15539b(j2);
        } else {
            i = bjgw.f122700c.mo65614a();
        }
        bjgw.f122701d.mo15540b(j, Integer.valueOf(i));
        this.f122833p = i;
        Fragment b = mo65308b(bwxl2);
        this.f122831m = b;
        this.f122832o = ((bjgk) b).mo65148a(this.f122676a.f122692a.mo65227a());
    }
}
