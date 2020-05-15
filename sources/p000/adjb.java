package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: adjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjb implements adje {

    /* renamed from: a */
    private final Context f61867a;

    /* renamed from: b */
    private final adjg f61868b;

    public adjb(Context context, adjg adjg) {
        this.f61867a = context;
        this.f61868b = adjg;
    }

    /* renamed from: a */
    public final int mo33557a() {
        return this.f61868b.mo33557a();
    }

    /* renamed from: b */
    public final int mo33564b(camh camh) {
        return this.f61868b.mo33564b(camh);
    }

    /* renamed from: c */
    public final int mo33567c() {
        return this.f61868b.mo33567c();
    }

    /* renamed from: d */
    public final long mo33568d() {
        return this.f61868b.mo33568d();
    }

    /* renamed from: a */
    public final int mo33558a(camh camh) {
        return this.f61868b.mo33558a(camh);
    }

    /* renamed from: b */
    public final synchronized void mo33565b() {
        this.f61868b.mo33565b();
    }

    /* renamed from: a */
    public final adip mo33559a(String str) {
        return this.f61868b.mo33559a(str);
    }

    /* renamed from: b */
    public final byte[] mo33566b(String str) {
        return this.f61868b.mo33566b(str);
    }

    /* renamed from: a */
    public final adjh mo33560a(String str, boolean z) {
        Uri parse = Uri.parse(str);
        Cursor query = this.f61867a.getContentResolver().query(adky.f62096a.buildUpon().appendPath("resolveUrl").appendQueryParameter("uri", parse.toString()).build(), new String[]{"splitId"}, null, null, null);
        btiq btiq = null;
        if (query != null && query.moveToFirst()) {
            try {
                btiq = (btiq) GeneratedMessageLite.m124016a(btiq.f149014e, query.getBlob(0), bxus.m123743b());
            } catch (bxwf e) {
                throw new RuntimeException(e);
            }
        }
        if (btiq != null) {
            return new adjh(0, btiq.f149016a, btiq.f149018c, btiq.f149019d, btiq.f149017b, true);
        }
        return this.f61868b.mo33560a(str, z);
    }

    /* renamed from: a */
    public final void mo33561a(adjl adjl) {
        this.f61868b.mo33561a(adjl);
    }

    /* renamed from: a */
    public final void mo33562a(PrintWriter printWriter) {
        this.f61868b.mo33562a(printWriter);
    }

    /* renamed from: a */
    public final void mo33563a(Collection collection, Collection collection2) {
        this.f61868b.mo33563a(collection, collection2);
    }
}
