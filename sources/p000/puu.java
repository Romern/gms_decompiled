package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: puu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class puu extends pvq implements pue {

    /* renamed from: a */
    public static String f40293a;

    /* renamed from: k */
    private static String f40294k;

    /* renamed from: l */
    private static String f40295l;

    /* renamed from: E */
    private LaunchOptions f40296E;

    /* renamed from: F */
    private put f40297F;

    /* renamed from: G */
    private put f40298G;

    /* renamed from: H */
    private PendingIntent f40299H;

    /* renamed from: I */
    private String f40300I;

    /* renamed from: J */
    private boolean f40301J;

    /* renamed from: b */
    public put f40302b;

    /* renamed from: c */
    public put f40303c;

    /* renamed from: d */
    public put f40304d;

    /* renamed from: e */
    public put f40305e;

    /* renamed from: f */
    public put f40306f;

    /* renamed from: g */
    public puc f40307g;

    /* renamed from: h */
    public long f40308h = -1;

    /* renamed from: i */
    public final List f40309i = new ArrayList();

    /* renamed from: j */
    public pwj f40310j;

    /* renamed from: m */
    private final String f40311m;

    public puu(Context context, CastDevice castDevice, ScheduledExecutorService scheduledExecutorService, pvv pvv, pmx pmx, String str) {
        super(context, castDevice, scheduledExecutorService, pvv, pmx, false, true);
        this.f40311m = str;
        this.f40391z = str;
        synchronized (puu.class) {
            if (f40293a == null) {
                f40293a = context.getString(C0126R.string.error_request_failed);
                f40294k = context.getString(C0126R.string.error_session_start_failed);
                f40295l = context.getString(C0126R.string.error_unknown_session);
            }
        }
    }

    /* renamed from: a */
    public static final Bundle m31405a(JSONObject jSONObject) {
        Bundle bundle = null;
        if (jSONObject != null) {
            if (jSONObject.has("httpStatus")) {
                try {
                    int i = jSONObject.getInt("httpStatus");
                    Bundle bundle2 = new Bundle();
                    try {
                        bundle2.putInt("android.media.status.extra.HTTP_STATUS_CODE", i);
                    } catch (JSONException e) {
                    }
                    bundle = bundle2;
                } catch (JSONException e2) {
                }
            }
            if (jSONObject.has("httpHeaders")) {
                try {
                    Bundle a = pwc.m31495a(jSONObject.getJSONObject("httpHeaders"));
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBundle("android.media.status.extra.HTTP_RESPONSE_HEADERS", a);
                } catch (JSONException e3) {
                }
            }
        }
        return bundle;
    }

    /* renamed from: c */
    private final void m31408c(String str) {
        pwj pwj = this.f40310j;
        if (pwj == null) {
            throw new IllegalStateException("no current item");
        } else if (!pwj.f40478a.equals(str)) {
            throw new IllegalStateException("item ID does not match current item");
        }
    }

    /* renamed from: b */
    public final void mo23703b(String str, int i) {
        int i2;
        this.f40379n.mo23673b("onSessionEnded: sessionId=%s, castStatusCode=%s", str, pew.m30274a(i));
        if (i == 0) {
            i2 = 5;
        } else {
            i2 = 6;
        }
        mo23715e(i2);
        m31409c(str, 1);
        this.f40379n.mo23670a("detaching media channel", new Object[0]);
        this.f40379n.mo23670a("detachMediaChannel", new Object[0]);
        puc puc = this.f40307g;
        if (puc != null) {
            pjc pjc = this.f40388w;
            if (pjc != null) {
                pjc.mo23247b(puc);
            }
            this.f40307g = null;
        }
        this.f40298G = null;
        this.f40302b = null;
        this.f40303c = null;
        this.f40304d = null;
        this.f40305e = null;
        this.f40306f = null;
        this.f40296E = null;
        this.f40375A = false;
    }

    /* renamed from: d */
    public final void mo23705d(int i) {
        this.f40301J = false;
        super.mo23705d(i);
    }

    /* renamed from: e */
    public final void mo23715e(int i) {
        this.f40379n.mo23670a("untrackAllItems()", new Object[0]);
        List list = this.f40309i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo23714a((pwj) list.get(i2), i, (Bundle) null);
        }
        this.f40309i.clear();
        this.f40310j = null;
    }

    /* renamed from: f */
    public final Bundle mo23716f() {
        MediaLiveSeekableRange mediaLiveSeekableRange;
        MediaStatus mediaStatus = this.f40307g.f40231c;
        int i = 5;
        if (mediaStatus != null) {
            int i2 = mediaStatus.f29813e;
            int i3 = mediaStatus.f29814f;
            if (i2 != 1) {
                i = i2 != 2 ? i2 != 3 ? i2 != 4 ? 7 : 3 : 2 : 1;
            } else if (i3 == 1) {
                i = 4;
            } else if (i3 != 2) {
                i = i3 != 3 ? 7 : 6;
            }
            akl akl = new akl(i);
            akl.f774a.putLong("contentDuration", this.f40307g.mo23684d());
            puc puc = this.f40307g;
            MediaInfo e = puc.mo23685e();
            long j = 0;
            if (e != null) {
                Long l = puc.f40232d;
                if (l != null) {
                    if (l.equals(4294967296000L)) {
                        if (puc.f40231c.f29829u != null) {
                            long longValue = l.longValue();
                            MediaStatus mediaStatus2 = puc.f40231c;
                            if (!(mediaStatus2 == null || (mediaLiveSeekableRange = mediaStatus2.f29829u) == null)) {
                                long j2 = mediaLiveSeekableRange.f29764b;
                                j = !mediaLiveSeekableRange.f29766d ? puc.mo23680a(1.0d, j2, -1) : j2;
                            }
                            j = Math.min(longValue, j);
                        } else if (puc.mo23684d() >= 0) {
                            j = Math.min(l.longValue(), puc.mo23684d());
                        }
                    }
                    j = l.longValue();
                } else if (puc.f40230b != 0) {
                    MediaStatus mediaStatus3 = puc.f40231c;
                    double d = mediaStatus3.f29812d;
                    long j3 = mediaStatus3.f29815g;
                    j = (d != 0.0d && mediaStatus3.f29813e == 2) ? puc.mo23680a(d, j3, e.f29750e) : j3;
                }
            }
            akl.f774a.putLong("contentPosition", j);
            akl.mo877a(SystemClock.elapsedRealtime());
            Bundle a = m31405a(mediaStatus.f29823o);
            if (a != null) {
                akl.mo878a(a);
            }
            return akl.mo876a().f775a;
        }
        this.f40379n.mo23670a("*** media status is null!", new Object[0]);
        return new akl(5).mo876a().f775a;
    }

    /* renamed from: g */
    public final void mo23718g() {
        MediaInfo e;
        this.f40379n.mo23670a("sendItemStatusUpdate(); current item is %s", this.f40310j);
        pwj pwj = this.f40310j;
        if (pwj != null) {
            PendingIntent pendingIntent = pwj.f40481d;
            if (pendingIntent != null) {
                this.f40379n.mo23670a("found a PendingIntent for item %s", pwj);
                Intent intent = new Intent();
                intent.putExtra("android.media.intent.extra.ITEM_ID", this.f40310j.f40478a);
                intent.putExtra("android.media.intent.extra.ITEM_STATUS", mo23716f());
                intent.putExtra("android.media.intent.extra.SESSION_ID", mo23745h());
                puc puc = this.f40307g;
                if (!(puc == null || (e = puc.mo23685e()) == null)) {
                    Bundle a = pwc.m31494a(e);
                    this.f40379n.mo23670a("adding metadata bundle: %s", a.toString());
                    intent.putExtra("android.media.intent.extra.ITEM_METADATA", a);
                }
                try {
                    this.f40379n.mo23670a("Invoking item status PendingIntent with: %s", intent);
                    pendingIntent.send(this.f40380o, 0, intent);
                } catch (PendingIntent.CanceledException e2) {
                    this.f40379n.mo23679f("exception while sending PendingIntent", new Object[0]);
                }
            }
            puc puc2 = this.f40307g;
            if (puc2 != null) {
                MediaStatus mediaStatus = puc2.f40231c;
                if (mediaStatus == null || mediaStatus.f29813e == 1) {
                    this.f40379n.mo23670a("player state is now IDLE; removing tracked item %s", this.f40310j);
                    mo23713a(this.f40310j);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo23352i() {
    }

    /* renamed from: c */
    private final void m31409c(String str, int i) {
        if (str != null && this.f40299H != null) {
            Intent intent = new Intent();
            intent.putExtra("android.media.intent.extra.SESSION_ID", str);
            intent.putExtra("android.media.intent.extra.SESSION_STATUS", mo23717f(i));
            try {
                this.f40379n.mo23670a("Invoking session status PendingIntent with: %s", intent);
                this.f40299H.send(this.f40380o, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                this.f40379n.mo23679f("exception while sending PendingIntent", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private final void m31406a(Intent intent) {
        Locale locale;
        long j = this.f40388w.f39332u | 2;
        Bundle extras = intent.getExtras();
        this.f40375A = intent.getBooleanExtra("com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS", this.f40375A);
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION", true);
        String stringExtra = intent.getStringExtra("com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE");
        if (stringExtra != null) {
            locale = new Locale(stringExtra);
        } else {
            locale = null;
        }
        pfx pfx = new pfx();
        pfx.mo23027a(booleanExtra);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        pfx.f39073a.f29738b = ptk.m31230a(locale);
        this.f40296E = pfx.f39073a;
        this.f40379n.mo23670a("launch options: %s", this.f40296E);
        if (extras.containsKey("com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED")) {
            boolean z = extras.getBoolean("com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED");
            if (!z) {
                j &= -2;
            } else {
                j |= 1;
            }
            this.f40379n.f40220c = z;
        }
        this.f40388w.mo23237a(j);
    }

    /* renamed from: a */
    private final boolean m31407a(put put, int i) {
        String stringExtra = put.f40290a.getStringExtra("android.media.intent.extra.SESSION_ID");
        String h = mo23745h();
        this.f40379n.mo23670a("checkSession() sessionId=%s, currentSessionId=%s", stringExtra, h);
        if (TextUtils.isEmpty(stringExtra)) {
            if (this.f40301J && h != null) {
                this.f40301J = false;
                return true;
            } else if (i == 1) {
                this.f40297F = put;
                this.f40301J = true;
                m31406a(put.f40290a);
                if (this.f40388w.mo23211b()) {
                    mo23739a(this.f40296E);
                } else {
                    this.f40300I = null;
                }
                return false;
            }
        } else if (stringExtra.equals(h)) {
            this.f40301J = false;
            return true;
        } else if (h == null) {
            m31406a(put.f40290a);
            this.f40297F = put;
            if (this.f40388w.mo23211b()) {
                mo23740a(stringExtra);
            } else {
                this.f40300I = stringExtra;
            }
            return false;
        }
        put.mo23710a(2, f40295l);
        return false;
    }

    /* renamed from: f */
    public final Bundle mo23717f(int i) {
        MediaStatus mediaStatus;
        ami ami = new ami(i);
        puc puc = this.f40307g;
        boolean z = false;
        if (!(puc == null || (mediaStatus = puc.f40231c) == null || mediaStatus.f29813e != 3)) {
            z = true;
        }
        ami.f905a.putBoolean("queuePaused", z);
        ami.mo1031a(SystemClock.elapsedRealtime());
        return new amj(ami.f905a).f906a;
    }

    /* renamed from: a */
    public final void mo23697a() {
        this.f40379n.mo23670a("starting pending session for media with session ID %s", this.f40300I);
        if (this.f40297F != null) {
            String str = this.f40300I;
            if (str != null) {
                mo23740a(str);
                this.f40300I = null;
                return;
            }
            mo23739a(this.f40296E);
        }
    }

    /* renamed from: a */
    public final void mo23351a(long j, int i, Object obj) {
        this.f40384s.execute(new pup(this, obj, j, i));
    }

    /* renamed from: a */
    public final void mo23699a(String str, int i) {
        this.f40379n.mo23673b("onSessionStartFailed: %s %s", str, pew.m30274a(i));
        put put = this.f40298G;
        if (put != null) {
            put.mo23710a(2, f40294k);
            this.f40298G = null;
        } else {
            put put2 = this.f40297F;
            if (put2 != null) {
                Intent intent = put2.f40290a;
                if (intent != null && "android.media.intent.action.PLAY".equals(intent.getAction())) {
                    this.f40297F.mo23710a(1, f40293a);
                }
                this.f40297F = null;
            }
        }
        m31409c(str, 1);
    }

    /* renamed from: a */
    public final void mo23700a(String str, ApplicationMetadata applicationMetadata) {
        puc puc;
        this.f40379n.mo23856a("onSessionStarted: %s", str);
        if (this.f40298G != null) {
            Bundle bundle = new Bundle();
            bundle.putString("android.media.intent.extra.SESSION_ID", str);
            this.f40298G.mo23711a(bundle);
            this.f40298G = null;
        }
        m31409c(str, 0);
        if (this.f40391z.equals(applicationMetadata.f29706a)) {
            this.f40379n.mo23670a("attachMediaChannel", new Object[0]);
            puc puc2 = new puc(this.f40385t);
            this.f40307g = puc2;
            puc2.f40233e = new pus(this);
            this.f40388w.mo23244a(this.f40307g);
            put put = this.f40297F;
            if (put != null) {
                mo23712a(put);
                this.f40297F = null;
            }
        }
        if (this.f40308h == -1 && (puc = this.f40307g) != null) {
            try {
                this.f40308h = puc.mo23681a(this);
            } catch (IllegalStateException e) {
                this.f40379n.mo23674b(e, "Exception while requesting media status", new Object[0]);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0130, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0131, code lost:
        r2 = r0;
        r6 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x028a A[Catch:{ JSONException -> 0x0392 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x029e A[Catch:{ JSONException -> 0x0392 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a2 A[Catch:{ JSONException -> 0x0392 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02ab A[Catch:{ JSONException -> 0x0392 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b1 A[Catch:{ JSONException -> 0x0392 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0386 A[Catch:{ JSONException -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03be A[Catch:{ JSONException -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03bf A[Catch:{ JSONException -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03ee A[Catch:{ JSONException -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03ef A[Catch:{ JSONException -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x044a A[Catch:{ IllegalStateException -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04d6 A[Catch:{ IllegalStateException -> 0x04ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130 A[ExcHandler: IllegalStateException (r0v35 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:46:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e2 A[Catch:{ JSONException -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01eb A[Catch:{ JSONException -> 0x0398 }] */
    /* renamed from: a */
    public final void mo23712a(put put) {
        JSONObject jSONObject;
        puu puu;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        put put2;
        String str6;
        puu puu2;
        Uri data;
        put put3;
        puc puc;
        String str7;
        PendingIntent pendingIntent;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject2;
        Bundle bundle;
        JSONException jSONException;
        PendingIntent pendingIntent2;
        puc puc2;
        String str12;
        String str13;
        MediaLoadRequestData mediaLoadRequestData;
        MediaLoadRequestData mediaLoadRequestData2;
        long j;
        JSONObject jSONObject3;
        MediaQueueContainerMetadata mediaQueueContainerMetadata;
        int intValue;
        String str14;
        List list;
        long j2;
        JSONObject jSONObject4;
        String str15;
        Iterator it;
        put put4 = put;
        this.f40379n.mo23670a("processRemotePlaybackRequest()", new Object[0]);
        Intent intent = put4.f40290a;
        String action = intent.getAction();
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.cast.EXTRA_CUSTOM_DATA");
        if (bundleExtra != null) {
            jSONObject = pwc.m31499b(bundleExtra);
        } else {
            jSONObject = null;
        }
        this.f40379n.mo23670a("got remote playback request; action=%s", action);
        try {
            String str16 = "android.media.intent.extra.SESSION_STATUS";
            String str17 = action;
            if (!"android.media.intent.action.PLAY".equals(action)) {
                str3 = "android.media.intent.extra.ITEM_ID";
                str5 = str16;
                str = "exception while processing %s";
                str4 = "type";
                str2 = "requestId";
                puu2 = this;
                put2 = put4;
            } else if (intent.getData() != null) {
                if (intent.getStringExtra("android.media.intent.extra.SESSION_ID") == null) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID");
                    if (TextUtils.isEmpty(stringExtra)) {
                        stringExtra = this.f40311m;
                    }
                    this.f40391z = stringExtra;
                }
                if (m31407a(put4, 1) && (data = intent.getData()) != null) {
                    String str18 = "exception while processing %s";
                    this.f40379n.mo23670a("Device received play request, uri %s", data);
                    MediaMetadata a = pwc.m31496a(intent.getBundleExtra("android.media.intent.extra.ITEM_METADATA"));
                    pga pga = new pga(data.toString());
                    pga.f39074a.f29747b = 1;
                    String type = intent.getType();
                    MediaInfo mediaInfo = pga.f39074a;
                    mediaInfo.f29748c = type;
                    mediaInfo.f29749d = a;
                    Bundle bundleExtra2 = intent.getBundleExtra("android.media.intent.extra.HTTP_HEADERS");
                    if (bundleExtra2 != null) {
                        try {
                            JSONObject b = pwc.m31499b(bundleExtra2);
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put("httpHeaders", b);
                        } catch (JSONException e) {
                        }
                    }
                    long longExtra = intent.getLongExtra("android.media.intent.extra.ITEM_POSITION", 0);
                    PendingIntent pendingIntent3 = (PendingIntent) intent.getParcelableExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER");
                    try {
                        puc puc3 = this.f40307g;
                        pgd pgd = new pgd();
                        pgd.f39075a = mediaInfo;
                        pgd.f39076b = true;
                        pgd.f39077c = jSONObject;
                        MediaLoadRequestData mediaLoadRequestData3 = new MediaLoadRequestData(pgd.f39075a, null, pgd.f39076b, longExtra, 1.0d, null, pgd.f39077c, null, null, null, null, 0);
                        if (mediaLoadRequestData3.f29768b == null) {
                            if (mediaLoadRequestData3.f29769c == null) {
                                throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                            }
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        try {
                            MediaInfo mediaInfo2 = mediaLoadRequestData3.f29768b;
                            if (mediaInfo2 != null) {
                                try {
                                    jSONObject5.put("media", mediaInfo2.mo17526a());
                                } catch (JSONException e2) {
                                    jSONException = e2;
                                    pendingIntent = pendingIntent3;
                                    str10 = "android.media.intent.extra.SESSION_ID";
                                    puc = puc3;
                                    str9 = "android.media.intent.extra.ITEM_STATUS";
                                    str7 = "type";
                                    str8 = "android.media.intent.extra.ITEM_ID";
                                    str11 = "requestId";
                                } catch (IllegalStateException e3) {
                                }
                            }
                            MediaQueueData mediaQueueData = mediaLoadRequestData3.f29769c;
                            String str19 = "autoplay";
                            if (mediaQueueData == null) {
                                pendingIntent = pendingIntent3;
                                str10 = "android.media.intent.extra.SESSION_ID";
                                puc = puc3;
                                mediaLoadRequestData = mediaLoadRequestData3;
                                jSONObject2 = jSONObject5;
                                str13 = str19;
                                str9 = "android.media.intent.extra.ITEM_STATUS";
                                str7 = "type";
                                str8 = "android.media.intent.extra.ITEM_ID";
                                str11 = "requestId";
                            } else {
                                str9 = "android.media.intent.extra.ITEM_STATUS";
                                str8 = "android.media.intent.extra.ITEM_ID";
                                try {
                                    JSONObject jSONObject6 = new JSONObject();
                                    str10 = "android.media.intent.extra.SESSION_ID";
                                    try {
                                        if (!TextUtils.isEmpty(mediaQueueData.f29791a)) {
                                            pendingIntent = pendingIntent3;
                                            jSONObject6.put("id", mediaQueueData.f29791a);
                                        } else {
                                            pendingIntent = pendingIntent3;
                                        }
                                        try {
                                            if (!TextUtils.isEmpty(mediaQueueData.f29792b)) {
                                                jSONObject6.put("entity", mediaQueueData.f29792b);
                                            }
                                            switch (mediaQueueData.f29793c) {
                                                case 1:
                                                    jSONObject6.put("queueType", "ALBUM");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                        jSONObject6.put("name", mediaQueueData.f29794d);
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                        puc = puc3;
                                                        mediaLoadRequestData = mediaLoadRequestData3;
                                                        str7 = "type";
                                                        str11 = "requestId";
                                                    } else {
                                                        JSONObject jSONObject7 = new JSONObject();
                                                        str7 = "type";
                                                        try {
                                                            int i = mediaQueueContainerMetadata.f29786a;
                                                            if (i != 0) {
                                                                puc = puc3;
                                                                if (i == 1) {
                                                                    try {
                                                                        jSONObject7.put("containerType", "AUDIOBOOK_CONTAINER");
                                                                    } catch (JSONException e4) {
                                                                        mediaLoadRequestData = mediaLoadRequestData3;
                                                                        str11 = "requestId";
                                                                        jSONObject6.put("containerMetadata", jSONObject7);
                                                                        intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                                        if (intValue == 0) {
                                                                        }
                                                                        if (str14 != null) {
                                                                        }
                                                                        list = mediaQueueData.f29797g;
                                                                        if (list != null) {
                                                                        }
                                                                        jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                                        j2 = mediaQueueData.f29799i;
                                                                        if (j2 != -1) {
                                                                        }
                                                                        jSONObject2 = jSONObject3;
                                                                        jSONObject2.put("queueData", jSONObject6);
                                                                        mediaLoadRequestData2 = mediaLoadRequestData;
                                                                        jSONObject2.putOpt(str13, mediaLoadRequestData2.f29770d);
                                                                        j = mediaLoadRequestData2.f29771e;
                                                                        if (j == -1) {
                                                                        }
                                                                        jSONObject2.put("playbackRate", mediaLoadRequestData2.f29772f);
                                                                        jSONObject2.putOpt("credentials", mediaLoadRequestData2.f29776j);
                                                                        jSONObject2.putOpt("credentialsType", mediaLoadRequestData2.f29777k);
                                                                        jSONObject2.putOpt("atvCredentials", mediaLoadRequestData2.f29778l);
                                                                        jSONObject2.putOpt("atvCredentialsType", mediaLoadRequestData2.f29779m);
                                                                        if (mediaLoadRequestData2.f29773g == null) {
                                                                        }
                                                                        jSONObject2.putOpt("customData", mediaLoadRequestData2.f29775i);
                                                                        jSONObject2.put(str11, mediaLoadRequestData2.f29780n);
                                                                        if (jSONObject2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                puc = puc3;
                                                                jSONObject7.put("containerType", "GENERIC_CONTAINER");
                                                            }
                                                            if (!TextUtils.isEmpty(mediaQueueContainerMetadata.f29787b)) {
                                                                jSONObject7.put("title", mediaQueueContainerMetadata.f29787b);
                                                            }
                                                            List list2 = mediaQueueContainerMetadata.f29788c;
                                                            if (list2 != null && !list2.isEmpty()) {
                                                                JSONArray jSONArray = new JSONArray();
                                                                for (Iterator it2 = mediaQueueContainerMetadata.f29788c.iterator(); it2.hasNext(); it2 = it2) {
                                                                    jSONArray.put(((MediaMetadata) it2.next()).mo17537a());
                                                                }
                                                                jSONObject7.put("sections", jSONArray);
                                                            }
                                                            List list3 = mediaQueueContainerMetadata.f29789d;
                                                            if (list3 != null) {
                                                                if (!list3.isEmpty()) {
                                                                    jSONObject7.put("containerImages", pui.m31377a(mediaQueueContainerMetadata.f29789d));
                                                                }
                                                            }
                                                            mediaLoadRequestData = mediaLoadRequestData3;
                                                            str11 = "requestId";
                                                            try {
                                                                jSONObject7.put("containerDuration", mediaQueueContainerMetadata.f29790e);
                                                            } catch (JSONException e5) {
                                                            }
                                                        } catch (JSONException e6) {
                                                            puc = puc3;
                                                            mediaLoadRequestData = mediaLoadRequestData3;
                                                            str11 = "requestId";
                                                            jSONObject6.put("containerMetadata", jSONObject7);
                                                            intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                            if (intValue == 0) {
                                                            }
                                                            if (str14 != null) {
                                                            }
                                                            list = mediaQueueData.f29797g;
                                                            if (list != null) {
                                                            }
                                                            jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                            j2 = mediaQueueData.f29799i;
                                                            if (j2 != -1) {
                                                            }
                                                            jSONObject2 = jSONObject3;
                                                            jSONObject2.put("queueData", jSONObject6);
                                                            mediaLoadRequestData2 = mediaLoadRequestData;
                                                            jSONObject2.putOpt(str13, mediaLoadRequestData2.f29770d);
                                                            j = mediaLoadRequestData2.f29771e;
                                                            if (j == -1) {
                                                            }
                                                            jSONObject2.put("playbackRate", mediaLoadRequestData2.f29772f);
                                                            jSONObject2.putOpt("credentials", mediaLoadRequestData2.f29776j);
                                                            jSONObject2.putOpt("credentialsType", mediaLoadRequestData2.f29777k);
                                                            jSONObject2.putOpt("atvCredentials", mediaLoadRequestData2.f29778l);
                                                            jSONObject2.putOpt("atvCredentialsType", mediaLoadRequestData2.f29779m);
                                                            if (mediaLoadRequestData2.f29773g == null) {
                                                            }
                                                            jSONObject2.putOpt("customData", mediaLoadRequestData2.f29775i);
                                                            jSONObject2.put(str11, mediaLoadRequestData2.f29780n);
                                                            if (jSONObject2 != null) {
                                                            }
                                                        }
                                                        try {
                                                            jSONObject6.put("containerMetadata", jSONObject7);
                                                        } catch (JSONException e7) {
                                                            jSONObject3 = jSONObject5;
                                                            str13 = str19;
                                                        }
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                        str14 = intValue != 1 ? intValue != 2 ? intValue != 3 ? null : "REPEAT_ALL_AND_SHUFFLE" : "REPEAT_SINGLE" : "REPEAT_ALL";
                                                    } else {
                                                        str14 = "REPEAT_OFF";
                                                    }
                                                    if (str14 != null) {
                                                        jSONObject6.put("repeatMode", str14);
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                        jSONObject4 = jSONObject5;
                                                        str15 = str19;
                                                    } else if (!list.isEmpty()) {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        Iterator it3 = mediaQueueData.f29797g.iterator();
                                                        while (it3.hasNext()) {
                                                            MediaQueueItem mediaQueueItem = (MediaQueueItem) it3.next();
                                                            JSONObject jSONObject8 = new JSONObject();
                                                            try {
                                                                MediaInfo mediaInfo3 = mediaQueueItem.f29800a;
                                                                if (mediaInfo3 != null) {
                                                                    jSONObject8.put("media", mediaInfo3.mo17526a());
                                                                }
                                                                int i2 = mediaQueueItem.f29801b;
                                                                if (i2 != 0) {
                                                                    jSONObject8.put("itemId", i2);
                                                                }
                                                                jSONObject8.put(str19, mediaQueueItem.f29802c);
                                                                if (!Double.isNaN(mediaQueueItem.f29803d)) {
                                                                    jSONObject3 = jSONObject5;
                                                                    try {
                                                                        jSONObject8.put("startTime", mediaQueueItem.f29803d);
                                                                    } catch (JSONException e8) {
                                                                        it = it3;
                                                                        str13 = str19;
                                                                        jSONArray2.put(jSONObject8);
                                                                        jSONObject5 = jSONObject3;
                                                                        it3 = it;
                                                                        str19 = str13;
                                                                    }
                                                                } else {
                                                                    jSONObject3 = jSONObject5;
                                                                }
                                                                double d = mediaQueueItem.f29804e;
                                                                if (d != Double.POSITIVE_INFINITY) {
                                                                    jSONObject8.put("playbackDuration", d);
                                                                }
                                                                jSONObject8.put("preloadTime", mediaQueueItem.f29805f);
                                                                if (mediaQueueItem.f29806g != null) {
                                                                    JSONArray jSONArray3 = new JSONArray();
                                                                    long[] jArr = mediaQueueItem.f29806g;
                                                                    int length = jArr.length;
                                                                    it = it3;
                                                                    int i3 = 0;
                                                                    while (i3 < length) {
                                                                        int i4 = length;
                                                                        str13 = str19;
                                                                        try {
                                                                            jSONArray3.put(jArr[i3]);
                                                                            i3++;
                                                                            str19 = str13;
                                                                            length = i4;
                                                                        } catch (JSONException e9) {
                                                                        }
                                                                    }
                                                                    try {
                                                                        jSONObject8.put("activeTrackIds", jSONArray3);
                                                                        str13 = str19;
                                                                    } catch (JSONException e10) {
                                                                        str13 = str19;
                                                                        jSONArray2.put(jSONObject8);
                                                                        jSONObject5 = jSONObject3;
                                                                        it3 = it;
                                                                        str19 = str13;
                                                                    }
                                                                } else {
                                                                    it = it3;
                                                                    str13 = str19;
                                                                }
                                                                JSONObject jSONObject9 = mediaQueueItem.f29808i;
                                                                if (jSONObject9 != null) {
                                                                    jSONObject8.put("customData", jSONObject9);
                                                                }
                                                            } catch (JSONException e11) {
                                                                it = it3;
                                                                jSONObject3 = jSONObject5;
                                                                str13 = str19;
                                                                jSONArray2.put(jSONObject8);
                                                                jSONObject5 = jSONObject3;
                                                                it3 = it;
                                                                str19 = str13;
                                                            }
                                                            try {
                                                                jSONArray2.put(jSONObject8);
                                                                jSONObject5 = jSONObject3;
                                                                it3 = it;
                                                                str19 = str13;
                                                            } catch (JSONException e12) {
                                                            }
                                                        }
                                                        jSONObject4 = jSONObject5;
                                                        str15 = str19;
                                                        jSONObject6.put("items", jSONArray2);
                                                    } else {
                                                        jSONObject4 = jSONObject5;
                                                        str15 = str19;
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                        jSONObject6.put("startTime", ptk.m31227a(j2));
                                                    }
                                                    break;
                                                case 2:
                                                    jSONObject6.put("queueType", "PLAYLIST");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 3:
                                                    jSONObject6.put("queueType", "AUDIOBOOK");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 4:
                                                    jSONObject6.put("queueType", "RADIO_STATION");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 5:
                                                    jSONObject6.put("queueType", "PODCAST_SERIES");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 6:
                                                    jSONObject6.put("queueType", "TV_SERIES");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 7:
                                                    jSONObject6.put("queueType", "VIDEO_PLAYLIST");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 8:
                                                    jSONObject6.put("queueType", "LIVE_TV");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                case 9:
                                                    jSONObject6.put("queueType", "MOVIE");
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                                default:
                                                    if (!TextUtils.isEmpty(mediaQueueData.f29794d)) {
                                                    }
                                                    mediaQueueContainerMetadata = mediaQueueData.f29795e;
                                                    if (mediaQueueContainerMetadata != null) {
                                                    }
                                                    intValue = Integer.valueOf(mediaQueueData.f29796f).intValue();
                                                    if (intValue == 0) {
                                                    }
                                                    if (str14 != null) {
                                                    }
                                                    list = mediaQueueData.f29797g;
                                                    if (list != null) {
                                                    }
                                                    jSONObject6.put("startIndex", mediaQueueData.f29798h);
                                                    j2 = mediaQueueData.f29799i;
                                                    if (j2 != -1) {
                                                    }
                                                    break;
                                            }
                                        } catch (JSONException e13) {
                                        }
                                    } catch (JSONException e14) {
                                        pendingIntent = pendingIntent3;
                                        puc = puc3;
                                        mediaLoadRequestData = mediaLoadRequestData3;
                                        jSONObject3 = jSONObject5;
                                        str13 = str19;
                                        str7 = "type";
                                        str11 = "requestId";
                                        jSONObject2 = jSONObject3;
                                        jSONObject2.put("queueData", jSONObject6);
                                        mediaLoadRequestData2 = mediaLoadRequestData;
                                        jSONObject2.putOpt(str13, mediaLoadRequestData2.f29770d);
                                        j = mediaLoadRequestData2.f29771e;
                                        if (j == -1) {
                                        }
                                        jSONObject2.put("playbackRate", mediaLoadRequestData2.f29772f);
                                        jSONObject2.putOpt("credentials", mediaLoadRequestData2.f29776j);
                                        jSONObject2.putOpt("credentialsType", mediaLoadRequestData2.f29777k);
                                        jSONObject2.putOpt("atvCredentials", mediaLoadRequestData2.f29778l);
                                        jSONObject2.putOpt("atvCredentialsType", mediaLoadRequestData2.f29779m);
                                        if (mediaLoadRequestData2.f29773g == null) {
                                        }
                                        jSONObject2.putOpt("customData", mediaLoadRequestData2.f29775i);
                                        jSONObject2.put(str11, mediaLoadRequestData2.f29780n);
                                        if (jSONObject2 != null) {
                                        }
                                    }
                                    jSONObject2 = jSONObject3;
                                    try {
                                        jSONObject2.put("queueData", jSONObject6);
                                    } catch (JSONException e15) {
                                        e = e15;
                                        jSONException = e;
                                        try {
                                            MediaLoadRequestData.f29767a.mo23677d("Error transforming MediaLoadRequestData into JSONObject", jSONException);
                                            jSONObject2 = null;
                                            if (jSONObject2 != null) {
                                            }
                                        } catch (IllegalStateException e16) {
                                            e = e16;
                                            puu = this;
                                            put3 = put;
                                            IllegalStateException illegalStateException = e;
                                            try {
                                                puu.f40379n.mo23674b(illegalStateException, str18, str17);
                                                put3.mo23710a(1, f40293a);
                                                return;
                                            } catch (IllegalStateException e17) {
                                                e = e17;
                                                puu.f40379n.mo23670a("can't process command; %s", e.getMessage());
                                            }
                                        }
                                    }
                                } catch (JSONException e18) {
                                    e = e18;
                                    pendingIntent2 = pendingIntent3;
                                    str10 = "android.media.intent.extra.SESSION_ID";
                                    puc2 = puc3;
                                    str12 = "type";
                                    str11 = "requestId";
                                    jSONException = e;
                                    MediaLoadRequestData.f29767a.mo23677d("Error transforming MediaLoadRequestData into JSONObject", jSONException);
                                    jSONObject2 = null;
                                    if (jSONObject2 != null) {
                                    }
                                }
                            }
                            mediaLoadRequestData2 = mediaLoadRequestData;
                            jSONObject2.putOpt(str13, mediaLoadRequestData2.f29770d);
                            j = mediaLoadRequestData2.f29771e;
                            if (j == -1) {
                                jSONObject2.put("currentTime", ptk.m31227a(j));
                            }
                            jSONObject2.put("playbackRate", mediaLoadRequestData2.f29772f);
                            jSONObject2.putOpt("credentials", mediaLoadRequestData2.f29776j);
                            jSONObject2.putOpt("credentialsType", mediaLoadRequestData2.f29777k);
                            jSONObject2.putOpt("atvCredentials", mediaLoadRequestData2.f29778l);
                            jSONObject2.putOpt("atvCredentialsType", mediaLoadRequestData2.f29779m);
                            if (mediaLoadRequestData2.f29773g == null) {
                                JSONArray jSONArray4 = new JSONArray();
                                int i5 = 0;
                                while (true) {
                                    long[] jArr2 = mediaLoadRequestData2.f29773g;
                                    if (i5 < jArr2.length) {
                                        jSONArray4.put(i5, jArr2[i5]);
                                        i5++;
                                    } else {
                                        jSONObject2.put("activeTrackIds", jSONArray4);
                                    }
                                }
                            }
                            jSONObject2.putOpt("customData", mediaLoadRequestData2.f29775i);
                            jSONObject2.put(str11, mediaLoadRequestData2.f29780n);
                        } catch (JSONException e19) {
                            e = e19;
                            pendingIntent2 = pendingIntent3;
                            str10 = "android.media.intent.extra.SESSION_ID";
                            puc2 = puc3;
                            str9 = "android.media.intent.extra.ITEM_STATUS";
                            str12 = "type";
                            str8 = "android.media.intent.extra.ITEM_ID";
                            str11 = "requestId";
                            jSONException = e;
                            MediaLoadRequestData.f29767a.mo23677d("Error transforming MediaLoadRequestData into JSONObject", jSONException);
                            jSONObject2 = null;
                            if (jSONObject2 != null) {
                            }
                        }
                        if (jSONObject2 != null) {
                            long c = puc.mo23633c();
                            try {
                                jSONObject2.put(str11, c);
                                jSONObject2.put(str7, "LOAD");
                            } catch (JSONException e20) {
                            }
                            puc.mo23630a(jSONObject2.toString(), c, (String) null);
                            puu = this;
                            try {
                                puc.f40234f.mo23689a(c, puu);
                                pwj pwj = new pwj(pwj.m31514a(), c);
                                pwj.f40481d = pendingIntent;
                                puu.f40309i.add(pwj);
                                puu.f40308h = -1;
                                puu.f40379n.mo23670a("loading media with item id assigned as %s, request ID %d", pwj.f40478a, Long.valueOf(c));
                                bundle = new Bundle();
                                bundle.putString(str10, mo23745h());
                                bundle.putParcelable(str16, puu.mo23717f(0));
                                bundle.putString(str8, pwj.f40478a);
                                akl akl = new akl(3);
                                akl.mo877a(SystemClock.elapsedRealtime());
                                bundle.putBundle(str9, akl.mo876a().f775a);
                                put3 = put;
                            } catch (IllegalStateException e21) {
                                e = e21;
                                put3 = put;
                                IllegalStateException illegalStateException2 = e;
                                puu.f40379n.mo23674b(illegalStateException2, str18, str17);
                                put3.mo23710a(1, f40293a);
                                return;
                            }
                            try {
                                put3.mo23711a(bundle);
                                return;
                            } catch (IllegalStateException e22) {
                                e = e22;
                                IllegalStateException illegalStateException22 = e;
                                puu.f40379n.mo23674b(illegalStateException22, str18, str17);
                                put3.mo23710a(1, f40293a);
                                return;
                            }
                        } else {
                            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
                        }
                    } catch (IllegalStateException e23) {
                        e = e23;
                        puu = this;
                        put3 = put;
                        IllegalStateException illegalStateException222 = e;
                        puu.f40379n.mo23674b(illegalStateException222, str18, str17);
                        put3.mo23710a(1, f40293a);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                str3 = "android.media.intent.extra.ITEM_ID";
                str5 = str16;
                str = "exception while processing %s";
                str4 = "type";
                str2 = "requestId";
                puu2 = this;
                put2 = put4;
            }
            String str20 = "customData";
            String str21 = str17;
            if (str21.equals("android.media.intent.action.PAUSE")) {
                String str22 = str;
                if (puu.m31407a(put2, 0)) {
                    try {
                        long a2 = puu.f40307g.mo23682a(puu, jSONObject);
                        puu.f40304d = put2;
                        put2.f40292c = a2;
                    } catch (IllegalStateException | pua e24) {
                        puu.f40379n.mo23674b(e24, str22, str21);
                        put2.mo23710a(1, f40293a);
                    }
                }
            } else if (!str21.equals("android.media.intent.action.RESUME")) {
                String str23 = "currentTime";
                if (str21.equals("android.media.intent.action.STOP")) {
                    String str24 = str;
                    String str25 = str20;
                    if (puu.m31407a(put2, 0)) {
                        try {
                            puc puc4 = puu.f40307g;
                            JSONObject jSONObject10 = new JSONObject();
                            long c2 = puc4.mo23633c();
                            try {
                                jSONObject10.put(str2, c2);
                                jSONObject10.put(str4, "STOP");
                                jSONObject10.put("mediaSessionId", puc4.mo23686f());
                                if (jSONObject != null) {
                                    jSONObject10.put(str25, jSONObject);
                                }
                            } catch (JSONException e25) {
                            }
                            puc4.mo23630a(jSONObject10.toString(), c2, (String) null);
                            puc4.f40237j.mo23689a(c2, puu);
                            puu.f40306f = put2;
                            put2.f40292c = c2;
                        } catch (IllegalStateException | pua e26) {
                            puu.f40379n.mo23674b(e26, str24, str21);
                            put2.mo23710a(1, f40293a);
                        }
                    }
                } else if (!str21.equals("android.media.intent.action.SEEK")) {
                    if (!str21.equals("android.media.intent.action.GET_STATUS")) {
                        if (!str21.equals("com.google.android.gms.cast.ACTION_SYNC_STATUS")) {
                            if (str21.equals("android.media.intent.action.START_SESSION")) {
                                String stringExtra2 = intent.getStringExtra("com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID");
                                if (TextUtils.isEmpty(stringExtra2)) {
                                    stringExtra2 = puu.f40311m;
                                }
                                PendingIntent pendingIntent4 = (PendingIntent) intent.getParcelableExtra("android.media.intent.extra.SESSION_STATUS_UPDATE_RECEIVER");
                                if (pendingIntent4 == null) {
                                    puu.f40379n.mo23670a("No status update receiver supplied to %s", str21);
                                    return;
                                }
                                puu.f40299H = pendingIntent4;
                                puu.f40391z = stringExtra2;
                                puu.f40298G = put2;
                                puu.m31407a(put2, 1);
                            } else if (str21.equals("android.media.intent.action.GET_SESSION_STATUS")) {
                                puu.m31407a(put2, 0);
                                Bundle bundle2 = new Bundle();
                                bundle2.putParcelable(str5, puu.mo23717f(0));
                                put2.mo23711a(bundle2);
                            } else if (str21.equals("android.media.intent.action.END_SESSION")) {
                                puu.m31407a(put2, 0);
                                puu.m31409c(mo23745h(), 1);
                                puu.f40299H = null;
                                puu.mo23744c(false);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable(str5, puu.mo23717f(1));
                                put2.mo23711a(bundle3);
                            }
                        } else if (puu.m31407a(put2, 0)) {
                            puc puc5 = puu.f40307g;
                            if (puc5 != null) {
                                try {
                                    if (puu.f40308h == -1) {
                                        puu.f40308h = puc5.mo23681a(puu);
                                    }
                                    puu.f40302b = put2;
                                } catch (IllegalStateException e27) {
                                    IllegalStateException illegalStateException3 = e27;
                                    puu.f40302b = null;
                                    puu.f40379n.mo23674b(illegalStateException3, str, str21);
                                    put2.mo23710a(1, f40293a);
                                }
                            } else {
                                put2.mo23710a(2, f40295l);
                            }
                        }
                    } else if (puu.m31407a(put2, 0)) {
                        puu.m31408c(intent.getStringExtra(str3));
                        if (puu.f40307g != null) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putParcelable("android.media.intent.extra.ITEM_STATUS", mo23716f());
                            bundle4.putParcelable(str5, puu.mo23717f(0));
                            put2.mo23711a(bundle4);
                            return;
                        }
                        put2.mo23710a(2, f40295l);
                    }
                } else if (puu.m31407a(put2, 0)) {
                    puu.m31408c(intent.getStringExtra(str3));
                    long longExtra2 = intent.getLongExtra("android.media.intent.extra.ITEM_POSITION", 0);
                    try {
                        puu.f40379n.mo23670a("seeking to %d ms", Long.valueOf(longExtra2));
                        puc puc6 = puu.f40307g;
                        pgn pgn = new pgn();
                        pgn.f39084a = jSONObject;
                        pgo pgo = new pgo(longExtra2, pgn.f39084a);
                        JSONObject jSONObject11 = new JSONObject();
                        long c3 = puc6.mo23633c();
                        str6 = str;
                        try {
                            long j3 = pgo.f39085a;
                            try {
                                jSONObject11.put(str2, c3);
                                jSONObject11.put(str4, "SEEK");
                                jSONObject11.put("mediaSessionId", puc6.mo23686f());
                                jSONObject11.put(str23, ptk.m31227a(j3));
                                JSONObject jSONObject12 = pgo.f39086b;
                                if (jSONObject12 != null) {
                                    jSONObject11.put(str20, jSONObject12);
                                }
                            } catch (JSONException e28) {
                            }
                            puc6.mo23630a(jSONObject11.toString(), c3, (String) null);
                            puc6.f40232d = Long.valueOf(j3);
                            puc6.f40238k.mo23689a(c3, new pty(puc6, puu));
                            puu.f40303c = put2;
                            put2.f40292c = c3;
                        } catch (IllegalStateException | pua e29) {
                            e = e29;
                            puu.f40379n.mo23674b(e, str6, str21);
                            put2.mo23710a(1, f40293a);
                        }
                    } catch (IllegalStateException | pua e30) {
                        e = e30;
                        str6 = str;
                        puu.f40379n.mo23674b(e, str6, str21);
                        put2.mo23710a(1, f40293a);
                    }
                }
            } else {
                String str26 = str;
                if (puu.m31407a(put2, 0)) {
                    try {
                        long b2 = puu.f40307g.mo23683b(puu, jSONObject);
                        puu.f40305e = put2;
                        put2.f40292c = b2;
                    } catch (IllegalStateException | pua e31) {
                        puu.f40379n.mo23674b(e31, str26, str21);
                        put2.mo23710a(1, f40293a);
                    }
                }
            }
        } catch (IllegalStateException e32) {
            e = e32;
            puu = this;
            puu.f40379n.mo23670a("can't process command; %s", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo23713a(pwj pwj) {
        if (this.f40310j == pwj) {
            this.f40310j = null;
        }
        this.f40379n.mo23670a("removeTrackedItem() for item ID %s, load request %d, media session ID %d", pwj.f40478a, Long.valueOf(pwj.f40479b), Long.valueOf(pwj.f40480c));
        this.f40309i.remove(pwj);
    }

    /* renamed from: a */
    public final void mo23714a(pwj pwj, int i, Bundle bundle) {
        this.f40379n.mo23670a("sendPlaybackStateForItem for item: %s, playbackState: %d", pwj, Integer.valueOf(i));
        if (pwj.f40481d != null) {
            Intent intent = new Intent();
            intent.putExtra("android.media.intent.extra.ITEM_ID", pwj.f40478a);
            akl akl = new akl(i);
            akl.mo877a(SystemClock.elapsedRealtime());
            if (bundle != null) {
                akl.mo878a(bundle);
            }
            intent.putExtra("android.media.intent.extra.ITEM_STATUS", akl.mo876a().f775a);
            try {
                pwj.f40481d.send(this.f40380o, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                this.f40379n.mo23679f("exception while sending PendingIntent", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo939a(Intent intent, alo alo) {
        this.f40379n.mo23670a("Received control request %s", intent);
        this.f40384s.execute(new puo(this, intent, alo));
        return true;
    }
}
