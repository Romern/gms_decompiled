package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sam {

    /* renamed from: G */
    public static final String[] f43928G = {"service_esmobile", "service_googleme"};

    /* renamed from: N */
    private static final Feature[] f43929N = new Feature[0];

    /* renamed from: A */
    public final sac f43930A;

    /* renamed from: B */
    public final sad f43931B;

    /* renamed from: C */
    public ConnectionResult f43932C;

    /* renamed from: D */
    public boolean f43933D;

    /* renamed from: E */
    public volatile ConnectionInfo f43934E;

    /* renamed from: F */
    protected AtomicInteger f43935F;

    /* renamed from: b */
    private int f43936b;

    /* renamed from: c */
    private long f43937c;

    /* renamed from: d */
    private long f43938d;

    /* renamed from: e */
    private int f43939e;

    /* renamed from: f */
    private long f43940f;

    /* renamed from: g */
    private final sbq f43941g;

    /* renamed from: h */
    private final rfj f43942h;

    /* renamed from: i */
    private IInterface f43943i;

    /* renamed from: j */
    private sai f43944j;

    /* renamed from: k */
    private final int f43945k;

    /* renamed from: l */
    private final String f43946l;

    /* renamed from: q */
    sbx f43947q;

    /* renamed from: r */
    public final Context f43948r;

    /* renamed from: s */
    public final Looper f43949s;

    /* renamed from: t */
    final Handler f43950t;

    /* renamed from: u */
    public final Object f43951u;

    /* renamed from: v */
    public final Object f43952v;

    /* renamed from: w */
    public scn f43953w;

    /* renamed from: x */
    protected sag f43954x;

    /* renamed from: y */
    public final ArrayList f43955y;

    /* renamed from: z */
    public int f43956z;

    /* JADX WARNING: Illegal instructions before constructor call */
    protected sam(Context context, Looper looper, int i, sac sac, sad sad) {
        this(context, looper, r3, r4, i, sac, sad, null);
        sbq a = sbq.m34856a(context);
        rfj rfj = rfj.f42872d;
        sdo.m34959a(sac);
        sdo.m34959a(sad);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m34754a(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        sdo.m34974b(z3);
        synchronized (this.f43951u) {
            this.f43956z = i;
            this.f43943i = iInterface;
            mo25291D();
            if (i == 1) {
                sai sai = this.f43944j;
                if (sai != null) {
                    sbq sbq = this.f43941g;
                    sbx sbx = this.f43947q;
                    String str = sbx.f44041a;
                    String str2 = sbx.f44042b;
                    int i2 = sbx.f44043c;
                    mo25307w();
                    sbq.mo25353a(str, str2, i2, sai, this.f43947q.f44044d);
                    this.f43944j = null;
                }
            } else if (i == 2 || i == 3) {
                if (this.f43944j != null) {
                    sbx sbx2 = this.f43947q;
                    if (sbx2 != null) {
                        String str3 = sbx2.f44041a;
                        String str4 = sbx2.f44042b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        sbq sbq2 = this.f43941g;
                        sbx sbx3 = this.f43947q;
                        String str5 = sbx3.f44041a;
                        String str6 = sbx3.f44042b;
                        int i3 = sbx3.f44043c;
                        sai sai2 = this.f43944j;
                        mo25307w();
                        sbq2.mo25353a(str5, str6, i3, sai2, this.f43947q.f44044d);
                        this.f43935F.incrementAndGet();
                    }
                }
                this.f43944j = new sai(this, this.f43935F.get());
                sbx sbx4 = new sbx(mo25306v(), mo6463a(), mo21953G(), mo12105F());
                this.f43947q = sbx4;
                if (sbx4.f44044d) {
                    if (mo6465d() < 17895000) {
                        String valueOf = String.valueOf(this.f43947q.f44041a);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ") : "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf));
                    }
                }
                sbq sbq3 = this.f43941g;
                sbx sbx5 = this.f43947q;
                if (!sbq3.mo25357a(new sbp(sbx5.f44041a, sbx5.f44042b, sbx5.f44043c, this.f43947q.f44044d), this.f43944j, mo25307w())) {
                    sbx sbx6 = this.f43947q;
                    String str7 = sbx6.f44041a;
                    String str8 = sbx6.f44042b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 34 + String.valueOf(str8).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str7);
                    sb2.append(" on ");
                    sb2.append(str8);
                    Log.e("GmsClient", sb2.toString());
                    mo25293a(16, this.f43935F.get());
                }
            } else if (i == 4) {
                mo16781a(iInterface);
            }
        }
    }

    /* renamed from: A */
    public final void mo25288A() {
        if (!mo25301p()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: B */
    public final IInterface mo25289B() {
        IInterface iInterface;
        synchronized (this.f43951u) {
            if (this.f43956z != 5) {
                mo25288A();
                sdo.m34971a(this.f43943i != null, (Object) "Client is connected but service is null");
                iInterface = this.f43943i;
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public Set mo25290C() {
        return Collections.emptySet();
    }

    /* renamed from: D */
    public void mo25291D() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo12105F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public int mo21953G() {
        return 129;
    }

    /* renamed from: H */
    public boolean mo16778H() {
        return false;
    }

    /* renamed from: I */
    public Feature[] mo6461I() {
        return f43929N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract IInterface mo6462a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo6463a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo6464b();

    /* renamed from: b */
    public final void mo25300b(int i) {
        Handler handler = this.f43950t;
        handler.sendMessage(handler.obtainMessage(6, this.f43935F.get(), i));
    }

    /* renamed from: d */
    public int mo6465d() {
        return rfj.f42871c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Bundle mo12238f() {
        return new Bundle();
    }

    /* renamed from: g */
    public boolean mo12787g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo12923h() {
        return false;
    }

    /* renamed from: i */
    public Intent mo12924i() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: j */
    public void mo14032j() {
        this.f43935F.incrementAndGet();
        synchronized (this.f43955y) {
            int size = this.f43955y.size();
            for (int i = 0; i < size; i++) {
                ((saf) this.f43955y.get(i)).mo25285d();
            }
            this.f43955y.clear();
        }
        synchronized (this.f43952v) {
            this.f43953w = null;
        }
        m34754a(1, (IInterface) null);
    }

    /* renamed from: m */
    public Bundle mo16784m() {
        return null;
    }

    /* renamed from: p */
    public final boolean mo25301p() {
        boolean z;
        synchronized (this.f43951u) {
            z = this.f43956z == 4;
        }
        return z;
    }

    /* renamed from: q */
    public final boolean mo25302q() {
        boolean z;
        synchronized (this.f43951u) {
            int i = this.f43956z;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: r */
    public boolean mo25303r() {
        return true;
    }

    /* renamed from: s */
    public final String mo25304s() {
        sbx sbx;
        if (mo25301p() && (sbx = this.f43947q) != null) {
            return sbx.f44042b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: t */
    public final Feature[] mo25305t() {
        ConnectionInfo connectionInfo = this.f43934E;
        if (connectionInfo != null) {
            return connectionInfo.f30224b;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo25306v() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final String mo25307w() {
        String str = this.f43946l;
        return str == null ? this.f43948r.getClass().getName() : str;
    }

    /* renamed from: x */
    public void mo25308x() {
        rfj rfj = this.f43942h;
        Context context = this.f43948r;
        mo6465d();
        int b = rfj.mo24590b(context);
        if (b != 0) {
            m34754a(1, (IInterface) null);
            mo25297a(new saj(this), b, (PendingIntent) null);
            return;
        }
        mo25296a(new saj(this));
    }

    /* renamed from: y */
    public Account mo25309y() {
        return null;
    }

    /* renamed from: z */
    public Feature[] mo25310z() {
        return f43929N;
    }

    protected sam(Context context, Looper looper, sbq sbq, rfj rfj, int i, sac sac, sad sad, String str) {
        this.f43951u = new Object();
        this.f43952v = new Object();
        this.f43955y = new ArrayList();
        this.f43956z = 1;
        this.f43932C = null;
        this.f43933D = false;
        this.f43934E = null;
        this.f43935F = new AtomicInteger(0);
        sdo.checkIfNull(context, "Context must not be null");
        this.f43948r = context;
        sdo.checkIfNull(looper, "Looper must not be null");
        this.f43949s = looper;
        sdo.checkIfNull(sbq, "Supervisor must not be null");
        this.f43941g = sbq;
        sdo.checkIfNull(rfj, "API availability must not be null");
        this.f43942h = rfj;
        this.f43950t = new sae(this, looper);
        this.f43945k = i;
        this.f43930A = sac;
        this.f43931B = sad;
        this.f43946l = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25292a(int i) {
        this.f43936b = i;
        this.f43937c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25293a(int i, int i2) {
        Handler handler = this.f43950t;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new sal(this, i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f43950t;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new sak(this, i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16781a(IInterface iInterface) {
        this.f43938d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16782a(ConnectionResult connectionResult) {
        this.f43939e = connectionResult.f30065c;
        this.f43940f = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo25294a(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        scn scn;
        synchronized (this.f43951u) {
            i = this.f43956z;
            iInterface = this.f43943i;
        }
        synchronized (this.f43952v) {
            scn = this.f43953w;
        }
        printWriter.append((CharSequence) str).append((CharSequence) "mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append((CharSequence) " mService=");
        if (iInterface == null) {
            printWriter.append((CharSequence) "null");
        } else {
            printWriter.append((CharSequence) mo6464b()).append((CharSequence) "@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append((CharSequence) " mServiceBroker=");
        if (scn == null) {
            printWriter.println("null");
        } else {
            printWriter.append((CharSequence) "IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(scn.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f43938d > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) "lastConnectedTime=");
            long j = this.f43938d;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f43937c > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) "lastSuspendedCause=");
            int i2 = this.f43936b;
            if (i2 == 1) {
                printWriter.append((CharSequence) "CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append((CharSequence) "CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append((CharSequence) " lastSuspendedTime=");
            long j2 = this.f43937c;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f43940f > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) "lastFailedStatus=").append((CharSequence) rjs.m33677c(this.f43939e));
            PrintWriter append3 = printWriter.append((CharSequence) " lastFailedTime=");
            long j3 = this.f43940f;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: a */
    public void mo16783a(rnh rnh) {
        rnh.mo24924a();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo25295a(saf saf) {
        synchronized (this.f43955y) {
            this.f43955y.add(saf);
        }
        Handler handler = this.f43950t;
        handler.sendMessage(handler.obtainMessage(2, this.f43935F.get(), -1, saf));
    }

    /* renamed from: a */
    public void mo25296a(sag sag) {
        sdo.checkIfNull(sag, "Connection progress callbacks cannot be null.");
        this.f43954x = sag;
        m34754a(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25297a(sag sag, int i, PendingIntent pendingIntent) {
        sdo.checkIfNull(sag, "Connection progress callbacks cannot be null.");
        this.f43954x = sag;
        Handler handler = this.f43950t;
        handler.sendMessage(handler.obtainMessage(3, this.f43935F.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public final void mo25298a(scb scb, Set set) {
        Bundle f = mo12238f();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f43945k);
        getServiceRequest.f30230d = this.f43948r.getPackageName();
        getServiceRequest.f30233g = f;
        if (set != null) {
            getServiceRequest.mo17823a(set);
        }
        if (mo12787g()) {
            getServiceRequest.f30234h = mo25309y() == null ? new Account("<<default account>>", "com.google") : mo25309y();
            if (scb != null) {
                getServiceRequest.f30231e = scb.asBinder();
            }
        } else if (mo16778H()) {
            getServiceRequest.f30234h = mo25309y();
        }
        getServiceRequest.f30235i = mo25310z();
        getServiceRequest.f30236j = mo6461I();
        try {
            synchronized (this.f43952v) {
                scn scn = this.f43953w;
                if (scn != null) {
                    sah sah = new sah(this, this.f43935F.get());
                    if (sbu.f44037a != null) {
                        boolean h = cdoz.f181455a.mo6606a().mo78115h();
                        getServiceRequest.f30238l = 1;
                        aabh aabh = new aabh(sah);
                        if (h) {
                            aabh.f27882a = sni.m35697a();
                        }
                        scn.mo25273a(aabh, getServiceRequest);
                    } else {
                        scn.mo25273a(sah, getServiceRequest);
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo25300b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo16780a(8, null, null, this.f43935F.get());
        }
    }

    /* renamed from: a */
    public final boolean mo25299a(int i, int i2, IInterface iInterface) {
        synchronized (this.f43951u) {
            if (this.f43956z != i) {
                return false;
            }
            m34754a(i2, iInterface);
            return true;
        }
    }
}
