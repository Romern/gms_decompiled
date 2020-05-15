package p000;

import android.content.Context;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: njk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class njk implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final nqy f35824a;

    /* renamed from: b */
    private final Context f35825b;

    /* renamed from: c */
    private final List f35826c = new ArrayList();

    /* renamed from: d */
    private final njm f35827d;

    public njk(Context context, nqy nqy, njm njm) {
        this.f35825b = context;
        this.f35824a = nqy;
        this.f35827d = njm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized njl mo20894a(njp njp, ntq ntq) {
        njl njl;
        njl = new njl(this, njp, ntq, this.f35825b);
        this.f35826c.add(njl);
        return njl;
    }

    /* renamed from: b */
    public final synchronized void mo20897b() {
        this.f35824a.f12819a.unlinkToDeath(this, 0);
        List list = this.f35826c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            njl njl = (njl) list.get(i);
            njl.mo20903b();
            njl.mo20899a();
        }
        this.f35826c.clear();
    }

    public final synchronized void binderDied() {
        mo20897b();
        this.f35827d.mo20910a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo20895a(njl njl) {
        this.f35826c.remove(njl);
        if (this.f35826c.isEmpty()) {
            this.f35827d.mo20910a(this);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    public final synchronized boolean mo20896a() {
        boolean z;
        z = false;
        this.f35824a.f12819a.linkToDeath(this, 0);
        z = true;
        return z;
    }
}
