package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.thunderbird.state.DeviceState;
import java.util.Iterator;
import java.util.List;

/* renamed from: auhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhk {

    /* renamed from: a */
    public String f91818a;

    /* renamed from: b */
    public boolean f91819b;

    /* renamed from: c */
    private final int f91820c;

    /* renamed from: d */
    private String f91821d;

    /* renamed from: e */
    private String f91822e;

    /* renamed from: f */
    private String f91823f;

    /* renamed from: g */
    private String f91824g;

    /* renamed from: h */
    private String f91825h;

    /* renamed from: i */
    private String f91826i;

    public auhk() {
        this.f91820c = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final DeviceState mo50527a() {
        return new DeviceState(this.f91820c, this.f91821d, this.f91822e, this.f91823f, this.f91818a, this.f91819b, this.f91824g, this.f91825h, this.f91826i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
    public auhk(Context context, int i) {
        CellInfoGsm cellInfoGsm;
        this.f91820c = i;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int i2 = Build.VERSION.SDK_INT;
        telephonyManager = i != Integer.MAX_VALUE ? telephonyManager.createForSubscriptionId(i) : telephonyManager;
        try {
            int i3 = Build.VERSION.SDK_INT;
            this.f91821d = telephonyManager.getImei();
            this.f91822e = telephonyManager.getSubscriberId();
            this.f91823f = telephonyManager.getSimSerialNumber();
            this.f91818a = telephonyManager.getLine1Number();
        } catch (SecurityException e) {
            Log.w("Thunderbird", "cannot retrieve device state - lost permission", e);
        }
        String str = this.f91818a;
        String str2 = null;
        if (str != null) {
            String trim = str.trim();
            this.f91818a = trim;
            if (trim.isEmpty()) {
                this.f91818a = null;
            }
        }
        this.f91819b = this.f91818a != null;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        if (this.f91824g == null) {
            this.f91824g = DeviceState.m93364a(telephonyManager.getSimOperator(), null);
        }
        int i6 = Build.VERSION.SDK_INT;
        try {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                Iterator<CellInfo> it = allCellInfo.iterator();
                cellInfoGsm = null;
                while (true) {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        CellInfo next = it.next();
                        if (next.isRegistered()) {
                            try {
                                if (next instanceof CellInfoLte) {
                                    cellInfoGsm = next;
                                    break;
                                }
                                cellInfoGsm = next;
                            } catch (SecurityException e2) {
                                e = e2;
                                cellInfoGsm = next;
                                Log.w("Thunderbird", "cannot retrieve all cell info - lost permission", e);
                                this.f91825h = DeviceState.m93364a(telephonyManager.getNetworkOperator(), cellInfoGsm);
                                if (cellInfoGsm != null) {
                                }
                                this.f91826i = str2;
                            }
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        Log.w("Thunderbird", "cannot retrieve all cell info - lost permission", e);
                        this.f91825h = DeviceState.m93364a(telephonyManager.getNetworkOperator(), cellInfoGsm);
                        if (cellInfoGsm != null) {
                        }
                        this.f91826i = str2;
                    }
                }
            } else {
                cellInfoGsm = null;
            }
        } catch (SecurityException e4) {
            e = e4;
            cellInfoGsm = null;
            Log.w("Thunderbird", "cannot retrieve all cell info - lost permission", e);
            this.f91825h = DeviceState.m93364a(telephonyManager.getNetworkOperator(), cellInfoGsm);
            if (cellInfoGsm != null) {
            }
            this.f91826i = str2;
        }
        this.f91825h = DeviceState.m93364a(telephonyManager.getNetworkOperator(), cellInfoGsm);
        if (cellInfoGsm != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (cellInfoGsm instanceof CellInfoGsm) {
                CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
                int lac = cellIdentity.getLac();
                int cid = cellIdentity.getCid();
                StringBuilder sb = new StringBuilder(23);
                sb.append(lac);
                sb.append(":");
                sb.append(cid);
                str2 = sb.toString();
            } else if (cellInfoGsm instanceof CellInfoLte) {
                CellIdentityLte cellIdentity2 = ((CellInfoLte) cellInfoGsm).getCellIdentity();
                int tac = cellIdentity2.getTac();
                int ci = cellIdentity2.getCi();
                StringBuilder sb2 = new StringBuilder(23);
                sb2.append(tac);
                sb2.append(":");
                sb2.append(ci);
                str2 = sb2.toString();
            } else if (cellInfoGsm instanceof CellInfoCdma) {
                CellIdentityCdma cellIdentity3 = ((CellInfoCdma) cellInfoGsm).getCellIdentity();
                int systemId = cellIdentity3.getSystemId();
                int networkId = cellIdentity3.getNetworkId();
                int basestationId = cellIdentity3.getBasestationId();
                StringBuilder sb3 = new StringBuilder(35);
                sb3.append(systemId);
                sb3.append(":");
                sb3.append(networkId);
                sb3.append(":");
                sb3.append(basestationId);
                str2 = sb3.toString();
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (cellInfoGsm instanceof CellInfoWcdma) {
                    CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfoGsm).getCellIdentity();
                    int lac2 = cellIdentity4.getLac();
                    int cid2 = cellIdentity4.getCid();
                    StringBuilder sb4 = new StringBuilder(23);
                    sb4.append(lac2);
                    sb4.append(":");
                    sb4.append(cid2);
                    str2 = sb4.toString();
                }
            }
        }
        this.f91826i = str2;
    }

    public auhk(DeviceState deviceState) {
        this.f91820c = deviceState.f109077a;
        this.f91821d = deviceState.f109078b;
        this.f91822e = deviceState.f109079c;
        this.f91823f = deviceState.f109080d;
        this.f91818a = deviceState.f109081e;
        this.f91819b = deviceState.f109082f;
        this.f91824g = deviceState.f109083g;
        this.f91825h = deviceState.f109084h;
        this.f91826i = deviceState.f109085i;
    }
}
