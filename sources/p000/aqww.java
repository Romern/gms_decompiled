package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aqww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqww extends aqwj {

    /* renamed from: c */
    private static final Uri f87008c = Uri.parse("content://mms-sms/threadID");

    /* renamed from: d */
    private String[] f87009d;

    /* renamed from: e */
    private aqqu f87010e;

    public aqww(Context context, Person person, aqqu aqqu) {
        super(context);
        if (person.mo41006S()) {
            ArrayList a = sqc.m35954a();
            List list = ((PersonImpl) person).f81758y;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(((Person.PhoneNumbers) list.get(i)).mo40985k());
            }
            this.f87009d = (String[]) a.toArray(new String[a.size()]);
            this.f87010e = aqqu;
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String[] strArr;
        int i;
        int i2;
        Cursor cursor;
        if ((!getContext().getPackageManager().hasSystemFeature("android.hardware.telephony") && !aqrm.m72014a()) || (strArr = this.f87009d) == null || strArr.length == 0 || !this.f87010e.f86621a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = this.f87009d;
        int length = strArr2.length;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= length) {
                break;
            }
            String str = strArr2[i3];
            Context context = getContext();
            Uri.Builder buildUpon = f87008c.buildUpon();
            buildUpon.appendQueryParameter("recipient", str);
            try {
                cursor = context.getContentResolver().query(buildUpon.build(), new String[]{"_id"}, null, null, null);
            } catch (SQLiteException e) {
                cursor = null;
            }
            String str2 = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                    }
                } finally {
                    cursor.close();
                }
            }
            arrayList.add(str2);
            i3++;
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 2;
        String str3 = "address";
        String[] strArr3 = {"body", "date", str3, "read", "type"};
        String valueOf = String.valueOf(aqqv.m71995a(arrayList.size()));
        String str4 = valueOf.length() == 0 ? new String("thread_id IN ") : "thread_id IN ".concat(valueOf);
        ContentResolver contentResolver = getContext().getContentResolver();
        Uri uri = Telephony.Sms.CONTENT_URI;
        String[] strArr4 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        String str5 = "type";
        int i6 = 4;
        Cursor query = contentResolver.query(uri, strArr3, str4, strArr4, "date DESC LIMIT 1");
        Context context2 = getContext();
        int i7 = Build.VERSION.SDK_INT;
        if (query == null) {
            return Collections.emptyList();
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            while (query.moveToNext()) {
                bxvd da = bzjc.f170265j.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc = (bzjc) da.f164949b;
                bzjc.f170268b = i6;
                bzjc.f170267a |= i;
                int i8 = query.getInt(query.getColumnIndex(str5));
                String string = query.getString(query.getColumnIndex("body"));
                if (i8 == i5) {
                    Resources resources = context2.getResources();
                    Object[] objArr = new Object[i];
                    objArr[0] = string;
                    string = resources.getString(C0126R.string.profile_sms_message_from_you_prefix, objArr);
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc2 = (bzjc) da.f164949b;
                string.getClass();
                bzjc2.f170267a |= 32;
                bzjc2.f170270d = string;
                String string2 = query.getString(query.getColumnIndex(str3));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc3 = (bzjc) da.f164949b;
                string2.getClass();
                bzjc3.f170267a |= 128;
                bzjc3.f170271e = string2;
                long j = query.getLong(query.getColumnIndex("date"));
                String str6 = str3;
                long j2 = j / 1000;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc4 = (bzjc) da.f164949b;
                bzjc4.f170267a |= 512;
                bzjc4.f170273g = j2;
                String a = aqqv.m71996a(j, context2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc5 = (bzjc) da.f164949b;
                a.getClass();
                bzjc5.f170267a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bzjc5.f170272f = a;
                if (!query.isNull(query.getColumnIndex("read"))) {
                    i2 = query.getInt(query.getColumnIndex("read")) != 1 ? 3 : 2;
                } else {
                    i2 = 1;
                }
                bxvd da2 = bzhz.f170135c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzhz bzhz = (bzhz) da2.f164949b;
                bzhz.f170138b = i2 - 1;
                bzhz.f170137a |= 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc6 = (bzjc) da.f164949b;
                bzhz bzhz2 = (bzhz) da2.mo74062i();
                bzhz2.getClass();
                bzjc6.f170275i = bzhz2;
                bzjc6.f170267a |= 4096;
                String str7 = str6;
                String valueOf2 = String.valueOf(query.getString(query.getColumnIndex(str7)));
                String str8 = valueOf2.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzjc bzjc7 = (bzjc) da.f164949b;
                str8.getClass();
                bzjc7.f170267a |= 16;
                bzjc7.f170269c = str8;
                arrayList2.add((bzjc) da.mo74062i());
                str3 = str7;
                i = 1;
                i6 = 4;
                i5 = 2;
            }
            return arrayList2;
        } finally {
            query.close();
        }
    }
}
