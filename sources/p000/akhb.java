package p000;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhb {

    /* renamed from: a */
    private final Context f71970a;

    /* renamed from: b */
    private final akhc f71971b;

    public akhb(Context context, akhc akhc) {
        this.f71970a = context;
        this.f71971b = akhc;
    }

    /* renamed from: a */
    private final int m59658a(Account account, ajii ajii, boolean z) {
        ajih b = mo39436b(account);
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((bxvk) b);
        ajig ajig = (ajig) bxvd;
        int size = ((ajih) ajig.f164949b).f70709a.size();
        int i = 0;
        while (i < size) {
            ajif a = ajig.mo38670a(i);
            ajii ajii2 = a.f70697b;
            if (ajii2 == null) {
                ajii2 = ajii.f70710d;
            }
            if (!ajii2.equals(ajii)) {
                i++;
            } else if (a.f70702g == z) {
                return 35500;
            } else {
                bxvd bxvd2 = (bxvd) a.mo74142c(5);
                bxvd2.mo73625a((bxvk) a);
                ajie ajie = (ajie) bxvd2;
                if (ajie.f164950c) {
                    ajie.mo74035c();
                    ajie.f164950c = false;
                }
                ajif ajif = (ajif) ajie.f164949b;
                ajif ajif2 = ajif.f70694l;
                ajif.f70696a |= 8;
                ajif.f70702g = z;
                ajig.mo38671a(i, ajie);
                if (!mo39434a(account, (ajih) ajig.mo74062i())) {
                    return 35506;
                }
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akhb", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68419a("Successfully toggled contact %s to isSelected=%s.", ajii.f70713b, z);
                return 0;
            }
        }
        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
        bnsl2.mo68432a("akhb", "a", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68415a("Failed to select contact %s: this contact does not exist.", ajii.f70713b);
        return 35508;
    }

    /* renamed from: d */
    private final File m59661d(Account account) {
        return akhu.m59725a(this.f71970a, account, "nearby_sharing_contact_book");
    }

    /* renamed from: b */
    public final synchronized int mo39435b(Account account, ajii ajii) {
        return m59658a(account, ajii, false);
    }

    /* renamed from: c */
    public final synchronized boolean mo39437c(Account account) {
        if (account == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhb", "c", 167, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to check has contacts: account is null.");
            return false;
        }
        return m59661d(account).exists();
    }

    /* renamed from: b */
    public final synchronized ajih mo39436b(Account account) {
        FileInputStream fileInputStream;
        if (account == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhb", "b", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to load contact book from disk: account is null.");
            return ajih.f70707b;
        }
        File d = m59661d(account);
        if (d.exists()) {
            try {
                fileInputStream = new FileInputStream(d);
                ajih ajih = (ajih) bxvk.m124010a(ajih.f70707b, fileInputStream);
                fileInputStream.close();
                return ajih;
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("akhb", "b", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to read contact book from disk.");
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return ajih.f70707b;
        throw th;
    }

    /* renamed from: a */
    private static List m59659a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ajif ajif = (ajif) list.get(i);
            arrayList.addAll(ajif.f70700e);
            arrayList.addAll(ajif.f70701f);
        }
        Collections.sort(arrayList);
        return arrayList;
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
    private final C1223np m59660a(ajih ajih, ajih ajih2) {
        akgz akgz;
        ajii ajii;
        C1225nr nrVar = new C1225nr();
        bxwc bxwc = ajih2.f70709a;
        int size = bxwc.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            ajii ajii2 = ((ajif) bxwc.get(i)).f70697b;
            if (ajii2 == null) {
                ajii2 = ajii.f70710d;
            }
            nrVar.add(ajii2);
            i++;
            z = false;
        }
        C1223np npVar = new C1223np();
        bxwc bxwc2 = ajih.f70709a;
        int size2 = bxwc2.size();
        int i2 = 0;
        while (i2 < size2) {
            ajif ajif = (ajif) bxwc2.get(i2);
            akgz akgz2 = new akgz(akgz.m59657a(ajif), ajif.f70702g, ajif.f70703h, ajif.f70704i, ajif.f70705j);
            ajii ajii3 = ajif.f70697b;
            if (ajii3 == null) {
                ajii3 = ajii.f70710d;
            }
            if (!nrVar.contains(ajii3)) {
                akhc akhc = this.f71971b;
                ajii ajii4 = ajif.f70697b;
                if (ajii4 == null) {
                    ajii4 = ajii.f70710d;
                }
                if (!cfov.m142037M()) {
                    ajii = akhc.f71973b.mo39440a(ajii4);
                    akgz = akgz2;
                } else {
                    ajii a = akhc.f71973b.mo39440a(ajii4);
                    if (a == null) {
                        akhe akhe = akhc.f71974c;
                        akgz = akgz2;
                        Uri lookupUri = ContactsContract.Contacts.getLookupUri(ajii4.f70713b, ajii4.f70714c);
                        if (lookupUri == null) {
                            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl.mo68432a("akhe", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68418a("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", ajii4.f70713b, ajii4.f70714c);
                            ajii = null;
                        } else {
                            Cursor a2 = ahgk.m55687a(akhe.f71981d, lookupUri, akhe.f71979b);
                            if (a2 == null) {
                                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                                bnsl2.mo68432a("akhe", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Unable to get cursor for the contact lookup uri.");
                                ajii = null;
                            } else {
                                try {
                                    if (a2.getCount() != 1) {
                                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                                        bnsl3.mo68432a("akhe", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68413a("Found %d contacts for uri: %s.", a2.getCount(), (Object) lookupUri);
                                        ajii = null;
                                    } else {
                                        Long b = ahgk.m55693b(a2, "_id");
                                        if (b == null) {
                                            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                                            bnsl4.mo68432a("akhe", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68405a("The contact's id does not exist.");
                                            ajii = null;
                                        } else {
                                            String a3 = ahgk.m55691a(a2, "lookup");
                                            if (TextUtils.isEmpty(a3)) {
                                                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                                                bnsl5.mo68432a("akhe", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl5.mo68405a("The contact's lookup key does not exist.");
                                                ajii = null;
                                            } else {
                                                bxvd da = ajii.f70710d.mo74144da();
                                                long longValue = b.longValue();
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = z;
                                                }
                                                ajii ajii5 = (ajii) da.f164949b;
                                                int i3 = ajii5.f70712a | 1;
                                                ajii5.f70712a = i3;
                                                ajii5.f70713b = longValue;
                                                a3.getClass();
                                                ajii5.f70712a = i3 | 2;
                                                ajii5.f70714c = a3;
                                                ajii = (ajii) da.mo74062i();
                                            }
                                        }
                                    }
                                } finally {
                                    a2.close();
                                }
                            }
                        }
                    } else {
                        akgz = akgz2;
                        ajii = a;
                    }
                }
                if (ajii != null && nrVar.contains(ajii)) {
                    npVar.put(ajii, akgz);
                } else {
                    bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl6.mo68432a("akhb", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68420a("Discarding contact %s: we could not find this contact in the database.", ajif.f70698c);
                }
            } else {
                akgz akgz3 = akgz2;
                ajii ajii6 = ajif.f70697b;
                if (ajii6 == null) {
                    ajii6 = ajii.f70710d;
                }
                npVar.put(ajii6, akgz3);
            }
            i2++;
            z = false;
        }
        return npVar;
    }

    /* renamed from: a */
    public final synchronized int mo39431a(Account account, ajii ajii) {
        return m59658a(account, ajii, true);
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
    public final synchronized akha mo39432a(Account account) {
        ajih ajih;
        Account account2;
        ajih ajih2;
        long j;
        ajih ajih3;
        bxwc bxwc;
        ajii ajii;
        Cursor a;
        Cursor a2;
        ArrayList arrayList;
        List list;
        ajih ajih4;
        int i;
        int i2;
        bxwc bxwc2;
        bxwc bxwc3;
        int i3;
        int i4;
        bxwc bxwc4;
        int i5;
        boolean z;
        int i6;
        String str;
        String str2;
        Boolean bool;
        List list2;
        int i7;
        boolean moveToNext;
        int i8;
        Account account3 = account;
        synchronized (this) {
            try {
                ajih b = mo39436b(account);
                akhc akhc = this.f71971b;
                if (cfov.m142037M()) {
                    List<Account> a3 = akhu.m59727a(akhc.f71972a);
                    ArrayList arrayList2 = new ArrayList(a3.size());
                    for (Account account4 : a3) {
                        arrayList2.add(akhc.f71973b.mo39439a(account4));
                    }
                    a2 = ahgk.m55688a(akhc.f71974c.f71981d, ContactsContract.Data.CONTENT_URI, akhe.f71980c, akhe.f71978a, new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "contact_id ASC,data1 ASC");
                    if (a2 == null) {
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl.mo68432a("akhe", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Unable to get cursor for the third party contact content uri.");
                        ajih4 = ajih.f70707b;
                        ajih = b;
                        list = a3;
                        arrayList = arrayList2;
                    } else {
                        int columnIndex = a2.getColumnIndex("contact_id");
                        int columnIndex2 = a2.getColumnIndex("lookup");
                        int columnIndex3 = a2.getColumnIndex("display_name");
                        ajih = b;
                        int columnIndex4 = a2.getColumnIndex("photo_thumb_uri");
                        int columnIndex5 = a2.getColumnIndex("mimetype");
                        list = a3;
                        int columnIndex6 = a2.getColumnIndex("data1");
                        arrayList = arrayList2;
                        int columnIndex7 = a2.getColumnIndex("data4");
                        String str3 = "akhe";
                        int columnIndex8 = a2.getColumnIndex("starred");
                        String str4 = "a";
                        if (columnIndex == -1) {
                            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        } else if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1 || columnIndex6 == -1 || columnIndex7 == -1) {
                            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        } else {
                            ajig ajig = (ajig) ajih.f70707b.mo74144da();
                            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                            List c = bute.m120429c();
                            boolean moveToFirst = a2.moveToFirst();
                            while (moveToFirst) {
                                ajig ajig2 = ajig;
                                Long b2 = ahgk.m55692b(a2, columnIndex);
                                if (b2 != null) {
                                    int i9 = columnIndex;
                                    String a4 = ahgk.m55690a(a2, columnIndex2);
                                    if (!TextUtils.isEmpty(a4)) {
                                        int i10 = columnIndex2;
                                        String a5 = ahgk.m55690a(a2, columnIndex3);
                                        if (!TextUtils.isEmpty(a5)) {
                                            String a6 = ahgk.m55690a(a2, columnIndex4);
                                            if (a6 != null) {
                                                str2 = a6;
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
                                            int i11 = columnIndex4;
                                            ajie ajie = (ajie) ajif.f70694l.mo74144da();
                                            int i12 = columnIndex3;
                                            bxvd da = ajii.f70710d.mo74144da();
                                            int i13 = columnIndex7;
                                            int i14 = columnIndex8;
                                            long longValue = b2.longValue();
                                            Long l = b2;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            ajii ajii2 = (ajii) da.f164949b;
                                            List list3 = c;
                                            int i15 = ajii2.f70712a | 1;
                                            ajii2.f70712a = i15;
                                            ajii2.f70713b = longValue;
                                            a4.getClass();
                                            ajii2.f70712a = i15 | 2;
                                            ajii2.f70714c = a4;
                                            if (ajie.f164950c) {
                                                ajie.mo74035c();
                                                ajie.f164950c = false;
                                            }
                                            ajif ajif = (ajif) ajie.f164949b;
                                            ajii ajii3 = (ajii) da.mo74062i();
                                            ajii3.getClass();
                                            ajif.f70697b = ajii3;
                                            ajif.f70696a |= 1;
                                            if (ajie.f164950c) {
                                                ajie.mo74035c();
                                                ajie.f164950c = false;
                                            }
                                            ajif ajif2 = (ajif) ajie.f164949b;
                                            a5.getClass();
                                            int i16 = ajif2.f70696a | 2;
                                            ajif2.f70696a = i16;
                                            ajif2.f70698c = a5;
                                            str2.getClass();
                                            int i17 = i16 | 4;
                                            ajif2.f70696a = i17;
                                            ajif2.f70699d = str2;
                                            ajif2.f70696a = i17 | 8;
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
                                                String a7 = ahgk.m55690a(a2, columnIndex5);
                                                if (a7 != null) {
                                                    String a8 = ahgk.m55690a(a2, columnIndex6);
                                                    if (TextUtils.isEmpty(a8)) {
                                                        i7 = i13;
                                                        list2 = list3;
                                                    } else if (a7.equals("vnd.android.cursor.item/email_v2")) {
                                                        i7 = i13;
                                                        list2 = list3;
                                                        ajie.mo38668a(a8);
                                                    } else if (!a7.equals("vnd.android.cursor.item/phone_v2")) {
                                                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                                                        bnsl2.mo68432a("akhe", "a", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl2.mo68420a("Unexpected mime type in contact content uri: %s.", a7);
                                                        i7 = i13;
                                                        list2 = list3;
                                                    } else {
                                                        i7 = i13;
                                                        String a9 = ahgk.m55690a(a2, i7);
                                                        if (TextUtils.isEmpty(a9)) {
                                                            list2 = list3;
                                                            String a10 = akil.m59826a(a8, list2);
                                                            if (!TextUtils.isEmpty(a10)) {
                                                                ajie.mo38669b(a10);
                                                            }
                                                        } else {
                                                            list2 = list3;
                                                            ajie.mo38669b(a9);
                                                        }
                                                    }
                                                } else {
                                                    i7 = i13;
                                                    list2 = list3;
                                                }
                                                moveToNext = a2.moveToNext();
                                                if (!moveToNext) {
                                                    i8 = i9;
                                                    break;
                                                }
                                                i8 = i9;
                                                Long l2 = l;
                                                if (!l2.equals(ahgk.m55692b(a2, i8))) {
                                                    break;
                                                }
                                                i13 = i7;
                                                i9 = i8;
                                                list3 = list2;
                                                l = l2;
                                            }
                                            if (((ajif) ajie.f164949b).f70700e.size() <= 0) {
                                                if (((ajif) ajie.f164949b).f70701f.size() <= 0) {
                                                    ajig = ajig2;
                                                    columnIndex7 = i7;
                                                    moveToFirst = moveToNext;
                                                    columnIndex = i8;
                                                    c = list2;
                                                    columnIndex2 = i10;
                                                    columnIndex4 = i11;
                                                    columnIndex3 = i12;
                                                    columnIndex8 = i14;
                                                }
                                            }
                                            ajig = ajig2;
                                            ajig.mo38673a(ajie);
                                            columnIndex7 = i7;
                                            moveToFirst = moveToNext;
                                            columnIndex = i8;
                                            c = list2;
                                            columnIndex2 = i10;
                                            columnIndex4 = i11;
                                            columnIndex3 = i12;
                                            columnIndex8 = i14;
                                        } else {
                                            ajig = ajig2;
                                            moveToFirst = a2.moveToNext();
                                            columnIndex7 = columnIndex7;
                                            columnIndex = i9;
                                            c = c;
                                            columnIndex2 = i10;
                                            columnIndex4 = columnIndex4;
                                            columnIndex3 = columnIndex3;
                                            columnIndex8 = columnIndex8;
                                        }
                                    } else {
                                        ajig = ajig2;
                                        moveToFirst = a2.moveToNext();
                                        columnIndex7 = columnIndex7;
                                        columnIndex = i9;
                                        c = c;
                                        columnIndex2 = columnIndex2;
                                        columnIndex4 = columnIndex4;
                                        columnIndex3 = columnIndex3;
                                        columnIndex8 = columnIndex8;
                                    }
                                } else {
                                    ajig = ajig2;
                                    moveToFirst = a2.moveToNext();
                                    columnIndex7 = columnIndex7;
                                    columnIndex = columnIndex;
                                    c = c;
                                    columnIndex2 = columnIndex2;
                                    columnIndex4 = columnIndex4;
                                    columnIndex3 = columnIndex3;
                                    columnIndex8 = columnIndex8;
                                }
                            }
                            ajih4 = (ajih) ajig.mo74062i();
                            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                            bnsl3.mo68432a(str3, str4, 160, str);
                            bnsl3.mo68409a("Loaded %d third party contacts", ajih4.f70709a.size());
                            a2.close();
                        }
                        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl4.mo68432a("akhe", "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Unable to find the expected columns in the contact content uri.");
                        ajih4 = ajih.f70707b;
                        bnsl bnsl32 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl32.mo68432a(str3, str4, 160, str);
                        bnsl32.mo68409a("Loaded %d third party contacts", ajih4.f70709a.size());
                        a2.close();
                    }
                    bxwc bxwc5 = ajih4.f70709a;
                    int size = bxwc5.size();
                    int i18 = 0;
                    while (i18 < size) {
                        ajif ajif4 = (ajif) bxwc5.get(i18);
                        int i19 = 0;
                        boolean z2 = false;
                        while (i19 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            ajih ajih5 = (ajih) arrayList3.get(i19);
                            int i20 = 0;
                            while (i20 < ajih5.f70709a.size()) {
                                ajif ajif5 = (ajif) ajih5.f70709a.get(i20);
                                if (!cfov.f185185a.mo6606a().mo82343az()) {
                                    bxwc2 = bxwc5;
                                    i2 = size;
                                } else {
                                    bxwc2 = bxwc5;
                                    if (ajif5.f70698c.equals(ajif4.f70698c)) {
                                        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                                        bnsl5.mo68432a("akhc", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        i2 = size;
                                        bnsl5.mo68424a("We noticed that the unassociated %s has the same device name as the Gaia %s. Merging the two contacts.", akhc.m59670a(ajif4), akhc.m59670a(ajif5));
                                        bxvd bxvd = (bxvd) ajih5.mo74142c(5);
                                        bxvd.mo73625a((bxvk) ajih5);
                                        ajig ajig3 = (ajig) bxvd;
                                        ajig3.mo38672a(i20, akhc.m59669a(ajif5, ajif4));
                                        arrayList3.set(i19, (ajih) ajig3.mo74062i());
                                        i = i18;
                                        z2 = true;
                                        i20++;
                                        bxwc5 = bxwc2;
                                        size = i2;
                                        i18 = i;
                                    } else {
                                        i2 = size;
                                    }
                                }
                                bxwc bxwc6 = ajif4.f70701f;
                                int size2 = bxwc6.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size2) {
                                        bxwc4 = bxwc6;
                                        String str5 = (String) bxwc6.get(i21);
                                        i5 = size2;
                                        bxwc bxwc7 = ajif5.f70701f;
                                        z = z2;
                                        int size3 = bxwc7.size();
                                        i = i18;
                                        int i22 = 0;
                                        while (true) {
                                            i6 = i21 + 1;
                                            if (i22 >= size3) {
                                                break;
                                            }
                                            int i23 = i22 + 1;
                                            if (((String) bxwc7.get(i22)).equals(str5)) {
                                                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                                                bnsl6.mo68432a("akhc", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl6.mo68424a("We noticed that the unassociated %s shares a phone number with the Gaia %s. Merging the two contacts.", akhc.m59670a(ajif4), akhc.m59670a(ajif5));
                                                bxvd bxvd2 = (bxvd) ajih5.mo74142c(5);
                                                bxvd2.mo73625a((bxvk) ajih5);
                                                ajig ajig4 = (ajig) bxvd2;
                                                ajig4.mo38672a(i20, akhc.m59669a(ajif5, ajif4));
                                                arrayList3.set(i19, (ajih) ajig4.mo74062i());
                                                z2 = true;
                                                break;
                                            }
                                            i22 = i23;
                                        }
                                    } else {
                                        i = i18;
                                        boolean z3 = z2;
                                        bxwc bxwc8 = ajif4.f70700e;
                                        int size4 = bxwc8.size();
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 >= size4) {
                                                z2 = z3;
                                                break;
                                            }
                                            String str6 = (String) bxwc8.get(i24);
                                            bxwc bxwc9 = ajif5.f70700e;
                                            bxwc3 = bxwc8;
                                            int size5 = bxwc9.size();
                                            i3 = size4;
                                            int i25 = 0;
                                            while (true) {
                                                i4 = i24 + 1;
                                                if (i25 >= size5) {
                                                    break;
                                                }
                                                int i26 = i25 + 1;
                                                if (((String) bxwc9.get(i25)).equals(str6)) {
                                                    bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
                                                    bnsl7.mo68432a("akhc", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl7.mo68424a("We noticed that the unassociated %s shares an email with the Gaia %s. Merging the two contacts.", akhc.m59670a(ajif4), akhc.m59670a(ajif5));
                                                    bxvd bxvd3 = (bxvd) ajih5.mo74142c(5);
                                                    bxvd3.mo73625a((bxvk) ajih5);
                                                    ajig ajig5 = (ajig) bxvd3;
                                                    ajig5.mo38672a(i20, akhc.m59669a(ajif5, ajif4));
                                                    arrayList3.set(i19, (ajih) ajig5.mo74062i());
                                                    z2 = true;
                                                    break;
                                                }
                                                i25 = i26;
                                            }
                                            bxwc8 = bxwc3;
                                            size4 = i3;
                                            i24 = i4;
                                        }
                                    }
                                    size2 = i5;
                                    bxwc6 = bxwc4;
                                    z2 = z;
                                    i18 = i;
                                    i21 = i6;
                                }
                                i20++;
                                bxwc5 = bxwc2;
                                size = i2;
                                i18 = i;
                            }
                            i19++;
                            size = size;
                            arrayList = arrayList3;
                        }
                        bxwc bxwc10 = bxwc5;
                        int i27 = i18;
                        ArrayList arrayList4 = arrayList;
                        int i28 = size;
                        if (!z2) {
                            for (int i29 = 0; i29 < arrayList4.size(); i29++) {
                                ajih ajih6 = (ajih) arrayList4.get(i29);
                                bxvd bxvd4 = (bxvd) ajih6.mo74142c(5);
                                bxvd4.mo73625a((bxvk) ajih6);
                                ajig ajig6 = (ajig) bxvd4;
                                ajig6.mo38674a(ajif4);
                                arrayList4.set(i29, (ajih) ajig6.mo74062i());
                            }
                            bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68390d();
                            bnsl8.mo68432a("akhc", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl8.mo68420a("The unassociated %s does not match any existing Gaia contacts. Appending to the contact book.", akhc.m59670a(ajif4));
                        }
                        i18 = i27 + 1;
                        bxwc5 = bxwc10;
                        size = i28;
                        arrayList = arrayList4;
                    }
                    ArrayList arrayList5 = arrayList;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            account2 = account;
                            bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl9.mo68432a("akhc", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl9.mo68424a("Unable to load contacts. No matching account found for %s in %s", account2, list);
                            ajih2 = ajih.f70707b;
                            break;
                        }
                        List list4 = list;
                        account2 = account;
                        if (((Account) list4.get(i30)).equals(account2)) {
                            bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68390d();
                            bnsl10.mo68432a("akhc", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl10.mo68413a("Found %d contacts for account %s", ((ajih) arrayList5.get(i30)).f70709a.size(), (Object) account2);
                            ajih2 = (ajih) arrayList5.get(i30);
                            break;
                        }
                        i30++;
                        list = list4;
                    }
                } else {
                    ajih2 = akhc.f71973b.mo39439a(account3);
                    account2 = account3;
                    ajih = b;
                }
                C1225nr nrVar = new C1225nr();
                bxwc bxwc11 = ajih2.f70709a;
                int size6 = bxwc11.size();
                int i31 = 0;
                while (i31 < size6) {
                    ajih ajih7 = ajih;
                    ajii ajii4 = ((ajif) bxwc11.get(i31)).f70697b;
                    if (ajii4 == null) {
                        ajii4 = ajii.f70710d;
                    }
                    nrVar.add(ajii4);
                    i31++;
                    ajih = ajih7;
                }
                C1223np npVar = new C1223np();
                ajih ajih8 = ajih;
                bxwc bxwc12 = ajih8.f70709a;
                int size7 = bxwc12.size();
                int i32 = 0;
                while (i32 < size7) {
                    ajif ajif6 = (ajif) bxwc12.get(i32);
                    bxwc bxwc13 = bxwc12;
                    int i33 = size7;
                    akgz akgz = new akgz(akgz.m59657a(ajif6), ajif6.f70702g, ajif6.f70703h, ajif6.f70704i, ajif6.f70705j);
                    ajii ajii5 = ajif6.f70697b;
                    if (ajii5 == null) {
                        ajii5 = ajii.f70710d;
                    }
                    if (!nrVar.contains(ajii5)) {
                        akhc akhc2 = this.f71971b;
                        ajii ajii6 = ajif6.f70697b;
                        if (ajii6 == null) {
                            ajii6 = ajii.f70710d;
                        }
                        if (!cfov.m142037M()) {
                            ajii = akhc2.f71973b.mo39440a(ajii6);
                            ajih3 = ajih8;
                            bxwc = bxwc13;
                        } else {
                            ajii a11 = akhc2.f71973b.mo39440a(ajii6);
                            if (a11 == null) {
                                akhe akhe = akhc2.f71974c;
                                Uri lookupUri = ContactsContract.Contacts.getLookupUri(ajii6.f70713b, ajii6.f70714c);
                                bxwc = bxwc13;
                                if (lookupUri == null) {
                                    bnsl bnsl11 = (bnsl) ajvp.f71371a.mo68388c();
                                    bnsl11.mo68432a("akhe", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl11.mo68418a("Unable to construct the contact lookup uri from id: %d and lookup key: %s.", ajii6.f70713b, ajii6.f70714c);
                                    ajih3 = ajih8;
                                    ajii = null;
                                } else {
                                    a = ahgk.m55687a(akhe.f71981d, lookupUri, akhe.f71979b);
                                    if (a == null) {
                                        bnsl bnsl12 = (bnsl) ajvp.f71371a.mo68388c();
                                        bnsl12.mo68432a("akhe", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl12.mo68405a("Unable to get cursor for the contact lookup uri.");
                                        ajih3 = ajih8;
                                        ajii = null;
                                    } else {
                                        ajih3 = ajih8;
                                        if (a.getCount() != 1) {
                                            bnsl bnsl13 = (bnsl) ajvp.f71371a.mo68388c();
                                            bnsl13.mo68432a("akhe", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl13.mo68413a("Found %d contacts for uri: %s.", a.getCount(), (Object) lookupUri);
                                            ajii = null;
                                        } else {
                                            Long b3 = ahgk.m55693b(a, "_id");
                                            if (b3 == null) {
                                                bnsl bnsl14 = (bnsl) ajvp.f71371a.mo68388c();
                                                bnsl14.mo68432a("akhe", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl14.mo68405a("The contact's id does not exist.");
                                                ajii = null;
                                            } else {
                                                String a12 = ahgk.m55691a(a, "lookup");
                                                if (TextUtils.isEmpty(a12)) {
                                                    bnsl bnsl15 = (bnsl) ajvp.f71371a.mo68388c();
                                                    bnsl15.mo68432a("akhe", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl15.mo68405a("The contact's lookup key does not exist.");
                                                    ajii = null;
                                                } else {
                                                    bxvd da2 = ajii.f70710d.mo74144da();
                                                    long longValue2 = b3.longValue();
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    ajii ajii7 = (ajii) da2.f164949b;
                                                    int i34 = ajii7.f70712a | 1;
                                                    ajii7.f70712a = i34;
                                                    ajii7.f70713b = longValue2;
                                                    a12.getClass();
                                                    ajii7.f70712a = i34 | 2;
                                                    ajii7.f70714c = a12;
                                                    ajii = (ajii) da2.mo74062i();
                                                }
                                            }
                                        }
                                        a.close();
                                    }
                                }
                            } else {
                                ajih3 = ajih8;
                                bxwc = bxwc13;
                                ajii = a11;
                            }
                        }
                        if (ajii != null) {
                            if (nrVar.contains(ajii)) {
                                npVar.put(ajii, akgz);
                            }
                        }
                        bnsl bnsl16 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl16.mo68432a("akhb", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl16.mo68420a("Discarding contact %s: we could not find this contact in the database.", ajif6.f70698c);
                    } else {
                        ajih3 = ajih8;
                        bxwc = bxwc13;
                        ajii ajii8 = ajif6.f70697b;
                        if (ajii8 == null) {
                            ajii8 = ajii.f70710d;
                        }
                        npVar.put(ajii8, akgz);
                    }
                    i32++;
                    size7 = i33;
                    bxwc12 = bxwc;
                    ajih8 = ajih3;
                }
                ajih ajih9 = ajih8;
                bxvd bxvd5 = (bxvd) ajih2.mo74142c(5);
                bxvd5.mo73625a((bxvk) ajih2);
                ajig ajig7 = (ajig) bxvd5;
                for (int i35 = 0; i35 < ((ajih) ajig7.f164949b).f70709a.size(); i35++) {
                    ajif a13 = ajig7.mo38670a(i35);
                    ajii ajii9 = a13.f70697b;
                    if (ajii9 == null) {
                        ajii9 = ajii.f70710d;
                    }
                    akgz akgz2 = (akgz) npVar.get(ajii9);
                    if (akgz2 != null) {
                        if (akgz2.f71960a == akgz.m59657a(a13)) {
                            j = akgz2.f71964e;
                        } else {
                            j = 0;
                        }
                        bxvd bxvd6 = (bxvd) a13.mo74142c(5);
                        bxvd6.mo73625a((bxvk) a13);
                        ajie ajie2 = (ajie) bxvd6;
                        boolean z4 = akgz2.f71961b;
                        if (ajie2.f164950c) {
                            ajie2.mo74035c();
                            ajie2.f164950c = false;
                        }
                        ajif ajif7 = (ajif) ajie2.f164949b;
                        ajif ajif8 = ajif.f70694l;
                        int i36 = ajif7.f70696a | 8;
                        ajif7.f70696a = i36;
                        ajif7.f70702g = z4;
                        boolean z5 = akgz2.f71962c;
                        int i37 = i36 | 16;
                        ajif7.f70696a = i37;
                        ajif7.f70703h = z5;
                        boolean z6 = akgz2.f71963d;
                        int i38 = i37 | 32;
                        ajif7.f70696a = i38;
                        ajif7.f70704i = z6;
                        ajif7.f70696a = i38 | 64;
                        ajif7.f70705j = j;
                        ajig7.mo38671a(i35, ajie2);
                    }
                }
                ajih ajih10 = (ajih) ajig7.mo74062i();
                mo39434a(account2, ajih10);
                List a14 = m59659a(ajih9.f70709a);
                List a15 = m59659a(ajih10.f70709a);
                if (a15.size() < a14.size()) {
                    bnsl bnsl17 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl17.mo68432a("akhb", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl17.mo68405a("A contact was removed from the contact book.");
                    akha akha = akha.CONTACT_REMOVED;
                    return akha;
                } else if (a15.size() > a14.size()) {
                    bnsl bnsl18 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl18.mo68432a("akhb", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl18.mo68405a("A contact was added to the contact book.");
                    akha akha2 = akha.CONTACT_ADDED;
                    return akha2;
                } else if (a14.equals(a15)) {
                    bnsl bnsl19 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl19.mo68432a("akhb", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl19.mo68405a("The contact book was modified but all emails and phone numbers are unchanged.");
                    akha akha3 = akha.NO_CONTACTS_CHANGED;
                    return akha3;
                } else {
                    bnsl bnsl20 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl20.mo68432a("akhb", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl20.mo68405a("An email or phone number was edited in the contact book.");
                    akha akha4 = akha.CONTACT_EDITED;
                    return akha4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39433a() {
        List a = akhu.m59728a(this.f71970a, "nearby_sharing_contact_book");
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((File) a.get(i)).delete();
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akhb", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Reset ContactBook.");
    }

    /* renamed from: a */
    public final synchronized boolean mo39434a(Account account, ajih ajih) {
        FileOutputStream fileOutputStream;
        if (account == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhb", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to save contact book to disk: account is null.");
            return false;
        }
        try {
            fileOutputStream = new FileOutputStream(m59661d(account));
            ajih.mo73638a(fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("akhb", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to save contact book to disk.");
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
