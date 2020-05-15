package p000;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhc {

    /* renamed from: a */
    public final Context f71972a;

    /* renamed from: b */
    public final akhd f71973b;

    /* renamed from: c */
    public final akhe f71974c;

    public akhc(Context context) {
        this.f71972a = context;
        this.f71973b = new akhd(context);
        this.f71974c = new akhe(context);
    }

    /* renamed from: a */
    public static ajif m59669a(ajif ajif, ajif ajif2) {
        bxvd bxvd = (bxvd) ajif.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) ajif);
        ajie ajie = (ajie) bxvd;
        if (ajif.f70698c.isEmpty()) {
            String str = ajif2.f70698c;
            if (ajie.f164950c) {
                ajie.mo74035c();
                ajie.f164950c = false;
            }
            ajif ajif3 = (ajif) ajie.f164949b;
            ajif ajif4 = ajif.f70694l;
            str.getClass();
            ajif3.f70696a |= 2;
            ajif3.f70698c = str;
        }
        bxwc bxwc = ajif2.f70701f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) bxwc.get(i);
            if (!ajif.f70701f.contains(str2)) {
                ajie.mo38669b(str2);
            }
        }
        bxwc bxwc2 = ajif2.f70700e;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str3 = (String) bxwc2.get(i2);
            if (!ajif.f70700e.contains(str3)) {
                ajie.mo38668a(str3);
            }
        }
        return (ajif) ajie.mo74062i();
    }

    /* renamed from: a */
    public static String m59670a(ajif ajif) {
        return String.format("Contact{%s, %s, %s}", ajif.f70698c, ajif.f70701f, ajif.f70700e);
    }

    /* renamed from: a */
    private static void m59671a(ajih ajih, List list) {
        bxwc bxwc;
        int i;
        bxwc bxwc2;
        int i2;
        bxwc bxwc3;
        boolean z;
        int i3;
        List list2 = list;
        bxwc bxwc4 = ajih.f70709a;
        int size = bxwc4.size();
        int i4 = 0;
        while (i4 < size) {
            ajif ajif = (ajif) bxwc4.get(i4);
            boolean z2 = false;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ajih ajih2 = (ajih) list2.get(i5);
                int i6 = 0;
                while (i6 < ajih2.f70709a.size()) {
                    ajif ajif2 = (ajif) ajih2.f70709a.get(i6);
                    if (cfov.f185185a.mo6606a().mo82343az() && ajif2.f70698c.equals(ajif.f70698c)) {
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl.mo68432a("akhc", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68424a("We noticed that the unassociated %s has the same device name as the Gaia %s. Merging the two contacts.", m59670a(ajif), m59670a(ajif2));
                        bxvd bxvd = (bxvd) ajih2.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) ajih2);
                        ajig ajig = (ajig) bxvd;
                        ajig.mo38672a(i6, m59669a(ajif2, ajif));
                        list2.set(i5, (ajih) ajig.mo74062i());
                        bxwc = bxwc4;
                        i = size;
                        z2 = true;
                    } else {
                        bxwc bxwc5 = ajif.f70701f;
                        int size2 = bxwc5.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                bxwc = bxwc4;
                                String str = (String) bxwc5.get(i7);
                                i = size;
                                bxwc bxwc6 = ajif2.f70701f;
                                bxwc3 = bxwc5;
                                int size3 = bxwc6.size();
                                z = z2;
                                int i8 = 0;
                                while (true) {
                                    i3 = i7 + 1;
                                    if (i8 >= size3) {
                                        break;
                                    }
                                    int i9 = i8 + 1;
                                    if (((String) bxwc6.get(i8)).equals(str)) {
                                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                                        bnsl2.mo68432a("akhc", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68424a("We noticed that the unassociated %s shares a phone number with the Gaia %s. Merging the two contacts.", m59670a(ajif), m59670a(ajif2));
                                        bxvd bxvd2 = (bxvd) ajih2.mo74142c(5);
                                        bxvd2.mo73625a((GeneratedMessageLite) ajih2);
                                        ajig ajig2 = (ajig) bxvd2;
                                        ajig2.mo38672a(i6, m59669a(ajif2, ajif));
                                        list2.set(i5, (ajih) ajig2.mo74062i());
                                        z2 = true;
                                        break;
                                    }
                                    i8 = i9;
                                }
                            } else {
                                bxwc = bxwc4;
                                i = size;
                                boolean z3 = z2;
                                bxwc bxwc7 = ajif.f70700e;
                                int size4 = bxwc7.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size4) {
                                        z2 = z3;
                                        break;
                                    }
                                    String str2 = (String) bxwc7.get(i10);
                                    bxwc bxwc8 = ajif2.f70700e;
                                    int size5 = bxwc8.size();
                                    bxwc2 = bxwc7;
                                    int i11 = 0;
                                    while (true) {
                                        i2 = i10 + 1;
                                        if (i11 >= size5) {
                                            break;
                                        }
                                        int i12 = i11 + 1;
                                        if (((String) bxwc8.get(i11)).equals(str2)) {
                                            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                                            bnsl3.mo68432a("akhc", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl3.mo68424a("We noticed that the unassociated %s shares an email with the Gaia %s. Merging the two contacts.", m59670a(ajif), m59670a(ajif2));
                                            bxvd bxvd3 = (bxvd) ajih2.mo74142c(5);
                                            bxvd3.mo73625a((GeneratedMessageLite) ajih2);
                                            ajig ajig3 = (ajig) bxvd3;
                                            ajig3.mo38672a(i6, m59669a(ajif2, ajif));
                                            list2.set(i5, (ajih) ajig3.mo74062i());
                                            z2 = true;
                                            break;
                                        }
                                        i11 = i12;
                                    }
                                    bxwc7 = bxwc2;
                                    i10 = i2;
                                }
                            }
                            size = i;
                            bxwc4 = bxwc;
                            bxwc5 = bxwc3;
                            z2 = z;
                            i7 = i3;
                        }
                    }
                    i6++;
                    size = i;
                    bxwc4 = bxwc;
                }
            }
            bxwc bxwc9 = bxwc4;
            int i13 = size;
            if (!z2) {
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ajih ajih3 = (ajih) list2.get(i14);
                    bxvd bxvd4 = (bxvd) ajih3.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) ajih3);
                    ajig ajig4 = (ajig) bxvd4;
                    ajig4.mo38674a(ajif);
                    list2.set(i14, (ajih) ajig4.mo74062i());
                }
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akhc", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("The unassociated %s does not match any existing Gaia contacts. Appending to the contact book.", m59670a(ajif));
            }
            i4++;
            size = i13;
            bxwc4 = bxwc9;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, android.accounts.Account]
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
    public final ajih mo39438a(Account account) {
        ArrayList arrayList;
        List list;
        ajih ajih;
        bxwc bxwc;
        int i;
        bxwc bxwc2;
        int i2;
        boolean z;
        bxwc bxwc3;
        int i3;
        String str;
        String str2;
        Boolean bool;
        String str3;
        List list2;
        boolean moveToNext;
        int i4;
        ajig ajig;
        Account account2 = account;
        if (!cfov.m142037M()) {
            return this.f71973b.mo39439a(account2);
        }
        List<Account> a = akhu.m59727a(this.f71972a);
        ArrayList arrayList2 = new ArrayList(a.size());
        for (Account account3 : a) {
            arrayList2.add(this.f71973b.mo39439a(account3));
        }
        Cursor a2 = ahgk.m55688a(this.f71974c.f71981d, ContactsContract.Data.CONTENT_URI, akhe.f71980c, akhe.f71978a, new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
        String str4 = "akhe";
        if (a2 == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a(str4, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to get cursor for the third party contact content uri.");
            ajih = ajih.f70707b;
            list = a;
            arrayList = arrayList2;
        } else {
            try {
                int columnIndex = a2.getColumnIndex("contact_id");
                int columnIndex2 = a2.getColumnIndex("lookup");
                int columnIndex3 = a2.getColumnIndex("display_name");
                int columnIndex4 = a2.getColumnIndex("photo_thumb_uri");
                int columnIndex5 = a2.getColumnIndex("mimetype");
                int columnIndex6 = a2.getColumnIndex("data1");
                int columnIndex7 = a2.getColumnIndex("data4");
                int columnIndex8 = a2.getColumnIndex("starred");
                list = a;
                if (columnIndex == -1) {
                    arrayList = arrayList2;
                    str = str4;
                } else if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
                    arrayList = arrayList2;
                    str = str4;
                } else {
                    ajig ajig2 = (ajig) ajih.f70707b.mo74144da();
                    arrayList = arrayList2;
                    List c = bute.m120429c();
                    boolean moveToFirst = a2.moveToFirst();
                    while (moveToFirst) {
                        ajig ajig3 = ajig2;
                        Long b = ahgk.m55692b(a2, columnIndex);
                        if (b != null) {
                            int i5 = columnIndex;
                            String a3 = ahgk.m55690a(a2, columnIndex2);
                            if (!TextUtils.isEmpty(a3)) {
                                int i6 = columnIndex2;
                                String a4 = ahgk.m55690a(a2, columnIndex3);
                                if (!TextUtils.isEmpty(a4)) {
                                    String a5 = ahgk.m55690a(a2, columnIndex4);
                                    if (a5 != null) {
                                        str2 = a5;
                                    } else {
                                        str2 = "";
                                    }
                                    if (cfov.m142033I()) {
                                        bool = ahgk.m55695c(a2, columnIndex8);
                                        if (bool == null) {
                                            bool = false;
                                        }
                                    } else {
                                        bool = false;
                                    }
                                    int i7 = columnIndex8;
                                    ajie ajie = (ajie) ajif.f70694l.mo74144da();
                                    int i8 = columnIndex4;
                                    bxvd da = ajii.f70710d.mo74144da();
                                    int i9 = columnIndex3;
                                    String str5 = str4;
                                    long longValue = b.longValue();
                                    Long l = b;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ajii ajii = (ajii) da.f164949b;
                                    List list3 = c;
                                    int i10 = ajii.f70712a | 1;
                                    ajii.f70712a = i10;
                                    ajii.f70713b = longValue;
                                    a3.getClass();
                                    ajii.f70712a = i10 | 2;
                                    ajii.f70714c = a3;
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
                                    a4.getClass();
                                    int i11 = ajif2.f70696a | 2;
                                    ajif2.f70696a = i11;
                                    ajif2.f70698c = a4;
                                    str2.getClass();
                                    int i12 = i11 | 4;
                                    ajif2.f70696a = i12;
                                    ajif2.f70699d = str2;
                                    ajif2.f70696a = i12 | 8;
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
                                        String a6 = ahgk.m55690a(a2, columnIndex5);
                                        if (a6 != null) {
                                            String a7 = ahgk.m55690a(a2, columnIndex6);
                                            if (TextUtils.isEmpty(a7)) {
                                                str3 = str5;
                                                list2 = list3;
                                            } else if (a6.equals("vnd.android.cursor.item/email_v2")) {
                                                str3 = str5;
                                                list2 = list3;
                                                ajie.mo38668a(a7);
                                            } else if (!a6.equals("vnd.android.cursor.item/phone_v2")) {
                                                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                                                str3 = str5;
                                                bnsl2.mo68432a(str3, "a", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl2.mo68420a("Unexpected mime type in contact content uri: %s.", a6);
                                                list2 = list3;
                                            } else {
                                                str3 = str5;
                                                String a8 = ahgk.m55690a(a2, columnIndex7);
                                                if (TextUtils.isEmpty(a8)) {
                                                    list2 = list3;
                                                    String a9 = akil.m59826a(a7, list2);
                                                    if (!TextUtils.isEmpty(a9)) {
                                                        ajie.mo38669b(a9);
                                                    }
                                                } else {
                                                    list2 = list3;
                                                    ajie.mo38669b(a8);
                                                }
                                            }
                                        } else {
                                            str3 = str5;
                                            list2 = list3;
                                        }
                                        moveToNext = a2.moveToNext();
                                        if (!moveToNext) {
                                            i4 = i5;
                                            break;
                                        }
                                        i4 = i5;
                                        Long l2 = l;
                                        if (!l2.equals(ahgk.m55692b(a2, i4))) {
                                            break;
                                        }
                                        l = l2;
                                        i5 = i4;
                                        list3 = list2;
                                        str5 = str3;
                                    }
                                    if (((ajif) ajie.f164949b).f70700e.size() <= 0) {
                                        if (((ajif) ajie.f164949b).f70701f.size() <= 0) {
                                            ajig = ajig3;
                                            moveToFirst = moveToNext;
                                            c = list2;
                                            str4 = str3;
                                            ajig2 = ajig;
                                            columnIndex2 = i6;
                                            columnIndex8 = i7;
                                            columnIndex4 = i8;
                                            columnIndex = i4;
                                            columnIndex3 = i9;
                                        }
                                    }
                                    ajig = ajig3;
                                    ajig.mo38673a(ajie);
                                    moveToFirst = moveToNext;
                                    c = list2;
                                    str4 = str3;
                                    ajig2 = ajig;
                                    columnIndex2 = i6;
                                    columnIndex8 = i7;
                                    columnIndex4 = i8;
                                    columnIndex = i4;
                                    columnIndex3 = i9;
                                } else {
                                    moveToFirst = a2.moveToNext();
                                    c = c;
                                    str4 = str4;
                                    ajig2 = ajig3;
                                    columnIndex2 = i6;
                                    columnIndex8 = columnIndex8;
                                    columnIndex4 = columnIndex4;
                                    columnIndex = i5;
                                    columnIndex3 = columnIndex3;
                                }
                            } else {
                                moveToFirst = a2.moveToNext();
                                c = c;
                                str4 = str4;
                                ajig2 = ajig3;
                                columnIndex2 = columnIndex2;
                                columnIndex8 = columnIndex8;
                                columnIndex4 = columnIndex4;
                                columnIndex = i5;
                                columnIndex3 = columnIndex3;
                            }
                        } else {
                            moveToFirst = a2.moveToNext();
                            c = c;
                            str4 = str4;
                            ajig2 = ajig3;
                            columnIndex2 = columnIndex2;
                            columnIndex8 = columnIndex8;
                            columnIndex4 = columnIndex4;
                            columnIndex = columnIndex;
                            columnIndex3 = columnIndex3;
                        }
                    }
                    ajih = (ajih) ajig2.mo74062i();
                    str = str4;
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl3.mo68432a(str, "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68409a("Loaded %d third party contacts", ajih.f70709a.size());
                }
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl4.mo68432a(str, "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Unable to find the expected columns in the contact content uri.");
                ajih = ajih.f70707b;
                bnsl bnsl32 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl32.mo68432a(str, "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl32.mo68409a("Loaded %d third party contacts", ajih.f70709a.size());
            } finally {
                a2.close();
            }
        }
        bxwc bxwc4 = ajih.f70709a;
        int size = bxwc4.size();
        int i13 = 0;
        while (i13 < size) {
            ajif ajif4 = (ajif) bxwc4.get(i13);
            int i14 = 0;
            boolean z2 = false;
            while (i14 < arrayList.size()) {
                ArrayList arrayList3 = arrayList;
                ajih ajih2 = (ajih) arrayList3.get(i14);
                int i15 = 0;
                while (i15 < ajih2.f70709a.size()) {
                    ajif ajif5 = (ajif) ajih2.f70709a.get(i15);
                    if (cfov.f185185a.mo6606a().mo82343az() && ajif5.f70698c.equals(ajif4.f70698c)) {
                        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl5.mo68432a("akhc", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68424a("We noticed that the unassociated %s has the same device name as the Gaia %s. Merging the two contacts.", m59670a(ajif4), m59670a(ajif5));
                        bxvd bxvd = (bxvd) ajih2.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) ajih2);
                        ajig ajig4 = (ajig) bxvd;
                        ajig4.mo38672a(i15, m59669a(ajif5, ajif4));
                        arrayList3.set(i14, (ajih) ajig4.mo74062i());
                        bxwc = bxwc4;
                        i = size;
                        z2 = true;
                    } else {
                        bxwc bxwc5 = ajif4.f70701f;
                        int size2 = bxwc5.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                bxwc = bxwc4;
                                String str6 = (String) bxwc5.get(i16);
                                i = size;
                                bxwc bxwc6 = ajif5.f70701f;
                                z = z2;
                                int size3 = bxwc6.size();
                                bxwc3 = bxwc5;
                                int i17 = 0;
                                while (true) {
                                    i3 = i16 + 1;
                                    if (i17 >= size3) {
                                        break;
                                    }
                                    int i18 = i17 + 1;
                                    if (((String) bxwc6.get(i17)).equals(str6)) {
                                        bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                                        bnsl6.mo68432a("akhc", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl6.mo68424a("We noticed that the unassociated %s shares a phone number with the Gaia %s. Merging the two contacts.", m59670a(ajif4), m59670a(ajif5));
                                        bxvd bxvd2 = (bxvd) ajih2.mo74142c(5);
                                        bxvd2.mo73625a((GeneratedMessageLite) ajih2);
                                        ajig ajig5 = (ajig) bxvd2;
                                        ajig5.mo38672a(i15, m59669a(ajif5, ajif4));
                                        arrayList3.set(i14, (ajih) ajig5.mo74062i());
                                        z2 = true;
                                        break;
                                    }
                                    i17 = i18;
                                }
                            } else {
                                bxwc = bxwc4;
                                i = size;
                                boolean z3 = z2;
                                bxwc bxwc7 = ajif4.f70700e;
                                int size4 = bxwc7.size();
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= size4) {
                                        z2 = z3;
                                        break;
                                    }
                                    String str7 = (String) bxwc7.get(i19);
                                    bxwc bxwc8 = ajif5.f70700e;
                                    int size5 = bxwc8.size();
                                    bxwc2 = bxwc7;
                                    int i20 = 0;
                                    while (true) {
                                        i2 = i19 + 1;
                                        if (i20 >= size5) {
                                            break;
                                        }
                                        int i21 = i20 + 1;
                                        if (((String) bxwc8.get(i20)).equals(str7)) {
                                            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
                                            bnsl7.mo68432a("akhc", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl7.mo68424a("We noticed that the unassociated %s shares an email with the Gaia %s. Merging the two contacts.", m59670a(ajif4), m59670a(ajif5));
                                            bxvd bxvd3 = (bxvd) ajih2.mo74142c(5);
                                            bxvd3.mo73625a((GeneratedMessageLite) ajih2);
                                            ajig ajig6 = (ajig) bxvd3;
                                            ajig6.mo38672a(i15, m59669a(ajif5, ajif4));
                                            arrayList3.set(i14, (ajih) ajig6.mo74062i());
                                            z2 = true;
                                            break;
                                        }
                                        i20 = i21;
                                    }
                                    bxwc7 = bxwc2;
                                    i19 = i2;
                                }
                            }
                            size = i;
                            bxwc4 = bxwc;
                            z2 = z;
                            bxwc5 = bxwc3;
                            i16 = i3;
                        }
                    }
                    i15++;
                    size = i;
                    bxwc4 = bxwc;
                }
                i14++;
                bxwc4 = bxwc4;
                arrayList = arrayList3;
            }
            bxwc bxwc9 = bxwc4;
            ArrayList arrayList4 = arrayList;
            int i22 = size;
            if (!z2) {
                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                    ajih ajih3 = (ajih) arrayList4.get(i23);
                    bxvd bxvd4 = (bxvd) ajih3.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) ajih3);
                    ajig ajig7 = (ajig) bxvd4;
                    ajig7.mo38674a(ajif4);
                    arrayList4.set(i23, (ajih) ajig7.mo74062i());
                }
                bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl8.mo68432a("akhc", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl8.mo68420a("The unassociated %s does not match any existing Gaia contacts. Appending to the contact book.", m59670a(ajif4));
            }
            i13++;
            size = i22;
            bxwc4 = bxwc9;
            arrayList = arrayList4;
        }
        ArrayList arrayList5 = arrayList;
        int i24 = 0;
        while (i24 < list.size()) {
            List list4 = list;
            Account account4 = account;
            if (((Account) list4.get(i24)).equals(account4)) {
                bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl9.mo68432a("akhc", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl9.mo68413a("Found %d contacts for account %s", ((ajih) arrayList5.get(i24)).f70709a.size(), (Object) account4);
                return (ajih) arrayList5.get(i24);
            }
            i24++;
            list = list4;
        }
        bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68388c();
        bnsl10.mo68432a("akhc", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl10.mo68424a("Unable to load contacts. No matching account found for %s in %s", account, list);
        return ajih.f70707b;
    }
}
