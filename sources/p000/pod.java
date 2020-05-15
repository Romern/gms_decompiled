package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: pod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pod {

    /* renamed from: a */
    private static final qav f39902a = new qav("SQLiteContract");

    /* renamed from: a */
    static ContentValues m30941a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("network_id", str);
        contentValues.put("device_id", str2);
        return contentValues;
    }

    /* renamed from: b */
    public static String m30948b(String str, String str2) {
        return m30946a(str, "INTEGER", str2);
    }

    /* renamed from: c */
    public static String m30950c(String str, String str2) {
        return m30946a(str, "TEXT", str2);
    }

    /* renamed from: d */
    static pnp m30952d(Cursor cursor) {
        boolean z = false;
        String string = cursor.getString(0);
        if (cursor.getInt(1) == 1) {
            z = true;
        }
        return new pnp(string, z, cursor.getLong(2));
    }

    /* renamed from: e */
    static C1240of m30953e(Cursor cursor) {
        pnq pnq = new pnq();
        pnq.f39867c = cursor.getString(1);
        pnq.f39870f = cursor.getString(2);
        return new C1240of(cursor.getString(0), pnq);
    }

    /* renamed from: f */
    static C1240of m30954f(Cursor cursor) {
        boolean z;
        String string = cursor.getString(0);
        int i = cursor.getInt(1);
        String string2 = cursor.getString(2);
        if (cursor.getInt(3) == 1) {
            z = true;
        } else {
            z = false;
        }
        long j = (long) cursor.getInt(4);
        int i2 = cursor.getInt(5);
        int i3 = cursor.getInt(6);
        try {
            return new C1240of(new InetSocketAddress(string, i), new pno(string2, z, j, i2, i3));
        } catch (IllegalArgumentException | SecurityException e) {
            f39902a.mo23674b(e, "Failed to create InetSocketAddress", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    static ContentValues m30942a(String str, pnq pnq) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("DEVICE_ID", str);
        contentValues.put("BSSID", pnq.f39867c);
        contentValues.put("CACHED_PIN", pnq.f39870f);
        return contentValues;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0148 A[SYNTHETIC, Splitter:B:65:0x0148] */
    /* renamed from: b */
    static pnm m30949b(Cursor cursor) {
        InetAddress inetAddress;
        pnm pnm;
        byte[] blob;
        if (cursor.isNull(0)) {
            return null;
        }
        String string = cursor.getString(0);
        if (!cursor.isNull(7)) {
            try {
                inetAddress = InetAddress.getByName(cursor.getString(7));
            } catch (UnknownHostException e) {
            }
            pet a = CastDevice.m22256a(string, inetAddress);
            if (!cursor.isNull(1)) {
                a.f38999g = cursor.getInt(1);
            }
            if (!cursor.isNull(2)) {
                a.f38996d = cursor.getString(2);
            }
            if (!cursor.isNull(3)) {
                a.f38994b = cursor.getString(3);
            }
            if (!cursor.isNull(5)) {
                a.f38995c = cursor.getString(5);
            }
            if (!cursor.isNull(6)) {
                a.f39002j = cursor.getString(6);
            }
            if (!cursor.isNull(8)) {
                a.f38997e = cursor.getInt(8);
            }
            if (!cursor.isNull(9)) {
                a.f39001i = cursor.getString(9);
            }
            if (!cursor.isNull(12)) {
                a.f39003k = cursor.getInt(12);
            }
            if (!cursor.isNull(13)) {
                a.f39004l = cursor.getString(13);
            }
            if (!cursor.isNull(14)) {
                int i = cursor.getInt(14);
                a.f39005m = new byte[]{(byte) (i >> 8), (byte) i};
            }
            if (!cursor.isNull(16)) {
                a.f39006n = cursor.getString(16);
            }
            pnm = new pnm(a.mo22985a());
            if (!cursor.isNull(4)) {
                pnm.f39850g = cursor.getLong(4);
            }
            if (!cursor.isNull(10)) {
                pnm.f39849f = cursor.getLong(10);
            }
            if (!cursor.isNull(11)) {
                String[] split = TextUtils.split(cursor.getString(11), ",");
                HashSet hashSet = new HashSet();
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    }
                }
                pnm.mo23498a(hashSet, Collections.emptySet());
            }
            if (!cursor.isNull(15)) {
                pnm.f39848e = new pnk(cursor.getLong(15));
            }
            if (pze.f40729a && !cursor.isNull(17)) {
                blob = cursor.getBlob(17);
                if (blob != null) {
                    try {
                        if (blob.length != 0) {
                            pnm.f39855l = (bsib) GeneratedMessageLite.m124016a(bsib.f144654f, blob, bxus.m123744c());
                        }
                    } catch (bxwf e2) {
                        f39902a.mo23677d("Stored relay access token is invalid", e2);
                    }
                }
                pnm.f39855l = null;
            }
            return pnm;
        }
        inetAddress = null;
        pet a2 = CastDevice.m22256a(string, inetAddress);
        if (!cursor.isNull(1)) {
        }
        if (!cursor.isNull(2)) {
        }
        if (!cursor.isNull(3)) {
        }
        if (!cursor.isNull(5)) {
        }
        if (!cursor.isNull(6)) {
        }
        if (!cursor.isNull(8)) {
        }
        if (!cursor.isNull(9)) {
        }
        if (!cursor.isNull(12)) {
        }
        if (!cursor.isNull(13)) {
        }
        if (!cursor.isNull(14)) {
        }
        if (!cursor.isNull(16)) {
        }
        pnm = new pnm(a2.mo22985a());
        if (!cursor.isNull(4)) {
        }
        if (!cursor.isNull(10)) {
        }
        if (!cursor.isNull(11)) {
        }
        if (!cursor.isNull(15)) {
        }
        blob = cursor.getBlob(17);
        if (blob != null) {
        }
        pnm.f39855l = null;
        return pnm;
    }

    /* renamed from: c */
    static C1240of m30951c(Cursor cursor) {
        return new C1240of(cursor.getString(1), cursor.getString(2));
    }

    /* renamed from: a */
    static ContentValues m30943a(InetSocketAddress inetSocketAddress, pno pno) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_name", inetSocketAddress.getHostName());
        contentValues.put("port", Integer.valueOf(inetSocketAddress.getPort()));
        contentValues.put("network_id", pno.f39857a);
        contentValues.put("is_responding_to_probe", Integer.valueOf(pno.f39858b ? 1 : 0));
        contentValues.put("last_probed_timestamp_millis", Long.valueOf(pno.f39859c));
        contentValues.put("probing_error_code", Integer.valueOf(pno.f39860d));
        contentValues.put("number_of_probed_times", Integer.valueOf(pno.f39861e));
        return contentValues;
    }

    /* renamed from: a */
    static ContentValues m30944a(pnm pnm) {
        CastDevice castDevice = pnm.f39844a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("device_id", castDevice.mo17494a());
        int i = castDevice.f29720h;
        if (i > 0) {
            contentValues.put("capabilities", Integer.valueOf(i));
        }
        contentValues.put("device_version", castDevice.f29718f);
        contentValues.put("friendly_name", castDevice.f29716d);
        long j = pnm.f39850g;
        if (j > 0) {
            contentValues.put("last_published_timestamp_millis", Long.valueOf(j));
        }
        contentValues.put("model_name", castDevice.f29717e);
        contentValues.put("receiver_metrics_id", castDevice.f29723k);
        InetAddress inetAddress = castDevice.f29715c;
        if (inetAddress != null) {
            contentValues.put("service_address", inetAddress.getHostAddress());
        }
        contentValues.put("service_port", Integer.valueOf(castDevice.f29719g));
        contentValues.put("service_instance_name", castDevice.f29722j);
        long j2 = pnm.f39849f;
        if (j2 > 0) {
            contentValues.put("last_discovered_timestamp_millis", Long.valueOf(j2));
        }
        contentValues.put("supported_criteria", TextUtils.join(",", pnm.f39845b));
        contentValues.put("rcn_enabled_status", Integer.valueOf(castDevice.f29724l));
        String str = castDevice.f29725m;
        if (str != null) {
            contentValues.put("hotspot_bssid", str);
        }
        byte[] bArr = castDevice.f29726n;
        if (bArr != null) {
            contentValues.put("ip_lowest_two_bytes", Integer.valueOf((bArr[0] << 8) + bArr[1]));
        }
        pnk pnk = pnm.f39848e;
        if (pnk != null) {
            contentValues.put("last_discovered_by_ble_timestamp_millis", Long.valueOf(pnk.f39830b));
        }
        String str2 = castDevice.f29727o;
        if (str2 != null) {
            contentValues.put("cloud_devcie_id", str2);
        }
        bsib bsib = pnm.f39855l;
        if (bsib != null) {
            contentValues.put("relay_access_token", bsib.serializeToBytes());
        }
        return contentValues;
    }

    /* renamed from: a */
    static ContentValues m30945a(poe poe) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("network_id", poe.f39903a);
        contentValues.put("last_connected_timestamp_millis", Long.valueOf(poe.f39904b));
        return contentValues;
    }

    /* renamed from: a */
    public static String m30946a(String str, String str2, String str3) {
        if (str3 != null) {
            return String.format(Locale.ROOT, "%s %s %s", str, str2, str3);
        }
        return String.format(Locale.ROOT, "%s %s", str, str2);
    }

    /* renamed from: a */
    static poe m30947a(Cursor cursor) {
        poe poe = new poe(cursor.getString(0));
        poe.f39904b = (long) cursor.getInt(1);
        return poe;
    }
}
