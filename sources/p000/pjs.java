package p000;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Set;

/* renamed from: pjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pjs extends pel {

    /* renamed from: a */
    public static final qav f39373a = new qav("RCNController");

    /* renamed from: b */
    public final pwq f39374b;

    /* renamed from: c */
    public final CastDevice f39375c;

    /* renamed from: d */
    public final int f39376d;

    /* renamed from: e */
    public final Handler f39377e;

    /* renamed from: f */
    public Runnable f39378f;

    /* renamed from: g */
    public final psx f39379g;

    /* renamed from: h */
    public pep f39380h;

    /* renamed from: i */
    public boolean f39381i;

    /* renamed from: j */
    public boolean f39382j = false;

    /* renamed from: k */
    public String f39383k;

    /* renamed from: l */
    public String f39384l;

    /* renamed from: m */
    public boolean f39385m;

    /* renamed from: n */
    public boolean f39386n;

    /* renamed from: o */
    public bltv f39387o;

    /* renamed from: p */
    public pxi f39388p;

    /* renamed from: q */
    private final Context f39389q;

    /* renamed from: r */
    private final pzz f39390r;

    /* renamed from: s */
    private final RequestQueue f39391s;

    /* renamed from: t */
    private final String f39392t;

    /* renamed from: u */
    private String f39393u;

    /* renamed from: v */
    private boolean f39394v;

    /* renamed from: w */
    private boolean f39395w;

    public pjs(Context context, pzz pzz, pwq pwq, CastDevice castDevice, RequestQueue requestQueue, int i, boolean z, String str) {
        pem pem;
        this.f39389q = context;
        this.f39390r = pzz;
        this.f39374b = pwq;
        this.f39375c = castDevice;
        this.f39376d = i;
        this.f39381i = z;
        pep a = pen.m30259a(context, new pek(new pej(castDevice, this)));
        this.f39380h = a;
        a.mo22980a(new pjq(this));
        this.f39377e = new adzt(Looper.getMainLooper());
        pep pep = this.f39380h;
        psx psx = new psx(new puc(null));
        prt prt = new prt(pep);
        prs prs = psx.f40167f;
        if (prs != prt) {
            if (prs != null) {
                psx.f40164c.mo23629l();
                psx.f40166e.mo23589a();
                try {
                    prs prs2 = psx.f40167f;
                    String d = psx.mo23621d();
                    pep pep2 = ((prt) prs2).f40120a;
                    if (pep2 != null) {
                        if (!TextUtils.isEmpty(d)) {
                            synchronized (((pfv) pep2).f39069s) {
                                pem = (pem) ((pfv) pep2).f39069s.remove(d);
                            }
                            roz b = rpa.m34196b();
                            b.f43472a = new pfe((pfv) pep2, pem, d);
                            ((rjx) pep2).mo24732b(b.mo24977a());
                        } else {
                            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                        }
                    }
                } catch (IOException e) {
                }
                psx.f40165d.f40151a = null;
                psx.f40163b.removeCallbacksAndMessages(null);
            }
            psx.f40167f = prt;
            prs prs3 = psx.f40167f;
            if (prs3 != null) {
                psx.f40165d.f40151a = prs3;
            }
        }
        psx.mo23616a();
        pep.mo22980a(new psi(psx));
        this.f39379g = psx;
        psx.mo23617a(new pjr(this));
        this.f39391s = requestQueue;
        this.f39392t = str;
    }

    /* renamed from: a */
    private final PendingIntent m30580a(Intent intent, int i) {
        Intent intent2 = new Intent("com.google.android.gms.cast.rcn.CLICK");
        intent2.putExtra("extra_intent_to_launch", intent);
        intent2.putExtra("extra_click_result_code", i - 1);
        intent2.putExtra("extra_device_id", this.f39375c.mo17494a());
        return PendingIntent.getBroadcast(this.f39389q, this.f39376d, intent2, 134217728);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjs.a(boolean, bpfe):void
     arg types: [int, bpfe]
     candidates:
      pjs.a(android.content.Intent, int):android.app.PendingIntent
      pjs.a(boolean, bpfe):void */
    /* renamed from: b */
    public final void mo22974b() {
        f39373a.mo23861b("onApplicationDisconnected");
        mo23280a(false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_APPLICATION_DISCONNECTED);
    }

    /* renamed from: c */
    public final void mo23281c() {
        Set<String> stringSet;
        pzy pzy;
        f39373a.mo23856a("updateNotification device: %s", this.f39375c);
        pzz pzz = this.f39390r;
        String a = this.f39375c.mo17494a();
        String str = this.f39383k;
        if (pzz.f40772f && !pzz.f40768b.contains(a)) {
            if (!TextUtils.isEmpty(str) && (pzy = (pzy) pzz.f40769c.get(a)) != null) {
                if (!str.equals(pzy.f40765b) || pzz.m31734a(pzy)) {
                    pzz.f40769c.remove(a);
                    pzz.mo23835b();
                }
            }
            pzz pzz2 = this.f39390r;
            String str2 = this.f39384l;
            if (pzz2.f40771e.contains(str2) || pwc.f40435a.contains(str2)) {
                f39373a.mo23856a("app ID %s is blacklisted or it's an individual group member.", this.f39384l);
                mo23278a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SENDER_BECAME_PRIMARY);
            }
            PendingIntent pendingIntent = null;
            if (this.f39381i) {
                pzz pzz3 = this.f39390r;
                String str3 = this.f39384l;
                if (pzz3.f40770d.contains(str3) || ((stringSet = pzz3.f40767a.getStringSet("googlecast-cafAppIdsNotificationEnabled", null)) != null && stringSet.contains(str3))) {
                    f39373a.mo23856a("app ID %s is blacklisted to show on primary devices.", this.f39384l);
                    mo23278a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SENDER_BECAME_PRIMARY);
                }
            }
            sex a2 = sex.m35104a(rpr.m34216b());
            m30583a(a2);
            if (TextUtils.isEmpty(this.f39393u)) {
                f39373a.mo23856a("Canceled notification for device %s because of no app name.", this.f39375c);
                this.f39374b.mo23777a(bpfi.REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS);
                mo23278a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_INVALID_APPLICATION);
                return;
            } else if (!this.f39385m) {
                f39373a.mo23857a("updateNotification canceled notification device %s, app %s because of no media session", this.f39375c, this.f39393u);
                mo23278a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_NO_MEDIA_SESSION);
                return;
            } else {
                int i = qaf.m31745a(this.f39375c) == 2 ? C0126R.C0127drawable.quantum_ic_speaker_white_24 : C0126R.C0127drawable.quantum_ic_tv_white_24;
                String string = this.f39389q.getString(C0126R.string.cast_rcn_text);
                C1102je jeVar = new C1102je(this.f39389q);
                jeVar.mo13630b(qkj.m32287a(this.f39389q, i));
                jeVar.f22259k = false;
                jeVar.f22244B = "cast_rcn_notification";
                jeVar.f22272x = 1;
                boolean z = this.f39386n;
                Intent intent = new Intent("com.google.android.gms.cast.rcn.TOGGLE_PLAY_BACK");
                intent.putExtra("extra_device_id", this.f39375c.mo17494a());
                C1096iz izVar = new C1096iz(qkj.m32287a(this.f39389q, !z ? C0126R.C0127drawable.quantum_ic_play_arrow_white_24 : C0126R.C0127drawable.quantum_ic_pause_white_24), this.f39389q.getString(!z ? C0126R.string.common_play : C0126R.string.common_pause), PendingIntent.getBroadcast(this.f39389q, this.f39376d, intent, 134217728));
                C1098ja jaVar = new C1098ja();
                jaVar.f22018a |= 4;
                Bundle bundle = new Bundle();
                int i2 = jaVar.f22018a;
                if (i2 != 1) {
                    bundle.putInt("flags", i2);
                }
                izVar.f21939b.putBundle("android.wearable.EXTENSIONS", bundle);
                jeVar.mo13624a(izVar.mo13508a());
                boolean z2 = this.f39394v;
                Intent intent2 = new Intent("com.google.android.gms.cast.rcn.TOGGLE_MUTE");
                intent2.putExtra("extra_device_id", this.f39375c.mo17494a());
                jeVar.mo13624a(new C1096iz(qkj.m32287a(this.f39389q, !z2 ? C0126R.C0127drawable.quantum_ic_volume_up_white_24 : C0126R.C0127drawable.quantum_ic_volume_off_white_24), this.f39389q.getString(!z2 ? C0126R.string.cast_rcn_mute : C0126R.string.cast_rcn_unmute), PendingIntent.getBroadcast(this.f39389q, this.f39376d, intent2, 134217728)).mo13508a());
                Intent intent3 = new Intent("com.google.android.gms.cast.rcn.STOP_CASTING");
                intent3.putExtra("extra_device_id", this.f39375c.mo17494a());
                jeVar.mo13624a(new C1096iz(qkj.m32287a(this.f39389q, C0126R.C0127drawable.quantum_ic_stop_white_24), this.f39389q.getString(C0126R.string.cast_rcn_stop_casting), PendingIntent.getBroadcast(this.f39389q, this.f39376d, intent3, 134217728)).mo13508a());
                Intent a3 = pzv.m31724a(this.f39389q);
                a3.putExtra("extra_device_ip_address", this.f39375c.f29715c.getHostAddress());
                a3.setFlags(67108864);
                jeVar.mo13624a(new C1096iz(qkj.m32287a(this.f39389q, C0126R.C0127drawable.quantum_ic_settings_white_24), this.f39389q.getString(C0126R.string.common_settings), PendingIntent.getActivity(this.f39389q, this.f39376d, a3, 134217728)).mo13508a());
                Intent intent4 = new Intent("com.google.android.gms.cast.rcn.DISMISS");
                intent4.putExtra("extra_device_id", this.f39375c.mo17494a());
                intent4.putExtra("extra_session_id", this.f39383k);
                jeVar.mo13631b(PendingIntent.getBroadcast(this.f39389q, this.f39376d, intent4, 134217728));
                bltv bltv = this.f39387o;
                if (bltv == null) {
                    f39373a.mo23677d("No deep links for the notification. App=%s. Device=%s", this.f39384l, this.f39375c);
                } else {
                    Intent a4 = m30582a(bltv.f127751d);
                    Intent a5 = m30582a(this.f39387o.f127750c);
                    if (a4 == null) {
                        pendingIntent = m30581a(a5, m30582a(this.f39387o.f127749b), 5);
                    } else {
                        Intent a6 = m30582a(this.f39387o.f127752e);
                        if (this.f39389q.getPackageManager().resolveActivity(a4, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null) {
                            a4.putExtra("CAST_INTENT_TO_CAST_DEVICE_NAME_KEY", this.f39375c.f29716d);
                            a4.putExtra("CAST_INTENT_TO_CAST_ROUTE_ID_KEY", this.f39392t);
                            a4.putExtra("CAST_INTENT_TO_CAST_SESSION_ID_KEY", this.f39383k);
                            pendingIntent = m30580a(a4, 2);
                        } else {
                            pendingIntent = m30581a(a5, a6, 4);
                        }
                    }
                }
                jeVar.f22254f = pendingIntent;
                C1184md mdVar = new C1184md();
                mdVar.f26669a = new int[]{0, 1};
                jeVar.mo13626a(mdVar);
                if (cday.f180398a.mo6606a().mo77190l()) {
                    jeVar.f22266r = "com.google.android.gms.cast.rcn.NOTIFICATIONS";
                    jeVar.f22267s = true;
                }
                int i3 = Build.VERSION.SDK_INT;
                Bundle bundle2 = new Bundle();
                bundle2.putString("android.substName", this.f39375c.f29716d);
                jeVar.mo13623a(bundle2);
                jeVar.mo13640e(string);
                jeVar.mo13632b(this.f39393u);
                a2.mo25445a("CastRCN", this.f39376d, jeVar.mo13629b());
                if (!this.f39395w) {
                    if (cday.m132438b()) {
                        new qas(this.f39389q, this.f39391s).mo23847a(this.f39384l, this.f39375c.mo17494a(), new pjp(this), new adzt());
                    } else {
                        f39373a.mo23861b("Click through is disabled.");
                    }
                    this.f39374b.mo23776a(172);
                }
                f39373a.mo23857a("Showing RCN for device %s. RCN ID: %d", this.f39375c, Integer.valueOf(this.f39376d));
                this.f39395w = true;
                return;
            }
        }
        f39373a.mo23857a("RCN is disabled for device %s and session: %s", this.f39375c, this.f39383k);
        mo23278a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SENDER_BECAME_PRIMARY);
    }

    /* renamed from: a */
    private final PendingIntent m30581a(Intent intent, Intent intent2, int i) {
        if (intent == null) {
            f39373a.mo23677d("No deep link for playback control activity of Home app.", new Object[0]);
            return null;
        } else if (this.f39389q.getPackageManager().resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null) {
            return m30580a(intent, 3);
        } else {
            if (intent2 == null) {
                f39373a.mo23677d("No fallback play store link.", new Object[0]);
                return null;
            } else if (cday.f180398a.mo6606a().mo77183e()) {
                return m30580a(intent2, i);
            } else {
                f39373a.mo23861b("Opening play store is disabled.");
                return null;
            }
        }
    }

    /* renamed from: a */
    private static final Intent m30582a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
        return null;
    }

    /* renamed from: a */
    private static final void m30583a(sex sex) {
        int i = Build.VERSION.SDK_INT;
        if (sex.mo25437a("cast_rcn_notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_rcn_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            sex.mo25442a(notificationChannel);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjs.a(boolean, bpfe):void
     arg types: [int, bpfe]
     candidates:
      pjs.a(android.content.Intent, int):android.app.PendingIntent
      pjs.a(boolean, bpfe):void */
    /* renamed from: a */
    public final void mo22972a() {
        f39373a.mo23861b("onVolumeChanged");
        if (this.f39380h != null) {
            f39373a.mo23856a("Updating notification for volume change for device %s", this.f39375c);
            try {
                boolean a = this.f39380h.mo22981a();
                if (a != this.f39394v) {
                    this.f39394v = a;
                    mo23281c();
                }
            } catch (IllegalStateException e) {
                f39373a.mo23675c("Error retrieving muted state: The device is disconnected while the CastClient is still connected", new Object[0]);
                mo23280a(false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_OFFLINE);
            }
        }
    }

    /* renamed from: a */
    public final void mo23278a(bpfe bpfe) {
        if (this.f39395w) {
            f39373a.mo23857a("Removing RCN for device %s. RCN ID: %d", this.f39375c, Integer.valueOf(this.f39376d));
            sex a = sex.m35104a(rpr.m34216b());
            m30583a(a);
            a.mo25444a("CastRCN", this.f39376d);
            this.f39395w = false;
            pwq pwq = this.f39374b;
            phy phy = pwq.f40514a;
            phy.mo23120a(pwq.f40515b, (long) pwq.f40516c, phy.mo23146j(), pwq.f40517d, bpfe);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjs.a(boolean, bpfe):void
     arg types: [int, bpfe]
     candidates:
      pjs.a(android.content.Intent, int):android.app.PendingIntent
      pjs.a(boolean, bpfe):void */
    /* renamed from: a */
    public final void mo22973a(ApplicationMetadata applicationMetadata) {
        f39373a.mo23857a("onApplicationMetadataChanged: device = %s, status = %s", this.f39375c, applicationMetadata);
        if (applicationMetadata == null) {
            f39373a.mo23856a("onApplicationMetadataChanged with null metadata. deviceId = %s", this.f39375c.mo17494a());
            this.f39374b.mo23777a(bpfi.REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS);
            mo23280a(false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_INVALID_APPLICATION);
        } else if (this.f39380h != null) {
            String str = applicationMetadata.f29706a;
            this.f39384l = str;
            this.f39374b.f40517d = str;
            this.f39393u = applicationMetadata.f29707b;
            if (!applicationMetadata.mo17489a(psx.f40161j) || applicationMetadata.mo17489a(pwe.f40451b)) {
                f39373a.mo23856a("Device %s doesn't support media namespace.", this.f39375c);
                mo23279a(false);
            } else if (!this.f39382j) {
                JoinOptions joinOptions = new JoinOptions();
                joinOptions.mo17516a(2);
                pep pep = this.f39380h;
                String str2 = this.f39384l;
                roz b = rpa.m34196b();
                b.f43472a = new pfj((pfv) pep, str2, joinOptions);
                aucb b2 = ((rjx) pep).mo24732b(b.mo24977a());
                b2.mo50373a(new pjm(this));
                b2.mo50372a(new pjn(this));
            } else {
                mo23281c();
            }
        } else {
            f39373a.mo23861b("onApplicationMetadataChanged: CastClient already disconnected.");
        }
    }

    /* renamed from: a */
    public final void mo23279a(boolean z) {
        pep pep = this.f39380h;
        if (pep != null) {
            if (!z) {
                roz b = rpa.m34196b();
                b.f43472a = new pfk((pfv) pep);
                ((rjx) pep).mo24732b(b.mo24977a());
            } else {
                roz b2 = rpa.m34196b();
                b2.f43472a = new pfl((pfv) pep);
                ((rjx) pep).mo24732b(b2.mo24977a());
            }
            f39373a.mo23856a("Disconnecting api client for device %s", this.f39375c);
            pep pep2 = this.f39380h;
            roz b3 = rpa.m34196b();
            b3.f43472a = pfg.f39025a;
            ((rjx) pep2).mo24732b(b3.mo24977a());
            pfv pfv = (pfv) pep2;
            pfv.mo23020b();
            pfv.mo23019a((ptt) pfv.f39052b);
        }
        this.f39380h = null;
        this.f39382j = false;
        this.f39383k = null;
        this.f39393u = null;
        pxi pxi = this.f39388p;
        if (pxi != null) {
            pxi.mo23799a();
            this.f39388p = null;
        }
    }

    /* renamed from: a */
    public final void mo23280a(boolean z, bpfe bpfe) {
        mo23278a(bpfe);
        mo23279a(z);
    }
}
