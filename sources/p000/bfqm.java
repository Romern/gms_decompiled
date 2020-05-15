package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.util.PackageResetHelper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.fused.FusedLocationServiceHelper$1;
import com.google.android.location.fused.FusedLocationServiceHelper$AlarmListener;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqm implements ssn, aerd, spr {

    /* renamed from: a */
    public static final String[] f114869a = {"android:monitor_location", "android:monitor_location_high_power"};

    /* renamed from: b */
    public static final String[] f114870b = {"android:monitor_location"};

    /* renamed from: c */
    static final LocationAvailability f114871c = LocationAvailability.m66850a(1000, 1, 1, 0);

    /* renamed from: A */
    public final PackageResetHelper f114872A;

    /* renamed from: B */
    private final rfz f114873B;

    /* renamed from: C */
    private final sps f114874C;

    /* renamed from: D */
    private final bfrw f114875D;

    /* renamed from: E */
    private final Looper f114876E;

    /* renamed from: d */
    final bfrt f114877d;

    /* renamed from: e */
    public final bfrc f114878e;

    /* renamed from: f */
    public final Context f114879f;

    /* renamed from: g */
    public final ssh f114880g;

    /* renamed from: h */
    public final ArrayList f114881h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f114882i = new ArrayList();

    /* renamed from: j */
    public final bfqk f114883j;

    /* renamed from: k */
    public final aeri f114884k;

    /* renamed from: l */
    public final bfoy f114885l;

    /* renamed from: m */
    public final Handler f114886m;

    /* renamed from: n */
    final FusedLocationServiceHelper$AlarmListener f114887n;

    /* renamed from: o */
    public final spf f114888o;

    /* renamed from: p */
    public final bfpk f114889p;

    /* renamed from: q */
    public final ssq f114890q;

    /* renamed from: r */
    public final rsk f114891r;

    /* renamed from: s */
    public final bfro f114892s;

    /* renamed from: t */
    public final spx f114893t;

    /* renamed from: u */
    public final bfpj f114894u;

    /* renamed from: v */
    public final bhbx f114895v;

    /* renamed from: w */
    public volatile LocationAvailability f114896w = LocationAvailability.m66850a(1000, 1, 1, 0);

    /* renamed from: x */
    public volatile LocationAvailability f114897x = this.f114896w;

    /* renamed from: y */
    public boolean f114898y = false;

    /* renamed from: z */
    public boolean f114899z = false;

    public bfqm(Context context, spx spx, bfrw bfrw, rfz rfz, bhbx bhbx, sss sss, sps sps, bfoy bfoy, rsk rsk, spf spf, ssh ssh, Looper looper, bfuo bfuo) {
        bfrq bfrq;
        Context context2 = context;
        bfrw bfrw2 = bfrw;
        Looper looper2 = looper;
        this.f114879f = context2;
        this.f114893t = spx;
        this.f114884k = aeri.m52441e(context);
        this.f114895v = bhbx;
        this.f114875D = bfrw2;
        this.f114885l = bfoy;
        this.f114888o = spf;
        this.f114880g = ssh;
        this.f114876E = looper2;
        this.f114886m = new adzt(this.f114876E);
        this.f114887n = new FusedLocationServiceHelper$AlarmListener(this);
        this.f114894u = bfqt.m97591b();
        this.f114889p = new bfpk(new adzt(looper2), bfqt.m97590a(context));
        this.f114890q = new ssq();
        this.f114873B = rfz;
        Context context3 = this.f114879f;
        Looper a = this.f114889p.mo63548a();
        bfpa bfpa = new bfpa();
        bfqs bfqs = new bfqs(context3, a, this.f114894u, bfpa, bfuo);
        if (!ceyp.m138437b()) {
            bfrn bfrn = bfqs.f114921f;
            sdo.m34959a(context3);
            sdo.m34959a(context3);
            bfrq = new bfrq(bfqs, context3, a, new bfrh(new bfpc(new bhbf(new qws(context3, "LE", null))), bfpa, context3, bfrn, sps.m35913a(context3, new adzt(bfqt.m97589a())), new bfkp(context3)));
        } else {
            bfrn bfrn2 = bfqs.f114921f;
            rjx b = avtz.m79338b(context3);
            sdo.m34959a(context3);
            bfpc bfpc = new bfpc(new bhbf(new qws(context3, "LE", null)), b);
            bfqv bfqv = new bfqv(bfpc);
            sdo.m34959a(context3);
            bfrq = new bfrq(bfqs, context3, a, new bfrh(bfpc, bfpa, context3, bfrn2, sps.m35913a(context3, new adzt(bfqt.m97589a())), new bfkp(context3)), bfqv);
        }
        bfqj bfqj = new bfqj(this);
        bfov bfov = new bfov(bfrq, context3, a, this.f114894u);
        int i = Build.VERSION.SDK_INT;
        bfrt bfrt = new bfrt(new bfsr(new bfse(new bftc(new bfrr(context3, a, bfov), context3, a, this.f114894u), context3, this.f114889p.f118291c, this.f114894u), this.f114876E, bfqt.m97590a(context3)), bfrw2);
        bfrt.f115073b.mo62071a(bfqj);
        this.f114877d = bfrt;
        this.f114878e = bfrt.f115073b;
        this.f114891r = rsk;
        this.f114892s = new bfro(context2, looper2);
        this.f114872A = new PackageResetHelper(this.f114879f, this, true);
        this.f114874C = sps;
        this.f114883j = new bfqk(this, context2, this.f114889p.f118291c, sss);
        int i2 = Build.VERSION.SDK_INT;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_BACKGROUND");
        intentFilter.addAction("android.intent.action.USER_FOREGROUND");
        context2.registerReceiver(new FusedLocationServiceHelper$1(this, "location"), intentFilter, null, this.f114889p.f118291c);
        this.f114878e.mo62058a();
    }

    /* renamed from: a */
    public static PendingIntent m97523a(Bundle bundle) {
        return (PendingIntent) bundle.getParcelable("pi");
    }

    /* renamed from: b */
    public static final void m97529b(LocationRequestInternal locationRequestInternal, String str) {
        String str2 = locationRequestInternal.f79422d;
        if ((str2 == null || str2.isEmpty()) && "com.google.android.gms".equals(str)) {
            Log.e("GCoreFlp", "Location requests inside Google Play services must contain a tag to aid in debugging.  Use LocationRequestInternal.create to wrap your LocationRequest, and pass it to requestLocationUpdates.");
        }
    }

    /* renamed from: c */
    private static boolean m97531c(bfph bfph) {
        String str = bfph.f114766b;
        LocationRequestInternal locationRequestInternal = bfph.f114767c;
        if (!cesn.m138187b()) {
            return true;
        }
        if ("com.google.android.gms".equals(str)) {
            String str2 = locationRequestInternal.f79426h;
            if (locationRequestInternal.f79425g) {
                return bhbd.m100561a(cesn.f183405a.mo6606a().flpBackgroundWhitelistGcoreModules(), str2);
            }
        }
        return bhbd.m100561a(cesn.f183405a.mo6606a().flpBackgroundThrottleWhiteListApps(), str);
    }

    /* renamed from: a */
    static Bundle m97525a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("lr", locationRequest);
        bundle.putParcelable("pi", pendingIntent);
        return bundle;
    }

    /* renamed from: b */
    private final boolean m97530b(bfph bfph) {
        if (m97531c(bfph)) {
            return false;
        }
        LocationRequest locationRequest = bfph.f114767c.f79420b;
        boolean c = locationRequest.mo43555c();
        if (locationRequest.f79350b < bhbd.m100559a(c) || locationRequest.mo43550b() < bhbd.m100562b(c) || (this.f114884k.mo34487a("network") && locationRequest.f79349a == 100)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m97526a(int i, String str) {
        String[] a = svr.m36484b(this.f114879f).mo26175a(i);
        if (a == null) {
            return str;
        }
        int length = a.length;
        if (length == 1) {
            return a[0];
        }
        if (str == null) {
            return str;
        }
        for (String str2 : a) {
            if (str.equals(str2)) {
                return str;
            }
        }
        String arrays = Arrays.toString(a);
        StringBuilder sb = new StringBuilder(str.length() + 69 + String.valueOf(arrays).length());
        sb.append("Client passed in package name ");
        sb.append(str);
        sb.append(" which isn't in list of know packages: ");
        sb.append(arrays);
        Log.e("GCoreFlp", sb.toString());
        return null;
    }

    /* renamed from: b */
    public final void mo62143b() {
        this.f114874C.mo25944a();
        this.f114899z = false;
    }

    /* renamed from: b */
    public final boolean mo26048b(String str) {
        for (bfph bfph : this.f114883j.mo25994e()) {
            if (str.equals(bfph.f114766b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Collection mo62144c() {
        ArrayList arrayList = new ArrayList(this.f114883j.mo25992c().size());
        for (bfph bfph : this.f114883j.mo25992c()) {
            LocationRequestInternal locationRequestInternal = bfph.f114767c;
            if (!bfph.f114776l && m97530b(bfph)) {
                locationRequestInternal = LocationRequestInternal.m66890b(locationRequestInternal);
                LocationRequest locationRequest = locationRequestInternal.f79420b;
                if (this.f114884k.mo34487a("network") && locationRequest.f79349a == 100) {
                    locationRequest.mo43553c(102);
                }
                boolean c = locationRequest.mo43555c();
                long a = bhbd.m100559a(c);
                if (locationRequest.f79350b < a) {
                    locationRequest.mo43554c(a);
                }
                long b = bhbd.m100562b(c);
                if (locationRequest.mo43550b() < b) {
                    locationRequest.mo43556d(b);
                }
            }
            arrayList.add(locationRequestInternal);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m97527a(bfph bfph, PrintWriter printWriter) {
        String str;
        printWriter.print("  ");
        printWriter.print(bfph.f114767c);
        printWriter.print(" numDeliveries=");
        printWriter.print(bfph.f114773i);
        printWriter.print(" lastDelivery(ERT)=");
        long j = bfph.f114772h;
        StringBuilder sb = new StringBuilder(23);
        sb.append(j);
        sb.append("ms ");
        printWriter.print(sb.toString());
        if (!bfph.f114776l && cesn.m138187b()) {
            str = !m97531c(bfph) ? "background_throttled" : "background_exempt";
        } else {
            str = "foreground";
        }
        printWriter.println(str);
    }

    /* renamed from: a */
    public static final boolean m97528a(Location location) {
        if (location.getProvider() == null) {
            Log.e("GCoreFlp", "Location is incomplete because provider not set.");
            return false;
        } else if (!location.hasAccuracy()) {
            Log.e("GCoreFlp", "Location is incomplete because accuracy not set.");
            return false;
        } else if (location.getTime() != 0) {
            int i = Build.VERSION.SDK_INT;
            if (location.getElapsedRealtimeNanos() != 0) {
                return true;
            }
            Log.e("GCoreFlp", "Location is incomplete because elapsed realtime nanos not set.");
            return false;
        } else {
            Log.e("GCoreFlp", "Location is incomplete because time not set.");
            return false;
        }
    }

    /* renamed from: c */
    public final void mo62145c(String str) {
        bfrw bfrw = this.f114875D;
        int callingUid = Binder.getCallingUid();
        int i = Build.VERSION.SDK_INT;
        if (bfrw.f115080a.mo25962d("android:mock_location", callingUid, str) != 0) {
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 117);
            sb.append("In order to use mock mode functionality app ");
            sb.append(str);
            sb.append(" must be selected as the mock location application in developer settings.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public final Location mo62127a(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        if (!this.f114880g.mo26039a()) {
            return null;
        }
        Location a = this.f114892s.mo62187a(this.f114878e.mo62068a(!z), z2, z);
        int i2 = Build.VERSION.SDK_INT;
        String str3 = "android:coarse_location";
        if (this.f114893t.mo25963e(!z ? str3 : "android:fine_location", i, str) == 4 && a != null && SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(a.getElapsedRealtimeNanos()) > cfap.m138545b()) {
            a = null;
        }
        if (a == null) {
            return a;
        }
        String a2 = m97526a(i, str);
        int i3 = Build.VERSION.SDK_INT;
        if (!z3) {
            if (z) {
                str3 = "android:fine_location";
            }
            if (this.f114893t.mo25962d(str3, i, a2) != 0) {
                return null;
            }
        } else if (!mo62140a(i, a2, str2, z)) {
            return null;
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfqm.a(int, java.lang.String, java.lang.String, boolean, boolean, boolean):android.location.Location
     arg types: [int, java.lang.String, ?[OBJECT, ARRAY], boolean, int, int]
     candidates:
      bfqm.a(bfqm, int, java.lang.String, java.lang.String, boolean, boolean):android.location.Location
      bfqm.a(int, java.lang.String, java.lang.String, boolean, boolean, boolean):android.location.Location */
    /* renamed from: a */
    public final LocationAvailability mo62128a(int i, String str, boolean z) {
        if (this.f114893t.mo25962d("android:coarse_location", i, str) != 0 || mo62127a(i, str, (String) null, z, false, false) == null) {
            return f114871c;
        }
        return this.f114873B.mo24610b(str) ? this.f114896w : this.f114897x;
    }

    /* renamed from: a */
    public final void mo62129a() {
        this.f114874C.mo25945a(this);
        this.f114899z = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfrc.a(java.util.Collection, boolean):void
     arg types: [java.util.Collection, int]
     candidates:
      bfrc.a(android.location.Location, int):void
      bfrc.a(java.util.Collection, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0029  */
    /* renamed from: a */
    public final void mo25943a(int i, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        int i2 = i;
        boolean z4 = false;
        for (bfph bfph : this.f114883j.mo25992c()) {
            Iterator it = bfph.f114767c.f79421c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    if (i2 == -1000 || clientIdentity.f30221a == i2) {
                        str = clientIdentity.f30222b;
                    }
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                }
            }
            if (str != null) {
                if ((!z || bhbd.m100560a(str, bfph.f114767c)) && !mo62141a(bfph)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bfph.f114776l != z2) {
                    bfph.f114776l = z2;
                    if (m97530b(bfph)) {
                        String[] m = bfph.mo9760m();
                        if (z2 || !this.f114884k.mo34487a("network")) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bfph.f114777m = z3;
                        String[] m2 = bfph.mo9760m();
                        if (m != m2) {
                            bfqk bfqk = this.f114883j;
                            String[] a = squ.m36007a(bfph, bfqk.f45000f);
                            String[] a2 = squ.m36007a(bfph, m);
                            String[] a3 = squ.m36007a(bfph, m2);
                            for (String str2 : a2) {
                                if (squ.m36006a(a, str2) && !squ.m36006a(a3, str2)) {
                                    bfqk.mo25996w(str2);
                                    if (cdjz.m133769d()) {
                                        bfqk.f44999e.mo25954a(str2, bfph.mo9757j(), bfph.mo9758k(), bfph.mo9759l());
                                    } else {
                                        bfqk.f44999e.mo25959b(str2, bfph.mo9757j(), bfph.mo9758k());
                                    }
                                }
                            }
                            for (String str3 : a3) {
                                if (squ.m36006a(a, str3) && !squ.m36006a(a2, str3)) {
                                    bfqk.mo25996w(str3);
                                    if (cdjz.m133769d()) {
                                        bfqk.f44999e.mo25961c(str3, bfph.mo9757j(), bfph.mo9758k(), bfph.mo9759l());
                                    } else {
                                        bfqk.f44999e.mo25952a(str3, bfph.mo9757j(), bfph.mo9758k());
                                    }
                                }
                            }
                            bfqk.mo25995f();
                        }
                        this.f114894u.mo62097a(z2, bfph.f114767c.f79421c);
                        z4 = true;
                    }
                }
            }
        }
        if (z4) {
            this.f114878e.mo62059a(mo62144c(), false);
        }
    }

    /* renamed from: a */
    public final void mo62130a(aeht aeht) {
        this.f114889p.mo62099a(22, new bfpx(this, aeht));
    }

    /* renamed from: a */
    public final void mo62131a(aehw aehw) {
        if (aehw == null) {
            bftx.m97877a("Received null listener to remove uid:%s packages:%s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(svr.m36484b(this.f114879f).mo26175a(Binder.getCallingUid())));
            return;
        }
        this.f114889p.mo62099a(22, new bfqh(this, aehw));
    }

    /* renamed from: a */
    public final void mo62132a(aejv aejv, String str) {
        if (cevw.f183465a.mo6606a().sendCallbackOnRemoval() && aejv != null && ((long) new bhcl(this.f114879f).mo63552a(str)) >= cevw.f183465a.mo6606a().minSdkForRemovalCallback()) {
            try {
                aejv.mo34142a();
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo62133a(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            bftx.m97877a("Received null PendingIntent to remove uid:%s packages:%s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(svr.m36484b(this.f114879f).mo26175a(Binder.getCallingUid())));
            return;
        }
        this.f114889p.mo62099a(22, new bfpy(this, pendingIntent));
    }

    /* renamed from: a */
    public final void mo62134a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            bftx.m97877a("Received null PendingIntent to add uid:%s packages:%s request: %s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(svr.m36484b(this.f114879f).mo26175a(Binder.getCallingUid())), locationRequestInternal);
            return;
        }
        String targetPackage = pendingIntent.getTargetPackage();
        try {
            int i = svr.m36484b(this.f114879f).mo26172a(targetPackage, 0).uid;
            m97529b(locationRequestInternal, targetPackage);
            LocationRequestInternal b = LocationRequestInternal.m66890b(locationRequestInternal);
            List list = b.f79421c;
            if (list == null || list.isEmpty()) {
                b.mo43613a(Collections.singletonList(new ClientIdentity(i, targetPackage)));
            }
            this.f114889p.mo62099a(21, new bfpw(this, b, pendingIntent, z, i, targetPackage, this.f114873B.mo24610b(pendingIntent.getTargetPackage())));
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Package not found: \n");
            sb.append(valueOf);
            bftx.m97877a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo62135a(PrintWriter printWriter, String str) {
        bfqc bfqc;
        printWriter.println("Location Request History By Package:");
        if (str != null) {
            bfqc = new bfqc(str);
        } else {
            bfqc = null;
        }
        printWriter.println(this.f114890q.mo26055a(bfqc));
    }

    /* renamed from: a */
    public final void mo62136a(Object obj) {
        if (obj == null) {
            bftx.m97877a("Received null listener to remove", new Object[0]);
        } else {
            this.f114883j.mo62123c(obj);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfpj.a(boolean, java.util.List):void
     arg types: [int, java.util.List]
     candidates:
      sri.a(int, int):void
      bfpj.a(boolean, java.util.List):void */
    /* renamed from: a */
    public final void mo62137a(Object obj, bfph bfph) {
        LocationRequest locationRequest = bfph.f114767c.f79420b;
        if (locationRequest.f79349a != 100 && locationRequest.f79350b < cezi.m138471b()) {
            locationRequest.mo43554c(cezi.m138471b());
        }
        if (locationRequest.f79349a != 105) {
            double locationRequestFastestIntervalFactor = ceym.f183512a.mo6606a().locationRequestFastestIntervalFactor();
            if (locationRequestFastestIntervalFactor > 0.0d && (!ceym.f183512a.mo6606a().disableFastestIntervalFactorWhenFastestIntervalExplicitlySet() || !locationRequest.f79352d)) {
                double d = (double) locationRequest.f79350b;
                double max = Math.max(2.0d, locationRequestFastestIntervalFactor);
                Double.isNaN(d);
                locationRequest.mo43552b((long) Math.max((double) locationRequest.f79351c, d / max));
            }
        } else {
            locationRequest.mo43552b(Math.max(locationRequest.f79351c, ceym.f183512a.mo6606a().noPowerMinFastestIntervalMillis()));
        }
        if (!bfph.f114768d) {
            if (locationRequest.f79350b < 600000) {
                locationRequest.mo43554c(600000L);
            }
            if (locationRequest.f79351c < 600000) {
                locationRequest.mo43552b(600000L);
            }
        }
        if (cesn.m138187b()) {
            boolean a = mo62141a(bfph);
            bfph.f114776l = a;
            if (!a && m97530b(bfph)) {
                bfph.f114777m = !this.f114884k.mo34487a("network");
                this.f114894u.mo62097a(false, bfph.f114767c.f79421c);
            }
        }
        bfph bfph2 = (bfph) this.f114883j.mo25985a(obj, bfph);
        if (bfph2 != null) {
            bfph.f114775k = bfph2.f114775k;
        }
    }

    /* renamed from: a */
    public final void mo26047a(String str) {
        for (bfph bfph : this.f114883j.mo25994e()) {
            if (str.equals(bfph.f114766b)) {
                bfph.mo62093c();
            }
        }
    }

    /* renamed from: a */
    public final void mo34473a(String str, boolean z) {
        int i;
        int i2;
        String[] strArr;
        if ("gps".equals(str)) {
            bfpj bfpj = this.f114894u;
            if (!z) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            bfpj.mo26009a(i2);
            bfqk bfqk = this.f114883j;
            if (!z) {
                strArr = f114870b;
            } else {
                strArr = f114869a;
            }
            bfqk.mo25988a(strArr);
        }
        if ("network".equals(str)) {
            bfpj bfpj2 = this.f114894u;
            if (!z) {
                i = 5;
            } else {
                i = 4;
            }
            bfpj2.mo26009a(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (p000.aeim.m51906j(r9) == 3) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0102, code lost:
        if (r9.getAccuracy() > ((float) p000.cewa.f183469a.mo80288b().maxNetworkLocationAccuracy())) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0136 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo62138a(List list, bfph bfph) {
        boolean z;
        boolean z2;
        boolean z3;
        List list2;
        Iterator it;
        List list3 = list;
        bfph bfph2 = bfph;
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            LocationRequestInternal locationRequestInternal = bfph2.f114767c;
            if (locationRequestInternal.f79423e || mo62140a(bfph2.f114765a, bfph2.f114766b, locationRequestInternal.f79429k, bfph2.f114768d)) {
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.clear();
                if (list3 == null || list.isEmpty()) {
                    z = false;
                } else {
                    LocationRequest locationRequest = bfph2.f114767c.f79420b;
                    if (list.size() > 1) {
                        if (locationRequest.mo43550b() <= locationRequest.f79350b) {
                            list2 = Collections.singletonList((Location) list3.get(list.size() - 1));
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                Location location = (Location) it.next();
                                long millis = TimeUnit.NANOSECONDS.toMillis(bfoy.m97457a(location));
                                LocationRequest locationRequest2 = bfph2.f114767c.f79420b;
                                if (millis >= locationRequest2.f79353e) {
                                    z = true;
                                    break;
                                }
                                if (bfph2.f114773i >= locationRequest2.f79354f) {
                                    z = true;
                                    break;
                                }
                                long millis2 = TimeUnit.NANOSECONDS.toMillis(bfoy.m97457a(location));
                                if (millis2 >= bfph2.f114775k || aeim.m51907k(location)) {
                                    LocationRequest locationRequest3 = bfph2.f114767c.f79420b;
                                    long j = millis2 - bfph2.f114772h;
                                    if (bfph2.f114773i <= 0 || j >= locationRequest3.f79351c) {
                                        if (cewa.f183469a.mo6606a().enabled() && bfph2.f114767c.f79428j && bfph2.f114773i == 0) {
                                            bfra bfra = bfph2.f114771g;
                                            if (locationRequest3.f79349a == 100) {
                                                if (SystemClock.elapsedRealtime() < bfra.f114966a) {
                                                    if (aeim.m51906j(location) != 2) {
                                                    }
                                                }
                                            }
                                        }
                                        float f = locationRequest3.f79355g;
                                        Location location2 = bfph2.f114774j;
                                        if (location2 == null || location2.distanceTo(location) >= f) {
                                            if (f > 0.0f) {
                                                bfph2.f114774j = new Location(location);
                                            }
                                            bfph2.f114772h = millis2;
                                            bfph2.f114773i++;
                                            arrayList.add(location);
                                        }
                                    }
                                }
                            }
                        } else {
                            int i2 = Build.VERSION.SDK_INT;
                        }
                    }
                    list2 = list3;
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                }
                int i3 = bfph2.f114767c.f79420b.f79354f;
                if (z || bfph2.f114773i < i3) {
                    z2 = z;
                } else {
                    z2 = true;
                }
                if (!arrayList.isEmpty()) {
                    int a = bfph2.mo62085a(arrayList);
                    if (bfph2.mo62091a(a)) {
                        z2 = true;
                    }
                    if (a == 1) {
                        z3 = true;
                        if (z2) {
                            bfph2.f114779o.mo62083a();
                        }
                        if (!z3) {
                            int i4 = Build.VERSION.SDK_INT;
                            bfpj bfpj = this.f114894u;
                            List list4 = bfph2.f114767c.f79421c;
                            int j2 = aeim.m51906j((Location) list3.get(list.size() - 1));
                            bfpj.mo26010a(j2 != 1 ? j2 != 2 ? j2 != 3 ? 15 : 13 : 14 : 12, bfpj.f114791k.mo62094a(list4));
                            return;
                        }
                        return;
                    }
                }
                z3 = false;
                if (z2) {
                }
                if (!z3) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62139a(boolean z) {
        this.f114889p.mo62099a(23, new bfqi(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62140a(int i, String str, String str2, boolean z) {
        return this.f114893t.mo25958b(!z ? "android:coarse_location" : "android:fine_location", i, str, str2) == 0;
    }

    /* renamed from: a */
    public final boolean mo62141a(bfph bfph) {
        LocationRequestInternal locationRequestInternal = bfph.f114767c;
        for (ClientIdentity clientIdentity : locationRequestInternal.f79421c) {
            LocationRequest locationRequest = locationRequestInternal.f79420b;
            int i = Build.VERSION.SDK_INT;
            if (!bhbd.m100560a(clientIdentity.f30222b, locationRequestInternal) && this.f114874C.mo25946a(clientIdentity.f30221a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo62142a(LocationRequestInternal locationRequestInternal, String str) {
        int callingUid = Binder.getCallingUid();
        String a = m97526a(callingUid, str);
        List list = locationRequestInternal.f79421c;
        if (list == null || list.isEmpty()) {
            locationRequestInternal.mo43613a(Collections.singletonList(new ClientIdentity(callingUid, a)));
        }
        if (a != null) {
            return this.f114873B.mo24610b(a);
        }
        return false;
    }
}
