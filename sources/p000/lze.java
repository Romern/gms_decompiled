package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: lze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lze implements Callable {

    /* renamed from: a */
    final /* synthetic */ lzg f33235a;

    /* renamed from: b */
    private final lzf f33236b;

    /* renamed from: c */
    private bstc f33237c;

    public lze(lzg lzg, bstc bstc, lzf lzf) {
        this.f33235a = lzg;
        this.f33237c = bstc;
        this.f33236b = lzf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013c, code lost:
        if (r3 != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013f, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014f, code lost:
        if (r3 != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015b, code lost:
        if (r14.f33235a.mo19778a((long) r1.length) != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015d, code lost:
        p000.lzg.f33247a.mo25416d("Dropping contact thumbnail due to size for contact %d", java.lang.Long.valueOf(r14.f33236b.f33239b));
        r0 = (p000.bstc) r2.mo74062i();
        r14.f33237c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0179, code lost:
        r0 = p000.bxtx.m123261a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017f, code lost:
        if (r2.f164950c != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0182, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        r3 = p000.bstc.f146969u;
        r0.getClass();
        ((p000.bstc) r2.f164949b).f146982l = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df A[SYNTHETIC, Splitter:B:53:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0128 A[SYNTHETIC, Splitter:B:65:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0196  */
    public final /* bridge */ /* synthetic */ Object call() {
        long j;
        long h;
        byte[] bArr;
        AssetFileDescriptor assetFileDescriptor;
        if (!Thread.interrupted()) {
            lzg lzg = this.f33235a;
            synchronized (lzg) {
                j = lzg.f33272h;
                h = cckw.m130270h();
            }
            if (j > h) {
                lzg.f33247a.mo25416d("Dropping contact thumbnail due to size for contact %d", Long.valueOf(this.f33236b.f33239b));
                return this.f33237c;
            } else if (this.f33236b.mo19774a() && lzg.f33250e.contains(this.f33236b.f33241d)) {
                return this.f33237c;
            } else {
                bstc bstc = this.f33237c;
                bxvd bxvd = (bxvd) bstc.mo74142c(5);
                bxvd.mo73625a((bxvk) bstc);
                Cursor cursor = null;
                AssetFileDescriptor assetFileDescriptor2 = null;
                cursor = null;
                if (cckw.f179263a.mo6606a().mo76219I()) {
                    lzg lzg2 = this.f33235a;
                    long j2 = this.f33236b.f33239b;
                    try {
                        assetFileDescriptor = lzg2.f33271g.getContentResolver().openAssetFileDescriptor(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j2), "display_photo"), "r");
                        if (assetFileDescriptor != null) {
                            try {
                                if (!lzg2.mo19778a(assetFileDescriptor.getLength())) {
                                    lzg.f33247a.mo25416d("Dropping high res contact photo due to size for contact %d", Long.valueOf(j2));
                                    bArr = lzg.f33251f;
                                    try {
                                        assetFileDescriptor.close();
                                    } catch (IOException e) {
                                    }
                                } else {
                                    bArr = srz.m36175a((InputStream) assetFileDescriptor.createInputStream());
                                    try {
                                        assetFileDescriptor.close();
                                    } catch (IOException e2) {
                                    }
                                }
                            } catch (IOException e3) {
                            } catch (Throwable th) {
                                th = th;
                                assetFileDescriptor2 = assetFileDescriptor;
                                if (assetFileDescriptor2 != null) {
                                }
                                throw th;
                            }
                            bxtx a = bxtx.m123261a(bArr);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bstc bstc2 = bstc.f146969u;
                            a.getClass();
                            ((bstc) bxvd.f164949b).f146983m = a;
                        } else {
                            bArr = lzg.f33251f;
                            bxtx a2 = bxtx.m123261a(bArr);
                            if (bxvd.f164950c) {
                            }
                            bstc bstc22 = bstc.f146969u;
                            a2.getClass();
                            ((bstc) bxvd.f164949b).f146983m = a2;
                        }
                    } catch (IOException e4) {
                        assetFileDescriptor = null;
                        try {
                            bArr = lzg.f33251f;
                            if (assetFileDescriptor != null) {
                                assetFileDescriptor.close();
                            }
                            bxtx a22 = bxtx.m123261a(bArr);
                            if (bxvd.f164950c) {
                            }
                            bstc bstc222 = bstc.f146969u;
                            a22.getClass();
                            ((bstc) bxvd.f164949b).f146983m = a22;
                            lzg lzg3 = this.f33235a;
                            long j3 = this.f33236b.f33239b;
                            ContentResolver contentResolver = lzg3.f33271g.getContentResolver();
                            Uri withAppendedPath = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j3), "photo");
                            byte[] bArr2 = lzg.f33251f;
                            try {
                                cursor = contentResolver.query(withAppendedPath, new String[]{"data15"}, null, null, null);
                                if (cursor != null) {
                                }
                            } catch (SQLiteException e5) {
                                e = e5;
                                try {
                                    lzg.f33247a.mo25417e("ContentResolver.query threw an exception while fetching photo info.", e, new Object[0]);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            assetFileDescriptor2 = assetFileDescriptor;
                            if (assetFileDescriptor2 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (assetFileDescriptor2 != null) {
                            try {
                                assetFileDescriptor2.close();
                            } catch (IOException e6) {
                            }
                        }
                        throw th;
                    }
                }
                if (cckw.f179263a.mo6606a().mo76220J() && ((bstc) bxvd.f164949b).f146983m.mo73744a() == 0) {
                    lzg lzg32 = this.f33235a;
                    long j32 = this.f33236b.f33239b;
                    ContentResolver contentResolver2 = lzg32.f33271g.getContentResolver();
                    Uri withAppendedPath2 = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j32), "photo");
                    byte[] bArr22 = lzg.f33251f;
                    cursor = contentResolver2.query(withAppendedPath2, new String[]{"data15"}, null, null, null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                bArr22 = cursor.getBlob(lzg.f33248b.intValue());
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            lzg.f33247a.mo25417e("ContentResolver.query threw an exception while fetching photo info.", e, new Object[0]);
                        }
                    }
                }
                bstc bstc3 = (bstc) bxvd.mo74062i();
                this.f33237c = bstc3;
                return bstc3;
            }
        } else {
            throw new InterruptedException();
        }
    }
}
