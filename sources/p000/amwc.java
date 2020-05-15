package p000;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: amwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwc extends amvx {

    /* renamed from: b */
    public static final String[] f76160b = {"sourceid", "_id", "data14", "data15", "data_version", "data_sync4", "data_sync2", "data_sync1"};

    /* renamed from: c */
    private final anaz f76161c;

    /* renamed from: d */
    private final amvm f76162d;

    /* renamed from: e */
    private final amys f76163e;

    /* renamed from: f */
    private final bmxv f76164f;

    /* renamed from: g */
    private final amwr f76165g;

    public amwc(Cursor cursor, amwr amwr, anaz anaz, amvm amvm, amys amys, bmxv bmxv) {
        super(cursor);
        this.f76165g = amwr;
        this.f76161c = anaz;
        this.f76162d = amvm;
        this.f76163e = amys;
        this.f76164f = bmxv;
    }

    /* renamed from: a */
    private static final ContentProviderOperation.Builder m63512a(long j, Long l, String str) {
        ContentProviderOperation.Builder a = amvz.m63510a(j, l.longValue());
        long longValue = l.longValue() + 1;
        return a.withValue("data_version", Long.valueOf(longValue)).withValue("data_sync4", Long.valueOf(anau.m63867a(longValue))).withValue("data_sync2", str).withValue("data_sync3", str);
    }

    /* renamed from: a */
    private static boolean m63515a(byte[] bArr) {
        return bArr == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0252, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0254, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        p000.amyg.m63718a(false, p000.amjf.PHOTO, p000.ammz.UPDATE, r0, r1.f76161c, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0268, code lost:
        throw new p000.amwb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0332, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0348, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x034b, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x034d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        android.util.Log.e(r8, "deletePersonPhoto() failed.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0353, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0362, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0368, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0369, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x036b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0370, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r2 = p000.amyg.m63718a(false, p000.amjf.PHOTO, p000.ammz.REMOVE, r0, r1.f76161c, 1);
        r4 = p000.ammz.REMOVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0381, code lost:
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0384, code lost:
        if (r2 == r4) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x038e, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0392, code lost:
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0395, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0254 A[ExcHandler: amxy (e amxy), Splitter:B:57:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x036d A[ExcHandler: amxy (e amxy), Splitter:B:122:0x029a] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x039d A[SYNTHETIC, Splitter:B:186:0x039d] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0386 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03a0 A[SYNTHETIC] */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo41464b() {
        String str;
        String str2;
        Throwable th;
        AssetFileDescriptor assetFileDescriptor;
        byte[] bArr;
        String str3;
        String str4 = "data_sync1";
        while (mo41469d()) {
            this.f76162d.mo41389a();
            String a = mo41465a("sourceid");
            long longValue = mo41466b("_id").longValue();
            Long b = mo41466b("data14");
            String a2 = mo41465a("data_sync2");
            Long b2 = mo41466b("data_version");
            Long b3 = mo41466b("data_sync4");
            try {
                amys amys = this.f76163e;
                if (b != null) {
                    str2 = ContentUris.appendId(ContactsContract.DisplayPhoto.CONTENT_URI.buildUpon(), b.longValue()).toString();
                } else {
                    str2 = ContentUris.appendId(ContactsContract.Data.CONTENT_URI.buildUpon(), longValue).toString();
                }
                try {
                    assetFileDescriptor = amys.f76409a.openAssetFileDescriptor(Uri.parse(str2), "r");
                    if (assetFileDescriptor != null) {
                        try {
                            FileInputStream createInputStream = assetFileDescriptor.createInputStream();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int read = createInputStream.read(bArr2);
                                FileInputStream fileInputStream = createInputStream;
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                                createInputStream = fileInputStream;
                            }
                            byteArrayOutputStream.flush();
                            byteArrayOutputStream.size();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            assetFileDescriptor.close();
                            bArr = byteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str4;
                            if (assetFileDescriptor == null) {
                            }
                            throw th;
                        }
                    } else {
                        bArr = null;
                    }
                    amig.m62939a();
                    if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83016bq()).booleanValue() && b3 != null && !m63515a(bArr) && b == null) {
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                        amig.m62939a();
                        int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82940aD()).intValue();
                        if (decodeByteArray != null && decodeByteArray.getWidth() == intValue && decodeByteArray.getHeight() == intValue) {
                            amdk.m62658a("FSA2_SyncUpPhotoCursor", "Skipped the low res photo uploading for contact %s", a);
                        }
                    }
                    amdk.m62656a("FSA2_SyncUpPhotoCursor", "Start to upload photo for contact %s", a);
                    if (!m63515a(bArr)) {
                        try {
                            m63514a(ammz.UPDATE, 1);
                            byte[] c = mo41468c("data15");
                            String a3 = mo41465a(str4);
                            long a4 = amyw.m63743a(c);
                            String b4 = amwx.m63592b(a3);
                            String str5 = "FSA2_PhotoSyncGrpc";
                            if (!TextUtils.isEmpty(b4)) {
                                try {
                                    if (a4 == Long.parseLong(b4)) {
                                        Log.e("FSA2_SyncUpPhotoCursor", "Photo content is not changed, skip syncing it and clear dirty.");
                                        m63514a(ammz.UPDATE, 3);
                                        m63513a();
                                        return m63512a(longValue, b2, a2);
                                    }
                                } catch (NumberFormatException e) {
                                }
                            }
                            String a5 = amwx.m63589a(a3, Long.toString(a4));
                            if (bArr != null) {
                                int length = bArr.length;
                                StringBuilder sb = new StringBuilder(19);
                                sb.append("-length=");
                                sb.append(length);
                                sb.toString();
                            }
                            try {
                                amwr amwr = this.f76165g;
                                if (!TextUtils.isEmpty(a)) {
                                    if (bArr != null) {
                                        bxvd da = btet.f148559h.mo74144da();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((btet) da.f164949b).f148561a = btee.m116473a(3);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        btet btet = (btet) da.f164949b;
                                        a.getClass();
                                        btet.f148562b = a;
                                        btet.f148567g = btes.m116488a(bArr[0] == -119 ? 4 : 3);
                                        ByteString a6 = ByteString.m123261a(bArr);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        btet btet2 = (btet) da.f164949b;
                                        a6.getClass();
                                        btet2.f148563c = a6;
                                        btea btea = amwr.f76218f;
                                        btea.getClass();
                                        btet2.f148564d = btea;
                                        btet btet3 = (btet) da.mo74062i();
                                        amwr.f76216d.mo41626a();
                                        bteu a7 = amwr.f76214b.mo41251a(amwr.f76213a, btet3);
                                        amwr.f76216d.mo41628a("FSA_updatePersonPhoto", 1, amwy.m63594a(a7));
                                        if (a7 != null) {
                                            if (!a7.f148570a.isEmpty()) {
                                                String str6 = a7.f148570a;
                                                if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83020bu()).booleanValue()) {
                                                    a2 = str6;
                                                }
                                                m63513a();
                                                return m63512a(longValue, b2, a2).withValue(str4, a5);
                                            }
                                        }
                                        if (a7 != null) {
                                            amwr.m63563a("photoToken is empty.");
                                        } else {
                                            amwr.m63563a("response is null.");
                                        }
                                        throw new amxy(3);
                                    }
                                }
                                if (TextUtils.isEmpty(a)) {
                                    amwr.m63563a("contactId was null.");
                                } else {
                                    amwr.m63563a("bytes[] was null.");
                                }
                                throw new amxy(2);
                            } catch (gid e2) {
                                e = e2;
                                Throwable th3 = e;
                                Log.e(str5, "writePhoto() failed.", th3);
                                throw th3;
                            } catch (chuw e3) {
                                e = e3;
                                Throwable th32 = e;
                                Log.e(str5, "writePhoto() failed.", th32);
                                throw th32;
                            } catch (amxy e4) {
                            }
                        } catch (amwb e5) {
                        }
                    } else {
                        String str7 = "FSA2_PhotoSyncGrpc";
                        if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo83015bp()).booleanValue() || !TextUtils.isEmpty(a2)) {
                            m63514a(ammz.REMOVE, 1);
                            SystemClock.elapsedRealtime();
                            try {
                                amwr amwr2 = this.f76165g;
                                if (a != null) {
                                    bxvd da2 = btcm.f148287c.mo74144da();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    btcm btcm = (btcm) da2.f164949b;
                                    a.getClass();
                                    if (!btcm.f148289a.mo73666a()) {
                                        btcm.f148289a = GeneratedMessageLite.m124021a(btcm.f148289a);
                                    }
                                    btcm.f148289a.add(a);
                                    btea btea2 = amwr2.f76218f;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    btea2.getClass();
                                    ((btcm) da2.f164949b).f148290b = btea2;
                                    btcm btcm2 = (btcm) da2.mo74062i();
                                    amwr2.f76216d.mo41626a();
                                    ampm ampm = amwr2.f76214b;
                                    ClientContext clientContext = amwr2.f76213a;
                                    ampl ampl = ampm.f75684b;
                                    long j = (long) ampm.f75683a;
                                    if (ampl.f75675j != null) {
                                        str3 = str4;
                                    } else {
                                        str3 = str4;
                                        try {
                                            ampl.f75675j = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/DeletePersonPhoto", ciie.m150370a(btcm.f148287c), ciie.m150370a(btcn.f148291a));
                                        } catch (chuw | gid e6) {
                                            e = e6;
                                        }
                                    }
                                    amwr2.f76216d.mo41628a("FSA_deletePersonPhoto", 1, amwy.m63594a((btcn) ampl.f75682a.mo25553a(ampl.f75675j, clientContext, btcm2, j, TimeUnit.MILLISECONDS)));
                                    SystemClock.elapsedRealtime();
                                    m63513a();
                                    return amvz.m63509a(longValue);
                                }
                                Log.e(str7, "deletePersonPhoto() failed since contactID was null.");
                                throw new amxy(2);
                            } catch (chuw | gid e7) {
                                e = e7;
                                str3 = str4;
                                Throwable th4 = e;
                                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", th4);
                                throw th4;
                            } catch (amxy e8) {
                            }
                        } else {
                            m63513a();
                            return amvz.m63509a(longValue);
                        }
                    }
                } catch (Throwable th5) {
                    str = str4;
                    th = th5;
                    assetFileDescriptor = null;
                    if (assetFileDescriptor == null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e9) {
                            e = e9;
                            IOException iOException = e;
                            m63514a(ammz.UPDATE, 1);
                            ammz ammz = ammz.UPDATE;
                            Object[] objArr = new Object[2];
                            objArr[0] = ammz == ammz.UPDATE ? "delete" : "update";
                            objArr[1] = a;
                            Log.e("FSA2_SyncUpPhotoCursor", String.format("%s photo for contactId=%s failed.", objArr), iOException);
                            this.f76161c.mo41632a(amjf.PHOTO, ammz, "IO_EXCEPTION", iOException);
                            m63514a(ammz, 2);
                            ((anbh) this.f76161c).f76541a.stats.numIoExceptions++;
                            str4 = str;
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                str = str4;
                IOException iOException2 = e;
                m63514a(ammz.UPDATE, 1);
                ammz ammz2 = ammz.UPDATE;
                Object[] objArr2 = new Object[2];
                objArr2[0] = ammz2 == ammz.UPDATE ? "delete" : "update";
                objArr2[1] = a;
                Log.e("FSA2_SyncUpPhotoCursor", String.format("%s photo for contactId=%s failed.", objArr2), iOException2);
                this.f76161c.mo41632a(amjf.PHOTO, ammz2, "IO_EXCEPTION", iOException2);
                m63514a(ammz2, 2);
                ((anbh) this.f76161c).f76541a.stats.numIoExceptions++;
                str4 = str;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m63513a() {
        if (this.f76164f.mo66813a()) {
            amig.m62939a();
            if (((Boolean) amge.f74881a.mo41191a()).booleanValue()) {
                ((amxh) this.f76164f.mo66814b()).mo41524e(1);
            }
        }
    }

    /* renamed from: a */
    private final void m63514a(ammz ammz, int i) {
        this.f76161c.mo41636a(ammz, amjf.PHOTO, false, i, 1);
    }
}
