package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InterestUpdateBatchImpl extends AbstractSafeParcelable implements tjh {
    public static final Parcelable.Creator CREATOR = new tmt();

    /* renamed from: a */
    public final ArrayList f30688a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Operation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new tmu();

        /* renamed from: a */
        public final int f30689a;

        /* renamed from: b */
        public final InterestRecordStub f30690b;

        /* renamed from: c */
        public final String f30691c;

        public Operation(int i, InterestRecordStub interestRecordStub, String str) {
            this.f30689a = i;
            this.f30690b = interestRecordStub;
            this.f30691c = str;
        }

        /* renamed from: a */
        public final InterestRecordStub mo18078a() {
            boolean z = true;
            if (this.f30689a != 1) {
                z = false;
            }
            sdo.m34970a(z);
            return this.f30690b;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
         arg types: [android.os.Parcel, int, java.lang.String, int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 2, this.f30689a);
            see.m35040a(parcel, 3, this.f30690b, i, false);
            see.m35046a(parcel, 4, this.f30691c, false);
            see.m35062b(parcel, a);
        }
    }

    public InterestUpdateBatchImpl() {
        this.f30688a = new ArrayList();
    }

    /* renamed from: a */
    public final rke mo18075a(rkb rkb) {
        tms tms = new tms(this, rkb);
        rkb.mo24787a((rle) tms);
        return tms;
    }

    public InterestUpdateBatchImpl(ArrayList arrayList) {
        this.f30688a = arrayList;
    }

    /* renamed from: a */
    public final void mo18076a(String str, int i, tjw tjw, tjx tjx) {
        dwd dwd = new dwd(str, i, (dwj) tjw);
        if (tjx != null) {
            sdo.m34959a(tjx);
            dwd.f14257e = (dwk) tjx;
            dwd.f14256d = true;
        }
        ArrayList arrayList = this.f30688a;
        sdo.m34975b(dwd.f14256d, "At least one of production, retention, or dispatch policy must be set.");
        bxvd da = bxcx.f163000i.mo74144da();
        bxco b = tiq.m37051b(dwd.f14254b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcx bxcx = (bxcx) da.f164949b;
        bxcx.f163004c = b.f162973bD;
        bxcx.f163002a |= 2;
        bxvd da2 = bxcw.f162994e.mo74144da();
        String str2 = dwd.f14253a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxcw bxcw = (bxcw) da2.f164949b;
        str2.getClass();
        bxcw.f162996a |= 4;
        bxcw.f162999d = str2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcx bxcx2 = (bxcx) da.f164949b;
        bxcw bxcw2 = (bxcw) da2.mo74062i();
        bxcw2.getClass();
        bxcx2.f163009h = bxcw2;
        bxcx2.f163002a |= 64;
        dwk dwk = dwd.f14257e;
        if (dwk != null) {
            bxdf bxdf = dwk.f14274a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxcx bxcx3 = (bxcx) da.f164949b;
            bxdf.getClass();
            bxcx3.f163006e = bxdf;
            bxcx3.f163002a |= 8;
        }
        bxda bxda = dwd.f14255c.f14273a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcx bxcx4 = (bxcx) da.f164949b;
        bxda.getClass();
        bxcx4.f163005d = bxda;
        bxcx4.f163002a |= 4;
        arrayList.add(new Operation(1, new InterestRecordStub((bxcx) da.mo74062i()), null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30688a, false);
        see.m35062b(parcel, a);
    }
}
