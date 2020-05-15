package p000;

import java.util.concurrent.ExecutorService;

@Deprecated
/* renamed from: qkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qkc extends qkg {

    /* renamed from: b */
    protected final ExecutorService f41590b;

    protected qkc(String str, qke qke) {
        this(str, qke, 500);
    }

    /* renamed from: a */
    public final void mo24056a(qkf qkf) {
        this.f41590b.execute(qkf);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f41590b.shutdown();
    }

    protected qkc(String str, qke qke, long j) {
        super(str, qke, j);
        this.f41590b = snp.m35704b(10);
    }

    protected qkc(String str, qke qke, long j, ExecutorService executorService) {
        super(str, qke, j);
        this.f41590b = executorService;
    }
}
