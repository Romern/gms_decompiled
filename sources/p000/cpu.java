package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Map;

/* renamed from: cpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cpu implements Cloneable {

    /* renamed from: a */
    public int f11788a;

    /* renamed from: b */
    public float f11789b = 1.0f;

    /* renamed from: c */
    public cfn f11790c = cfn.f6711c;

    /* renamed from: d */
    public cbs f11791d = cbs.NORMAL;

    /* renamed from: e */
    public boolean f11792e = true;

    /* renamed from: f */
    public int f11793f = -1;

    /* renamed from: g */
    public int f11794g = -1;

    /* renamed from: h */
    public cdg f11795h = cql.f11849b;

    /* renamed from: i */
    public boolean f11796i;

    /* renamed from: j */
    public boolean f11797j = true;

    /* renamed from: k */
    public cdk f11798k = new cdk();

    /* renamed from: l */
    public Map f11799l = new cqq();

    /* renamed from: m */
    public Class f11800m = Object.class;

    /* renamed from: n */
    public boolean f11801n;

    /* renamed from: o */
    public boolean f11802o;

    /* renamed from: p */
    public boolean f11803p = true;

    /* renamed from: q */
    public boolean f11804q;

    /* renamed from: r */
    private Drawable f11805r;

    /* renamed from: s */
    private int f11806s;

    /* renamed from: t */
    private Drawable f11807t;

    /* renamed from: u */
    private int f11808u;

    /* renamed from: v */
    private Drawable f11809v;

    /* renamed from: w */
    private int f11810w;

    /* renamed from: x */
    private Resources.Theme f11811x;

    /* renamed from: y */
    private boolean f11812y;

    /* renamed from: z */
    private boolean f11813z;

    /* renamed from: a */
    private final void mo3671a() {
        if (this.f11801n) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* renamed from: a */
    public static boolean m7266a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    public static cpu m7267b(cfn cfn) {
        return new cpu().mo8099a(cfn);
    }

    /* renamed from: c */
    public final cpu mo8105c() {
        return mo8104b(cmb.f7041b, new clq());
    }

    /* renamed from: d */
    public final cpu mo8106d() {
        if (this.f11802o) {
            return clone().mo8106d();
        }
        this.f11792e = false;
        this.f11788a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo3671a();
        return this;
    }

    /* renamed from: e */
    public final cpu mo8107e() {
        if (this.f11802o) {
            return clone().mo8107e();
        }
        this.f11804q = true;
        this.f11788a |= 1048576;
        mo3671a();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cpu) {
            cpu cpu = (cpu) obj;
            if (Float.compare(cpu.f11789b, this.f11789b) == 0) {
                int i = cpu.f11806s;
                Drawable drawable = cpu.f11805r;
                if (crd.m7395a((Object) null, (Object) null)) {
                    int i2 = cpu.f11808u;
                    Drawable drawable2 = cpu.f11807t;
                    if (crd.m7395a((Object) null, (Object) null)) {
                        int i3 = cpu.f11810w;
                        Drawable drawable3 = cpu.f11809v;
                        if (crd.m7395a((Object) null, (Object) null) && this.f11792e == cpu.f11792e && this.f11793f == cpu.f11793f && this.f11794g == cpu.f11794g && this.f11796i == cpu.f11796i && this.f11797j == cpu.f11797j) {
                            boolean z = cpu.f11812y;
                            boolean z2 = cpu.f11813z;
                            if (this.f11790c.equals(cpu.f11790c) && this.f11791d == cpu.f11791d && this.f11798k.equals(cpu.f11798k) && this.f11799l.equals(cpu.f11799l) && this.f11800m.equals(cpu.f11800m) && crd.m7395a(this.f11795h, cpu.f11795h)) {
                                Resources.Theme theme = cpu.f11811x;
                                if (crd.m7395a((Object) null, (Object) null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo8109f() {
        this.f11801n = true;
    }

    public final int hashCode() {
        int a = crd.m7390a((Object) null, crd.m7396b(0, crd.m7390a((Object) null, crd.m7396b(0, crd.m7390a((Object) null, crd.m7396b(0, crd.m7387a(this.f11789b)))))));
        boolean z = this.f11792e;
        int i = this.f11793f;
        int i2 = this.f11794g;
        boolean z2 = this.f11796i;
        boolean z3 = this.f11797j;
        return crd.m7390a((Object) null, crd.m7390a(this.f11795h, crd.m7390a(this.f11800m, crd.m7390a(this.f11799l, crd.m7390a(this.f11798k, crd.m7390a(this.f11791d, crd.m7390a(this.f11790c, crd.m7396b(0, crd.m7396b(0, crd.m7396b(z3 ? 1 : 0, crd.m7396b(z2 ? 1 : 0, crd.m7396b(i2, crd.m7396b(i, crd.m7396b(z ? 1 : 0, a))))))))))))));
    }

    /* renamed from: a */
    public final cpu mo8095a(cbs cbs) {
        if (this.f11802o) {
            return clone().mo8095a(cbs);
        }
        crb.m7382a(cbs);
        this.f11791d = cbs;
        this.f11788a |= 8;
        mo3671a();
        return this;
    }

    /* renamed from: b */
    public static cpu m7268b(Class cls) {
        return new cpu().mo8101a(cls);
    }

    /* renamed from: a */
    public final cpu mo8096a(cdg cdg) {
        if (this.f11802o) {
            return clone().mo8096a(cdg);
        }
        crb.m7382a(cdg);
        this.f11795h = cdg;
        this.f11788a |= 1024;
        mo3671a();
        return this;
    }

    /* renamed from: b */
    public cpu clone() {
        try {
            cpu cpu = (cpu) super.clone();
            cdk cdk = new cdk();
            cpu.f11798k = cdk;
            cdk.mo3741a(this.f11798k);
            cqq cqq = new cqq();
            cpu.f11799l = cqq;
            cqq.putAll(this.f11799l);
            cpu.f11801n = false;
            cpu.f11802o = false;
            return cpu;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final cpu mo8097a(cdj cdj, Object obj) {
        if (this.f11802o) {
            return clone().mo8097a(cdj, obj);
        }
        crb.m7382a(cdj);
        crb.m7382a(obj);
        this.f11798k.mo3740a(cdj, obj);
        mo3671a();
        return this;
    }

    /* renamed from: b */
    public final cpu mo8103b(int i, int i2) {
        if (this.f11802o) {
            return clone().mo8103b(i, i2);
        }
        this.f11794g = i;
        this.f11793f = i2;
        this.f11788a |= 512;
        mo3671a();
        return this;
    }

    /* renamed from: a */
    public final cpu mo8098a(cdo cdo, boolean z) {
        if (this.f11802o) {
            return clone().mo8098a(cdo, z);
        }
        cmh cmh = new cmh(cdo, z);
        mo8102a(Bitmap.class, cdo, z);
        mo8102a(Drawable.class, cmh, z);
        mo8102a(BitmapDrawable.class, cmh, z);
        mo8102a(cnu.class, new cnx(cdo), z);
        mo3671a();
        return this;
    }

    /* renamed from: b */
    public final cpu mo8104b(cmb cmb, cdo cdo) {
        cpu a = mo8100a(cmb, cdo);
        a.f11803p = true;
        return a;
    }

    /* renamed from: b */
    public cpu mo3677b(cpu cpu) {
        if (this.f11802o) {
            return clone().mo3677b(cpu);
        }
        if (m7266a(cpu.f11788a, 2)) {
            this.f11789b = cpu.f11789b;
        }
        if (m7266a(cpu.f11788a, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE)) {
            boolean z = cpu.f11812y;
            this.f11812y = false;
        }
        if (m7266a(cpu.f11788a, 1048576)) {
            this.f11804q = cpu.f11804q;
        }
        if (m7266a(cpu.f11788a, 4)) {
            this.f11790c = cpu.f11790c;
        }
        if (m7266a(cpu.f11788a, 8)) {
            this.f11791d = cpu.f11791d;
        }
        if (m7266a(cpu.f11788a, 16)) {
            Drawable drawable = cpu.f11805r;
            this.f11805r = null;
            this.f11806s = 0;
            this.f11788a &= -33;
        }
        if (m7266a(cpu.f11788a, 32)) {
            int i = cpu.f11806s;
            this.f11806s = 0;
            this.f11805r = null;
            this.f11788a &= -17;
        }
        if (m7266a(cpu.f11788a, 64)) {
            Drawable drawable2 = cpu.f11807t;
            this.f11807t = null;
            this.f11808u = 0;
            this.f11788a &= -129;
        }
        if (m7266a(cpu.f11788a, 128)) {
            int i2 = cpu.f11808u;
            this.f11808u = 0;
            this.f11807t = null;
            this.f11788a &= -65;
        }
        if (m7266a(cpu.f11788a, (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            this.f11792e = cpu.f11792e;
        }
        if (m7266a(cpu.f11788a, 512)) {
            this.f11794g = cpu.f11794g;
            this.f11793f = cpu.f11793f;
        }
        if (m7266a(cpu.f11788a, 1024)) {
            this.f11795h = cpu.f11795h;
        }
        if (m7266a(cpu.f11788a, 4096)) {
            this.f11800m = cpu.f11800m;
        }
        if (m7266a(cpu.f11788a, 8192)) {
            Drawable drawable3 = cpu.f11809v;
            this.f11809v = null;
            this.f11810w = 0;
            this.f11788a &= -16385;
        }
        if (m7266a(cpu.f11788a, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES)) {
            int i3 = cpu.f11810w;
            this.f11810w = 0;
            this.f11809v = null;
            this.f11788a &= -8193;
        }
        if (m7266a(cpu.f11788a, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT)) {
            Resources.Theme theme = cpu.f11811x;
            this.f11811x = null;
        }
        if (m7266a(cpu.f11788a, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE)) {
            this.f11797j = cpu.f11797j;
        }
        if (m7266a(cpu.f11788a, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE)) {
            this.f11796i = cpu.f11796i;
        }
        if (m7266a(cpu.f11788a, 2048)) {
            this.f11799l.putAll(cpu.f11799l);
            this.f11803p = cpu.f11803p;
        }
        if (m7266a(cpu.f11788a, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS)) {
            boolean z2 = cpu.f11813z;
            this.f11813z = false;
        }
        if (!this.f11797j) {
            this.f11799l.clear();
            int i4 = this.f11788a;
            this.f11796i = false;
            this.f11788a = i4 & -133121;
            this.f11803p = true;
        }
        this.f11788a |= cpu.f11788a;
        this.f11798k.mo3741a(cpu.f11798k);
        mo3671a();
        return this;
    }

    /* renamed from: a */
    public final cpu mo8099a(cfn cfn) {
        if (this.f11802o) {
            return clone().mo8099a(cfn);
        }
        crb.m7382a(cfn);
        this.f11790c = cfn;
        this.f11788a |= 4;
        mo3671a();
        return this;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cpu.a(cdo, boolean):cpu
     arg types: [cdo, int]
     candidates:
      cpu.a(int, int):boolean
      cpu.a(cdj, java.lang.Object):cpu
      cpu.a(cmb, cdo):cpu
      cpu.a(cdo, boolean):cpu */
    /* renamed from: a */
    public final cpu mo8100a(cmb cmb, cdo cdo) {
        if (this.f11802o) {
            return clone().mo8100a(cmb, cdo);
        }
        cdj cdj = cmb.f7045f;
        crb.m7382a(cmb);
        mo8097a(cdj, cmb);
        return mo8098a(cdo, false);
    }

    /* renamed from: a */
    public final cpu mo8101a(Class cls) {
        if (this.f11802o) {
            return clone().mo8101a(cls);
        }
        crb.m7382a(cls);
        this.f11800m = cls;
        this.f11788a |= 4096;
        mo3671a();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cpu mo8102a(Class cls, cdo cdo, boolean z) {
        if (this.f11802o) {
            return clone().mo8102a(cls, cdo, z);
        }
        crb.m7382a(cls);
        crb.m7382a(cdo);
        this.f11799l.put(cls, cdo);
        int i = this.f11788a;
        this.f11797j = true;
        int i2 = i | 67584;
        this.f11788a = i2;
        this.f11803p = false;
        if (z) {
            this.f11788a = i2 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            this.f11796i = true;
        }
        mo3671a();
        return this;
    }
}
