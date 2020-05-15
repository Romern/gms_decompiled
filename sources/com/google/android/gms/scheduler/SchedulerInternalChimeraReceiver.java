package com.google.android.gms.scheduler;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.gcm.PendingCallback;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulerInternalChimeraReceiver extends BroadcastReceiver {

    /* renamed from: c */
    private static final C1223np f107335c = new C1223np();

    /* renamed from: d */
    private static final Binder f107336d = new Binder();

    /* renamed from: e */
    private static final bqgj f107337e = snp.m35704b(10);

    /* renamed from: b */
    private final Handler f107338b = new adzt(Looper.getMainLooper());

    /* renamed from: a */
    private static Set m92330a(Intent intent) {
        return aead.m51510a(intent.getIntArrayExtra("content_uri_flags_array"), intent.getParcelableArrayExtra("content_uri_array"));
    }

    public final void onReceive(Context context, Intent intent) {
        Throwable th;
        IBinder binder;
        aall aall;
        Intent intent2;
        Throwable th2;
        Context context2 = context;
        Intent intent3 = intent;
        if ("com.google.android.gms.gcm.ACTION_CHECK_QUEUE".equals(intent.getAction())) {
            aphm aphm = apht.m70315a().f84401a;
            if (aphm != null) {
                bljb a = blkh.m107281a("NetworkScheduler_alarmUp");
                try {
                    aphm.f84391b.execute(aphk.m70299a(aphm.f84390a, aapx.ALARM_MANAGER));
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
            } else {
                Log.e("NetworkScheduler.SIR", "GmsTaskScheduler unavailable.");
                return;
            }
        } else if ("com.google.android.gms.gcm.ACTION_HTTP_OK".equals(intent.getAction())) {
            aphm.m70302a();
            return;
        } else if ("com.google.android.gms.gcm.ACTION_EXECUTE_TASK".equals(intent.getAction())) {
            String stringExtra = intent3.getStringExtra("tag");
            Parcelable parcelableExtra = intent3.getParcelableExtra("callback");
            Bundle bundle = (Bundle) intent3.getParcelableExtra("extras");
            ComponentName componentName = (ComponentName) intent3.getParcelableExtra("component");
            long longExtra = intent3.getLongExtra("max_exec_duration", 180);
            if (componentName == null || TextUtils.isEmpty(componentName.getPackageName())) {
                Log.e("NetworkScheduler.SIR", "No package provided.");
                setResultCode(16);
                return;
            } else if (!(parcelableExtra instanceof PendingCallback) && !(parcelableExtra instanceof com.google.android.gms.libs.scheduler.PendingCallback)) {
                Log.e("NetworkScheduler.SIR", "Invalid callback provided.");
                setResultCode(16);
                return;
            } else if (!cdnj.m134211g() || m92331a(context, intent)) {
                Intent a2 = apik.m70395a(context.getPackageManager(), componentName, stringExtra, parcelableExtra, bundle, longExtra, intent3.getBundleExtra("engine_flags"));
                if (a2 == null) {
                    setResultCode(32);
                    return;
                }
                try {
                    if (context2.startService(a2) == null) {
                        setResultCode(128);
                        return;
                    } else {
                        setResultCode(1);
                        return;
                    }
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("NetworkScheduler.SIR", valueOf.length() == 0 ? new String("SecurityException starting service: ") : "SecurityException starting service: ".concat(valueOf));
                    setResultCode(8);
                    return;
                } catch (IllegalStateException e2) {
                    String valueOf2 = String.valueOf(e2.getMessage());
                    Log.e("NetworkScheduler.SIR", valueOf2.length() == 0 ? new String("IllegalStateException starting service: ") : "IllegalStateException starting service: ".concat(valueOf2));
                    setResultCode(64);
                    return;
                }
            } else {
                setResultCode(16);
                return;
            }
        } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
            int intExtra = intent3.getIntExtra("OP_CODE", -1);
            if (intExtra == 1) {
                aajg.m21335a(context);
                for (aeab aeab : m92330a(intent)) {
                    if (!f107335c.containsKey(aeab)) {
                        apld apld = new apld(context2, this.f107338b, aeab);
                        if (f107335c.put(aeab, apld) == null) {
                            try {
                                context.getContentResolver().registerContentObserver(aeab.f62977a, aeab.mo33968a(), apld);
                            } catch (IllegalArgumentException | SecurityException e3) {
                                String valueOf3 = String.valueOf(aeab);
                                String valueOf4 = String.valueOf(e3);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 42 + String.valueOf(valueOf4).length());
                                sb.append("Failed to register content observer for ");
                                sb.append(valueOf3);
                                sb.append(": ");
                                sb.append(valueOf4);
                                Log.w("NetworkScheduler.SIR", sb.toString());
                                f107335c.remove(aeab);
                            }
                        }
                    }
                }
                return;
            } else if (intExtra == 2) {
                Set<aeab> a3 = m92330a(intent);
                ContentResolver contentResolver = context.getContentResolver();
                for (aeab aeab2 : a3) {
                    apld apld2 = (apld) f107335c.remove(aeab2);
                    if (apld2 != null) {
                        contentResolver.unregisterContentObserver(apld2);
                    }
                }
                return;
            } else if (intExtra == 3) {
                Set a4 = m92330a(intent);
                Parcelable[] parcelableArrayExtra = intent3.getParcelableArrayExtra("triggered_uris");
                if (a4.size() == 1 && parcelableArrayExtra != null && parcelableArrayExtra.length == 1) {
                    int intExtra2 = intent3.getIntExtra("user_serial", -1);
                    aphm aphm2 = apht.m70315a().f84401a;
                    if (aphm2 != null) {
                        aeab aeab3 = (aeab) a4.iterator().next();
                        Uri uri = (Uri) parcelableArrayExtra[0];
                        bljb a5 = blkh.m107281a("NetworkScheduler_onContentUpdate");
                        try {
                            aphm2.f84391b.execute(bljx.m107269a(new aphk(7, aphm2.f84390a, aapx.CONTENT_URI_UPDATED, null, null, aeab3, uri, intExtra2)));
                            if (a5 != null) {
                                a5.close();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            bqye.m113761a(th, th4);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (intExtra == 4) {
                int intExtra3 = intent3.getIntExtra("user_serial", -1);
                aphm aphm3 = apht.m70315a().f84401a;
                if (aphm3 != null) {
                    aphm3.f84391b.execute(new aphk(8, aphm3.f84390a, aapx.CAUSE_UNKNOWN, null, null, null, null, intExtra3));
                    return;
                }
                return;
            } else if (intExtra != 5) {
                Log.w("NetworkScheduler.SIR", "Unrecognised action received by internal scheduler receiver.");
                return;
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("binder", f107336d);
                Context applicationContext = context.getApplicationContext();
                Bundle extras = intent.getExtras();
                bqgj b = snp.m35704b(10);
                apis apis = null;
                if (!(extras == null || (binder = extras.getBinder("callback")) == null || !apil.m70421a("com.google.android.gms.gcm.IMessengerProxyCallback", binder))) {
                    IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.gcm.IMessengerProxyCallback");
                    if (queryLocalInterface instanceof aall) {
                        aall = (aall) queryLocalInterface;
                    } else {
                        aall = new aalj(binder);
                    }
                    if (!(aall == null || (intent2 = (Intent) extras.getParcelable("intent")) == null)) {
                        apis = new apis(applicationContext, aall, intent2, b);
                    }
                }
                if (apis != null) {
                    setResultExtras(bundle2);
                    f107337e.execute(apis);
                    return;
                }
                return;
            }
        } else {
            String stringExtra2 = intent3.getStringExtra("package");
            if (stringExtra2 == null) {
                Log.e("NetworkScheduler.SIR", "Trying to send multi-user initialization message but got no package to send to.");
                return;
            }
            int intExtra4 = intent3.getIntExtra("user_serial", -1);
            if (intExtra4 == -1) {
                Log.e("NetworkScheduler.SIR", "Trying to send multi-user initialization message but got an invalid user serial.");
                return;
            } else if (!cdnj.m134211g() || m92331a(context, intent)) {
                apjh.m70453a(context2, aamh.m21513a(stringExtra2, intExtra4));
                return;
            } else {
                return;
            }
        }
        throw th2;
        throw th;
    }

    /* renamed from: a */
    private static final boolean m92331a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("user_serial", -1);
        if (intExtra != -1) {
            aajg.m21335a(context);
            int d = aajg.m21344d();
            if (intExtra != d) {
                Log.e("NetworkScheduler.SIR", String.format(Locale.ENGLISH, "Received broadcast destined for user %d at user %d", Integer.valueOf(intExtra), Integer.valueOf(d)));
                return false;
            }
        }
        return true;
    }
}
