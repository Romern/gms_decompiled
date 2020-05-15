package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.api.ApiChimeraService;
import com.google.android.gms.drive.api.RealtimeService$PauseCommunicationReceiver;
import com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;
import com.google.android.gms.drive.realtime.internal.ParcelableIndexReference;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ubw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubw extends vjt implements IBinder.DeathRecipient, bkqj, bkmq, aaai {

    /* renamed from: a */
    public static final sbw f47196a = new sbw("RealtimeService", "");

    /* renamed from: b */
    public final aaag f47197b;

    /* renamed from: c */
    public final ubk f47198c;

    /* renamed from: d */
    public final bkmc f47199d;

    /* renamed from: e */
    public final vhb f47200e;

    /* renamed from: f */
    public final vhs f47201f;

    /* renamed from: g */
    public final ExecutorService f47202g;

    /* renamed from: h */
    public boolean f47203h = true;

    /* renamed from: i */
    public final Runnable f47204i = new ubs(this);

    /* renamed from: j */
    public final Runnable f47205j = new ubt(this);

    /* renamed from: k */
    public final veg f47206k;

    /* renamed from: l */
    public vjo f47207l;

    /* renamed from: m */
    private final ApiChimeraService f47208m;

    /* renamed from: n */
    private IBinder f47209n;

    /* renamed from: o */
    private final bkqk f47210o;

    /* renamed from: p */
    private final vpu f47211p;

    /* renamed from: q */
    private final vkq f47212q;

    /* renamed from: r */
    private boolean f47213r;

    /* renamed from: s */
    private boolean f47214s = false;

    /* renamed from: t */
    private final RealtimeService$PauseCommunicationReceiver f47215t = new RealtimeService$PauseCommunicationReceiver(this);

    /* renamed from: u */
    private final AtomicBoolean f47216u = new AtomicBoolean(false);

    /* renamed from: v */
    private int f47217v = 0;

    /* renamed from: w */
    private vjr f47218w;

    /* renamed from: x */
    private vjn f47219x;

    public ubw(ApiChimeraService apiChimeraService, aaag aaag, ubk ubk, bkmc bkmc, IBinder iBinder, vhb vhb, vhs vhs) {
        Integer num;
        this.f47208m = apiChimeraService;
        this.f47197b = aaag;
        this.f47198c = ubk;
        this.f47209n = iBinder;
        this.f47199d = bkmc;
        this.f47210o = bkmc.f124870d;
        vpu vpu = ubk.f47142c;
        this.f47211p = vpu;
        this.f47212q = vkq.m40631a(vpu.f49755b, vpu);
        this.f47200e = vhb;
        vpu vpu2 = this.f47211p;
        this.f47206k = vpu2.f49748G;
        this.f47201f = vhs;
        uey uey = this.f47200e.f49251c;
        if (uey != null) {
            num = Integer.valueOf(uey.mo27262a(vpu2.f49755b).f30212b);
        } else {
            num = null;
        }
        this.f47202g = new vhh(1, num);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        iBinder.linkToDeath(this, 0);
        this.f47208m.registerReceiver(this.f47215t, intentFilter);
        this.f47199d.f124869c.mo66121a(this);
        bkmc bkmc2 = this.f47199d;
        ((bksp) bkmc2.f124870d).f125233d = this;
        if (!bkmc2.mo66107b()) {
            this.f47199d.f124868b.mo66111a(new ubv(this));
        }
        if (this.f47206k.mo28343a()) {
            ((soc) this.f47202g).submit(this.f47205j);
        }
    }

    /* renamed from: a */
    private final bkqn m38031a(String str) {
        return (bkqn) ((bksp) this.f47210o).mo66227a(str);
    }

    /* renamed from: b */
    private final bkqp m38038b(String str) {
        return (bkqp) ((bksp) this.f47210o).mo66227a(str);
    }

    /* renamed from: c */
    private final bkqm m38040c(String str) {
        return (bkqm) ((bksp) this.f47210o).mo66227a(str);
    }

    /* renamed from: d */
    private final bkqt m38042d(String str) {
        return (bkqt) ((bksp) this.f47210o).mo66227a(str);
    }

    /* renamed from: e */
    private final bkqn m38043e(String str) {
        return (bkqn) ((bksp) this.f47210o).mo66227a(str);
    }

    /* renamed from: a */
    public final void mo27201a(vjn vjn) {
        this.f47219x = vjn;
    }

    /* renamed from: a */
    public final void mo27202a(vjo vjo) {
        this.f47207l = vjo;
    }

    public final void binderDied() {
        mo27172a();
    }

    /* renamed from: a */
    public static ParcelableCollaborator m38032a(bkvo bkvo) {
        return new ParcelableCollaborator(bkvo.f125339f, bkvo.f125338e, bkvo.f125334a, bkvo.f125335b, bkvo.f125336c, bkvo.f125337d, bkvo.f125340g);
    }

    /* renamed from: b */
    private final void m38039b() {
        vjr vjr = this.f47218w;
        if (vjr != null) {
            try {
                vjr.mo28503a(0);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.f47213r = true;
        }
    }

    /* renamed from: c */
    private final void m38041c() {
        if (this.f47217v == 0) {
            ((bksp) this.f47210o).f125232c.mo66277a(true);
        }
    }

    /* renamed from: d */
    public final void mo27220d(vji vji) {
        boolean z;
        if (this.f47199d.f124868b.f124878b == bkwz.READ_ONLY) {
            z = true;
        } else {
            z = false;
        }
        vji.mo28500a(z);
    }

    /* renamed from: e */
    public final void mo27223e(vji vji) {
        vji.mo28500a(!this.f47199d.mo66107b());
    }

    /* renamed from: a */
    private final List m38033a(DataHolder dataHolder) {
        vje<blhp> vje = new vje(this.f47210o, dataHolder);
        ArrayList arrayList = new ArrayList(dataHolder.f30168h);
        for (blhp blhp : vje) {
            arrayList.add(blhp);
        }
        vje.mo12460c();
        return arrayList;
    }

    /* renamed from: c */
    public final void mo27216c(String str, vjr vjr) {
        vjr.mo28503a(m38040c(str).mo66229a());
    }

    /* renamed from: e */
    public final void mo27224e(vjw vjw) {
        vjw.mo28505a();
    }

    /* renamed from: b */
    public final void mo27207b(String str, String str2, vjl vjl) {
        DataHolder a = vjb.m40508a(this.f47210o, Collections.singletonList(m38043e(str).mo66241b(str2)));
        try {
            vjl.mo28501a(a);
        } finally {
            a.close();
        }
    }

    /* renamed from: c */
    public final void mo27217c(vji vji) {
        vji.mo28500a(((bksp) this.f47199d.f124870d).f125232c.mo66279b());
    }

    /* renamed from: a */
    private final void m38034a(bkqi bkqi, DataHolder dataHolder, vjm vjm) {
        m38041c();
        vha vha = new vha(this.f47210o);
        vha.mo28441a(bkqi);
        ParcelableEventList a = vha.mo28440a();
        try {
            Parcel bj = vjm.mo8529bj();
            dcl.m8165a(bj, dataHolder);
            dcl.m8165a(bj, a);
            vjm.mo8528b(1, bj);
        } finally {
            m38036a(a);
            dataHolder.close();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: c */
    public final void mo27218c(vjp vjp) {
        ParcelableEventList a;
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            bkmt bkmt = this.f47199d.f124869c;
            long elapsedRealtime = SystemClock.elapsedRealtime() + 5;
            vha vha = new vha(this.f47210o);
            int i = 0;
            while (true) {
                if (!bkmt.mo66118c()) {
                    break;
                }
                i++;
                bkqi b = bkmt.mo66117b();
                blhg blhg = b.f125119g;
                if (blhg != null) {
                    arrayList.add(blhg);
                }
                vha.mo28441a(b);
                if (SystemClock.elapsedRealtime() > elapsedRealtime) {
                    f47196a.mo25369a("Returning to UI thread after applying %d changes (time limit exceeded).", Integer.valueOf(i));
                    break;
                }
            }
            if (i > 0 && this.f47201f != null) {
                bkqy bkqy = ((bksp) this.f47199d.f124870d).f125232c;
                if (bkmt.mo66118c() || bkmt.mo66122f()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f47197b.mo16658a(new vid(this.f47201f, this.f47212q.f49394b, arrayList, bkmt.mo66123g(), bkra.f125145b, bkqy, z));
            }
            m38037a(this.f47199d.f124869c.mo66122f());
            a = vha.mo28440a();
            vjp.mo28502a(a);
            m38036a(a);
            if (bkmt.mo66118c()) {
                m38039b();
            }
        } catch (Exception e) {
            f47196a.mo25376c("Package-side exception caught in apply changes.");
            throw e;
        } catch (Throwable th) {
            m38036a(a);
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo27221d(vjp vjp) {
        m38035a(this.f47210o.mo66226a(), vjp);
    }

    /* renamed from: d */
    public final void mo27222d(vjw vjw) {
        this.f47210o.mo66226a();
        vjw.mo28505a();
    }

    /* renamed from: a */
    private final void m38035a(bkqi bkqi, vjp vjp) {
        m38041c();
        vha vha = new vha(this.f47210o);
        vha.mo28441a(bkqi);
        ParcelableEventList a = vha.mo28440a();
        try {
            vjp.mo28502a(a);
        } finally {
            m38036a(a);
        }
    }

    /* renamed from: b */
    public final void mo27208b(String str, vjl vjl) {
        DataHolder a = vjb.m40508a(this.f47210o, m38040c(str).mo66234b());
        try {
            vjl.mo28501a(a);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    private static void m38036a(ParcelableEventList parcelableEventList) {
        DataHolder dataHolder = parcelableEventList.f31168b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    /* renamed from: b */
    public final void mo27209b(String str, vjr vjr) {
        vjr.mo28503a(m38038b(str).mo66257a());
    }

    /* renamed from: a */
    private final void m38037a(boolean z) {
        if (this.f47214s != z) {
            this.f47214s = z;
            vjn vjn = this.f47219x;
            if (vjn != null) {
                try {
                    Parcel bj = vjn.mo8529bj();
                    dcl.m8166a(bj, z);
                    dcl.m8166a(bj, z);
                    vjn.mo8528b(1, bj);
                } catch (RemoteException e) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo27210b(String str, vjv vjv) {
        vjv.mo28504a(m38038b(str).toString());
    }

    /* renamed from: b */
    public final void mo27211b(vji vji) {
        vji.mo28500a(((bksp) this.f47199d.f124870d).f125232c.mo66278a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vha.a(bkqi, boolean):void
     arg types: [bkqi, int]
     candidates:
      vha.a(vkb, java.lang.Object):int
      vha.a(vkb, java.util.List):int
      vha.a(bkqi, boolean):void */
    /* renamed from: a */
    public final ParcelableEventList mo27171a(String str, String str2, String str3) {
        bkqi a = m38031a(str).mo66237a(str2, bkta.m106586a((blgm) new bkxi(str3).mo66427a(bkqh.f125111a)));
        m38041c();
        vha vha = new vha(this.f47210o);
        vha.mo28442a(a, false);
        ParcelableEventList a2 = vha.mo28440a();
        DataHolder dataHolder = a2.f31168b;
        if (dataHolder != null) {
            dataHolder.f30170j = false;
        }
        return a2;
    }

    /* renamed from: b */
    public final void mo27212b(vjp vjp) {
        bksw bksw = (bksw) ((bksp) this.f47199d.f124870d).f125232c;
        if (bksw.mo66279b()) {
            bksw.f125250e.add(bkqz.POP_REDO);
            m38035a(bksw.f125246a.mo66103a((blhg) bksw.f125248c.pop(), bkqw.f125128f), vjp);
            return;
        }
        throw new bkrj("Redo stack is empty.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo27172a() {
        if (this.f47216u.compareAndSet(false, true)) {
            try {
                this.f47212q.f49397e.mo28438b(this.f47200e);
                this.f47208m.unregisterReceiver(this.f47215t);
                this.f47198c.mo27102i();
                IBinder iBinder = this.f47209n;
                if (iBinder != null) {
                    iBinder.unlinkToDeath(this, 0);
                    this.f47209n = null;
                }
                this.f47199d.mo66105a();
                vhs vhs = this.f47201f;
                if (vhs != null) {
                    this.f47197b.mo16658a(new vhl(vhs, this.f47211p.f49776w, true));
                }
            } catch (Exception e) {
                f47196a.mo25378c("RealtimeService", "Failed to close the document properly.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo27213b(vjr vjr) {
        this.f47218w = vjr;
        if (this.f47213r) {
            m38039b();
            this.f47213r = false;
        }
    }

    /* renamed from: b */
    public final void mo27214b(vjw vjw) {
        mo27172a();
        vjw.mo28505a();
    }

    /* renamed from: a */
    public final void mo27173a(int i, vjw vjw) {
        this.f47217v = i;
        boolean z = true;
        if (i == 0) {
            ((bksp) this.f47199d.f124870d).f125232c.mo66277a(true);
        }
        if (this.f47217v != 2) {
            z = false;
        }
        ((bksw) ((bksp) this.f47199d.f124870d).f125232c).f125251f = z;
        vjw.mo28505a();
    }

    /* renamed from: c */
    public final void mo27219c(vjw vjw) {
        mo27172a();
        this.f47212q.f49393a.mo28472a(Arrays.asList(this.f47200e));
        try {
            vjw.mo28505a();
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo27174a(bkmt bkmt) {
        m38039b();
    }

    /* renamed from: a */
    public final void mo27175a(bkqi bkqi) {
        blhg blhg = bkqi.f125118f;
        if (blhg != null) {
            bkpv a = this.f47199d.f124869c.mo66114a(blhg);
            vhs vhs = this.f47201f;
            if (vhs != null) {
                vhs.mo28465c();
                this.f47197b.mo16658a(new vhp(this.f47201f, this.f47212q.f49394b, a, bkqi.f125117e, ((bksp) this.f47199d.f124870d).f125232c));
            }
        }
        m38037a(this.f47199d.f124869c.mo66122f());
    }

    /* renamed from: a */
    public final void mo27176a(DriveId driveId, vjw vjw) {
        try {
            if (this.f47212q.f49393a.mo28473a(new vhb(driveId, this.f47198c.mo27095e()))) {
                try {
                    vjw.mo28506a(new Status(1501, "Online document already in local cache.", null));
                } catch (RemoteException e) {
                }
            }
            this.f47199d.mo66106a(driveId.f30728a);
            this.f47199d.f124869c.mo66121a(this);
            vhs vhs = this.f47201f;
            String str = driveId.f30728a;
            umn umn = vhs.f49287a;
            umn.f48226d = str;
            umn.mo27725t();
            if (this.f47206k.mo28343a()) {
                this.f47199d.mo66109d();
                this.f47203h = false;
            }
            try {
                vjw.mo28505a();
            } catch (RemoteException e2) {
            }
        } catch (aaaj e3) {
            try {
                vjw.mo28506a(new Status(8, "Authorization revoked, reconnect Drive API client.", null));
            } catch (RemoteException e4) {
            }
        }
    }

    /* renamed from: a */
    public final void mo27177a(BeginCompoundOperationRequest beginCompoundOperationRequest, vjw vjw) {
        if (beginCompoundOperationRequest.f31131a) {
            ((bksp) this.f47210o).mo66338a("", bksd.CREATION);
        } else {
            ((bksp) this.f47210o).mo66338a(beginCompoundOperationRequest.f31132b, !beginCompoundOperationRequest.f31133c ? bksd.NORMAL_NO_UNDO : bksd.NORMAL);
        }
        vjw.mo28505a();
    }

    /* renamed from: a */
    public final void mo27178a(ParcelableIndexReference parcelableIndexReference, vjv vjv) {
        int i;
        bksp bksp = (bksp) this.f47210o;
        bksb b = bksp.mo66227a(parcelableIndexReference.f31143a);
        int i2 = parcelableIndexReference.f31144b;
        int i3 = parcelableIndexReference.f31146d;
        if (i3 == -1) {
            i = !parcelableIndexReference.f31145c ? 1 : 3;
        } else {
            i = vgy.m40411b(i3);
        }
        blgs a = blgs.m107148a(vgy.m40410a(i));
        String b2 = bksp.f125231b.mo66334b();
        blhg a2 = bksz.m106570a(b2, bksz.f125258d);
        blgy b3 = blgz.m107154b();
        b3.f126482a = b.mo66247d();
        b3.f126483b = i2;
        b3.f126484c = a;
        blgz a3 = b3.mo66516a();
        blgn b4 = blgo.m107143b();
        b4.mo66498a(a2);
        b4.mo66498a(bksz.m106572a(b2, a3));
        bksp.mo66103a(bksz.m106564a(b4), bkqw.f125126d);
        vjv.mo28504a(((bkqt) new bkqq((bkqt) bksp.f125231b.mo66330a(b2)).f125123a).mo66247d());
    }

    /* renamed from: a */
    public final void mo27179a(String str, int i, int i2, vjm vjm) {
        bkqm c = m38040c(str);
        int i3 = i2 + i;
        m38034a(c.mo66230a(i, i3), vjb.m40508a(this.f47210o, c.mo66234b().subList(i, i3)), vjm);
    }

    /* renamed from: a */
    public final void mo27180a(String str, int i, int i2, vjp vjp) {
        m38035a(m38038b(str).mo66258a(i, i2), vjp);
    }

    /* renamed from: a */
    public final void mo27181a(String str, int i, DataHolder dataHolder, vjm vjm) {
        int a = new vje(this.f47210o, dataHolder).mo24660a();
        bkqm c = m38040c(str);
        m38034a(c.mo66233a(i, m38033a(dataHolder)), vjb.m40508a(this.f47210o, c.mo66234b().subList(i, a + i)), vjm);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkqm.a(int, java.util.Collection):bkqi
     arg types: [int, java.util.List]
     candidates:
      bkqm.a(int, int):bkqi
      bkqm.a(int, java.util.List):bkqi
      bkqo.a(bkrx, bkqo):boolean
      bkqm.a(int, java.util.Collection):bkqi */
    /* renamed from: a */
    public final void mo27182a(String str, int i, DataHolder dataHolder, vjp vjp) {
        m38035a(m38040c(str).mo66232a(i, (Collection) m38033a(dataHolder)), vjp);
    }

    /* renamed from: a */
    public final void mo27183a(String str, int i, String str2, int i2, vjp vjp) {
        m38035a(m38040c(str).mo66231a(i, m38040c(str2), i2), vjp);
    }

    /* renamed from: a */
    public final void mo27184a(String str, int i, String str2, vjp vjp) {
        m38035a(m38038b(str).mo66259a(i, str2), vjp);
    }

    /* renamed from: a */
    public final void mo27185a(String str, int i, vjv vjv) {
        try {
            bkvl bkvl = new bkvl(this.f47210o);
            if (str != null) {
                bkvl.f125330c.mo66423c();
                bkvl.f125330c.mo66419a("appId");
                bkvl.f125330c.mo66422b(str);
                bkvl.f125330c.mo66419a("revision");
                bkvl.f125330c.mo66418a(i);
                bkvl.f125330c.mo66419a("data");
            }
            bkvl.mo66376a(bkvl.f125328a.mo66268c());
            if (str != null) {
                bkvl.f125330c.mo66424d();
            }
            vjv.mo28504a(bkvl.f125329b.toString());
        } catch (bkqc e) {
            f47196a.mo25378c("RealtimeService", "Failed to encode the model.", e);
        }
    }

    /* renamed from: a */
    public final void mo27186a(String str, int i, vjw vjw) {
        m38042d(str).mo66264a(i);
        vjw.mo28505a();
    }

    /* renamed from: a */
    public final void mo27187a(String str, DataHolder dataHolder, vjp vjp) {
        vjf vjf = new vjf(this.f47210o, dataHolder);
        HashMap hashMap = new HashMap(dataHolder.f30168h);
        for (int i = 0; i < dataHolder.f30168h; i++) {
            hashMap.put(vjf.f43665a.mo17769c("key", i, vjf.f43665a.mo17762a(i)), vjf.mo24661a(i));
        }
        vjf.mo12460c();
        m38035a(m38031a(str).mo66238a((Map) hashMap), vjp);
    }

    /* renamed from: a */
    public final void mo27188a(String str, String str2, DataHolder dataHolder, vjp vjp) {
        bkqn e = m38043e(str);
        vja vja = new vja(this.f47210o, dataHolder);
        blhp b = vja.mo24661a(0);
        vja.mo12460c();
        m38035a(e.mo66237a(str2, b), vjp);
    }

    /* renamed from: a */
    public final void mo27189a(String str, String str2, vjl vjl) {
        DataHolder a = vjb.m40508a(this.f47210o, Collections.singletonList(m38031a(str).mo66241b(str2)));
        try {
            vjl.mo28501a(a);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public final void mo27190a(String str, String str2, vjm vjm) {
        bkqn a = m38031a(str);
        m38034a(a.mo66236a(str2), vjb.m40508a(this.f47210o, Collections.singletonList(a.mo66241b(str2))), vjm);
    }

    /* renamed from: a */
    public final void mo27191a(String str, String str2, vjp vjp) {
        m38035a(m38038b(str).mo66260a(str2), vjp);
    }

    /* renamed from: a */
    public final void mo27192a(String str, vjl vjl) {
        bkqk bkqk = this.f47210o;
        DataHolder a = new vjd(bkqk).mo28514a(m38031a(str).mo66242c());
        try {
            vjl.mo28501a(a);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public final void mo27193a(String str, vjp vjp) {
        m38035a(m38031a(str).mo66240b(), vjp);
    }

    /* renamed from: a */
    public final void mo27194a(String str, vjq vjq) {
        boolean z;
        bkqt d = m38042d(str);
        String a = d.mo66263a();
        int b = d.mo66265b();
        int b2 = vgy.m40411b(d.mo66267n().f126471e);
        if (b2 == 3) {
            z = true;
        } else {
            z = false;
        }
        ParcelableIndexReference parcelableIndexReference = new ParcelableIndexReference(a, b, z, vgy.m40410a(b2));
        Parcel bj = vjq.mo8529bj();
        dcl.m8165a(bj, parcelableIndexReference);
        vjq.mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo27195a(String str, vjr vjr) {
        vjr.mo28503a(m38031a(str).mo66235a());
    }

    /* renamed from: a */
    public final void mo27196a(String str, vjv vjv) {
        bksp bksp = (bksp) this.f47210o;
        vjv.mo28504a(bksp.mo66337a(bksz.m106562a(str), bksp.f125231b.mo66334b()).f125123a.mo66247d());
    }

    /* renamed from: a */
    public final void mo27197a(String str, vjw vjw) {
        ((bksp) this.f47210o).mo66227a(str).mo66256m();
        vjw.mo28505a();
    }

    /* renamed from: a */
    public final void mo27198a(vji vji) {
        vji.mo28500a(this.f47210o.mo66228b());
    }

    /* renamed from: a */
    public final void mo27199a(vjj vjj) {
        if (!this.f47199d.mo66107b()) {
            this.f47199d.f124867a.f124882b = new ubu(vjj);
        }
    }

    /* renamed from: a */
    public final void mo27200a(vjk vjk) {
        Collection<bkvo> collection;
        if (this.f47199d.mo66107b()) {
            collection = Collections.emptyList();
        } else {
            collection = this.f47199d.f124867a.mo66112a();
        }
        ParcelableCollaborator[] parcelableCollaboratorArr = new ParcelableCollaborator[collection.size()];
        int i = 0;
        for (bkvo bkvo : collection) {
            parcelableCollaboratorArr[i] = m38032a(bkvo);
            i++;
        }
        Parcel bj = vjk.mo8529bj();
        bj.writeTypedArray(parcelableCollaboratorArr, 0);
        vjk.mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo27203a(vjp vjp) {
        blhg blhg;
        bksw bksw = (bksw) ((bksp) this.f47199d.f124870d).f125232c;
        if (bksw.mo66278a()) {
            if (!bksw.f125249d.isEmpty()) {
                blhg = bksz.m106578a(bksw.f125249d);
                bksw.f125249d.clear();
                bksw.f125250e.add(bkqz.REFRESH_PENDING_BATCH);
            } else {
                bksw.f125250e.add(bkqz.POP_UNDO);
                blhg = (blhg) bksw.f125247b.pop();
            }
            m38035a(bksw.f125246a.mo66103a(blhg, bkqw.f125127e), vjp);
            return;
        }
        throw new bkrj("Undo stack is empty.");
    }

    /* renamed from: a */
    public final void mo27204a(vjr vjr) {
        vjr.mo28503a(((bksp) this.f47210o).f125231b.f125222f);
    }

    /* renamed from: a */
    public final void mo27205a(vjw vjw) {
        bksp bksp = (bksp) this.f47210o;
        if (!bksp.mo66228b() && bksp.f125230a) {
            bksp.mo66337a(bksz.f125255a, "root");
        }
        vjw.mo28505a();
    }

    /* renamed from: a */
    public final void mo27206a(boolean z, vjw vjw) {
        ((bksp) this.f47199d.f124870d).f125232c.mo66277a(z);
        vjw.mo28505a();
    }
}
