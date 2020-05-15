package p000;

import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: abbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbu extends abbz {

    /* renamed from: a */
    final /* synthetic */ Intent f57021a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f57022b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abbu(rkb rkb, Intent intent, WeakReference weakReference) {
        super(rkb);
        this.f57021a = intent;
        this.f57022b = weakReference;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31997a(abci abci) {
        GoogleHelp googleHelp = (GoogleHelp) this.f57021a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        GoogleHelp googleHelp2 = new aare(googleHelp).f56363a;
        aard aard = googleHelp2.f78756G;
        wvd wvd = googleHelp2.f78757H;
        abck abck = new abck(googleHelp);
        abbp abbp = new abbp(this, abci, this, aard, wvd);
        if (aard == null) {
            abbp.mo31995a(abck.f57036a);
        } else {
            abck.m47447a(new abbo(abck.f57036a, aard, abbp), 10);
        }
    }
}
