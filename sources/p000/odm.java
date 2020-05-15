package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;

/* renamed from: odm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odm extends nrs implements oih, ojn {

    /* renamed from: d */
    private static final bnsn f37276d = odk.m28481a("CAR.INST");

    /* renamed from: a */
    public final Object f37277a = new Object();

    /* renamed from: b */
    public odl f37278b;

    /* renamed from: c */
    public volatile boolean f37279c;

    /* renamed from: e */
    private final oln f37280e;

    /* renamed from: f */
    private oii f37281f;

    public odm(oln oln) {
        this.f37280e = oln;
    }

    /* renamed from: c */
    private final void m28482c(nru nru) {
        this.f37280e.mo22279c();
        if (!this.f37279c) {
            throw new IllegalStateException("CarNotConnected");
        } else if (this.f37281f == null) {
            throw new IllegalStateException("MediaBrowserEndpoint not set.");
        } else if (nru != null) {
            synchronized (this.f37277a) {
                odl odl = this.f37278b;
                if (odl != null) {
                    if (odl.f37275b.f12819a != nru.f12819a) {
                        throw new IllegalArgumentException("Media playback service already in use.");
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("CarMediaPlaybackStatusEventListener is null");
        }
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return null;
        }
        this.f37279c = true;
        return this;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final boolean mo21496b(nru nru) {
        m28482c(nru);
        synchronized (this.f37277a) {
            odl odl = this.f37278b;
            if (odl == null) {
                return false;
            }
            IBinder iBinder = odl.f37275b.f12819a;
            bmxy.m108581a(odl);
            iBinder.unlinkToDeath(odl, 0);
            this.f37278b = null;
            return true;
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new oii(this, ojm);
    }

    /* renamed from: a */
    public final void mo22022a(int i) {
        synchronized (this.f37277a) {
            try {
                bmxy.m108581a(this.f37278b);
                nru nru = this.f37278b.f37275b;
                int i2 = i - 1;
                if (i != 0) {
                    Parcel bj = nru.mo8529bj();
                    bj.writeInt(i2);
                    nru.mo8530c(1, bj);
                } else {
                    throw null;
                }
            } catch (RemoteException e) {
                bnsi b = f37276d.mo68387b();
                b.mo68437a(e);
                b.mo68432a("odm", "a", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error calling onInput.");
            }
        }
    }

    /* renamed from: a */
    public final void mo21493a(nru nru, int i, String str, int i2, boolean z, boolean z2, boolean z3) {
        m28482c(nru);
        oii oii = this.f37281f;
        int a = birz.m102775a(i);
        bxvd da = bisa.f121490h.mo74144da();
        if (a != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bisa bisa = (bisa) da.f164949b;
            bisa.f121493b = a;
            bisa.f121492a |= 1;
        }
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bisa bisa2 = (bisa) da.f164949b;
            str.getClass();
            bisa2.f121492a |= 2;
            bisa2.f121494c = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bisa bisa3 = (bisa) da.f164949b;
        int i3 = bisa3.f121492a | 4;
        bisa3.f121492a = i3;
        bisa3.f121495d = i2;
        int i4 = i3 | 8;
        bisa3.f121492a = i4;
        bisa3.f121496e = z;
        int i5 = i4 | 16;
        bisa3.f121492a = i5;
        bisa3.f121497f = z2;
        bisa3.f121492a = i5 | 32;
        bisa3.f121498g = z3;
        int i6 = oii.f37691a;
        if (i6 != 0) {
            oii.mo22206a(i6, da.mo74062i());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo21494a(nru nru, String str, String str2, String str3, byte[] bArr, String str4, int i, int i2) {
        m28482c(nru);
        nuu.m27793a(bArr);
        oii oii = this.f37281f;
        bxvd da = birx.f121479i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        birx birx = (birx) da.f164949b;
        int i3 = birx.f121481a | 32;
        birx.f121481a = i3;
        birx.f121487g = i;
        int i4 = i3 | 64;
        birx.f121481a = i4;
        birx.f121488h = i2;
        if (str != null) {
            str.getClass();
            i4 |= 1;
            birx.f121481a = i4;
            birx.f121482b = str;
        }
        if (str2 != null) {
            str2.getClass();
            i4 |= 2;
            birx.f121481a = i4;
            birx.f121483c = str2;
        }
        if (str3 != null) {
            str3.getClass();
            birx.f121481a = i4 | 4;
            birx.f121484d = str3;
        }
        if (bArr != null) {
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            birx birx2 = (birx) da.f164949b;
            a.getClass();
            birx2.f121481a |= 8;
            birx2.f121485e = a;
        }
        if (str4 != null) {
            birx birx3 = (birx) da.f164949b;
            str4.getClass();
            birx3.f121481a |= 16;
            birx3.f121486f = str4;
        }
        int i5 = oii.f37692b;
        if (i5 != 0) {
            oii.mo22206a(i5, da.mo74062i());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f37281f = (oii) ojh;
    }

    /* renamed from: a */
    public final boolean mo21495a(nru nru) {
        synchronized (this.f37277a) {
            odl odl = this.f37278b;
            if (odl != null) {
                bmxy.m108581a(odl);
                mo21496b(odl.f37275b);
            }
            try {
                odl odl2 = new odl(this, nru);
                this.f37278b = odl2;
                IBinder iBinder = odl2.f37275b.f12819a;
                bmxy.m108581a(odl2);
                iBinder.linkToDeath(odl2, 0);
            } catch (RemoteException e) {
                bnsi c = f37276d.mo68388c();
                c.mo68437a(e);
                c.mo68432a("odm", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Adding listener failed.");
                return false;
            }
        }
        return true;
    }
}
