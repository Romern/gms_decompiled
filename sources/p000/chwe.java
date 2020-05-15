package p000;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* renamed from: chwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwe extends chwm {

    /* renamed from: a */
    public static final ByteBuffer f189329a = ByteBuffer.allocateDirect(0);
    @Deprecated

    /* renamed from: b */
    static final chqn f189330b = chqn.m149404a("cronet-annotation");

    /* renamed from: c */
    static final chqn f189331c = chqn.m149404a("cronet-annotations");

    /* renamed from: t */
    private static volatile boolean f189332t;

    /* renamed from: u */
    private static volatile Method f189333u;

    /* renamed from: d */
    public final String f189334d;

    /* renamed from: e */
    public final String f189335e;

    /* renamed from: f */
    public final ciez f189336f;

    /* renamed from: g */
    public final Executor f189337g;

    /* renamed from: h */
    public final chtr f189338h;

    /* renamed from: i */
    public final chwh f189339i;

    /* renamed from: j */
    public final Runnable f189340j;

    /* renamed from: k */
    public BidirectionalStream f189341k;

    /* renamed from: l */
    public final boolean f189342l;

    /* renamed from: m */
    public final Object f189343m;

    /* renamed from: n */
    public final Collection f189344n;

    /* renamed from: o */
    public final chwd f189345o;

    /* renamed from: p */
    public chvx f189346p;

    /* renamed from: v */
    private final chwc f189347v = new chwc(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chwe(String str, String str2, Executor executor, chtr chtr, chwh chwh, Runnable runnable, Object obj, chtv chtv, ciez ciez, chqo chqo, cifh cifh) {
        super(new chwj(), ciez, cifh, chtr, chqo);
        ciez ciez2 = ciez;
        chqo chqo2 = chqo;
        bmxy.m108582a(str, "url");
        this.f189334d = str;
        bmxy.m108582a(str2, "userAgent");
        this.f189335e = str2;
        bmxy.m108582a(ciez2, "statsTraceCtx");
        this.f189336f = ciez2;
        bmxy.m108582a(executor, "executor");
        this.f189337g = executor;
        bmxy.m108582a(chtr, "headers");
        this.f189338h = chtr;
        bmxy.m108582a(chwh, "transport");
        this.f189339i = chwh;
        bmxy.m108582a(runnable, "startCallback");
        this.f189340j = runnable;
        this.f189342l = chtv.f189149a == chtu.UNARY;
        this.f189343m = chqo2.mo85548a(f189330b);
        this.f189344n = (Collection) chqo2.mo85548a(f189331c);
        this.f189345o = new chwd(this, ciez2, obj, cifh);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m149671a(ExperimentalBidirectionalStream.Builder builder, Object obj) {
        if (!f189332t) {
            synchronized (chwe.class) {
                if (!f189332t) {
                    try {
                        f189333u = ExperimentalBidirectionalStream.Builder.class.getMethod("addRequestAnnotation", Object.class);
                        f189332t = true;
                    } catch (NoSuchMethodException e) {
                        try {
                            Log.w("grpc-java-cronet", "Failed to load method ExperimentalBidirectionalStream.Builder.addRequestAnnotation", e);
                            f189332t = true;
                        } catch (Throwable th) {
                            f189332t = true;
                            throw th;
                        }
                    }
                }
            }
        }
        if (f189333u != null) {
            try {
                f189333u.invoke(builder, obj);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2.getTargetException());
            } catch (IllegalAccessException e3) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Failed to add request annotation: ");
                sb.append(valueOf);
                Log.w("grpc-java-cronet", sb.toString(), e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ chwk mo85738b() {
        return this.f189347v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ chwr mo85739c() {
        return this.f189345o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ chwr mo85740d() {
        return this.f189345o;
    }

    /* renamed from: a */
    public final chqh mo85735a() {
        return chqh.f188999b;
    }

    /* renamed from: a */
    public final void mo85736a(chuv chuv) {
        this.f189339i.mo85747a(this, chuv);
    }

    /* renamed from: a */
    public final void mo85737a(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.f189341k;
        if (bidirectionalStream != null) {
            bidirectionalStream.write(byteBuffer, z);
            if (z2) {
                this.f189341k.flush();
            }
        }
    }
}
