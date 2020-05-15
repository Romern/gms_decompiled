package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bgar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgar extends aeka {

    /* renamed from: a */
    private static final List f115927a = Arrays.asList("com.google.android.googlequicksearchbox", "com.google.android.apps.maps", "com.google.android.apps.gmm", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.dogfood", "com.android.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.google.android.gms.common.uxtester");

    /* renamed from: b */
    private final bgaq f115928b;

    /* renamed from: c */
    private final String f115929c;

    public bgar(bgaq bgaq, String str) {
        this.f115928b = bgaq;
        this.f115929c = str;
    }

    /* renamed from: a */
    public final Location mo34206a() {
        return mo34235b((String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfqm.a(int, java.lang.String, java.lang.String, boolean, boolean, boolean):android.location.Location
     arg types: [int, java.lang.String, java.lang.String, boolean, boolean, int]
     candidates:
      bfqm.a(bfqm, int, java.lang.String, java.lang.String, boolean, boolean):android.location.Location
      bfqm.a(int, java.lang.String, java.lang.String, boolean, boolean, boolean):android.location.Location */
    /* renamed from: b */
    public final Location mo34235b(String str) {
        bgaq bgaq = this.f115928b;
        String str2 = this.f115929c;
        bgaq.mo62557a(1);
        return bgaq.f115915b.mo62127a(Binder.getCallingUid(), str2, str, bgaq.mo62567b(), bgaq.mo62569d(), true);
    }

    /* renamed from: c */
    public final int mo34238c() {
        return this.f115928b.mo62568c();
    }

    @Deprecated
    /* renamed from: d */
    public final Location mo34242d() {
        return mo34206a();
    }

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
    /* renamed from: e */
    public final void mo34244e(PendingIntent pendingIntent, rnt rnt) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        if (!cfam.m138532b()) {
            bero.m95591a(bgaq.f115914a, str);
        }
        if (bgaq.mo62569d()) {
            bgaq.mo62560a(pendingIntent, str);
            bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
            if (bxbi.f161815a.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_TAG")) {
                bxbi.m122522b();
            }
            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", pendingIntent);
            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REMOVE", true);
            bxbi.mo73549a(bgaq.f115914a);
            if (rnt != null) {
                try {
                    rnt.mo11797a(Status.f30107a);
                } catch (RemoteException e) {
                }
            }
        } else {
            throw new SecurityException("This API is not supported yet.");
        }
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo34207a(String str) {
        ActivityRecognitionResult activityRecognitionResult;
        bgaq bgaq = this.f115928b;
        bero.m95591a(bgaq.f115914a, str);
        bgaq.mo62569d();
        bern bern = bgaq.f115918e;
        if (bern.f112223a.mo26039a()) {
            activityRecognitionResult = bern.f112224b;
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult == null || !cesb.m138150f() || bero.m95595b(bgaq.f115914a, Binder.getCallingUid(), str)) {
            return activityRecognitionResult;
        }
        return null;
    }

    /* renamed from: c */
    public final LocationAvailability mo34239c(String str) {
        boolean z;
        bgaq bgaq = this.f115928b;
        if (bhcd.m100623a(bgaq.f115914a) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bgaq.mo62557a(1);
        }
        return bgaq.f115915b.mo62128a(Binder.getCallingUid(), str, z);
    }

    /* renamed from: d */
    public final void mo34243d(PendingIntent pendingIntent, rnt rnt) {
        rnt.mo11797a(this.f115928b.mo62556a(pendingIntent, this.f115929c, SleepSegmentRequest.m66874a()));
    }

    @Deprecated
    /* renamed from: b */
    public final void mo34236b(PendingIntent pendingIntent) {
        this.f115928b.mo62559a(pendingIntent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (((long) r4) >= p000.cerp.f183389a.mo6606a().floorChangeBaroFifoRequired()) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073 A[SYNTHETIC, Splitter:B:18:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad A[Catch:{ RemoteException -> 0x00b3 }] */
    /* renamed from: b */
    public final void mo34237b(PendingIntent pendingIntent, rnt rnt) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        bero.m95591a(bgaq.f115914a, str);
        if (bgaq.mo62569d()) {
            bgaq.mo62560a(pendingIntent, str);
            WorkSource a = stx.m36334a(Binder.getCallingUid(), pendingIntent.getTargetPackage());
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                int h = stu.m36322h();
                Context context = bgaq.f115914a;
                boolean z = false;
                if (!cerp.m138131c()) {
                    if (cerp.m138130b() && h != 10) {
                        int i = Build.VERSION.SDK_INT;
                        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                        int a2 = berl.m95587a(sensorManager, 1);
                        int a3 = berl.m95587a(sensorManager, 6);
                        if (((long) a2) >= cerp.f183389a.mo6606a().floorChangeAccelFifoRequired()) {
                        }
                    }
                    if (!z) {
                        try {
                            bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
                            if (bxbi.f161815a.hasExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_REMOVE")) {
                                bxbi.m122521a();
                            }
                            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", pendingIntent);
                            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_TAG", "GLMSImplProxy");
                            bxbi.mo73554a(true);
                            bxbi.mo73552a(a);
                            bxbi.mo73549a(bgaq.f115914a);
                            rnt.mo11797a(Status.f30107a);
                            return;
                        } catch (RemoteException e) {
                            return;
                        }
                    } else {
                        rnt.mo11797a(Status.f30111e);
                        return;
                    }
                }
                z = true;
                if (!z) {
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } else {
            throw new SecurityException("This API is not supported yet.");
        }
    }

    /* renamed from: c */
    public final void mo34240c(PendingIntent pendingIntent) {
        bgaq bgaq = this.f115928b;
        if (!bgaq.mo62567b()) {
            throw new SecurityException("WifiScans usage requires the android.permission.ACCESS_FINE_LOCATION permission");
        } else if (bgaq.mo62570e()) {
            bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
            bxbi.mo73554a(bgaq.mo62569d());
            bxbi.mo73557c(pendingIntent);
            bxbi.mo73549a(bgaq.f115914a);
        } else {
            throw new AssertionError("API should be hidden outside GmsCore");
        }
    }

    /* renamed from: a */
    public final void mo34208a(long j, boolean z, PendingIntent pendingIntent) {
        bgaq bgaq = this.f115928b;
        bero.m95591a(bgaq.f115914a, pendingIntent.getTargetPackage());
        boolean d = bgaq.mo62569d();
        WorkSource a = stx.m36334a(Binder.getCallingUid(), pendingIntent.getTargetPackage());
        aefy aefy = new aefy();
        aefy.mo34115a(j);
        aefy.f63346c = z;
        aefy.f63348e = "GLMSImplProxy";
        aefy.f63347d = a;
        bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
        bxbi.mo73553a(aefy.mo34113a(), pendingIntent);
        bxbi.mo73554a(d);
        bxbi.mo73552a(a);
        bxbi.mo73549a(bgaq.f115914a);
    }

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
    /* renamed from: c */
    public final void mo34241c(PendingIntent pendingIntent, rnt rnt) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        bero.m95591a(bgaq.f115914a, str);
        if (bgaq.mo62569d()) {
            bgaq.mo62560a(pendingIntent, str);
            bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
            if (bxbi.f161815a.hasExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_TAG")) {
                bxbi.m122521a();
            }
            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", pendingIntent);
            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_REMOVE", true);
            bxbi.mo73549a(bgaq.f115914a);
            if (rnt != null) {
                try {
                    rnt.mo11797a(Status.f30107a);
                } catch (RemoteException e) {
                }
            }
        } else {
            throw new SecurityException("This API is not supported yet.");
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34209a(aehw aehw) {
        this.f115928b.mo62558a(aehw);
    }

    /* renamed from: a */
    public final void mo34210a(aejv aejv) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        bgaq.mo62557a(1);
        bfqm bfqm = bgaq.f115915b;
        bfqm.f114889p.mo63549a(new bfqa(bfqm, new ClientIdentity(Binder.getCallingUid(), str), aejv));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    @Deprecated
    /* renamed from: a */
    public final void mo34211a(aejy aejy) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        try {
            bfyw bfyw = bgaq.f115917d;
            bgad bgad = new bgad(aejy);
            sdo.checkIfNull((Object) str, (Object) "Package name not specified.");
            bfyw.f115741a.mo62511a(bgae.m98381a(str, bgad));
        } catch (RuntimeException e) {
            Log.e("GLMSImpl", "original removeAllGeofences() exception (before parcelling)", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo34212a(PendingIntent pendingIntent) {
        bgaq bgaq = this.f115928b;
        bero.m95591a(bgaq.f115914a, pendingIntent.getTargetPackage());
        bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
        bxbi.mo73555b(pendingIntent);
        bxbi.mo73549a(bgaq.f115914a);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34213a(PendingIntent pendingIntent, aejy aejy, String str) {
        mo34225a(RemoveGeofencingRequest.m66873a(pendingIntent), aejy);
    }

    /* renamed from: a */
    public final void mo34214a(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, rnt rnt) {
        rnt.mo11797a(this.f115928b.mo62556a(pendingIntent, this.f115929c, sleepSegmentRequest));
    }

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
    /* renamed from: a */
    public final void mo34215a(PendingIntent pendingIntent, rnt rnt) {
        bgaq bgaq = this.f115928b;
        bero.m95591a(bgaq.f115914a, pendingIntent.getTargetPackage());
        try {
            bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
            if (bxbi.f161815a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT")) {
                bxbi.m122523c();
            }
            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", pendingIntent);
            bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REMOVE", true);
            bxbi.mo73549a(bgaq.f115914a);
            rnt.mo11797a(Status.f30107a);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo34216a(Location location) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        bfqm bfqm = bgaq.f115915b;
        bfqm.mo62145c(str);
        if (bfqm.m97528a(location)) {
            bfqm.f114889p.mo62099a(24, new bfpz(bfqm, location));
        }
    }

    /* renamed from: a */
    public final void mo34217a(Location location, int i) {
        bgaq bgaq = this.f115928b;
        bgaq.mo62557a(2);
        if (bgaq.mo62569d()) {
            bfqm bfqm = bgaq.f115915b;
            if (!bfqm.m97528a(location)) {
                String valueOf = String.valueOf(location);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Injected location object missing required fields: ");
                sb.append(valueOf);
                Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
                return;
            }
            bfqm.f114878e.mo62069a(location, i);
            return;
        }
        throw new SecurityException("Client must be signed by Google to use injection API");
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
    /* renamed from: a */
    public final void mo34218a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, rnt rnt) {
        boolean z;
        boolean z2;
        boolean z3;
        ActivityRecognitionRequest activityRecognitionRequest2 = activityRecognitionRequest;
        bgaq bgaq = this.f115928b;
        bero.m95591a(bgaq.f115914a, pendingIntent.getTargetPackage());
        boolean d = bgaq.mo62569d();
        boolean e = bgaq.mo62570e();
        WorkSource workSource = activityRecognitionRequest2.f79294c;
        long j = activityRecognitionRequest2.f79292a;
        boolean z4 = activityRecognitionRequest2.f79293b;
        String str = activityRecognitionRequest2.f79295d;
        int[] iArr = activityRecognitionRequest2.f79296e;
        boolean z5 = activityRecognitionRequest2.f79297f;
        String str2 = activityRecognitionRequest2.f79298g;
        boolean z6 = true;
        if (!e) {
            if (!d) {
                if (iArr == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sdo.m34971a(z3, (Object) "Illegal setting of nondefaultActivities");
            }
            if (workSource == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "Illegal setting of workSource");
            sdo.m34971a(z4, (Object) "Illegal setting of triggerUpdate");
            if (str == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34971a(z2, (Object) "Illegal setting of tag");
            sdo.m34971a(!z5, (Object) "Illegal setting of requestSensorData");
            if (str2 != null) {
                z6 = false;
            }
            sdo.m34971a(z6, (Object) "Illegal setting of accountName");
            str = "GLMSImplProxy";
        } else {
            if (str == null) {
                z6 = false;
            }
            sdo.m34971a(z6, (Object) "Tag is required for zero party clients.");
        }
        if (workSource == null) {
            workSource = stx.m36334a(Binder.getCallingUid(), pendingIntent.getTargetPackage());
        }
        aefy aefy = new aefy();
        aefy.mo34115a(j);
        aefy.mo34116b(activityRecognitionRequest2.f79299h);
        aefy.f63346c = z4;
        aefy.f63347d = workSource;
        aefy.f63348e = str;
        aefy.f63349f = z5;
        aefy.f63350g = str2;
        if (iArr != null) {
            for (int i : iArr) {
                aefy.mo34114a(i);
            }
        }
        bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
        bxbi.mo73553a(aefy.mo34113a(), pendingIntent);
        bxbi.mo73554a(d);
        bxbi.mo73549a(bgaq.f115914a);
        try {
            rnt.mo11797a(Status.f30107a);
        } catch (RemoteException e2) {
        }
    }

    /* renamed from: a */
    public final void mo34219a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, rnt rnt) {
        bgaq bgaq = this.f115928b;
        bero.m95591a(bgaq.f115914a, pendingIntent.getTargetPackage());
        for (ActivityTransition activityTransition : activityTransitionRequest.f79311b) {
            int i = activityTransition.f79305a;
            int i2 = 0;
            if (!bgaq.mo62570e() && !bgaq.mo62569d()) {
                int[] iArr = bgaq.f115912l;
                int length = iArr.length;
                while (i2 < length) {
                    if (i != iArr[i2]) {
                        i2++;
                    }
                }
            } else {
                int[] iArr2 = bgaq.f115913m;
                int length2 = iArr2.length;
                while (i2 < length2) {
                    if (i != iArr2[i2]) {
                        i2++;
                    }
                }
            }
            throw new SecurityException("ActivityTransitionRequest specified an unsupported transition activity type.");
        }
        bxbi bxbi = new bxbi(bgaq.f115914a.getPackageName());
        IBinder asBinder = rnt.asBinder();
        if (bxbi.f161815a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REMOVE")) {
            bxbi.m122523c();
        }
        bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", pendingIntent);
        Bundle bundle = new Bundle();
        C1004fv.m12455a(bundle, "com.google.android.location.internal.EXTRA_API_CALLBACK", asBinder);
        bxbi.f161815a.putExtras(bundle);
        sef.m35071a(activityTransitionRequest, bxbi.f161815a, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
        bxbi.mo73554a(bgaq.mo62569d());
        bxbi.mo73549a(bgaq.f115914a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    public final void mo34220a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, aejy aejy) {
        List list;
        if (!this.f115929c.equals("com.google.android.gms")) {
            geofencingRequest = new GeofencingRequest(geofencingRequest.f79341a, geofencingRequest.f79342b, "");
        }
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        try {
            bgaq.mo62560a(pendingIntent, str);
            if (bhcd.m100623a(bgaq.f115914a) >= 2) {
                int i = Build.VERSION.SDK_INT;
                r4 = false;
                r4 = false;
                boolean z = false;
                if (bgaq.f115923j.mo25963e("android:monitor_location", Binder.getCallingUid(), str) != 4) {
                    bfyw bfyw = bgaq.f115917d;
                    bgad bgad = new bgad(aejy);
                    if (!(geofencingRequest == null || (list = geofencingRequest.f79341a) == null || list.size() <= 0)) {
                        z = true;
                    }
                    sdo.m34975b(z, "Invalid GeofencingRequest request.");
                    sdo.checkIfNull(pendingIntent, "PendingIntent not specified.");
                    sdo.checkIfNull((Object) str, (Object) "Package name not specified.");
                    bfzt bfzt = bfyw.f115741a;
                    synchronized (bfzt.f115806k) {
                        if (Log.isLoggable("GeofencerStateMachine", 4)) {
                            String valueOf = String.valueOf(bhcb.m100621a(pendingIntent));
                            bfxc.m98132a("GeofencerStateMachine", valueOf.length() == 0 ? new String("addGeofences called by ") : "addGeofences called by ".concat(valueOf));
                        }
                        bfyl bfyl = new bfyl(geofencingRequest, pendingIntent, bgad);
                        if (!bfzt.f115816u) {
                            boolean z2 = bfxc.f115575a;
                            bfzt.f115818w.add(bfyl);
                        } else {
                            bfyl.mo62448a((bgan) bfzt);
                        }
                    }
                    return;
                }
                int size = geofencingRequest.mo43541a().size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = ((ParcelableGeofence) geofencingRequest.mo43541a().get(i2)).f79438a;
                }
                aejy.mo34204a(1004, strArr);
                if (Log.isLoggable("GLMSImpl", 5)) {
                    Log.w("GLMSImpl", String.valueOf(str).concat(" doesn't have sufficient location permission to request geofence."));
                    return;
                }
                return;
            }
            throw new SecurityException("Geofence usage requires ACCESS_FINE_LOCATION permission");
        } catch (RuntimeException e) {
            Log.e("GLMSImpl", "original addGeofence() exception (before parcelling)", e);
            throw e;
        } catch (RemoteException e2) {
            Log.e("GLMSImpl", "remote exception when sending callback", e2);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34221a(LocationRequest locationRequest, aehw aehw) {
        this.f115928b.mo62562a(locationRequest, aehw, this.f115929c);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34222a(LocationRequest locationRequest, aehw aehw, String str) {
        this.f115928b.mo62562a(locationRequest, aehw, str);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34223a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f115928b.mo62565a(LocationRequestInternal.m66889a(null, locationRequest), pendingIntent);
    }

    /* renamed from: a */
    public final void mo34224a(LocationSettingsRequest locationSettingsRequest, aeke aeke, String str) {
        if (str == null) {
            str = this.f115929c;
        } else if (!this.f115929c.equals("com.google.android.gms")) {
            throw new SecurityException("This API can only be called by GmsCore.");
        }
        if (locationSettingsRequest.f79364c != null && !f115927a.contains(str)) {
            locationSettingsRequest.mo43568b();
        }
        bgaq bgaq = this.f115928b;
        int h = stu.m36322h();
        if (h == 8 || h == 10 || h == 13) {
            Log.w("GLMSImpl", "Not implemented on this platform.");
            try {
                aeke.mo34245a(new LocationSettingsResult(new Status(10, "Not implemented on this platform.")));
            } catch (RemoteException e) {
            }
        } else {
            if (locationSettingsRequest.f79364c != null && !bgaq.mo62569d()) {
                locationSettingsRequest.mo43568b();
            }
            bgbc a = bgaq.mo62555a();
            a.f115970c.execute(new bgbb(a, str, locationSettingsRequest, aeke));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[Catch:{ RuntimeException -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ RuntimeException -> 0x0070 }] */
    /* renamed from: a */
    public final void mo34225a(RemoveGeofencingRequest removeGeofencingRequest, aejy aejy) {
        PendingIntent pendingIntent;
        bgae bgae;
        String str;
        if (!this.f115929c.equals("com.google.android.gms") && (str = removeGeofencingRequest.f79380c) != null && !str.isEmpty()) {
            removeGeofencingRequest = new RemoveGeofencingRequest(removeGeofencingRequest.f79378a, removeGeofencingRequest.f79379b, "");
        }
        bgaq bgaq = this.f115928b;
        String str2 = this.f115929c;
        try {
            PendingIntent pendingIntent2 = removeGeofencingRequest.f79379b;
            if (pendingIntent2 != null) {
                bgaq.mo62560a(pendingIntent2, str2);
            }
            bfyw bfyw = bgaq.f115917d;
            bgad bgad = new bgad(aejy);
            boolean z = true;
            if (removeGeofencingRequest != null) {
                List list = removeGeofencingRequest.f79378a;
                if (list != null) {
                    if (list.size() > 0) {
                        sdo.m34975b(z, "Invalid GeofencingRequest request.");
                        sdo.checkIfNull((Object) str2, (Object) "Package name not specified.");
                        pendingIntent = removeGeofencingRequest.f79379b;
                        if (pendingIntent == null) {
                            bgae = new bgae(2, str2, bgad, removeGeofencingRequest);
                        } else {
                            bgae = new bgae(3, bhcb.m100621a(pendingIntent), bgad, removeGeofencingRequest);
                        }
                        bfyw.f115741a.mo62511a(bgae);
                    }
                }
                if (removeGeofencingRequest.f79379b != null) {
                    sdo.m34975b(z, "Invalid GeofencingRequest request.");
                    sdo.checkIfNull((Object) str2, (Object) "Package name not specified.");
                    pendingIntent = removeGeofencingRequest.f79379b;
                    if (pendingIntent == null) {
                    }
                    bfyw.f115741a.mo62511a(bgae);
                }
            }
            z = false;
            sdo.m34975b(z, "Invalid GeofencingRequest request.");
            sdo.checkIfNull((Object) str2, (Object) "Package name not specified.");
            pendingIntent = removeGeofencingRequest.f79379b;
            if (pendingIntent == null) {
            }
            bfyw.f115741a.mo62511a(bgae);
        } catch (RuntimeException e) {
            Log.e("GLMSImpl", "original removeGeofence() exception (before parcelling)", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01aa  */
    /* renamed from: a */
    public final void mo34226a(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
        Status status;
        String str;
        bfox bfox;
        ClientIdentity clientIdentity;
        int i;
        ClientIdentity clientIdentity2;
        DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData2 = deviceOrientationRequestUpdateData;
        bgaq bgaq = this.f115928b;
        String str2 = this.f115929c;
        int i2 = deviceOrientationRequestUpdateData2.f79413a;
        boolean z = true;
        if (i2 == 1) {
            DeviceOrientationRequestInternal deviceOrientationRequestInternal = deviceOrientationRequestUpdateData2.f79414b;
            aehq aehq = deviceOrientationRequestUpdateData2.f79415c;
            if (aehq != null) {
                bfuh bfuh = bgaq.f115916c;
                DeviceOrientationRequestInternal deviceOrientationRequestInternal2 = new DeviceOrientationRequestInternal(deviceOrientationRequestInternal.f79410c, new ArrayList(deviceOrientationRequestInternal.f79411d), deviceOrientationRequestInternal.f79412e);
                Context context = bfuh.f115326b;
                int callingUid = Binder.getCallingUid();
                String str3 = null;
                if (str2 != null && !str.m36311a(context, callingUid, str2)) {
                    StringBuilder sb = new StringBuilder(str2.length() + 115);
                    sb.append("Device Orientation client packageName:");
                    sb.append(str2);
                    sb.append(" does not belong to the calling uid:");
                    sb.append(callingUid);
                    sb.append(". Setting package name as null");
                    Log.e("GCoreFlp", sb.toString());
                    if (cewg.m138344b()) {
                        str = null;
                        if (cewg.m138344b()) {
                            str3 = str;
                        }
                        List list = deviceOrientationRequestInternal2.f79411d;
                        if (list == null || list.isEmpty()) {
                            List singletonList = Collections.singletonList(new ClientIdentity(callingUid, str3));
                            sdo.m34959a(singletonList);
                            deviceOrientationRequestInternal2.f79411d = singletonList;
                        }
                        bfuh.f115328d.mo62099a(30, new bfue(bfuh, Binder.getCallingUid(), str2, deviceOrientationRequestInternal2, bfuh, aehq));
                        bfox = bfuh.f115331g;
                        if (bfox.mo62073a() && Math.random() < cewg.f183473a.mo6606a().fopRequestLogSamplingRate()) {
                            clientIdentity = (ClientIdentity) deviceOrientationRequestInternal2.f79411d.get(0);
                            if (!bfox.f114736d.containsKey(clientIdentity.f30222b)) {
                                Map map = bfox.f114736d;
                                String str4 = clientIdentity.f30222b;
                                bxvd da = bpla.f138048d.mo74144da();
                                List list2 = deviceOrientationRequestInternal2.f79411d;
                                if (!(list2 == null || list2.isEmpty() || (clientIdentity2 = (ClientIdentity) list2.get(0)) == null)) {
                                    bxvd da2 = bpkf.f137938j.mo74144da();
                                    String str5 = clientIdentity2.f30222b;
                                    if (str5 != null) {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bpkf bpkf = (bpkf) da2.f164949b;
                                        str5.getClass();
                                        bpkf.f137940a |= 1;
                                        bpkf.f137941b = str5;
                                    }
                                    bpkf bpkf2 = (bpkf) da2.mo74062i();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bpla bpla = (bpla) da.f164949b;
                                    bpkf2.getClass();
                                    bpla.f138051b = bpkf2;
                                    bpla.f138050a |= 4;
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpla bpla2 = (bpla) da.f164949b;
                                bpla2.f138050a |= 8;
                                bpla2.f138052c = 0;
                                bpla bpla3 = (bpla) da.mo74062i();
                                bxvd bxvd = (bxvd) bpla3.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) bpla3);
                                map.put(str4, bxvd);
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (!bfox.f114735c.containsKey(clientIdentity.f30222b)) {
                                Pair pair = (Pair) bfox.f114735c.get(clientIdentity.f30222b);
                                i = ((Integer) pair.first).intValue() + 1;
                                elapsedRealtime = ((Long) pair.second).longValue();
                            } else {
                                i = 1;
                            }
                            bfox.f114735c.put(clientIdentity.f30222b, Pair.create(Integer.valueOf(i), Long.valueOf(elapsedRealtime)));
                        }
                    }
                }
                str = str2;
                if (cewg.m138344b()) {
                }
                List list3 = deviceOrientationRequestInternal2.f79411d;
                List singletonList2 = Collections.singletonList(new ClientIdentity(callingUid, str3));
                sdo.m34959a(singletonList2);
                deviceOrientationRequestInternal2.f79411d = singletonList2;
                bfuh.f115328d.mo62099a(30, new bfue(bfuh, Binder.getCallingUid(), str2, deviceOrientationRequestInternal2, bfuh, aehq));
                bfox = bfuh.f115331g;
                clientIdentity = (ClientIdentity) deviceOrientationRequestInternal2.f79411d.get(0);
                if (!bfox.f114736d.containsKey(clientIdentity.f30222b)) {
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (!bfox.f114735c.containsKey(clientIdentity.f30222b)) {
                }
                bfox.f114735c.put(clientIdentity.f30222b, Pair.create(Integer.valueOf(i), Long.valueOf(elapsedRealtime2)));
            } else {
                z = false;
            }
        } else if (i2 != 2) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Received unknown device orientation request op code: ");
            sb2.append(i2);
            Log.e("GCoreFlp", sb2.toString());
            z = false;
        } else {
            aehq aehq2 = deviceOrientationRequestUpdateData2.f79415c;
            if (aehq2 != null) {
                bgaq.f115916c.mo62279a(aehq2);
            } else {
                z = false;
            }
        }
        try {
            aejv aejv = deviceOrientationRequestUpdateData2.f79416d;
            if (aejv != null) {
                if (!z) {
                    status = Status.f30111e;
                } else {
                    status = Status.f30107a;
                }
                aejv.mo34143a(new FusedLocationProviderResult(status));
            }
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb3.append("Client binder died before delivering operation result: ");
            sb3.append(valueOf);
            Log.e("GCoreFlp", sb3.toString());
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34227a(LocationRequestInternal locationRequestInternal, aehw aehw) {
        this.f115928b.mo62564a(locationRequestInternal, aehw, null, this.f115929c);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34228a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        this.f115928b.mo62565a(locationRequestInternal, pendingIntent);
    }

    /* renamed from: a */
    public final void mo34229a(LocationRequestUpdateData locationRequestUpdateData) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        int i = locationRequestUpdateData.f79431a;
        if (i == 1) {
            LocationRequestInternal locationRequestInternal = locationRequestUpdateData.f79432b;
            PendingIntent pendingIntent = locationRequestUpdateData.f79434d;
            if (pendingIntent == null) {
                aehw aehw = locationRequestUpdateData.f79433c;
                if (aehw == null) {
                    aeht aeht = locationRequestUpdateData.f79435e;
                    if (aeht != null) {
                        aejv aejv = locationRequestUpdateData.f79436f;
                        bgaq.mo62563a(locationRequestInternal);
                        bfqm bfqm = bgaq.f115915b;
                        boolean b = bgaq.mo62567b();
                        bfqm.m97529b(locationRequestInternal, str);
                        LocationRequestInternal b2 = LocationRequestInternal.m66890b(locationRequestInternal);
                        boolean a = bfqm.mo62142a(b2, str);
                        bfqm.f114889p.mo62099a(21, new bfqg(bfqm, Binder.getCallingUid(), str, b2, b, a, aeht, aejv));
                    }
                } else {
                    bgaq.mo62564a(locationRequestInternal, aehw, locationRequestUpdateData.f79436f, str);
                }
            } else {
                bgaq.mo62565a(locationRequestInternal, pendingIntent);
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Received unknown location request op code: ");
            sb.append(i);
            Log.e("GCoreFlp", sb.toString());
        } else {
            PendingIntent pendingIntent2 = locationRequestUpdateData.f79434d;
            if (pendingIntent2 == null) {
                aehw aehw2 = locationRequestUpdateData.f79433c;
                if (aehw2 == null) {
                    aeht aeht2 = locationRequestUpdateData.f79435e;
                    if (aeht2 != null) {
                        bgaq.f115915b.mo62130a(aeht2);
                    }
                } else {
                    bgaq.mo62558a(aehw2);
                }
            } else {
                bgaq.mo62559a(pendingIntent2);
            }
        }
        aejv aejv2 = locationRequestUpdateData.f79436f;
        if (aejv2 != null) {
            try {
                aejv2.mo34143a(FusedLocationProviderResult.f79417a);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 55);
                sb2.append("Client binder died before delivering operation result: ");
                sb2.append(valueOf);
                Log.e("GCoreFlp", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo34230a(List list, PendingIntent pendingIntent, aejy aejy) {
        aehm aehm = new aehm();
        aehm.mo34152a(list);
        aehm.mo34153b(5);
        mo34220a(aehm.mo34149a(), pendingIntent, aejy);
    }

    /* renamed from: a */
    public final void mo34231a(rnt rnt) {
        bgaq bgaq = this.f115928b;
        String packageName = bgaq.f115914a.getPackageName();
        bero.m95591a(bgaq.f115914a, packageName);
        bxbi bxbi = new bxbi(packageName);
        IBinder asBinder = rnt.asBinder();
        bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_FLUSH_ACTIVITY_SAMPLES", 1);
        Bundle bundle = new Bundle();
        C1004fv.m12455a(bundle, "com.google.android.location.internal.EXTRA_API_CALLBACK", asBinder);
        bxbi.f161815a.putExtras(bundle);
        bxbi.mo73549a(bgaq.f115914a);
    }

    /* renamed from: a */
    public final void mo34232a(boolean z) {
        bgaq bgaq = this.f115928b;
        String str = this.f115929c;
        bfqm bfqm = bgaq.f115915b;
        bfqm.mo62145c(str);
        bfqm.mo62139a(z);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34233a(String[] strArr, aejy aejy, String str) {
        List asList = Arrays.asList(strArr);
        sdo.checkIfNull(asList, "geofence can't be null.");
        sdo.m34975b(!asList.isEmpty(), "Geofences must contains at least one id.");
        mo34225a(new RemoveGeofencingRequest(asList, null, ""), aejy);
    }

    /* renamed from: a */
    public final boolean mo34234a(int i) {
        bgaq bgaq = this.f115928b;
        if (bgaq.mo62570e()) {
            SharedPreferences sharedPreferences = bgaq.f115914a.getSharedPreferences("activityRecognitionAccuracyModeName", 0);
            if (sharedPreferences == null) {
                Log.e("GLMSImpl", "null pref for activity recognition accuracy mode was found ");
                return false;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("arAccuracyModePref", i);
            boolean commit = edit.commit();
            if (commit) {
                bewq a = bewq.m95998a(bgaq.f115914a);
                StringBuilder sb = new StringBuilder(57);
                sb.append("logging change in activity recognition mode = ");
                sb.append(i);
                sb.toString();
                bxvd da = btxo.f152833d.mo74144da();
                long currentTimeMillis = System.currentTimeMillis();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btxo btxo = (btxo) da.f164949b;
                int i2 = btxo.f152835a | 2;
                btxo.f152835a = i2;
                btxo.f152837c = currentTimeMillis;
                if (i == 0) {
                    btxo.f152836b = 1;
                    btxo.f152835a = i2 | 1;
                } else {
                    if (i != 1) {
                        btxo.f152836b = 0;
                    } else {
                        btxo.f152836b = 2;
                    }
                    btxo.f152835a = i2 | 1;
                }
                bxvd da2 = btxm.f152814q.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btxm btxm = (btxm) da2.f164949b;
                btxo btxo2 = (btxo) da.mo74062i();
                btxo2.getClass();
                btxm.f152825j = btxo2;
                btxm.f152816a |= 512;
                qwo a2 = a.f112849a.mo24333a((btxm) da2.mo74062i());
                a2.mo24328b(11);
                a2.mo24327b();
            } else {
                Log.e("GLMSImpl", "unable to write the activity mode to the shared preferences!");
            }
            return commit;
        }
        throw new SecurityException("Activity recognition  setActivityRecognitionMode is only available to zero party");
    }
}
