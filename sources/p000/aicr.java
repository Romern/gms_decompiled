package p000;

import android.accounts.Account;

/* renamed from: aicr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aicr implements basc {

    /* renamed from: a */
    final /* synthetic */ aics f68701a;

    /* renamed from: b */
    private final Account f68702b;

    /* renamed from: c */
    private boolean f68703c;

    public aicr(aics aics, Account account) {
        this.f68701a = aics;
        this.f68702b = account;
    }

    /* renamed from: a */
    public final void mo29375a() {
        this.f68703c = true;
    }

    /* renamed from: a */
    public final void mo29376a(basd basd) {
        this.f68703c = true;
    }

    /* renamed from: b */
    public final void mo29377b() {
        this.f68703c = true;
    }

    /* renamed from: c */
    public final void mo29378c() {
        srn srn = ahsd.f67925a;
        if (!this.f68701a.f68721r && cfoj.m141569s()) {
            aics aics = this.f68701a;
            snp.m35704b(10).execute(new ahuk(aics.f68708e, aics.f68710g, this.f68702b));
        }
        if (this.f68703c) {
            aics aics2 = this.f68701a;
            if (!aics2.f68704a.mo72985b(aics2.f68724u)) {
                String str = this.f68702b.name;
                aics aics3 = this.f68701a;
                aics3.f68704a.mo72983a(aics3.f68724u, cfog.m141293u());
            } else {
                String str2 = this.f68702b.name;
            }
            this.f68703c = false;
            return;
        }
        String str3 = this.f68702b.name;
    }
}
