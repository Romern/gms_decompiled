package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;
import com.google.android.gms.cast.activity.NearbyPinActivityImpl$CastNearbyAbortedReceiver;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: phj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phj extends phs {

    /* renamed from: a */
    public static final String f39110a = String.valueOf(pzd.f40716a).concat("/message");

    /* renamed from: b */
    static final long f39111b = ccxy.f180226a.mo6606a().mo77053o();

    /* renamed from: n */
    private static final bnic f39112n = bnic.m109489a("android.permission-group.MICROPHONE");

    /* renamed from: o */
    private static final bnic f39113o = bnic.m109490a("android.permission-group.MICROPHONE", "android.permission-group.PHONE");

    /* renamed from: c */
    public final qav f39114c = new qav("CastNearbyPinActivity");

    /* renamed from: d */
    public final Handler f39115d = new adzt(Looper.getMainLooper());

    /* renamed from: e */
    public boolean f39116e = false;

    /* renamed from: f */
    public boolean f39117f = false;

    /* renamed from: g */
    public qae f39118g;

    /* renamed from: h */
    public phy f39119h;

    /* renamed from: i */
    public ScheduledExecutorService f39120i;

    /* renamed from: j */
    public final Runnable f39121j = new phf(this);

    /* renamed from: k */
    public final TokenReceiver$Params f39122k;

    /* renamed from: l */
    public final ger f39123l;

    /* renamed from: p */
    private NearbyPinActivityImpl$CastNearbyAbortedReceiver f39124p;

    /* renamed from: q */
    private pes f39125q;

    /* renamed from: r */
    private int f39126r;

    public phj(CastNearbyPinChimeraActivity castNearbyPinChimeraActivity) {
        super(castNearbyPinChimeraActivity);
        gdp gdp = new gdp();
        gdp.mo11695b(2);
        gdp.mo11694a(3);
        this.f39122k = new TokenReceiver$Params(new Encoding[]{gdp.mo11693a()});
        this.f39123l = new phh(this);
    }

    /* renamed from: a */
    protected static String m30329a(byte[] bArr) {
        if (bArr.length < 2) {
            return null;
        }
        byte b = bArr[0];
        StringBuilder sb = new StringBuilder(11);
        sb.append("");
        sb.append((b >> 4) & 15);
        String valueOf = String.valueOf(sb.toString());
        byte b2 = bArr[0];
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb2.append(valueOf);
        sb2.append((int) (b2 & 15));
        String valueOf2 = String.valueOf(sb2.toString());
        byte b3 = bArr[1];
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
        sb3.append(valueOf2);
        sb3.append((b3 >> 4) & 15);
        String valueOf3 = String.valueOf(sb3.toString());
        byte b4 = bArr[1];
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 11);
        sb4.append(valueOf3);
        sb4.append((int) (b4 & 15));
        return sb4.toString();
    }

    /* renamed from: b */
    public final void mo23079b() {
        qav qav = this.f39114c;
        boolean z = this.f39116e;
        StringBuilder sb = new StringBuilder(29);
        sb.append("onRestart. responseSent:");
        sb.append(z);
        qav.mo23670a(sb.toString(), new Object[0]);
        if (this.f39116e) {
            this.f39114c.mo23670a("onRestart:finish", new Object[0]);
            mo23084g();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: phj.a(java.lang.String, boolean, boolean):void
     arg types: [java.lang.String, int, int]
     candidates:
      phs.a(int, int, android.content.Intent):void
      phj.a(java.lang.String, boolean, boolean):void */
    /* renamed from: c */
    public final void mo23080c() {
        this.f39114c.mo23670a("onStop", new Object[0]);
        this.f39139m.setRequestedOrientation(this.f39126r);
        mo23083f();
        NearbyPinActivityImpl$CastNearbyAbortedReceiver nearbyPinActivityImpl$CastNearbyAbortedReceiver = this.f39124p;
        if (nearbyPinActivityImpl$CastNearbyAbortedReceiver != null) {
            this.f39139m.unregisterReceiver(nearbyPinActivityImpl$CastNearbyAbortedReceiver);
            this.f39124p = null;
        }
        if (!this.f39116e) {
            this.f39119h.mo23108a(bpen.USER_CANCELLED);
            mo23078a("", true, true);
        }
        mo23084g();
    }

    /* renamed from: d */
    public final void mo23081d() {
        this.f39115d.removeCallbacksAndMessages(null);
        this.f39119h = null;
        pes pes = this.f39125q;
        if (pes != null) {
            pes.mo22984a("CastNearbyPinActivity");
            this.f39125q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set mo23082e() {
        Set a = ccxy.f180226a.mo6606a().mo77056r() ? sft.f44147a.mo25486a(f39113o) : sft.f44147a.mo25486a(f39112n);
        if (a.isEmpty()) {
            this.f39114c.mo23670a("All required permissions are granted.", new Object[0]);
        } else {
            this.f39114c.mo23675c("Required permission(s) is missing: %s", TextUtils.join(",", a));
        }
        return a;
    }

    /* renamed from: f */
    public final void mo23083f() {
        if (this.f39118g != null) {
            this.f39114c.mo23673b("STOP Listening for audio pin.", new Object[0]);
            new phi(this, "stopaudio", this.f39139m.getIntent().getStringArrayListExtra("BSSID_LIST"), this.f39139m.getIntent().getStringArrayListExtra("BLE_TOKENS")).start();
            qae qae = this.f39118g;
            qae.f40779b.mo11650a(this.f39123l).mo50371a(qad.f40777a);
            this.f39118g = null;
        }
    }

    /* renamed from: g */
    public final void mo23084g() {
        this.f39114c.mo23856a("finishActivity: mResponseSent: %b", Boolean.valueOf(this.f39116e));
        NearbyPinActivityImpl$CastNearbyAbortedReceiver nearbyPinActivityImpl$CastNearbyAbortedReceiver = this.f39124p;
        if (nearbyPinActivityImpl$CastNearbyAbortedReceiver != null) {
            this.f39139m.unregisterReceiver(nearbyPinActivityImpl$CastNearbyAbortedReceiver);
            this.f39124p = null;
        }
        this.f39139m.finish();
    }

    /* renamed from: a */
    static boolean m30330a(String str) {
        return !TextUtils.isEmpty(str) && str.matches("[0-9][0-9][0-9][0-9]");
    }

    /* renamed from: a */
    public final void mo23076a() {
        this.f39114c.mo23670a("onStart", new Object[0]);
        this.f39126r = this.f39139m.getRequestedOrientation();
        this.f39139m.setRequestedOrientation(14);
    }

    /* renamed from: a */
    public final void mo23077a(Intent intent) {
        qav qav = this.f39114c;
        boolean z = this.f39116e;
        StringBuilder sb = new StringBuilder(31);
        sb.append("onNewIntent. responseSent:");
        sb.append(z);
        qav.mo23670a(sb.toString(), new Object[0]);
        this.f39139m.setIntent(intent);
        this.f39116e = false;
    }

    /* renamed from: a */
    public final void mo23065a(Bundle bundle) {
        qav qav = this.f39114c;
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("onCreate. savedInstanceState:");
        sb.append(valueOf);
        qav.mo23670a(sb.toString(), new Object[0]);
        Context applicationContext = this.f39139m.getApplicationContext();
        this.f39120i = pes.m30266a();
        this.f39125q = pes.m30267a(applicationContext, "CastNearbyPinActivity");
        this.f39119h = new phy(applicationContext, this.f39125q.f38981e);
        if (bundle == null) {
            SharedPreferences b = qay.m31785b(this.f39139m);
            if (!mo23082e().isEmpty() || !b.contains("castnearby.optIn")) {
                this.f39139m.getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.container, new phe(), "MicAuthorizationFragment").commit();
            } else if (b.getBoolean("castnearby.optIn", false)) {
                this.f39139m.getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.container, new phb(), "ConnectingFragment").commit();
            } else {
                this.f39139m.getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.container, phq.m30341a(false), "PinFragment").commit();
            }
        }
        this.f39139m.requestWindowFeature(1);
        this.f39139m.setContentView((int) C0126R.C0128layout.cast_nearby_pin_activity);
        this.f39124p = new NearbyPinActivityImpl$CastNearbyAbortedReceiver(this);
        this.f39139m.registerReceiver(this.f39124p, new IntentFilter("com.google.android.gms.cast.session.ACTION_CAST_NEARBY_ABORTED"));
    }

    /* renamed from: a */
    public final void mo23078a(String str, boolean z, boolean z2) {
        Intent intent = new Intent("com.google.android.gms.cast.session.CAST_NEARBY_PIN_RESPONSE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("PIN", str);
        intent.putExtra("MANUAL", z);
        intent.putExtra("CANCELED", z2);
        intent.putExtra("DEVICE SETTINGS CLICKED", this.f39117f);
        this.f39114c.mo23670a("Sending response: %s %b %b %b", str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.f39117f));
        this.f39139m.sendBroadcast(intent);
        this.f39116e = true;
    }
}
