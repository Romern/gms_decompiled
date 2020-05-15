package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: altz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altz implements alub {

    /* renamed from: a */
    public static final altz f74281a;

    /* renamed from: b */
    public static final altz f74282b = new altz("Data", new alty[]{new alty(ContactsContract.Data.CONTENT_URI, new String[]{"_id", "mimetype", "raw_contact_id", "is_primary", "is_super_primary", "data_version", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2", "data_sync3", "data_sync4"})});

    /* renamed from: c */
    public static final altz f74283c = new altz("SyncState", new alty[]{new alty(ContactsContract.SyncState.CONTENT_URI, new String[]{"_id", "account_name", "account_type", "data"})});

    /* renamed from: d */
    public static final altz f74284d = new altz("Groups", new alty[]{new alty(ContactsContract.Groups.CONTENT_URI, new String[]{"account_type", "account_name", "sourceid", "version", "dirty", "title", "title_res", "notes", "system_id", "deleted", "group_visible", "should_sync", "auto_add", "favorites", "group_is_read_only", "sync1", "sync2", "sync3", "sync4"})});

    /* renamed from: e */
    private final String f74285e;

    /* renamed from: f */
    private final alty[] f74286f;

    static {
        Uri uri = ContactsContract.RawContacts.CONTENT_URI;
        int i = Build.VERSION.SDK_INT;
        f74281a = new altz("RawContacts", new alty[]{new alty(ContactsContract.Data.CONTENT_URI, new String[]{"mimetype", "raw_contact_id", "contact_id", "display_name", "display_name_alt", "data1", "data1", "data2", "data3", "data1", "data2", "data3", "is_primary", "is_super_primary", "data1"}), new alty(uri, new String[]{"last_time_contacted", "pinned", "starred", "times_contacted", "sourceid", "custom_ringtone", "send_to_voicemail", "dirty", "deleted", "starred", "sync1", "sync2", "sync3", "sync4"}, "_id = ?", new String[]{"raw_contact_id"})});
    }

    public altz(String str, alty[] altyArr) {
        this.f74285e = str;
        this.f74286f = altyArr;
    }

    /* renamed from: a */
    private static final String m61864a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 0).trim();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final String mo40784a() {
        return this.f74285e;
    }

    /* renamed from: b */
    public final void mo40785b() {
    }

    /* renamed from: a */
    private final List m61865a(Context context, List list, int i, Map map) {
        String[] strArr;
        String str;
        alty alty = this.f74286f[i];
        String[] strArr2 = alty.f74280d;
        if (strArr2 != null) {
            String[] strArr3 = new String[strArr2.length];
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                strArr3[i2] = (String) list.get(((Integer) map.get(strArr2[i2])).intValue());
            }
            strArr = strArr3;
        } else {
            strArr = new String[0];
        }
        Cursor query = context.getContentResolver().query(Uri.parse(alty.f74277a), alty.f74278b, alty.f74279c, strArr, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            ArrayList arrayList2 = new ArrayList(list);
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < query.getColumnCount(); i3++) {
                int type = query.getType(i3);
                if (type == 0) {
                    str = "NULL";
                } else if (type == 1) {
                    str = Long.toString(query.getLong(i3));
                } else if (type == 2) {
                    str = Double.toString(query.getDouble(i3));
                } else if (type == 3) {
                    str = query.getString(i3);
                } else if (type != 4) {
                    str = String.format("BAD_TYPE(%s)", Integer.valueOf(query.getType(i3)));
                } else {
                    str = m61864a(query.getBlob(i3));
                }
                arrayList3.add(str);
            }
            arrayList2.addAll(arrayList3);
            if (i == this.f74286f.length - 1) {
                bxvd da = amol.f75626b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amol amol = (amol) da.f164949b;
                if (!amol.f75628a.mo73666a()) {
                    amol.f75628a = bxvk.m124021a(amol.f75628a);
                }
                bxsy.m123078a(arrayList2, amol.f75628a);
                arrayList.add((amol) da.mo74062i());
            } else {
                arrayList.addAll(m61865a(context, arrayList2, i + 1, map));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ alua mo40783a(rkb rkb) {
        alty[] altyArr = this.f74286f;
        ArrayList arrayList = new ArrayList();
        for (alty alty : altyArr) {
            int i = 0;
            while (true) {
                String[] strArr = alty.f74278b;
                if (i >= strArr.length) {
                    break;
                }
                arrayList.add(strArr[i]);
                i++;
            }
        }
        bxvd da = amok.f75623b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amok amok = (amok) da.f164949b;
        if (!amok.f75625a.mo73666a()) {
            amok.f75625a = bxvk.m124021a(amok.f75625a);
        }
        bxsy.m123078a(arrayList, amok.f75625a);
        amok amok2 = (amok) da.mo74062i();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < amok2.f75625a.size(); i2++) {
            if (!hashMap.containsKey((String) amok2.f75625a.get(i2))) {
                hashMap.put((String) amok2.f75625a.get(i2), Integer.valueOf(i2));
            }
        }
        return new altx(this.f74285e, amok2, m61865a(((rmx) rkb).f43323c, new ArrayList(), 0, hashMap));
    }
}
