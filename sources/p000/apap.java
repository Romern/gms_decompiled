package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: apap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apap implements Runnable {

    /* renamed from: a */
    private final apal f84040a;

    /* renamed from: b */
    private final SharedPreferences f84041b;

    /* renamed from: c */
    private final aoyo f84042c;

    /* renamed from: d */
    private final aozz f84043d;

    /* renamed from: e */
    private final Context f84044e;

    /* renamed from: f */
    private aoyq f84045f;

    static {
        aoyh.m69805a("ContactsLoggerTask");
    }

    public apap(Context context, apal apal) {
        SharedPreferences a = aozj.m69902a(context);
        apaj apaj = new apaj(context, apal);
        aoyo aoyo = new aoyo(context);
        this.f84040a = apal;
        this.f84041b = a;
        this.f84043d = apaj;
        this.f84042c = aoyo;
        this.f84044e = context;
        if (cgij.m145549g()) {
            this.f84045f = new aoyq(5);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: apaj.a(boolean, boolean, bzcv):void
     arg types: [int, boolean, bzcv]
     candidates:
      apaj.a(apal, bzcx, java.lang.String):boolean
      aozz.a(byte[], java.lang.String, aozk):boolean
      aozz.a(apal, byte[], java.lang.String):boolean
      apaj.a(boolean, boolean, bzcv):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: apaj.a(boolean, boolean, bzcv):void
     arg types: [boolean, int, bzcv]
     candidates:
      apaj.a(apal, bzcx, java.lang.String):boolean
      aozz.a(byte[], java.lang.String, aozk):boolean
      aozz.a(apal, byte[], java.lang.String):boolean
      apaj.a(boolean, boolean, bzcv):void */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04aa A[Catch:{ Exception -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04be A[Catch:{ Exception -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04d4 A[Catch:{ Exception -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04d5 A[Catch:{ Exception -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    public final void run() {
        String str;
        boolean z;
        bxvd da;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        bmxv bmxv;
        boolean z5;
        int i;
        int i2;
        int i3;
        apap apap = this;
        if (cgij.m145549g()) {
            apap.f84045f.mo47010a();
        }
        try {
            aozz aozz = apap.f84043d;
            apal apal = apap.f84040a;
            bzcv a = ((apaj) aozz).mo47056a(apal);
            if (a != null) {
                Set set = apal.f84031b;
                String str2 = apal.f84030a;
                if (set.isEmpty()) {
                    if (TextUtils.isEmpty(str2)) {
                        str = "romanesco-contacts-logger-batch-upload-version";
                        z = false;
                        aoyj a2 = aoyj.m69819a();
                        da = bzel.f169667p.mo74144da();
                        bxvd da2 = bzdx.f169595q.mo74144da();
                        if (!z) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((bzdx) da2.f164949b).f169607k = true;
                        } else {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((bzdx) da2.f164949b).f169608l = true;
                        }
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzdx bzdx = (bzdx) da2.mo74062i();
                        bzdx.getClass();
                        ((bzel) da.f164949b).f169675g = bzdx;
                        a2.mo46992a(da);
                        if (!z) {
                            SharedPreferences.Editor edit = this.f84041b.edit();
                            apal apal2 = this.f84040a;
                            if (!apal2.f84034e) {
                                edit.putLong("romanesco-contacts-logger-full-upload-timestamp", apal2.f84032c);
                                if (cgij.m145559q()) {
                                    edit.putInt(str, this.f84041b.getInt(str, 0) + 1);
                                }
                                edit.apply();
                            }
                            edit.putLong("romanesco-contacts-logger-incremental-upload-timestamp", this.f84040a.f84032c).putBoolean("romanesco-contacts-logger-pending-significant-update", false).apply();
                            if (cgij.m145549g()) {
                                this.f84045f.mo47012a(this.f84044e, !this.f84040a.f84034e ? "contacts_logger_task:batch_upload" : "contacts_logger_task:incremental_upload", true);
                                return;
                            }
                            return;
                        }
                        apap = this;
                    }
                }
                new aoxv(((apaj) aozz).f83966a);
                bmxv a3 = ((apaj) aozz).f83967b.mo47076a();
                boolean contains = set.contains(str2);
                boolean o = cgij.m145557o();
                if (!TextUtils.isEmpty(str2)) {
                    apaj.m69949a(str2, a);
                    apaj.m69957b(str2, a);
                    apaj.m69951a(true, contains, a);
                    if (((bzcx) a.f164949b).f169432b.size() != 0) {
                        z2 = contains;
                        if (a.mo74537n().f169424o != 0) {
                            str = "romanesco-contacts-logger-batch-upload-version";
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (cgij.m145559q()) {
                                i2 = aozj.m69902a(((apaj) aozz).f83966a).getInt("romanesco-contacts-logger-batch-upload-version", 0);
                                if (!apal.f84034e) {
                                    i2++;
                                }
                            } else {
                                i2 = 0;
                            }
                            try {
                                int b = apaj.m69953b(apal);
                                if (cgij.m145559q()) {
                                    SharedPreferences a4 = aozj.m69902a(((apaj) aozz).f83966a);
                                    str = "romanesco-contacts-logger-batch-upload-version";
                                    int i4 = a4.getInt("romanesco-contacts-logger-upload-version-reset-random", -1);
                                    if (i4 == -1) {
                                        i3 = new Random().nextInt(Integer.MAX_VALUE);
                                        a4.edit().putInt("romanesco-contacts-logger-upload-version-reset-random", i3).commit();
                                    } else {
                                        i3 = i4;
                                    }
                                } else {
                                    str = "romanesco-contacts-logger-batch-upload-version";
                                    i3 = 0;
                                }
                                Iterator it2 = ((bzcx) a.mo74062i()).f169432b.iterator();
                                int i5 = 0;
                                while (it2.hasNext()) {
                                    Iterator it3 = it2;
                                    bzcu bzcu = (bzcu) it2.next();
                                    int i6 = i5 + 1;
                                    bxvd bxvd = (bxvd) bzcu.mo74142c(5);
                                    bxvd.mo73625a((GeneratedMessageLite) bzcu);
                                    bzcs bzcs = (bzcs) bxvd;
                                    if (bzcs.f164950c) {
                                        bzcs.mo74035c();
                                        bzcs.f164950c = false;
                                    }
                                    bzcu bzcu2 = (bzcu) bzcs.f164949b;
                                    bzcu bzcu3 = bzcu.f169408q;
                                    int i7 = bzcu2.f169410a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    bzcu2.f169410a = i7;
                                    bzcu2.f169422m = i2;
                                    int i8 = i7 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                    bzcu2.f169410a = i8;
                                    bzcu2.f169424o = currentTimeMillis;
                                    bzcu2.f169425p = b - 1;
                                    int i9 = i8 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    bzcu2.f169410a = i9;
                                    bzcu2.f169410a = i9 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    bzcu2.f169423n = i3;
                                    a.mo74534a(i5, bzcs);
                                    i5 = i6;
                                    it2 = it3;
                                    currentTimeMillis = currentTimeMillis;
                                }
                            } catch (Exception e) {
                                e = e;
                                apap = this;
                                aoyj.m69819a().mo46996a("ContactsLoggerTask.logData_failure");
                                apap.f84042c.mo47009a(e, cgjy.m145765l());
                                if (cgij.m145549g()) {
                                }
                            }
                        }
                    } else {
                        str = "romanesco-contacts-logger-batch-upload-version";
                        z2 = contains;
                    }
                    z3 = ((apaj) aozz).mo47058a(apal, (bzcx) a.mo74062i(), str2);
                } else {
                    str = "romanesco-contacts-logger-batch-upload-version";
                    z2 = contains;
                    z3 = true;
                }
                apaj.m69950a(set, a);
                if (!apal.f84034e) {
                    if (o) {
                        apaj.m69958b(set, a);
                    }
                }
                Iterator it4 = set.iterator();
                z = z3;
                while (it4.hasNext()) {
                    String str3 = (String) it4.next();
                    if (!str3.equals(str2)) {
                        z4 = false;
                    } else if (o) {
                        z4 = true;
                    }
                    String a5 = aoxv.m69793a(str3);
                    if (a5 != null) {
                        if (a.f164950c) {
                            a.mo74035c();
                            a.f164950c = false;
                        }
                        bzcx bzcx = (bzcx) a.f164949b;
                        bzcx bzcx2 = bzcx.f169429h;
                        a5.getClass();
                        bzcx.f169431a |= 1;
                        bzcx.f169433c = a5;
                        apaj.m69949a(str3, a);
                        apaj.m69957b(str3, a);
                        if (cgiq.m145572b()) {
                            if (((apaj) aozz).f84022i.mo66813a()) {
                                bmxv a6 = ((aozi) ((apaj) aozz).f84022i.mo66814b()).mo47034a();
                                if (a6.mo66813a()) {
                                    BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) a6.mo66814b();
                                    int i10 = backupAndSyncOptInState.f81706c;
                                    i = i10 != 1 ? i10 != 2 ? i10 != 3 ? 1 : str3.equals(backupAndSyncOptInState.f81704a) ? 2 : 3 : 4 : 5;
                                } else {
                                    i = 1;
                                }
                                bzdh bzdh = ((bzcx) a.f164949b).f169436f;
                                if (bzdh == null) {
                                    bzdh = bzdh.f169466A;
                                }
                                bxvd bxvd2 = (bxvd) bzdh.mo74142c(5);
                                bxvd2.mo73625a((GeneratedMessageLite) bzdh);
                                bzdb bzdb = (bzdb) bxvd2;
                                if (bzdb.f164950c) {
                                    bzdb.mo74035c();
                                    bzdb.f164950c = false;
                                }
                                bzdh bzdh2 = (bzdh) bzdb.f164949b;
                                bzdh2.f169494z = i - 1;
                                bzdh2.f169469a |= 268435456;
                                if (a.f164950c) {
                                    a.mo74035c();
                                    a.f164950c = false;
                                }
                                bzcx bzcx3 = (bzcx) a.f164949b;
                                bzdh bzdh3 = (bzdh) bzdb.mo74062i();
                                bzdh3.getClass();
                                bzcx3.f169436f = bzdh3;
                                bzcx3.f169431a |= 16;
                            }
                        }
                        bzdh bzdh4 = ((bzcx) a.f164949b).f169436f;
                        if (bzdh4 == null) {
                            bzdh4 = bzdh.f169466A;
                        }
                        bxvd bxvd3 = (bxvd) bzdh4.mo74142c(5);
                        bxvd3.mo73625a((GeneratedMessageLite) bzdh4);
                        bzdb bzdb2 = (bzdb) bxvd3;
                        if (a3.mo66813a()) {
                            boolean z6 = !str3.equals(a3.mo66814b());
                            if (bzdb2.f164950c) {
                                bzdb2.mo74035c();
                                bzdb2.f164950c = false;
                            }
                            bzdh bzdh5 = (bzdh) bzdb2.f164949b;
                            bzdh5.f169469a = 1048576 | bzdh5.f169469a;
                            bzdh5.f169486r = z6;
                        } else {
                            if (bzdb2.f164950c) {
                                bzdb2.mo74035c();
                                bzdb2.f164950c = false;
                            }
                            bzdh bzdh6 = (bzdh) bzdb2.f164949b;
                            bzdh6.f169469a = 1048576 | bzdh6.f169469a;
                            bzdh6.f169486r = true;
                        }
                        if (a.f164950c) {
                            a.mo74035c();
                            a.f164950c = false;
                        }
                        bzcx bzcx4 = (bzcx) a.f164949b;
                        bzdh bzdh7 = (bzdh) bzdb2.mo74062i();
                        bzdh7.getClass();
                        bzcx4.f169436f = bzdh7;
                        bzcx4.f169431a |= 16;
                        apaj.m69951a(z4, true, a);
                        if (cgij.m145557o()) {
                            if (((bzcx) a.f164949b).f169432b.size() == 0) {
                                it = it4;
                                bmxv = a3;
                            } else if (a.mo74537n().f169424o != 0) {
                                int i11 = 0;
                                for (Iterator it5 = ((bzcx) a.mo74062i()).f169432b.iterator(); it5.hasNext(); it5 = it5) {
                                    int i12 = i11 + 1;
                                    bzcu bzcu4 = (bzcu) it5.next();
                                    bxvd bxvd4 = (bxvd) bzcu4.mo74142c(5);
                                    bxvd4.mo73625a((GeneratedMessageLite) bzcu4);
                                    bzcs bzcs2 = (bzcs) bxvd4;
                                    if (bzcs2.f164950c) {
                                        bzcs2.mo74035c();
                                        bzcs2.f164950c = false;
                                    }
                                    bzcu bzcu5 = (bzcu) bzcs2.f164949b;
                                    bzcu bzcu6 = bzcu.f169408q;
                                    int i13 = bzcu5.f169410a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    bzcu5.f169410a = i13;
                                    bzcu5.f169422m = 0;
                                    int i14 = i13 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                    bzcu5.f169410a = i14;
                                    bzcu5.f169424o = 0;
                                    bzcu5.f169425p = 0;
                                    int i15 = i14 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    bzcu5.f169410a = i15;
                                    bzcu5.f169410a = i15 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    bzcu5.f169423n = 0;
                                    a.mo74534a(i11, bzcs2);
                                    i11 = i12;
                                    a3 = a3;
                                    it4 = it4;
                                }
                                it = it4;
                                bmxv = a3;
                            } else {
                                it = it4;
                                bmxv = a3;
                            }
                            bzcx bzcx5 = (bzcx) a.mo74062i();
                            try {
                                aoyj a7 = aoyj.m69819a();
                                int size = bzcx5.f169432b.size();
                                int size2 = bzcx5.f169434d.size();
                                bxvd da3 = bzdx.f169595q.mo74144da();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bzdx bzdx2 = (bzdx) da3.f164949b;
                                bzdx2.f169611o = size;
                                bzdx2.f169612p = size2;
                                bzdx bzdx3 = (bzdx) da3.mo74062i();
                                bxvd da4 = bzel.f169667p.mo74144da();
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bzdx3.getClass();
                                ((bzel) da4.f164949b).f169675g = bzdx3;
                                a7.mo46992a(da4);
                                byte[] k = bzcx5.serializeToBytes();
                                if (((apaj) aozz).f84021h) {
                                    ((apaj) aozz).f84023j.mo47010a();
                                }
                                aozz.m69929a(apal, k, str3, ((apaj) aozz).f84020g);
                                if (((apaj) aozz).f84021h) {
                                    ((apaj) aozz).f84023j.mo47011a(((apaj) aozz).f83966a, "contacts_logger:log_contact_list");
                                }
                                z5 = true;
                            } catch (IllegalArgumentException e2) {
                                new Object[1][0] = e2;
                                aoyj.m69819a().mo46996a("ContactsLogger.contact_list_serialize_failure");
                                z5 = false;
                            }
                        } else {
                            it = it4;
                            bmxv = a3;
                            z5 = ((apaj) aozz).mo47058a(apal, (bzcx) a.mo74062i(), str3);
                        }
                    } else {
                        it = it4;
                        bmxv = a3;
                        z5 = false;
                    }
                    z &= z5;
                    a3 = bmxv;
                    it4 = it;
                }
                aoyj a8 = aoyj.m69819a();
                boolean z7 = !TextUtils.isEmpty(str2);
                boolean z8 = !set.isEmpty();
                boolean z9 = !z2;
                int size3 = set.size();
                bxvd da5 = bzdx.f169595q.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bzdx bzdx4 = (bzdx) da5.f164949b;
                bzdx4.f169610n = size3;
                if (!z7 || !z8) {
                    if (!z7 && z8) {
                        bzdx4.f169600d = true;
                    } else if (z7) {
                        bzdx4.f169599c = true;
                    }
                } else if (z9) {
                    bzdx4.f169598b = true;
                } else {
                    bzdx4.f169597a = true;
                }
                bxvd da6 = bzel.f169667p.mo74144da();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bzdx bzdx5 = (bzdx) da5.mo74062i();
                bzdx5.getClass();
                ((bzel) da6.f164949b).f169675g = bzdx5;
                a8.mo46992a(da6);
                aoyj a22 = aoyj.m69819a();
                da = bzel.f169667p.mo74144da();
                bxvd da22 = bzdx.f169595q.mo74144da();
                if (!z) {
                }
                if (!da.f164950c) {
                }
                bzdx bzdx6 = (bzdx) da22.mo74062i();
                bzdx6.getClass();
                ((bzel) da.f164949b).f169675g = bzdx6;
                a22.mo46992a(da);
                if (!z) {
                }
            }
        } catch (Exception e3) {
            e = e3;
            aoyj.m69819a().mo46996a("ContactsLoggerTask.logData_failure");
            apap.f84042c.mo47009a(e, cgjy.m145765l());
            if (cgij.m145549g()) {
            }
        }
        if (cgij.m145549g()) {
            apap.f84045f.mo47012a(apap.f84044e, !apap.f84040a.f84034e ? "contacts_logger_task:batch_failure" : "contacts_logger_task:incremental_failure", true);
        }
    }
}
