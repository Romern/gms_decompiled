package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.location.fused.NlpRequestHelper$DataReceiver;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bfsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfsa implements sth {

    /* renamed from: a */
    public static final Object f115085a = new Object();

    /* renamed from: b */
    public static boolean f115086b = false;

    /* renamed from: c */
    public static boolean f115087c = false;

    /* renamed from: d */
    public static boolean f115088d = false;

    /* renamed from: n */
    private static boolean f115089n = false;

    /* renamed from: o */
    private static int f115090o = 0;

    /* renamed from: e */
    public final bfpk f115091e;

    /* renamed from: f */
    public final asfb f115092f;

    /* renamed from: g */
    public final Context f115093g;

    /* renamed from: h */
    public final boolean f115094h;

    /* renamed from: i */
    public bfrz f115095i;

    /* renamed from: j */
    public bfrx f115096j;

    /* renamed from: k */
    public WorkSource f115097k;

    /* renamed from: l */
    public boolean f115098l;

    /* renamed from: m */
    public boolean f115099m = false;

    /* renamed from: p */
    private final NlpRequestHelper$DataReceiver f115100p;

    /* renamed from: q */
    private final aki f115101q;

    /* renamed from: r */
    private final sti f115102r;

    /* renamed from: s */
    private boolean f115103s = false;

    public bfsa(Looper looper, Context context) {
        this.f115093g = context;
        asfb asfb = new asfb(context, 1, "GCoreFlp", "NlpRequestHelper", "com.google.android.gms");
        this.f115092f = asfb;
        asfb.mo49115a(true);
        this.f115091e = new bfpk(new bfry(this, looper), this.f115092f);
        this.f115094h = stx.m36339a(context);
        this.f115100p = new NlpRequestHelper$DataReceiver(this);
        this.f115101q = aki.m919a(context);
        sti sti = new sti(context, looper);
        this.f115102r = sti;
        sti.f45129a = this;
    }

    /* renamed from: a */
    public static PendingIntent m97672a(Context context) {
        return m97673a(context, "com.google.android.location.internal.action.FLP_AR_RESULT");
    }

    /* renamed from: b */
    public static PendingIntent m97674b(Context context) {
        return m97673a(context, "com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT");
    }

    /* renamed from: c */
    public static PendingIntent m97675c(Context context) {
        return m97673a(context, "com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT");
    }

    /* renamed from: d */
    public final void mo62202d() {
        if (!this.f115103s) {
            this.f115103s = true;
            this.f115102r.mo26072a();
            this.f115101q.mo873a(this.f115100p, new IntentFilter(bvpm.m121348a("com.google.android.location.internal.action.FLP_AR_RESULT")));
            this.f115101q.mo873a(this.f115100p, new IntentFilter(bvpm.m121348a("com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT")));
            this.f115101q.mo873a(this.f115100p, new IntentFilter(bvpm.m121348a("com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT")));
            this.f115101q.mo873a(this.f115100p, new IntentFilter(bvpm.m121348a("com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT")));
            synchronized (f115085a) {
                f115090o++;
                mo62201c();
                mo62199b();
                mo62195a();
            }
        }
    }

    /* renamed from: e */
    public final void mo62203e() {
        if (this.f115103s) {
            this.f115103s = false;
            this.f115102r.mo26073b();
            this.f115101q.mo872a(this.f115100p);
            synchronized (f115085a) {
                f115090o--;
                mo62201c();
                mo62199b();
                mo62195a();
            }
        }
    }

    /* renamed from: a */
    public static PendingIntent m97673a(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.location.internal.PendingIntentCallbackService"));
        intent.setPackage(context.getPackageName());
        intent.setAction(str);
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    /* renamed from: b */
    public final void mo62199b() {
        if (!f115087c && f115090o == 0) {
            bxbi bxbi = new bxbi("com.google.android.gms");
            PendingIntent c = m97675c(this.f115093g);
            bxbi.mo73551a(c);
            if (bxbi.mo73549a(this.f115093g) == null) {
                Log.w("GCoreFlp", "Unable to start the GMS NLP");
                c.cancel();
            }
        } else if (!f115087c) {
            mo62200b(Long.MAX_VALUE, Long.MAX_VALUE, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfsa.a(long, boolean):void
     arg types: [int, int]
     candidates:
      bfsa.a(android.content.Context, java.lang.String):android.app.PendingIntent
      bfsa.a(boolean, boolean):void
      sth.a(boolean, boolean):void
      bfsa.a(long, boolean):void */
    /* renamed from: c */
    public final void mo62201c() {
        if (!f115088d && (f115090o == 0 || !f115089n)) {
            bxbi bxbi = new bxbi("com.google.android.gms");
            PendingIntent a = m97672a(this.f115093g);
            bxbi.mo73555b(a);
            if (bxbi.mo73549a(this.f115093g) == null) {
                Log.w("GCoreFlp", "Unable to start the GMS NLP");
                a.cancel();
            }
        } else if (!f115088d) {
            mo62197a(Long.MAX_VALUE, false);
        }
    }

    /* renamed from: a */
    public final void mo62195a() {
        if (!f115086b && f115090o == 0) {
            bxbi bxbi = new bxbi("com.google.android.gms");
            PendingIntent b = m97674b(this.f115093g);
            bxbi.mo73551a(b);
            if (bxbi.mo73549a(this.f115093g) == null) {
                Log.w("GCoreFlp", "Unable to start the GMS NLP");
                b.cancel();
            }
        } else if (!f115086b) {
            mo62196a(Long.MAX_VALUE, Long.MAX_VALUE, false);
        }
    }

    /* renamed from: a */
    public final void mo62196a(long j, long j2, boolean z) {
        bxbi bxbi = new bxbi("com.google.android.gms");
        int i = Build.VERSION.SDK_INT;
        bxbi.mo73550a(j, j2, m97674b(this.f115093g), "fused.NlpController:NlpFullPower");
        bxbi.mo73558c(z);
        WorkSource workSource = this.f115097k;
        if (workSource != null) {
            bxbi.mo73552a(workSource);
        }
        bxbi.mo73556b(this.f115098l);
        if (bxbi.mo73549a(this.f115093g) == null) {
            Log.w("GCoreFlp", "Unable to bind to GMS NLP");
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
    /* renamed from: b */
    public final void mo62200b(long j, long j2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        bxbi bxbi = new bxbi("com.google.android.gms");
        bxbi.mo73550a(j, j2, m97675c(this.f115093g), "fused.NlpController:NlpLowPower");
        bxbi.mo73558c(z);
        WorkSource workSource = this.f115097k;
        if (workSource != null) {
            bxbi.mo73552a(workSource);
        }
        bxbi.mo73556b(this.f115098l);
        bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_LOW_POWER", true);
        if (bxbi.mo73549a(this.f115093g) == null) {
            Log.w("GCoreFlp", "Unable to bind to GMS NLP");
        }
    }

    /* renamed from: a */
    public final void mo62197a(long j, boolean z) {
        aefy aefy = new aefy();
        aefy.mo34115a(j);
        aefy.f63346c = z;
        aefy.f63348e = "fused.NlpController:AR";
        aefy.f63347d = this.f115097k;
        bxbi bxbi = new bxbi("com.google.android.gms");
        bxbi.mo73553a(aefy.mo34113a(), m97672a(this.f115093g));
        if (bxbi.mo73549a(this.f115093g) == null) {
            Log.w("GCoreFlp", "Unable to bind to GMS NLP");
        }
    }

    /* renamed from: a */
    public final void mo62198a(Collection collection) {
        if (collection == null) {
            collection = Collections.emptyList();
        }
        this.f115097k = saq.m34797a(collection);
    }

    /* renamed from: a */
    public final void mo26071a(boolean z, boolean z2) {
        synchronized (f115085a) {
            boolean z3 = true;
            if (!z && !z2) {
                z3 = false;
            }
            if (z3 != f115089n) {
                f115089n = z3;
                mo62201c();
            }
        }
    }
}
