package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: amxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxe extends amxg {

    /* renamed from: q */
    private static final bnhe f76249q = bnhe.m109410a(amjf.GROUP, amke.GROUP_SYNC_DOWN_PROGRESS, amjf.CONTACT, amke.CONTACT_SYNC_DOWN_PROGRESS, amjf.PHOTO, amke.PHOTO_SYNC_DOWN_PROGRESS);

    /* renamed from: p */
    private int f76250p = -1;

    public amxe(Context context, Account account, alsj alsj, anaz anaz) {
        super(context, account, alsj, anaz, C0126R.string.people_fsa_progress_notification_format_for_sync_down, 2, "FSA2_SyncDownProgressNotifier");
    }

    /* renamed from: a */
    public static boolean m63599a(alsj alsj, anaz anaz, String str) {
        if (amxg.m63608f()) {
            anbh anbh = (anbh) anaz;
            if (!anbh.f76560t || !cfyk.f186101a.mo6606a().mo83083M()) {
                return !anbh.f76560t && cfyk.f186101a.mo6606a().mo83085O();
            }
            if (cfyk.f186101a.mo6606a().mo83084N() || !alsj.mo40708l(str)) {
                return !cfyk.f186101a.mo6606a().mo83105i() || ((long) alsj.mo40707k(str)) < cfyk.f186101a.mo6606a().mo83115s();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final String mo41509a() {
        return "com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN";
    }

    /* renamed from: b */
    public final String mo41512b() {
        return "com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN";
    }

    /* renamed from: c */
    public final Intent mo41513c() {
        if (cfyk.f186101a.mo6606a().mo83072B()) {
            try {
                this.f76256d.getPackageManager().getPackageInfo("com.google.android.contacts", 0);
                return new Intent("android.intent.action.VIEW").setType("vnd.android.cursor.dir/raw_contact").putExtra("com.android.contacts.extra.ACCOUNT_NAME", this.f76261i).putExtra("com.android.contacts.extra.ACCOUNT_TYPE", "com.google").setPackage("com.google.android.contacts");
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (cfyk.f186101a.mo6606a().mo83092V()) {
            return mo41523e();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final amke mo41508a(amjf amjf) {
        return (amke) f76249q.getOrDefault(amjf, amke.UNKNOWN_STAGE);
    }

    /* renamed from: a */
    public final void mo41510a(int i) {
        this.f76250p = i;
        super.mo41510a(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
     arg types: [java.util.ArrayList, int]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, bmxz):boolean
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r3 < p000.cfyk.f186101a.mo83070l().mo83116t()) goto L_0x0098;
     */
    /* renamed from: a */
    public final void mo41511a(int i, boolean z) {
        if (this.f76250p <= 0) {
            return;
        }
        if (i == 1) {
            if (!z) {
                if (!((anbh) this.f76262j).f76562v && (!cfyk.f186101a.mo6606a().mo83106j() || !this.f76260h.mo40708l(this.f76261i))) {
                    int k = this.f76260h.mo40707k(this.f76261i);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!cfyk.f186101a.mo6606a().mo83095Y()) {
                        long j = (long) k;
                        if (j > cfyk.f186101a.mo6606a().mo83118v()) {
                        }
                    } else {
                        ArrayList arrayList = new ArrayList(cfyk.f186101a.mo6606a().mo83097a().f165791a);
                        Collections.sort(arrayList);
                        if (k <= ((Integer) bnjd.m109591c((Iterable) arrayList, (Object) -1)).intValue()) {
                            if (arrayList.contains(Integer.valueOf(k))) {
                                this.f76260h.mo40681a(this.f76261i, currentTimeMillis);
                            }
                        }
                    }
                    if (((long) k) > cfyk.f186101a.mo6606a().mo83119w()) {
                        alsj alsj = this.f76260h;
                        String str = this.f76261i;
                        SharedPreferences sharedPreferences = alsj.f74200a;
                        String valueOf = String.valueOf(str);
                        if (currentTimeMillis - sharedPreferences.getLong(valueOf.length() == 0 ? new String("focus_first_full_sync_failure_notification_last_show_timestamp_") : "focus_first_full_sync_failure_notification_last_show_timestamp_".concat(valueOf), 0) > cfyk.f186101a.mo6606a().mo83094X() * 1000) {
                            this.f76260h.mo40681a(this.f76261i, currentTimeMillis);
                        }
                    }
                }
                mo41526h();
                return;
            }
            this.f76254b.mo13640e(this.f76256d.getResources().getString(!z ? C0126R.string.people_fsa_notification_title_for_first_full_sync_failure : C0126R.string.people_fsa_notification_title_for_first_full_sync_complete));
            Resources resources = this.f76256d.getResources();
            int i2 = this.f76250p;
            String quantityString = resources.getQuantityString(C0126R.plurals.people_fsa_progress_notification_format_for_contacts_sync, i2, Integer.valueOf(i2));
            if (z) {
                C1102je jeVar = this.f76254b;
                if (!cfyk.f186101a.mo6606a().mo83103g()) {
                    quantityString = this.f76256d.getResources().getString(C0126R.string.people_fsa_notification_text_for_first_full_sync_complete, quantityString);
                }
                jeVar.mo13632b(quantityString);
            } else {
                this.f76254b.mo13632b(this.f76256d.getResources().getString(C0126R.string.people_fsa_notification_text_for_first_full_sync_failure));
            }
            this.f76263k = 0;
            this.f76264l = 0;
            mo41517a(true);
            return;
        }
        mo41526h();
    }
}
