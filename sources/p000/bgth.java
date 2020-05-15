package p000;

import android.os.HandlerThread;

/* renamed from: bgth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgth {

    /* renamed from: d */
    public static final /* synthetic */ int f117484d = 0;

    /* renamed from: a */
    public final String f117485a;

    /* renamed from: b */
    public final bgtg f117486b;

    /* renamed from: c */
    public bgtf f117487c;

    /* renamed from: e */
    private final bgtf f117488e;

    /* renamed from: f */
    private bgtf f117489f;

    static {
        srn.m36125a("QStage");
    }

    public bgth(String str, HandlerThread handlerThread) {
        bgtl bgtl = new bgtl();
        this.f117488e = bgtl;
        this.f117489f = bgtl;
        this.f117485a = str;
        this.f117486b = new bgtg(this, handlerThread.getLooper());
    }

    /* renamed from: a */
    public final bgsq mo63151a(int i) {
        return new bgsq(i, this.f117486b);
    }

    /* renamed from: b */
    public final void mo63154b() {
        mo63153a(this.f117488e);
    }

    /* renamed from: b */
    public final void mo63155b(bgtf bgtf) {
        if (this.f117487c == null) {
            this.f117487c = bgtf;
        }
        bgtf bgtf2 = this.f117489f;
        bgtf2.f117480f = bgtf;
        bgtf.f117481g = bgtf2;
        this.f117489f = bgtf;
        bgtf.f117482h = this;
    }

    /* renamed from: c */
    public final void mo63156c() {
        sdo.m34959a(this.f117487c.f117480f);
        bgtf bgtf = this.f117487c.f117480f;
        this.f117487c = bgtf;
        bgtf.mo63111a();
    }

    /* renamed from: a */
    public final void mo63152a() {
        this.f117487c.mo63111a();
    }

    /* renamed from: a */
    public final void mo63153a(bgtf bgtf) {
        while (true) {
            bgtf bgtf2 = this.f117487c;
            if (bgtf2 != bgtf && bgtf2 != this.f117488e) {
                bgtf2.mo63113b();
                this.f117487c = this.f117487c.f117481g;
            } else {
                return;
            }
        }
    }
}
