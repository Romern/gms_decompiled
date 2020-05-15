package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: avav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avav extends aaab {

    /* renamed from: a */
    private long f92881a;

    /* renamed from: c */
    protected final Context f92882c;

    /* renamed from: d */
    protected final avdl f92883d;

    /* renamed from: e */
    protected final ClientContext f92884e;

    /* renamed from: f */
    protected final String f92885f;

    /* renamed from: g */
    protected final Account f92886g;

    /* renamed from: h */
    protected final String f92887h;

    /* renamed from: i */
    protected boolean f92888i;

    /* renamed from: j */
    protected final avjn f92889j;

    public avav(Context context, avdl avdl, ClientContext clientContext, String str, String str2) {
        super(35, str2);
        String str3;
        sdo.m34959a(context);
        this.f92882c = context;
        sdo.m34959a(avdl);
        this.f92883d = avdl;
        sdo.m34959a(clientContext);
        this.f92884e = clientContext;
        Account account = clientContext.f30213c;
        this.f92886g = account;
        avjn avjn = null;
        if (account != null) {
            str3 = account.name;
        } else {
            str3 = null;
        }
        this.f92885f = str3;
        this.f92887h = str;
        this.f92889j = str3 != null ? new avjn(this.f92882c, str3) : avjn;
        this.f92888i = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51131a(int i) {
        mo51132a(i, i <= 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51133b() {
        this.f92881a = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo51134c() {
        return gik.m13218f(this.f92882c, this.f92885f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51132a(int i, boolean z) {
        if (this.f92889j == null) {
            return;
        }
        if (!this.f92888i || Math.random() < chav.f188214a.mo6606a().mo84889a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f92881a;
            if (!z) {
                this.f92889j.mo51296a(this.f92887h, this.f27820m, elapsedRealtime, i, false);
            } else {
                this.f92889j.mo51296a(this.f92887h, this.f27820m, elapsedRealtime, i, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6502a(Context context) {
        if (this.f92886g == null || this.f92885f == null) {
            throw new aaaj(8, "No account provided");
        }
    }
}
