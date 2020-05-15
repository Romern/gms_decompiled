package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: bcdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bcdf extends bdar {

    /* renamed from: a */
    public final Executor f103991a;

    /* renamed from: b */
    protected final bdae f103992b;

    /* renamed from: c */
    protected final bcdo f103993c;

    /* renamed from: d */
    protected final bcde f103994d;

    public bcdf(Context context, bmxj bmxj, bdae bdae, Uri uri, bcdo bcdo) {
        if (bcdo.mo56694h() != null) {
            bmxy.m108601b(this instanceof bcdi, "filterPredicate isn't valid in parent monitor");
        }
        this.f103991a = bqgs.m112813a((Executor) bbor.m88286a().f103024a);
        this.f103993c = bcdo;
        this.f103992b = bdae;
        this.f103994d = new bcde(this, context, bmxj, uri);
    }

    /* renamed from: a */
    protected static String m88812a(int i, int i2) {
        String valueOf = i2 >= 0 ? String.valueOf(i2) : "2147483647";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(i);
        sb.append(", ");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo56706b() {
        bcde bcde = this.f103994d;
        bcde.getClass();
        mo57828a((Runnable) new bcda(bcde));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo56707c() {
        bbov.m88299a();
        return bcbb.m88741a(this.f103992b, new bcdb(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo56704a() {
        bcde bcde = this.f103994d;
        bcde.getClass();
        mo57828a((Runnable) new bccz(bcde));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56705a(Object obj) {
        super.mo56705a(obj);
    }
}
