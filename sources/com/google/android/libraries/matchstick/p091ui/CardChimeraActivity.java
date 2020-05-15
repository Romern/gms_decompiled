package com.google.android.libraries.matchstick.p091ui;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.libraries.matchstick.data.AvatarManager$AvatarUpdateEventReceiver;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.matchstick.ui.CardChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardChimeraActivity extends Activity implements LoaderManager.LoaderCallbacks, azlw, azlr, azmg, azlj, azln, azjw, azmy, azdo {

    /* renamed from: L */
    public static final /* synthetic */ int f111167L = 0;

    /* renamed from: M */
    private static final azck f111168M = new azck(20971520);

    /* renamed from: A */
    public final Map f111169A = new ConcurrentHashMap();

    /* renamed from: B */
    public final Map f111170B = new ConcurrentHashMap();

    /* renamed from: C */
    public NetworkChangeReceiver f111171C;

    /* renamed from: D */
    public boolean f111172D;

    /* renamed from: E */
    public aba f111173E;

    /* renamed from: F */
    public cbiu f111174F;

    /* renamed from: G */
    public ProgressDialog f111175G;

    /* renamed from: H */
    public View f111176H;

    /* renamed from: I */
    public boolean f111177I;

    /* renamed from: J */
    public azcj f111178J;

    /* renamed from: K */
    public aznb f111179K;

    /* renamed from: N */
    private final ServiceConnection f111180N = new azkl(this, "matchstick");

    /* renamed from: O */
    private volatile boolean f111181O = true;

    /* renamed from: P */
    private volatile boolean f111182P = false;

    /* renamed from: Q */
    private volatile boolean f111183Q = false;

    /* renamed from: R */
    private boolean f111184R = false;

    /* renamed from: S */
    private LocalEntityId f111185S;

    /* renamed from: T */
    private String f111186T;

    /* renamed from: U */
    private boolean f111187U;

    /* renamed from: V */
    private boolean f111188V;

    /* renamed from: W */
    private boolean f111189W;

    /* renamed from: X */
    private TextView f111190X;

    /* renamed from: Y */
    private TextView f111191Y;

    /* renamed from: Z */
    private ImageView f111192Z;

    /* renamed from: a */
    public final Handler f111193a = new adzt();

    /* renamed from: aa */
    private SwipableReplyView f111194aa;

    /* renamed from: ab */
    private View f111195ab;

    /* renamed from: ac */
    private Intent f111196ac;

    /* renamed from: ad */
    private azcb f111197ad;

    /* renamed from: ae */
    private boolean f111198ae = true;

    /* renamed from: af */
    private final Map f111199af = new ConcurrentHashMap();

    /* renamed from: ag */
    private boolean f111200ag;

    /* renamed from: ah */
    private boolean f111201ah;

    /* renamed from: ai */
    private long f111202ai;

    /* renamed from: aj */
    private AvatarManager$AvatarUpdateEventReceiver f111203aj;

    /* renamed from: ak */
    private qxo f111204ak;

    /* renamed from: al */
    private final azck f111205al = new azck(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);

    /* renamed from: am */
    private String f111206am;

    /* renamed from: an */
    private String f111207an;

    /* renamed from: ao */
    private boolean f111208ao = false;

    /* renamed from: ap */
    private Bitmap f111209ap;

    /* renamed from: aq */
    private boolean f111210aq = false;

    /* renamed from: ar */
    private String f111211ar;

    /* renamed from: as */
    private qxo f111212as;

    /* renamed from: at */
    private qxo f111213at;

    /* renamed from: au */
    private qxo f111214au;

    /* renamed from: av */
    private boolean f111215av;

    /* renamed from: aw */
    private BroadcastReceiver f111216aw;

    /* renamed from: ax */
    private boolean f111217ax;

    /* renamed from: b */
    public azfc f111218b;

    /* renamed from: c */
    public volatile aznz f111219c;

    /* renamed from: d */
    public azdl f111220d;

    /* renamed from: e */
    public boolean f111221e;

    /* renamed from: f */
    public boolean f111222f;

    /* renamed from: g */
    public ListView f111223g;

    /* renamed from: h */
    public TextView f111224h;

    /* renamed from: i */
    public TextView f111225i;

    /* renamed from: j */
    public ImageView f111226j;

    /* renamed from: k */
    public View f111227k;

    /* renamed from: l */
    public EditText f111228l;

    /* renamed from: m */
    public TextView f111229m;

    /* renamed from: n */
    public ImageButton f111230n;

    /* renamed from: o */
    public TextView f111231o;

    /* renamed from: p */
    View f111232p;

    /* renamed from: q */
    TextView f111233q;

    /* renamed from: r */
    Button f111234r;

    /* renamed from: s */
    Button f111235s;

    /* renamed from: t */
    TextView f111236t;

    /* renamed from: u */
    BackgroundImageView f111237u;

    /* renamed from: v */
    public azph f111238v;

    /* renamed from: w */
    public Context f111239w;

    /* renamed from: x */
    int f111240x;

    /* renamed from: y */
    public azcb f111241y;

    /* renamed from: z */
    public Map f111242z = new ConcurrentHashMap();

    /* renamed from: com.google.android.libraries.matchstick.ui.CardChimeraActivity$NetworkChangeReceiver */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class NetworkChangeReceiver extends aacn {
        protected NetworkChangeReceiver() {
            super("matchstick");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            CardChimeraActivity cardChimeraActivity = CardChimeraActivity.this;
            int i = CardChimeraActivity.f111167L;
            cardChimeraActivity.f111172D = azfn.m85585b(cardChimeraActivity.f111239w);
            if (!CardChimeraActivity.this.f111241y.mo54594g().booleanValue()) {
                CardChimeraActivity cardChimeraActivity2 = CardChimeraActivity.this;
                if (cardChimeraActivity2.f111172D) {
                    Editable text = cardChimeraActivity2.f111228l.getText();
                    CardChimeraActivity cardChimeraActivity3 = CardChimeraActivity.this;
                    cardChimeraActivity3.mo60408a(cardChimeraActivity3.f111172D);
                    CardChimeraActivity cardChimeraActivity4 = CardChimeraActivity.this;
                    ImageButton imageButton = cardChimeraActivity4.f111230n;
                    boolean z = false;
                    if (!TextUtils.isEmpty(text) && TextUtils.getTrimmedLength(text) > 0) {
                        z = true;
                    }
                    cardChimeraActivity4.mo60405a(imageButton, z);
                    CardChimeraActivity.this.unregisterReceiver(this);
                    CardChimeraActivity.this.f111171C = null;
                }
            }
        }
    }

    /* renamed from: D */
    private final long m94667D() {
        aznb aznb = this.f111179K;
        if (aznb != null) {
            return aznb.f99693b.f99764g.f99687c;
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: E */
    private final void m94668E() {
        if (m94667D() != -1) {
            Handler handler = this.f111193a;
            Context applicationContext = getApplicationContext();
            String str = this.f111219c.f99774a;
            long D = m94667D();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 3);
            new azdq(handler, applicationContext, this, 1, new azdp(DatabaseProvider.m94544h("messages"), contentValues, "conversation_id= ? AND status IN (?, ?) AND _id <= ? ", new String[]{str, Integer.toString(1), Integer.toString(2), Long.toString(D)})).start();
        }
    }

    /* renamed from: F */
    private final void m94669F() {
        if (m94667D() != -1) {
            Handler handler = this.f111193a;
            Context applicationContext = getApplicationContext();
            String str = this.f111219c.f99774a;
            long D = m94667D();
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_dismissed_message", Long.valueOf(D));
            new azdq(handler, applicationContext, this, 0, new azdp(DatabaseProvider.m94544h("conversations"), contentValues, "conversation_id= ? AND last_dismissed_message < ? ", new String[]{str, Long.toString(D)})).start();
        }
    }

    /* renamed from: G */
    private final void m94670G() {
        if (this.f111184R) {
            azfc azfc = this.f111218b;
            if (azfc != null) {
                try {
                    azfc.mo54859b(this.f111219c.f99774a);
                } catch (RemoteException e) {
                    azoj.m85931a("CardChimeraActivity", e, "Unable to unset conversation id with the service.", new Object[0]);
                }
            }
            skh.m35531a().mo25689a(this, this.f111180N);
            this.f111184R = false;
            this.f111218b = null;
        }
    }

    /* renamed from: H */
    private final void m94671H() {
        int i = Build.VERSION.SDK_INT;
        m94684b(false);
    }

    /* renamed from: I */
    private final void m94672I() {
        if (!this.f111219c.mo55104b()) {
            MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_USER").putExtra("conversation_id", this.f111219c.f99774a), this);
        }
    }

    /* renamed from: J */
    private final aznz m94673J() {
        String stringExtra = this.f111196ac.getStringExtra("message_activity_conv_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            return aznz.m85891a(stringExtra);
        }
        return null;
    }

    /* renamed from: K */
    private final boolean m94674K() {
        return this.f111196ac.getBooleanExtra("sender_in_contacts", false);
    }

    /* renamed from: L */
    private final String m94675L() {
        String stringExtra = this.f111196ac.getStringExtra("message_activity_sender_id");
        return TextUtils.isEmpty(stringExtra) ? "" : stringExtra;
    }

    /* renamed from: M */
    private final int m94676M() {
        return this.f111196ac.getIntExtra("message_activity_sender_type", 0);
    }

    /* renamed from: N */
    private final void m94677N() {
        Handler handler = this.f111193a;
        Context applicationContext = getApplicationContext();
        String t = mo60420t();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_time_notification_clicked", Long.valueOf(currentTimeMillis));
        new azdq(handler, applicationContext, this, 0, new azdp(DatabaseProvider.m94541e(t), contentValues, "sid = ? ", new String[]{t})).start();
    }

    /* renamed from: O */
    private final boolean m94678O() {
        return cfeu.m139270b() || m94679P();
    }

    /* renamed from: P */
    private final boolean m94679P() {
        azcb azcb;
        return !cfeu.m139270b() && cffj.f183931a.mo6606a().mo81117a() && (azcb = this.f111241y) != null && azcb.mo54593f() <= 0 && !this.f111189W;
    }

    /* renamed from: a */
    private final void m94680a(String str, Bitmap bitmap) {
        int i = Build.VERSION.SDK_INT;
        setTaskDescription(bitmap != null ? new ActivityManager.TaskDescription(str, bitmap) : new ActivityManager.TaskDescription(str));
    }

    /* renamed from: b */
    private final void m94684b(boolean z) {
        int i;
        int i2;
        if (!z) {
            i2 = getResources().getColor(C0126R.color.backdrop_bg_color);
            i = 0;
        } else {
            i = getResources().getColor(C0126R.color.backdrop_bg_color);
            i2 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i2, i);
        ofArgb.setDuration((long) getResources().getInteger(17694720));
        ofArgb.addUpdateListener(new azkh(this));
        ofArgb.start();
        if (!z) {
            ofArgb.addListener(new azki(this));
        }
    }

    /* renamed from: c */
    private final void m94685c(ResultReceiver resultReceiver) {
        azcb azcb = this.f111241y;
        if (azcb == null || azcb.mo54594g().booleanValue() || this.f111228l == null) {
            if (this.f111241y.mo54594g().booleanValue() && resultReceiver != null) {
                resultReceiver.send(0, null);
            }
        } else if (!((InputMethodManager) this.f111239w.getSystemService("input_method")).hideSoftInputFromWindow(this.f111228l.getWindowToken(), 0, resultReceiver) && resultReceiver != null) {
            resultReceiver.send(0, null);
        }
    }

    /* renamed from: d */
    private final void m94687d(ResultReceiver resultReceiver) {
        EditText editText;
        if (!this.f111241y.mo54594g().booleanValue() && (editText = this.f111228l) != null) {
            editText.requestFocus();
            if (!((InputMethodManager) this.f111239w.getSystemService("input_method")).showSoftInput(this.f111228l, 1, resultReceiver) && resultReceiver != null) {
                resultReceiver.send(0, null);
            }
        } else if (this.f111241y.mo54594g().booleanValue() && resultReceiver != null) {
            resultReceiver.send(0, null);
        }
    }

    /* renamed from: A */
    public final String mo60401A() {
        return this.f111185S.f111074a;
    }

    /* renamed from: B */
    public final void mo60402B() {
        this.f111182P = false;
        this.f111181O = false;
    }

    /* renamed from: C */
    public final void mo60403C() {
        azox.m85981a();
        if (this.f111240x == 0) {
            m94685c((ResultReceiver) null);
            this.f111225i.setVisibility(4);
            this.f111227k.setVisibility(4);
        }
        int i = this.f111240x + 1;
        this.f111240x = i;
        new Object[1][0] = Integer.valueOf(i);
    }

    /* renamed from: e */
    public final void mo60416e() {
        new azkg(this).start();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: f */
    public final void mo55033f() {
        mo60402B();
        if (m94674K()) {
            mo60410b(142);
        } else {
            mo60410b(404);
        }
        m94672I();
        Handler handler = this.f111193a;
        Context applicationContext = getApplicationContext();
        String str = this.f111219c.f99774a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("blocked", (Boolean) true);
        new azdq(handler, applicationContext, this, 2, new azdp(DatabaseProvider.m94544h("conversations"), contentValues, "conversation_id = ? ", new String[]{str})).start();
        m94669F();
        azpi.m86068a(this.f111239w, getString(C0126R.string.block_conversation));
        this.f111210aq = true;
        finish();
    }

    /* renamed from: g */
    public final void mo55034g() {
        new azlo().show(getSupportFragmentManager(), "mute_and_report_spam");
        mo60403C();
    }

    /* renamed from: h */
    public final void mo55023h() {
        mo60413c();
    }

    /* renamed from: i */
    public final void mo55024i() {
        m94686c(false);
        azpi.m86068a(this.f111239w, getString(C0126R.string.block_conversation));
    }

    /* renamed from: j */
    public final void mo55025j() {
        m94686c(true);
        azpi.m86068a(this.f111239w, getString(C0126R.string.block_report_spam));
    }

    /* renamed from: k */
    public final void mo55035k() {
        String u = mo55081u();
        azls azls = new azls();
        Bundle bundle = new Bundle();
        bundle.putString("appName", u);
        azls.setArguments(bundle);
        azls.show(getSupportFragmentManager(), "mute_app_confirmation");
        mo60403C();
    }

    /* renamed from: l */
    public final void mo55036l() {
        mo60413c();
    }

    /* renamed from: m */
    public final void mo55028m() {
        mo60402B();
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_APP").putExtra("server_app_id", mo60420t()).putExtra("sync_app_block_state_with_server", cfeo.m138866W()), this);
        if (m94674K()) {
            mo60410b((int) MfiClientException.TYPE_MFICLIENT_STARTED);
        } else {
            mo60410b(406);
        }
        m94669F();
        azpi.m86068a(this.f111239w, getString(C0126R.string.block_app));
        finish();
    }

    /* renamed from: n */
    public final void mo55029n() {
        mo60413c();
    }

    /* renamed from: o */
    public final String mo60417o() {
        String stringExtra = this.f111196ac.getStringExtra("message_activity_sender_name");
        return TextUtils.isEmpty(stringExtra) ? !this.f111208ao ? "" : this.f111207an : stringExtra;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.ListView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        boolean z;
        Context applicationContext = getApplicationContext();
        this.f111239w = applicationContext;
        azph a = azph.m85998a(applicationContext);
        this.f111238v = a;
        a.mo55125a(94);
        boolean z2 = true;
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (!cfeo.f183719a.mo6606a().mo81006bM()) {
            setRequestedOrientation(1);
        } else {
            int i = Build.VERSION.SDK_INT;
            setRequestedOrientation(1);
        }
        new azky().start();
        Intent intent = getIntent();
        this.f111196ac = intent;
        if (intent == null) {
            this.f111238v.mo55126a(1605, 52);
            azpi.m86068a(this, getString(C0126R.string.message_not_available_text));
            finish();
        } else if ("com.google.android.apps.libraries.matchstick.action.ACTIVITY_DISMISS_ACTION".equals(intent.getAction())) {
            String stringExtra = this.f111196ac.getStringExtra("extra_toast_message");
            if (!TextUtils.isEmpty(stringExtra)) {
                azpi.m86068a(this.f111239w, stringExtra);
            }
            this.f111238v.mo55125a(1606);
            finish();
        } else {
            overridePendingTransition(C0126R.anim.abc_fade_in, 0);
            setContentView((int) C0126R.C0128layout.ms_message_reply_view);
            String stringExtra2 = this.f111196ac.getStringExtra("message_activity_bot_id_extra");
            this.f111206am = stringExtra2;
            this.f111208ao = !TextUtils.isEmpty(stringExtra2);
            this.f111211ar = this.f111196ac.getStringExtra("branding_app_id");
            String stringExtra3 = this.f111196ac.getStringExtra("message_activity_bot_name_extra");
            this.f111207an = stringExtra3;
            if (TextUtils.isEmpty(stringExtra3)) {
                this.f111207an = this.f111206am;
            }
            this.f111215av = this.f111196ac.getBooleanExtra("invoke_with_anonymous_registration", false);
            if (!cfcy.m138709b()) {
                boolean z3 = this.f111215av && getIntent().getBooleanExtra("wait_for_anonymous_registration_finish", true);
                this.f111177I = z3;
                this.f111217ax = false;
                if (z3) {
                    this.f111217ax = true;
                    if (!cfeo.m138882m()) {
                        this.f111216aw = new aacn("matchstick") {
                            /* class com.google.android.libraries.matchstick.p091ui.CardChimeraActivity.C167914 */

                            /* renamed from: a */
                            public final void mo6253a(Context context, Intent intent) {
                                String stringExtra = intent.getStringExtra("KEY_NAME");
                                if (stringExtra.equals("anonymous_registration_is_registered") || stringExtra.equals("tachyon_registration_status")) {
                                    CardChimeraActivity cardChimeraActivity = CardChimeraActivity.this;
                                    int i = CardChimeraActivity.f111167L;
                                    if (cardChimeraActivity.f111177I) {
                                        cardChimeraActivity.mo60416e();
                                    }
                                }
                            }
                        };
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.common.internal.SHARED_PREFERENCES_CHANGED");
                        intentFilter.addCategory("com.google.android.gms.common.internal.SHARED_PREFERENCES:matchstick_prefs");
                        registerReceiver(this.f111216aw, intentFilter, "com.google.android.gms.common.internal.SHARED_PREFERENCES_PERMISSION", null);
                        mo60416e();
                    }
                    ProgressDialog progressDialog = new ProgressDialog(this, 3);
                    this.f111175G = progressDialog;
                    progressDialog.setMessage(getResources().getString(C0126R.string.common_connecting));
                    this.f111175G.show();
                    findViewById(C0126R.C0129id.swipe_to_dismiss).setVisibility(4);
                    findViewById(C0126R.C0129id.swipe_view_container).setVisibility(4);
                    this.f111238v.mo55125a(1607);
                    return;
                }
            }
            this.f111189W = false;
            this.f111176H = findViewById(C0126R.C0129id.reply_container);
            this.f111227k = findViewById(C0126R.C0129id.swipe_view_container);
            TextView textView = (TextView) findViewById(C0126R.C0129id.swipe_to_dismiss);
            this.f111225i = textView;
            textView.setVisibility(0);
            this.f111228l = (EditText) findViewById(C0126R.C0129id.compose_message_text);
            this.f111219c = m94673J();
            if (this.f111219c == null) {
                azpi.m86068a(this, getString(C0126R.string.message_not_available_text));
                finish();
                this.f111238v.mo55126a(1605, 53);
                return;
            }
            this.f111185S = this.f111219c.f99780g;
            Bundle extras = getIntent().getExtras();
            bxvd da = cbht.f177177g.mo74144da();
            int b = cbhs.m127867b(extras.getInt("com.google.android.apps.libraries.matchstick.action.canvasType", 1));
            if (b == 0) {
                b = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbht) da.f164949b).f177179a = cbhs.m127866a(b);
            boolean z4 = extras.getBoolean("com.google.android.apps.libraries.matchstick.action.hideReplyBox", false);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbht) da.f164949b).f177180b = z4;
            boolean z5 = extras.getBoolean("com.google.android.apps.libraries.matchstick.action.showHintBar", false);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbht) da.f164949b).f177181c = z5;
            bxvd da2 = cbhr.f177167i.mo74144da();
            String str3 = "";
            String string = extras.getString("com.google.android.apps.libraries.matchstick.action.themeColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string.getClass();
            ((cbhr) da2.f164949b).f177169a = string;
            String string2 = extras.getString("com.google.android.apps.libraries.matchstick.action.incomingMessageFontColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string2.getClass();
            ((cbhr) da2.f164949b).f177170b = string2;
            String string3 = extras.getString("com.google.android.apps.libraries.matchstick.action.outgoingMessageBackgroundColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string3.getClass();
            ((cbhr) da2.f164949b).f177171c = string3;
            String string4 = extras.getString("com.google.android.apps.libraries.matchstick.action.outgoingMessageFontColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string4.getClass();
            ((cbhr) da2.f164949b).f177172d = string4;
            String string5 = extras.getString("com.google.android.apps.libraries.matchstick.action.tombstoneMessageBackgroundColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string5.getClass();
            ((cbhr) da2.f164949b).f177174f = string5;
            String string6 = extras.getString("com.google.android.apps.libraries.matchstick.action.tombstoneMessageFontColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string6.getClass();
            ((cbhr) da2.f164949b).f177175g = string6;
            String string7 = extras.getString("com.google.android.apps.libraries.matchstick.action.smartSuggestionColor", str3);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            string7.getClass();
            ((cbhr) da2.f164949b).f177176h = string7;
            azcb azcb = new azcb(new azca(null, extras.getString("com.google.android.apps.libraries.matchstick.action.appPkg"), extras.getString("com.google.android.apps.libraries.matchstick.action.appName"), null, extras.getString("com.google.android.apps.libraries.matchstick.action.appUrl"), null, null, null, (cbht) da.mo74062i(), (cbhr) da2.mo74062i(), (cbhp) azol.m85935a((bxxk) cbhp.f177158b.mo74142c(7), extras.getByteArray("com.google.android.apps.libraries.matchstick.action.stringTagMapping"))));
            this.f111241y = azcb;
            this.f111242z = azcb.mo54596i();
            this.f111198ae = true;
            if (this.f111196ac.hasExtra("is_renotification")) {
                this.f111238v.mo55137a(59, this.f111219c);
            }
            if (this.f111208ao) {
                new Object[1][0] = this.f111206am;
                if (this.f111215av) {
                    mo60410b(652);
                    mo60409b();
                }
                bxvd da3 = cbgn.f177050e.mo74144da();
                bxvd da4 = cbgm.f177046c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((cbgm) da4.f164949b).f177048a = cbgl.m127832a(3);
                cbgm cbgm = (cbgm) da4.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cbgn cbgn = (cbgn) da3.f164949b;
                cbgm.getClass();
                cbgn.f177053b = cbgm;
                cbgn.f177052a = 5;
                Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.SAVE_INTRO_MSG_AND_PROMPT_ID_ACTION");
                intent2.putExtra("bot_id", this.f111206am);
                intent2.putExtra("conversation_id", this.f111219c.f99774a);
                intent2.putExtra("intro_message", this.f111196ac.getStringExtra("message_activity_bot_intro_message_extra"));
                intent2.putExtra("message_properties", this.f111196ac.getByteArrayExtra("message_properties"));
                intent2.putExtra("default_profile_data", ((cbgn) da3.mo74062i()).mo73642k());
                intent2.putExtra("fetch_app_data_for_apps_list", "FB,businessmessaging");
                intent2.putExtra("show_log_consent", this.f111196ac.getBooleanExtra("show_log_consent", false));
                intent2.putExtra("prompt_string_id", this.f111196ac.getLongExtra("prompt_string_id", -1));
                intent2.putExtra("initiated_as_anonymous_chat", this.f111215av);
                if (this.f111196ac.hasExtra("message_activity_conv_starters")) {
                    intent2.putExtra("intro_msg_suggestions", this.f111196ac.getByteArrayExtra("message_activity_conv_starters"));
                }
                MessagingService.m94556a(intent2, this.f111239w);
            }
            this.f111220d = mo60423z();
            this.f111187U = this.f111196ac.getBooleanExtra("message_activity_is_reply_again", false);
            boolean booleanExtra = this.f111196ac.getBooleanExtra("is_first_time_open_conversation", false);
            this.f111221e = booleanExtra;
            this.f111188V = booleanExtra;
            Intent intent3 = new Intent("com.google.android.apps.libraries.matchstick.action.GET_OR_SYNC_APP_METADATA");
            intent3.putExtra("server_app_id", mo60420t());
            MessagingService.m94556a(intent3, this);
            this.f111201ah = false;
            this.f111222f = true;
            azph azph = this.f111238v;
            int a2 = cbhs.m127866a(this.f111241y.mo54597j());
            StringBuilder sb = new StringBuilder(51);
            sb.append("Matchstick.MessageActivity.OnCreate.Time");
            sb.append(a2);
            qxo a3 = azph.mo55123a(sb.toString());
            azph azph2 = this.f111238v;
            int a4 = cbhs.m127866a(this.f111241y.mo54597j());
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Matchstick.MessageActivity.MessagesShown.Time");
            sb2.append(a4);
            this.f111204ak = azph2.mo55123a(sb2.toString());
            if (cfeo.m138891v()) {
                azpk.m86089a(this.f111239w).mo55187e("Matchstick.Latency.FromChatIntentToCreateCardActivity");
                azqf.m86130a(this.f111239w);
                long a5 = azqf.m86129a(this.f111196ac);
                if (a5 > 0) {
                    azpk.m86089a(this.f111239w).mo55178a("Matchstick.Latency.LuToCreateCardActivity", a5);
                }
            }
            if (this.f111187U || this.f111208ao) {
                this.f111182P = true;
            }
            if (!this.f111215av || !this.f111208ao) {
                new azks(this).start();
            }
            String stringExtra4 = this.f111196ac.getStringExtra("message_activity_display_user_id");
            this.f111186T = stringExtra4;
            if (!TextUtils.isEmpty(stringExtra4)) {
                String a6 = C1211nd.m19661a().mo15492a(this.f111186T, C1220nm.f26744a);
                this.f111186T = a6;
                this.f111186T = a6.replace(' ', 160);
            }
            View view = this.f111176H;
            if (view != null) {
                view.setOnClickListener(new azkt(this));
            }
            TextView textView2 = (TextView) findViewById(C0126R.C0129id.conv_title_view);
            this.f111224h = textView2;
            if (!this.f111208ao) {
                String stringExtra5 = this.f111196ac.getStringExtra("message_activity_conv_title_extra");
                if (TextUtils.isEmpty(stringExtra5)) {
                    azoj.m85933c("CardChimeraActivity", "Empty conversation title for conv id: %s", m94673J());
                    stringExtra5 = str3;
                }
                textView2.setText(stringExtra5);
            }
            this.f111191Y = (TextView) findViewById(C0126R.C0129id.conv_title_app_attribution_view);
            this.f111190X = (TextView) findViewById(C0126R.C0129id.conv_title_display_name);
            this.f111226j = (ImageView) findViewById(C0126R.C0129id.conv_primary_icon);
            this.f111192Z = (ImageView) findViewById(C0126R.C0129id.conv_secondary_icon);
            SwipableReplyView swipableReplyView = (SwipableReplyView) findViewById(C0126R.C0129id.reply_view_card);
            this.f111194aa = swipableReplyView;
            int j = this.f111241y.mo54597j();
            swipableReplyView.f111257h = j;
            if (j == 4) {
                swipableReplyView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            }
            this.f111223g = (ListView) findViewById(C0126R.C0129id.conv_content_view);
            if (this.f111241y.mo54597j() != 3) {
                this.f111223g.setVisibility(8);
            }
            this.f111231o = (TextView) findViewById(C0126R.C0129id.reply_view_install_button);
            this.f111236t = (TextView) findViewById(C0126R.C0129id.message_action_button);
            this.f111230n = (ImageButton) findViewById(C0126R.C0129id.reply_view_send_button);
            this.f111229m = (TextView) findViewById(C0126R.C0129id.hint_bar_view);
            BackgroundImageView backgroundImageView = (BackgroundImageView) findViewById(C0126R.C0129id.ms_reply_view_card_background);
            this.f111237u = backgroundImageView;
            backgroundImageView.f111166a = this.f111241y.mo54597j();
            Integer num = this.f111241y.f98952b;
            if (num != null) {
                this.f111230n.setColorFilter(num.intValue());
                this.f111231o.setTextColor(num.intValue());
            }
            if (!TextUtils.isEmpty(mo55081u())) {
                this.f111191Y.setText(mo55081u());
            }
            this.f111226j.setImageBitmap(azny.m85881a(this.f111239w));
            String o = mo60417o();
            String stringExtra6 = this.f111196ac.getStringExtra("message_activity_sender_id_display");
            if (!TextUtils.isEmpty(stringExtra6)) {
                str3 = stringExtra6;
            }
            boolean K = m94674K();
            if (!this.f111219c.mo55105c() || this.f111208ao) {
                str = !cfef.m138770b() ? getIntent().getStringExtra("group_name") : null;
            } else {
                str = K ? str3 : o;
            }
            if (!TextUtils.isEmpty(str)) {
                findViewById(C0126R.C0129id.conv_title_separator).setVisibility(0);
                this.f111190X.setVisibility(0);
                this.f111190X.setText(str);
            }
            if (this.f111208ao) {
                this.f111213at = this.f111238v.mo55123a("Matchstick.Latency.BusinessProfile.Time.Initiator");
            }
            getSupportLoaderManager().initLoader(4, null, this);
            this.f111212as = this.f111238v.mo55123a("Matchstick.Latency.AppDataLoader.Time.Initiator");
            getSupportLoaderManager().initLoader(1, null, this);
            getSupportLoaderManager().initLoader(3, null, this);
            if (this.f111211ar != null) {
                this.f111214au = this.f111238v.mo55123a("Matchstick.Latency.BrandingAppDataLoader.Time.Initiator");
                getSupportLoaderManager().initLoader(5, null, this);
            }
            if (this.f111219c.mo55104b()) {
                new Object[1][0] = 7;
                getSupportLoaderManager().initLoader(7, null, this);
            }
            this.f111195ab = LayoutInflater.from(this).inflate((int) C0126R.C0128layout.ms_suggestion_scroll, (ViewGroup) this.f111223g, false);
            if (this.f111223g.getFooterViewsCount() == 0) {
                this.f111223g.addFooterView(this.f111195ab);
            }
            if (this.f111208ao) {
                getSupportLoaderManager().initLoader(6, null, this);
            }
            azck azck = f111168M;
            String str4 = this.f111211ar;
            if (str4 == null) {
                str4 = mo60420t();
            }
            Bitmap a7 = azck.mo54631a(str4);
            this.f111209ap = a7;
            if (a7 != null) {
                this.f111237u.setImageBitmap(a7);
            } else {
                getSupportLoaderManager().initLoader(2, null, this);
            }
            this.f111172D = azfn.m85585b(this.f111239w);
            this.f111174F = null;
            if (this.f111196ac.hasExtra("message_activity_conv_starters")) {
                m94682a(this.f111196ac.getByteArrayExtra("message_activity_conv_starters"));
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(C0126R.C0129id.compose_text_container);
            if (!cfdk.m138732b() || !this.f111241y.mo54595h().booleanValue()) {
                this.f111229m.setVisibility(8);
            } else {
                this.f111229m.setVisibility(0);
            }
            if (!azoy.m85984a(this.f111196ac.getStringExtra("draft_message_type")) || !this.f111196ac.hasExtra("draft_message_content")) {
                str2 = null;
            } else {
                str2 = this.f111196ac.getStringExtra("draft_message_content");
            }
            if (TextUtils.isEmpty(str2) || TextUtils.getTrimmedLength(str2) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f111241y.mo54594g().booleanValue()) {
                linearLayout.setVisibility(8);
            } else {
                this.f111236t.setVisibility(8);
                this.f111228l.setMaxWidth(linearLayout.getWidth() - this.f111230n.getWidth());
                mo60408a(this.f111172D);
                if (!this.f111172D) {
                    this.f111171C = new NetworkChangeReceiver();
                    registerReceiver(this.f111171C, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
                if (str2 != null) {
                    this.f111228l.setMaxLines(4);
                    this.f111228l.setText(str2, TextView.BufferType.EDITABLE);
                    this.f111228l.setSelection(str2.length());
                    mo60410b(370);
                }
                this.f111228l.addTextChangedListener(new azku(this));
                this.f111230n.setOnClickListener(new azkv(this));
                ImageButton imageButton = this.f111230n;
                if (z || !this.f111172D) {
                    z2 = false;
                }
                mo60405a(imageButton, z2);
            }
            this.f111231o.setOnClickListener(new azkw(this));
            if (this.f111208ao && !this.f111196ac.getBooleanExtra("message_activity_is_business_compose_extra", false)) {
                this.f111231o.setVisibility(8);
            }
            mo60405a(this.f111231o, z);
            if (mo60418p()) {
                mo60404a(263);
            } else if (!this.f111241y.mo54594g().booleanValue()) {
                getWindow().setSoftInputMode(5);
            }
            if (this.f111219c.mo55104b() && this.f111219c.mo55108f()) {
                String L = m94675L();
                if (!TextUtils.isEmpty(L)) {
                    if (!TextUtils.isEmpty(o) && K) {
                        this.f111169A.put(L, o);
                    } else if (!TextUtils.isEmpty(str3) && !K) {
                        this.f111170B.put(L, str3);
                    }
                }
                if (this.f111196ac.hasExtra("message_activity_formatted_phone_numbers_map_extra")) {
                    try {
                        this.f111170B.putAll((bnhe) this.f111196ac.getSerializableExtra("message_activity_formatted_phone_numbers_map_extra"));
                    } catch (Exception e) {
                    }
                }
            }
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.delete_button_icon);
            imageView.setImageDrawable(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_done_vd_black_24, null));
            C1173lt.m19599a(imageView.getDrawable(), getResources().getColor(C0126R.color.quantum_googblue500));
            ImageView imageView2 = (ImageView) findViewById(C0126R.C0129id.restore_button_icon);
            imageView2.setImageDrawable(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_refresh_vd_black_24, null));
            C1173lt.m19599a(imageView2.getDrawable(), getResources().getColor(C0126R.color.quantum_grey600));
            ImageButton imageButton2 = (ImageButton) findViewById(C0126R.C0129id.reply_view_more_button);
            imageButton2.setImageDrawable(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_more_vert_vd_black_24, null));
            C1173lt.m19599a(imageButton2.getDrawable(), getResources().getColor(17170444));
            SwipableReplyView swipableReplyView2 = this.f111194aa;
            swipableReplyView2.f111256g = new azme(swipableReplyView2, (HorizontalScrollView) this.f111195ab.findViewById(C0126R.C0129id.suggestion_scroll_view), findViewById(C0126R.C0129id.delete_button), findViewById(C0126R.C0129id.restore_button), this);
            if (this.f111187U) {
                findViewById(C0126R.C0129id.conv_content_view_container).setMinimumHeight(0);
                this.f111194aa.setMinimumHeight(0);
            }
            aba aba = new aba(new C1416ut(this, (int) C0126R.style.MessageActivityPopupMenu), findViewById(C0126R.C0129id.menu_placeholder));
            this.f111173E = aba;
            aba.mo137a().inflate(C0126R.C0130menu.ms_message_activity_menu, this.f111173E.f93a);
            if (!mo60415d()) {
                this.f111173E.f93a.removeItem(C0126R.C0129id.ms_add_to_contacts);
            }
            this.f111173E.f95c = new azkz(this);
            imageButton2.setOnClickListener(new azkx(this));
            this.f111238v.mo55163a(a3);
            boolean b2 = this.f111219c.mo55104b();
            mo60410b(82);
            if (b2) {
                mo60410b(84);
            } else {
                mo60410b(85);
            }
            if (this.f111187U) {
                mo60410b(66);
            } else if (this.f111196ac.getBooleanExtra("message_activity_has_new_messages_extra", false)) {
                mo60410b(61);
            } else {
                mo60410b(62);
            }
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        new Object[1][0] = Integer.valueOf(i);
        switch (i) {
            case 1:
                return new CursorLoader(this, DatabaseProvider.m94541e(mo60420t()), azcc.f98959a, null, null, null);
            case 2:
                return new CursorLoader(this, DatabaseProvider.m94541e(mo60420t()), new String[]{"background_image"}, null, null, null);
            case 3:
                return new CursorLoader(this, DatabaseProvider.m94542f(mo60420t()), null, null, null, null);
            case 4:
                return new CursorLoader(this, DatabaseProvider.m94517a(this.f111219c), null, null, null, null);
            case 5:
                return new CursorLoader(this, DatabaseProvider.m94541e(this.f111211ar), azcc.f98959a, null, null, null);
            case 6:
                return new CursorLoader(this, DatabaseProvider.m94543g(this.f111219c.f99774a), null, null, null, null);
            case 7:
                return new CursorLoader(this, DatabaseProvider.m94532b(this.f111219c), null, null, null, null);
            case 8:
                return new CursorLoader(this, DatabaseProvider.m94534b(this.f111219c.f99774a), null, null, null, null);
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        NetworkChangeReceiver networkChangeReceiver = this.f111171C;
        if (networkChangeReceiver != null) {
            unregisterReceiver(networkChangeReceiver);
            this.f111171C = null;
        }
        ProgressDialog progressDialog = this.f111175G;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f111175G.dismiss();
        }
        BroadcastReceiver broadcastReceiver = this.f111216aw;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.f111216aw = null;
        }
        aznb aznb = this.f111179K;
        if (aznb != null) {
            azcj azcj = this.f111178J;
            if (azcj != null) {
                azcj.mo54630b(aznb);
                this.f111178J = null;
            }
            aznb aznb2 = this.f111179K;
            aznx aznx = aznb2.f99693b;
            if (aznx != null) {
                for (Integer num : aznx.f99766i.keySet()) {
                    aznk a = aznx.mo55101a(num.intValue());
                    if (a instanceof aznc) {
                        ((aznc) a).f99695b = null;
                    }
                }
                aznx.f99759b = null;
                aznb2.f99693b = null;
            }
            this.f111179K = null;
        }
        super.onDestroy();
    }

    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (!this.f111217ax) {
            if (cfeo.m138853J()) {
                int i = Build.VERSION.SDK_INT;
                if ((hasWindowFocus() || this.f111240x > 0) && !this.f111201ah && !getIntent().getBooleanExtra("skip_enter_animation", false)) {
                    int[] iArr = new int[2];
                    this.f111227k.getLocationOnScreen(iArr);
                    float height = (float) (iArr[1] + this.f111227k.getHeight());
                    this.f111227k.setY(-height);
                    this.f111176H.setBackgroundColor(0);
                    this.f111176H.setAlpha(1.0f);
                    this.f111227k.animate().translationYBy(height).setDuration((long) getResources().getInteger(17694720));
                    m94684b(true);
                }
            }
            this.f111201ah = true;
            mo60419s();
            return;
        }
        this.f111201ah = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0160  */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        byte[] blob;
        int length;
        char c;
        cbhy cbhy;
        bxtx bxtx;
        bxtx bxtx2;
        bxtx bxtx3;
        cbgm cbgm;
        boolean z;
        cbgn cbgn;
        cbhy cbhy2;
        bxtx bxtx4;
        qxo qxo;
        int length2;
        char c2;
        bxtx bxtx5;
        bxtx bxtx6;
        boolean z2;
        int i;
        Cursor cursor = (Cursor) obj;
        int i2 = 4;
        byte[] bArr = null;
        switch (loader.getId()) {
            case 1:
                if (cursor != null && cursor.moveToFirst()) {
                    qxo qxo2 = this.f111212as;
                    if (qxo2 != null) {
                        this.f111238v.mo55163a(qxo2);
                        this.f111212as = null;
                    }
                    mo60411b(azcb.m85239a(cursor));
                    return;
                }
                return;
            case 2:
                if (cursor != null && cursor.moveToFirst()) {
                    String t = mo60420t();
                    if ((TextUtils.isEmpty(this.f111211ar) || this.f111211ar.equals(mo60420t())) && (blob = cursor.getBlob(0)) != null && (length = blob.length) > 0) {
                        int b = azpi.m86075b((Activity) this);
                        int a = azpi.m86058a((Activity) this);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(blob, 0, length, options);
                        options.inSampleSize = azpi.m86057a(options, b, a);
                        Object[] objArr = {Integer.valueOf(b), Integer.valueOf(a), Integer.valueOf(options.inSampleSize)};
                        options.inJustDecodeBounds = false;
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blob, 0, length, options);
                        this.f111209ap = decodeByteArray;
                        if (decodeByteArray != null) {
                            f111168M.mo54632a(t, decodeByteArray);
                            this.f111237u.setImageBitmap(this.f111209ap);
                            return;
                        }
                        azoj.m85933c("CardChimeraActivity", "failed to decode background image of %s", t);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (cursor != null && cursor.moveToFirst()) {
                    while (true) {
                        this.f111199af.put(Long.valueOf(cursor.getLong(0)), cursor.getString(1));
                        if (!cursor.moveToNext()) {
                            aznb aznb = this.f111179K;
                            if (aznb != null) {
                                Map map = this.f111199af;
                                aznx aznx = aznb.f99693b;
                                aznx.f99762e = map;
                                ((aznu) aznx.mo55101a(3)).f99753j = map;
                                ((aznw) aznx.mo55101a(4)).f99756j = map;
                                aznb.notifyDataSetChanged();
                            }
                            mo60411b(this.f111241y);
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 4:
                if (cursor != null && cursor.moveToFirst()) {
                    if (this.f111208ao && (qxo = this.f111213at) != null) {
                        this.f111238v.mo55163a(qxo);
                        this.f111213at = null;
                    }
                    azdi a2 = azdi.m85395a(cursor);
                    TextView textView = (TextView) findViewById(C0126R.C0129id.conv_subtitle_general_description);
                    View findViewById = findViewById(C0126R.C0129id.conv_subtitle_app_and_sender);
                    if (cfeo.m138891v()) {
                        azpk.m86089a(this.f111239w).mo55187e("Matchstick.Latency.Overall.FromChatIntentToDisplayNativeProfile");
                        azqf.m86130a(this.f111239w);
                        long a3 = azqf.m86129a(this.f111196ac);
                        if (a3 > 0) {
                            azpk.m86089a(this.f111239w).mo55178a("Matchstick.Latency.Overall.LuToDisplayNative.Time", a3);
                        }
                    }
                    int i3 = a2.f99077c;
                    if (i3 == 3 || i3 == 4) {
                        cbgn cbgn2 = a2.f99083i;
                        if (cbgn2 != null) {
                            if (cbgn2.f177052a != 5) {
                                c = 0;
                            } else if (!((cbgm) cbgn2.f177053b).f177049b.isEmpty() || this.f111208ao) {
                                if (cbgn2.f177052a == 5) {
                                    cbgm = (cbgm) cbgn2.f177053b;
                                } else {
                                    cbgm = cbgm.f177046c;
                                }
                                textView.setText(Html.fromHtml(cbgm.f177049b));
                                c = 0;
                                textView.setVisibility(0);
                                findViewById.setVisibility(8);
                            } else {
                                c = 0;
                            }
                            new Object[1][c] = cbgn2;
                            if (!TextUtils.isEmpty(a2.f99080f)) {
                                this.f111224h.setText(a2.f99080f);
                            }
                            cbgn cbgn3 = a2.f99083i;
                            if (cbgn3 != null && (cbhy = cbgn3.f177055d) != null) {
                                if (cbhy.f177216a == 1) {
                                    bxtx = (bxtx) cbhy.f177217b;
                                } else {
                                    bxtx = bxtx.f164797b;
                                }
                                if (!azpi.m86080b(bxtx.mo73780k())) {
                                    cbhy cbhy3 = cbgn3.f177055d;
                                    if (cbhy3 == null) {
                                        cbhy3 = cbhy.f177214d;
                                    }
                                    if (cbhy3.f177216a == 1) {
                                        bxtx2 = (bxtx) cbhy3.f177217b;
                                    } else {
                                        bxtx2 = bxtx.f164797b;
                                    }
                                    byte[] k = bxtx2.mo73780k();
                                    cbhy cbhy4 = cbgn3.f177055d;
                                    if (cbhy4 == null) {
                                        cbhy4 = cbhy.f177214d;
                                    }
                                    if (cbhy4.f177216a == 1) {
                                        bxtx3 = (bxtx) cbhy4.f177217b;
                                    } else {
                                        bxtx3 = bxtx.f164797b;
                                    }
                                    Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(k, 0, bxtx3.mo73744a());
                                    if (decodeByteArray2 != null) {
                                        Bitmap a4 = azal.m85136a(this.f111239w, decodeByteArray2);
                                        if (a4 != null) {
                                            this.f111226j.setImageBitmap(a4);
                                            LocalEntityId localEntityId = new LocalEntityId(a2.f99076b, a2.f99077c, a2.f99078d);
                                            azcj azcj = this.f111178J;
                                            if (azcj != null) {
                                                azcj.mo54629a(localEntityId, a4, true, false);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    azoj.m85933c("CardChimeraActivity", "Can't decode profile avatar", new Object[0]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    findViewById.setVisibility(0);
                    textView.setVisibility(8);
                    if (!cfef.m138770b() || !this.f111219c.mo55109g()) {
                        if (a2.f99077c != 2 || TextUtils.isEmpty(a2.f99080f)) {
                            z = false;
                        } else {
                            this.f111190X.setText(a2.f99080f);
                            this.f111190X.setVisibility(0);
                            findViewById(C0126R.C0129id.conv_title_separator).setVisibility(0);
                            z = false;
                        }
                    } else if (!TextUtils.isEmpty(a2.f99080f)) {
                        this.f111224h.setText(a2.f99080f);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(a2 == null || (cbgn = a2.f99083i) == null || (cbhy2 = cbgn.f177055d) == null)) {
                        if (cbhy2.f177216a == 1) {
                            bxtx4 = (bxtx) cbhy2.f177217b;
                        } else {
                            bxtx4 = bxtx.f164797b;
                        }
                        bArr = bxtx4.mo73780k();
                    }
                    new azlb(this, bArr, this.f111219c, z).start();
                    return;
                }
                return;
            case 5:
                if (cursor != null && cursor.moveToFirst()) {
                    qxo qxo3 = this.f111214au;
                    if (qxo3 != null) {
                        this.f111238v.mo55163a(qxo3);
                        this.f111214au = null;
                    }
                    azcb a5 = azcb.m85239a(cursor);
                    if (!TextUtils.equals(a5.mo54588a(), this.f111211ar)) {
                        azoj.m85933c("CardChimeraActivity", "Invalid branding app data", new Object[0]);
                        return;
                    }
                    byte[] d = a5.mo54591d();
                    if (d != null && (length2 = d.length) > 0) {
                        Bitmap decodeByteArray3 = BitmapFactory.decodeByteArray(d, 0, length2);
                        if (decodeByteArray3 != null) {
                            new Object[1][0] = Integer.valueOf(decodeByteArray3.getHeight() * decodeByteArray3.getRowBytes());
                            this.f111205al.mo54632a(mo60420t(), decodeByteArray3);
                            this.f111192Z.setImageBitmap(decodeByteArray3);
                        } else {
                            azoj.m85933c("CardChimeraActivity", "failed to decode icon of %s", a5.mo54588a());
                        }
                        m94680a(mo60412c(28), decodeByteArray3);
                    }
                    if (!TextUtils.isEmpty(a5.mo54590c())) {
                        this.f111191Y.setText(a5.mo54590c());
                    }
                    this.f111197ad = a5;
                    mo60414c(a5);
                    mo60406a(a5);
                    return;
                }
                return;
            case 6:
                LinearLayout linearLayout = (LinearLayout) this.f111195ab.findViewById(C0126R.C0129id.suggestion_container);
                if (linearLayout.getChildCount() > 0) {
                    linearLayout.removeAllViews();
                }
                if (cursor != null && cursor.moveToFirst()) {
                    m94682a(cursor.getBlob(2));
                    return;
                }
                return;
            case 7:
                if (this.f111178J == null) {
                    this.f111178J = azcj.m85279a(getApplicationContext());
                }
                if (cursor != null) {
                    azcj azcj2 = this.f111178J;
                    azox.m85981a();
                    LruCache lruCache = azcj2.f98976a;
                    if (cursor.moveToFirst()) {
                        do {
                            LocalEntityId localEntityId2 = new LocalEntityId(cursor.getString(cursor.getColumnIndex("entity_id")), cursor.getInt(cursor.getColumnIndex("entity_type")), cursor.getString(cursor.getColumnIndex("app_id")));
                            cbgn cbgn4 = (cbgn) azol.m85935a((bxxk) cbgn.f177050e.mo74142c(7), cursor.getBlob(cursor.getColumnIndex("data")));
                            if (cbgn4 == null) {
                                c2 = 0;
                            } else {
                                cbhy cbhy5 = cbgn4.f177055d;
                                if (cbhy5 != null) {
                                    if (cbhy5.f177216a == 1) {
                                        bxtx5 = (bxtx) cbhy5.f177217b;
                                    } else {
                                        bxtx5 = bxtx.f164797b;
                                    }
                                    if (!bxtx5.mo73779j()) {
                                        cbhy cbhy6 = cbgn4.f177055d;
                                        if (cbhy6 == null) {
                                            cbhy6 = cbhy.f177214d;
                                        }
                                        if (cbhy6.f177216a == 1) {
                                            bxtx6 = (bxtx) cbhy6.f177217b;
                                        } else {
                                            bxtx6 = bxtx.f164797b;
                                        }
                                        byte[] k2 = bxtx6.mo73780k();
                                        Bitmap decodeByteArray4 = BitmapFactory.decodeByteArray(k2, 0, k2.length);
                                        if (decodeByteArray4 == null) {
                                            azoj.m85933c("AvatarManager", "Avatar image data is corrupted for sender %s.", cursor.getString(cursor.getColumnIndex("entity_id")));
                                        } else {
                                            azcj2.mo54629a(localEntityId2, decodeByteArray4, false, true);
                                        }
                                    } else {
                                        c2 = 0;
                                    }
                                } else {
                                    c2 = 0;
                                }
                            }
                            Object[] objArr2 = new Object[1];
                            objArr2[c2] = cursor.getString(cursor.getColumnIndex("entity_id"));
                            azoj.m85933c("AvatarManager", "Server profile data corrupted for sender %s.", objArr2);
                        } while (cursor.moveToNext());
                        azcj2.mo54627a();
                        return;
                    }
                    azoj.m85932b("AvatarManager", "Update cursor is empty.", new Object[0]);
                    return;
                }
                return;
            case 8:
                if (cursor != null) {
                    new Object[1][0] = Integer.valueOf(cursor.getCount());
                    int position = cursor.getPosition();
                    ArrayList arrayList = new ArrayList();
                    long j = -1;
                    String str = null;
                    boolean z3 = false;
                    while (cursor.moveToNext()) {
                        azdd a6 = azdd.m85387a(cursor);
                        arrayList.add(a6);
                        ArrayList arrayList2 = arrayList;
                        long j2 = a6.f99045a;
                        if (j2 >= j) {
                            z3 = azdd.m85390c(a6.f99056l);
                            if (!z3) {
                                cbim cbim = (cbim) azol.m85935a((bxxk) cbim.f177266c.mo74142c(7), cursor.getBlob(14));
                                if (cbim != null) {
                                    str = cbim.f177269b;
                                } else {
                                    str = null;
                                }
                                j = j2;
                            } else {
                                j = j2;
                            }
                        }
                        if (azdd.m85389b(a6.f99056l) && azoy.m85987c(a6.f99052h) && ((i = a6.f99048d) == 1 || i == 7 || i == i2)) {
                            this.f111238v.mo55138a((int) ErrorInfo.TYPE_SDU_MEMORY_FULL, this.f111219c, a6.f99046b, (Boolean) null);
                        }
                        arrayList = arrayList2;
                        i2 = 4;
                    }
                    ArrayList arrayList3 = arrayList;
                    if (z3 || this.f111208ao) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f111182P = z2;
                    cursor.moveToPosition(position);
                    Object[] objArr3 = {this.f111219c.f99774a, false};
                    azmz azmz = new azmz(SystemClock.uptimeMillis(), cursor, j, str, this.f111169A, this.f111170B);
                    azox.m85981a();
                    new Object[1][0] = this.f111219c;
                    long j3 = azmz.f99685a;
                    if (j3 <= this.f111202ai) {
                        Cursor cursor2 = azmz.f99686b;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                    } else if (this.f111241y.mo54597j() != 3) {
                        Cursor cursor3 = azmz.f99686b;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        if (this.f111219c.mo55104b()) {
                            new azkk(new azjy(this, arrayList3)).start();
                        }
                        if (!this.f111208ao) {
                            getSupportLoaderManager().restartLoader(6, null, this);
                            return;
                        }
                        return;
                    } else {
                        aznb aznb2 = this.f111179K;
                        if (aznb2 != null) {
                            azox.m85981a();
                            aznx aznx2 = aznb2.f99693b;
                            aznx2.f99764g = azmz;
                            for (Integer num : aznx2.f99766i.keySet()) {
                                aznk a7 = aznx2.mo55101a(num.intValue());
                                if (a7 instanceof aznc) {
                                    ((aznc) a7).f99701h = azmz;
                                }
                            }
                            aznb2.swapCursor(azmz.f99686b);
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        mo60419s();
                        this.f111202ai = j3;
                        m94668E();
                    }
                    this.f111238v.mo55163a(this.f111204ak);
                    this.f111204ak = null;
                    this.f111188V = false;
                    if (this.f111219c.mo55104b()) {
                    }
                    if (!this.f111208ao) {
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        azoj.m85932b("CardChimeraActivity", "onNewIntent: %s", intent);
        super.onNewIntent(intent);
        if ("com.google.android.apps.libraries.matchstick.action.ACTIVITY_DISMISS_ACTION".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("extra_toast_message");
            if (!TextUtils.isEmpty(stringExtra)) {
                azpi.m86068a(this.f111239w, stringExtra);
            }
            finish();
            return;
        }
        setIntent(intent);
        recreate();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        aznb aznb = this.f111179K;
        if (aznb != null && aznb.f99692a) {
            mo60410b(89);
        }
        AvatarManager$AvatarUpdateEventReceiver avatarManager$AvatarUpdateEventReceiver = this.f111203aj;
        if (avatarManager$AvatarUpdateEventReceiver != null) {
            unregisterReceiver(avatarManager$AvatarUpdateEventReceiver);
            this.f111203aj = null;
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        Object obj;
        super.onResume();
        Object[] objArr = new Object[1];
        if (this.f111219c != null) {
            obj = this.f111219c;
        } else {
            obj = "";
        }
        objArr[0] = obj;
        this.f111203aj = new AvatarManager$AvatarUpdateEventReceiver();
        registerReceiver(this.f111203aj, new IntentFilter("com.google.android.apps.libraries.matchstick.action.avatar_update_notified"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.ListView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    public final void onStart() {
        View view;
        super.onStart();
        if (!this.f111217ax) {
            Object[] objArr = {this.f111219c, this};
            new azkb(this).start();
            new azkc(this).start();
            SilentRegisterIntentOperation.m94594b(new Intent("com.google.android.gms.matchstick.check_registration_action"), this.f111239w);
            aznz aznz = this.f111219c;
            azcb azcb = this.f111197ad;
            if (azcb == null || !this.f111208ao) {
                azcb = this.f111241y;
            }
            this.f111179K = aznb.m85854a(this, aznz, azcb, this.f111199af, mo60401A());
            azcj a = azcj.m85279a(getApplicationContext());
            this.f111178J = a;
            a.mo54628a(this.f111179K);
            if (mo60415d()) {
                if (this.f111241y.mo54597j() == 3 && this.f111223g.getHeaderViewsCount() == 0) {
                    view = LayoutInflater.from(this).inflate((int) C0126R.C0128layout.ms_add_ignore_layout, (ViewGroup) this.f111223g, false);
                    this.f111223g.addHeaderView(view);
                } else {
                    view = null;
                }
                if (view != null) {
                    Button button = (Button) view.findViewById(C0126R.C0129id.ms_header_ignore_btn);
                    this.f111235s = button;
                    button.setOnClickListener(new azkd(this));
                    Button button2 = (Button) view.findViewById(C0126R.C0129id.ms_header_add_contact_btn);
                    this.f111234r = button2;
                    button2.setOnClickListener(new azke(this));
                    this.f111233q = (TextView) view.findViewById(C0126R.C0129id.ms_not_in_contacts_title);
                    this.f111232p = view.findViewById(C0126R.C0129id.ms_not_in_contacts_button_container);
                    Integer num = this.f111241y.f98957g;
                    if (num != null) {
                        this.f111233q.setTextColor(num.intValue());
                    }
                    Integer num2 = this.f111241y.f98956f;
                    if (num2 != null) {
                        this.f111233q.setBackgroundColor(num2.intValue());
                        this.f111232p.setBackgroundColor(num2.intValue());
                    }
                    Integer num3 = this.f111241y.f98952b;
                    if (num3 != null) {
                        this.f111235s.setTextColor(num3.intValue());
                        this.f111234r.setTextColor(num3.intValue());
                    }
                }
            }
            if (this.f111241y.mo54597j() == 3) {
                this.f111223g.setAdapter((ListAdapter) this.f111179K);
            }
            getSupportLoaderManager().initLoader(8, null, this);
            int a2 = azpi.m86058a((Activity) this);
            Object[] objArr2 = {Integer.valueOf(azpi.m86075b((Activity) this)), Integer.valueOf(a2 - (((Integer) azpi.m86061a(findViewById(C0126R.C0129id.reply_view_header)).second).intValue() + ((Integer) azpi.m86061a(findViewById(C0126R.C0129id.reply_view_footer)).second).intValue()))};
            m94668E();
            this.f111184R = skh.m35531a().mo25690a(this, new Intent().setClassName(this, "com.google.android.gms.matchstick.net.MessagingService"), this.f111180N, 1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.f111217ax) {
            if (!this.f111210aq && !TextUtils.isEmpty(this.f111228l.getText())) {
                m94681a(this.f111228l.getText().toString(), false, false);
            }
            Object[] objArr = {this.f111219c, this};
            if (this.f111241y.mo54597j() == 3) {
                this.f111223g.setAdapter((ListAdapter) null);
            }
            if ((this.f111181O || this.f111182P) && !mo55080r()) {
                Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.RETRIGGER_NOTIFICATION");
                intent.putExtra("conversation_id", this.f111219c.f99774a);
                intent.putExtra("should_show_reply_again", this.f111182P);
                intent.putExtra("need_buzz_for_reply_again", this.f111183Q);
                MessagingService.m94557b(intent, this.f111239w);
            }
            m94670G();
            super.onStop();
            return;
        }
        super.onStop();
    }

    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(this.f111201ah)};
        super.onWindowFocusChanged(z);
        if (!this.f111217ax && cfeo.m138853J()) {
            int i = Build.VERSION.SDK_INT;
            if (z && !this.f111201ah && !getIntent().getBooleanExtra("skip_enter_animation", false)) {
                this.f111176H.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo60418p() {
        return "message_activity_invoke_mute_action".equals(this.f111196ac.getAction());
    }

    /* renamed from: q */
    public final void mo55049q() {
        this.f111210aq = true;
        mo60402B();
        m94669F();
        Handler handler = this.f111193a;
        Context applicationContext = getApplicationContext();
        String str = this.f111219c.f99774a;
        long D = m94667D();
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_dismissed_in_notification", Long.valueOf(D));
        new azdq(handler, applicationContext, this, 0, new azdp(DatabaseProvider.m94544h("conversations"), contentValues, "conversation_id= ? ", new String[]{str})).start();
        m94671H();
    }

    /* renamed from: r */
    public final boolean mo55080r() {
        return this.f111219c.mo55104b() && !this.f111222f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo60419s() {
        if ((mo60415d() || this.f111219c.mo55109g()) && this.f111188V) {
            this.f111223g.post(new azkq(this));
        } else {
            this.f111223g.post(new azkr(this));
        }
    }

    /* renamed from: t */
    public final String mo60420t() {
        if (this.f111219c != null) {
            return this.f111219c.f99775b;
        }
        return null;
    }

    /* renamed from: u */
    public final String mo55081u() {
        return this.f111241y.mo54590c();
    }

    /* renamed from: v */
    public final void mo55019v() {
        m94677N();
        mo60410b(74);
        mo60421x();
    }

    /* renamed from: w */
    public final void mo55020w() {
        m94677N();
        mo60410b(76);
    }

    /* renamed from: x */
    public final void mo60421x() {
        azok.m85934a(this);
        finish();
    }

    /* renamed from: y */
    public final void mo60422y() {
        LocalEntityId localEntityId = new LocalEntityId(m94675L(), m94676M(), mo55081u());
        int i = localEntityId.f111075b;
        String str = localEntityId.f111074a;
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        if (!TextUtils.isEmpty(str)) {
            if (i == 7) {
                intent.putExtra("email", str);
            } else if (i == 1) {
                intent.putExtra("phone", str);
            }
        }
        intent.addFlags(268435456);
        startActivity(intent);
    }

    /* renamed from: z */
    public final azdl mo60423z() {
        if (this.f111220d == null) {
            this.f111220d = azdl.m85412a(this.f111239w);
        }
        return this.f111220d;
    }

    /* renamed from: a */
    private final void m94681a(String str, boolean z, boolean z2) {
        if (this.f111219c != null) {
            MessagingService.m94556a(new Intent("com.google.android.apps.libraries.matchstick.action.save_message_draft").putExtra("text_to_send", str).putExtra("conversation_id", this.f111219c.f99774a).putExtra("save_draft_after_send", z).putExtra("show_toast_after_sent", z2), this);
            if (z) {
                m94669F();
                return;
            }
            return;
        }
        azoj.m85933c("CardChimeraActivity", "Failed to get dest id", new Object[0]);
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
    private final void m94686c(boolean z) {
        mo60402B();
        boolean K = m94674K();
        if (this.f111219c.mo55105c()) {
            if (!K) {
                mo60410b(403);
            } else {
                mo60410b((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
            }
            m94672I();
        } else if (this.f111219c.mo55104b()) {
            mo60410b(410);
        }
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.TRIGGER_SPAM_SIGNAL").putExtra("conversation_id", this.f111219c.f99774a).putExtra("spam_signal", 2).putExtra("share_last_messages", z).putExtra("block_conversation", true).putExtra("is_sender_in_contacts", K), this);
        this.f111210aq = true;
        finish();
    }

    /* renamed from: b */
    public final void mo60409b() {
        m94687d(null);
    }

    /* renamed from: d */
    public final boolean mo60415d() {
        boolean z;
        int M = m94676M();
        if (!(M == 7 || M == 1) || TextUtils.isEmpty(m94675L())) {
            z = false;
        } else {
            z = true;
        }
        return this.f111219c.mo55105c() && z && !m94674K();
    }

    /* renamed from: b */
    public final void mo60410b(int i) {
        if (this.f111219c == null) {
            this.f111238v.mo55147a(i, mo60420t());
        } else if (this.f111196ac.hasExtra("sender_in_contacts")) {
            this.f111238v.mo55138a(i, this.f111219c, (String) null, Boolean.valueOf(m94674K()));
        } else {
            this.f111238v.mo55137a(i, this.f111219c);
        }
    }

    /* renamed from: a */
    private final void m94682a(byte[] bArr) {
        int i;
        cbiw cbiw;
        cbiw cbiw2;
        this.f111174F = (cbiu) azol.m85935a((bxxk) cbiu.f177299c.mo74142c(7), bArr);
        int min = Math.min((int) cfeo.f183719a.mo6606a().mo81022bc(), this.f111174F.f177302b.size());
        LinearLayout linearLayout = (LinearLayout) this.f111195ab.findViewById(C0126R.C0129id.suggestion_container);
        azcb azcb = this.f111197ad;
        Integer num = azcb != null ? azcb.f98958h : null;
        boolean equals = TextUtils.equals(this.f111174F.f177301a, "conversation_starter_message_id");
        for (int i2 = 0; i2 < min; i2++) {
            azmf azmf = new azmf(this.f111239w);
            if (num != null) {
                ((GradientDrawable) azmf.f99639b.getBackground()).setStroke((int) azmf.getResources().getDimension(C0126R.dimen.suggestion_bubble_outline_width), num.intValue());
                azmf.f99640c.setTextColor(num.intValue());
            }
            cbit cbit = (cbit) this.f111174F.f177302b.get(i2);
            azmf.setVisibility(8);
            azmf.f99638a = cbit;
            if (cbis.m127896a(cbit.f177295a) == 4) {
                cbit cbit2 = azmf.f99638a;
                if (cbit2.f177295a == 3) {
                    cbiw = (cbiw) cbit2.f177296b;
                } else {
                    cbiw = cbiw.f177306c;
                }
                String str = cbiw.f177308a;
                cbit cbit3 = azmf.f99638a;
                if (cbit3.f177295a == 3) {
                    cbiw2 = (cbiw) cbit3.f177296b;
                } else {
                    cbiw2 = cbiw.f177306c;
                }
                String str2 = cbiw2.f177309b;
                if (TextUtils.isEmpty(str)) {
                    azmf.mo55046a(str2);
                } else {
                    azmf.mo55046a(str);
                }
                if (azmf.f99639b.getParent() != null) {
                    ((ViewGroup) azmf.f99639b.getParent()).removeView(azmf.f99639b);
                }
                azmf.addView(azmf.f99639b);
                azmf.setVisibility(0);
            }
            azmf.setOnClickListener(new azjz(this, azmf, equals));
            linearLayout.addView(azmf);
        }
        if (linearLayout.getChildCount() > 0) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f111195ab.findViewById(C0126R.C0129id.suggestion_scroll_view);
            horizontalScrollView.setVisibility(0);
            horizontalScrollView.scrollTo(!azpi.m86084c(this.f111239w) ? horizontalScrollView.getLeft() : horizontalScrollView.getRight(), horizontalScrollView.getTop());
            this.f111195ab.setVisibility(0);
            azph azph = this.f111238v;
            if (!equals) {
                i = 361;
            } else {
                i = 368;
            }
            azph.mo55131a(i, 2, this.f111174F.f177301a, this.f111219c);
        }
    }

    /* renamed from: b */
    public final void mo55079b(int i, boolean z) {
        Intent intent;
        aznb aznb;
        mo60410b(bopu.m111432b(i));
        if (z) {
            intent = this.f111239w.getPackageManager().getLaunchIntentForPackage(this.f111241y.mo54589b());
            intent.putExtra("com.google.android.gms.matchstick.conversation_id", this.f111219c.f99774a);
        } else {
            azcb azcb = this.f111241y;
            String str = azcb.f98951a.f98944e;
            if (azcb.mo54597j() == 3 && (aznb = this.f111179K) != null && !TextUtils.isEmpty(aznb.mo55082b())) {
                str = this.f111179K.mo55082b();
            }
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456);
        }
        Handler handler = this.f111193a;
        Context applicationContext = getApplicationContext();
        String t = mo60420t();
        String str2 = this.f111219c.f99774a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_conversation_install_clicked", str2);
        new azdq(handler, applicationContext, this, 0, new azdp(DatabaseProvider.m94541e(t), contentValues, "sid = ? ", new String[]{t})).start();
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    /* renamed from: c */
    public final String mo60412c(int i) {
        Map map = this.f111242z;
        if (map != null) {
            Long l = (Long) map.get(Integer.valueOf(cbic.m127877a(i)));
            if (l != null) {
                return (String) this.f111199af.get(l);
            }
            return null;
        }
        azoj.m85933c("CardChimeraActivity", "getAppStringByTag called on null appStringTags", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public final void mo60413c() {
        int i = this.f111240x - 1;
        this.f111240x = i;
        if (i == 0 && !isFinishing()) {
            this.f111225i.setVisibility(0);
            this.f111227k.setVisibility(0);
            mo60409b();
        }
        Object[] objArr = {Integer.valueOf(this.f111240x), Boolean.valueOf(isFinishing())};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo60414c(azcb azcb) {
        boolean z;
        TextView textView;
        azox.m85981a();
        boolean b = azpi.m86078b(this.f111239w, azcb.mo54589b());
        boolean z2 = true;
        if (!b || this.f111208ao) {
            z = false;
        } else {
            z = true;
        }
        if (b || this.f111208ao) {
            z2 = false;
        }
        if (z) {
            if (!TextUtils.isEmpty(mo60412c(25))) {
                this.f111231o.setText(mo60412c(25));
            } else {
                this.f111231o.setText((int) C0126R.string.common_open);
            }
            this.f111231o.setOnClickListener(new azko(this));
        } else if (z2) {
            if (!TextUtils.isEmpty(mo60412c(24))) {
                this.f111231o.setText(mo60412c(24));
            } else {
                this.f111231o.setText((int) C0126R.string.common_install);
            }
            this.f111231o.setOnClickListener(new azkp(this));
            if (azcb.mo54594g().booleanValue() && !TextUtils.isEmpty(mo60412c(26)) && (textView = (TextView) findViewById(C0126R.C0129id.install_promo_text)) != null) {
                textView.setVisibility(0);
                textView.setText(mo60412c(26));
            }
        }
        if (!z2 && !z) {
            this.f111231o.setVisibility(8);
        } else {
            this.f111231o.setVisibility(0);
        }
        if (!cfdk.m138732b() || !azcb.mo54595h().booleanValue()) {
            this.f111229m.setVisibility(8);
        } else {
            this.f111229m.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo55048b(ResultReceiver resultReceiver) {
        this.f111176H.setClickable(true);
        if (!mo55080r()) {
            m94687d(resultReceiver);
        } else {
            m94685c(resultReceiver);
        }
        this.f111200ag = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo60411b(azcb azcb) {
        int i;
        long j;
        int length;
        if (azcb != null && TextUtils.equals(azcb.mo54588a(), mo60420t())) {
            if (this.f111208ao && azcb.mo54592e() && cfeo.f183719a.mo6606a().mo80941aA()) {
                azpi.m86068a(this, getString(C0126R.string.ms_bm_blocked_message));
                mo60421x();
            }
            if (!this.f111208ao || TextUtils.isEmpty(this.f111211ar) || this.f111211ar.equals(azcb.mo54588a())) {
                byte[] d = azcb.mo54591d();
                if (d != null && (length = d.length) > 0) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(d, 0, length);
                    if (decodeByteArray != null) {
                        new Object[1][0] = Integer.valueOf(decodeByteArray.getHeight() * decodeByteArray.getRowBytes());
                        this.f111205al.mo54632a(mo60420t(), decodeByteArray);
                        this.f111192Z.setImageBitmap(decodeByteArray);
                    } else {
                        azoj.m85933c("CardChimeraActivity", "failed to decode icon of %s", azcb.mo54588a());
                    }
                    String c = mo60412c(28);
                    if (c != null) {
                        m94680a(azov.m85980a(c, bnhe.m109408a("productName", azcb.mo54590c())), decodeByteArray);
                    }
                }
                if (!TextUtils.isEmpty(azcb.mo54590c())) {
                    this.f111191Y.setText(azcb.mo54590c());
                }
                boolean b = azpi.m86078b(this.f111239w, azcb.mo54589b());
                if (!this.f111208ao && this.f111198ae) {
                    Long l = azcb.f98951a.f98946g;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = -1;
                    }
                    if (j <= 0) {
                        this.f111193a.post(new azkn(this));
                        if (b) {
                            mo60410b(75);
                        }
                    }
                }
                if (this.f111198ae) {
                    if (!b) {
                        i = 93;
                    } else {
                        i = 92;
                    }
                    mo60410b(i);
                }
                mo60414c(azcb);
                this.f111241y = azcb;
                this.f111242z = azcb.mo54596i();
                this.f111198ae = false;
                mo60406a(azcb);
                return;
            }
            this.f111241y = azcb;
            this.f111242z = azcb.mo54596i();
            this.f111198ae = false;
            aznb aznb = this.f111179K;
            if (aznb != null) {
                aznb.notifyDataSetChanged();
                return;
            }
            return;
        }
        azoj.m85933c("CardChimeraActivity", "Invalid app data", new Object[0]);
    }

    /* renamed from: a */
    private final boolean m94683a(boolean z, String str) {
        Handler handler = this.f111193a;
        Context applicationContext = getApplicationContext();
        String t = mo60420t();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_time_reply_sent", Long.valueOf(currentTimeMillis));
        new azdq(handler, applicationContext, this, 0, new azdp(DatabaseProvider.m94541e(t), contentValues, "sid = ? ", new String[]{t})).start();
        if (!TextUtils.isEmpty(str)) {
            mo60403C();
            String u = mo55081u();
            String o = mo60417o();
            String L = m94675L();
            azlg azlg = new azlg();
            Bundle bundle = new Bundle();
            bundle.putString("app_name", u);
            bundle.putString("sender_name", o);
            bundle.putString("sender_number", L);
            bundle.putString("offboarding_message", str);
            bundle.putBoolean("from_sticky_ui_instance", z);
            azlg.setArguments(bundle);
            azlg.show(getSupportFragmentManager(), "first_time_sent");
            this.f111189W = true;
            mo60410b(73);
            return true;
        }
        azoj.m85932b("CardChimeraActivity", "No Offboarding Message found in app data.", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final void mo54977a() {
        mo60413c();
    }

    /* renamed from: a */
    public final void mo60404a(int i) {
        String str = this.f111219c.f99774a;
        String u = mo55081u();
        boolean z = this.f111208ao;
        int a = bopu.m111431a(i);
        azlx azlx = new azlx();
        Bundle bundle = new Bundle();
        bundle.putString("ConversationId", str);
        bundle.putBoolean("isBusinessChat", z);
        bundle.putString("appName", u);
        bundle.putInt("userEvent", a);
        azlx.setArguments(bundle);
        azlx.show(getSupportFragmentManager(), "mute_options");
        mo60403C();
    }

    /* renamed from: a */
    public final void mo54806a(int i, boolean z) {
        int i2;
        if (z) {
            new Object[1][0] = Integer.valueOf(i);
            if (i == 1) {
                Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.SEND_READ_RECEIPT_MESSAGE");
                intent.putExtra("conversation_id", this.f111219c.f99774a);
                intent.putExtra("user_id", mo60401A());
                intent.putExtra("user_type", this.f111185S.f111075b);
                intent.putExtra("user_app_id", this.f111185S.f111076c);
                MessagingService.m94556a(intent, this);
            } else if (i == 2) {
                if (!m94674K()) {
                    i2 = 405;
                } else {
                    i2 = 83;
                }
                mo60410b(i2);
            }
        } else {
            azoj.m85933c("CardChimeraActivity", "Update Database failed:%d", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo55047a(ResultReceiver resultReceiver) {
        this.f111176H.setClickable(false);
        m94685c(resultReceiver);
        this.f111200ag = true;
    }

    /* renamed from: a */
    public final void mo60405a(View view, boolean z) {
        if (z != view.isEnabled()) {
            view.setEnabled(z);
            view.setAlpha(!z ? 0.5f : 1.0f);
        }
    }

    /* renamed from: a */
    public final void mo55018a(ImageView imageView) {
        Bitmap a = this.f111205al.mo54631a(mo60420t());
        if (a != null) {
            imageView.setImageBitmap(a);
        } else {
            imageView.setImageResource(C0126R.C0127drawable.ms_default_app_icon);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60406a(azcb azcb) {
        TextView textView;
        azox.m85981a();
        aznb aznb = this.f111179K;
        if (aznb != null) {
            aznx aznx = aznb.f99693b;
            aznx.f99760c = azcb;
            aznx.f99763f = azcb.mo54596i();
            for (Integer num : aznx.f99766i.keySet()) {
                aznk a = aznx.mo55101a(num.intValue());
                if (a instanceof aznc) {
                    ((aznc) a).f99696c = azcb;
                }
            }
            if (cfeo.f183719a.mo6606a().mo80995bB()) {
                Integer num2 = azcb.f98954d;
                if (num2 == null) {
                    num2 = Integer.valueOf(C1133kh.m17843b(aznx.f99758a, C0126R.color.ms_read_receipt));
                }
                aznx.f99767j = new aznf(aznx.f99761d, num2.intValue());
            }
            ((aznu) aznx.mo55101a(3)).f99754k = aznx.f99763f;
            aznb.notifyDataSetChanged();
        }
        Integer num3 = azcb.f98952b;
        if (num3 != null) {
            this.f111230n.setColorFilter(num3.intValue());
            this.f111231o.setTextColor(num3.intValue());
        }
        Integer num4 = azcb.f98957g;
        if (!(num4 == null || (textView = this.f111233q) == null)) {
            textView.setTextColor(num4.intValue());
        }
        Integer num5 = azcb.f98956f;
        if (num5 != null) {
            TextView textView2 = this.f111233q;
            if (textView2 != null) {
                textView2.setBackgroundColor(num5.intValue());
            }
            View view = this.f111232p;
            if (view != null) {
                view.setBackgroundColor(num5.intValue());
            }
        }
        Integer num6 = azcb.f98952b;
        if (num6 != null) {
            Button button = this.f111235s;
            if (button != null) {
                button.setTextColor(num6.intValue());
            }
            Button button2 = this.f111234r;
            if (button2 != null) {
                button2.setTextColor(num6.intValue());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(boolean, java.lang.String):boolean
     arg types: [int, java.lang.String]
     candidates:
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, android.graphics.Bitmap):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, java.lang.String):void
      azmy.a(java.lang.String, java.lang.String):void
      azdo.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(boolean, java.lang.String):boolean */
    /* renamed from: a */
    public final void mo60407a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && TextUtils.getTrimmedLength(charSequence) != 0) {
            this.f111182P = true;
            m94681a(charSequence.toString(), true, m94678O());
            this.f111228l.setText("");
            if (this.f111208ao) {
                if (this.f111195ab.getVisibility() == 0) {
                    this.f111195ab.setVisibility(8);
                }
            } else if (cfeu.m139270b()) {
                azcb azcb = this.f111241y;
                if (!(azcb == null || azcb.mo54593f() > 0 || this.f111242z == null)) {
                    if (m94683a(false, mo60412c(5))) {
                        this.f111183Q = true;
                        m94670G();
                        return;
                    }
                    azoj.m85933c("CardChimeraActivity", "Failed to show offboarding promo, still dismissing", new Object[0]);
                }
                if (!this.f111200ag) {
                    int[] iArr = new int[2];
                    this.f111227k.getLocationOnScreen(iArr);
                    this.f111227k.animate().translationYBy(-((float) (iArr[1] + this.f111227k.getHeight()))).setDuration((long) getResources().getInteger(17694720));
                    m94671H();
                    return;
                }
                m94671H();
            } else if (m94679P()) {
                String str = (String) this.f111199af.get(Long.valueOf(cffj.f183931a.mo6606a().mo81118b()));
                if (TextUtils.isEmpty(str) && this.f111242z != null) {
                    str = mo60412c(5);
                }
                m94683a(true, str);
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
    /* renamed from: a */
    public final void mo55078a(String str, String str2) {
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.send_matchstick_msg");
        intent.putExtra("conversation_id", str);
        intent.putExtra("inbox_msg_id", str2);
        intent.putExtra("is_resend", true);
        intent.putExtra("show_toast_after_sent", m94678O());
        MessagingService.m94556a(intent, this);
    }

    /* renamed from: a */
    public final void mo60408a(boolean z) {
        if (cfdk.m138732b()) {
            if (!z) {
                this.f111229m.setText(getString(C0126R.string.common_network_unavailable));
            } else if (this.f111208ao && this.f111215av) {
                this.f111229m.setText(getString(C0126R.string.ms_reply_free_anonymous));
            } else {
                this.f111229m.setText(getString(C0126R.string.sending_as_text, new Object[]{this.f111186T}));
            }
            String c = mo60412c(23);
            if (!TextUtils.isEmpty(c)) {
                this.f111228l.setHint(c);
                return;
            }
            mo60410b((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION);
            this.f111228l.setHint((int) C0126R.string.compose_message_view_hint_text_fallback);
        } else if (!z) {
            this.f111228l.setHint(getString(C0126R.string.common_network_unavailable));
        } else if (this.f111208ao && this.f111215av) {
            this.f111228l.setHint(getString(C0126R.string.ms_reply_free_anonymous));
        } else {
            this.f111228l.setHint(getString(C0126R.string.sending_as_text, new Object[]{this.f111186T}));
        }
    }
}
