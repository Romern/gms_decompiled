package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: apeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apeh {

    /* renamed from: c */
    public static final aoyh f84210c = aoyh.m69805a("CRSPresenter");

    /* renamed from: a */
    public final ContactsRestoreSettingsChimeraActivity f84211a;

    /* renamed from: b */
    public final apdr f84212b;

    /* renamed from: d */
    final apcm f84213d;

    /* renamed from: e */
    public final ltz f84214e;

    /* renamed from: f */
    private final boolean f84215f;

    /* renamed from: g */
    private final bqgj f84216g = new soc(1, 9);

    /* renamed from: h */
    private final aoxu f84217h;

    public apeh(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, apdr apdr) {
        this.f84211a = contactsRestoreSettingsChimeraActivity;
        this.f84212b = apdr;
        new aoxv(contactsRestoreSettingsChimeraActivity.getApplicationContext());
        this.f84213d = apcm.m70044a();
        this.f84215f = cgkf.m145856c();
        this.f84214e = ltu.m24388a(contactsRestoreSettingsChimeraActivity);
        this.f84217h = new aoxu(contactsRestoreSettingsChimeraActivity.getApplicationContext());
    }

    /* renamed from: a */
    public final String mo47129a() {
        apdr apdr = this.f84212b;
        apdr.mo47126a(apdr.f84186a.getString("restore:restore_account_name", null));
        String str = this.f84212b.f84187b;
        if (apel.m70100a(this.f84211a, str)) {
            return str;
        }
        ArrayList arrayList = new ArrayList(aoxs.m69790b(this.f84211a));
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, boolean, int, int):void
     arg types: [int, int, int, int]
     candidates:
      aoyj.a(int, java.lang.String, long, int):void
      aoyj.a(boolean, boolean, int, int):void */
    /* renamed from: b */
    public final void mo47134b(String str) {
        this.f84213d.f84135e = str;
        this.f84211a.mo58848a(true);
        f84210c.mo46981b("Prepare fetching available backups");
        if (aoyi.m69817b(str)) {
            this.f84211a.mo58846a((List) null);
            this.f84211a.mo58848a(false);
            return;
        }
        aoyj.m69819a().mo46999a(true, false, 0, 0);
        aucb a = aoxb.m69771a(this.f84211a).mo46972a(str, "");
        a.mo50373a(new apeg(this.f84211a, this, str));
        a.mo50372a(new apef(this.f84211a));
        if (this.f84215f) {
            aucb a2 = a.mo50366a(this.f84216g, new apds(this));
            a2.mo50372a(apdu.f84192a);
            aucb a3 = this.f84217h.mo46975a();
            aucb a4 = a3.mo50364a(new apdv(this, str));
            a3.mo50372a(apdw.f84195a);
            a4.mo50372a(new apdx(this, str));
            aucb a5 = a4.mo50366a(this.f84216g, new apdy());
            a5.mo50372a(apdz.f84198a);
            aucb a6 = aucu.m76785b(Arrays.asList(a5, a2)).mo50364a(new apea());
            a6.mo50373a(new apeb(this, str));
            a6.mo50372a(new apec(this));
        }
    }

    /* renamed from: a */
    public final List mo47130a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, apdt.f84191a);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo47131a(Exception exc) {
        if (!(exc instanceof rjp)) {
            aoyj.m69819a().mo46988a(4);
            this.f84211a.mo58842a((int) C0126R.string.common_something_went_wrong);
        } else if (((rjp) exc).mo24655a() == Status.f30111e.f30115i) {
            f84210c.mo46981b("Ignore the CANCELED exception");
        }
    }

    /* renamed from: a */
    public final void mo47132a(String str) {
        if (TextUtils.isEmpty(str)) {
            aoyj.m69819a().mo46996a("CRSP.opened_settings_with_no_account");
        }
        this.f84212b.mo47126a(str);
        this.f84211a.mo58844a(this.f84212b.f84187b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, boolean, int, int):void
     arg types: [int, int, int, int]
     candidates:
      aoyj.a(int, java.lang.String, long, int):void
      aoyj.a(boolean, boolean, int, int):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        if (r5.f84233e > 0) goto L_0x00f5;
     */
    /* renamed from: a */
    public final synchronized void mo47133a(String str, List list, List list2) {
        String str2;
        aoyj a = aoyj.m69819a();
        if (TextUtils.equals(str, this.f84212b.f84187b)) {
            if (cgkf.m145856c()) {
                aoyj.m69819a().mo46988a(15);
                apdr apdr = this.f84212b;
                if (list2 != null && !list2.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    apdr.f84188c.put(str, hashMap);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        apej apej = (apej) it.next();
                        if (apej.mo47137a() || apej.f84232d > 0) {
                            if (!cgkf.m145856c()) {
                                apdr.f84185d.mo46985d("updateContactsRestoreSources should only be called after enableEncryptedRestoreFromSettings is enabled.");
                            } else {
                                hashMap.put(apel.m70098a(apej), apej);
                            }
                        }
                    }
                }
            } else {
                apdr apdr2 = this.f84212b;
                if (list != null && !list.isEmpty()) {
                    HashMap hashMap2 = new HashMap();
                    apdr2.f84188c.put(str, hashMap2);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) it2.next();
                        if (backedUpContactsPerDeviceEntity.mo58802c() != null) {
                            apej a2 = apdr2.mo47125a(backedUpContactsPerDeviceEntity);
                            if (a2.f84232d > 0) {
                                hashMap2.put(a2.f84229a, a2);
                            }
                        }
                    }
                }
            }
            Map b = this.f84212b.mo47127b(str);
            if (b != null) {
                if (!b.isEmpty()) {
                    List a3 = mo47130a(new ArrayList(b.values()));
                    int size = a3.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        apej apej2 = (apej) a3.get(i2);
                        if (!cgkf.m145856c() || !apej2.mo47137a()) {
                        }
                        i++;
                        if (cgkf.m145856c()) {
                            if (apej2.mo47137a()) {
                                Long l = (Long) aoxv.m69792a(this.f84211a.getApplicationContext()).mo66815c();
                                if (l != null) {
                                    str2 = Long.toString(l.longValue());
                                } else {
                                    f84210c.mo46985d("Count not retrieve current device android Id");
                                    str2 = "";
                                }
                            } else {
                                str2 = bmxx.m108578b(aoxv.m69793a(str));
                            }
                            if (str2.equals(apel.m70098a(apej2))) {
                                apej2.f84239k = this.f84211a.getString(C0126R.string.romanesco_restore_current_device);
                            }
                        } else if (bmxx.m108578b(aoxv.m69793a(str)).equals(apej2.f84229a)) {
                            apej2.f84239k = this.f84211a.getString(C0126R.string.romanesco_restore_current_device);
                        }
                    }
                    a.mo46989a(a3.size(), i);
                    Object[] objArr = {str, Integer.valueOf(a3.size())};
                    this.f84211a.mo58846a(a3);
                    return;
                }
            }
            this.f84211a.mo58846a((List) null);
            new Object[1][0] = str;
            a.mo46989a(0, 0);
            return;
        }
        a.mo46999a(false, true, 0, 0);
    }
}
