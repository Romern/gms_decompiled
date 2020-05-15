package p000;

import android.content.Context;

/* renamed from: ajxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajxe {

    /* renamed from: a */
    public final Context f71497a;

    /* renamed from: b */
    public final boolean f71498b;

    /* renamed from: c */
    public final ajxf[] f71499c;

    /* renamed from: d */
    public boolean f71500d = false;

    /* renamed from: e */
    private boolean f71501e = false;

    public ajxe(Context context, boolean z, ajxf... ajxfArr) {
        this.f71497a = context;
        this.f71498b = z;
        this.f71499c = ajxfArr;
    }

    /* renamed from: a */
    public abstract void mo39060a();

    /* renamed from: b */
    public abstract void mo39061b();

    /* renamed from: c */
    public final void mo39064c() {
        if (this.f71500d) {
            ajxf[] ajxfArr = this.f71499c;
            for (int i = 0; i < 2; i++) {
                ajxf ajxf = ajxfArr[i];
                ahhd.m55766a(ajxf.f71502a, ajxf.f71503b);
            }
            mo39065d();
            this.f71500d = false;
            srn srn = ajvp.f71371a;
            return;
        }
        srn srn2 = ajvp.f71371a;
    }

    /* renamed from: d */
    public final void mo39065d() {
        if (this.f71501e) {
            mo39061b();
            this.f71501e = false;
            srn srn = ajvp.f71371a;
            return;
        }
        srn srn2 = ajvp.f71371a;
    }

    /* renamed from: e */
    public final void mo39066e() {
        srn srn = ajvp.f71371a;
        ajxf[] ajxfArr = this.f71499c;
        int i = 0;
        while (i < 2) {
            if (ajxfArr[i].mo39062a()) {
                i++;
            } else {
                mo39065d();
                return;
            }
        }
        if (!this.f71501e) {
            mo39060a();
            this.f71501e = true;
        }
    }
}
