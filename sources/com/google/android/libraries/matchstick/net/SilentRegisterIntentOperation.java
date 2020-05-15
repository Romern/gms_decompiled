package com.google.android.libraries.matchstick.net;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SilentRegisterIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final azfz f111100a = new azfz("register_service_start_wakelock");

    /* renamed from: e */
    public static final /* synthetic */ int f111101e = 0;

    /* renamed from: A */
    private bcsp f111102A;

    /* renamed from: B */
    private bcoh f111103B;

    /* renamed from: C */
    private String f111104C;

    /* renamed from: b */
    public azdl f111105b;

    /* renamed from: c */
    public Context f111106c;

    /* renamed from: d */
    public String f111107d;

    /* renamed from: f */
    private TelephonyManager f111108f;

    /* renamed from: g */
    private azph f111109g;

    /* renamed from: h */
    private azob f111110h;

    /* renamed from: i */
    private azcl f111111i;

    /* renamed from: j */
    private azfo f111112j;

    /* renamed from: k */
    private String f111113k;

    /* renamed from: l */
    private afiy f111114l;

    /* renamed from: m */
    private afjd f111115m;

    /* renamed from: n */
    private ClientContext f111116n;

    /* renamed from: o */
    private azbx f111117o;

    /* renamed from: p */
    private azcv f111118p;

    /* renamed from: q */
    private String f111119q;

    /* renamed from: r */
    private String f111120r;

    /* renamed from: s */
    private String f111121s;

    /* renamed from: t */
    private String f111122t;

    /* renamed from: u */
    private String f111123u;

    /* renamed from: v */
    private String f111124v;

    /* renamed from: w */
    private List f111125w = new ArrayList();

    /* renamed from: x */
    private bxte f111126x;

    /* renamed from: y */
    private aznz f111127y;

    /* renamed from: z */
    private boolean f111128z = false;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: a */
    private final int m94566a(Intent intent, int i) {
        cbls cbls;
        LocalEntityId localEntityId;
        if (cfec.m138765b()) {
            localEntityId = azoi.m85924a(intent);
            if (localEntityId == null) {
                azoj.m85933c("RegisterService", "unregister was called without userID when GAIA flag is ON", new Object[0]);
                return 2;
            }
            cbls a = m94572a(azcv.m85357a(this.f111106c).mo54689a(localEntityId).f99002a);
            new Object[1][0] = a;
            azoe.m85908a(this.f111106c).mo55115a(this.f111116n, localEntityId);
            cbls = a;
        } else {
            localEntityId = new LocalEntityId(this.f111105b.mo54738a(), 1, this.f111113k);
            new Object[1][0] = localEntityId;
            cbls a2 = m94572a(this.f111105b.mo54760c());
            new Object[1][0] = a2;
            cbls = a2;
        }
        this.f111109g.mo55142a(12, localEntityId, i);
        try {
            afjd afjd = this.f111115m;
            ClientContext clientContext = this.f111116n;
            if (afjd.f64290c == null) {
                afjd.f64290c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/Unregister", ciie.m150370a(cbls.f177558b), ciie.m150370a(cblt.f177561a));
            }
            Object[] objArr = {(cblt) afjd.f64296a.mo25553a(afjd.f64290c, clientContext, cbls, (long) afjd.f64289b, TimeUnit.MILLISECONDS)};
            this.f111109g.mo55141a(13, localEntityId);
            return 0;
        } catch (chuw | gid e) {
            this.f111109g.mo55154a(14, e);
            if (e instanceof chuw) {
                azoj.m85931a("RegisterService", e, "unregister()", new Object[0]);
                if (azfn.m85581a(e)) {
                    m94599c(intent, false);
                    return 1;
                }
            }
            if (azfn.m85581a(e)) {
                return 3;
            }
            return 2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int
     arg types: [android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(com.google.android.libraries.matchstick.data.LocalEntityId, cblg, cblf):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, java.lang.String, int):void
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int */
    /* renamed from: b */
    private final int m94588b(Intent intent, LocalEntityId localEntityId) {
        if (localEntityId == null || localEntityId.f111075b != 7 || !cfec.m138765b()) {
            return m94568a(intent, true, localEntityId);
        }
        return m94600d(intent, localEntityId);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int
     arg types: [android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(com.google.android.libraries.matchstick.data.LocalEntityId, cblg, cblf):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, java.lang.String, int):void
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int */
    /* renamed from: c */
    private final int m94596c(Intent intent, LocalEntityId localEntityId) {
        if (localEntityId == null || localEntityId.f111075b != 7 || !cfec.m138765b()) {
            return m94568a(intent, false, localEntityId);
        }
        return m94600d(intent, localEntityId);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: d */
    private final int m94600d(Intent intent, LocalEntityId localEntityId) {
        bmxv a = azhl.m85713a(this.f111106c).mo54927a(this.f111106c, localEntityId, System.currentTimeMillis() * 1000);
        if (!a.mo66813a()) {
            this.f111109g.mo55127a(10, 23, 3, (String) null, (aznz) null);
            if (intent == null) {
                return 3;
            }
            azoj.m85932b("RegisterService", "Failed to get GCM token", new Object[0]);
            m94599c(intent, false);
            return 1;
        }
        new Object[1][0] = a.mo66814b();
        this.f111109g.mo55141a(8, localEntityId);
        try {
            azoe.m85908a(this.f111106c).mo55115a(this.f111116n, localEntityId);
            cblg a2 = this.f111115m.mo34896a(this.f111116n, (cblf) a.mo66814b());
            new Object[1][0] = a2;
            m94581a(localEntityId, a2, (cblf) a.mo66814b());
            return 0;
        } catch (chuw | gid e) {
            azoj.m85931a("RegisterService", e, "Exception during token refresh.", new Object[0]);
            this.f111109g.mo55154a(10, e);
            if (!azfn.m85581a(e)) {
                if (!azfn.m85586b(e)) {
                    return 2;
                }
                return 4;
            } else if (intent == null) {
                return 3;
            } else {
                m94599c(intent, false);
                return 1;
            }
        }
    }

    /* renamed from: e */
    private static final cbex m94604e(String str) {
        if (str == null) {
            return null;
        }
        return (cbex) azol.m85935a((bxxk) cbex.f176860f.mo74142c(7), sqd.m35969b(str));
    }

    /* renamed from: f */
    private final void m94606f() {
        LocalEntityId a = azcv.m85357a(this.f111106c).mo54692a(false);
        if (a == null) {
            return;
        }
        if (this.f111105b.mo54802x() || !azpi.m86080b(this.f111105b.mo54804z())) {
            m94610g(a.f111074a);
            this.f111109g.mo55141a(1105, a);
            m94618k();
        }
    }

    /* renamed from: g */
    private final void m94609g(Intent intent) {
        this.f111109g.mo55125a(611);
        if (!cfcv.m138704b()) {
            this.f111109g.mo55125a(612);
        } else if (!this.f111105b.mo54770e() || azcv.m85357a(this.f111106c).mo54692a(false) == null) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("invalid_auth_token_extra");
            if (this.f111105b.mo54802x()) {
                if (byteArrayExtra == null || Arrays.equals(byteArrayExtra, this.f111105b.mo54804z())) {
                    int h = m94612h(intent);
                    if (h == 0) {
                        m94626s();
                        return;
                    } else if (h == 1) {
                        return;
                    }
                } else {
                    this.f111109g.mo55125a(614);
                    return;
                }
            }
            this.f111105b.mo54753b(false);
            m94611g();
        } else {
            this.f111109g.mo55125a(613);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: h */
    private final int m94612h(Intent intent) {
        cblf cblf;
        Intent intent2 = intent;
        this.f111109g.mo55125a(611);
        azod.m85906a();
        String b = azod.m85907b(this.f111106c, "466216207879");
        if (b == null) {
            this.f111109g.mo55126a(615, 23);
            if (intent2 == null) {
                return 3;
            }
            azoj.m85932b("RegisterService", "Failed to get GCM token, retry", new Object[0]);
            m94599c(intent2, false);
            return 1;
        }
        civt a = azbw.m85224a(this.f111106c, this.f111105b.mo54729C(), this.f111105b.mo54728B());
        bxvd da = cbma.f177591f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbma cbma = (cbma) da.f164949b;
        "MS".getClass();
        cbma.f177595c = "MS";
        cbma.f177593a = cipg.m150690a(15);
        String b2 = azot.m85969b(this.f111108f);
        if (!TextUtils.isEmpty(b2) && cfeo.m138875f()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b2.getClass();
            ((cbma) da.f164949b).f177596d = b2;
            cbmd a2 = azou.m85975a(b2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((cbma) da.f164949b).f177597e = a2;
        }
        cbma cbma2 = (cbma) da.mo74062i();
        cblf a3 = azhl.m85713a(this.f111106c).mo54929a(this.f111106c, cbma2, b, 1000 * System.currentTimeMillis(), a, null, null);
        new Object[1][0] = a3;
        try {
            this.f111109g.mo55125a(616);
            cblg a4 = this.f111115m.mo34896a(this.f111116n, a3);
            new Object[1][0] = a4;
            if (a4.f177499b) {
                cblf = a3;
                cblf a5 = azhl.m85713a(this.f111106c).mo54929a(this.f111106c, cbma2, b, a4.f177500c, a, null, null);
                new Object[1][0] = cblf;
                a4 = this.f111115m.mo34896a(this.f111116n, a5);
            } else {
                cblf = a3;
            }
            this.f111109g.mo55125a(617);
            m94578a(cblf);
            this.f111105b.mo54753b(true);
            azdl azdl = this.f111105b;
            cblx cblx = a4.f177498a;
            if (cblx == null) {
                cblx = null;
            }
            azdl.mo54751b(cblx);
            this.f111105b.mo54750b(System.currentTimeMillis());
            this.f111109g.mo55125a(619);
            this.f111109g.mo55124a();
            return 0;
        } catch (chuw | gid e) {
            azoj.m85931a("RegisterService", e, "Exception during anonymous token refresh.", new Object[0]);
            this.f111109g.mo55154a(618, e);
            if (!azfn.m85581a(e)) {
                if (!azfn.m85586b(e)) {
                    return 2;
                }
                return 4;
            } else if (intent2 == null) {
                return 3;
            } else {
                m94599c(intent2, false);
                return 1;
            }
        }
    }

    /* renamed from: i */
    private final civt m94614i() {
        if (this.f111105b.mo54733G()) {
            return azbw.m85223a();
        }
        civt a = azbw.m85224a(this.f111106c, this.f111105b.mo54789k(), this.f111105b.mo54790l());
        if (a == null) {
            return azbw.m85223a();
        }
        return a;
    }

    /* renamed from: j */
    private final Pair m94616j() {
        byte[] bArr = null;
        if (cfcv.m138704b() && !azpi.m86080b(this.f111105b.mo54804z())) {
            if (this.f111105b.mo54727A()) {
                int h = m94612h(null);
                if (h != 0) {
                    return new Pair(null, Integer.valueOf(h));
                }
                m94626s();
            }
            bArr = this.f111105b.mo54804z();
        }
        return new Pair(bArr, 0);
    }

    /* renamed from: k */
    private final void m94618k() {
        this.f111105b.mo54766e(-1);
        this.f111105b.mo54771f(-1);
        this.f111105b.mo54737K();
        this.f111105b.mo54753b(false);
        this.f111105b.mo54743a("last_used_anonymous_chat_display_name", (String) null);
        this.f111105b.mo54751b((cblx) null);
        this.f111105b.mo54759c((byte[]) null);
        this.f111105b.mo54765d((byte[]) null);
        azcv.m85357a(this.f111106c).mo54705f(azcv.f99014b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, civt):cbld
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, android.content.Context):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, int):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean):void */
    /* renamed from: l */
    private final void m94619l() {
        int c;
        this.f111105b.mo54786j(0);
        List d = azcv.m85357a(this.f111106c).mo54702d();
        int size = d.size();
        int size2 = d.size();
        int i = 0;
        while (true) {
            if (i >= size2) {
                break;
            }
            LocalEntityId localEntityId = (LocalEntityId) d.get(i);
            azct c2 = azcv.m85357a(this.f111106c).mo54699c(localEntityId);
            if (!(c2 == null || !m94585a(c2) || (c = m94596c((Intent) null, localEntityId)) == 0)) {
                if (c != 3) {
                    if (c != 4) {
                        this.f111105b.mo54786j(2);
                        break;
                    }
                    azcv.m85357a(this.f111106c).mo54703e(localEntityId);
                    for (LocalEntityId localEntityId2 : c2.f99010g) {
                        azan.m85141a(this.f111106c).mo54537a(localEntityId2);
                    }
                } else {
                    this.f111105b.mo54786j(1);
                    break;
                }
            }
            i++;
        }
        if (size > azcv.m85357a(this.f111106c).mo54702d().size()) {
            m94577a(new Intent("com.google.android.gms.matchstick.register_intent_action"), false);
        }
        if (this.f111105b.mo54730D() != 0) {
            return;
        }
        if (azcv.m85357a(this.f111106c).mo54702d().isEmpty()) {
            this.f111105b.mo54786j(3);
        } else {
            this.f111105b.mo54786j(4);
        }
    }

    /* renamed from: m */
    private final void m94620m() {
        azfo azfo = this.f111112j;
        azor.m85956a(azfo.f99237a, 77770, m94569a(this.f111106c, (String) null));
        this.f111105b.mo54788k(0);
    }

    /* renamed from: n */
    private final void m94621n() {
        m94618k();
        azcm.m85300a(this.f111106c).mo54660c();
        azcv.m85357a(this.f111106c).mo54705f(new LocalEntityId(azdl.m85412a(this.f111106c).mo54738a(), 1, "MS"));
    }

    /* renamed from: o */
    private final void m94622o() {
        this.f111105b.mo54764d(true);
        m94621n();
        m94620m();
    }

    /* renamed from: p */
    private final void m94623p() {
        try {
            azcl azcl = this.f111111i;
            SQLiteDatabase writableDatabase = azcl.getWritableDatabase();
            writableDatabase.execSQL("PRAGMA foreign_keys=OFF;");
            writableDatabase.beginTransaction();
            azcm.m85303a(writableDatabase, azcl.f98989a);
            if (!cfgs.m139391K()) {
                writableDatabase.delete("appString", null, null);
                writableDatabase.delete("appData", null, null);
                writableDatabase.delete("sharedPreference", null, null);
            }
            writableDatabase.delete("smartReply", null, null);
            writableDatabase.delete("messages", null, null);
            writableDatabase.delete("conversations", null, null);
            writableDatabase.delete("media", null, null);
            writableDatabase.delete("mediaUpload", null, null);
            writableDatabase.delete("profile", null, null);
            writableDatabase.delete("conversationParticipants", null, null);
            writableDatabase.delete("sticker", null, null);
            writableDatabase.delete("user", null, null);
            writableDatabase.delete("registration", null, null);
            azcm.m85300a(azcl.f98989a).mo54664d();
            writableDatabase.delete("preloadedFiles", null, null);
            writableDatabase.delete("tachystickreachability", null, null);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.execSQL("PRAGMA foreign_keys=ON;");
        } catch (SQLiteException e) {
        }
    }

    /* renamed from: q */
    private final void m94624q() {
        this.f111117o.mo54585b();
        this.f111105b.mo54742a((String) null);
        this.f111105b.mo54745a(false);
        this.f111105b.mo54741a((cblx) null);
        this.f111105b.mo54754b((byte[]) null);
        this.f111105b.mo54746a((byte[]) null);
        this.f111105b.mo54767e((String) null);
        this.f111105b.mo54744a((Set) null);
        this.f111105b.mo54772f((String) null);
        this.f111105b.mo54768e(false);
        SharedPreferences.Editor edit = this.f111105b.f99088a.edit();
        edit.remove("clearcut_user_device_info_timestamp_ms");
        edit.apply();
        this.f111105b.mo54747a((int[]) null);
        azbv.m85222a(this.f111106c);
        m94593b(this.f111105b.mo54738a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void
     arg types: [android.content.Context, azdl, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(com.google.android.libraries.matchstick.data.LocalEntityId, cblg, cblf):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, java.lang.String, int):void
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void */
    /* renamed from: r */
    private final void m94625r() {
        m94620m();
        azcv.m85357a(this.f111106c).mo54693a(azcv.m85357a(this.f111106c).mo54701d(new LocalEntityId(azdl.m85412a(this.f111106c).mo54738a(), 1, "MS")));
        ScheduledTaskService.m94665c(this.f111106c);
        m94574a(this.f111106c, this.f111105b, false);
        m94591b(this.f111106c, this.f111105b, false);
        if (cfde.m138718b()) {
            ScheduledTaskService.m94662b(this.f111106c);
            m94598c(this.f111106c, this.f111105b, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void
     arg types: [android.content.Context, azdl, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(com.google.android.libraries.matchstick.data.LocalEntityId, cblg, cblf):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, java.lang.String, int):void
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void */
    /* renamed from: s */
    private final void m94626s() {
        azcv.m85357a(this.f111106c).mo54693a(azcv.m85357a(this.f111106c).mo54701d(azcv.f99014b));
        ScheduledTaskService.m94665c(this.f111106c);
        m94574a(this.f111106c, this.f111105b, false);
        if (cfde.m138718b()) {
            ScheduledTaskService.m94662b(this.f111106c);
            m94598c(this.f111106c, this.f111105b, false);
        }
    }

    /* renamed from: t */
    private final void m94627t() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(cfgs.f183989a.mo6606a().mo81153I()));
        intent.setFlags(268435456);
        mo60386a("com.google.android.gms.matchstick.ui.EntryActivity", -1);
        azph.m85998a(this.f111106c).mo55125a(1612);
        startActivity(intent);
    }

    /* renamed from: u */
    private final boolean m94628u() {
        if (!cfgs.f183989a.mo6606a().mo81175ad()) {
            return false;
        }
        azph.m85998a(this.f111106c).mo55125a(1613);
        return true;
    }

    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        azoj.m85930a("RegisterService", "Tachyon host: %s, Tachyon port: %s", cfgp.m139376b(), Long.valueOf(cfeo.m138880k()));
        afiy afiy = new afiy(azfn.m85578a(cfgp.m139376b(), (int) cfeo.m138880k(), applicationContext, cfeo.m138872c()));
        azdl a = azdl.m85412a(applicationContext);
        azph a2 = azph.m85998a(applicationContext);
        azob a3 = azob.m85899a(applicationContext);
        azcl a4 = azcl.m85289a(applicationContext);
        azfo a5 = azfo.m85593a(applicationContext);
        azbx a6 = azbx.m85232a(applicationContext);
        azcv a7 = azcv.m85357a(applicationContext);
        this.f111106c = applicationContext;
        this.f111105b = a;
        this.f111108f = (TelephonyManager) getSystemService("phone");
        this.f111109g = a2;
        this.f111110h = a3;
        this.f111111i = a4;
        this.f111112j = a5;
        this.f111114l = afiy;
        this.f111115m = (afjd) azht.m85748a(applicationContext).mo54933a(16);
        this.f111118p = a7;
        ClientContext clientContext = new ClientContext();
        this.f111116n = clientContext;
        clientContext.f30216f = "com.google.android.gms";
        this.f111117o = a6;
        this.f111113k = cfeo.m138878i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int
     arg types: [android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, azdl, boolean):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(com.google.android.libraries.matchstick.data.LocalEntityId, cblg, cblf):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, java.lang.String, int):void
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean, com.google.android.libraries.matchstick.data.LocalEntityId):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(cblg, cblf, civt, boolean):void
     arg types: [cblg, cblf, civt, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, java.lang.String, civt, byte[]):cblj
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(civt, cblx, java.lang.String, android.accounts.Account):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(cblg, cblf, civt, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, android.content.Context):boolean
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, civt):cbld
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, android.content.Context):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, int):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0364, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0366, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0367, code lost:
        p000.azoj.m85931a("RegisterService", r0, "Exception during register request", new java.lang.Object[0]);
        r1.f111109g.mo55154a(205, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0378, code lost:
        if (p000.azfn.m85581a(r0) != false) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x037a, code lost:
        r1.f111105b.mo54780h(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0382, code lost:
        r1.f111105b.mo54780h(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0d0c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0d0d, code lost:
        r2 = r0;
        com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.f111100a.mo54888a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0d13, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:110:0x02cc, B:252:0x060d] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x037a A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0382 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05b6 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05d5 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0a9f A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0aae A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0c82 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:590:0x0c8a A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0945 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:625:0x0959 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0228 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0229 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0279 A[Catch:{ gid -> 0x0366, chuw -> 0x0364, all -> 0x0d0c }] */
    public final void onHandleIntent(Intent intent) {
        boolean z;
        azfz azfz;
        int i;
        long j;
        boolean z2;
        byte[] byteArrayExtra;
        boolean z3;
        long j2;
        byte[] bArr;
        boolean z4;
        cblj cblj;
        Exception exc;
        String str;
        String[] strArr;
        String str2;
        cblk cblk;
        LocalEntityId localEntityId;
        String str3;
        byte[] bArr2;
        Intent intent2 = intent;
        if (intent2 != null) {
            int i2 = 1;
            int i3 = 0;
            new Object[1][0] = Boolean.valueOf(this.f111105b.mo54735I());
            if ("com.google.android.gms.matchstick.check_registration_with_lighter_action".equals(intent.getAction())) {
                azqf.m86130a(this.f111106c);
                if (azqf.m86149c() && cfgs.m139391K()) {
                    azdl azdl = this.f111105b;
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor edit = azdl.f99088a.edit();
                    edit.putLong("last_check_regsitration_with_lighter_timestamp_ms_key", currentTimeMillis);
                    edit.apply();
                    ScheduledTaskService.m94664b(this.f111106c, "gms:matchstick:checkRegistrationWithLighter", cfeo.f183719a.mo6606a().mo81036bq(), cfeo.f183719a.mo6606a().mo81037br());
                    if (!this.f111105b.mo54735I()) {
                        azph.m85998a(this.f111106c).mo55125a(1966);
                        if (cfgs.m139390J() == -1) {
                            mo60382a();
                        } else if (System.currentTimeMillis() - TimeUnit.MICROSECONDS.toMillis(azcm.m85300a(this.f111106c).mo54665e()) < cfgs.f183989a.mo6606a().mo81179ah()) {
                            azph.m85998a(this.f111106c).mo55126a(1967, 69);
                        } else if (cfgs.f183989a.mo6606a().mo81207v()) {
                            mo60382a();
                        } else {
                            bngx.m109376e();
                            try {
                                bngx bngx = (bngx) azbj.m85193a(this.f111106c).mo54563c().mo56338a().get();
                                if (bngx.isEmpty()) {
                                    mo60382a();
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                bnre i4 = bngx.listIterator();
                                while (i4.hasNext()) {
                                    bcoh bcoh = (bcoh) i4.next();
                                    arrayList.add(new Pair(azbj.m85193a(this.f111106c).mo54566f().mo56306a(bcoh, 1, azft.f99247a), bcoh));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int size = arrayList.size();
                                while (i3 < size) {
                                    arrayList2.add((bdar) ((Pair) arrayList.get(i3)).first);
                                    i3++;
                                }
                                bdav.m90505a((Collection) arrayList2).mo57830c(new azfu(this, arrayList));
                            } catch (InterruptedException | ExecutionException e) {
                                azoj.m85931a("RegisterService", e, "Could not retrieve account contexts", new Object[0]);
                                azph.m85998a(this.f111106c).mo55126a(1967, 68);
                            }
                        }
                    } else {
                        m94603d();
                    }
                }
            } else {
                if (this.f111105b.mo54735I()) {
                    if ("com.google.android.gms.matchstick.handle_external_chat_intent_action".equals(intent.getAction())) {
                        m94603d();
                        new soa(9, new azfp(this, intent2)).start();
                        return;
                    } else if ("com.google.android.gms.matchstick.handle_external_lighter_intent_action".equals(intent.getAction())) {
                        m94603d();
                        new soa(9, new azfq(this, intent2)).start();
                        return;
                    } else if ("com.google.android.gms.matchstick.register_intent_google_account_change".equals(intent.getAction())) {
                        m94603d();
                    }
                }
                if ("com.google.android.gms.matchstick.downgrade_lighter_registration_action".equals(intent.getAction())) {
                    m94605e();
                    return;
                }
                azdl azdl2 = this.f111105b;
                long currentTimeMillis2 = System.currentTimeMillis();
                SharedPreferences.Editor edit2 = azdl2.f99088a.edit();
                edit2.putLong("last_silent_register_service_invoked_timestamp_key", currentTimeMillis2);
                edit2.apply();
                azoj.m85930a("RegisterService", "RegisterService intent:%s isPeriodic:%s", intent2, Boolean.valueOf(m94617j(intent)));
                boolean e2 = this.f111105b.mo54770e();
                if (cfcv.m138704b()) {
                    if ("com.google.android.gms.matchstick.anonymous_registration_action".equals(intent.getAction()) || "com.google.android.gms.matchstick.handle_external_chat_intent_action".equals(intent.getAction()) || "com.google.android.gms.matchstick.anonymous_token_refresh_action".equals(intent.getAction())) {
                        z = true;
                        if (e2) {
                            try {
                                aptm.m70976a(this);
                                cblx cblx = null;
                                if (!"com.google.android.gms.matchstick.user_initiated_register_action".equals(intent.getAction())) {
                                    this.f111105b.mo54764d(false);
                                    String stringExtra = intent2.getStringExtra("user_canonical_number_extra");
                                    this.f111109g.mo55125a(203);
                                    azod.m85906a();
                                    String b = azod.m85907b(this.f111106c, "466216207879");
                                    civt a = azbw.m85223a();
                                    if (b != null) {
                                        if (a != null) {
                                            Pair j3 = m94616j();
                                            if (!m94595b(j3)) {
                                                if (m94584a(j3)) {
                                                    azoj.m85933c("RegisterService", "Anonymous registration unregistered on server", new Object[0]);
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) j3.first;
                                                }
                                                cblh b2 = m94590b(stringExtra, b, a, bArr2);
                                                new Object[1][0] = b2;
                                                this.f111105b.mo54780h(0);
                                                cbli a2 = this.f111114l.mo34891a(this.f111116n, b2);
                                                new Object[1][0] = a2;
                                                if (!a2.f177510a) {
                                                    this.f111105b.mo54787j(stringExtra);
                                                    azdl azdl3 = this.f111105b;
                                                    cblx cblx2 = a2.f177511b;
                                                    if (cblx2 != null) {
                                                        cblx = cblx2;
                                                    }
                                                    azdl3.mo54756c(cblx);
                                                    this.f111105b.mo54769e(a.f191540a.mo86595a());
                                                    this.f111105b.mo54774f(a.f191541b.f191538a);
                                                    SharedPreferences.Editor edit3 = this.f111105b.f99088a.edit();
                                                    edit3.putInt("user_register_idkey_type", 1);
                                                    edit3.apply();
                                                    this.f111105b.mo54780h(3);
                                                    this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE);
                                                } else if (a2.f177511b != null) {
                                                    m94624q();
                                                    cblx cblx3 = a2.f177511b;
                                                    if (cblx3 == null) {
                                                        cblx3 = cblx.f177575c;
                                                    }
                                                    m94580a(a, cblx3, stringExtra, (Account) null);
                                                    this.f111105b.mo54780h(4);
                                                    this.f111109g.mo55125a(204);
                                                    this.f111105b.mo54768e(true);
                                                    if (!azpi.m86080b(bArr2)) {
                                                        this.f111109g.mo55125a(623);
                                                    }
                                                } else {
                                                    this.f111109g.mo55126a(205, 25);
                                                    this.f111105b.mo54780h(2);
                                                }
                                            } else {
                                                this.f111109g.mo55126a(205, 34);
                                            }
                                            azfz = f111100a;
                                        }
                                    }
                                    azoj.m85933c("RegisterService", "Could not send register request, token or keypair generation failed.", new Object[0]);
                                    this.f111105b.mo54780h(2);
                                    if (b == null) {
                                        this.f111109g.mo55126a(205, 23);
                                    } else {
                                        this.f111109g.mo55126a(205, 24);
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.force_register_refresh_request_action".equals(intent.getAction())) {
                                    for (LocalEntityId localEntityId2 : azcv.m85357a(this.f111106c).mo54702d()) {
                                        m94576a(intent2, localEntityId2);
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.register_refresh_if_needed".equals(intent.getAction())) {
                                    LocalEntityId localEntityId3 = new LocalEntityId(intent2.getStringExtra("entity_id"), intent2.getIntExtra("entity_type", 0), "MS");
                                    String stringExtra2 = intent2.getStringExtra("callback_class_name");
                                    if (!TextUtils.isEmpty(stringExtra2)) {
                                        String stringExtra3 = intent2.getStringExtra("register_refresh_request_id");
                                        azct c = azcv.m85357a(this.f111106c).mo54699c(localEntityId3);
                                        if (c == null || c.f99006c >= System.currentTimeMillis() + cfeo.m138867X()) {
                                            m94582a(stringExtra2, stringExtra3, 0);
                                        } else {
                                            m94582a(stringExtra2, stringExtra3, m94568a(intent2, false, localEntityId3));
                                        }
                                    } else {
                                        azoj.m85933c("RegisterService", "Missing callback classname.", new Object[0]);
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.user_initiated_gaia_register_action".equals(intent.getAction())) {
                                    this.f111105b.mo54764d(false);
                                    m94577a(intent2, true);
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.verify_register_action".equals(intent.getAction())) {
                                    String stringExtra4 = intent2.getStringExtra("verification_pin_extra");
                                    this.f111105b.mo54783i(0);
                                    cblv c2 = m94597c(stringExtra4);
                                    this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR);
                                    new Object[1][0] = c2;
                                    try {
                                        cblw a3 = this.f111114l.mo34893a(this.f111116n, c2);
                                        new Object[1][0] = a3;
                                        if (a3.f177574a != null) {
                                            byte[] z5 = this.f111105b.mo54804z();
                                            m94624q();
                                            byte[] h = this.f111105b.mo54781h("user_register_public_key");
                                            byte[] h2 = this.f111105b.mo54781h("user_register_private_key");
                                            if (this.f111105b.f99088a.getInt("user_register_idkey_type", 0) != 1) {
                                                this.f111105b.mo54746a(h);
                                                this.f111105b.mo54754b(h2);
                                                cblx cblx4 = a3.f177574a;
                                                if (cblx4 == null) {
                                                    cblx4 = cblx.f177575c;
                                                }
                                                m94580a((civt) null, cblx4, this.f111105b.mo54801w(), (Account) null);
                                            } else {
                                                civt a4 = azbw.m85224a(this.f111106c, h, h2);
                                                cblx cblx5 = a3.f177574a;
                                                if (cblx5 == null) {
                                                    cblx5 = cblx.f177575c;
                                                }
                                                m94580a(a4, cblx5, this.f111105b.mo54801w(), (Account) null);
                                            }
                                            if (!azpi.m86080b(z5)) {
                                                this.f111109g.mo55125a(625);
                                            }
                                            this.f111105b.mo54787j((String) null);
                                            this.f111105b.mo54756c((cblx) null);
                                            this.f111105b.mo54769e((byte[]) null);
                                            this.f111105b.mo54774f((byte[]) null);
                                            this.f111105b.mo54783i(3);
                                            this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_EXPIRED_MFI);
                                            this.f111109g.mo55125a(204);
                                            this.f111105b.mo54768e(true);
                                        } else {
                                            this.f111105b.mo54783i(2);
                                            this.f111109g.mo55125a(208);
                                        }
                                    } catch (gid e3) {
                                        e = e3;
                                        azoj.m85931a("RegisterService", e, "Exception during verify request", new Object[0]);
                                        this.f111109g.mo55154a(208, e);
                                        if (azfn.m85581a(e)) {
                                            this.f111105b.mo54783i(2);
                                        } else {
                                            this.f111105b.mo54783i(1);
                                        }
                                        azfz = f111100a;
                                        azfz.mo54888a();
                                    } catch (chuw e4) {
                                        e = e4;
                                        azoj.m85931a("RegisterService", e, "Exception during verify request", new Object[0]);
                                        this.f111109g.mo55154a(208, e);
                                        if (azfn.m85581a(e)) {
                                        }
                                        azfz = f111100a;
                                        azfz.mo54888a();
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.user_initiated_unregister_action".equals(intent.getAction())) {
                                    if (cfec.m138765b()) {
                                        m94592b(intent2, true);
                                    } else if (this.f111105b.mo54770e()) {
                                        this.f111105b.mo54776g(0);
                                        this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA);
                                        int b3 = m94588b((Intent) null, (LocalEntityId) null);
                                        if (b3 != 2) {
                                            if (b3 != 3) {
                                                if (b3 != 4) {
                                                    int a5 = m94567a((Intent) null, 5, (LocalEntityId) null);
                                                    this.f111109g.mo55160a("Matchstick.Unregister.Reason", 4);
                                                    if (a5 == 2) {
                                                        i = 3;
                                                    } else {
                                                        i = 3;
                                                        if (a5 != 3) {
                                                        }
                                                    }
                                                    azdl azdl4 = this.f111105b;
                                                    if (a5 == i) {
                                                        j = 1;
                                                    } else {
                                                        j = 2;
                                                    }
                                                    azdl4.mo54776g(j);
                                                    this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE);
                                                }
                                                this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA);
                                                m94622o();
                                                m94623p();
                                                m94624q();
                                                this.f111105b.mo54776g(3);
                                            }
                                        }
                                        this.f111105b.mo54776g(b3 == 3 ? 1 : 2);
                                        this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE);
                                    } else {
                                        m94622o();
                                        this.f111105b.mo54776g(4);
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.check_registration_action".equals(intent.getAction())) {
                                    if (!this.f111105b.mo54770e()) {
                                        if (!this.f111105b.mo54802x()) {
                                            this.f111105b.mo54786j(3);
                                            this.f111105b.mo54771f(3);
                                            azfz = f111100a;
                                        }
                                    }
                                    if (cfeo.f183719a.mo6606a().mo81094w()) {
                                        if (cfec.m138765b()) {
                                            m94619l();
                                            if (cfcv.m138704b() && this.f111105b.mo54802x()) {
                                                this.f111109g.mo55125a(620);
                                                this.f111105b.mo54771f(0);
                                                if (this.f111105b.mo54727A()) {
                                                    this.f111105b.mo54771f(4);
                                                    this.f111109g.mo55125a(621);
                                                } else {
                                                    int h3 = m94612h(null);
                                                    if (h3 == 0) {
                                                        this.f111105b.mo54771f(4);
                                                    } else if (h3 == 3) {
                                                        this.f111105b.mo54771f(1);
                                                    } else if (h3 != 4) {
                                                        this.f111105b.mo54771f(2);
                                                    } else {
                                                        this.f111109g.mo55125a(622);
                                                        m94624q();
                                                        m94618k();
                                                        m94621n();
                                                        this.f111105b.mo54771f(3);
                                                        if (cfeo.f183719a.mo6606a().mo80921H()) {
                                                            m94611g();
                                                        }
                                                    }
                                                }
                                            }
                                            azfz = f111100a;
                                        }
                                    }
                                    if (this.f111105b.mo54770e()) {
                                        this.f111105b.mo54786j(0);
                                        if (this.f111105b.mo54793o() && !cfec.m138765b()) {
                                            int c3 = m94596c((Intent) null, (LocalEntityId) null);
                                            if (c3 == 0) {
                                                this.f111105b.mo54786j(4);
                                            } else if (c3 == 3) {
                                                this.f111105b.mo54786j(1);
                                            } else if (c3 != 4) {
                                                this.f111105b.mo54786j(2);
                                            } else {
                                                m94624q();
                                                m94621n();
                                                this.f111105b.mo54786j(3);
                                            }
                                            azfz = f111100a;
                                        } else {
                                            this.f111105b.mo54786j(4);
                                            azfz = f111100a;
                                        }
                                    }
                                    this.f111109g.mo55125a(620);
                                    this.f111105b.mo54771f(0);
                                    if (this.f111105b.mo54727A()) {
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.device_unregistered_action".equals(intent.getAction())) {
                                    String stringExtra5 = intent2.getStringExtra("msRecvId");
                                    if (TextUtils.isEmpty(stringExtra5)) {
                                        String stringExtra6 = intent2.getStringExtra("id_hash");
                                        if (this.f111105b.mo54770e()) {
                                            String a6 = srv.m36160a(spn.m35862a(this.f111105b.mo54738a(), "MD5"));
                                            new Object[1][0] = a6;
                                            if (a6.equals(stringExtra6)) {
                                                m94621n();
                                                m94624q();
                                            }
                                        }
                                    } else {
                                        try {
                                            LocalEntityId b4 = LocalEntityId.m94551b((cbma) azol.m85935a((bxxk) cbma.f177591f.mo74142c(7), Base64.decode(stringExtra5, 2)));
                                            Iterator it = azcv.m85357a(this.f111106c).mo54702d().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    new Object[1][0] = b4;
                                                    break;
                                                } else if (((LocalEntityId) it.next()).equals(b4)) {
                                                    if (azcv.m85357a(this.f111106c).mo54703e(b4) == 1) {
                                                        this.f111109g.mo55142a(13, b4, 2);
                                                        if (!this.f111105b.mo54770e()) {
                                                            m94621n();
                                                            m94624q();
                                                        }
                                                    } else {
                                                        this.f111109g.mo55141a(14, b4);
                                                    }
                                                }
                                            }
                                        } catch (IllegalArgumentException e5) {
                                            azoj.m85931a("RegisterService", e5, "Failed to decode id %s", stringExtra5);
                                        }
                                    }
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.handle_external_chat_intent_action".equals(intent.getAction())) {
                                    new soa(9, new azfr(this, intent2)).start();
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.handle_external_lighter_intent_action".equals(intent.getAction())) {
                                    new soa(9, new azfs(this, intent2)).start();
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.anonymous_registration_action".equals(intent.getAction())) {
                                    m94611g();
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.anonymous_token_refresh_action".equals(intent.getAction())) {
                                    m94609g(intent);
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.refresh_gcm_token_action".equals(intent.getAction())) {
                                    azod.m85906a();
                                    Context context = this.f111106c;
                                    azdl.m85412a(context).mo54777g(azod.m85905a(context, "466216207879"));
                                    azfz = f111100a;
                                } else if ("com.google.android.gms.matchstick.handle_register_refresh_response_action".equals(intent.getAction())) {
                                    cblg cblg = (cblg) azol.m85935a((bxxk) cblg.f177496f.mo74142c(7), intent2.getByteArrayExtra("register_refresh_response_extra"));
                                    cblf cblf = (cblf) azol.m85935a((bxxk) cblf.f177482m.mo74142c(7), intent2.getByteArrayExtra("register_refresh_request_extra"));
                                    if (cblg == null || cblf == null) {
                                        azoj.m85933c("RegisterService", "Empty RegisterRefresh request or response.", new Object[0]);
                                    } else {
                                        try {
                                            LocalEntityId a7 = azoi.m85924a(intent);
                                            if (cfec.m138765b()) {
                                                if (a7 != null && a7.f111075b == 7) {
                                                    m94581a(a7, cblg, cblf);
                                                }
                                            }
                                            m94579a(cblg, cblf, azbw.m85224a(this.f111106c, intent2.getByteArrayExtra("register_refresh_new_public_key_extra"), intent2.getByteArrayExtra("register_refresh_new_private_key_extra")), true);
                                        } catch (chuw | gid e6) {
                                            this.f111109g.mo55154a(10, e6);
                                        }
                                    }
                                    azfz = f111100a;
                                } else if (cfec.m138765b()) {
                                    m94607f(intent);
                                    azfz = f111100a;
                                } else {
                                    if (e2) {
                                        if (!this.f111105b.mo54795q()) {
                                            z2 = true;
                                            byteArrayExtra = intent2.getByteArrayExtra("invalid_auth_token_extra");
                                            if (byteArrayExtra != null) {
                                                if (Arrays.equals(byteArrayExtra, this.f111105b.mo54760c())) {
                                                    this.f111105b.mo54741a((cblx) null);
                                                }
                                            }
                                            intent2.removeExtra("invalid_auth_token_extra");
                                            if (azfn.m85579a(this.f111106c)) {
                                                this.f111109g.mo55126a(7, 21);
                                                this.f111112j.mo54873a();
                                                azfz = f111100a;
                                            } else {
                                                if (e2) {
                                                    if (!mo60390b()) {
                                                        if (m94588b(intent2, (LocalEntityId) null) != 1) {
                                                            int a8 = m94566a(intent2, 3);
                                                            this.f111109g.mo55160a("Matchstick.Unregister.Reason", 2);
                                                            if (a8 != 1) {
                                                                m94624q();
                                                                m94621n();
                                                                azfz = f111100a;
                                                            }
                                                        }
                                                        azfz = f111100a;
                                                    }
                                                }
                                                String string = this.f111105b.f99088a.getString("google_account_name_key", null);
                                                if (string != null) {
                                                    z3 = azoe.m85908a(this.f111106c).mo55114a(string) == null;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z2) {
                                                    if (!z3 && !mo60392c()) {
                                                        try {
                                                            if (!this.f111105b.mo54792n()) {
                                                                azdl azdl5 = this.f111105b;
                                                                long j4 = azdl5.f99088a.getLong("tachyon_auth_expiration_timestamp_ms", -1) - cfeo.f183719a.mo6606a().mo81039bt();
                                                                if (azdl5.mo54792n() || j4 < System.currentTimeMillis()) {
                                                                    if (m94617j(intent)) {
                                                                    }
                                                                }
                                                                if (cfeo.f183719a.mo6606a().mo81080i() && intent2.getBooleanExtra("triggered_by_unauthenticated_rpc_failure_retry", false)) {
                                                                    ScheduledTaskService.m94665c(this.f111106c);
                                                                }
                                                                this.f111109g.mo55124a();
                                                                azfz = f111100a;
                                                            }
                                                            m94576a(intent2, (LocalEntityId) null);
                                                        } catch (IllegalArgumentException e7) {
                                                            azoj.m85931a("RegisterService", e7, "handle token refresh", new Object[0]);
                                                        }
                                                        azfz = f111100a;
                                                    } else if (m94588b(intent2, (LocalEntityId) null) == 1) {
                                                        azfz = f111100a;
                                                    } else {
                                                        int a9 = !z3 ? m94566a(intent2, 4) : m94567a(intent2, 2, (LocalEntityId) null);
                                                        this.f111109g.mo55160a("Matchstick.Unregister.Reason", !z3 ? 3 : 1);
                                                        if (a9 != 1) {
                                                            m94621n();
                                                        } else {
                                                            azfz = f111100a;
                                                        }
                                                    }
                                                }
                                                m94624q();
                                                String string2 = this.f111105b.f99088a.getString("last_silent_register_intent_action", null);
                                                if (!"com.google.android.gms.matchstick.register_intent_google_account_change".equals(intent.getAction())) {
                                                    j2 = cfeo.m138858O();
                                                } else if ("com.google.android.gms.matchstick.register_intent_google_account_change".equals(string2)) {
                                                    j2 = cfeo.f183719a.mo6606a().mo81001bH();
                                                } else {
                                                    j2 = 0;
                                                }
                                                if (j2 <= 0 || System.currentTimeMillis() - this.f111105b.mo54797s() >= j2) {
                                                    String h4 = m94613h();
                                                    if (h4 != null) {
                                                        civt i5 = m94614i();
                                                        if (i5 != null) {
                                                            List b5 = azoe.m85910b(this.f111106c);
                                                            Pair j5 = m94616j();
                                                            if (!m94595b(j5)) {
                                                                if (m94584a(j5)) {
                                                                    azoj.m85933c("RegisterService", "Anonymous registration unregistered by server", new Object[0]);
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = (byte[]) j5.first;
                                                                }
                                                                String a10 = azot.m85961a(this.f111106c, this.f111108f);
                                                                cblj a11 = m94571a((TextUtils.isEmpty(a10) || cfeo.m138883n()) ? null : a10, h4, i5, bArr);
                                                                if (((long) this.f111105b.mo54798t()) < cfeo.m138849F()) {
                                                                    this.f111105b.mo54799u();
                                                                    z4 = false;
                                                                } else {
                                                                    z4 = true;
                                                                }
                                                                Iterator it2 = b5.iterator();
                                                                int i6 = 0;
                                                                while (true) {
                                                                    if (!it2.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Account account = (Account) it2.next();
                                                                    i6 += i2;
                                                                    try {
                                                                        cblj cblj2 = a11;
                                                                        try {
                                                                            this.f111105b.mo54762d(System.currentTimeMillis());
                                                                            this.f111105b.mo54743a("last_silent_register_intent_action", intent.getAction());
                                                                            if (account != null) {
                                                                                try {
                                                                                    azoe.m85909a(this.f111116n, this.f111106c, account, true);
                                                                                    new Object[1][i3] = account.name;
                                                                                    str = account.name;
                                                                                } catch (chuw | gid e8) {
                                                                                    exc = e8;
                                                                                    cblj = cblj2;
                                                                                }
                                                                            } else {
                                                                                str = null;
                                                                            }
                                                                            azph azph = this.f111109g;
                                                                            if (a10 != null) {
                                                                                strArr = new String[]{a10};
                                                                            } else {
                                                                                strArr = null;
                                                                            }
                                                                            azph.mo55145a(4, (LocalEntityId) null, str, strArr, (String[]) null);
                                                                            if (!z4) {
                                                                                new Object[1][0] = cblj2;
                                                                                cblj = cblj2;
                                                                                try {
                                                                                    cblk = this.f111114l.mo34892a(this.f111116n, cblj);
                                                                                    str2 = str;
                                                                                    new Object[1][0] = cblk;
                                                                                } catch (chuw e9) {
                                                                                    e = e9;
                                                                                    exc = e;
                                                                                    this.f111109g.mo55154a(6, exc);
                                                                                    azoj.m85931a("RegisterService", exc, "Exception during register request.", new Object[0]);
                                                                                    if (i6 != b5.size()) {
                                                                                    }
                                                                                } catch (gid e10) {
                                                                                    e = e10;
                                                                                    exc = e;
                                                                                    this.f111109g.mo55154a(6, exc);
                                                                                    azoj.m85931a("RegisterService", exc, "Exception during register request.", new Object[0]);
                                                                                    if (i6 != b5.size()) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cblj = cblj2;
                                                                                str2 = str;
                                                                                new Object[1][0] = cblj;
                                                                                cblk = this.f111114l.mo34894b(this.f111116n, cblj);
                                                                                new Object[1][0] = cblk;
                                                                            }
                                                                            if (cblk.f177524c) {
                                                                                cbma cbma = cblk.f177522a;
                                                                                if (cbma == null) {
                                                                                    cbma = null;
                                                                                }
                                                                                if (azof.m85913a(cbma)) {
                                                                                    this.f111109g.mo55126a(6, 19);
                                                                                    if (i6 == b5.size()) {
                                                                                        m94599c(intent2, true);
                                                                                        this.f111109g.mo55124a();
                                                                                        this.f111105b.mo54784i("ID_UNREACHABLE");
                                                                                        break;
                                                                                    }
                                                                                    a11 = cblj;
                                                                                    i2 = 1;
                                                                                    i3 = 0;
                                                                                }
                                                                            }
                                                                            if (cblk.f177523b != null) {
                                                                                cbma cbma2 = cblk.f177522a;
                                                                                if (cbma2 == null) {
                                                                                    cbma2 = null;
                                                                                }
                                                                                if (azof.m85913a(cbma2)) {
                                                                                    this.f111105b.mo54784i("SUCCESS");
                                                                                    cblx cblx6 = cblk.f177523b;
                                                                                    if (cblx6 == null) {
                                                                                        cblx6 = cblx.f177575c;
                                                                                    }
                                                                                    cbma cbma3 = cblk.f177522a;
                                                                                    if (cbma3 == null) {
                                                                                        cbma3 = cbma.f177591f;
                                                                                    }
                                                                                    String str4 = cbma3.f177594b;
                                                                                    if (cblk.f177525d) {
                                                                                        account = null;
                                                                                    }
                                                                                    m94580a(i5, cblx6, str4, account);
                                                                                    if (!azpi.m86080b(bArr)) {
                                                                                        this.f111109g.mo55125a(624);
                                                                                    }
                                                                                    this.f111109g.mo55124a();
                                                                                    azph azph2 = this.f111109g;
                                                                                    cbma cbma4 = cblk.f177522a;
                                                                                    if (cbma4 != null) {
                                                                                        localEntityId = LocalEntityId.m94551b(cbma4);
                                                                                    } else {
                                                                                        localEntityId = null;
                                                                                    }
                                                                                    if (!cblk.f177525d) {
                                                                                        str3 = str2;
                                                                                    } else {
                                                                                        str3 = null;
                                                                                    }
                                                                                    String[] strArr2 = a10 != null ? new String[]{a10} : null;
                                                                                    String[] strArr3 = new String[1];
                                                                                    cbma cbma5 = cblk.f177522a;
                                                                                    if (cbma5 == null) {
                                                                                        cbma5 = cbma.f177591f;
                                                                                    }
                                                                                    strArr3[0] = cbma5.f177594b;
                                                                                    azph2.mo55145a(5, localEntityId, str3, strArr2, strArr3);
                                                                                } else {
                                                                                    this.f111109g.mo55126a(6, 25);
                                                                                }
                                                                            } else {
                                                                                this.f111109g.mo55126a(6, 19);
                                                                                if (i6 == b5.size()) {
                                                                                    m94599c(intent2, true);
                                                                                    this.f111109g.mo55124a();
                                                                                    this.f111105b.mo54784i("INVALID_AUTH_TOKEN");
                                                                                    break;
                                                                                }
                                                                                a11 = cblj;
                                                                                i2 = 1;
                                                                                i3 = 0;
                                                                            }
                                                                        } catch (chuw e11) {
                                                                            e = e11;
                                                                            cblj = cblj2;
                                                                            exc = e;
                                                                            this.f111109g.mo55154a(6, exc);
                                                                            azoj.m85931a("RegisterService", exc, "Exception during register request.", new Object[0]);
                                                                            if (i6 != b5.size()) {
                                                                            }
                                                                        } catch (gid e12) {
                                                                            e = e12;
                                                                            cblj = cblj2;
                                                                            exc = e;
                                                                            this.f111109g.mo55154a(6, exc);
                                                                            azoj.m85931a("RegisterService", exc, "Exception during register request.", new Object[0]);
                                                                            if (i6 != b5.size()) {
                                                                            }
                                                                        }
                                                                    } catch (chuw e13) {
                                                                        e = e13;
                                                                        cblj = a11;
                                                                        exc = e;
                                                                        this.f111109g.mo55154a(6, exc);
                                                                        azoj.m85931a("RegisterService", exc, "Exception during register request.", new Object[0]);
                                                                        if (i6 != b5.size()) {
                                                                            m94599c(intent2, true);
                                                                            this.f111109g.mo55124a();
                                                                            this.f111105b.mo54784i(exc.getMessage());
                                                                            azfz = f111100a;
                                                                            azfz.mo54888a();
                                                                        }
                                                                        a11 = cblj;
                                                                        i2 = 1;
                                                                        i3 = 0;
                                                                    } catch (gid e14) {
                                                                        e = e14;
                                                                        cblj = a11;
                                                                        exc = e;
                                                                        this.f111109g.mo55154a(6, exc);
                                                                        azoj.m85931a("RegisterService", exc, "Exception during register request.", new Object[0]);
                                                                        if (i6 != b5.size()) {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                m94599c(intent2, true);
                                                                this.f111109g.mo55125a(4);
                                                                this.f111109g.mo55126a(6, 34);
                                                            }
                                                        } else {
                                                            azoj.m85932b("RegisterService", "Failed to generate key pair.", new Object[0]);
                                                            this.f111109g.mo55125a(4);
                                                            this.f111109g.mo55126a(6, 24);
                                                            m94599c(intent2, true);
                                                        }
                                                    } else {
                                                        azoj.m85932b("RegisterService", "Failed to get GCM token", new Object[0]);
                                                        this.f111109g.mo55125a(4);
                                                        this.f111109g.mo55126a(6, 23);
                                                        m94599c(intent2, true);
                                                    }
                                                    azfz = f111100a;
                                                } else {
                                                    m94599c(intent2, true);
                                                    this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD);
                                                    azfz = f111100a;
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                    byteArrayExtra = intent2.getByteArrayExtra("invalid_auth_token_extra");
                                    if (byteArrayExtra != null) {
                                    }
                                    intent2.removeExtra("invalid_auth_token_extra");
                                    if (azfn.m85579a(this.f111106c)) {
                                    }
                                }
                            } catch (rfv | rfw e15) {
                                azoj.m85931a("RegisterService", e15, "Google play services not available", new Object[0]);
                                this.f111109g.mo55126a(125, 20);
                                if (m94608f(intent.getAction())) {
                                    this.f111105b.mo54780h(2);
                                    this.f111105b.mo54783i(2);
                                    this.f111105b.mo54776g(2);
                                    this.f111105b.mo54786j(2);
                                }
                                m94599c(intent2, "com.google.android.gms.matchstick.register_intent_action".equals(intent.getAction()));
                                azfz = f111100a;
                            }
                        } else {
                            if (!z) {
                                if (!mo60390b()) {
                                    this.f111109g.mo55126a(7, 22);
                                    azfz = f111100a;
                                } else if (!m94608f(intent.getAction()) && this.f111105b.mo54731E() && !cfeo.f183719a.mo6606a().mo80916C()) {
                                    this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED);
                                    azfz = f111100a;
                                }
                            }
                            aptm.m70976a(this);
                            cblx cblx7 = null;
                            if (!"com.google.android.gms.matchstick.user_initiated_register_action".equals(intent.getAction())) {
                            }
                        }
                        azfz.mo54888a();
                    } else if ("com.google.android.gms.matchstick.check_registration_action".equals(intent.getAction())) {
                        z = true;
                        if (e2) {
                        }
                        azfz.mo54888a();
                    }
                }
                z = false;
                if (e2) {
                }
                azfz.mo54888a();
            }
        }
    }

    /* renamed from: e */
    private final void m94605e() {
        azph.m85998a(this.f111106c).mo55125a(1960);
        try {
            bnre i = ((bngx) azbj.m85193a(this.f111106c).mo54563c().mo56338a().get()).listIterator();
            boolean z = true;
            while (i.hasNext()) {
                if (!mo60387a((bcoh) i.next())) {
                    z = false;
                }
            }
            if (z) {
                azbj.m85194a();
                this.f111105b.mo54773f(false);
            }
            new Object[1][0] = Boolean.valueOf(z);
            azph.m85998a(this.f111106c).mo55125a(1962);
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("RegisterService", e, "Failed to unregister all Lighter registrations", new Object[0]);
            azph.m85998a(this.f111106c).mo55126a(1961, 68);
        }
    }

    /* renamed from: b */
    private static cbkb m94589b(byte[] bArr) {
        bxvd da = cbkb.f177386d.mo74144da();
        cbmo a = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbkb) da.f164949b).f177388a = a;
        return (cbkb) da.mo74062i();
    }

    /* renamed from: c */
    private final cblv m94597c(String str) {
        bxvd da = cblv.f177568c.mo74144da();
        cbmo a = azfn.m85575a(this.f111105b.mo54781h("user_register_response_auth_token"));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblv cblv = (cblv) da.f164949b;
        a.getClass();
        cblv.f177570a = a;
        str.getClass();
        cblv.f177571b = str;
        return (cblv) da.mo74062i();
    }

    /* renamed from: i */
    private static final String m94615i(Intent intent) {
        Uri data;
        String stringExtra = intent.getStringExtra("args");
        return (!TextUtils.isEmpty(stringExtra) || (data = intent.getData()) == null) ? stringExtra : data.getQueryParameter("args");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, android.content.Context):boolean
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.b(android.content.Intent, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, int):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, civt):cbld
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, android.content.Context):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(java.lang.String, int):void
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.a(android.content.Intent, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: f */
    private final void m94607f(Intent intent) {
        Intent intent2 = intent;
        if (!azfn.m85579a(this.f111106c)) {
            this.f111109g.mo55126a(7, 21);
            this.f111112j.mo54873a();
            return;
        }
        if (this.f111105b.mo54770e() && !mo60390b()) {
            m94592b(intent2, false);
        } else if (mo60392c()) {
            if (this.f111105b.mo54775f()) {
                LocalEntityId localEntityId = new LocalEntityId(this.f111105b.mo54738a(), 1, "MS");
                m94587a(localEntityId);
                if (azcv.m85357a(this.f111106c).mo54703e(localEntityId) != 1) {
                    return;
                }
            }
            m94577a(intent2, false);
        } else if ("com.google.android.gms.matchstick.register_intent_google_account_change".equals(intent.getAction())) {
            List b = azoe.m85910b(this.f111106c);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                Account account = (Account) b.get(i);
                if (account != null) {
                    if (azcv.m85357a(this.f111106c).mo54699c(new LocalEntityId(account.name, 7, "MS")) == null) {
                        String h = m94613h();
                        if (h != null) {
                            civt i2 = m94614i();
                            if (i2 != null) {
                                m94583a(intent, h, i2, account, azot.m85966a(this.f111106c, this.f111108f, this.f111105b.mo54748b(), this.f111105b.mo54738a()), false);
                            } else {
                                azoj.m85932b("RegisterService", "Failed to generate key pair.", new Object[0]);
                                return;
                            }
                        } else {
                            azoj.m85932b("RegisterService", "Failed to get GCM token", new Object[0]);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            List d = azcv.m85357a(this.f111106c).mo54702d();
            int size2 = d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                LocalEntityId localEntityId2 = (LocalEntityId) d.get(i3);
                if (localEntityId2.f111075b == 7 && azoe.m85908a(this.f111106c).mo55114a(localEntityId2.f111074a) == null) {
                    azoi.m85926a(intent2, localEntityId2);
                    m94566a(intent2, 2);
                    this.f111109g.mo55160a("Matchstick.Unregister.Reason", 1);
                    azcv.m85357a(this.f111106c).mo54703e(localEntityId2);
                }
            }
        } else {
            byte[] byteArrayExtra = intent2.getByteArrayExtra("invalid_auth_token_extra");
            boolean booleanExtra = intent2.getBooleanExtra("force_refresh", false);
            List d2 = azcv.m85357a(this.f111106c).mo54702d();
            int size3 = d2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                LocalEntityId localEntityId3 = (LocalEntityId) d2.get(i4);
                azct c = azcv.m85357a(this.f111106c).mo54699c(localEntityId3);
                if (c != null && (booleanExtra || m94585a(c) || Arrays.equals(c.f99005b, byteArrayExtra))) {
                    int c2 = m94596c(intent2, localEntityId3);
                    if (cfeo.m138846C() && c2 != 0) {
                        if (c2 == 3 || c2 != 4) {
                            break;
                        }
                        azcv.m85357a(this.f111106c).mo54703e(localEntityId3);
                        for (LocalEntityId localEntityId4 : c.f99010g) {
                            azan.m85141a(this.f111106c).mo54537a(localEntityId4);
                        }
                    }
                }
            }
            if (System.currentTimeMillis() - this.f111105b.mo54797s() < cfeo.m138858O()) {
                m94599c(intent2, true);
                this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD);
                return;
            }
            m94577a(intent2, false);
        }
    }

    /* renamed from: j */
    private static final boolean m94617j(Intent intent) {
        return intent.getBooleanExtra("periodic_registration_intent_extra", false);
    }

    /* renamed from: e */
    public final void mo60393e(Intent intent) {
        if (intent.hasExtra("launch_session_id")) {
            azpk.m86089a(this.f111106c).mo55177a(intent.getStringExtra("launch_session_id"));
        }
        if (intent.hasExtra("launch_entry_intent")) {
            azpk.m86089a(this.f111106c).mo55176a(intent.getIntExtra("launch_entry_intent", 0));
        }
        if (intent.hasExtra("launch_entry_point")) {
            azpk.m86089a(this.f111106c).mo55181b(intent.getStringExtra("launch_entry_point"));
        }
    }

    /* renamed from: b */
    private final cblh m94590b(String str, String str2, civt civt, byte[] bArr) {
        bxvd da = cblh.f177503d.mo74144da();
        cbmo a = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cblh) da.f164949b).f177505a = a;
        cbma a2 = azfn.m85574a(str, this.f111113k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cblh) da.f164949b).f177506b = a2;
        cbld a3 = m94570a(str2, civt);
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a3);
        cblc cblc = (cblc) bxvd;
        azhl.m85713a(this.f111106c);
        azhl.m85715a(this.f111106c, cblc, str, 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbld cbld = (cbld) cblc.mo74062i();
        cbld.getClass();
        ((cblh) da.f164949b).f177507c = cbld;
        return (cblh) da.mo74062i();
    }

    /* renamed from: c */
    public static void m94598c(Context context, azdl azdl, boolean z) {
        azdl azdl2 = azdl;
        long bn = cfeo.f183719a.mo6606a().mo81033bn();
        long j = azdl2.f99088a.getLong("periodic_app_metadata_sync_interval_sec", 0);
        float bm = (float) cfeo.f183719a.mo6606a().mo81032bm();
        float f = azdl2.f99088a.getFloat("periodic_app_metadata_sync_flex", 0.0f);
        long bo = cfeo.f183719a.mo6606a().mo81034bo();
        long j2 = azdl2.f99088a.getLong("periodic_app_metadata_sync_interval_jitter_sec", 0);
        if (!z && j == bn && bm == f && bo == j2) {
            azph.m85998a(context).mo55125a(167);
            return;
        }
        ScheduledTaskService.m94659a(context, "gms:matchstick:periodicSyncAppMetadata", azfo.m85591a(bo) + bn, bm);
        SharedPreferences.Editor edit = azdl2.f99088a.edit();
        edit.putLong("periodic_app_metadata_sync_interval_sec", bn);
        edit.apply();
        SharedPreferences.Editor edit2 = azdl2.f99088a.edit();
        edit2.putFloat("periodic_app_metadata_sync_flex", bm);
        edit2.apply();
        SharedPreferences.Editor edit3 = azdl2.f99088a.edit();
        edit3.putLong("periodic_app_metadata_sync_interval_jitter_sec", bo);
        edit3.apply();
        azph.m85998a(context).mo55125a(166);
    }

    /* renamed from: g */
    private final void m94610g(String str) {
        azcm a = azcm.m85300a(this.f111106c);
        if (a.mo54658b()) {
            azon.m85936a();
            SQLiteDatabase sQLiteDatabase = a.f98996b;
            String valueOf = String.valueOf(str);
            azon.m85937a(sQLiteDatabase, ":8:anonymous", valueOf.length() == 0 ? new String(":1:") : ":1:".concat(valueOf), a.f98995a);
        }
    }

    /* renamed from: d */
    public static cbbl m94601d(Intent intent) {
        if (!"com.google.android.gms.matchstick.handle_external_chat_intent_action".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("args");
        String stringExtra2 = intent.getStringExtra("bot_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            return m94602d(stringExtra);
        }
        Uri data = intent.getData();
        if (data != null) {
            stringExtra = data.getQueryParameter("args");
            stringExtra2 = data.getQueryParameter("bot_id");
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            return m94602d(stringExtra);
        }
        bxvd da = cbbl.f176575p.mo74144da();
        cbma b = azfn.m85584b(stringExtra2, "FB");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbbl) da.f164949b).f176577a = b;
        String stringExtra3 = intent.getStringExtra("m_n");
        if (stringExtra3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            stringExtra3.getClass();
            ((cbbl) da.f164949b).f176579c = stringExtra3;
        }
        String stringExtra4 = intent.getStringExtra("m_t");
        if (stringExtra4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            stringExtra4.getClass();
            ((cbbl) da.f164949b).f176580d = stringExtra4;
        }
        String stringExtra5 = intent.getStringExtra("im");
        if (stringExtra5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            stringExtra5.getClass();
            ((cbbl) da.f164949b).f176578b = stringExtra5;
        }
        String stringExtra6 = intent.getStringExtra("d_c");
        if (stringExtra6 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            stringExtra6.getClass();
            ((cbbl) da.f164949b).f176584h = stringExtra6;
        }
        String stringExtra7 = intent.getStringExtra("ui");
        if (stringExtra7 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            stringExtra7.getClass();
            ((cbbl) da.f164949b).f176585i = stringExtra7;
        }
        String stringExtra8 = intent.getStringExtra("web_url");
        if (stringExtra8 != null && azpj.m86088a(stringExtra8)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            stringExtra8.getClass();
            ((cbbl) da.f164949b).f176586j = stringExtra8;
        }
        return (cbbl) da.mo74062i();
    }

    /* renamed from: g */
    private final boolean m94611g() {
        long j;
        this.f111105b.mo54766e(1);
        this.f111109g.mo55125a(602);
        if (!cfcv.m138704b()) {
            this.f111105b.mo54766e(4);
            this.f111109g.mo55125a(603);
            return false;
        } else if (!cfec.m138765b() && this.f111105b.mo54770e()) {
            this.f111105b.mo54766e(2);
            this.f111109g.mo55125a(604);
            return false;
        } else if (this.f111105b.mo54802x()) {
            this.f111105b.mo54766e(3);
            this.f111109g.mo55125a(605);
            return true;
        } else {
            azod.m85906a();
            String b = azod.m85907b(this.f111106c, "466216207879");
            civt a = azbw.m85223a();
            if (b == null) {
                j = 7;
            } else if (a != null) {
                bxvd da = cbla.f177461f.mo74144da();
                cbmo a2 = azfn.m85575a((byte[]) null);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbla cbla = (cbla) da.f164949b;
                a2.getClass();
                cbla.f177463a = a2;
                String str = this.f111113k;
                str.getClass();
                cbla.f177464b = str;
                cbld a3 = m94570a(b, a);
                bxvd bxvd = (bxvd) a3.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a3);
                cblc cblc = (cblc) bxvd;
                azhl.m85713a(this.f111106c);
                azhl.m85715a(this.f111106c, cblc, null, 0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbld cbld = (cbld) cblc.mo74062i();
                cbld.getClass();
                ((cbla) da.f164949b).f177465c = cbld;
                if (cfeo.m138875f()) {
                    cbkz a4 = azhl.m85713a(this.f111106c).mo54928a();
                    if (a4 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a4.getClass();
                        ((cbla) da.f164949b).f177466d = a4;
                    }
                    cbmd a5 = azou.m85975a(azot.m85969b(this.f111108f));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a5.getClass();
                    ((cbla) da.f164949b).f177467e = a5;
                }
                cbla cbla2 = (cbla) da.mo74062i();
                new Object[1][0] = cbla2;
                this.f111105b.mo54766e(5);
                try {
                    this.f111109g.mo55125a(607);
                    afiy afiy = this.f111114l;
                    ClientContext clientContext = this.f111116n;
                    if (afiy.f64264c == null) {
                        afiy.f64264c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.IM/RegisterAnonymous", ciie.m150370a(cbla.f177461f), ciie.m150370a(cblb.f177468b));
                    }
                    cblb cblb = (cblb) afiy.f64269a.mo25553a(afiy.f64264c, clientContext, cbla2, (long) afiy.f64263b, TimeUnit.MILLISECONDS);
                    this.f111109g.mo55125a(608);
                    new Object[1][0] = cblb;
                    if (cblb.f177470a != null) {
                        if (!cfec.m138765b()) {
                            m94624q();
                            m94623p();
                        }
                        m94618k();
                        this.f111105b.mo54742a("466216207879");
                        azdl azdl = this.f111105b;
                        cblx cblx = cblb.f177470a;
                        azdl.mo54751b(cblx == null ? null : cblx);
                        this.f111105b.mo54759c(a.f191541b.f191538a);
                        this.f111105b.mo54765d(a.f191540a.mo86595a());
                        SharedPreferences.Editor edit = this.f111105b.f99088a.edit();
                        edit.putInt("anonymous_registration_key_type", 1);
                        edit.apply();
                        this.f111105b.mo54753b(true);
                        this.f111105b.mo54796r();
                        this.f111105b.mo54750b(System.currentTimeMillis());
                        this.f111105b.mo54800v();
                        this.f111105b.mo54766e(6);
                        this.f111109g.mo55125a(610);
                        m94626s();
                        return true;
                    }
                    this.f111109g.mo55126a(609, 25);
                    this.f111105b.mo54766e(7);
                    return false;
                } catch (chuw | gid e) {
                    azoj.m85931a("RegisterService", e, "Exception during register request", new Object[0]);
                    this.f111109g.mo55154a(609, e);
                    this.f111105b.mo54766e(7);
                    return false;
                }
            } else {
                j = 7;
            }
            azoj.m85933c("RegisterService", "Could not send register request, token or keypair generation failed.", new Object[0]);
            this.f111105b.mo54766e(j);
            this.f111109g.mo55126a(606, b != null ? 24 : 23);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: a */
    private final int m94567a(Intent intent, int i, LocalEntityId localEntityId) {
        cbkb cbkb;
        byte[] bArr;
        new Object[1][0] = localEntityId;
        if (!cfec.m138765b()) {
            cbkb = m94589b(this.f111105b.mo54760c());
            localEntityId = LocalEntityId.m94551b(azfn.m85574a(this.f111105b.mo54738a(), this.f111113k));
        } else if (localEntityId == null) {
            return 2;
        } else {
            azoe.m85908a(this.f111106c).mo55115a(this.f111116n, localEntityId);
            azcs a = this.f111118p.mo54689a(localEntityId);
            if (a != null) {
                bArr = a.f99002a;
            } else {
                bArr = null;
            }
            cbkb = m94589b(bArr);
        }
        new Object[1][0] = cbkb;
        this.f111109g.mo55142a(15, localEntityId, i);
        try {
            afjd afjd = this.f111115m;
            ClientContext clientContext = this.f111116n;
            if (afjd.f64291d == null) {
                afjd.f64291d = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/DeleteAccount", ciie.m150370a(cbkb.f177386d), ciie.m150370a(cbkc.f177391a));
            }
            Object[] objArr = {(cbkc) afjd.f64296a.mo25553a(afjd.f64291d, clientContext, cbkb, (long) afjd.f64289b, TimeUnit.MILLISECONDS)};
            this.f111109g.mo55141a(16, localEntityId);
            return 0;
        } catch (chuw | gid e) {
            this.f111109g.mo55154a(17, e);
            azoj.m85931a("RegisterService", e, "deleteAccount()", new Object[0]);
            if (intent != null && azfn.m85581a(e)) {
                m94599c(intent, false);
                return 1;
            } else if (azfn.m85581a(e)) {
                return 3;
            } else {
                return 2;
            }
        }
    }

    /* renamed from: c */
    private final void m94599c(Intent intent, boolean z) {
        long j;
        long j2;
        azfo azfo = this.f111112j;
        if (z) {
            j = cfeo.f183719a.mo6606a().mo81052cd();
        } else {
            j = cfeo.m138862S();
        }
        if (z) {
            j2 = cfeo.f183719a.mo6606a().mo81051cc();
        } else {
            j2 = cfeo.m138861R();
        }
        long longExtra = !z ? intent.getLongExtra("retry_interval_intent_extra", 0) : azfo.f99238b.mo54732F();
        Intent a = m94569a(azfo.f99237a, intent.getAction());
        a.putExtras(intent);
        Intent a2 = azfo.mo54872a(a, longExtra, j, j2);
        long longExtra2 = a2.getLongExtra("retry_interval_intent_extra", 0);
        if (z) {
            azfo.f99238b.mo54788k(longExtra2);
        }
        azfo.mo54875a(a2);
    }

    /* renamed from: b */
    public static void m94591b(Context context, azdl azdl, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(cfgm.f183982a.mo6606a().mo81140a());
        long i = azdl.mo54782i();
        float aT = (float) cfeo.f183719a.mo6606a().mo80960aT();
        float f = azdl.f99088a.getFloat("periodic_token_refresh_flex", 0.0f);
        long b = cfgm.f183982a.mo6606a().mo81141b();
        long j = azdl.f99088a.getLong("periodic_token_refresh_interval_jitter_sec", 0);
        if (!z && i == millis && aT == f && b == j) {
            azph.m85998a(context).mo55125a(477);
            return;
        }
        ScheduledTaskService.m94659a(context, "gms:matchstick:periodicTokenRefresh", TimeUnit.MILLISECONDS.toSeconds(millis) + azfo.m85591a(b), aT);
        SharedPreferences.Editor edit = azdl.f99088a.edit();
        edit.putLong("periodic_token_refresh_interval_ms", millis);
        edit.apply();
        SharedPreferences.Editor edit2 = azdl.f99088a.edit();
        edit2.putFloat("periodic_token_refresh_flex", aT);
        edit2.apply();
        SharedPreferences.Editor edit3 = azdl.f99088a.edit();
        edit3.putLong("periodic_token_refresh_interval_jitter_sec", b);
        edit3.apply();
        azph.m85998a(context).mo55125a(478);
    }

    /* renamed from: h */
    private final String m94613h() {
        azod.m85906a();
        return azod.m85907b(this.f111106c, "466216207879");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: a */
    private final int m94568a(Intent intent, boolean z, LocalEntityId localEntityId) {
        bmxv bmxv;
        LocalEntityId localEntityId2;
        byte[] bArr;
        byte[] bArr2 = null;
        civt a = this.f111105b.mo54733G() ? azbw.m85223a() : null;
        if (!cfec.m138765b()) {
            bmxv = azhl.m85713a(this.f111106c).mo54926a(this.f111106c, System.currentTimeMillis() * 1000, a);
        } else if (localEntityId == null) {
            return 2;
        } else {
            String a2 = azoe.m85908a(this.f111106c).mo55115a(this.f111116n, localEntityId);
            if (!TextUtils.isEmpty(a2)) {
                localEntityId2 = new LocalEntityId(a2, 7, "MS");
            } else {
                localEntityId2 = localEntityId;
            }
            azhl a3 = azhl.m85713a(this.f111106c);
            Context context = this.f111106c;
            long currentTimeMillis = System.currentTimeMillis() * 1000;
            azox.m85982b();
            azod.m85906a();
            String b = azod.m85907b(context, "466216207879");
            if (b != null) {
                azct c = azcv.m85357a(context).mo54699c(localEntityId2);
                if (c != null) {
                    bArr = c.f99008e;
                } else {
                    bArr = null;
                }
                if (c != null) {
                    bArr2 = c.f99007d;
                }
                bmxv = bmxv.m108566b(a3.mo54929a(context, localEntityId2.mo60371b(), b, currentTimeMillis, azbw.m85224a(context, bArr, bArr2), null, a));
            } else {
                bmxv = bmvz.f131120a;
            }
        }
        if (!bmxv.mo66813a()) {
            this.f111109g.mo55126a(10, 23);
            if (intent == null) {
                return 3;
            }
            azoj.m85932b("RegisterService", "Failed to get GCM token", new Object[0]);
            m94599c(intent, false);
            return 1;
        }
        new Object[1][0] = bmxv.mo66814b();
        this.f111109g.mo55141a(8, localEntityId);
        try {
            cblg a4 = this.f111115m.mo34896a(this.f111116n, (cblf) bmxv.mo66814b());
            new Object[1][0] = a4;
            m94579a(a4, (cblf) bmxv.mo66814b(), a, !z);
            return 0;
        } catch (chuw | gid e) {
            azoj.m85931a("RegisterService", e, "Exception during token refresh.", new Object[0]);
            this.f111109g.mo55154a(10, e);
            if (!azfn.m85581a(e)) {
                if (azfn.m85586b(e)) {
                    return 4;
                }
                return 2;
            } else if (intent == null) {
                return 3;
            } else {
                m94599c(intent, false);
                return 1;
            }
        }
    }

    /* renamed from: c */
    public final void mo60391c(Intent intent) {
        bxte bxte;
        cbbl cbbl;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Lighter message intent: ");
        sb.append(valueOf);
        sb.toString();
        this.f111109g.mo55125a(1703);
        String i = m94615i(intent);
        this.f111104C = i;
        if (i == null) {
            this.f111109g.mo55125a(1705);
            azqi.m86166a(this.f111106c).mo55221a("Null Intent Args");
            return;
        }
        LocalEntityId a = azcv.m85357a(this.f111106c).mo54691a();
        if (a == null) {
            a = azcv.m85357a(this.f111106c).mo54692a(cfcv.m138704b());
        }
        if (a != null) {
            azqf.m86130a(this.f111106c);
            ContactId a2 = azqf.m86135a(a);
            try {
                bmxv bmxv = (bmxv) azbj.m85193a(this.f111106c).mo54563c().mo56342c(a2).get();
                if (!bmxv.mo66813a()) {
                    azct c = azcv.m85357a(this.f111106c).mo54699c(a);
                    if (c.mo54688a()) {
                        azph.m85998a(this.f111106c).mo55125a(376);
                        azpk.m86089a(this.f111106c).mo55185d("Matchstick.Latency.Lighter.MigrateRegistration.Time");
                        azbr.m85217a(this.f111106c, c);
                        bmxv = (bmxv) azbj.m85193a(this.f111106c).mo54563c().mo56342c(a2).get();
                    }
                    if (!bmxv.mo66813a()) {
                        throw new InterruptedException();
                    }
                }
                azpk.m86089a(this.f111106c).mo55187e("Matchstick.Latency.Lighter.MigrateRegistration.Time");
                if (cfgs.m139388H()) {
                    azqi.m86166a(this.f111106c).mo55219a((bcoh) bmxv.mo66814b());
                }
                azpk.m86089a(this.f111106c).mo55185d("Matchstick.Latency.Lighter.ParseConversationIntent.Time");
                bmxv a3 = azbj.m85193a(this.f111106c).mo54564d().mo56314a((bcoh) bmxv.mo66814b(), this.f111104C);
                azpk.m86089a(this.f111106c).mo55187e("Matchstick.Latency.Lighter.ParseConversationIntent.Time");
                if (!a3.mo66813a()) {
                    this.f111109g.mo55125a(1705);
                    azqi.m86166a(this.f111106c).mo55221a("Could not parse conversation intent");
                    return;
                }
                ArrayList a4 = bnkn.m109663a(bmyx.m108640a(',').mo66918a((CharSequence) cfgs.m139384D()));
                byte[] bArr = (byte[]) ((bcsp) a3.mo66814b()).mo57325i().get(cfeo.m138848E());
                if (bArr != null) {
                    try {
                        cbbl cbbl2 = (cbbl) GeneratedMessageLite.m124016a(cbbl.f176575p, bArr, bxus.m123744c());
                        if (cbbl2 == null) {
                            this.f111109g.mo55125a(1705);
                            azqi.m86166a(this.f111106c).mo55221a("Null ChatIntentApiArgs");
                            return;
                        }
                        this.f111109g.mo55125a(1704);
                        if (cfgs.m139415u()) {
                            if (!Collections.unmodifiableMap(cbbl2.f176589m).isEmpty()) {
                                azqi.m86166a(this.f111106c).mo55222a(Collections.unmodifiableMap(cbbl2.f176589m));
                            } else {
                                azoj.m85932b("RegisterService", "No metadata map in intent", new Object[0]);
                            }
                        }
                        mo60389b(cbbl2);
                        if (!a4.contains(m94573a((bcsp) a3.mo66814b())) || m94586a(this.f111127y)) {
                            azoj.m85933c("RegisterService", "Falling back to native flow", new Object[0]);
                            this.f111109g.mo55125a(1735);
                            if (m94628u()) {
                                m94627t();
                                return;
                            }
                        } else {
                            this.f111102A = (bcsp) a3.mo66814b();
                            this.f111103B = (bcoh) bmxv.mo66814b();
                        }
                        mo60384a(cbbl2);
                    } catch (bxwf e) {
                        azqi.m86166a(this.f111106c).mo55221a("Parsing ChatIntentApiArgs failed");
                        this.f111109g.mo55125a(1705);
                    }
                } else {
                    this.f111109g.mo55125a(1705);
                    azqi.m86166a(this.f111106c).mo55221a("Could not unwrap ChatIntentApiArgs from LighterConversationIntent");
                }
            } catch (InterruptedException | ExecutionException e2) {
                azoj.m85933c("RegisterService", "Could not retrieve account context", new Object[0]);
                azph.m85998a(this.f111106c).mo55126a(1734, 59);
                if (!m94628u()) {
                    cbex e3 = m94604e(m94615i(intent));
                    if (e3 != null) {
                        for (Map.Entry entry : Collections.unmodifiableMap(e3.f176863b).entrySet()) {
                            if (TextUtils.equals((CharSequence) entry.getKey(), cfeo.m138848E()) && (bxte = (bxte) entry.getValue()) != null && !bxte.f164766b.mo73779j() && (cbbl = (cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), bxte.f164766b.mo73780k())) != null) {
                                this.f111109g.mo55125a(372);
                                mo60389b(cbbl);
                                mo60384a(cbbl);
                                return;
                            }
                        }
                    }
                    azoj.m85933c("RegisterService", "Lighter message intent was not handled", new Object[0]);
                    this.f111109g.mo55125a(373);
                    return;
                }
                m94627t();
            }
        } else {
            this.f111109g.mo55125a(1705);
            azqi.m86166a(this.f111106c).mo55221a("No default user");
        }
    }

    /* renamed from: f */
    private static final boolean m94608f(String str) {
        return "com.google.android.gms.matchstick.user_initiated_register_action".equals(str) || "com.google.android.gms.matchstick.user_initiated_gaia_register_action".equals(str) || "com.google.android.gms.matchstick.user_initiated_unregister_action".equals(str) || "com.google.android.gms.matchstick.verify_register_action".equals(str) || "com.google.android.gms.matchstick.check_registration_action".equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004f, code lost:
        if (m94587a(r8) != false) goto L_0x008e;
     */
    /* renamed from: b */
    private final void m94592b(Intent intent, boolean z) {
        long j;
        long j2;
        Intent intent2 = intent;
        char c = 0;
        new Object[1][0] = Boolean.valueOf(z);
        if (this.f111105b.mo54770e()) {
            this.f111105b.mo54776g(0);
            this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA);
            List d = azcv.m85357a(this.f111106c).mo54702d();
            int size = d.size();
            int i = 0;
            boolean z2 = true;
            while (i < size) {
                LocalEntityId localEntityId = (LocalEntityId) d.get(i);
                new Object[1][c] = localEntityId.f111074a;
                azoi.m85926a(intent2, localEntityId);
                if (cfex.m139275b()) {
                    LocalEntityId a = azoi.m85924a(intent);
                    int b = m94588b((Intent) null, a);
                    if (b == 2 || b == 3) {
                        azdl azdl = this.f111105b;
                        if (b == 3) {
                            j = 1;
                        } else {
                            j = 2;
                        }
                        azdl.mo54776g(j);
                        this.f111109g.mo55141a((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, a);
                        z2 = false;
                        i++;
                        c = 0;
                    } else {
                        if (b != 4) {
                            int a2 = m94566a(intent2, 5);
                            this.f111109g.mo55160a("Matchstick.Unregister.Reason", 4);
                            if (a2 == 2 || a2 == 3) {
                                azdl azdl2 = this.f111105b;
                                if (a2 == 3) {
                                    j2 = 1;
                                } else {
                                    j2 = 2;
                                }
                                azdl2.mo54776g(j2);
                                this.f111109g.mo55141a((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, a);
                                z2 = false;
                                i++;
                                c = 0;
                            }
                        }
                        if (azcv.m85357a(this.f111106c).mo54703e(localEntityId) == 1) {
                            i++;
                            c = 0;
                        }
                    }
                }
                z2 = false;
                i++;
                c = 0;
            }
            if (z2) {
                this.f111109g.mo55125a((int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA);
                if (z) {
                    m94622o();
                }
                m94623p();
                m94624q();
                this.f111105b.mo54776g(3);
                return;
            }
            return;
        }
        if (z) {
            m94622o();
        }
        this.f111105b.mo54776g(4);
    }

    /* renamed from: d */
    private static cbbl m94602d(String str) {
        return (cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), sqd.m35969b(str));
    }

    /* renamed from: d */
    private final void m94603d() {
        azoj.m85930a("RegisterService", "checking registration with Lighter", new Object[0]);
        azph.m85998a(this.f111106c).mo55125a(1968);
        List b = azoe.m85910b(this.f111106c);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) b.get(i);
            if (account != null && !TextUtils.isEmpty(account.name)) {
                mo60385a(account.name);
            }
        }
        bngx.m109376e();
        try {
            bnre i2 = ((bngx) azbj.m85193a(this.f111106c).mo54563c().mo56338a().get()).listIterator();
            while (i2.hasNext()) {
                bcoh bcoh = (bcoh) i2.next();
                if (!TextUtils.equals(bcoh.mo57061e(), cfeo.m138879j())) {
                    mo60387a(bcoh);
                } else {
                    bmxv a = bcoh.mo57058b().mo57069a();
                    if (!a.mo66813a()) {
                        mo60387a(bcoh);
                    } else {
                        if (azoe.m85908a(this.f111106c).mo55114a((String) a.mo66814b()) == null) {
                            mo60387a(bcoh);
                        }
                        if (bcoh.mo57060d() == bcog.INVALID) {
                            mo60385a((String) a.mo66814b());
                        }
                    }
                }
            }
            azph.m85998a(this.f111106c).mo55125a(1970);
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85933c("RegisterService", "Could not retrieve account contexts", new Object[0]);
            azph.m85998a(this.f111106c).mo55126a(1969, 68);
            if (m94628u()) {
                m94627t();
            }
        }
    }

    /* renamed from: b */
    private final void m94593b(String str) {
        azcv.m85357a(this.f111106c).mo54705f(new LocalEntityId(str, 1, "MS"));
    }

    /* renamed from: a */
    public static Intent m94569a(Context context, String str) {
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            intent = IntentOperation.getStartIntent(context, SilentRegisterIntentOperation.class, "com.google.android.gms.matchstick.register_intent_action");
        } else {
            intent = IntentOperation.getStartIntent(context, SilentRegisterIntentOperation.class, str);
        }
        if (intent == null) {
            azph.m85998a(context).mo55126a(1753, 50);
        }
        return intent;
    }

    /* renamed from: b */
    public static boolean m94594b(Intent intent, Context context) {
        bmxy.m108581a(intent);
        Intent startIntent = IntentOperation.getStartIntent(context, SilentRegisterIntentOperation.class, intent.getAction());
        if (startIntent == null) {
            azoj.m85933c("RegisterService", "Unsupported SilentRegisterIntentOperation action %s", intent.getAction());
            return false;
        }
        startIntent.putExtras(intent);
        startIntent.setData(intent.getData());
        return context.startService(startIntent) != null;
    }

    /* renamed from: a */
    private final cbld m94570a(String str, civt civt) {
        int i = Build.VERSION.SDK_INT;
        cblc cblc = (cblc) cbld.f177471h.mo74144da();
        bxvd da = cblz.f177587c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cblz) da.f164949b).f177589a = 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((cblz) da.f164949b).f177590b = str;
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        cblz cblz = (cblz) da.mo74062i();
        cblz.getClass();
        ((cbld) cblc.f164949b).f177473a = cblz;
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        str.getClass();
        ((cbld) cblc.f164949b).f177474b = str;
        String languageTag = Locale.getDefault().toLanguageTag();
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        languageTag.getClass();
        ((cbld) cblc.f164949b).f177477e = languageTag;
        bxvd da2 = cbml.f177642c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbml) da2.f164949b).f177644a = cipl.m150696a(3);
        bxtx a = bxtx.m123261a(civt.f191540a.mo86595a());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a.getClass();
        ((cbml) da2.f164949b).f177645b = a;
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        cbml cbml = (cbml) da2.mo74062i();
        cbml.getClass();
        ((cbld) cblc.f164949b).f177475c = cbml;
        byte[] d = azot.m85972d(this.f111106c, this.f111108f);
        if (d != null) {
            bxtx a2 = bxtx.m123261a(d);
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            a2.getClass();
            ((cbld) cblc.f164949b).f177479g = a2;
        }
        azeg.m85519a();
        cblc.mo75236a(azeg.m85518a(this.f111106c));
        return (cbld) cblc.mo74062i();
    }

    /* renamed from: b */
    private static final boolean m94595b(Pair pair) {
        return (pair.first != null || ((Integer) pair.second).intValue() == 0 || ((Integer) pair.second).intValue() == 4) ? false : true;
    }

    /* renamed from: b */
    public final void mo60388b(Intent intent) {
        try {
            String uri = intent.toUri(0);
            this.f111119q = uri;
            new Object[1][0] = uri;
        } catch (IllegalArgumentException e) {
            this.f111119q = null;
            azoj.m85931a("RegisterService", e, "Unable to parse intent.", new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aznz.<init>(java.lang.String, int, int, java.lang.String, int, java.lang.String, boolean):void
     arg types: [java.lang.String, int, int, java.lang.String, int, java.lang.String, int]
     candidates:
      aznz.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, int, java.lang.String):void
      aznz.<init>(java.lang.String, int, int, java.lang.String, int, java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo60389b(cbbl cbbl) {
        if (cbbl != null) {
            cbma cbma = cbbl.f176577a;
            if (cbma != null) {
                this.f111120r = cbma.f177594b;
            }
            this.f111122t = cbbl.f176579c;
            this.f111123u = cbbl.f176580d;
            this.f111121s = cbbl.f176578b;
            this.f111125w = cbbl.f176582f;
            bxte bxte = cbbl.f176581e;
            if (bxte == null) {
                bxte = bxte.f164763c;
            }
            this.f111126x = bxte;
            this.f111128z = cbbl.f176583g;
            this.f111124v = cbbl.f176584h;
        }
        if (!TextUtils.isEmpty(this.f111120r)) {
            LocalEntityId a = azcv.m85357a(this.f111106c).mo54692a(cfcv.m138704b());
            if (a == null) {
                azoj.m85933c("RegisterService", "There is no sender available", new Object[0]);
            } else {
                this.f111127y = new aznz("FB", 1, 3, this.f111120r, a.f111075b, a.f111074a, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo60390b() {
        if (!cfeo.f183719a.mo6606a().mo81005bL()) {
            return false;
        }
        if (azot.m85974f(this.f111106c, this.f111108f)) {
            return true;
        }
        azoj.m85932b("RegisterService", "Not eligible for registration.", new Object[0]);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo60392c() {
        Set stringSet = this.f111105b.f99088a.getStringSet("sim_serial_numbers_set", null);
        if (cfeo.f183719a.mo6606a().mo81071cw() && stringSet != null && !stringSet.isEmpty()) {
            Pair a = this.f111110h.mo55111a();
            if (!((bngx) a.first).isEmpty()) {
                bnre i = ((bngx) a.first).listIterator();
                while (i.hasNext()) {
                    stringSet.remove((String) i.next());
                }
                if (!stringSet.isEmpty()) {
                    if (((bngx) a.second).isEmpty()) {
                        return true;
                    }
                    String a2 = this.f111105b.mo54738a();
                    bnre i2 = ((bngx) a.second).listIterator();
                    while (i2.hasNext()) {
                        if (TextUtils.equals(a2, (String) i2.next())) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        String b = this.f111105b.mo54748b();
        String e = azot.m85973e(this, this.f111108f);
        return (b == null || e == null || b.equals(e)) ? false : true;
    }

    /* renamed from: a */
    private final cblj m94571a(String str, String str2, civt civt, byte[] bArr) {
        String str3;
        bxvd da = cblj.f177513f.mo74144da();
        cbmo a = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cblj) da.f164949b).f177515a = a;
        if (str != null) {
            cbma a2 = azfn.m85574a(str, this.f111113k);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((cblj) da.f164949b).f177516b = a2;
        }
        String str4 = this.f111113k;
        cblj cblj = (cblj) da.f164949b;
        str4.getClass();
        cblj.f177517c = str4;
        cblj.f177519e = false;
        cbld a3 = m94570a(str2, civt);
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a3);
        cblc cblc = (cblc) bxvd;
        azhl.m85713a(this.f111106c);
        Context context = this.f111106c;
        cbma cbma = ((cblj) da.f164949b).f177516b;
        if (cbma != null) {
            str3 = cbma.f177594b;
        } else {
            str3 = "";
        }
        azhl.m85715a(context, cblc, str3, 0);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbld cbld = (cbld) cblc.mo74062i();
        cbld.getClass();
        ((cblj) da.f164949b).f177518d = cbld;
        return (cblj) da.mo74062i();
    }

    /* renamed from: a */
    private static cbls m94572a(byte[] bArr) {
        bxvd da = cbls.f177558b.mo74144da();
        cbmo a = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbls) da.f164949b).f177560a = a;
        return (cbls) da.mo74062i();
    }

    /* renamed from: a */
    private static final String m94573a(bcsp bcsp) {
        if (bcsp.mo57317a().mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            return bcsp.mo57317a().mo60558e().mo60493b();
        }
        return bcsp.mo57317a().mo60557d().mo60504b();
    }

    /* renamed from: a */
    public static void m94574a(Context context, azdl azdl, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(cfeo.f183719a.mo6606a().mo81038bs());
        long j = azdl.mo54785j();
        float aR = (float) cfeo.f183719a.mo6606a().mo80958aR();
        float f = azdl.f99088a.getFloat("periodic_sync_flex", 0.0f);
        long aS = cfeo.f183719a.mo6606a().mo80959aS();
        long j2 = azdl.f99088a.getLong("periodic_sync_interval_jitter_sec", 0);
        if (!z && j == millis && aR == f && aS == j2) {
            azph.m85998a(context).mo55125a(479);
            return;
        }
        ScheduledTaskService.m94659a(context, "gms:matchstick:periodicSync", TimeUnit.MILLISECONDS.toSeconds(millis) + azfo.m85591a(aS), aR);
        SharedPreferences.Editor edit = azdl.f99088a.edit();
        edit.putLong("periodic_sync_interval_ms", millis);
        edit.apply();
        SharedPreferences.Editor edit2 = azdl.f99088a.edit();
        edit2.putFloat("periodic_sync_flex", aR);
        edit2.apply();
        SharedPreferences.Editor edit3 = azdl.f99088a.edit();
        edit3.putLong("periodic_sync_interval_jitter_sec", aS);
        edit3.apply();
        azph.m85998a(context).mo55125a(480);
    }

    /* renamed from: a */
    public static void m94575a(Intent intent, Context context) {
        f111100a.mo54889a(context);
        if (!m94594b(intent, context)) {
            f111100a.mo54888a();
            azoj.m85933c("RegisterService", "Failed to start register intent", new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m94576a(Intent intent, LocalEntityId localEntityId) {
        if (m94596c(intent, localEntityId) == 0) {
            m94625r();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0302  */
    /* renamed from: a */
    private final void m94577a(Intent intent, boolean z) {
        int i;
        char c;
        long j;
        long j2;
        String str;
        byte[] bArr;
        boolean z2;
        String[] strArr;
        cblk cblk;
        cblx cblx;
        HashSet hashSet;
        LocalEntityId localEntityId;
        String[] strArr2;
        int i2;
        int i3;
        int i4;
        Intent intent2 = intent;
        int i5 = 0;
        new Object[1][0] = Boolean.valueOf(z);
        if (!z) {
            this.f111105b.mo54762d(System.currentTimeMillis());
        }
        String h = m94613h();
        if (h == null) {
            azoj.m85932b("RegisterService", "Failed to get GCM token", new Object[0]);
            return;
        }
        civt i6 = m94614i();
        if (i6 == null) {
            azoj.m85932b("RegisterService", "Failed to generate key pair.", new Object[0]);
            return;
        }
        List b = azoe.m85910b(this.f111106c);
        new Object[1][0] = Integer.valueOf(b.size());
        cbmr[] a = azot.m85966a(this.f111106c, this.f111108f, this.f111105b.mo54748b(), this.f111105b.mo54738a());
        int size = b.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Account account = (Account) b.get(i8);
            if (account != null) {
                if (azcv.m85357a(this.f111106c).mo54699c(new LocalEntityId(account.name, 7, "MS")) != null) {
                    i5 = 0;
                    new Object[1][0] = account.name;
                    i7++;
                    i3 = i8;
                    i2 = size;
                } else {
                    i5 = 0;
                    i4 = i7;
                    i3 = i8;
                    i2 = size;
                    if (m94583a(intent, h, i6, account, a, z)) {
                        i7 = i4 + 1;
                    }
                }
                i8 = i3 + 1;
                size = i2;
            } else {
                i4 = i7;
                i3 = i8;
                i2 = size;
            }
            i7 = i4;
            i8 = i3 + 1;
            size = i2;
        }
        boolean f = this.f111105b.mo54775f();
        if (!f) {
            String a2 = azot.m85961a(this.f111106c, this.f111108f);
            if (TextUtils.isEmpty(a2) || cfeo.m138883n()) {
                str = null;
            } else {
                str = a2;
            }
            Pair j3 = m94616j();
            if (m94595b(j3)) {
                m94599c(intent2, true);
                this.f111109g.mo55125a(4);
                this.f111109g.mo55126a(6, 34);
                i = i7;
                f = false;
            } else {
                if (m94584a(j3)) {
                    azoj.m85933c("RegisterService", "Anonymous registration unregistered by server", new Object[i5]);
                    bArr = null;
                } else {
                    bArr = (byte[]) j3.first;
                }
                cblj a3 = m94571a(str, h, i6, bArr);
                if (((long) this.f111105b.mo54798t()) < cfeo.m138849F()) {
                    this.f111105b.mo54799u();
                    z2 = false;
                } else {
                    z2 = true;
                }
                ClientContext clientContext = new ClientContext();
                this.f111116n = clientContext;
                clientContext.f30216f = "com.google.android.gms";
                try {
                    azph azph = this.f111109g;
                    if (a2 != null) {
                        String[] strArr3 = new String[1];
                        strArr3[i5] = a2;
                        strArr = strArr3;
                    } else {
                        strArr = null;
                    }
                    azph.mo55145a(4, (LocalEntityId) null, (String) null, strArr, (String[]) null);
                    if (!z2) {
                        new Object[1][i5] = a3;
                        cblk = this.f111114l.mo34892a(this.f111116n, a3);
                        new Object[1][i5] = cblk;
                    } else {
                        new Object[1][i5] = a3;
                        cblk = this.f111114l.mo34894b(this.f111116n, a3);
                        new Object[1][i5] = cblk;
                    }
                    if (cblk.f177524c) {
                        cbma cbma = cblk.f177522a;
                        if (cbma == null) {
                            cbma = null;
                        }
                        if (azof.m85913a(cbma)) {
                            this.f111109g.mo55126a(6, 19);
                            this.f111109g.mo55124a();
                            i = i7;
                            f = false;
                        }
                    }
                    if (cblk.f177523b != null) {
                        cbma cbma2 = cblk.f177522a;
                        if (cbma2 == null) {
                            cbma2 = null;
                        }
                        if (!azof.m85913a(cbma2)) {
                            this.f111109g.mo55126a(6, 25);
                            i = i7;
                            f = false;
                        } else {
                            this.f111105b.mo54800v();
                            cbma cbma3 = cblk.f177522a;
                            if (cbma3 == null) {
                                cbma3 = cbma.f177591f;
                            }
                            String str2 = cbma3.f177594b;
                            cblx cblx2 = cblk.f177523b;
                            if (cblx2 != null) {
                                cblx = cblx2;
                            } else {
                                cblx = cblx.f177575c;
                            }
                            byte[] k = cblk.f177526e.mo73780k();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new LocalEntityId(str2, 1, "MS"));
                            azcv a4 = azcv.m85357a(this.f111106c);
                            long currentTimeMillis = System.currentTimeMillis();
                            i = i7;
                            long millis = TimeUnit.MICROSECONDS.toMillis(cblx.f177578b);
                            azeg.m85519a();
                            a4.mo54695a(arrayList, h, cblx, currentTimeMillis + millis, 2, i6, azeg.m85518a(this.f111106c), k, null, System.currentTimeMillis());
                            this.f111105b.mo54742a("466216207879");
                            this.f111105b.mo54796r();
                            Pair a5 = this.f111110h.mo55111a();
                            azdl azdl = this.f111105b;
                            if (!((bngx) a5.first).isEmpty()) {
                                hashSet = new HashSet((Collection) a5.first);
                            } else {
                                hashSet = null;
                            }
                            azdl.mo54744a(hashSet);
                            this.f111105b.mo54772f(azot.m85973e(this.f111106c, this.f111108f));
                            Intent intent3 = new Intent("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS");
                            azoi.m85926a(intent3, (LocalEntityId) arrayList.get(i5));
                            MessagingService.m94557b(intent3, this.f111106c);
                            m94625r();
                            this.f111109g.mo55124a();
                            azph azph2 = this.f111109g;
                            cbma cbma4 = cblk.f177522a;
                            if (cbma4 != null) {
                                localEntityId = LocalEntityId.m94551b(cbma4);
                            } else {
                                localEntityId = null;
                            }
                            if (a2 != null) {
                                String[] strArr4 = new String[1];
                                strArr4[i5] = a2;
                                strArr2 = strArr4;
                            } else {
                                strArr2 = null;
                            }
                            String[] strArr5 = new String[1];
                            cbma cbma5 = cblk.f177522a;
                            if (cbma5 == null) {
                                cbma5 = cbma.f177591f;
                            }
                            strArr5[i5] = cbma5.f177594b;
                            azph2.mo55145a(5, localEntityId, (String) null, strArr2, strArr5);
                            f = true;
                        }
                    } else {
                        i = i7;
                        this.f111109g.mo55126a(6, 19);
                        this.f111109g.mo55124a();
                        f = false;
                    }
                } catch (chuw | gid e) {
                    i = i7;
                    this.f111109g.mo55154a(6, e);
                    azoj.m85931a("RegisterService", e, "Exception during register request.", new Object[i5]);
                    this.f111109g.mo55124a();
                    this.f111105b.mo54784i(e.getMessage());
                    f = false;
                }
            }
        } else {
            i = i7;
        }
        m94606f();
        if (i > 0 || f) {
            MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS"), this.f111106c);
            azbv.m85222a(this.f111106c);
        }
        if (!z) {
            String str3 = i < azoe.m85910b(this.f111106c).size() ? "GAIA" : f ? "PERIODIC_SYNC" : "PN_ONLY";
            azfo azfo = this.f111112j;
            int hashCode = str3.hashCode();
            if (hashCode != -598626881) {
                if (hashCode != 2179954) {
                    if (hashCode == 309089613 && str3.equals("PN_ONLY")) {
                        c = 1;
                        if (c != 0) {
                            j2 = cfeo.f183719a.mo6606a().mo80983aq();
                            j = cfeo.f183719a.mo6606a().mo80982ap();
                        } else if (c == 1) {
                            j2 = cfeo.f183719a.mo6606a().mo81041bv();
                            j = cfeo.f183719a.mo6606a().mo81040bu();
                        } else if (c != 2) {
                            azoj.m85933c("RetryManager", "unknown retry reason", new Object[i5]);
                            return;
                        } else {
                            j2 = cfeo.m138857N();
                            j = cfeo.m138857N();
                        }
                        long F = azfo.f99238b.mo54732F();
                        Intent a6 = m94569a(azfo.f99237a, intent.getAction());
                        a6.putExtras(intent2);
                        Intent a7 = azfo.mo54872a(a6, F, j2, j);
                        azfo.f99238b.mo54788k(a7.getLongExtra("retry_interval_intent_extra", 0));
                        azfo.mo54875a(a7);
                    }
                } else if (str3.equals("GAIA")) {
                    c = 0;
                    if (c != 0) {
                    }
                    long F2 = azfo.f99238b.mo54732F();
                    Intent a62 = m94569a(azfo.f99237a, intent.getAction());
                    a62.putExtras(intent2);
                    Intent a72 = azfo.mo54872a(a62, F2, j2, j);
                    azfo.f99238b.mo54788k(a72.getLongExtra("retry_interval_intent_extra", 0));
                    azfo.mo54875a(a72);
                }
            } else if (str3.equals("PERIODIC_SYNC")) {
                c = 2;
                if (c != 0) {
                }
                long F22 = azfo.f99238b.mo54732F();
                Intent a622 = m94569a(azfo.f99237a, intent.getAction());
                a622.putExtras(intent2);
                Intent a722 = azfo.mo54872a(a622, F22, j2, j);
                azfo.f99238b.mo54788k(a722.getLongExtra("retry_interval_intent_extra", 0));
                azfo.mo54875a(a722);
            }
            c = 65535;
            if (c != 0) {
            }
            long F222 = azfo.f99238b.mo54732F();
            Intent a6222 = m94569a(azfo.f99237a, intent.getAction());
            a6222.putExtras(intent2);
            Intent a7222 = azfo.mo54872a(a6222, F222, j2, j);
            azfo.f99238b.mo54788k(a7222.getLongExtra("retry_interval_intent_extra", 0));
            azfo.mo54875a(a7222);
        }
    }

    /* renamed from: a */
    private final void m94578a(cblf cblf) {
        cbld cbld = cblf.f177489f;
        if (cbld == null) {
            cbld = cbld.f177471h;
        }
        if (cbld.f177478f.size() != 0) {
            azdl azdl = this.f111105b;
            cbld cbld2 = cblf.f177489f;
            if (cbld2 == null) {
                cbld2 = cbld.f177471h;
            }
            azdl.mo54747a(bqcn.m112584a(cbld2.f177478f));
        }
    }

    /* renamed from: a */
    private final void m94579a(cblg cblg, cblf cblf, civt civt, boolean z) {
        LocalEntityId localEntityId;
        cbma cbma = cblf.f177485b;
        cblx cblx = null;
        if (cbma != null) {
            localEntityId = LocalEntityId.m94551b(cbma);
        } else {
            localEntityId = null;
        }
        cbji cbji = cblg.f177502e;
        if (cbji == null || cbji.f177333a.size() != 1) {
            azoj.m85933c("RegisterService", "accountInfo.reachableIds is incorrectly set in RegisterRefreshResponse: %s", cblg);
            this.f111109g.mo55126a(809, 25);
        } else {
            cbji cbji2 = cblg.f177502e;
            if (cbji2 == null) {
                cbji2 = cbji.f177331c;
            }
            localEntityId = LocalEntityId.m94551b((cbma) cbji2.f177333a.get(0));
        }
        if (cblg.f177499b) {
            this.f111109g.mo55141a(808, localEntityId);
            bmxv a = azhl.m85713a(this.f111106c).mo54926a(this.f111106c, cblg.f177500c, civt);
            if (a.mo66813a()) {
                new Object[1][0] = a.mo66814b();
                cblg = this.f111115m.mo34896a(this.f111116n, (cblf) a.mo66814b());
            }
        }
        azdl azdl = this.f111105b;
        cblx cblx2 = cblg.f177498a;
        if (cblx2 != null) {
            cblx = cblx2;
        }
        azdl.mo54741a(cblx);
        m94578a(cblf);
        if (civt != null) {
            this.f111105b.mo54746a(civt.f191540a.mo86595a());
            this.f111105b.mo54754b(civt.f191541b.f191538a);
            this.f111105b.mo54749b(1);
            this.f111117o.mo54585b();
            if (z) {
                Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS");
                azoi.m85926a(intent, localEntityId);
                MessagingService.m94557b(intent, this.f111106c);
            }
        }
        this.f111105b.mo54750b(System.currentTimeMillis());
        this.f111109g.mo55141a(9, localEntityId);
        this.f111109g.mo55124a();
    }

    /* renamed from: a */
    private final void m94580a(civt civt, cblx cblx, String str, Account account) {
        if (this.f111105b.mo54802x() || !azpi.m86080b(this.f111105b.mo54804z())) {
            m94610g(str);
            m94618k();
        } else if (!bmxi.m108538a(this.f111105b.mo54738a(), str)) {
            m94623p();
            m94593b(this.f111105b.mo54738a());
        }
        this.f111105b.mo54763d(str);
        this.f111105b.mo54743a("display_user_number", azot.m85964a(str, this.f111108f));
        this.f111105b.mo54742a("466216207879");
        this.f111105b.mo54741a(cblx);
        if (civt != null) {
            this.f111105b.mo54754b(civt.f191541b.f191538a);
            this.f111105b.mo54746a(civt.f191540a.mo86595a());
            this.f111105b.mo54749b(1);
        }
        this.f111105b.mo54745a(true);
        HashSet hashSet = null;
        this.f111105b.mo54767e(account != null ? account.name : null);
        this.f111105b.mo54796r();
        Pair a = this.f111110h.mo55111a();
        azdl azdl = this.f111105b;
        if (!((bngx) a.first).isEmpty()) {
            hashSet = new HashSet((Collection) a.first);
        }
        azdl.mo54744a(hashSet);
        this.f111105b.mo54772f(azot.m85973e(this.f111106c, this.f111108f));
        this.f111105b.mo54750b(System.currentTimeMillis());
        this.f111105b.mo54800v();
        azdl azdl2 = this.f111105b;
        azeg.m85519a();
        azdl2.mo54747a(azeg.m85520b(this.f111106c));
        if (civt != null) {
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS");
            azoi.m85926a(intent, new LocalEntityId(str, 1, "MS"));
            MessagingService.m94557b(intent, this.f111106c);
        }
        m94625r();
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS"), this.f111106c);
        azbv.m85222a(this.f111106c);
    }

    /* renamed from: a */
    private final void m94581a(LocalEntityId localEntityId, cblg cblg, cblf cblf) {
        int b;
        if (cblg.f177499b) {
            this.f111109g.mo55141a(808, localEntityId);
            bmxv a = azhl.m85713a(this.f111106c).mo54927a(this.f111106c, localEntityId, cblg.f177500c);
            if (a.mo66813a()) {
                new Object[1][0] = a.mo66814b();
                azoe.m85908a(this.f111106c).mo55115a(this.f111116n, localEntityId);
                cblg = this.f111115m.mo34896a(this.f111116n, (cblf) a.mo66814b());
            }
        }
        azct c = azcv.m85357a(this.f111106c).mo54699c(localEntityId);
        byte[] bArr = c != null ? c.f99004a : null;
        if (bArr != null) {
            ContentValues contentValues = new ContentValues();
            cblx cblx = cblg.f177498a;
            if (cblx == null) {
                cblx = cblx.f177575c;
            }
            contentValues.put("auth_token", cblx.f177577a.mo73780k());
            long currentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            cblx cblx2 = cblg.f177498a;
            if (cblx2 == null) {
                cblx2 = cblx.f177575c;
            }
            contentValues.put("auth_token_expiration_timestamp_ms", Long.valueOf(currentTimeMillis + timeUnit.toMillis(cblx2.f177578b)));
            contentValues.put("last_token_refresh_timestamp_us", Long.valueOf(System.currentTimeMillis()));
            cbld cbld = cblf.f177489f;
            if (cbld == null) {
                cbld = cbld.f177471h;
            }
            if (cbld.f177478f.size() != 0) {
                cbld cbld2 = cblf.f177489f;
                if (cbld2 == null) {
                    cbld2 = cbld.f177471h;
                }
                contentValues.put("capabilities", azpi.m86067a(bqcn.m112584a(cbld2.f177478f)));
            }
            azcm.m85300a(azcv.m85357a(this.f111106c).f99016a).mo54653a(bArr, contentValues);
            cbji cbji = cblg.f177502e;
            if (cbji == null) {
                cbji = cbji.f177331c;
            }
            if (cbji.f177333a.size() != 0) {
                ArrayList arrayList = new ArrayList();
                cbji cbji2 = cblg.f177502e;
                if (cbji2 == null) {
                    cbji2 = cbji.f177331c;
                }
                bxwc bxwc = cbji2.f177333a;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    cbma cbma = (cbma) bxwc.get(i);
                    int b2 = cipg.m150691b(cbma.f177593a);
                    if ((b2 != 0 && b2 == 3) || ((b = cipg.m150691b(cbma.f177593a)) != 0 && b == 18)) {
                        arrayList.add(LocalEntityId.m94551b(cbma));
                    } else {
                        azoj.m85933c("RegisterService", "Unknown reachable id type. Not saving account to database", new Object[0]);
                    }
                }
                azcv.m85357a(this.f111106c).mo54696a(bArr, arrayList);
            }
            this.f111109g.mo55141a(9, localEntityId);
            this.f111109g.mo55124a();
            return;
        }
        azoj.m85930a("RegisterService", "failed to fetch registration ID", new Object[0]);
    }

    /* renamed from: a */
    private final void m94582a(String str, String str2, int i) {
        Intent intent = new Intent("com.google.android.gms.matchstick.register_refresh_if_needed_result");
        intent.setClassName(this.f111106c, str);
        intent.putExtra("register_refresh_request_id", str2);
        intent.putExtra("register_refresh_result_code", i);
        this.f111106c.startService(intent);
    }

    /* JADX WARN: Type inference failed for: r6v0, assign insn: 0x000b: CONST  (r6v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int], assign insn: PHI: (r6v1 ?) = (r6v0 ?), (r6v23 ?) binds: [B:8:0x0043, B:126:0x03cc] */
    /* JADX WARN: Type inference failed for: r6v23, assign insn: 0x03d7: CONST  (r6v23 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void
     arg types: [android.content.Intent, int]
     candidates:
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, com.google.android.libraries.matchstick.data.LocalEntityId):int
      com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation.c(android.content.Intent, boolean):void */
    /* renamed from: a */
    private final boolean m94583a(Intent intent, String str, civt civt, Account account, cbmr[] cbmrArr, boolean z) {
        byte[] bArr;
        String str2;
        String[] strArr;
        String[] strArr2;
        LocalEntityId localEntityId;
        int b;
        Account account2 = account;
        cbmr[] cbmrArr2 = cbmrArr;
        ? r6 = 0;
        new Object[1][0] = account2.name;
        Pair j = m94616j();
        if (m94595b(j)) {
            m94599c(intent, true);
            this.f111109g.mo55125a(1102);
            this.f111109g.mo55126a(1104, 34);
            return false;
        }
        if (m94584a(j)) {
            azoj.m85933c("RegisterService", "Anonymous registration unregistered by server", new Object[0]);
            bArr = null;
        } else {
            bArr = (byte[]) j.first;
        }
        String[] strArr3 = new String[cbmrArr2.length];
        int i = 0;
        while (i < cbmrArr2.length) {
            strArr3[i] = cbmrArr2[i].f177671a;
            i++;
            r6 = 0;
        }
        bxvd da = cblp.f177545f.mo74144da();
        cbmo a = azfn.m85575a(bArr);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        List asList = Arrays.asList(cbmrArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = r6;
        }
        cblp cblp = (cblp) da.f164949b;
        if (!cblp.f177548b.mo73666a()) {
            cblp.f177548b = GeneratedMessageLite.m124021a(cblp.f177548b);
        }
        bxsy.m123078a(asList, cblp.f177548b);
        String str3 = this.f111113k;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = r6;
        }
        cblp cblp2 = (cblp) da.f164949b;
        str3.getClass();
        cblp2.f177549c = str3;
        if (z) {
            cblp2.f177551e = true;
        }
        cbld a2 = m94570a(str, civt);
        bxvd bxvd2 = (bxvd) a2.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) a2);
        cblc cblc = (cblc) bxvd2;
        azhl.m85713a(this.f111106c);
        Context context = this.f111106c;
        if (cfeo.m138888s()) {
            HashMap hashMap = new HashMap();
            hashMap.put("APP_NAME", cfeo.m138878i());
            if (bxvd != null) {
                UUID randomUUID = UUID.randomUUID();
                bxtx a3 = bxtx.m123261a(azfn.m85582a(randomUUID));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = r6;
                }
                cbmo cbmo = cbmo.f177654h;
                a3.getClass();
                ((cbmo) bxvd.f164949b).f177657b = a3;
                hashMap.put("REQUEST_ID", String.valueOf(randomUUID));
            }
            azhl.m85716a(context, hashMap, cblc);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = r6;
        }
        cbld cbld = (cbld) cblc.mo74062i();
        cbld.getClass();
        ((cblp) da.f164949b).f177550d = cbld;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = r6;
        }
        cbmo cbmo2 = (cbmo) bxvd.mo74062i();
        cbmo2.getClass();
        ((cblp) da.f164949b).f177547a = cbmo2;
        Object obj = (cblp) da.mo74062i();
        if (this.f111105b.mo54775f()) {
            str2 = this.f111105b.mo54738a();
        } else {
            str2 = null;
        }
        try {
            azoe.m85909a(this.f111116n, this.f111106c, account2, r6);
            new Object[1][r6] = account2.name;
            azph azph = this.f111109g;
            String str4 = account2.name;
            if (!TextUtils.isEmpty(str2)) {
                String[] strArr4 = new String[1];
                strArr4[r6] = str2;
                strArr = strArr4;
            } else {
                strArr = null;
            }
            azph.mo55145a(1102, (LocalEntityId) null, str4, strArr3, strArr);
            new Object[1][r6] = obj;
            afjd afjd = this.f111115m;
            ClientContext clientContext = this.f111116n;
            if (afjd.f64294g == null) {
                afjd.f64294g = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/SignInGaiaSilent", ciie.m150370a(cblp.f177545f), ciie.m150370a(cblq.f177552c));
            }
            cblq cblq = (cblq) afjd.f64296a.mo25553a(afjd.f64294g, clientContext, obj, (long) afjd.f64289b, TimeUnit.MILLISECONDS);
            new Object[1][r6] = cblq;
            if (cblq.f177555b != null) {
                cbji cbji = cblq.f177554a;
                if (cbji == null) {
                    this.f111109g.mo55167b(1104, 6, account2.name);
                    azoj.m85933c("RegisterService", "Null account info in SignInGaiaSilentResponse", new Object[0]);
                    return false;
                } else if (cbji.f177333a.size() == 0) {
                    this.f111109g.mo55167b(1104, 6, account2.name);
                    azoj.m85933c("RegisterService", "Null reachable ids in SignInGaiaSilentResponse", new Object[0]);
                    return false;
                } else if (cbji.f177334b.size() != 0) {
                    cbmn cbmn = (cbmn) cbji.f177334b.get(r6);
                    cblx cblx = cblq.f177555b;
                    if (cblx == null) {
                        cblx = cblx.f177575c;
                    }
                    bxwc bxwc = cbji.f177333a;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = bxwc.size();
                    LocalEntityId localEntityId2 = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        cbma cbma = (cbma) bxwc.get(i2);
                        int b2 = cipg.m150691b(cbma.f177593a);
                        if ((b2 != 0 && b2 == 3) || ((b = cipg.m150691b(cbma.f177593a)) != 0 && b == 18)) {
                            int b3 = cipg.m150691b(cbma.f177593a);
                            if (b3 != 0 && b3 == 3) {
                                arrayList2.add(cbma.f177594b);
                            }
                            arrayList.add(LocalEntityId.m94551b(cbma));
                            int b4 = cipg.m150691b(cbma.f177593a);
                            if (b4 != 0 && b4 == 18) {
                                localEntityId2 = LocalEntityId.m94551b(cbma);
                            }
                        } else {
                            azoj.m85933c("RegisterService", "Unknown reachable id type. Not saving account to database", new Object[0]);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        azoj.m85933c("RegisterService", "No reachable ID returned from server", new Object[0]);
                        this.f111109g.mo55167b(1104, 49, account2.name);
                    } else {
                        if (!arrayList2.isEmpty()) {
                            strArr2 = new String[arrayList2.size()];
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < size2) {
                                strArr2[i4] = (String) arrayList2.get(i3);
                                i3++;
                                i4++;
                            }
                        } else {
                            strArr2 = null;
                        }
                        bxvd da2 = afiu.f64251d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        afiu afiu = (afiu) da2.f164949b;
                        afiu.f64254b = 2;
                        afiu.f64253a |= 1;
                        String str5 = account2.name;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        afiu afiu2 = (afiu) da2.f164949b;
                        str5.getClass();
                        if (!afiu2.f64255c.mo73666a()) {
                            afiu2.f64255c = GeneratedMessageLite.m124021a(afiu2.f64255c);
                        }
                        afiu2.f64255c.add(str5);
                        afiu afiu3 = (afiu) da2.mo74062i();
                        bxvd da3 = afiv.f64256b.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        afiv afiv = (afiv) da3.f164949b;
                        afiu3.getClass();
                        if (!afiv.f64258a.mo73666a()) {
                            afiv.f64258a = GeneratedMessageLite.m124021a(afiv.f64258a);
                        }
                        afiv.f64258a.add(afiu3);
                        this.f111118p.mo54695a(arrayList, str, cblx, System.currentTimeMillis() + TimeUnit.MICROSECONDS.toMillis(cblx.f177578b), 3, civt, cbmn.f177653b, cbmn.f177652a.mo73780k(), (afiv) da3.mo74062i(), System.currentTimeMillis());
                        m94606f();
                        Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS");
                        azoi.m85926a(intent2, localEntityId2);
                        MessagingService.m94557b(intent2, this.f111106c);
                        azph azph2 = this.f111109g;
                        if (!arrayList.isEmpty()) {
                            localEntityId = (LocalEntityId) arrayList.get(0);
                        } else {
                            localEntityId = null;
                        }
                        azph2.mo55145a(1103, localEntityId, account2.name, strArr3, strArr2);
                    }
                    new Object[1][0] = account2.name;
                    this.f111109g.mo55124a();
                    return true;
                } else {
                    this.f111109g.mo55167b(1104, 6, account2.name);
                    azoj.m85933c("RegisterService", "No registrations in SignInGaiaSilentResponse", new Object[0]);
                    return false;
                }
            } else {
                this.f111109g.mo55167b(1104, 25, account2.name);
                this.f111109g.mo55124a();
                return false;
            }
        } catch (chuw | gid | NullPointerException e) {
            this.f111109g.mo55167b(1104, azfn.m85589d(e), account2.name);
            azoj.m85931a("RegisterService", e, "Exception during sign in gaia silent request.", new Object[0]);
            this.f111109g.mo55124a();
            return false;
        }
    }

    /* renamed from: a */
    private static final boolean m94584a(Pair pair) {
        return ((Integer) pair.second).intValue() == 4;
    }

    /* renamed from: a */
    private static final boolean m94585a(azct azct) {
        if (azct.f99006c >= System.currentTimeMillis()) {
            return azct.f99012i > 0 && System.currentTimeMillis() - azct.f99012i > cfeo.f183719a.mo6606a().mo81066cr();
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m94586a(aznz aznz) {
        List a = azcm.m85300a(this.f111106c).mo54646a(aznz.f99774a, 1);
        if (a != null && !a.isEmpty()) {
            if (azcm.m85300a(this.f111106c).mo54643a((String) a.get(0), aznz.f99774a).f99054j > Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(cfgs.f183989a.mo6606a().mo81167W()))).longValue()) {
                this.f111109g.mo55125a(1851);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m94587a(LocalEntityId localEntityId) {
        int b = m94588b((Intent) null, localEntityId);
        long j = 1;
        if (b == 2 || b == 3) {
            azdl azdl = this.f111105b;
            if (b != 3) {
                j = 2;
            }
            azdl.mo54776g(j);
            this.f111109g.mo55141a((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, localEntityId);
            return false;
        } else if (b == 4) {
            return true;
        } else {
            int a = m94567a((Intent) null, 5, localEntityId);
            this.f111109g.mo55160a("Matchstick.Unregister.Reason", 4);
            if (a != 2 && a != 3) {
                return true;
            }
            azdl azdl2 = this.f111105b;
            if (a != 3) {
                j = 2;
            }
            azdl2.mo54776g(j);
            this.f111109g.mo55141a((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, localEntityId);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo60382a() {
        new soa(9, new azfv(this)).start();
    }

    /* renamed from: a */
    public final void mo60383a(Intent intent) {
        boolean z;
        azpy.m86121a();
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Lighter message intent: ");
        sb.append(valueOf);
        azpy.m86122a("RegisterService", sb.toString(), new Object[0]);
        this.f111109g.mo55125a(1703);
        if (cfgs.m139387G()) {
            z = intent.getBooleanExtra("broadcast_account_conversation_id", true);
            azpy.m86121a();
            azpy.m86122a("RegisterService", "should broadcast account & conversation ID: %b", Boolean.valueOf(z));
        } else {
            z = true;
        }
        String i = m94615i(intent);
        this.f111104C = i;
        if (i != null) {
            bmxv bmxv = bmvz.f131120a;
            if (cfgs.m139414t()) {
                azpy.m86121a();
                azpy.m86122a("RegisterService", "Attempting to get the match LU account", new Object[0]);
                cbex e = m94604e(this.f111104C);
                if (e == null) {
                    azoj.m85933c("RegisterService", "could not get LighterConversationIntent in start Lighter Conversation.", new Object[0]);
                } else if (e.mo75231a(cfeo.m138848E())) {
                    cbbl cbbl = (cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), ((bxte) Collections.unmodifiableMap(e.f176863b).get(cfeo.m138848E())).f164766b.mo73780k());
                    if (cbbl != null) {
                        bmxv = azqf.m86130a(this.f111106c).mo55211a(cbbl.f176591o);
                    } else {
                        azoj.m85933c("RegisterService", "Could not parse ChatIntentApiArgs.", new Object[0]);
                    }
                } else {
                    azoj.m85933c("RegisterService", "LighterConversationIntent doesn't contain ChatIntentApiArgs.", new Object[0]);
                }
                if (!bmxv.mo66813a()) {
                    azph.m85998a(this.f111106c).mo55126a(1729, 56);
                }
            }
            if (!bmxv.mo66813a()) {
                bmxv = azqf.m86130a(this.f111106c).mo55210a();
            }
            if (bmxv.mo66813a()) {
                if (cfgs.f183989a.mo6606a().mo81172aa() && z) {
                    azqi.m86166a(this.f111106c).mo55219a((bcoh) bmxv.mo66814b());
                }
                azpk.m86089a(this.f111106c).mo55185d("Matchstick.Latency.Lighter.ParseConversationIntent.Time");
                bmxv a = azbj.m85193a(this.f111106c).mo54564d().mo56314a((bcoh) bmxv.mo66814b(), this.f111104C);
                azpk.m86089a(this.f111106c).mo55187e("Matchstick.Latency.Lighter.ParseConversationIntent.Time");
                if (!a.mo66813a()) {
                    this.f111109g.mo55126a(1705, 72);
                    azqi.m86166a(this.f111106c).mo55221a("Could not parse conversation intent");
                    return;
                }
                byte[] bArr = (byte[]) ((bcsp) a.mo66814b()).mo57325i().get(cfeo.m138848E());
                if (bArr != null) {
                    try {
                        cbbl cbbl2 = (cbbl) GeneratedMessageLite.m124016a(cbbl.f176575p, bArr, bxus.m123744c());
                        if (cbbl2 != null) {
                            mo60389b(cbbl2);
                            this.f111109g.mo55146a(1704, ((bcsp) a.mo66814b()).mo57317a());
                            if (cfgs.m139415u()) {
                                if (!Collections.unmodifiableMap(cbbl2.f176589m).isEmpty()) {
                                    azqi.m86166a(this.f111106c).mo55222a(Collections.unmodifiableMap(cbbl2.f176589m));
                                } else {
                                    azoj.m85932b("RegisterService", "No metadata map in intent", new Object[0]);
                                }
                            }
                            if (bnkn.m109663a(bmyx.m108640a(',').mo66918a((CharSequence) cfgs.m139384D())).contains(m94573a((bcsp) a.mo66814b()))) {
                                this.f111102A = (bcsp) a.mo66814b();
                                this.f111103B = (bcoh) bmxv.mo66814b();
                                if (cfgs.m139381A() && TextUtils.equals(cbbl2.f176585i, "webview")) {
                                    azqf.m86130a(this.f111106c);
                                    if (azqf.m86149c() && this.f111102A != null) {
                                        azph.m85998a(this.f111106c).mo55146a(1707, this.f111102A.mo57317a());
                                        azph.m85998a(this.f111106c).mo55146a(374, this.f111102A.mo57317a());
                                        if (cfgs.m139402h()) {
                                            azpy.m86121a();
                                            azpy.m86122a("RegisterService", "Generated conversation ID, adding client-side welcome message %s", this.f111121s);
                                            azqf.m86130a(this.f111106c).mo55216a(this.f111103B, this.f111102A.mo57317a(), this.f111121s);
                                            azph.m85998a(this.f111106c).mo55146a(1810, this.f111102A.mo57317a());
                                        } else {
                                            azbj.m85193a(this.f111106c).mo54564d().mo56329b(this.f111103B, this.f111104C);
                                        }
                                        azbj.m85193a(this.f111106c).mo54564d().mo56323a(this.f111103B, this.f111102A.mo57317a(), this.f111104C);
                                        azbj.m85193a(this.f111106c).mo54564d().mo56322a(this.f111103B);
                                        if (z) {
                                            azqi.m86166a(this.f111106c).mo55220a(this.f111102A.mo57317a());
                                            return;
                                        }
                                        return;
                                    }
                                }
                                azqi.m86166a(this.f111106c).mo55221a("cannot open lighter");
                                return;
                            }
                            azoj.m85933c("RegisterService", "unsupported app: %s", m94573a((bcsp) a.mo66814b()));
                            this.f111109g.mo55126a(1705, 76);
                            azqi.m86166a(this.f111106c).mo55221a("unsupported app");
                            return;
                        }
                        this.f111109g.mo55126a(1705, 75);
                        azqi.m86166a(this.f111106c).mo55221a("Null ChatIntentApiArgs");
                    } catch (bxwf e2) {
                        azqi.m86166a(this.f111106c).mo55221a("Parsing ChatIntentApiArgs failed");
                        this.f111109g.mo55126a(1705, 74);
                    }
                } else {
                    this.f111109g.mo55126a(1705, 73);
                    azqi.m86166a(this.f111106c).mo55221a("Could not unwrap ChatIntentApiArgs from LighterConversationIntent");
                }
            } else {
                azqi.m86166a(this.f111106c).mo55221a("No valid account context");
            }
        } else {
            this.f111109g.mo55126a(1705, 71);
            azqi.m86166a(this.f111106c).mo55221a("Null Intent Args");
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
    public final void mo60384a(cbbl cbbl) {
        cbbl cbbl2 = cbbl;
        azph azph = this.f111109g;
        aznz aznz = this.f111127y;
        bxvd da = boqd.f134234x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqd boqd = (boqd) da.f164949b;
        boqd.f134237b = bopu.m111431a(352);
        boqd.f134236a |= 1;
        if (aznz != null) {
            String str = aznz.f99775b;
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqd boqd2 = (boqd) da.f164949b;
                str.getClass();
                boqd2.f134236a |= 4096;
                boqd2.f134250o = str;
            }
            azph.mo55157a(aznz, da);
        }
        if (cbbl2 != null) {
            bxtx a = bxtx.m123261a((cfgs.m139386F() ? azqh.m86163a(azph.f99818d).mo55218a(cbbl2) : cbbl2).mo73642k());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqd boqd3 = (boqd) da.f164949b;
            a.getClass();
            boqd3.f134236a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            boqd3.f134253r = a;
        }
        azph.mo55158a(da, azph.m86001a(aznz));
        if (TextUtils.isEmpty(this.f111120r)) {
            azoj.m85933c("RegisterService", "Invalid intent", new Object[0]);
            this.f111109g.mo55139a(365, this.f111127y, (String) null, (Boolean) null, this.f111119q);
            return;
        }
        Object[] objArr = {this.f111120r, this.f111121s, this.f111122t, this.f111123u};
        String str2 = cbbl2.f176585i;
        String str3 = cbbl2.f176586j;
        azdl.m85412a(this.f111106c);
        boolean g = azdl.m85419g(this.f111106c);
        LocalEntityId a2 = azcv.m85357a(this.f111106c).mo54692a(cfcv.m138704b());
        if (g && a2 != null && a2.f111075b == 1) {
            if (cfgs.m139381A() && TextUtils.equals(str2, "webview")) {
                azqf.m86130a(this.f111106c);
                if (azqf.m86150c(this.f111107d) && this.f111102A != null) {
                    this.f111109g.mo55125a(1707);
                    if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(azcd.m85252a(this.f111106c).mo54617i(this.f111127y.f99775b))) {
                        azph.m85998a(this.f111106c).mo55146a(374, this.f111102A.mo57317a());
                        if (cfgs.f183989a.mo6606a().mo81188c()) {
                            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.GET_OR_SYNC_APP_METADATA");
                            intent.putExtra("server_app_id", this.f111127y.f99775b);
                            MessagingService.m94556a(intent, this.f111106c);
                        }
                        azbj.m85193a(this.f111106c).mo54564d().mo56323a(this.f111103B, this.f111102A.mo57317a(), this.f111104C);
                        if (cfgs.m139402h() || cfgs.m139391K()) {
                            new Object[1][0] = this.f111121s;
                            azqf.m86130a(this.f111106c).mo55216a(this.f111103B, this.f111102A.mo57317a(), this.f111121s);
                            azph.m85998a(this.f111106c).mo55146a(1810, this.f111102A.mo57317a());
                        }
                        azqi.m86166a(this.f111106c).mo55220a(this.f111102A.mo57317a());
                        return;
                    }
                    this.f111109g.mo55137a(375, this.f111127y);
                    azqi.m86166a(this.f111106c).mo55221a("Missing Webview Url in AppDataMananger");
                    return;
                }
            }
            azqf.m86130a(this.f111106c);
            if (azqf.m86150c(this.f111107d)) {
                this.f111109g.mo55125a(1706);
                if (m94628u()) {
                    m94627t();
                    return;
                }
            }
            if (m94628u()) {
                m94627t();
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClassName(this.f111106c, "com.google.android.gms.matchstick.ui.MessageActivity");
            intent2.addFlags(536870912);
            intent2.addFlags(268435456);
            azoi.m85925a(this.f111106c, intent2, this.f111127y, this.f111120r, this.f111121s, this.f111126x, this.f111125w, this.f111128z, this.f111124v);
            azph.m85998a(this.f111106c).mo55137a(353, this.f111127y);
            intent2.putExtra("wait_for_anonymous_registration_finish", false);
            intent2.putExtra("skip_enter_animation", true);
            intent2.putExtra("invoke_with_anonymous_registration", this.f111105b.mo54802x());
            mo60386a("com.google.android.gms.matchstick.ui.EntryActivity", -1);
            startActivity(intent2);
        } else if (!cfeo.f183719a.mo6606a().mo81075d() || TextUtils.isEmpty(this.f111122t)) {
            azdl.m85412a(this.f111106c);
            int intValue = Integer.valueOf(new rtj(this.f111106c, "matchstick_prefs", false).getInt("number_of_anonymous_chats", 0)).intValue();
            if (!cfcv.m138704b() || ((long) intValue) >= cfeo.f183719a.mo6606a().mo80962aV()) {
                if (cfcv.m138704b()) {
                    azqi.m86166a(this.f111106c).mo55221a("Exceed max number of anonymous chats allowed");
                    this.f111109g.mo55137a(367, this.f111127y);
                }
                azok.m85934a(this);
            } else if (m94611g()) {
                azqf.m86130a(this.f111106c);
                if (azqf.m86150c(this.f111107d) && cfeo.f183719a.mo6606a().mo80938Y() && this.f111102A == null) {
                    azqf.m86130a(this.f111106c);
                    try {
                        bmxv bmxv = (bmxv) azbj.m85193a(this.f111106c).mo54563c().mo56342c(azqf.m86135a(azcv.f99014b)).get();
                        if (this.f111104C != null) {
                            azpk.m86089a(this.f111106c).mo55185d("Matchstick.Latency.Lighter.ParseConversationIntent.Time");
                            bmxv a3 = azbj.m85193a(this.f111106c).mo54564d().mo56314a((bcoh) bmxv.mo66814b(), this.f111104C);
                            azpk.m86089a(this.f111106c).mo55187e("Matchstick.Latency.Lighter.ParseConversationIntent.Time");
                            if (bnkn.m109663a(bmyx.m108640a(',').mo66918a((CharSequence) cfgs.m139384D())).contains(m94573a((bcsp) a3.mo66814b()))) {
                                if (!m94586a(this.f111127y)) {
                                    this.f111102A = (bcsp) a3.mo66814b();
                                }
                            }
                            azoj.m85933c("RegisterService", "Unsupported Lighter app %s", m94573a((bcsp) a3.mo66814b()));
                            this.f111109g.mo55125a(1734);
                            if (m94628u()) {
                                m94627t();
                                return;
                            }
                        } else {
                            azqi.m86166a(this.f111106c).mo55221a("Null intentArgs when trying to create anonymous Lighter conversation ID");
                            this.f111109g.mo55125a(1734);
                            if (m94628u()) {
                                m94627t();
                                return;
                            }
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        azqi.m86166a(this.f111106c).mo55221a("Could not retrieve account context for anonymous registration");
                        this.f111109g.mo55125a(1734);
                        if (m94628u()) {
                            m94627t();
                            return;
                        }
                    }
                }
                if (cfgs.m139381A() && TextUtils.equals(str2, "webview")) {
                    azqf.m86130a(this.f111106c);
                    if (azqf.m86150c(this.f111107d) && this.f111102A != null) {
                        azbj.m85193a(this.f111106c).mo54564d().mo56323a(this.f111103B, this.f111102A.mo57317a(), this.f111104C);
                        if (cfgs.m139402h() || cfgs.m139391K()) {
                            new Object[1][0] = this.f111121s;
                            azqf.m86130a(this.f111106c).mo55216a(this.f111103B, this.f111102A.mo57317a(), this.f111121s);
                            azph.m85998a(this.f111106c).mo55146a(1810, this.f111102A.mo57317a());
                        }
                        azqi.m86166a(this.f111106c).mo55220a(this.f111102A.mo57317a());
                        azph.m85998a(this.f111106c).mo55146a(374, this.f111102A.mo57317a());
                        return;
                    }
                }
                if (m94628u()) {
                    m94627t();
                }
                Intent intent3 = new Intent();
                intent3.setClassName(this.f111106c, "com.google.android.gms.matchstick.ui.MessageActivity");
                intent3.setPackage(this.f111106c.getPackageName());
                intent3.addFlags(536870912);
                intent3.addFlags(268435456);
                azoi.m85925a(this.f111106c, intent3, this.f111127y, this.f111120r, this.f111121s, this.f111126x, this.f111125w, this.f111128z, this.f111124v);
                this.f111109g.mo55137a(353, this.f111127y);
                intent3.putExtra("wait_for_anonymous_registration_finish", false);
                intent3.putExtra("skip_enter_animation", true);
                intent3.putExtra("invoke_with_anonymous_registration", this.f111105b.mo54802x());
                if (cfcy.m138709b()) {
                    mo60386a("com.google.android.gms.matchstick.ui.EntryActivity", -1);
                }
                startActivity(intent3);
            } else if (cfcy.m138709b()) {
                azqf.m86130a(this.f111106c);
                if (azqf.m86149c()) {
                    azqi.m86166a(this.f111106c).mo55221a("Failed to register anonymously");
                } else {
                    mo60386a("com.google.android.gms.matchstick.ui.EntryActivity", (int) C0126R.string.register_failed_network);
                }
            }
        } else {
            Intent intent4 = new Intent("android.intent.action.SENDTO", new Uri.Builder().scheme("sms").opaquePart(this.f111122t).build());
            intent4.addFlags(268435456);
            if (!TextUtils.isEmpty(this.f111123u)) {
                intent4.putExtra("sms_body", this.f111123u);
            }
            azph.m85998a(this.f111106c).mo55137a(354, this.f111127y);
            if (cfeo.m138882m()) {
                mo60386a("com.google.android.gms.matchstick.ui.MessageActivity", -1);
            }
            startActivity(intent4);
        }
    }

    /* renamed from: a */
    public final void mo60385a(String str) {
        new Object[1][0] = str;
        azph.m85998a(this.f111106c).mo55145a(1953, (LocalEntityId) null, str, (String[]) null, (String[]) null);
        azqf.m86130a(this.f111106c);
        bcsk f = ContactId.m94830f();
        f.mo57453b(str);
        f.mo57454c(cfeo.m138879j());
        f.mo57451a(ContactId.ContactType.EMAIL);
        ContactId a = f.mo57450a();
        try {
            bmxv bmxv = (bmxv) azbj.m85193a(this.f111106c).mo54563c().mo56342c(a).get();
            if (bmxv.mo66813a()) {
                if (((bcoh) bmxv.mo66814b()).mo57060d() != bcog.INVALID) {
                    new Object[1][0] = str;
                    azph.m85998a(this.f111106c).mo55145a(1956, (LocalEntityId) null, str, (String[]) null, (String[]) null);
                    return;
                }
            }
            bbpp bbpp = (bbpp) azbj.m85193a(this.f111106c).mo54563c().mo56341b(a).get();
            if (bbpp != null) {
                if (bbpp.mo56289a() == 2) {
                    azoj.m85930a("RegisterService", "Successfully registered Lighter for email: %s", str);
                    azph.m85998a(this.f111106c).mo55145a(1955, (LocalEntityId) null, str, (String[]) null, (String[]) null);
                    return;
                }
            }
            azoj.m85933c("RegisterService", "Failed to registered Lighter for email: %s", str);
            azph.m85998a(this.f111106c).mo55167b(1954, 66, str);
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("RegisterService", e, "Got exception trying to register for email: %s", str);
            azph.m85998a(this.f111106c).mo55167b(1954, 68, str);
        }
    }

    /* renamed from: a */
    public final void mo60386a(String str, int i) {
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.ACTIVITY_DISMISS_ACTION");
        intent.setClassName(this.f111106c, str);
        intent.setPackage(this.f111106c.getPackageName());
        intent.addFlags(536870912);
        intent.addFlags(268435456);
        if (i != -1) {
            intent.putExtra("extra_toast_message", getResources().getString(i));
        }
        startActivity(intent);
    }

    /* renamed from: a */
    public final boolean mo60387a(bcoh bcoh) {
        new Object[1][0] = bcoh.mo57058b();
        String a = bcoh.mo57058b().mo57074e().mo60492a();
        azph.m85998a(this.f111106c).mo55145a(1957, (LocalEntityId) null, a, (String[]) null, (String[]) null);
        try {
            azpw.m86109a(this.f111106c).mo55196a(bcoh);
            bbpr bbpr = (bbpr) azbj.m85193a(this.f111106c).mo54563c().mo56340a(bcoh).get();
            if (bbpr != null) {
                if (bbpr.mo56293a() == 1) {
                    azoj.m85930a("RegisterService", "Successfully unregistered Lighter for users: %s", bcoh.mo57058b());
                    azph.m85998a(this.f111106c).mo55145a(1959, (LocalEntityId) null, a, (String[]) null, (String[]) null);
                    return true;
                }
            }
            azoj.m85933c("RegisterService", "Failed to unregister Lighter for users: %s", bcoh.mo57058b());
            azph.m85998a(this.f111106c).mo55167b(1958, 67, a);
            return false;
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("RegisterService", e, "Got exception trying to unregister users: %s", bcoh.mo57058b());
            azph.m85998a(this.f111106c).mo55167b(1958, 68, a);
            return false;
        }
    }
}
