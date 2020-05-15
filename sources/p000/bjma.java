package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.chimera.Activity;
import java.io.File;
import java.util.Locale;

/* renamed from: bjma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjma extends bjhy {

    /* renamed from: p */
    boolean f122955p = false;

    /* renamed from: q */
    private bwpf f122956q;

    public bjma(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 1001) {
            this.f122955p = false;
            int b = bjfv.m103325b(bjfd);
            if (b == -1) {
                mo65255r();
            } else if (b != 10007) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmb bjmb = (bjmb) ((bjhy) this).f122754m;
        return bjmb == null ? new bjmb() : bjmb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f122955p) {
            String format = String.format(Locale.US, "document_%d.jpg", Long.valueOf(SystemClock.elapsedRealtime()));
            bjhi bjhi = this.f122639a.f122692a;
            Activity activity = bjhi.f122727d;
            String str = bjhi.f122733j;
            File file = new File(activity.getCacheDir(), "wallet_document_cache");
            file.mkdirs();
            Uri uri = null;
            if (file.exists()) {
                File file2 = new File(file, format);
                file2.delete();
                if (!file2.exists()) {
                    uri = C1136kk.m17966a(activity, str, file2);
                }
            }
            if (uri != null) {
                ((bjmb) ((bjhy) this).f122754m).mo65262a(uri.toString());
                akox akox = new akox(this.f122639a.f122692a.f122727d);
                akox.mo39617a(uri);
                bwpf bwpf = this.f122956q;
                if ((bwpf.f160535a & 1) != 0) {
                    akox.mo39622e(bwpf.f160536b);
                }
                bwpf bwpf2 = this.f122956q;
                if ((bwpf2.f160535a & 2) != 0) {
                    akox.mo39620c(bwpf2.f160537c);
                }
                bwpf bwpf3 = this.f122956q;
                if ((bwpf3.f160535a & 4) != 0) {
                    akox.mo39619b(bwpf3.f160538d);
                }
                bwpf bwpf4 = this.f122956q;
                if ((bwpf4.f160535a & 8) != 0) {
                    akox.mo39618a(bwpf4.f160539e);
                }
                bwpf bwpf5 = this.f122956q;
                if ((bwpf5.f160535a & 16) != 0) {
                    akox.mo39621d(bwpf5.f160540f);
                }
                Intent a = akox.mo39616a();
                if (a != null) {
                    this.f122639a.f122692a.f122732i.grantUriPermission("com.google.android.gms", uri, 3);
                    this.f122955p = true;
                    mo65128n().mo65084a(1001, bjfv.m103324a(a, this.f122639a.f122692a.f122724a));
                    return;
                }
                mo65256s();
                return;
            }
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo65260w() {
        this.f122955p = false;
        ((bjmb) ((bjhy) this).f122754m).mo65262a("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo65261x() {
        this.f122955p = false;
        ((bjmb) ((bjhy) this).f122754m).mo65262a("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("hasLaunched", this.f122955p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122955p = bundle.getBoolean("hasLaunched", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwpf.f160533h;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122956q = (bwpf) b;
    }
}
