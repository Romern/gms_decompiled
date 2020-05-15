package p000;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axys extends axyb {

    /* renamed from: a */
    public long f96796a;

    /* renamed from: b */
    public ayap f96797b;

    /* renamed from: c */
    private final Object f96798c;

    /* renamed from: d */
    private Map f96799d;

    /* renamed from: e */
    private axyq f96800e;

    public axys() {
        this.f96798c = new Object();
        this.f96799d = new HashMap();
        this.f96800e = new axyq();
        this.f96796a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static final void m83577a(axyq axyq, String str, long j) {
        char c;
        switch (str.hashCode()) {
            case -2033688335:
                if (str.equals("bytesRecv")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2033658205:
                if (str.equals("bytesSent")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1265943016:
                if (str.equals("msgsRecv")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1265912886:
                if (str.equals("msgsSent")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            axyq.f96791b += j;
        } else if (c == 1) {
            axyq.f96790a += j;
        } else if (c == 2) {
            axyq.f96793d += j;
        } else if (c == 3) {
            axyq.f96792c += j;
        }
    }

    /* renamed from: a */
    public final void mo53756a(axya axya, String str, int i) {
        ayex ayex;
        super.mo53756a(axya, str, i);
        synchronized (this.f96798c) {
            long j = (long) i;
            m83577a(this.f96800e, str, j);
            String str2 = axya.f96745b;
            if (!(str2 == null || (ayex = axya.f96744a) == null)) {
                axyr axyr = new axyr(ayex, str2);
                if (!this.f96799d.containsKey(axyr)) {
                    this.f96799d.put(axyr, new axyq());
                }
                m83577a((axyq) this.f96799d.get(axyr), str, j);
            }
            ayap ayap = this.f96797b;
            if (ayap != null) {
                axys axys = ayap.f96961a;
                if (SystemClock.elapsedRealtime() - axys.f96796a > chmr.f188789a.mo6606a().mo85358a()) {
                    synchronized (axys.f96798c) {
                        new axys(axys);
                        axys.f96799d = new HashMap();
                        axys.f96800e = new axyq();
                        axys.f96796a = SystemClock.elapsedRealtime();
                    }
                    new soa(10, new ayaq()).start();
                }
            }
        }
    }

    private axys(axys axys) {
        this.f96798c = new Object();
        this.f96799d = new HashMap();
        this.f96800e = new axyq();
        synchronized (axys.f96798c) {
            this.f96799d = axys.f96799d;
            this.f96800e = axys.f96800e;
            this.f96796a = axys.f96796a;
        }
    }
}
