package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;
import com.google.android.gms.nearby.sharing.view.LoadingButton;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReceiveSurfaceChimeraActivity extends ajhe implements ajud, ajur {

    /* renamed from: A */
    private View f80926A;

    /* renamed from: B */
    private View f80927B;

    /* renamed from: C */
    private View f80928C;

    /* renamed from: D */
    private ajuw f80929D;

    /* renamed from: E */
    private ajvg f80930E;

    /* renamed from: F */
    private View f80931F;

    /* renamed from: G */
    private ajuv f80932G;

    /* renamed from: H */
    private View f80933H;

    /* renamed from: I */
    private boolean f80934I = false;

    /* renamed from: J */
    private ajna f80935J;

    /* renamed from: K */
    private boolean f80936K = false;

    /* renamed from: i */
    public View f80937i;

    /* renamed from: j */
    public TextView f80938j;

    /* renamed from: k */
    public GoogleAccountAvatar f80939k;

    /* renamed from: l */
    public LoadingButton f80940l;

    /* renamed from: m */
    public TextView f80941m;

    /* renamed from: n */
    public ShareTarget f80942n;

    /* renamed from: o */
    public boolean f80943o = false;

    /* renamed from: p */
    public boolean f80944p = false;

    /* renamed from: q */
    public boolean f80945q = false;

    /* renamed from: r */
    private final BroadcastReceiver f80946r = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.C16171 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
                ReceiveSurfaceChimeraActivity.this.mo44465j();
            }
        }
    };

    /* renamed from: s */
    private final BroadcastReceiver f80947s = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.C16182 */

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            char c;
            if (intent.getAction() != null) {
                String action = intent.getAction();
                switch (action.hashCode()) {
                    case -1875733435:
                        if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1530327060:
                        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1076576821:
                        if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -511271086:
                        if (action.equals("android.location.MODE_CHANGED")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    ReceiveSurfaceChimeraActivity.this.mo44465j();
                } else if (c == 1) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    if (intExtra == 12 || intExtra == 10) {
                        ReceiveSurfaceChimeraActivity.this.mo44465j();
                    }
                } else if (c == 2) {
                    int intExtra2 = intent.getIntExtra("wifi_state", -1);
                    if (intExtra2 == 3) {
                        ReceiveSurfaceChimeraActivity.this.mo44465j();
                    } else if (intExtra2 != 1) {
                    } else {
                        if (!cfov.f185185a.mo6606a().mo82270F()) {
                            ReceiveSurfaceChimeraActivity.this.mo44465j();
                        } else {
                            ReceiveSurfaceChimeraActivity.this.f70614b.postDelayed(new ajoz(this), cfov.f185185a.mo6606a().mo82333ap());
                        }
                    }
                } else if (c == 3 && cfov.m142050c()) {
                    ReceiveSurfaceChimeraActivity.this.mo44464i();
                    ReceiveSurfaceChimeraActivity.this.mo44463h();
                }
            }
        }
    };

    /* renamed from: t */
    private View f80948t;

    /* renamed from: u */
    private Button f80949u;

    /* renamed from: v */
    private Button f80950v;

    /* renamed from: w */
    private Button f80951w;

    /* renamed from: x */
    private Button f80952x;

    /* renamed from: y */
    private Button f80953y;

    /* renamed from: z */
    private ajwy f80954z;

    /* renamed from: a */
    private final void m67528a(int i) {
        CharSequence charSequence;
        String str;
        if (this.f80938j.getTag(C0126R.C0129id.toolbar_title) != null) {
            charSequence = (CharSequence) this.f80938j.getTag(C0126R.C0129id.toolbar_title);
        } else {
            charSequence = this.f80938j.getText();
        }
        switch (i) {
            case 1:
                str = getString(C0126R.string.sharing_status_connecting);
                break;
            case 2:
                str = getString(C0126R.string.sharing_status_waiting_receiver, new Object[]{akiq.m59845a(this.f80942n.f81029b, 16)});
                break;
            case 3:
            case 5:
                str = getString(C0126R.string.sharing_status_receiving);
                break;
            case 4:
            case 7:
                str = getString(C0126R.string.sharing_status_failed);
                break;
            case 6:
                str = getString(C0126R.string.sharing_status_received);
                break;
            case 8:
                str = getString(C0126R.string.sharing_status_rejected);
                break;
            case 9:
                str = getString(C0126R.string.sharing_status_cancelled);
                break;
            case 10:
                str = getString(C0126R.string.sharing_status_timed_out);
                break;
            case 11:
                str = getString(C0126R.string.sharing_status_media_unavailable);
                break;
            case 12:
                str = getString(C0126R.string.sharing_status_media_downloading);
                break;
            case 13:
                str = getString(C0126R.string.sharing_status_not_enough_space);
                break;
            case 14:
                str = getString(C0126R.string.sharing_status_unsupported_attachment_type);
                break;
            default:
                str = getString(C0126R.string.sharing_product_name);
                break;
        }
        if (TextUtils.equals(charSequence, str)) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f80938j.setText(str);
            invalidateOptionsMenu();
            return;
        }
        this.f80938j.setTag(C0126R.C0129id.toolbar_title, str);
        this.f80937i.animate().alpha(0.0f).setDuration(250).withEndAction(new ajok(this));
    }

    /* renamed from: b */
    private final void m67529b(int i) {
        if (cfov.m142055h()) {
            this.f80949u.setVisibility(4);
            this.f80950v.setVisibility(4);
            this.f80951w.setVisibility(4);
            this.f80952x.setVisibility(4);
            this.f80953y.setVisibility(4);
            this.f80940l.setVisibility(4);
        } else {
            this.f80949u.setVisibility(8);
            this.f80950v.setVisibility(8);
            this.f80951w.setVisibility(8);
            this.f80952x.setVisibility(8);
            this.f80953y.setVisibility(8);
            this.f80940l.setVisibility(8);
        }
        switch (i) {
            case 1:
            case 3:
            case 5:
                this.f80952x.setVisibility(0);
                return;
            case 2:
                this.f80950v.setVisibility(0);
                this.f80951w.setVisibility(0);
                return;
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                this.f80953y.setVisibility(0);
                return;
            case 6:
                List list = this.f80942n.f81033f;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        if (((TextAttachment) list.get(i2)).f81049b == 0) {
                            i2 = i3;
                        }
                    }
                    this.f80945q = true;
                    List list2 = this.f80942n.f81033f;
                    if (!list2.isEmpty()) {
                        TextView textView = (TextView) this.f80933H.findViewById(C0126R.C0129id.sender_info);
                        textView.setText(getString(C0126R.string.sharing_receive_surface_received_sender_description, new Object[]{this.f80942n.f81029b}));
                        ShareTarget shareTarget = this.f80942n;
                        textView.setCompoundDrawablesWithIntrinsicBounds(new ajwv(this, new ajwu(shareTarget.f81029b, shareTarget.f81030c, shareTarget.f81038k), 24), (Drawable) null, (Drawable) null, (Drawable) null);
                        ((TextView) this.f80933H.findViewById(C0126R.C0129id.text_content)).setText(((TextAttachment) list2.get(0)).f81048a);
                        ((TextView) this.f80933H.findViewById(C0126R.C0129id.copy_btn)).setOnClickListener(new ajol(this));
                        this.f80933H.setVisibility(0);
                        this.f80931F.setVisibility(8);
                        this.f80927B.setVisibility(8);
                        return;
                    }
                    return;
                }
                mo44460a(this.f80942n);
                return;
            default:
                if (this.f80934I) {
                    this.f80949u.setVisibility(0);
                    return;
                } else if (!cfov.m142050c()) {
                    this.f80940l.setVisibility(0);
                    return;
                } else if (!akiw.m59863b(this)) {
                    this.f80940l.setVisibility(0);
                    return;
                } else {
                    return;
                }
        }
    }

    /* renamed from: n */
    private final void m67530n() {
        this.f70615c.mo38900a((ajud) this);
        ajwy ajwy = this.f80954z;
        ajwy.f71485b.mo39038a();
        ajwy.f71486c.mo39038a();
        ajwy.invalidateSelf();
        ajwy.f71487d = false;
        mo44463h();
    }

    /* renamed from: a */
    public final void mo38686a(View view, Object obj) {
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity"));
        List list = this.f80929D.f71298d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ShareTarget shareTarget = (ShareTarget) list.get(i);
            printWriter.write(String.format("  %s\n", shareTarget));
            printWriter.write(String.format("  %s\n", this.f80929D.mo38951b(shareTarget)));
        }
        printWriter.flush();
    }

    /* renamed from: h */
    public final void mo44463h() {
        if (!this.f80944p && !this.f80945q) {
            m67528a(0);
            if (!this.f80934I) {
                if (cfov.m142050c()) {
                    mo44464i();
                }
                this.f80926A.setVisibility(0);
                this.f80931F.setVisibility(8);
                this.f80927B.setVisibility(8);
                this.f80928C.setVisibility(8);
                this.f80948t.setVisibility(0);
                m67529b(0);
            } else if (this.f80929D.f71298d.isEmpty()) {
                this.f80926A.setVisibility(8);
                this.f80931F.setVisibility(8);
                this.f80927B.setVisibility(0);
                this.f80928C.setVisibility(0);
                this.f80948t.setVisibility(8);
            } else {
                this.f80926A.setVisibility(8);
                this.f80931F.setVisibility(0);
                this.f80927B.setVisibility(8);
                this.f80928C.setVisibility(8);
                this.f80948t.setVisibility(0);
                m67529b(0);
            }
        }
    }

    /* renamed from: i */
    public final void mo44464i() {
        TextView textView;
        TextView textView2;
        if (cfov.m142045U()) {
            textView2 = (TextView) this.f80926A.findViewById(C0126R.C0129id.missing_permissions_header_subtitle_103);
            textView = (TextView) this.f80926A.findViewById(C0126R.C0129id.missing_permissions_header_description_103);
        } else {
            textView2 = (TextView) this.f80926A.findViewById(C0126R.C0129id.missing_permissions_header_subtitle);
            textView = (TextView) this.f80926A.findViewById(C0126R.C0129id.missing_permissions_header_description);
        }
        if (akiw.m59863b(this)) {
            textView2.setText((int) C0126R.string.sharing_receive_surface_subtitle_error_airplane);
            textView.setText((int) C0126R.string.sharing_receive_surface_title_error_airplane);
        } else {
            textView2.setText((int) C0126R.string.sharing_receive_surface_subtitle_error);
            textView.setText((int) C0126R.string.sharing_receive_surface_title_error);
        }
        m67529b(0);
    }

    /* renamed from: j */
    public final void mo44465j() {
        this.f70615c.mo38904b().mo50373a(new ajoi(this, akij.m59823a((Context) this), akic.m59785a(), akiw.m59862a((Context) this)));
    }

    /* renamed from: k */
    public final void mo44466k() {
        if (!this.f80934I && !this.f70618f) {
            this.f80934I = true;
            this.f70615c.mo38901a(this, 1);
            ajwy ajwy = this.f80954z;
            int a = akim.m59827a(this);
            ajwy.f71485b.f71480b.setColor(a);
            ajwy.f71486c.f71480b.setColor(a);
            ajwy.f71484a.f71480b.setColor(a);
            ajwy ajwy2 = this.f80954z;
            ajwy2.f71485b.mo39039a(800);
            ajwy2.f71486c.mo39039a(1300);
            ajwy2.f71487d = true;
            mo44463h();
            this.f70615c.mo38912e().mo50373a(new ajoj(this));
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceActivity is now available");
        }
    }

    /* renamed from: l */
    public final void mo44467l() {
        if (this.f80934I) {
            this.f80934I = false;
            if (!cfov.m142052e() || !this.f80944p) {
                m67530n();
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceActivity is unavailable");
            }
        }
    }

    /* renamed from: m */
    public final void mo44468m() {
        ahcb.m55442c(this).mo38893G().mo50373a(new ajon(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1000) {
            if (i != 1005) {
                if (i != 1006) {
                    super.onActivityResult(i, i2, intent);
                } else {
                    mo44465j();
                }
            } else if (i2 == -1) {
                mo44465j();
            } else if (cfov.m142044T()) {
                Toast.makeText(this, getString(C0126R.string.sharing_enable_failed_location), 0).show();
            } else {
                mo44461a(getString(C0126R.string.sharing_required_service_location));
            }
        } else if (i2 != -1) {
            finish();
        } else {
            mo44465j();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfov.m142066s()) {
            this.f80943o = true;
            finish();
            return;
        }
        this.f80930E = new ajvg();
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("is_from_fast_init", false)) {
            ajvg ajvg = this.f80930E;
            bxvd d = ajvh.m59107d(28);
            bvfb bvfb = bvfb.f155839a;
            if (d.f164950c) {
                d.mo74035c();
                d.f164950c = false;
            }
            bvgd bvgd = (bvgd) d.f164949b;
            bvgd bvgd2 = bvgd.f155960B;
            bvfb.getClass();
            bvgd.f155988y = bvfb;
            bvgd.f155964a |= 536870912;
            ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
        }
        C1353sk.m20238o();
        setContentView((int) C0126R.C0128layout.sharing_activity_receive_surface);
        this.f80935J = ajna.m58860a(this);
        View findViewById = findViewById(C0126R.C0129id.toolbar_wrapper);
        this.f80937i = findViewById;
        mo8626a((Toolbar) findViewById.findViewById(C0126R.C0129id.toolbar));
        mo8628aW().mo15858c(false);
        this.f80938j = (TextView) this.f80937i.findViewById(C0126R.C0129id.toolbar_title);
        m67528a(0);
        this.f80948t = findViewById(C0126R.C0129id.nav_bar);
        this.f80949u = (Button) findViewById(C0126R.C0129id.stop_btn);
        this.f80950v = (Button) findViewById(C0126R.C0129id.accept_btn);
        this.f80951w = (Button) findViewById(C0126R.C0129id.reject_btn);
        this.f80952x = (Button) findViewById(C0126R.C0129id.cancel_btn);
        this.f80953y = (Button) findViewById(C0126R.C0129id.close_btn);
        this.f80940l = (LoadingButton) findViewById(C0126R.C0129id.enable_btn);
        this.f80949u.setOnClickListener(new ajob(this));
        this.f80950v.setOnClickListener(new ajom(this));
        this.f80951w.setOnClickListener(new ajor(this));
        this.f80952x.setOnClickListener(new ajos(this));
        this.f80953y.setOnClickListener(new ajot(this));
        this.f80940l.setOnClickListener(new ajou(this));
        m67529b(0);
        if (cfov.m142045U()) {
            this.f80926A = findViewById(C0126R.C0129id.missing_permissions_103);
        } else {
            this.f80926A = findViewById(C0126R.C0129id.missing_permissions);
        }
        this.f80926A.setVisibility(8);
        this.f80954z = new ajwy(this);
        ((ImageView) findViewById(C0126R.C0129id.advertising_indicator)).setImageDrawable(this.f80954z);
        View findViewById2 = findViewById(C0126R.C0129id.empty_view);
        this.f80927B = findViewById2;
        this.f80941m = (TextView) findViewById2.findViewById(C0126R.C0129id.header_subtitle);
        TextView textView = (TextView) findViewById(C0126R.C0129id.debug_text);
        if (cfov.m142039O()) {
            textView.setText(akih.m59817a(this));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        this.f80928C = findViewById(C0126R.C0129id.help_section);
        if (!cfov.m142027C()) {
            TextView textView2 = (TextView) findViewById(C0126R.C0129id.help_link_text_old);
            textView2.setVisibility(0);
            textView2.setOnClickListener(new ajow(this));
        } else {
            TextView textView3 = (TextView) findViewById(C0126R.C0129id.help_link_text);
            String valueOf = String.valueOf(textView3.getText());
            String string = getString(C0126R.string.sharing_receive_surface_learn_more);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string);
            String sb2 = sb.toString();
            int length = textView3.getText().length();
            int length2 = sb2.length();
            textView3.setText(sb2);
            akiu.m59859a(textView3, length + 1, length2, new ajox(this));
        }
        this.f80931F = findViewById(C0126R.C0129id.enlarged_view);
        ajuw a = ajuw.m59073a(this, this);
        this.f80929D = a;
        this.f80932G = a.mo38946a(this.f80931F);
        this.f80933H = findViewById(C0126R.C0129id.text_content_preview);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceActivity created");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.sharing_menu_main, menu);
        if (cfov.m142046V()) {
            MenuItem findItem = menu.findItem(C0126R.C0129id.action_settings);
            findItem.setActionView((int) C0126R.C0128layout.sharing_menu_action_view_google_account_avatar);
            GoogleAccountAvatar googleAccountAvatar = (GoogleAccountAvatar) findItem.getActionView().findViewById(C0126R.C0129id.google_account_avatar_menu);
            this.f80939k = googleAccountAvatar;
            googleAccountAvatar.setOnClickListener(new ajoy(this, findItem));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == C0126R.C0129id.action_settings) {
            startActivity(SettingsChimeraActivity.m67544a(this));
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Launched the settings activity");
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.action_feedback) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            ahcb.m55442c(this).mo38893G().mo50373a(new ajod(this));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo38632a(true);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(C0126R.C0129id.action_settings);
        this.f70615c.mo38893G().mo50373a(new ajoc(this, findItem));
        findItem.setVisible(this.f80942n == null);
        mo8628aW().mo15853b(this.f80942n == null);
        menu.findItem(C0126R.C0129id.action_feedback).setVisible(cfov.m142040P());
        int i = 0;
        for (int i2 = 0; i2 < menu.size(); i2++) {
            if (menu.getItem(i2).isVisible()) {
                i++;
            }
        }
        int max = Math.max(1, i) * akim.m59828a(this, 48);
        TextView textView = this.f80938j;
        textView.setPadding(max, textView.getPaddingTop(), max, this.f80938j.getPaddingBottom());
        akiu.m59852a(this, this.f80938j, getResources().getDimension(C0126R.dimen.sharing_toolbar_title_text_size_default), getResources().getDimension(C0126R.dimen.sharing_toolbar_title_text_size_min));
        CharSequence charSequence = (CharSequence) this.f80938j.getTag(C0126R.C0129id.toolbar_title);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f80938j.setTag(C0126R.C0129id.toolbar_title, null);
            this.f80938j.setText(charSequence);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        mo38631a(new ajov(this));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceActivity has resumed");
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        if (!this.f80943o) {
            super.onStart();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            registerReceiver(this.f80947s, intentFilter);
            ahhd.m55767a(this, this.f80946r, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
            mo44465j();
            mo44463h();
            invalidateOptionsMenu();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceActivity has started");
            return;
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.f80943o) {
            ahhd.m55766a(this, this.f80947s);
            ahhd.m55766a(this, this.f80946r);
            if (!this.f80945q) {
                this.f80942n = null;
            }
            this.f80929D.mo38952c();
            mo44467l();
            if (cfov.m142052e()) {
                m67530n();
            }
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ReceiveSurfaceActivity has stopped");
            super.onStop();
            return;
        }
        super.onStop();
    }

    /* renamed from: a */
    public final void mo44460a(ShareTarget shareTarget) {
        this.f70615c.mo38909c(shareTarget);
        finish();
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!cfov.m142064q() || transferMetadata.f81052a != 15) {
            this.f80935J.mo38811a(shareTarget);
            if (!transferMetadata.f81056e || this.f80936K) {
                mo44462b(shareTarget, transferMetadata);
                return;
            }
            return;
        }
        finish();
    }

    /* renamed from: b */
    public final void mo44462b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f80942n = shareTarget;
        if (!this.f80929D.mo38949a(shareTarget)) {
            this.f80929D.mo38929a((Object) shareTarget);
        }
        this.f80929D.mo38948a(shareTarget, transferMetadata);
        ajuw ajuw = this.f80929D;
        ajuw.mo38928a(this.f80932G, ajuw.mo38930b((Object) shareTarget));
        if (cfov.m142062o()) {
            this.f80932G.f201a.setOnClickListener(null);
        }
        this.f80929D.mo171aJ();
        mo44463h();
        m67528a(transferMetadata.f81052a);
        m67529b(transferMetadata.f81052a);
        if (transferMetadata.f81056e) {
            this.f70615c.mo38900a((ajud) this);
            this.f80944p = false;
            return;
        }
        this.f80944p = true;
        this.f80936K = true;
    }

    /* renamed from: a */
    public final void mo44461a(String str) {
        Toast.makeText(this, getString(C0126R.string.sharing_enable_failed, new Object[]{str}), 0).show();
    }
}
