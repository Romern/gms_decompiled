package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Date;
import org.json.JSONException;

/* renamed from: ukg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ukg extends unq {

    /* renamed from: a */
    public static final Date f47870a = new Date(0);

    /* renamed from: ap */
    private static final sbw f47871ap = new sbw("EntryRow", "");

    /* renamed from: A */
    public String f47872A;

    /* renamed from: B */
    public String f47873B;

    /* renamed from: C */
    public String f47874C;

    /* renamed from: D */
    public String f47875D;

    /* renamed from: E */
    public boolean f47876E;

    /* renamed from: F */
    public boolean f47877F;

    /* renamed from: G */
    public boolean f47878G;

    /* renamed from: H */
    public boolean f47879H;

    /* renamed from: I */
    public boolean f47880I;

    /* renamed from: J */
    public int f47881J;

    /* renamed from: K */
    public long f47882K;

    /* renamed from: L */
    public Date f47883L;

    /* renamed from: M */
    public Date f47884M;

    /* renamed from: N */
    public bngx f47885N;

    /* renamed from: O */
    public uml f47886O;

    /* renamed from: P */
    public String f47887P;

    /* renamed from: Q */
    public String f47888Q;

    /* renamed from: R */
    public String f47889R;

    /* renamed from: S */
    public ung f47890S;

    /* renamed from: T */
    public boolean f47891T;

    /* renamed from: U */
    public boolean f47892U;

    /* renamed from: V */
    public boolean f47893V;

    /* renamed from: W */
    public boolean f47894W;

    /* renamed from: X */
    public boolean f47895X;

    /* renamed from: Y */
    public boolean f47896Y;

    /* renamed from: Z */
    public boolean f47897Z;

    /* renamed from: aa */
    public boolean f47898aa;

    /* renamed from: ab */
    public boolean f47899ab;

    /* renamed from: ac */
    public boolean f47900ac;

    /* renamed from: ad */
    public boolean f47901ad;

    /* renamed from: ae */
    public long f47902ae;

    /* renamed from: af */
    public long f47903af;

    /* renamed from: ag */
    public long f47904ag;

    /* renamed from: ah */
    public long f47905ah;

    /* renamed from: ai */
    public String f47906ai;

    /* renamed from: aj */
    public long f47907aj;

    /* renamed from: ak */
    public long f47908ak;

    /* renamed from: al */
    public boolean f47909al;

    /* renamed from: b */
    public Date f47910b;

    /* renamed from: c */
    public Date f47911c;

    /* renamed from: d */
    public Date f47912d;

    /* renamed from: e */
    public Date f47913e;

    /* renamed from: f */
    public Long f47914f;

    /* renamed from: g */
    public Long f47915g;

    /* renamed from: h */
    public Long f47916h;

    /* renamed from: i */
    public Long f47917i;

    /* renamed from: j */
    public Long f47918j;

    /* renamed from: k */
    public Long f47919k;

    /* renamed from: l */
    public Long f47920l;

    /* renamed from: m */
    public String f47921m;

    /* renamed from: n */
    public String f47922n;

    /* renamed from: o */
    public String f47923o;

    /* renamed from: p */
    public String f47924p;

    /* renamed from: q */
    public String f47925q;

    /* renamed from: r */
    public String f47926r;

    /* renamed from: s */
    public String f47927s;

    /* renamed from: t */
    public String f47928t;

    /* renamed from: u */
    public String f47929u;

    /* renamed from: v */
    public String f47930v;

    /* renamed from: w */
    public String f47931w;

    /* renamed from: x */
    public String f47932x;

    /* renamed from: y */
    public String f47933y;

    /* renamed from: z */
    public String f47934z;

    public ukg(uno uno, long j, boolean z) {
        super(uno, ukn.f48023a, z);
        this.f47910b = null;
        this.f47911c = null;
        this.f47912d = null;
        this.f47913e = null;
        this.f47914f = null;
        this.f47920l = null;
        this.f47921m = null;
        this.f47933y = null;
        this.f47876E = false;
        this.f47877F = false;
        this.f47878G = false;
        this.f47879H = false;
        this.f47880I = true;
        this.f47881J = 0;
        this.f47882K = 0;
        Date date = f47870a;
        this.f47883L = date;
        this.f47884M = date;
        this.f47885N = bngx.m109376e();
        this.f47886O = uml.UNPINNED;
        this.f47887P = "";
        this.f47888Q = "owner";
        this.f47889R = null;
        this.f47890S = ung.UNTRASHED;
        this.f47902ae = j;
    }

    /* renamed from: a */
    public final uog mo27514a() {
        return ukm.ENTRY_ID.f48022aB.mo27717e(this.f47902ae);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27515b(ContentValues contentValues) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        if (this.f47902ae >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Must set entry ID before persisting");
        contentValues.put(ukm.ENTRY_ID.f48022aB.mo27700a(), Long.valueOf(this.f47902ae));
        contentValues.put(ukm.DELETED_ON_SERVER_TIME.f48022aB.mo27700a(), this.f47914f);
        contentValues.put(ukm.SEQUENCE_NUMBER.f48022aB.mo27700a(), Long.valueOf(this.f47907aj));
        contentValues.put(ukm.LAST_SYNC_SEQUENCE_NUMBER.f48022aB.mo27700a(), Long.valueOf(this.f47908ak));
        contentValues.put(ukm.SUBSCRIBED.f48022aB.mo27700a(), Boolean.valueOf(this.f47880I));
        contentValues.put(ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27700a(), this.f47932x);
        contentValues.put(ukm.IN_DRIVE_SPACE.f48022aB.mo27700a(), Boolean.valueOf(this.f47897Z));
        contentValues.put(ukm.IN_PHOTOS_SPACE.f48022aB.mo27700a(), Boolean.valueOf(this.f47898aa));
        contentValues.put(ukm.IS_DELETED.f48022aB.mo27700a(), Boolean.valueOf(this.f47876E));
        contentValues.put(ukm.IS_DELETED_ACTION_ID.f48022aB.mo27700a(), this.f47916h);
        contentValues.put(ukm.TITLE.f48022aB.mo27700a(), this.f47887P);
        contentValues.put(ukm.STARRED.f48022aB.mo27700a(), Boolean.valueOf(this.f47879H));
        contentValues.put(ukm.SHARED.f48022aB.mo27700a(), Boolean.valueOf(this.f47878G));
        contentValues.put(ukm.TRASHED.f48022aB.mo27700a(), Long.valueOf(this.f47890S.f48312d));
        contentValues.put(ukm.PINNED.f48022aB.mo27700a(), Long.valueOf(this.f47886O.f48221d));
        contentValues.put(ukm.IS_DOWNLOADABLE.f48022aB.mo27700a(), Boolean.valueOf(this.f47894W));
        contentValues.put(ukm.CAN_EDIT.f48022aB.mo27700a(), Boolean.valueOf(this.f47891T));
        contentValues.put(ukm.CREATION_DATE.f48022aB.mo27700a(), Long.valueOf(this.f47883L.getTime()));
        contentValues.put(ukm.LAST_MODIFIED_DATE.f48022aB.mo27700a(), Long.valueOf(this.f47884M.getTime()));
        Date date = this.f47910b;
        Long l4 = null;
        if (date != null) {
            l = Long.valueOf(date.getTime());
        } else {
            l = null;
        }
        Date date2 = this.f47913e;
        if (date2 != null) {
            l2 = Long.valueOf(date2.getTime());
        } else {
            l2 = null;
        }
        Date date3 = this.f47911c;
        if (date3 != null) {
            l3 = Long.valueOf(date3.getTime());
        } else {
            l3 = null;
        }
        Date date4 = this.f47912d;
        if (date4 != null) {
            l4 = Long.valueOf(date4.getTime());
        }
        contentValues.put(ukm.LAST_VIEWED_BY_ME_DATE.f48022aB.mo27700a(), l);
        contentValues.put(ukm.SHARED_WITH_ME_DATE.f48022aB.mo27700a(), l2);
        contentValues.put(ukm.MODIFIED_BY_ME_DATE.f48022aB.mo27700a(), l3);
        contentValues.put(ukm.RECENCY.f48022aB.mo27700a(), l4);
        contentValues.put(ukm.RECENCY_REASON.f48022aB.mo27700a(), this.f47933y);
        contentValues.put(ukm.MIME_TYPE.f48022aB.mo27700a(), this.f47889R);
        contentValues.put(ukm.ALTERNATE_LINK.f48022aB.mo27700a(), this.f47921m);
        contentValues.put(ukm.OWNER_NAMES.f48022aB.mo27700a(), uzf.m39820a(this.f47885N));
        contentValues.put(ukm.MD5_CHECKSUM.f48022aB.mo27700a(), this.f47930v);
        contentValues.put(ukm.DESCRIPTION.f48022aB.mo27700a(), this.f47922n);
        contentValues.put(ukm.IS_COPYABLE.f48022aB.mo27700a(), Boolean.valueOf(this.f47892U));
        contentValues.put(ukm.EMBED_LINK.f48022aB.mo27700a(), this.f47923o);
        contentValues.put(ukm.FILE_EXTENSION.f48022aB.mo27700a(), this.f47924p);
        contentValues.put(ukm.FILE_SIZE.f48022aB.mo27700a(), Long.valueOf(this.f47903af));
        contentValues.put(ukm.GENOA_FILE_SIZE.f48022aB.mo27700a(), this.f47915g);
        contentValues.put(ukm.FOLDER_COLOR_RGB.f48022aB.mo27700a(), this.f47925q);
        contentValues.put(ukm.IS_VIEWED.f48022aB.mo27700a(), Boolean.valueOf(this.f47900ac));
        contentValues.put(ukm.IS_RESTRICTED.f48022aB.mo27700a(), Boolean.valueOf(this.f47899ab));
        contentValues.put(ukm.ORIGINAL_FILENAME.f48022aB.mo27700a(), this.f47931w);
        contentValues.put(ukm.QUOTA_BYTES_USED.f48022aB.mo27700a(), Long.valueOf(this.f47905ah));
        contentValues.put(ukm.WEB_CONTENT_LINK.f48022aB.mo27700a(), this.f47872A);
        contentValues.put(ukm.WEB_VIEW_LINK.f48022aB.mo27700a(), this.f47873B);
        contentValues.put(ukm.HAS_THUMBNAIL.f48022aB.mo27700a(), Boolean.valueOf(this.f47893V));
        contentValues.put(ukm.USER_ROLE.f48022aB.mo27700a(), this.f47888Q);
        contentValues.put(ukm.CUSTOM_PROPERTIES_COUNT.f48022aB.mo27700a(), Integer.valueOf(this.f47881J));
        contentValues.put(ukm.HEAD_REVISION_ID.f48022aB.mo27700a(), this.f47926r);
        contentValues.put(ukm.UNIQUE_IDENTIFIER.f48022aB.mo27700a(), this.f47874C);
        contentValues.put(ukm.UNIQUE_IDENTIFIER_VERSION.f48022aB.mo27700a(), this.f47875D);
        contentValues.put(ukm.LOCAL_CONTENT_HASH.f48022aB.mo27700a(), this.f47906ai);
        contentValues.put(ukm.LOCAL_CONTENT_SIGNATURE.f48022aB.mo27700a(), this.f47929u);
        contentValues.put(ukm.INSYNC_CONTENT_HASH.f48022aB.mo27700a(), this.f47927s);
        contentValues.put(ukm.INSYNC_REVISION_ID.f48022aB.mo27700a(), this.f47928t);
        contentValues.put(ukm.LAST_CONTENT_ACTION_ID.f48022aB.mo27700a(), this.f47917i);
        contentValues.put(ukm.SINGLETON_CREATOR_SDK_APP_ID.f48022aB.mo27700a(), this.f47934z);
        contentValues.put(ukm.SHARING_USER.f48022aB.mo27700a(), this.f47919k);
        contentValues.put(ukm.LAST_MODIFYING_USER.f48022aB.mo27700a(), this.f47918j);
        contentValues.put(ukm.WRITERS_CAN_SHARE.f48022aB.mo27700a(), Boolean.valueOf(this.f47901ad));
        contentValues.put(ukm.UNSUBSCRIBED_ON_SERVER_TIME.f48022aB.mo27700a(), this.f47920l);
        contentValues.put(ukm.HAS_GENOA_VALUES.f48022aB.mo27700a(), Boolean.valueOf(this.f47877F));
        contentValues.put(ukm.VERSION.f48022aB.mo27700a(), Long.valueOf(this.f47882K));
        contentValues.put(ukm.IS_GOOGLE_PHOTOS.f48022aB.mo27700a(), Boolean.valueOf(this.f47895X));
        contentValues.put(ukm.IS_GOOGLE_PHOTOS_ROOT_FOLDER.f48022aB.mo27700a(), Boolean.valueOf(this.f47896Y));
        contentValues.put(ukm.PERMISSION_VERSION.f48022aB.mo27700a(), Long.valueOf(this.f47904ag));
    }

    /* renamed from: b */
    public final boolean mo27654b() {
        return this.f47932x != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo27656d() {
        return this.f47914f != null;
    }

    /* renamed from: e */
    public final boolean mo27657e() {
        return this.f47889R.equals("application/vnd.google-apps.folder");
    }

    /* renamed from: a */
    public final void mo27649a(String str) {
        sdo.m34959a((Object) str);
        this.f47889R = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo27655c() {
        this.f47914f = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void mo27650a(String str, String str2) {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (str2 != null) {
            z = false;
        } else {
            z = true;
        }
        if (isEmpty == z) {
            this.f47874C = str;
            this.f47934z = str2;
            return;
        }
        throw new IllegalArgumentException(String.format("An entry must have both uniqueIdentifier & singletonCreatorSdkAppId or none, provided values: %s & %s", str, str2));
    }

    public ukg(uno uno, Cursor cursor) {
        this(uno, ukm.ENTRY_ID.f48022aB.mo27705b(cursor).longValue(), true);
        bngx bngx;
        mo27649a(ukm.MIME_TYPE.f48022aB.mo27702a(cursor));
        this.f47887P = ukm.TITLE.f48022aB.mo27702a(cursor);
        this.f47883L = new Date(ukm.CREATION_DATE.f48022aB.mo27705b(cursor).longValue());
        this.f47921m = ukm.ALTERNATE_LINK.f48022aB.mo27702a(cursor);
        try {
            Collection a = uzf.m39821a(ukm.OWNER_NAMES.f48022aB.mo27702a(cursor));
            if (a != null) {
                bngx = bngx.m109368a(a);
            } else {
                bngx = null;
            }
            this.f47885N = bngx;
        } catch (JSONException e) {
            f47871ap.mo25374b("EntryRow", "Invalid JSON ownerNames string array for row:%d", Long.valueOf(this.f47902ae));
            this.f47885N = null;
        }
        this.f47884M = new Date(ukm.LAST_MODIFIED_DATE.f48022aB.mo27705b(cursor).longValue());
        Long b = ukm.LAST_VIEWED_BY_ME_DATE.f48022aB.mo27705b(cursor);
        Long b2 = ukm.SHARED_WITH_ME_DATE.f48022aB.mo27705b(cursor);
        Long b3 = ukm.MODIFIED_BY_ME_DATE.f48022aB.mo27705b(cursor);
        Long b4 = ukm.RECENCY.f48022aB.mo27705b(cursor);
        if (b != null) {
            this.f47910b = new Date(b.longValue());
        }
        if (b2 != null) {
            this.f47913e = new Date(b2.longValue());
        }
        if (b3 != null) {
            this.f47911c = new Date(b3.longValue());
        }
        if (b4 != null) {
            this.f47912d = new Date(b4.longValue());
        }
        this.f47933y = ukm.RECENCY_REASON.f48022aB.mo27702a(cursor);
        this.f47879H = ukm.STARRED.f48022aB.mo27713d(cursor).booleanValue();
        this.f47878G = ukm.SHARED.f48022aB.mo27713d(cursor).booleanValue();
        mo27652a(ung.m38978a(ukm.TRASHED.f48022aB.mo27705b(cursor).longValue()));
        long longValue = ukm.PINNED.f48022aB.mo27705b(cursor).longValue();
        uml[] values = uml.values();
        for (uml uml : values) {
            if (uml.f48221d == longValue) {
                mo27651a(uml);
                this.f47894W = ukm.IS_DOWNLOADABLE.f48022aB.mo27713d(cursor).booleanValue();
                this.f47891T = ukm.CAN_EDIT.f48022aB.mo27713d(cursor).booleanValue();
                this.f47907aj = ukm.SEQUENCE_NUMBER.f48022aB.mo27710c(cursor);
                this.f47908ak = ukm.LAST_SYNC_SEQUENCE_NUMBER.f48022aB.mo27710c(cursor);
                this.f47930v = ukm.MD5_CHECKSUM.f48022aB.mo27702a(cursor);
                this.f47906ai = ukm.LOCAL_CONTENT_HASH.f48022aB.mo27702a(cursor);
                this.f47929u = ukm.LOCAL_CONTENT_SIGNATURE.f48022aB.mo27702a(cursor);
                this.f47922n = ukm.DESCRIPTION.f48022aB.mo27702a(cursor);
                this.f47892U = ukm.IS_COPYABLE.f48022aB.mo27720f(cursor);
                this.f47923o = ukm.EMBED_LINK.f48022aB.mo27702a(cursor);
                this.f47924p = ukm.FILE_EXTENSION.f48022aB.mo27702a(cursor);
                this.f47903af = ukm.FILE_SIZE.f48022aB.mo27710c(cursor);
                this.f47915g = ukm.GENOA_FILE_SIZE.f48022aB.mo27705b(cursor);
                this.f47925q = ukm.FOLDER_COLOR_RGB.f48022aB.mo27702a(cursor);
                this.f47900ac = ukm.IS_VIEWED.f48022aB.mo27720f(cursor);
                this.f47899ab = ukm.IS_RESTRICTED.f48022aB.mo27720f(cursor);
                this.f47931w = ukm.ORIGINAL_FILENAME.f48022aB.mo27702a(cursor);
                this.f47905ah = ukm.QUOTA_BYTES_USED.f48022aB.mo27705b(cursor).longValue();
                this.f47872A = ukm.WEB_CONTENT_LINK.f48022aB.mo27702a(cursor);
                this.f47873B = ukm.WEB_VIEW_LINK.f48022aB.mo27702a(cursor);
                this.f47893V = ukm.HAS_THUMBNAIL.f48022aB.mo27720f(cursor);
                this.f47932x = ukm.APPDATA_OWNER_SDK_APP_ID.f48022aB.mo27702a(cursor);
                mo27653b(ukm.USER_ROLE.f48022aB.mo27702a(cursor));
                this.f47876E = ukm.IS_DELETED.f48022aB.mo27718e(cursor);
                this.f47916h = ukm.IS_DELETED_ACTION_ID.f48022aB.mo27705b(cursor);
                this.f47881J = ukm.CUSTOM_PROPERTIES_COUNT.f48022aB.mo27705b(cursor).intValue();
                this.f47926r = ukm.HEAD_REVISION_ID.f48022aB.mo27702a(cursor);
                this.f47927s = ukm.INSYNC_CONTENT_HASH.f48022aB.mo27702a(cursor);
                this.f47928t = ukm.INSYNC_REVISION_ID.f48022aB.mo27702a(cursor);
                this.f47917i = ukm.LAST_CONTENT_ACTION_ID.f48022aB.mo27705b(cursor);
                mo27650a(ukm.UNIQUE_IDENTIFIER.f48022aB.mo27702a(cursor), ukm.SINGLETON_CREATOR_SDK_APP_ID.f48022aB.mo27702a(cursor));
                this.f47875D = ukm.UNIQUE_IDENTIFIER_VERSION.f48022aB.mo27702a(cursor);
                this.f47919k = ukm.SHARING_USER.f48022aB.mo27705b(cursor);
                this.f47918j = ukm.LAST_MODIFYING_USER.f48022aB.mo27705b(cursor);
                this.f47901ad = ukm.WRITERS_CAN_SHARE.f48022aB.mo27718e(cursor);
                this.f47877F = ukm.HAS_GENOA_VALUES.f48022aB.mo27718e(cursor);
                this.f47882K = ukm.VERSION.f48022aB.mo27705b(cursor).longValue();
                this.f47895X = ukm.IS_GOOGLE_PHOTOS.f48022aB.mo27718e(cursor);
                this.f47896Y = ukm.IS_GOOGLE_PHOTOS_ROOT_FOLDER.f48022aB.mo27718e(cursor);
                this.f47897Z = ukm.IN_DRIVE_SPACE.f48022aB.mo27718e(cursor);
                this.f47898aa = ukm.IN_PHOTOS_SPACE.f48022aB.mo27718e(cursor);
                this.f47914f = ukm.DELETED_ON_SERVER_TIME.f48022aB.mo27705b(cursor);
                this.f47880I = ukm.SUBSCRIBED.f48022aB.mo27713d(cursor).booleanValue();
                this.f47920l = ukm.UNSUBSCRIBED_ON_SERVER_TIME.f48022aB.mo27705b(cursor);
                this.f47904ag = ukm.PERMISSION_VERSION.f48022aB.mo27705b(cursor).longValue();
                return;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unaccepted PinnedState sql value ");
        sb.append(longValue);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo27651a(uml uml) {
        sdo.m34959a(uml);
        this.f47886O = uml;
    }

    /* renamed from: a */
    public final void mo27652a(ung ung) {
        sdo.m34959a(ung);
        this.f47890S = ung;
    }

    /* renamed from: b */
    public final void mo27653b(String str) {
        if (str == null || str.equals("owner") || str.equals("reader") || str.equals("writer")) {
            this.f47888Q = str;
            return;
        }
        throw new IllegalArgumentException(str.length() == 0 ? new String("Unaccepted user role value ") : "Unaccepted user role value ".concat(str));
    }
}
