package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bdwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdwt {

    /* renamed from: a */
    public final ayte f106549a;

    /* renamed from: b */
    public final Executor f106550b;

    /* renamed from: c */
    public final bmzi f106551c;

    /* renamed from: d */
    public final bdvs f106552d;

    /* renamed from: e */
    public final abry f106553e;

    /* renamed from: f */
    public final bdrl f106554f;

    public bdwt(abry abry, ayte ayte, Executor executor, bmzi bmzi, bdrl bdrl) {
        this.f106553e = abry;
        this.f106549a = ayte;
        this.f106550b = executor;
        this.f106551c = bmzi;
        this.f106554f = bdrl;
        abry.getClass();
        this.f106552d = new bdvs(4002, ayte, bdrl, new bdwk());
    }

    /* renamed from: a */
    static final /* synthetic */ void m91528a(bqgg bqgg, bdqz bdqz) {
        try {
            bqga.m112780a((Future) bqgg);
        } catch (CancellationException | ExecutionException e) {
            bdqz.close();
        }
    }
}
