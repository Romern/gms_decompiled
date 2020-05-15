package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zyq extends ContentProvider {

    /* renamed from: b */
    private static final Status f56215b = new Status(23500, zxo.m46639a(23500));

    /* renamed from: c */
    private static final Status f56216c = new Status(23510, zxo.m46639a(23510));

    /* renamed from: d */
    private static final Status f56217d = new Status(23511, zxo.m46639a(23511));

    /* renamed from: e */
    private static final Status f56218e = new Status(23516, zxo.m46639a(23516));

    /* renamed from: a */
    final zyf f56219a = new zyf();

    /* renamed from: f */
    private final AtomicLong f56220f = new AtomicLong(1);

    /* renamed from: g */
    private final bmzu f56221g;

    protected zyq() {
        if (!ceao.f182169a.mo6606a().mo78687a()) {
            bmzz a = bmzz.m108708a();
            a.mo66953a(100L);
            a.mo66954a(60, TimeUnit.SECONDS);
            this.f56221g = a.mo66962d();
            return;
        }
        bmzz a2 = bmzz.m108708a();
        a2.mo66953a(100L);
        a2.mo66954a(60, TimeUnit.SECONDS);
        a2.mo66957a(new zyp());
        this.f56221g = a2.mo66962d();
    }

    /* renamed from: a */
    private static void m46709a(MatrixCursor matrixCursor, int i) {
        matrixCursor.addRow(new Object[]{0, 0, null, 0, 0, Integer.valueOf(i)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo19208a();

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return "application/x-font-ttf";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        try {
            try {
                Long valueOf = Long.valueOf(Long.parseLong(uri.getPath().substring(1)));
                zyh.m46682b("FontsContentProvider", "Pulling font file for id = %d, cache size = %d", valueOf, Long.valueOf(this.f56221g.mo66949f()));
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f56221g.mo66947b(valueOf);
                if (parcelFileDescriptor != null) {
                    return parcelFileDescriptor.dup();
                }
                return null;
            } catch (Exception e) {
                zyh.m46681a("FontsContentProvider", e, "Error getting file from cache. Returning null", new Object[0]);
                return null;
            }
        } catch (Exception e2) {
            zyh.m46681a("FontsContentProvider", e2, "Error converting path of URI [%s] to long. Returning null", uri.toString());
            return null;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        sdo.m34959a(strArr2);
        sdo.m34974b(strArr2.length > 0);
        String str4 = strArr2[0];
        zyh.m46682b("FontsContentProvider", "Received query %s, URI %s", str4, uri.toString());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"});
        try {
            FontMatchSpec fontMatchSpec = (FontMatchSpec) zyi.m46687a(str4).get(0);
            zyh.m46682b("FontsContentProvider", "Query [%s] resolved to %s", strArr2[0], fontMatchSpec);
            zyn a = zzi.f56267a.mo31622a();
            if (a == null) {
                zyh.m46680a("FontsContentProvider", "No FontServer as SharedState init failed or not complete", new Object[0]);
                m46709a(matrixCursor, 2);
                this.f56219a.mo31586a(f56218e);
                return matrixCursor;
            }
            int i = Build.VERSION.SDK_INT;
            try {
                str3 = getCallingPackage();
            } catch (SecurityException e) {
                zyh.m46681a("FontsContentProvider", e, "Unable to get calling package", new Object[0]);
                str3 = "com.google.android.gms.fonts.nocaller.security";
            }
            if (str3 == null) {
                str3 = "com.google.android.gms.fonts.nocaller.null";
            }
            try {
                FontFetchResult fontFetchResult = (FontFetchResult) a.mo31600a(fontMatchSpec, str3).get(mo19208a(), TimeUnit.MILLISECONDS);
                zyh.m46682b("FontsContentProvider", "Fetch %s end status %s", fontMatchSpec, fontFetchResult.f32459b);
                if (fontFetchResult.f32459b.mo17710c()) {
                    Long valueOf = Long.valueOf(this.f56220f.getAndIncrement());
                    zyh.m46683c("FontsContentProvider", "Saving PFD to cache with id = %d, cache size = %d", valueOf, Long.valueOf(this.f56221g.mo66949f()));
                    this.f56221g.mo66946a(valueOf, fontFetchResult.f32461d);
                    matrixCursor.addRow(new Object[]{valueOf, 0, null, Integer.valueOf(fontFetchResult.f32462e.f32466d), Float.valueOf(fontFetchResult.f32462e.f32467e), 0});
                    this.f56219a.mo31586a(Status.f30107a);
                } else {
                    if (!fontFetchResult.f32459b.equals(zyn.f56202c)) {
                        m46709a(matrixCursor, 1);
                    } else {
                        m46709a(matrixCursor, 2);
                    }
                    this.f56219a.mo31586a(f56216c);
                }
            } catch (TimeoutException e2) {
                zyh.m46681a("FontsContentProvider", e2, "Fetch %s failed due to timeout", fontMatchSpec);
                m46709a(matrixCursor, 2);
                this.f56219a.mo31586a(Status.f30110d);
            } catch (InterruptedException | ExecutionException e3) {
                zyh.m46681a("FontsContentProvider", e3, "Fetch %s failed", fontMatchSpec);
                m46709a(matrixCursor, 1);
                this.f56219a.mo31586a(f56217d);
            }
            return matrixCursor;
        } catch (Exception e4) {
            zyh.m46680a("FontsContentProvider", "%s is not a valid query", str4);
            m46709a(matrixCursor, 3);
            this.f56219a.mo31586a(f56215b);
            return matrixCursor;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return openFile(uri, str);
    }
}
