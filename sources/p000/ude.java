package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.internal.GetChangesRequest;
import com.google.android.gms.drive.internal.OnChangesResponse;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ude */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ude extends uch {

    /* renamed from: f */
    private static final sbw f47292f = new sbw("GetChangesOperation", "");

    /* renamed from: g */
    private final GetChangesRequest f47293g;

    public ude(ubk ubk, GetChangesRequest getChangesRequest, uto uto) {
        super("GetChangesOperation", ubk, uto, 40);
        this.f47293g = getChangesRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: d */
    public final void mo27234d(Context context) {
        int i;
        OnChangesResponse onChangesResponse;
        boolean z;
        vpe vpe;
        Cursor a;
        OnChangesResponse onChangesResponse2;
        Long l;
        int i2;
        uig a2;
        Cursor a3;
        aaal.m21020a(this.f47293g, "Invalid changes request: no request");
        GetChangesRequest getChangesRequest = this.f47293g;
        ChangeSequenceNumber changeSequenceNumber = getChangesRequest.f30851a;
        int i3 = getChangesRequest.f30852b;
        aaal.m21020a(changeSequenceNumber, "Invalid changes request: from sequence number cannot be null");
        aaal.m21021a(i3 > 0, "Invalid changes request: max results must be > 0");
        ubk ubk = this.f47237a;
        HashSet hashSet = new HashSet(this.f47293g.f30853c);
        boolean z2 = this.f47293g.f30854d;
        uey uey = ubk.f47143d;
        uih uih = uey.f47394a;
        Set a4 = vpv.m41035a(uey, hashSet);
        if (changeSequenceNumber.f30717b == ubk.f47149j.mo27481g() && changeSequenceNumber.f30718c == uih.f47683b) {
            long j = changeSequenceNumber.f30716a;
            ubk.f47144e.mo27435d();
            try {
                if (j < ubk.f47144e.mo27418b(uih.f47682a).f47687b) {
                    ubk.f47144e.mo27439e();
                    i = i3;
                    onChangesResponse = null;
                } else {
                    uhj uhj = ((ugx) ubk.f47144e).f47578a;
                    unp unp = ukm.SEQUENCE_NUMBER.f48022aB;
                    a = uhj.mo27469a("EntryView", new String[]{unp.mo27700a()}, uoh.m39066a(voz.m40974b(uih.f47683b), unp.mo27712c(j)), String.valueOf(unp.mo27700a()).concat(" ASC"), String.valueOf(i3));
                    if (!a.moveToLast()) {
                        a.close();
                        i = i3;
                        uog a5 = uoh.m39066a(voz.m40974b(uih.f47683b), unp.mo27717e(j));
                        String[] strArr = {unp.mo27700a()};
                        onChangesResponse2 = null;
                        a3 = uhj.mo27468a("EntryView", strArr, a5, (String) null);
                        if (a3.moveToFirst()) {
                            l = Long.valueOf(a3.getLong(0));
                            a3.close();
                        } else {
                            a3.close();
                            l = null;
                        }
                    } else {
                        i = i3;
                        onChangesResponse2 = null;
                        l = Long.valueOf(a.getLong(0));
                        a.close();
                    }
                    if (l != null) {
                        unp unp2 = ukm.SEQUENCE_NUMBER.f48022aB;
                        uog a6 = uoh.m39066a(unp2.mo27712c(j), unp2.mo27707b(l.longValue()));
                        String concat = String.valueOf(unp2.mo27700a()).concat(" ASC");
                        uih uih2 = uih;
                        uey uey2 = uey;
                        vpe a7 = ubk.f47144e.mo27409a(uey, a4, a6, concat, bnon.f131923a, true, ubk.mo27105l(), z2);
                        try {
                            uog f = ukm.IS_DELETED.f48022aB.mo27719f();
                            if (z2) {
                                i2 = 2;
                            } else {
                                i2 = 2;
                                f = uoh.m39072b(f, ukm.SUBSCRIBED.f48022aB.mo27711c());
                            }
                            uhn uhn = ubk.f47144e;
                            uog[] uogArr = new uog[i2];
                            uogArr[0] = a6;
                            uogArr[1] = f;
                            a2 = uhn.mo27395a(uey2, a4, uoh.m39066a(uogArr));
                            ArrayList arrayList = new ArrayList(a2.size());
                            Iterator it = a2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ujx) it.next()).mo27610g());
                            }
                            a2.close();
                            ChangeSequenceNumber changeSequenceNumber2 = new ChangeSequenceNumber(l.longValue(), ubk.f47149j.mo27481g(), uih2.f47683b);
                            OnChangesResponse onChangesResponse3 = new OnChangesResponse(a7.f49703a, arrayList, changeSequenceNumber2, !changeSequenceNumber2.equals(ubk.mo27104k()));
                            ubk.f47144e.mo27442f();
                            ubk.f47144e.mo27439e();
                            onChangesResponse = onChangesResponse3;
                        } catch (Throwable th) {
                            if (a7 != null) {
                                a7.mo28719a();
                            }
                            throw th;
                        }
                    } else {
                        ubk.f47137a.mo25371b("Invalid from sequence number");
                        ubk.f47144e.mo27439e();
                        onChangesResponse = onChangesResponse2;
                    }
                }
            } catch (Throwable th2) {
                ubk.f47144e.mo27439e();
                throw th2;
            }
        } else {
            i = i3;
            onChangesResponse = null;
        }
        vcy vcy = this.f47239c;
        boolean z3 = onChangesResponse == null;
        vdk vdk = (vdk) vcy;
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setGetChangesDetails() twice");
        bxvd bxvd = vdk.f49080e;
        bxvd da = bkza.f125541d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkza bkza = (bkza) da.f164949b;
        int i4 = bkza.f125543a | 1;
        bkza.f125543a = i4;
        bkza.f125544b = i;
        bkza.f125543a = i4 | 2;
        bkza.f125545c = z3;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkza bkza2 = (bkza) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkza2.getClass();
        bkzo.f125667y = bkza2;
        bkzo.f125643a |= 4194304;
        if (onChangesResponse != null) {
            try {
                this.f47238b.mo27974a(onChangesResponse);
                if (onChangesResponse.f30754a) {
                    vpe = new vpe(onChangesResponse.f30868b);
                    vpe.mo28719a();
                }
            } catch (RemoteException e) {
                spn.m35858a(e);
                f47292f.mo25372b("GetChangesOperation", "Cannot pass complete response over binder!");
                mo6503a(Status.f30109c);
                vpe = new vpe(onChangesResponse.f30868b);
            } catch (Throwable th3) {
                new vpe(onChangesResponse.f30868b).mo28719a();
                throw th3;
            }
        } else {
            throw new aaaj(1506, "Full sync using the Query API is required");
        }
    }
}
