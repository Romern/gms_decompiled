package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsg {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m61645a(ContentValues contentValues) {
        char c;
        ContentValues contentValues2 = contentValues;
        if (contentValues2 == null || TextUtils.isEmpty(contentValues2.getAsString("mimetype"))) {
            return 1;
        }
        String asString = contentValues2.getAsString("mimetype");
        switch (asString.hashCode()) {
            case -1729791444:
                if (asString.equals("vnd.com.google.cursor.item/contact_file_as")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1569536764:
                if (asString.equals("vnd.android.cursor.item/email_v2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1328682538:
                if (asString.equals("vnd.android.cursor.item/contact_event")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1207225626:
                if (asString.equals("vnd.com.google.cursor.item/contact_external_id")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1079224304:
                if (asString.equals("vnd.android.cursor.item/name")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1079210633:
                if (asString.equals("vnd.android.cursor.item/note")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -828105739:
                if (asString.equals("vnd.com.google.cursor.item/contact_misc")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -601229436:
                if (asString.equals("vnd.android.cursor.item/postal-address_v2")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -335220302:
                if (asString.equals("vnd.com.google.cursor.item/contact_extended_property")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3430506:
                if (asString.equals("vnd.android.cursor.item/sip_address")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 94070761:
                if (asString.equals("vnd.com.google.cursor.item/contact_hobby")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 456415478:
                if (asString.equals("vnd.android.cursor.item/website")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 684173810:
                if (asString.equals("vnd.android.cursor.item/phone_v2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 689862072:
                if (asString.equals("vnd.android.cursor.item/organization")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 905843021:
                if (asString.equals("vnd.android.cursor.item/photo")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 950831081:
                if (asString.equals("vnd.android.cursor.item/im")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 1238509849:
                if (asString.equals("vnd.com.google.cursor.item/contact_user_defined_field")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1332665825:
                if (asString.equals("vnd.com.google.cursor.item/contact_language")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1409846529:
                if (asString.equals("vnd.android.cursor.item/relation")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1464444786:
                if (asString.equals("vnd.com.google.cursor.item/contact_calendar_link")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1464725403:
                if (asString.equals("vnd.android.cursor.item/group_membership")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1635852198:
                if (asString.equals("vnd.com.google.cursor.item/contact_jot")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 1828520899:
                if (asString.equals("vnd.android.cursor.item/identity")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 2034973555:
                if (asString.equals("vnd.android.cursor.item/nickname")) {
                    c = 13;
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
                return 3;
            case 1:
                return 5;
            case 2:
                return contentValues2.getAsInteger("data2").intValue() == 3 ? 2 : 6;
            case 3:
                return 7;
            case 4:
                return 8;
            case 5:
                return 9;
            case 6:
                return 10;
            case 7:
                return 11;
            case 8:
                return 12;
            case 9:
                return 13;
            case 10:
                return 14;
            case 11:
                return 15;
            case 12:
                return 16;
            case 13:
                return 18;
            case 14:
                return 19;
            case 15:
                return 20;
            case 16:
                return 21;
            case 17:
                return 22;
            case 18:
                return 24;
            case 19:
                return 25;
            case 20:
                return 17;
            case 21:
                return 23;
            case 22:
                return 4;
            case 23:
                return 26;
            default:
                return 1;
        }
    }
}
