package com.google.android.gms.googlehelp.contact.chat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import com.google.android.material.appbar.AppBarLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChatConversationChimeraActivity extends deu implements aarn, abaf, aasf {

    /* renamed from: A */
    private View f78859A;

    /* renamed from: B */
    private View f78860B;

    /* renamed from: C */
    private View f78861C;

    /* renamed from: D */
    private final bqgj f78862D = snp.m35702a(9);

    /* renamed from: E */
    private aasi f78863E = new aasi();

    /* renamed from: b */
    public ViewStub f78864b;

    /* renamed from: c */
    public View f78865c;

    /* renamed from: d */
    public TextView f78866d;

    /* renamed from: e */
    public ViewStub f78867e;

    /* renamed from: f */
    public View f78868f;

    /* renamed from: g */
    public EditText f78869g;

    /* renamed from: h */
    public ImageButton f78870h;

    /* renamed from: i */
    public RecyclerView f78871i;

    /* renamed from: j */
    public aawe f78872j;

    /* renamed from: k */
    public String f78873k;

    /* renamed from: l */
    public long f78874l = -1;

    /* renamed from: m */
    public boolean f78875m = true;

    /* renamed from: n */
    public boolean f78876n = false;

    /* renamed from: o */
    public boolean f78877o = false;

    /* renamed from: p */
    public long f78878p = 0;

    /* renamed from: q */
    public HelpConfig f78879q;

    /* renamed from: r */
    public abcr f78880r;

    /* renamed from: s */
    public wzh f78881s;

    /* renamed from: t */
    public aarp f78882t;

    /* renamed from: u */
    BroadcastReceiver f78883u;

    /* renamed from: v */
    public sex f78884v;

    /* renamed from: w */
    public abdx f78885w = abdx.NO_TEXT_ENTERED;

    /* renamed from: x */
    public long f78886x = 0;

    /* renamed from: y */
    public Handler f78887y;

    /* renamed from: z */
    public Runnable f78888z;

    /* renamed from: C */
    private final void m66398C() {
        BroadcastReceiver broadcastReceiver = this.f78883u;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.f78883u = null;
        }
    }

    /* renamed from: D */
    private final boolean m66399D() {
        View view = this.f78861C;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    public static Intent m66400a(Context context, HelpConfig helpConfig) {
        Intent addFlags = new Intent().setClassName(context, "com.google.android.gms.googlehelp.contact.chat.ChatConversationActivity").putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_START_TICK", System.nanoTime()).addFlags(67108864);
        int i = Build.VERSION.SDK_INT;
        addFlags.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        return addFlags;
    }

    /* renamed from: d */
    private final void m66402d(int i) {
        this.f78859A.setVisibility(i);
        this.f78860B.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo43253A() {
        View view = this.f78865c;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: B */
    public final boolean mo43254B() {
        return m66401a(this.f78869g.getText());
    }

    /* renamed from: b */
    public final void mo43260b(int i) {
        aatj.m46980a(this.f78859A, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43263c(int i) {
        abcx.m47489a(this, this.f78879q, this.f78880r, i);
    }

    /* renamed from: g */
    public final HelpConfig mo18626g() {
        return this.f78879q;
    }

    /* renamed from: h */
    public final abcr mo18627h() {
        return this.f78880r;
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    /* renamed from: k */
    public final Context mo18630k() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo43266l() {
        abcx.m47467a(this, 66, aawg.m47093a(this, this.f78879q));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo43267m() {
        ChatRequestAndConversationChimeraService.m66453c(this, this.f78879q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo43268n() {
        return this.f78874l != -1 && !this.f78876n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo43269o() {
        this.f78887y.removeCallbacks(this.f78888z);
        this.f78885w = abdx.NO_TEXT_ENTERED;
        mo43270p();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == 1) {
            mo43259a(true);
            mo43267m();
            finish();
        } else if (i2 != 2) {
            abcx.m47503b(this, 36, bzps.CHAT);
        } else {
            mo43259a(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Map map;
        super.onCreate(bundle);
        HelpConfig a = HelpConfig.m66349a(this, bundle, getIntent());
        if (a != null) {
            if (aaya.m47228a(ceit.m136953b()) && ((map = a.f78813M) == null || map.isEmpty())) {
                a.f78813M = aasb.m46832a(this, a);
            }
            this.f78879q = a;
            this.f78880r = new abcr(this);
            this.f78881s = new wzh();
            this.f78887y = new adzt(Looper.getMainLooper());
            this.f78888z = new aavo(this);
            boolean a2 = aayi.m47267a();
            int i = C0126R.style.gh_ChatConversationDarkActivityStyle;
            if (a2) {
                aayi.m47266a(this, a, (int) C0126R.style.gh_ChatConversationLightActivityStyle, (int) C0126R.style.gh_ChatConversationDarkActivityStyle, (int) C0126R.style.gh_ChatConversationDayNightActivityStyle);
            } else {
                if (!aayi.m47269a(a)) {
                    i = C0126R.style.gh_ChatConversationLightActivityStyle;
                }
                setTheme(i);
            }
            setContentView((int) C0126R.C0128layout.gh_chat_activity);
            mo8626a((Toolbar) findViewById(C0126R.C0129id.gh_chat_toolbar));
            aarq.m46801a(this, false);
            this.f78859A = findViewById(C0126R.C0129id.gh_chat_activity_progress_bar);
            this.f78860B = findViewById(C0126R.C0129id.gh_chat_activity_progress_bar_text);
            this.f78867e = (ViewStub) findViewById(C0126R.C0129id.gh_chat_conversation_stub);
            this.f78864b = (ViewStub) findViewById(C0126R.C0129id.gh_chat_queue_status_stub);
            aarp.m46797a(this.f78862D, this, this, this.f78879q);
            this.f78884v = sex.m35104a(this);
            if (bundle != null) {
                if (aaya.m47229b(cehv.m136881b())) {
                    this.f78873k = bundle.getString("INSTANCE_STATE_LAST_SAVED_MESSAGE_INPUT_TEXT");
                }
                if (bundle.getBoolean("INSTANCE_STATE_IS_CHAT_REQUEST_ERROR_VISIBLE", false)) {
                    mo43279y();
                    mo43274t();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No HelpConfig provided!");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.gh_chat_activity_menu, menu);
        aayh.m47248a(menu.findItem(C0126R.C0129id.gh_chat_activity_menu_share_transcript), this, aayi.m47263a(this, C0126R.attr.ghf_greyIconColor));
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        if (mo43268n()) {
            mo43266l();
        } else if (this.f78885w != abdx.NO_TEXT_ENTERED) {
            mo43269o();
        }
        abcr abcr = this.f78880r;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (mo43268n() || m66399D()) {
                mo43263c(24);
                mo43276v();
            } else {
                abae a = abag.m47347a();
                a.f56926b = C0126R.string.gh_end_chat_confirmation_message;
                a.f56927c = C0126R.string.gh_end_chat_action_text;
                a.f56928d = C0126R.string.common_cancel;
                a.mo31968a().show(getSupportFragmentManager(), "end_chat_dialog");
            }
            return true;
        } else if (itemId != C0126R.C0129id.gh_chat_activity_menu_share_transcript) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            CharSequence a2 = ChatRequestAndConversationChimeraService.m66442a(getPackageManager(), this.f78879q);
            if (TextUtils.isEmpty(a2)) {
                str = getString(C0126R.string.gh_chat_google_support);
            } else {
                str = getString(C0126R.string.gh_hangout_product_specific_subtext, new Object[]{a2});
            }
            String string = getString(C0126R.string.gh_chat_shared_transcript_email_subject, new Object[]{str});
            C1120jw a3 = C1120jw.m17408a(getContainerActivity());
            a3.mo14163b("text/plain");
            aawe aawe = this.f78872j;
            long j = this.f78878p;
            ArrayList arrayList = new ArrayList(1);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String str2 = "";
            for (int i = 0; i < aawe.f56691d.size(); i++) {
                abdp abdp = (abdp) aawe.f56691d.get(i);
                if (!TextUtils.equals(aawe.f56699l, abdp.f57115b) && !arrayList.contains(abdp.f57115b)) {
                    arrayList.add(abdp.f57115b);
                    sb.append(String.format("%s%s", str2, abdp.f57117d));
                    str2 = ", ";
                }
                if (i != 0 && !((Boolean) aawe.f56694g.get(i - 1)).booleanValue()) {
                    sb2.append(String.format("%s\n", abdp.f57116c));
                } else {
                    sb2.append(String.format("\n%s [%s]:\n%s\n", abdp.f57117d, aawe.f56693f.get(i), abdp.f57116c));
                }
            }
            Pair create = Pair.create(sb.toString(), sb2.toString());
            String str3 = (String) create.first;
            String str4 = (String) create.second;
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append("\n---\n");
            long j2 = aawe.f56695h;
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2 + j);
            sb3.append(String.format("%s: %s\n", getString(C0126R.string.gh_chat_shared_transcript_header_time_of_chat), DateUtils.formatDateTime(this, instance.getTimeInMillis(), 21)));
            sb3.append(String.format("%s: %s\n", getString(C0126R.string.gh_chat_shared_transcript_header_chat_duration), DateUtils.formatElapsedTime((aawe.f56696i - aawe.f56695h) / 1000)));
            if (!TextUtils.isEmpty(str3)) {
                sb3.append(String.format("%s: %s\n", getString(C0126R.string.gh_chat_shared_transcript_header_chatted_with), str3));
            }
            sb3.append("---\n");
            sb3.append(str4);
            a3.mo14161a((CharSequence) sb3.toString());
            a3.mo14162a(string);
            Intent a4 = a3.mo14160a();
            if (!spn.m35860a(this, a4)) {
                return true;
            }
            startActivity(Intent.createChooser(a4, getString(C0126R.string.gh_chat_share_transcript)));
            return true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
     arg types: [int, com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity, com.google.android.gms.googlehelp.common.HelpConfig]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(long, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(abdx, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, boolean, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void */
    public final void onPause() {
        aawg.m47097a(aawg.m47093a(this, this.f78879q) + this.f78881s.mo29582a(), this, this.f78879q);
        ChatRequestAndConversationChimeraService.m66450a(false, (Context) this, this.f78879q);
        m66398C();
        ReportBatchedMetricsChimeraGcmTaskService.m66601a(this, this.f78879q);
        super.onPause();
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        aawe aawe;
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.gh_chat_activity_menu_share_transcript);
        C1120jw a = C1120jw.m17408a(getContainerActivity());
        a.mo14163b("text/plain");
        a.mo14161a((CharSequence) "");
        a.mo14162a("");
        Intent a2 = a.mo14160a();
        boolean z = false;
        if (mo43268n() && (aawe = this.f78872j) != null && aawe.f56697j > 0 && spn.m35860a(this, a2)) {
            z = true;
        }
        findItem.setVisible(z);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        EditText editText;
        bundle.putParcelable("EXTRA_HELP_CONFIG", this.f78879q);
        if (aaya.m47229b(cehv.m136881b()) && (editText = this.f78869g) != null) {
            bundle.putString("INSTANCE_STATE_LAST_SAVED_MESSAGE_INPUT_TEXT", editText.getText().toString());
        }
        if (m66399D()) {
            bundle.putBoolean("INSTANCE_STATE_IS_CHAT_REQUEST_ERROR_VISIBLE", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p */
    public final void mo43270p() {
        ChatRequestAndConversationChimeraService.m66445a(this.f78885w, this, this.f78879q);
    }

    /* renamed from: q */
    public final void mo43271q() {
        this.f78871i.scrollToPosition(this.f78872j.f56697j - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo43272r() {
        mo43257a(new aavr(this));
    }

    /* renamed from: s */
    public final aass mo43273s() {
        return new aass(this);
    }

    public final void startActivity(Intent intent) {
        if (!(intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null)) {
            if (!abht.m47730a(this, intent, this.f78879q, 2)) {
                if (mo43273s().mo31749a(intent.getData(), 1)) {
                    return;
                }
            } else {
                return;
            }
        }
        super.startActivity(intent);
    }

    /* renamed from: t */
    public final void mo43274t() {
        View view;
        View view2 = this.f78861C;
        if (view2 == null) {
            View inflate = ((ViewStub) findViewById(C0126R.C0129id.gh_chat_request_error_stub)).inflate();
            this.f78861C = inflate;
            aatj.m46981a(inflate, (int) C0126R.string.gh_chat_request_failed, new aavm(this));
        } else {
            view2.setVisibility(0);
        }
        if (aaya.m47229b(cein.f182721a.mo6606a().mo79171b()) && (view = this.f78865c) != null) {
            view.setVisibility(8);
        }
        mo43260b((int) C0126R.string.gh_chat_request_failed);
    }

    /* renamed from: u */
    public final void mo43275u() {
        mo43257a(new aavs());
    }

    /* renamed from: v */
    public final void mo43276v() {
        mo43277w();
        finish();
    }

    /* renamed from: w */
    public final void mo43277w() {
        mo43257a(new aavt());
        m66398C();
        mo43275u();
        this.f78884v.mo25440a(2014);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo43278x() {
        aah aah = new aah();
        aah.mo59a((String) null);
        if (!aah.f44l) {
            aah.f44l = true;
            aah.mo247r();
        }
        this.f78871i.setLayoutManager(aah);
        aawe aawe = new aawe(this);
        this.f78872j = aawe;
        this.f78871i.setAdapter(aawe);
        int i = Build.VERSION.SDK_INT;
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(C0126R.C0129id.gh_chat_app_bar);
        if (appBarLayout != null) {
            this.f78871i.addOnScrollListener(new aavu(this, aah, getResources().getDimensionPixelSize(C0126R.dimen.gh_chat_transcript_padding_top), appBarLayout));
        }
        View findViewById = findViewById(C0126R.C0129id.gh_chat_send_message_section);
        mo43255a(findViewById.getHeight());
        findViewById.addOnLayoutChangeListener(new aavn(this));
    }

    /* renamed from: y */
    public final void mo43279y() {
        View view = this.f78859A;
        if (view != null && view.getVisibility() == 0) {
            m66402d(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo43280z() {
        View view = this.f78868f;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: b */
    public final void mo43261b(String str) {
        this.f78859A.announceForAccessibility(str);
    }

    /* renamed from: c */
    public final void mo43264c(boolean z) {
        if (z) {
            mo43269o();
        } else if (this.f78885w != abdx.TYPING) {
            this.f78887y.postDelayed(this.f78888z, ceeg.m136402g());
            this.f78885w = abdx.TYPING;
            mo43270p();
        }
    }

    /* renamed from: e */
    public final void mo43265e() {
        if (m66399D()) {
            this.f78861C.setVisibility(8);
        } else if (mo43280z()) {
            this.f78868f.setVisibility(8);
        } else if (mo43253A()) {
            this.f78865c.setVisibility(8);
        }
        m66402d(0);
        this.f78875m = true;
        this.f78876n = false;
        this.f78877o = false;
        this.f78874l = -1;
        aawg.m47109b(this, this.f78879q);
        aawg.m47113d(this, this.f78879q);
        this.f78881s.mo29584c();
        invalidateOptionsMenu();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
     arg types: [int, com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity, com.google.android.gms.googlehelp.common.HelpConfig]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(long, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(abdx, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, boolean, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void */
    public final void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS");
        intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
        intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
        if (this.f78883u == null) {
            this.f78883u = new aacn("googlehelp") {
                /* class com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.C16025 */

                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    aawe aawe;
                    int i;
                    String str;
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity = ChatConversationChimeraActivity.this;
                        abdx abdx = (abdx) bmxv.m108567c(abdx.m47561a(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).mo66812a(abdx.UNKNOWN_TYPING_STATUS);
                        if (chatConversationChimeraActivity.f78872j.mo31848a(abdx, intent.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID"), intent.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1)) && abdx == abdx.TYPING) {
                            chatConversationChimeraActivity.mo43260b((int) C0126R.string.gh_chat_typing_indicator_active_announcement);
                        }
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT")) {
                        ChatConversationChimeraActivity.this.mo43272r();
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity2 = ChatConversationChimeraActivity.this;
                        aawe aawe2 = chatConversationChimeraActivity2.f78872j;
                        long longExtra = intent.getLongExtra("EXTRA_MESSAGE_CLIENT_TIME", -1);
                        int a = aawe2.mo31844a(longExtra);
                        if (a < 0) {
                            StringBuilder sb = new StringBuilder(107);
                            sb.append("No pending messages found for the given client time ");
                            sb.append(longExtra);
                            sb.append("; this means the list is corrupted.");
                            Log.w("gH_ChatConvoLytAdapter", sb.toString());
                        } else {
                            abdq abdq = (abdq) aawe2.f56692e.get(a);
                            bxvd bxvd = (bxvd) abdq.mo74142c(5);
                            bxvd.mo73625a((bxvk) abdq);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            abdq abdq2 = (abdq) bxvd.f164949b;
                            abdq abdq3 = abdq.f57120e;
                            abdq2.f57122a |= 4;
                            abdq2.f57125d = false;
                            aawe2.f56692e.set(a, (abdq) bxvd.mo74062i());
                            aawe2.mo158M(aawe2.mo31853g(a));
                        }
                        chatConversationChimeraActivity2.mo43260b((int) C0126R.string.gh_message_failed_to_send_announcement);
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity3 = ChatConversationChimeraActivity.this;
                        chatConversationChimeraActivity3.f78878p = intent.getLongExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", 0);
                        chatConversationChimeraActivity3.f78877o = true;
                        if (intent.getBooleanExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity4 = ChatConversationChimeraActivity.this;
                            if (!chatConversationChimeraActivity4.f78875m && (aawe = chatConversationChimeraActivity4.f78872j) != null) {
                                List b = aawg.m47106b(chatConversationChimeraActivity4.f78882t);
                                long j = chatConversationChimeraActivity4.f78878p;
                                if (b != null) {
                                    i = b.size();
                                } else {
                                    i = 0;
                                }
                                int size = aawe.f56693f.size();
                                ArrayList arrayList = new ArrayList(size);
                                int i2 = 0;
                                for (int i3 = 0; i3 < i; i3++) {
                                    if (((abdf) b.get(i3)).f57078b == 3) {
                                        bxyl bxyl = ((abdf) b.get(i3)).f57081e;
                                        if (bxyl == null) {
                                            bxyl = bxyl.f165099b;
                                        }
                                        arrayList.add(aawe.m47074a(bxyl.f165101a, j));
                                        i2++;
                                    }
                                }
                                if (i2 == size) {
                                    aawe.f56693f = arrayList;
                                    aawe.mo171aJ();
                                }
                            }
                        }
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity5 = ChatConversationChimeraActivity.this;
                        chatConversationChimeraActivity5.mo43256a(chatConversationChimeraActivity5.f78881s.mo29582a());
                        chatConversationChimeraActivity5.f78875m = false;
                        chatConversationChimeraActivity5.mo43279y();
                        if (chatConversationChimeraActivity5.mo43253A()) {
                            chatConversationChimeraActivity5.f78865c.setVisibility(8);
                        }
                        View view = chatConversationChimeraActivity5.f78868f;
                        if (view == null) {
                            chatConversationChimeraActivity5.f78868f = chatConversationChimeraActivity5.f78867e.inflate();
                            chatConversationChimeraActivity5.f78869g = (EditText) chatConversationChimeraActivity5.f78868f.findViewById(C0126R.C0129id.gh_chat_message_input);
                            chatConversationChimeraActivity5.f78869g.addTextChangedListener(new aavp(chatConversationChimeraActivity5));
                            if (aaya.m47229b(cehv.m136881b()) && (str = chatConversationChimeraActivity5.f78873k) != null) {
                                chatConversationChimeraActivity5.f78869g.setText(str);
                                chatConversationChimeraActivity5.f78869g.requestFocus();
                            }
                            chatConversationChimeraActivity5.f78870h = (ImageButton) chatConversationChimeraActivity5.f78868f.findViewById(C0126R.C0129id.gh_chat_send_message_button);
                            chatConversationChimeraActivity5.f78870h.setOnClickListener(new aavq(chatConversationChimeraActivity5));
                            chatConversationChimeraActivity5.f78871i = (RecyclerView) chatConversationChimeraActivity5.f78868f.findViewById(C0126R.C0129id.gh_chat_transcript);
                            chatConversationChimeraActivity5.mo43278x();
                        } else if (view.getVisibility() != 0) {
                            chatConversationChimeraActivity5.f78868f.setVisibility(0);
                            chatConversationChimeraActivity5.mo43278x();
                            chatConversationChimeraActivity5.findViewById(C0126R.C0129id.gh_chat_send_message_section).setVisibility(0);
                        }
                        chatConversationChimeraActivity5.mo43272r();
                    } else if (!intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE")) {
                    } else {
                        if (intent.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity6 = ChatConversationChimeraActivity.this;
                            int intExtra = intent.getIntExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", -1);
                            if (intExtra > 0) {
                                chatConversationChimeraActivity6.f78875m = true;
                                chatConversationChimeraActivity6.mo43279y();
                                if (chatConversationChimeraActivity6.mo43280z()) {
                                    chatConversationChimeraActivity6.f78868f.setVisibility(8);
                                }
                                View view2 = chatConversationChimeraActivity6.f78865c;
                                if (view2 == null) {
                                    chatConversationChimeraActivity6.f78865c = chatConversationChimeraActivity6.f78864b.inflate();
                                    if (chatConversationChimeraActivity6.f78866d == null) {
                                        chatConversationChimeraActivity6.f78866d = (TextView) chatConversationChimeraActivity6.f78865c.findViewById(C0126R.C0129id.gh_chat_queue_position);
                                    }
                                    aayh.m47249a((ImageView) chatConversationChimeraActivity6.f78865c.findViewById(C0126R.C0129id.gh_chat_queue_icon), chatConversationChimeraActivity6, aayi.m47263a(chatConversationChimeraActivity6, C0126R.attr.gh_primaryBlueColor));
                                } else if (view2.getVisibility() != 0) {
                                    chatConversationChimeraActivity6.f78865c.setVisibility(0);
                                }
                                String string = chatConversationChimeraActivity6.getString(C0126R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(intExtra)});
                                chatConversationChimeraActivity6.f78866d.setText(string);
                                chatConversationChimeraActivity6.mo43261b(string);
                                chatConversationChimeraActivity6.mo43260b((int) C0126R.string.gh_chat_queue_subtext);
                            }
                        } else if (intent.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity7 = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity7.mo43279y();
                            chatConversationChimeraActivity7.mo43275u();
                            ChatRequestAndConversationChimeraService.m66456e(chatConversationChimeraActivity7, chatConversationChimeraActivity7.f78879q);
                            chatConversationChimeraActivity7.f78884v.mo25440a(2014);
                            chatConversationChimeraActivity7.mo43274t();
                        } else if (intent.getBooleanExtra("EXTRA_IS_CHAT_DATA_STALE", false)) {
                            ChatConversationChimeraActivity.this.mo43275u();
                        } else if (intent.getBooleanExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity8 = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity8.mo43267m();
                            chatConversationChimeraActivity8.mo43276v();
                        } else if (!intent.getBooleanExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", false)) {
                            intent.getBooleanExtra("EXTRA_NO_PENDING_CHAT_REQUEST", false);
                        } else {
                            ChatConversationChimeraActivity.this.mo43277w();
                        }
                    }
                }
            };
        }
        registerReceiver(this.f78883u, intentFilter, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", null);
        ChatRequestAndConversationChimeraService.m66451b(this, this.f78879q);
        ChatRequestAndConversationChimeraService.m66450a(true, (Context) this, this.f78879q);
        ChatRequestAndConversationChimeraService.m66448a(this, this.f78877o, this.f78879q);
        if (this.f78876n) {
            ChatRequestAndConversationChimeraService.m66454d(this, this.f78879q);
        }
        ReportBatchedMetricsChimeraGcmTaskService.m66602a(this, this.f78879q.f78827b);
        this.f78881s.mo29584c();
    }

    public final void onStart() {
        super.onStart();
        if (aasb.m46834b(this, this.f78879q, "user_is_requesting_new_chat")) {
            if (mo43280z()) {
                mo43266l();
            } else if (mo43253A()) {
                mo43256a(0L);
            }
            mo43265e();
            aawg.m47123i(this, this.f78879q);
        }
    }

    /* renamed from: b */
    public final void mo43262b(boolean z) {
        int i;
        this.f78870h.setEnabled(z);
        ImageButton imageButton = this.f78870h;
        if (!z) {
            i = C0126R.attr.gh_disabledIconColor;
        } else {
            i = C0126R.attr.gh_primaryBlueColor;
        }
        aayh.m47249a(imageButton, this, aayi.m47263a(this, i));
    }

    /* renamed from: a */
    public static boolean m66401a(CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence) == 0;
    }

    /* renamed from: a */
    public final void mo43255a(int i) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.gh_chat_transcript_padding_horizontal);
        this.f78871i.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(C0126R.dimen.gh_chat_transcript_padding_top), dimensionPixelSize, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43256a(long j) {
        if (!aasb.m46834b(this, this.f78879q, "has_reported_chat_view_time_while_in_queue")) {
            abcx.m47467a(this, 65, aawg.m47093a(this, this.f78879q) + j);
            aawg.m47111c(this, this.f78879q);
            aawg.m47109b(this, this.f78879q);
            this.f78881s.mo29584c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43257a(aarn aarn) {
        aarp aarp = this.f78882t;
        if (aarp == null) {
            aasi aasi = this.f78863E;
            if (aasi != null) {
                aasi.addObserver(new aavl(this, aarn));
                return;
            }
            return;
        }
        aarn.mo31653a(aarp);
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        aasi aasi = this.f78863E;
        if (aasi != null) {
            this.f78882t = aarp;
            aasi.mo31709a();
            this.f78863E = null;
        }
    }

    /* renamed from: a */
    public final void mo31969a(Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("EXTRA_MESSAGE_CLIENT_TIME");
            if (j != 0) {
                aawe aawe = this.f78872j;
                int a = aawe.mo31844a(j);
                if (a >= 0) {
                    aawe.f56692e.remove(a);
                    aawe.f56697j--;
                    aawe.mo160O(aawe.mo31853g(a));
                    aawe.f56701n.mo43260b((int) C0126R.string.gh_message_deleted_announcement);
                    return;
                }
                return;
            }
        }
        mo43267m();
        if (this.f78875m) {
            long a2 = this.f78881s.mo29582a();
            if (a2 >= ceeg.f182447a.mo6606a().mo78983ac()) {
                abcx.m47531n(this);
                mo43256a(a2);
            }
        } else {
            this.f78876n = false;
            mo43263c(50);
        }
        mo43276v();
    }

    /* renamed from: a */
    public final void mo43258a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        ChatRequestAndConversationChimeraService.m66449a(str, currentTimeMillis, this, this.f78879q);
        mo43263c(51);
        this.f78869g.getText().clear();
        aawe aawe = this.f78872j;
        bxvd da = abdp.f57112g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abdp abdp = (abdp) da.f164949b;
        str.getClass();
        abdp.f57114a |= 2;
        abdp.f57116c = str;
        abdp abdp2 = (abdp) da.mo74062i();
        bxvd da2 = abdq.f57120e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abdq abdq = (abdq) da2.f164949b;
        abdp2.getClass();
        abdq.f57123b = abdp2;
        abdq.f57122a |= 1;
        bxyl a = bxyl.m124413a(currentTimeMillis);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abdq abdq2 = (abdq) da2.f164949b;
        a.getClass();
        abdq2.f57124c = a;
        int i = abdq2.f57122a | 2;
        abdq2.f57122a = i;
        abdq2.f57122a = i | 4;
        abdq2.f57125d = true;
        aawe.f56692e.add((abdq) da2.mo74062i());
        aawe.f56697j++;
        aawe.mo159N((aawe.mo31851e() + aawe.mo31850d()) - 1);
        if (aaya.m47228a(cefw.m136749b())) {
            aawe.mo158M(aawe.mo31849c());
        }
        mo43271q();
        mo43260b((int) C0126R.string.gh_sending_message_announcement);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43259a(boolean z) {
        int i;
        if (!z) {
            i = 22;
        } else {
            i = 21;
        }
        abcx.m47465a(this, 35, i, bzps.CHAT);
    }
}
