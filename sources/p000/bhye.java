package p000;

import android.os.SystemClock;

/* renamed from: bhye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhye {

    /* renamed from: a */
    public final bhzs f119880a;

    /* renamed from: b */
    public int f119881b = 0;

    /* renamed from: c */
    public int f119882c = 0;

    /* renamed from: d */
    public long f119883d;

    /* renamed from: e */
    public long f119884e;

    public bhye(bhzs bhzs) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f119880a = bhzs;
        this.f119883d = elapsedRealtime;
        this.f119884e = elapsedRealtime;
    }

    /* renamed from: a */
    public final void mo64414a(int i) {
        this.f119881b = i;
        this.f119883d = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final void mo64415b(int i) {
        this.f119882c = i;
        this.f119884e = SystemClock.elapsedRealtime();
    }
}
