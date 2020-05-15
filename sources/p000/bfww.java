package p000;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: bfww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfww {

    /* renamed from: a */
    public final bfwt f115542a;

    /* renamed from: b */
    public final long f115543b;

    /* renamed from: c */
    public bpms f115544c = bpms.INVALID_STATE;

    /* renamed from: d */
    public long f115545d;

    /* renamed from: e */
    public boolean f115546e = false;

    /* renamed from: f */
    public long f115547f;

    /* renamed from: g */
    public int f115548g = 0;

    /* renamed from: h */
    public int f115549h = 0;

    /* renamed from: i */
    public final C1223np f115550i = new C1223np();

    /* renamed from: j */
    public final C1223np f115551j = new C1223np();

    /* renamed from: k */
    public final bxvd f115552k;

    /* renamed from: l */
    public final bxvd f115553l;

    /* renamed from: m */
    public final bxvd f115554m;

    /* renamed from: n */
    public final bxvd f115555n = bpmm.f138294h.mo74144da();

    /* renamed from: o */
    public final bxvd f115556o = bpmp.f138316d.mo74144da();

    /* renamed from: p */
    private final Random f115557p;

    /* renamed from: q */
    private long f115558q;

    /* renamed from: r */
    private final bfwv f115559r;

    /* renamed from: s */
    private boolean f115560s = false;

    public bfww(Context context, bxvd bxvd, bxvd bxvd2, bxvd bxvd3, bfwv bfwv) {
        bfwt bfwt = new bfwt(context);
        Random random = new Random();
        this.f115542a = bfwt;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f115543b = elapsedRealtime;
        this.f115552k = bxvd;
        this.f115553l = bxvd2;
        this.f115554m = bxvd3;
        this.f115557p = random;
        this.f115559r = bfwv;
        this.f115558q = elapsedRealtime;
        m98101f();
    }

    /* renamed from: a */
    public static final String m98097a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    private final void m98101f() {
        boolean z;
        if (this.f115557p.nextDouble() < cexe.f183489a.mo6606a().geofencerEventsSamplingRate()) {
            z = true;
        } else {
            z = false;
        }
        this.f115560s = z;
        bxvd bxvd = this.f115555n;
        bxvd.f164949b = (GeneratedMessageLite) bxvd.f164949b.mo74142c(4);
        bxvd bxvd2 = this.f115555n;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpmm bpmm = (bpmm) bxvd2.f164949b;
        bpmm bpmm2 = bpmm.f138294h;
        int i = bpmm.f138296a | 1;
        bpmm.f138296a = i;
        bpmm.f138297b = 0;
        int i2 = i | 2;
        bpmm.f138296a = i2;
        bpmm.f138298c = 0;
        int i3 = i2 | 4;
        bpmm.f138296a = i3;
        bpmm.f138299d = 0;
        int i4 = i3 | 8;
        bpmm.f138296a = i4;
        bpmm.f138300e = 0;
        bpmm.f138296a = i4 | 16;
        bpmm.f138301f = 0;
        this.f115550i.clear();
        bxvd bxvd3 = this.f115556o;
        bxvd3.f164949b = (GeneratedMessageLite) bxvd3.f164949b.mo74142c(4);
        bxvd bxvd4 = this.f115556o;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bpmp bpmp = (bpmp) bxvd4.f164949b;
        bpmp bpmp2 = bpmp.f138316d;
        bpmp.f138318a |= 1;
        bpmp.f138320c = 0;
        this.f115551j.clear();
        long j = this.f115558q;
        this.f115545d = j;
        this.f115547f = j;
        this.f115548g = 0;
        this.f115549h = 0;
    }

    /* renamed from: b */
    public final void mo62405b() {
        mo62397a();
        bxvd bxvd = this.f115555n;
        int i = ((bpmm) bxvd.f164949b).f138299d + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpmm bpmm = (bpmm) bxvd.f164949b;
        bpmm bpmm2 = bpmm.f138294h;
        bpmm.f138296a |= 4;
        bpmm.f138299d = i;
    }

    /* renamed from: c */
    public final void mo62406c() {
        mo62397a();
        bxvd bxvd = this.f115555n;
        int i = ((bpmm) bxvd.f164949b).f138300e + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpmm bpmm = (bpmm) bxvd.f164949b;
        bpmm bpmm2 = bpmm.f138294h;
        bpmm.f138296a |= 8;
        bpmm.f138300e = i;
    }

    /* renamed from: d */
    public final boolean mo62407d() {
        mo62397a();
        this.f115548g++;
        if (!this.f115560s || ((long) this.f115549h) >= cexe.f183489a.mo6606a().geofencerMaximumEventsPerPeriod() || this.f115557p.nextDouble() >= cexe.f183489a.mo6606a().geofencerEventsPerDeviceSamplingRate()) {
            return false;
        }
        this.f115549h++;
        return true;
    }

    /* renamed from: e */
    public final bxvd mo62408e() {
        bxvd da = bpmt.f138341m.mo74144da();
        bxvd bxvd = this.f115554m;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmt bpmt = (bpmt) da.f164949b;
        bpmw bpmw = (bpmw) bxvd.mo74062i();
        bpmw.getClass();
        bpmt.f138347e = bpmw;
        bpmt.f138343a |= 8;
        bxvd bxvd2 = this.f115552k;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmt bpmt2 = (bpmt) da.f164949b;
        bpmn bpmn = (bpmn) bxvd2.mo74062i();
        bpmn.getClass();
        bpmt2.f138345c = bpmn;
        bpmt2.f138343a |= 2;
        bxvd bxvd3 = this.f115553l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmt bpmt3 = (bpmt) da.f164949b;
        bpmn bpmn2 = (bpmn) bxvd3.mo74062i();
        bpmn2.getClass();
        bpmt3.f138346d = bpmn2;
        bpmt3.f138343a |= 4;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f115543b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmt bpmt4 = (bpmt) da.f164949b;
        bpmt4.f138343a |= 1;
        bpmt4.f138344b = elapsedRealtime;
        return da;
    }

    /* renamed from: a */
    public static final void m98098a(bfwu bfwu, int i, int i2) {
        C1240of a = C1240of.m19758a(Integer.valueOf(i), Integer.valueOf(i2));
        Integer num = (Integer) bfwu.f115540a.get(a);
        if (num == null) {
            bfwu.f115540a.put(a, 1);
        } else {
            bfwu.f115540a.put(a, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: a */
    public static final void m98099a(PrintWriter printWriter, String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append("    ");
        sb.append(str);
        sb.append(": supported(");
        sb.append(z);
        sb.append("), enabled(");
        sb.append(z2);
        sb.append(")");
        printWriter.println(sb.toString());
    }

    /* renamed from: a */
    private final void m98100a(boolean z, long j) {
        if (!z) {
            bxvd bxvd = this.f115556o;
            long j2 = (((bpmp) bxvd.f164949b).f138320c - this.f115547f) + j;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmp bpmp = (bpmp) bxvd.f164949b;
            bpmp bpmp2 = bpmp.f138316d;
            bpmp.f138318a |= 1;
            bpmp.f138320c = j2;
            return;
        }
        this.f115547f = j;
    }

    /* renamed from: a */
    public final bfwu mo62395a(String str) {
        bfwu bfwu = (bfwu) this.f115550i.get(str);
        if (bfwu != null) {
            return bfwu;
        }
        bfwu bfwu2 = new bfwu(str);
        this.f115550i.put(str, bfwu2);
        return bfwu2;
    }

    /* renamed from: a */
    public final bfwu mo62396a(String str, String str2, int i) {
        bfwu a = mo62395a(m98097a(str, str2));
        bxvd bxvd = a.f115541b;
        if (((bpml) bxvd.f164949b).f138293i < i) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpml bpml = (bpml) bxvd.f164949b;
            bpml bpml2 = bpml.f138283j;
            bpml.f138285a |= 64;
            bpml.f138293i = i;
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfww.a(boolean, long):void
     arg types: [int, long]
     candidates:
      bfww.a(java.lang.String, java.lang.String):java.lang.String
      bfww.a(bpms, long):void
      bfww.a(boolean, long):void */
    /* renamed from: a */
    public final void mo62397a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long geofencerStatsCollectionPeriodMillis = cexe.f183489a.mo6606a().geofencerStatsCollectionPeriodMillis();
        long j = this.f115558q;
        if (elapsedRealtime - j > geofencerStatsCollectionPeriodMillis) {
            mo62400a(this.f115544c, j + geofencerStatsCollectionPeriodMillis);
            if (this.f115546e) {
                m98100a(false, this.f115558q + geofencerStatsCollectionPeriodMillis);
            }
            if (this.f115557p.nextDouble() < cexe.f183489a.mo6606a().geofencerStatsSamplingRate()) {
                bxvd e = mo62408e();
                bxvd da = bpmq.f138321d.mo74144da();
                for (bfwu bfwu : this.f115550i.values()) {
                    for (Map.Entry entry : bfwu.f115540a.entrySet()) {
                        bxvd da2 = bpmk.f138277e.mo74144da();
                        int intValue = ((Integer) ((C1240of) entry.getKey()).f26798a).intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpmk bpmk = (bpmk) da2.f164949b;
                        bpmk.f138279a |= 1;
                        bpmk.f138280b = intValue;
                        int intValue2 = ((Integer) ((C1240of) entry.getKey()).f26799b).intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpmk bpmk2 = (bpmk) da2.f164949b;
                        bpmk2.f138279a |= 2;
                        bpmk2.f138281c = intValue2;
                        int intValue3 = ((Integer) entry.getValue()).intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpmk bpmk3 = (bpmk) da2.f164949b;
                        bpmk3.f138279a |= 4;
                        bpmk3.f138282d = intValue3;
                        bpmk bpmk4 = (bpmk) da2.mo74062i();
                        bxvd bxvd = bfwu.f115541b;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpml bpml = (bpml) bxvd.f164949b;
                        bpml bpml2 = bpml.f138283j;
                        bpmk4.getClass();
                        if (!bpml.f138292h.mo73666a()) {
                            bpml.f138292h = GeneratedMessageLite.m124021a(bpml.f138292h);
                        }
                        bpml.f138292h.add(bpmk4);
                    }
                    bxvd bxvd2 = this.f115555n;
                    bxvd bxvd3 = bfwu.f115541b;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bpmm bpmm = (bpmm) bxvd2.f164949b;
                    bpml bpml3 = (bpml) bxvd3.mo74062i();
                    bpmm bpmm2 = bpmm.f138294h;
                    bpml3.getClass();
                    if (!bpmm.f138302g.mo73666a()) {
                        bpmm.f138302g = GeneratedMessageLite.m124021a(bpmm.f138302g);
                    }
                    bpmm.f138302g.add(bpml3);
                }
                bpmm bpmm3 = (bpmm) this.f115555n.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpmq bpmq = (bpmq) da.f164949b;
                bpmm3.getClass();
                bpmq.f138325c = bpmm3;
                bpmq.f138323a |= 2;
                for (Map.Entry entry2 : this.f115551j.entrySet()) {
                    bxvd da3 = bpmo.f138311d.mo74144da();
                    bpms bpms = (bpms) entry2.getKey();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bpmo bpmo = (bpmo) da3.f164949b;
                    bpmo.f138314b = bpms.f138340m;
                    bpmo.f138313a |= 1;
                    long longValue = ((Long) entry2.getValue()).longValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bpmo bpmo2 = (bpmo) da3.f164949b;
                    bpmo2.f138313a |= 2;
                    bpmo2.f138315c = longValue;
                    bpmo bpmo3 = (bpmo) da3.mo74062i();
                    bxvd bxvd4 = this.f115556o;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bpmp bpmp = (bpmp) bxvd4.f164949b;
                    bpmp bpmp2 = bpmp.f138316d;
                    bpmo3.getClass();
                    if (!bpmp.f138319b.mo73666a()) {
                        bpmp.f138319b = GeneratedMessageLite.m124021a(bpmp.f138319b);
                    }
                    bpmp.f138319b.add(bpmo3);
                }
                bpmp bpmp3 = (bpmp) this.f115556o.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpmq bpmq2 = (bpmq) da.f164949b;
                bpmp3.getClass();
                bpmq2.f138324b = bpmp3;
                bpmq2.f138323a |= 1;
                bpmq bpmq3 = (bpmq) da.mo74062i();
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bpmt bpmt = (bpmt) e.f164949b;
                bpmt bpmt2 = bpmt.f138341m;
                bpmq3.getClass();
                bpmt.f138348f = bpmq3;
                bpmt.f138343a |= 16;
                this.f115542a.mo62394a((bpmt) e.mo74062i());
            }
            while (true) {
                long j2 = this.f115558q;
                if (elapsedRealtime - j2 <= geofencerStatsCollectionPeriodMillis) {
                    ((bfzt) this.f115559r).f115808m.mo62471j();
                    m98101f();
                    this.f115558q = SystemClock.elapsedRealtime();
                    return;
                }
                this.f115558q = j2 + geofencerStatsCollectionPeriodMillis;
            }
        }
    }

    /* renamed from: a */
    public final void mo62398a(int i) {
        mo62397a();
        bxvd bxvd = this.f115555n;
        if (((bpmm) bxvd.f164949b).f138301f < i) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmm bpmm = (bpmm) bxvd.f164949b;
            bpmm bpmm2 = bpmm.f138294h;
            bpmm.f138296a |= 16;
            bpmm.f138301f = i;
        }
    }

    /* renamed from: a */
    public final void mo62399a(bpms bpms, int i, int i2) {
        if (mo62407d()) {
            bxvd e = mo62408e();
            bxvd da = bpmz.f138374e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpmz bpmz = (bpmz) da.f164949b;
            bpmz.f138377b = bpms.f138340m;
            int i3 = bpmz.f138376a | 1;
            bpmz.f138376a = i3;
            int i4 = i3 | 2;
            bpmz.f138376a = i4;
            bpmz.f138378c = ((long) i) * 1000;
            bpmz.f138376a = i4 | 4;
            bpmz.f138379d = ((long) i2) * 1000;
            bpmz bpmz2 = (bpmz) da.mo74062i();
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bpmt bpmt = (bpmt) e.f164949b;
            bpmt bpmt2 = bpmt.f138341m;
            bpmz2.getClass();
            bpmt.f138351i = bpmz2;
            bpmt.f138343a |= 128;
            this.f115542a.mo62394a((bpmt) e.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo62400a(bpms bpms, long j) {
        if (!bpms.equals(bpms.INVALID_STATE)) {
            Long l = (Long) this.f115551j.get(bpms);
            this.f115551j.put(bpms, Long.valueOf(((l != null ? l.longValue() : 0) - this.f115545d) + j));
        }
    }

    /* renamed from: a */
    public final void mo62401a(String str, int i, int i2) {
        if (mo62407d()) {
            bxvd e = mo62408e();
            bxvd da = bpmy.f138368e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpmy bpmy = (bpmy) da.f164949b;
            str.getClass();
            int i3 = 4;
            int i4 = bpmy.f138370a | 4;
            bpmy.f138370a = i4;
            bpmy.f138373d = str;
            if (i == 1) {
                i3 = 2;
            } else if (i != 2) {
                i3 = 3;
            }
            bpmy.f138371b = i3 - 1;
            int i5 = 1 | i4;
            bpmy.f138370a = i5;
            bpmy.f138370a = i5 | 2;
            bpmy.f138372c = i2;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bpmt bpmt = (bpmt) e.f164949b;
            bpmy bpmy2 = (bpmy) da.mo74062i();
            bpmt bpmt2 = bpmt.f138341m;
            bpmy2.getClass();
            bpmt.f138350h = bpmy2;
            bpmt.f138343a |= 64;
            this.f115542a.mo62394a((bpmt) e.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo62402a(String str, GeofencingRequest geofencingRequest, int i, int i2) {
        mo62397a();
        bfwu a = mo62396a(str, geofencingRequest.f79343c, i);
        bxvd bxvd = a.f115541b;
        int i3 = ((bpml) bxvd.f164949b).f138287c + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpml bpml = (bpml) bxvd.f164949b;
        bpml bpml2 = bpml.f138283j;
        bpml.f138285a |= 2;
        bpml.f138287c = i3;
        List list = geofencingRequest.f79341a;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            m98098a(a, ((ParcelableGeofence) list.get(i4)).f79444g, geofencingRequest.f79342b);
        }
        mo62398a(i2);
    }

    /* renamed from: a */
    public final void mo62403a(String str, GeofencingRequest geofencingRequest, List list, Location location) {
        int i;
        List list2;
        int i2;
        GeofencingRequest geofencingRequest2 = geofencingRequest;
        if (mo62407d()) {
            bxvd e = mo62408e();
            bxvd da = bpmi.f138262e.mo74144da();
            C1223np npVar = new C1223np();
            List list3 = geofencingRequest2.f79341a;
            int size = list3.size();
            int i3 = 0;
            while (i3 < size) {
                ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list3.get(i3);
                bxvd da2 = bpmh.f138250k.mo74144da();
                if (location != null) {
                    float[] fArr = new float[1];
                    i2 = i3;
                    list2 = list3;
                    i = size;
                    Location.distanceBetween(location.getLatitude(), location.getLongitude(), parcelableGeofence.f79441d, parcelableGeofence.f79442e, fArr);
                    float f = fArr[0];
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpmh bpmh = (bpmh) da2.f164949b;
                    bpmh.f138252a |= 1;
                    bpmh.f138253b = f;
                } else {
                    list2 = list3;
                    i = size;
                    i2 = i3;
                }
                long j = parcelableGeofence.f79439b;
                float f2 = parcelableGeofence.f79443f;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpmh bpmh2 = (bpmh) da2.f164949b;
                int i4 = bpmh2.f138252a | 2;
                bpmh2.f138252a = i4;
                bpmh2.f138254c = f2;
                int i5 = parcelableGeofence.f79444g;
                int i6 = i4 | 8;
                bpmh2.f138252a = i6;
                bpmh2.f138256e = i5;
                int i7 = parcelableGeofence.f79445h;
                int i8 = i6 | 16;
                bpmh2.f138252a = i8;
                bpmh2.f138257f = (long) i7;
                int i9 = parcelableGeofence.f79446i;
                bpmh2.f138252a = i8 | 32;
                bpmh2.f138258g = (long) i9;
                if (j > 0) {
                    j -= SystemClock.elapsedRealtime();
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpmh bpmh3 = (bpmh) da2.f164949b;
                bpmh3.f138252a |= 128;
                bpmh3.f138260i = j;
                npVar.put(parcelableGeofence.f79438a, da2);
                i3 = i2 + 1;
                list3 = list2;
                size = i;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParcelableGeofence parcelableGeofence2 = ((bfwf) it.next()).f115483a;
                bxvd bxvd = (bxvd) npVar.get(parcelableGeofence2.f79438a);
                if (bxvd != null) {
                    float f3 = parcelableGeofence2.f79443f;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpmh bpmh4 = (bpmh) bxvd.f164949b;
                    bpmh bpmh5 = bpmh.f138250k;
                    int i10 = bpmh4.f138252a | 4;
                    bpmh4.f138252a = i10;
                    bpmh4.f138255d = f3;
                    int i11 = parcelableGeofence2.f79445h;
                    int i12 = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bpmh4.f138252a = i12;
                    bpmh4.f138261j = (long) i11;
                    int i13 = parcelableGeofence2.f79446i;
                    bpmh4.f138252a = i12 | 64;
                    bpmh4.f138259h = (long) i13;
                }
            }
            String a = m98097a(str, geofencingRequest2.f79343c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpmi bpmi = (bpmi) da.f164949b;
            a.getClass();
            int i14 = bpmi.f138264a | 1;
            bpmi.f138264a = i14;
            bpmi.f138265b = a;
            int i15 = geofencingRequest2.f79342b;
            bpmi.f138264a = i14 | 2;
            bpmi.f138266c = i15;
            for (bxvd bxvd2 : npVar.values()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpmi bpmi2 = (bpmi) da.f164949b;
                bpmh bpmh6 = (bpmh) bxvd2.mo74062i();
                bpmh6.getClass();
                if (!bpmi2.f138267d.mo73666a()) {
                    bpmi2.f138267d = GeneratedMessageLite.m124021a(bpmi2.f138267d);
                }
                bpmi2.f138267d.add(bpmh6);
            }
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bpmt bpmt = (bpmt) e.f164949b;
            bpmi bpmi3 = (bpmi) da.mo74062i();
            bpmt bpmt2 = bpmt.f138341m;
            bpmi3.getClass();
            bpmt.f138349g = bpmi3;
            bpmt.f138343a |= 32;
            this.f115542a.mo62394a((bpmt) e.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo62404a(boolean z) {
        mo62397a();
        if (this.f115546e != z) {
            m98100a(z, SystemClock.elapsedRealtime());
            this.f115546e = z;
        }
    }
}
