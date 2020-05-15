package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: bvcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvcg implements Runnable, bvcb, bvcc {

    /* renamed from: a */
    public final bvcd f155579a;

    /* renamed from: b */
    public final bvbz f155580b;

    /* renamed from: c */
    public boolean f155581c;

    /* renamed from: d */
    final /* synthetic */ bvch f155582d;

    /* renamed from: e */
    private final HashSet f155583e;

    /* renamed from: f */
    private int f155584f;

    /* renamed from: g */
    private long f155585g;

    /* renamed from: h */
    private final Runnable f155586h = new bvce(this);

    /* renamed from: i */
    private final Runnable f155587i = new bvcf(this);

    public bvcg(bvch bvch, bvcd bvcd, bvbz bvbz, bvcd[] bvcdArr) {
        this.f155582d = bvch;
        sdo.m34959a(bvcd);
        this.f155579a = bvcd;
        sdo.m34959a(bvbz);
        this.f155580b = bvbz;
        if (bvcdArr == null || bvcdArr.length == 0) {
            this.f155583e = null;
        } else {
            HashSet hashSet = new HashSet();
            this.f155583e = hashSet;
            hashSet.addAll(Arrays.asList(bvcdArr));
        }
        this.f155581c = false;
        m120899b(0);
    }

    /* renamed from: a */
    private final void m120898a(long j) {
        if (j > 0) {
            this.f155582d.f155589b.postDelayed(this, j);
        } else {
            run();
        }
    }

    /* renamed from: b */
    private final void m120899b(int i) {
        if (this.f155584f != i) {
            this.f155584f = i;
            if (i == 0) {
                this.f155582d.f155593f.remove(this.f155579a);
                bvch bvch = this.f155582d;
                bvch.f155589b.post(bvch.f155594g);
            } else if (i == 1) {
                if (this.f155582d.f155593f.contains(this.f155579a)) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl.mo68437a(new IllegalStateException());
                    bnsl.mo68432a("bvcg", "b", 453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("DutyCycler: Should not be in running when transitioning to WARMUP");
                }
                this.f155582d.f155593f.add(this.f155579a);
            } else if (i != 2) {
                if (i != 3) {
                    bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl2.mo68437a(new IllegalStateException());
                    bnsl2.mo68432a("bvcg", "b", 473, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("DutyCycler: Unknown state %d", i);
                    m120899b(0);
                } else if (!this.f155582d.f155593f.contains(this.f155579a)) {
                    bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl3.mo68437a(new IllegalStateException());
                    bnsl3.mo68432a("bvcg", "b", 467, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("DutyCycler: Should already be in running when transitioning to COOLDOWN.");
                    this.f155582d.f155593f.add(this.f155579a);
                }
            } else if (!this.f155582d.f155593f.contains(this.f155579a)) {
                bnsl bnsl4 = (bnsl) bvcm.f155598a.mo68387b();
                bnsl4.mo68437a(new IllegalStateException());
                bnsl4.mo68432a("bvcg", "b", 460, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("DutyCycler: Should already be in running when transitioning to ACTIVE.");
                this.f155582d.f155593f.add(this.f155579a);
            }
        }
    }

    /* renamed from: e */
    private final void m120900e() {
        int i = this.f155584f;
        if (i != 0) {
            if (i == 1 || i == 2) {
                this.f155579a.mo73219a(bvch.f155588a);
                m120899b(0);
                return;
            } else if (i != 3) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("bvcg", "e", 494, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DutyCycler: Unknown state in runFinishSafely.");
                return;
            }
        }
        m120899b(0);
    }

    /* renamed from: a */
    public final boolean mo73302a(int i) {
        return this.f155581c || this.f155584f == i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo73304c() {
        if (!mo73302a(3)) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("bvcg", "c", 408, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DutyCycler: Should be in cooldown state");
        }
        run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo73305d() {
        if (!mo73302a(1)) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("bvcg", "d", 395, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DutyCycler: Should be in warmup state.");
        }
        run();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bvcg) {
            return this.f155579a.equals(((bvcg) obj).f155579a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f155579a.hashCode();
    }

    public final void run() {
        if (!this.f155581c) {
            int i = this.f155584f;
            if (i == 0) {
                m120899b(1);
                this.f155585g = SystemClock.elapsedRealtime();
                this.f155579a.mo73218a((bvcb) this);
            } else if (i == 1) {
                m120899b(2);
                m120898a(this.f155580b.f155574b);
            } else if (i == 2) {
                m120899b(3);
                this.f155579a.mo73219a((bvcc) this);
            } else if (i != 3) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("bvcg", "run", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DutyCycler: Unknown state.  Going to wait state immediately.");
                m120899b(0);
                m120898a(this.f155580b.f155573a);
            } else {
                m120899b(0);
                long j = this.f155580b.f155573a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f155582d.mo73311a(this, (j - elapsedRealtime) + this.f155585g);
            }
        } else {
            int i2 = this.f155584f;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    this.f155579a.mo73219a(bvch.f155588a);
                    m120899b(0);
                    return;
                } else if (i2 != 3) {
                    bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl2.mo68432a("bvcg", "e", 494, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("DutyCycler: Unknown state in runFinishSafely.");
                    return;
                }
            }
            m120899b(0);
        }
    }

    /* renamed from: a */
    public final void mo73294a() {
        this.f155582d.f155589b.post(this.f155587i);
    }

    /* renamed from: a */
    public final boolean mo73303a(bvcd bvcd) {
        HashSet hashSet = this.f155583e;
        if (hashSet != null) {
            return hashSet.contains(bvcd);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo73299b() {
        this.f155582d.f155589b.post(this.f155586h);
    }
}
