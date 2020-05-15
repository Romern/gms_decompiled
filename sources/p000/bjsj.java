package p000;

import android.content.DialogInterface;
import com.google.android.chimera.FragmentManager;
import java.util.concurrent.Executor;

/* renamed from: bjsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsj {

    /* renamed from: a */
    public dnx f123223a;

    /* renamed from: b */
    public final Executor f123224b;

    /* renamed from: c */
    public final bjsg f123225c;

    /* renamed from: d */
    public bjsq f123226d;

    /* renamed from: e */
    public bjsr f123227e;

    /* renamed from: f */
    public bjsc f123228f;

    /* renamed from: g */
    public boolean f123229g;

    /* renamed from: h */
    public boolean f123230h;

    /* renamed from: i */
    public final DialogInterface.OnClickListener f123231i = new bjse(this);

    /* renamed from: j */
    private final C1504y f123232j = new bjsf(this);

    public bjsj(dnx dnx, Executor executor, bjsg bjsg) {
        if (executor != null) {
            this.f123223a = dnx;
            this.f123225c = bjsg;
            this.f123224b = executor;
            dnx.getLifecycle().mo557a(this.f123232j);
            return;
        }
        throw new IllegalArgumentException("Executor must not be null");
    }

    /* renamed from: a */
    public final FragmentManager mo65496a() {
        return this.f123223a.getSupportFragmentManager();
    }
}
