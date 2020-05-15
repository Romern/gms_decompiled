package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.RadioProperties;
import com.google.android.gms.car.RadioState;
import com.google.android.gms.car.RadioStationInfo;
import com.google.android.gms.car.StationPreset;
import com.google.android.gms.car.StationPresetList;
import com.google.android.gms.car.TrafficIncident;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nmg extends nsh implements ojs, ojn {

    /* renamed from: f */
    public static final /* synthetic */ int f36022f = 0;

    /* renamed from: g */
    private static final bnsn f36023g = odk.m28481a("CAR.RADIO");

    /* renamed from: a */
    public volatile boolean f36024a;

    /* renamed from: b */
    public final List f36025b = new ArrayList();

    /* renamed from: c */
    public final List f36026c = new ArrayList();

    /* renamed from: d */
    public final Object f36027d = new Object();

    /* renamed from: e */
    public RadioState f36028e;

    /* renamed from: h */
    private ojt f36029h;

    /* renamed from: i */
    private final oln f36030i;

    public nmg(oln oln) {
        this.f36030i = oln;
    }

    /* renamed from: a */
    private static final RadioStationInfo m26813a(bity bity) {
        bity bity2 = bity;
        int a = biuc.m102837a(bity2.f121746b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        RadioStationInfo radioStationInfo = new RadioStationInfo(a - 1, bity2.f121747c, 0, null);
        radioStationInfo.f29438c = bity2.f121748d;
        if ((bity2.f121745a & 8) != 0) {
            nvn nvn = new nvn();
            biua biua = bity2.f121749e;
            if (biua == null) {
                biua = biua.f121757e;
            }
            int i2 = biua.f121759a;
            if ((i2 & 1) != 0) {
                nvn.f36681a = biua.f121760b;
            }
            if ((i2 & 2) != 0) {
                nvn.f36682b = biua.f121761c;
            }
            if ((i2 & 4) != 0) {
                biue biue = biua.f121762d;
                if (biue == null) {
                    biue = biue.f121772k;
                }
                nvo nvo = new nvo();
                int i3 = biue.f121774a;
                if ((i3 & 32) != 0) {
                    nvo.f36690g = biue.f121781h;
                }
                if ((i3 & 1) != 0) {
                    nvo.f36685b = biue.f121776c;
                }
                if ((i3 & 2) != 0) {
                    nvo.f36686c = biue.f121777d;
                }
                if ((i3 & 4) != 0) {
                    nvo.f36687d = biue.f121778e;
                }
                if ((i3 & 8) != 0) {
                    nvo.f36688e = biue.f121779f;
                }
                if ((i3 & 16) != 0) {
                    nvo.f36689f = biue.f121780g;
                }
                if ((i3 & 64) != 0) {
                    nvo.f36691h = biue.f121782i;
                }
                if ((i3 & 128) != 0) {
                    nvo.f36692i = biue.f121783j;
                }
                ArrayList arrayList = new ArrayList();
                bxvt bxvt = biue.f121775b;
                int size = bxvt.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(Integer.valueOf(((Integer) bxvt.get(i4)).intValue()));
                }
                nvo.f36684a = arrayList;
                nvn.f36683c = new RadioStationInfo.RdsData(nvo.f36684a, nvo.f36685b, nvo.f36686c, nvo.f36687d, nvo.f36688e, nvo.f36689f, nvo.f36690g, nvo.f36691h, nvo.f36692i);
            }
            int a2 = biuc.m102837a(bity2.f121746b);
            if (a2 != 0) {
                i = a2;
            }
            radioStationInfo.f29436a = i - 1;
            radioStationInfo.f29437b = bity2.f121747c;
            radioStationInfo.f29438c = bity2.f121748d;
            radioStationInfo.f29439d = new RadioStationInfo.MetaData(nvn.f36681a, nvn.f36682b, nvn.f36683c, null);
        }
        return radioStationInfo;
    }

    /* renamed from: e */
    private final void m26814e() {
        this.f36030i.mo22279c();
        if (!this.f36024a) {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final RadioState mo21129b() {
        RadioState radioState;
        m26814e();
        synchronized (this.f36027d) {
            radioState = this.f36028e;
        }
        return radioState;
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo21139d() {
        m26814e();
        this.f36029h.mo22206a(32791, bitv.f121725a);
    }

    /* renamed from: b */
    public final void mo21130b(int i) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = biuo.f121828c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biuo biuo = (biuo) da.f164949b;
        biuo.f121830a |= 1;
        biuo.f121831b = i;
        ojt.mo22206a(32770, (biuo) da.mo74062i());
    }

    /* renamed from: c */
    public final void mo21137c(int i) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = biqp.f121312c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biqp biqp = (biqp) da.f164949b;
        biqp.f121314a |= 1;
        biqp.f121315b = i;
        ojt.mo22206a(32779, (biqp) da.mo74062i());
    }

    /* renamed from: d */
    public final void mo21140d(int i) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = biqr.f121325c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biqr biqr = (biqr) da.f164949b;
        biqr.f121327a |= 1;
        biqr.f121328b = i;
        ojt.mo22206a(32789, (biqr) da.mo74062i());
    }

    /* renamed from: e */
    public final void mo21142e(int i, int i2) {
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    nsj.mo8530c(13, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "e", 599, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onCancel()");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo21131b(int i, int i2) {
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    nsj.mo8530c(1, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "b", 313, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onStep()");
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo21138c(int i, int i2) {
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    nsj.mo8530c(2, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "c", 330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onSeek()");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo21141d(int i, int i2) {
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    nsj.mo8530c(4, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "d", 364, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onTune()");
                }
            }
        }
    }

    /* renamed from: a */
    public final List mo21114a() {
        m26814e();
        return this.f36026c;
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        bivb bivb2 = bivb;
        if ((bivb2.f121923a & 64) == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bitu bitu = bivb2.f121930h;
        if (bitu == null) {
            bitu = bitu.f121721b;
        }
        bxwc bxwc = bitu.f121723a;
        int i = 0;
        for (int size = bxwc.size(); i < size; size = size) {
            bitt bitt = (bitt) bxwc.get(i);
            ArrayList arrayList2 = new ArrayList();
            bxwc bxwc2 = bitt.f121707c;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                biud biud = (biud) bxwc2.get(i2);
                arrayList2.add(new RadioProperties.ChannelRange(biud.f121768a, biud.f121769b));
            }
            ArrayList arrayList3 = new ArrayList();
            bxvt bxvt = bitt.f121708d;
            int size3 = bxvt.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(Integer.valueOf(((Integer) bxvt.get(i3)).intValue()));
            }
            int i4 = bitt.f121705a;
            int a = biuc.m102837a(bitt.f121706b);
            if (a == 0) {
                a = 1;
            }
            int i5 = a - 1;
            int i6 = bitt.f121709e;
            boolean z = bitt.f121710f;
            int a2 = birl.m102758a(bitt.f121711g);
            if (a2 == 0) {
                a2 = 1;
            }
            int i7 = a2 - 1;
            int a3 = biug.m102841a(bitt.f121712h);
            if (a3 == 0) {
                a3 = 1;
            }
            int i8 = a3 - 1;
            boolean z2 = bitt.f121713i;
            boolean z3 = bitt.f121714j;
            int a4 = bivw.m102887a(bitt.f121715k);
            if (a4 == 0) {
                a4 = 1;
            }
            arrayList.add(new RadioProperties(i4, i5, arrayList2, arrayList3, i6, z, i7, i8, z2, z3, a4 - 1, bitt.f121716l, bitt.f121717m, bitt.f121718n));
            i++;
            bxwc = bxwc;
        }
        synchronized (this.f36026c) {
            this.f36026c.clear();
            this.f36026c.addAll(arrayList);
        }
        return this;
    }

    /* renamed from: b */
    public final void mo21132b(int i, int i2, int i3) {
        if (i == 0) {
            synchronized (this.f36026c) {
                for (RadioProperties radioProperties : this.f36026c) {
                    if (radioProperties.f29414a == i2) {
                        radioProperties.f29418e = i3;
                    }
                }
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    bj.writeInt(i3);
                    nsj.mo8530c(12, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "b", 582, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onChannelSpacingConfig()");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo21133b(int i, int i2, boolean z) {
        if (i == 0) {
            synchronized (this.f36027d) {
                RadioState radioState = this.f36028e;
                if (radioState != null) {
                    radioState.f29431b = z;
                }
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    dcl.m8166a(bj, z);
                    nsj.mo8530c(6, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "b", 412, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onMute()");
                }
            }
        }
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new ojt(this, ojm);
    }

    /* renamed from: a */
    public final void mo21115a(int i) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = bipm.f121181c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bipm bipm = (bipm) da.f164949b;
        bipm.f121183a |= 1;
        bipm.f121184b = i;
        ojt.mo22206a(32782, (bipm) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo21116a(int i, int i2) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = bipv.f121220d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bipv bipv = (bipv) da.f164949b;
        int i3 = bipv.f121222a | 1;
        bipv.f121222a = i3;
        bipv.f121223b = i;
        bipv.f121222a = i3 | 2;
        bipv.f121224c = i2;
        ojt.mo22206a(32784, (bipv) da.mo74062i());
    }

    /* renamed from: b */
    public final void mo21134b(int i, boolean z) {
        if (i == 0) {
            synchronized (this.f36027d) {
                RadioState radioState = this.f36028e;
                if (radioState != null) {
                    radioState.f29430a = z;
                }
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    dcl.m8166a(bj, z);
                    nsj.mo8530c(7, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "b", 436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onRadioSource()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21117a(int i, int i2, int i3) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = bivx.f122052e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bivx bivx = (bivx) da.f164949b;
        int i4 = bivx.f122054a | 1;
        bivx.f122054a = i4;
        bivx.f122055b = i;
        int i5 = i4 | 2;
        bivx.f122054a = i5;
        bivx.f122056c = i2;
        bivx.f122054a = i5 | 4;
        bivx.f122057d = i3;
        ojt.mo22206a(32777, (bivx) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo21118a(int i, int i2, bity bity) {
        RadioStationInfo a = m26813a(bity);
        if (i == 0) {
            synchronized (this.f36027d) {
                RadioState radioState = this.f36028e;
                if (radioState != null) {
                    radioState.f29432c = i2;
                    radioState.f29433d = a;
                }
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    dcl.m8165a(bj, a);
                    nsj.mo8530c(8, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "a", 462, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onActiveRadioSelected()");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo21135b(int i, boolean z, boolean z2) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = bium.f121815e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bium bium = (bium) da.f164949b;
        int i2 = bium.f121817a | 1;
        bium.f121817a = i2;
        bium.f121818b = i;
        int i3 = i2 | 2;
        bium.f121817a = i3;
        bium.f121819c = z;
        bium.f121817a = i3 | 4;
        bium.f121820d = z2;
        ojt.mo22206a(32773, (bium) da.mo74062i());
    }

    /* renamed from: b */
    public final void mo21136b(nsj nsj) {
        synchronized (this.f36025b) {
            Iterator it = this.f36025b.iterator();
            while (it.hasNext()) {
                nmf nmf = (nmf) it.next();
                if (nmf.f36021b.f12819a.equals(nsj.f12819a)) {
                    nmf.f36021b.f12819a.unlinkToDeath(nmf, 0);
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21119a(int i, int i2, boolean z) {
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    bj.writeInt(i2);
                    dcl.m8166a(bj, z);
                    nsj.mo8530c(3, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "a", 347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onScan()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21120a(int i, int i2, bivu[] bivuArr) {
        bivu[] bivuArr2 = bivuArr;
        ArrayList arrayList = new ArrayList();
        for (bivu bivu : bivuArr2) {
            int i3 = bivu.f122046a;
            int i4 = bivu.f122048c;
            birr birr = bivu.f122047b;
            if (birr == null) {
                birr = birr.f121451c;
            }
            double d = birr.f121454b;
            birr birr2 = bivu.f122047b;
            if (birr2 == null) {
                birr2 = birr.f121451c;
            }
            arrayList.add(new TrafficIncident(i3, i4, d, birr2.f121453a));
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    try {
                        bj.writeInt(i);
                        try {
                            bj.writeInt(i2);
                            bj.writeTypedList(arrayList);
                            nsj.mo8530c(11, bj);
                        } catch (RemoteException e) {
                            e = e;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        bnsi c = f36023g.mo68388c();
                        c.mo68437a(e);
                        c.mo68432a("nmg", "a", 556, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Error calling onTrafficUpdate()");
                    }
                } catch (RemoteException e3) {
                    e = e3;
                    bnsi c2 = f36023g.mo68388c();
                    c2.mo68437a(e);
                    c2.mo68432a("nmg", "a", 556, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Error calling onTrafficUpdate()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21121a(int i, bity bity) {
        RadioStationInfo a = m26813a(bity);
        synchronized (this.f36027d) {
            RadioState radioState = this.f36028e;
            if (radioState != null) {
                radioState.f29433d = a;
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i);
                    dcl.m8165a(bj, a);
                    nsj.mo8530c(5, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "a", 387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onStationInfoUpdate()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21122a(int i, boolean z) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = bisi.f121563d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bisi bisi = (bisi) da.f164949b;
        int i2 = bisi.f121565a | 1;
        bisi.f121565a = i2;
        bisi.f121566b = i;
        bisi.f121565a = i2 | 2;
        bisi.f121567c = z;
        ojt.mo22206a(32787, (bisi) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo21123a(int i, boolean z, boolean z2) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = bivl.f122006e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bivl bivl = (bivl) da.f164949b;
        int i2 = bivl.f122008a | 1;
        bivl.f122008a = i2;
        bivl.f122009b = i;
        int i3 = i2 | 2;
        bivl.f122008a = i3;
        bivl.f122010c = z;
        bivl.f122008a = i3 | 4;
        bivl.f122011d = z2;
        ojt.mo22206a(32771, (bivl) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo21124a(int i, boolean z, boolean z2, boolean z3) {
        m26814e();
        ojt ojt = this.f36029h;
        bxvd da = biuk.f121800f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biuk biuk = (biuk) da.f164949b;
        int i2 = biuk.f121802a | 1;
        biuk.f121802a = i2;
        biuk.f121803b = i;
        int i3 = i2 | 4;
        biuk.f121802a = i3;
        biuk.f121805d = z2;
        int i4 = i3 | 2;
        biuk.f121802a = i4;
        biuk.f121804c = z;
        biuk.f121802a = i4 | 8;
        biuk.f121806e = z3;
        ojt.mo22206a(32775, (biuk) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo21125a(bisf bisf, int i, boolean z, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m26813a((bity) it.next()));
        }
        if (bisf == bisf.STATUS_SUCCESS) {
            synchronized (this.f36027d) {
                RadioState radioState = this.f36028e;
                if (radioState != null && radioState.f29432c == i) {
                    radioState.f29434e = arrayList;
                }
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    int i2 = bisf.f121548F;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeInt(i2);
                    bj.writeInt(i);
                    dcl.m8166a(bj, z);
                    bj.writeTypedList(arrayList);
                    nsj.mo8530c(10, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "a", 530, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onProgramList()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21126a(bitx bitx) {
        bitx bitx2 = bitx;
        bity bity = bitx2.f121738d;
        if (bity == null) {
            bity = bity.f121743f;
        }
        RadioStationInfo a = m26813a(bity);
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = bitx2.f121739e;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m26813a((bity) bxwc.get(i)));
        }
        ArrayList arrayList2 = new ArrayList();
        bxwc bxwc2 = bitx2.f121740f;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bivj bivj = (bivj) bxwc2.get(i2);
            ArrayList arrayList3 = new ArrayList();
            bxvt bxvt = bivj.f121998b;
            int size3 = bxvt.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(Integer.valueOf(((Integer) bxvt.get(i3)).intValue()));
            }
            ArrayList arrayList4 = new ArrayList();
            bxwc bxwc3 = bivj.f121999c;
            int size4 = bxwc3.size();
            int i4 = 0;
            while (i4 < size4) {
                bivi bivi = (bivi) bxwc3.get(i4);
                bxwc bxwc4 = bxwc2;
                int a2 = biuc.m102837a(bivi.f121990a);
                if (a2 == 0) {
                    a2 = 1;
                }
                arrayList4.add(new StationPreset(a2 - 1, bivi.f121991b, bivi.f121992c));
                i4++;
                bxwc2 = bxwc4;
                size2 = size2;
            }
            arrayList2.add(new StationPresetList(bivj.f121997a, arrayList3, arrayList4));
        }
        RadioState radioState = new RadioState(bitx2.f121735a, bitx2.f121736b, bitx2.f121737c, a, arrayList, arrayList2);
        synchronized (this.f36027d) {
            this.f36028e = radioState;
        }
    }

    /* renamed from: a */
    public final void mo21127a(bivk bivk) {
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = bivk.f122004a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bivj bivj = (bivj) bxwc.get(i);
            ArrayList arrayList2 = new ArrayList();
            bxvt bxvt = bivj.f121998b;
            int size2 = bxvt.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(Integer.valueOf(((Integer) bxvt.get(i2)).intValue()));
            }
            ArrayList arrayList3 = new ArrayList();
            bxwc bxwc2 = bivj.f121999c;
            int size3 = bxwc2.size();
            int i3 = 0;
            while (i3 < size3) {
                bivi bivi = (bivi) bxwc2.get(i3);
                bxwc bxwc3 = bxwc;
                int a = biuc.m102837a(bivi.f121990a);
                if (a == 0) {
                    a = 1;
                }
                arrayList3.add(new StationPreset(a - 1, bivi.f121991b, bivi.f121992c));
                i3++;
                bxwc = bxwc3;
                size = size;
            }
            arrayList.add(new StationPresetList(bivj.f121997a, arrayList2, arrayList3));
        }
        synchronized (this.f36027d) {
            RadioState radioState = this.f36028e;
            if (radioState != null) {
                radioState.f29435f = arrayList;
            }
        }
        synchronized (this.f36025b) {
            this.f36025b.size();
            for (nmf nmf : this.f36025b) {
                try {
                    nsj nsj = nmf.f36021b;
                    Parcel bj = nsj.mo8529bj();
                    bj.writeTypedList(arrayList);
                    nsj.mo8530c(9, bj);
                } catch (RemoteException e) {
                    bnsi c = f36023g.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmg", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_OTHER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error calling onStationPresets()");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21128a(nsj nsj) {
        synchronized (this.f36025b) {
            nmf nmf = new nmf(this, nsj);
            try {
                nsj.f12819a.linkToDeath(nmf, 0);
                this.f36025b.add(nmf);
            } catch (RemoteException e) {
                bnsi c = f36023g.mo68388c();
                c.mo68437a(e);
                c.mo68432a("nmg", "a", 171, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("RemoteException setting death recipient for radio callback");
            }
        }
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f36029h = (ojt) ojh;
        this.f36024a = true;
    }
}
