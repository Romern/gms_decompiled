package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FirstPartyDeviceRegistrationChimeraService extends Service implements jkg {

    /* renamed from: a */
    public static final sek f11168a = jsy.m17256a("FirstPartyRegistrationService");

    /* renamed from: b */
    public jpo f11169b;

    /* renamed from: c */
    public final Object f11170c = new Object();

    /* renamed from: d */
    public joh f11171d;

    /* renamed from: e */
    public Map f11172e;

    /* renamed from: f */
    private final IBinder f11173f = new jpg(this);

    /* renamed from: g */
    private int f11174g = 0;

    /* renamed from: h */
    private boolean f11175h = true;

    /* renamed from: i */
    private jkh f11176i;

    /* renamed from: j */
    private bqfp f11177j;

    /* renamed from: a */
    public static jpg m6794a(rex rex, Context context) {
        if (skh.m35531a().mo25690a(context, new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService"), rex, 1)) {
            try {
                return (jpg) rex.mo24568a(5, TimeUnit.SECONDS);
            } catch (InterruptedException | TimeoutException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6796a(FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService) {
        firstPartyDeviceRegistrationChimeraService.f11174g--;
    }

    /* renamed from: b */
    private final void m6798b() {
        bqgg bqgg;
        jpo jpo = this.f11169b;
        if (jpo.f22993d.get()) {
            bqgg = bqga.m112775a(Status.f30107a);
        } else {
            bqgg = jpo.f22995f.mo25819b(new jpl(jpo));
        }
        mo7800a(bqgg);
        this.f11175h = false;
    }

    public final IBinder onBind(Intent intent) {
        return this.f11173f;
    }

    public final void onCreate() {
        super.onCreate();
        this.f11175h = true;
        synchronized (this.f11170c) {
            this.f11171d = new joh();
        }
        this.f11172e = new HashMap();
        this.f11177j = new jpf(this);
        this.f11169b = new jpo();
        jkh a = jkh.m16839a();
        this.f11176i = a;
        a.mo13831a(this, new jph(this));
    }

    public final void onDestroy() {
        this.f11176i.mo13830a(this);
        synchronized (this.f11170c) {
            this.f11171d.f22936a.clear();
        }
        jpo jpo = this.f11169b;
        jpo.f22995f.mo25813a(new jpi(jpo), null);
        this.f11172e.clear();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        bqgg bqgg;
        Intent intent2 = intent;
        if (intent2 == null) {
            f11168a.mo25414c("Recovering from GmsCore crash.", new Object[0]);
            if (jkk.f22710a == null) {
                jkk.f22710a = new jkk();
            }
            for (jnm jnm : Arrays.asList(jnm.m16980a())) {
                SharedPreferences sharedPreferences = rpr.m34216b().getSharedPreferences("ResponderGcmSecureChannelCrashRecoverer.PREF_FILE", 0);
                for (String str : bnpf.m110049a((Iterable) sharedPreferences.getStringSet("CHANNEL_SET", new C1225nr()))) {
                    jll.m16886b(rpr.m34216b(), sharedPreferences.getString(jnm.m16981b("ACCOUNT_NAME", str), null), sharedPreferences.getString(jnm.m16981b("PUBLIC_TOPIC_NAME", str), null), sharedPreferences.getString(jnm.m16981b("MY_SHORT_DEVICE_ID", str), null));
                }
                sharedPreferences.edit().clear().apply();
            }
            m6798b();
            return 1;
        } else if (intent2.hasExtra("EXTRA_REGISTER") && intent2.hasExtra("EXTRA_DEVICES_JSON") && intent2.hasExtra("EXTRA_ROLE") && intent2.hasExtra("EXTRA_CALLBACK_INTENT") && intent2.hasExtra("EXTRA_CALLING_PACKAGE")) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(intent2.getStringExtra("EXTRA_DEVICES_JSON"));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add((RemoteDevice) sef.m35069a(sqd.m35969b((String) jSONArray.get(i3)), RemoteDevice.CREATOR));
                }
                boolean booleanExtra = intent2.getBooleanExtra("EXTRA_REGISTER", true);
                Role role = (Role) sef.m35069a(intent2.getByteArrayExtra("EXTRA_ROLE"), Role.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("EXTRA_CALLBACK_INTENT");
                String stringExtra = intent2.getStringExtra("EXTRA_CALLING_PACKAGE");
                if (this.f11175h) {
                    m6798b();
                }
                if (!booleanExtra) {
                    jpo jpo = this.f11169b;
                    bqgg = jpo.f22995f.mo25819b(new jpm(jpo, arrayList, role, pendingIntent, stringExtra, false));
                } else {
                    jpo jpo2 = this.f11169b;
                    bqgg = jpo2.f22995f.mo25819b(new jpm(jpo2, arrayList, role, pendingIntent, stringExtra, true));
                }
                mo7800a(bqgg);
                return 1;
            } catch (JSONException e) {
                f11168a.mo25417e("Failed to parse device list.", e, new Object[0]);
                mo7799a();
                return 1;
            }
        } else if (!this.f11175h || !intent2.getBooleanExtra("EXTRA_IS_INIT_INTENT", false)) {
            mo7799a();
            return 1;
        } else {
            m6798b();
            return 1;
        }
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
    public static void m6795a(Context context) {
        context.startService(new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService").putExtra("EXTRA_IS_INIT_INTENT", true));
    }

    /* renamed from: a */
    public static void m6797a(List list, Role role, PendingIntent pendingIntent, String str, Context context, boolean z) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService");
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(sqd.m35970c(sef.m35074a((RemoteDevice) list.get(i))));
        }
        className.putExtra("EXTRA_DEVICES_JSON", jSONArray.toString());
        className.putExtra("EXTRA_CALLING_PACKAGE", str);
        className.putExtra("EXTRA_CALLBACK_INTENT", pendingIntent);
        className.putExtra("EXTRA_ROLE", sef.m35074a(role));
        className.putExtra("EXTRA_REGISTER", z);
        context.startService(className);
    }

    /* renamed from: a */
    public final void mo7799a() {
        jpo jpo = this.f11169b;
        if (jpo.f22993d.get() && jpo.f22994e.get() == 0 && this.f11174g == 0) {
            stopSelf();
        }
    }

    /* renamed from: a */
    public final void mo7800a(bqgg bqgg) {
        this.f11174g++;
        bqga.m112781a(bqgg, this.f11177j, bqfb.INSTANCE);
    }
}
