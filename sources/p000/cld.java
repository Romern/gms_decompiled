package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: cld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cld implements cdt {

    /* renamed from: a */
    private static final String[] f7002a = {"_data"};

    /* renamed from: b */
    private final Context f7003b;

    /* renamed from: c */
    private final cjq f7004c;

    /* renamed from: d */
    private final cjq f7005d;

    /* renamed from: e */
    private final Uri f7006e;

    /* renamed from: f */
    private final int f7007f;

    /* renamed from: g */
    private final int f7008g;

    /* renamed from: h */
    private final cdk f7009h;

    /* renamed from: i */
    private final Class f7010i;

    /* renamed from: j */
    private volatile boolean f7011j;

    /* renamed from: k */
    private volatile cdt f7012k;

    public cld(Context context, cjq cjq, cjq cjq2, Uri uri, int i, int i2, cdk cdk, Class cls) {
        this.f7003b = context.getApplicationContext();
        this.f7004c = cjq;
        this.f7005d = cjq2;
        this.f7006e = uri;
        this.f7007f = i;
        this.f7008g = i2;
        this.f7009h = cdk;
        this.f7010i = cls;
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return this.f7010i;
    }

    /* renamed from: b */
    public final void mo3753b() {
        cdt cdt = this.f7012k;
        if (cdt != null) {
            cdt.mo3753b();
        }
    }

    /* renamed from: c */
    public final void mo3754c() {
        this.f7011j = true;
        cdt cdt = this.f7012k;
        if (cdt != null) {
            cdt.mo3754c();
        }
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5 A[SYNTHETIC, Splitter:B:40:0x00f5] */
    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        cjp cjp;
        Uri uri;
        try {
            cdt cdt = null;
            Cursor cursor = null;
            if (!Environment.isExternalStorageLegacy()) {
                if (this.f7003b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(this.f7006e);
                } else {
                    uri = this.f7006e;
                }
                cjp = this.f7005d.mo3930a(uri, this.f7007f, this.f7008g, this.f7009h);
            } else {
                cjq cjq = this.f7004c;
                Uri uri2 = this.f7006e;
                try {
                    Cursor query = this.f7003b.getContentResolver().query(uri2, f7002a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    cjp = cjq.mo3930a(file, this.f7007f, this.f7008g, this.f7009h);
                                } else {
                                    String valueOf = String.valueOf(uri2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                                    sb.append("File path was empty in media store for: ");
                                    sb.append(valueOf);
                                    throw new FileNotFoundException(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    String valueOf2 = String.valueOf(uri2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb2.append("Failed to media store entry for: ");
                    sb2.append(valueOf2);
                    throw new FileNotFoundException(sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cjp != null) {
                cdt = cjp.f6950c;
            }
            if (cdt == null) {
                String valueOf3 = String.valueOf(this.f7006e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
                sb3.append("Failed to build fetcher for: ");
                sb3.append(valueOf3);
                cds.mo3761a((Exception) new IllegalArgumentException(sb3.toString()));
                return;
            }
            this.f7012k = cdt;
            if (!this.f7011j) {
                cdt.mo3751a(cbs, cds);
            } else {
                mo3754c();
            }
        } catch (FileNotFoundException e) {
            cds.mo3761a((Exception) e);
        }
    }
}
