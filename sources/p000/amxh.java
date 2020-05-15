package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxh extends amxg {

    /* renamed from: p */
    private static final bnhe f76274p = bnhe.m109410a(amjf.GROUP, amke.GROUP_SYNC_UP_PROGRESS, amjf.CONTACT, amke.CONTACT_SYNC_UP_PROGRESS, amjf.PHOTO, amke.PHOTO_SYNC_UP_PROGRESS);

    public amxh(Context context, Account account, alsj alsj, anaz anaz) {
        super(context, account, alsj, anaz, C0126R.string.people_fsa_progress_notification_format_for_sync_up, 3, "FSA2_SyncUpProgressNotifier");
    }

    /* renamed from: a */
    public static boolean m63628a(alsj alsj, anaz anaz, String str) {
        if (!amxg.m63608f() || !cfyk.f186101a.mo6606a().mo83086P() || ((cfyk.f186101a.mo6606a().mo83107k() && ((anbh) anaz).f76555o > 0) || ((long) alsj.mo40703g(str)) >= cfyk.f186101a.mo6606a().mo83117u())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo41509a() {
        return "com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP";
    }

    /* renamed from: b */
    public final String mo41512b() {
        return "com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP";
    }

    /* renamed from: c */
    public final Intent mo41513c() {
        if (cfyk.f186101a.mo6606a().mo83093W()) {
            return mo41523e();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final amke mo41508a(amjf amjf) {
        return (amke) f76274p.getOrDefault(amjf, amke.UNKNOWN_STAGE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41511a(int i, boolean z) {
        if (this.f76263k > 0) {
            mo41517a(false);
        }
        mo41526h();
    }
}
