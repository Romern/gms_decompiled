package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: azfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfo {

    /* renamed from: c */
    private static Random f99235c;

    /* renamed from: d */
    private static WeakReference f99236d = new WeakReference(null);

    /* renamed from: a */
    public final Context f99237a;

    /* renamed from: b */
    public final azdl f99238b;

    protected azfo(Context context, azdl azdl) {
        bmxy.m108581a(context);
        this.f99237a = context;
        this.f99238b = azdl;
    }

    /* renamed from: a */
    public static long m85591a(long j) {
        if (j <= 0) {
            return 0;
        }
        double nextDouble = m85595b().nextDouble();
        double d = (double) j;
        Double.isNaN(d);
        return (long) Math.floor(nextDouble * d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azfo.a(long, boolean, long, long):long
     arg types: [long, int, long, long]
     candidates:
      azfo.a(android.content.Intent, long, long, long):android.content.Intent
      azfo.a(long, boolean, long, long):long */
    /* renamed from: b */
    public static final Intent m85594b(Intent intent) {
        long a = m85592a(intent.getLongExtra("retry_interval_intent_extra", 0), true, cfeo.f183719a.mo6606a().mo80954aN(), cfeo.f183719a.mo6606a().mo80953aM());
        if (a <= 0) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        intent2.putExtra("retry_interval_intent_extra", a);
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private static final long m85592a(long j, boolean z, long j2, long j3) {
        long millis = TimeUnit.SECONDS.toMillis(j2);
        long millis2 = TimeUnit.SECONDS.toMillis(j3);
        long max = Math.max(millis, 1L);
        long max2 = Math.max(1 + max, millis2);
        double d = (double) j;
        double bO = cfeo.f183719a.mo6606a().mo81008bO();
        Double.isNaN(d);
        long round = Math.round(d * bO);
        if (round >= max) {
            max = round;
        }
        if (max <= max2) {
            return max;
        }
        if (!z) {
            return max2;
        }
        return -1;
    }

    /* renamed from: a */
    public static synchronized azfo m85593a(Context context) {
        azfo azfo;
        synchronized (azfo.class) {
            azfo = (azfo) f99236d.get();
            if (azfo == null) {
                Context applicationContext = context.getApplicationContext();
                azfo = new azfo(applicationContext, azdl.m85412a(applicationContext));
                f99236d = new WeakReference(azfo);
            }
        }
        return azfo;
    }

    /* renamed from: b */
    public static synchronized Random m85595b() {
        Random random;
        synchronized (azfo.class) {
            if (f99235c == null) {
                f99235c = new Random();
            }
            random = f99235c;
        }
        return random;
    }

    /* renamed from: b */
    public final void mo54877b(int i, Intent intent, long j) {
        PendingIntent service = PendingIntent.getService(this.f99237a, i, intent, 134217728);
        Object[] objArr = {Long.valueOf(j / 1000), Integer.valueOf(i), intent};
        new skc(this.f99237a).mo25675a("RetryManager", 2, SystemClock.elapsedRealtime() + j, service, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azfo.a(long, boolean, long, long):long
     arg types: [long, int, long, long]
     candidates:
      azfo.a(android.content.Intent, long, long, long):android.content.Intent
      azfo.a(long, boolean, long, long):long */
    /* renamed from: a */
    public final Intent mo54872a(Intent intent, long j, long j2, long j3) {
        Intent intent2 = new Intent(intent);
        intent2.putExtra("retry_interval_intent_extra", m85592a(j, false, j2, j3));
        return intent2;
    }

    /* renamed from: a */
    public final void mo54873a() {
        ScheduledTaskService.m94658a(this.f99237a, "gms:matchstick:register");
    }

    /* renamed from: a */
    public final void mo54874a(int i, Intent intent, long j) {
        double d = (double) j;
        double bR = cfeo.f183719a.mo6606a().mo81011bR();
        boolean z = false;
        if (bR >= 0.0d && bR < 1.0d) {
            z = true;
        }
        bmxy.m108588a(z);
        double nextDouble = m85595b().nextDouble();
        Double.isNaN(d);
        mo54877b(i, intent, Math.round(d * ((((nextDouble + nextDouble) - 4.0d) * bR) + 1.0d)));
    }

    /* renamed from: a */
    public final void mo54875a(Intent intent) {
        long longExtra = intent.getLongExtra("retry_interval_intent_extra", -1);
        if (longExtra >= 0) {
            mo54874a(77770, intent, longExtra);
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
    public final void mo54876a(azcs azcs, LocalEntityId localEntityId) {
        String str;
        byte[] bArr;
        if (!cfec.m138765b()) {
            str = "com.google.android.gms.matchstick.register_intent_action";
        } else {
            str = "com.google.android.gms.matchstick.gaia_register_intent_action";
        }
        if (localEntityId == null || localEntityId.equals(azcv.f99014b)) {
            str = "com.google.android.gms.matchstick.anonymous_token_refresh_action";
        }
        Intent intent = new Intent(str);
        intent.putExtra("triggered_by_unauthenticated_rpc_failure_retry", true);
        if (!(azcs == null || (bArr = azcs.f99002a) == null)) {
            intent.putExtra("invalid_auth_token_extra", bArr);
        }
        SilentRegisterIntentOperation.m94575a(intent, this.f99237a);
    }
}
