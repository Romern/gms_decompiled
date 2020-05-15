package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: rfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rfi extends rfj {

    /* renamed from: a */
    public static final rfi f42868a = new rfi();

    /* renamed from: b */
    public static final int f42869b = rfj.f42871c;

    /* renamed from: e */
    private static final Object f42870e = new Object();

    /* renamed from: a */
    public final Dialog mo24579a(Activity activity, int i, int i2) {
        return mo24580a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: b */
    public final boolean mo24589b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = mo24580a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        mo24584a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: a */
    public final Dialog mo24580a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo24581a(activity, i, new saw(mo24591b(activity, i, "d"), activity, i2), onCancelListener);
    }

    /* renamed from: a */
    public final Dialog mo24581a(Context context, int i, saz saz, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(sau.m34809c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = sau.m34811e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, saz);
        }
        String a = sau.m34804a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    /* renamed from: a */
    public final aucb mo24582a(rkc rkc, rkc... rkcArr) {
        rnm rnm;
        sdo.checkIfNull(rkc, "Requested API must not be null.");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(rkc);
        arrayList.addAll(Arrays.asList(rkcArr));
        synchronized (rnm.f43393f) {
            sdo.checkIfNull(rnm.f43394g, "Must guarantee manager is non-null before using getInstance");
            rnm = rnm.f43394g;
        }
        rlc rlc = new rlc(arrayList);
        Handler handler = rnm.f43405o;
        handler.sendMessage(handler.obtainMessage(2, rlc));
        return rlc.f43210b.f91388a;
    }

    /* renamed from: a */
    public final rnp mo24583a(Context context, rno rno) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        rnp rnp = new rnp(rno);
        context.registerReceiver(rnp, intentFilter);
        rnp.f43410a = context;
        if (rfy.m33546a(context, "com.google.android.gms")) {
            return rnp;
        }
        rno.mo24857a();
        rnp.mo24952a();
        return null;
    }

    /* renamed from: a */
    public final void mo24584a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C1021gj) {
                C1050hj aK = ((C1021gj) activity).mo11924aK();
                rgd rgd = new rgd();
                sdo.checkIfNull(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                rgd.f42910Y = dialog;
                if (onCancelListener != null) {
                    rgd.f42911Z = onCancelListener;
                }
                rgd.show(aK, str);
                return;
            }
        } catch (NoClassDefFoundError e) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        rfd rfd = new rfd();
        sdo.checkIfNull(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        rfd.f42862a = dialog;
        if (onCancelListener != null) {
            rfd.f42863b = onCancelListener;
        }
        rfd.show(fragmentManager, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24585a(Context context) {
        new rfh(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: a */
    public final void mo24586a(Context context, int i) {
        mo24587a(context, i, (String) null);
    }

    /* renamed from: a */
    public final void mo24587a(Context context, int i, String str) {
        mo24588a(context, i, str, mo24592c(context, i, "n"));
    }

    /* renamed from: a */
    public final void mo24588a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), str), new IllegalArgumentException());
        if (i == 18) {
            mo24585a(context);
        } else if (pendingIntent != null) {
            String b = sau.m34808b(context, i);
            String d = sau.m34810d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C1102je jeVar = new C1102je(context);
            jeVar.f22268t = true;
            jeVar.mo13627a(true);
            jeVar.mo13640e(b);
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(d);
            jeVar.mo13626a(jdVar);
            sre.m36089i(context);
            jeVar.mo13630b(17301642);
            jeVar.mo13639d(resources.getString(C0126R.string.common_google_play_services_notification_ticker));
            jeVar.mo13619a(System.currentTimeMillis());
            jeVar.f22254f = pendingIntent;
            jeVar.mo13632b(d);
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            sdo.m34970a(true);
            synchronized (f42870e) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String b2 = sau.m34807b(context);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b2, 4));
            } else if (!b2.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(b2);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            jeVar.f22244B = "com.google.android.gms.availability";
            Notification b3 = jeVar.mo13629b();
            if (i == 1 || i == 2 || i == 3) {
                rfy.f42895d.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            if (str != null) {
                notificationManager.notify(str, i2, b3);
            } else {
                notificationManager.notify(i2, b3);
            }
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
