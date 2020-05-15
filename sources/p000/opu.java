package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.MutableBoolean;
import android.util.Pair;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: opu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opu implements opo {

    /* renamed from: a */
    public static final bnsn f38192a = odk.m28481a("CAR.WM.ANIM");

    /* renamed from: o */
    private static volatile float f38193o = 1.0f;

    /* renamed from: u */
    private static final opd f38194u = new opd(f38193o);

    /* renamed from: b */
    public final ContentObserver f38195b;

    /* renamed from: c */
    public final oqa f38196c;

    /* renamed from: d */
    public final nzl f38197d;

    /* renamed from: e */
    public final List f38198e = new ArrayList();

    /* renamed from: f */
    public final List f38199f = new ArrayList();

    /* renamed from: g */
    opq f38200g;

    /* renamed from: h */
    opt f38201h;

    /* renamed from: i */
    public int f38202i;

    /* renamed from: j */
    public int f38203j;

    /* renamed from: k */
    public Animation f38204k;

    /* renamed from: l */
    public Animation f38205l;

    /* renamed from: m */
    public int f38206m;

    /* renamed from: n */
    public int f38207n;

    /* renamed from: p */
    private final C1245ok f38208p = new C1245ok();

    /* renamed from: q */
    private final C1245ok f38209q = new C1245ok();

    /* renamed from: r */
    private long f38210r;

    /* renamed from: s */
    private HandlerThread f38211s;

    /* renamed from: t */
    private ooq f38212t;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    public opu(oqa oqa) {
        nzl nzl = new nzl();
        this.f38197d = nzl;
        m29513a(oqa.mo21648a());
        this.f38195b = new opp("car", "WindowAnimationControllerImpl", new adzt(Looper.getMainLooper()), oqa);
        oqa.mo21648a().getContentResolver().registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.f38195b);
        this.f38196c = oqa;
        bmxy.m108601b(true, (Object) "enterAnimation and exitAnimation need to both be null or both be non-null.");
        this.f38202i = C0126R.anim.task_open_enter;
        this.f38203j = C0126R.anim.task_open_exit;
        Animation loadAnimation = AnimationUtils.loadAnimation(oqa.mo21648a(), this.f38202i);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(oqa.mo21648a(), this.f38203j);
        bmxy.m108581a(loadAnimation);
        bmxy.m108581a(loadAnimation2);
        this.f38204k = m29512a(loadAnimation, oqa);
        this.f38205l = m29512a(loadAnimation2, oqa);
    }

    /* renamed from: a */
    private static Animation m29512a(Animation animation, oqa oqa) {
        if (animation instanceof TranslateAnimation) {
            opg opg = new opg((TranslateAnimation) animation);
            if (oqa.mo21679c()) {
                opg.setStartOffset(animation.getStartOffset());
                opg.setZAdjustment(animation.getZAdjustment());
            }
            return opg;
        } else if (!(animation instanceof AnimationSet)) {
            return animation;
        } else {
            AnimationSet animationSet = new AnimationSet(false);
            if (oqa.mo21679c()) {
                animationSet.setStartOffset(animation.getStartOffset());
                animationSet.setZAdjustment(animation.getZAdjustment());
            }
            for (Animation animation2 : ((AnimationSet) animation).getAnimations()) {
                animationSet.addAnimation(m29512a(animation2, oqa));
            }
            return animationSet;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: opu.a(oos, boolean, boolean):void
     arg types: [oos, int, int]
     candidates:
      opu.a(int, oow, android.view.animation.Animation):ooy
      opu.a(oos, android.view.animation.Animation, boolean):void
      opo.a(oos, android.view.animation.Animation, boolean):void
      opu.a(oos, boolean, boolean):void */
    /* renamed from: d */
    private final synchronized void m29515d() {
        while (true) {
            C1245ok okVar = this.f38208p;
            if (okVar.f26809h <= 0) {
                while (true) {
                    C1245ok okVar2 = this.f38209q;
                    if (okVar2.f26809h > 0) {
                        m29514a((oos) okVar2.mo15620b(0), false, true);
                    }
                }
            } else {
                m29514a((oos) okVar.mo15620b(0), true, false);
            }
        }
    }

    /* renamed from: e */
    private final void m29516e() {
        this.f38200g.mo22490a(0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oos.a(ooy, boolean):void
     arg types: [ooy, int]
     candidates:
      oos.a(long, java.util.List):void
      oos.a(android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oos.a(int, int):boolean
      oos.a(ooy, boolean):void */
    /* renamed from: g */
    private final synchronized boolean m29517g(oos oos) {
        Pair pair = (Pair) this.f38209q.get(oos);
        if (pair == null) {
            return false;
        }
        ooy ooy = (ooy) pair.first;
        if (this.f38196c.mo21679c()) {
            ooy.mo22475b();
        }
        oos.mo22428a(ooy, true);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: opu.a(oos, boolean, boolean):void
     arg types: [oos, boolean, int]
     candidates:
      opu.a(int, oow, android.view.animation.Animation):ooy
      opu.a(oos, android.view.animation.Animation, boolean):void
      opo.a(oos, android.view.animation.Animation, boolean):void
      opu.a(oos, boolean, boolean):void */
    /* renamed from: h */
    private final synchronized void m29518h(oos oos) {
        boolean z;
        if (((ooy) this.f38208p.get(oos)) != null) {
            z = true;
        } else {
            z = false;
        }
        m29514a(oos, z, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oos.a(ooy, boolean):void
     arg types: [ooy, int]
     candidates:
      oos.a(long, java.util.List):void
      oos.a(android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oos.a(int, int):boolean
      oos.a(ooy, boolean):void */
    /* renamed from: i */
    private final synchronized boolean m29519i(oos oos) {
        ooy ooy = (ooy) this.f38208p.get(oos);
        if (ooy == null) {
            return false;
        }
        ooy.mo22475b();
        oos.mo22428a(ooy, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ooy mo22497b(int i, oow oow, Animation animation) {
        if (animation != null) {
            return new oox(animation, f38193o);
        }
        Animation animation2 = oow.f38147j;
        if (animation2 != null) {
            return new oox(animation2, f38193o);
        }
        if (i == 1) {
            return new oox(this.f38204k, f38193o);
        }
        if (i == 2) {
            bmxy.m108581a(this.f38212t);
            return new opk(ooy.f38153c, 0, 250, -this.f38212t.f38100j, f38193o);
        } else if (i == 3) {
            bmxy.m108581a(this.f38212t);
            int i2 = this.f38212t.f38091a.f37029g;
            return new opk(opk.f38156f, 0, 400, -ooz.m29477a(i2, 400), f38193o);
        } else if (i == 5) {
            bmxy.m108581a(this.f38212t);
            int i3 = this.f38212t.f38091a.f37029g;
            return new opk(opk.f38156f, 75, 325, -ooz.m29477a(i3, 240), f38193o);
        } else if (i == 6) {
            return new ope(f38193o);
        } else {
            if (i != 7) {
                return f38194u;
            }
            return new opk(opk.f38153c, 50, 250, oow.f38141d, f38193o);
        }
    }

    /* renamed from: c */
    public final synchronized void mo22500c() {
        boolean z;
        boolean z2;
        if (!this.f38208p.isEmpty() || !this.f38209q.isEmpty()) {
            this.f38196c.mo21704q();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            if (!this.f38208p.isEmpty()) {
                int i2 = 0;
                z2 = false;
                z = false;
                while (true) {
                    C1245ok okVar = this.f38208p;
                    if (i2 >= okVar.f26809h) {
                        break;
                    }
                    oos oos = (oos) okVar.mo15620b(i2);
                    if (!((ooy) this.f38208p.mo15621c(i2)).mo22474a(elapsedRealtime) || (this.f38196c.mo21679c() && !oos.mo22461z())) {
                        z = true;
                    } else {
                        oos.mo22460y();
                        this.f38198e.remove(oos);
                        this.f38208p.mo8152d(i2);
                        z2 = true;
                    }
                    i2++;
                }
            } else {
                z2 = false;
                z = false;
            }
            if (!this.f38209q.isEmpty()) {
                while (true) {
                    C1245ok okVar2 = this.f38209q;
                    if (i >= okVar2.f26809h) {
                        break;
                    }
                    oos oos2 = (oos) okVar2.mo15620b(i);
                    Pair pair = (Pair) this.f38209q.mo15621c(i);
                    if (!((ooy) pair.first).mo22474a(elapsedRealtime) || (this.f38196c.mo21679c() && !oos2.mo22461z())) {
                        z = true;
                    } else {
                        oos2.mo22460y();
                        if (((MutableBoolean) pair.second).value) {
                            this.f38196c.mo21691h(oos2);
                        }
                        this.f38199f.remove(oos2);
                        this.f38209q.mo8152d(i);
                        z2 = true;
                    }
                    i++;
                }
            }
            if (z2) {
                this.f38196c.mo21704q();
            }
            if (z) {
                this.f38200g.mo22490a(this.f38210r);
            }
        }
    }

    /* renamed from: f */
    public final synchronized boolean mo22505f(oos oos) {
        return this.f38198e.contains(oos);
    }

    /* renamed from: d */
    public final synchronized void mo22501d(oos oos) {
        if (m29519i(oos)) {
            m29516e();
            oos.mo22441f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        return;
     */
    /* renamed from: e */
    public final synchronized void mo22503e(oos oos, Animation animation) {
        if (!mo22504e(oos) && this.f38211s != null) {
            Pair pair = (Pair) this.f38209q.get(oos);
            if (pair != null) {
                MutableBoolean mutableBoolean = (MutableBoolean) pair.second;
                boolean z = mutableBoolean.value;
                mutableBoolean.value = true;
                return;
            }
            m29518h(oos);
            ooy a = mo22496a(oos.mo22439d(), oos.mo22452q(), animation);
            this.f38199f.add(oos);
            this.f38209q.put(oos, Pair.create(a, new MutableBoolean(true)));
            opt opt = this.f38201h;
            if (opt != null) {
                opt.mo22494a();
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo22502d(oos oos, Animation animation) {
        if (!mo22505f(oos) && this.f38211s != null && this.f38201h != null && ((ooy) this.f38208p.get(oos)) == null && ((Pair) this.f38209q.get(oos)) == null) {
            ooy b = mo22497b(oos.mo22439d(), oos.mo22452q(), animation);
            this.f38198e.add(oos);
            this.f38208p.put(oos, b);
            opt opt = this.f38201h;
            if (opt != null) {
                opt.mo22494a();
            }
        }
    }

    /* renamed from: a */
    public static void m29513a(Context context) {
        try {
            f38193o = Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
        } catch (Settings.SettingNotFoundException e) {
            f38193o = 1.0f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* renamed from: a */
    private final synchronized void m29514a(oos oos, boolean z, boolean z2) {
        boolean z3;
        if (this.f38211s != null) {
            boolean z4 = false;
            if (z) {
                this.f38198e.remove(oos);
                if (((ooy) this.f38208p.remove(oos)) != null) {
                    oos.mo22460y();
                    z3 = this.f38208p.isEmpty();
                    if (z2) {
                        this.f38199f.remove(oos);
                        Pair pair = (Pair) this.f38209q.remove(oos);
                        if (pair != null) {
                            oos.mo22460y();
                            if (((MutableBoolean) pair.second).value) {
                                this.f38196c.mo21691h(oos);
                            }
                            z4 = this.f38209q.isEmpty();
                        }
                    }
                    opq opq = this.f38200g;
                    if (z3) {
                        opq.removeMessages(2);
                        if (z4) {
                            opq.removeMessages(1);
                        }
                    }
                }
            }
            z3 = false;
            if (z2) {
            }
            opq opq2 = this.f38200g;
            if (z3) {
            }
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo22504e(oos oos) {
        return this.f38199f.contains(oos);
    }

    /* renamed from: c */
    public final synchronized void mo22488c(oos oos, Animation animation) {
        opt opt = this.f38201h;
        if (opt != null) {
            opt.post(new opr(opt, oos, animation));
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo22489c(oos oos) {
        Pair pair = (Pair) this.f38209q.get(oos);
        if (pair == null) {
            return false;
        }
        ((MutableBoolean) pair.second).value = true;
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo22498b() {
        if (this.f38211s != null) {
            ArrayList arrayList = new ArrayList();
            List list = this.f38199f;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                oos oos = (oos) list.get(i);
                if (!oos.mo22461z()) {
                    if (m29517g(oos)) {
                        arrayList.add(oos);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List list2 = this.f38198e;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                oos oos2 = (oos) list2.get(i2);
                if (!oos2.mo22461z()) {
                    if (m29519i(oos2)) {
                        arrayList2.add(oos2);
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                m29516e();
            }
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((oos) arrayList2.get(i3)).mo22441f();
            }
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((oos) arrayList.get(i4)).mo22442g();
            }
        }
    }

    /* renamed from: a */
    public final Animation mo22480a(Context context, int i) {
        Animation a = m29512a(AnimationUtils.loadAnimation(context, i), this.f38196c);
        int i2 = this.f38206m;
        int i3 = this.f38207n;
        a.initialize(i2, i3, i2, i3);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ooy mo22496a(int i, oow oow, Animation animation) {
        if (animation != null) {
            return new oox(animation, f38193o);
        }
        if (oow.f38148k != null && (!this.f38196c.mo21679c() || i != 1)) {
            return new oox(oow.f38148k, f38193o);
        }
        if (i == 1) {
            return new oox(this.f38205l, f38193o);
        }
        if (i == 3) {
            bmxy.m108581a(this.f38212t);
            return new opc(oow, this.f38212t.f38091a.f37029g, f38193o);
        } else if (i == 5) {
            bmxy.m108581a(this.f38212t);
            return new opj(this.f38212t.f38091a.f37029g, f38193o);
        } else if (i != 6) {
            return i != 7 ? f38194u : new opl(oow, f38193o);
        } else {
            return new opf(f38193o);
        }
    }

    /* renamed from: a */
    public final synchronized void mo22481a() {
        m29515d();
        bmxy.m108581a(this.f38201h);
        this.f38201h.removeCallbacksAndMessages(null);
        this.f38201h = null;
        bmxy.m108581a(this.f38211s);
        this.f38211s.quit();
        this.f38211s = null;
        this.f38212t = null;
    }

    /* renamed from: b */
    public final void mo22499b(Context context, int i) {
        boolean z;
        if (i != 0) {
            Pair a = this.f38197d.mo21870a(context, i);
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            boolean z2 = false;
            if (intValue != 0) {
                z = false;
            } else {
                z = true;
            }
            if (intValue2 == 0) {
                z2 = true;
            }
            if (z != z2) {
                bnsi c = f38192a.mo68388c();
                c.mo68432a("opu", "b", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("enterAnimation and exitAnimation need to both be null or both be non-null. Not setting default content window animations.");
            } else if (intValue != 0) {
                this.f38202i = intValue;
                this.f38203j = intValue2;
                this.f38204k = mo22480a(context, intValue);
                this.f38205l = mo22480a(context, intValue2);
            }
        } else {
            bnsi c2 = f38192a.mo68388c();
            c2.mo68432a("opu", "b", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("windowAnimationStyleRes is 0. Not setting default content window animations.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo22482a(long j, ooq ooq) {
        this.f38210r = j;
        this.f38212t = ooq;
        HandlerThread handlerThread = new HandlerThread("animation", -8);
        this.f38211s = handlerThread;
        handlerThread.start();
        this.f38200g = new opq(this, this.f38211s.getLooper());
        this.f38201h = new opt(this);
    }

    /* renamed from: b */
    public final synchronized void mo22486b(oos oos, Animation animation) {
        opt opt = this.f38201h;
        if (opt != null) {
            opt.post(new ops(opt, oos, animation));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: opu.a(oos, boolean, boolean):void
     arg types: [oos, int, int]
     candidates:
      opu.a(int, oow, android.view.animation.Animation):ooy
      opu.a(oos, android.view.animation.Animation, boolean):void
      opo.a(oos, android.view.animation.Animation, boolean):void
      opu.a(oos, boolean, boolean):void */
    /* renamed from: a */
    public final synchronized void mo22483a(oos oos) {
        Pair pair = (Pair) this.f38209q.get(oos);
        if (pair != null) {
            ((MutableBoolean) pair.second).value = false;
        }
        m29514a(oos, true, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: opu.a(oos, boolean, boolean):void
     arg types: [oos, int, int]
     candidates:
      opu.a(int, oow, android.view.animation.Animation):ooy
      opu.a(oos, android.view.animation.Animation, boolean):void
      opo.a(oos, android.view.animation.Animation, boolean):void
      opu.a(oos, boolean, boolean):void */
    /* renamed from: b */
    public final synchronized boolean mo22487b(oos oos) {
        if (this.f38211s == null) {
            return false;
        }
        if (oos == null) {
            bnsi c = f38192a.mo68388c();
            c.mo68432a("opu", "b", 638, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("cleapupIfInRemovalAnimation for null window");
            return false;
        }
        m29514a(oos, false, true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo22484a(oos oos, Animation animation) {
        if (this.f38211s != null) {
            if (oos == null) {
                bnsi c = f38192a.mo68388c();
                c.mo68432a("opu", "a", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("startStartupAnimation for null window");
            } else if (((ooy) this.f38208p.get(oos)) == null && ((Pair) this.f38209q.get(oos)) == null) {
                ooy b = mo22497b(oos.mo22439d(), oos.mo22452q(), animation);
                if (b.mo22476c() == 0) {
                    oos.mo22441f();
                    this.f38196c.mo21704q();
                    return;
                }
                this.f38208p.put(oos, b);
                mo22501d(oos);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo22485a(oos oos, Animation animation, boolean z) {
        if (this.f38211s != null) {
            if (oos == null) {
                bnsi c = f38192a.mo68388c();
                c.mo68432a("opu", "a", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("startRemovalAnimation for null window");
                return;
            }
            Pair pair = (Pair) this.f38209q.get(oos);
            if (pair != null) {
                ((MutableBoolean) pair.second).value |= z;
                return;
            }
            m29518h(oos);
            ooy a = mo22496a(oos.mo22439d(), oos.mo22452q(), animation);
            if (a.mo22476c() != 0) {
                this.f38209q.put(oos, new Pair(a, new MutableBoolean(z)));
                if (m29517g(oos)) {
                    m29516e();
                }
            } else {
                if (z) {
                    this.f38196c.mo21691h(oos);
                }
                this.f38196c.mo21704q();
            }
        }
    }
}
