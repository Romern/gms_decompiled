package p000;

import java.io.InputStream;

/* renamed from: mhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mhz extends mit {

    /* renamed from: a */
    final /* synthetic */ mib f33753a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mhz(mib mib, mhu mhu) {
        super(mhu);
        this.f33753a = mib;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mib.a(int, java.lang.String, boolean):void
     arg types: [int, java.lang.String, int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mib.a(int, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20026b() {
        mib.f33754e.mo25416d("ItemRequest stream expectation failed.", new Object[0]);
        this.f33753a.mo20031a(2, "ItemRequest stream expectation failed.", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo20039a(byte[] bArr) {
        return (mpi) bxvk.m124016a(mpi.f34148c, bArr, bxus.m123744c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20040a(bxxc bxxc) {
        InputStream inputStream;
        mpi mpi = (mpi) bxxc;
        mib mib = this.f33753a;
        mmm mmm = mib.f33755f;
        moz moz = mpi.f34150a;
        if (moz == null) {
            moz = moz.f34092c;
        }
        mmh a = mmm.mo20168a(moz.f34095b);
        try {
            mph mph = mpi.f34151b;
            if (mph == null) {
                mph = mph.f34141f;
            }
            inputStream = a.mo20162a(mph);
        } catch (mmq e) {
            inputStream = new mia();
        }
        mib.f33745d.mo20102a(inputStream, new mhw(mpi, a, inputStream));
    }
}
