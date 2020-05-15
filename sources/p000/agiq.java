package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.identifier.C0272d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: agiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agiq extends agjv {

    /* renamed from: a */
    static final Pair f65614a = new Pair("", 0L);

    /* renamed from: A */
    private boolean f65615A;

    /* renamed from: B */
    private long f65616B;

    /* renamed from: b */
    public SharedPreferences f65617b;

    /* renamed from: c */
    public agio f65618c;

    /* renamed from: d */
    public final agin f65619d = new agin(this, "last_upload", 0);

    /* renamed from: e */
    public final agin f65620e = new agin(this, "last_upload_attempt", 0);

    /* renamed from: f */
    public final agin f65621f = new agin(this, "backoff", 0);

    /* renamed from: g */
    public final agin f65622g = new agin(this, "last_delete_stale", 0);

    /* renamed from: h */
    public final agin f65623h;

    /* renamed from: i */
    public final agin f65624i;

    /* renamed from: j */
    public final agin f65625j;

    /* renamed from: k */
    public final agip f65626k;

    /* renamed from: l */
    public final agin f65627l;

    /* renamed from: m */
    public final agim f65628m;

    /* renamed from: n */
    public final agip f65629n;

    /* renamed from: o */
    public final agim f65630o;

    /* renamed from: p */
    public final agim f65631p;

    /* renamed from: q */
    public final agin f65632q;

    /* renamed from: r */
    public boolean f65633r;

    /* renamed from: s */
    public final agim f65634s;

    /* renamed from: t */
    public final agim f65635t;

    /* renamed from: u */
    public final agin f65636u;

    /* renamed from: v */
    public final agip f65637v;

    /* renamed from: w */
    public final agip f65638w;

    /* renamed from: x */
    public final agin f65639x;

    /* renamed from: z */
    private String f65640z;

    public agiq(agje agje) {
        super(agje);
        new agin(this, "time_before_start", 10000);
        this.f65627l = new agin(this, "session_timeout", 1800000);
        this.f65628m = new agim(this, "start_new_session", true);
        this.f65632q = new agin(this, "last_pause_time", 0);
        this.f65629n = new agip(this, "non_personalized_ads");
        this.f65630o = new agim(this, "use_dynamite_api", false);
        this.f65631p = new agim(this, "allow_remote_dynamite", false);
        this.f65623h = new agin(this, "midnight_offset", 0);
        this.f65624i = new agin(this, "first_open_time", 0);
        this.f65625j = new agin(this, "app_install_time", 0);
        this.f65626k = new agip(this, "app_instance_id");
        this.f65634s = new agim(this, "app_backgrounded", false);
        this.f65635t = new agim(this, "deep_link_retrieval_complete", false);
        this.f65636u = new agin(this, "deep_link_retrieval_attempts", 0);
        this.f65637v = new agip(this, "firebase_feature_rollouts");
        this.f65638w = new agip(this, "deferred_attribution_cache");
        this.f65639x = new agin(this, "deferred_attribution_cache_timestamp", 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo35464G() {
        SharedPreferences sharedPreferences = mo35542z().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f65617b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f65633r = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f65617b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        mo35538v();
        this.f65618c = new agio(this, "health_monitor", Math.max(0L, ((Long) aghn.f65502c.mo35389a()).longValue()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair mo35465a(String str) {
        mo35241h();
        long b = mo35534A().mo20506b();
        String str2 = this.f65640z;
        if (str2 != null && b < this.f65616B) {
            return new Pair(str2, Boolean.valueOf(this.f65615A));
        }
        this.f65616B = b + mo35538v().mo35311a(str, aghn.f65501b);
        try {
            C0271c a = C0272d.m5150a(mo35542z());
            if (a != null) {
                this.f65640z = a.f7985a;
                this.f65615A = a.f7986b;
            }
            if (this.f65640z == null) {
                this.f65640z = "";
            }
        } catch (Exception e) {
            mo35497E().f65571j.mo35436a("Unable to get advertising id", e);
            this.f65640z = "";
        }
        return new Pair(this.f65640z, Boolean.valueOf(this.f65615A));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35371a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo35467b(String str) {
        mo35241h();
        String str2 = (String) mo35465a(str).first;
        MessageDigest f = agms.m54595f();
        if (f == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, f.digest(str2.getBytes())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SharedPreferences mo35468c() {
        mo35241h();
        mo35544k();
        return this.f65617b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Boolean mo35469d() {
        mo35241h();
        if (mo35468c().contains("measurement_enabled")) {
            return Boolean.valueOf(mo35468c().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35466a(long j) {
        return j - this.f65627l.mo35458a() > this.f65632q.mo35458a();
    }
}
