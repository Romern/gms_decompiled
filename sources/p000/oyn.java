package p000;

import android.os.RemoteException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: oyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyn extends omh implements ojv, ojn, ofq {

    /* renamed from: a */
    public final Object f38620a = new Object();

    /* renamed from: b */
    public final Set f38621b = new C1225nr();

    /* renamed from: c */
    private final ojm f38622c;

    /* renamed from: d */
    private final Object f38623d = new Object();

    /* renamed from: e */
    private boolean f38624e;

    /* renamed from: f */
    private biuy f38625f;

    /* renamed from: g */
    private ojx f38626g;

    /* renamed from: h */
    private boolean f38627h;

    /* renamed from: i */
    private int f38628i = 13;

    /* renamed from: j */
    private long f38629j = 0;

    public oyn(ojm ojm) {
        this.f38622c = ojm;
    }

    /* renamed from: c */
    private final oym m30001c(oml oml) {
        synchronized (this.f38620a) {
            for (oym oym : this.f38621b) {
                if (oym.f38618a == oml) {
                    return oym;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & 2) == 0) {
            return null;
        }
        biuy biuy = bivb.f121925c;
        if (biuy == null) {
            biuy = biuy.f121888g;
        }
        this.f38625f = biuy;
        return this;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final void mo22107b() {
        ojx ojx;
        ArrayList arrayList;
        synchronized (this.f38623d) {
            ojx = this.f38626g;
        }
        if (!this.f38624e) {
            ojx.mo22229a(biva.SENSOR_DRIVING_STATUS_DATA, -1);
        }
        synchronized (this.f38620a) {
            arrayList = new ArrayList(this.f38621b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((oym) arrayList.get(i)).f38618a.mo21168b();
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: bk */
    public final boolean mo22291bk() {
        ojx ojx;
        synchronized (this.f38623d) {
            ojx = this.f38626g;
        }
        return ojx.f37816a;
    }

    /* renamed from: bl */
    public final int[] mo22292bl() {
        ojx ojx;
        synchronized (this.f38623d) {
            ojx = this.f38626g;
        }
        return ojx.mo22231c();
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new ojx(this.f38625f, this, this.f38622c);
    }

    /* renamed from: a */
    public final void mo21174a() {
        ArrayList arrayList;
        synchronized (this.f38620a) {
            arrayList = new ArrayList(this.f38621b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((oym) arrayList.get(i)).f38618a.mo21166a();
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo21176a(biva biva, bxxc bxxc) {
        ArrayList arrayList;
        synchronized (this.f38620a) {
            arrayList = new ArrayList(this.f38621b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((oym) arrayList.get(i)).f38618a.mo21167a(biva.f121920w, bxxc.mo73642k());
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: b */
    public final void mo22290b(oml oml) {
        synchronized (this.f38620a) {
            oym c = m30001c(oml);
            if (c != null) {
                oml.asBinder().unlinkToDeath(c, 0);
                this.f38621b.remove(c);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo22788b(int i, long j) {
        synchronized (this.f38623d) {
            ojx ojx = this.f38626g;
            if (ojx != null) {
                return ojx.mo22229a(biva.m102863a(i), j);
            }
            this.f38628i = i;
            this.f38629j = j;
            this.f38627h = true;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        synchronized (this.f38623d) {
            this.f38626g = (ojx) ojh;
            if (this.f38627h) {
                mo22788b(this.f38628i, this.f38629j);
                this.f38627h = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo22287a(oml oml) {
        if (oml != null) {
            synchronized (this.f38620a) {
                if (m30001c(oml) == null) {
                    this.f38621b.add(new oym(this, oml));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo22288a(int i, long j) {
        boolean b;
        synchronized (this.f38623d) {
            if (i == 13) {
                this.f38624e = true;
            }
            b = mo22788b(i, j);
        }
        return b;
    }

    /* renamed from: a */
    public final byte[] mo22289a(int i) {
        ojx ojx;
        synchronized (this.f38623d) {
            ojx = this.f38626g;
        }
        bxxc c = ojx.mo22230c(i);
        if (c != null) {
            return c.mo73642k();
        }
        return null;
    }
}
