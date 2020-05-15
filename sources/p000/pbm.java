package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbm implements pao {

    /* renamed from: a */
    public static final bnsn f38775a = odk.m28481a("CAR.STARTUP");

    /* renamed from: b */
    public final bmzi f38776b = bmzn.m108681a(pap.f38725a);

    /* renamed from: c */
    public final Context f38777c;

    /* renamed from: d */
    public final long f38778d;

    /* renamed from: e */
    public final boolean f38779e;

    /* renamed from: f */
    public final Handler f38780f;

    /* renamed from: g */
    public final List f38781g;

    /* renamed from: h */
    public final int f38782h;

    /* renamed from: i */
    public final pan f38783i;

    /* renamed from: j */
    public final pbn f38784j;

    /* renamed from: k */
    public final pbr f38785k;

    /* renamed from: l */
    public final ServiceConnection f38786l = new pbd(this, "car_setup");

    /* renamed from: m */
    final pbl f38787m = new pbl(this);

    /* renamed from: n */
    private final Executor f38788n;

    public pbm(Context context, long j, boolean z, pan pan, Handler handler, List list, int i, pbn pbn, pbr pbr) {
        this.f38777c = context;
        this.f38778d = j;
        this.f38779e = z;
        this.f38783i = pan;
        this.f38780f = handler;
        this.f38788n = new oof(handler);
        this.f38781g = list;
        this.f38782h = i;
        this.f38784j = pbn;
        this.f38785k = pbr;
    }

    /* renamed from: a */
    private static boolean m30121a(omm omm, int i, Context context, pbs pbs) {
        ParcelFileDescriptor parcelFileDescriptor;
        byte[] bArr;
        ofd.m28611a(context, pbs.mo22876b(), oev.QUERY_CANDIDATE);
        boolean a = omm.mo22301a(pbs.mo22873a(), i);
        bnsi d = f38775a.mo68390d();
        d.mo68432a("pbm", "a", (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("migration: filetype=%d iteration=%d shouldMigrate=%b", Integer.valueOf(pbs.mo22873a()), Integer.valueOf(i), Boolean.valueOf(a));
        if (!a) {
            ofd.m28611a(context, pbs.mo22876b(), oev.NOT_NEEDED);
            return true;
        }
        File a2 = pbs.mo22874a(context);
        try {
            parcelFileDescriptor = ParcelFileDescriptor.open(a2, 268435456);
        } catch (FileNotFoundException e) {
            parcelFileDescriptor = null;
        }
        try {
            bArr = pbs.m30177a(new FileInputStream(a2));
        } catch (FileNotFoundException e2) {
            try {
                bnsi d2 = f38775a.mo68390d();
                d2.mo68432a("pbm", "a", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68405a("Unable to read source file for SHA1 sum computation.");
                bArr = new byte[0];
            } catch (IOException e3) {
                bnsi c = f38775a.mo68388c();
                c.mo68437a(e3);
                c.mo68432a("pbm", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Failed to close the file descriptor.");
                return false;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (parcelFileDescriptor != null) {
            ofd.m28611a(context, pbs.mo22876b(), oev.STARTED_WITH_DIGEST);
            bnsi d3 = f38775a.mo68390d();
            d3.mo68432a("pbm", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68420a("Starting migration: sha1Sum=%s", boan.f132472f.mo68794a(bArr));
        } else {
            ofd.m28611a(context, pbs.mo22876b(), oev.STARTED_WITH_NULL);
            bnsi d4 = f38775a.mo68390d();
            d4.mo68432a("pbm", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68405a("Source file does not exist. Performing a null-migration");
        }
        boolean a3 = omm.mo22302a(pbs.mo22873a(), i, parcelFileDescriptor, bArr);
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
        }
        return a3;
        throw th;
    }

    /* renamed from: b */
    private final boolean m30123b(long j, Bundle bundle) {
        omm omm;
        pbl pbl = this.f38787m;
        if (!pbl.f38768a || (omm = pbl.f38774g) == null) {
            bnsi c = f38775a.mo68388c();
            c.mo68432a("pbm", "b", 404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("HandoffState is invalid to do a transferForHandoff.");
            return false;
        }
        try {
            omm.mo22296a(j, bundle);
            return true;
        } catch (RemoteException e) {
            bnsi c2 = f38775a.mo68388c();
            c2.mo68437a(e);
            c2.mo68432a("pbm", "b", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Cannot transfer for handoff");
            return false;
        }
    }

    /* renamed from: h */
    private final boolean m30124h() {
        return this.f38780f.getLooper() == Looper.myLooper();
    }

    /* renamed from: c */
    public final Executor mo22868c() {
        return m30124h() ? bqfb.INSTANCE : this.f38788n;
    }

    /* renamed from: d */
    public final void mo22869d() {
        bnsi d = f38775a.mo68390d();
        d.mo68432a("pbm", "d", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Tearing down car connection");
        mo22868c().execute(new paz(this));
    }

    /* renamed from: e */
    public final void mo22870e() {
        int i;
        mo22871f();
        if (this.f38787m.f38769b.isEmpty()) {
            bnsi d = f38775a.mo68390d();
            d.mo68432a("pbm", "e", 413, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("No components are able or willing to accept the handoff");
            this.f38787m.mo22860a();
            this.f38783i.mo22569a(null, false);
            return;
        }
        ComponentName componentName = (ComponentName) this.f38787m.f38769b.removeFirst();
        if (!rfz.m33557a(this.f38777c).mo24610b(componentName.getPackageName())) {
            bnsi c = f38775a.mo68388c();
            c.mo68432a("pbm", "e", 426, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Skipping %s: untrusted signature.", componentName.getPackageName());
            mo22870e();
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(componentName);
        bnsi d2 = f38775a.mo68390d();
        d2.mo68432a("pbm", "e", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68420a("Checking handoff interest for component %s", componentName.flattenToString());
        pbl pbl = this.f38787m;
        pbl.f38772e = componentName;
        if (ccsq.m131457b()) {
            int i2 = Build.VERSION.SDK_INT;
            i = 4161;
        } else {
            i = 65;
        }
        pbl.f38768a = this.f38777c.bindService(intent, this.f38786l, i);
        if (this.f38787m.f38768a) {
            bnsi d3 = f38775a.mo68390d();
            d3.mo68432a("pbm", "e", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68420a("Successfully bound to component %s", componentName.flattenToString());
            return;
        }
        bnsi d4 = f38775a.mo68390d();
        d4.mo68432a("pbm", "e", 441, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d4.mo68420a("Failed to bind to component %s", componentName.flattenToString());
        this.f38787m.f38772e = null;
        this.f38783i.mo22569a(componentName, false);
    }

    /* renamed from: f */
    public final void mo22871f() {
        bmxy.m108600b(m30124h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo22872g() {
        if (!this.f38787m.f38768a) {
            return;
        }
        if (ccpv.m131194c()) {
            omm omm = this.f38787m.f38774g;
            if (omm != null) {
                try {
                    omm.mo22304b(this.f38778d);
                } catch (RemoteException e) {
                    bnsi d = f38775a.mo68390d();
                    d.mo68437a(e);
                    d.mo68432a("pbm", "g", 310, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("Couldn't stop %s, but it could be fine.", this.f38787m.f38772e);
                }
            }
            this.f38777c.unbindService(this.f38786l);
            this.f38787m.f38768a = false;
            return;
        }
        omm omm2 = this.f38787m.f38774g;
        bmxy.m108581a(omm2);
        try {
            omm2.mo22304b(this.f38778d);
        } catch (RemoteException e2) {
            bnsi d2 = f38775a.mo68390d();
            d2.mo68437a(e2);
            d2.mo68432a("pbm", "g", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Couldn't stop %s, but it could be fine.", this.f38787m.f38772e);
        }
    }

    /* renamed from: b */
    public final void mo22866b() {
        if (!this.f38779e) {
            bnsi d = f38775a.mo68390d();
            d.mo68432a("pbm", "b", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Skipping handoff interest checks - feature is not enabled");
            this.f38780f.post(new pas(this));
            return;
        }
        bnsi d2 = f38775a.mo68390d();
        d2.mo68432a("pbm", "b", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Starting handoff interest checks");
        this.f38780f.post(new pat(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo22867b(bipi bipi) {
        if (!this.f38787m.f38768a) {
            return;
        }
        if (ccpv.m131194c()) {
            omm omm = this.f38787m.f38774g;
            if (omm != null) {
                try {
                    omm.mo22294a(this.f38778d, bipi.f121169f);
                } catch (RemoteException e) {
                    bnsi d = f38775a.mo68390d();
                    d.mo68437a(e);
                    d.mo68432a("pbm", "b", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("Couldn't stop %s, but it could be fine.", this.f38787m.f38772e);
                }
            }
            this.f38777c.unbindService(this.f38786l);
            this.f38787m.f38768a = false;
            return;
        }
        omm omm2 = this.f38787m.f38774g;
        bmxy.m108581a(omm2);
        try {
            omm2.mo22294a(this.f38778d, bipi.f121169f);
        } catch (RemoteException e2) {
            bnsi d2 = f38775a.mo68390d();
            d2.mo68437a(e2);
            d2.mo68432a("pbm", "b", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Couldn't stop %s, but it could be fine.", this.f38787m.f38772e);
        }
    }

    /* renamed from: a */
    private static byte[] m30122a(File file) {
        try {
            return pbs.m30177a(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            bnsi d = f38775a.mo68390d();
            d.mo68432a("pbm", "a", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Unable to read source file for SHA1 sum computation.");
            return new byte[0];
        }
    }

    /* renamed from: a */
    public final bqgg mo22837a(long j, Bundle bundle) {
        return bqga.m112778a(new par(this, j, bundle), mo22868c());
    }

    /* renamed from: a */
    public final void mo22838a() {
        this.f38780f.post(new C1586pay(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22861a(int i, Bundle bundle) {
        mo22871f();
        boolean z = true;
        bmxy.m108601b(!this.f38787m.f38771d, "Handoff already initiated");
        bmxy.m108601b(this.f38787m.f38768a, "StartupService is not bound");
        ComponentName componentName = this.f38787m.f38772e;
        bmxy.m108582a(componentName, "Handoff Component is null, which is not expected");
        omm omm = this.f38787m.f38774g;
        bmxy.m108582a(omm, "StartupService is NULL");
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("com.google.android.gms.car.extra.EXTRA_CONNECTION_HANDOFF_COMPONENT", componentName);
            ofd.m28612a(this.f38777c, "com.google.android.gms.car.CONNECTION_HANDOFF", ofa.STARTED, bundle2);
            this.f38787m.f38771d = true;
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR");
            if (!ccpv.m131193b()) {
                if (i == 2) {
                    z = false;
                }
                bmxy.m108589a(z, "Wifi handoff is disabled");
                bmxy.m108581a(parcelFileDescriptor);
                omm.mo22297a(this.f38778d, parcelFileDescriptor, this.f38787m.f38770c);
            } else {
                if (i != 2) {
                    if (parcelFileDescriptor == null) {
                        z = false;
                    }
                }
                bmxy.m108589a(z, "File descriptor must not be null except for wifi connections");
                bnsi d = f38775a.mo68390d();
                d.mo68432a("pbm", "a", 521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68416a("Handing off session %d (%d)", this.f38778d, i);
                omm.mo22295a(this.f38778d, i, bundle, this.f38787m.f38770c);
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                }
            }
        } catch (RemoteException e2) {
            ofd.m28611a(this.f38777c, "com.google.android.gms.car.CONNECTION_HANDOFF", ofa.FAILED);
            bnsi b = f38775a.mo68387b();
            b.mo68437a(e2);
            b.mo68432a("pbm", "a", 545, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Connection handoff failed due to RemoteException, exiting");
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public final void mo22862a(ComponentName componentName) {
        mo22871f();
        if (Objects.equals(componentName, this.f38787m.f38772e)) {
            bnsi d = f38775a.mo68390d();
            d.mo68432a("pbm", "a", 479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("onStartupServiceDisconnected - Unable to check interest for %s", componentName);
            pbl pbl = this.f38787m;
            pbl.f38772e = null;
            if (pbl.f38768a) {
                this.f38777c.unbindService(this.f38786l);
                this.f38787m.f38768a = false;
            }
            this.f38783i.mo22569a(componentName, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, boolean, java.lang.Object):void
     arg types: [java.lang.String, boolean, android.content.ComponentName]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* renamed from: a */
    public final void mo22863a(ComponentName componentName, omm omm) {
        boolean z;
        RemoteException e;
        mo22871f();
        bmxy.m108588a(Objects.equals(componentName, this.f38787m.f38772e));
        try {
            z = omm.mo22303a(this.f38778d);
            try {
                bnsi d = f38775a.mo68390d();
                d.mo68432a("pbm", "a", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68434a("onStartupServiceAvailable - IStartup interest is %b for %s", z, (Object) componentName);
            } catch (RemoteException e2) {
                e = e2;
            }
        } catch (RemoteException e3) {
            e = e3;
            z = false;
            bnsi d2 = f38775a.mo68390d();
            d2.mo68437a(e);
            d2.mo68432a("pbm", "a", 459, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("onStartupServiceAvailable - RemoteException for %s", componentName);
            if (z) {
            }
            this.f38783i.mo22569a(componentName, z);
        }
        if (z) {
            pbl pbl = this.f38787m;
            pbl.f38772e = null;
            if (pbl.f38768a) {
                this.f38777c.unbindService(this.f38786l);
                this.f38787m.f38768a = false;
            }
        } else {
            this.f38787m.f38774g = omm;
        }
        this.f38783i.mo22569a(componentName, z);
    }

    /* renamed from: a */
    public final void mo22864a(bipi bipi) {
        bnsi d = f38775a.mo68390d();
        d.mo68432a("pbm", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Tearing down car connection with reason %s", bipi.f121169f);
        mo22868c().execute(new pba(this, bipi));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo22865a(oml oml) {
        omm omm;
        pbl pbl = this.f38787m;
        omi omi = null;
        if (pbl.f38768a && (omm = pbl.f38774g) != null) {
            try {
                bnsi d = f38775a.mo68390d();
                d.mo68432a("pbm", "a", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Fetching sensor service proxy from Gearhead.");
                omi = omm.mo22293a(oml);
                try {
                    bnsi d2 = f38775a.mo68390d();
                    d2.mo68432a("pbm", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68420a("Sensor service proxy: %s", omi);
                } catch (RemoteException e) {
                    e = e;
                }
            } catch (RemoteException e2) {
                e = e2;
                bnsi c = f38775a.mo68388c();
                c.mo68437a(e);
                c.mo68432a("pbm", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Cannot startup sensor service proxy");
                this.f38783i.mo22571a(omi);
            }
        }
        this.f38783i.mo22571a(omi);
    }

    /* renamed from: a */
    public final void mo22839a(pbs pbs) {
        omm omm = this.f38787m.f38774g;
        bmxy.m108581a(omm);
        int c = (int) pbs.mo22877c();
        try {
            if (((Boolean) bqga.m112778a(new pav(this, omm, c, pbs), mo22868c()).get(5000, TimeUnit.MILLISECONDS)).booleanValue()) {
                pbs.mo22875a((long) c);
                ofd.m28611a(this.f38777c, pbs.mo22876b(), oev.SUCCESS);
                return;
            }
            ofd.m28611a(this.f38777c, pbs.mo22876b(), oev.FAILED);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsi c2 = f38775a.mo68388c();
            c2.mo68437a(e);
            c2.mo68432a("pbm", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Migration failed. Will try again next connection.");
            ofd.m28611a(this.f38777c, pbs.mo22876b(), oev.FAILED);
        }
    }

    /* renamed from: a */
    public final boolean mo22840a(boolean z, boolean z2) {
        try {
            return ((Boolean) bqga.m112778a(new paq(this, z, z2), mo22868c()).get(5000, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsi c = f38775a.mo68388c();
            c.mo68437a(e);
            c.mo68432a("pbm", "a", 372, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Did not complete authorization. FRX may be run.");
            return false;
        }
    }
}
