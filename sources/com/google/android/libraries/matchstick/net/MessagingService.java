package com.google.android.libraries.matchstick.net;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessagingService extends Service implements azga, azfy {

    /* renamed from: a */
    static final azfz f111081a = new azfz("messaging_service_start_wakelock");

    /* renamed from: b */
    azhy f111082b = null;

    /* renamed from: c */
    public final Object f111083c = new Object();

    /* renamed from: d */
    public final HashSet f111084d = new HashSet();

    /* renamed from: e */
    public azfz f111085e;

    /* renamed from: f */
    public azfx f111086f;

    /* renamed from: g */
    public Map f111087g = new ConcurrentHashMap();

    /* renamed from: h */
    public volatile boolean f111088h;

    /* renamed from: i */
    public volatile String f111089i;

    /* renamed from: j */
    public azph f111090j;

    /* renamed from: k */
    public azfo f111091k;

    /* renamed from: l */
    public azdl f111092l;

    /* renamed from: m */
    public Context f111093m;

    /* renamed from: n */
    public boolean f111094n;

    /* renamed from: o */
    private final azfb f111095o = new azfb(this);

    /* renamed from: p */
    private azey f111096p;

    /* renamed from: q */
    private final Handler f111097q = new adzt();

    /* renamed from: r */
    private azef f111098r;

    /* renamed from: s */
    private volatile int f111099s;

    /* renamed from: a */
    public static cbex m94555a(String str) {
        return (cbex) azol.m85935a((bxxk) cbex.f176860f.mo74142c(7), sqd.m35969b(str));
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
    public static void m94557b(Intent intent, Context context) {
        bmxy.m108581a(intent);
        intent.setClassName(context, "com.google.android.gms.matchstick.net.MessagingService");
        intent.putExtra("require_bind", false);
        context.startService(intent);
    }

    /* renamed from: c */
    public static void m94558c(Intent intent, Context context) {
        Executor executor = azox.f99803a;
        if (spn.m35876d(context, "com.google.android.gms.matchstick.net.MessagingService") == 1) {
            f111081a.mo54889a(context);
            if (!m94556a(intent, context)) {
                f111081a.mo54888a();
                azoj.m85933c("MessagingService", "Failed to start messaging service", new Object[0]);
            }
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
    /* renamed from: d */
    public static void m94560d(Intent intent, Context context) {
        Executor executor = azox.f99803a;
        if (spn.m35876d(context, "com.google.android.gms.matchstick.net.MessagingService") == 1) {
            f111081a.mo54889a(context);
            intent.putExtra("require_bind", false);
            if (!m94556a(intent, context)) {
                f111081a.mo54888a();
                azoj.m85933c("MessagingService", "Failed to start messaging service", new Object[0]);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        new Object[1][0] = intent;
        if (!cfgs.m139400f() || !TextUtils.equals(azez.class.getName(), intent.getAction())) {
            this.f111088h = true;
            return this.f111095o;
        }
        if (this.f111096p == null) {
            azoj.m85932b("MessagingService", "Null LighterWebService stub when attempting to bind, constructing now.", new Object[0]);
            this.f111096p = new azey(this, new azed(this));
        }
        return this.f111096p;
    }

    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (cfgs.m139400f()) {
            this.f111096p = new azey(applicationContext, new azed(applicationContext));
        }
        azfo a = azfo.m85593a(applicationContext);
        azcl a2 = azcl.m85289a(applicationContext);
        azfx azfx = new azfx(this);
        azdl a3 = azdl.m85412a(applicationContext);
        azef azef = new azef(applicationContext, a2, a, this, azfx, new azdm(applicationContext, a2), srb.f45012a, azcv.m85357a(applicationContext));
        azph a4 = azph.m85998a(applicationContext);
        this.f111093m = applicationContext;
        this.f111091k = a;
        this.f111098r = azef;
        this.f111090j = a4;
        this.f111086f = azfx;
        this.f111092l = a3;
        synchronized (this.f111083c) {
            this.f111085e = new azfz("messaging_service_work_wakelock");
        }
        this.f111094n = true;
        azbm.m85205a(applicationContext).f98909d.mo54575a(this);
    }

    public final void onDestroy() {
        for (Map.Entry entry : this.f111087g.entrySet()) {
            azet azet = (azet) entry.getValue();
            azox.m85981a();
            azet.f99195k.mo54886b("close bind connection from onDestroy", new azel(azet));
            this.f111087g.remove(entry.getKey());
        }
        azfx azfx = this.f111086f;
        synchronized (azfx.f99253a) {
            azfx.f99254b.shutdown();
            azfx.f99255c.shutdown();
        }
    }

    public final void onRebind(Intent intent) {
        this.f111088h = true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0668, code lost:
        if (r12.equals("com.google.android.apps.libraries.matchstick.action.GET_APP_DATA") != false) goto L_0x0676;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x085e, code lost:
        if (r6.equals("report_status") != false) goto L_0x0862;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0328 A[Catch:{ all -> 0x05d9, SQLiteException -> 0x0901, all -> 0x08fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0713 A[Catch:{ all -> 0x05d9, SQLiteException -> 0x0901, all -> 0x08fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0878 A[Catch:{ all -> 0x05d9, SQLiteException -> 0x0901, all -> 0x08fb }] */
    public final int onStartCommand(Intent intent, int i, int i2) {
        char c;
        Cursor cursor;
        Throwable th;
        char c2;
        Intent intent2 = intent;
        if (intent2 == null) {
            return 2;
        }
        String valueOf = String.valueOf(Integer.toString(i2));
        Intent intent3 = new Intent(valueOf.length() == 0 ? new String("onStartCommand -- ") : "onStartCommand -- ".concat(valueOf));
        mo54891a(intent3);
        f111081a.mo54888a();
        try {
            this.f111099s = i2;
            char c3 = 0;
            try {
                aptm.m70976a(this);
            } catch (rfv | rfw e) {
                azoj.m85931a("MessagingService", e, "Google play services not available", new Object[0]);
                azph.m85998a(this.f111093m).mo55126a(125, 20);
            }
            this.f111086f.mo54886b("setup_streaming_connection", new azfj(this, intent2));
            if (intent.getAction() != null) {
                new Object[1][0] = intent.getAction();
                String action = intent.getAction();
                char c4 = 65535;
                switch (action.hashCode()) {
                    case -1973573035:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.GET_ENTITY_PROFILE")) {
                            c = 9;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1882923940:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.BLOCK_USER")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1829182896:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.GET_APP_DATA")) {
                            c = 10;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1696409343:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.SET_ANONYMOUS_CHAT_DISPLAY_NAME")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1614313097:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.NOTIFICATION_CLEARED")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1584779440:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.BLOCK_APP")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1430717622:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.SYNC_BLOCKED_APPS")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1398950878:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.erase_all_messages")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1329354997:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.ping_bind")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1308302129:
                        if (action.equals("set_default_user_action")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1185042145:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.settings_account_init")) {
                            c = 12;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1060466684:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case -974417237:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.open_bind_connection_action")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -668649573:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.close_bind_connection_action")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -576843482:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.save_message_draft")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -562436839:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.SYNC_ENABLED_APPS_METADATA")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -415462300:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.RETRIGGER_NOTIFICATION")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -406146248:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case 39065478:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.POST_ALL_LIGHTER_CONVERSATION_NOTIFICATIONS")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 55258832:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.RENOTIFY_LIGHTER_CONVERSATIONS")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115803805:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.GET_OR_SYNC_APP_METADATA")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 310796951:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.FORWARD_TO_NATIVE_APP_INTENT")) {
                            c = 13;
                            break;
                        }
                        c = 65535;
                        break;
                    case 337786648:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.TRIGGER_SPAM_SIGNAL")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 555580567:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725466307:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.tickle_handle_action")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 889454223:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.SEND_READ_RECEIPT_MESSAGE")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1077123347:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.LIGHTER_NOTIFICATION_CLEARED")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1130801769:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.lighter_message_action")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1194598309:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.send_matchstick_msg")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1363983877:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.look_up_registered")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1385791020:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.DELETE_DRAFT")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1429038563:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.send_image")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1483332490:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.call_signal")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1655214846:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.ERASE_ALL_LIGHTER_MESSAGES")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1710899437:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.SEND_DELIVERY_RECEIPT_MESSAGE")) {
                            c = 8;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1984537307:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.SAVE_INTRO_MSG_AND_PROMPT_ID_ACTION")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2080107412:
                        if (action.equals("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        new soa(9, new azfe(this, intent2)).start();
                        break;
                    case 1:
                        if (intent2.hasExtra("launch_session_id")) {
                            azpk.m86089a(this.f111093m).mo55177a(intent2.getStringExtra("launch_session_id"));
                        }
                        if (intent2.hasExtra("launch_entry_intent")) {
                            azpk.m86089a(this.f111093m).mo55176a(intent2.getIntExtra("launch_entry_intent", 0));
                        }
                        if (intent2.hasExtra("launch_entry_point")) {
                            azpk.m86089a(this.f111093m).mo55181b(intent2.getStringExtra("launch_entry_point"));
                        }
                        new soa(9, new azff(this, intent2)).start();
                        break;
                    case 2:
                        new soa(9, new azfg(this)).start();
                        break;
                    case 3:
                        String stringExtra = intent2.getStringExtra("command_type");
                        int hashCode = stringExtra.hashCode();
                        if (hashCode != -736823971) {
                            if (hashCode == 108404047 && stringExtra.equals("reset")) {
                                c3 = 1;
                                if (c3 == 0) {
                                    if (c3 == 1) {
                                        azia azia = new azia(this.f111093m, this.f111086f);
                                        this.f111082b = azia;
                                        azia.mo54939a(intent2);
                                        break;
                                    }
                                } else {
                                    azhz azhz = new azhz(this.f111093m, this.f111086f);
                                    this.f111082b = azhz;
                                    azhz.mo54939a(intent2);
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                        c3 = 65535;
                        if (c3 == 0) {
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        char c5 = 5;
                        Context context = this.f111093m;
                        azef azef = this.f111098r;
                        String action2 = intent.getAction();
                        switch (action2.hashCode()) {
                            case -1973573035:
                                if (action2.equals("com.google.android.apps.libraries.matchstick.action.GET_ENTITY_PROFILE")) {
                                    c5 = 4;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1829182896:
                                break;
                            case -576843482:
                                if (action2.equals("com.google.android.apps.libraries.matchstick.action.save_message_draft")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -562436839:
                                if (action2.equals("com.google.android.apps.libraries.matchstick.action.SYNC_ENABLED_APPS_METADATA")) {
                                    c5 = 6;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 889454223:
                                if (action2.equals("com.google.android.apps.libraries.matchstick.action.SEND_READ_RECEIPT_MESSAGE")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1194598309:
                                if (action2.equals("com.google.android.apps.libraries.matchstick.action.send_matchstick_msg")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1710899437:
                                if (action2.equals("com.google.android.apps.libraries.matchstick.action.SEND_DELIVERY_RECEIPT_MESSAGE")) {
                                    c5 = 3;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                                String stringExtra2 = intent2.getStringExtra("text_to_send");
                                String stringExtra3 = intent2.getStringExtra("conversation_id");
                                boolean booleanExtra = intent2.getBooleanExtra("save_draft_after_send", false);
                                boolean booleanExtra2 = intent2.getBooleanExtra("show_toast_after_sent", false);
                                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2.trim())) {
                                    new azhp(azef.f99150a, azef.f99156g, stringExtra2, stringExtra3, azef.f99155f, azef.f99154e, azef.f99152c, booleanExtra, azef.f99151b, booleanExtra2).mo54921a();
                                    break;
                                }
                            case 1:
                                new azhq(azef.f99150a, azef.f99156g, intent2.getStringExtra("inbox_msg_id"), intent2.getStringExtra("conversation_id"), azef.f99155f, azef.f99154e, azef.f99151b, azef.f99152c, intent2.getLongExtra("retry_deadline", SystemClock.elapsedRealtime() + cfeo.m138851H()), intent2.getBooleanExtra("is_resend", false), intent2.getBooleanExtra("show_toast_after_sent", false)).mo54921a();
                                break;
                            case 2:
                                String stringExtra4 = intent2.getStringExtra("conversation_id");
                                azfo.m85593a(context);
                                azef.mo54825a(4, stringExtra4, azfo.m85594b(intent));
                                break;
                            case 3:
                                String stringExtra5 = intent2.getStringExtra("conversation_id");
                                azfo.m85593a(context);
                                azef.mo54825a(3, stringExtra5, azfo.m85594b(intent));
                                break;
                            case 4:
                                long longExtra = intent2.getLongExtra("update_profile_id", -1);
                                String stringExtra6 = intent2.getStringExtra("entity_id");
                                int intExtra = intent2.getIntExtra("entity_type", -1);
                                String stringExtra7 = intent2.getStringExtra("server_app_id");
                                boolean booleanExtra3 = intent2.getBooleanExtra("update_profile_notifyconversation", false);
                                LocalEntityId a = azoi.m85924a(intent);
                                Context context2 = azef.f99150a;
                                azfx azfx = azef.f99156g;
                                azfo azfo = azef.f99152c;
                                MessagingService messagingService = azef.f99154e;
                                azcl azcl = azef.f99151b;
                                sqv sqv = azef.f99159j;
                                new azhi(context2, a, azfx, azfo, longExtra, stringExtra6, messagingService, azcl, intExtra, stringExtra7, booleanExtra3).mo54921a();
                                break;
                            case 5:
                                String stringExtra8 = intent2.getStringExtra("server_app_id");
                                boolean booleanExtra4 = intent2.getBooleanExtra("fetch_icon", true);
                                azfo.m85593a(context);
                                Intent b = azfo.m85594b(intent);
                                if (cfde.m138718b()) {
                                    azef.mo54828a(stringExtra8, b);
                                    break;
                                } else {
                                    Context context3 = azef.f99150a;
                                    azfx azfx2 = azef.f99156g;
                                    MessagingService messagingService2 = azef.f99154e;
                                    azfo azfo2 = azef.f99152c;
                                    sqv sqv2 = azef.f99159j;
                                    new azhg(context3, azfx2, stringExtra8, booleanExtra4, b, messagingService2, azfo2).mo54921a();
                                    break;
                                }
                            case 6:
                                azcd a2 = azcd.m85252a(context);
                                HashSet<String> hashSet = new HashSet();
                                try {
                                    cursor = a2.f98961a.getReadableDatabase().query("appData", new String[]{"sid"}, "blocked = ?", new String[]{"0"}, null, null, null);
                                    if (cursor != null) {
                                        while (cursor.moveToNext()) {
                                            try {
                                                hashSet.add(cursor.getString(cursor.getColumnIndexOrThrow("sid")));
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    String b2 = cfde.f183649a.mo6606a().mo80855b();
                                    if (!TextUtils.isEmpty(b2)) {
                                        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) b2)) {
                                            hashSet.add(str);
                                        }
                                    }
                                    for (String str2 : hashSet) {
                                        azfo.m85593a(context);
                                        azef.mo54828a(str2, azfo.m85594b(intent));
                                    }
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor = null;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                        }
                        break;
                    case 12:
                        new soa(9, new azfh(this)).start();
                        break;
                    case 13:
                        new soa(9, new azfi(this, intent2)).start();
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        this.f111086f.mo54885a(intent.getAction(), new azgd(this.f111093m, intent2, this.f111098r));
                        break;
                    case 19:
                        boolean booleanExtra5 = intent2.getBooleanExtra("reset_connection", false);
                        int intExtra2 = intent2.getIntExtra("sync_ops", 0);
                        if (booleanExtra5) {
                            azht a3 = azht.m85748a(this.f111098r.f99150a);
                            synchronized (a3.f99430a) {
                                if (a3.f99431b.get(2) != null) {
                                    a3.mo54931a();
                                }
                                if (a3.f99431b.get(8) != null) {
                                    a3.mo54934b();
                                }
                            }
                        }
                        azef azef2 = this.f111098r;
                        azef2.f99156g.mo54885a("sync checker", new azee(azef2, intExtra2));
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        Context context4 = this.f111093m;
                        String action3 = intent.getAction();
                        switch (action3.hashCode()) {
                            case 39065478:
                                if (action3.equals("com.google.android.apps.libraries.matchstick.action.POST_ALL_LIGHTER_CONVERSATION_NOTIFICATIONS")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 55258832:
                                if (action3.equals("com.google.android.apps.libraries.matchstick.action.RENOTIFY_LIGHTER_CONVERSATIONS")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case 1077123347:
                                if (action3.equals("com.google.android.apps.libraries.matchstick.action.LIGHTER_NOTIFICATION_CLEARED")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case 1655214846:
                                if (action3.equals("com.google.android.apps.libraries.matchstick.action.ERASE_ALL_LIGHTER_MESSAGES")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                        }
                        if (c4 != 0) {
                            if (c4 != 1) {
                                if (c4 != 2) {
                                    if (c4 == 3) {
                                        new soa(9, new azgg(context4)).start();
                                        break;
                                    }
                                } else {
                                    new azgh(context4).start();
                                    break;
                                }
                            } else {
                                String stringExtra9 = intent2.getStringExtra("notification_id");
                                new Object[1][0] = stringExtra9;
                                String stringExtra10 = intent2.getStringExtra("account_context_json");
                                azqf.m86130a(context4);
                                bmxv b3 = azqf.m86144b(stringExtra10, azgf.f99268a);
                                if (b3.mo66813a()) {
                                    new azgj(context4, (bcoh) b3.mo66814b(), stringExtra9).start();
                                    break;
                                } else {
                                    azoj.m85933c("LTIntentHandler", "Could not get account to mark notification as cleared", new Object[0]);
                                    azph.m85998a(context4).mo55126a(1434, 56);
                                    break;
                                }
                            }
                        } else {
                            new azgi(context4).start();
                            break;
                        }
                        break;
                    case 24:
                    case 25:
                        Context context5 = this.f111093m;
                        azfx azfx3 = this.f111086f;
                        String action4 = intent.getAction();
                        int hashCode2 = action4.hashCode();
                        if (hashCode2 != -415462300) {
                            if (hashCode2 == 2080107412 && action4.equals("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS")) {
                                c4 = 1;
                            }
                        } else if (action4.equals("com.google.android.apps.libraries.matchstick.action.RETRIGGER_NOTIFICATION")) {
                            c4 = 0;
                        }
                        if (c4 != 0) {
                            if (c4 == 1) {
                                azfx3.mo54885a("renotify notification", new azgl(context5));
                                break;
                            }
                        } else {
                            azfx3.mo54886b("retrigger notification", new azgk(context5, intent2.getStringExtra("conversation_id"), intent2.getBooleanExtra("should_show_reply_again", false), intent2.getBooleanExtra("need_buzz_for_reply_again", false)));
                            break;
                        }
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        Context context6 = this.f111093m;
                        azfx azfx4 = this.f111086f;
                        String action5 = intent.getAction();
                        switch (action5.hashCode()) {
                            case -1696409343:
                                if (action5.equals("com.google.android.apps.libraries.matchstick.action.SET_ANONYMOUS_CHAT_DISPLAY_NAME")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case -1614313097:
                                if (action5.equals("com.google.android.apps.libraries.matchstick.action.NOTIFICATION_CLEARED")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case -1398950878:
                                if (action5.equals("com.google.android.apps.libraries.matchstick.action.erase_all_messages")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case 115803805:
                                if (action5.equals("com.google.android.apps.libraries.matchstick.action.GET_OR_SYNC_APP_METADATA")) {
                                    c4 = 4;
                                    break;
                                }
                                break;
                            case 1385791020:
                                if (action5.equals("com.google.android.apps.libraries.matchstick.action.DELETE_DRAFT")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 1984537307:
                                if (action5.equals("com.google.android.apps.libraries.matchstick.action.SAVE_INTRO_MSG_AND_PROMPT_ID_ACTION")) {
                                    c4 = 5;
                                    break;
                                }
                                break;
                        }
                        if (c4 != 0) {
                            if (c4 != 1) {
                                if (c4 != 2) {
                                    if (c4 != 3) {
                                        if (c4 != 4) {
                                            if (c4 == 5) {
                                                String stringExtra11 = intent2.getStringExtra("conversation_id");
                                                if (!TextUtils.isEmpty(stringExtra11)) {
                                                    long longExtra2 = intent2.getLongExtra("prompt_string_id", -1);
                                                    if (longExtra2 == -1) {
                                                        azoj.m85933c("StorageIH", "Invalid prompt string id", new Object[0]);
                                                        break;
                                                    } else {
                                                        aznz a4 = aznz.m85891a(stringExtra11);
                                                        byte[] byteArrayExtra = intent2.getByteArrayExtra("message_properties");
                                                        boolean booleanExtra6 = intent2.getBooleanExtra("show_log_consent", false);
                                                        azfx4.mo54886b("save_intro_msg_and_prompt_id", new azgr(context6, intent2.getStringExtra("fetch_app_data_for_apps_list"), a4, intent2.getByteArrayExtra("default_profile_data"), booleanExtra6, intent2.getByteArrayExtra("intro_msg_suggestions"), byteArrayExtra, intent2.getStringExtra("intro_message"), longExtra2));
                                                        break;
                                                    }
                                                } else {
                                                    azoj.m85933c("StorageIH", "Invalid conversation id", new Object[0]);
                                                    break;
                                                }
                                            }
                                        } else {
                                            String stringExtra12 = intent2.getStringExtra("server_app_id");
                                            if (!TextUtils.isEmpty(stringExtra12)) {
                                                azfx4.mo54886b("get or sync app metadata", new azgq(context6, stringExtra12));
                                                break;
                                            }
                                        }
                                    } else {
                                        azfx4.mo54885a("clear notification", new azgp(context6, intent2.getStringExtra("conversation_id"), intent2.getBooleanExtra("is_renotification", false), intent2.getBooleanExtra("should_show_reply_again", false), intent2.getBooleanExtra("has_new_messages", false), intent2.getLongExtra("last_msg_row_id", -1)));
                                        break;
                                    }
                                } else {
                                    azfx4.mo54886b("Delete draft", new azgn(context6, intent2.getStringExtra("conversation_id")));
                                    break;
                                }
                            } else {
                                azfx4.mo54886b("erase all messages", new azgo(context6));
                                break;
                            }
                        } else {
                            String stringExtra13 = intent2.getStringExtra("conversation_id");
                            String stringExtra14 = intent2.getStringExtra("anonymous_chat_display_name");
                            if (TextUtils.isEmpty(stringExtra13) || TextUtils.isEmpty(stringExtra14)) {
                                azoj.m85933c("StorageIH", "invalid display name or conversation id", new Object[0]);
                                break;
                            } else {
                                azfx4.mo54886b("set anonymous chat display name", new azgm(stringExtra14, context6, stringExtra13));
                                break;
                            }
                        }
                        break;
                    case ' ':
                    case '!':
                    case '\"':
                        azef azef3 = this.f111098r;
                        String action6 = intent.getAction();
                        int hashCode3 = action6.hashCode();
                        if (hashCode3 != -406146248) {
                            if (hashCode3 != 1363983877) {
                                if (hashCode3 == 1483332490 && action6.equals("com.google.android.apps.libraries.matchstick.action.call_signal")) {
                                    c2 = 1;
                                    if (c2 == 0) {
                                        if (c2 != 1) {
                                            if (c2 == 2) {
                                                new azhk(azef3.f99150a, azef3.f99156g, intent2.getByteArrayExtra("look_up_registered_request"), intent2.getStringExtra("callback_class_name"), intent2.getIntExtra("look_up_registered_request_id", -1)).mo54921a();
                                                break;
                                            }
                                        } else {
                                            new Object[1][0] = Integer.valueOf(Process.myPid());
                                            new azhs(azef3.f99150a, azef3.f99156g, LocalEntityId.m94551b((cbma) azol.m85935a((bxxk) cbma.f177591f.mo74142c(7), intent2.getByteArrayExtra("remote_tachyon_id"))), intent2.getByteArrayExtra("inbox_message"), azoi.m85924a(intent)).mo54921a();
                                            break;
                                        }
                                    } else {
                                        new azhw(azef3.f99150a, azef3.f99156g, azef3.f99157h, azef3.f99158i, azoi.m85924a(intent)).mo54921a();
                                        break;
                                    }
                                }
                            } else if (action6.equals("com.google.android.apps.libraries.matchstick.action.look_up_registered")) {
                                c2 = 2;
                                if (c2 == 0) {
                                }
                            }
                        } else if (action6.equals("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS")) {
                            c2 = 0;
                            if (c2 == 0) {
                            }
                        }
                        c2 = 65535;
                        if (c2 == 0) {
                        }
                        break;
                    case '#':
                        LocalEntityId a5 = azoi.m85924a(intent);
                        if (a5 == null) {
                            azoj.m85933c("MessagingService", "ping bind is called without userID", new Object[0]);
                            break;
                        } else {
                            this.f111086f.mo54886b("ping_bind", new azfl(this, a5));
                            break;
                        }
                    case '$':
                        LocalEntityId a6 = azoi.m85924a(intent);
                        String stringExtra15 = intent2.getStringExtra("server_app_id");
                        if (!TextUtils.isEmpty(stringExtra15)) {
                            if (a6 != null) {
                                azcv a7 = azcv.m85357a(this.f111093m);
                                if (!TextUtils.isEmpty(a6.f111074a) && a6.f111075b != 0 && !TextUtils.isEmpty(a6.f111076c)) {
                                    azcm.m85300a(a7.f99016a).mo54649a(stringExtra15, a6);
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                        break;
                    default:
                        mo54892b(intent3);
                        return 1;
                }
            }
            mo54892b(intent3);
            return 2;
        } catch (SQLiteException e2) {
        } catch (Throwable th4) {
            Throwable th5 = th4;
            mo54892b(intent3);
            throw th5;
        }
    }

    public final boolean onUnbind(Intent intent) {
        if (cfgs.m139400f()) {
            this.f111096p = null;
        }
        this.f111088h = false;
        this.f111089i = null;
        return true;
    }

    /* renamed from: b */
    public final void mo54892b(Intent intent) {
        bmxy.m108581a(intent);
        synchronized (this.f111083c) {
            bmxy.m108600b(this.f111084d.contains(intent));
            this.f111085e.mo54888a();
            this.f111084d.remove(intent);
            if (this.f111084d.isEmpty()) {
                bmxy.m108600b(!this.f111085e.mo54890b());
                this.f111097q.post(new azfk(this, this.f111099s));
            } else {
                new Object[1][0] = this.f111084d;
            }
        }
    }

    /* renamed from: a */
    public static boolean m94556a(Intent intent, Context context) {
        bmxy.m108581a(intent);
        intent.setClassName(context, "com.google.android.gms.matchstick.net.MessagingService");
        return context.startService(intent) != null;
    }

    /* renamed from: c */
    private final boolean m94559c(String str) {
        return this.f111088h && bmxi.m108538a(this.f111089i, str);
    }

    /* renamed from: a */
    public final void mo54891a(Intent intent) {
        bmxy.m108581a(intent);
        synchronized (this.f111083c) {
            bmxy.m108600b(!this.f111084d.contains(intent));
            this.f111085e.mo54889a(this.f111093m);
            this.f111084d.add(intent);
        }
    }

    /* renamed from: a */
    public final boolean mo54887a(ConversationId conversationId) {
        return m94559c(conversationId.toString());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo60381c(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("native_app_bundle");
        String str = new String(bundleExtra.getCharArray("native_app_uri"));
        String stringExtra = intent.getStringExtra("conversation_id");
        azan.m85141a(this.f111093m).mo54541b(stringExtra);
        this.f111093m.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        aznz a = aznz.m85891a(stringExtra);
        if (a == null) {
            azoj.m85933c("MessagingService", "ConversationId can not be parsed correctly.", new Object[0]);
            return;
        }
        if (cfeo.f183719a.mo6606a().mo81065cq()) {
            azcm a2 = azcm.m85300a(this.f111093m);
            if (!a2.mo54658b()) {
                azoj.m85933c("MessagingService", "Cannot update local database.", new Object[0]);
            } else {
                List e = a2.mo54666e(stringExtra);
                if (e.isEmpty()) {
                    azoj.m85933c("MessagingService", "To native app message can not be found.", new Object[0]);
                } else {
                    a2.mo54647a(aznz.m85891a(stringExtra), Collections.singletonList(((azdd) e.get(e.size() - 1)).f99046b), 1, 3, this.f111090j);
                    a2.mo54673j(stringExtra);
                }
            }
        }
        Intent a3 = azoi.m85923a("", str, bundleExtra.getShort("native_app_parsing_flag"));
        int a4 = cbhi.m127856a(bundleExtra.getShort("native_app_type", 2));
        if (a4 == 0) {
            a4 = 4;
        }
        int a5 = azoi.m85917a(this.f111093m, a3, a4, cfeo.f183719a.mo6606a().mo80927N());
        if (a5 == 0) {
            this.f111090j.mo55137a(752, a);
            int i = a4 - 2;
            if (i == 1) {
                this.f111093m.startService(a3);
            } else if (i == 2) {
                a3.addFlags(268435456);
                this.f111093m.startActivity(a3);
            }
        } else {
            this.f111090j.mo55128a(753, a5 != 1 ? a5 != 2 ? 38 : 37 : 36, a);
            String stringExtra2 = intent.getStringExtra("fall_back_intent");
            if (stringExtra2 != null) {
                try {
                    Intent parseUri = Intent.parseUri(stringExtra2, 1);
                    if (parseUri == null) {
                        azoj.m85933c("MessagingService", "Can not parse intentUri:%s for conversation:%s", stringExtra2, stringExtra);
                        return;
                    }
                    parseUri.addFlags(268435456);
                    this.f111093m.startActivity(parseUri);
                } catch (URISyntaxException e2) {
                    azoj.m85933c("MessagingService", "Can not parse Uri:%s", stringExtra2);
                }
            } else {
                new Object[1][0] = stringExtra;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo60380b(String str) {
        if (!m94559c(str)) {
            return false;
        }
        this.f111093m.getContentResolver().notifyChange(DatabaseProvider.m94534b(str), null);
        return true;
    }
}
