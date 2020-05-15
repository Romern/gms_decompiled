package p000;

import android.content.Context;

/* renamed from: mhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mhu implements mjn {

    /* renamed from: a */
    public static final lvn f33742a = new lvn("Protocol");

    /* renamed from: b */
    final Context f33743b;

    /* renamed from: c */
    final bqgj f33744c;

    /* renamed from: d */
    public mjo f33745d;

    /* renamed from: e */
    private miu f33746e;

    public mhu(Context context, bqgj bqgj) {
        bmxy.m108581a(context);
        this.f33743b = context;
        bmxy.m108581a(bqgj);
        this.f33744c = bqgj;
    }

    /* renamed from: a */
    public static mpn m25129a(int i, int i2, String str) {
        bxvd da = mpn.f34188e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpn mpn = (mpn) da.f164949b;
        int i3 = mpn.f34190a | 1;
        mpn.f34190a = i3;
        mpn.f34191b = i;
        int i4 = i3 | 4;
        mpn.f34190a = i4;
        mpn.f34193d = i2 - 1;
        str.getClass();
        mpn.f34190a = i4 | 2;
        mpn.f34192c = str;
        return (mpn) da.mo74062i();
    }

    /* renamed from: b */
    public static final mpm m25130b(mpl mpl) {
        bxvd da = mpm.f34178i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpm mpm = (mpm) da.f164949b;
        mpm.f34181b = mpl.f34177s;
        mpm.f34180a |= 1;
        return (mpm) da.mo74062i();
    }

    /* renamed from: a */
    public abstract void mo20031a(int i, String str, boolean z);

    /* renamed from: a */
    public void mo20036a(mpq mpq, mpn mpn) {
        throw null;
    }

    /* renamed from: b */
    public synchronized void mo20037b() {
        miu miu = this.f33746e;
        if (miu != null) {
            this.f33746e = null;
            miu.mo20024a(2);
        }
    }

    /* renamed from: a */
    public final synchronized miu mo20029a() {
        miu miu;
        miu = this.f33746e;
        if (miu == null) {
            f33742a.mo25418e("Unexpected stream; ignoring.", new Object[0]);
            miu = new mhs(this);
        } else {
            this.f33746e = null;
        }
        return miu;
    }

    /* renamed from: a */
    public final mpm mo20030a(int i, String str) {
        mpm b = m25130b(mpl.ERROR);
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        bxvd da = mpn.f34188e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpn mpn = (mpn) da.f164949b;
        mpn.f34190a |= 1;
        mpn.f34191b = i;
        String a = stm.m36299a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpn mpn2 = (mpn) da.f164949b;
        a.getClass();
        mpn2.f34190a |= 2;
        mpn2.f34192c = a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mpm mpm = (mpm) bxvd.f164949b;
        mpn mpn3 = (mpn) da.mo74062i();
        mpm mpm2 = mpm.f34178i;
        mpn3.getClass();
        mpm.f34184e = mpn3;
        mpm.f34180a |= 8;
        return (mpm) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo20032a(bxxc bxxc) {
        this.f33745d.mo20102a(bxxc.mo73639aL().mo73763g(), new mhr(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo20033a(miu miu) {
        sdo.m34971a(this.f33746e == null, (Object) "Unable to set stream expectation - it was not null!");
        this.f33746e = miu;
    }

    /* renamed from: a */
    public final void mo20034a(mpl mpl) {
        mo20035a(m25130b(mpl));
    }

    /* renamed from: a */
    public final void mo20035a(mpm mpm) {
        lvn lvn = f33742a;
        Object[] objArr = new Object[1];
        mpl a = mpl.m25483a(mpm.f34181b);
        if (a == null) {
            a = mpl.PACKET_TYPE_UNSPECIFIED;
        }
        objArr[0] = a;
        lvn.mo25412b("Sending packet of type: %s", objArr);
        this.f33745d.mo20104c(mpm.serializeToBytes());
    }
}
