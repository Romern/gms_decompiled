package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.cmnlib.util.DateFormatter;
import com.google.android.gms.thunderbird.config.reporters.AbstractAmlV1SmsReporter$SmsRequest$1;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: augl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class augl extends auft {

    /* renamed from: a */
    public static final AtomicInteger f91770a = new AtomicInteger();

    /* renamed from: d */
    private static final SimpleDateFormat f91771d;

    /* renamed from: b */
    final String f91772b;

    /* renamed from: c */
    final String f91773c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormatter.DATE_TIME, Locale.ROOT);
        f91771d = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    protected augl(String str, String str2) {
        this.f91772b = str;
        this.f91773c = TextUtils.isEmpty(str2) ? null : str2;
    }

    /* renamed from: a */
    private static void m77024a(StringBuilder sb, String str, int i) {
        m77025a(sb, str, Integer.toString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50512a(int i, String str, String str2, String str3, PendingIntent pendingIntent);

    public final String toString() {
        StringBuilder sb = new StringBuilder(mo50499a());
        sb.append("{");
        sb.append(this.f91772b);
        if (this.f91773c != null) {
            sb.append(", ");
            sb.append(this.f91773c);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m77025a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append(";");
        }
        sb.append(str);
        sb.append("=");
        if (str2 != null) {
            sb.append(str2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final bqgg mo50498a(Context context, EmergencyInfo emergencyInfo, aufq aufq, Location location) {
        boolean z;
        String str;
        String str2;
        aufq aufq2 = aufq;
        if (emergencyInfo.f109087b.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        augv a = augv.m77052a(context);
        String str3 = this.f91772b;
        if ("LOCAL".equals(str3)) {
            String str4 = emergencyInfo.mo59541e().f109081e;
            if (str4 == null) {
                return bqga.m112775a(aufs.m76993a(0));
            }
            str = str4;
        } else {
            str = "EMERGENCY".equals(str3) ? emergencyInfo.mo59537a() : str3;
        }
        bmxy.m108581a(str);
        StringBuilder sb = new StringBuilder(160);
        m77025a(sb, "A\"ML", "1");
        String str5 = "N";
        if (location != null) {
            m77025a(sb, "lt", String.format(Locale.ROOT, "%.5f", Double.valueOf(location.getLatitude())));
            m77025a(sb, "lg", String.format(Locale.ROOT, "%.5f", Double.valueOf(location.getLongitude())));
            m77024a(sb, "rd", (int) auft.m76996a(location.getAccuracy(), aufq2.f91731m));
            m77025a(sb, "top", f91771d.format(Long.valueOf(location.getTime())));
            m77024a(sb, "lc", Math.round(aufq2.f91731m * 100.0f));
            int j = aeim.m51906j(location);
            if (j == 1) {
                str5 = "G";
            } else if (j == 2) {
                str5 = "C";
            } else if (j == 3) {
                str5 = "W";
            }
            m77025a(sb, "pm", str5);
        } else {
            m77025a(sb, "lt", "+00.00000");
            m77025a(sb, "lg", "+000.00000");
            m77025a(sb, "rd", str5);
            m77025a(sb, "top", f91771d.format(Long.valueOf(emergencyInfo.mo59540d())));
            m77025a(sb, "lc", "0");
            m77025a(sb, "pm", str5);
        }
        if (!cgyq.f188062a.mo6606a().mo84770n()) {
            String str6 = emergencyInfo.mo59541e().f109079c;
            if (str6 != null) {
                str2 = new String(new char[str6.length()]).replace(0, '0');
            } else {
                str2 = null;
            }
            m77025a(sb, "si", str2);
        } else {
            m77025a(sb, "si", emergencyInfo.mo59541e().f109079c);
        }
        m77025a(sb, "ei", emergencyInfo.mo59541e().f109078b);
        m77025a(sb, "mcc", emergencyInfo.mo59541e().mo59530b());
        m77025a(sb, "mnc", emergencyInfo.mo59541e().mo59531c());
        if (sb.length() > 0) {
            sb.append(";");
        }
        sb.append("ml=");
        sb.append(sb.length() + Integer.toString(sb.length() + Integer.toString(sb.length()).length()).length());
        String sb2 = sb.toString();
        if (auho.m77070a()) {
            String valueOf = String.valueOf(str);
            Log.d("Thunderbird", valueOf.length() == 0 ? new String("sending message to AML SMS endpoint: ") : "sending message to AML SMS endpoint: ".concat(valueOf));
        }
        augk augk = new augk(this, context);
        int i = emergencyInfo.mo59541e().f109077a;
        bmxy.m108600b(!augk.f91766b);
        augk.f91766b = true;
        Uri build = new Uri.Builder().scheme("sms").authority(augk.f91769e.mo50499a()).path(Integer.toString(f91770a.getAndIncrement())).build();
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.thunderbird.SENT_SMS");
        intentFilter.addDataScheme(build.getScheme());
        intentFilter.addDataAuthority(build.getAuthority(), null);
        intentFilter.addDataPath(build.getPath(), 0);
        augj augj = new augj(augk);
        augk.f91767c = new AbstractAmlV1SmsReporter$SmsRequest$1(augk.f91765a, str, augj);
        augk.f91768d = PendingIntent.getBroadcast(augk.f91765a, 0, new Intent("com.google.android.gms.thunderbird.SENT_SMS").setPackage(augk.f91765a.getPackageName()).setData(build), 1342177280);
        augk.f91765a.registerReceiver(augk.f91767c, intentFilter);
        try {
            augl augl = augk.f91769e;
            augl.mo50512a(i, str, augl.f91773c, sb2, augk.f91768d);
        } catch (IllegalArgumentException | NullPointerException | SecurityException e) {
            augj.mo50510a(aufs.m76995a(e));
        }
        return bqdf.m112619a(bqga.m112773a(augj, cgyq.f188062a.mo6606a().mo84768l(), TimeUnit.MILLISECONDS, a.f91796a), TimeoutException.class, augi.f91763a, bqfb.INSTANCE);
    }
}
