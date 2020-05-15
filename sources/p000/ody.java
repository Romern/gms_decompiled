package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: ody */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ody extends nrv implements ogx {

    /* renamed from: g */
    public static final /* synthetic */ int f37316g = 0;

    /* renamed from: h */
    private static final bnsn f37317h = odk.m28481a("CAR.MSG");

    /* renamed from: i */
    private static final int[][] f37318i = {new int[]{131073}, new int[]{327681}, new int[]{65537}};

    /* renamed from: a */
    public ohb f37319a;

    /* renamed from: b */
    public final Object f37320b = new Object();

    /* renamed from: c */
    public final odx[] f37321c = new odx[3];

    /* renamed from: d */
    public final LinkedList f37322d = new LinkedList();

    /* renamed from: e */
    public boolean f37323e = false;

    /* renamed from: f */
    public boolean f37324f = false;

    /* renamed from: j */
    private final olp f37325j;

    /* renamed from: k */
    private final olt f37326k;

    /* renamed from: l */
    private final Context f37327l;

    /* renamed from: m */
    private final HashMap f37328m = new HashMap();

    /* renamed from: n */
    private final nwx f37329n;

    public ody(olp olp, olt olt, Context context) {
        this.f37325j = olp;
        this.f37326k = olt;
        this.f37327l = context;
        this.f37329n = new nwx(context);
    }

    /* renamed from: b */
    private static final long m28536b(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* renamed from: c */
    private final odx m28538c(nrx nrx, int i) {
        odx odx;
        synchronized (this.f37320b) {
            odx e = m28539e(nrx);
            odx = this.f37321c[i];
            if (odx == null) {
                throw new IllegalStateException("not owned");
            } else if (odx != e) {
                throw new IllegalStateException("not owned");
            }
        }
        return odx;
    }

    /* renamed from: e */
    private final odx m28539e(nrx nrx) {
        odx d = mo22040d(nrx);
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("not registered");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final odx mo22040d(nrx nrx) {
        IBinder iBinder = nrx.f12819a;
        synchronized (this.f37320b) {
            Iterator it = this.f37322d.iterator();
            while (it.hasNext()) {
                odx odx = (odx) it.next();
                if (odx.f37315d.f12819a == iBinder) {
                    return odx;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final int m28531a(int i, int i2) {
        m28537b(i);
        int[] iArr = f37318i[i];
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("wrong key ");
        sb.append(i2);
        sb.append(" for given category ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private static final void m28537b(int i) {
        if (i < 0 || i >= f37318i.length) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("wrong category ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo21501b(nrx nrx) {
        synchronized (this.f37320b) {
            odx d = mo22040d(nrx);
            if (d != null) {
                mo22037a(d);
            }
        }
    }

    /* renamed from: a */
    private final void m28532a() {
        this.f37329n.mo21770a();
    }

    /* renamed from: c */
    public final void mo21503c(nrx nrx) {
        this.f37326k.mo21255R();
        odx e = m28539e(nrx);
        synchronized (this.f37320b) {
            int i = 0;
            while (true) {
                odx[] odxArr = this.f37321c;
                int length = odxArr.length;
                if (i < 3) {
                    if (odxArr[i] == e) {
                        odxArr[i] = null;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m28533a(int i) {
        if (i != 0) {
            if (i == 1 && this.f37323e) {
                this.f37323e = false;
                m28535a(i, 0, 0, (odx) null);
            }
        } else if (this.f37324f) {
            this.f37324f = false;
            m28535a(i, 0, 2, (odx) null);
        }
    }

    /* renamed from: b */
    public final void mo21502b(nrx nrx, int i) {
        this.f37326k.mo21255R();
        m28537b(i);
        odx e = m28539e(nrx);
        synchronized (this.f37320b) {
            odx[] odxArr = this.f37321c;
            if (odxArr[i] != e) {
                bnsi c = f37317h.mo68388c();
                c.mo68432a("ody", "b", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Tried to release unowned category");
            } else {
                odxArr[i] = null;
            }
        }
    }

    /* renamed from: a */
    private final void m28534a(int i, int i2, int i3) {
        odx odx;
        Integer valueOf;
        synchronized (this.f37320b) {
            odx = this.f37321c[i];
            HashMap hashMap = this.f37328m;
            Long valueOf2 = Long.valueOf(m28536b(i, i2));
            valueOf = Integer.valueOf(i3);
            hashMap.put(valueOf2, valueOf);
        }
        if (odx != null) {
            try {
                nrx nrx = odx.f37315d;
                Parcel bj = nrx.mo8529bj();
                bj.writeInt(i);
                bj.writeInt(i2);
                bj.writeInt(i3);
                nrx.mo8530c(1, bj);
            } catch (RemoteException e) {
                mo22037a(odx);
            }
        } else {
            bnsi d = f37317h.mo68390d();
            d.mo68432a("ody", "a", 448, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68425a("No receiver for message from car, category:%d key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2), valueOf);
        }
    }

    /* renamed from: b */
    public final void mo22039b(boolean z) {
        m28534a(2, 0, z ^ true ? 1 : 0);
    }

    /* renamed from: a */
    private final void m28535a(int i, int i2, int i3, odx odx) {
        ComponentName b;
        if (i != 0) {
            if (i != 1 || i2 != 0) {
                return;
            }
            if (i3 == 1) {
                if (!(odx == null || (b = this.f37325j.mo21320b(odx.f37312a)) == null)) {
                    this.f37329n.mo21771b(b);
                }
                bmxy.m108581a(this.f37319a);
                ohb ohb = this.f37319a;
                bxvd da = bisl.f121580c.mo74144da();
                bisn bisn = bisn.NAV_FOCUS_PROJECTED;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bisl bisl = (bisl) da.f164949b;
                bisl.f121583b = bisn.f121588c;
                bisl.f121582a |= 1;
                ((ojh) ohb).mo22206a(13, (bisl) da.mo74062i());
                synchronized (this.f37320b) {
                    this.f37323e = true;
                }
            } else if (i3 == 0) {
                m28532a();
                bmxy.m108581a(this.f37319a);
                ohb ohb2 = this.f37319a;
                bxvd da2 = bisl.f121580c.mo74144da();
                bisn bisn2 = bisn.NAV_FOCUS_NATIVE;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bisl bisl2 = (bisl) da2.f164949b;
                bisl2.f121583b = bisn2.f121588c;
                bisl2.f121582a |= 1;
                ((ojh) ohb2).mo22206a(13, (bisl) da2.mo74062i());
                synchronized (this.f37320b) {
                    this.f37323e = false;
                }
            } else {
                StringBuilder sb = new StringBuilder(69);
                sb.append("Unknown value, category:");
                sb.append(i);
                sb.append(" key:0 value:");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (i2 != 0) {
        } else {
            if (i3 == 1 || i3 == 2) {
                if (i3 != 1) {
                    synchronized (this.f37320b) {
                        this.f37324f = false;
                    }
                } else {
                    synchronized (this.f37320b) {
                        this.f37324f = true;
                    }
                }
                bmxy.m108581a(this.f37319a);
                ohb ohb3 = this.f37319a;
                int a = biwr.m102911a(i3);
                bxvd da3 = biwp.f122115c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                biwp biwp = (biwp) da3.f164949b;
                if (a != 0) {
                    biwp.f122118b = a;
                    biwp.f122117a |= 1;
                    ((ojh) ohb3).mo22206a(17, (biwp) da3.mo74062i());
                    return;
                }
                throw null;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("Unknown value, category:");
            sb2.append(i);
            sb2.append(" key:0 value:");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo21497a(nrx nrx) {
        this.f37326k.mo21255R();
        synchronized (this.f37320b) {
            if (mo22040d(nrx) == null) {
                odx odx = new odx(this, nrx);
                try {
                    nrx.f12819a.linkToDeath(odx, 0);
                    odx.f37312a = Binder.getCallingPid();
                    odx.f37313b = Binder.getCallingUid();
                    this.f37322d.add(odx);
                } catch (RemoteException e) {
                    bnsi c = f37317h.mo68388c();
                    c.mo68432a("ody", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("client already dead?");
                }
            } else {
                throw new IllegalStateException("already registered");
            }
        }
    }

    /* renamed from: a */
    public final void mo21498a(nrx nrx, int i, int i2, int i3) {
        this.f37326k.mo21255R();
        int a = m28531a(i, i2);
        if ((393216 & a) == 0) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 59);
            sb.append("not writable, category:");
            sb.append(i);
            sb.append(" key:");
            sb.append(i2);
            sb.append(" keytype:");
            sb.append(hexString);
            throw new IllegalArgumentException(sb.toString());
        } else if ((a & 1) != 0) {
            m28535a(i, i2, i3, m28538c(nrx, i));
        } else {
            String hexString2 = Integer.toHexString(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 59);
            sb2.append("not int type, category:");
            sb2.append(i);
            sb2.append(" key:");
            sb2.append(i2);
            sb2.append(" keytype:");
            sb2.append(hexString2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo22037a(odx odx) {
        synchronized (this.f37320b) {
            this.f37322d.remove(odx);
            int i = 0;
            while (true) {
                odx[] odxArr = this.f37321c;
                int length = odxArr.length;
                if (i < 3) {
                    if (odxArr[i] == odx) {
                        odxArr[i] = null;
                        m28533a(i);
                    }
                    i++;
                }
            }
        }
        odx.mo22035a();
    }

    /* renamed from: a */
    public final void mo22038a(boolean z) {
        m28534a(1, 0, z ? 1 : 0);
        if (!z) {
            m28532a();
        }
    }

    /* renamed from: a */
    public final boolean mo21499a(nrx nrx, int i) {
        odx odx;
        boolean z;
        this.f37326k.mo21255R();
        m28537b(i);
        odx e = m28539e(nrx);
        if (!this.f37326k.mo21306ak() && i != 1) {
            throw new SecurityException("Disallowed category");
        }
        synchronized (this.f37320b) {
            odx[] odxArr = this.f37321c;
            odx = odxArr[i];
            z = false;
            if (odx == null) {
                odxArr[i] = e;
            } else if (odx != e) {
                if (this.f37325j.mo21338c(Binder.getCallingPid()) || (this.f37325j.mo21292a(Binder.getCallingPid()) && !this.f37325j.mo21292a(odx.f37312a))) {
                    this.f37321c[i] = e;
                    z = true;
                } else {
                    String valueOf = String.valueOf(Arrays.toString(this.f37327l.getPackageManager().getPackagesForUid(e.f37313b)));
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("already taken by ") : "already taken by ".concat(valueOf));
                }
            }
        }
        if (z) {
            bmxy.m108581a(odx);
            try {
                nrx nrx2 = odx.f37315d;
                Parcel bj = nrx2.mo8529bj();
                bj.writeInt(i);
                nrx2.mo8530c(2, bj);
            } catch (RemoteException e2) {
                mo22037a(odx);
            }
            synchronized (this.f37320b) {
                m28533a(i);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final int[] mo21500a(nrx nrx, int i, int i2) {
        Integer num;
        this.f37326k.mo21255R();
        int a = m28531a(i, i2);
        if ((65536 & a) == 0) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 59);
            sb.append("not readable, category:");
            sb.append(i);
            sb.append(" key:");
            sb.append(i2);
            sb.append(" keytype:");
            sb.append(hexString);
            throw new IllegalArgumentException(sb.toString());
        } else if ((a & 1) != 0) {
            m28538c(nrx, i);
            synchronized (this.f37320b) {
                num = (Integer) this.f37328m.get(Long.valueOf(m28536b(i, i2)));
            }
            if (num == null) {
                return null;
            }
            return new int[]{num.intValue()};
        } else {
            String hexString2 = Integer.toHexString(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 59);
            sb2.append("not int type, category:");
            sb2.append(i);
            sb2.append(" key:");
            sb2.append(i2);
            sb2.append(" keytype:");
            sb2.append(hexString2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
