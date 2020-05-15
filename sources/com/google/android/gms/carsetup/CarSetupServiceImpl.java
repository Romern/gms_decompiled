package com.google.android.gms.carsetup;

import android.app.Notification;
import android.app.NotificationChannel;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Service;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.carsetup.FirstActivityImpl;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.EnumSet;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarSetupServiceImpl extends Service implements otq {

    /* renamed from: M */
    private static final Random f29559M = new SecureRandom();

    /* renamed from: a */
    public static final bnsn f29560a = odk.m28481a("CAR.SETUP.SERVICE");

    /* renamed from: b */
    public static AtomicBoolean f29561b = new AtomicBoolean(false);

    /* renamed from: A */
    public final otv f29562A = new osu(this, this.f29609z);

    /* renamed from: B */
    public Boolean f29563B;

    /* renamed from: C */
    public npd f29564C;

    /* renamed from: D */
    public volatile ofn f29565D;

    /* renamed from: E */
    public ovk f29566E;

    /* renamed from: F */
    final AtomicInteger f29567F = new AtomicInteger(0);

    /* renamed from: G */
    public volatile pbp f29568G;

    /* renamed from: H */
    public ovq f29569H;

    /* renamed from: I */
    public volatile osq f29570I;

    /* renamed from: J */
    Handler f29571J;

    /* renamed from: K */
    public Handler f29572K;

    /* renamed from: L */
    public final oxe f29573L = new oxe();

    /* renamed from: N */
    private BroadcastReceiver f29574N;

    /* renamed from: O */
    private C1585otp f29575O;

    /* renamed from: P */
    private omx f29576P;

    /* renamed from: Q */
    private long f29577Q;

    /* renamed from: R */
    private final bmzi f29578R = bmzn.m108681a(oro.f38286a);

    /* renamed from: S */
    private final bmzi f29579S = bmzn.m108681a(oru.f38300a);

    /* renamed from: T */
    private final bmzi f29580T = bmzn.m108681a(orx.f38303a);

    /* renamed from: U */
    private final bmzi f29581U = bmzn.m108681a(ory.f38304a);

    /* renamed from: V */
    private final bmzi f29582V = bmzn.m108681a(osb.f38307a);

    /* renamed from: W */
    private final pbr f29583W = new pbr();

    /* renamed from: X */
    private final ozl f29584X = new ozo();

    /* renamed from: Y */
    private HandlerThread f29585Y;

    /* renamed from: c */
    public int f29586c;

    /* renamed from: d */
    public asfb f29587d;

    /* renamed from: e */
    public ParcelFileDescriptor f29588e;

    /* renamed from: f */
    public ojq f29589f;

    /* renamed from: g */
    public int f29590g = -1;

    /* renamed from: h */
    public boolean f29591h;

    /* renamed from: i */
    public orn f29592i;

    /* renamed from: j */
    public int f29593j;

    /* renamed from: k */
    public otw f29594k;

    /* renamed from: l */
    public CarInfoInternal f29595l;

    /* renamed from: m */
    public ConnectionTransfer f29596m;

    /* renamed from: n */
    public ohq f29597n;

    /* renamed from: o */
    public oyn f29598o;

    /* renamed from: p */
    public boolean f29599p;

    /* renamed from: q */
    public boolean f29600q;

    /* renamed from: r */
    public int f29601r = -1;

    /* renamed from: s */
    public int f29602s = -1;

    /* renamed from: t */
    public int f29603t = 0;

    /* renamed from: u */
    public boolean f29604u;

    /* renamed from: v */
    public final bmzi f29605v = bmzn.m108681a(orv.f38301a);

    /* renamed from: w */
    public final bmzi f29606w = bmzn.m108681a(orw.f38302a);

    /* renamed from: x */
    public final bmzi f29607x = bmzn.m108681a(orz.f38305a);

    /* renamed from: y */
    public final bmzi f29608y = bmzn.m108681a(osa.f38306a);

    /* renamed from: z */
    public final pbn f29609z = new pbn();

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ConnectionTransfer extends oue {

        /* renamed from: a */
        public oui f29611a;

        /* renamed from: b */
        private final CarSetupServiceImpl f29612b;

        public ConnectionTransfer(CarSetupServiceImpl carSetupServiceImpl) {
            this.f29612b = carSetupServiceImpl;
        }

        /* renamed from: a */
        public final int mo17427a() {
            return 0;
        }

        /* renamed from: b */
        public final CarInfoInternal mo17429b() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29595l;
        }

        /* renamed from: c */
        public final int mo17430c() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29590g;
        }

        /* renamed from: d */
        public final boolean mo17431d() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29591h;
        }

        /* renamed from: e */
        public final ParcelFileDescriptor mo17432e() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29588e;
        }

        /* renamed from: f */
        public final boolean mo17433f() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29594k.f38446h;
        }

        /* renamed from: g */
        public final boolean mo17434g() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29594k.mo22637d();
        }

        /* renamed from: h */
        public final int mo17435h() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29593j;
        }

        /* renamed from: i */
        public final int mo17436i() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29592i.f38282c;
        }

        /* renamed from: j */
        public final omi mo17437j() {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            return carSetupServiceImpl.f29598o;
        }

        /* renamed from: a */
        public final void mo17428a(oui oui) {
            CarSetupServiceImpl carSetupServiceImpl = this.f29612b;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            otw otw = carSetupServiceImpl.f29594k;
            if (otw == null) {
                try {
                    oui.mo22653a();
                } catch (RemoteException e) {
                }
            } else if (!otw.f38449k) {
                try {
                    Bundle bundle = new Bundle();
                    this.f29612b.f29589f.mo22221b(bundle);
                    oui.mo22654a(bundle);
                } catch (RemoteException e2) {
                }
                CarSetupServiceImpl carSetupServiceImpl2 = this.f29612b;
                carSetupServiceImpl2.f29596m = null;
                carSetupServiceImpl2.mo17423g();
            } else {
                this.f29611a = oui;
                otw.mo22638e();
            }
        }
    }

    /* renamed from: a */
    public static ParcelFileDescriptor m22115a(Intent intent, String str) {
        nte nte;
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra(str);
        if (binderParcel == null) {
            return null;
        }
        IBinder iBinder = binderParcel.f29535a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
            nte = queryLocalInterface instanceof nte ? (nte) queryLocalInterface : new nte(iBinder);
        } else {
            nte = null;
        }
        try {
            Parcel a = nte.mo8526a(1, nte.mo8529bj());
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dcl.m8163a(a, ParcelFileDescriptor.CREATOR);
            a.recycle();
            return parcelFileDescriptor;
        } catch (RemoteException e) {
            return null;
        }
    }

    /* renamed from: b */
    private final void m22120b(Bundle bundle) {
        bnsi d = f29560a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "b", 1048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Start handoff wifi setup %s", bundle);
        m22116a(new osd(), bundle, new orr(this, bundle));
    }

    /* renamed from: k */
    private final void m22121k() {
        Notification.Builder color = new Notification.Builder(this).setContentTitle(getString(C0126R.string.car_app_name)).setContentText(getString(C0126R.string.car_notification_message)).setSmallIcon(nyw.m28209a(this)).setColor(getResources().getColor(C0126R.color.car_light_blue_500));
        String string = getString(C0126R.string.car_app_name);
        if (ccqi.m131262b()) {
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", string);
            color.addExtras(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        nyy a = nyy.m28213a(this);
        if (a.mo21865a("car.default_notification_channel") == null) {
            a.mo21866a(new NotificationChannel("car.default_notification_channel", getString(C0126R.string.car_app_name), 3));
        }
        color.setChannelId("car.default_notification_channel");
        startForeground(1, color.build());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otw.a(java.lang.Boolean, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      otw.a(int, bpdu[]):void
      otw.a(bpcl, int):void
      otw.a(java.lang.Boolean, boolean):void */
    /* renamed from: c */
    public final void mo17419c() {
        ovp ovp;
        ovp ovp2;
        bnsi d = f29560a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "c", 865, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("tearDown");
        FirstActivityImpl.f29637c = false;
        this.f29604u = false;
        oxe oxe = this.f29573L;
        synchronized (oxe.f38555a) {
            if (oxe.f38556b) {
                omi omi = oxe.f38557c;
                if (omi != null) {
                    try {
                        omi.mo22290b(oxe);
                    } catch (RemoteException e) {
                    }
                }
                oxe.f38556b = false;
            }
        }
        this.f29576P.mo22343a((Object) this);
        if (this.f29586c != 0) {
            this.f29586c = 0;
            if (((Boolean) this.f29606w.mo6606a()).booleanValue()) {
                if (mo17425i()) {
                    this.f29570I.mo22580e();
                }
            } else if (this.f29570I != null) {
                this.f29570I.mo22580e();
            }
            ojq ojq = this.f29589f;
            if (ojq != null) {
                ojq.mo22222c();
                this.f29589f.mo22223d();
            }
            asfb asfb = this.f29587d;
            if (asfb != null) {
                asfb.mo49120c();
            }
            BroadcastReceiver broadcastReceiver = this.f29574N;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.f29574N = null;
            }
            ParcelFileDescriptor parcelFileDescriptor = this.f29588e;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e2) {
                    bnsi c = f29560a.mo68388c();
                    c.mo68437a(e2);
                    c.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "c", 900, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error closing analytics fd");
                }
            }
            otw otw = this.f29594k;
            if (otw != null) {
                ovi ovi = otw.f38445g;
                if (ovi != null) {
                    ovi.mo22663a();
                }
                otw.mo22629a((Boolean) null, true);
                this.f29594k = null;
            }
            ovq ovq = this.f29569H;
            if (ovq != null) {
                if (ccsq.m131459d()) {
                    ovp = (ovp) ovq.f38491a.getAndSet(null);
                } else {
                    synchronized (ovq) {
                        ovp2 = (ovp) ovq.f38491a.getAndSet(null);
                    }
                    ovp = ovp2;
                }
                if (ovp != null && ovp.isAlive()) {
                    ovp.interrupt();
                    try {
                        ovp.join(1000);
                    } catch (InterruptedException e3) {
                    }
                }
                this.f29569H = null;
            }
            this.f29571J.removeCallbacksAndMessages(null);
            C1585otp otp = this.f29575O;
            if (otp.f38428i) {
                otp.f38428i = false;
                otp.f38421b.unregisterReceiver(otp.f38431l);
                otp.mo22614a();
                otp.f38426g.execute(new otg(otp));
            }
            mo17407a();
            if (this.f29590g == 1 && this.f29600q) {
                bnsi d2 = f29560a.mo68390d();
                d2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "c", 919, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68405a("Reader thread stuck after cable removal. Will kill process.");
                Process.killProcess(Process.myPid());
            }
        }
    }

    /* renamed from: d */
    public final pbp mo17420d() {
        if (this.f29609z.mo22878d()) {
            return null;
        }
        if (this.f29567F.getAndIncrement() == 0) {
            this.f29568G = new pbp(getApplicationContext());
        }
        return this.f29568G;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = this.f29590g;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Connection type: ");
        sb.append(i);
        printWriter.println(sb.toString());
        int i2 = this.f29586c;
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("Connected state: ");
        sb2.append(i2);
        printWriter.println(sb2.toString());
        orn orn = this.f29592i;
        if (orn != null) {
            int i3 = orn.f38282c;
            StringBuilder sb3 = new StringBuilder(33);
            sb3.append("Analytics session id: ");
            sb3.append(i3);
            printWriter.println(sb3.toString());
        }
        asfb asfb = this.f29587d;
        if (asfb != null) {
            boolean e = asfb.mo49124e();
            StringBuilder sb4 = new StringBuilder(21);
            sb4.append("Wake lock held: ");
            sb4.append(e);
            printWriter.println(sb4.toString());
        } else {
            printWriter.println("Wake lock is null");
        }
        boolean z = this.f29591h;
        StringBuilder sb5 = new StringBuilder(22);
        sb5.append("startActivities: ");
        sb5.append(z);
        printWriter.println(sb5.toString());
        int i4 = this.f29593j;
        StringBuilder sb6 = new StringBuilder(26);
        sb6.append("connectionTag: ");
        sb6.append(i4);
        printWriter.println(sb6.toString());
        boolean z2 = this.f29599p;
        StringBuilder sb7 = new StringBuilder(22);
        sb7.append("suppressRestart: ");
        sb7.append(z2);
        printWriter.println(sb7.toString());
        boolean z3 = this.f29600q;
        StringBuilder sb8 = new StringBuilder(24);
        sb8.append("readerThreadStuck: ");
        sb8.append(z3);
        printWriter.println(sb8.toString());
        long j = this.f29577Q;
        StringBuilder sb9 = new StringBuilder(41);
        sb9.append("carServiceSessionId: ");
        sb9.append(j);
        printWriter.println(sb9.toString());
        otw otw = this.f29594k;
        if (otw != null) {
            printWriter.println("FrxState");
            boolean z4 = otw.f38449k;
            StringBuilder sb10 = new StringBuilder(19);
            sb10.append("setupOngoing: ");
            sb10.append(z4);
            printWriter.println(sb10.toString());
            boolean z5 = otw.f38450l;
            StringBuilder sb11 = new StringBuilder(34);
            sb11.append("carConnectionAlreadyAllowed: ");
            sb11.append(z5);
            printWriter.println(sb11.toString());
            boolean z6 = otw.f38446h;
            StringBuilder sb12 = new StringBuilder(25);
            sb12.append("shouldShowTutorial: ");
            sb12.append(z6);
            printWriter.println(sb12.toString());
            boolean z7 = otw.f38451m;
            StringBuilder sb13 = new StringBuilder(22);
            sb13.append("transferStarted: ");
            sb13.append(z7);
            printWriter.println(sb13.toString());
            boolean z8 = otw.f38452n;
            StringBuilder sb14 = new StringBuilder(24);
            sb14.append("carServiceStarted: ");
            sb14.append(z8);
            printWriter.println(sb14.toString());
        }
        CarInfoInternal carInfoInternal = this.f29595l;
        if (carInfoInternal != null) {
            String valueOf = String.valueOf(carInfoInternal);
            StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb15.append("car info: ");
            sb15.append(valueOf);
            printWriter.println(sb15.toString());
        }
        if (this.f29565D != null) {
            this.f29565D.mo22104a(printWriter);
        }
        nyx.m28212a(this, printWriter);
        this.f29576P.mo22342a(printWriter);
    }

    /* renamed from: e */
    public final void mo17421e() {
        if (!this.f29609z.mo22878d() && this.f29567F.decrementAndGet() == 0) {
            this.f29568G.close();
        }
    }

    /* JADX WARN: Type inference failed for: r5v29, types: [oib, android.os.IBinder], assign insn: 0x0124: INVOKE  (r5v29 ? I:oib) = (r5v28 com.google.android.gms.carsetup.CarInfoInternal) type: STATIC call: oja.a(java.lang.Object):oib */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: f */
    public final void mo17422f() {
        if (!mo17425i()) {
            this.f29596m = new ConnectionTransfer(this);
            Intent intent = new Intent("com.google.android.gms.car.TRANSFER");
            intent.setComponent((ComponentName) nzg.f36999a.mo6606a());
            intent.putExtra("connection", new BinderParcel(this.f29596m));
            m22119a(this.f29584X, intent);
            ofd.m28611a(this, "com.google.android.gms.car.CONNECTION_TRANSFER", ofa.STARTED);
            startService(intent);
            return;
        }
        osq osq = this.f29570I;
        osq.mo22567a();
        bnsi d = f29560a.mo68390d();
        d.mo68432a("osq", "d", 2098, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Starting transfer for handoff.");
        osq.f38351o = true;
        if (((Boolean) osq.f38340d.f29607x.mo6606a()).booleanValue()) {
            osq.f38349m.mo22837a(osq.f38346j, osq.mo22576b(!osq.f38350n));
        }
        Context context = osq.f38341e;
        Closeable closeable = osp.f38336a;
        ovk ovk = osq.f38340d.f29566E;
        osr osr = new osr(closeable, f29561b, osq.f38347k);
        osq.mo22567a();
        if (osq.f38352p) {
            Intent putExtra = new Intent("com.google.android.gms.car.HANDOFF").setComponent((ComponentName) nzg.f36999a.mo6606a()).putExtra("car_handoff_session_id", osq.f38346j).putExtra("car_handoff_component", osq.f38353q.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", !osq.f38350n).putExtra("car_handoff_connection_type", osq.f38347k).putExtra("connection_tag", osq.f38348l);
            m22119a(osq.f38342f, putExtra);
            if (((Boolean) osq.f38340d.f29608y.mo6606a()).booleanValue()) {
                putExtra.putExtra("car_handoff_analytics_session_id", (int) osq.f38346j);
            }
            if (((Boolean) osq.f38340d.f29607x.mo6606a()).booleanValue()) {
                putExtra.putExtra("car_handoff_use_gearhead_for_projection", true);
            }
            putExtra.putExtra("connection_tear_down_helper", new BinderParcel(new osx(osr)));
            if (!ccpv.m131198g()) {
                putExtra.putExtra("car_handoff_car_info", new BinderParcel(oja.m28892a(osq.f38340d.f29595l)));
            } else {
                CarInfoInternal carInfoInternal = osq.f38340d.f29595l;
                if (carInfoInternal != null) {
                    sef.m35071a(carInfoInternal, putExtra, "car_handoff_car_info");
                }
            }
            context.startService(putExtra);
            if (!osq.f38350n) {
                osq.f38339c.postDelayed(osq.f38338b, 5000);
                return;
            }
            return;
        }
        throw new IllegalStateException("No component accepted the handoff.");
    }

    /* renamed from: g */
    public final void mo17423g() {
        if (!mo17425i()) {
            this.f29589f.f37794d.f37594r.mo21929b();
            this.f29589f = null;
            this.f29588e = null;
        }
        mo17419c();
    }

    /* renamed from: h */
    public final void mo17424h() {
        mo17416a(true);
    }

    /* renamed from: i */
    public final boolean mo17425i() {
        return ((Boolean) this.f29606w.mo6606a()).booleanValue() ? ((Boolean) this.f29578R.mo6606a()).booleanValue() && this.f29570I.f38352p : ((Boolean) this.f29578R.mo6606a()).booleanValue() && this.f29570I != null && this.f29570I.f38352p;
    }

    /* renamed from: j */
    public final boolean mo17426j() {
        if (((Boolean) this.f29581U.mo6606a()).booleanValue()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        return ((Boolean) this.f29582V.mo6606a()).booleanValue() || nzi.m28224a();
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE".equals(intent.getAction())) {
            return new oub(this);
        }
        return null;
    }

    public final void onCreate() {
        adzt adzt;
        bnsi d = f29560a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "onCreate", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("onCreate");
        super.onCreate();
        ofd.m28611a(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", oes.CREATE);
        if (mo17426j()) {
            HandlerThread handlerThread = new HandlerThread("CarSetupServiceImpl", 9);
            this.f29585Y = handlerThread;
            handlerThread.start();
            this.f29572K = new adzt(Looper.getMainLooper());
        }
        if (mo17426j()) {
            adzt = new adzt(this.f29585Y.getLooper());
        } else {
            adzt = new adzt(Looper.getMainLooper());
        }
        this.f29571J = adzt;
        this.f29564C = npd.m27127a(this);
        Boolean b = oju.m28959a().mo22227b();
        if (b == null) {
            ExecutorService a = nzh.m28223a();
            a.execute(new osw(this));
            a.shutdown();
        } else {
            this.f29563B = b;
        }
        orn b2 = mo17417b();
        this.f29592i = b2;
        bmxy.m108581a(b2);
        this.f29575O = new C1585otp(getApplicationContext(), new ovl(this.f29592i), true);
        omx a2 = omx.m29200a((Context) this);
        this.f29576P = a2;
        a2.mo22344a(this, 100);
        if (((Boolean) this.f29578R.mo6606a()).booleanValue() && ((Boolean) this.f29606w.mo6606a()).booleanValue()) {
            this.f29570I = new osq(this.f29571J, this, this, this.f29592i, this.f29609z, this.f29584X, this.f29583W);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        mo17419c();
        ofd.m28611a(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", oes.DESTROY);
        if (mo17426j()) {
            this.f29585Y.quit();
            this.f29585Y = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.hardware.usb.UsbAccessory, boolean):void
     arg types: [android.hardware.usb.UsbAccessory, int]
     candidates:
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.content.Intent, java.lang.String):android.os.ParcelFileDescriptor
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(ozl, android.content.Intent):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(com.google.android.gms.carsetup.CarInfoInternal, boolean):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.hardware.usb.UsbAccessory, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void
     arg types: [java.lang.String, int, android.net.wifi.WifiInfo, ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.io.Closeable, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, boolean):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void */
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        Network network;
        WifiInfo wifiInfo;
        int i3;
        Intent intent2 = intent;
        if (intent2 == null || !intent2.getBooleanExtra("start_foreground_immediately", false)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m22121k();
        }
        bnsi d = f29560a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "onStartCommand", 364, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("onStartCommand: %s", intent2);
        if (intent2 == null) {
            bnsi d2 = f29560a.mo68390d();
            d2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "onStartCommand", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Restarting with null intent");
            mo17407a();
            return 2;
        }
        FirstActivityImpl.LocalBinder localBinder = (FirstActivityImpl.LocalBinder) intent2.getParcelableExtra("EXTRA_LOCAL_BINDER");
        if (((Boolean) this.f29580T.mo6606a()).booleanValue()) {
            this.f29604u = intent2.getBooleanExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        }
        if (Boolean.FALSE.equals(this.f29563B)) {
            bnsi d3 = f29560a.mo68390d();
            d3.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "onStartCommand", 379, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68405a("Failed security update, aborting");
            mo17407a();
        } else if (this.f29586c != 0) {
            bnsi d4 = f29560a.mo68390d();
            d4.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "onStartCommand", 382, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68405a("Already connected; ignoring connection request");
            ofd.m28611a(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", oes.ALREADY_STARTED);
        } else {
            if (localBinder != null) {
                FirstActivityImpl firstActivityImpl = localBinder.f29645b;
                if (firstActivityImpl != null) {
                    asfb asfb = firstActivityImpl.f29638b;
                    firstActivityImpl.f29638b = null;
                    this.f29587d = asfb;
                    intent2 = localBinder.f29644a;
                    bmxy.m108581a(intent2);
                } else {
                    bnsi d5 = f29560a.mo68390d();
                    d5.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "onStartCommand", 392, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d5.mo68405a("Restarted with invalid binder");
                    mo17407a();
                    return 2;
                }
            }
            this.f29586c = 1;
            this.f29593j = 0;
            this.f29599p = intent2.getBooleanExtra("suppress_restart", false);
            bxvd da = bpcl.f135759L.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl = (bpcl) da.f164949b;
            bpcl.f135774b |= 33554432;
            bpcl.f135770J = 1;
            this.f29592i.mo22545a((bpcl) da.mo74062i(), 63);
            if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent2.getAction())) {
                UsbAccessory usbAccessory = (UsbAccessory) intent2.getParcelableExtra("accessory");
                if (usbAccessory != null) {
                    this.f29590g = 1;
                    mo17410a(usbAccessory, true);
                }
            } else if ("com.google.android.gms.car.START_WIFI".equals(intent2.getAction())) {
                if (intent2.getStringExtra("ip_address") == null || intent2.getIntExtra("port", -1) == -1 || intent2.getParcelableExtra("wifi_info") == null) {
                    bnsi b = f29560a.mo68387b();
                    b.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 554, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Failure to start wifi with invalid IP / Port / WifiInfo");
                    if (ccsq.m131460e()) {
                        mo17419c();
                    }
                } else {
                    this.f29590g = 2;
                    this.f29601r = intent2.getIntExtra("wifi_version_major", -1);
                    this.f29602s = intent2.getIntExtra("wifi_version_minor", -1);
                    m22118a(intent2.getStringExtra("ip_address"), intent2.getIntExtra("port", 0), (WifiInfo) intent2.getParcelableExtra("wifi_info"), (Network) null, false);
                }
            } else if ("com.google.android.gms.car.WIFI_ACTION_BRIDGE".equals(intent2.getAction())) {
                if (intent2.getStringExtra("PARAM_HOST_ADDRESS") == null || intent2.getIntExtra("PARAM_SERVICE_PORT", -1) == -1) {
                    bnsi b2 = f29560a.mo68387b();
                    b2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 588, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("Failure to start wifi with invalid IP / Port");
                    if (ccsq.m131460e()) {
                        mo17419c();
                    }
                } else {
                    orn orn = this.f29592i;
                    bxvd b3 = orn.mo22550b();
                    bxvd da2 = bpej.f137288f.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpej bpej = (bpej) da2.f164949b;
                    bpej.f137290a |= 1;
                    bpej.f137291b = 2;
                    if (b3.f164950c) {
                        b3.mo74035c();
                        b3.f164950c = false;
                    }
                    bpcl bpcl2 = (bpcl) b3.f164949b;
                    bpej bpej2 = (bpej) da2.mo74062i();
                    bpej2.getClass();
                    bpcl2.f135761A = bpej2;
                    bpcl2.f135774b |= 16;
                    orn.mo22547a(b3, 46);
                    if (ccst.f179870a.mo6606a().mo76738a()) {
                        network = (Network) intent2.getParcelableExtra("PARAM_SERVICE_WIFI_NETWORK");
                        wifiInfo = (WifiInfo) intent2.getParcelableExtra("wifi_info");
                    } else {
                        wifiInfo = null;
                        network = null;
                    }
                    this.f29590g = 2;
                    if (wifiInfo != null) {
                        i3 = Math.max(wifiInfo.getFrequency(), 0);
                    } else {
                        i3 = 0;
                    }
                    this.f29603t = i3;
                    if (!((Boolean) this.f29578R.mo6606a()).booleanValue() || !((Boolean) this.f29579S.mo6606a()).booleanValue()) {
                        m22118a(intent2.getStringExtra("PARAM_HOST_ADDRESS"), intent2.getIntExtra("PARAM_SERVICE_PORT", -1), wifiInfo, network, intent2.getBooleanExtra("WIFI_Q_ENABLED", false));
                    } else {
                        Bundle extras = intent2.getExtras();
                        bnsi d6 = f29560a.mo68390d();
                        d6.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "b", 1048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d6.mo68420a("Start handoff wifi setup %s", extras);
                        m22116a(new osd(), extras, new orr(this, extras));
                    }
                }
            } else if ("com.google.android.gms.carsetup.START".equals(intent2.getAction())) {
                this.f29590g = intent2.getIntExtra("connection_type", 0);
                ParcelFileDescriptor a = m22115a(intent2, "in_fd");
                ParcelFileDescriptor a2 = m22115a(intent2, "out_fd");
                if (a == null || a2 == null) {
                    bnsi b4 = f29560a.mo68387b();
                    b4.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b4.mo68405a("Failure starting");
                } else {
                    ParcelFileDescriptor a3 = m22115a(intent2, "analytics_fd");
                    this.f29593j = intent2.getIntExtra("connection_tag", -1);
                    mo17414a(new ohd(a, a2), a, a2, a3, intent2.getBooleanExtra("start_activities", true));
                }
            } else if ("com.google.android.gms.carsetup.START_DUPLEX".equals(intent2.getAction())) {
                this.f29590g = intent2.getIntExtra("connection_type", 0);
                ParcelFileDescriptor a4 = m22115a(intent2, "connection_fd");
                if (a4 == null) {
                    bnsi b5 = f29560a.mo68387b();
                    b5.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b5.mo68405a("Failure starting");
                } else {
                    ParcelFileDescriptor a5 = m22115a(intent2, "analytics_fd");
                    this.f29593j = intent2.getIntExtra("connection_tag", -1);
                    m22117a(a4, a4, a5, intent2.getBooleanExtra("start_activities", true));
                }
            } else {
                bnsi b6 = f29560a.mo68387b();
                b6.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b6.mo68420a("Unknown intent %s", intent2);
                mo17419c();
            }
            if (!z && this.f29586c != 0) {
                m22121k();
            }
        }
        if (localBinder != null) {
            localBinder.f29645b.finishAndRemoveTask();
            localBinder.mo17444a();
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final orn mo17417b() {
        return new orn(this, this.f29564C);
    }

    /* renamed from: a */
    private final void m22116a(Closeable closeable, Bundle bundle, Runnable runnable) {
        Bundle bundle2 = bundle;
        try {
            bngx a = pbw.m30186a(getApplicationContext());
            if (((Boolean) this.f29607x.mo6606a()).booleanValue()) {
                bundle2.putBoolean("car_handoff_use_gearhead_for_projection", true);
            }
            this.f29577Q = f29559M.nextLong();
            if (!((Boolean) this.f29606w.mo6606a()).booleanValue()) {
                this.f29570I = new osq(this.f29571J, this, this, this.f29592i, this.f29609z, this.f29584X, this.f29583W);
            }
            pbm pbm = new pbm(getApplicationContext(), this.f29577Q, true, this.f29570I, this.f29571J, a, this.f29603t, this.f29609z, this.f29583W);
            osq osq = this.f29570I;
            long j = this.f29577Q;
            int i = this.f29590g;
            int i2 = this.f29593j;
            osq.f38346j = j;
            osq.f38348l = i2;
            osq.f38347k = i;
            osq.f38343g = closeable;
            osq.f38344h = bundle2;
            osq.f38345i = runnable;
            osq.f38349m = pbm;
            if (pbm.f38779e) {
                bnsi d = pbm.f38775a.mo68390d();
                d.mo68432a("pbm", "b", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Starting handoff interest checks");
                pbm.f38780f.post(new pat(pbm));
                return;
            }
            bnsi d2 = pbm.f38775a.mo68390d();
            d2.mo68432a("pbm", "b", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Skipping handoff interest checks - feature is not enabled");
            pbm.f38780f.post(new pas(pbm));
        } catch (NumberFormatException | InvalidPropertiesFormatException e) {
            bnsi b = f29560a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 697, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Aborting car connection handoff.");
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo17418b(bpdn bpdn, bpdo bpdo, String str) {
        int i;
        bnsi b = f29560a.mo68387b();
        b.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "b", 947, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        int i2 = 0;
        if (bpdn != null) {
            i = bpdn.f136282v;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (bpdo != null) {
            i2 = bpdo.f136351ap;
        }
        b.mo68425a("ProjectionErrorCode = %d, ProjectionErrorDetail = %d, %s", valueOf, Integer.valueOf(i2), str);
        nli.m26725a(this, bpdn, this.f29590g, bpdo);
        mo17419c();
        if (this.f29592i == null) {
            this.f29592i = mo17417b();
        }
        this.f29592i.mo22546a(bpdn, bpdo);
    }

    /* renamed from: a */
    private final void m22117a(Closeable closeable, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, boolean z) {
        bnsi d = f29560a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 658, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Handoff enabled: %b", this.f29578R.mo6606a());
        if (((Boolean) this.f29578R.mo6606a()).booleanValue()) {
            orp orp = new orp(this, closeable, parcelFileDescriptor, parcelFileDescriptor2, z);
            Bundle bundle = new Bundle();
            bundle.putParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR", parcelFileDescriptor);
            m22116a(closeable, bundle, orp);
            return;
        }
        mo17414a(closeable, parcelFileDescriptor, parcelFileDescriptor, parcelFileDescriptor2, z);
    }

    /* renamed from: a */
    private final void m22118a(String str, int i, WifiInfo wifiInfo, Network network, boolean z) {
        bnsi d = f29560a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 1085, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68426a("Start wifi setup %s:%s isUsingQNetworkStack=%b wifiInfo=(%s)", str, Integer.valueOf(i), Boolean.valueOf(z), wifiInfo);
        C1585otp otp = this.f29575O;
        bmxy.m108581a(this);
        if (otp.f38428i) {
            bnsi b = C1585otp.f38420a.mo68387b();
            b.mo68432a("otp", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Already initialized");
        } else {
            otp.f38424e = this;
            otp.f38426g = snp.m35703a(1, 9);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            otp.f38421b.registerReceiver(otp.f38431l, intentFilter);
            otp.f38429j = 0;
            otp.f38428i = true;
        }
        this.f29575O.mo22617a(str, i, wifiInfo, network, z);
    }

    /* renamed from: a */
    public static void m22119a(ozl ozl, Intent intent) {
        ozl.mo22806a(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17407a() {
        stopForeground(true);
        stopSelf();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pbp.a(com.google.android.gms.carsetup.CarInfoInternal, java.lang.String, boolean):com.google.android.gms.carsetup.CarInfoInternal
     arg types: [com.google.android.gms.carsetup.CarInfoInternal, java.lang.String, int]
     candidates:
      pbp.a(java.lang.String, java.lang.String, java.lang.String[]):com.google.android.gms.carsetup.CarInfoInternal
      pbp.a(java.lang.String, java.lang.String, java.lang.String):void
      pbp.a(com.google.android.gms.carsetup.CarInfoInternal, java.lang.String, boolean):com.google.android.gms.carsetup.CarInfoInternal */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* renamed from: a */
    public final void mo17408a(int i) {
        pbo pbo;
        boolean z;
        boolean z2;
        int i2;
        bpdu[] bpduArr;
        Object obj;
        pbo pbo2;
        if (npe.m27158a(npe.m27154a(ccui.f179964a.mo6606a().mo76832p()), this.f29595l.f29539a)) {
            mo17424h();
            return;
        }
        if (!mo17425i()) {
            oyn oyn = new oyn(this.f29597n);
            this.f29598o = oyn;
            this.f29573L.mo22736a(oyn);
        }
        if (!this.f29609z.mo22878d()) {
            pbp d = mo17420d();
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            try {
                CarInfoInternal carInfoInternal = this.f29595l;
                CarInfoInternal a = d.mo22880a(carInfoInternal, "allowedcars", true);
                if (a == null) {
                    a = d.mo22880a(carInfoInternal, "rejectedcars", true);
                }
                boolean b = d.mo22889b(this.f29595l);
                boolean a2 = d.mo22885a(this.f29595l);
                if (a != null) {
                    CarInfoInternal carInfoInternal2 = this.f29595l;
                    carInfoInternal2.f29542d = a.f29542d;
                    carInfoInternal2.f29539a.f29335d = a.f29539a.f29335d;
                    carInfoInternal2.f29541c = a.f29541c;
                }
                if (b) {
                    pbo = pbo.REJECTED;
                } else if (!a2) {
                    pbo = pbo.UNKNOWN;
                } else {
                    pbo = pbo.ALLOWED;
                }
                bnsi d2 = f29560a.mo68390d();
                d2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 1471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68420a("Database authorization: %s", pbo);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        } else {
            CarInfoInternal carInfoInternal3 = this.f29595l;
            if (!carInfoInternal3.f29553o) {
                pbo2 = pbo.UNKNOWN;
            } else if (carInfoInternal3.f29554p) {
                pbo2 = pbo.ALLOWED;
            } else {
                pbo2 = pbo.REJECTED;
            }
            bnsi d3 = f29560a.mo68390d();
            d3.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 1466, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68420a("CarInfo authorization: %s", pbo);
        }
        oxe oxe = this.f29573L;
        boolean z3 = this.f29604u;
        int ordinal = pbo.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z2 = true;
                z = true;
            } else if (ordinal != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = true;
            }
            String str = "a";
            String str2 = "com.google.android.gms.carsetup.CarSetupServiceImpl";
            this.f29594k = new otw(getApplicationContext(), this.f29595l, this.f29564C, i, oxe, z3, z2, z, this.f29562A, this.f29592i);
            if (!pbo.REJECTED.equals(pbo)) {
                this.f29598o = null;
                mo17424h();
                mo17421e();
                return;
            }
            if (!this.f29609z.mo22878d()) {
                int i3 = this.f29564C.f36296c.getInt("car_connection_count", 0);
                if (i3 > 30) {
                    this.f29568G.mo22887b();
                    i3 = 0;
                }
                this.f29564C.mo21381a(i3 + 1);
            }
            if (this.f29590g == 0) {
                this.f29598o = null;
                this.f29595l.f29539a.f29335d = Long.toHexString(new Random().nextLong());
                this.f29594k.mo22635c(true);
                mo17421e();
                mo17422f();
                return;
            }
            if (!this.f29599p) {
                otw otw = this.f29594k;
                String str3 = "false";
                try {
                    i2 = 2;
                    try {
                        str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.car.skip_frx", str3);
                    } catch (Exception e) {
                    }
                } catch (Exception e2) {
                    i2 = 2;
                }
                if (!"true".equalsIgnoreCase(str3)) {
                    List a3 = oqx.m29633a(otw.f38440b, otw).mo22527a();
                    if (!a3.isEmpty()) {
                        bpduArr = new bpdu[a3.size()];
                        int size = a3.size();
                        int i4 = 0;
                        int i5 = 0;
                        while (i5 < size) {
                            bpduArr[i4] = oqx.m29634b((String) a3.get(i5));
                            i5++;
                            i4++;
                        }
                    } else {
                        bpduArr = null;
                    }
                    boolean isEmpty = TextUtils.isEmpty(ccui.m131664d().trim());
                    bpdi bpdi = bpdi.EXPERIMENT;
                    bpdh bpdh = isEmpty ^ true ? bpdh.MEDIA_APP_REQUIREMENT_CONTROL : bpdh.MEDIA_APP_REQUIREMENT_TREATMENT;
                    bxvd da = bpdj.f136247f.mo74144da();
                    int i6 = bpdi.f136246K;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpdj bpdj = (bpdj) da.f164949b;
                    int i7 = bpdj.f136249a | 1;
                    bpdj.f136249a = i7;
                    bpdj.f136250b = i6;
                    int i8 = bpdh.f136208em;
                    bpdj.f136249a = i2 | i7;
                    bpdj.f136251c = i8;
                    bpdj bpdj2 = (bpdj) da.mo74062i();
                    bxvd da2 = bpcl.f135759L.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpcl bpcl = (bpcl) da2.f164949b;
                    bpdj2.getClass();
                    bpcl.f135785m = bpdj2;
                    bpcl.f135773a |= 8192;
                    otw.mo22627a((bpcl) da2.mo74062i(), 38);
                    if (!otw.f38450l) {
                        bnsi d4 = otw.f38439a.mo68390d();
                        d4.mo68432a("otw", "c", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d4.mo68405a("Triggering FRX: car connection is not allowed");
                        otw.mo22626a(3, bpduArr);
                    } else if (!otw.mo22637d()) {
                        bnsi d5 = otw.f38439a.mo68390d();
                        d5.mo68432a("otw", "c", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d5.mo68405a("Triggering FRX: did not finish FRX");
                        otw.mo22626a(4, bpduArr);
                    } else if (bpduArr != null) {
                        bnsi d6 = otw.f38439a.mo68390d();
                        d6.mo68432a("otw", "c", 355, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d6.mo68420a("Triggering FRX: applications are not up to date %s", a3);
                        otw.mo22626a(5, bpduArr);
                    } else if (nyz.m28216a()) {
                        bnsi d7 = otw.f38439a.mo68390d();
                        d7.mo68432a("otw", "c", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d7.mo68405a("Triggering FRX: GMSCore permissions missing");
                        otw.mo22626a(6, (bpdu[]) null);
                    } else {
                        int i9 = otw.f38443e;
                        if (i9 != 0 && i9 != 1) {
                            bnsi d8 = otw.f38439a.mo68390d();
                            d8.mo68432a("otw", "c", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d8.mo68405a("Triggering FRX: device not supported");
                            otw.mo22626a(9, (bpdu[]) null);
                        } else if (!otw.mo22639f()) {
                            bnsi d9 = otw.f38439a.mo68390d();
                            d9.mo68432a("otw", "c", 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d9.mo68405a("Triggering FRX: TOS not accepted");
                            otw.mo22626a(8, (bpdu[]) null);
                        }
                    }
                    if (mo17425i()) {
                        osq osq = this.f29570I;
                        osq.mo22567a();
                        osq.f38350n = true;
                        pbm pbm = (pbm) osq.f38349m;
                        pbm.f38780f.post(new pax(pbm, osq.f38340d.f29573L));
                        return;
                    }
                    if (this.f29589f == null) {
                        bnsi b2 = f29560a.mo68387b();
                        b2.mo68404a(bnsk.SMALL);
                        b2.mo68432a(str2, str, 1541, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bryx a4 = bryx.m114908a(Integer.valueOf(this.f29590g));
                        bryx a5 = bryx.m114908a(Integer.valueOf(this.f29586c));
                        if (this.f29570I != null) {
                            obj = Boolean.valueOf(this.f29570I.f38337a.get());
                        } else {
                            obj = "<null handoffStateManager>";
                        }
                        b2.mo68425a("protocolManager is unexpectedly null. connectionType: %s. connected state: %s. handoffStateManager.hasCleanedUp: %s.", a4, a5, bryx.m114908a(obj));
                    }
                    bmxy.m108582a(this.f29589f, "protocolManager is null.");
                    if (this.f29589f.mo22212a((ojn) this.f29598o) != 1) {
                        mo17418b(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_SENSORS, "No sensors");
                        mo17421e();
                        return;
                    }
                    this.f29589f.mo22213a((ojl) new ose(this));
                    return;
                }
                bnsi d10 = otw.f38439a.mo68390d();
                d10.mo68432a("otw", "c", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d10.mo68405a("Skipping FRX: adb override");
            }
            if (ccql.m131269d()) {
                ofd.m28611a(this, "com.google.android.gms.car.AUTHORIZATION", ofa.COMPLETED);
            }
            this.f29598o = null;
            mo17422f();
            mo17421e();
            return;
        }
        z2 = false;
        z = false;
        String str4 = "a";
        String str22 = "com.google.android.gms.carsetup.CarSetupServiceImpl";
        this.f29594k = new otw(getApplicationContext(), this.f29595l, this.f29564C, i, oxe, z3, z2, z, this.f29562A, this.f29592i);
        if (!pbo.REJECTED.equals(pbo)) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.hardware.usb.UsbAccessory, boolean):void
     arg types: [android.hardware.usb.UsbAccessory, int]
     candidates:
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.content.Intent, java.lang.String):android.os.ParcelFileDescriptor
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(ozl, android.content.Intent):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(com.google.android.gms.carsetup.CarInfoInternal, boolean):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(android.hardware.usb.UsbAccessory, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void
     arg types: [java.lang.String, int, android.net.wifi.WifiInfo, ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.io.Closeable, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, android.os.ParcelFileDescriptor, boolean):void
      com.google.android.gms.carsetup.CarSetupServiceImpl.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void */
    /* renamed from: a */
    public final void mo17409a(Intent intent) {
        Network network;
        int i;
        Intent intent2 = intent;
        this.f29593j = 0;
        this.f29599p = intent2.getBooleanExtra("suppress_restart", false);
        bxvd da = bpcl.f135759L.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcl bpcl = (bpcl) da.f164949b;
        bpcl.f135774b |= 33554432;
        bpcl.f135770J = 1;
        this.f29592i.mo22545a((bpcl) da.mo74062i(), 63);
        if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction())) {
            UsbAccessory usbAccessory = (UsbAccessory) intent2.getParcelableExtra("accessory");
            if (usbAccessory != null) {
                this.f29590g = 1;
                mo17410a(usbAccessory, true);
            }
        } else if ("com.google.android.gms.car.START_WIFI".equals(intent.getAction())) {
            if (intent2.getStringExtra("ip_address") == null || intent2.getIntExtra("port", -1) == -1 || intent2.getParcelableExtra("wifi_info") == null) {
                bnsi b = f29560a.mo68387b();
                b.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 554, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Failure to start wifi with invalid IP / Port / WifiInfo");
                if (ccsq.m131460e()) {
                    mo17419c();
                    return;
                }
                return;
            }
            this.f29590g = 2;
            this.f29601r = intent2.getIntExtra("wifi_version_major", -1);
            this.f29602s = intent2.getIntExtra("wifi_version_minor", -1);
            m22118a(intent2.getStringExtra("ip_address"), intent2.getIntExtra("port", 0), (WifiInfo) intent2.getParcelableExtra("wifi_info"), (Network) null, false);
        } else if ("com.google.android.gms.car.WIFI_ACTION_BRIDGE".equals(intent.getAction())) {
            if (intent2.getStringExtra("PARAM_HOST_ADDRESS") == null || intent2.getIntExtra("PARAM_SERVICE_PORT", -1) == -1) {
                bnsi b2 = f29560a.mo68387b();
                b2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 588, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Failure to start wifi with invalid IP / Port");
                if (ccsq.m131460e()) {
                    mo17419c();
                    return;
                }
                return;
            }
            orn orn = this.f29592i;
            bxvd b3 = orn.mo22550b();
            bxvd da2 = bpej.f137288f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpej bpej = (bpej) da2.f164949b;
            bpej.f137290a = 1 | bpej.f137290a;
            bpej.f137291b = 2;
            if (b3.f164950c) {
                b3.mo74035c();
                b3.f164950c = false;
            }
            bpcl bpcl2 = (bpcl) b3.f164949b;
            bpej bpej2 = (bpej) da2.mo74062i();
            bpej2.getClass();
            bpcl2.f135761A = bpej2;
            bpcl2.f135774b |= 16;
            orn.mo22547a(b3, 46);
            WifiInfo wifiInfo = null;
            if (ccst.f179870a.mo6606a().mo76738a()) {
                network = (Network) intent2.getParcelableExtra("PARAM_SERVICE_WIFI_NETWORK");
                wifiInfo = (WifiInfo) intent2.getParcelableExtra("wifi_info");
            } else {
                network = null;
            }
            this.f29590g = 2;
            if (wifiInfo != null) {
                i = Math.max(wifiInfo.getFrequency(), 0);
            } else {
                i = 0;
            }
            this.f29603t = i;
            if (!((Boolean) this.f29578R.mo6606a()).booleanValue() || !((Boolean) this.f29579S.mo6606a()).booleanValue()) {
                m22118a(intent2.getStringExtra("PARAM_HOST_ADDRESS"), intent2.getIntExtra("PARAM_SERVICE_PORT", -1), wifiInfo, network, intent2.getBooleanExtra("WIFI_Q_ENABLED", false));
                return;
            }
            Bundle extras = intent.getExtras();
            bnsi d = f29560a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "b", 1048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Start handoff wifi setup %s", extras);
            m22116a(new osd(), extras, new orr(this, extras));
        } else if ("com.google.android.gms.carsetup.START".equals(intent.getAction())) {
            this.f29590g = intent2.getIntExtra("connection_type", 0);
            ParcelFileDescriptor a = m22115a(intent2, "in_fd");
            ParcelFileDescriptor a2 = m22115a(intent2, "out_fd");
            if (a == null || a2 == null) {
                bnsi b4 = f29560a.mo68387b();
                b4.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68405a("Failure starting");
                return;
            }
            ParcelFileDescriptor a3 = m22115a(intent2, "analytics_fd");
            this.f29593j = intent2.getIntExtra("connection_tag", -1);
            mo17414a(new ohd(a, a2), a, a2, a3, intent2.getBooleanExtra("start_activities", true));
        } else if ("com.google.android.gms.carsetup.START_DUPLEX".equals(intent.getAction())) {
            this.f29590g = intent2.getIntExtra("connection_type", 0);
            ParcelFileDescriptor a4 = m22115a(intent2, "connection_fd");
            if (a4 == null) {
                bnsi b5 = f29560a.mo68387b();
                b5.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b5.mo68405a("Failure starting");
                return;
            }
            ParcelFileDescriptor a5 = m22115a(intent2, "analytics_fd");
            this.f29593j = intent2.getIntExtra("connection_tag", -1);
            m22117a(a4, a4, a5, intent2.getBooleanExtra("start_activities", true));
        } else {
            bnsi b6 = f29560a.mo68387b();
            b6.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b6.mo68420a("Unknown intent %s", intent2);
            mo17419c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112  */
    /* renamed from: a */
    public final void mo17410a(UsbAccessory usbAccessory, boolean z) {
        String str;
        ParcelFileDescriptor parcelFileDescriptor;
        bpdo bpdo;
        int i;
        UsbManager usbManager = (UsbManager) getSystemService("usb");
        UsbAccessory[] accessoryList = usbManager.getAccessoryList();
        if (accessoryList == null || accessoryList.length == 0) {
            bpdo = bpdo.EMPTY_USB_ACCESSORY_LIST;
            str = "No device currently connected ";
            parcelFileDescriptor = null;
        } else if (!usbManager.hasPermission(usbAccessory)) {
            bpdo = bpdo.NO_ACCESSORY_PERMISSION;
            str = "No permission for accessory ";
            parcelFileDescriptor = null;
        } else {
            try {
                ParcelFileDescriptor openAccessory = usbManager.openAccessory(usbAccessory);
                if (openAccessory == null) {
                    try {
                        if (!f29561b.get()) {
                            str = "Failed to open accessory ";
                            parcelFileDescriptor = openAccessory;
                            bpdo = bpdo.NO_ACCESSORY_FD;
                        } else {
                            bnsi c = f29560a.mo68388c();
                            c.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 982, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c.mo68420a("Ignoring a potentially spurious intent to attach to: %s", usbAccessory);
                            bpdn bpdn = bpdn.USB_ACCESSORY_ERROR;
                            bpdo bpdo2 = bpdo.SPURIOUS_USB_ACCESSORY_EVENT;
                            bnsi c2 = f29560a.mo68388c();
                            c2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 934, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            int i2 = 0;
                            if (bpdn != null) {
                                i = bpdn.f136282v;
                            } else {
                                i = 0;
                            }
                            Integer valueOf = Integer.valueOf(i);
                            if (bpdo2 != null) {
                                i2 = bpdo2.f136351ap;
                            }
                            c2.mo68425a("ProjectionErrorCode = %d, ProjectionErrorDetail = %d, %s", valueOf, Integer.valueOf(i2), "Failed to open already open USB accessory.");
                            if (this.f29592i == null) {
                                this.f29592i = mo17417b();
                            }
                            this.f29592i.mo22546a(bpdn, bpdo2);
                            if (ccsq.f179858a.mo6606a().mo76736j()) {
                                mo17419c();
                                return;
                            }
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        bnsi b = f29560a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 998, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("Error opening accessory");
                        bpdo = bpdo.INVALID_ACCESSORY;
                        str = "Invalid argument passed in openAccessory ";
                        parcelFileDescriptor = null;
                        if (bpdo == null) {
                        }
                    }
                } else {
                    parcelFileDescriptor = openAccessory;
                    bpdo = null;
                    str = null;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                bnsi b2 = f29560a.mo68387b();
                b2.mo68437a(e);
                b2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 998, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Error opening accessory");
                bpdo = bpdo.INVALID_ACCESSORY;
                str = "Invalid argument passed in openAccessory ";
                parcelFileDescriptor = null;
                if (bpdo == null) {
                }
            }
        }
        if (bpdo == null) {
            f29561b.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            C15612 r0 = new TracingBroadcastReceiver("car_setup") {
                /* class com.google.android.gms.carsetup.CarSetupServiceImpl.C15612 */

                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    String action = intent.getAction();
                    UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
                    bnsn bnsn = CarSetupServiceImpl.f29560a;
                    if (usbAccessory != null && action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                        CarSetupServiceImpl.this.mo17419c();
                    }
                }
            };
            this.f29574N = r0;
            registerReceiver(r0, intentFilter);
            m22117a(parcelFileDescriptor, parcelFileDescriptor, null, true);
        } else if (!z) {
            bpdn bpdn2 = bpdn.USB_ACCESSORY_ERROR;
            String valueOf2 = String.valueOf(usbAccessory);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(valueOf2).length());
            sb.append(str);
            sb.append(valueOf2);
            mo17418b(bpdn2, bpdo, sb.toString());
        } else {
            bnsi d = f29560a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 1006, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("%s, retrying", str);
            new adzt(Looper.getMainLooper()).postDelayed(new orq(this, usbAccessory), 500);
        }
    }

    /* renamed from: a */
    public final void mo17411a(Bundle bundle) {
        m22118a(bundle.getString("PARAM_HOST_ADDRESS"), bundle.getInt("PARAM_SERVICE_PORT", -1), (WifiInfo) bundle.getParcelable("wifi_info"), (Network) bundle.getParcelable("PARAM_SERVICE_WIFI_NETWORK"), bundle.getBoolean("WIFI_Q_ENABLED"));
    }

    /* renamed from: a */
    public final void mo17412a(bpdn bpdn, bpdo bpdo, String str) {
        int i;
        bnsi c = f29560a.mo68388c();
        c.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 934, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        int i2 = 0;
        if (bpdn != null) {
            i = bpdn.f136282v;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (bpdo != null) {
            i2 = bpdo.f136351ap;
        }
        c.mo68425a("ProjectionErrorCode = %d, ProjectionErrorDetail = %d, %s", valueOf, Integer.valueOf(i2), str);
        if (this.f29592i == null) {
            this.f29592i = mo17417b();
        }
        this.f29592i.mo22546a(bpdn, bpdo);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.EnumSet, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final void mo17413a(CarInfoInternal carInfoInternal, boolean z) {
        oqz oqz;
        if (ccql.m131269d()) {
            ofd.m28611a(this, "com.google.android.gms.car.AUTHORIZATION", ofa.STARTED);
        }
        this.f29595l = carInfoInternal;
        ovq ovq = new ovq(this, this.f29564C, new ors(this, z));
        this.f29569H = ovq;
        if (ccsq.m131459d()) {
            ovq.mo22700a();
        } else {
            synchronized (ovq) {
                ovq.mo22700a();
            }
        }
        if (ccwa.m131880b()) {
            if (this.f29590g == 2) {
                oqz = oqz.WIFI;
            } else {
                oqz = oqz.USB;
            }
            orb orb = new orb(this, "bluetooth_addresses_prefs");
            String str = this.f29595l.f29544f;
            if (BluetoothAdapter.checkBluetoothAddress(str) && oqz != null) {
                EnumSet a = orb.mo22530a(str);
                if (!a.contains(oqz)) {
                    a.add(oqz);
                    orb.f38267a.edit().putStringSet(orb.m29638b(str), bnic.m109488a(bnjd.m109575a((Iterable) a, ora.f38266a))).apply();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17414a(Closeable closeable, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, boolean z) {
        bmxy.m108600b(this.f29590g != -1);
        this.f29588e = parcelFileDescriptor3;
        this.f29591h = z;
        this.f29592i.f38281b = parcelFileDescriptor3 != null ? new FileOutputStream(parcelFileDescriptor3.getFileDescriptor()) : null;
        osh osh = new osh(this);
        this.f29597n = osh;
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
        osr osr = new osr(closeable, f29561b, this.f29590g);
        ojk a = ojq.m28927a();
        a.f37764e = this;
        a.f37774o = new ojd();
        a.f37775p = "GmsCore_OpenSSL";
        bmxy.m108588a(true);
        a.f37778s = C0126R.raw.car_android_32;
        bmxy.m108588a(true);
        a.f37772m = C0126R.raw.car_android_64;
        bmxy.m108588a(true);
        a.f37770k = C0126R.raw.car_android_128;
        bmxy.m108588a(true);
        a.f37779t = C0126R.string.car_hu_label;
        int i = this.f29590g;
        if (i == 1) {
            ohj d = ohk.m28750d();
            d.mo22166a(ccsw.f179874a.mo6606a().mo76744d());
            a.f37780u = d.mo22164a();
        } else if (i == 2) {
            ohj d2 = ohk.m28750d();
            d2.mo22166a(ccsw.f179874a.mo6606a().mo76745e());
            if (ccsw.m131489b() > 0) {
                d2.mo22167b((int) ccsw.m131489b());
            }
            if (ccsw.m131490c() > 0) {
                d2.mo22165a((int) ccsw.m131490c());
            }
            a.f37780u = d2.mo22164a();
        }
        a.f37766g = osh;
        a.f37763d = osr;
        a.f37769j = fileInputStream;
        a.f37773n = fileOutputStream;
        a.f37768i = this.f29564C.mo21396g();
        this.f29589f = a.mo22211a();
        if (this.f29565D != null) {
            this.f29589f.mo22217a((ofo) this.f29565D);
        }
        if (this.f29563B != null) {
            this.f29586c = 3;
            this.f29589f.mo22220b();
            return;
        }
        this.f29586c = 2;
    }

    /* renamed from: a */
    public final void mo17415a(Socket socket) {
        nuu.m27792a(new osc(this, socket));
    }

    /* renamed from: a */
    public final void mo17416a(boolean z) {
        bipi bipi;
        oui oui;
        bipi bipi2;
        if (ccql.m131269d()) {
            ofd.m28611a(this, "com.google.android.gms.car.AUTHORIZATION", ofa.FAILED);
        }
        if (mo17425i()) {
            CarInfo carInfo = this.f29595l.f29539a;
            int i = carInfo.f29336e;
            boolean z2 = false;
            if (i > 1 || (i == 1 && carInfo.f29337f > 3)) {
                z2 = true;
            }
            if (!z && z2) {
                bipi2 = bipi.NOT_CURRENTLY_SUPPORTED;
            } else {
                bipi2 = bipi.USER_SELECTION;
            }
            this.f29570I.mo22570a(bipi2);
        } else {
            ConnectionTransfer connectionTransfer = this.f29596m;
            if (!(connectionTransfer == null || (oui = connectionTransfer.f29611a) == null)) {
                try {
                    oui.mo22653a();
                } catch (RemoteException e) {
                }
            }
            ojq ojq = this.f29589f;
            if (ojq != null) {
                if (!z && ojq.mo22224e()) {
                    bipi = bipi.NOT_CURRENTLY_SUPPORTED;
                } else {
                    bipi = bipi.USER_SELECTION;
                }
                this.f29589f.mo22215a(bipi);
            }
        }
        this.f29596m = null;
        this.f29594k = null;
        mo17419c();
    }
}
