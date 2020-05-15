package p000;

import android.content.Context;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: acsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsx implements Closeable {

    /* renamed from: a */
    public final Context f60706a;

    /* renamed from: b */
    public cafx f60707b;

    /* renamed from: c */
    public final acsw f60708c = new acsw();

    /* renamed from: d */
    public final acsh f60709d;

    /* renamed from: e */
    public acsz f60710e;

    /* renamed from: f */
    public final acsy f60711f;

    /* renamed from: g */
    public final bqgg f60712g;

    /* renamed from: h */
    public final Executor f60713h;

    public acsx(Context context, acsh acsh, acsy acsy, bqgg bqgg) {
        this.f60706a = context;
        this.f60709d = acsh;
        this.f60711f = acsy;
        this.f60710e = null;
        this.f60713h = bqfb.INSTANCE;
        this.f60712g = bqgg;
    }

    /* renamed from: a */
    public final bqgg mo33064a(bdwj bdwj) {
        if (this.f60708c.f60704a.isEmpty()) {
            return bqga.m112775a((Object) null);
        }
        acsw acsw = this.f60708c;
        List list = acsw.f60704a;
        acsw.f60704a = new ArrayList();
        acsw.f60705b = 0;
        return bdwj.mo58411a(list);
    }

    public final void close() {
        try {
            ((bdwj) this.f60712g.get()).close();
        } catch (InterruptedException | ExecutionException e) {
        }
    }
}
