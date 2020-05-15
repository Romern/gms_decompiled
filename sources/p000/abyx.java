package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: abyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyx {

    /* renamed from: a */
    public final abyw f58772a;

    /* renamed from: b */
    public final Object f58773b;

    /* renamed from: c */
    public final Map f58774c = new HashMap();

    public abyx(abyw abyw) {
        Set<String> keySet;
        this.f58772a = abyw;
        this.f58773b = abyw.f58767a.f60625g;
        acrl acrl = this.f58772a.f58767a;
        synchronized (acrl.f60625g) {
            keySet = acrl.f60621c.keySet();
        }
        for (String str : keySet) {
            mo32505c(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo32494a(int i) {
        return qkj.m32287a(this.f58772a.f58768b, i);
    }

    /* renamed from: b */
    public final Set mo32501b() {
        HashSet hashSet;
        synchronized (this.f58773b) {
            hashSet = new HashSet(this.f58774c.keySet());
        }
        return hashSet;
    }

    /* renamed from: c */
    public final int mo32504c() {
        int intValue = ((Integer) this.f58772a.f58767a.mo33043n("com.google.android.googlequicksearchbox").f26798a).intValue();
        return intValue == 0 ? ((Integer) this.f58772a.mo32492b("com.google.android.googlequicksearchbox").f26798a).intValue() : intValue;
    }

    /* renamed from: d */
    public final abyv mo32506d(String str) {
        abyv abyv;
        synchronized (this.f58773b) {
            abyv = (abyv) this.f58774c.get(str);
        }
        return abyv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* renamed from: e */
    public final void mo32508e() {
        absg.m48184a("maybeUpdateGmailGlobalSearchInfo");
        synchronized (this.f58773b) {
            abyv d = mo32506d("com.google.android.gm");
            if (d == null) {
                return;
            }
            if (d.mo32478g().mo32560c() == null) {
                d.mo32466a(System.currentTimeMillis());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0142, code lost:
        r1.mo32466a(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0149, code lost:
        return;
     */
    /* renamed from: f */
    public final void mo32510f(String str) {
        abyv d;
        synchronized (this.f58773b) {
            d = mo32506d(str);
            if (d != null) {
                try {
                    if ("com.google.android.gms".equals(str)) {
                        d.mo32465a(Collections.emptySet());
                    } else {
                        d.mo32463a(abzr.f58828a);
                    }
                    this.f58772a.f58767a.mo33033g(str);
                    d.mo32484m();
                } catch (acaq e) {
                    throw new acas(e);
                }
            }
        }
        if (d != null) {
            abrv abrv = this.f58772a.f58771e.f58043a;
            abrv.f58067c.mo32992b(2);
            abzm b = abrv.mo32314b();
            for (acak acak : d.mo32462a()) {
                abzr c = b.mo32540c(acak);
                absy absy = ((abss) c.mo32560c()).f58158c;
                if (absy == null) {
                    absy = absy.f58176h;
                }
                int a = absx.m48236a(absy.f58180c);
                if (a == 0 || a == 1) {
                    absr absr = ((abss) c.mo32560c()).f58157b;
                    if (absr == null) {
                        absr = absr.f58134s;
                    }
                    if (!abzm.m48658f(absr)) {
                        absr absr2 = ((abss) c.mo32560c()).f58157b;
                        if (absr2 == null) {
                            absr2 = absr.f58134s;
                        }
                        if (!abzm.m48657e(absr2)) {
                            absr absr3 = ((abss) c.mo32560c()).f58157b;
                            if (absr3 == null) {
                                absr3 = absr.f58134s;
                            }
                            bxvd bxvd = (bxvd) absr3.mo74142c(5);
                            bxvd.mo73625a((bxvk) absr3);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            ((absr) bxvd.f164949b).f58146k = bxvk.m124030de();
                            try {
                                b.mo32529a(acak, c.mo32554a((absr) bxvd.mo74062i()));
                            } catch (acaq e2) {
                                absg.m48189a(e2, "Failed to set corpus config on reparse");
                                abrv.f58083s.mo32447a("reparse_sourcecheck_failed");
                            }
                        }
                    }
                }
            }
            abzo a2 = this.f58772a.f58771e.f58043a.mo32298a();
            synchronized (((abzm) a2).mo32525a()) {
                for (acak acak2 : d.mo32462a()) {
                    abss abss = (abss) ((abzm) a2).f58817f.get(acak2);
                    if (abss != null) {
                        absy absy2 = abss.f58158c;
                        if (absy2 == null) {
                            absy2 = absy.f58176h;
                        }
                        int a3 = absx.m48236a(absy2.f58180c);
                        if (a3 != 0) {
                            if (a3 != 1) {
                                continue;
                            }
                        }
                        absr absr4 = abss.f58157b;
                        if (absr4 == null) {
                            absr4 = absr.f58134s;
                        }
                        if (!abzm.m48658f(absr4)) {
                            absr absr5 = abss.f58157b;
                            if (absr5 == null) {
                                absr5 = absr.f58134s;
                            }
                            if (abzm.m48657e(absr5)) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final GlobalSearchApplicationInfo mo32511g(String str) {
        return new GlobalSearchApplicationInfo("com.google.android.gms", str, mo32494a((int) C0126R.string.icing_contacts_corpus_label), mo32494a((int) C0126R.string.icing_contacts_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_contacts_grey600_48), "android.intent.action.MAIN", null, null);
    }

    /* renamed from: a */
    public final abyv mo32495a(abyy abyy) {
        String str = abyy.f58780f;
        sdo.m34970a(true);
        return mo32505c(str);
    }

    /* renamed from: b */
    public final Set mo32502b(abyy abyy) {
        int length;
        String[] packagesForUid = this.f58772a.f58769c.getPackagesForUid(abyy.f58775a);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            absg.m48192b("No packages found for UID %d", Integer.valueOf(abyy.f58775a));
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(length);
        for (String str : packagesForUid) {
            hashSet.add(mo32505c(str));
        }
        return hashSet;
    }

    /* renamed from: d */
    public final void mo32507d() {
        try {
            absg.m48184a("maybeUpdateGmsCoreGlobalSearchInfo");
            synchronized (this.f58773b) {
                abyv d = mo32506d("com.google.android.gms");
                if (d != null) {
                    HashSet hashSet = new HashSet();
                    if (aclp.m49389a()) {
                        hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "apps", mo32494a((int) C0126R.string.icing_apps_corpus_label), mo32494a((int) C0126R.string.icing_apps_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_play_apps_grey600_48), "android.intent.action.MAIN", null, null));
                    }
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:MobileApplication", mo32494a((int) C0126R.string.icing_apps_corpus_label), mo32494a((int) C0126R.string.icing_apps_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_play_apps_grey600_48), "android.intent.action.MAIN", null, null));
                    if (acni.m49502a()) {
                        hashSet.add(mo32511g("contacts_contact_id"));
                    }
                    hashSet.add(mo32511g("internal.3p:Contact"));
                    if (acok.m49601a(this.f58772a.f58768b)) {
                        hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "sms", mo32494a((int) C0126R.string.icing_sms_corpus_label), mo32494a((int) C0126R.string.icing_sms_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_sms_grey600_48), "android.intent.action.MAIN", null, null));
                    }
                    if (cemq.m137366c()) {
                        hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Event", mo32494a((int) C0126R.string.icing_calendar_corpus_label), mo32494a((int) C0126R.string.icing_calendar_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_event_grey600_48), "android.intent.action.MAIN", null, null));
                    }
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Message", mo32494a((int) C0126R.string.icing_sms_corpus_label), mo32494a((int) C0126R.string.icing_sms_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_sms_grey600_48), "android.intent.action.MAIN", null, null));
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Photograph", mo32494a((int) C0126R.string.icing_photograph_corpus_label), mo32494a((int) C0126R.string.icing_photograph_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_image_grey600_48), "android.intent.action.MAIN", null, null));
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:DigitalDocument", mo32494a((int) C0126R.string.icing_digital_document_corpus_label), mo32494a((int) C0126R.string.icing_digital_document_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_drive_document_grey600_48), "android.intent.action.MAIN", null, null));
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:MusicRecording", mo32494a((int) C0126R.string.icing_music_recording_corpus_label), mo32494a((int) C0126R.string.icing_music_recording_corpus_description), mo32494a((int) C0126R.C0127drawable.quantum_ic_music_note_grey600_48), "android.intent.action.MAIN", null, null));
                    d.mo32465a(hashSet);
                    return;
                }
                absg.m48184a("No client found for GMSCore");
            }
        } catch (acaq e) {
            absg.m48191b(e.getMessage());
        }
    }

    /* renamed from: a */
    public final abyy mo32496a(int i, String str, int i2) {
        return mo32497a(i, str, i2, null);
    }

    /* renamed from: c */
    public final abyv mo32505c(String str) {
        abyv d;
        synchronized (this.f58773b) {
            d = mo32506d(str);
            if (d == null) {
                d = new abyv(str, this.f58772a);
                this.f58774c.put(str, d);
            }
        }
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* renamed from: a */
    public final abyy mo32497a(int i, String str, int i2, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        absg.m48203d("Creating ClientRequest for %s. Client SDK Version:%d", str, Integer.valueOf(i2));
        boolean a = this.f58772a.mo32491a(str);
        int i3 = this.f58772a.f58768b.getApplicationInfo().uid;
        boolean z4 = false;
        if (!a || !Arrays.asList(TextUtils.split((String) abzt.f58844L.mo58455c(), ",")).contains(str)) {
            z = false;
        } else {
            z = true;
        }
        if (a) {
            if (!"com.google.android.apps.icing.ui".equals(str)) {
                if (!sre.m36079a()) {
                    if (!Arrays.asList(TextUtils.split((String) abzt.f58845M.mo58455c(), ",")).contains(str)) {
                        z2 = false;
                        if (a || !abzt.m48725a().contains(str)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (i3 == i) {
                            z4 = true;
                        } else if (z2) {
                            z4 = true;
                        }
                        return new abyy(i, z4, z, z3, a, str, i2, str2);
                    }
                }
            }
            z2 = true;
            if (a) {
            }
            z3 = false;
            if (i3 == i) {
            }
            return new abyy(i, z4, z, z3, a, str, i2, str2);
        }
        z2 = false;
        if (a) {
        }
        z3 = false;
        if (i3 == i) {
        }
        return new abyy(i, z4, z, z3, a, str, i2, str2);
    }

    /* renamed from: b */
    public final boolean mo32503b(String str) {
        return "com.google.android.googlequicksearchbox".equals(str) && this.f58772a.mo32493b();
    }

    /* renamed from: e */
    public final boolean mo32509e(String str) {
        abyv d = mo32506d(str);
        if (d != null) {
            if (!"com.google.android.gms".equals(str)) {
                abzr g = d.mo32478g();
                if (g.mo32560c() != null) {
                    acrl acrl = this.f58772a.f58767a;
                    try {
                        if (g.mo32559b() >= acrl.f60619a.getPackageManager().getPackageInfo(str, 0).lastUpdateTime) {
                            return true;
                        }
                        absg.m48206e("GSAI from package %s is stale.", str);
                    } catch (PackageManager.NameNotFoundException e) {
                        absg.m48200c(e, "Cannot find package %s", str);
                    }
                }
            } else if (!d.mo32479h().isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final abyy mo32498a(ApplicationInfo applicationInfo) {
        return mo32496a(applicationInfo.uid, applicationInfo.packageName, -1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final abyy mo32499a(String str) {
        int callingUid = Binder.getCallingUid();
        Context context = this.f58772a.f58768b;
        sdo.m34966a((Object) str, (Object) "Package name");
        spn.m35872c(context, str);
        return mo32496a(callingUid, str, -1);
    }

    /* renamed from: a */
    public final Set mo32500a() {
        HashSet hashSet;
        synchronized (this.f58773b) {
            hashSet = new HashSet(this.f58774c.size());
            for (abyv abyv : this.f58774c.values()) {
                if (abyv.mo32470b() > 0) {
                    hashSet.add(abyv);
                }
            }
        }
        return hashSet;
    }
}
