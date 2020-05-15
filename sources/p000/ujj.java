package p000;

import com.google.android.gms.drive.auth.AppIdentity;
import org.json.JSONException;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ujj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ujj extends Enum implements vpj {

    /* renamed from: a */
    public static final ujj f47773a;

    /* renamed from: b */
    public static final ujj f47774b;

    /* renamed from: c */
    public static final ujj f47775c;

    /* renamed from: d */
    public static final ujj f47776d;

    /* renamed from: e */
    public static final ujj f47777e;

    /* renamed from: f */
    public static final ujj f47778f;

    /* renamed from: g */
    public static final ujj f47779g;

    /* renamed from: h */
    public static final ujj f47780h;

    /* renamed from: i */
    public static final ujj f47781i;

    /* renamed from: j */
    public static final ujj f47782j;

    /* renamed from: k */
    public static final ujj f47783k;

    /* renamed from: l */
    public static final ujj f47784l;

    /* renamed from: m */
    public static final ujj f47785m;

    /* renamed from: n */
    public static final ujj f47786n;

    /* renamed from: p */
    private static final /* synthetic */ ujj[] f47787p;

    /* renamed from: o */
    private final unp f47788o;

    static {
        uoa b = uoa.m39042b();
        b.mo27747a(1, new unu("contentETag", 2));
        b.mo27748b(25);
        f47773a = new ujj("CONTENT_ETAG", 0, b);
        uoa b2 = uoa.m39042b();
        unu unu = new unu("contentType", 2);
        unu.mo27741b();
        b2.mo27747a(1, unu);
        b2.mo27748b(25);
        f47774b = new ujj("CONTENT_TYPE", 1, b2);
        uoa b3 = uoa.m39042b();
        b3.mo27747a(1, new unu("encryptionKey", 3));
        b3.mo27748b(25);
        f47775c = new ujj("ENCRYPTION_KEY", 2, b3);
        uoa b4 = uoa.m39042b();
        b4.mo27747a(1, new unu("encryptionAlgorithm", 2));
        b4.mo27748b(25);
        f47776d = new ujj("ENCRYPTION_ALGORITHM", 3, b4);
        uoa b5 = uoa.m39042b();
        b5.mo27747a(1, new unu("filePath", 2));
        b5.mo27748b(25);
        f47777e = new ujj("OWNED_FILE_PATH", 4, b5);
        uoa b6 = uoa.m39042b();
        b6.mo27747a(1, new unu("notOwnedFilePath", 2));
        b6.mo27748b(25);
        f47778f = new ujj("NOT_OWNED_FILE_PATH", 5, b6);
        uoa b7 = uoa.m39042b();
        b7.mo27747a(1, new unu("lastOpenedTime", 1));
        b7.mo27748b(25);
        f47779g = new ujj("LAST_OPENED_TIME", 6, b7);
        uoa b8 = uoa.m39042b();
        b8.mo27747a(1, new unu("lastModifiedTime", 1));
        b8.mo27748b(25);
        f47780h = new ujj("LAST_MODIFIED_TIME", 7, b8);
        uoa b9 = uoa.m39042b();
        b9.mo27747a(1, new unu("serverSideLastModifiedTime", 1));
        b9.mo27748b(25);
        f47781i = new ujj("SERVER_SIDE_LAST_MODIFIED_TIME", 8, b9);
        uoa b10 = uoa.m39042b();
        b10.mo27747a(1, new unu("md5Checksum", 2));
        b10.mo27748b(25);
        f47782j = new ujj("MD5_CHECKSUM", 9, b10);
        uoa b11 = uoa.m39042b();
        b11.mo27747a(1, new unu("isTemporary", 1));
        b11.mo27748b(25);
        f47783k = new ujj("IS_TEMPORARY", 10, b11);
        uoa b12 = uoa.m39042b();
        unu unu2 = new unu("referencedContentId", 1);
        unu2.mo27739a(ujk.f47789a.f48341a, unv.SET_NULL);
        unu2.mo27737a();
        b12.mo27747a(1, unu2);
        b12.mo27748b(25);
        f47784l = new ujj("REFERENCED_CONTENT_ID", 11, b12);
        uoa b13 = uoa.m39042b();
        unu unu3 = new unu("isDirty", 1);
        unu3.mo27738a((Object) 0);
        unu3.mo27741b();
        b13.mo27747a(1, unu3);
        b13.mo27748b(25);
        f47785m = new ujj("IS_DIRTY", 12, b13);
        uoa b14 = uoa.m39042b();
        unu unu4 = new unu("creatorIdentity", 2);
        try {
            unu4.mo27738a(AppIdentity.f30763a.mo18134a().toString());
            unu4.mo27741b();
            b14.mo27747a(1, unu4);
            b14.mo27748b(25);
            ujj ujj = new ujj("CREATOR_IDENTITY", 13, b14);
            f47786n = ujj;
            f47787p = new ujj[]{f47773a, f47774b, f47775c, f47776d, f47777e, f47778f, f47779g, f47780h, f47781i, f47782j, f47783k, f47784l, f47785m, ujj};
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private ujj(String str, int i, uoa uoa) {
        this.f47788o = uoa.mo27745a(173, ujk.f47789a);
    }

    public static ujj[] values() {
        return (ujj[]) f47787p.clone();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47788o;
    }
}
