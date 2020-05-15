package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: aloj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aloj extends alne {

    /* renamed from: c */
    private final String f73951c;

    /* renamed from: d */
    private final String f73952d;

    /* renamed from: e */
    private final Uri f73953e;

    /* renamed from: f */
    private final boolean f73954f;

    /* JADX WARNING: Removed duplicated region for block: B:131:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0147  */
    /* renamed from: a */
    public final Pair mo40607a(Context context, almq almq, amph amph) {
        bteu bteu;
        String str;
        Uri uri;
        OutputStream openOutputStream;
        FileInputStream fileInputStream;
        File parentFile;
        Bundle bundle = new Bundle();
        Uri uri2 = this.f73953e;
        almh almh = this.f73821b;
        byte[] a = almq.m61305a(context, uri2);
        bxvd da = btea.f148482d.mo74144da();
        bxvd da2 = btcb.f148246c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        "gms-core-menagerie".getClass();
        ((btcb) da2.f164949b).f148248a = "gms-core-menagerie";
        String f = spn.m35885f(rpr.m34216b());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        f.getClass();
        ((btcb) da2.f164949b).f148249b = f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btcb btcb = (btcb) da2.mo74062i();
        btcb.getClass();
        ((btea) da.f164949b).f148484a = btcb;
        btea btea = (btea) da.mo74062i();
        bxvd da3 = btet.f148559h.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((btet) da3.f164949b).f148561a = btee.m116473a(4);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((btet) da3.f164949b).f148567g = btes.m116488a(3);
        bxtx a2 = a == null ? bxtx.f164797b : bxtx.m123261a(a);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btet btet = (btet) da3.f164949b;
        a2.getClass();
        btet.f148563c = a2;
        btea.getClass();
        btet.f148564d = btea;
        bxvd da4 = bldz.f126159b.mo74144da();
        bldy bldy = bldy.PUBLIC_READ;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bldz bldz = (bldz) da4.f164949b;
        bldy.getClass();
        if (!bldz.f126161a.mo73666a()) {
            bldz.f126161a = bxvk.m124019a(bldz.f126161a);
        }
        bldz.f126161a.mo74153d(bldy.f126158g);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bldz bldz2 = (bldz) da4.mo74062i();
        bldz2.getClass();
        ((btet) da3.f164949b).f148565e = bldz2;
        btet btet2 = (btet) da3.mo74062i();
        try {
            if (cgas.f186249a.mo6606a().mo83195a()) {
                if (almh != null) {
                    bmza b = bmza.m108659b(bmvy.f131119a);
                    bteu = almq.f73785c.mo41251a(amph.f75659a, btet2);
                    almh.mo40509a(almk.m61269b(5, b.mo66928a(TimeUnit.MICROSECONDS)));
                    b.mo66931e();
                    str = bteu.f148571b;
                    if (str != null) {
                        return new Pair(amqv.f75779e, bundle);
                    }
                    altq a3 = altq.m61806a(context);
                    String str2 = this.f73951c;
                    String str3 = this.f73952d;
                    sdo.m34977c(str2);
                    sdo.m34977c(str);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("avatar", ancc.m63969a(str));
                    long a4 = ancm.m64005a(a3.f74246b).mo20505a();
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("xtag:");
                    sb.append(a4);
                    contentValues.put("etag", sb.toString());
                    alto c = a3.mo40768c();
                    c.mo40746a();
                    try {
                        boolean z = true;
                        if (c.mo40740a("owners", contentValues, "_id=?", new String[]{a3.f74250f.mo40739b(str2, str3)}) == 1) {
                            almx.m61368a(a3.f74246b).mo40598a(str2, str3, 1);
                            c.mo40750b();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return new Pair(amqv.f75779e, bundle);
                        }
                        bundle.putString("avatarurl", str);
                        if (ssa.m36190a(this.f73953e)) {
                            anbt.m63940a(context).mo41670a(this.f73951c, this.f73952d, ancc.m63969a(str), almq.m61305a(context, this.f73953e));
                        }
                        if (ssa.m36190a(this.f73953e) && this.f73954f) {
                            Uri uri3 = this.f73953e;
                            if (ssa.m36190a(uri3)) {
                                File file = new File(uri3.getPath());
                                long currentTimeMillis = System.currentTimeMillis();
                                String format = ssa.f45067a.format(new Date(currentTimeMillis));
                                ContentResolver contentResolver = context.getContentResolver();
                                ContentValues contentValues2 = new ContentValues(5);
                                int a5 = ssa.m36181a(file.getAbsolutePath());
                                contentValues2.put("title", format);
                                contentValues2.put("_display_name", String.valueOf(format).concat(".jpg"));
                                contentValues2.put("datetaken", Long.valueOf(currentTimeMillis));
                                contentValues2.put("mime_type", "image/jpeg");
                                contentValues2.put("orientation", Integer.valueOf(a5));
                                try {
                                    uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
                                } catch (Exception e) {
                                    try {
                                        uri = contentResolver.insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues2);
                                    } catch (Exception e2) {
                                        try {
                                            uri = contentResolver.insert(ssg.f45078a, contentValues2);
                                        } catch (Exception e3) {
                                            Log.e("ImageUtils", "Failed to save image", e3);
                                        }
                                    }
                                }
                                String a6 = ssg.m36210a(contentResolver, uri);
                                if (a6 != null && (parentFile = new File(a6).getParentFile()) != null && !parentFile.exists() && !parentFile.mkdirs()) {
                                    Log.e("ImageUtils", "Failed to create media directory.");
                                }
                                try {
                                    openOutputStream = contentResolver.openOutputStream(uri);
                                    fileInputStream = new FileInputStream(file);
                                    byte[] bArr = new byte[10240];
                                    while (true) {
                                        int read = fileInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        openOutputStream.write(bArr, 0, read);
                                    }
                                    openOutputStream.close();
                                    fileInputStream.close();
                                    if (ssg.m36212b(uri)) {
                                        Bitmap a7 = ssg.m36209a(context, uri);
                                        if (a7 != null) {
                                            a7.recycle();
                                        }
                                    }
                                } catch (FileNotFoundException e4) {
                                    Log.e("ImageUtils", "File not found", e4);
                                    file.delete();
                                    uri = null;
                                } catch (Exception e5) {
                                    try {
                                        Log.e("ImageUtils", "Failed to insert image", e5);
                                        if (uri != null) {
                                            contentResolver.delete(uri, null, null);
                                            uri = null;
                                        }
                                    } catch (Throwable th) {
                                        file.delete();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    openOutputStream.close();
                                    fileInputStream.close();
                                    throw th2;
                                }
                                file.delete();
                                if (uri != null) {
                                    uri.toString();
                                }
                            } else {
                                String valueOf = String.valueOf(uri3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 16);
                                sb2.append("Not a file uri: ");
                                sb2.append(valueOf);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                        if (this.f73952d == null) {
                            amea.m62724a(context).mo41152e(this.f73951c, "SetAvatar");
                        }
                        return new Pair(amqv.f75777c, bundle);
                    } finally {
                        c.mo40753d();
                    }
                }
            }
            bteu = almq.f73785c.mo41251a(amph.f75659a, btet2);
            str = bteu.f148571b;
            if (str != null) {
            }
        } catch (chuw | gid e6) {
            Log.e("DataBroker", "updatePersonPhotoUrl() failed.", e6);
            throw e6;
        }
    }

    public aloj(String str, int i, String str2, alzm alzm, String str3, String str4, Uri uri, boolean z) {
        super(alzm, str, i, str2, str3, str4, "SetAvatar", 5389);
        this.f73951c = str3;
        this.f73952d = str4;
        this.f73953e = uri;
        this.f73954f = z;
    }
}
