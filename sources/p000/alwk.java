package p000;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SyncAdapterType;
import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: alwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alwk implements Runnable {

    /* renamed from: a */
    private static final String[] f74465a;

    /* renamed from: b */
    private final alwi f74466b;

    /* renamed from: c */
    private final Context f74467c;

    /* renamed from: d */
    private final String f74468d;

    /* renamed from: e */
    private final Set[] f74469e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_id");
        arrayList.add("mimetype");
        arrayList.add("data1");
        arrayList.add("data2");
        arrayList.add("data3");
        arrayList.add("data4");
        arrayList.add("data5");
        arrayList.add("data6");
        arrayList.add("data7");
        arrayList.add("data8");
        arrayList.add("data9");
        arrayList.add("data10");
        arrayList.add("data11");
        arrayList.add("data12");
        arrayList.add("data13");
        arrayList.add("data14");
        arrayList.add("data15");
        arrayList.add("is_primary");
        arrayList.add("contact_id");
        arrayList.add("account_type");
        int i = Build.VERSION.SDK_INT;
        arrayList.add("data_set");
        int i2 = Build.VERSION.SDK_INT;
        arrayList.add("times_used");
        f74465a = (String[]) arrayList.toArray(new String[0]);
    }

    public alwk(alwi alwi, Context context, String str, Set[] setArr) {
        this.f74466b = alwi;
        this.f74467c = context;
        this.f74468d = str;
        this.f74469e = setArr;
    }

    public final void run() {
        ArrayList arrayList;
        alwi alwi;
        alvq alvq;
        Cursor query;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        ArrayList arrayList4;
        Iterator it;
        alvr alvr;
        ArrayList arrayList5;
        String str;
        String str2;
        String str3;
        SyncAdapterType[] syncAdapterTypeArr;
        AuthenticatorDescription[] authenticatorDescriptionArr;
        AuthenticatorDescription authenticatorDescription;
        Context context = this.f74467c;
        synchronized (alwf.f74456a) {
            if (alwf.f74457b == null) {
                alwf.f74457b = new alwf(context.getApplicationContext());
            }
        }
        alwf alwf = alwf.f74457b;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList6 = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        AccountManager accountManager = alwf.f74459d;
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        AuthenticatorDescription[] authenticatorTypes = accountManager.getAuthenticatorTypes();
        int length = syncAdapterTypes.length;
        int i = 0;
        while (i < length) {
            SyncAdapterType syncAdapterType = syncAdapterTypes[i];
            if ("com.android.contacts".equals(syncAdapterType.authority)) {
                String str4 = syncAdapterType.accountType;
                int length2 = authenticatorTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        authenticatorDescriptionArr = authenticatorTypes;
                        authenticatorDescription = null;
                        break;
                    }
                    authenticatorDescription = authenticatorTypes[i2];
                    authenticatorDescriptionArr = authenticatorTypes;
                    if (str4.equals(authenticatorDescription.type)) {
                        break;
                    }
                    i2++;
                    authenticatorTypes = authenticatorDescriptionArr;
                }
                if (authenticatorDescription != null) {
                    String str5 = authenticatorDescription.packageName;
                    syncAdapterTypeArr = syncAdapterTypes;
                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 56 + String.valueOf(str5).length());
                    sb.append("Registering external account type=");
                    sb.append(str4);
                    sb.append(", resourcePackageName=");
                    sb.append(str5);
                    sb.toString();
                    alwe alwe = new alwe(alwf.f74458c, authenticatorDescription.packageName);
                    if (alwe.f74448g) {
                        alwe.f74442a = authenticatorDescription.type;
                        alwe.f74445d = authenticatorDescription.labelId;
                        alwe.f74446e = authenticatorDescription.iconId;
                        arrayList6.add(alwe);
                        hashSet.addAll(alwe.f74449h);
                    }
                } else {
                    syncAdapterTypeArr = syncAdapterTypes;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 46);
                    sb2.append("No authenticator found for type=");
                    sb2.append(str4);
                    sb2.append(", ignoring it.");
                    Log.w("ExAccountTypeManager", sb2.toString());
                }
            } else {
                authenticatorDescriptionArr = authenticatorTypes;
                syncAdapterTypeArr = syncAdapterTypes;
            }
            i++;
            authenticatorTypes = authenticatorDescriptionArr;
            syncAdapterTypes = syncAdapterTypeArr;
        }
        int i3 = 106;
        if (!hashSet.isEmpty()) {
            int size = hashSet.size();
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("Registering ");
            sb3.append(size);
            sb3.append(" extension packages");
            sb3.toString();
            for (String str6 : hashSet) {
                alwe alwe2 = new alwe(alwf.f74458c, str6);
                if (!alwe2.f74448g) {
                    i3 = 106;
                } else if (!alwe2.f74450i) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 83);
                    sb4.append("Skipping extension package ");
                    sb4.append(str6);
                    sb4.append(" because it doesn't have the CONTACTS_STRUCTURE metadata");
                    Log.w("ExAccountTypeManager", sb4.toString());
                } else if (TextUtils.isEmpty(alwe2.f74442a)) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + i3);
                    sb5.append("Skipping extension package ");
                    sb5.append(str6);
                    sb5.append(" because the CONTACTS_STRUCTURE metadata doesn't have the accountType attribute");
                    Log.w("ExAccountTypeManager", sb5.toString());
                } else {
                    String str7 = alwe2.f74442a;
                    String str8 = alwe2.f74443b;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str7).length() + 67 + String.valueOf(str8).length() + String.valueOf(str6).length());
                    sb6.append("Registering extension package account type=");
                    sb6.append(str7);
                    sb6.append(", dataSet=");
                    sb6.append(str8);
                    sb6.append(", packageName=");
                    sb6.append(str6);
                    sb6.toString();
                    arrayList6.add(alwe2);
                    i3 = 106;
                }
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        int size2 = arrayList6.size();
        StringBuilder sb7 = new StringBuilder(106);
        sb7.append("Loaded meta-data for ");
        sb7.append(size2);
        sb7.append(" account types in ");
        sb7.append(elapsedRealtime2 - elapsedRealtime);
        sb7.append("ms(wall) ");
        sb7.append(currentThreadTimeMillis2 - currentThreadTimeMillis);
        sb7.append("ms(cpu)");
        Log.i("ExAccountTypeManager", sb7.toString());
        int length3 = this.f74469e.length;
        alvq[] alvqArr = new alvq[length3];
        int i4 = 0;
        while (i4 < length3) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str9 : this.f74469e[i4]) {
                    ArrayList arrayList7 = arrayList;
                    if (ancm.m64020i(str9)) {
                        hashSet2.addAll(alwo.m61996a(this.f74467c, ancm.m64018g(str9)));
                        arrayList = arrayList7;
                    } else if (ancm.m64021j(str9)) {
                        ancm.m64016e(str9);
                        hashSet2.addAll(Collections.emptySet());
                        arrayList = arrayList7;
                    } else if (alwy.m62042e(str9)) {
                        hashSet2.addAll(alwo.m61998b(this.f74467c, alwy.m62045h(str9)));
                        arrayList = arrayList7;
                    } else if (alwy.m62041d(str9)) {
                        hashSet2.addAll(alwo.m61997a(this.f74467c, this.f74468d, alwy.m62043f(str9)));
                        arrayList = arrayList7;
                    } else if (alwy.m62038a(str9)) {
                        hashSet2.addAll(alwy.m62040c(alwy.m62039b(str9)));
                        arrayList = arrayList7;
                    } else {
                        if (!ancm.m64022k(str9)) {
                            str3 = "ContactsDataLoader";
                            str2 = "Invalid qualified ID";
                        } else {
                            str3 = "ContactsDataLoader";
                            str2 = "Unknown qualified ID type";
                        }
                        Log.w(str3, str2);
                        arrayList = arrayList7;
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    String str10 = (String) it2.next();
                    query = this.f74467c.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendEncodedPath(str10).appendEncodedPath("entities").build(), f74465a, null, null, null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            if (query.getString(0) != null) {
                                String string = query.getString(1);
                                String[] strArr = new String[15];
                                int i5 = 0;
                                int i6 = 2;
                                while (i6 <= 16) {
                                    ArrayList arrayList9 = arrayList;
                                    Iterator it3 = it2;
                                    int i7 = i5 + 1;
                                    int i8 = Build.VERSION.SDK_INT;
                                    if (query.getType(i6) != 0) {
                                        str = query.getType(i6) == 4 ? new String(query.getBlob(i6)) : query.getString(i6);
                                    } else {
                                        str = null;
                                    }
                                    strArr[i5] = str;
                                    i6++;
                                    i5 = i7;
                                    arrayList = arrayList9;
                                    it2 = it3;
                                }
                                if (query.getInt(17) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String string2 = query.getString(19);
                                int i9 = Build.VERSION.SDK_INT;
                                String string3 = query.getString(20);
                                int i10 = Build.VERSION.SDK_INT;
                                int i11 = query.getInt(21);
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        arrayList4 = arrayList;
                                        it = it2;
                                        break;
                                    }
                                    alwe alwe3 = (alwe) it4.next();
                                    if (!sdg.m34949a(alwe3.f74442a, string2)) {
                                        arrayList5 = arrayList;
                                    } else if (sdg.m34949a(alwe3.f74443b, string3)) {
                                        alwg alwg = (alwg) alwe3.f74447f.get(string);
                                        if (alwg == null) {
                                            arrayList5 = arrayList;
                                        } else if (alwg.f74462c == null || alwg.f74463d == null) {
                                            arrayList4 = arrayList;
                                            it = it2;
                                        } else {
                                            arrayList4 = arrayList;
                                            it = it2;
                                            alvr = new alvr(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, query.getLong(0)), query.getString(query.getColumnIndex(alwg.f74462c)), alwe3.f74446e, query.getString(query.getColumnIndex(alwg.f74463d)), alwg.f74460a, alwg.f74461b, alwe3.f74445d, alwe3.f74442a);
                                        }
                                    } else {
                                        arrayList5 = arrayList;
                                    }
                                }
                                alvr = null;
                                arrayList8.add(new alwa(str10, str10, string, i11, strArr, false, z, alvr));
                                arrayList3 = arrayList4;
                                it2 = it;
                            } else {
                                arrayList3 = arrayList;
                            }
                        }
                        ArrayList arrayList10 = arrayList;
                        Iterator it5 = it2;
                        try {
                            query.close();
                            arrayList2 = arrayList10;
                            it2 = it5;
                        } catch (Exception e) {
                            arrayList2 = arrayList10;
                            it2 = it5;
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                }
                ArrayList arrayList11 = arrayList;
                if (!arrayList8.isEmpty()) {
                    alvq = new alvq(arrayList8);
                } else {
                    alvq = null;
                }
                alvqArr[i4] = alvq;
                i4++;
                arrayList6 = arrayList11;
            } catch (SecurityException e2) {
                try {
                    Log.e("ContactsDataLoader", "Error querying contact data:", e2);
                    alwi = this.f74466b;
                } catch (Throwable th) {
                    this.f74466b.mo40833a(Status.f30107a, alvqArr);
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                try {
                    query.close();
                } catch (Exception e3) {
                }
                throw th3;
            }
        }
        alwi = this.f74466b;
        alwi.mo40833a(Status.f30107a, alvqArr);
    }
}
