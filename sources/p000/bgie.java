package p000;

import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: bgie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgie {
    /* renamed from: a */
    public static bfmk m98989a(long j, CellInfoCdma cellInfoCdma, Collection collection) {
        int i;
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        if (cellSignalStrength != null) {
            i = cellSignalStrength.getDbm();
        } else {
            i = -9999;
        }
        return new bfmk(j, cellIdentity.getBasestationId(), cellIdentity.getSystemId(), cellIdentity.getNetworkId(), i, collection, cellIdentity.getLatitude(), cellIdentity.getLongitude());
    }

    /* renamed from: a */
    protected static bfna m98990a(long j, CellInfoLte cellInfoLte, Collection collection, Collection collection2) {
        int i;
        int i2;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        if (cellSignalStrength != null) {
            int dbm = cellSignalStrength.getDbm();
            i2 = cellSignalStrength.getTimingAdvance();
            i = dbm;
        } else {
            i2 = -1;
            i = -9999;
        }
        int mcc = cellIdentity.getMcc();
        int mnc = cellIdentity.getMnc();
        int ci = cellIdentity.getCi();
        int pci = cellIdentity.getPci();
        int tac = cellIdentity.getTac();
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        hashSet.addAll(collection2);
        return new bfna(j, mcc, mnc, ci, pci, tac, i2, i, hashSet);
    }

    /* renamed from: a */
    static bfnd m98991a(long j, CellInfoNr cellInfoNr, Collection collection) {
        CellIdentity cellIdentity = cellInfoNr.getCellIdentity();
        if (cellIdentity instanceof CellIdentityNr) {
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity;
            String mccString = cellIdentityNr.getMccString();
            String mncString = cellIdentityNr.getMncString();
            if (!(mccString == null || mncString == null)) {
                try {
                    int parseInt = Integer.parseInt(mccString);
                    int parseInt2 = Integer.parseInt(mncString);
                    CellSignalStrength cellSignalStrength = cellInfoNr.getCellSignalStrength();
                    if (cellSignalStrength instanceof CellSignalStrengthNr) {
                        return new bfnd(j, parseInt, parseInt2, cellIdentityNr.getNci(), cellIdentityNr.getPci(), cellIdentityNr.getTac(), ((CellSignalStrengthNr) cellSignalStrength).getSsRsrp(), collection);
                    }
                    return null;
                } catch (NumberFormatException e) {
                }
            }
        }
        return null;
    }
}
