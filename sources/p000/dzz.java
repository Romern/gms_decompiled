package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzz {

    /* renamed from: a */
    public final Set f14509a;

    /* renamed from: b */
    public int f14510b;

    /* renamed from: c */
    public long f14511c;

    /* renamed from: d */
    public int f14512d;

    /* renamed from: e */
    public long f14513e;

    /* renamed from: f */
    private final bdyx f14514f;

    /* renamed from: g */
    private final bdyx f14515g;

    /* renamed from: h */
    private final bdyx f14516h;

    /* renamed from: i */
    private final boolean f14517i;

    public dzz(bdyx bdyx, bdyx bdyx2, bdyx bdyx3) {
        this(bdyx, bdyx2, bdyx3, true);
    }

    /* renamed from: b */
    private final boolean m9940b(dwa dwa) {
        new Object[1][0] = dwa;
        boolean remove = this.f14509a.remove(dwa);
        new Object[1][0] = Boolean.valueOf(remove);
        return remove;
    }

    /* renamed from: c */
    private final boolean m9941c() {
        long j;
        int i = this.f14510b;
        long j2 = this.f14511c;
        this.f14510b = mo9895a();
        this.f14511c = mo9899b();
        for (dwa dwa : this.f14509a) {
            dwk g = dwa.mo9753g();
            if (g == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dzz", "d", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ProductionPriorityIntervalResolver] Unexpected null production policy in interest record %s", dwa);
            } else {
                mo9896a(g);
                int i2 = this.f14512d;
                int i3 = this.f14510b;
                if (i3 == -1 ? i2 == 100 || i2 == 102 || i2 == 104 || i2 == 105 : i3 == 102 ? i2 == 100 : i3 == 104 ? i2 == 100 || i2 == 102 : i3 == 105 && (i2 == 100 || i2 == 102 || i2 == 104)) {
                    this.f14510b = i2;
                    j = this.f14513e;
                } else if (i2 == i3) {
                    j = Math.min(this.f14513e, this.f14511c);
                }
                this.f14511c = j;
            }
        }
        return (this.f14510b == i && this.f14511c == j2) ? false : true;
    }

    /* renamed from: d */
    private final void m9942d() {
        long j;
        this.f14510b = mo9895a();
        this.f14511c = mo9899b();
        for (dwa dwa : this.f14509a) {
            dwk g = dwa.mo9753g();
            if (g == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dzz", "d", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ProductionPriorityIntervalResolver] Unexpected null production policy in interest record %s", dwa);
            } else {
                mo9896a(g);
                int i = this.f14512d;
                int i2 = this.f14510b;
                if (i2 == -1 ? i == 100 || i == 102 || i == 104 || i == 105 : i2 == 102 ? i == 100 : i2 == 104 ? i == 100 || i == 102 : i2 == 105 && (i == 100 || i == 102 || i == 104)) {
                    this.f14510b = i;
                    j = this.f14513e;
                } else if (i == i2) {
                    j = Math.min(this.f14513e, this.f14511c);
                }
                this.f14511c = j;
            }
        }
    }

    /* renamed from: a */
    public final int mo9895a() {
        bdyx bdyx = this.f14515g;
        if (bdyx != null) {
            return ((Long) bdyx.mo58455c()).intValue();
        }
        return -1;
    }

    public dzz(bdyx bdyx, bdyx bdyx2, bdyx bdyx3, boolean z) {
        this.f14509a = new HashSet();
        this.f14514f = bdyx;
        this.f14515g = bdyx2;
        sdo.m34959a(bdyx3);
        this.f14516h = bdyx3;
        this.f14510b = mo9895a();
        long b = mo9899b();
        this.f14511c = b;
        this.f14512d = this.f14510b;
        this.f14513e = b;
        this.f14517i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9896a(dwk dwk) {
        int i;
        if (dwk == null) {
            this.f14512d = mo9895a();
            this.f14513e = mo9899b();
            return;
        }
        int a = dwk.mo9780a();
        if (a == 2) {
            this.f14512d = mo9895a();
            this.f14513e = dwk.mo9781b();
        } else if (a == 3) {
            this.f14512d = dwk.mo9782c();
            this.f14513e = dwk.mo9781b();
        } else if (a != 6) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dzz", "a", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[ProductionPriorityIntervalResolver] Unknown production policy type = %s", dwk.mo9780a());
            this.f14512d = this.f14510b;
            this.f14513e = this.f14511c;
        } else {
            bdyx bdyx = this.f14514f;
            if (bdyx != null) {
                i = ((Long) bdyx.mo58455c()).intValue();
            } else {
                i = -1;
            }
            this.f14512d = i;
            this.f14513e = dwk.mo9783d();
        }
    }

    /* renamed from: b */
    public final long mo9899b() {
        return ((Long) this.f14516h.mo58455c()).longValue();
    }

    /* renamed from: a */
    public final boolean mo9897a(dwa dwa) {
        if (dwa == null) {
            return false;
        }
        boolean b = m9940b(dwa);
        return (!this.f14517i || !b) ? b : m9941c();
    }

    /* renamed from: a */
    public final boolean mo9898a(dwa dwa, dwa dwa2) {
        boolean z;
        if (dwa2 != null) {
            z = m9940b(dwa2);
        } else {
            z = false;
        }
        if (dwa.m9589a(dwa, 6) || dwa.m9589a(dwa, 3) || dwa.m9589a(dwa, 2)) {
            new Object[1][0] = dwa;
            this.f14509a.remove(dwa);
            this.f14509a.add(dwa);
            z = true;
        }
        return (!this.f14517i || !z) ? z : m9941c();
    }
}
