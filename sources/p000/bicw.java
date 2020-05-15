package p000;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: bicw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicw {

    /* renamed from: a */
    public final Context f120252a;

    /* renamed from: b */
    public final bhrm f120253b;

    /* renamed from: c */
    public final ExecutorService f120254c;

    /* renamed from: d */
    public final bhuk f120255d;

    /* renamed from: e */
    public final Handler f120256e;

    /* renamed from: f */
    public bhtp f120257f;

    /* renamed from: g */
    public final bicy f120258g;

    public bicw(Context context, bhrm bhrm, ExecutorService executorService, Handler handler) {
        this.f120252a = context;
        this.f120253b = bhrm;
        this.f120254c = executorService;
        this.f120256e = handler;
        bict bict = (bict) bhrm;
        this.f120258g = bict.f120245h;
        this.f120255d = bict.f120241d;
    }

    /* renamed from: a */
    public final File mo64528a() {
        return this.f120252a.getDir("place_inference_data_index", 0);
    }
}
