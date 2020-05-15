package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* renamed from: yun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yun extends bqfn implements aubq {

    /* renamed from: a */
    private final bqgy f54650a = bqgy.m112818c();

    /* renamed from: b */
    public static bqgg m44873b(aucb aucb) {
        yun yun = new yun();
        aucb.mo50371a(yun);
        return yun;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f54650a.mo69138b(aucb.mo50386d());
        } else if (((auck) aucb).f91396d) {
            this.f54650a.mo69136a((Throwable) new CancellationException("Task is cancelled"));
        } else {
            this.f54650a.mo69136a((Throwable) aucb.mo50387e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bg */
    public final bqgg mo29771bg() {
        return this.f54650a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public final /* bridge */ /* synthetic */ Future mo29772bh() {
        return this.f54650a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f54650a;
    }

    private yun() {
    }
}
