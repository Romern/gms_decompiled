package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRouter;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: and */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class and extends anh implements alx, amb {

    /* renamed from: r */
    private static final ArrayList f965r;

    /* renamed from: s */
    private static final ArrayList f966s;

    /* renamed from: i */
    protected final Object f967i;

    /* renamed from: j */
    protected final Object f968j;

    /* renamed from: k */
    protected final Object f969k;

    /* renamed from: l */
    protected final Object f970l;

    /* renamed from: m */
    protected int f971m;

    /* renamed from: n */
    protected boolean f972n;

    /* renamed from: o */
    protected boolean f973o;

    /* renamed from: p */
    protected final ArrayList f974p = new ArrayList();

    /* renamed from: q */
    protected final ArrayList f975q = new ArrayList();

    /* renamed from: t */
    private final ang f976t;

    /* renamed from: u */
    private alz f977u;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f965r = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f966s = arrayList2;
        arrayList2.add(intentFilter2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.media.MediaRouter.createRouteCategory(java.lang.CharSequence, boolean):android.media.MediaRouter$RouteCategory}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.media.MediaRouter.createRouteCategory(int, boolean):android.media.MediaRouter$RouteCategory}
      ClspMth{android.media.MediaRouter.createRouteCategory(java.lang.CharSequence, boolean):android.media.MediaRouter$RouteCategory} */
    public and(Context context, ang ang) {
        super(context);
        this.f976t = ang;
        this.f967i = context.getSystemService("media_router");
        this.f968j = mo1071f();
        this.f969k = new amc(this);
        Resources resources = context.getResources();
        this.f970l = ((MediaRouter) this.f967i).createRouteCategory((CharSequence) resources.getString(C0126R.string.mr_user_route_category_name), false);
        m1139h();
    }

    /* renamed from: h */
    private final void m1139h() {
        mo1069e();
        MediaRouter mediaRouter = (MediaRouter) this.f967i;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            z |= m1141j(arrayList.get(i2));
        }
        if (z) {
            mo1068d();
        }
    }

    /* renamed from: j */
    private final boolean m1141j(Object obj) {
        String str;
        String format;
        if (m1140i(obj) != null || mo1070f(obj) >= 0) {
            return false;
        }
        if (mo1072g() != obj) {
            str = String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(mo1073g(obj).hashCode()));
        } else {
            str = "DEFAULT_ROUTE";
        }
        if (mo1067c(str) >= 0) {
            int i = 2;
            while (true) {
                format = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i));
                if (mo1067c(format) < 0) {
                    break;
                }
                i++;
            }
            str = format;
        }
        anb anb = new anb(obj, str);
        mo1065a(anb);
        this.f974p.add(anb);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo1064a(alv alv) {
        int size = this.f975q.size();
        for (int i = 0; i < size; i++) {
            if (((anc) this.f975q.get(i)).f963a == alv) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo1007a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1066a(anc anc) {
        throw null;
    }

    /* renamed from: b */
    public final void mo1009b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo1067c(String str) {
        int size = this.f974p.size();
        for (int i = 0; i < size; i++) {
            if (((anb) this.f974p.get(i)).f961b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo1011c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo1068d() {
        ala ala = new ala();
        int size = this.f974p.size();
        for (int i = 0; i < size; i++) {
            ala.mo954a(((anb) this.f974p.get(i)).f962c);
        }
        mo949a(ala.mo953a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1069e() {
        if (this.f973o) {
            this.f973o = false;
            amd.m1079a(this.f967i, this.f968j);
        }
        int i = this.f971m;
        if (i != 0) {
            this.f973o = true;
            ((MediaRouter) this.f967i).addCallback(i, (MediaRouter.Callback) this.f968j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo1070f(Object obj) {
        int size = this.f974p.size();
        for (int i = 0; i < size; i++) {
            if (((anb) this.f974p.get(i)).f960a == obj) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo1072g() {
        if (this.f977u != null) {
            throw null;
        }
        this.f977u = new alz();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo1074h(Object obj) {
        throw null;
    }

    /* renamed from: i */
    protected static final anc m1140i(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof anc) {
            return (anc) tag;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo951b(akp akp) {
        boolean z;
        int i = 0;
        if (akp != null) {
            List a = akp.mo919a().mo974a();
            int size = a.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) a.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = !str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 8388608 : i2 | 2;
                }
                i++;
            }
            z = akp.mo920b();
            i = i2;
        } else {
            z = false;
        }
        if (this.f971m != i || this.f972n != z) {
            this.f971m = i;
            this.f972n = z;
            m1139h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo1073g(Object obj) {
        CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.f802a);
        if (name == null) {
            return "";
        }
        return name.toString();
    }

    /* renamed from: a */
    public final aky mo945a(String str) {
        int c = mo1067c(str);
        if (c >= 0) {
            return new ana(((anb) this.f974p.get(c)).f960a);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo1014e(Object obj) {
        alv a;
        if (obj == amd.m1078a(this.f967i)) {
            anc i = m1140i(obj);
            if (i != null) {
                i.f963a.mo1000b();
                return;
            }
            int f = mo1070f(obj);
            if (f >= 0) {
                ang ang = this.f976t;
                String str = ((anb) this.f974p.get(f)).f961b;
                alt alt = (alt) ang;
                alt.f855g.removeMessages(262);
                alu b = alt.mo990b(alt.f856h);
                if (b != null && (a = b.mo992a(str)) != null) {
                    a.mo1000b();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo1012c(Object obj) {
        int f;
        if (m1140i(obj) == null && (f = mo1070f(obj)) >= 0) {
            mo1065a((anb) this.f974p.get(f));
            mo1068d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object mo1071f() {
        return new aly(this);
    }

    /* renamed from: d */
    public final void mo1013d(Object obj) {
        int f;
        if (m1140i(obj) == null && (f = mo1070f(obj)) >= 0) {
            anb anb = (anb) this.f974p.get(f);
            int a = ama.m1075a(obj);
            if (a != anb.f962c.mo910o()) {
                akn akn = new akn(anb.f962c);
                akn.mo893f(a);
                anb.f962c = akn.mo880a();
                mo1068d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1065a(anb anb) {
        akn akn = new akn(anb.f961b, mo1073g(anb.f960a));
        mo1062a(anb, akn);
        anb.f962c = akn.mo880a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1062a(anb anb, akn akn) {
        int supportedTypes = ((MediaRouter.RouteInfo) anb.f960a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            akn.mo884a(f965r);
        }
        if ((supportedTypes & 2) != 0) {
            akn.mo884a(f966s);
        }
        akn.mo891d(((MediaRouter.RouteInfo) anb.f960a).getPlaybackType());
        akn.f776a.putInt("playbackStream", ((MediaRouter.RouteInfo) anb.f960a).getPlaybackStream());
        akn.mo893f(ama.m1075a(anb.f960a));
        akn.mo895h(((MediaRouter.RouteInfo) anb.f960a).getVolumeMax());
        akn.mo894g(((MediaRouter.RouteInfo) anb.f960a).getVolumeHandling());
    }

    /* renamed from: b */
    public final void mo1010b(Object obj) {
        int f;
        if (m1140i(obj) == null && (f = mo1070f(obj)) >= 0) {
            this.f974p.remove(f);
            mo1068d();
        }
    }

    /* renamed from: b */
    public final void mo1026b(Object obj, int i) {
        aky aky;
        anc i2 = m1140i(obj);
        if (i2 != null) {
            alv alv = i2.f963a;
            alw.m1051a();
            if (i != 0) {
                alt alt = alw.f893a;
                if (alv == alt.f858j && (aky = alt.f859k) != null) {
                    aky.mo942c(i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1008a(Object obj) {
        if (m1141j(obj)) {
            mo1068d();
        }
    }

    /* renamed from: a */
    public final void mo1025a(Object obj, int i) {
        aky aky;
        aky aky2;
        anc i2 = m1140i(obj);
        if (i2 != null) {
            alv alv = i2.f963a;
            alw.m1051a();
            alt alt = alw.f893a;
            int min = Math.min(alv.f882k, Math.max(0, i));
            if (alv == alt.f858j && (aky2 = alt.f859k) != null) {
                aky2.mo940b(min);
            } else if (!alt.f860l.isEmpty() && (aky = (aky) alt.f860l.get(alv.f874c)) != null) {
                aky.mo940b(min);
            }
        }
    }
}
