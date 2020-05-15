package p000;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: akhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akhd {

    /* renamed from: a */
    static final String[] f71975a = {"_id", "lookup"};

    /* renamed from: b */
    static final String[] f71976b = {"contact_id", "lookup", "display_name", "photo_thumb_uri", "mimetype", "data1", "data4", "account_name", "account_type", "starred"};

    /* renamed from: c */
    private final Context f71977c;

    public akhd(Context context) {
        this.f71977c = context;
    }

    /* renamed from: a */
    private static ajih m59673a(Cursor cursor, akil akil) {
        Boolean bool;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("contact_id");
        int columnIndex2 = cursor2.getColumnIndex("lookup");
        int columnIndex3 = cursor2.getColumnIndex("display_name");
        int columnIndex4 = cursor2.getColumnIndex("photo_thumb_uri");
        int columnIndex5 = cursor2.getColumnIndex("mimetype");
        int columnIndex6 = cursor2.getColumnIndex("data1");
        int columnIndex7 = cursor2.getColumnIndex("data4");
        int columnIndex8 = cursor2.getColumnIndex("starred");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhd", "a", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to find the expected columns in the contact content uri.");
            return ajih.f70707b;
        }
        ajig ajig = (ajig) ajih.f70707b.mo74144da();
        List c = bute.m120429c();
        boolean moveToFirst = cursor.moveToFirst();
        while (moveToFirst) {
            Long b = ahgk.m55692b(cursor2, columnIndex);
            if (b == null) {
                moveToFirst = cursor.moveToNext();
            } else {
                String a = ahgk.m55690a(cursor2, columnIndex2);
                if (TextUtils.isEmpty(a)) {
                    moveToFirst = cursor.moveToNext();
                } else {
                    int i = columnIndex2;
                    String a2 = ahgk.m55690a(cursor2, columnIndex3);
                    if (TextUtils.isEmpty(a2)) {
                        moveToFirst = cursor.moveToNext();
                        columnIndex2 = i;
                    } else {
                        String a3 = ahgk.m55690a(cursor2, columnIndex4);
                        if (a3 == null) {
                            a3 = "";
                        }
                        String str = a3;
                        int i2 = columnIndex3;
                        if (cfov.m142033I()) {
                            bool = ahgk.m55695c(cursor2, columnIndex8);
                            if (bool == null) {
                                bool = false;
                            }
                        } else {
                            bool = false;
                        }
                        ajie ajie = (ajie) ajif.f70694l.mo74144da();
                        int i3 = columnIndex4;
                        bxvd da = ajii.f70710d.mo74144da();
                        int i4 = columnIndex8;
                        ajig ajig2 = ajig;
                        long longValue = b.longValue();
                        Long l = b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ajii ajii = (ajii) da.f164949b;
                        int i5 = columnIndex;
                        int i6 = ajii.f70712a | 1;
                        ajii.f70712a = i6;
                        ajii.f70713b = longValue;
                        a.getClass();
                        ajii.f70712a = i6 | 2;
                        ajii.f70714c = a;
                        if (ajie.f164950c) {
                            ajie.mo74035c();
                            ajie.f164950c = false;
                        }
                        ajif ajif = (ajif) ajie.f164949b;
                        ajii ajii2 = (ajii) da.mo74062i();
                        ajii2.getClass();
                        ajif.f70697b = ajii2;
                        ajif.f70696a |= 1;
                        if (ajie.f164950c) {
                            ajie.mo74035c();
                            ajie.f164950c = false;
                        }
                        ajif ajif2 = (ajif) ajie.f164949b;
                        a2.getClass();
                        int i7 = ajif2.f70696a | 2;
                        ajif2.f70696a = i7;
                        ajif2.f70698c = a2;
                        str.getClass();
                        int i8 = i7 | 4;
                        ajif2.f70696a = i8;
                        ajif2.f70699d = str;
                        ajif2.f70696a = i8 | 8;
                        ajif2.f70702g = false;
                        boolean booleanValue = bool.booleanValue();
                        if (ajie.f164950c) {
                            ajie.mo74035c();
                            ajie.f164950c = false;
                        }
                        ajif ajif3 = (ajif) ajie.f164949b;
                        ajif3.f70696a |= 128;
                        ajif3.f70706k = booleanValue;
                        while (true) {
                            String a4 = ahgk.m55690a(cursor2, columnIndex5);
                            if (a4 != null) {
                                String a5 = ahgk.m55690a(cursor2, columnIndex6);
                                if (!TextUtils.isEmpty(a5)) {
                                    if (a4.equals("vnd.android.cursor.item/email_v2")) {
                                        ajie.mo38668a(a5);
                                    } else if (a4.equals("vnd.android.cursor.item/phone_v2")) {
                                        String a6 = ahgk.m55690a(cursor2, columnIndex7);
                                        if (!TextUtils.isEmpty(a6)) {
                                            ajie.mo38669b(a6);
                                        } else {
                                            String a7 = akil.m59826a(a5, c);
                                            if (!TextUtils.isEmpty(a7)) {
                                                ajie.mo38669b(a7);
                                            }
                                        }
                                    } else {
                                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                                        bnsl2.mo68432a("akhd", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68420a("Unexpected mime type in contact content uri: %s.", a4);
                                    }
                                }
                            }
                            moveToFirst = cursor.moveToNext();
                            if (!moveToFirst) {
                                columnIndex = i5;
                                break;
                            }
                            columnIndex = i5;
                            Long l2 = l;
                            if (!l2.equals(ahgk.m55692b(cursor2, columnIndex))) {
                                break;
                            }
                            i5 = columnIndex;
                            l = l2;
                        }
                        if (((ajif) ajie.f164949b).f70700e.size() > 0 || ((ajif) ajie.f164949b).f70701f.size() > 0) {
                            ajig = ajig2;
                            ajig.mo38673a(ajie);
                        } else {
                            ajig = ajig2;
                        }
                        columnIndex2 = i;
                        columnIndex3 = i2;
                        columnIndex8 = i4;
                        columnIndex4 = i3;
                    }
                }
            }
        }
        return (ajih) ajig.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, android.net.Uri]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    private static ajii m59674a(Cursor cursor, Uri uri) {
        if (cursor.getCount() != 1) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhd", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("Found %d contacts for uri: %s.", cursor.getCount(), (Object) uri);
            return null;
        }
        Long b = ahgk.m55693b(cursor, "_id");
        if (b == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akhd", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("The contact's id does not exist.");
            return null;
        }
        String a = ahgk.m55691a(cursor, "lookup");
        if (!TextUtils.isEmpty(a)) {
            bxvd da = ajii.f70710d.mo74144da();
            long longValue = b.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajii ajii = (ajii) da.f164949b;
            int i = 1 | ajii.f70712a;
            ajii.f70712a = i;
            ajii.f70713b = longValue;
            a.getClass();
            ajii.f70712a = i | 2;
            ajii.f70714c = a;
            return (ajii) da.mo74062i();
        }
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
        bnsl3.mo68432a("akhd", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("The contact's lookup key does not exist.");
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final ajih mo39439a(Account account) {
        String str;
        ajih ajih;
        Boolean bool;
        String str2;
        boolean moveToNext;
        int i;
        ajig ajig;
        Cursor a = ahgk.m55688a(this.f71977c, ContactsContract.Data.CONTENT_URI, f71976b, "(account_name=? AND account_type=?) AND (mimetype=? OR mimetype=?)", new String[]{account.name, account.type, "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
        String str3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        String str4 = "a";
        if (a != null) {
            try {
                int columnIndex = a.getColumnIndex("contact_id");
                int columnIndex2 = a.getColumnIndex("lookup");
                int columnIndex3 = a.getColumnIndex("display_name");
                int columnIndex4 = a.getColumnIndex("photo_thumb_uri");
                int columnIndex5 = a.getColumnIndex("mimetype");
                int columnIndex6 = a.getColumnIndex("data1");
                int columnIndex7 = a.getColumnIndex("data4");
                int columnIndex8 = a.getColumnIndex("starred");
                if (columnIndex == -1) {
                    str = str3;
                } else if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
                    str = str3;
                } else {
                    ajig ajig2 = (ajig) ajih.f70707b.mo74144da();
                    List c = bute.m120429c();
                    boolean moveToFirst = a.moveToFirst();
                    while (moveToFirst) {
                        ajig ajig3 = ajig2;
                        Long b = ahgk.m55692b(a, columnIndex);
                        if (b != null) {
                            int i2 = columnIndex;
                            String a2 = ahgk.m55690a(a, columnIndex2);
                            if (!TextUtils.isEmpty(a2)) {
                                int i3 = columnIndex2;
                                String a3 = ahgk.m55690a(a, columnIndex3);
                                if (!TextUtils.isEmpty(a3)) {
                                    String a4 = ahgk.m55690a(a, columnIndex4);
                                    if (a4 == null) {
                                        a4 = "";
                                    }
                                    String str5 = a4;
                                    if (cfov.m142033I()) {
                                        bool = ahgk.m55695c(a, columnIndex8);
                                        if (bool == null) {
                                            bool = null;
                                        }
                                    } else {
                                        bool = null;
                                    }
                                    int i4 = columnIndex8;
                                    ajie ajie = (ajie) ajif.f70694l.mo74144da();
                                    int i5 = columnIndex3;
                                    bxvd da = ajii.f70710d.mo74144da();
                                    String str6 = str3;
                                    String str7 = str4;
                                    long longValue = b.longValue();
                                    int i6 = columnIndex4;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ajii ajii = (ajii) da.f164949b;
                                    Long l = b;
                                    int i7 = ajii.f70712a | 1;
                                    ajii.f70712a = i7;
                                    ajii.f70713b = longValue;
                                    a2.getClass();
                                    ajii.f70712a = i7 | 2;
                                    ajii.f70714c = a2;
                                    if (ajie.f164950c) {
                                        ajie.mo74035c();
                                        ajie.f164950c = false;
                                    }
                                    ajif ajif = (ajif) ajie.f164949b;
                                    ajii ajii2 = (ajii) da.mo74062i();
                                    ajii2.getClass();
                                    ajif.f70697b = ajii2;
                                    ajif.f70696a |= 1;
                                    if (ajie.f164950c) {
                                        ajie.mo74035c();
                                        ajie.f164950c = false;
                                    }
                                    ajif ajif2 = (ajif) ajie.f164949b;
                                    a3.getClass();
                                    int i8 = ajif2.f70696a | 2;
                                    ajif2.f70696a = i8;
                                    ajif2.f70698c = a3;
                                    str5.getClass();
                                    int i9 = i8 | 4;
                                    ajif2.f70696a = i9;
                                    ajif2.f70699d = str5;
                                    ajif2.f70696a = i9 | 8;
                                    ajif2.f70702g = false;
                                    boolean booleanValue = bool.booleanValue();
                                    if (ajie.f164950c) {
                                        ajie.mo74035c();
                                        ajie.f164950c = false;
                                    }
                                    ajif ajif3 = (ajif) ajie.f164949b;
                                    ajif3.f70696a |= 128;
                                    ajif3.f70706k = booleanValue;
                                    while (true) {
                                        String a5 = ahgk.m55690a(a, columnIndex5);
                                        if (a5 != null) {
                                            String a6 = ahgk.m55690a(a, columnIndex6);
                                            if (TextUtils.isEmpty(a6)) {
                                                str2 = str6;
                                                str4 = str7;
                                            } else if (a5.equals("vnd.android.cursor.item/email_v2")) {
                                                str2 = str6;
                                                str4 = str7;
                                                ajie.mo38668a(a6);
                                            } else if (!a5.equals("vnd.android.cursor.item/phone_v2")) {
                                                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                                                str2 = str6;
                                                str4 = str7;
                                                bnsl.mo68432a("akhd", str4, 249, str2);
                                                bnsl.mo68420a("Unexpected mime type in contact content uri: %s.", a5);
                                            } else {
                                                str2 = str6;
                                                str4 = str7;
                                                String a7 = ahgk.m55690a(a, columnIndex7);
                                                if (TextUtils.isEmpty(a7)) {
                                                    String a8 = akil.m59826a(a6, c);
                                                    if (!TextUtils.isEmpty(a8)) {
                                                        ajie.mo38669b(a8);
                                                    }
                                                } else {
                                                    ajie.mo38669b(a7);
                                                }
                                            }
                                        } else {
                                            str2 = str6;
                                            str4 = str7;
                                        }
                                        moveToNext = a.moveToNext();
                                        if (!moveToNext) {
                                            i = i2;
                                            break;
                                        }
                                        i = i2;
                                        Long l2 = l;
                                        if (!l2.equals(ahgk.m55692b(a, i))) {
                                            break;
                                        }
                                        str7 = str4;
                                        l = l2;
                                        i2 = i;
                                        str6 = str2;
                                    }
                                    if (((ajif) ajie.f164949b).f70700e.size() <= 0) {
                                        if (((ajif) ajie.f164949b).f70701f.size() <= 0) {
                                            ajig = ajig3;
                                            moveToFirst = moveToNext;
                                            columnIndex = i;
                                            ajig2 = ajig;
                                            str3 = str2;
                                            columnIndex2 = i3;
                                            columnIndex8 = i4;
                                            columnIndex3 = i5;
                                            columnIndex4 = i6;
                                        }
                                    }
                                    ajig = ajig3;
                                    ajig.mo38673a(ajie);
                                    moveToFirst = moveToNext;
                                    columnIndex = i;
                                    ajig2 = ajig;
                                    str3 = str2;
                                    columnIndex2 = i3;
                                    columnIndex8 = i4;
                                    columnIndex3 = i5;
                                    columnIndex4 = i6;
                                } else {
                                    moveToFirst = a.moveToNext();
                                    columnIndex = i2;
                                    ajig2 = ajig3;
                                    str3 = str3;
                                    columnIndex2 = i3;
                                    columnIndex8 = columnIndex8;
                                    columnIndex3 = columnIndex3;
                                    columnIndex4 = columnIndex4;
                                }
                            } else {
                                moveToFirst = a.moveToNext();
                                columnIndex = i2;
                                ajig2 = ajig3;
                                str3 = str3;
                                columnIndex2 = columnIndex2;
                                columnIndex8 = columnIndex8;
                                columnIndex3 = columnIndex3;
                                columnIndex4 = columnIndex4;
                            }
                        } else {
                            moveToFirst = a.moveToNext();
                            columnIndex = columnIndex;
                            ajig2 = ajig3;
                            str3 = str3;
                            columnIndex2 = columnIndex2;
                            columnIndex8 = columnIndex8;
                            columnIndex3 = columnIndex3;
                            columnIndex4 = columnIndex4;
                        }
                    }
                    ajih = (ajih) ajig2.mo74062i();
                    str = str3;
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl2.mo68432a("akhd", str4, (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, str);
                    bnsl2.mo68413a("Loaded %d contacts for %s", ajih.f70709a.size(), (Object) account.name);
                    return ajih;
                }
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68432a("akhd", str4, 175, str);
                bnsl3.mo68405a("Unable to find the expected columns in the contact content uri.");
                ajih = ajih.f70707b;
                bnsl bnsl22 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl22.mo68432a("akhd", str4, (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, str);
                bnsl22.mo68413a("Loaded %d contacts for %s", ajih.f70709a.size(), (Object) account.name);
                return ajih;
            } finally {
                a.close();
            }
        } else {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl4.mo68432a("akhd", str4, (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, str3);
            bnsl4.mo68405a("Unable to get cursor for the gaia contact content uri.");
            return ajih.f70707b;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, android.net.Uri]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final ajii mo39440a(ajii ajii) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(ajii.f70713b, ajii.f70714c);
        ajii ajii2 = null;
        if (lookupUri == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhd", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68418a("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", ajii.f70713b, ajii.f70714c);
            return null;
        }
        Cursor a = ahgk.m55687a(this.f71977c, lookupUri, f71975a);
        if (a != null) {
            try {
                if (a.getCount() != 1) {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl2.mo68432a("akhd", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68413a("Found %d contacts for uri: %s.", a.getCount(), (Object) lookupUri);
                } else {
                    Long b = ahgk.m55693b(a, "_id");
                    if (b == null) {
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl3.mo68432a("akhd", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("The contact's id does not exist.");
                    } else {
                        String a2 = ahgk.m55691a(a, "lookup");
                        if (TextUtils.isEmpty(a2)) {
                            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl4.mo68432a("akhd", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("The contact's lookup key does not exist.");
                        } else {
                            bxvd da = ajii.f70710d.mo74144da();
                            long longValue = b.longValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ajii ajii3 = (ajii) da.f164949b;
                            int i = ajii3.f70712a | 1;
                            ajii3.f70712a = i;
                            ajii3.f70713b = longValue;
                            a2.getClass();
                            ajii3.f70712a = i | 2;
                            ajii3.f70714c = a2;
                            ajii2 = (ajii) da.mo74062i();
                        }
                    }
                }
                return ajii2;
            } finally {
                a.close();
            }
        } else {
            bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl5.mo68432a("akhd", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Unable to get cursor for the contact lookup uri.");
            return null;
        }
    }
}
