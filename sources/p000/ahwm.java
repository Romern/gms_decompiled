package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwm {

    /* renamed from: a */
    public static final int f68236a = 1391908237;

    /* renamed from: h */
    private static int f68237h = ((int) SystemClock.elapsedRealtime());

    /* renamed from: b */
    public final Context f68238b;

    /* renamed from: c */
    public final ahsi f68239c;

    /* renamed from: d */
    public final sqv f68240d;

    /* renamed from: e */
    public final Map f68241e = new HashMap();

    /* renamed from: f */
    public String f68242f;

    /* renamed from: g */
    public TrueWirelessHeadset f68243g;

    /* renamed from: i */
    private final bnic f68244i;

    public ahwm(Context context) {
        this.f68238b = context;
        this.f68239c = (ahsi) ahgz.m55754a(context, ahsi.class);
        this.f68240d = (sqv) ahgz.m55754a(context, sqv.class);
        bnia bnia = new bnia();
        for (String str : cfog.f184854a.mo6606a().mo82032j().split(",", -1)) {
            bnia.mo67629b(Integer.valueOf(Integer.parseInt(str)));
        }
        this.f68244i = bnia.mo67751a();
    }

    /* renamed from: a */
    private final PendingIntent m56796a(Intent intent) {
        Context context = this.f68238b;
        int i = f68237h;
        f68237h = i + 1;
        return PendingIntent.getService(context, i, intent, 134217728);
    }

    /* renamed from: a */
    private final boolean m56797a(HeadsetPiece headsetPiece, HeadsetPiece headsetPiece2) {
        if (!headsetPiece.mo60343d()) {
            bnrd a = this.f68244i.iterator();
            while (a.hasNext()) {
                int intValue = ((Integer) a.next()).intValue();
                if (headsetPiece.mo60341b() > 0 && headsetPiece.mo60341b() <= intValue && headsetPiece2.mo60341b() > intValue) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo37239a() {
        ((ahgp) ahgz.m55754a(this.f68238b, ahgp.class)).mo36449a(f68236a);
        this.f68242f = null;
        this.f68243g = null;
    }

    /* renamed from: a */
    public final synchronized void mo37240a(TrueWirelessHeadset trueWirelessHeadset, String str, ByteString bxtx) {
        int i;
        long j;
        long j2;
        long j3;
        TrueWirelessHeadset trueWirelessHeadset2 = trueWirelessHeadset;
        String str2 = str;
        synchronized (this) {
            if (rrs.m34317a() == null || rrs.m34317a().mo25052b()) {
                this.f68242f = str2;
                this.f68243g = trueWirelessHeadset2;
                if (this.f68241e.containsKey(str2)) {
                    TrueWirelessHeadset trueWirelessHeadset3 = (TrueWirelessHeadset) this.f68241e.get(str2);
                    if (trueWirelessHeadset3 != null) {
                        if (!m56797a(trueWirelessHeadset.mo60347b(), trueWirelessHeadset3.mo60347b())) {
                            if (m56797a(trueWirelessHeadset.mo60348c(), trueWirelessHeadset3.mo60348c())) {
                            }
                        }
                        this.f68241e.remove(str2);
                    } else if (cfoj.f184966a.mo6606a().mo82159bp() && (trueWirelessHeadset.mo60347b().mo60359g() || trueWirelessHeadset.mo60348c().mo60359g())) {
                        this.f68241e.remove(str2);
                    }
                    srn srn = ahsd.f67925a;
                    return;
                }
                ahwl ahwl = new ahwl(this, trueWirelessHeadset2);
                ahwt ahwt = new ahwt(this.f68238b);
                ahwt.mo37420a("DEVICES_WITHIN_REACH_REBRANDED");
                Context context = this.f68238b;
                if (!cfoj.f184966a.mo6606a().mo82140bK()) {
                    i = aict.m56987a(context);
                } else {
                    i = qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_headset_black_24);
                }
                ahwt.mo13630b(i);
                ahwt.mo13631b(m56796a(DiscoveryChimeraService.m67336a(((aicw) ahgz.m55754a(this.f68238b, aicw.class)).f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_DISMISS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", this.f68242f).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", trueWirelessHeadset.mo60351f())));
                ahwt.f22271w = C1133kh.m17843b(this.f68238b, C0126R.color.discovery_activity_accent);
                ahwt.f22245C = TimeUnit.SECONDS.toMillis(cfog.f184854a.mo6606a().mo82031i());
                ahwt.mo13637c(true);
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", this.f68238b.getResources().getString(C0126R.string.common_devices));
                ahwt.mo13623a(bundle);
                ahwt.f22254f = m56796a(DiscoveryChimeraService.m67336a(((aicw) ahgz.m55754a(this.f68238b, aicw.class)).f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", this.f68242f).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", bxtx.getKey()).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", trueWirelessHeadset.mo60351f()));
                if (cfoj.f184966a.mo6606a().mo82118ap()) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    String str3 = this.f68242f;
                    Uri uri = ddu.f12956a;
                    String valueOf = String.valueOf(Uri.encode("FAST_PAIR"));
                    Cursor query = this.f68238b.getContentResolver().query(Uri.withAppendedPath(uri, valueOf.length() == 0 ? new String("id/") : "id/".concat(valueOf)).buildUpon().appendQueryParameter("address", str3).appendQueryParameter("battery_id", "1").appendQueryParameter("battery_level", String.valueOf(trueWirelessHeadset.mo60347b().mo60341b())).appendQueryParameter("battery_id", "2").appendQueryParameter("battery_level", String.valueOf(trueWirelessHeadset.mo60348c().mo60341b())).appendQueryParameter("battery_id", "3").appendQueryParameter("battery_level", String.valueOf(trueWirelessHeadset.mo60349d().mo60341b())).appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis())).build(), new String[]{"battery_estimate", "estimate_ready"}, null, null, null);
                    if (query == null || !query.moveToFirst()) {
                        j3 = 0;
                    } else {
                        if (query.getInt(query.getColumnIndex("estimate_ready")) == 1) {
                            j3 = query.getLong(query.getColumnIndex("battery_estimate"));
                        } else {
                            j3 = 0;
                        }
                        query.close();
                    }
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FastPair: Smart battery = %s", j3);
                    j = timeUnit.toMinutes(Long.valueOf(j3).longValue());
                } else {
                    j = 0;
                }
                if (j != 0) {
                    this.f68239c.mo37020a(bvin.FAST_PAIR_BATTERY_NOTIFICATION_DISPLAYED_SMART_BATTERY, trueWirelessHeadset.mo60351f(), this.f68242f, 0, 0);
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("start to populate the battery notification.");
                String a = trueWirelessHeadset.mo60346a();
                ahsc ahsc = (ahsc) ahgz.m55754a(ahwt.f68258H, ahsc.class);
                if (j > 0) {
                    if (j >= 60) {
                        j2 = j / 60;
                        j %= 60;
                    } else {
                        j2 = 0;
                    }
                    if (j2 > 0) {
                        a = ahsc.mo37009a("fast_pair_headset_smart_battery_hr_min", a, Long.valueOf(j2), Long.valueOf(j));
                    } else {
                        a = ahsc.mo37009a("fast_pair_headset_smart_battery_min", a, Long.valueOf(j));
                    }
                } else if (trueWirelessHeadset.mo60347b().mo60359g() || trueWirelessHeadset.mo60348c().mo60359g() || trueWirelessHeadset.mo60349d().mo60359g()) {
                    a = ahsc.mo37009a("fast_pair_headset_battery_level_low", a);
                }
                ahwt.f68257G.setTextViewText(16908310, a);
                ahwt.f68257G.setImageViewResource(16908294, C0126R.C0127drawable.quantum_ic_headset_black_24);
                AtomicInteger atomicInteger = new AtomicInteger(3);
                ahwt.f68257G.removeAllViews(16908290);
                String a2 = ahwt.m56805a(ahwt.f68258H, trueWirelessHeadset2);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a2).length());
                sb.append(a);
                sb.append(" ");
                sb.append(a2);
                String sb2 = sb.toString();
                ahwt.f68257G.setContentDescription(16908290, sb2);
                ahwt.mo37421b(sb2);
                ahwt.mo37243a(trueWirelessHeadset.mo60347b(), atomicInteger, ahwl);
                ahwt.mo37243a(trueWirelessHeadset.mo60349d(), atomicInteger, ahwl);
                ahwt.mo37243a(trueWirelessHeadset.mo60348c(), atomicInteger, ahwl);
                ahwt.mo13640e(a);
                ahwt.mo13632b((CharSequence) ahwt.m56805a(ahwt.f68258H, trueWirelessHeadset2));
            }
        }
    }

    /* renamed from: a */
    public final void mo37241a(String str) {
        if (this.f68241e.containsKey(str)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: Removed suppressed battery %s", str);
            this.f68241e.remove(str);
        }
    }
}
