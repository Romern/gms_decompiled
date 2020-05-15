package p000;

import java.io.InputStream;

/* renamed from: mhw */
final /* synthetic */ class mhw implements mjm {

    /* renamed from: a */
    private final mpi f33747a;

    /* renamed from: b */
    private final mmh f33748b;

    /* renamed from: c */
    private final InputStream f33749c;

    public mhw(mpi mpi, mmh mmh, InputStream inputStream) {
        this.f33747a = mpi;
        this.f33748b = mmh;
        this.f33749c = inputStream;
    }

    /* renamed from: a */
    public final void mo20024a(int i) {
        mpi mpi = this.f33747a;
        mmh mmh = this.f33748b;
        InputStream inputStream = this.f33749c;
        if (i == 3) {
            if (mpi.f34150a == null) {
                moz moz = moz.f34092c;
            }
            if (mpi.f34151b == null) {
                mph mph = mph.f34141f;
            }
        }
        mph mph2 = mpi.f34151b;
        if (mph2 == null) {
            mph2 = mph.f34141f;
        }
        mmh.mo20164a(mph2, inputStream);
    }
}
