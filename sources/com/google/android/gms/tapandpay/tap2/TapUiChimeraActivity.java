package com.google.android.gms.tapandpay.tap2;

import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.util.Linkify;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.GetPayCardArtRequest;
import com.google.android.gms.pay.PayCardArtInfo;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TapFailureUiInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import com.google.android.gms.tapandpay.widgets.cardlist.StackedCardsLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapUiChimeraActivity extends atex {

    /* renamed from: b */
    public static final srn f108685b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    static final long f108686c = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: d */
    public static final long f108687d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    public static final long f108688e = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: l */
    static final SparseIntArray f108689l;

    /* renamed from: A */
    public boolean f108690A;

    /* renamed from: B */
    public ValuableInfo[] f108691B = new ValuableInfo[0];

    /* renamed from: C */
    public boolean f108692C;

    /* renamed from: D */
    public adzt f108693D;

    /* renamed from: E */
    public SoundPool f108694E;

    /* renamed from: F */
    public int f108695F;

    /* renamed from: G */
    public TapFailureUiInfo f108696G;

    /* renamed from: H */
    public bnhe f108697H;

    /* renamed from: I */
    public int f108698I = 1;

    /* renamed from: J */
    private final AnimatorListenerAdapter f108699J = new atoe(this);

    /* renamed from: K */
    private final auh f108700K = new atog(this);

    /* renamed from: L */
    private final C0973ew f108701L = new C0973ew();

    /* renamed from: M */
    private final C0973ew f108702M = new C0973ew();

    /* renamed from: N */
    private final C0973ew f108703N = new C0973ew();

    /* renamed from: O */
    private final SparseIntArray f108704O = new SparseIntArray(1);

    /* renamed from: P */
    private boolean f108705P;

    /* renamed from: Q */
    private Runnable f108706Q;

    /* renamed from: R */
    private final Runnable f108707R = new atng(this);

    /* renamed from: S */
    private int f108708S;

    /* renamed from: T */
    private int f108709T;

    /* renamed from: U */
    private String f108710U;

    /* renamed from: V */
    private boolean f108711V = false;

    /* renamed from: W */
    private int f108712W = 1;

    /* renamed from: X */
    private int f108713X = 1;

    /* renamed from: f */
    public final BroadcastReceiver f108714f = new aacn("tapandpay") {
        /* class com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.C16623 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            TapUiChimeraActivity.this.finishAndRemoveTask();
        }
    };

    /* renamed from: g */
    public final Runnable f108715g = new atoh(this);

    /* renamed from: h */
    public final Queue f108716h = new ArrayDeque(4);

    /* renamed from: i */
    public boolean f108717i = true;

    /* renamed from: j */
    int f108718j;

    /* renamed from: k */
    int f108719k;

    /* renamed from: m */
    public atam f108720m;

    /* renamed from: n */
    public View f108721n;

    /* renamed from: o */
    public boolean f108722o;

    /* renamed from: p */
    public int f108723p = 0;

    /* renamed from: q */
    public ConstraintLayout f108724q;

    /* renamed from: r */
    ImageView f108725r;

    /* renamed from: s */
    public StackedCardsLayout f108726s;

    /* renamed from: t */
    TextSwitcher f108727t;

    /* renamed from: u */
    TextView f108728u;

    /* renamed from: v */
    boolean f108729v = true;

    /* renamed from: w */
    int f108730w = C0126R.C0127drawable.check_animated;

    /* renamed from: x */
    public LottieAnimationView f108731x;

    /* renamed from: y */
    public AccountInfo f108732y;

    /* renamed from: z */
    public CardInfo f108733z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f108689l = sparseIntArray;
        sparseIntArray.put(C0126R.C0127drawable.check_animated, C0126R.string.tp_tap_check_animated_desc);
        f108689l.put(C0126R.C0127drawable.error_animated, C0126R.string.tp_tap_error_animated_desc);
        f108689l.put(C0126R.C0127drawable.antenna_animated, C0126R.string.tp_tap_antenna_animated_desc);
    }

    /* renamed from: b */
    private final void m93159b(int i, int i2) {
        this.f108693D.removeCallbacks(this.f108706Q);
        this.f108706Q = null;
        atnf[] a = m93158a(i);
        if (i2 < a.length) {
            atnt atnt = new atnt(this, i, i2);
            this.f108706Q = atnt;
            this.f108693D.postDelayed(atnt, a[i2].f90542d);
        }
    }

    /* renamed from: m */
    private final void m93161m() {
        this.f108705P = false;
        this.f108713X = this.f108698I;
        this.f108698I = 1;
        this.f108692C = false;
        this.f108690A = false;
        this.f108695F = -1;
        this.f108696G = null;
    }

    /* renamed from: n */
    private final void m93162n() {
        if (this.f108691B.length == 0) {
            ((bnsl) f108685b.mo68388c()).mo68405a("Valuables finished without valuables. Ignore!");
            return;
        }
        m93164p();
        mo59414a(15, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void
     arg types: [int, android.widget.ImageView]
     candidates:
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, atne):atne
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(android.view.View, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(auc, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(java.lang.String, java.lang.Runnable):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void */
    /* renamed from: o */
    private final void m93163o() {
        boolean z = true;
        if (this.f108733z != null) {
            m93156a(true, (ImageView) this.f108726s.getChildAt(this.f108691B.length));
        }
        if (this.f108733z == null) {
            z = false;
        }
        this.f108690A = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void
     arg types: [int, android.widget.ImageView]
     candidates:
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, atne):atne
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(android.view.View, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(auc, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(java.lang.String, java.lang.Runnable):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void */
    /* renamed from: p */
    private final void m93164p() {
        int length;
        boolean z = false;
        int i = 0;
        while (true) {
            length = this.f108691B.length;
            if (i >= length) {
                break;
            }
            m93156a(true, (ImageView) this.f108726s.getChildAt(i));
            i++;
        }
        if (length > 0) {
            z = true;
        }
        this.f108692C = z;
    }

    /* renamed from: q */
    private final boolean m93165q() {
        return Boolean.TRUE.equals(this.f108731x.getTag(C0126R.C0129id.lottie_animation_is_set));
    }

    /* renamed from: r */
    private final void m93166r() {
        this.f108726s.removeAllViews();
        this.f108733z = null;
        this.f108691B = new ValuableInfo[0];
    }

    /* renamed from: s */
    private final void m93167s() {
        this.f108693D.removeCallbacks(this.f108707R);
        rjx.m33697b((Activity) this).mo24738c(100);
    }

    /* renamed from: t */
    private final void m93168t() {
        if (!cgwk.f187853a.mo6606a().mo84570c()) {
            return;
        }
        if (ssw.m36269a()) {
            rjx b = rjx.m33697b((Activity) this);
            roz b2 = rpa.m34196b();
            b2.f43472a = asmv.f89260a;
            b2.f43473b = new Feature[]{asih.f89020d};
            b.mo24701a(b2.mo24977a());
            return;
        }
        int i = Build.VERSION.SDK_INT;
        atxn.m76509d(this, new Intent("com.google.android.gms.tapandpay.tap.STARTED"));
    }

    /* renamed from: e */
    public final atf mo59419e() {
        asy asy = new asy(null);
        m93153a(asy, 1);
        ask ask = new ask();
        m93153a(ask, 2);
        atn atn = new atn();
        atn.mo2465a(LottieAnimationView.class);
        atn.f2182j = atc.m2002a(atn.f2182j, LottieAnimationView.class);
        atn.mo2467a(1);
        atn.mo2493b(1);
        atn.mo2491a(ask);
        atn atn2 = new atn();
        atn2.mo2493b(0);
        atn2.mo2491a(asy);
        atn2.mo2491a(new atnd());
        atn2.mo2491a(new ash());
        atn2.mo2491a(new asd());
        atn2.mo2491a(new atnc());
        ask ask2 = new ask();
        ask2.f2179g = atc.m2002a(ask2.f2179g, Integer.valueOf((int) C0126R.C0129id.card));
        atn2.mo2491a(ask2);
        atn.mo2491a(atn2);
        return atn;
    }

    /* renamed from: g */
    public final void mo59420g() {
        if (this.f108733z == null && this.f108691B.length == 0) {
            ((bnsl) f108685b.mo68388c()).mo68405a("Payment finished, but no cards present. Ignore!");
            return;
        }
        this.f108705P = true;
        this.f108713X = 1;
        this.f108709T = 0;
        m93164p();
        m93163o();
        mo59414a(11, 0);
    }

    /* renamed from: h */
    public final void mo59421h() {
        String a = stm.m36299a((String) this.f108731x.getTag());
        boolean z = cgwn.m147264n() && this.f108733z == null;
        if (!this.f108711V && !z && m93165q()) {
            this.f108725r.setVisibility(4);
            this.f108731x.setVisibility(0);
            this.f108731x.mo4047a(this.f108699J);
            this.f108731x.mo4042a();
            AccountInfo accountInfo = this.f108732y;
            Intent startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.tapandpay.tapreporting.ReportDoodleRenderedIntentOperation", "com.google.android.gms.tapandpay.tapreporting.REPORT_DOODLE_RENDERED");
            startIntent.putExtra("accountName", accountInfo);
            bxvd da = btpj.f149850c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((btpj) da.f164949b).f149852a = a;
            bxyk a2 = atyh.m76556a(System.currentTimeMillis());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((btpj) da.f164949b).f149853b = a2;
            startIntent.putExtra("doodle_rendered_info", ((btpj) da.mo74062i()).mo73642k());
            startService(startIntent);
            this.f108720m.mo49749a(a, 3, 1);
            return;
        }
        mo59423j();
        if (TextUtils.isEmpty(a)) {
            this.f108720m.mo49749a("", 2, 1);
        } else if (this.f108711V) {
            this.f108720m.mo49749a(a, 5, 1);
        } else {
            this.f108720m.mo49749a(a, 4, 2);
        }
    }

    /* renamed from: i */
    public final void mo59422i() {
        this.f108693D.removeCallbacks(this.f108707R);
        String str = this.f108710U;
        if (str != null) {
            rjx b = rjx.m33697b((Activity) this);
            long j = f108686c;
            b.mo24728a(str, j + j, 100);
        }
        this.f108693D.postDelayed(this.f108707R, f108686c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator
     arg types: [int, android.view.View]
     candidates:
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, atne):atne
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(android.view.View, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(auc, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(java.lang.String, java.lang.Runnable):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator */
    /* renamed from: j */
    public final void mo59423j() {
        if (this.f108717i) {
            m93167s();
            this.f108717i = false;
            this.f108693D.removeCallbacks(this.f108706Q);
            if (!this.f108721n.isAttachedToWindow()) {
                finish();
                return;
            }
            Animator a = m93146a(false, this.f108721n);
            a.addListener(new atok(this));
            a.start();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, int]
     candidates:
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, atne):atne
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(android.view.View, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(auc, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(java.lang.String, java.lang.Runnable):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void */
    /* renamed from: l */
    public final void mo59424l() {
        int i;
        int i2;
        boolean z;
        String str;
        while (!this.f108716h.isEmpty() && this.f108717i) {
            Intent intent = (Intent) this.f108716h.remove();
            int intExtra = intent.getIntExtra("eventType", 0);
            if (intExtra == 0) {
                finish();
            } else {
                atj.m2053a(this.f108724q, mo59419e());
                int i3 = 8;
                this.f108731x.setVisibility(8);
                TapFailureUiInfo tapFailureUiInfo = null;
                this.f108731x.setTag(C0126R.C0129id.lottie_animation_is_set, null);
                this.f108731x.mo4059d();
                this.f108725r.setVisibility(0);
                this.f108701L.mo10545b(this.f108724q);
                this.f108728u.setVisibility(8);
                int length = this.f108691B.length;
                if (this.f108733z == null) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i4 = length + i;
                StackedCardsLayout stackedCardsLayout = this.f108726s;
                stackedCardsLayout.removeViews(i4, stackedCardsLayout.getChildCount() - i4);
                if (intent.hasExtra("tapDoodle")) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("tapDoodle");
                    try {
                        btpm btpm = (btpm) GeneratedMessageLite.m124016a(btpm.f149860e, byteArrayExtra, bxus.m123744c());
                        this.f108731x.setTag(btpm.f149862a);
                        if (!btpm.f149865d.isEmpty()) {
                            this.f108731x.setTag(C0126R.C0129id.lottie_animation_is_set, Boolean.TRUE);
                            this.f108731x.mo4055b(btpm.f149865d);
                        } else {
                            this.f108731x.setTag(C0126R.C0129id.lottie_animation_is_set, Boolean.FALSE);
                        }
                    } catch (bxwf e) {
                        bnsl bnsl = (bnsl) f108685b.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68405a("Doodle serialization problem");
                        this.f108731x.setTag(null);
                    }
                }
                m93168t();
                switch (intExtra) {
                    case 2:
                        if (this.f108705P) {
                            m93161m();
                            this.f108726s.removeViews(0, this.f108691B.length);
                            this.f108691B = new ValuableInfo[0];
                        }
                        m93164p();
                        m93154a((CardInfo) intent.getParcelableExtra("paymentCardInfo"), false);
                        mo59414a(10, 0);
                        continue;
                    case 3:
                        m93160b(intent);
                        continue;
                    case 4:
                        m93162n();
                        continue;
                    case 5:
                    case 7:
                        if (this.f108691B.length != 0 || this.f108733z != null) {
                            this.f108705P = true;
                            this.f108695F = intent.getIntExtra("failedReason", 0);
                            if (intent.hasExtra("failedUiInfo")) {
                                tapFailureUiInfo = (TapFailureUiInfo) sef.m35067a(intent, "failedUiInfo", TapFailureUiInfo.CREATOR);
                            }
                            this.f108696G = tapFailureUiInfo;
                            int i5 = this.f108695F;
                            int i6 = 11;
                            if (tapFailureUiInfo != null) {
                                i3 = 22;
                            } else if (i5 == 1 || i5 == 7) {
                                i3 = 2;
                            } else if (i5 == 9) {
                                i3 = 5;
                            } else if (i5 != 11) {
                                if (i5 != 19) {
                                    if (i5 == 38) {
                                        i3 = 25;
                                    } else if (i5 != 4) {
                                        if (i5 != 5) {
                                            if (i5 != 13) {
                                                if (i5 != 14) {
                                                    switch (i5) {
                                                        case 21:
                                                            break;
                                                        case 22:
                                                        case 23:
                                                            break;
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                            break;
                                                        case 27:
                                                        case 28:
                                                        case 29:
                                                            break;
                                                        case 30:
                                                            i3 = 17;
                                                            break;
                                                        case 31:
                                                            i3 = 20;
                                                            break;
                                                        case 32:
                                                            i3 = 18;
                                                            break;
                                                        case 33:
                                                            i3 = 21;
                                                            break;
                                                        case 34:
                                                            i3 = 19;
                                                            break;
                                                        case 35:
                                                            i3 = 23;
                                                            break;
                                                        case 36:
                                                            i3 = 24;
                                                            break;
                                                        default:
                                                            i3 = 14;
                                                            break;
                                                    }
                                                }
                                            }
                                            i3 = 7;
                                        }
                                        i3 = 4;
                                    }
                                }
                                i3 = 3;
                            } else {
                                i3 = 6;
                            }
                            this.f108698I = i3;
                            if (i3 == this.f108713X) {
                                i2 = this.f108709T + 1;
                            } else {
                                i2 = 1;
                            }
                            this.f108709T = i2;
                            if (!this.f108692C && !this.f108690A) {
                                i6 = i3;
                            }
                            if (i3 - 1 == 2) {
                                if (asjk.m74228b(this)) {
                                    int i7 = Build.VERSION.SDK_INT;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Intent flags = new Intent().setFlags(537198592);
                                if (!z) {
                                    str = "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity";
                                } else {
                                    str = "com.google.android.gms.tapandpay.ui.SecureDeviceActivity";
                                }
                                startActivityForResult(flags.setClassName(this, str).putExtra("extra_card_info", this.f108733z), 1);
                                mo59414a(3, 0);
                                break;
                            } else {
                                mo59414a(i6, 0);
                                break;
                            }
                        } else {
                            ((bnsl) f108685b.mo68388c()).mo68405a("Failure without a card. Ignore!");
                            continue;
                        }
                    case 6:
                        mo59420g();
                        continue;
                    case 8:
                        m93160b(intent);
                        m93162n();
                        continue;
                    default:
                        StringBuilder sb = new StringBuilder(35);
                        sb.append("Unsupported event type: ");
                        sb.append(intExtra);
                        throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
                i3 = 3;
            } else {
                i3 = 16;
            }
            this.f108698I = i3;
            if (this.f108692C) {
                i3 = 11;
            } else if (this.f108690A) {
                i3 = 11;
            }
            atj.m2053a(this.f108724q, mo59419e());
            mo59414a(i3, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108693D = new adzt();
        int intExtra = getIntent().getIntExtra("eventType", 0);
        if (intExtra == 2 || intExtra == 3 || intExtra == 8) {
            setTheme(2132018963);
            sre.m36089i(this);
            getWindow().addFlags(524416);
            m93168t();
            int i = Build.VERSION.SDK_INT;
            setRequestedOrientation(1);
            this.f108718j = bqcn.m112585b(cgxr.f187985a.mo6606a().mo84704p());
            this.f108719k = bqcn.m112585b(cgxr.f187985a.mo6606a().mo84702n());
            registerReceiver(this.f108714f, new IntentFilter("android.intent.action.SCREEN_OFF"));
            overridePendingTransition(0, 0);
            setContentView((int) C0126R.C0128layout.tp_tap_ui_activity);
            this.f108693D.post(this.f108715g);
            if (this.f108694E == null) {
                this.f108694E = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(10).build()).build();
            }
            this.f108704O.put(C0126R.raw.confirmation, this.f108694E.load(this, C0126R.raw.confirmation, 1));
            this.f108721n = findViewById(C0126R.C0129id.root_layout);
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C0126R.C0129id.main_layout);
            this.f108724q = constraintLayout;
            this.f108701L.mo10543a(constraintLayout);
            this.f108702M.mo10543a((ConstraintLayout) LayoutInflater.from(this).inflate((int) C0126R.C0128layout.tp_tap_ui_no_card, (ViewGroup) null));
            C0973ew ewVar = this.f108703N;
            C0973ew ewVar2 = this.f108702M;
            ewVar.f15914a.clear();
            for (Integer num : ewVar2.f15914a.keySet()) {
                ewVar.f15914a.put(num, ((C0972ev) ewVar2.f15914a.get(num)).clone());
            }
            String b = cgww.m147415b();
            if (!TextUtils.isEmpty(b)) {
                String[] split = TextUtils.split(b, ",");
                if (split.length != 2) {
                    ((bnsl) f108685b.mo68388c()).mo68405a("Wrong number of tokens in antenna location");
                } else {
                    try {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        ewVar.mo10540a((int) C0126R.C0129id.guidelineVertical, ((float) parseInt) / 100.0f);
                        ewVar.mo10540a((int) C0126R.C0129id.guidelineHorizontal, ((float) parseInt2) / 100.0f);
                        if (parseInt2 > 50) {
                            ewVar.mo10544b(4, C0126R.C0129id.animationView);
                            ewVar.mo10544b(3, C0126R.C0129id.main_layout);
                            ewVar.mo10539a((int) C0126R.C0129id.text_view).f15864v = 0.9f;
                        }
                    } catch (NumberFormatException e) {
                        ((bnsl) f108685b.mo68388c()).mo68420a("Unable to parse antenna location: %s", b);
                    }
                }
            }
            this.f108725r = (ImageView) findViewById(C0126R.C0129id.animationView);
            this.f108726s = (StackedCardsLayout) findViewById(C0126R.C0129id.card_list);
            this.f108727t = (TextSwitcher) findViewById(C0126R.C0129id.text_view);
            this.f108731x = (LottieAnimationView) findViewById(C0126R.C0129id.lottie_doodle);
            TextView textView = (TextView) findViewById(C0126R.C0129id.sendFeedback);
            this.f108728u = textView;
            textView.setOnClickListener(new atnr(this));
            AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("accountInfo");
            sdo.m34959a(accountInfo);
            this.f108732y = accountInfo;
            this.f108720m = new atam(this, this.f108732y);
            if (bundle != null) {
                CardInfo cardInfo = (CardInfo) bundle.getParcelable("payment-card");
                if (cardInfo != null) {
                    m93154a(cardInfo, bundle.getBoolean("payment-card-succeeded"));
                }
                Parcelable[] parcelableArray = bundle.getParcelableArray("valuable-infos");
                ValuableInfo[] valuableInfoArr = (ValuableInfo[]) Arrays.copyOf(parcelableArray, parcelableArray.length, ValuableInfo[].class);
                if (valuableInfoArr.length > 0) {
                    m93157a(valuableInfoArr, bundle.getBoolean("valuables-succeeded"));
                }
                int a = bpbd.m111743a(bundle.getInt("animation-id"));
                if (a == 0) {
                    a = 1;
                }
                int i2 = bundle.getInt("animation-step");
                int a2 = bpbd.m111743a(bundle.getInt("failure-reason"));
                if (a2 == 0) {
                    a2 = 1;
                }
                int a3 = bpbd.m111743a(bundle.getInt("previous-failure-reason"));
                if (a3 == 0) {
                    a3 = 1;
                }
                int i3 = bundle.getInt("failure-reason");
                this.f108698I = a2;
                this.f108713X = a3;
                this.f108695F = i3;
                this.f108696G = (TapFailureUiInfo) bundle.getParcelable("failure-ui-info");
                this.f108709T = bundle.getInt("failure-count", 0);
                this.f108705P = bundle.getBoolean("tap-finished");
                m93150a(a, i2, true);
            } else {
                this.f108724q.addOnLayoutChangeListener(new atoi(this));
                this.f108716h.offer(getIntent());
            }
            if (cgwn.f187872a.mo6606a().mo84591F()) {
                boolean booleanExtra = getIntent().getBooleanExtra("expedited", false);
                this.f108711V = booleanExtra;
                if (booleanExtra) {
                    this.f108719k = bqcn.m112585b(cgxr.m147491d());
                }
            }
            if (this.f108729v) {
                this.f108730w = C0126R.C0127drawable.check_animated_gpay;
                return;
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        m93167s();
        adzt adzt = this.f108693D;
        if (adzt != null) {
            adzt.removeCallbacks(this.f108715g);
        }
        try {
            unregisterReceiver(this.f108714f);
        } catch (IllegalArgumentException e) {
        }
        atam atam = this.f108720m;
        if (atam != null) {
            if (!this.f108722o) {
                int i = this.f108723p;
                int i2 = i != 1 ? i != 2 ? 1 : 3 : 2;
                bxvd g = atam.mo49765g(145);
                bxvd da = bozy.f135464c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozy bozy = (bozy) da.f164949b;
                bozy.f135467b = i2 - 1;
                bozy.f135466a |= 1;
                if (g.f164950c) {
                    g.mo74035c();
                    g.f164950c = false;
                }
                bpbx bpbx = (bpbx) g.f164949b;
                bozy bozy2 = (bozy) da.mo74062i();
                bpbx bpbx2 = bpbx.f135635S;
                bozy2.getClass();
                bpbx.f135649M = bozy2;
                bpbx.f135656b |= 1024;
                atam.mo49741a((bpbx) g.mo74062i());
            }
            atam atam2 = this.f108720m;
            int i3 = this.f108712W;
            int i4 = this.f108708S;
            bxvd g2 = atam2.mo49765g(72);
            bxvd da2 = bpbe.f135585e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpbe bpbe = (bpbe) da2.f164949b;
            int i5 = i3 - 1;
            if (i3 != 0) {
                bpbe.f135589c = i5;
                int i6 = bpbe.f135587a | 2;
                bpbe.f135587a = i6;
                bpbe.f135587a = i6 | 4;
                bpbe.f135590d = i4;
                if (g2.f164950c) {
                    g2.mo74035c();
                    g2.f164950c = false;
                }
                bpbx bpbx3 = (bpbx) g2.f164949b;
                bpbe bpbe2 = (bpbe) da2.mo74062i();
                bpbx bpbx4 = bpbx.f135635S;
                bpbe2.getClass();
                bpbx3.f135679y = bpbe2;
                bpbx3.f135655a |= 67108864;
                atam2.mo49741a((bpbx) g2.mo74062i());
            } else {
                throw null;
            }
        }
        ImageView imageView = this.f108725r;
        if (imageView != null) {
            aui aui = (aui) imageView.getDrawable();
            if (aui != null) {
                aui.mo2526a();
                aui.stop();
            }
            this.f108725r.setImageDrawable(null);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f108716h.offer(intent);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        asuw.m74879b(this);
        this.f108693D.removeCallbacks(this.f108706Q);
        this.f108706Q = null;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        asuw.m74877a(this);
        m93159b(this.f108712W, this.f108708S + 1);
        mo59424l();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i = this.f108712W;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("animation-id", i2);
            bundle.putInt("animation-step", this.f108708S);
            bundle.putParcelable("payment-card", this.f108733z);
            bundle.putBoolean("payment-card-succeeded", this.f108690A);
            int i3 = this.f108698I;
            int i4 = i3 - 1;
            if (i3 != 0) {
                bundle.putInt("failure-reason", i4);
                int i5 = this.f108713X;
                int i6 = i5 - 1;
                if (i5 != 0) {
                    bundle.putInt("previous-failure-reason", i6);
                    bundle.putParcelableArray("valuable-infos", this.f108691B);
                    bundle.putBoolean("valuables-succeeded", this.f108692C);
                    bundle.putBoolean("tap-finished", this.f108705P);
                    bundle.putInt("failure-count", this.f108709T);
                    bundle.putInt("failure-reason", this.f108695F);
                    bundle.putParcelable("failure-ui-info", this.f108696G);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Tap");
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Animator m93146a(boolean z, View view) {
        int[] iArr = new int[2];
        this.f108725r.getLocationOnScreen(iArr);
        int height = this.f108725r.getHeight() / 2;
        int i = iArr[0] + height;
        int i2 = iArr[1] + height;
        float hypot = (float) Math.hypot((double) (view.getWidth() - i), (double) (view.getHeight() - i2));
        float f = z ? (float) height : hypot;
        if (!z) {
            hypot = 0.0f;
        }
        return ViewAnimationUtils.createCircularReveal(view, i, i2, f, hypot);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.tapandpay.widgets.cardlist.StackedCardsLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final ImageView m93147a(CardInfo cardInfo) {
        asjs asjs = new asjs(this, this.f108732y.f108326b);
        ImageView imageView = (ImageView) getLayoutInflater().inflate((int) C0126R.C0128layout.tp_view_card, (ViewGroup) this.f108726s, false);
        asju.m74252a(asjs, cardInfo, imageView);
        m93152a(imageView);
        return imageView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void
     arg types: [com.google.android.gms.tapandpay.firstparty.ValuableInfo[], int]
     candidates:
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, atne):atne
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(android.view.View, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(auc, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(java.lang.String, java.lang.Runnable):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void */
    /* renamed from: b */
    private final void m93160b(Intent intent) {
        if (this.f108705P) {
            m93161m();
            if (this.f108733z != null) {
                this.f108726s.removeViewAt(this.f108691B.length);
                this.f108733z = null;
            }
        }
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("valuables");
        m93163o();
        m93157a((ValuableInfo[]) Arrays.copyOf(parcelableArrayExtra, parcelableArrayExtra.length, ValuableInfo[].class), false);
        mo59414a(10, 0);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private final atne m93148a(int i, atne atne) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i - 1;
        if (i != 0) {
            int i8 = C0126R.C0127drawable.howto_animated;
            switch (i7) {
                case 1:
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90538p = "No Credential";
                    if (!ssk.m36235a(this)) {
                        i2 = C0126R.string.tp_tap_ui_no_credential_no_network;
                    } else {
                        i2 = C0126R.string.tp_tap_ui_no_credential_network;
                    }
                    atne.f90530h = getString(i2);
                    atne.mo50053c();
                    return atne;
                case 2:
                    atne.f90538p = "Device Locked";
                    atne.mo50053c();
                    atne.f90530h = getString(C0126R.string.tp_tap_locked_prompt);
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    return atne;
                case 3:
                    Intent className = new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity");
                    atne.f90538p = "Setup Required";
                    atne.f90528f = new atnj(this, className);
                    return atne;
                case 4:
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90538p = "Attestation Failure";
                    if (cgwn.m147254d()) {
                        str = getString(C0126R.string.tp_tap_ui_attestation_failure, new Object[]{cgww.m147416c()});
                    } else {
                        str = getString(C0126R.string.tp_tap_ui_attestation);
                    }
                    atne.f90530h = str;
                    atne.mo50053c();
                    if (cgwn.m147254d()) {
                        atne.f90531i = true;
                    }
                    return atne;
                case 5:
                    boolean isEmpty = TextUtils.isEmpty(cgww.m147415b());
                    boolean z = !isEmpty;
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_ui_tear_prompt);
                    atne.mo50053c();
                    atne a = atne.mo50050a((long) this.f108718j);
                    a.f90527e = this.f108703N;
                    a.mo50052b();
                    a.f90525c = true;
                    a.mo50053c();
                    if (!isEmpty) {
                        i3 = C0126R.string.tp_tap_ui_tear_antenna_prompt;
                    } else {
                        i3 = C0126R.string.tp_tap_ui_tear2_prompt;
                    }
                    a.f90530h = getString(i3);
                    if (!isEmpty) {
                        i8 = C0126R.C0127drawable.antenna_animated;
                    }
                    a.f90523a = i8;
                    if (z) {
                        a.f90528f = new atnk(this);
                    }
                    return a;
                case 6:
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    if (this.f108709T == 1) {
                        i4 = C0126R.string.tp_tap_ui_reader_error1;
                    } else {
                        i4 = C0126R.string.tp_tap_ui_reader_error2;
                    }
                    atne.f90530h = getString(i4);
                    atne.mo50053c();
                    return atne;
                case 7:
                    atne.f90538p = "Card Not Supported";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_ui_unsupported_prompt);
                    atne.mo50053c();
                    atne.f90528f = new atnl(this);
                    return atne;
                case 9:
                    atne.mo50051a();
                    atne.f90523a = C0126R.C0127drawable.progress_animated;
                    atne.mo50052b();
                    atne a2 = atne.mo50050a(cgxr.f187985a.mo6606a().mo84701m());
                    a2.f90528f = new atoa(this);
                    return a2;
                case 10:
                    atne.f90523a = this.f108730w;
                    atne.f90533k = C0126R.raw.confirmation;
                    atne.mo50051a();
                    if (this.f108698I != 1) {
                        atne a3 = atne.mo50050a((long) this.f108718j);
                        a3.f90528f = new atnh(this);
                        return a3;
                    } else if (m93165q()) {
                        atne.f90523a = 0;
                        atne.f90528f = new atoc(this);
                        atne.f90538p = "Tap Success";
                        return atne;
                    } else {
                        int i9 = this.f108719k;
                        if (cgwn.m147264n() && this.f108733z == null) {
                            i9 = bqcn.m112585b(cgxr.m147491d());
                        }
                        atne a4 = atne.mo50050a((long) i9);
                        a4.f90538p = "Tap Success";
                        a4.f90528f = new atod(this);
                        return a4;
                    }
                case 11:
                    atne.f90523a = C0126R.C0127drawable.howto_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_unlocked_prompt);
                    atne.mo50052b();
                    return atne;
                case 12:
                    atne.f90530h = getString(C0126R.string.tp_tap_ui_override_choice_prompt);
                    atne.f90529g = new atni(this);
                    return atne;
                case 14:
                    atne a5 = atne.mo50050a(cgxr.m147489b());
                    a5.f90528f = new atob(this);
                    return a5;
                case 15:
                    atne.mo50053c();
                    atne.f90530h = getString(C0126R.string.tp_tap_unlocked_prompt);
                    atne.mo50052b();
                    atne.f90523a = C0126R.C0127drawable.howto_animated;
                    return atne;
                case 16:
                    atne a6 = atne.mo50050a(cgxr.m147489b());
                    long j = (long) this.f108709T;
                    long l = cgxr.f187985a.mo6606a().mo84700l();
                    if (j < l) {
                        i5 = 6;
                    } else {
                        i5 = 8;
                    }
                    atne a7 = m93148a(i5, a6);
                    if (j < l) {
                        i6 = C0126R.string.tp_tap_ui_ppse_error_tear;
                    } else {
                        i6 = C0126R.string.tp_tap_ui_ppse_error_unsupported;
                    }
                    a6.f90530h = getString(i6);
                    return a7;
                case 17:
                    atne.f90538p = "Transit Invalid Ticket";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_transit_invalid_ticket_prompt);
                    return atne;
                case 18:
                    atne.f90538p = "Transit Suspended Ticket";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_transit_suspended_ticket_prompt);
                    return atne;
                case 19:
                    ((bnsl) f108685b.mo68390d()).mo68405a("Flow transit insufficient balance");
                    atne.f90538p = "Transit Insufficient Balance";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_transit_insufficient_balance_prompt);
                    return atne;
                case 20:
                    atne.f90538p = "Transit Expired Ticket";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_transit_expired_ticket_prompt);
                    return atne;
                case 21:
                    TapFailureUiInfo tapFailureUiInfo = this.f108696G;
                    if (tapFailureUiInfo == null) {
                        ((bnsl) f108685b.mo68388c()).mo68405a("No customTapFailureInfo found when in custom error flow");
                        break;
                    } else {
                        atne.f90538p = tapFailureUiInfo.f108445d;
                        atne.f90523a = C0126R.C0127drawable.error_animated;
                        atne.f90530h = tapFailureUiInfo.f108442a;
                        String str2 = tapFailureUiInfo.f108443b;
                        atne.f90536n = new atnm(this);
                        atne.f90537o = str2;
                        return atne;
                    }
                case 22:
                    atne.f90538p = "Transit Passback";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_transit_passback_prompt);
                    return atne;
                case 23:
                    atne.f90538p = "Transit Unactivated Ticket";
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90530h = getString(C0126R.string.tp_tap_transit_unactivated_ticket_prompt);
                    return atne;
                case 24:
                    m93166r();
                    atne.f90523a = C0126R.C0127drawable.error_animated;
                    atne.f90538p = "Bundle On Different Account";
                    atne.f90530h = getString(C0126R.string.tp_tap_ui_bundle_on_different_account);
                    return atne;
            }
            atne.f90528f = new atnn(this);
            return atne;
        }
        throw null;
    }

    /* renamed from: a */
    private final String m93149a(ValuableInfo valuableInfo) {
        if (!TextUtils.isEmpty(valuableInfo.f108492l)) {
            return valuableInfo.f108492l;
        }
        String a = stm.m36299a(valuableInfo.f108481a);
        String a2 = stm.m36299a(valuableInfo.f108482b);
        int i = valuableInfo.f108487g;
        if (i == 1) {
            return getString(C0126R.string.tp_loyalty_description, new Object[]{a, a2, valuableInfo.f108483c, valuableInfo.f108490j});
        } else if (i == 2) {
            return getString(C0126R.string.tp_offer_description, new Object[]{a});
        } else if (i != 3) {
            return i != 4 ? "" : a;
        } else {
            return getString(C0126R.string.tp_giftcard_description, new Object[]{a2, valuableInfo.f108490j});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        if (r19 == false) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final void m93150a(int i, int i2, boolean z) {
        Runnable runnable;
        Runnable runnable2;
        String str;
        int i3 = i;
        int i4 = i2;
        if (i3 != this.f108712W || i4 != this.f108708S) {
            this.f108712W = i3;
            this.f108708S = i4;
            atnf[] a = m93158a(i);
            if (i4 < a.length) {
                atnf atnf = a[i4];
                int i5 = atnf.f90539a;
                if (i5 != 0) {
                    aun a2 = aun.m2131a(this, i5);
                    int i6 = f108689l.get(atnf.f90539a);
                    if (this.f108725r.getDrawable() instanceof aui) {
                        aui aui = (aui) this.f108725r.getDrawable();
                        aui.mo2526a();
                        aui.stop();
                    }
                    this.f108725r.setImageDrawable(a2);
                    ImageView imageView = this.f108725r;
                    if (i6 != 0) {
                        str = getString(i6);
                    } else {
                        str = "";
                    }
                    imageView.setContentDescription(str);
                    if (atnf.f90540b) {
                        a2.mo2540a(this.f108700K);
                    }
                    a2.start();
                }
                C0973ew ewVar = atnf.f90543e;
                if (ewVar != null) {
                    ewVar.mo10545b(this.f108724q);
                }
                if (atnf.f90541c) {
                    m93166r();
                }
                int i7 = 8;
                if ("-1".equals(atnf.f90546h)) {
                    this.f108727t.setText("");
                    if (((TextView) this.f108727t.getCurrentView()).getMinLines() == 0) {
                        this.f108727t.setVisibility(8);
                    }
                } else if (!TextUtils.isEmpty(atnf.f90546h)) {
                    if (atnf.f90547i) {
                        TextSwitcher textSwitcher = this.f108727t;
                        Spanned a3 = C1212ne.m19667a(atnf.f90546h, 0);
                        URLSpan[] uRLSpanArr = (URLSpan[]) a3.getSpans(0, a3.length(), URLSpan.class);
                        SpannableString spannableString = new SpannableString(a3);
                        Linkify.addLinks(spannableString, 1);
                        for (URLSpan uRLSpan : uRLSpanArr) {
                            int spanEnd = a3.getSpanEnd(uRLSpan);
                            int spanStart = a3.getSpanStart(uRLSpan);
                            spannableString.setSpan(uRLSpan, spanStart, spanEnd, 0);
                            spannableString.setSpan(new UnderlineSpan() {
                                /* class com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.C16636 */

                                public final void updateDrawState(TextPaint textPaint) {
                                    textPaint.setUnderlineText(false);
                                }
                            }, spanStart, spanEnd, 0);
                        }
                        textSwitcher.setText(spannableString);
                        ((TextView) textSwitcher.getCurrentView()).setMovementMethod(LinkMovementMethod.getInstance());
                    } else {
                        this.f108727t.setText(atnf.f90546h);
                    }
                    this.f108727t.setVisibility(0);
                }
                TextView textView = this.f108728u;
                if (atnf.f90549k) {
                    sre.m36089i(this);
                    i7 = 0;
                }
                textView.setVisibility(i7);
                if (!TextUtils.isEmpty(atnf.f90551m) && (runnable2 = atnf.f90550l) != null) {
                    mo59417a(atnf.f90551m, runnable2);
                }
                int i8 = atnf.f90548j;
                if (i8 != 0) {
                    if (!z) {
                        int i9 = this.f108704O.get(i8);
                        if (this.f108694E.play(i9, 1.0f, 1.0f, 1, 0, 1.0f) == 0) {
                            this.f108694E.setOnLoadCompleteListener(new atnz(this, i9));
                        }
                        if (!TextUtils.isEmpty(atnf.f90552n)) {
                            asjl.m74237b(this, atnf.f90552n);
                        }
                        m93159b(i3, i4 + 1);
                        runnable = atnf.f90544f;
                        if (runnable == null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                }
                Runnable runnable3 = atnf.f90545g;
                if (runnable3 != null) {
                    runnable3.run();
                }
                if (!TextUtils.isEmpty(atnf.f90552n)) {
                }
                m93159b(i3, i4 + 1);
                runnable = atnf.f90544f;
                if (runnable == null) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m93151a(View view, int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.rightMargin = dimensionPixelSize;
        marginLayoutParams.leftMargin = dimensionPixelSize;
        this.f108726s.updateViewLayout(view, marginLayoutParams);
    }

    /* renamed from: a */
    public static void m93152a(ImageView imageView) {
        imageView.setOutlineProvider(atnb.f90522a);
        imageView.setClipToOutline(true);
    }

    /* renamed from: a */
    private final void m93153a(auc auc, int i) {
        if (auc.f2178f == null) {
            auc.f2178f = new ArrayList();
        }
        auc.f2178f.add(ImageView.class);
        ImageView imageView = this.f108725r;
        ArrayList arrayList = auc.f2180h;
        if (imageView != null) {
            arrayList = atc.m2002a(arrayList, imageView);
        }
        auc.f2180h = arrayList;
        auc.f2254u = i;
    }

    /* renamed from: a */
    private final void m93154a(CardInfo cardInfo, boolean z) {
        if (cardInfo.equals(this.f108733z)) {
            m93156a(z, (ImageView) this.f108726s.getChildAt(this.f108691B.length));
            return;
        }
        if (this.f108733z != null) {
            this.f108726s.removeViewAt(this.f108691B.length);
        }
        this.f108733z = cardInfo;
        this.f108690A = z;
        ImageView a = m93147a(cardInfo);
        this.f108726s.addView(a);
        m93156a(z, a);
        m93155a(cardInfo.f108340a);
    }

    /* renamed from: a */
    private final void m93155a(String str) {
        this.f108710U = str;
        mo59422i();
    }

    /* renamed from: a */
    private final void m93156a(boolean z, ImageView imageView) {
        int i;
        int i2;
        int i3 = 8;
        if (z) {
            i3 = 0;
        } else if (!this.f108692C && !this.f108690A) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        if (!z) {
            i = C0126R.dimen.tp_card_error_margins;
        } else {
            i = C0126R.dimen.tp_card_success_margins;
        }
        m93151a(imageView, i);
        Resources resources = getResources();
        if (!z) {
            i2 = C0126R.dimen.tp_card_error_elevation;
        } else {
            i2 = C0126R.dimen.tp_card_success_elevation;
        }
        C1280ps.m19921g(imageView, resources.getDimension(i2));
        ((bepq) imageView.getDrawable()).mo50083b(!z ? 0.4f : 1.0f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.tapandpay.widgets.cardlist.StackedCardsLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m93157a(ValuableInfo[] valuableInfoArr, boolean z) {
        if (!cgwn.f187872a.mo6606a().mo84614ab()) {
            this.f108726s.removeViews(0, this.f108691B.length);
            this.f108691B = valuableInfoArr;
            this.f108692C = z;
            for (int i = 0; i < valuableInfoArr.length; i++) {
                ValuableInfo valuableInfo = valuableInfoArr[i];
                ImageView imageView = (ImageView) getLayoutInflater().inflate((int) C0126R.C0128layout.tp_view_card, (ViewGroup) this.f108726s, false);
                imageView.setImageDrawable(new atom(this, valuableInfo));
                imageView.setContentDescription(m93149a(valuableInfo));
                m93152a(imageView);
                this.f108726s.addView(imageView, i);
                m93156a(z, imageView);
            }
            return;
        }
        this.f108726s.removeViews(0, this.f108691B.length);
        this.f108691B = valuableInfoArr;
        this.f108692C = z;
        bnha bnha = new bnha();
        for (int i2 = 0; i2 < valuableInfoArr.length; i2++) {
            ValuableInfo valuableInfo2 = valuableInfoArr[i2];
            ImageView imageView2 = (ImageView) getLayoutInflater().inflate((int) C0126R.C0128layout.tp_view_card, (ViewGroup) this.f108726s, false);
            imageView2.setImageDrawable(new atom(this, valuableInfo2));
            imageView2.setContentDescription(m93149a(valuableInfo2));
            m93152a(imageView2);
            this.f108726s.addView(imageView2, i2);
            m93156a(z, imageView2);
            if (valuableInfo2.f108487g == 8) {
                bnha.mo67695b(valuableInfo2, imageView2);
            }
        }
        bnhe b = bnha.mo67618b();
        this.f108697H = b;
        if (b != null && !b.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            bnrd a = this.f108697H.entrySet().iterator();
            while (a.hasNext()) {
                Map.Entry entry = (Map.Entry) a.next();
                alfn alfn = new alfn();
                alfn.f73506a.f81541a = ((ValuableInfo) entry.getKey()).f108496p;
                String str = ((ValuableInfo) entry.getKey()).f108497q;
                PayCardArtInfo payCardArtInfo = alfn.f73506a;
                payCardArtInfo.f81542b = str;
                arrayList.add(payCardArtInfo);
            }
            aldw aldw = new aldw();
            aldw.f73498a.f81492a = new Account(this.f108732y.f108326b, "com.google");
            GetPayCardArtRequest getPayCardArtRequest = aldw.f73498a;
            getPayCardArtRequest.f81493b = (PayCardArtInfo[]) arrayList.toArray(new PayCardArtInfo[0]);
            this.f108722o = false;
            alhr a2 = alfj.m60865a(this);
            roz b2 = rpa.m34196b();
            b2.f43472a = new aljb(getPayCardArtRequest);
            b2.f43473b = new Feature[]{aldg.f73481a};
            b2.mo24979b();
            aucb a3 = ((rjx) a2).mo24701a(b2.mo24977a());
            a3.mo50373a(new atnw(this));
            a3.mo50372a(new atnx(this, arrayList));
        }
    }

    /* renamed from: a */
    private final atnf[] m93158a(int i) {
        atne a = m93148a(i, new atne());
        atnf[] atnfArr = new atnf[a.f90532j];
        atne atne = a;
        while (a.f90532j > 0) {
            atnf atnf = new atnf(atne.f90523a, atne.f90524b, atne.f90525c, atne.f90526d, atne.f90527e, atne.f90528f, atne.f90529g, atne.f90530h, atne.f90531i, atne.f90533k, atne.f90535m, atne.f90536n, atne.f90537o, atne.f90538p);
            a = a;
            int i2 = a.f90532j - 1;
            a.f90532j = i2;
            atnfArr[i2] = atnf;
            atne = atne.f90534l;
            atnfArr = atnfArr;
        }
        return atnfArr;
    }

    /* renamed from: a */
    public final void mo59414a(int i, int i2) {
        m93150a(i, i2, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void
     arg types: [int, android.widget.ImageView]
     candidates:
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.view.View):android.animation.Animator
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, atne):atne
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(android.view.View, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(auc, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(com.google.android.gms.tapandpay.firstparty.ValuableInfo[], boolean):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(int, int):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(java.lang.String, java.lang.Runnable):void
      com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity.a(boolean, android.widget.ImageView):void */
    /* renamed from: a */
    public final void mo59415a(View view) {
        atj.m2053a(this.f108724q, mo59419e());
        ImageView imageView = (ImageView) view;
        this.f108733z = (CardInfo) imageView.getTag();
        this.f108690A = false;
        imageView.setOnClickListener(null);
        m93155a(this.f108733z.f108340a);
        this.f108726s.removeAllViews();
        this.f108726s.addView(imageView);
        this.f108726s.mo59509a(C0126R.dimen.tp_card_list_offset);
        m93156a(false, imageView);
        mo59414a(12, 0);
    }

    /* renamed from: a */
    public final void mo59416a(atol atol) {
        rjx.m33697b((Activity) this).mo24769w().mo9459a(new atno(this, atol), cgxr.f187985a.mo6606a().mo84703o(), TimeUnit.SECONDS);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.tapandpay.widgets.cardlist.StackedCardsLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo59417a(String str, Runnable runnable) {
        atj.m2053a(this.f108724q, mo59419e());
        Button button = (Button) getLayoutInflater().inflate((int) C0126R.C0128layout.tp_view_button_in_list, (ViewGroup) this.f108726s, false);
        button.setText(str);
        this.f108726s.mo59509a(Integer.MAX_VALUE);
        this.f108726s.addView(button);
        button.setOnClickListener(new atnq(runnable));
    }

    /* renamed from: a */
    public final void mo59418a(List list) {
        atj.m2053a(this.f108724q, mo59419e());
        atam atam = this.f108720m;
        int size = list.size();
        bxvd g = atam.mo49765g(70);
        bxvd da = bpbe.f135585e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbe bpbe = (bpbe) da.f164949b;
        bpbe.f135587a |= 1;
        bpbe.f135588b = size;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbe bpbe2 = (bpbe) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpbe2.getClass();
        bpbx.f135679y = bpbe2;
        bpbx.f135655a |= 67108864;
        atam.mo49741a((bpbx) g.mo74062i());
        this.f108726s.removeAllViews();
        this.f108726s.mo59509a(Integer.MAX_VALUE);
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            CardInfo cardInfo = (CardInfo) list.get(i);
            ImageView a = m93147a(cardInfo);
            a.setTag(cardInfo);
            a.setOnClickListener(new atns(this));
            this.f108726s.addView(a);
            C1280ps.m19921g(a, getResources().getDimension(C0126R.dimen.tp_card_error_elevation));
            m93151a(a, (int) C0126R.dimen.tp_card_chooser_margins);
        }
        if (list.size() == 1) {
            mo59415a(this.f108726s.getChildAt(0));
        } else {
            mo59414a(13, 0);
        }
    }
}
