package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: hsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hsl {

    /* renamed from: a */
    public int f20364a = C0126R.C0127drawable.ic_avatar_circle_40dp;

    /* renamed from: b */
    public String f20365b;

    /* renamed from: c */
    public boolean f20366c = false;

    /* renamed from: d */
    public String f20367d;

    /* renamed from: e */
    public String f20368e;

    /* renamed from: a */
    public final hsm mo12693a() {
        return new hsm(this);
    }

    /* renamed from: a */
    public final void mo12695a(int i, boolean z) {
        this.f20366c = z;
        this.f20364a = i;
    }

    /* renamed from: a */
    public final void mo12694a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            mo12695a(C0126R.C0127drawable.quantum_ic_phone_white_24, false);
        } else if (i2 != 1) {
            mo12695a(C0126R.C0127drawable.ic_avatar_circle_40dp, true);
        } else {
            mo12695a(C0126R.C0127drawable.quantum_ic_email_white_24, false);
        }
    }
}
