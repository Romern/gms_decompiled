package p000;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: bjtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtp extends bjts {

    /* renamed from: b */
    private static final Pattern f123297b = Pattern.compile("[\\r\\n]");

    /* renamed from: c */
    private final Activity f123298c;

    public bjtp(Activity activity) {
        super("DeviceAddressSource", activity);
        this.f123298c = activity;
    }

    /* renamed from: a */
    private static int m104588a(int i, int i2) {
        int i3 = i - i2;
        if (i3 >= 0) {
            return i3;
        }
        throw new OutOfMemoryError("Device data exceeds allowed storage for source");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ List mo65528b() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int i;
        int i2;
        Activity activity = this.f123298c;
        ArrayList arrayList = null;
        if (bjzc.m104960a(activity, "android.permission.READ_CONTACTS") && bjzc.m104958a().mo52115a(activity, bjzc.m104958a().mo52114a(activity), "android.permission.READ_CONTACTS")) {
            int i3 = 1048576;
            int memoryClass = (((ActivityManager) this.f123298c.getSystemService("activity")).getMemoryClass() / 16) * 1048576;
            if (memoryClass != 0) {
                i3 = memoryClass;
            }
            ContentResolver contentResolver = this.f123298c.getContentResolver();
            Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1"}, "in_visible_group=1 AND mimetype=?", new String[]{"vnd.android.cursor.item/name"}, "contact_id");
            try {
                SparseArray sparseArray3 = new SparseArray(query.getCount());
                if (query.getCount() > 0) {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("contact_id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("data1");
                    while (query.moveToNext()) {
                        int i4 = query.getInt(columnIndexOrThrow);
                        String string = query.getString(columnIndexOrThrow2);
                        if (!TextUtils.isEmpty(string)) {
                            sparseArray3.append(i4, string);
                        }
                    }
                }
                query.close();
                String str = "data5";
                String str2 = "data10";
                String str3 = "data9";
                String str4 = "data8";
                Cursor query2 = contentResolver.query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, new String[]{"contact_id", "data4", "data7", "data6", "data8", "data9", "data10", "data5"}, "in_visible_group=1", null, null);
                try {
                    arrayList = new ArrayList(query2.getCount());
                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(sparseArray3.size());
                    if (query2.getCount() > 0) {
                        int columnIndexOrThrow3 = query2.getColumnIndexOrThrow("contact_id");
                        int columnIndexOrThrow4 = query2.getColumnIndexOrThrow("data4");
                        int columnIndexOrThrow5 = query2.getColumnIndexOrThrow("data7");
                        int columnIndexOrThrow6 = query2.getColumnIndexOrThrow("data6");
                        int columnIndexOrThrow7 = query2.getColumnIndexOrThrow(str4);
                        int columnIndexOrThrow8 = query2.getColumnIndexOrThrow(str3);
                        int columnIndexOrThrow9 = query2.getColumnIndexOrThrow(str2);
                        int columnIndexOrThrow10 = query2.getColumnIndexOrThrow(str);
                        while (query2.moveToNext()) {
                            btwo btwo = (btwo) btwp.f152728s.mo74144da();
                            int i5 = query2.getInt(columnIndexOrThrow3);
                            String a = m104590a((String) sparseArray3.get(i5));
                            if (!TextUtils.isEmpty(a)) {
                                i = columnIndexOrThrow3;
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp = (btwp) btwo.f164949b;
                                a.getClass();
                                sparseArray2 = sparseArray3;
                                btwp.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                btwp.f152747r = a;
                            } else {
                                i = columnIndexOrThrow3;
                                sparseArray2 = sparseArray3;
                            }
                            if (!query2.isNull(columnIndexOrThrow4)) {
                                String[] split = f123297b.split(query2.getString(columnIndexOrThrow4));
                                int length = split.length;
                                ArrayList arrayList2 = new ArrayList(length);
                                i2 = columnIndexOrThrow4;
                                int i6 = 0;
                                while (i6 < length) {
                                    String[] strArr = split;
                                    String a2 = m104590a(split[i6]);
                                    if (!TextUtils.isEmpty(a2)) {
                                        arrayList2.add(a2);
                                    }
                                    i6++;
                                    split = strArr;
                                }
                                btwo.mo72446a(arrayList2);
                            } else {
                                i2 = columnIndexOrThrow4;
                            }
                            String a3 = m104590a(query2.getString(columnIndexOrThrow5));
                            if (!TextUtils.isEmpty(a3)) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp2 = (btwp) btwo.f164949b;
                                a3.getClass();
                                btwp2.f152730a |= 64;
                                btwp2.f152736g = a3;
                            }
                            String a4 = m104590a(query2.getString(columnIndexOrThrow6));
                            if (!TextUtils.isEmpty(a4)) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp3 = (btwp) btwo.f164949b;
                                a4.getClass();
                                btwp3.f152730a |= 128;
                                btwp3.f152737h = a4;
                            }
                            String a5 = m104590a(query2.getString(columnIndexOrThrow7));
                            if (!TextUtils.isEmpty(a5)) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp4 = (btwp) btwo.f164949b;
                                a5.getClass();
                                btwp4.f152730a |= 16;
                                btwp4.f152734e = a5;
                            }
                            String a6 = m104590a(query2.getString(columnIndexOrThrow8));
                            if (!TextUtils.isEmpty(a6)) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp5 = (btwp) btwo.f164949b;
                                a6.getClass();
                                btwp5.f152730a |= 2048;
                                btwp5.f152740k = a6;
                            }
                            String a7 = m104590a(query2.getString(columnIndexOrThrow9));
                            if (!TextUtils.isEmpty(a7)) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp6 = (btwp) btwo.f164949b;
                                a7.getClass();
                                btwp6.f152730a |= 1;
                                btwp6.f152731b = a7;
                            }
                            String a8 = m104590a(query2.getString(columnIndexOrThrow10));
                            if (!TextUtils.isEmpty(a8)) {
                                if (btwo.f164950c) {
                                    btwo.mo74035c();
                                    btwo.f164950c = false;
                                }
                                btwp btwp7 = (btwp) btwo.f164949b;
                                a8.getClass();
                                btwp7.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                btwp7.f152742m = a8;
                            }
                            i3 = m104588a(i3, m104589a((btwp) btwo.mo74062i()));
                            arrayList.add((btwp) btwo.mo74062i());
                            sparseBooleanArray.put(i5, true);
                            columnIndexOrThrow3 = i;
                            sparseArray3 = sparseArray2;
                            columnIndexOrThrow4 = i2;
                        }
                        sparseArray = sparseArray3;
                    } else {
                        sparseArray = sparseArray3;
                    }
                    query2.close();
                    int size = sparseArray.size();
                    int i7 = 0;
                    while (i7 < size) {
                        SparseArray sparseArray4 = sparseArray;
                        if (!sparseBooleanArray.get(sparseArray4.keyAt(i7))) {
                            String str5 = (String) sparseArray4.valueAt(i7);
                            btwo btwo2 = (btwo) btwp.f152728s.mo74144da();
                            if (btwo2.f164950c) {
                                btwo2.mo74035c();
                                btwo2.f164950c = false;
                            }
                            btwp btwp8 = (btwp) btwo2.f164949b;
                            str5.getClass();
                            btwp8.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            btwp8.f152747r = str5;
                            btwp btwp9 = (btwp) btwo2.mo74062i();
                            i3 = m104588a(i3, m104589a(btwp9));
                            arrayList.add(btwp9);
                        }
                        i7++;
                        sparseArray = sparseArray4;
                    }
                } catch (Throwable th) {
                    query2.close();
                    throw th;
                }
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo65529c() {
        return ((Integer) bjwe.f123484e.mo54082a()).intValue();
    }

    /* renamed from: a */
    private static int m104589a(btwp btwp) {
        if (btwp == null) {
            return 0;
        }
        int i = btwp.f164961ai;
        if (i == -1) {
            i = bxxm.f165037a.mo74228a(btwp).mo74223b(btwp);
            btwp.f164961ai = i;
        }
        return (((i + i) + 45) / 8) * 8;
    }

    /* renamed from: a */
    private static String m104590a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }
}
