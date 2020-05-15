package p000;

import android.database.Cursor;
import android.net.NetworkKey;
import android.net.RssiCurve;
import android.net.WifiKey;
import java.sql.Timestamp;

/* renamed from: akna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akna {

    /* renamed from: a */
    public final NetworkKey f72285a;

    /* renamed from: b */
    public final RssiCurve f72286b;

    /* renamed from: c */
    public final RssiCurve f72287c;

    /* renamed from: d */
    public final Integer f72288d;

    /* renamed from: e */
    final Timestamp f72289e;

    /* renamed from: f */
    public final Timestamp f72290f;

    /* renamed from: g */
    final boolean f72291g;

    public akna(String str, String str2, RssiCurve rssiCurve, RssiCurve rssiCurve2, Integer num, Timestamp timestamp, Timestamp timestamp2, boolean z) {
        this.f72285a = new NetworkKey(new WifiKey(str2, str));
        this.f72286b = rssiCurve;
        this.f72287c = rssiCurve2;
        this.f72288d = num;
        this.f72289e = timestamp;
        this.f72290f = timestamp2;
        this.f72291g = z;
    }

    /* renamed from: a */
    static akna m60065a(akmx akmx, Cursor cursor) {
        RssiCurve rssiCurve;
        boolean z;
        String b = akmx.mo39563b(cursor.getString(0));
        String b2 = akmx.mo39563b(cursor.getString(1));
        RssiCurve a = akmv.m60033a(m60066a(cursor, 2));
        cafg b3 = akmv.m60037b(m60066a(cursor, 3));
        String Q = cfpd.f185332a.mo6606a().mo82433Q();
        Integer num = null;
        if (akmp.f72270g.containsKey(Q)) {
            rssiCurve = akmp.m60020a(b3, (bmxj) akmp.f72270g.get(Q));
        } else {
            eoa.m10828c("Unknown ThroughputCurve transformation key %s ignored.", Q, new Object[0]);
            rssiCurve = akmp.m60020a(b3, null);
        }
        if (!cursor.isNull(4)) {
            num = Integer.valueOf(cursor.getInt(4));
        }
        Timestamp b4 = m60067b(cursor, 5);
        Timestamp b5 = m60067b(cursor, 6);
        if (cursor.getInt(7) == 1) {
            z = true;
        } else {
            z = false;
        }
        return new akna(b, b2, a, rssiCurve, num, b4, b5, z);
    }

    /* renamed from: b */
    private static Timestamp m60067b(Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            return new Timestamp(cursor.getLong(i));
        }
        return null;
    }

    public final String toString() {
        String a = eoa.m10821a(mo39581a(), cfpd.m142365e());
        String a2 = eoa.m10821a(mo39582b(), cfpd.m142365e());
        String valueOf = String.valueOf(this.f72286b);
        String valueOf2 = String.valueOf(this.f72287c);
        String valueOf3 = String.valueOf(this.f72288d);
        String valueOf4 = String.valueOf(this.f72289e);
        String valueOf5 = String.valueOf(this.f72290f);
        boolean z = this.f72291g;
        String c = akmk.m60019c(mo39581a());
        String b = akmk.m60017b(mo39581a(), mo39582b());
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 172 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(c).length() + String.valueOf(b).length());
        sb.append("WifiBssid{ssid='");
        sb.append(a);
        sb.append("', bssid=");
        sb.append(a2);
        sb.append(", qualityScoreCurve=");
        sb.append(valueOf);
        sb.append(", badgingCurve=");
        sb.append(valueOf2);
        sb.append(", captivePortal=");
        sb.append(valueOf3);
        sb.append(", requestedTimestamp=");
        sb.append(valueOf4);
        sb.append(", updatedTimestamp=");
        sb.append(valueOf5);
        sb.append(", waitingForUpdate=");
        sb.append(z);
        sb.append("},{ssidHash:\"");
        sb.append(c);
        sb.append("\",ssidBssidHash:\"");
        sb.append(b);
        sb.append("\"}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo39582b() {
        return this.f72285a.wifiKey.bssid;
    }

    /* renamed from: a */
    private static String m60066a(Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            return cursor.getString(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo39581a() {
        return this.f72285a.wifiKey.ssid;
    }
}
