package p000;

import java.util.ArrayList;

/* renamed from: hr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1058hr {

    /* renamed from: d */
    public final ArrayList f20270d = new ArrayList();

    /* renamed from: e */
    int f20271e;

    /* renamed from: f */
    int f20272f;

    /* renamed from: g */
    int f20273g;

    /* renamed from: h */
    int f20274h;

    /* renamed from: i */
    public int f20275i;

    /* renamed from: j */
    public boolean f20276j;

    /* renamed from: k */
    public boolean f20277k = true;

    /* renamed from: l */
    public String f20278l;

    /* renamed from: m */
    public int f20279m;

    /* renamed from: n */
    public CharSequence f20280n;

    /* renamed from: o */
    public int f20281o;

    /* renamed from: p */
    public CharSequence f20282p;

    /* renamed from: q */
    public ArrayList f20283q;

    /* renamed from: r */
    public ArrayList f20284r;

    /* renamed from: s */
    public boolean f20285s = false;

    /* renamed from: t */
    public ArrayList f20286t;

    /* renamed from: a */
    public final void mo12683a(int i, int i2, int i3, int i4) {
        this.f20271e = i;
        this.f20272f = i2;
        this.f20273g = i3;
        this.f20274h = i4;
    }

    /* renamed from: a */
    public void mo11281a(int i, C1018gh ghVar, String str, int i2) {
        throw null;
    }

    /* renamed from: a */
    public void mo11282a(C1018gh ghVar) {
        throw null;
    }

    /* renamed from: b */
    public final void mo12688b(int i, C1018gh ghVar, String str) {
        if (i != 0) {
            mo11281a(i, ghVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public void mo11287b(C1018gh ghVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo11289c(C1018gh ghVar) {
        throw null;
    }

    /* renamed from: d */
    public void mo11291d(C1018gh ghVar) {
        throw null;
    }

    /* renamed from: e */
    public void mo11293e(C1018gh ghVar) {
        throw null;
    }

    /* renamed from: f */
    public abstract int mo11294f();

    /* renamed from: g */
    public abstract int mo11295g();

    /* renamed from: h */
    public abstract void mo11296h();

    /* renamed from: i */
    public abstract void mo11297i();

    /* renamed from: k */
    public boolean mo11299k() {
        throw null;
    }

    /* renamed from: l */
    public final void mo12689l() {
        if (!this.f20276j) {
            this.f20277k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: a */
    public final void mo12684a(int i, C1018gh ghVar) {
        mo12688b(i, ghVar, null);
    }

    /* renamed from: a */
    public final void mo12685a(int i, C1018gh ghVar, String str) {
        mo11281a(i, ghVar, str, 1);
    }

    /* renamed from: a */
    public final void mo12686a(C1018gh ghVar, String str) {
        mo11281a(0, ghVar, str, 1);
    }

    /* renamed from: a */
    public final void mo12687a(C1057hq hqVar) {
        this.f20270d.add(hqVar);
        hqVar.f20207c = this.f20271e;
        hqVar.f20208d = this.f20272f;
        hqVar.f20209e = this.f20273g;
        hqVar.f20210f = this.f20274h;
    }
}
