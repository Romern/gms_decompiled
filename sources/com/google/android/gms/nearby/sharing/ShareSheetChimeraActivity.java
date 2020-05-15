package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.ContentView;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;
import com.google.android.gms.nearby.sharing.view.LoadingButton;
import com.google.android.gms.nearby.sharing.view.RadarView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShareSheetChimeraActivity extends ajhe implements ajud, ajur {

    /* renamed from: y */
    private static AccessibilityManager f80987y;

    /* renamed from: A */
    private final BroadcastReceiver f80988A = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity.C16222 */

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
                    ShareSheetChimeraActivity.this.mo44492j();
                } else if (c == 1) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    if (intExtra == 12 || intExtra == 10) {
                        ShareSheetChimeraActivity.this.mo44492j();
                    }
                } else if (c == 2) {
                    int intExtra2 = intent.getIntExtra("wifi_state", -1);
                    if (intExtra2 == 3 || intExtra2 == 1) {
                        ShareSheetChimeraActivity.this.mo44492j();
                    }
                } else if (c == 3 && cfov.m142050c()) {
                    ShareSheetChimeraActivity.this.mo44493k();
                }
            }
        }
    };

    /* renamed from: B */
    private TextView f80989B;

    /* renamed from: C */
    private ContentView f80990C;

    /* renamed from: D */
    private View f80991D;

    /* renamed from: E */
    private Button f80992E;

    /* renamed from: F */
    private Button f80993F;

    /* renamed from: G */
    private Button f80994G;

    /* renamed from: H */
    private Button f80995H;

    /* renamed from: I */
    private Button f80996I;

    /* renamed from: J */
    private Button f80997J;

    /* renamed from: K */
    private aigz f80998K;

    /* renamed from: L */
    private boolean f80999L;

    /* renamed from: M */
    private boolean f81000M = false;

    /* renamed from: N */
    private View f81001N;

    /* renamed from: O */
    private RecyclerView f81002O;

    /* renamed from: P */
    private ajuw f81003P;

    /* renamed from: Q */
    private ajuv f81004Q;

    /* renamed from: R */
    private View f81005R;

    /* renamed from: S */
    private RecyclerView f81006S;

    /* renamed from: T */
    private ajuw f81007T;

    /* renamed from: U */
    private ajuv f81008U;

    /* renamed from: i */
    public final ajsn f81009i = new ajsk(this);

    /* renamed from: j */
    public View f81010j;

    /* renamed from: k */
    public GoogleAccountAvatar f81011k;

    /* renamed from: l */
    public LoadingButton f81012l;

    /* renamed from: m */
    public View f81013m;

    /* renamed from: n */
    public View f81014n;

    /* renamed from: o */
    public ShareTarget f81015o;

    /* renamed from: p */
    public ShareTarget f81016p;

    /* renamed from: q */
    public final Map f81017q = new ArrayMap();

    /* renamed from: r */
    public boolean f81018r = false;

    /* renamed from: s */
    public View f81019s;

    /* renamed from: t */
    public RadarView f81020t;

    /* renamed from: u */
    public TextView f81021u;

    /* renamed from: v */
    public RadarView f81022v;

    /* renamed from: w */
    public int f81023w = 1;

    /* renamed from: x */
    private ajna f81024x;

    /* renamed from: z */
    private final BroadcastReceiver f81025z = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity.C16211 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
                ShareSheetChimeraActivity.this.mo44492j();
            }
        }
    };

    /* renamed from: a */
    private final void m67559a(int i, String str) {
        CharSequence charSequence;
        String str2;
        if (this.f80989B.getTag(C0126R.C0129id.toolbar_title) != null) {
            charSequence = (CharSequence) this.f80989B.getTag(C0126R.C0129id.toolbar_title);
        } else {
            charSequence = this.f80989B.getText();
        }
        switch (i) {
            case 1:
                str2 = getString(C0126R.string.sharing_status_connecting);
                break;
            case 2:
            case 3:
                if (str != null) {
                    str2 = getString(C0126R.string.sharing_status_waiting_sender_with_token);
                    break;
                } else {
                    str2 = getString(C0126R.string.sharing_status_waiting_sender_without_token);
                    break;
                }
            case 4:
            case 7:
                str2 = getString(C0126R.string.sharing_status_failed);
                break;
            case 5:
                str2 = getString(C0126R.string.sharing_status_sending);
                break;
            case 6:
                str2 = getString(C0126R.string.sharing_status_sent);
                break;
            case 8:
                str2 = getString(C0126R.string.sharing_status_rejected);
                break;
            case 9:
                str2 = getString(C0126R.string.sharing_status_cancelled);
                break;
            case 10:
                str2 = getString(C0126R.string.sharing_status_timed_out);
                break;
            case 11:
                str2 = getString(C0126R.string.sharing_status_media_unavailable);
                break;
            case 12:
                str2 = getString(C0126R.string.sharing_status_media_downloading);
                break;
            case 13:
                str2 = getString(C0126R.string.sharing_status_not_enough_space);
                break;
            case 14:
                str2 = getString(C0126R.string.sharing_status_unsupported_attachment_type);
                break;
            default:
                str2 = getString(C0126R.string.sharing_product_name);
                break;
        }
        if (TextUtils.equals(charSequence, str2)) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f80989B.setText(str2);
            invalidateOptionsMenu();
            return;
        }
        this.f80989B.setTag(C0126R.C0129id.toolbar_title, str2);
        this.f81010j.animate().alpha(0.0f).setDuration(250).withEndAction(new ajrm(this));
    }

    /* renamed from: c */
    private final void m67561c(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        int i;
        this.f81024x.mo38818b(shareTarget);
        this.f81015o = shareTarget;
        if (!mo44489g(shareTarget).mo38949a(shareTarget)) {
            mo44480a(shareTarget);
        }
        if (this.f81019s.getVisibility() != 0) {
            mo44487e(shareTarget);
        }
        int b = mo44489g(shareTarget).mo38930b((Object) shareTarget);
        mo44489g(shareTarget).mo38948a(shareTarget, transferMetadata);
        mo44489g(shareTarget).mo38928a(m67564j(shareTarget), b);
        if (cfov.m142062o()) {
            m67564j(shareTarget).f201a.setOnClickListener(null);
        }
        mo44489g(shareTarget).mo171aJ();
        m67559a(transferMetadata.f81052a, transferMetadata.f81054c);
        mo44478a(transferMetadata.f81052a, transferMetadata.f81054c, shareTarget);
        if (transferMetadata.f81056e) {
            mo44490h();
            i = 3;
        } else {
            i = 2;
        }
        this.f81023w = i;
    }

    /* renamed from: h */
    private static boolean m67562h(ShareTarget shareTarget) {
        return !cfov.m142063p() || !shareTarget.f81041n;
    }

    /* renamed from: i */
    private final View m67563i(ShareTarget shareTarget) {
        return !m67562h(shareTarget) ? this.f81005R : this.f81001N;
    }

    /* renamed from: j */
    private final ajuv m67564j(ShareTarget shareTarget) {
        return !m67562h(shareTarget) ? this.f81008U : this.f81004Q;
    }

    /* renamed from: m */
    private final void m67565m() {
        this.f81020t.mo44660b();
        if (cfov.m142063p()) {
            this.f81022v.mo44660b();
        }
    }

    /* renamed from: b */
    public final void mo44483b(ShareTarget shareTarget) {
        m67563i(shareTarget).animate().alpha(1.0f).setDuration(150).setStartDelay(150).setInterpolator(new OvershootInterpolator()).start();
        mo44488f(shareTarget).animate().alpha(0.0f).setDuration(150).withEndAction(new ajrl(this, shareTarget)).start();
    }

    /* renamed from: d */
    public final void mo44486d(ShareTarget shareTarget) {
        int i = mo44489g(shareTarget).mo38951b(shareTarget).f81052a;
        if (i == 1 || i == 2 || i == 3 || i == 5 || i == 12) {
            this.f70615c.mo38907b(shareTarget);
            srn srn = ajvp.f71371a;
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.ShareSheetActivity"));
        List list = this.f81003P.f71298d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ShareTarget shareTarget = (ShareTarget) list.get(i);
            printWriter.write(String.format("  %s\n", shareTarget));
            printWriter.write(String.format("  %s\n", this.f81003P.mo38951b(shareTarget)));
        }
        printWriter.write(String.format("  RecyclerView child count: %s\n", Integer.valueOf(this.f81002O.getChildCount())));
        if (cfov.m142063p()) {
            List list2 = this.f81007T.f71298d;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ShareTarget shareTarget2 = (ShareTarget) list2.get(i2);
                printWriter.write(String.format("  %s\n", shareTarget2));
                printWriter.write(String.format("  %s\n", this.f81007T.mo38951b(shareTarget2)));
            }
            printWriter.write(String.format("  External recyclerView child count: %s\n", Integer.valueOf(this.f81006S.getChildCount())));
        }
        printWriter.flush();
    }

    /* renamed from: e */
    public final void mo44487e(ShareTarget shareTarget) {
        int b = mo44489g(shareTarget).mo38930b((Object) shareTarget);
        if (b != -1) {
            mo44489g(shareTarget).mo38928a(m67564j(shareTarget), b);
            this.f81019s.setVisibility(0);
            this.f81013m.setVisibility(4);
            this.f70617e.setMinimumHeight((int) getResources().getDimension(C0126R.dimen.sharing_receiver_surface_content_min_height));
        }
    }

    /* renamed from: f */
    public final RecyclerView mo44488f(ShareTarget shareTarget) {
        return !m67562h(shareTarget) ? this.f81006S : this.f81002O;
    }

    /* renamed from: g */
    public final ajuw mo44489g(ShareTarget shareTarget) {
        return !m67562h(shareTarget) ? this.f81007T : this.f81003P;
    }

    /* renamed from: k */
    public final void mo44493k() {
        TextView textView;
        TextView textView2;
        if (cfov.m142045U()) {
            textView2 = (TextView) this.f81014n.findViewById(C0126R.C0129id.missing_permissions_header_subtitle_103);
            textView = (TextView) this.f81014n.findViewById(C0126R.C0129id.missing_permissions_header_description_103);
        } else {
            textView2 = (TextView) this.f81014n.findViewById(C0126R.C0129id.missing_permissions_header_subtitle);
            textView = (TextView) this.f81014n.findViewById(C0126R.C0129id.missing_permissions_header_description);
        }
        if (akiw.m59863b(this)) {
            textView2.setText((int) C0126R.string.sharing_receive_surface_subtitle_error_airplane);
            textView.setText((int) C0126R.string.sharing_receive_surface_title_error_airplane);
        } else {
            textView2.setText((int) C0126R.string.sharing_receive_surface_subtitle_error);
            textView.setText((int) C0126R.string.sharing_receive_surface_title_error);
        }
        mo44478a(0, (String) null, (ShareTarget) null);
    }

    /* renamed from: l */
    public final void mo44494l() {
        ahcb.m55442c(this).mo38893G().mo50373a(new ajrt(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1000) {
            if (i != 1005) {
                if (i != 1006) {
                    super.onActivityResult(i, i2, intent);
                } else {
                    mo44492j();
                }
            } else if (i2 == -1) {
                mo44492j();
            } else if (cfov.m142044T()) {
                Toast.makeText(this, getString(C0126R.string.sharing_enable_failed_location), 0).show();
            } else {
                mo44482a(getString(C0126R.string.sharing_required_service_location));
            }
        } else if (i2 != -1) {
            finish();
        } else {
            mo44492j();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        char c;
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        if (!cfov.m142066s()) {
            this.f81000M = true;
            finish();
            return;
        }
        C1353sk.m20238o();
        setContentView((int) C0126R.C0128layout.sharing_activity_share_sheet);
        this.f80998K = aigz.m57242a(getContainerActivity());
        f80987y = (AccessibilityManager) getSystemService("accessibility");
        this.f81024x = ajna.m58860a(this);
        View findViewById = findViewById(C0126R.C0129id.toolbar_wrapper);
        this.f81010j = findViewById;
        mo8626a((Toolbar) findViewById.findViewById(C0126R.C0129id.toolbar));
        int i = 0;
        mo8628aW().mo15858c(false);
        this.f80989B = (TextView) this.f81010j.findViewById(C0126R.C0129id.toolbar_title);
        m67559a(0, (String) null);
        View findViewById2 = findViewById(C0126R.C0129id.nav_bar);
        this.f80991D = findViewById2;
        this.f80992E = (Button) findViewById2.findViewById(C0126R.C0129id.close_btn);
        this.f80993F = (Button) this.f80991D.findViewById(C0126R.C0129id.accept_btn);
        this.f80994G = (Button) this.f80991D.findViewById(C0126R.C0129id.reject_btn);
        this.f80995H = (Button) this.f80991D.findViewById(C0126R.C0129id.cancel_btn);
        this.f80996I = (Button) this.f80991D.findViewById(C0126R.C0129id.done_btn);
        this.f80997J = (Button) this.f80991D.findViewById(C0126R.C0129id.retry_btn);
        this.f81012l = (LoadingButton) findViewById(C0126R.C0129id.enable_btn);
        this.f80992E.setOnClickListener(new ajrc(this));
        this.f80993F.setOnClickListener(new ajrn(this));
        this.f80994G.setOnClickListener(new ajry(this));
        this.f80995H.setOnClickListener(new ajsd(this));
        this.f80996I.setOnClickListener(new ajse(this));
        this.f80997J.setOnClickListener(new ajsf(this));
        this.f81012l.setOnClickListener(new ajsg(this));
        mo44478a(0, (String) null, (ShareTarget) null);
        ContentView contentView = (ContentView) findViewById(C0126R.C0129id.content_preview);
        this.f80990C = contentView;
        ShareTarget shareTarget = this.f81015o;
        if (shareTarget == null) {
            Intent intent = getIntent();
            if (!cfov.m142048X() || !intent.hasExtra("android.intent.extra.WIFI_CREDENTIALS_BUNDLE")) {
                c = akiq.m59844a(intent) == null ? (char) 2 : 3;
            } else {
                c = 4;
            }
            if (c == 4) {
                contentView.mo44650a(Collections.singletonList(akhv.m59740a(intent)));
            } else if (c == 3) {
                contentView.mo44650a(Collections.singletonList(akhv.m59739a(this, intent)));
            } else if (akhv.m59743b(intent).startsWith("image")) {
                contentView.mo44651a(akif.m59807a(intent));
            } else {
                contentView.mo44650a(new ArrayList());
                new akiy(getApplicationContext(), new akix(contentView), intent).start();
            }
        } else {
            List b = shareTarget.mo44499b();
            if (!b.isEmpty()) {
                if (akhv.m59742a(b, 1)) {
                    Uri[] uriArr = new Uri[b.size()];
                    for (int i2 = 0; i2 < b.size(); i2++) {
                        uriArr[i2] = ((FileAttachment) b.get(i2)).f80884d;
                    }
                    contentView.mo44651a(uriArr);
                }
            }
            contentView.mo44650a(b);
        }
        this.f81013m = findViewById(C0126R.C0129id.body);
        this.f81020t = (RadarView) findViewById(C0126R.C0129id.sharing_radar);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.list);
        this.f81002O = recyclerView;
        recyclerView.setLayoutManager(new aah(0));
        ajuw a = ajuw.m59073a(this, this);
        this.f81003P = a;
        this.f81002O.setAdapter(a);
        if (cfov.m142045U()) {
            this.f81014n = findViewById(C0126R.C0129id.missing_permissions_103);
        } else {
            this.f81014n = findViewById(C0126R.C0129id.missing_permissions);
        }
        View findViewById3 = findViewById(C0126R.C0129id.empty_view);
        this.f81001N = findViewById3;
        this.f81021u = (TextView) findViewById3.findViewById(C0126R.C0129id.empty_view_description);
        if (!cfov.m142027C()) {
            TextView textView = (TextView) findViewById(C0126R.C0129id.help_link_text_old);
            textView.setVisibility(0);
            ((ViewGroup.MarginLayoutParams) findViewById(C0126R.C0129id.help_link_text).getLayoutParams()).setMargins(0, akim.m59828a(this, 16), 0, 0);
            textView.setOnClickListener(new ajsi(this));
        } else {
            TextView textView2 = (TextView) findViewById(C0126R.C0129id.help_link_text);
            String valueOf = String.valueOf(textView2.getText());
            String string = getString(C0126R.string.sharing_receive_surface_learn_more);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string);
            String sb2 = sb.toString();
            int length = textView2.getText().length();
            int length2 = sb2.length();
            textView2.setText(sb2);
            akiu.m59859a(textView2, length + 1, length2, new ajsj(this));
        }
        View findViewById4 = findViewById(C0126R.C0129id.enlarged_view);
        this.f81019s = findViewById4;
        this.f81004Q = this.f81003P.mo38946a(findViewById4);
        TextView textView3 = (TextView) findViewById(C0126R.C0129id.debug_text);
        if (cfov.m142039O()) {
            textView3.setText(akih.m59817a(this));
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        this.f81022v = (RadarView) findViewById(C0126R.C0129id.sharing_radar_external);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(C0126R.C0129id.list_external);
        this.f81006S = recyclerView2;
        recyclerView2.setLayoutManager(new aah(0));
        ajuw a2 = ajuw.m59073a(this, this);
        this.f81007T = a2;
        this.f81006S.setAdapter(a2);
        this.f81005R = findViewById(C0126R.C0129id.empty_view_external);
        this.f81008U = this.f81007T.mo38946a(this.f81019s);
        ((TextView) findViewById(C0126R.C0129id.empty_view_title_external)).setText("Looking for OEM devices");
        View findViewById5 = findViewById(C0126R.C0129id.scan_section_external);
        if (!cfov.m142063p()) {
            i = 8;
        }
        findViewById5.setVisibility(i);
        this.f81023w = 1;
        ((bnsl) ajvp.f71371a.mo68390d()).mo68415a("ShareSheetActivity has been created in %s millis", System.currentTimeMillis() - currentTimeMillis);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.sharing_menu_main, menu);
        if (cfov.m142046V()) {
            MenuItem findItem = menu.findItem(C0126R.C0129id.action_settings);
            findItem.setActionView((int) C0126R.C0128layout.sharing_menu_action_view_google_account_avatar);
            GoogleAccountAvatar googleAccountAvatar = (GoogleAccountAvatar) findItem.getActionView().findViewById(C0126R.C0129id.google_account_avatar_menu);
            this.f81011k = googleAccountAvatar;
            googleAccountAvatar.setOnClickListener(new ajrd(this, findItem));
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        recreate();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == C0126R.C0129id.action_settings) {
            startActivity(SettingsChimeraActivity.m67544a(this));
            srn srn = ajvp.f71371a;
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.action_feedback) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            ahcb.m55442c(this).mo38893G().mo50373a(new ajrf(this));
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
        this.f70615c.mo38893G().mo50373a(new ajre(this, findItem));
        int i = this.f81023w;
        findItem.setVisible(i == 1 || i == 4);
        mo8628aW().mo15853b(this.f81015o == null);
        menu.findItem(C0126R.C0129id.action_feedback).setVisible(cfov.m142040P());
        int i2 = 0;
        for (int i3 = 0; i3 < menu.size(); i3++) {
            if (menu.getItem(i3).isVisible()) {
                i2++;
            }
        }
        int max = Math.max(1, i2) * akim.m59828a(this, 48);
        TextView textView = this.f80989B;
        textView.setPadding(max, textView.getPaddingTop(), max, this.f80989B.getPaddingBottom());
        akiu.m59852a(this, this.f80989B, getResources().getDimension(C0126R.dimen.sharing_toolbar_title_text_size_default), getResources().getDimension(C0126R.dimen.sharing_toolbar_title_text_size_min));
        CharSequence charSequence = (CharSequence) this.f80989B.getTag(C0126R.C0129id.toolbar_title);
        if (!TextUtils.isEmpty(charSequence)) {
            this.f80989B.setTag(C0126R.C0129id.toolbar_title, null);
            this.f80989B.setText(charSequence);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
        mo38631a(new ajsh(this));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ShareSheetActivity has resumed.");
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        if (!this.f81000M) {
            long currentTimeMillis = System.currentTimeMillis();
            super.onStart();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            registerReceiver(this.f80988A, intentFilter);
            ahhd.m55767a(this, this.f81025z, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
            mo44492j();
            invalidateOptionsMenu();
            ShareTarget shareTarget = this.f81015o;
            if (shareTarget != null) {
                mo44480a(shareTarget);
                mo44487e(shareTarget);
            }
            ((bnsl) ajvp.f71371a.mo68390d()).mo68415a("ShareSheetActivity has started in %s millis", System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.f81000M) {
            mo44490h();
            ahhd.m55766a(this, this.f80988A);
            ahhd.m55766a(this, this.f81025z);
            super.onStop();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("ShareSheetActivity has stopped");
            return;
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44484b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!this.f81000M) {
            this.f80989B.setText((CharSequence) null);
            m67561c(shareTarget, transferMetadata);
        }
    }

    /* renamed from: h */
    public final void mo44490h() {
        if (this.f80999L) {
            this.f70615c.mo38906b((ajud) this);
            m67565m();
            this.f80999L = false;
            aigz aigz = this.f80998K;
            aigz.f68888c = false;
            aigz.mo37477a();
            srn srn = ajvp.f71371a;
        }
    }

    /* renamed from: i */
    public final void mo44491i() {
        List list = this.f81003P.f71298d;
        if (!list.isEmpty()) {
            ShareTarget shareTarget = (ShareTarget) list.get(0);
            mo44489g(shareTarget).mo38952c();
            mo44483b(shareTarget);
        }
        if (!this.f81007T.f71298d.isEmpty()) {
            ShareTarget shareTarget2 = (ShareTarget) list.get(0);
            mo44489g(shareTarget2).mo38952c();
            mo44483b(shareTarget2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo44492j() {
        this.f70615c.mo38904b().mo50373a(new ajrp(this, akij.m59823a((Context) this), akic.m59785a(), akiw.m59862a((Context) this)));
    }

    /* renamed from: c */
    public final void mo44485c(ShareTarget shareTarget) {
        mo44484b(shareTarget, new ajub(1).mo38916a());
        ajty ajty = this.f70615c;
        Intent intent = getIntent();
        roz b = rpa.m34196b();
        b.f43472a = new ajsx(shareTarget, intent);
        b.f43473b = new Feature[]{ahca.f66970a};
        ajty.mo24732b(b.mo24977a());
        this.f81023w = 2;
        this.f81018r = false;
        srn srn = ajvp.f71371a;
    }

    /* renamed from: a */
    public static boolean m67560a(ShareTarget shareTarget, ShareTarget shareTarget2) {
        if (shareTarget.f81028a != shareTarget2.f81028a) {
            return sdg.m34949a(shareTarget.f81029b, shareTarget2.f81029b) && sdg.m34949a(shareTarget.f81030c, shareTarget2.f81030c) && sdg.m34949a(Integer.valueOf(shareTarget.f81031d), Integer.valueOf(shareTarget2.f81031d)) && sdg.m34949a(shareTarget.f81037j, shareTarget2.f81037j) && sdg.m34949a(Boolean.valueOf(shareTarget.f81038k), Boolean.valueOf(shareTarget2.f81038k));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo44477a(int i) {
        if (!this.f80999L && !this.f70618f) {
            if (cfov.m142069v()) {
                mo44491i();
            }
            this.f70615c.mo38902a(this, this.f81009i, i);
            aigz aigz = this.f80998K;
            aigz.f68888c = true;
            aigz.mo37477a();
            this.f80999L = true;
            srn srn = ajvp.f71371a;
        }
    }

    /* renamed from: a */
    public final void mo44478a(int i, String str, ShareTarget shareTarget) {
        if (cfov.m142055h()) {
            this.f80992E.setVisibility(4);
            this.f80993F.setVisibility(4);
            this.f80994G.setVisibility(4);
            this.f80995H.setVisibility(4);
            this.f80996I.setVisibility(4);
            this.f80997J.setVisibility(4);
            this.f81012l.setVisibility(4);
        } else {
            this.f80992E.setVisibility(8);
            this.f80993F.setVisibility(8);
            this.f80994G.setVisibility(8);
            this.f80995H.setVisibility(8);
            this.f80996I.setVisibility(8);
            this.f80997J.setVisibility(8);
            this.f81012l.setVisibility(8);
        }
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 12:
                this.f80995H.setVisibility(0);
                return;
            case 2:
                if (str != null) {
                    this.f80993F.setVisibility(0);
                    this.f80994G.setVisibility(0);
                    return;
                }
                this.f80995H.setVisibility(0);
                return;
            case 4:
            case 7:
            case 9:
            case 10:
                this.f80992E.setVisibility(0);
                if (shareTarget != null && shareTarget.f81038k && !shareTarget.f81041n && !this.f81018r) {
                    this.f80997J.setVisibility(0);
                    return;
                }
                return;
            case 6:
                this.f80996I.setVisibility(0);
                this.f70614b.postDelayed(new ajro(this), 2000);
                return;
            case 8:
            case 11:
            case 13:
            case 14:
                this.f80992E.setVisibility(0);
                return;
            default:
                if (this.f81023w != 4) {
                    this.f80992E.setVisibility(0);
                    return;
                } else if (!cfov.m142050c()) {
                    this.f81012l.setVisibility(0);
                    return;
                } else if (!akiw.m59863b(this)) {
                    this.f81012l.setVisibility(0);
                    return;
                } else {
                    return;
                }
        }
    }

    /* renamed from: a */
    public final void mo38686a(View view, ShareTarget shareTarget) {
        int b;
        if (mo44489g(shareTarget).mo38951b(shareTarget).f81052a == 0) {
            if (!(view == this.f81019s || (b = mo44489g(shareTarget).mo38930b((Object) shareTarget)) == -1)) {
                View findViewById = view.findViewById(C0126R.C0129id.profile_image);
                TextView textView = (TextView) view.findViewById(C0126R.C0129id.title);
                View findViewById2 = this.f81019s.findViewById(C0126R.C0129id.profile_image);
                View findViewById3 = this.f81019s.findViewById(C0126R.C0129id.progress_bar);
                TextView textView2 = (TextView) this.f81019s.findViewById(C0126R.C0129id.title);
                View findViewById4 = this.f81019s.findViewById(C0126R.C0129id.header);
                mo44489g(shareTarget).mo38928a(m67564j(shareTarget), b);
                m67564j(shareTarget).f201a.setOnClickListener(null);
                ajvl ajvl = new ajvl(this.f70617e);
                ajvl.f71360e = ajvl.f71356a.getLeft();
                ajvl.f71361f = ajvl.f71356a.getTop();
                ajvl.f71362g = ajvl.f71356a.getRight();
                ajvl.f71363h = ajvl.f71356a.getBottom();
                ajvl.f71364i = ajvl.f71356a.getMeasuredHeight();
                this.f70617e.setMinimumHeight((int) getResources().getDimension(C0126R.dimen.sharing_receiver_surface_content_min_height));
                akiu.m59854a(ajvl.f71356a);
                ajvl.f71365j = ajvl.f71356a.getMeasuredHeight();
                ajvl.f71359d = 300;
                ajvl.start();
                float width = ((float) findViewById.getWidth()) / ((float) findViewById2.getWidth());
                float textSize = textView.getTextSize();
                float textSize2 = textView2.getTextSize();
                akiu.m59855a(findViewById3, width);
                akiu.m59855a(findViewById2, width);
                akiu.m59855a(textView2, textSize / textSize2);
                akiu.m59857a(findViewById, findViewById2);
                findViewById3.setTranslationX(findViewById2.getTranslationX());
                findViewById3.setTranslationY(findViewById2.getTranslationY());
                akiu.m59857a(textView, textView2);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(4.0f);
                float translationX = findViewById2.getTranslationX();
                float translationX2 = textView2.getTranslationX();
                findViewById2.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setUpdateListener(new ajru(findViewById2, translationX, decelerateInterpolator, findViewById3)).setDuration(300);
                textView2.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setUpdateListener(new ajrv(textView2, translationX2, decelerateInterpolator)).setDuration(300);
                this.f81019s.setVisibility(0);
                view.findViewById(C0126R.C0129id.root).setVisibility(4);
                for (int i = 0; i < mo44488f(shareTarget).getChildCount(); i++) {
                    mo44488f(shareTarget).getChildAt(i).setEnabled(false);
                }
                this.f81013m.animate().alpha(0.0f).setDuration(300).withEndAction(new ajrw(this, shareTarget));
                findViewById4.setAlpha(0.0f);
                findViewById4.animate().alpha(1.0f).setDuration(300).withEndAction(new ajrx(this, shareTarget));
                m67565m();
            }
            mo44485c(shareTarget);
        }
    }

    /* renamed from: a */
    public final void mo44480a(ShareTarget shareTarget) {
        if (mo44489g(shareTarget).mo161a() == 0) {
            m67563i(shareTarget).animate().alpha(0.0f).setDuration(150).setInterpolator(new LinearInterpolator()).start();
            mo44488f(shareTarget).animate().alpha(1.0f).setDuration(150).setStartDelay(150).withStartAction(new ajrk(this, shareTarget)).start();
        }
        mo44489g(shareTarget).mo38929a((Object) shareTarget);
        if (f80987y.isEnabled()) {
            String str = shareTarget.f81029b;
            if (shareTarget.f81037j != null) {
                String valueOf = String.valueOf(str);
                String str2 = shareTarget.f81037j;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(", ");
                sb.append(str2);
                str = sb.toString();
            }
            mo44488f(shareTarget).announceForAccessibility(str);
        }
    }

    /* renamed from: a */
    public final void mo44481a(ShareTarget shareTarget, int i) {
        int b;
        if (this.f81023w == 1 && i == 2 && (b = mo44489g(shareTarget).mo38930b((Object) shareTarget)) != -1) {
            View childAt = mo44488f(shareTarget).getChildAt(b);
            if (childAt == null) {
                this.f70614b.post(new ajrs(this, shareTarget));
            } else {
                mo38686a(childAt, shareTarget);
            }
        }
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (cfov.m142065r() && transferMetadata.f81052a == 15) {
            finish();
        } else if ((shareTarget.equals(this.f81015o) && shareTarget.mo44499b().equals(this.f81015o.mo44499b())) || !transferMetadata.f81056e) {
            m67561c(shareTarget, transferMetadata);
        }
    }

    /* renamed from: a */
    public final void mo44482a(String str) {
        Toast.makeText(this, getString(C0126R.string.sharing_enable_failed, new Object[]{str}), 0).show();
    }
}
