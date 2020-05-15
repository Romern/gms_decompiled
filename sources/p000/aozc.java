package p000;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: aozc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aozc {

    /* renamed from: g */
    private static Set f83921g;

    /* renamed from: a */
    private int f83922a = 20;

    /* renamed from: b */
    private int f83923b = 5;

    /* renamed from: c */
    private final aoyo f83924c;

    /* renamed from: d */
    private final boolean f83925d;

    /* renamed from: e */
    private final boolean f83926e;

    /* renamed from: f */
    private boolean f83927f = true;

    /* renamed from: h */
    private final Context f83928h;

    /* renamed from: i */
    private final aoyw f83929i;

    /* renamed from: j */
    private final aoyh f83930j;

    /* renamed from: k */
    private int f83931k;

    /* renamed from: l */
    private int f83932l = 2;

    /* renamed from: m */
    private final int f83933m;

    public aozc(Context context, int i) {
        aoyo aoyo = new aoyo(context);
        this.f83928h = context;
        this.f83933m = i;
        this.f83929i = new aoyw();
        new aoyt();
        this.f83924c = aoyo;
        this.f83930j = aoyh.m69805a("WriteContactsHelper");
        this.f83931k = 0;
        this.f83925d = cgjy.f187097a.mo6606a().mo83935M();
        this.f83926e = cgjy.m145755b();
    }

    /* renamed from: a */
    private final long m69889a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Groups.CONTENT_URI).withValue("account_name", str2).withValue("account_type", "com.google").withValue("group_visible", 1).withValue("title", str).build());
        try {
            return Long.parseLong(this.f83928h.getContentResolver().applyBatch("com.android.contacts", arrayList)[0].uri.getLastPathSegment());
        } catch (OperationApplicationException | RemoteException e) {
            this.f83930j.mo46980a(e, "Failed to create new group for contacts to be restored.");
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b7, code lost:
        if (p000.aoyw.m69866a(r4, r0) == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ba, code lost:
        if (r31 != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03e5, code lost:
        if (p000.aoyw.m69866a(r4, r0) != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0744, code lost:
        if (r4 == 3) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0157, code lost:
        if (r7 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0393 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x06a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f1  */
    /* renamed from: a */
    private final void m69890a(btem btem, boolean z, String str, apfc apfc) {
        btem btem2;
        SparseArray sparseArray;
        boolean w;
        boolean d;
        double l;
        int i;
        int length;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        btfi[] btfiArr;
        boolean z4;
        long j;
        int i5;
        int i6;
        SparseArray sparseArray2;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        double d2;
        int i9;
        int i10;
        double d3;
        apfc apfc2;
        RemoteException remoteException;
        int i11;
        Object obj;
        byte[] bArr;
        SparseArray sparseArray3;
        Cursor cursor;
        long j2;
        btem btem3 = btem;
        String str2 = str;
        apfc apfc3 = apfc;
        if (!aoyn.m69849a("android.permission.WRITE_CONTACTS")) {
            this.f83930j.mo46983c("Don't have WRITE_CONTACTS permission; giving up writing contacts.");
            return;
        }
        aoyq aoyq = new aoyq(4);
        aoyq.mo47010a();
        try {
            btem2 = new aoza(this.f83928h).mo47025a();
        } catch (aoyu | aoyv e) {
            this.f83930j.mo46980a(e, "Failed to read contacts from device.");
            btem2 = null;
        } catch (InterruptedException e2) {
            this.f83930j.mo46980a(e2, "Interrupted while reading contacts from device.");
            btem2 = null;
        }
        int i12 = 0;
        aoyq.mo47012a(this.f83928h, "write_contacts_helper:read_existing_contacts", false);
        aoyw aoyw = this.f83929i;
        int i13 = 1;
        if (btem2 != null) {
            aoyw.f83868a = new SparseArray();
            bxwc bxwc = btem2.f148534a;
            int size = bxwc.size();
            for (int i14 = 0; i14 < size; i14++) {
                btfi btfi = (btfi) bxwc.get(i14);
                int hashCode = Arrays.hashCode(new Object[]{aoyw.m69862a(btfi)});
                Set set = (Set) aoyw.f83868a.get(hashCode);
                if (set == null) {
                    set = new HashSet();
                }
                set.add(btfi);
                aoyw.f83868a.put(hashCode, set);
            }
        }
        if (this.f83926e) {
            f83921g = new aoys(this.f83928h).mo47021a();
        }
        if (this.f83925d) {
            if (!cgjy.f187097a.mo6606a().mo83936N()) {
                this.f83929i.mo47022a(btem3);
            } else {
                HashSet hashSet = new HashSet();
                bxwc bxwc2 = btem3.f148534a;
                int size2 = bxwc2.size();
                int i15 = 0;
                while (i15 < size2) {
                    apfc apfc4 = apfc3;
                    aoyq aoyq2 = aoyq;
                    btfi btfi2 = (btfi) bxwc2.get(i15);
                    if (!btfi2.f148664g.isEmpty() && !"com.google".equals(btfi2.f148664g)) {
                        if (this.f83926e) {
                            if (!f83921g.contains(btfi2.f148664g)) {
                                hashSet.add(btfi2);
                            }
                        } else if (!ayts.m84809a(btfi2.f148664g)) {
                            hashSet.add(btfi2);
                        }
                    }
                    i15++;
                    str2 = str;
                    i13 = 1;
                    i12 = 0;
                    aoyq = aoyq2;
                    apfc3 = apfc4;
                }
                btel btel = (btel) btem.f148532c.mo74144da();
                btel.mo70754a(hashSet);
                this.f83929i.mo47022a((btem) btel.mo74062i());
            }
        }
        btfi[] btfiArr2 = (btfi[]) btem3.f148534a.toArray(new btfi[i12]);
        aoyq.mo47010a();
        btfb btfb = btem3.f148535b;
        if (btfb == null) {
            btfb = btfb.f148607b;
        }
        boolean i16 = cgjy.f187097a.mo6606a().mo83945i() ^ i13;
        long j3 = -2;
        if (i16) {
            String str3 = (btfb == null || btfb.f148609a.isEmpty()) ? "" : btfb.f148609a;
            String string = this.f83928h.getString(C0126R.string.romanesco_contacts_restore_group_label);
            Object[] objArr = new Object[i13];
            objArr[i12] = str3;
            String format = String.format(string, objArr);
            try {
                ContentResolver contentResolver = this.f83928h.getContentResolver();
                Uri uri = ContactsContract.Groups.CONTENT_URI;
                String[] strArr = new String[i13];
                strArr[i12] = "_id";
                String[] strArr2 = new String[3];
                strArr2[i12] = str2;
                strArr2[i13] = "com.google";
                strArr2[2] = format;
                cursor = contentResolver.query(uri, strArr, "account_name=? AND account_type=? AND title=?", strArr2, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            long j4 = cursor.getLong(i12);
                            cursor.close();
                            j2 = j4;
                            if (j2 != -2) {
                                j3 = m69889a(format, str2);
                            } else {
                                j3 = j2;
                            }
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        try {
                            this.f83930j.mo46980a(e, "Failed to query group for contacts to be restored.");
                            if (cursor == null) {
                                j2 = -2;
                                if (j2 != -2) {
                                }
                                int length2 = btfiArr2.length;
                                ArrayList arrayList = new ArrayList();
                                SparseArray sparseArray4 = new SparseArray();
                                sparseArray = new SparseArray();
                                if (z) {
                                }
                                w = cgjy.f187097a.mo6606a().mo83959w();
                                d = cgjy.m145757d();
                                aoyq aoyq3 = aoyq;
                                l = cgjy.m145765l();
                                boolean a = cgjs.f187091a.mo6606a().mo83919a();
                                i = 0;
                                int i17 = -1;
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                int i22 = 0;
                                int i23 = 0;
                                int i24 = 0;
                                while (true) {
                                    double d4 = l;
                                    length = btfiArr2.length;
                                    if (i >= length) {
                                    }
                                    i = i9 + 1;
                                    str2 = str;
                                    l = d2;
                                    w = z6;
                                    btfiArr2 = btfiArr;
                                    d = z5;
                                    j3 = j;
                                    sparseArray = sparseArray2;
                                }
                                this.f83924c.mo47009a(remoteException, d3);
                                throw remoteException;
                            }
                            cursor.close();
                            j2 = -2;
                            if (j2 != -2) {
                            }
                            int length22 = btfiArr2.length;
                            ArrayList arrayList2 = new ArrayList();
                            SparseArray sparseArray42 = new SparseArray();
                            sparseArray = new SparseArray();
                            if (z) {
                            }
                            w = cgjy.f187097a.mo6606a().mo83959w();
                            d = cgjy.m145757d();
                            aoyq aoyq32 = aoyq;
                            l = cgjy.m145765l();
                            boolean a2 = cgjs.f187091a.mo6606a().mo83919a();
                            i = 0;
                            int i172 = -1;
                            int i182 = 0;
                            int i192 = 0;
                            int i202 = 0;
                            int i212 = 0;
                            int i222 = 0;
                            int i232 = 0;
                            int i242 = 0;
                            while (true) {
                                double d42 = l;
                                length = btfiArr2.length;
                                if (i >= length) {
                                }
                                i = i9 + 1;
                                str2 = str;
                                l = d2;
                                w = z6;
                                btfiArr2 = btfiArr;
                                d = z5;
                                j3 = j;
                                sparseArray = sparseArray2;
                            }
                            this.f83924c.mo47009a(remoteException, d3);
                            throw remoteException;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursor = null;
                this.f83930j.mo46980a(e, "Failed to query group for contacts to be restored.");
                if (cursor == null) {
                }
                cursor.close();
                j2 = -2;
                if (j2 != -2) {
                }
                int length222 = btfiArr2.length;
                ArrayList arrayList22 = new ArrayList();
                SparseArray sparseArray422 = new SparseArray();
                sparseArray = new SparseArray();
                if (z) {
                }
                w = cgjy.f187097a.mo6606a().mo83959w();
                d = cgjy.m145757d();
                aoyq aoyq322 = aoyq;
                l = cgjy.m145765l();
                boolean a22 = cgjs.f187091a.mo6606a().mo83919a();
                i = 0;
                int i1722 = -1;
                int i1822 = 0;
                int i1922 = 0;
                int i2022 = 0;
                int i2122 = 0;
                int i2222 = 0;
                int i2322 = 0;
                int i2422 = 0;
                while (true) {
                    double d422 = l;
                    length = btfiArr2.length;
                    if (i >= length) {
                    }
                    i = i9 + 1;
                    str2 = str;
                    l = d2;
                    w = z6;
                    btfiArr2 = btfiArr;
                    d = z5;
                    j3 = j;
                    sparseArray = sparseArray2;
                }
                this.f83924c.mo47009a(remoteException, d3);
                throw remoteException;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        }
        int length2222 = btfiArr2.length;
        ArrayList arrayList222 = new ArrayList();
        SparseArray sparseArray4222 = new SparseArray();
        sparseArray = new SparseArray();
        if (z) {
            for (int i25 = 0; i25 < btfiArr2.length; i25++) {
                btfi btfi3 = btfiArr2[i25];
                if ("com.google".equals(btfi3.f148664g) && !str.isEmpty() && str2.equals(btfi3.f148681x)) {
                    m69891a(btfiArr2[i25], sparseArray);
                }
            }
        }
        w = cgjy.f187097a.mo6606a().mo83959w();
        d = cgjy.m145757d();
        aoyq aoyq3222 = aoyq;
        l = cgjy.m145765l();
        boolean a222 = cgjs.f187091a.mo6606a().mo83919a();
        i = 0;
        int i17222 = -1;
        int i18222 = 0;
        int i19222 = 0;
        int i20222 = 0;
        int i21222 = 0;
        int i22222 = 0;
        int i23222 = 0;
        int i24222 = 0;
        while (true) {
            double d4222 = l;
            length = btfiArr2.length;
            if (i >= length) {
                btfi btfi4 = btfiArr2[i];
                if (btfi4 != null) {
                    if (!btfi4.f148664g.isEmpty() || !btfi4.f148658a.isEmpty() || !btfi4.f148672o.isEmpty() || btfi4.f148661d.size() != 0 || btfi4.f148662e.size() != 0) {
                        z2 = false;
                        z3 = !z2;
                        if (z3) {
                            z4 = z3;
                            if (!btfi4.f148664g.isEmpty()) {
                                String str4 = btfi4.f148664g;
                                btfiArr = btfiArr2;
                                if (!this.f83926e) {
                                    if (ayts.m84809a(str4)) {
                                        z4 = false;
                                        if (this.f83925d) {
                                            i6 = i;
                                            i5 = length2222;
                                            j = j3;
                                        } else {
                                            if (!z4 || "com.google".equals(btfi4.f148664g) || (sparseArray3 = this.f83929i.f83869b) == null) {
                                                i6 = i;
                                            } else {
                                                i6 = i;
                                                Set set2 = (Set) sparseArray3.get(Arrays.hashCode(new Object[]{btfi4.f148658a}));
                                                if (set2 != null) {
                                                    Iterator it = set2.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            break;
                                                        }
                                                        btfi btfi5 = (btfi) it.next();
                                                        Iterator it2 = it;
                                                        if (sdg.m34949a(btfi4.f148658a, btfi5.f148658a)) {
                                                            i5 = length2222;
                                                            Set a3 = aoyw.m69863a((btfd[]) btfi4.f148661d.toArray(new btfd[0]));
                                                            j = j3;
                                                            Set a4 = aoyw.m69863a((btfd[]) btfi5.f148661d.toArray(new btfd[0]));
                                                            if (a4.containsAll(a3)) {
                                                                boolean z7 = !a3.containsAll(a4);
                                                                Set a5 = aoyw.m69864a((btff[]) btfi4.f148662e.toArray(new btff[0]));
                                                                Set a6 = aoyw.m69864a((btff[]) btfi5.f148662e.toArray(new btff[0]));
                                                                if (a6.containsAll(a5)) {
                                                                    if (!z7 && !a5.containsAll(a6)) {
                                                                        z7 = true;
                                                                    }
                                                                    Set a7 = aoyw.m69865a((btfg[]) btfi4.f148663f.toArray(new btfg[0]));
                                                                    Set a8 = aoyw.m69865a((btfg[]) btfi5.f148663f.toArray(new btfg[0]));
                                                                    if (!a8.containsAll(a7)) {
                                                                        it = it2;
                                                                        length2222 = i5;
                                                                        j3 = j;
                                                                    } else if (z7 || !a7.containsAll(a8)) {
                                                                        z4 = false;
                                                                    } else {
                                                                        it = it2;
                                                                        length2222 = i5;
                                                                        j3 = j;
                                                                    }
                                                                } else {
                                                                    it = it2;
                                                                    length2222 = i5;
                                                                    j3 = j;
                                                                }
                                                            } else {
                                                                it = it2;
                                                                length2222 = i5;
                                                                j3 = j;
                                                            }
                                                        } else {
                                                            it = it2;
                                                        }
                                                    }
                                                    z4 = false;
                                                }
                                            }
                                            i5 = length2222;
                                            j = j3;
                                        }
                                        Set a9 = aoyw.m69862a(btfi4);
                                        Set set3 = (Set) sparseArray4222.get(Arrays.hashCode(new Object[]{a9}));
                                        if (w && z4 && !"com.google".equals(btfi4.f148664g) && set3 != null && aoyw.m69866a(btfi4, set3)) {
                                            z4 = false;
                                        }
                                        if (!z && w) {
                                            if (z4) {
                                                if (!"com.google".equals(btfi4.f148664g)) {
                                                    Set set4 = (Set) sparseArray.get(Arrays.hashCode(new Object[]{a9}));
                                                    if (set4 != null) {
                                                    }
                                                }
                                            }
                                            z6 = w;
                                            z5 = d;
                                            sparseArray2 = sparseArray;
                                            i8 = i21222;
                                            i7 = i24222;
                                            if (i7 < this.f83922a || i8 >= this.f83923b) {
                                                i10 = i6;
                                            } else {
                                                i10 = i6;
                                                if (i10 < i5 - 1) {
                                                    i21222 = i8;
                                                    i24222 = i7;
                                                    i9 = i10;
                                                    d2 = d4222;
                                                    length2222 = i5;
                                                    i = i9 + 1;
                                                    str2 = str;
                                                    l = d2;
                                                    w = z6;
                                                    btfiArr2 = btfiArr;
                                                    d = z5;
                                                    j3 = j;
                                                    sparseArray = sparseArray2;
                                                }
                                            }
                                            if (i7 > 0) {
                                                d3 = d4222;
                                            } else {
                                                d3 = d4222;
                                                try {
                                                    m69892a(arrayList222, d3);
                                                } catch (RemoteException e5) {
                                                    remoteException = e5;
                                                    if (!(remoteException instanceof TransactionTooLargeException) || (i11 = this.f83932l) <= 0) {
                                                        this.f83924c.mo47009a(remoteException, d3);
                                                        throw remoteException;
                                                    }
                                                    this.f83932l = i11 - 1;
                                                    i20222 = 0;
                                                    i22222 = 0;
                                                    i23222 = 0;
                                                }
                                            }
                                            i17222 = i10;
                                            i18222 += i22222;
                                            i19222 += i23222;
                                            d2 = d3;
                                            apfc2 = apfc;
                                            if (apfc2 != null) {
                                                length2222 = i5;
                                            } else {
                                                int i26 = i17222 + 1;
                                                if (i5 > 0) {
                                                    length2222 = i5;
                                                    if (length2222 >= i26) {
                                                        apfc2.mo47150a(((int) ((((float) i26) / ((float) length2222)) * 325.0f)) + 175, String.format(apfc2.f84288a.getString(C0126R.string.romanesco_restoring_contacts), Integer.valueOf(i26), Integer.valueOf(length2222)));
                                                    }
                                                } else {
                                                    length2222 = i5;
                                                }
                                            }
                                            this.f83931k += i7;
                                            arrayList222.clear();
                                            i9 = i17222;
                                            i21222 = 0;
                                            i22222 = 0;
                                            i23222 = 0;
                                            i24222 = 0;
                                            i = i9 + 1;
                                            str2 = str;
                                            l = d2;
                                            w = z6;
                                            btfiArr2 = btfiArr;
                                            d = z5;
                                            j3 = j;
                                            sparseArray = sparseArray2;
                                        }
                                        aoyw aoyw2 = this.f83929i;
                                        if (aoyw2.f83868a != null) {
                                            Set a10 = aoyw.m69862a(btfi4);
                                            if (!a10.isEmpty()) {
                                                Set set5 = (Set) aoyw2.f83868a.get(Arrays.hashCode(new Object[]{a10}));
                                                if (set5 != null) {
                                                }
                                            }
                                        }
                                        int size3 = arrayList222.size();
                                        if (!TextUtils.isEmpty(str)) {
                                            obj = "com.google";
                                        } else {
                                            obj = null;
                                        }
                                        arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", obj).withValue("account_name", str2).withYieldAllowed(true).build());
                                        if (!btfi4.f148658a.isEmpty()) {
                                            arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", btfi4.f148658a).build());
                                        }
                                        if (d && this.f83927f) {
                                            if (!btfi4.f148674q.mo73779j()) {
                                                bArr = btfi4.f148674q.mo73780k();
                                                i21222++;
                                            } else {
                                                bArr = !btfi4.f148673p.mo73779j() ? btfi4.f148673p.mo73780k() : null;
                                            }
                                            if (bArr != null) {
                                                arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", bArr).build());
                                            }
                                        }
                                        if (btfi4.f148662e.size() > 0) {
                                            bxwc bxwc3 = btfi4.f148662e;
                                            z6 = w;
                                            z5 = d;
                                            int i27 = 0;
                                            for (int size4 = bxwc3.size(); i27 < size4; size4 = size4) {
                                                btff btff = (btff) bxwc3.get(i27);
                                                arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", btff.f148638a).withValue("data2", Integer.valueOf(btff.f148642e)).withValue("data3", btff.f148639b).build());
                                                i27++;
                                                sparseArray = sparseArray;
                                                bxwc3 = bxwc3;
                                            }
                                        } else {
                                            z6 = w;
                                            z5 = d;
                                        }
                                        sparseArray2 = sparseArray;
                                        if (btfi4.f148661d.size() > 0) {
                                            bxwc bxwc4 = btfi4.f148661d;
                                            int size5 = bxwc4.size();
                                            int i28 = 0;
                                            while (i28 < size5) {
                                                btfd btfd = (btfd) bxwc4.get(i28);
                                                arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", btfd.f148615a).withValue("data2", Integer.valueOf(btfd.f148619e)).withValue("data3", btfd.f148616b).build());
                                                i28++;
                                                size5 = size5;
                                                bxwc4 = bxwc4;
                                            }
                                        }
                                        if (btfi4.f148663f.size() > 0) {
                                            bxwc bxwc5 = btfi4.f148663f;
                                            int size6 = bxwc5.size();
                                            int i29 = 0;
                                            while (i29 < size6) {
                                                btfg btfg = (btfg) bxwc5.get(i29);
                                                arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data1", btfg.f148647a).withValue("data2", Integer.valueOf(btfg.f148649c)).withValue("data3", btfg.f148648b).build());
                                                i29++;
                                                size6 = size6;
                                                bxwc5 = bxwc5;
                                            }
                                        }
                                        if (!btfi4.f148672o.isEmpty()) {
                                            arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", btfi4.f148672o).build());
                                        }
                                        if (i16 && j != -1) {
                                            arrayList222.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size3).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Long.valueOf(j)).build());
                                        }
                                        int i30 = i24222 + 1;
                                        if (!m69893a(btfi4)) {
                                            i22222++;
                                        } else {
                                            i23222++;
                                        }
                                        m69891a(btfi4, sparseArray4222);
                                        i8 = i21222;
                                        i7 = i30;
                                        if (i7 < this.f83922a) {
                                        }
                                        i10 = i6;
                                        if (i7 > 0) {
                                        }
                                        i17222 = i10;
                                        i18222 += i22222;
                                        i19222 += i23222;
                                        d2 = d3;
                                        apfc2 = apfc;
                                        if (apfc2 != null) {
                                        }
                                        this.f83931k += i7;
                                        arrayList222.clear();
                                        i9 = i17222;
                                        i21222 = 0;
                                        i22222 = 0;
                                        i23222 = 0;
                                        i24222 = 0;
                                        i = i9 + 1;
                                        str2 = str;
                                        l = d2;
                                        w = z6;
                                        btfiArr2 = btfiArr;
                                        d = z5;
                                        j3 = j;
                                        sparseArray = sparseArray2;
                                    }
                                } else if (f83921g.contains(str4)) {
                                    z4 = false;
                                    if (this.f83925d) {
                                    }
                                    Set a92 = aoyw.m69862a(btfi4);
                                    Set set32 = (Set) sparseArray4222.get(Arrays.hashCode(new Object[]{a92}));
                                    z4 = false;
                                    if (!z) {
                                    }
                                }
                                if (a222) {
                                    i20222++;
                                }
                                if (this.f83925d) {
                                }
                                Set a922 = aoyw.m69862a(btfi4);
                                Set set322 = (Set) sparseArray4222.get(Arrays.hashCode(new Object[]{a922}));
                                z4 = false;
                                if (!z) {
                                }
                            }
                        } else {
                            z4 = z3;
                        }
                        btfiArr = btfiArr2;
                        if (this.f83925d) {
                        }
                        Set a9222 = aoyw.m69862a(btfi4);
                        Set set3222 = (Set) sparseArray4222.get(Arrays.hashCode(new Object[]{a9222}));
                        z4 = false;
                        if (!z) {
                        }
                    } else if (btfi4.f148663f.size() != 0) {
                        z2 = false;
                        z3 = !z2;
                        if (z3) {
                        }
                        btfiArr = btfiArr2;
                        if (this.f83925d) {
                        }
                        Set a92222 = aoyw.m69862a(btfi4);
                        Set set32222 = (Set) sparseArray4222.get(Arrays.hashCode(new Object[]{a92222}));
                        z4 = false;
                        if (!z) {
                        }
                    }
                }
                z2 = true;
                z3 = !z2;
                if (z3) {
                }
                btfiArr = btfiArr2;
                if (this.f83925d) {
                }
                Set a922222 = aoyw.m69862a(btfi4);
                Set set322222 = (Set) sparseArray4222.get(Arrays.hashCode(new Object[]{a922222}));
                z4 = false;
                if (!z) {
                }
            } else {
                btfi[] btfiArr3 = btfiArr2;
                int i31 = i18222;
                int i32 = i19222;
                if (apfc != null) {
                    apfc.mo47148a();
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                }
                while (i4 < length) {
                    if (m69893a(btfiArr3[i4])) {
                        i3++;
                    } else if (!a222) {
                        i2++;
                    }
                    i4++;
                }
                if (a222) {
                    i2 = i20222 - i3;
                }
                if (cgjy.f187097a.mo6606a().mo83947k()) {
                    this.f83930j.mo46981b(String.format("Successfully restored the contacts: totalDeviceContacts = %d, totalSimContacts = %d, totalRestoredDeviceContacts = %d, totalRestoredSimContacts = %d, restoreSimContacts = %b", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i31), Integer.valueOf(i32), true));
                }
                aoyj a11 = aoyj.m69819a();
                int i33 = this.f83933m;
                bxvd da = bzdv.f169582g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzdv bzdv = (bzdv) da.f164949b;
                bzdv.f169584a = i2;
                bzdv.f169585b = i3;
                bzdv.f169586c = i31;
                bzdv.f169587d = i32;
                bzdv.f169588e = true;
                if (!cgjy.f187097a.mo6606a().mo83925C()) {
                    int i34 = Build.VERSION.SDK_INT;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bzdv) da.f164949b).f169589f = i33 - 2;
                bxvd da2 = bzel.f169667p.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzdv bzdv2 = (bzdv) da.mo74062i();
                bzdv2.getClass();
                ((bzel) da2.f164949b).f169677i = bzdv2;
                a11.mo46992a(da2);
                aoyq3222.mo47012a(this.f83928h, "write_contacts_helper:restore_contacts", false);
                return;
            }
        }
        this.f83924c.mo47009a(remoteException, d3);
        throw remoteException;
    }

    /* renamed from: a */
    private static void m69891a(btfi btfi, SparseArray sparseArray) {
        int hashCode = Arrays.hashCode(new Object[]{aoyw.m69862a(btfi)});
        Set set = (Set) sparseArray.get(hashCode);
        if (set == null) {
            set = new HashSet();
        }
        set.add(btfi);
        sparseArray.put(hashCode, set);
    }

    /* renamed from: a */
    private final void m69892a(ArrayList arrayList, double d) {
        int i;
        try {
            this.f83928h.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (OperationApplicationException e) {
            this.f83930j.mo46980a(e, "Contact Insertion failed at operation level.");
            this.f83924c.mo47009a(e, d);
            throw e;
        } catch (RemoteException e2) {
            this.f83930j.mo46980a(e2, "Contact Insertion failed at remote level.");
            if ((e2 instanceof TransactionTooLargeException) && (i = this.f83932l) > 0) {
                if (i == 2) {
                    this.f83922a >>= 1;
                    this.f83923b >>= 1;
                } else if (i == 1) {
                    this.f83927f = false;
                }
            }
            this.f83924c.mo47009a(e2, d);
            throw e2;
        }
    }

    /* renamed from: a */
    private static boolean m69893a(btfi btfi) {
        return !btfi.f148664g.isEmpty() && btfi.f148664g.matches(".*sim.*|.*SIM.*");
    }

    /* renamed from: a */
    public final void mo47032a(btem btem, String str, apfc apfc) {
        try {
            m69890a(btem, false, str, apfc);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public final void mo47033a(btem btem, String str, boolean z) {
        try {
            m69890a(btem, z, str, null);
        } catch (InterruptedException e) {
        }
    }
}
