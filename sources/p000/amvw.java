package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: amvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvw extends amvx {

    /* renamed from: b */
    private static final String[] f76148b = {"data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2", "data_sync3", "data_sync4"};

    /* renamed from: c */
    private final Set f76149c;

    /* renamed from: d */
    private final Set f76150d;

    /* renamed from: e */
    private int f76151e = 0;

    private amvw(Cursor cursor, Set set, Set set2) {
        super(cursor);
        this.f76149c = set;
        this.f76150d = set2;
        this.f76152a.moveToFirst();
    }

    /* renamed from: a */
    public static amvw m63489a(ContentResolver contentResolver, Account account, Set set, String str, String[] strArr) {
        String str2;
        Cursor query = contentResolver.query(amvt.m63471a(ContactsContract.RawContactsEntity.CONTENT_URI, account), null, str, strArr, null);
        if (query != null) {
            if (amvy.m63505a(contentResolver, account)) {
                str2 = amvy.f76154c;
            } else {
                str2 = amvy.f76153b;
            }
            List<amvr> a = amvy.m63504a(contentResolver, account, str2);
            HashSet hashSet = new HashSet();
            for (amvr amvr : a) {
                hashSet.add(amvr.mo41400g());
            }
            return new amvw(query, set, hashSet);
        }
        Log.e("FSA2_ContactsCursor", "Failed to query CP2.");
        throw new amyc(new RemoteException("Unable to query CP2."));
    }

    /* renamed from: b */
    private final void m63491b(ContentValues contentValues, String str) {
        Long b = mo41466b(str);
        if (b != null) {
            contentValues.put(str, b);
        }
    }

    /* renamed from: a */
    private final void m63490a(ContentValues contentValues, String str) {
        String a = mo41465a(str);
        if (a != null) {
            contentValues.put(str, a);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01eb  */
    /* renamed from: a */
    public final amvp mo41464b() {
        char c;
        amvo amvo;
        if (this.f76152a.isAfterLast()) {
            return null;
        }
        long longValue = mo41466b("_id").longValue();
        String a = mo41465a("sourceid");
        amvo a2 = amvp.m63441a();
        Long valueOf = Long.valueOf(longValue);
        sdo.m34959a(valueOf);
        a2.f76059e = valueOf;
        a2.f76055a = a;
        a2.f76060f = mo41466b("version");
        a2.f76058d = mo41466b("sync3");
        if (a == null) {
            a2.f76057c = mo41465a("sync2");
        } else {
            a2.f76056b = mo41465a("sync2");
        }
        if (mo41470d("dirty")) {
            a2.f76061g = true;
        }
        if (mo41470d("starred")) {
            a2.f76063i = true;
        }
        if (mo41470d("deleted")) {
            a2.mo41415b();
        }
        while (mo41466b("_id").longValue() == longValue) {
            String a3 = mo41465a("mimetype");
            if (!TextUtils.isEmpty(a3) && !ancm.m64008a(this.f76149c) && this.f76149c.contains(a3)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", a3);
                m63491b(contentValues, "data_id");
                m63491b(contentValues, "data_version");
                m63491b(contentValues, "is_primary");
                if (TextUtils.equals(a3, "vnd.android.cursor.item/group_membership")) {
                    amig.m62939a();
                    if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82969ag()).booleanValue()) {
                        if (this.f76150d.contains(mo41466b("data1"))) {
                            m63490a(contentValues, "group_sourceid");
                        } else {
                            contentValues = null;
                            String substring = a3.substring(a3.lastIndexOf("/") + 1);
                            switch (a3.hashCode()) {
                                case -1729791444:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_file_as")) {
                                        c = 23;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1569536764:
                                    if (a3.equals("vnd.android.cursor.item/email_v2")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1328682538:
                                    if (a3.equals("vnd.android.cursor.item/contact_event")) {
                                        c = 10;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1207225626:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_external_id")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1079224304:
                                    if (a3.equals("vnd.android.cursor.item/name")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1079210633:
                                    if (a3.equals("vnd.android.cursor.item/note")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -828105739:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_misc")) {
                                        c = 21;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -601229436:
                                    if (a3.equals("vnd.android.cursor.item/postal-address_v2")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -335220302:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_extended_property")) {
                                        c = 22;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3430506:
                                    if (a3.equals("vnd.android.cursor.item/sip_address")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 94070761:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_hobby")) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 456415478:
                                    if (a3.equals("vnd.android.cursor.item/website")) {
                                        c = 13;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 684173810:
                                    if (a3.equals("vnd.android.cursor.item/phone_v2")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 689862072:
                                    if (a3.equals("vnd.android.cursor.item/organization")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 905843021:
                                    if (a3.equals("vnd.android.cursor.item/photo")) {
                                        c = 8;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 950831081:
                                    if (a3.equals("vnd.android.cursor.item/im")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1238509849:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_user_defined_field")) {
                                        c = 20;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1332665825:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_language")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1409846529:
                                    if (a3.equals("vnd.android.cursor.item/relation")) {
                                        c = 9;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1464444786:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_calendar_link")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1464725403:
                                    if (a3.equals("vnd.android.cursor.item/group_membership")) {
                                        c = 12;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1635852198:
                                    if (a3.equals("vnd.com.google.cursor.item/contact_jot")) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1828520899:
                                    if (a3.equals("vnd.android.cursor.item/identity")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2034973555:
                                    if (a3.equals("vnd.android.cursor.item/nickname")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    a2.mo41430p(contentValues);
                                    amvo = a2;
                                    break;
                                case 1:
                                    a2.mo41431q(contentValues);
                                    amvo = a2;
                                    break;
                                case 2:
                                    a2.mo41434t(contentValues);
                                    amvo = a2;
                                    break;
                                case 3:
                                    a2.mo41418d(contentValues);
                                    amvo = a2;
                                    break;
                                case 4:
                                    a2.mo41426l(contentValues);
                                    amvo = a2;
                                    break;
                                case 5:
                                    a2.mo41436v(contentValues);
                                    amvo = a2;
                                    break;
                                case 6:
                                    a2.mo41438x(contentValues);
                                    amvo = a2;
                                    break;
                                case 7:
                                    a2.mo41433s(contentValues);
                                    amvo = a2;
                                    break;
                                case 8:
                                    a2.mo41435u(contentValues);
                                    amvo = a2;
                                    break;
                                case 9:
                                    a2.mo41437w(contentValues);
                                    amvo = a2;
                                    break;
                                case 10:
                                    if ("3".equals(contentValues.getAsString("data2"))) {
                                        a2.mo41414a(contentValues);
                                    } else {
                                        a2.mo41419e(contentValues);
                                    }
                                    amvo = a2;
                                    break;
                                case 11:
                                    a2.mo41432r(contentValues);
                                    amvo = a2;
                                    break;
                                case 12:
                                    a2.mo41423i(contentValues);
                                    amvo = a2;
                                    break;
                                case 13:
                                    a2.mo41439y(contentValues);
                                    amvo = a2;
                                    break;
                                case 14:
                                    a2.mo41425k(contentValues);
                                    amvo = a2;
                                    break;
                                case 15:
                                    a2.mo41428n(contentValues);
                                    amvo = a2;
                                    break;
                                case 16:
                                    a2.mo41421g(contentValues);
                                    amvo = a2;
                                    break;
                                case 17:
                                    a2.mo41416b(contentValues);
                                    amvo = a2;
                                    break;
                                case 18:
                                    a2.mo41424j(contentValues);
                                    amvo = a2;
                                    break;
                                case 19:
                                    a2.mo41427m(contentValues);
                                    amvo = a2;
                                    break;
                                case 20:
                                    a2.mo41417c(contentValues);
                                    amvo = a2;
                                    break;
                                case 21:
                                    a2.mo41429o(contentValues);
                                    amvo = a2;
                                    break;
                                case 22:
                                    a2.mo41420f(contentValues);
                                    amvo = a2;
                                    break;
                                case 23:
                                    a2.mo41422h(contentValues);
                                    amvo = a2;
                                    break;
                                default:
                                    amvo = null;
                                    break;
                            }
                            if (amvo == null) {
                                amdk.m62659b("FSA2_ContactsCursor", "Error when adding data %s to Contact ID=%d", substring, Long.valueOf(longValue));
                            }
                        }
                    } else {
                        m63490a(contentValues, "group_sourceid");
                    }
                }
                String[] strArr = f76148b;
                for (String str : strArr) {
                    int type = this.f76152a.getType(this.f76152a.getColumnIndexOrThrow(str));
                    if (type != 0) {
                        if (type == 1 || type == 2 || type == 3) {
                            m63490a(contentValues, str);
                        } else if (type == 4) {
                            byte[] c2 = mo41468c(str);
                            if (c2 != null) {
                                contentValues.put(str, c2);
                            }
                        } else {
                            throw new IllegalStateException("Invalid or unhandled data type");
                        }
                    }
                }
                String substring2 = a3.substring(a3.lastIndexOf("/") + 1);
                switch (a3.hashCode()) {
                    case -1729791444:
                        break;
                    case -1569536764:
                        break;
                    case -1328682538:
                        break;
                    case -1207225626:
                        break;
                    case -1079224304:
                        break;
                    case -1079210633:
                        break;
                    case -828105739:
                        break;
                    case -601229436:
                        break;
                    case -335220302:
                        break;
                    case 3430506:
                        break;
                    case 94070761:
                        break;
                    case 456415478:
                        break;
                    case 684173810:
                        break;
                    case 689862072:
                        break;
                    case 905843021:
                        break;
                    case 950831081:
                        break;
                    case 1238509849:
                        break;
                    case 1332665825:
                        break;
                    case 1409846529:
                        break;
                    case 1464444786:
                        break;
                    case 1464725403:
                        break;
                    case 1635852198:
                        break;
                    case 1828520899:
                        break;
                    case 2034973555:
                        break;
                }
                switch (c) {
                }
                if (amvo == null) {
                }
            } else if (cfxe.f185877a.mo6606a().mo82872N() || !TextUtils.isEmpty(a3)) {
                a2.f76065k = true;
            }
            if (!mo41469d()) {
                this.f76151e++;
                amvp a4 = a2.mo41413a();
                a4.f76091K.size();
                return a4;
            }
        }
        this.f76151e++;
        amvp a42 = a2.mo41413a();
        a42.f76091K.size();
        return a42;
    }
}
