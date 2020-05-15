package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.Task;

/* renamed from: aphu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphu implements Runnable {

    /* renamed from: a */
    private final Context f84406a;

    /* renamed from: b */
    private final Intent f84407b;

    public aphu(Context context, Intent intent) {
        this.f84406a = context;
        this.f84407b = intent;
    }

    /* renamed from: a */
    private static final aebo m70318a(aaly aaly) {
        Bundle bundle = new Bundle();
        bundle.putInt("retry_policy", aaly.f28428b);
        bundle.putInt("initial_backoff_seconds", 30);
        bundle.putInt("maximum_backoff_seconds", 3600);
        aebo a = aebo.m51579a(bundle);
        sdo.m34959a(a);
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    public final void run() {
        String str;
        aeca aeca;
        aphm aphm;
        aphm aphm2;
        aphm aphm3;
        if (!cdnj.f181319a.mo6606a().mo77996S() || m70319a(this.f84407b)) {
            aajg.m21335a(this.f84406a);
            int d = aajg.m21344d();
            if (d == 0) {
                aphm aphm4 = apht.m70315a().f84401a;
                if (aphm4 != null) {
                    String action = this.f84407b.getAction();
                    int intExtra = this.f84407b.getIntExtra("user_serial", 0);
                    aphm aphm5 = aphm4;
                    if ("com.google.android.gms.gcm.ACTION_TRIGGER_TASK".equals(action)) {
                        Intent intent = this.f84407b;
                        Context context = this.f84406a;
                        String stringExtra = intent.getStringExtra("component");
                        String stringExtra2 = intent.getStringExtra("tag");
                        if (TextUtils.isEmpty(stringExtra)) {
                            Log.e("NetworkScheduler", "Error triggering debug task - no component name provided. Did you use the correct key ('component')?");
                        } else if (TextUtils.isEmpty(stringExtra2)) {
                            Log.e("NetworkScheduler", "Error triggering debug task - no tag provided. Did you use the correct key ('tag')?");
                        } else {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(stringExtra);
                            if (unflattenFromString == null) {
                                Log.e("NetworkScheduler", "Error triggering debug task - Component name could not be resolved.");
                            } else if (!cdnq.f181333a.mo6606a().mo77977a() || !unflattenFromString.getPackageName().equals("com.google.android.gms") || rfy.m33550g(context)) {
                                aphm aphm6 = apht.m70315a().f84401a;
                                if (aphm6 == null) {
                                    Log.e("NetworkScheduler", "Error triggering debug task - network scheduler unavailable.Are you running as u0?");
                                    return;
                                }
                                Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                                try {
                                    aebi aebi = new aebi();
                                    aebi.f63099k = stringExtra2;
                                    aebi.f63097i = unflattenFromString.getClassName();
                                    aebi.mo34004a(0L, 1L);
                                    aebi.mo34027b(1);
                                    aebi.mo34023a(2);
                                    aebi.f63107s = bundle;
                                    apid a = apid.m70356a(aebi.mo33974b(), unflattenFromString, SystemClock.elapsedRealtime(), 0);
                                    a.f84440j = apka.m70504a(1, 0);
                                    aphm6.mo47220a(a);
                                } catch (IllegalArgumentException e) {
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                                    sb.append("Failed to schedule Task: ");
                                    sb.append(valueOf);
                                    Log.e("NetworkScheduler", sb.toString());
                                }
                            } else {
                                Log.e("NetworkScheduler", "Error triggering debug task - Triggering a GMS Core task on a non-userdebug build is not allowed.");
                            }
                        }
                    } else if ("android.intent.action.USER_REMOVED".equals(action)) {
                        int intExtra2 = this.f84407b.getIntExtra("android.intent.extra.user_handle", -1);
                        if (intExtra2 != -1) {
                            apht.m70315a().f84404d.mo16944a(aajg.m21340b(intExtra2));
                        }
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        apht.m70315a().f84404d.mo16948b(1);
                    } else if ("com.google.android.gms.gcm.ACTION_SCHEDULE".equals(action) || "com.google.android.gms.gcm.nts.ACTION_SCHEDULE".equals(action)) {
                        Parcelable parcelableExtra = this.f84407b.getParcelableExtra("app");
                        if (!(parcelableExtra instanceof PendingIntent)) {
                            Log.e("NetworkScheduler", "Invalid parameter app");
                            str = null;
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            String creatorPackage = ((PendingIntent) parcelableExtra).getCreatorPackage();
                            if (creatorPackage == null || TextUtils.isEmpty(creatorPackage)) {
                                str = null;
                            } else {
                                aamh a2 = aamh.m21513a(creatorPackage, intExtra);
                                try {
                                    a2.mo17017b(apht.m70315a().f84403c, 0);
                                    str = creatorPackage;
                                } catch (PackageManager.NameNotFoundException e2) {
                                    String valueOf2 = String.valueOf(a2);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                    sb2.append("Provided package not found: ");
                                    sb2.append(valueOf2);
                                    Log.e("NetworkScheduler", sb2.toString());
                                    str = null;
                                }
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            Log.e("NetworkScheduler", "Invalid package name : Perhaps you didn't include a PendingIntent in the extras?");
                            return;
                        }
                        Intent intent2 = this.f84407b;
                        String stringExtra3 = intent2.getStringExtra("scheduler_action");
                        if (TextUtils.isEmpty(stringExtra3)) {
                            Log.e("NetworkScheduler", "Broadcast provided with no action to the scheduler in Intent.");
                        } else if (!stringExtra3.equals("SCHEDULE_TASK")) {
                            String stringExtra4 = intent2.getStringExtra("tag");
                            ComponentName componentName = (ComponentName) intent2.getParcelableExtra("component");
                            if (componentName == null) {
                                Log.e("NetworkScheduler", "Invalid component specified.");
                                return;
                            }
                            ComponentName componentName2 = new ComponentName(str, componentName.getClassName());
                            if (stringExtra3.equals("ACTION_SCHEDULE")) {
                                aphm = aphm5;
                            } else if (stringExtra3.equals("ACTION_SCHEDULE")) {
                                aphm = aphm5;
                            } else {
                                if (stringExtra3.equals("SCHEDULE_RECURRING")) {
                                    aphm2 = aphm5;
                                } else if (stringExtra3.equals("NTS_SCHEDULE_RECURRING")) {
                                    aphm2 = aphm5;
                                } else {
                                    if (stringExtra3.equals("CANCEL_TASK")) {
                                        aphm3 = aphm5;
                                    } else if (stringExtra3.equals("NTS_CANCEL_TASK")) {
                                        aphm3 = aphm5;
                                    } else if (stringExtra3.equals("CANCEL_ALL") || stringExtra3.equals("NTS_CANCEL_ALL")) {
                                        aphm5.mo47219a(aeco.m51640a(intExtra, componentName2));
                                        return;
                                    } else {
                                        return;
                                    }
                                    aphm3.f84391b.execute(new aphk(3, aphm3.f84390a, aapx.CAUSE_UNKNOWN, null, aeco.m51641a(intExtra, componentName2, stringExtra4), null, null, -1));
                                    return;
                                }
                                long longExtra = intent2.getLongExtra("period", 0);
                                long longExtra2 = intent2.getLongExtra("period_flex", (long) (((float) longExtra) * 0.1f));
                                if (stringExtra4 == null) {
                                    stringExtra4 = "";
                                }
                                try {
                                    aebl aebl = new aebl();
                                    aebl.f63099k = stringExtra4;
                                    aebl.f63097i = componentName2.getClassName();
                                    aebl.f63070a = longExtra;
                                    aebl.f63071b = longExtra2;
                                    aebl.mo34027b(0);
                                    aebl.mo34023a(0);
                                    apid a3 = apid.m70356a(aebl.mo33974b(), componentName2, SystemClock.elapsedRealtime(), intExtra);
                                    a3.f84440j = apka.m70504a(2, intent2.getIntExtra("source_version", 5000000));
                                    aphm2.mo47220a(a3);
                                    return;
                                } catch (IllegalArgumentException e3) {
                                    String valueOf3 = String.valueOf(e3);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                                    sb3.append("Failed to schedule Task: ");
                                    sb3.append(valueOf3);
                                    Log.e("NetworkScheduler", sb3.toString());
                                    return;
                                }
                            }
                            long longExtra3 = intent2.getLongExtra("window_start", 0);
                            if (longExtra3 < 0) {
                                StringBuilder sb4 = new StringBuilder(71);
                                sb4.append("Cannot specify a start time in the past: ");
                                sb4.append(longExtra3);
                                sb4.append(", aborting");
                                Log.e("NetworkScheduler", sb4.toString());
                            }
                            aphm aphm7 = aphm;
                            long longExtra4 = intent2.getLongExtra("window_end", 0);
                            if (longExtra4 < 0) {
                                StringBuilder sb5 = new StringBuilder(70);
                                sb5.append("Cannot specify an end time in the past: ");
                                sb5.append(longExtra4);
                                sb5.append(", aborting");
                                Log.e("NetworkScheduler", sb5.toString());
                            }
                            boolean booleanExtra = intent2.getBooleanExtra("update_current", true);
                            if (stringExtra4 == null) {
                                stringExtra4 = "";
                            }
                            try {
                                aebi aebi2 = new aebi();
                                aebi2.f63099k = stringExtra4;
                                aebi2.f63097i = componentName2.getClassName();
                                aebi2.mo34004a(longExtra3, longExtra4);
                                aebi2.mo34029b(booleanExtra);
                                apid a4 = apid.m70356a(aebi2.mo33974b(), componentName2, SystemClock.elapsedRealtime(), intExtra);
                                a4.f84440j = apka.m70504a(2, intent2.getIntExtra("source_version", 5000000));
                                aphm7.mo47220a(a4);
                            } catch (IllegalArgumentException e4) {
                                String valueOf4 = String.valueOf(e4);
                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 25);
                                sb6.append("Failed to schedule Task: ");
                                sb6.append(valueOf4);
                                Log.e("NetworkScheduler", sb6.toString());
                            }
                        } else {
                            aphm aphm8 = aphm5;
                            try {
                                Bundle bundleExtra = intent2.getBundleExtra("task_wrapper");
                                if (bundleExtra == null) {
                                    bundleExtra = intent2.getExtras();
                                }
                                if (bundleExtra != null) {
                                    Parcelable parcelable = bundleExtra.getParcelable("task");
                                    if (parcelable != null) {
                                        try {
                                            if (parcelable instanceof Task) {
                                                Task task = (Task) parcelable;
                                                if (task instanceof PeriodicTask) {
                                                    PeriodicTask periodicTask = (PeriodicTask) task;
                                                    aebl aebl2 = new aebl();
                                                    aebl2.f63097i = periodicTask.f32805c;
                                                    aebl2.f63071b = periodicTask.f32804b;
                                                    aebl2.f63070a = periodicTask.f32803a;
                                                    aebl2.mo34023a(0);
                                                    aebl2.f63099k = periodicTask.f32806d;
                                                    aebl2.f63102n = periodicTask.f32808f;
                                                    aebl2.mo34029b(periodicTask.f32807e);
                                                    aebl2.f63106r = m70318a(periodicTask.f32809g);
                                                    aeca = aebl2.mo33974b();
                                                } else if (task instanceof OneoffTask) {
                                                    OneoffTask oneoffTask = (OneoffTask) task;
                                                    aebi aebi3 = new aebi();
                                                    aebi3.f63097i = oneoffTask.f32805c;
                                                    aebi3.mo34004a(oneoffTask.f32800a, oneoffTask.f32801b);
                                                    aebi3.mo34023a(2);
                                                    aebi3.f63099k = oneoffTask.f32806d;
                                                    aebi3.f63102n = oneoffTask.f32808f;
                                                    aebi3.mo34029b(oneoffTask.f32807e);
                                                    aebi3.f63106r = m70318a(oneoffTask.f32809g);
                                                    aeca = aebi3.mo33974b();
                                                } else {
                                                    aeca = null;
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Invalid task class");
                                            }
                                        } catch (IllegalArgumentException e5) {
                                            String valueOf5 = String.valueOf(e5);
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 46);
                                            sb7.append("Failed to extract Task from schedule request: ");
                                            sb7.append(valueOf5);
                                            Log.e("NetworkScheduler", sb7.toString());
                                            aeca = null;
                                        }
                                    } else {
                                        aeca = aeca.m51618a(bundleExtra);
                                    }
                                } else {
                                    aeca = null;
                                }
                                if (aeca != null) {
                                    try {
                                        apid a5 = apid.m70356a(aeca, new ComponentName(str, aeca.f63112e), SystemClock.elapsedRealtime(), intExtra);
                                        a5.f84440j = apka.m70504a(intent2.getIntExtra("source", 4), intent2.getIntExtra("source_version", 0));
                                        aphm8.mo47220a(a5);
                                    } catch (IllegalArgumentException e6) {
                                        Log.e("NetworkScheduler", e6.toString());
                                    }
                                } else {
                                    Log.e("NetworkScheduler", "Empty task parameter for schedule request");
                                }
                            } catch (IllegalArgumentException e7) {
                                String valueOf6 = String.valueOf(e7);
                                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf6).length() + 26);
                                sb8.append("Exception unpacking task: ");
                                sb8.append(valueOf6);
                                Log.e("NetworkScheduler", sb8.toString());
                            }
                        }
                    } else {
                        String valueOf7 = String.valueOf(action);
                        Log.e("NetworkScheduler", valueOf7.length() == 0 ? new String("Unrecognised action provided: ") : "Unrecognised action provided: ".concat(valueOf7));
                    }
                }
            } else {
                Context context2 = this.f84406a;
                Intent intent3 = this.f84407b;
                Intent intent4 = new Intent(intent3);
                intent4.putExtra("user_serial", d);
                intent4.setClassName(context2, "com.google.android.gms.gcm.nts.SchedulerReceiver");
                Intent intent5 = ("com.google.android.gms.gcm.ACTION_SCHEDULE".equals(intent3.getAction()) || "com.google.android.gms.gcm.nts.ACTION_SCHEDULE".equals(intent3.getAction())) ? intent4 : "android.intent.action.USER_REMOVED".equals(intent3.getAction()) ? null : null;
                if (intent5 != null) {
                    aajg.m21336a(this.f84406a, 0, intent5, null, null, null);
                }
            }
        } else {
            Log.e("NetworkScheduler", "Received task with invalid intent. Ignoring task.");
        }
    }

    /* renamed from: a */
    private static boolean m70319a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return true;
        }
        try {
            for (String str : extras.keySet()) {
                try {
                    extras.get(str);
                } catch (BadParcelableException e) {
                    String valueOf = String.valueOf(str);
                    Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("Intent contains extra with bad key: ") : "Intent contains extra with bad key: ".concat(valueOf));
                    return false;
                }
            }
            return true;
        } catch (BadParcelableException e2) {
            Log.e("NetworkScheduler", "Failed to unmarshall extras.");
            return false;
        }
    }
}
