package p000;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: aqqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqj implements aquv, aqvr, aqql {

    /* renamed from: a */
    private final FloatingActionButton f86600a;

    /* renamed from: b */
    private int f86601b = 0;

    /* renamed from: c */
    private boolean f86602c;

    /* renamed from: d */
    private boolean f86603d;

    /* renamed from: e */
    private boolean f86604e;

    public aqqj(FloatingActionButton floatingActionButton, aquw aquw, tim tim) {
        this.f86600a = floatingActionButton;
        aquw.mo48174a(this);
        floatingActionButton.setOnClickListener(new aqqi(aquw, tim));
    }

    /* renamed from: a */
    private final void m71966a() {
        FloatingActionButton floatingActionButton = this.f86600a;
        int i = 8;
        if (this.f86604e && !this.f86603d && !this.f86602c && this.f86601b == 2) {
            i = 0;
        }
        floatingActionButton.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo48076a(int i, int i2) {
        this.f86601b = i;
        m71966a();
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        boolean z = false;
        if (aqqw.mo48087c() && aqqw.f86628d.f170193e) {
            z = true;
        }
        this.f86602c = z;
        m71966a();
    }

    /* renamed from: a */
    public final void mo48049a(boolean z) {
        this.f86604e = true;
        this.f86603d = z;
        m71966a();
    }
}
