package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: chqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqo {

    /* renamed from: a */
    public static final chqo f189006a = new chqo();

    /* renamed from: b */
    public chrm f189007b;

    /* renamed from: c */
    public Executor f189008c;

    /* renamed from: d */
    public chqm f189009d;

    /* renamed from: e */
    public String f189010e;

    /* renamed from: f */
    public List f189011f = Collections.emptyList();

    /* renamed from: g */
    public Boolean f189012g;

    /* renamed from: h */
    public Integer f189013h;

    /* renamed from: i */
    public Integer f189014i;

    /* renamed from: j */
    private Object[][] f189015j = ((Object[][]) Array.newInstance(Object.class, 0, 2));

    private chqo() {
    }

    /* renamed from: a */
    public final chqo mo85543a(int i) {
        bmxy.m108591a(i >= 0, "invalid maxsize %s", i);
        chqo chqo = new chqo(this);
        chqo.f189013h = Integer.valueOf(i);
        return chqo;
    }

    /* renamed from: b */
    public final chqo mo85550b(int i) {
        bmxy.m108591a(i >= 0, "invalid maxsize %s", i);
        chqo chqo = new chqo(this);
        chqo.f189014i = Integer.valueOf(i);
        return chqo;
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("deadline", this.f189007b);
        Class<?> cls = null;
        a.mo66885a("authority", (Object) null);
        a.mo66885a("callCredentials", this.f189009d);
        Executor executor = this.f189008c;
        if (executor != null) {
            cls = executor.getClass();
        }
        a.mo66885a("executor", cls);
        a.mo66885a("compressorName", this.f189010e);
        a.mo66885a("customOptions", Arrays.deepToString(this.f189015j));
        a.mo66886a("waitForReady", mo85549a());
        a.mo66885a("maxInboundMessageSize", this.f189013h);
        a.mo66885a("maxOutboundMessageSize", this.f189014i);
        a.mo66885a("streamTracerFactories", this.f189011f);
        return a.toString();
    }

    /* renamed from: a */
    public final chqo mo85544a(long j, TimeUnit timeUnit) {
        return mo85546a(chrm.m149457a(j, timeUnit));
    }

    public chqo(chqo chqo) {
        this.f189007b = chqo.f189007b;
        this.f189009d = chqo.f189009d;
        this.f189008c = chqo.f189008c;
        this.f189010e = chqo.f189010e;
        this.f189015j = chqo.f189015j;
        this.f189012g = chqo.f189012g;
        this.f189013h = chqo.f189013h;
        this.f189014i = chqo.f189014i;
        this.f189011f = chqo.f189011f;
    }

    /* renamed from: a */
    public final chqo mo85545a(chqn chqn, Object obj) {
        int i;
        bmxy.m108582a(chqn, "key");
        bmxy.m108582a(obj, "value");
        chqo chqo = new chqo(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f189015j;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            } else if (chqn.equals(objArr[i2][0])) {
                break;
            } else {
                i2++;
            }
        }
        int length = this.f189015j.length;
        if (i2 == -1) {
            i = 1;
        } else {
            i = 0;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        chqo.f189015j = objArr2;
        Object[][] objArr3 = this.f189015j;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i2 == -1) {
            chqo.f189015j[this.f189015j.length] = new Object[]{chqn, obj};
        } else {
            chqo.f189015j[i2] = new Object[]{chqn, obj};
        }
        return chqo;
    }

    /* renamed from: a */
    public final chqo mo85546a(chrm chrm) {
        chqo chqo = new chqo(this);
        chqo.f189007b = chrm;
        return chqo;
    }

    /* renamed from: a */
    public final chqo mo85547a(String str) {
        chqo chqo = new chqo(this);
        chqo.f189010e = str;
        return chqo;
    }

    /* renamed from: a */
    public final Object mo85548a(chqn chqn) {
        bmxy.m108582a(chqn, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f189015j;
            if (i >= objArr.length) {
                return chqn.f189004a;
            }
            if (chqn.equals(objArr[i][0])) {
                return this.f189015j[i][1];
            }
            i++;
        }
    }

    /* renamed from: a */
    public final boolean mo85549a() {
        return Boolean.TRUE.equals(this.f189012g);
    }
}
