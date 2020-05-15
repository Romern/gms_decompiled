package com.google.android.libraries.matchstick.p091ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;

/* renamed from: com.google.android.libraries.matchstick.ui.EntryChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EntryChimeraActivity extends Activity {

    /* renamed from: a */
    private final Object f111245a = new Object();

    /* renamed from: b */
    private String f111246b;

    /* renamed from: c */
    private azph f111247c;

    /* renamed from: d */
    private qxo f111248d;

    /* renamed from: a */
    protected static int m94734a(Intent intent) {
        String str;
        if ("com.google.android.apps.libraries.matchstick.action.ACTIVITY_DISMISS_ACTION".equals(intent.getAction())) {
            return 4;
        }
        if ("com.google.business.ACTION_CHAT".equals(intent.getAction())) {
            return 1;
        }
        if ("com.google.business.ACTION_INITIATE_CHAT".equals(intent.getAction()) && cfei.m138780c()) {
            return 5;
        }
        if ("com.google.business.ACTION_INITIATE_BUSINESS_CHAT".equals(intent.getAction()) && cfei.m138779b()) {
            return 7;
        }
        if ("com.google.business.ACTION_INITIATE_NEW_BUSINESS_CHAT".equals(intent.getAction()) && cfei.m138781d()) {
            return 8;
        }
        if ("com.google.business.ACTION_MESSAGE".equals(intent.getAction())) {
            return 3;
        }
        if ("com.google.android.apps.libraries.matchstick.action.INTERNAL_VIEW".equals(intent.getAction())) {
            return 6;
        }
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (data != null && !TextUtils.isEmpty(data.getHost())) {
                str = Uri.decode(data.getHost());
            } else {
                str = "";
            }
            String join = TextUtils.join("/", data.getPathSegments());
            Object[] objArr = {intent.getAction(), str, join};
            if ("business.google.com".equals(str)) {
                if ("chat".equals(join)) {
                    return 1;
                }
                if ("initiateChat".equals(join) && cfei.m138780c()) {
                    return 5;
                }
                if ("initiateBusinessChat".equals(join) && cfei.m138779b()) {
                    return 7;
                }
                if ("initiateNewBusinessChat".equals(join) && cfei.m138781d()) {
                    return 8;
                }
                if ("message".equals(join)) {
                    return 3;
                }
            }
        }
        String valueOf = String.valueOf(intent.getAction());
        azoj.m85933c("EntryActivity", valueOf.length() == 0 ? new String("Unknown intent action: ") : "Unknown intent action: ".concat(valueOf), new Object[0]);
        return 0;
    }

    /* renamed from: b */
    private final void m94736b(Intent intent) {
        if (!cfeo.m138887r() || !cfeo.m138874e()) {
            finish();
            return;
        }
        azph.m85998a(getApplicationContext()).mo55125a(1575);
        azqf.m86130a(getApplicationContext());
        long a = azqf.m86129a(intent);
        long currentTimeMillis = System.currentTimeMillis();
        if (a > 0) {
            azph.m85998a(getApplicationContext()).mo55172c(1813, String.valueOf(a));
            azph.m85998a(getApplicationContext()).mo55172c(1815, String.valueOf(currentTimeMillis));
            azpk.m86089a(getApplicationContext()).mo55178a("Matchstick.Latency.Lighter.Overall.LuTohandleChatIntent.Time", a);
        }
        azpy.m86121a().mo55205a(bopw.HANDLE_CHAT_INTENT, currentTimeMillis);
        azpy.m86121a().mo55205a(bopw.LU_CLICKED, a);
        cbbl c = m94737c(intent);
        if (c != null) {
            if (cfgs.m139386F()) {
                azph.m85998a(getApplicationContext()).mo55159a(c);
            }
            if (TextUtils.equals(c.f176585i, "webview")) {
                azph.m85998a(getApplicationContext()).mo55125a(1551);
                azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Overall.HandleChatIntentToDisplayWebApp.Time");
                return;
            }
        }
        Intent intent2 = new Intent("com.google.android.gms.matchstick.handle_external_chat_intent_action");
        intent2.putExtras(intent);
        intent2.setData(intent.getData());
        intent2.putExtra("original_intent_action", getIntent().getAction());
        intent2.putExtra("launch_session_id", azpk.m86089a(getApplicationContext()).mo55179b());
        int e = azpk.m86089a(getApplicationContext()).mo55186e();
        int i = e - 1;
        if (e != 0) {
            intent2.putExtra("launch_entry_intent", i);
            intent2.putExtra("launch_entry_point", azpk.m86089a(getApplicationContext()).mo55182c());
            SilentRegisterIntentOperation.m94594b(intent2, getApplicationContext());
            return;
        }
        throw null;
    }

    /* renamed from: c */
    private static cbbl m94737c(Intent intent) {
        if (intent == null) {
            return null;
        }
        if ("com.google.business.ACTION_CHAT".equals(intent.getAction()) || "com.google.business.ACTION_INITIATE_CHAT".equals(intent.getAction()) || "com.google.business.ACTION_INITIATE_BUSINESS_CHAT".equals(intent.getAction()) || "com.google.business.ACTION_INITIATE_NEW_BUSINESS_CHAT".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("args");
            if (!TextUtils.isEmpty(stringExtra)) {
                return m94735a(stringExtra);
            }
            bxvd da = cbbl.f176575p.mo74144da();
            cbma b = azfn.m85584b(intent.getStringExtra("id"), "FB");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((cbbl) da.f164949b).f176577a = b;
            String stringExtra2 = intent.getStringExtra("m_n");
            if (stringExtra2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                stringExtra2.getClass();
                ((cbbl) da.f164949b).f176579c = stringExtra2;
            }
            String stringExtra3 = intent.getStringExtra("m_t");
            if (stringExtra3 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                stringExtra3.getClass();
                ((cbbl) da.f164949b).f176580d = stringExtra3;
            }
            String stringExtra4 = intent.getStringExtra("im");
            if (stringExtra4 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                stringExtra4.getClass();
                ((cbbl) da.f164949b).f176578b = stringExtra4;
            }
            String stringExtra5 = intent.getStringExtra("d_c");
            if (stringExtra5 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                stringExtra5.getClass();
                ((cbbl) da.f164949b).f176584h = stringExtra5;
            }
            String stringExtra6 = intent.getStringExtra("ui");
            if (stringExtra6 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                stringExtra6.getClass();
                ((cbbl) da.f164949b).f176585i = stringExtra6;
            }
            String stringExtra7 = intent.getStringExtra("web_url");
            if (stringExtra7 != null && azpj.m86088a(stringExtra7)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                stringExtra7.getClass();
                ((cbbl) da.f164949b).f176586j = stringExtra7;
            }
            return (cbbl) da.mo74062i();
        } else if (!"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        } else {
            Object[] objArr = {intent.getAction(), intent.getDataString()};
            Uri data = intent.getData();
            String queryParameter = data.getQueryParameter("args");
            if (!TextUtils.isEmpty(queryParameter)) {
                return m94735a(queryParameter);
            }
            bxvd da2 = cbbl.f176575p.mo74144da();
            cbma b2 = azfn.m85584b(data.getQueryParameter("id"), "FB");
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b2.getClass();
            ((cbbl) da2.f164949b).f176577a = b2;
            String queryParameter2 = data.getQueryParameter("m_n");
            if (queryParameter2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                queryParameter2.getClass();
                ((cbbl) da2.f164949b).f176579c = queryParameter2;
            }
            String queryParameter3 = data.getQueryParameter("m_t");
            if (queryParameter3 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                queryParameter3.getClass();
                ((cbbl) da2.f164949b).f176580d = queryParameter3;
            }
            String queryParameter4 = data.getQueryParameter("im");
            if (queryParameter4 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                queryParameter4.getClass();
                ((cbbl) da2.f164949b).f176578b = queryParameter4;
            }
            String queryParameter5 = data.getQueryParameter("d_c");
            if (queryParameter5 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                queryParameter5.getClass();
                ((cbbl) da2.f164949b).f176584h = queryParameter5;
            }
            String stringExtra8 = intent.getStringExtra("ui");
            if (stringExtra8 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                stringExtra8.getClass();
                ((cbbl) da2.f164949b).f176585i = stringExtra8;
            }
            String stringExtra9 = intent.getStringExtra("web_url");
            if (stringExtra9 != null && azpj.m86088a(stringExtra9)) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                stringExtra9.getClass();
                ((cbbl) da2.f164949b).f176586j = stringExtra9;
            }
            return (cbbl) da2.mo74062i();
        }
    }

    /* renamed from: d */
    private final void m94738d(Intent intent) {
        if (intent.hasExtra("launch_entry_point")) {
            azpk.m86089a(getApplicationContext()).mo55181b(intent.getStringExtra("launch_entry_point"));
        }
        int a = m94734a(intent);
        if (a != 1) {
            if (a == 3) {
                azpk.m86089a(getApplicationContext()).mo55180b(6);
                return;
            } else if (a != 5) {
                if (a == 7 || a == 8) {
                    azpk.m86089a(getApplicationContext()).mo55180b(4);
                    return;
                } else if (a == 6) {
                    azpk.m86089a(getApplicationContext()).mo55180b(2);
                    return;
                } else {
                    return;
                }
            }
        }
        azpk.m86089a(getApplicationContext()).mo55180b(3);
    }

    public final void finish() {
        azph.m85998a(getApplicationContext()).mo55125a(381);
        qxo qxo = this.f111248d;
        if (qxo != null) {
            this.f111247c.mo55163a(qxo);
            this.f111248d = null;
        }
        super.finish();
    }

    public final void onBackPressed() {
        azph.m85998a(this).mo55125a(390);
        azpk.m86089a(getApplicationContext()).mo55187e("Matchstick.Latency.Lighter.AbandonLaunch.Time");
        azpk.m86089a(this).mo55184d();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02e5, code lost:
        return;
     */
    public final void onCreate(Bundle bundle) {
        azpy.m86121a();
        azpy.m86122a("EntryActivity", "onCreate", new Object[0]);
        azph.m85998a(getApplicationContext()).mo55125a(378);
        azpy.m86121a().mo55205a(bopw.ON_CREATE_ENTRY_ACTIVITY, System.currentTimeMillis());
        azpk.m86089a(getApplicationContext()).mo55184d();
        if (!cfgs.m139400f() && !cfgs.m139417w()) {
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.WithoutCache.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.WithCache.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.SourceUnknown.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnCreateToLoadUrl.Time");
        }
        if (cfgs.m139400f()) {
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.WithoutCache.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.WithCache.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.SourceUnknown.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnCreateToLoadUrl.Time");
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnCreateToServiceConnected.Time");
        }
        if (cfgs.m139417w()) {
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Prebundle.OnCreateToDisplayWebApp.Time");
        }
        azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnCreateToCheckRegistration.Time");
        azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.AbandonLaunch.Time");
        azpk.m86089a(getApplicationContext()).mo55175a();
        setTheme(16973830);
        super.onCreate(bundle);
        if (cfgs.m139412r()) {
            setTheme(C0126R.style.SemiTransparentActivity);
            if (!cfgs.f183989a.mo6606a().mo81148D()) {
                setContentView((int) C0126R.C0128layout.ms_web_app_card_view);
            } else {
                setContentView((int) C0126R.C0128layout.ms_web_app_rounded_top_gutterless_card_view);
            }
            azph.m85998a(getApplicationContext()).mo55125a(387);
        } else {
            setContentView((int) C0126R.C0128layout.ms_entry_activity_layout);
        }
        azpy.m86121a();
        azpy.m86122a("EntryActivity", "Starting WebAppFragment", new Object[0]);
        new soa(9, new azld(this)).start();
        azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Fragment.HandleChatIntentToLoadUrl.Time");
        azmx azmx = bundle != null ? (azmx) getSupportFragmentManager().findFragmentByTag("web_app_fragment") : null;
        if (azmx == null) {
            azmx = new azmx();
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, azmx, "web_app_fragment").commit();
        }
        if (getIntent() != null) {
            azmx.setArguments(getIntent().getExtras());
        }
        if (!cfgs.m139412r()) {
            findViewById(C0126R.C0129id.general_progress).setVisibility(8);
        }
        Intent intent = getIntent();
        if (intent == null) {
            azoj.m85933c("EntryActivity", "null intent", new Object[0]);
            finish();
            return;
        }
        synchronized (this.f111245a) {
            int a = m94734a(intent);
            try {
                String uri = intent.toUri(0);
                this.f111246b = uri;
                new Object[1][0] = uri;
            } catch (Exception e) {
                this.f111246b = null;
                azoj.m85931a("EntryActivity", e, "Unable to parse intent.", new Object[0]);
            }
            azph a2 = azph.m85998a(getApplicationContext());
            this.f111247c = a2;
            this.f111248d = a2.mo55123a("Matchstick.EntryActivity.OnCreate.Time");
            m94738d(intent);
            if (a != 1) {
                if (a != 3) {
                    if (a == 4) {
                        String stringExtra = intent.getStringExtra("extra_toast_message");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            azpi.m86068a(getApplicationContext(), stringExtra);
                        }
                        finish();
                        return;
                    } else if (a != 5) {
                        if (a == 7 || a == 8) {
                            azph.m85998a(getApplicationContext()).mo55125a(389);
                            m94736b(intent);
                            return;
                        } else if (a != 6) {
                            azoj.m85933c("EntryActivity", "Unknown intent", new Object[0]);
                            finish();
                        } else {
                            azph.m85998a(getApplicationContext()).mo55125a(1576);
                            if (!cfgs.m139412r()) {
                                azph.m85998a(getApplicationContext()).mo55125a(385);
                            } else {
                                azph.m85998a(getApplicationContext()).mo55125a(386);
                            }
                        }
                    }
                } else if (cfeo.m138889t()) {
                    setContentView((int) C0126R.C0128layout.ms_entry_activity_layout);
                    Intent intent2 = new Intent("com.google.android.gms.matchstick.handle_external_lighter_intent_action");
                    intent2.putExtras(intent);
                    intent2.setData(intent.getData());
                    intent2.putExtra("launch_session_id", azpk.m86089a(getApplicationContext()).mo55179b());
                    int e2 = azpk.m86089a(getApplicationContext()).mo55186e();
                    int i = e2 - 1;
                    if (e2 != 0) {
                        intent2.putExtra("launch_entry_intent", i);
                        intent2.putExtra("launch_entry_point", azpk.m86089a(getApplicationContext()).mo55182c());
                        SilentRegisterIntentOperation.m94594b(intent2, getApplicationContext());
                    } else {
                        throw null;
                    }
                } else {
                    finish();
                }
            }
            azph.m85998a(getApplicationContext()).mo55125a(388);
            m94736b(intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        azph.m85998a(getApplicationContext()).mo55125a(380);
        azpk.m86089a(getApplicationContext()).mo55175a();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        cbbl c;
        azpy.m86121a();
        azpy.m86122a("EntryActivity", "onNewIntent: %s", intent);
        super.onNewIntent(intent);
        m94738d(intent);
        azph.m85998a(getApplicationContext()).mo55125a(379);
        setIntent(intent);
        azpy.m86121a().mo55205a(bopw.ON_NEW_INTENT_ENTRY_ACTIVITY, System.currentTimeMillis());
        azpk.m86089a(getApplicationContext()).mo55184d();
        if (cfgs.m139400f()) {
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.OnNewIntentToDisplayWebApp.Time");
        } else {
            azpk.m86089a(getApplicationContext()).mo55185d("Matchstick.Latency.Lighter.OnNewIntentToDisplayWebApp.Time");
        }
        azpk.m86089a(getApplicationContext()).mo55175a();
        if (cfgs.m139386F() && (c = m94737c(intent)) != null) {
            azph.m85998a(getApplicationContext()).mo55159a(c);
        }
        synchronized (this.f111245a) {
            if (m94734a(intent) == 4) {
                String stringExtra = intent.getStringExtra("extra_toast_message");
                if (!TextUtils.isEmpty(stringExtra)) {
                    azpi.m86068a(getApplicationContext(), stringExtra);
                }
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        azpy.m86121a();
        azpy.m86122a("EntryActivity", "onStart()", new Object[0]);
        super.onStart();
        setVisible(true);
    }

    public final void onStop() {
        super.onStop();
    }

    public final void onUserLeaveHint() {
        azpk.m86089a(getApplicationContext()).mo55187e("Matchstick.Latency.Lighter.AbandonLaunch.Time");
        azpy.m86121a().mo55205a(bopw.ON_USER_LEAVE_HINT, System.currentTimeMillis());
        azpy.m86121a().mo55204a(getApplicationContext());
        azpy.m86121a().mo55206b();
        super.onUserLeaveHint();
    }

    /* renamed from: a */
    private static cbbl m94735a(String str) {
        return (cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), sqd.m35969b(str));
    }
}
