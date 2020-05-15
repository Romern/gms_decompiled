package com.google.android.gms.autofill.datasource.chromesync.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import com.google.android.gms.autofill.data.PaymentCard;
import java.time.YearMonth;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PurchaseManagerResultTransformer implements DataIntent$ResultTransformer {
    public static final Parcelable.Creator CREATOR = new khm();

    /* renamed from: a */
    public static final srn f11619a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    final String f11620b;

    /* renamed from: c */
    final YearMonth f11621c;

    /* renamed from: d */
    final int f11622d;

    /* renamed from: e */
    final kdg f11623e;

    public PurchaseManagerResultTransformer(String str, YearMonth yearMonth, kdg kdg, int i) {
        this.f11620b = str;
        this.f11621c = yearMonth;
        this.f11623e = kdg;
        this.f11622d = i;
    }

    /* renamed from: a */
    public final Object mo7934a(int i, Intent intent) {
        kdj kdj;
        kdj kdj2;
        if (i == -1) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.firstparty.REAL_PAN");
            if (!TextUtils.isEmpty(stringExtra)) {
                kdj = new kdj(stringExtra);
            } else {
                kdj = null;
            }
            if (kdj != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.SECURE_DATA_RESULT");
                if (byteArrayExtra != null) {
                    try {
                        bxwc bxwc = ((bwel) GeneratedMessageLite.m124014a(bwel.f159000b, byteArrayExtra)).f159002a;
                        int size = bxwc.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            bwek bwek = (bwek) bxwc.get(i2);
                            if (bwek.f158998b == 1) {
                                String str = bwek.f158999c;
                                if (!TextUtils.isEmpty(str)) {
                                    kdj2 = new kdj(str);
                                    break;
                                }
                            }
                            i2++;
                        }
                    } catch (bxwf e) {
                        bnsl bnsl = (bnsl) f11619a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68448m();
                        kdj2 = null;
                    }
                    return new PaymentCard(kdj, kdj2, this.f11620b, this.f11621c, this.f11623e, this.f11622d);
                }
                kdj2 = null;
                return new PaymentCard(kdj, kdj2, this.f11620b, this.f11621c, this.f11623e, this.f11622d);
            }
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f11620b;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.f11621c);
        parcel.writeByteArray(this.f11623e.mo73642k());
        parcel.writeInt(this.f11622d);
    }
}
