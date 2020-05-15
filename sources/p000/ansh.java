package p000;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;
import com.google.android.gms.plus.service.pos.GetsignupstateEntity;
import java.io.File;

/* renamed from: ansh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansh {

    /* renamed from: a */
    public final aocv f77586a;

    /* renamed from: b */
    public final aodd f77587b;

    /* renamed from: c */
    public final aoay f77588c;

    public ansh(aocv aocv, aodd aodd, aoay aoay) {
        this.f77586a = aocv;
        this.f77587b = aodd;
        this.f77588c = aoay;
    }

    /* renamed from: a */
    public static String m65102a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return TextUtils.isEmpty(parse.getPath()) ? parse.buildUpon().appendPath("").build().toString() : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dc, code lost:
        if (r0.equals(r6.getAsString("profile_image_url")) == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0152  */
    /* renamed from: a */
    public final antb mo42181a(Context context, ClientContext clientContext) {
        SQLiteDatabase writableDatabase;
        boolean z;
        Cursor cursor = null;
        try {
            String a = aoan.m65705a(context.getPackageManager(), clientContext.f30215e);
            try {
                aocv aocv = this.f77586a;
                String str = "plusones/getsignupstate";
                if (a != null) {
                    str = shd.m35268a(str, "container", shd.m35267a(a));
                }
                GetsignupstateEntity getsignupstateEntity = (GetsignupstateEntity) aocv.f78210a.mo25536a(clientContext, 0, shd.m35268a(shd.m35268a(str, "nolog", String.valueOf((Object) true)), "source", shd.m35267a("native:android_app")), (Object) null, GetsignupstateEntity.class);
                ContentValues contentValues = new ContentValues();
                contentValues.put("display_name", getsignupstateEntity.f82614c);
                contentValues.put("signedUp", Boolean.valueOf(getsignupstateEntity.f82617f));
                rzh rzh = new rzh(getsignupstateEntity.f82616e);
                rzh.f43893b.mo25264a(context.getResources().getDimensionPixelSize(C0126R.dimen.plus_one_avatar_size));
                contentValues.put("profile_image_url", rzh.mo25265a());
                contentValues.put("account_name", clientContext.mo17802b());
                ContentResolver contentResolver = context.getContentResolver();
                String b = clientContext.mo17802b();
                ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
                try {
                    PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
                    ContentValues contentValues2 = new ContentValues(contentValues);
                    contentValues2.put("updated", Long.valueOf(System.currentTimeMillis()));
                    writableDatabase = plusChimeraContentProvider.f82604b.getWritableDatabase();
                    writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
                    if (writableDatabase.update("plus_accounts", contentValues2, "account_name=?", new String[]{b}) != 0) {
                        String asString = plusChimeraContentProvider.mo46636b(b, writableDatabase).getAsString("profile_image_url");
                        if (asString == null) {
                        }
                        File file = new File(plusChimeraContentProvider.f82605c, b);
                        if (file.exists()) {
                            file.delete();
                        }
                    } else {
                        writableDatabase.insert("plus_accounts", null, contentValues2);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    acquireContentProviderClient.release();
                    cursor = aoam.m65703a(contentResolver, clientContext.mo17802b());
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndex("display_name"));
                            String string2 = cursor.getString(cursor.getColumnIndex("profile_image_url"));
                            if (cursor.getInt(cursor.getColumnIndex("signedUp")) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            antb antb = new antb(string, string2, z);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return antb;
                        }
                        Log.e("PosAgent", "Hit data removed condition");
                        throw new IllegalStateException();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    acquireContentProviderClient.release();
                    throw th2;
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
            if (cursor != null) {
            }
            throw th;
        }
    }
}
