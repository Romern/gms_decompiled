package p000;

import android.content.Context;

/* renamed from: bjkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkk {

    /* renamed from: a */
    public final bjkb f122856a;

    /* renamed from: b */
    public final Context f122857b;

    /* renamed from: c */
    public final bjkj f122858c;

    /* renamed from: d */
    public bjjz f122859d;

    /* renamed from: e */
    public int f122860e;

    /* renamed from: f */
    int f122861f;

    /* renamed from: g */
    boolean f122862g;

    public bjkk(Context context, bjkb bjkb, bjkj bjkj) {
        this.f122856a = bjkb;
        this.f122858c = bjkj;
        this.f122857b = context;
    }

    /* renamed from: a */
    public final void mo65337a() {
        this.f122862g = true;
    }

    /* renamed from: b */
    public final void mo65339b() {
        this.f122862g = false;
    }

    /* renamed from: c */
    public final void mo65340c() {
        this.f122861f = this.f122860e;
    }

    /* renamed from: a */
    public final boolean mo65338a(bjka bjka, int... iArr) {
        boolean z = this.f122862g;
        if (z) {
            return z;
        }
        for (int i : iArr) {
            if (bjka.mo65331d(i, this.f122861f) != bjka.mo65331d(i, this.f122860e)) {
                return true;
            }
        }
        return z;
    }
}
