package p000;

import android.content.Intent;
import android.os.Message;
import android.os.WorkSource;
import com.google.android.gms.location.WifiScan;

/* renamed from: bgxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bgxs extends snr {

    /* renamed from: a */
    final /* synthetic */ bgxx f117934a;

    /* renamed from: b */
    private final ssh f117935b;

    /* renamed from: f */
    private final String f117936f;

    /* renamed from: g */
    private final sns f117937g;

    /* renamed from: h */
    private final asfb f117938h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected bgxs(bgxx bgxx, sns sns, String str) {
        super(sns);
        ssh a = ssh.m36213a(bgxx.f117952b);
        this.f117934a = bgxx;
        this.f117938h = new asfb(bgxx.f117952b, 1, str.concat("WL"), null, "com.google.android.gms");
        this.f117935b = a;
        this.f117937g = sns;
        this.f117936f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63328a(Intent intent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63329a(Message message) {
        String valueOf = String.valueOf(message);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("DispatchingService received message: ");
        sb.append(valueOf);
        sb.toString();
        int i = message.what;
        if (i == 1) {
            bgxx bgxx = this.f117934a;
            int i2 = bgxx.f117951w;
            String c = bgxx.f117958h.mo63294b().mo63289c();
            if (c != null) {
                if (this.f117938h.mo49124e()) {
                    this.f117938h.mo49121c(stx.m36335a(this.f117934a.f117952b, c));
                }
                StringBuilder sb2 = new StringBuilder(c.length() + 20);
                sb2.append("Blaming upload on '");
                sb2.append(c);
                sb2.append("'");
                sb2.toString();
            }
            mo63328a((Intent) message.obj);
        } else if (i != 5) {
            String valueOf2 = String.valueOf(message);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 50);
            sb3.append("DispatchingService received unrecognized message: ");
            sb3.append(valueOf2);
            bgur.m100024c("GCoreUlr", 30, sb3.toString());
        } else if (chcs.m148238j()) {
            bgxx bgxx2 = this.f117934a;
            int i3 = bgxx.f117951w;
            bgxx2.mo63336c();
        } else {
            mo63330a((WifiScan) message.obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63330a(WifiScan wifiScan);

    /* renamed from: c */
    public void mo25780c() {
        String valueOf = String.valueOf(this.f117936f);
        bgur.m100011a("GCoreUlr", valueOf.length() == 0 ? new String("Stopping handler for ") : "Stopping handler for ".concat(valueOf));
        this.f117937g.quit();
    }

    public final void handleMessage(Message message) {
        if (!this.f117935b.mo26039a()) {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
            sb.append("DispatchingService ignoring event for non-foreground user: ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        if ((!this.f117936f.equals("UlrDispSvcSlow") || !chcs.f188354a.mo6606a().mo85025N()) && (!this.f117936f.equals("UlrDispSvcFast") || !chcs.f188354a.mo6606a().mo85024M())) {
            mo63329a(message);
        } else {
            try {
                this.f117938h.mo49111a(chcs.f188354a.mo6606a().mo85097bf());
                if (this.f117938h.mo49124e()) {
                    this.f117938h.mo49121c((WorkSource) null);
                }
                mo63329a(message);
                if (this.f117938h.mo49124e()) {
                    this.f117938h.mo49120c();
                }
            } catch (Throwable th) {
                if (this.f117938h.mo49124e()) {
                    this.f117938h.mo49120c();
                }
                throw th;
            }
        }
        bgxx bgxx = this.f117934a;
        int i = bgxx.f117951w;
        if (!bgxx.f117953c.mo63354a().mo70930d() && message.what == 1) {
            this.f117934a.f117960j.mo63332a(message.arg1);
        }
    }
}
