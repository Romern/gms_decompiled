package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountParticleDisc extends FrameLayout {

    /* renamed from: a */
    public final ImageView f111374a;

    /* renamed from: b */
    public final WeakReference f111375b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f111376c;

    /* renamed from: d */
    public final bddf f111377d;

    /* renamed from: e */
    public bddk f111378e;

    /* renamed from: f */
    public boolean f111379f;

    /* renamed from: g */
    public int f111380g;

    /* renamed from: h */
    public Object f111381h;

    /* renamed from: i */
    public bmxv f111382i;

    /* renamed from: j */
    private final boolean f111383j;

    /* renamed from: k */
    private final bmxv f111384k;

    /* renamed from: l */
    private final boolean f111385l;

    /* renamed from: m */
    private final int f111386m;

    /* renamed from: n */
    private final int f111387n;

    /* renamed from: o */
    private final int f111388o;

    /* renamed from: p */
    private bdeo f111389p;

    /* renamed from: q */
    private int f111390q;

    /* renamed from: r */
    private bdcl f111391r;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void mo44652a() {
        int i;
        if (!this.f111383j && !this.f111379f) {
            i = 0;
        } else {
            i = (int) getResources().getDimension(C0126R.dimen.og_apd_min_padding);
        }
        this.f111380g = i;
        this.f111374a.setPadding(i, i, i, i);
        ViewGroup.LayoutParams layoutParams = this.f111374a.getLayoutParams();
        layoutParams.width = this.f111390q;
        layoutParams.height = this.f111390q;
    }

    /* renamed from: e */
    private final int m94878e() {
        return mo60580c() - this.f111388o;
    }

    /* renamed from: b */
    public final boolean mo60579b() {
        return this.f111391r != null;
    }

    /* renamed from: c */
    public final int mo60580c() {
        int i = this.f111390q;
        int i2 = this.f111380g;
        return i - (i2 + i2);
    }

    /* renamed from: d */
    public final void mo60581d() {
        ImageView imageView = this.f111374a;
        Context context = imageView.getContext();
        int i = this.f111387n;
        Drawable b = C1391tv.m20459b(context, C0126R.C0127drawable.disc_oval);
        bdds.m90618a(b, i);
        imageView.setImageDrawable(b);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.ogAccountParticleDiscStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bmxv bmxv;
        this.f111376c = new CopyOnWriteArrayList();
        this.f111377d = new bddf(new bdck());
        this.f111382i = bmvz.f131120a;
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.account_particle_disc, (ViewGroup) this, true);
        this.f111374a = (ImageView) findViewById(C0126R.C0129id.og_apd_internal_image_view);
        this.f111375b = new WeakReference((FrameLayout) findViewById(C0126R.C0129id.badge_wrapper));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bddd.f105356a, i, 2132017910);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, -1);
            this.f111390q = dimensionPixelSize;
            if (dimensionPixelSize == -1) {
                this.f111390q = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(C0126R.dimen.og_apd_default_max_disc_content_size));
            }
            int i2 = 0;
            this.f111383j = obtainStyledAttributes.getBoolean(0, true);
            this.f111379f = obtainStyledAttributes.getBoolean(1, false);
            this.f111385l = obtainStyledAttributes.getBoolean(9, false);
            this.f111386m = obtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(C0126R.dimen.og_apd_default_disc_min_touch_target_size));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                bmxv = bmxv.m108566b(Integer.valueOf(color));
            } else {
                bmxv = bmvz.f131120a;
            }
            this.f111384k = bmxv;
            this.f111387n = obtainStyledAttributes.getColor(8, getResources().getColor(C0126R.color.og_default_disc_placeholder_color_light));
            this.f111388o = obtainStyledAttributes.getBoolean(13, true) ? getResources().getDimensionPixelSize(C0126R.dimen.og_apd_amount_to_reduce_avatar_size_when_has_ring) : i2;
            obtainStyledAttributes.recycle();
            mo60581d();
            mo44652a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m94876a(Context context, bddy bddy, ExecutorService executorService, bdci bdci, bdeq bdeq, Class cls) {
        bddc bddc = new bddc(new bdcq(context, executorService), bdci);
        bdel bdel = new bdel();
        bdel.mo57942a(new bdem[0]);
        bdel.f105423d = new bdcr(bdci);
        if (bdeq != null) {
            bdel.f105420a = bdeq;
            bdel.f105424e = new bdcw();
            bdel.f105421b = new bdcj(bddc);
            bdel.mo57942a(bdem.CIRCLE_CROP);
            String str = bdel.f105423d == null ? " keyGenerator" : "";
            if (bdel.f105420a == null) {
                str = str.concat(" imageRetriever");
            }
            if (bdel.f105421b == null) {
                str = String.valueOf(str).concat(" secondaryImageRetriever");
            }
            if (bdel.f105424e == null) {
                str = String.valueOf(str).concat(" defaultImageRetriever");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            bddu bddu = new bddu(bdel.f105423d, bdel.f105420a, bdel.f105421b, bdel.f105424e, bdel.f105422c);
            bdeo a = bdcu.m90589a(cls);
            Map map = ((bdej) bddy).f105418d.f105414a;
            bmxy.m108581a(a);
            bmxy.m108581a(bddu);
            map.put(a, bddu);
            return;
        }
        throw new NullPointerException("Null imageRetriever");
    }

    /* renamed from: a */
    private final void m94877a(Runnable runnable) {
        if (beel.m91854a()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo60575a(bddw bddw) {
        bmxy.m108601b(mo60579b(), "initialize must be called first");
        Object obj = this.f111381h;
        if (obj != null) {
            bdek a = this.f111389p.mo57943a(obj);
            ImageView imageView = this.f111374a;
            bdeo bdeo = ((bddt) a).f105383a;
            bden a2 = ((bdej) bddw).f105418d.mo57941a(bdeo);
            synchronized (bdej.f105415a) {
                bdej.f105415a.remove(bdej.m90636a(bdeo, a2, a, bddx.m90628a(imageView)));
            }
            m94877a((Runnable) new bdco(this));
        }
    }

    /* renamed from: a */
    public final void mo60576a(bddy bddy, Class cls) {
        bmxy.m108581a(bddy);
        bdcl bdcl = new bdcl(bddy, cls);
        bmvz bmvz = bmvz.f131120a;
        bmxy.m108581a(bdcl);
        this.f111391r = bdcl;
        this.f111389p = bdcu.m90589a(cls);
        if (this.f111385l) {
            int i = this.f111386m;
            int i2 = this.f111390q;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i3 = i - i2;
            int max = Math.max(0, ((i3 - paddingLeft) - paddingRight) / 2);
            int max2 = Math.max(0, ((i3 - paddingTop) - paddingBottom) / 2);
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        mo44652a();
        if (this.f111383j) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        m94877a((Runnable) new bdcm(this, bmvz));
        this.f111374a.requestLayout();
        if (this.f111379f) {
            this.f111378e = new bddk((RingView) findViewById(C0126R.C0129id.og_apd_ring_view), m94878e());
        }
    }

    /* renamed from: a */
    public final void mo60577a(Object obj) {
        m94877a((Runnable) new bdcn(this, obj));
    }

    /* renamed from: a */
    public final void mo60578a(Object obj, ImageView imageView) {
        int i;
        beel.m91855b();
        if (!this.f111382i.mo66813a()) {
            i = this.f111380g;
        } else {
            i = 0;
        }
        imageView.setPadding(i, i, i, i);
        int c = !this.f111382i.mo66813a() ? mo60580c() : m94878e();
        bdcl bdcl = this.f111391r;
        bdcz bdcz = new bdcz(null);
        bmxv c2 = bmxv.m108567c(obj);
        if (c2 != null) {
            bdcz.f105349a = c2;
            if (imageView != null) {
                bdcz.f105352d = imageView;
                bdcz.f105350b = Integer.valueOf(c);
                bmxv bmxv = this.f111384k;
                if (bmxv != null) {
                    bdcz.f105351c = bmxv;
                    String str = bdcz.f105350b == null ? " avatarSize" : "";
                    if (bdcz.f105352d == null) {
                        str = str.concat(" imageView");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                    }
                    bdct bdct = new bdct(bdcz.f105349a, bdcz.f105350b.intValue(), bdcz.f105351c, bdcz.f105352d);
                    bddy bddy = bdcl.f105331a;
                    bdek a = bdcu.m90589a(bdcl.f105332b).mo57943a(bdct.f105342a.mo66815c());
                    ImageView imageView2 = bdct.f105343b;
                    bngx e = bngx.m109376e();
                    beel.m91855b();
                    Context context = imageView2.getContext();
                    if (!bdej.f105416b.getAndSet(true)) {
                        context.getApplicationContext().registerComponentCallbacks(bdej.f105417c);
                    }
                    bdej bdej = (bdej) bddy;
                    bdeh bdeh = new bdeh(bdej, a, e, imageView2);
                    bdej.m90637a(imageView2, bdeh);
                    Executor executor = bdej.f105419e;
                    bdeh.getClass();
                    executor.execute(new bddz(bdeh));
                    return;
                }
                throw new NullPointerException("Null borderColor");
            }
            throw new NullPointerException("Null imageView");
        }
        throw new NullPointerException("Null account");
    }
}
