package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.CallLog;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aqvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvv extends aqwj {

    /* renamed from: c */
    private String[] f86944c;

    /* renamed from: d */
    private aqqu f86945d;

    public aqvv(Context context, Person person, aqqu aqqu) {
        super(context);
        if (person.mo41006S()) {
            ArrayList a = sqc.m35954a();
            List list = ((PersonImpl) person).f81758y;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(((Person.PhoneNumbers) list.get(i)).mo40985k());
            }
            this.f86944c = (String[]) a.toArray(new String[a.size()]);
            this.f86945d = aqqu;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i;
        String[] strArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        String[] strArr2;
        String str7;
        String str8;
        List list;
        String str9 = "new";
        String str10 = "number";
        String str11 = "type";
        String str12 = "date";
        if ((!getContext().getPackageManager().hasSystemFeature("android.hardware.telephony") && !aqrm.m72014a()) || this.f86944c == null || !this.f86945d.f86622b) {
            return Collections.emptyList();
        }
        if (aqro.f86663a == null) {
            aqro.f86663a = new aqro();
        }
        String[] strArr3 = this.f86944c;
        Context context = getContext();
        ArrayList arrayList = new ArrayList();
        int length = strArr3.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            String str13 = strArr[i4];
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Uri build = CallLog.Calls.CONTENT_FILTER_URI.buildUpon().appendPath(str13).build();
                String[] strArr4 = new String[5];
                strArr4[i3] = str;
                strArr4[1] = str2;
                strArr4[2] = "duration";
                strArr4[3] = str3;
                strArr4[4] = str4;
                bmxv c = bmxv.m108567c(contentResolver.query(build, strArr4, null, null, "date DESC LIMIT 6"));
                if (!c.mo66813a()) {
                    list = bngx.m109376e();
                    str8 = str4;
                    str7 = str3;
                    str6 = str2;
                    str5 = str;
                    strArr2 = strArr;
                    i2 = i;
                } else {
                    Cursor cursor = (Cursor) c.mo66814b();
                    try {
                        if (cursor.getCount() > 0) {
                            cursor.moveToPosition(-1);
                            List arrayList2 = new ArrayList();
                            int columnIndex = cursor.getColumnIndex(str);
                            int columnIndex2 = cursor.getColumnIndex(str4);
                            int columnIndex3 = cursor.getColumnIndex(str2);
                            int columnIndex4 = cursor.getColumnIndex(str3);
                            while (cursor.moveToNext()) {
                                bxvd da = bzjc.f170265j.mo74144da();
                                String str14 = str4;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc = (bzjc) da.f164949b;
                                String str15 = str3;
                                bzjc.f170268b = 3;
                                bzjc.f170267a |= 1;
                                long j = cursor.getLong(columnIndex);
                                String str16 = str2;
                                String str17 = str;
                                long j2 = j / 1000;
                                String[] strArr5 = strArr;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc2 = (bzjc) da.f164949b;
                                int i5 = i;
                                bzjc2.f170267a |= 512;
                                bzjc2.f170273g = j2;
                                String string = cursor.getString(columnIndex4);
                                String a = aqqv.m71996a(j, context);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc3 = (bzjc) da.f164949b;
                                a.getClass();
                                bzjc3.f170267a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                bzjc3.f170272f = a;
                                String valueOf = String.valueOf(string);
                                String str18 = valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc4 = (bzjc) da.f164949b;
                                str18.getClass();
                                bzjc4.f170267a |= 16;
                                bzjc4.f170269c = str18;
                                bxvd da2 = bzhj.f170054d.mo74144da();
                                int i6 = cursor.getInt(columnIndex3);
                                if (i6 == 1) {
                                    bzhi bzhi = bzhi.INCOMING;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bzhj bzhj = (bzhj) da2.f164949b;
                                    bzhj.f170057b = bzhi.f170053f;
                                    bzhj.f170056a |= 1;
                                    String string2 = context.getString(C0126R.string.profile_call_type_incoming);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bzjc bzjc5 = (bzjc) da.f164949b;
                                    string2.getClass();
                                    bzjc5.f170267a |= 128;
                                    bzjc5.f170271e = string2;
                                } else if (i6 == 2) {
                                    bzhi bzhi2 = bzhi.OUTGOING;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bzhj bzhj2 = (bzhj) da2.f164949b;
                                    bzhj2.f170057b = bzhi2.f170053f;
                                    bzhj2.f170056a |= 1;
                                    String string3 = context.getString(C0126R.string.profile_call_type_outgoing);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bzjc bzjc6 = (bzjc) da.f164949b;
                                    string3.getClass();
                                    bzjc6.f170267a |= 128;
                                    bzjc6.f170271e = string3;
                                } else if (i6 == 3) {
                                    bzhi bzhi3 = bzhi.MISSED;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bzhj bzhj3 = (bzhj) da2.f164949b;
                                    bzhj3.f170057b = bzhi3.f170053f;
                                    bzhj3.f170056a |= 1;
                                    String string4 = context.getString(C0126R.string.profile_call_type_missed);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bzjc bzjc7 = (bzjc) da.f164949b;
                                    string4.getClass();
                                    bzjc7.f170267a |= 128;
                                    bzjc7.f170271e = string4;
                                } else if (i6 != 4) {
                                    String string5 = context.getString(C0126R.string.profile_call_type_unknown);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bzjc bzjc8 = (bzjc) da.f164949b;
                                    string5.getClass();
                                    bzjc8.f170267a |= 128;
                                    bzjc8.f170271e = string5;
                                    bzhi bzhi4 = bzhi.UNKNOWN_CALL_LOG_TYPE;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bzhj bzhj4 = (bzhj) da2.f164949b;
                                    bzhj4.f170057b = bzhi4.f170053f;
                                    bzhj4.f170056a |= 1;
                                } else {
                                    str4 = str14;
                                    str3 = str15;
                                    strArr = strArr5;
                                    i = i5;
                                    str2 = str16;
                                    str = str17;
                                }
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bzhj bzhj5 = (bzhj) da2.f164949b;
                                bzhj5.f170058c = 0;
                                bzhj5.f170056a |= 2;
                                if (!cursor.isNull(columnIndex2)) {
                                    if (cursor.getInt(columnIndex2) != 1) {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bzhj bzhj6 = (bzhj) da2.f164949b;
                                        bzhj6.f170058c = 2;
                                        bzhj6.f170056a |= 2;
                                    } else {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bzhj bzhj7 = (bzhj) da2.f164949b;
                                        bzhj7.f170058c = 1;
                                        bzhj7.f170056a |= 2;
                                    }
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc9 = (bzjc) da.f164949b;
                                bzhj bzhj8 = (bzhj) da2.mo74062i();
                                bzhj8.getClass();
                                bzjc9.f170274h = bzhj8;
                                bzjc9.f170267a |= 2048;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc10 = (bzjc) da.f164949b;
                                string.getClass();
                                bzjc10.f170267a |= 32;
                                bzjc10.f170270d = string;
                                arrayList2.add((bzjc) da.mo74062i());
                                str4 = str14;
                                str3 = str15;
                                strArr = strArr5;
                                i = i5;
                                str2 = str16;
                                str = str17;
                            }
                            str8 = str4;
                            str7 = str3;
                            str6 = str2;
                            str5 = str;
                            strArr2 = strArr;
                            i2 = i;
                            cursor.close();
                            list = arrayList2;
                        } else {
                            str8 = str4;
                            str7 = str3;
                            str6 = str2;
                            str5 = str;
                            strArr2 = strArr;
                            i2 = i;
                            list = bngx.m109376e();
                            cursor.close();
                        }
                    } catch (Throwable th) {
                        cursor.close();
                        throw th;
                    }
                }
            } catch (SQLiteException e) {
                str8 = str4;
                str7 = str3;
                str6 = str2;
                str5 = str;
                strArr2 = strArr;
                i2 = i;
                list = bngx.m109376e();
            }
            arrayList.addAll(list);
            i4++;
            str9 = str8;
            str10 = str7;
            strArr3 = strArr2;
            length = i2;
            str11 = str6;
            str12 = str5;
            i3 = 0;
        }
        Collections.sort(arrayList, new aqrn());
        ArrayList arrayList3 = new ArrayList();
        while (i3 < arrayList.size()) {
            if (i3 <= 0 || ((bzjc) arrayList.get(i3)).f170273g != ((bzjc) arrayList.get(i3 - 1)).f170273g) {
                arrayList3.add((bzjc) arrayList.get(i3));
                if (arrayList3.size() >= 6) {
                    return arrayList3;
                }
            }
            i3++;
        }
        return arrayList3;
    }
}
