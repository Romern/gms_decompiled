package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgki extends bgkh {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bfmn mo62942a(List list, long j, Collection collection) {
        int i;
        bfmn bfmn;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        ArrayList arrayList;
        HashSet hashSet4;
        HashSet hashSet5;
        HashSet hashSet6;
        int i2;
        int i3;
        HashSet hashSet7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j2 = j;
        Collection collection2 = collection;
        if (list == null) {
            return null;
        }
        Collection collection3 = bfmn.f114411a;
        Iterator it = list.iterator();
        CellInfoLte cellInfoLte = null;
        CellInfoCdma cellInfoCdma = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        CellInfoGsm cellInfoGsm = null;
        CellInfoWcdma cellInfoWcdma = null;
        ArrayList arrayList7 = null;
        while (true) {
            i = Integer.MAX_VALUE;
            if (!it.hasNext()) {
                break;
            }
            CellInfo cellInfo = (CellInfo) it.next();
            if (cellInfo instanceof CellInfoLte) {
                CellInfoLte cellInfoLte2 = (CellInfoLte) cellInfo;
                CellIdentityLte cellIdentity = cellInfoLte2.getCellIdentity();
                if (cellIdentity == null || cellIdentity.getPci() == Integer.MAX_VALUE) {
                    String valueOf = String.valueOf(cellIdentity);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    sb.append("Rejecting CellIdentity of ");
                    sb.append(valueOf);
                    sb.toString();
                } else if (!cellInfoLte2.isRegistered()) {
                    if (collection3 == bfmn.f114411a) {
                        collection3 = new ArrayList(list.size());
                    }
                    collection3.add(bgie.m98990a(j2, cellInfoLte2, bfmn.f114411a, bfmn.f114411a));
                } else if (cellIdentity.getCi() == Integer.MAX_VALUE || cellIdentity.getPci() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE || cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getTac() == Integer.MAX_VALUE) {
                    String valueOf2 = String.valueOf(cellInfoLte2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                    sb2.append("Rejecting LTE primary cell ");
                    sb2.append(valueOf2);
                    sb2.toString();
                } else {
                    cellInfoLte = cellInfoLte2;
                }
            } else if (cellInfo instanceof CellInfoWcdma) {
                CellInfoWcdma cellInfoWcdma2 = (CellInfoWcdma) cellInfo;
                if (cellInfoWcdma2.isRegistered()) {
                    cellInfoWcdma = cellInfoWcdma2;
                } else {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList(list.size());
                    }
                    arrayList7.add(cellInfoWcdma2);
                }
            } else if (cellInfo instanceof CellInfoGsm) {
                CellInfoGsm cellInfoGsm2 = (CellInfoGsm) cellInfo;
                if (cellInfoGsm2.isRegistered()) {
                    cellInfoGsm = cellInfoGsm2;
                } else {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList(list.size());
                    }
                    arrayList6.add(cellInfoGsm2);
                }
            } else if (cellInfo instanceof CellInfoCdma) {
                CellInfoCdma cellInfoCdma2 = (CellInfoCdma) cellInfo;
                if (cellInfoCdma2.isRegistered()) {
                    cellInfoCdma = cellInfoCdma2;
                } else {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList(list.size());
                    }
                    arrayList5.add(cellInfoCdma2);
                }
            } else {
                String valueOf3 = String.valueOf(cellInfo);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                sb3.append("Ignoring non-LTE cellInfo: ");
                sb3.append(valueOf3);
                sb3.toString();
            }
        }
        int i4 = -1;
        if (cellInfoGsm == null) {
            if (cellInfoWcdma == null) {
                if (cellInfoLte != null) {
                    bfmn = bgie.m98990a(j2, cellInfoLte, collection3, collection2);
                } else if (cellInfoCdma != null) {
                    if (!collection.isEmpty()) {
                        ArrayList arrayList8 = new ArrayList(collection.size());
                        arrayList8.addAll(collection2);
                        arrayList2 = arrayList8;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList2 == null) {
                            arrayList4 = new ArrayList(arrayList5.size());
                        } else {
                            arrayList4 = arrayList2;
                        }
                        int size = arrayList5.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            arrayList4.add(bgie.m98989a(j2, (CellInfoCdma) arrayList5.get(i5), bfmn.f114411a));
                        }
                        arrayList2 = arrayList4;
                    }
                    if (arrayList2 != null) {
                        arrayList3 = arrayList2;
                    } else {
                        arrayList3 = bfmn.f114411a;
                    }
                    bfmn = bgie.m98989a(j2, cellInfoCdma, arrayList3);
                } else {
                    bfmn = null;
                }
            } else if (cellInfoWcdma != null) {
                CellIdentityWcdma cellIdentity2 = cellInfoWcdma.getCellIdentity();
                if (!collection.isEmpty()) {
                    HashSet hashSet8 = new HashSet();
                    hashSet8.addAll(collection2);
                    hashSet4 = hashSet8;
                } else {
                    hashSet4 = null;
                }
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    if (hashSet4 == null) {
                        hashSet6 = new HashSet();
                    } else {
                        hashSet6 = hashSet4;
                    }
                    int size2 = arrayList7.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        CellInfoWcdma cellInfoWcdma3 = (CellInfoWcdma) arrayList7.get(i6);
                        int psc = cellInfoWcdma3.getCellIdentity().getPsc();
                        if (psc == i) {
                            i3 = i6;
                            i2 = size2;
                            hashSet7 = hashSet6;
                        } else if (psc != i4) {
                            i3 = i6;
                            i2 = size2;
                            hashSet7 = hashSet6;
                            hashSet7.add(new bfmv(j, 3, cellIdentity2.getCid(), cellIdentity2.getMcc(), cellIdentity2.getMnc(), cellIdentity2.getLac(), psc, cellInfoWcdma3.getCellSignalStrength().getDbm(), bfmn.f114411a));
                        } else {
                            i3 = i6;
                            i2 = size2;
                            hashSet7 = hashSet6;
                        }
                        i6 = i3 + 1;
                        hashSet6 = hashSet7;
                        size2 = i2;
                        i4 = -1;
                        i = Integer.MAX_VALUE;
                    }
                    hashSet4 = hashSet6;
                }
                if (hashSet4 != null) {
                    hashSet5 = hashSet4;
                } else {
                    hashSet5 = bfmn.f114411a;
                }
                bfmn = new bfmv(j, 3, cellIdentity2.getCid(), cellIdentity2.getMcc(), cellIdentity2.getMnc(), cellIdentity2.getLac(), cellIdentity2.getPsc(), cellInfoWcdma.getCellSignalStrength().getDbm(), hashSet5);
            } else {
                bfmn = null;
            }
        } else if (cellInfoGsm != null) {
            CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
            if (!collection.isEmpty()) {
                HashSet hashSet9 = new HashSet();
                hashSet9.addAll(collection2);
                hashSet = hashSet9;
            } else {
                hashSet = null;
            }
            if (arrayList6 != null && !arrayList6.isEmpty()) {
                if (hashSet == null) {
                    hashSet3 = new HashSet();
                } else {
                    hashSet3 = hashSet;
                }
                int size3 = arrayList6.size();
                int i7 = 0;
                while (i7 < size3) {
                    CellInfoGsm cellInfoGsm3 = (CellInfoGsm) arrayList6.get(i7);
                    int cid = cellInfoGsm3.getCellIdentity().getCid();
                    if (cid == Integer.MAX_VALUE) {
                        arrayList = arrayList6;
                    } else if (cid != -1) {
                        arrayList = arrayList6;
                        hashSet3.add(new bfmv(j, 1, cid, cellIdentity3.getMcc(), cellIdentity3.getMnc(), cellIdentity3.getLac(), Integer.MAX_VALUE, cellInfoGsm3.getCellSignalStrength().getDbm(), bfmn.f114411a));
                    } else {
                        arrayList = arrayList6;
                    }
                    i7++;
                    arrayList6 = arrayList;
                }
                hashSet = hashSet3;
            }
            if (hashSet != null) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = bfmn.f114411a;
            }
            bfmn = new bfmv(j, 1, cellIdentity3.getCid(), cellIdentity3.getMcc(), cellIdentity3.getMnc(), cellIdentity3.getLac(), Integer.MAX_VALUE, cellInfoGsm.getCellSignalStrength().getDbm(), hashSet2);
        } else {
            bfmn = null;
        }
        String valueOf4 = String.valueOf(bfmn);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 19);
        sb4.append("newApiCellState is ");
        sb4.append(valueOf4);
        sb4.toString();
        return bfmn;
    }

    /* renamed from: a */
    public final bgma mo62943a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return new bgnz(bluetoothDevice);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo62944a(WifiManager wifiManager, Context context) {
        if (wifiManager.isWifiEnabled()) {
            return true;
        }
        if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 1) {
            return wifiManager.isScanAlwaysAvailable();
        }
        return false;
    }
}
