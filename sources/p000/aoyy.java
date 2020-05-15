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

/* renamed from: aoyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoyy implements Callable {

    /* renamed from: a */
    final /* synthetic */ aoza f83870a;

    /* renamed from: b */
    private final btfh f83871b;

    /* renamed from: c */
    private final aoyz f83872c;

    public aoyy(aoza aoza, btfi btfi, aoyz aoyz) {
        this.f83870a = aoza;
        bxvd bxvd = (bxvd) btfi.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) btfi);
        this.f83871b = (btfh) bxvd;
        this.f83872c = aoyz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return (p000.btfi) r14.f83871b.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0139, code lost:
        if (r2 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013c, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014a, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0156, code lost:
        if (r14.f83870a.mo47030b((long) r3.length) != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015c, code lost:
        if (p000.cgjy.m145760g() == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015e, code lost:
        r14.f83870a.f83919g.mo46982b("Dropping contact thumbnail due to size for contact %d", r14.f83872c.f83874b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0170, code lost:
        r14.f83870a.f83919g.mo46984c("ReadContactsHelper", "Dropping contact thumbnail due to size for contact %d", r14.f83872c.f83874b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018e, code lost:
        r0 = r14.f83871b;
        r1 = p000.bxtx.m123261a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0196, code lost:
        if (r0.f164950c != false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0199, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019e, code lost:
        r2 = p000.btfi.f148652E;
        r1.getClass();
        ((p000.btfi) r0.f164949b).f148673p = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3 A[SYNTHETIC, Splitter:B:57:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ad  */
    public final /* bridge */ /* synthetic */ Object call() {
        long j;
        long n;
        byte[] bArr;
        AssetFileDescriptor assetFileDescriptor;
        if (!Thread.interrupted()) {
            aoza aoza = this.f83870a;
            synchronized (aoza) {
                j = aoza.f83918f;
                n = cgjy.m145767n();
            }
            if (j <= n) {
                if (this.f83872c.mo47024a()) {
                    if (cgjy.m145755b()) {
                        if (aoza.f83896c.contains(this.f83872c.f83876d)) {
                            return (btfi) this.f83871b.mo74062i();
                        }
                    } else if (ayts.m84809a(this.f83872c.f83876d)) {
                        return (btfi) this.f83871b.mo74062i();
                    }
                }
                Cursor cursor = null;
                AssetFileDescriptor assetFileDescriptor2 = null;
                cursor = null;
                if (cgjy.f187097a.mo6606a().mo83941e()) {
                    btfh btfh = this.f83871b;
                    aoza aoza2 = this.f83870a;
                    long longValue = this.f83872c.f83874b.longValue();
                    try {
                        assetFileDescriptor = aoza2.f83917e.getContentResolver().openAssetFileDescriptor(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, longValue), "display_photo"), "r");
                        if (assetFileDescriptor != null) {
                            try {
                                if (!aoza2.mo47030b(assetFileDescriptor.getLength())) {
                                    aoza2.f83919g.mo46982b("Dropping high res contact photo due to size for contact %d", Long.valueOf(longValue));
                                    bArr = aoza.f83897d;
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
                            ByteString a = ByteString.m123261a(bArr);
                            if (btfh.f164950c) {
                                btfh.mo74035c();
                                btfh.f164950c = false;
                            }
                            btfi btfi = btfi.f148652E;
                            a.getClass();
                            ((btfi) btfh.f164949b).f148674q = a;
                        } else {
                            bArr = aoza.f83897d;
                            ByteString a2 = ByteString.m123261a(bArr);
                            if (btfh.f164950c) {
                            }
                            btfi btfi2 = btfi.f148652E;
                            a2.getClass();
                            ((btfi) btfh.f164949b).f148674q = a2;
                        }
                    } catch (IOException e4) {
                        assetFileDescriptor = null;
                        try {
                            bArr = aoza.f83897d;
                            if (assetFileDescriptor != null) {
                                assetFileDescriptor.close();
                            }
                            ByteString a22 = ByteString.m123261a(bArr);
                            if (btfh.f164950c) {
                            }
                            btfi btfi22 = btfi.f148652E;
                            a22.getClass();
                            ((btfi) btfh.f164949b).f148674q = a22;
                            if (((btfi) this.f83871b.f164949b).f148674q.mo73744a() == 0) {
                            }
                            return (btfi) this.f83871b.mo74062i();
                        } catch (Throwable th2) {
                            th = th2;
                            assetFileDescriptor2 = assetFileDescriptor;
                            if (assetFileDescriptor2 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (assetFileDescriptor2 != null) {
                            try {
                                assetFileDescriptor2.close();
                            } catch (IOException e5) {
                            }
                        }
                        throw th;
                    }
                }
                if (((btfi) this.f83871b.f164949b).f148674q.mo73744a() == 0) {
                    aoza aoza3 = this.f83870a;
                    long longValue2 = this.f83872c.f83874b.longValue();
                    ContentResolver contentResolver = aoza3.f83917e.getContentResolver();
                    Uri withAppendedPath = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, longValue2), "photo");
                    byte[] bArr2 = aoza.f83897d;
                    try {
                        cursor = contentResolver.query(withAppendedPath, new String[]{"data15"}, null, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    bArr2 = cursor.getBlob(aoza.f83894a.intValue());
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                try {
                                    aoza3.f83919g.mo46980a(e, "ContentResolver.query threw an exception while fetching photo info.");
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        aoza3.f83919g.mo46980a(e, "ContentResolver.query threw an exception while fetching photo info.");
                    } catch (Throwable th5) {
                        th = th5;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                return (btfi) this.f83871b.mo74062i();
            }
            if (cgjy.m145760g()) {
                this.f83870a.f83919g.mo46982b("Dropping contact thumbnail due to size for contact %d", this.f83872c.f83874b);
            } else {
                this.f83870a.f83919g.mo46984c("ReadContactsHelper", "Dropping contact thumbnail due to size for contact %d", this.f83872c.f83874b);
            }
            return (btfi) this.f83871b.mo74062i();
        }
        throw new InterruptedException();
    }
}
