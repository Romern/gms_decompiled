package com.google.android.gms.googlehelp.contact.chat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Service;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChatRequestAndConversationChimeraService extends Service implements aaxf, aarn, aate {

    /* renamed from: a */
    static final String f78891a = "com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationService";

    /* renamed from: b */
    static Set f78892b = new HashSet();

    /* renamed from: t */
    public static final /* synthetic */ int f78893t = 0;

    /* renamed from: A */
    private Long f78894A;

    /* renamed from: B */
    private BroadcastReceiver f78895B;

    /* renamed from: C */
    private C1102je f78896C;

    /* renamed from: c */
    sex f78897c;

    /* renamed from: d */
    public boolean f78898d;

    /* renamed from: e */
    public HelpConfig f78899e;

    /* renamed from: f */
    public abcr f78900f;

    /* renamed from: g */
    public aarp f78901g;

    /* renamed from: h */
    public boolean f78902h;

    /* renamed from: i */
    public boolean f78903i = false;

    /* renamed from: j */
    public boolean f78904j = false;

    /* renamed from: k */
    public boolean f78905k = false;

    /* renamed from: l */
    public boolean f78906l = false;

    /* renamed from: m */
    public aaxc f78907m = null;

    /* renamed from: n */
    public long f78908n = -1;

    /* renamed from: o */
    public long f78909o = -1;

    /* renamed from: p */
    public long f78910p = -1;

    /* renamed from: q */
    public long f78911q = 0;

    /* renamed from: r */
    public aasi f78912r;

    /* renamed from: s */
    public boolean f78913s = false;

    /* renamed from: u */
    private bqgj f78914u;

    /* renamed from: v */
    private aasi f78915v = new aasi();

    /* renamed from: w */
    private boolean f78916w;

    /* renamed from: x */
    private boolean f78917x = false;

    /* renamed from: y */
    private CharSequence f78918y = "";

    /* renamed from: z */
    private List f78919z;

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
    public static Intent m66439a(Context context) {
        return new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", true);
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
    public static void m66451b(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", true));
    }

    /* renamed from: b */
    private static boolean m66452b(int i) {
        return i > 0;
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
    /* renamed from: c */
    public static void m66453c(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", true));
        int i = Build.VERSION.SDK_INT;
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
    public static void m66454d(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    /* renamed from: e */
    public static Intent m66455e() {
        return new Intent("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
    }

    /* renamed from: s */
    public static long m66457s() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: v */
    static final Intent m66458v() {
        return new Intent("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
    }

    /* renamed from: w */
    private final boolean m66459w() {
        if (this.f78899e == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Got request to update conversation, but no configurations available.");
            return false;
        } else if (m66452b(mo43297c())) {
            mo43296b();
            return true;
        } else {
            mo43291a(new aaww(this));
            return true;
        }
    }

    /* renamed from: x */
    private static Pair m66460x() {
        return Pair.create(true, 2);
    }

    /* renamed from: y */
    private static Pair m66461y() {
        return Pair.create(false, 0);
    }

    /* renamed from: z */
    private static void m66462z() {
        Handler handler;
        Runnable runnable;
        if (aaya.m47229b(ceep.m136630b())) {
            for (aaxg aaxg : f78892b) {
                if (!(!aaya.m47229b(ceep.m136630b()) || (handler = aaxg.f56750e) == null || (runnable = aaxg.f56751f) == null)) {
                    handler.removeCallbacks(runnable);
                    aaxg.f56750e = null;
                    aaxg.f56751f = null;
                }
            }
            f78892b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo43299f() {
        return mo43297c() == 0;
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
    /* renamed from: g */
    public final void mo31861g() {
        int c;
        if (this.f78902h && this.f78899e != null && (c = mo43297c()) >= 0) {
            if (c != 0) {
                mo43289a(4102, mo43302n());
            }
            mo43293a(m66458v().putExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", true).putExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", c));
            mo43300l();
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
    /* renamed from: h */
    public final void mo31862h() {
        Intent intent;
        this.f78902h = false;
        if (this.f78898d) {
            mo43293a(m66458v().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true));
        } else {
            aarp aarp = this.f78901g;
            if (aarp != null && aawg.m47117f(aarp)) {
                intent = m66458v().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
            } else {
                aawg.m47124j(this, this.f78899e);
                mo43289a(2014, mo43301m());
                intent = m66458v().putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
            }
            mo43293a(intent);
        }
        stopSelf();
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
    /* renamed from: i */
    public final void mo31863i() {
        Intent intent;
        this.f78902h = false;
        aarp aarp = this.f78901g;
        if (aarp != null && aawg.m47117f(aarp)) {
            intent = m66458v().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
        } else {
            mo43289a(2014, mo43301m());
            intent = m66458v().putExtra("EXTRA_IS_CHAT_DATA_STALE", true);
        }
        mo43293a(intent);
        stopSelf();
    }

    /* renamed from: j */
    public final void mo31864j() {
        if (this.f78899e != null) {
            if (this.f78905k) {
                mo43293a(m66455e());
            }
            if (this.f78899e == null) {
                Log.w("gH_ChatReq&ConvoSvc", "Got request to join conversation, but no configurations available.");
            } else if (!this.f78917x) {
                this.f78917x = true;
                mo43288a(49);
                mo43291a(new aawz(this));
            }
            HelpConfig helpConfig = this.f78899e;
            if (helpConfig == null || !aawg.m47115e(this, helpConfig)) {
                mo43291a(new aawi(this));
            }
        }
    }

    /* renamed from: k */
    public final boolean mo31865k() {
        return this.f78902h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo43300l() {
        HelpConfig helpConfig = this.f78899e;
        if (helpConfig != null) {
            ReportBatchedMetricsChimeraGcmTaskService.m66601a(this, helpConfig);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je
     arg types: [int, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, android.content.Intent):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.pm.PackageManager, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.CharSequence
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, java.lang.Object[]):java.lang.String
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, android.app.Notification):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.lang.String, long):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Notification mo43301m() {
        C1102je a = mo43287a(false, false);
        a.mo13640e(mo43286a((int) C0126R.string.gh_chat_request_error_notification, new Object[0]));
        a.mo13639d(mo43286a((int) C0126R.string.gh_chat_request_error_notification, new Object[0]));
        a.mo13632b(mo43304p());
        a.mo13620a(mo43306r());
        a.mo13619a(mo43305q());
        return a.mo13629b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je
     arg types: [int, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, android.content.Intent):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.pm.PackageManager, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.CharSequence
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, java.lang.Object[]):java.lang.String
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, android.app.Notification):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.lang.String, long):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Notification mo43302n() {
        int i;
        String str;
        if (this.f78899e != null) {
            i = mo43297c();
        } else {
            i = -1;
        }
        if (i != -1) {
            str = getString(C0126R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(i)});
        } else {
            str = mo43286a((int) C0126R.string.gh_chat_waiting_for_response, new Object[0]);
        }
        C1102je a = mo43287a(true, false);
        a.mo13640e(str);
        a.mo13639d(str);
        a.mo13632b(mo43304p());
        a.mo13620a(mo43306r());
        a.mo13619a(System.currentTimeMillis());
        return a.mo13629b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je
     arg types: [int, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, android.content.Intent):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.pm.PackageManager, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.CharSequence
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, java.lang.Object[]):java.lang.String
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, android.app.Notification):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.lang.String, long):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je */
    /* renamed from: o */
    public final Notification mo43303o() {
        C1102je a = mo43287a(true, false);
        String a2 = mo43286a((int) C0126R.string.gh_chat_ongoing_chat_session, new Object[0]);
        a.mo13640e(mo43304p());
        a.mo13639d(a2);
        a.mo13632b(a2);
        a.mo13620a(mo43306r());
        a.mo13619a(mo43305q());
        a.mo13626a(new C1101jd());
        return a.mo13629b();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        String str;
        super.onCreate();
        if (ceev.f182568a.mo6606a().mo79057i()) {
            snp.m35702a(9).execute(new aaxb());
        }
        aazt.m47336a(this);
        this.f78911q = m66457s();
        this.f78895B = new aacn("googlehelp") {
            /* class com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.C16032 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                if ("android.intent.action.TIME_SET".equals(intent.getAction())) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                    int i = ChatRequestAndConversationChimeraService.f78893t;
                    long j = chatRequestAndConversationChimeraService.f78911q;
                    long s = ChatRequestAndConversationChimeraService.m66457s();
                    chatRequestAndConversationChimeraService.f78911q = s;
                    chatRequestAndConversationChimeraService.mo43291a(new aawn(chatRequestAndConversationChimeraService, s - j));
                    ChatRequestAndConversationChimeraService.this.mo43307t();
                } else if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                    ChatRequestAndConversationChimeraService.this.mo43307t();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        registerReceiver(this.f78895B, intentFilter);
        this.f78897c = sex.m35104a(this);
        int i = Build.VERSION.SDK_INT;
        sex sex = this.f78897c;
        if (sex.mo25437a("chat_channel_id") == null) {
            if (aaya.m47229b(ceik.m136924b())) {
                str = getString(C0126R.string.gh_top_appbar_support_label);
            } else {
                str = "chat channel name";
            }
            sex.mo25442a(new NotificationChannel("chat_channel_id", str, 4));
        }
        this.f78900f = new abcr(this);
    }

    public final void onDestroy() {
        if (this.f78899e != null) {
            if ((this.f78916w || !this.f78902h) && this.f78901g != null) {
                mo43298d();
            }
            mo43300l();
        }
        stopForeground(this.f78916w);
        List list = this.f78919z;
        if (list != null) {
            aaru.m46808a(false, list);
        }
        BroadcastReceiver broadcastReceiver = this.f78895B;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        abcr abcr = this.f78900f;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aawg.b(aarp, boolean):void
     arg types: [aarp, int]
     candidates:
      aawg.b(long, aarp):void
      aawg.b(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      aawg.b(aarp, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aawg.a(aarp, boolean):void
     arg types: [aarp, int]
     candidates:
      aawg.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):long
      aawg.a(com.google.android.gms.googlehelp.common.HelpConfig, aarp):java.lang.String
      aawg.a(long, aarp):java.util.List
      aawg.a(aarp, long):void
      aawg.a(abdd, aarp):void
      aawg.a(java.util.List, aarp):void
      aawg.a(aarp, boolean):void */
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
    public final int onStartCommand(Intent intent, int i, int i2) {
        Pair pair;
        HelpConfig helpConfig;
        Map map;
        Intent intent2 = intent;
        if (!(intent2 == null || (helpConfig = (HelpConfig) intent2.getParcelableExtra("EXTRA_HELP_CONFIG")) == null)) {
            this.f78899e = helpConfig;
            if (aaya.m47228a(ceit.m136953b()) && ((map = this.f78899e.f78813M) == null || map.isEmpty())) {
                HelpConfig helpConfig2 = this.f78899e;
                helpConfig2.f78813M = aasb.m46832a(this, helpConfig2);
            }
        }
        HelpConfig helpConfig3 = this.f78899e;
        if (helpConfig3 != null) {
            aarp.m46797a(mo43285a(), this, this, helpConfig3);
            if (intent2 == null) {
                pair = Pair.create(true, 2);
            } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", false)) {
                if (m66452b(mo43297c())) {
                    mo31861g();
                } else if (mo43299f()) {
                    mo31864j();
                } else {
                    Intent v = m66458v();
                    if (aasb.m46834b(this, this.f78899e, "should_notify_of_chat_request_error")) {
                        v.putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
                    } else {
                        v.putExtra("EXTRA_NO_PENDING_CHAT_REQUEST", true);
                    }
                    mo43293a(v);
                }
                pair = m66460x();
            } else if (!intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", false)) {
                if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", false)) {
                    HelpConfig helpConfig4 = this.f78899e;
                    if (helpConfig4 != null) {
                        try {
                            aawg.m47116f(this, helpConfig4);
                            m66462z();
                            m66459w();
                            aseo.m73884b(this, intent);
                            pair = m66460x();
                        } catch (Throwable th) {
                            aseo.m73884b(this, intent);
                            throw th;
                        }
                    } else {
                        aseo.m73884b(this, intent);
                        pair = m66460x();
                    }
                } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", false)) {
                    HelpConfig helpConfig5 = this.f78899e;
                    if (helpConfig5 != null && this.f78905k) {
                        try {
                            aawg.m47116f(this, helpConfig5);
                            m66462z();
                            mo43293a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS").putExtra("EXTRA_NEW_TYPING_STATUS", intent2.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0)).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent2.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID")).putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", intent2.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1)));
                            aseo.m73884b(this, intent);
                            pair = m66460x();
                        } catch (Throwable th2) {
                            aseo.m73884b(this, intent);
                            throw th2;
                        }
                    } else {
                        aseo.m73884b(this, intent);
                        pair = m66460x();
                    }
                } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", false)) {
                    if (!intent2.hasExtra("EXTRA_NEW_TYPING_STATUS") || this.f78899e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to update user's typing status, but at least one of the following occurred: no typing status provided [%d], or no configurations available [%s].", Integer.valueOf(intent2.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0)), this.f78899e));
                    }
                    mo43291a(new aawu(this, (abdx) bmxv.m108567c(abdx.m47561a(intent2.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).mo66812a(abdx.UNKNOWN_TYPING_STATUS)));
                    pair = m66460x();
                } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", false)) {
                    String stringExtra = intent2.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT");
                    if (stringExtra == null || this.f78899e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", stringExtra, this.f78899e));
                        pair = m66461y();
                    } else {
                        long longExtra = intent2.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0);
                        if (!intent2.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                            Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but no client time was provided [%d].", Long.valueOf(longExtra)));
                        }
                        mo43294a(stringExtra, longExtra);
                        pair = m66460x();
                    }
                } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", false)) {
                    int i3 = Build.VERSION.SDK_INT;
                    Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                    String valueOf = resultsFromIntent != null ? String.valueOf(resultsFromIntent.getCharSequence("textReply")) : null;
                    if (valueOf == null || this.f78899e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", valueOf, this.f78899e));
                        pair = m66461y();
                    } else {
                        long longExtra2 = intent2.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0);
                        if (!intent2.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                            Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but no client time was provided [%d].", Long.valueOf(longExtra2)));
                        }
                        mo43294a(valueOf, longExtra2);
                        mo43288a(51);
                        if (aaya.m47228a(cefw.m136749b())) {
                            if (!intent2.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID") || !intent2.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE")) {
                                Log.e("gH_ChatReq&ConvoSvc", "Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                            } else {
                                String stringExtra2 = intent2.getStringExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID");
                                Bundle bundleExtra = intent2.getBundleExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE");
                                if (!TextUtils.isEmpty(stringExtra2) && bundleExtra.containsKey(valueOf)) {
                                    abcx.m47498a(stringExtra2, bundleExtra.getString(valueOf), 3, (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, this, this.f78899e, this.f78900f);
                                }
                            }
                        }
                        pair = m66460x();
                    }
                } else if (!intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", false)) {
                    if (!intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", false)) {
                        if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", false)) {
                            boolean booleanExtra = intent2.getBooleanExtra("EXTRA_IS_CHAT_IN_FOREGROUND", this.f78903i);
                            this.f78903i = booleanExtra;
                            if (!booleanExtra) {
                                mo43291a(new aawx(this));
                            } else if (mo43299f()) {
                                mo43289a(4102, mo43303o());
                                this.f78906l = false;
                            }
                            pair = m66460x();
                        } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", false)) {
                            this.f78902h = false;
                            stopSelf();
                            pair = m66460x();
                        } else if (intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_LAST_SEEN_EVENT_ID", false)) {
                            long longExtra3 = intent2.getLongExtra("EXTRA_LAST_SEEN_EVENT_ID", -1);
                            synchronized (this) {
                                aawg.m47098a(this.f78901g, longExtra3);
                            }
                            pair = m66460x();
                        } else if (!intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", false)) {
                            if (!intent2.getBooleanExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", false)) {
                                pair = m66461y();
                            } else {
                                aawg.m47125k(this, this.f78899e);
                                pair = m66460x();
                            }
                        } else if (this.f78905k) {
                            boolean booleanExtra2 = intent2.getBooleanExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", false);
                            aarp aarp = this.f78901g;
                            boolean z = aarp != null ? aarp.mo31699a("time_has_changed", false) : false;
                            aarp aarp2 = this.f78901g;
                            boolean z2 = aarp2 != null ? aarp2.mo31699a("time_difference_estimate_has_changed", false) : false;
                            if (z) {
                                aawg.m47108b(this.f78901g, false);
                            }
                            if (z2) {
                                aawg.m47099a(this.f78901g, false);
                            }
                            if (!booleanExtra2 || z) {
                                mo43308u();
                            } else if (z2) {
                                mo43290a(aawg.m47112d(this.f78901g));
                            }
                            pair = m66460x();
                        } else {
                            pair = m66460x();
                        }
                    } else if (this.f78899e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", "Got request to leave conversation, but no configurations available.");
                        pair = m66461y();
                    } else {
                        this.f78902h = false;
                        this.f78916w = true;
                        int c = mo43297c();
                        if (c != -1) {
                            if (m66452b(c)) {
                                mo43285a().execute(new aaxk(getApplicationContext(), this.f78899e, this.f78900f));
                            } else {
                                mo43291a(new aawh(this));
                            }
                        }
                        mo43293a(m66458v().putExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", true));
                        stopSelf();
                        pair = m66460x();
                    }
                } else if (!m66459w()) {
                    pair = m66461y();
                } else {
                    pair = m66460x();
                }
            } else if (this.f78899e != null && !this.f78917x) {
                try {
                    String stringExtra3 = intent2.getStringExtra("EXTRA_REQUEST_VERSION");
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        mo43291a(new aawy(this, stringExtra3));
                    }
                    aawg.m47116f(this, this.f78899e);
                    m66462z();
                    mo43296b();
                    aseo.m73884b(this, intent);
                    pair = m66460x();
                } catch (Throwable th3) {
                    aseo.m73884b(this, intent);
                    throw th3;
                }
            } else {
                aseo.m73884b(this, intent);
                pair = m66460x();
            }
            if (((Boolean) pair.first).booleanValue()) {
                return ((Integer) pair.second).intValue();
            }
            if (!TextUtils.isEmpty(this.f78899e.mo43241p())) {
                this.f78897c.mo25440a(2014);
                if (!this.f78904j) {
                    this.f78898d = false;
                    this.f78902h = true;
                    this.f78916w = false;
                    this.f78917x = false;
                    this.f78905k = false;
                    this.f78908n = -1;
                    this.f78909o = -1;
                    this.f78910p = -1;
                    this.f78894A = null;
                    this.f78911q = m66457s();
                    this.f78896C = null;
                    this.f78913s = false;
                    aawg.m47125k(this, this.f78899e);
                    mo43291a(new aawt(this));
                    this.f78912r = new aasi();
                    startForeground(4102, mo43302n());
                    this.f78904j = true;
                    mo43291a(new aaws(this, intent2));
                }
                return 2;
            }
            throw new IllegalStateException("Attempting to start a ChatRequestAndConversationChimeraService with no pool ID provided.");
        }
        Log.w("gH_ChatReq&ConvoSvc", "Attempting to start Chat service, but no configurations provided.");
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final String mo43304p() {
        if (TextUtils.isEmpty(this.f78918y)) {
            CharSequence a = m66442a(getPackageManager(), this.f78899e);
            this.f78918y = a;
            if (TextUtils.isEmpty(a)) {
                return getResources().getString(C0126R.string.gh_chat_google_support);
            }
        }
        return mo43286a((int) C0126R.string.gh_hangout_product_specific_subtext, this.f78918y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final long mo43305q() {
        if (this.f78894A == null) {
            this.f78894A = Long.valueOf(System.currentTimeMillis());
        }
        return this.f78894A.longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final PendingIntent mo43306r() {
        return PendingIntent.getActivity(this, 10101, ChatConversationChimeraActivity.m66400a(this, this.f78899e), 134217728);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aawg.b(aarp, boolean):void
     arg types: [aarp, int]
     candidates:
      aawg.b(long, aarp):void
      aawg.b(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      aawg.b(aarp, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo43307t() {
        if (this.f78903i) {
            mo43308u();
        } else if (cego.f182642a.mo6606a().mo79109b()) {
            mo43291a(new aawo(this));
        } else {
            aawg.m47108b(this.f78901g, true);
        }
    }

    /* renamed from: u */
    public final void mo43308u() {
        mo43291a(new aawq(this));
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
    public static Intent m66440a(Context context, Intent intent) {
        Intent putExtra = new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", (intent.hasExtra("status") ? (abdx) bmxv.m108567c(abdx.m47561a(Integer.parseInt(intent.getStringExtra("status")))).mo66812a(abdx.UNKNOWN_TYPING_STATUS) : abdx.UNKNOWN_TYPING_STATUS).f57153e).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent.getStringExtra("participantId"));
        if (intent.hasExtra("clientTime")) {
            putExtra.putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", Long.parseLong(intent.getStringExtra("clientTime")));
        }
        return putExtra;
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
    /* renamed from: e */
    public static void m66456e(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    /* renamed from: d */
    public final void mo43298d() {
        sdo.m34959a(this.f78899e);
        sdo.m34959a(this.f78901g);
        aawg.m47102a(this, this.f78899e, this.f78901g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43296b() {
        mo43295a(false);
    }

    /* renamed from: b */
    public final void mo31769b(aaru aaru) {
        List list = this.f78919z;
        if (list != null) {
            list.remove(aaru);
            if (this.f78919z.size() == 0) {
                this.f78919z = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo43297c() {
        sdo.m34959a(this.f78899e);
        HelpConfig helpConfig = this.f78899e;
        aarp aarp = this.f78901g;
        if (aarp != null) {
            return aarp.mo31693a(aasj.m46870d(helpConfig), -1);
        }
        return -1;
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
    public static Intent m66441a(Context context, String str) {
        return new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", true).putExtra("EXTRA_REQUEST_VERSION", str);
    }

    /* renamed from: a */
    public static CharSequence m66442a(PackageManager packageManager, HelpConfig helpConfig) {
        if (packageManager == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Trying to get an app package name, but packageManager is null");
            return null;
        } else if (helpConfig != null) {
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.f78827b, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("gH_ChatReq&ConvoSvc", String.format("App product name was not found for %s.", helpConfig.f78827b));
                return null;
            }
        } else {
            Log.w("gH_ChatReq&ConvoSvc", "Trying to get an app package name, but config is null");
            return null;
        }
    }

    /* renamed from: a */
    private static String m66443a(abdp abdp) {
        String str = abdp.f57116c;
        return (!TextUtils.isEmpty(str) || abdp.f57118e.size() <= 0) ? str : ((bzoy) abdp.f57118e.get(0)).f170888g;
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
    public static void m66444a(long j, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_LAST_SEEN_EVENT_ID", true).putExtra("EXTRA_LAST_SEEN_EVENT_ID", j).putExtra("EXTRA_HELP_CONFIG", helpConfig));
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
    public static void m66445a(abdx abdx, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", abdx.f57153e).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
     arg types: [android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(long, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(abdx, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, boolean, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void */
    /* renamed from: a */
    public static void m66446a(Context context, HelpConfig helpConfig) {
        m66447a(context, helpConfig, false);
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
    public static void m66447a(Context context, HelpConfig helpConfig, boolean z) {
        Intent putExtra = new Intent().setClassName(context, f78891a).putExtra("EXTRA_HELP_CONFIG", helpConfig);
        if (z) {
            putExtra.putExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", true);
        }
        context.startService(putExtra);
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
    public static void m66448a(Context context, boolean z, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", true).putExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", z).putExtra("EXTRA_HELP_CONFIG", helpConfig));
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
    public static void m66449a(String str, long j, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT", str).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", j).putExtra("EXTRA_HELP_CONFIG", helpConfig));
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
    public static void m66450a(boolean z, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, f78891a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", true).putExtra("EXTRA_IS_CHAT_IN_FOREGROUND", z).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    /* renamed from: a */
    public final aarn mo43283a(abdo abdo) {
        return new aawm(this, abdo);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je
     arg types: [int, boolean]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, android.content.Intent):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.pm.PackageManager, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.CharSequence
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, java.lang.Object[]):java.lang.String
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, android.app.Notification):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.lang.String, long):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je */
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
    public final Notification mo43284a(List list, boolean z) {
        abdp abdp;
        abea abea;
        long j;
        abdp abdp2;
        abdp abdp3;
        C1102je a = mo43287a(true, z);
        int size = list.size();
        C1105jh jhVar = new C1105jh("");
        for (int i = 0; i < size; i++) {
            abdf abdf = (abdf) list.get(i);
            if ((abdf.f57077a & 128) != 0) {
                bxyl bxyl = abdf.f57082f;
                if (bxyl == null) {
                    bxyl = bxyl.f165099b;
                }
                j = bxyl.f165101a;
            } else {
                j = -1;
            }
            if (abdf.f57078b == 3) {
                abdp2 = (abdp) abdf.f57079c;
            } else {
                abdp2 = abdp.f57112g;
            }
            String a2 = m66443a(abdp2);
            if (abdf.f57078b == 3) {
                abdp3 = (abdp) abdf.f57079c;
            } else {
                abdp3 = abdp.f57112g;
            }
            jhVar.mo13728a(a2, j, abdp3.f57117d);
        }
        if (this.f78906l) {
            jhVar.mo13728a(getResources().getString(C0126R.string.gh_chat_notification_message_failed_to_send_text), System.currentTimeMillis(), getResources().getString(C0126R.string.common_google_play_services_error_dialog_title).toUpperCase());
        }
        a.mo13626a(jhVar);
        abdf abdf2 = (abdf) bnjd.m109595d(list);
        if (abdf2.f57078b == 3) {
            abdp = (abdp) abdf2.f57079c;
        } else {
            abdp = abdp.f57112g;
        }
        if (!this.f78906l && this.f78904j) {
            int a3 = qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_reply_grey600_24);
            int i2 = Build.VERSION.SDK_INT;
            if (abdp != null) {
                abea = abdp.f57119f;
                if (abea == null) {
                    abea = abea.f57161c;
                }
            } else {
                abea = null;
            }
            Intent putExtra = new Intent().setClassName(this, f78891a).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", System.currentTimeMillis()).putExtra("EXTRA_HELP_CONFIG", this.f78899e);
            if (aaya.m47228a(cefw.m136749b()) && abea != null && abea.f57164b.size() > 0) {
                Bundle bundle = new Bundle(abea.f57164b.size());
                bxwc bxwc = abea.f57164b;
                int size2 = bxwc.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    abeb abeb = (abeb) bxwc.get(i3);
                    bundle.putString(abeb.f57169b, abeb.f57168a);
                }
                putExtra.putExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID", abea.f57163a).putExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE", bundle);
            }
            PendingIntent service = PendingIntent.getService(this, 10101, putExtra, 134217728);
            String string = getResources().getString(C0126R.string.gh_chat_message_input_hint);
            C1117jt jtVar = new C1117jt("textReply");
            jtVar.f23164d = string;
            if (aaya.m47228a(cefw.m136749b()) && abdp != null) {
                abea abea2 = abdp.f57119f;
                if (abea2 == null) {
                    abea2 = abea.f57161c;
                }
                if (abea2.f57164b.size() > 0) {
                    abea abea3 = abdp.f57119f;
                    if (abea3 == null) {
                        abea3 = abea.f57161c;
                    }
                    int size3 = abea3.f57164b.size();
                    CharSequence[] charSequenceArr = new CharSequence[size3];
                    for (int i4 = 0; i4 < size3; i4++) {
                        abea abea4 = abdp.f57119f;
                        if (abea4 == null) {
                            abea4 = abea.f57161c;
                        }
                        charSequenceArr[i4] = ((abeb) abea4.f57164b.get(i4)).f57169b;
                    }
                    jtVar.f23165e = charSequenceArr;
                    abea abea5 = abdp.f57119f;
                    if (abea5 == null) {
                        abea5 = abea.f57161c;
                    }
                    abcx.m47497a(abea5.f57163a, 3, (int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, this, this.f78899e, this.f78900f);
                }
            }
            C1096iz izVar = new C1096iz(a3, getString(C0126R.string.common_reply), service);
            C1118ju juVar = new C1118ju(jtVar.f23161a, jtVar.f23164d, jtVar.f23165e, jtVar.f23163c, jtVar.f23162b);
            if (izVar.f21940c == null) {
                izVar.f21940c = new ArrayList();
            }
            izVar.f21940c.add(juVar);
            int i5 = Build.VERSION.SDK_INT;
            if (aaya.m47228a(cefw.m136749b())) {
                izVar.f21938a = false;
            }
            a.mo13624a(izVar.mo13508a());
        }
        String a4 = m66443a(abdp);
        a.mo13640e(abdp.f57117d);
        a.mo13639d(a4);
        a.mo13632b(a4);
        a.mo13620a(mo43306r());
        a.mo13619a(System.currentTimeMillis());
        return a.mo13629b();
    }

    /* renamed from: a */
    public final bqgj mo43285a() {
        if (this.f78914u == null) {
            this.f78914u = snp.m35702a(9);
        }
        return this.f78914u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43286a(int i, Object... objArr) {
        return getResources().getString(i, objArr);
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
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* renamed from: a */
    public final C1102je mo43287a(boolean z, boolean z2) {
        boolean z3;
        if (this.f78896C == null) {
            C1102je jeVar = new C1102je(this, "chat_channel_id");
            this.f78896C = jeVar;
            jeVar.f22271w = C1133kh.m17843b(this, C0126R.color.material_blue_grey_500);
            jeVar.mo13630b(qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_chat_white_24));
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", mo43304p());
            this.f78896C.mo13623a(bundle);
        }
        boolean f = mo43299f();
        C1102je jeVar2 = this.f78896C;
        jeVar2.f22272x = f ^ true ? 1 : 0;
        if (!z2) {
            if (this.f78903i) {
                z3 = false;
            } else if (f || !z) {
                z3 = true;
            }
            jeVar2.mo13637c(!z3);
            if (!z3) {
                C1102je jeVar3 = this.f78896C;
                jeVar3.f22258j = 2;
                jeVar3.mo13616a(2);
                jeVar3.mo13622a(Settings.System.DEFAULT_NOTIFICATION_URI);
            } else {
                C1102je jeVar4 = this.f78896C;
                jeVar4.f22258j = 0;
                if (!z) {
                    jeVar4.mo13616a(4);
                }
            }
            this.f78896C.mo13631b(PendingIntent.getService(this, 10101, new Intent().setClassName(this, f78891a).putExtra("EXTRA_HELP_CONFIG", this.f78899e).putExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", true), 134217728));
            this.f78896C.f22250b.clear();
            return this.f78896C;
        }
        z3 = false;
        jeVar2.mo13637c(!z3);
        if (!z3) {
        }
        this.f78896C.mo13631b(PendingIntent.getService(this, 10101, new Intent().setClassName(this, f78891a).putExtra("EXTRA_HELP_CONFIG", this.f78899e).putExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", true), 134217728));
        this.f78896C.f22250b.clear();
        return this.f78896C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43288a(int i) {
        abcx.m47489a(this, this.f78899e, this.f78900f, i);
    }

    /* renamed from: a */
    public final void mo43289a(int i, Notification notification) {
        this.f78897c.mo25441a(i, notification);
    }

    /* renamed from: a */
    public final void mo43290a(long j) {
        mo43291a(new aawp(this, j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo43291a(aarn aarn) {
        aarp aarp = this.f78901g;
        if (aarp == null) {
            aasi aasi = this.f78915v;
            if (aasi != null) {
                aasi.addObserver(new aaxa(this, aarn));
            }
        } else {
            aarn.mo31653a(aarp);
        }
    }

    /* renamed from: a */
    public final synchronized void mo31653a(aarp aarp) {
        aasi aasi = this.f78915v;
        if (aasi != null) {
            this.f78901g = aarp;
            aasi.mo31709a();
            this.f78915v = null;
        }
    }

    /* renamed from: a */
    public final void mo43292a(aarp aarp, boolean z) {
        List a = aawg.m47096a(this.f78910p, aarp);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (((abdf) a.get(i)).f57078b == 3) {
                arrayList.add((abdf) a.get(i));
            }
        }
        if (!arrayList.isEmpty()) {
            mo43289a(4102, mo43284a(arrayList, z));
        }
    }

    /* renamed from: a */
    public final void mo31768a(aaru aaru) {
        if (this.f78919z == null) {
            this.f78919z = new ArrayList();
        }
        this.f78919z.add(aaru);
    }

    /* renamed from: a */
    public final void mo43293a(Intent intent) {
        sendBroadcast(intent.setPackage(getPackageName()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43294a(String str, long j) {
        mo43291a(new aawv(this, str, j));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, long):long
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean
      aasc.a(java.lang.String, long):long */
    /* renamed from: a */
    public final void mo43295a(boolean z) {
        long j;
        sdo.m34959a(this.f78899e);
        HelpConfig helpConfig = this.f78899e;
        aarp aarp = this.f78901g;
        if (aarp != null) {
            j = aarp.mo31694a(aasj.m46868b(helpConfig), -1L);
        } else {
            j = -1;
        }
        aaxg aaxg = new aaxg(this, this.f78899e, this.f78900f, this, this.f78901g, z);
        if (aaya.m47229b(ceep.m136630b()) && !aawg.m47115e(this, this.f78899e)) {
            f78892b.add(aaxg);
        }
        mo43291a(aaxg);
        aaxl.m47162a(this, this.f78899e, this.f78900f, j, aaxg, aaxg, mo43285a());
    }
}
