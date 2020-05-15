package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: chwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwd extends ciaj {

    /* renamed from: i */
    public static final /* synthetic */ int f189319i = 0;

    /* renamed from: a */
    public final Object f189320a;

    /* renamed from: b */
    public final Collection f189321b = new ArrayList();

    /* renamed from: c */
    public boolean f189322c;

    /* renamed from: d */
    public boolean f189323d = false;

    /* renamed from: e */
    public chuv f189324e;

    /* renamed from: f */
    public boolean f189325f;

    /* renamed from: g */
    public boolean f189326g;

    /* renamed from: h */
    final /* synthetic */ chwe f189327h;

    /* renamed from: t */
    private int f189328t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chwd(chwe chwe, ciez ciez, Object obj, cifh cifh) {
        super(4194304, ciez, cifh);
        this.f189327h = chwe;
        bmxy.m108582a(obj, "lock");
        this.f189320a = obj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciaj.a(cidy, boolean):void
     arg types: [cidy, int]
     candidates:
      chwd.a(chwd, java.nio.ByteBuffer):void
      ciaj.a(cidy, boolean):void */
    /* renamed from: a */
    static /* synthetic */ void m149666a(chwd chwd, ByteBuffer byteBuffer) {
        chwd.f189328t += byteBuffer.remaining();
        super.mo85867a(ciec.m150111a(byteBuffer), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85731a() {
        super.mo85731a();
    }

    /* renamed from: a */
    public final void mo85732a(int i) {
        chwe chwe = this.f189327h;
        ByteBuffer byteBuffer = chwe.f189329a;
        bmxy.m108582a(chwe.f189341k, "stream must not be null");
        int i2 = this.f189328t - i;
        this.f189328t = i2;
        if (i2 == 0 && !this.f189325f) {
            this.f189327h.f189341k.read(ByteBuffer.allocateDirect(4096));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85733a(chuv chuv, boolean z, chtr chtr) {
        chwe chwe = this.f189327h;
        ByteBuffer byteBuffer = chwe.f189329a;
        bmxy.m108582a(chwe.f189341k, "stream must not be null");
        this.f189327h.f189341k.cancel();
        mo85777b(chuv, z, chtr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: chwd.a(chuv, boolean, chtr):void
     arg types: [chuv, int, chtr]
     candidates:
      chwr.a(chuv, chxt, chtr):void
      chwd.a(chuv, boolean, chtr):void */
    /* renamed from: a */
    public final void mo85734a(Throwable th) {
        mo85733a(chuv.m149608a(th), true, new chtr());
    }
}
