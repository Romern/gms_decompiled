package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.Locale;
import java.util.Map;

/* renamed from: uhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uhk extends uha {

    /* renamed from: a */
    public final vff f47646a;

    /* renamed from: b */
    public long f47647b = -1;

    public uhk(Context context, String str, vff vff) {
        super(context, str, str, uhi.values(), 173, 172);
        this.f47646a = vff;
    }

    /* renamed from: a */
    private static String m38538a(String str) {
        return String.valueOf(str).concat(" IS NOT NULL");
    }

    /* renamed from: b */
    private static void m38542b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String a = ukr.SIZE_BYTES.f48050k.mo27700a();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(a).length() + str2.length());
        sb.append("CREATE VIEW IF NOT EXISTS ");
        sb.append(str);
        sb.append(" AS  SELECT ifnull(sum(");
        sb.append(a);
        sb.append("), 0) FROM ");
        sb.append(str2);
        sb.append(";");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: c */
    public final void mo27455c(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String a = ukm.LOCAL_CONTENT_HASH.f48022aB.mo27700a();
        String format = String.format(Locale.US, "(%s IS NOT NULL AND (%s IS NOT NULL OR %s = %s))", a, ukm.LAST_CONTENT_ACTION_ID.f48022aB.mo27700a(), ukm.HEAD_REVISION_ID.f48022aB.mo27700a(), ukm.INSYNC_REVISION_ID.f48022aB.mo27700a());
        uok a2 = uok.m39088a(ukn.f48023a);
        a2.mo27767a(ujs.f47815a.f48341a.mo27700a(), "_id");
        a2.mo27771b();
        uoj b = uoj.m39085b(ujs.f47815a.mo27735b());
        String a3 = ujs.f47815a.f48341a.mo27700a();
        String b2 = ukm.ENTRY_ID.f48022aB.mo27706b();
        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 1 + String.valueOf(b2).length());
        sb.append(a3);
        sb.append("=");
        sb.append(b2);
        b.f48399a = sb.toString();
        a2.mo27769a(b);
        m38541a(sQLiteDatabase2, "EntryView", a2);
        m38540a(sQLiteDatabase2, "ScopedEntryView", "EntryView");
        uoc uoc = new uoc();
        uoc.mo27755a(ujs.f47815a.f48341a.mo27700a(), "_id");
        uoc.mo27755a(ujs.f47815a.f48341a.mo27700a(), "sqlId");
        uoc.mo27755a(String.format(Locale.US, "IFNULL(%s,'%s')", ujr.RESOURCE_ID.f47814c.mo27700a(), "generated-android-null"), "resourceId");
        uoc.mo27757a(ukm.TITLE, uzm.f48741Q);
        uoc.mo27757a(ukm.PINNED, uzm.f48737M);
        uoc.mo27757a(ukm.IS_DOWNLOADABLE, uzm.f48756o);
        uoc.mo27757a(ukm.MIME_TYPE, uzm.f48738N);
        uoc.mo27757a(ukm.LAST_MODIFIED_DATE, uzp.f48771c);
        uoc.mo27757a(ukm.MODIFIED_BY_ME_DATE, uzp.f48772d);
        uoc.mo27757a(ukm.CREATION_DATE, uzp.f48769a);
        uoc.mo27757a(ukm.SHARED_WITH_ME_DATE, uzp.f48773e);
        uoc.mo27757a(ukm.TRASHED, uzm.f48726B);
        uoc.mo27757a(ukm.CAN_EDIT, uzm.f48753l);
        uoc.mo27757a(ukm.SHARED, uzm.f48758q);
        uoc.mo27757a(ukm.ALTERNATE_LINK, uzm.f48743b);
        uoc.mo27757a(ukm.OWNER_NAMES, uzm.f48764w);
        uoc.mo27757a(ukm.DESCRIPTION, uzm.f48744c);
        uoc.mo27757a(ukm.IS_COPYABLE, uzm.f48752k);
        uoc.mo27757a(ukm.EMBED_LINK, uzm.f48745d);
        uoc.mo27757a(ukm.FILE_EXTENSION, uzm.f48746e);
        uoc.mo27757a(ukm.FILE_SIZE, uzm.f48747f);
        uoc.mo27757a(ukm.FOLDER_COLOR_RGB, uzm.f48748g);
        uoc.mo27757a(ukm.IS_VIEWED, uzm.f48762u);
        uoc.mo27757a(ukm.IS_RESTRICTED, uzm.f48757p);
        uoc.mo27757a(ukm.ORIGINAL_FILENAME, uzm.f48763v);
        uoc.mo27757a(ukm.QUOTA_BYTES_USED, uzm.f48739O);
        uoc.mo27757a(ukm.WEB_CONTENT_LINK, uzm.f48727C);
        uoc.mo27757a(ukm.WEB_VIEW_LINK, uzm.f48728D);
        uoc.mo27757a(ukm.HAS_THUMBNAIL, uzm.f48749h);
        uoc.mo27757a(ukm.USER_ROLE, uzm.f48731G);
        uoc.mo27757a(ukm.MD5_CHECKSUM, uzm.f48732H);
        uoc.mo27757a(ukm.WRITERS_CAN_SHARE, uzm.f48730F);
        uoc.mo27757a(ukm.LAST_VIEWED_BY_ME_DATE, uzp.f48770b);
        uoc.mo27757a(ukm.STARRED, uzm.f48740P);
        uoc.mo27757a(ukm.IS_GOOGLE_PHOTOS, uzm.f48759r);
        uoc.mo27757a(ukm.IS_GOOGLE_PHOTOS_ROOT_FOLDER, uzm.f48760s);
        uoc.mo27757a(ukm.RECENCY, uzp.f48774f);
        uoc.mo27757a(ukm.RECENCY_REASON, uzm.f48734J);
        uoc.mo27755a(String.valueOf(ukm.CUSTOM_PROPERTIES_COUNT.f48022aB.mo27700a()).concat(" != 0"), "hasCustomProperties");
        String a4 = ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27700a();
        StringBuilder sb2 = new StringBuilder(String.valueOf(a4).length() + 14);
        sb2.append("(");
        sb2.append(a4);
        sb2.append(" IS NOT NULL)");
        uoc.mo27755a(sb2.toString(), ((uvt) uzm.f48751j).f48653a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 14);
        sb3.append("(");
        sb3.append(a);
        sb3.append(" IS NOT NULL)");
        uoc.mo27755a(sb3.toString(), ((uvt) uzr.f48776a).f48653a);
        String a5 = ukm.MIME_TYPE.f48022aB.mo27700a();
        String a6 = ukm.MIME_TYPE.f48022aB.mo27700a();
        String a7 = ukm.TRASHED.f48022aB.mo27700a();
        String a8 = ukm.IS_DOWNLOADABLE.f48022aB.mo27700a();
        int length = String.valueOf(a5).length();
        int length2 = String.valueOf(a6).length();
        StringBuilder sb4 = new StringBuilder(length + 110 + length2 + String.valueOf(a7).length() + String.valueOf(a8).length());
        sb4.append("((NOT (LIKE('application/vnd.google-apps.folder',");
        sb4.append(a5);
        sb4.append(") OR LIKE('application/vnd.google-apps%',");
        sb4.append(a6);
        sb4.append("))) AND (NOT ");
        sb4.append(a7);
        sb4.append(") AND ");
        sb4.append(a8);
        sb4.append(")");
        uoc.mo27755a(sb4.toString(), ((uvt) uzr.f48777b).f48653a);
        uoc.mo27755a(format, ((uvt) uzm.f48755n).f48653a);
        uoc.mo27757a(ukm.SUBSCRIBED, uzm.f48735K);
        uoc uoc2 = new uoc();
        uoc2.mo27756a(unm.PERMISSIONS_ID, "permissionId");
        uoc2.mo27756a(unm.DISPLAY_NAME, "displayName");
        uoc2.mo27756a(unm.PICTURE_URL, "picture");
        uoc2.mo27756a(unm.IS_AUTHENTICATED_USER, "isAuthenticatedUser");
        uoc2.mo27756a(unm.EMAIL_ADDRESS, "emailAddress");
        String a9 = unn.f48330a.f48341a.mo27700a();
        uok a10 = uok.m39087a("EntryView");
        String a11 = ujs.f47815a.f48341a.mo27700a();
        a10.mo27767a(a11, a11);
        a10.mo27770a(ujr.ACCOUNT_ID);
        a10.mo27770a(ukm.ENTRY_ID);
        a10.mo27770a(ukm.IS_DELETED);
        a10.mo27770a(ukm.APPDATA_OWNER_SDK_APP_ID);
        a10.mo27770a(ukm.LAST_MODIFIED_DATE);
        a10.mo27770a(ukm.SUBSCRIBED);
        a10.mo27770a(ukm.SEQUENCE_NUMBER);
        a10.mo27770a(ukm.IN_DRIVE_SPACE);
        a10.mo27770a(ukm.IN_PHOTOS_SPACE);
        uoc uoc3 = a10.f48403a;
        for (Map.Entry entry : uoc.f48380a.entrySet()) {
            uoc3.mo27755a((String) entry.getValue(), (String) entry.getKey());
        }
        a10.mo27768a(uoc2, "lastModifyingUserJoin", uzm.f48765x.f48653a);
        a10.mo27768a(uoc2, "sharingUserJoin", uzm.f48766y.f48653a);
        uoj a12 = uoj.m39084a(unn.f48330a.mo27735b());
        a12.f48400b = "sharingUserJoin";
        String a13 = ukm.SHARING_USER.f48022aB.mo27700a();
        StringBuilder sb5 = new StringBuilder(String.valueOf(a9).length() + 27 + String.valueOf(a13).length());
        sb5.append("sharingUserJoin.");
        sb5.append(a9);
        sb5.append("=EntryView.");
        sb5.append(a13);
        a12.f48399a = sb5.toString();
        a10.mo27769a(a12);
        uoj a14 = uoj.m39084a(unn.f48330a.mo27735b());
        a14.f48400b = "lastModifyingUserJoin";
        String a15 = ukm.LAST_MODIFYING_USER.f48022aB.mo27700a();
        StringBuilder sb6 = new StringBuilder(String.valueOf(a9).length() + 33 + String.valueOf(a15).length());
        sb6.append("lastModifyingUserJoin.");
        sb6.append(a9);
        sb6.append("=EntryView.");
        sb6.append(a15);
        a14.f48399a = sb6.toString();
        a10.mo27769a(a14);
        m38541a(sQLiteDatabase2, "MetadataView", a10);
        m38540a(sQLiteDatabase2, "ScopedMetadataView", "MetadataView");
        String a16 = ujo.f47807a.f48341a.mo27700a();
        String a17 = uip.DRIVE_APP_ID.f47723j.mo27700a();
        StringBuilder sb7 = new StringBuilder(String.valueOf(a16).length() + 3 + String.valueOf(a17).length());
        sb7.append(a16);
        sb7.append(" = ");
        sb7.append(a17);
        String sb8 = sb7.toString();
        uok a18 = uok.m39087a(uiq.f47724a.mo27735b());
        a18.mo27771b();
        uoj b3 = uoj.m39085b(ujo.f47807a.mo27735b());
        b3.f48399a = sb8;
        a18.mo27769a(b3);
        m38541a(sQLiteDatabase2, "AndroidAppView", a18);
        String a19 = ujs.f47815a.f48341a.mo27700a();
        String b4 = ulg.PARENT_ENTRY_ID.f48115c.mo27706b();
        StringBuilder sb9 = new StringBuilder(String.valueOf(a19).length() + 1 + String.valueOf(b4).length());
        sb9.append(a19);
        sb9.append("=");
        sb9.append(b4);
        String sb10 = sb9.toString();
        uok a20 = uok.m39088a(ujs.f47815a);
        a20.mo27771b();
        uoj b5 = uoj.m39085b(ulh.f48116a.mo27735b());
        b5.f48399a = sb10;
        a20.mo27769a(b5);
        m38541a(sQLiteDatabase2, "ParentDriveIdView", a20);
        uok a21 = uok.m39087a("EntryView");
        a21.mo27771b();
        uoj b6 = uoj.m39085b(ulh.f48116a.mo27735b());
        b6.f48399a = sb10;
        a21.mo27769a(b6);
        m38541a(sQLiteDatabase2, "ParentEntryView", a21);
        m38540a(sQLiteDatabase2, "ScopedParentEntryView", "ParentEntryView");
        uok a22 = uok.m39088a(ukn.f48023a);
        a22.mo27767a(a, a);
        String a23 = ukm.PINNED.f48022aB.mo27700a();
        String a24 = m38538a(a);
        StringBuilder sb11 = new StringBuilder(String.valueOf(a23).length() + 10 + String.valueOf(a24).length());
        sb11.append(a23);
        sb11.append(" != 0 AND ");
        sb11.append(a24);
        a22.mo27772b(sb11.toString());
        uod uod = uod.UNION_ALL;
        uok a25 = uok.m39088a(ukn.f48023a);
        a25.mo27770a(ukm.INSYNC_CONTENT_HASH);
        String a26 = m38539a(ukm.INSYNC_CONTENT_HASH);
        String a27 = m38539a(ukm.LAST_CONTENT_ACTION_ID);
        StringBuilder sb12 = new StringBuilder(String.valueOf(a26).length() + 5 + String.valueOf(a27).length());
        sb12.append(a26);
        sb12.append(" AND ");
        sb12.append(a27);
        a25.mo27772b(sb12.toString());
        uoe a28 = a22.mo27766a(uod, a25);
        uod uod2 = uod.UNION_ALL;
        uok a29 = uok.m39088a(umc.f48191a);
        a29.mo27770a(umb.CONTENT_HASH);
        a29.mo27772b(m38539a(umb.CONTENT_HASH));
        uoe a30 = a28.mo27760a(uod2, a29);
        uod uod3 = uod.UNION_ALL;
        uok a31 = uok.m39088a(umc.f48191a);
        a31.mo27770a(umb.BASE_CONTENT_HASH);
        a31.mo27772b(m38539a(umb.BASE_CONTENT_HASH));
        uoe a32 = a30.mo27760a(uod3, a31);
        uod uod4 = uod.UNION_ALL;
        uok a33 = uok.m39088a(umh.f48205a);
        a33.mo27770a(umg.CONTENT_HASH);
        a33.mo27772b(m38539a(umg.CONTENT_HASH));
        uoe a34 = a32.mo27760a(uod4, a33);
        uod uod5 = uod.UNION_ALL;
        uok a35 = uok.m39088a(uly.f48171a);
        a35.mo27770a(ulx.CONTENT_HASH);
        m38541a(sQLiteDatabase2, "CannotDeleteFileContentHashView", a34.mo27760a(uod5, a35));
        uok a36 = uok.m39088a(ukn.f48023a);
        a36.mo27767a(a, a);
        a36.mo27772b(m38538a(a));
        uod uod6 = uod.UNION_ALL;
        uok a37 = uok.m39088a(ukn.f48023a);
        a37.mo27770a(ukm.INSYNC_CONTENT_HASH);
        a37.mo27772b(m38539a(ukm.INSYNC_CONTENT_HASH));
        uoe a38 = a36.mo27766a(uod6, a37);
        uod uod7 = uod.UNION_ALL;
        uok a39 = uok.m39088a(umc.f48191a);
        a39.mo27770a(umb.CONTENT_HASH);
        a39.mo27772b(m38539a(umb.CONTENT_HASH));
        uoe a40 = a38.mo27760a(uod7, a39);
        uod uod8 = uod.UNION_ALL;
        uok a41 = uok.m39088a(umc.f48191a);
        a41.mo27770a(umb.BASE_CONTENT_HASH);
        a41.mo27772b(m38539a(umb.BASE_CONTENT_HASH));
        uoe a42 = a40.mo27760a(uod8, a41);
        uod uod9 = uod.UNION_ALL;
        uok a43 = uok.m39088a(umh.f48205a);
        a43.mo27770a(umg.CONTENT_HASH);
        a43.mo27772b(m38539a(umg.CONTENT_HASH));
        uoe a44 = a42.mo27760a(uod9, a43);
        uod uod10 = uod.UNION_ALL;
        uok a45 = uok.m39088a(unf.f48306a);
        a45.mo27770a(une.CONTENT_HASH);
        a45.mo27772b(m38539a(une.CONTENT_HASH));
        m38541a(sQLiteDatabase2, "ReferencedFileContentHashView", a44.mo27760a(uod10, a45));
        uok a46 = uok.m39088a(uks.f48051a);
        a46.mo27770a(ukr.CONTENT_HASH);
        a46.mo27772b(m38539a(ukr.CONTENT_HASH));
        uod uod11 = uod.EXCEPT;
        uok a47 = uok.m39087a("ReferencedFileContentHashView");
        a47.mo27771b();
        m38541a(sQLiteDatabase2, "WipeoutFileContentHashView", a46.mo27766a(uod11, a47));
        uok a48 = uok.m39088a(uks.f48051a);
        a48.mo27770a(ukr.CONTENT_HASH);
        a48.mo27772b(m38539a(ukr.CONTENT_HASH));
        uod uod12 = uod.UNION_ALL;
        uok a49 = uok.m39088a(unf.f48306a);
        a49.mo27772b(m38539a(une.CONTENT_HASH));
        a49.mo27770a(une.CONTENT_HASH);
        uoe a50 = a48.mo27766a(uod12, a49);
        uod uod13 = uod.EXCEPT;
        uok a51 = uok.m39087a("CannotDeleteFileContentHashView");
        a51.mo27771b();
        uoe a52 = a50.mo27760a(uod13, a51);
        uod uod14 = uod.EXCEPT;
        uok a53 = uok.m39087a("WipeoutFileContentHashView");
        a53.mo27771b();
        m38541a(sQLiteDatabase2, "CachedFileContentHashView", a52.mo27760a(uod14, a53));
        String a54 = ukr.INTERNAL_FILE_NAME.f48050k.mo27700a();
        String b7 = uks.f48051a.mo27735b();
        String a55 = ukr.SHARED_FILE_NAME.f48050k.mo27700a();
        String b8 = uks.f48051a.mo27735b();
        String a56 = ujc.FILENAME.f47754b.mo27700a();
        String b9 = ujd.f47755a.mo27735b();
        int length3 = String.valueOf(a54).length();
        int length4 = String.valueOf(b7).length();
        int length5 = String.valueOf(a55).length();
        int length6 = String.valueOf(b8).length();
        StringBuilder sb13 = new StringBuilder(length3 + 179 + length4 + length5 + length6 + String.valueOf(a56).length() + String.valueOf(b9).length());
        sb13.append("CREATE VIEW IF NOT EXISTS CannotDeleteFilenameView AS SELECT ");
        sb13.append(a54);
        sb13.append(" AS filename FROM ");
        sb13.append(b7);
        sb13.append(" UNION ALL SELECT ");
        sb13.append(a55);
        sb13.append(" AS filename FROM ");
        sb13.append(b8);
        sb13.append(" UNION ALL SELECT ");
        sb13.append(a56);
        sb13.append(" AS filename FROM ");
        sb13.append(b9);
        sb13.append(" WHERE filename IS NOT NULL;");
        sQLiteDatabase2.execSQL(sb13.toString());
        String b10 = uks.f48051a.mo27735b();
        String a57 = ukr.INTERNAL_FILE_NAME.f48050k.mo27700a();
        String a58 = ukr.LAST_ACCESSED.f48050k.mo27700a();
        int length7 = String.valueOf(b10).length();
        StringBuilder sb14 = new StringBuilder(length7 + 97 + String.valueOf(a57).length() + String.valueOf(a58).length());
        sb14.append("CREATE VIEW IF NOT EXISTS InternalContentView AS SELECT * FROM ");
        sb14.append(b10);
        sb14.append(" WHERE ");
        sb14.append(a57);
        sb14.append(" IS NOT NULL ORDER BY ");
        sb14.append(a58);
        sb14.append(" ASC;");
        sQLiteDatabase2.execSQL(sb14.toString());
        m38542b(sQLiteDatabase2, "InternalContentSizeView", "InternalContentView");
        String b11 = uks.f48051a.mo27735b();
        String a59 = ukr.SHARED_FILE_NAME.f48050k.mo27700a();
        String a60 = ukr.LAST_ACCESSED.f48050k.mo27700a();
        int length8 = String.valueOf(b11).length();
        StringBuilder sb15 = new StringBuilder(length8 + 95 + String.valueOf(a59).length() + String.valueOf(a60).length());
        sb15.append("CREATE VIEW IF NOT EXISTS SharedContentView AS SELECT * FROM ");
        sb15.append(b11);
        sb15.append(" WHERE ");
        sb15.append(a59);
        sb15.append(" IS NOT NULL ORDER BY ");
        sb15.append(a60);
        sb15.append(" ASC;");
        sQLiteDatabase2.execSQL(sb15.toString());
        m38542b(sQLiteDatabase2, "SharedContentSizeView", "SharedContentView");
        String a61 = ukr.CONTENT_HASH.f48050k.mo27700a();
        String a62 = ukr.SHARED_FILE_NAME.f48050k.mo27700a();
        String a63 = ukr.LAST_ACCESSED.f48050k.mo27700a();
        int length9 = String.valueOf(a61).length();
        int length10 = String.valueOf(a62).length();
        StringBuilder sb16 = new StringBuilder(length9 + MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA + length10 + String.valueOf(a63).length());
        sb16.append("CREATE VIEW IF NOT EXISTS InternalCachedContentView AS SELECT * FROM InternalContentView WHERE ");
        sb16.append(a61);
        sb16.append(" IN CachedFileContentHashView ORDER BY ");
        sb16.append(a62);
        sb16.append(" IS NOT NULL , ");
        sb16.append(a63);
        sb16.append(" ASC ;");
        sQLiteDatabase2.execSQL(sb16.toString());
        m38542b(sQLiteDatabase2, "InternalCachedContentSizeView", "InternalCachedContentView");
        String a64 = ukr.CONTENT_HASH.f48050k.mo27700a();
        StringBuilder sb17 = new StringBuilder(String.valueOf(a64).length() + 121);
        sb17.append("CREATE VIEW IF NOT EXISTS SharedCachedContentView AS SELECT * FROM SharedContentView WHERE ");
        sb17.append(a64);
        sb17.append(" IN CachedFileContentHashView;");
        sQLiteDatabase2.execSQL(sb17.toString());
        m38542b(sQLiteDatabase2, "SharedCachedContentSizeView", "SharedCachedContentView");
        uok a65 = uok.m39087a("EntryView");
        a65.mo27771b();
        String a66 = ukm.PINNED.f48022aB.mo27700a();
        StringBuilder sb18 = new StringBuilder(String.valueOf(a66).length() + 13 + String.valueOf(format).length());
        sb18.append(a66);
        sb18.append(" = 1 AND NOT ");
        sb18.append(format);
        a65.mo27772b(sb18.toString());
        a65.f48404b.add(String.valueOf(String.valueOf(a).concat(" IS NULL")).concat(" DESC"));
        m38541a(sQLiteDatabase2, "PinnedDownloadRequiredView", a65);
        String format2 = String.format("DELETE FROM %s WHERE %s IS NOT NULL AND NOT EXISTS (SELECT 1 FROM %s INNER JOIN %s ON %s = %s WHERE %s = %s AND %s = %s);", ukn.f48023a.mo27735b(), ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27706b(), ujs.f47815a.mo27735b(), ujo.f47807a.mo27735b(), ujr.ACCOUNT_ID.f47814c.mo27706b(), ujn.ACCOUNT_ID.f47806h.mo27706b(), ujs.f47815a.f48341a.mo27706b(), ukm.ENTRY_ID.f48022aB.mo27706b(), ujn.SDK_APP_ID.f47806h.mo27706b(), ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27706b());
        String b12 = ujo.f47807a.mo27735b();
        StringBuilder sb19 = new StringBuilder(String.valueOf(b12).length() + 74 + String.valueOf(format2).length());
        sb19.append("CREATE TRIGGER IF NOT EXISTS OnDeleteDriveApp AFTER DELETE ON ");
        sb19.append(b12);
        sb19.append(" BEGIN ");
        sb19.append(format2);
        sb19.append(" END;");
        sQLiteDatabase2.execSQL(sb19.toString());
    }

    /* renamed from: a */
    private static String m38539a(vpj vpj) {
        return m38538a(((unp) vpj.mo27461b()).mo27700a());
    }

    /* renamed from: a */
    private static void m38540a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        uok a = uok.m39087a(str2);
        a.mo27771b();
        uoj a2 = uoj.m39084a(ukb.f47839a.mo27735b());
        String b = uka.ENTRY_ID.f47838c.mo27706b();
        String a3 = ukm.ENTRY_ID.f48022aB.mo27700a();
        int length = String.valueOf(b).length();
        StringBuilder sb = new StringBuilder(length + 4 + str2.length() + String.valueOf(a3).length());
        sb.append(b);
        sb.append(" = ");
        sb.append(str2);
        sb.append(".");
        sb.append(a3);
        a2.f48399a = sb.toString();
        a.mo27769a(a2);
        m38541a(sQLiteDatabase, str, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
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
    private static void m38541a(SQLiteDatabase sQLiteDatabase, String str, uof uof) {
        String str2;
        uol uol = new uol();
        uol.f48410b = str;
        uol.f48409a = true;
        uol.f48411c = uof;
        sdo.checkIfNull((Object) uol.f48410b, (Object) "Must set the name of the VIEW being created");
        sdo.checkIfNull(uol.f48411c, "Must set the select statement for the VIEW being created.");
        if (!uol.f48409a) {
            str2 = "'";
        } else {
            str2 = "IF NOT EXISTS '";
        }
        String str3 = uol.f48410b;
        String a = uol.f48411c.mo27759a();
        int length = str2.length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(a).length());
        sb.append("CREATE VIEW ");
        sb.append(str2);
        sb.append(str3);
        sb.append("' AS ");
        sb.append(a);
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27453a() {
        this.f47647b = this.f47646a.mo28385b();
    }
}
