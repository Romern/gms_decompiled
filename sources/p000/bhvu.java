package p000;

import android.os.SystemClock;

/* renamed from: bhvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvu {

    /* renamed from: a */
    public final bhuk f119704a;

    /* renamed from: b */
    public bhty f119705b;

    /* renamed from: c */
    public bhso f119706c;

    /* renamed from: d */
    private final bhqw f119707d;

    public bhvu(bhqw bhqw, bhuk bhuk) {
        this.f119707d = bhqw;
        this.f119704a = bhuk;
    }

    /* renamed from: a */
    public final void mo64347a(long[] jArr, boolean z) {
        int length = jArr.length;
        if (length > 0) {
            bhqw bhqw = this.f119707d;
            bhvt bhvt = new bhvt(this, SystemClock.elapsedRealtime(), length);
            if (!cghh.m145423d()) {
                bhqw.f119358c.mo64490a(new biau(bhqw.f119356a, jArr), new bhqs(bhvt, z));
            } else {
                bhqw.f119358c.mo64490a(new bica(bhqw.f119357b, jArr), new bhqt(bhvt, z));
            }
        } else {
            bhuj.m101555a();
        }
    }
}
