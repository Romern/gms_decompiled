package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;

/* renamed from: apak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apak {

    /* renamed from: a */
    private static final aoyh f84027a = aoyh.m69805a("CLCommonUtils");

    /* renamed from: b */
    private static final String[] f84028b = {"_id"};

    /* renamed from: c */
    private static final String[] f84029c = {"_id"};

    /* renamed from: a */
    static double m69963a() {
        try {
            return Double.parseDouble("20.15.15 (120300-{{cl}})".substring(0, "20.15.15 (120300-{{cl}})".indexOf(".", "20.15.15 (120300-{{cl}})".indexOf(".") + 1)));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            if (cgjy.m145760g()) {
                f84027a.mo46980a(e, "Cannot parse GmsCore version.");
                return -1.0d;
            }
            f84027a.mo46987e("Cannot parse GmsCore version.", e);
            return -1.0d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[SYNTHETIC, Splitter:B:16:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static int m69964a(Context context, Uri uri, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, strArr, null, null, null);
            if (cursor == null) {
                try {
                    f84027a.mo46983c("CP2 failed to fetch ReadOnlyRawContacts.");
                    return -1;
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        if (cgjy.m145760g()) {
                        }
                        if (cursor != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
            } else {
                int count = cursor.getCount();
                cursor.close();
                return count;
            }
        } catch (SQLiteException e2) {
            e = e2;
            if (cgjy.m145760g()) {
                f84027a.mo46987e("CP2 Query Exception when fetching read-only-raw-contacts.", e);
            } else {
                f84027a.mo46980a(e, "CP2 Query Exception when fetching read-only-raw-contacts.");
            }
            if (cursor != null) {
                return -1;
            }
            cursor.close();
            return -1;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020b  */
    /* renamed from: a */
    public static bzdh m69965a(Context context) {
        bmxv bmxv;
        bmxv b;
        Locale locale;
        bmxv bmxv2;
        int a = m69964a(context, ContactsContract.Contacts.CONTENT_URI, f84029c);
        int a2 = m69964a(context, ContactsContract.RawContacts.CONTENT_URI, f84028b);
        bzdb bzdb = (bzdb) bzdh.f169466A.mo74144da();
        String str = Build.MODEL;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh = (bzdh) bzdb.f164949b;
        str.getClass();
        bzdh.f169469a |= 1;
        bzdh.f169470b = str;
        String str2 = Build.BRAND;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh2 = (bzdh) bzdb.f164949b;
        str2.getClass();
        bzdh2.f169469a |= 2;
        bzdh2.f169471c = str2;
        String str3 = Build.DEVICE;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh3 = (bzdh) bzdb.f164949b;
        str3.getClass();
        bzdh3.f169469a |= 4;
        bzdh3.f169472d = str3;
        String str4 = Build.DISPLAY;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh4 = (bzdh) bzdb.f164949b;
        str4.getClass();
        bzdh4.f169469a |= 8;
        bzdh4.f169473e = str4;
        String str5 = Build.MANUFACTURER;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh5 = (bzdh) bzdb.f164949b;
        str5.getClass();
        int i = bzdh5.f169469a | 16;
        bzdh5.f169469a = i;
        bzdh5.f169474f = str5;
        int i2 = i | 512;
        bzdh5.f169469a = i2;
        bzdh5.f169477i = (long) a;
        bzdh5.f169469a = i2 | 1024;
        bzdh5.f169478j = (long) a2;
        bzdh.m125687a(bzdh5);
        long currentTimeMillis = System.currentTimeMillis();
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh6 = (bzdh) bzdb.f164949b;
        bzdh6.f169469a |= 2048;
        bzdh6.f169479k = currentTimeMillis;
        if (cgij.f186992a.mo6606a().mo83881q()) {
            double a3 = m69963a();
            if (bzdb.f164950c) {
                bzdb.mo74035c();
                bzdb.f164950c = false;
            }
            bzdh bzdh7 = (bzdh) bzdb.f164949b;
            bzdh7.f169469a |= 8192;
            bzdh7.f169481m = a3;
        } else {
            if (bzdb.f164950c) {
                bzdb.mo74035c();
                bzdb.f164950c = false;
            }
            bzdh bzdh8 = (bzdh) bzdb.f164949b;
            bzdh8.f169469a |= 8192;
            bzdh8.f169481m = 28.0d;
        }
        bzdh bzdh9 = (bzdh) bzdb.f164949b;
        bzdh9.f169483o = 1;
        bzdh9.f169469a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        int i3 = Build.VERSION.SDK_INT;
        if (bzdb.f164950c) {
            bzdb.mo74035c();
            bzdb.f164950c = false;
        }
        bzdh bzdh10 = (bzdh) bzdb.f164949b;
        bzdh10.f169469a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bzdh10.f169484p = i3;
        if (cgij.f186992a.mo6606a().mo83887w()) {
            bmxv a4 = aoxv.m69792a(context);
            if (a4.mo66813a()) {
                long longValue = ((Long) a4.mo66814b()).longValue();
                if (bzdb.f164950c) {
                    bzdb.mo74035c();
                    bzdb.f164950c = false;
                }
                bzdh bzdh11 = (bzdh) bzdb.f164949b;
                bzdh11.f169469a |= 16777216;
                bzdh11.f169490v = longValue;
            }
        }
        if (cgij.f186992a.mo6606a().mo83883s()) {
            aoyc a5 = aoyc.m69800a(context);
            if (a5.f83836a.getPhoneType() == 1) {
                String networkCountryIso = a5.f83836a.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    bmxv = bmxv.m108566b(networkCountryIso);
                    if (bmxv.mo66813a()) {
                        String str6 = (String) bmxv.mo66814b();
                        if (bzdb.f164950c) {
                            bzdb.mo74035c();
                            bzdb.f164950c = false;
                        }
                        bzdh bzdh12 = (bzdh) bzdb.f164949b;
                        str6.getClass();
                        bzdh12.f169469a |= 33554432;
                        bzdh12.f169491w = str6;
                    }
                    String simCountryIso = a5.f83836a.getSimCountryIso();
                    b = !TextUtils.isEmpty(simCountryIso) ? bmvz.f131120a : bmxv.m108566b(simCountryIso);
                    if (b.mo66813a()) {
                        String str7 = (String) b.mo66814b();
                        if (bzdb.f164950c) {
                            bzdb.mo74035c();
                            bzdb.f164950c = false;
                        }
                        bzdh bzdh13 = (bzdh) bzdb.f164949b;
                        str7.getClass();
                        bzdh13.f169469a |= 67108864;
                        bzdh13.f169492x = str7;
                    }
                    locale = Locale.getDefault();
                    if (locale != null) {
                        String country = locale.getCountry();
                        if (!TextUtils.isEmpty(country)) {
                            bmxv2 = bmxv.m108566b(country);
                            if (bmxv2.mo66813a()) {
                                String str8 = (String) bmxv2.mo66814b();
                                if (bzdb.f164950c) {
                                    bzdb.mo74035c();
                                    bzdb.f164950c = false;
                                }
                                bzdh bzdh14 = (bzdh) bzdb.f164949b;
                                str8.getClass();
                                bzdh14.f169469a |= 134217728;
                                bzdh14.f169493y = str8;
                            }
                        }
                    }
                    bmxv2 = bmvz.f131120a;
                    if (bmxv2.mo66813a()) {
                    }
                }
            }
            bmxv = bmvz.f131120a;
            if (bmxv.mo66813a()) {
            }
            String simCountryIso2 = a5.f83836a.getSimCountryIso();
            if (!TextUtils.isEmpty(simCountryIso2)) {
            }
            if (b.mo66813a()) {
            }
            locale = Locale.getDefault();
            if (locale != null) {
            }
            bmxv2 = bmvz.f131120a;
            if (bmxv2.mo66813a()) {
            }
        }
        return (bzdh) bzdb.mo74062i();
    }
}
