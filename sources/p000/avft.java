package p000;

import android.accounts.Account;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: avft */
final /* synthetic */ class avft implements Callable {

    /* renamed from: a */
    private final avfu f93106a;

    /* renamed from: b */
    private final Account f93107b;

    public avft(avfu avfu, Account account) {
        this.f93106a = avfu;
        this.f93107b = account;
    }

    public final Object call() {
        avfu avfu = this.f93106a;
        Account account = this.f93107b;
        beju beju = avfu.f93109b;
        Uri build = new Uri.Builder().scheme("android").authority(avfu.f93108a.getPackageName()).path(String.format("/%s/%s/%s/%s/%s", "files", avfu.m78447a(), gik.m13218f(avfu.f93108a, account.name), 1, "acr.pb")).build();
        bejq g = bejr.m95186g();
        g.mo60762a(build);
        g.mo60764a(auzj.f92827d);
        g.mo60763a(bejb.f111635a);
        return new avfs(beju.mo60765a(g.mo60761a()));
    }
}
