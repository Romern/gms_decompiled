package com.google.android.gms.plus.sharebox;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.PlusPage;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReplyBoxChimeraActivity extends FragmentActivity implements aoly, aolu, aolc {

    /* renamed from: a */
    private aolv f83450a;

    /* renamed from: b */
    private aolz f83451b;

    /* renamed from: c */
    private Audience f83452c;

    /* renamed from: d */
    private anqg f83453d;

    /* renamed from: e */
    private String f83454e;

    /* renamed from: f */
    private aomv f83455f;

    /* renamed from: g */
    private final Handler f83456g = new aols(this);

    /* renamed from: a */
    private final void m69360a(int i) {
        m69361b(i);
        m69364j();
    }

    /* renamed from: b */
    private final void m69361b(int i) {
        Toast.makeText(this, i, 0).show();
    }

    /* renamed from: h */
    private final void m69362h() {
        if (((aonf) getSupportFragmentManager().findFragmentByTag("post_error_dialog")) == null) {
            aonf.m66133a((int) C0126R.string.plus_replybox_post_error_message).show(getSupportFragmentManager(), "post_error_dialog");
        }
    }

    /* renamed from: i */
    private final void m69363i() {
        m69360a((int) C0126R.string.plus_replybox_internal_error);
    }

    /* renamed from: j */
    private final void m69364j() {
        setResult(0);
        finish();
    }

    /* renamed from: a */
    public final anqg mo42971a() {
        return this.f83453d;
    }

    /* renamed from: b */
    public final aolz mo42972b() {
        return this.f83451b;
    }

    /* renamed from: c */
    public final void mo42949c() {
        this.f83451b.mo42989a(riv.f43107a);
        m69364j();
    }

    /* renamed from: d */
    public final aomv mo42973d() {
        return this.f83455f;
    }

    /* renamed from: e */
    public final void mo42988e() {
        this.f83450a.mo42983b();
    }

    /* renamed from: f */
    public final void mo42979f() {
        aolv aolv = this.f83450a;
        aolv.mo42981a(aolv.mo42982a());
    }

    /* renamed from: g */
    public final void mo42980g() {
        Comment comment;
        aolv aolv = this.f83450a;
        if (!aolv.mo42982a()) {
            aolv.f78426c.mo42972b().mo42989a(riv.f43112f);
            comment = null;
        } else {
            ssc.m36197a(aolv.getActivity(), aolv.f78429f);
            if (aomi.m66054a(aolv.getActivity(), aolv.f78426c.mo42973d().f78534f)) {
                aolv.f78426c.mo42972b().mo42989a(riv.f43111e);
            }
            comment = new Comment(1, null, aolv.f78426c.mo42973d().f78535g, aomi.m66050a(aolv.f78429f.getText()), aolv.f78426c.mo42973d().f78534f, aolv.f78426c.mo42973d().mo43050b());
        }
        if (comment != null) {
            aoni a = aoni.m66138a(getString(C0126R.string.plus_sharebox_post_pending));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a, "progress_dialog");
            beginTransaction.commitAllowingStateLoss();
            aolz aolz = this.f83451b;
            if (!aolz.f78441g) {
                aolz.f78441g = true;
                aolz.f78442h = comment;
                if (aolz.f78436b.mo24648p()) {
                    aolz.f78437c.mo7257g(Bundle.EMPTY);
                } else if (!aolz.f78436b.mo24649q()) {
                    aolz.f78436b.mo42332x();
                }
            } else {
                throw new IllegalStateException("One comment at a time please");
            }
        } else {
            m69362h();
        }
    }

    public final String getCallingPackage() {
        return this.f83454e;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            StringBuilder sb = new StringBuilder(49);
            sb.append("Failed to resolve connection/account: ");
            sb.append(i2);
            Log.e("ReplyBox", sb.toString());
            m69363i();
        }
    }

    public final void onBackPressed() {
        if (this.f83450a.f78425b) {
            this.f83456g.sendEmptyMessage(1);
            return;
        }
        this.f83451b.mo42989a(riv.f43107a);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String a = spn.m35852a((Activity) this);
        this.f83454e = a;
        if (soz.m35801d(this, a).isEmpty()) {
            Log.e("ReplyBox", "No accounts available to reply");
            m69363i();
        } else if (!ssk.m36235a(this)) {
            m69360a((int) C0126R.string.plus_replybox_no_network_connection);
        } else {
            String str = this.f83454e;
            Intent intent = getIntent();
            if ("com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE".equals(intent.getAction())) {
                if (intent.hasExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) {
                    Log.e("ReplyBox", "Cannot override the calling package when using the action: com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE");
                } else if (TextUtils.isEmpty(str)) {
                    Log.e("ReplyBox", "Must use startActivityForResult when using the action: com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE");
                } else if (rfz.m33557a(this).mo24610b(str)) {
                    aomv aomv = new aomv(getIntent());
                    this.f83455f = aomv;
                    Intent intent2 = getIntent();
                    String stringExtra = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_ID");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        aomv.f78530b = new PlusPage(stringExtra, null, null);
                    }
                    aomv.f78535g = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_REPLY_ACTIVITY_ID");
                    aomv.f78536h = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_REPLY_ADD_COMMENT_HINT");
                    aomv.f78534f = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.SHARE_CONTEXT_TYPE");
                    aomv.f78541m = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_APPLICATION_ID");
                    if (!this.f83455f.mo43049a()) {
                        Log.e("ReplyBox", "No account name provided.");
                        m69363i();
                        return;
                    } else if (!TextUtils.isEmpty(this.f83455f.f78535g)) {
                        setContentView((int) C0126R.C0128layout.plus_replybox_activity);
                        if (bundle != null) {
                            this.f83452c = (Audience) bundle.getParcelable("audience");
                        } else {
                            this.f83452c = sfd.f44109a;
                        }
                        this.f83453d = new anqg(this.f83452c);
                        FragmentManager supportFragmentManager = getSupportFragmentManager();
                        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                        aolz aolz = (aolz) supportFragmentManager.findFragmentByTag("reply_worker_fragment");
                        this.f83451b = aolz;
                        if (aolz == null) {
                            aolz a2 = aolz.m66011a(this.f83455f.f78529a);
                            this.f83451b = a2;
                            beginTransaction.add(a2, "reply_worker_fragment");
                        }
                        aolv aolv = (aolv) supportFragmentManager.findFragmentByTag("reply_fragment");
                        this.f83450a = aolv;
                        if (aolv == null) {
                            aolv aolv2 = new aolv();
                            this.f83450a = aolv2;
                            beginTransaction.add(C0126R.C0129id.post_container, aolv2, "reply_fragment");
                        }
                        beginTransaction.show(this.f83450a);
                        beginTransaction.commit();
                        return;
                    } else {
                        Log.e("ReplyBox", "No activity ID provided.");
                        m69363i();
                        return;
                    }
                }
            }
            Log.e("ReplyBox", "Invalid reply action");
            m69364j();
        }
    }

    public final void onResume() {
        super.onResume();
        aold aold = (aold) getSupportFragmentManager().findFragmentByTag("confirm_action_dialog");
        if (aold != null) {
            aold.f78384a = this;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("audience", this.f83452c);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View findViewById = findViewById(C0126R.C0129id.post_container);
        if (motionEvent.getAction() != 0 || !spa.m35816a(motionEvent, findViewById)) {
            return super.onTouchEvent(motionEvent);
        }
        onBackPressed();
        ssc.m36197a(this, findViewById);
        return true;
    }

    /* renamed from: a */
    public final void mo42986a(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            m69363i();
        } else if (connectionResult.mo17670a()) {
            try {
                connectionResult.mo17669a(getContainerActivity(), 1);
            } catch (IntentSender.SendIntentException e) {
                Log.e("ReplyBox", "Failed to start connection resolution");
                m69363i();
            }
        } else {
            Log.e("ReplyBox", "Failed connection resolution");
            m69363i();
        }
    }

    /* renamed from: b */
    public final void mo42987b(ConnectionResult connectionResult) {
        aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (aoni != null) {
            aoni.dismiss();
        }
        if (connectionResult.mo17671b()) {
            this.f83451b.mo42989a(riv.f43110d);
            m69361b((int) C0126R.string.plus_replybox_post_success);
            setResult(-1);
            finish();
            return;
        }
        this.f83451b.mo42989a(riv.f43112f);
        m69362h();
    }
}
