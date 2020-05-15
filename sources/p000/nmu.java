package p000;

import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: nmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nmu {

    /* renamed from: a */
    public volatile ojx f36055a;

    /* renamed from: b */
    public volatile omi f36056b;

    /* renamed from: c */
    public int[] f36057c;

    /* renamed from: d */
    public boolean f36058d;

    /* renamed from: e */
    final /* synthetic */ nmv f36059e;

    /* renamed from: f */
    private boolean f36060f;

    public nmu(nmv nmv) {
        this.f36059e = nmv;
    }

    /* renamed from: c */
    private final void m26865c() {
        while (this.f36058d) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: a */
    public final bxxc mo21169a(biva biva) {
        try {
            ojx ojx = this.f36055a;
            if (ojx != null) {
                return ojx.mo22230c(biva.f121920w);
            }
            if (this.f36056b == null) {
                return null;
            }
            synchronized (this) {
                m26865c();
                if (this.f36056b == null) {
                    bxxc a = mo21169a(biva);
                    return a;
                }
                bxxc a2 = ojx.m28966a(biva, this.f36056b.mo22289a(biva.f121920w));
                return a2;
            }
        } catch (RemoteException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo21173b() {
        try {
            ojx ojx = this.f36055a;
            if (ojx != null) {
                return ojx.f37816a;
            }
            if (this.f36056b == null) {
                return false;
            }
            synchronized (this) {
                m26865c();
                if (this.f36056b != null) {
                    boolean bk = this.f36056b.mo22291bk();
                    return bk;
                }
                boolean b = mo21173b();
                return b;
            }
        } catch (RemoteException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo21170a(int[] iArr) {
        this.f36060f = true;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (iArr[i] == 13) {
                    this.f36060f = false;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (this.f36060f) {
            bnsi d = nmv.f36061a.mo68390d();
            d.mo68432a("nmu", "a", 1353, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("No driving status, always restricted");
        }
        this.f36057c = new int[(iArr.length + (this.f36060f ? 1 : 0))];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f36057c[i2] = nmv.m26871a(iArr[i2]);
        }
        if (this.f36060f) {
            int[] iArr2 = this.f36057c;
            iArr2[iArr2.length - 1] = 11;
        }
        Arrays.sort(this.f36057c);
    }

    /* renamed from: a */
    public final boolean mo21171a(biva biva, long j) {
        if (this.f36060f && biva == biva.SENSOR_DRIVING_STATUS_DATA) {
            return true;
        }
        try {
            ojx ojx = this.f36055a;
            if (ojx != null) {
                return ojx.mo22229a(biva, j);
            }
            if (this.f36056b == null) {
                return false;
            }
            synchronized (this) {
                m26865c();
                if (this.f36056b == null) {
                    boolean a = mo21171a(biva, j);
                    return a;
                }
                boolean a2 = this.f36056b.mo22288a(biva.f121920w, j);
                return a2;
            }
        } catch (RemoteException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final int[] mo21172a() {
        int[] iArr = this.f36057c;
        if (iArr != null) {
            return iArr;
        }
        return new int[]{11};
    }
}
