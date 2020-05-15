package com.google.android.gms.walletp2p.feature.transfer;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import com.google.android.gms.walletp2p.feature.rpcclient.types.FundsTransferNotices;
import com.google.android.gms.walletp2p.feature.rpcclient.types.LegalDocuments;
import com.google.android.gms.walletp2p.feature.widgets.alertpage.AlertPage;
import com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview.FifeNetworkImageView;
import com.google.android.gms.walletp2p.feature.widgets.keypadview.KeyPadView;
import com.google.android.gms.walletp2p.feature.widgets.pagerlayout.PagerLayout;
import com.google.android.gms.walletp2p.feature.widgets.securelayout.SecureFrameLayout;
import com.google.android.gms.walletp2p.feature.widgets.transactiondetailslayout.TransactionDetailsLayout;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.walletp2p.moneyentry.MoneyEntryLayout;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransferMoneyChimeraActivity extends deu implements axli, axlz {

    /* renamed from: B */
    private static ImageLoader f110684B;

    /* renamed from: A */
    rjx f110685A;

    /* renamed from: C */
    private Button f110686C;

    /* renamed from: D */
    private Button f110687D;

    /* renamed from: E */
    private Button f110688E;

    /* renamed from: F */
    private Button f110689F;

    /* renamed from: G */
    private MoneyEntryLayout f110690G;

    /* renamed from: H */
    private RecyclerView f110691H;

    /* renamed from: I */
    private Toolbar f110692I;

    /* renamed from: J */
    private LinearLayout f110693J;

    /* renamed from: K */
    private ImageView f110694K;

    /* renamed from: L */
    private SecureFrameLayout f110695L;

    /* renamed from: M */
    private TextView f110696M;

    /* renamed from: N */
    private FifeNetworkImageView f110697N;

    /* renamed from: O */
    private TransactionDetailsLayout f110698O;

    /* renamed from: P */
    private TextView f110699P;

    /* renamed from: Q */
    private TextView f110700Q;

    /* renamed from: R */
    private TextView f110701R;

    /* renamed from: S */
    private Toolbar f110702S;

    /* renamed from: T */
    private Button f110703T;

    /* renamed from: U */
    private Button f110704U;

    /* renamed from: V */
    private Button f110705V;

    /* renamed from: W */
    private int f110706W;

    /* renamed from: X */
    private int f110707X;

    /* renamed from: Y */
    private int f110708Y;

    /* renamed from: Z */
    private boolean f110709Z = false;

    /* renamed from: aa */
    private String f110710aa = null;

    /* renamed from: ab */
    private boolean f110711ab = false;

    /* renamed from: ac */
    private boolean f110712ac = false;

    /* renamed from: ad */
    private int f110713ad;

    /* renamed from: b */
    public AlertPage f110714b;

    /* renamed from: c */
    public MoneyEntryLayout f110715c;

    /* renamed from: d */
    public FifeNetworkImageView f110716d;

    /* renamed from: e */
    public TextView f110717e;

    /* renamed from: f */
    public KeyPadView f110718f;

    /* renamed from: g */
    public EditText f110719g;

    /* renamed from: h */
    public PagerLayout f110720h;

    /* renamed from: i */
    public aba f110721i;

    /* renamed from: j */
    public ImageView f110722j;

    /* renamed from: k */
    public FrameLayout f110723k;

    /* renamed from: l */
    public MaterialProgressBar f110724l;

    /* renamed from: m */
    public TransferParams f110725m = TransferParams.f110642a;

    /* renamed from: n */
    public String f110726n;

    /* renamed from: o */
    public boolean f110727o = false;

    /* renamed from: p */
    public List f110728p;

    /* renamed from: q */
    public List f110729q;

    /* renamed from: r */
    public FundsTransferNotices f110730r;

    /* renamed from: s */
    public LegalDocuments f110731s;

    /* renamed from: t */
    public byte[] f110732t;

    /* renamed from: u */
    public axle f110733u;

    /* renamed from: v */
    public ValidateDraftTokenResponse f110734v;

    /* renamed from: w */
    public Instrument f110735w;

    /* renamed from: x */
    public axfi f110736x;

    /* renamed from: y */
    public Handler f110737y;

    /* renamed from: z */
    public axif f110738z;

    /* renamed from: r */
    public static Uri.Builder m94346r() {
        String str;
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        if (!"PROD".equals(axmb.m82712a())) {
            str = "pay.sandbox.google.com";
        } else {
            str = "pay.google.com";
        }
        return scheme.authority(str).appendPath("n");
    }

    /* renamed from: s */
    private final boolean m94347s() {
        return !stm.m36302d(axog.m82807c(getIntent()));
    }

    /* renamed from: P */
    public final void mo53238P(int i) {
        axma axma;
        String str = this.f110726n;
        if (str == null) {
            axma = new axma(this);
            axma.mo53241a(spn.m35852a((Activity) this));
            axma.f96173b = this.f110710aa;
        } else {
            axma = axma.m82708a(this, str);
            axma.mo53241a(spn.m35852a((Activity) this));
            axma.f96173b = this.f110710aa;
        }
        axma.mo53240a(this.f110725m, getIntent(), i);
    }

    /* renamed from: a */
    public final void mo53154a() {
        MoneyEntryLayout moneyEntryLayout = this.f110715c;
        if (moneyEntryLayout.f150669b.mo60932a()) {
            moneyEntryLayout.mo70856a(true);
        } else {
            moneyEntryLayout.mo70857b();
        }
    }

    /* renamed from: b */
    public final void mo53156b() {
        MoneyEntryLayout moneyEntryLayout = this.f110715c;
        beqk beqk = moneyEntryLayout.f150669b;
        if (!beqk.f112052c.isEmpty()) {
            ArrayList arrayList = beqk.f112052c;
            arrayList.remove(arrayList.size() - 1);
        } else if (beqk.f112053d) {
            beqk.f112053d = false;
        } else if (!beqk.f112051b.isEmpty()) {
            ArrayList arrayList2 = beqk.f112051b;
            arrayList2.remove(arrayList2.size() - 1);
        } else {
            moneyEntryLayout.mo70857b();
            this.f110715c.sendAccessibilityEvent(4);
        }
        moneyEntryLayout.mo70856a(true);
        this.f110715c.sendAccessibilityEvent(4);
    }

    /* renamed from: e */
    public final void mo60191e() {
        String str;
        mo53238P(7);
        if (this.f110726n != null) {
            mo60192g();
        } else if (!getIntent().hasExtra("account_name") || stm.m36302d(getIntent().getStringExtra("account_name"))) {
            String str2 = this.f110725m.f110649h;
            if (str2 == null) {
                this.f110712ac = true;
                String string = axmp.m82728a(this).getString("default_account_name", null);
                if (!TextUtils.isEmpty(string)) {
                    Account[] a = axlr.m82700a(this, null);
                    for (Account account : a) {
                        if (string.equalsIgnoreCase(account.name)) {
                            str = account.name;
                            break;
                        }
                    }
                    axmp.m82729a(this, null);
                }
                str = null;
                if (!TextUtils.isEmpty(str)) {
                    this.f110726n = str;
                    mo60192g();
                    return;
                }
                mo60189a(null, false, true);
                return;
            }
            mo53238P(8);
            mo60188a(null, str2, true, new axki(this));
        } else {
            this.f110726n = getIntent().getStringExtra("account_name");
            mo60192g();
        }
    }

    /* renamed from: g */
    public final void mo60192g() {
        mo53238P(18);
        sdo.m34959a((Object) this.f110726n);
        int i = this.f110725m.f110653l;
        axhs axhs = null;
        if (chlt.f188760a.mo6606a().mo85337a() && axhs.m82625a(i, bzwj.f171630g) != null && !axmp.m82728a(this).getBoolean("marketing_impression", false)) {
            axhs = new axhs();
            Bundle bundle = new Bundle();
            bundle.putInt("integrator_id", i - 1);
            axhs.setArguments(bundle);
        }
        if (axhs != null) {
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.marketing_page, axhs, "marketing_fragment_tag").commitAllowingStateLoss();
            this.f110720h.mo60211b(5);
            mo53238P(160);
            return;
        }
        mo53238P(161);
        mo60193h();
    }

    /* renamed from: h */
    public final void mo60193h() {
        mo53238P(22);
        sdo.m34959a((Object) this.f110726n);
        TransferParams transferParams = this.f110725m;
        if (transferParams.f110650i == null) {
            String str = transferParams.f110649h;
            if (str != null) {
                mo60188a(this.f110726n, str, false, new axkj(this));
            } else {
                mo60194i();
            }
        } else {
            mo60194i();
        }
    }

    /* renamed from: i */
    public final void mo60194i() {
        mo53238P(9);
        sdo.m34977c(this.f110726n);
        axfi a = axfj.m82570a(this.f110725m, getIntent());
        this.f110736x = a;
        sdo.m34959a(a);
        sdo.m34959a((Object) this.f110726n);
        if (this.f110736x.mo53102n() && (this.f110728p == null || this.f110729q == null)) {
            mo60197l();
        }
        if (m94347s() && !this.f110709Z) {
            mo60198m();
        }
        mo60195j();
        mo60195j();
    }

    /* renamed from: j */
    public final void mo60195j() {
        boolean z;
        String str;
        List list;
        int i;
        LegalDocuments legalDocuments;
        boolean z2;
        mo53238P(10);
        if (chlh.m148921b()) {
            if (this.f110725m.f110650i == null || this.f110730r != null) {
                btti btti = btti.REGULATORY_DISCLOSURE;
                TextView textView = this.f110700Q;
                FundsTransferNotices fundsTransferNotices = this.f110730r;
                if (fundsTransferNotices != null && fundsTransferNotices.mo60178a(btti)) {
                    textView.setText(this.f110730r.mo60179b(btti));
                    textView.setVisibility(0);
                } else if (this.f110725m.f110650i != null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(4);
                }
            } else {
                return;
            }
        }
        FundsTransferNotices fundsTransferNotices2 = this.f110730r;
        if (!(fundsTransferNotices2 == null || (legalDocuments = this.f110731s) == null)) {
            List<bttm> list2 = legalDocuments.f110683a;
            StringBuilder sb = new StringBuilder();
            if (fundsTransferNotices2.mo60178a(btti.LEGAL_TEXT)) {
                sb.append(fundsTransferNotices2.mo60179b(btti.LEGAL_TEXT));
                z2 = true;
            } else {
                z2 = false;
            }
            if (!list2.isEmpty()) {
                if (z2) {
                    sb.append(" ");
                }
                Object[] objArr = new Object[1];
                ArrayList arrayList = new ArrayList();
                for (bttm bttm : list2) {
                    String obj = Html.fromHtml(bttm.f150363a).toString();
                    String str2 = bttm.f150364b;
                    SpannableString spannableString = new SpannableString(obj);
                    spannableString.setSpan(new URLSpan(str2), 0, spannableString.length(), 33);
                    String html = Html.toHtml(spannableString);
                    String substring = html.substring(html.indexOf("<a"));
                    arrayList.add(substring.substring(0, substring.indexOf("/a>") + 3));
                }
                objArr[0] = arrayList.size() == 1 ? (String) arrayList.get(0) : arrayList.size() == 2 ? TextUtils.join(" & ", arrayList) : bmxr.m108544a(", ").mo66874a((Iterable) arrayList.subList(0, arrayList.size() - 1)).concat(", & ").concat((String) arrayList.get(arrayList.size() - 1));
                sb.append(getString(C0126R.string.walletp2p_tos_message, objArr));
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                this.f110701R.setVisibility(0);
                axmq.m82730a(this.f110701R, sb2);
                if (!this.f110731s.f110683a.isEmpty()) {
                    this.f110725m.f110652k = true;
                }
            } else if (this.f110725m.f110650i == null) {
                this.f110701R.setVisibility(4);
            } else {
                this.f110701R.setVisibility(8);
            }
            this.f110701R.setLongClickable(false);
        }
        btsb btsb = this.f110725m.f110643b;
        if (btsb != null) {
            this.f110715c.mo70854a(btsb.f150178c);
        }
        if (m94347s() && !this.f110709Z) {
            if (this.f110734v == null) {
                return;
            }
            if (!this.f110736x.mo53098m() || this.f110728p != null) {
                this.f110709Z = true;
                sdo.m34959a(this.f110734v);
                mo53238P(135);
                String str3 = this.f110725m.f110649h;
                if (str3 == null) {
                    MoneyEntryLayout moneyEntryLayout = this.f110715c;
                    ValidateDraftTokenResponse validateDraftTokenResponse = this.f110734v;
                    moneyEntryLayout.mo70853a(validateDraftTokenResponse.f110849a, validateDraftTokenResponse.f110850b);
                } else if (!str3.equals(this.f110734v.f110853e)) {
                    mo53238P(136);
                }
                TransferParams transferParams = this.f110725m;
                transferParams.f110645d = this.f110734v.f110854f;
                this.f110719g.setText(transferParams.f110645d);
                if (this.f110736x.mo53098m() && this.f110728p.size() > 0 && this.f110734v.f110851c != null) {
                    List list3 = this.f110728p;
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Instrument instrument = (Instrument) list3.get(i2);
                        if (instrument.f110820a.equals(this.f110734v.f110851c) && ((i = instrument.f110823d) == 1 || i == 2)) {
                            this.f110735w = instrument;
                        }
                    }
                }
                if (!stm.m36302d(this.f110734v.f110852d) && this.f110725m.f110651j) {
                    this.f110710aa = this.f110734v.f110852d;
                }
            } else {
                return;
            }
        }
        this.f110686C.setVisibility(8);
        this.f110687D.setVisibility(8);
        this.f110688E.setVisibility(8);
        this.f110689F.setVisibility(8);
        this.f110705V.setVisibility(8);
        if (this.f110736x.mo53098m() && this.f110735w == null && (list = this.f110729q) != null && !list.isEmpty()) {
            this.f110686C.setVisibility(0);
            if (chlq.m148935b() && this.f110729q.size() > 1) {
                this.f110687D.setVisibility(0);
            }
        } else if (this.f110736x.mo53082c()) {
            this.f110705V.setVisibility(0);
        } else if (this.f110736x.mo53103o()) {
            this.f110689F.setVisibility(0);
        } else {
            this.f110688E.setVisibility(0);
        }
        if (this.f110736x.mo53094l()) {
            if (this.f110725m.mo60156c()) {
                this.f110715c.setOnClickListener(new axiy(this));
            } else {
                this.f110718f.setVisibility(0);
            }
        }
        if (this.f110736x.mo53098m() && this.f110728p != null) {
            this.f110702S.mo1679a(this.f110736x.mo53083d(this));
            if (this.f110735w != null) {
                this.f110723k.setVisibility(0);
                mo60190b(10);
                this.f110717e.setVisibility(0);
                this.f110717e.setText(this.f110736x.mo53074a(this, this.f110735w.f110821b));
                this.f110717e.setContentDescription(getString(C0126R.string.walletp2p_selected_payment_method_cd, new Object[]{this.f110735w.f110821b}));
                this.f110716d.setVisibility(0);
                this.f110716d.setDefaultImageResId(C0126R.C0127drawable.quantum_ic_credit_card_vd_theme_24);
                if (!stm.m36302d(this.f110735w.f110824e)) {
                    this.f110716d.mo60205a(this.f110735w.f110824e, axkz.m82688a(), false, false);
                }
                this.f110716d.setColorFilter(this.f110708Y, PorterDuff.Mode.SRC_ATOP);
                if (this.f110691H.getAdapter() == null) {
                    axkk axkk = new axkk(this);
                    this.f110733u = axkk;
                    this.f110691H.setAdapter(axkk);
                    this.f110691H.setLayoutManager(new aah());
                }
                axle axle = this.f110733u;
                List list4 = this.f110728p;
                List list5 = this.f110729q;
                if (list5 == null) {
                    list5 = new ArrayList();
                }
                axle.mo53204a(list4, list5);
                axle axle2 = this.f110733u;
                axle2.f96136d = this.f110735w;
                axle2.mo171aJ();
            } else {
                mo53238P(27);
                if (this.f110729q.isEmpty()) {
                    mo53238P(29);
                } else {
                    if (this.f110691H.getAdapter() == null) {
                        axkm axkm = new axkm(this);
                        this.f110733u = axkm;
                        this.f110691H.setAdapter(axkm);
                        this.f110691H.setLayoutManager(new aah());
                    }
                    axle axle3 = this.f110733u;
                    List list6 = this.f110728p;
                    List list7 = this.f110729q;
                    if (list7 == null) {
                        list7 = new ArrayList();
                    }
                    axle3.mo53204a(list6, list7);
                    this.f110733u.mo171aJ();
                    this.f110686C.setText(((InstrumentCreationToken) this.f110729q.get(0)).f110828b);
                    this.f110686C.setOnClickListener(new axiz(this));
                    if (chlq.m148935b() && this.f110729q.size() > 1) {
                        this.f110687D.setText((int) C0126R.string.common_more_options);
                        this.f110687D.setOnClickListener(new axja(this));
                    }
                }
            }
        }
        if (this.f110736x.mo53086e()) {
            this.f110723k.setVisibility(0);
            mo60190b(10);
            this.f110696M.setVisibility(0);
            Transaction transaction = this.f110725m.f110650i;
            if (stm.m36302d(transaction.f110842l)) {
                int i3 = transaction.f110832b;
                if (i3 == 1) {
                    int i4 = transaction.f110831a;
                    str = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? null : getString(C0126R.string.walletp2p_claimed_to, new Object[]{transaction.f110845o}) : getString(C0126R.string.walletp2p_sent) : getString(C0126R.string.walletp2p_request_completed) : getString(C0126R.string.walletp2p_claimed) : getString(C0126R.string.walletp2p_sent);
                } else if (i3 == 2) {
                    int i5 = transaction.f110831a;
                    str = i5 != 1 ? i5 != 3 ? null : getString(C0126R.string.walletp2p_request_sent) : getString(C0126R.string.walletp2p_sent);
                } else if (i3 == 3) {
                    int i6 = transaction.f110831a;
                    str = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? null : getString(C0126R.string.walletp2p_canceled) : getString(C0126R.string.walletp2p_request_canceled) : getString(C0126R.string.walletp2p_canceled) : getString(C0126R.string.walletp2p_send_cancelled);
                } else if (i3 == 5) {
                    int i7 = transaction.f110831a;
                    str = i7 != 3 ? i7 != 4 ? null : getString(C0126R.string.walletp2p_request_declined) : getString(C0126R.string.walletp2p_request_declined);
                } else if (i3 == 4) {
                    int i8 = transaction.f110831a;
                    str = i8 != 1 ? i8 != 4 ? null : getString(C0126R.string.walletp2p_transaction_disputed) : getString(C0126R.string.walletp2p_transaction_disputed);
                } else {
                    str = null;
                }
            } else {
                str = transaction.f110842l;
            }
            this.f110696M.setText(stm.m36299a(str));
            Transaction transaction2 = this.f110725m.f110650i;
            int i9 = transaction2.f110832b;
            if (i9 == 1 || (i9 == 2 && transaction2.f110831a == 1)) {
                if (chlq.m148935b()) {
                    this.f110697N.setVisibility(0);
                    FifeNetworkImageView fifeNetworkImageView = this.f110697N;
                    String d = chlq.f188754a.mo6606a().mo85335d();
                    if (f110684B == null) {
                        f110684B = axkz.m82688a();
                    }
                    fifeNetworkImageView.mo60205a(d, f110684B, false, true);
                } else {
                    aux a = aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_check_vd_theme_24, getTheme());
                    int i10 = Build.VERSION.SDK_INT;
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0126R.dimen.walletp2p_vd_small);
                    a.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
                    C1173lt.m19599a(a, this.f110706W);
                    this.f110696M.setCompoundDrawables(a, null, null, null);
                    this.f110696M.setCompoundDrawablePadding(getResources().getDimensionPixelSize(C0126R.dimen.walletp2p_narrow_spacing));
                }
            }
        }
        if (this.f110736x.mo53080b()) {
            MoneyEntryLayout moneyEntryLayout2 = this.f110715c;
            Transaction transaction3 = this.f110725m.f110650i;
            moneyEntryLayout2.mo70853a(transaction3.f110834d, transaction3.f110835e);
        } else if (this.f110725m.mo60156c() && this.f110715c.mo70852a() == 0) {
            MoneyEntryLayout moneyEntryLayout3 = this.f110715c;
            btsb btsb2 = this.f110725m.f110643b;
            moneyEntryLayout3.mo70853a(btsb2.f150177b, btsb2.f150178c);
        }
        if (this.f110736x.mo53080b()) {
            this.f110698O.setVisibility(0);
            TransactionDetailsLayout transactionDetailsLayout = this.f110698O;
            Transaction transaction4 = this.f110725m.f110650i;
            if (!chlq.m148935b()) {
                transactionDetailsLayout.f110766a.setVisibility(0);
                String str4 = transaction4.f110840j;
                if (str4 != null) {
                    transactionDetailsLayout.f110766a.mo60205a(str4, axkz.m82688a(), true, true);
                }
            } else if (transaction4.f110831a != 5) {
                transactionDetailsLayout.f110767b.setVisibility(0);
                if (!chlq.f188754a.mo6606a().mo85332a()) {
                    AccountParticleDisc accountParticleDisc = transactionDetailsLayout.f110767b;
                    ExecutorService b = snp.m35702a(9);
                    allp a2 = allq.m61232a();
                    a2.f73626a = byug.GMONEY.f168292ja;
                    allq a3 = a2.mo40491a();
                    bdej bdej = new bdej(b);
                    AccountParticleDisc.m94876a(transactionDetailsLayout.getContext(), bdej, b, new bddp(), new bddr(transactionDetailsLayout.getContext(), b, a3), bddo.class);
                    accountParticleDisc.mo60576a(bdej, bddo.class);
                    AccountParticleDisc accountParticleDisc2 = transactionDetailsLayout.f110767b;
                    bddn g = bddo.m90606g();
                    g.mo57907a(transaction4.f110838h);
                    g.f105375a = transaction4.f110837g;
                    accountParticleDisc2.mo60577a(g.mo57906a());
                }
            }
            if (chlq.m148935b()) {
                transactionDetailsLayout.f110768c.setText(transaction4.f110837g);
            } else {
                TextView textView2 = transactionDetailsLayout.f110768c;
                Context context = transactionDetailsLayout.getContext();
                int i11 = transaction4.f110831a;
                String str5 = transaction4.f110837g;
                if (i11 == 1) {
                    str5 = context.getString(C0126R.string.walletp2p_transaction_to, str5);
                } else if (i11 == 2) {
                    str5 = context.getString(C0126R.string.walletp2p_transaction_from, str5);
                } else if (i11 == 3) {
                    str5 = context.getString(C0126R.string.walletp2p_request_to, str5);
                } else if (i11 == 4) {
                    str5 = context.getString(C0126R.string.walletp2p_request_from, str5);
                } else if (i11 == 5) {
                    str5 = context.getString(C0126R.string.walletp2p_transferred_to_bank);
                }
                textView2.setText(str5);
            }
            if (chlq.m148935b()) {
                if (!TextUtils.isEmpty(transaction4.f110838h) && !bmwb.m108443a(transaction4.f110838h, transaction4.f110837g)) {
                    transactionDetailsLayout.f110769d.setVisibility(0);
                    transactionDetailsLayout.f110769d.setText(transaction4.f110838h);
                }
                if (!stm.m36302d(transaction4.f110839i)) {
                    transactionDetailsLayout.f110773h.setVisibility(0);
                    transactionDetailsLayout.f110775j.setVisibility(0);
                    transactionDetailsLayout.f110775j.setText(transaction4.f110839i);
                }
                transactionDetailsLayout.f110770e.setVisibility(0);
                transactionDetailsLayout.f110772g.setVisibility(0);
                transactionDetailsLayout.f110772g.setText(DateFormat.getDateInstance().format(new Date(transaction4.f110836f)));
            } else {
                transactionDetailsLayout.findViewById(C0126R.C0129id.transaction_details_separator).setVisibility(0);
                if (!stm.m36302d(transaction4.f110839i)) {
                    transactionDetailsLayout.f110774i.setVisibility(0);
                    transactionDetailsLayout.f110774i.setText(transaction4.f110839i);
                }
                transactionDetailsLayout.f110771f.setVisibility(0);
                transactionDetailsLayout.f110771f.setText(DateFormat.getDateInstance().format(new Date(transaction4.f110836f)));
            }
        }
        if (this.f110736x.mo53082c()) {
            if (!chlq.m148935b()) {
                this.f110705V.setText(this.f110736x.mo53075a(this));
            } else if (this.f110725m.mo60155b()) {
                this.f110705V.setText(this.f110736x.mo53075a(this));
            } else {
                this.f110705V.setText((int) C0126R.string.common_continue);
            }
            Button button = this.f110705V;
            if ((this.f110736x.mo53098m() || this.f110728p == null) && this.f110735w == null) {
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
        }
        if (this.f110712ac) {
            this.f110721i.f93a.findItem(C0126R.C0129id.switch_account).setVisible(true);
            this.f110699P.setText(this.f110726n);
            this.f110699P.setVisibility(0);
        } else {
            this.f110699P.setVisibility(8);
        }
        if (this.f110736x.mo53088f()) {
            this.f110721i.f93a.findItem(C0126R.C0129id.return_money_item).setVisible(true);
        }
        if (this.f110736x.mo53089g()) {
            this.f110721i.f93a.findItem(C0126R.C0129id.decline_request_item).setVisible(true);
        }
        if (this.f110736x.mo53090h()) {
            this.f110721i.f93a.findItem(C0126R.C0129id.view_in_wallet_item).setVisible(true);
        }
        this.f110694K.setImageDrawable(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_more_vert_vd_theme_24, getTheme()));
        this.f110693J.setContentDescription(getString(C0126R.string.common_more_options));
        this.f110693J.setOnClickListener(new axjj(this));
        this.f110721i.f95c = new axjk(this);
        C1173lt.m19599a(this.f110694K.getDrawable(), this.f110707X);
        if (this.f110720h.f110753a == 0) {
            if (m94347s() || this.f110736x.mo53080b() || this.f110736x.mo53098m()) {
                this.f110720h.mo60211b(this.f110713ad);
            } else {
                this.f110720h.mo60209a(this.f110713ad);
            }
        }
        mo53238P(15);
    }

    /* renamed from: k */
    public final void mo60196k() {
        mo53238P(31);
        sdo.m34959a((Object) this.f110726n);
        int i = Build.VERSION.SDK_INT;
        this.f110720h.setVisibility(8);
        this.f110725m.f110643b = TransferParams.m94306a(this.f110715c.mo70852a(), this.f110715c.f150668a);
        axfi axfi = this.f110736x;
        TransferParams transferParams = this.f110725m;
        byte[] bArr = this.f110732t;
        Instrument instrument = this.f110735w;
        String str = this.f110710aa;
        Intent a = axfi.m82533a(transferParams, axfi.f95879a);
        if (instrument != null) {
            a.putExtra("transfer_instrument", instrument);
        }
        a.putExtra("transfer_idempotency_key", str);
        a.putExtra("funds_transfer_token", bArr);
        a.putExtra("account_name", this.f110726n);
        a.putExtra("calling_package", spn.m35852a((Activity) this));
        a.removeExtra("draft_token");
        startActivityForResult(a, 1);
    }

    /* renamed from: l */
    public final void mo60197l() {
        mo53238P(42);
        if (!this.f110736x.mo53086e()) {
            this.f110723k.setVisibility(0);
            mo60190b(10);
            this.f110724l.setVisibility(0);
        }
        this.f110716d.setVisibility(8);
        this.f110717e.setVisibility(8);
        sdo.m34959a(this.f110725m.f110643b);
        axif axif = this.f110738z;
        int a = this.f110736x.mo53073a();
        btsb btsb = this.f110725m.f110643b;
        axif.mo53160a(a, btsb.f150177b, btsb.f150178c, chlh.m148921b(), new Account(this.f110726n, "com.google"), new axjc(this), new axjd(this));
    }

    /* renamed from: m */
    public final void mo60198m() {
        mo53238P(137);
        aucb a = this.f110685A.mo24676a(this.f110725m.mo60157d(), axog.m82807c(getIntent()), this.f110726n);
        a.mo50376a(this, new axjf(this));
        a.mo50375a(this, new axjg(this));
    }

    /* renamed from: n */
    public final void mo60199n() {
        mo53238P(55);
        this.f110714b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), getString(C0126R.string.common_something_went_wrong), getString(C0126R.string.walletp2p_try_again_soon), getString(C0126R.string.close_button_label), new axjn(this), null, null);
        this.f110720h.mo60211b(3);
    }

    /* renamed from: o */
    public final void mo60200o() {
        this.f110714b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), getString(C0126R.string.walletp2p_account_ineligible_title), getString(C0126R.string.walletp2p_account_ineligible_content), getString(C0126R.string.close_button_label), new axjr(this), null, null);
        this.f110720h.mo60211b(3);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo53238P(33);
        this.f110711ab = false;
        if (i != 1) {
            if (i == 2 || i == 4) {
                if (i2 == -1) {
                    mo53238P(36);
                    String str = this.f110726n;
                    String stringExtra = intent.getStringExtra("authAccount");
                    this.f110726n = stringExtra;
                    if (str != null && !str.equalsIgnoreCase(stringExtra)) {
                        this.f110735w = null;
                        this.f110728p = null;
                        this.f110729q = null;
                        this.f110730r = null;
                        this.f110732t = null;
                        this.f110731s = null;
                        this.f110725m.f110650i = null;
                    }
                    if (i == 4) {
                        axmp.m82729a(this, this.f110726n);
                    }
                    this.f110720h.mo60209a(0);
                    mo60192g();
                } else if (i == 2 || this.f110726n == null) {
                    mo53238P(37);
                    setResult(0);
                    finish();
                }
            } else if (i != 3) {
            } else {
                if (i2 == -1) {
                    mo53238P(38);
                    this.f110728p = null;
                    this.f110720h.mo60209a(0);
                    mo60192g();
                    return;
                }
                mo53238P(39);
                mo60192g();
            }
        } else if (i2 == -1) {
            mo53238P(34);
            setResult(-1, intent);
            finish();
        } else {
            mo53238P(35);
            if (intent == null || !intent.getBooleanExtra("fatal_error", false)) {
                this.f110720h.setVisibility(0);
                this.f110720h.mo60209a(0);
                this.f110728p = null;
                mo60192g();
                return;
            }
            mo53238P(147);
            setResult(0);
            finish();
        }
    }

    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if ("marketing_fragment_tag".equals(fragment.getTag())) {
            axhs axhs = (axhs) fragment;
            axhs.f96179f = new axkh(this);
            axhs.f96180g = new axiu(this);
            axhs.f96178e = new axiv(this, axhs);
        }
    }

    public final void onBackPressed() {
        mo53238P(40);
        int i = this.f110720h.f110753a;
        if (i == 2) {
            axle axle = this.f110733u;
            axle.f96136d = this.f110735w;
            axle.mo171aJ();
            this.f110720h.mo60212c(1);
            AccessibilityManager accessibilityManager = (AccessibilityManager) getBaseContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                this.f110717e.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(8);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        } else if (i == 4) {
            if (chlq.m148935b()) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
            this.f110720h.mo60211b(1);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (chlk.m148926b()) {
            setResult(0);
            finish();
            return;
        }
        mo53238P(2);
        this.f110685A = axdx.m82408a(this, this.f110725m.f110653l - 1);
        try {
            if (getIntent().getData() != null) {
                try {
                    this.f110725m = TransferParams.m94311a(this, getIntent().getData());
                } catch (axfm e) {
                    Log.w("TransferMoneyActivity", "Unhandled URI, redirecting to web", e);
                    mo60184a(e.f95881a);
                    return;
                }
            } else {
                this.f110725m = TransferParams.m94310a(this, getIntent());
            }
            setTheme(C0126R.style.Theme_WalletP2P_M2);
            if (!this.f110725m.mo60153a() || m94347s()) {
                try {
                    spn.m35870c((Activity) this);
                    this.f110727o = true;
                } catch (SecurityException e2) {
                    this.f110727o = false;
                }
            }
            if (this.f110725m.f110653l == 3 || "LOCAL".equals(axmb.m82712a())) {
                this.f110727o = true;
            }
            setContentView((int) C0126R.C0128layout.walletp2p_transfer_money_activity);
            this.f110738z = new axif(this, this.f110725m.f110653l);
            this.f110710aa = UUID.randomUUID().toString();
            this.f110686C = (Button) findViewById(C0126R.C0129id.add_instrument_button);
            this.f110687D = (Button) findViewById(C0126R.C0129id.more_options_button);
            this.f110714b = (AlertPage) findViewById(C0126R.C0129id.alert_page);
            Button button = (Button) findViewById(C0126R.C0129id.done_button);
            this.f110688E = button;
            button.setOnClickListener(new axit(this));
            Button button2 = (Button) findViewById(C0126R.C0129id.done_text_button);
            this.f110689F = button2;
            button2.setOnClickListener(new axje(this));
            Button button3 = (Button) findViewById(C0126R.C0129id.transfer_button);
            this.f110705V = button3;
            button3.setOnClickListener(new axjp(this));
            KeyPadView keyPadView = (KeyPadView) findViewById(C0126R.C0129id.keypad_view);
            this.f110718f = keyPadView;
            keyPadView.f110752a = this;
            this.f110715c = (MoneyEntryLayout) findViewById(C0126R.C0129id.fancy_money_layout_user_visible);
            this.f110690G = (MoneyEntryLayout) findViewById(C0126R.C0129id.fancy_money_layout_height_placeholder_invisible);
            this.f110724l = (MaterialProgressBar) findViewById(C0126R.C0129id.inline_progress_indicator);
            this.f110706W = azxe.m86324a(this, 16842806);
            this.f110707X = azxe.m86324a(this, 16842808);
            this.f110708Y = C1133kh.m17843b(this, C0126R.color.walletp2p_primary);
            this.f110723k = (FrameLayout) findViewById(C0126R.C0129id.instrument_picker_frame_layout);
            FifeNetworkImageView fifeNetworkImageView = (FifeNetworkImageView) findViewById(C0126R.C0129id.instrument_icon);
            this.f110716d = fifeNetworkImageView;
            fifeNetworkImageView.setOnClickListener(new axka(this));
            TextView textView = (TextView) findViewById(C0126R.C0129id.instrument_picker);
            this.f110717e = textView;
            textView.setOnClickListener(new axkc(this));
            this.f110691H = (RecyclerView) findViewById(C0126R.C0129id.instrument_recycler_view);
            Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.memo_toolbar);
            this.f110692I = toolbar;
            toolbar.mo1678a(new axkd(this));
            this.f110719g = (EditText) findViewById(C0126R.C0129id.memo_content);
            this.f110693J = (LinearLayout) findViewById(C0126R.C0129id.overflow_menu);
            this.f110694K = (ImageView) findViewById(C0126R.C0129id.overflow_menu_icon);
            this.f110720h = (PagerLayout) findViewById(C0126R.C0129id.transaction_pager_layout);
            if (!chlq.m148935b()) {
                this.f110720h.mo60210a(2, 1);
                this.f110720h.mo60210a(3, 0);
            }
            aba aba = new aba(this, this.f110693J);
            this.f110721i = aba;
            aba.mo137a().inflate(C0126R.C0130menu.walletp2p_overflow_menu, this.f110721i.f93a);
            this.f110696M = (TextView) findViewById(C0126R.C0129id.status_indicator);
            this.f110697N = (FifeNetworkImageView) findViewById(C0126R.C0129id.status_checkmark_indicator);
            this.f110698O = (TransactionDetailsLayout) findViewById(C0126R.C0129id.transaction_details_layout);
            this.f110695L = (SecureFrameLayout) findViewById(C0126R.C0129id.transfer_frame_layout);
            if (chlq.m148935b()) {
                getWindow().setBackgroundDrawable(C1391tv.m20459b(this, C0126R.C0127drawable.walletp2p_rounded_corner_rectangle));
            } else {
                this.f110695L.setBackgroundColor(getResources().getColor(C0126R.color.walletp2p_dialog_background));
            }
            this.f110722j = (ImageView) findViewById(C0126R.C0129id.wallet_lockup);
            if (chlq.m148935b()) {
                findViewById(C0126R.C0129id.payment_limits_link).setVisibility(0);
                findViewById(C0126R.C0129id.payment_limits_link).setOnClickListener(new axke(this));
            }
            this.f110700Q = (TextView) findViewById(C0126R.C0129id.nmls_legal_disclosure);
            this.f110701R = (TextView) findViewById(C0126R.C0129id.legal_string);
            this.f110702S = (Toolbar) findViewById(C0126R.C0129id.instrument_list_toolbar);
            this.f110703T = (Button) findViewById(C0126R.C0129id.instrument_list_cancel_button);
            this.f110704U = (Button) findViewById(C0126R.C0129id.instrument_list_save_button);
            if (chlq.m148935b()) {
                this.f110703T.setVisibility(0);
                this.f110704U.setVisibility(0);
                this.f110703T.setOnClickListener(new axkf(this));
                this.f110704U.setOnClickListener(new axkg(this));
            } else {
                this.f110704U.setVisibility(8);
                this.f110703T.setVisibility(8);
            }
            if (!chlh.m148921b()) {
                String trim = chln.f188751a.mo6606a().mo85330a().trim();
                if (!TextUtils.isEmpty(trim)) {
                    this.f110701R.setText(trim);
                    this.f110701R.setVisibility(0);
                } else {
                    this.f110701R.setVisibility(8);
                }
                this.f110700Q.setVisibility(0);
            }
            this.f110722j.setOnTouchListener(new axjx(this, new boolean[]{false}));
            this.f110713ad = 1;
            this.f110699P = (TextView) findViewById(C0126R.C0129id.account_name);
            this.f110737y = new adzt();
            this.f110715c.mo70855a(Locale.getDefault(), axmh.m82721a(this));
            this.f110690G.mo70855a(Locale.getDefault(), axmh.m82721a(this));
            mo53238P(3);
            if (bundle != null) {
                onRestoreInstanceState(bundle);
            }
            if (getIntent().hasExtra("account_name")) {
                TransferParams transferParams = this.f110725m;
                if (transferParams.f110648g && !transferParams.mo60153a() && this.f110725m.f110649h == null && !this.f110709Z && !this.f110711ab && chkf.f188707a.mo6606a().mo85298a()) {
                    axfi a = axfj.m82570a(this.f110725m, getIntent());
                    String stringExtra = getIntent().getStringExtra("account_name");
                    if (a.mo53084d() && !TextUtils.isEmpty(stringExtra)) {
                        mo53238P(133);
                        this.f110726n = stringExtra;
                        Intent a2 = axfi.m82533a(this.f110725m, getIntent());
                        a2.putExtra("calling_package", spn.m35852a((Activity) this));
                        startActivityForResult(a2, 1);
                        this.f110720h.setVisibility(8);
                    }
                }
            }
            int i = getResources().getDisplayMetrics().widthPixels;
            float dimension = getResources().getDimension(C0126R.dimen.abc_floating_window_z);
            int i2 = i - ((int) (dimension + dimension));
            if (((float) i2) < getResources().getDimension(C0126R.dimen.walletp2p_min_width)) {
                mo53238P(134);
                this.f110695L.setLayoutParams(new FrameLayout.LayoutParams(i2, -2));
            }
        } catch (Exception e3) {
            Log.e("TransferMoneyActivity", "Failed to extract TransferParams from Intent", e3);
            mo53238P(24);
            setResult(0);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        mo53238P(5);
        axif axif = this.f110738z;
        if (axif != null) {
            axif.mo53159a();
        }
        Handler handler = this.f110737y;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f110719g.getWindowToken(), 0);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        mo53238P(4);
        if (bundle != null && bundle.getBundle("g") != null) {
            Bundle bundle2 = bundle.getBundle("g");
            bundle2.setClassLoader(TransferMoneyChimeraActivity.class.getClassLoader());
            this.f110725m = (TransferParams) bundle2.getParcelable("a");
            this.f110728p = bundle2.getParcelableArrayList("d");
            this.f110729q = bundle2.getParcelableArrayList("e");
            this.f110730r = (FundsTransferNotices) bundle2.getParcelable("q");
            this.f110735w = (Instrument) bundle2.getParcelable("c");
            this.f110709Z = bundle2.getBoolean("k");
            this.f110726n = bundle2.getString("b");
            this.f110711ab = bundle2.getBoolean("f");
            this.f110725m.f110645d = bundle2.getString("j");
            this.f110710aa = bundle2.getString("l");
            this.f110713ad = bundle2.getInt("m");
            this.f110732t = bundle2.getByteArray("n");
            this.f110727o = bundle2.getBoolean("o");
            this.f110712ac = bundle2.getBoolean("p");
            this.f110731s = (LegalDocuments) bundle2.getParcelable("r");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        mo53238P(6);
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", this.f110725m);
        bundle2.putBoolean("k", this.f110709Z);
        bundle2.putBoolean("f", this.f110711ab);
        bundle2.putBoolean("p", this.f110712ac);
        List list = this.f110728p;
        if (list != null) {
            bundle2.putParcelableArrayList("d", new ArrayList(list));
        }
        List list2 = this.f110729q;
        if (list2 != null) {
            bundle2.putParcelableArrayList("e", new ArrayList(list2));
        }
        FundsTransferNotices fundsTransferNotices = this.f110730r;
        if (fundsTransferNotices != null) {
            bundle2.putParcelable("q", fundsTransferNotices);
        }
        Instrument instrument = this.f110735w;
        if (instrument != null) {
            bundle2.putParcelable("c", instrument);
        }
        String str = this.f110726n;
        if (str != null) {
            bundle2.putString("b", str);
        }
        EditText editText = this.f110719g;
        if (editText != null) {
            bundle2.putString("j", editText.getText().toString());
        }
        String str2 = this.f110710aa;
        if (str2 != null) {
            bundle2.putString("l", str2);
        }
        byte[] bArr = this.f110732t;
        if (bArr != null) {
            bundle2.putByteArray("n", bArr);
        }
        LegalDocuments legalDocuments = this.f110731s;
        if (legalDocuments != null) {
            bundle2.putParcelable("r", legalDocuments);
        }
        bundle2.putInt("m", this.f110713ad);
        bundle2.putBoolean("o", this.f110727o);
        bundle.putBundle("g", bundle2);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        mo53238P(11);
        super.onStart();
        if (!this.f110711ab) {
            if (!this.f110727o) {
                rjx rjx = this.f110685A;
                String a = spn.m35852a((Activity) this);
                roz b = rpa.m34196b();
                b.f43472a = new axeg(a);
                aucb a2 = rjx.mo24701a(b.mo24977a());
                a2.mo50376a(this, new axiw(this));
                a2.mo50372a(new axix(this));
            } else {
                mo60191e();
            }
        }
        String str = this.f110725m.f110645d;
        if (str != null) {
            this.f110719g.setText(str);
        }
    }

    /* renamed from: p */
    public final void mo60201p() {
        mo53238P(58);
        this.f110714b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), getString(C0126R.string.walletp2p_invalid_transaction_title), getString(C0126R.string.walletp2p_invalid_transaction_multiple_account_content), getString(C0126R.string.close_button_label), new axju(this), getString(C0126R.string.common_add_account_label), new axjv(this));
        this.f110720h.mo60211b(3);
    }

    /* renamed from: q */
    public final void mo60202q() {
        mo53238P(132);
        this.f110714b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), getString(C0126R.string.walletp2p_account_auth_error_title), getString(C0126R.string.walletp2p_account_auth_error_content), getString(C0126R.string.close_button_label), new axjw(this), null, null);
        this.f110720h.mo60211b(3);
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            this.f110711ab = true;
        }
        super.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public final void mo53155a(int i) {
        mo53238P(59);
        MoneyEntryLayout moneyEntryLayout = this.f110715c;
        if (moneyEntryLayout.f150669b.mo60933a(i)) {
            moneyEntryLayout.mo70856a(true);
        } else {
            moneyEntryLayout.mo70857b();
        }
    }

    /* renamed from: a */
    public final void mo60184a(Uri uri) {
        sdo.m34959a(uri);
        sdo.m34974b(uri.getPath().startsWith("/r/"));
        if (chlz.f188769a.mo6606a().mo85344a()) {
            mo53238P(115);
            startActivity(new Intent("android.intent.action.VIEW", uri.buildUpon().path(uri.getPath().replaceFirst("^/r/", "/n/")).build()));
        } else {
            Log.e("TransferMoneyActivity", "Web redirect is disabled.");
        }
        finish();
    }

    /* renamed from: b */
    public final void mo60190b(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f110715c.getLayoutParams();
        layoutParams.addRule(10, 0);
        layoutParams.addRule(15, 0);
        layoutParams.addRule(i);
        this.f110715c.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo60185a(ErrorDetails errorDetails) {
        mo53238P(116);
        this.f110714b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, getTheme()), errorDetails.f110804a, errorDetails.f110805b, getString(C0126R.string.close_button_label), new axjm(this), errorDetails.f110806c, errorDetails.f110807d != null ? new axjl(this, errorDetails) : null);
        this.f110720h.mo60211b(3);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: awlc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: awlb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: awlc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: awlc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo60186a(InstrumentCreationToken instrumentCreationToken) {
        awlc awlc;
        byte[] bArr = instrumentCreationToken.f110830d;
        if (bArr != null && bArr.length > 0) {
            awlb awlb = new awlb(this);
            awlb.mo52231a(instrumentCreationToken.f110830d);
            awlc = awlb;
        } else {
            awlc awlc2 = new awlc(this);
            awlc2.mo52233a(instrumentCreationToken.f110827a);
            awlc = awlc2;
        }
        awlc.mo52187a(axmb.m82713a(axmb.m82712a()));
        awlc.mo52188a(new Account(this.f110726n, "com.google"));
        awlc.mo52191b();
        awlc.mo52190a(axmh.m82720a());
        awlc.mo52192b(3);
        startActivityForResult(awlc.mo52186a(), 3);
        this.f110713ad = this.f110720h.f110753a;
    }

    /* renamed from: a */
    public final void mo60187a(Runnable runnable) {
        mo53238P(56);
        this.f110714b.mo60203a(aux.m2149a(getResources(), C0126R.C0127drawable.f7377x1c30a19, getTheme()), getString(C0126R.string.common_no_network), getString(C0126R.string.walletp2p_check_your_network_connection), getString(C0126R.string.close_button_label), new axjo(this), getString(C0126R.string.common_try_again), new axjq(this, runnable));
        this.f110720h.mo60211b(3);
    }

    /* renamed from: a */
    public final void mo60188a(String str, String str2, boolean z, axkn axkn) {
        mo53238P(46);
        rjx rjx = this.f110685A;
        roz b = rpa.m34196b();
        b.f43472a = new axed(str2, z, str);
        aucb a = rjx.mo24701a(b.mo24977a());
        a.mo50376a(this, new axjh(this, axkn, str, str2, z));
        a.mo50375a(this, new axji(this));
    }

    /* renamed from: a */
    public final void mo60189a(ArrayList arrayList, boolean z, boolean z2) {
        int i;
        mo53238P(49);
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            i = 0;
        } else {
            i = 1;
        }
        Intent a = rew.m33487a(null, arrayList, new String[]{"com.google"}, z, false, i);
        if (z2) {
            startActivityForResult(a, 4);
        } else {
            startActivityForResult(a, 2);
        }
    }
}
